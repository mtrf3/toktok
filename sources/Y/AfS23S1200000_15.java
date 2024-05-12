package Y;

import X.AbstractC86724Y1w;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C45804HyK;
import X.C68922R3e;
import X.C76800UCe;
import X.C84763XOl;
import X.C85526XhS;
import X.C85528XhU;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC86733Y2f;
import X.R5Q;
import X.Y2M;
import android.app.Activity;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class AfS23S1200000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void accept$0(AfS23S1200000_15 afS23S1200000_15, Object obj) {
        AbstractC86724Y1w abstractC86724Y1w = (AbstractC86724Y1w) afS23S1200000_15.l1;
        InterfaceC86733Y2f interfaceC86733Y2f = (InterfaceC86733Y2f) afS23S1200000_15.l2;
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = Y2M.API_FAILED.name();
        }
        abstractC86724Y1w.LJFF(interfaceC86733Y2f, message);
        ((AbstractC86724Y1w) afS23S1200000_15.l1).LIZ.remove(afS23S1200000_15.s0);
    }

    public static final void accept$1(AfS23S1200000_15 afS23S1200000_15, Object obj) {
        boolean z;
        JSONObject jSONObject;
        ActivityC45651qj LJJIFFI;
        JSONObject jSONObject2;
        C68922R3e c68922R3e = (C68922R3e) obj;
        if (c68922R3e != null && (jSONObject2 = c68922R3e.LJIILJJIL) != null) {
            z = JSONObjectProtectorUtils.getBoolean(jSONObject2, "safe");
        } else {
            z = false;
        }
        Integer num = null;
        if (z) {
            R5Q.LIZIZ(null, afS23S1200000_15.s0, true);
            String str = afS23S1200000_15.s0;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS23S1200000_15.l1;
            InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) afS23S1200000_15.l2;
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) != null) {
                String nv0 = C116694i1.LIZ(LJJIFFI).nv0();
                if (nv0 != null) {
                    if ((r1 = nv0.hashCode()) != -1382453013) {
                        PopupManager.LJIIL(new C85526XhS(LJJIFFI, str, interfaceC65784Pro));
                    }
                }
                interfaceC65784Pro2.invoke();
            }
        } else {
            if (c68922R3e != null && (jSONObject = c68922R3e.LJIILJJIL) != null) {
                num = Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "error_code"));
            }
            R5Q.LIZIZ(num, afS23S1200000_15.s0, false);
            ((InterfaceC65784Pro) afS23S1200000_15.l2).invoke();
        }
        C85528XhU.LIZ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS23S1200000_15(String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.$t = interfaceC65784Pro2;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = interfaceC65784Pro;
    }
}
