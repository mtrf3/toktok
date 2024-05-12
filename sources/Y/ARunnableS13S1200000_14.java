package Y;

import X.C04750Gp;
import X.C46496IMq;
import X.C48315Ixj;
import X.C77123UOp;
import X.C77922Ui6;
import X.C79295VAd;
import X.C79296VAe;
import X.C79307VAp;
import X.C79807VTv;
import X.InterfaceC79400VEe;
import X.R2G;
import X.VAD;
import X.VAE;
import X.VAH;
import X.VCA;
import X.VEZ;
import X.VML;
import X.VNL;
import X.VNR;
import X.VNU;
import android.graphics.Bitmap;
import android.text.TextUtils;
import ccb.t;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class ARunnableS13S1200000_14 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C48315Ixj c48315Ixj = (C48315Ixj) this.l1;
        if (c48315Ixj != null) {
            c48315Ixj.toString();
            C46496IMq.LIZJ();
            ((C79295VAd) this.l2).LIZJ.getClass();
            t tVar = ((C79295VAd) this.l2).LIZJ;
            if (tVar.s1) {
                tVar.LJLJJI.LJJJI((C48315Ixj) this.l1);
            } else {
                tVar.LJLLI.LIZIZ((C48315Ixj) this.l1, tVar.LLIL);
                return;
            }
        }
        C79295VAd c79295VAd = (C79295VAd) this.l2;
        t tVar2 = c79295VAd.LIZJ;
        if (tVar2.LLIIZ) {
            C46496IMq.LIZJ();
            return;
        }
        String str = this.s0;
        String p = tVar2.p(c79295VAd.LIZ, str, false);
        if (!TextUtils.isEmpty(p) && !p.equals(this.s0)) {
            str = p;
        }
        String str2 = ((C79295VAd) this.l2).LIZIZ;
        String str3 = this.s0;
        if (str3 == null || str3.length() == 0) {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            str2 = R2G.LIZLLL(((C79295VAd) this.l2).LIZIZ, str);
        }
        ((C79295VAd) this.l2).LIZJ.LJLJJI.LJIJJ();
        C79295VAd c79295VAd2 = (C79295VAd) this.l2;
        t tVar3 = c79295VAd2.LIZJ;
        VAD vad = tVar3.LJLJJI;
        vad.LJLLL = str;
        vad.LJLLLL = false;
        tVar3.LLLFF = str;
        tVar3.d1(str2, c79295VAd2.LIZIZ, str, c79295VAd2.LIZ);
    }

    public final void LIZ$1() {
        C48315Ixj c48315Ixj = (C48315Ixj) this.l1;
        if (c48315Ixj != null) {
            c48315Ixj.toString();
            C46496IMq.LIZJ();
            VAH vah = ((C79296VAe) this.l2).LIZJ;
            C79307VAp c79307VAp = vah.LJLJJI;
            if (c79307VAp.LJII) {
                vah.LJLJJLL.LJJJI((C48315Ixj) this.l1);
            } else {
                vah.LJLLLLLL.LIZIZ((C48315Ixj) this.l1, c79307VAp.LJI);
                C79296VAe c79296VAe = (C79296VAe) this.l2;
                VAH vah2 = c79296VAe.LIZJ;
                String str = c79296VAe.LIZIZ;
                vah2.LIZJ(str, str, this.s0, c79296VAe.LIZ);
                return;
            }
        }
        VAH vah3 = ((C79296VAe) this.l2).LIZJ;
        if (vah3.LJLJJI.LJIIIIZZ) {
            C46496IMq.LIZJ();
            C79296VAe c79296VAe2 = (C79296VAe) this.l2;
            VAH vah4 = c79296VAe2.LIZJ;
            String str2 = c79296VAe2.LIZIZ;
            vah4.LIZJ(str2, str2, this.s0, c79296VAe2.LIZ);
            return;
        }
        String str3 = this.s0;
        String LIZ = vah3.LIZ(str3, false);
        if (!TextUtils.isEmpty(LIZ) && !LIZ.equals(this.s0)) {
            str3 = LIZ;
        }
        String str4 = ((C79296VAe) this.l2).LIZIZ;
        String str5 = this.s0;
        if (str5 == null || str5.length() == 0) {
            str3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            str4 = R2G.LIZLLL(((C79296VAe) this.l2).LIZIZ, str3);
        }
        ((C79296VAe) this.l2).LIZJ.LJLJJLL.LJIJJ();
        C79296VAe c79296VAe3 = (C79296VAe) this.l2;
        VAH vah5 = c79296VAe3.LIZJ;
        VAD vad = vah5.LJLJJLL;
        vad.LJLLL = str3;
        vad.LJLLLL = false;
        vah5.LJLZ = str3;
        vah5.LIZJ(str4, c79296VAe3.LIZIZ, str3, c79296VAe3.LIZ);
    }

    public final void LIZ$2() {
        VML vml = (VML) this.l1;
        if (vml != null) {
            if (vml.LIZJ.isEmpty()) {
                VML vml2 = (VML) this.l1;
                String str = this.s0;
                vml2.getClass();
                o.LJIIJ(str, "<set-?>");
                vml2.LIZJ = str;
            }
            VML vml3 = (VML) this.l1;
            JSONObject mergedObj = C77123UOp.LJJIJLIJ(vml3.LIZLLL, C77922Ui6.LIZ((JSONObject) this.l2));
            o.LJFF(mergedObj, "mergedObj");
            vml3.LIZLLL = mergedObj;
        }
    }

    public final void LIZ$4() {
        ((C79807VTv) this.l1).LIZJ.put(this.s0, (Bitmap) this.l2);
        if (((C79807VTv) this.l1).LIZLLL.decrementAndGet() == 0) {
            for (Map.Entry entry : ((C79807VTv) this.l1).LIZJ.entrySet()) {
                Object key = entry.getKey();
                Bitmap bitmap = (Bitmap) entry.getValue();
                C04750Gp c04750Gp = ((C79807VTv) this.l1).LIZIZ.LJLJJI.LIZLLL.get(key);
                if (c04750Gp != null) {
                    c04750Gp.LJI = bitmap;
                }
            }
            ((C79807VTv) this.l1).LIZIZ.LJLJI.onSuccess("");
        }
    }

    public final void LIZ$3() {
        JSONObject jSONObject;
        InterfaceC79400VEe interfaceC79400VEe = (InterfaceC79400VEe) VEZ.LIZIZ().LIZ(InterfaceC79400VEe.class);
        if (interfaceC79400VEe == null || this.s0 == null) {
            return;
        }
        if (((Map) this.l1) != null) {
            jSONObject = new JSONObject((Map) this.l1);
        } else {
            jSONObject = new JSONObject();
        }
        interfaceC79400VEe.onReportEvent(this.s0, jSONObject, (JSONObject) this.l2);
    }

    public static final void run$0(ARunnableS13S1200000_14 aRunnableS13S1200000_14) {
        boolean LIZ;
        try {
            aRunnableS13S1200000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S1200000_14 aRunnableS13S1200000_14) {
        boolean LIZ;
        try {
            aRunnableS13S1200000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S1200000_14 aRunnableS13S1200000_14) {
        boolean LIZ;
        try {
            aRunnableS13S1200000_14.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S1200000_14 aRunnableS13S1200000_14) {
        boolean LIZ;
        VNL vnl;
        try {
            LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aRunnableS13S1200000_14.l1;
            String str = aRunnableS13S1200000_14.s0;
            Map map = (Map) aRunnableS13S1200000_14.l2;
            VNU vnu = lynxBytedLottieView.mContext;
            if (vnu != null && (vnl = vnu.LJLJJL) != null) {
                vnl.LIZIZ(new VNR(map, lynxBytedLottieView.getSign(), str));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S1200000_14 aRunnableS13S1200000_14) {
        boolean LIZ;
        try {
            aRunnableS13S1200000_14.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S1200000_14 aRunnableS13S1200000_14) {
        ((VCA) aRunnableS13S1200000_14.l2).LIZ(((VAE) aRunnableS13S1200000_14.l1).LIZIZ(aRunnableS13S1200000_14.s0));
    }

    public static final void run$6(ARunnableS13S1200000_14 aRunnableS13S1200000_14) {
        boolean LIZ;
        try {
            aRunnableS13S1200000_14.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S1200000_14(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l1 = obj2;
        this.s0 = str;
    }
}
