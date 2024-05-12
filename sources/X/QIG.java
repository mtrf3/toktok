package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIG extends QI2 {
    public String LL;
    public String LLD;

    @Override // X.QI2
    public final String LJIIIZ() {
        return "event_misc";
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
        jSONObject.put("log_type", this.LLD);
        try {
            JSONObject jSONObject2 = new JSONObject(this.LL);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.opt(next) != null) {
                    LJIIIIZZ().LJIIIIZZ(4, this.LJZ, "misc event exists key already!", new Object[0]);
                }
                jSONObject.put(next, obj);
            }
        } catch (Exception e) {
            LJIIIIZZ().LIZJ(4, "parse misc event params failed", e, new Object[0]);
        }
        jSONObject.put("$$EVENT_LOCAL_ID", this.LJLZ);
        return jSONObject;
    }

    @Override // X.QI2
    public final List<String> LJFF() {
        List<String> LJFF = super.LJFF();
        ArrayList arrayList = new ArrayList(LJFF.size());
        arrayList.addAll(LJFF);
        arrayList.addAll(Arrays.asList("params", "varchar", "log_type", "varchar"));
        return arrayList;
    }

    @Override // X.QI2
    public final String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("param:");
        LIZ.append(this.LL);
        LIZ.append(" logType:");
        LIZ.append(this.LLD);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.QI2
    public final String LJI() {
        return this.LL;
    }

    @Override // X.QI2
    public final void LJIIJ(Cursor cursor) {
        super.LJIIJ(cursor);
        this.LL = cursor.getString(16);
        this.LLD = cursor.getString(17);
    }

    @Override // X.QI2
    public final QI2 LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LL = jSONObject.optString("params", null);
        this.LLD = jSONObject.optString("log_type", null);
        return this;
    }

    @Override // X.QI2
    public final void LJIILJJIL(ContentValues contentValues) {
        super.LJIILJJIL(contentValues);
        contentValues.put("params", this.LL);
        contentValues.put("log_type", this.LLD);
    }

    @Override // X.QI2
    public final void LJIILL(JSONObject jSONObject) {
        super.LJIILL(jSONObject);
        jSONObject.put("params", this.LL);
        jSONObject.put("log_type", this.LLD);
    }

    public QIG(String str, String str2, JSONObject jSONObject) {
        this.LLD = str2;
        this.LL = jSONObject.toString();
        this.LJLLJ = str;
    }
}
