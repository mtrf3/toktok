package ud2;

import X.AbstractC43665HBt;
import X.AbstractC82618Wbe;
import X.ActivityC45651qj;
import X.C275416g;
import X.C275516h;
import X.C34K;
import X.C43416H2e;
import X.C44125HTl;
import X.C44314HaI;
import X.C44834Hig;
import X.C45312HqO;
import X.C45316HqS;
import X.C45317HqT;
import X.C45980I2u;
import X.C46068I6e;
import X.C46193IAz;
import X.C60903NvH;
import X.C61878OQg;
import X.C68322mC;
import X.C74355TGd;
import X.C76917UGr;
import X.C78948Uye;
import X.C82328WSu;
import X.C82622Wbi;
import X.C83591WrL;
import X.GTT;
import X.HKE;
import X.HKJ;
import X.I02;
import X.I3A;
import X.I82;
import X.I8P;
import X.I9Y;
import X.I9Z;
import X.InterfaceC82086WJm;
import X.WMH;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.aweme.ttep.ttepcomponent.dockbar.TTEPRecordDockBarComponent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ApS179S0200000_7 extends AbstractC82618Wbe {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC82618Wbe
    public final Object LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            case 2:
                return LIZIZ$2(this, c82622Wbi);
            case 3:
                return LIZIZ$3(this, c82622Wbi);
            case 4:
                return LIZIZ$4(this, c82622Wbi);
            case 5:
                return LIZIZ$5(this, c82622Wbi);
            case 6:
                return LIZIZ$6(this, c82622Wbi);
            case 7:
                return LIZIZ$7(this, c82622Wbi);
            case 8:
                return LIZIZ$8(this, c82622Wbi);
            case 9:
                return LIZIZ$9(this, c82622Wbi);
            case 10:
                return LIZIZ$10(this, c82622Wbi);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZIZ$11(this, c82622Wbi);
            case 12:
                return LIZIZ$12(this, c82622Wbi);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LIZIZ$13(this, c82622Wbi);
            case 14:
                return LIZIZ$14(this, c82622Wbi);
            case 15:
                return LIZIZ$15(this, c82622Wbi);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return LIZIZ$16(this, c82622Wbi);
            case 17:
                return LIZIZ$17(this, c82622Wbi);
            case 18:
                return LIZIZ$18(this, c82622Wbi);
            case 19:
                return LIZIZ$19(this, c82622Wbi);
            case 20:
                return LIZIZ$20(this, c82622Wbi);
            case 21:
                return LIZIZ$21(this, c82622Wbi);
            case 22:
                return LIZIZ$22(this, c82622Wbi);
            case 23:
                return LIZIZ$23(this, c82622Wbi);
            case 24:
                return LIZIZ$24(this, c82622Wbi);
            case 25:
                return LIZIZ$25(this, c82622Wbi);
            case 26:
                return LIZIZ$26(this, c82622Wbi);
            case 27:
                return LIZIZ$27(this, c82622Wbi);
            case 28:
                return LIZIZ$28(this, c82622Wbi);
            case 29:
                return LIZIZ$29(this, c82622Wbi);
            case 30:
                return LIZIZ$30(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public static final Object LIZIZ$0(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((ExteriorVideoRecordScene) apS179S0200000_7.l1).LJLZ;
        C83591WrL c83591WrL = new C83591WrL(container, shortVideoContext.cameraComponentModel, shortVideoContext.creativeInfo, null);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c83591WrL.afterInit$als_release(uptimeMillis);
        return c83591WrL;
    }

    public static final Object LIZIZ$1(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((ExteriorVideoRecordScene) apS179S0200000_7.l1).LJLZ;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        I9Z LIZIZ = HKE.LIZIZ(container, shortVideoContext);
        ((C275416g) apS179S0200000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$10(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((TTEPEffectPreviewActivity) apS179S0200000_7.l1).LJLLILLLL;
        C83591WrL c83591WrL = new C83591WrL(container, shortVideoContext.cameraComponentModel, shortVideoContext.creativeInfo, true, (Effect) null);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c83591WrL.afterInit$als_release(uptimeMillis);
        return c83591WrL;
    }

    public static final Object LIZIZ$11(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((TTEPEffectPreviewActivity) apS179S0200000_7.l1).LJLLILLLL;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        I9Z LIZIZ = HKE.LIZIZ(container, shortVideoContext);
        ((C275416g) apS179S0200000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$12(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        TTEPRecordDockBarComponent tTEPRecordDockBarComponent = new TTEPRecordDockBarComponent((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        tTEPRecordDockBarComponent.afterInit$als_release(uptimeMillis);
        return tTEPRecordDockBarComponent;
    }

    public static final Object LIZIZ$13(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((AbstractC43665HBt) apS179S0200000_7.l1).LLJJIII();
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        I9Y i9y = new I9Y(container, new AqS111S0300000_7((ActivityC45651qj) container.LJ(ActivityC45651qj.class, null), (InterfaceC82086WJm) container.LJ(InterfaceC82086WJm.class, null), shortVideoContext, 2));
        ((AbstractC43665HBt) apS179S0200000_7.l1).LJLJLLL = i9y;
        ((C275416g) apS179S0200000_7.l0).getClass();
        i9y.afterInit$als_release(uptimeMillis);
        return i9y;
    }

    public static final Object LIZIZ$14(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        GTT gtt = new GTT(SceneExtensionsKt.LIZLLL((AbstractC43665HBt) apS179S0200000_7.l1), container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        gtt.afterInit$als_release(uptimeMillis);
        return gtt;
    }

    public static final Object LIZIZ$15(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((FTCVideoRecordNewActivity) apS179S0200000_7.l1).LJLLILLLL;
        C83591WrL c83591WrL = new C83591WrL(container, shortVideoContext.cameraComponentModel, shortVideoContext.creativeInfo, null);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c83591WrL.afterInit$als_release(uptimeMillis);
        return c83591WrL;
    }

    public static final Object LIZIZ$16(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((FTCVideoRecordNewActivity) apS179S0200000_7.l1).LJLLILLLL;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        I9Z LIZIZ = HKE.LIZIZ(container, shortVideoContext);
        ((C275416g) apS179S0200000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$17(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46068I6e c46068I6e = new C46068I6e((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c46068I6e.afterInit$als_release(uptimeMillis);
        return c46068I6e;
    }

    public static final Object LIZIZ$18(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82328WSu c82328WSu = new C82328WSu((WMH) apS179S0200000_7.l1, container, new C78948Uye().LJ(container), new ArrayList());
        ((C275416g) apS179S0200000_7.l0).getClass();
        c82328WSu.afterInit$als_release(uptimeMillis);
        return c82328WSu;
    }

    public static final Object LIZIZ$19(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        I3A i3a = new I3A((WMH) apS179S0200000_7.l1, container, R.id.drq);
        ((C275416g) apS179S0200000_7.l0).getClass();
        i3a.afterInit$als_release(uptimeMillis);
        return i3a;
    }

    public static final Object LIZIZ$2(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        C68322mC c68322mC = new C68322mC();
        C34K c34k = new C34K();
        c34k.element = true;
        boolean z = false;
        if (C43416H2e.LIZ() && (o.LJ(((ExteriorVideoRecordScene) apS179S0200000_7.l1).LJLZ.recordParam, "mobileStickTemplate") || o.LJ(((ExteriorVideoRecordScene) apS179S0200000_7.l1).LJLZ.recordParam, "customizedSticker"))) {
            c68322mC.element = "create";
            c34k.element = false;
        }
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(c34k, 112);
        if (C45316HqS.LIZ() && C45317HqT.LIZ() != 1) {
            z = true;
        }
        C46193IAz LIZIZ = C74355TGd.LIZIZ(container, aqS173S0100000_7, new C45312HqO(z, true), null, new AqS157S0100000_7(c68322mC, 222), null, 80);
        ((C275416g) apS179S0200000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$20(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        I02 i02 = new I02((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        i02.afterInit$als_release(uptimeMillis);
        return i02;
    }

    public static final Object LIZIZ$21(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82328WSu c82328WSu = new C82328WSu((WMH) apS179S0200000_7.l1, container, new C44314HaI().LJ(container), C61878OQg.INSTANCE);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c82328WSu.afterInit$als_release(uptimeMillis);
        return c82328WSu;
    }

    public static final Object LIZIZ$22(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46068I6e c46068I6e = new C46068I6e((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c46068I6e.afterInit$als_release(uptimeMillis);
        return c46068I6e;
    }

    public static final Object LIZIZ$23(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82328WSu c82328WSu = new C82328WSu((WMH) apS179S0200000_7.l1, container, new C78948Uye().LJ(container), new ArrayList());
        ((C275416g) apS179S0200000_7.l0).getClass();
        c82328WSu.afterInit$als_release(uptimeMillis);
        return c82328WSu;
    }

    public static final Object LIZIZ$24(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82328WSu c82328WSu = new C82328WSu((WMH) apS179S0200000_7.l1, container, new C45980I2u().LJ(container), new C45980I2u().LIZ(container));
        ((C275416g) apS179S0200000_7.l0).getClass();
        c82328WSu.afterInit$als_release(uptimeMillis);
        return c82328WSu;
    }

    public static final Object LIZIZ$25(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C44125HTl c44125HTl = new C44125HTl((WMH) apS179S0200000_7.l1, R.id.iri, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c44125HTl.afterInit$als_release(uptimeMillis);
        return c44125HTl;
    }

    public static final Object LIZIZ$26(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82328WSu c82328WSu = new C82328WSu((WMH) apS179S0200000_7.l1, container, new C45980I2u().LJ(container), new C45980I2u().LIZ(container));
        ((C275416g) apS179S0200000_7.l0).getClass();
        c82328WSu.afterInit$als_release(uptimeMillis);
        return c82328WSu;
    }

    public static final Object LIZIZ$27(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82328WSu c82328WSu = new C82328WSu((WMH) apS179S0200000_7.l1, container, C76917UGr.LJIJ().LJ(container), new C45980I2u().LIZ(container));
        ((C275416g) apS179S0200000_7.l0).getClass();
        c82328WSu.afterInit$als_release(uptimeMillis);
        return c82328WSu;
    }

    public static final Object LIZIZ$28(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C82328WSu c82328WSu = new C82328WSu((WMH) apS179S0200000_7.l1, container, C76917UGr.LJIJ().LJ(container), new C45980I2u().LIZ(container));
        ((C275416g) apS179S0200000_7.l0).getClass();
        c82328WSu.afterInit$als_release(uptimeMillis);
        return c82328WSu;
    }

    public static final Object LIZIZ$29(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        I02 i02 = new I02((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        i02.afterInit$als_release(uptimeMillis);
        return i02;
    }

    public static final Object LIZIZ$3(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((VideoRecordNewScene) apS179S0200000_7.l1).LJLZ;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        C44834Hig c44834Hig = new C44834Hig(container, shortVideoContext);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c44834Hig.afterInit$als_release(uptimeMillis);
        return c44834Hig;
    }

    public static final Object LIZIZ$30(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        I3A i3a = new I3A((WMH) apS179S0200000_7.l1, container, R.id.drq);
        ((C275416g) apS179S0200000_7.l0).getClass();
        i3a.afterInit$als_release(uptimeMillis);
        return i3a;
    }

    public static final Object LIZIZ$4(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((VideoRecordNewScene) apS179S0200000_7.l1).LJLZ;
        o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
        I9Z LIZIZ = HKE.LIZIZ(container, shortVideoContext);
        ((C275416g) apS179S0200000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$5(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        C68322mC c68322mC = new C68322mC();
        C34K c34k = new C34K();
        c34k.element = true;
        boolean z = false;
        if (C43416H2e.LIZ() && (o.LJ(((VideoRecordNewScene) apS179S0200000_7.l1).LJLZ.recordParam, "mobileStickTemplate") || o.LJ(((VideoRecordNewScene) apS179S0200000_7.l1).LJLZ.recordParam, "customizedSticker"))) {
            c68322mC.element = "create";
            c34k.element = false;
        }
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(c34k, 152);
        if (C45316HqS.LIZ() && C45317HqT.LIZ() != 1) {
            z = true;
        }
        C46193IAz LIZIZ = C74355TGd.LIZIZ(container, aqS173S0100000_7, new C45312HqO(z, true), null, new AqS159S0100000_9(c68322mC, 623), null, 80);
        ((C275416g) apS179S0200000_7.l0).getClass();
        LIZIZ.afterInit$als_release(uptimeMillis);
        return LIZIZ;
    }

    public static final Object LIZIZ$6(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        I8P i8p = new I8P((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        i8p.afterInit$als_release(uptimeMillis);
        return i8p;
    }

    public static final Object LIZIZ$7(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        I82 i82 = new I82((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        i82.afterInit$als_release(uptimeMillis);
        return i82;
    }

    public static final Object LIZIZ$8(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        HKJ hkj = new HKJ((MvChoosePhotoScene) apS179S0200000_7.l1);
        ((C275416g) apS179S0200000_7.l0).getClass();
        hkj.afterInit$als_release(uptimeMillis);
        return hkj;
    }

    public static final Object LIZIZ$9(ApS179S0200000_7 apS179S0200000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C46068I6e c46068I6e = new C46068I6e((WMH) apS179S0200000_7.l1, container);
        ((C275416g) apS179S0200000_7.l0).getClass();
        c46068I6e.afterInit$als_release(uptimeMillis);
        return c46068I6e;
    }

    public ApS179S0200000_7(C275416g c275416g, C275516h c275516h, AbstractC43665HBt abstractC43665HBt, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = abstractC43665HBt;
    }

    public ApS179S0200000_7(C275416g c275416g, C275516h c275516h, WMH wmh, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = wmh;
    }

    public ApS179S0200000_7(C275416g c275416g, C275516h c275516h, FTCVideoRecordNewActivity fTCVideoRecordNewActivity, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = fTCVideoRecordNewActivity;
    }

    public ApS179S0200000_7(C275416g c275416g, C275516h c275516h, ExteriorVideoRecordScene exteriorVideoRecordScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = exteriorVideoRecordScene;
    }

    public ApS179S0200000_7(C275416g c275416g, C275516h c275516h, MvChoosePhotoScene mvChoosePhotoScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = mvChoosePhotoScene;
    }

    public ApS179S0200000_7(C275416g c275416g, C275516h c275516h, VideoRecordNewScene videoRecordNewScene, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = videoRecordNewScene;
    }

    public ApS179S0200000_7(C275416g c275416g, C275516h c275516h, TTEPEffectPreviewActivity tTEPEffectPreviewActivity, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = tTEPEffectPreviewActivity;
    }
}
