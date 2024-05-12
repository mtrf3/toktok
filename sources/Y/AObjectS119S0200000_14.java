package Y;

import X.AbstractC82428WWq;
import X.C0I6;
import X.C0IB;
import X.C1EP;
import X.C34K;
import X.C52910Kpe;
import X.C68322mC;
import X.C76800UCe;
import X.C79234V7u;
import X.C81975WFf;
import X.C82070WIw;
import X.C82099WJz;
import X.C82467WYd;
import X.C82622Wbi;
import X.C83494Wpm;
import X.EnumC82528WaC;
import X.HJN;
import X.ID0;
import X.InterfaceC29911Fj;
import X.InterfaceC45921I0n;
import X.InterfaceC65784Pro;
import X.InterfaceC81454Vxy;
import X.InterfaceC82053WIf;
import X.InterfaceC82062WIo;
import X.InterfaceC82353WTt;
import X.L2L;
import X.T4Q;
import X.T4R;
import X.T4S;
import X.W0C;
import X.W15;
import X.W16;
import X.W48;
import X.WHV;
import X.WHY;
import X.WI0;
import X.WI2;
import X.WI6;
import X.WJH;
import X.WLT;
import X.WMH;
import X.WSI;
import X.WXA;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AObjectS119S0200000_14 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        if (((WSI) aObjectS119S0200000_14.l0).LIZIZ == null) {
            return;
        }
        if (bool.booleanValue()) {
            ((WMH) aObjectS119S0200000_14.l1).show(((WSI) aObjectS119S0200000_14.l0).LIZIZ);
            ((WSI) aObjectS119S0200000_14.l0).LIZIZ.show();
        } else {
            ((WSI) aObjectS119S0200000_14.l0).LIZIZ.hide();
            ((WMH) aObjectS119S0200000_14.l1).hide(((WSI) aObjectS119S0200000_14.l0).LIZIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean, java.lang.Object] */
    public static final void onChanged$1(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        ?? it = (Boolean) obj;
        if (C52910Kpe.LIZ() && o.LJ(((C68322mC) aObjectS119S0200000_14.l0).element, it)) {
            return;
        }
        ((C68322mC) aObjectS119S0200000_14.l0).element = it;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            C79234V7u.LJJJ((WMH) aObjectS119S0200000_14.l1, "RecordBottomTabScene");
        } else {
            C79234V7u.LJIL((WMH) aObjectS119S0200000_14.l1, "RecordBottomTabScene");
        }
    }

    public static final void onChanged$10(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Integer num = (Integer) obj;
        C81975WFf LJFF = ((WI6) aObjectS119S0200000_14.l0).LJFF();
        if (num != null) {
            if (num.intValue() == 2) {
                LJFF.LJLILLLLZI = R.drawable.b77;
            } else if (num.intValue() == 3) {
                LJFF.LJLILLLLZI = R.drawable.b78;
            }
        }
        LJFF.LJLLLLLL = R.string.r2r;
        ((InterfaceC82053WIf) ((C82622Wbi) aObjectS119S0200000_14.l1).LJ(InterfaceC82053WIf.class, null)).LL(LJFF);
    }

    public static final void onChanged$11(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Boolean it = (Boolean) obj;
        C81975WFf LIZJ = ((WI6) aObjectS119S0200000_14.l0).LIZJ();
        if (!o.LJ(Boolean.valueOf(LIZJ.LJLJJLL), it)) {
            o.LJIIIIZZ(it, "it");
            LIZJ.LJLJJLL = it.booleanValue();
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS119S0200000_14.l1).LJ(InterfaceC82053WIf.class, null)).LL(LIZJ);
        }
    }

    public static final void onChanged$12(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Boolean it = (Boolean) obj;
        C81975WFf LJ = ((WI6) aObjectS119S0200000_14.l0).LJ();
        if (!o.LJ(Boolean.valueOf(LJ.LJLJJLL), it)) {
            o.LJIIIIZZ(it, "it");
            LJ.LJLJJLL = it.booleanValue();
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS119S0200000_14.l1).LJ(InterfaceC82053WIf.class, null)).LL(LJ);
        }
    }

    public static final void onChanged$13(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Boolean it = (Boolean) obj;
        C81975WFf LJ = ((WI6) aObjectS119S0200000_14.l0).LJ();
        if (!o.LJ(Boolean.valueOf(LJ.LJLJJLL), it) || !o.LJ(Boolean.valueOf(LJ.LJZ), it)) {
            o.LJIIIIZZ(it, "it");
            LJ.LJLJJLL = it.booleanValue();
            LJ.LJZ = it.booleanValue();
            if (it.booleanValue()) {
                LJ.LJLLL = false;
            }
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS119S0200000_14.l1).LJ(InterfaceC82053WIf.class, null)).LL(LJ);
        }
    }

    public static final void onChanged$14(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        ((UploadPicStickerARPresenter) ((C83494Wpm) aObjectS119S0200000_14.l0).LJLIL.l0).LJIIZILJ((List) aObjectS119S0200000_14.l1);
        ((UploadPicStickerARPresenter) ((C83494Wpm) aObjectS119S0200000_14.l0).LJLIL.l0).LLILIL.LJFF(aObjectS119S0200000_14);
    }

    public static final void onChanged$15(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != 0) {
            ((InterfaceC82062WIo) ((C82622Wbi) aObjectS119S0200000_14.l0).LJ(InterfaceC82062WIo.class, null)).LJLLJ((C81975WFf) aObjectS119S0200000_14.l1);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean, java.lang.Object] */
    public static final void onChanged$2(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        ?? it = (Boolean) obj;
        if (C52910Kpe.LIZ() && o.LJ(it, ((C68322mC) aObjectS119S0200000_14.l0).element)) {
            return;
        }
        ((C68322mC) aObjectS119S0200000_14.l0).element = it;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            C79234V7u.LJJJ((WMH) aObjectS119S0200000_14.l1, "RecordBottomTabScene");
        } else {
            C79234V7u.LJIL((WMH) aObjectS119S0200000_14.l1, "RecordBottomTabScene");
        }
    }

    public static final void onChanged$3(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        C82622Wbi diContainer = ((C82099WJz) aObjectS119S0200000_14.l0).getDiContainer();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aObjectS119S0200000_14.l1;
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC81454Vxy.class, new AqS168S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 353));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC81454Vxy.class);
            if (c0i6 != null) {
                InterfaceC81454Vxy interfaceC81454Vxy = (InterfaceC81454Vxy) c0i6;
                if (!interfaceC81454Vxy.mg0() || !interfaceC81454Vxy.aO()) {
                    interfaceC65784Pro.invoke();
                }
            }
        }
        HJN.LJ.LJFF(((C82099WJz) aObjectS119S0200000_14.l0).LLI);
    }

    public static final void onChanged$4(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Boolean it = (Boolean) obj;
        if (!o.LJ(it, Boolean.valueOf(((C34K) aObjectS119S0200000_14.l0).element))) {
            C34K c34k = (C34K) aObjectS119S0200000_14.l0;
            o.LJIIIIZZ(it, "it");
            c34k.element = it.booleanValue();
            if (it.booleanValue()) {
                ((C82467WYd) aObjectS119S0200000_14.l1).LLZLL(true);
                C82467WYd c82467WYd = (C82467WYd) aObjectS119S0200000_14.l1;
                c82467WYd.LLIIZ = false;
                c82467WYd.m5("");
                return;
            }
            String musicPath = ((C82467WYd) aObjectS119S0200000_14.l1).getShortVideoContext().getMusicPath();
            if (musicPath != null && musicPath.length() > 0) {
                return;
            }
            ((C82467WYd) aObjectS119S0200000_14.l1).LLZZLLIL();
            AbstractC82428WWq.LLILZLL((C82467WYd) aObjectS119S0200000_14.l1, "_setShowVCStreamOnTipsState  hide", null, 2, null);
            ((C82467WYd) aObjectS119S0200000_14.l1).LLLJL().LJI(Boolean.FALSE);
            ((C82467WYd) aObjectS119S0200000_14.l1).LLLLJ();
        }
    }

    public static final void onChanged$5(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Boolean bool = (Boolean) obj;
        ((WJH) aObjectS119S0200000_14.l0).LJLJJL = !bool.booleanValue();
        if (bool.booleanValue()) {
            C82070WIw c82070WIw = ((WJH) aObjectS119S0200000_14.l0).LJLJJLL;
            WI0 wi0 = c82070WIw.LJIIIZ;
            c82070WIw.LJIIIZ = new WI0(wi0.LJLIL, wi0.LJLILLLLZI, true);
        } else {
            C0IB<Integer> qc = ((InterfaceC45921I0n) aObjectS119S0200000_14.l1).qc();
            WJH wjh = (WJH) aObjectS119S0200000_14.l0;
            qc.LIZIZ(wjh.LJLJI, new AObjectS89S0100000_14(wjh, 415));
        }
        ((WJH) aObjectS119S0200000_14.l0).LJ();
    }

    public static final void onChanged$6(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        W0C w0c = (W0C) obj;
        if (w0c.LJLIL != 0 && (((WHV) aObjectS119S0200000_14.l0).ke() != 0 || ((WHV) aObjectS119S0200000_14.l0).ta() != 0)) {
            WHY why = (WHY) aObjectS119S0200000_14.l1;
            why.LJZ.postDelayed(new ARunnableS33S0200000_14(w0c, why, 54), 200L);
        } else {
            WHY why2 = (WHY) aObjectS119S0200000_14.l1;
            why2.LJLLL = false;
            why2.LJLLLLLL = 0;
            ((WHV) aObjectS119S0200000_14.l0).s9(0);
        }
    }

    public static final void onChanged$7(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        WXA w15;
        T4S it = (T4S) obj;
        W48 w48 = (W48) aObjectS119S0200000_14.l0;
        o.LJIIIIZZ(it, "it");
        InterfaceC82353WTt interfaceC82353WTt = (InterfaceC82353WTt) aObjectS119S0200000_14.l1;
        w48.getClass();
        if (it instanceof T4Q) {
            Effect effect = ((T4Q) it).LIZ;
            if (ID0.LIZLLL(effect)) {
                ((WLT) w48.LJZL.LIZ(w48, W48.LLII[0])).gz();
                interfaceC82353WTt.Ef0(w48.LJJZZI());
                return;
            }
            List<String> tags = effect.getTags();
            if (tags == null) {
                tags = new ArrayList<>();
            }
            if (tags.contains("transfer_touch")) {
                interfaceC82353WTt.Ef0(new W16(w48.LJZI, ((WLT) w48.LJZL.LIZ(w48, W48.LLII[0])).e8().getEffectController()));
                return;
            }
            if (effect.getTypes().contains("FaceReplace3D")) {
                if (effect.getTags() == null) {
                    return;
                }
                interfaceC82353WTt.Ef0(new W15());
                return;
            } else {
                if (effect.getTypes().contains("TouchGes")) {
                    w15 = w48.LJJZZI();
                } else {
                    w15 = new W15();
                }
                interfaceC82353WTt.Ef0(w15);
                return;
            }
        }
        if (!(it instanceof T4R)) {
            return;
        }
        interfaceC82353WTt.Ef0(new W15());
    }

    public static final void onChanged$8(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        Integer num = (Integer) obj;
        C81975WFf LIZLLL = ((WI6) aObjectS119S0200000_14.l0).LIZLLL();
        if (num != null) {
            if (num.intValue() == 0) {
                LIZLLL.LJLJI = R.raw.icon_camera_flash_slash_fill;
            } else if (num.intValue() == 5) {
                LIZLLL.LJLJJLL = false;
            } else if (num.intValue() == 6) {
                LIZLLL.LJLJJLL = true;
            }
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS119S0200000_14.l1).LJ(InterfaceC82053WIf.class, null)).LL(LIZLLL);
        }
        LIZLLL.LJLJI = R.raw.icon_camera_flash_fill;
        ((InterfaceC82053WIf) ((C82622Wbi) aObjectS119S0200000_14.l1).LJ(InterfaceC82053WIf.class, null)).LL(LIZLLL);
    }

    public static final void onChanged$9(AObjectS119S0200000_14 aObjectS119S0200000_14, Object obj) {
        EnumC82528WaC it = (EnumC82528WaC) obj;
        C81975WFf LJII = ((WI6) aObjectS119S0200000_14.l0).LJII();
        o.LJIIIIZZ(it, "it");
        LJII.LJLJI = WI2.LIZJ(it);
        ((InterfaceC82053WIf) ((C82622Wbi) aObjectS119S0200000_14.l1).LJ(InterfaceC82053WIf.class, null)).LL(LJII);
    }

    public AObjectS119S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
