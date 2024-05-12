package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIH extends QI2 {
    public long LL;
    public String LLD;
    public boolean LLF;
    public String LLFF;

    @Override // X.QI2
    public final String LJIIIZ() {
        return "launch";
    }

    @Override // X.QI2
    public final String LJII() {
        if (this.LLF) {
            return "bg";
        }
        return "fg";
    }

    @Override // X.QI2
    public final JSONObject LJIILLIIL() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.LJLILLLLZI);
        jSONObject.put("tea_event_index", this.LJLJI);
        jSONObject.put("session_id", this.LJLJJI);
        LIZJ(jSONObject);
        if (!TextUtils.isEmpty(this.LJLJL)) {
            jSONObject.put("user_unique_id", this.LJLJL);
        }
        boolean z = this.LLF;
        if (z) {
            jSONObject.put("is_background", z);
        }
        jSONObject.put("datetime", this.LJLLL);
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            jSONObject.put("ab_sdk_version", this.LJLJLJ);
        }
        if (!TextUtils.isEmpty(this.LLFF)) {
            jSONObject.put("uuid_changed", true);
            jSONObject.put("original_session_id", this.LLFF);
        }
        jSONObject.put("$$EVENT_LOCAL_ID", this.LJLZ);
        return jSONObject;
    }

    @Override // X.QI2
    public final List<String> LJFF() {
        List<String> LJFF = super.LJFF();
        ArrayList arrayList = new ArrayList(LJFF.size());
        arrayList.addAll(LJFF);
        arrayList.addAll(Arrays.asList("ver_name", "varchar", "ver_code", "integer", "last_session", "varchar"));
        return arrayList;
    }

    @Override // X.QI2
    public final void LJIIJ(Cursor cursor) {
        super.LJIIJ(cursor);
        this.LLD = cursor.getString(16);
        this.LL = cursor.getLong(17);
        this.LLFF = cursor.getString(18);
    }

    @Override // X.QI2
    public final QI2 LJIIJJI(JSONObject jSONObject) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "read ipc not implemented", new Object[0]);
        return null;
    }

    @Override // X.QI2
    public final void LJIILJJIL(ContentValues contentValues) {
        super.LJIILJJIL(contentValues);
        contentValues.put("ver_name", this.LLD);
        contentValues.put("ver_code", Long.valueOf(this.LL));
        contentValues.put("last_session", this.LLFF);
    }

    @Override // X.QI2
    public final void LJIILL(JSONObject jSONObject) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "write ipc not implemented", new Object[0]);
    }
}
