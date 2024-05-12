package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIA extends QI2 {
    public String LL;
    public String LLD;
    public String LLF;
    public String LLFF;
    public long LLFFF;
    public long LLFII;

    @Override // X.QI2
    public final String LJIIIZ() {
        return "event";
    }

    @Override // X.QI2
    public final JSONObject LJIILLIIL() {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(this.LLFF)) {
            jSONObject = new JSONObject(this.LLFF);
        } else {
            jSONObject = new JSONObject();
        }
        jSONObject.put("local_time_ms", this.LJLILLLLZI);
        jSONObject.put("tea_event_index", this.LJLJI);
        jSONObject.put("session_id", this.LJLJJI);
        LIZJ(jSONObject);
        if (this.LJLJLLL != EnumC48190Ivi.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.LJLJLLL);
        }
        if (!TextUtils.isEmpty(this.LJLJL)) {
            jSONObject.put("user_unique_id", this.LJLJL);
        }
        jSONObject.put("category", this.LL);
        jSONObject.put("tag", this.LLD);
        jSONObject.put("value", this.LLFFF);
        jSONObject.put("ext_value", this.LLFII);
        jSONObject.put("label", this.LLF);
        jSONObject.put("datetime", this.LJLLL);
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            jSONObject.put("ab_sdk_version", this.LJLJLJ);
        }
        jSONObject.put("$$EVENT_LOCAL_ID", this.LJLZ);
        return jSONObject;
    }

    @Override // X.QI2
    public final List<String> LJFF() {
        List<String> LJFF = super.LJFF();
        ArrayList arrayList = new ArrayList(LJFF.size());
        arrayList.addAll(LJFF);
        arrayList.addAll(Arrays.asList("category", "varchar", "tag", "varchar", "value", "integer", "ext_value", "integer", "params", "varchar", "label", "varchar"));
        return arrayList;
    }

    @Override // X.QI2
    public final String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(this.LLD);
        LIZ.append(", ");
        LIZ.append(this.LLF);
        return X1D.LIZIZ(LIZ);
    }

    public QIA() {
    }

    @Override // X.QI2
    public final String LJI() {
        return this.LLFF;
    }

    @Override // X.QI2
    public final void LJIIJ(Cursor cursor) {
        super.LJIIJ(cursor);
        this.LL = cursor.getString(16);
        this.LLD = cursor.getString(17);
        this.LLFFF = cursor.getLong(18);
        this.LLFII = cursor.getLong(19);
        this.LLFF = cursor.getString(20);
        this.LLF = cursor.getString(21);
    }

    @Override // X.QI2
    public final QI2 LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LJLJI = jSONObject.optLong("tea_event_index", 0L);
        this.LL = jSONObject.optString("category", null);
        this.LLD = jSONObject.optString("tag", null);
        this.LLFFF = jSONObject.optLong("value", 0L);
        this.LLFII = jSONObject.optLong("ext_value", 0L);
        this.LLFF = jSONObject.optString("params", null);
        this.LLF = jSONObject.optString("label", null);
        return this;
    }

    @Override // X.QI2
    public final void LJIILJJIL(ContentValues contentValues) {
        super.LJIILJJIL(contentValues);
        contentValues.put("category", this.LL);
        contentValues.put("tag", this.LLD);
        contentValues.put("value", Long.valueOf(this.LLFFF));
        contentValues.put("ext_value", Long.valueOf(this.LLFII));
        contentValues.put("params", this.LLFF);
        contentValues.put("label", this.LLF);
    }

    @Override // X.QI2
    public final void LJIILL(JSONObject jSONObject) {
        super.LJIILL(jSONObject);
        jSONObject.put("tea_event_index", this.LJLJI);
        jSONObject.put("category", this.LL);
        jSONObject.put("tag", this.LLD);
        jSONObject.put("value", this.LLFFF);
        jSONObject.put("ext_value", this.LLFII);
        jSONObject.put("params", this.LLFF);
        jSONObject.put("label", this.LLF);
    }

    public QIA(String str, String str2, String str3) {
        LJIIL(0L);
        this.LJLLJ = str;
        this.LL = str2;
        this.LLD = str3;
    }

    public QIA(long j, long j2, String str, String str2, String str3, String str4, String str5) {
        LJIIL(0L);
        this.LL = str2;
        this.LLD = str3;
        this.LLF = str4;
        this.LLFFF = j;
        this.LLFII = j2;
        this.LLFF = str5;
        this.LJLLJ = str;
    }
}
