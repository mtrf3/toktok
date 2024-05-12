package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QIM extends QI2 {
    public long LL;
    public long LLD;
    public String LLF;
    public Integer LLFF;
    public String LLFFF;
    public String LLFII;
    public Integer LLFZ;

    @Override // X.QI2
    public final List<String> LJFF() {
        return null;
    }

    @Override // X.QI2
    public final String LJIIIZ() {
        return "terminate";
    }

    @Override // X.QI2
    public final String LJII() {
        return String.valueOf(this.LL);
    }

    @Override // X.QI2
    public final JSONObject LJIILLIIL() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.LJLILLLLZI);
        jSONObject.put("tea_event_index", this.LJLJI);
        jSONObject.put("session_id", this.LJLJJI);
        jSONObject.put("stop_timestamp", this.LLD / 1000);
        jSONObject.put("duration", this.LL / 1000);
        jSONObject.put("datetime", this.LJLLL);
        LIZJ(jSONObject);
        if (!TextUtils.isEmpty(this.LJLJL)) {
            jSONObject.put("user_unique_id", this.LJLJL);
        }
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            jSONObject.put("ab_sdk_version", this.LJLJLJ);
        }
        if (!TextUtils.isEmpty(this.LLF)) {
            jSONObject.put("uuid_changed", true);
            if (!TextUtils.equals(this.LLF, this.LJLJJI)) {
                jSONObject.put("original_session_id", this.LLF);
            }
        }
        Integer num = this.LLFF;
        if (num != null) {
            jSONObject.put("session_type", num);
        }
        if (!TextUtils.isEmpty(this.LLFII)) {
            jSONObject.put("from_session", this.LLFII);
        }
        if (!TextUtils.isEmpty(this.LLFFF)) {
            jSONObject.put("to_session", this.LLFFF);
        }
        Integer num2 = this.LLFZ;
        if (num2 != null) {
            jSONObject.put("bg_session", num2);
        }
        jSONObject.put("$$EVENT_LOCAL_ID", this.LJLZ);
        return jSONObject;
    }

    @Override // X.QI2
    public final void LJIIJ(Cursor cursor) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "read db not implemented", new Object[0]);
    }

    @Override // X.QI2
    public final QI2 LJIIJJI(JSONObject jSONObject) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "read ipc not implemented", new Object[0]);
        return this;
    }

    @Override // X.QI2
    public final void LJIILJJIL(ContentValues contentValues) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "write db not implemented", new Object[0]);
    }

    @Override // X.QI2
    public final void LJIILL(JSONObject jSONObject) {
        LJIIIIZZ().LIZLLL(4, this.LJZ, "write ipc not implemented", new Object[0]);
    }
}
