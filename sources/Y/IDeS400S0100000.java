package Y;

import X.BZI;
import X.C08200Tw;
import X.C0JU;
import X.C0PX;
import X.C164906da;
import X.C79023Uzr;
import X.C81052VrU;
import X.EnumC61598OFm;
import X.EnumC81057VrZ;
import X.InterfaceC61107NyZ;
import X.KL2;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDeS400S0100000 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(IDeS400S0100000 iDeS400S0100000) {
    }

    public static final void LIZ$1(IDeS400S0100000 iDeS400S0100000) {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c164906daArr);
                return;
            case 1:
                LIZIZ$1(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public IDeS400S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDeS400S0100000 iDeS400S0100000, C164906da... results) {
        o.LJIIIZ(results, "results");
        int i = 1;
        if (results.length == 0 || results[0].LIZIZ != EnumC61598OFm.GRANTED) {
            KL2.LJI(R.string.soz, (KYCCameraActivity) iDeS400S0100000.l0);
            return;
        }
        C08200Tw c08200Tw = new C08200Tw(new C79023Uzr((KYCCameraActivity) iDeS400S0100000.l0, null), EnumC81057VrZ.ofImage());
        c08200Tw.LJFF();
        c08200Tw.LIZIZ();
        if (((KYCCameraActivity) iDeS400S0100000.l0).LJLJL) {
            i = 2;
        }
        ((C81052VrU) c08200Tw.LIZIZ).LJIIJJI = i;
        c08200Tw.LJ();
        c08200Tw.LJI();
        c08200Tw.LIZJ(1001);
        String LLFII = ((KYCCameraActivity) iDeS400S0100000.l0).LLFII();
        String pageName = ((KYCCameraActivity) iDeS400S0100000.l0).getPageName();
        JSONObject jSONObject = ((KYCCameraActivity) iDeS400S0100000.l0).LJLJJLL;
        BZI LIZIZ = C0JU.LIZIZ("livesdk_kyc_form_camera_upload", LLFII, "shoot_type", pageName, "page_name");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZIZ.LJJ(jSONObject);
        LIZIZ.LJJIIJZLJL();
    }

    public static final void LIZIZ$1(IDeS400S0100000 iDeS400S0100000, C164906da... results) {
        o.LJIIIZ(results, "results");
        if (results.length == 0 || results[0].LIZIZ != EnumC61598OFm.GRANTED) {
            KL2.LJI(R.string.soy, ((C0PX) iDeS400S0100000.l0).LIZ);
            C0PX c0px = (C0PX) iDeS400S0100000.l0;
            c0px.LJIILLIIL.postDelayed(new IDRunnableS85S0100000(c0px, 75), 2000L);
        } else {
            C0PX c0px2 = (C0PX) iDeS400S0100000.l0;
            c0px2.LJI = true;
            c0px2.LIZJ();
        }
    }
}
