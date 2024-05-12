package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIC extends QI2 {
    public String LL;
    public boolean LLD;
    public String LLF;
    public String LLFF;

    @Override // X.QI2
    public final String LJIIIZ() {
        return "eventv3";
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
        jSONObject.put("event", this.LLF);
        if (this.LLD) {
            jSONObject.put("is_bav", 1);
        }
        if (!TextUtils.isEmpty(this.LL)) {
            jSONObject.put("params", new JSONObject(this.LL));
        }
        if (this.LJLJLLL != EnumC48190Ivi.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.LJLJLLL);
        }
        jSONObject.put("datetime", this.LJLLL);
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            jSONObject.put("ab_sdk_version", this.LJLJLJ);
        }
        if (!TextUtils.isEmpty(this.LLFF)) {
            jSONObject.put("disable_personalization", CastIntegerProtector.valueOf(this.LLFF));
        }
        jSONObject.put("$$EVENT_LOCAL_ID", this.LJLZ);
        return jSONObject;
    }

    @Override // X.QI2
    public final List<String> LJFF() {
        List<String> LJFF = super.LJFF();
        ArrayList arrayList = new ArrayList(LJFF.size());
        arrayList.addAll(LJFF);
        arrayList.addAll(Arrays.asList("event", "varchar", "params", "varchar", "is_bav", "integer", "disable_personalization", "varchar"));
        return arrayList;
    }

    @Override // X.QI2
    public final String LJI() {
        return this.LL;
    }

    @Override // X.QI2
    public final String LJII() {
        return this.LLF;
    }

    @Override // X.QI2
    public final void LJIIJ(Cursor cursor) {
        super.LJIIJ(cursor);
        this.LLF = cursor.getString(16);
        this.LL = cursor.getString(17);
        boolean z = true;
        if (cursor.getInt(18) != 1) {
            z = false;
        }
        this.LLD = z;
        this.LLFF = cursor.getString(19);
    }

    @Override // X.QI2
    public final QI2 LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LLF = jSONObject.optString("event", null);
        this.LL = jSONObject.optString("params", null);
        this.LLD = jSONObject.optBoolean("is_bav", false);
        this.LLFF = jSONObject.optString("disable_personalization", null);
        return this;
    }

    @Override // X.QI2
    public final void LJIILJJIL(ContentValues contentValues) {
        super.LJIILJJIL(contentValues);
        contentValues.put("event", this.LLF);
        contentValues.put("params", this.LL);
        contentValues.put("is_bav", Integer.valueOf(this.LLD ? 1 : 0));
        contentValues.put("disable_personalization", this.LLFF);
    }

    @Override // X.QI2
    public final void LJIILL(JSONObject jSONObject) {
        super.LJIILL(jSONObject);
        jSONObject.put("event", this.LLF);
        jSONObject.put("params", this.LL);
        jSONObject.put("is_bav", this.LLD);
        jSONObject.put("disable_personalization", this.LLFF);
    }

    public QIC(String str, String str2) {
        this.LJLLJ = str;
        this.LLF = str2;
    }

    public QIC(String str, String str2, String str3) {
        this.LJLLJ = str;
        this.LLF = str2;
        this.LLD = false;
        this.LL = str3;
        C66745QHl.LIZ(str);
    }
}
