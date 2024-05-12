package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OFF extends AbstractC65781Prl implements InterfaceC65784Pro<JSONObject> {
    public static final OFF LJLIL = new OFF();

    public OFF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final JSONObject invoke() {
        long j;
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_reinstall", OFT.LIZ());
        long currentTimeMillis = System.currentTimeMillis();
        try {
            j = C09970aH.LIZJ();
        } catch (Throwable unused) {
            j = currentTimeMillis;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j);
        long j2 = 2;
        if (0 > seconds || j2 < seconds) {
            long j3 = 4;
            if (3 > seconds || j3 < seconds) {
                long j4 = 9;
                if (5 > seconds || j4 < seconds) {
                    long j5 = 29;
                    if (10 > seconds || j5 < seconds) {
                        long j6 = 59;
                        if (30 > seconds || j6 < seconds) {
                            str = "5";
                        } else {
                            str = "4";
                        }
                    } else {
                        str = "3";
                    }
                } else {
                    str = "2";
                }
            } else {
                str = "1";
            }
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("app_runtime", str);
        return jSONObject;
    }
}
