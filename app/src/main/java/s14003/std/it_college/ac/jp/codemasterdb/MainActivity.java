package s14003.std.it_college.ac.jp.codemasterdb;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CodeMaster_Database codeM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createBlacklist();

    }
    private void createBlacklist() {
        SQLiteDatabase db = codeM.getWritableDatabase();
        codeM = new CodeMaster_Database(this);

        ContentValues values = new ContentValues();
        values.put(CodeMaster_Database.Columns.SEQUENCE_ID, 1);
        values.put(CodeMaster_Database.Columns.CODE_ID, 1);
        values.put(CodeMaster_Database.Columns.VAULE, 100000);

        try {
            db.insert(CodeMaster_Database.TABLE_NAME, null, values);
        } finally {
            db.close();
        }
    }
}
