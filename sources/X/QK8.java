package X;

import android.content.Context;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QK8 extends QKR {
    public final Context LJ;
    public final QIF LJFF;

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        String str;
        C36860EdM.LJFF("language", this.LJ.getResources().getConfiguration().locale.getLanguage(), jSONObject);
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        } else if (rawOffset > 12) {
            rawOffset = 12;
        }
        jSONObject.put("timezone", rawOffset);
        C39246Fak c39246Fak = this.LJFF.LJJIIJZLJL;
        if (c39246Fak != null) {
            str = c39246Fak.LLLLZIL();
        } else {
            str = "";
        }
        C36860EdM.LJFF("region", str, jSONObject);
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        C36860EdM.LJFF("tz_name", timeZone.getID(), jSONObject);
        jSONObject.put("tz_offset", timeZone.getOffset(System.currentTimeMillis()) / 1000);
        return true;
    }

    public QK8(Context context, QIF qif) {
        super(true, true);
        this.LJ = context;
        this.LJFF = qif;
    }
}
