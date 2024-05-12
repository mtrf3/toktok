package Y;

import X.C10K;
import X.C36922EeM;
import X.C777133f;
import X.FMX;
import X.InterfaceC64592gB;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AfS33S0101000_1 implements InterfaceC64592gB {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS33S0101000_1 afS33S0101000_1, Object obj) {
        switch (afS33S0101000_1.i1) {
            case 0:
                Handler handler = (Handler) afS33S0101000_1.l0;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(44);
                    obtainMessage.obj = obj;
                    handler.sendMessage(obtainMessage);
                    return;
                }
                return;
            default:
                ((BaseListFragmentPanel) afS33S0101000_1.l0).fakeClickShareIcon(((Boolean) obj).booleanValue());
                return;
        }
    }

    public static final void accept$1(AfS33S0101000_1 afS33S0101000_1, Object obj) {
        List list;
        if (((Boolean) C777133f.LIZ.getValue()).booleanValue() && (list = (List) afS33S0101000_1.l0) != null) {
            C10K.LIZJ(new ACallableS79S0200000_1(null, list, 5));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("publish_count", afS33S0101000_1.i1);
            jSONObject.put("success_count", -1);
            jSONObject.put("fail_count", -1);
        } catch (Throwable th) {
            C36922EeM.LJFF(th);
        }
        FMX.LJIILJJIL("repost_batch_publish", jSONObject);
    }

    public AfS33S0101000_1(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
