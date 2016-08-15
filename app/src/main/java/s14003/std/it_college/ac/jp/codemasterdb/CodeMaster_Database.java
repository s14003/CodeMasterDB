package s14003.std.it_college.ac.jp.codemasterdb;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class CodeMaster_Database extends SQLiteOpenHelper {
    private final static String DB_NAME = "CodeM.db";
    private final static int DB_VERSION = 1;

    public final static String TABLE_NAME = "CodeM";

    private final String set_CREATE_TABLE =
            "create table " + TABLE_NAME + "(" +
                    Columns.SEQUENCE_ID + "int primary key," +
                    Columns.CODE_ID + "int primary key," +
                    Columns.VAULE + "int);";

    public interface Columns extends BaseColumns {
        final String SEQUENCE_ID = "SequenseID";
        final String CODE_ID = "codeID";
        final String VAULE = "value";
    }

    public CodeMaster_Database(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(set_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
