package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QID extends QI2 {
    public long LL;
    public String LLD;
    public String LLF;
    public int LLFF;
    public String LLFFF;

    @Override // X.QI2
    public final String LJIIIZ() {
        return "page";
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
        jSONObject.put("event", "bav2b_page");
        jSONObject.put("is_bav", 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page_key", this.LLF);
        jSONObject2.put("refer_page_key", this.LLD);
        jSONObject2.put("is_back", this.LLFF);
        jSONObject2.put("duration", this.LL);
        jSONObject.put("params", jSONObject2);
        jSONObject.put("datetime", this.LJLLL);
        jSONObject.put("$$EVENT_LOCAL_ID", this.LJLZ);
        return jSONObject;
    }

    @Override // X.QI2
    public final List<String> LJFF() {
        List<String> LJFF = super.LJFF();
        ArrayList arrayList = new ArrayList(LJFF.size());
        arrayList.addAll(LJFF);
        arrayList.addAll(Arrays.asList("page_key", "varchar", "refer_page_key", "varchar", "duration", "integer", "is_back", "integer", "last_session", "varchar"));
        return arrayList;
    }

    @Override // X.QI2
    public final String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LLF);
        LIZ.append(", ");
        LIZ.append(this.LL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.QI2
    public final void LJIIJ(Cursor cursor) {
        super.LJIIJ(cursor);
        this.LLF = cursor.getString(16);
        this.LLD = cursor.getString(17);
        this.LL = cursor.getLong(18);
        this.LLFF = cursor.getInt(19);
        this.LLFFF = cursor.getString(20);
    }

    @Override // X.QI2
    public final QI2 LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LLF = jSONObject.optString("page_key", null);
        this.LLD = jSONObject.optString("refer_page_key", null);
        this.LL = jSONObject.optLong("duration", 0L);
        this.LLFF = jSONObject.optInt("is_back", 0);
        return this;
    }

    @Override // X.QI2
    public final void LJIILJJIL(ContentValues contentValues) {
        super.LJIILJJIL(contentValues);
        contentValues.put("page_key", this.LLF);
        contentValues.put("refer_page_key", this.LLD);
        contentValues.put("duration", Long.valueOf(this.LL));
        contentValues.put("is_back", Integer.valueOf(this.LLFF));
        contentValues.put("last_session", this.LLFFF);
    }

    @Override // X.QI2
    public final void LJIILL(JSONObject jSONObject) {
        super.LJIILL(jSONObject);
        jSONObject.put("page_key", this.LLF);
        jSONObject.put("refer_page_key", this.LLD);
        jSONObject.put("duration", this.LL);
        jSONObject.put("is_back", this.LLFF);
    }
}
