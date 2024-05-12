package Y;

import X.C13860gY;
import X.C162476Zf;
import X.C1E5;
import X.C53557L0f;
import X.C76732zl;
import X.C78605Ut7;
import X.C81975WFf;
import X.C82048WIa;
import X.C82054WIg;
import X.C82055WIh;
import X.C82064WIq;
import X.C82068WIu;
import X.C82085WJl;
import X.C82622Wbi;
import X.EnumC82528WaC;
import X.InterfaceC29911Fj;
import X.InterfaceC82053WIf;
import X.InterfaceC82062WIo;
import X.InterfaceC82086WJm;
import X.L2F;
import X.V16;
import X.W0C;
import X.WHV;
import X.WI6;
import X.WIB;
import X.WID;
import X.WIF;
import X.WIX;
import X.WIZ;
import X.WJ0;
import X.WMH;
import X.X1D;
import android.view.View;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AObjectS42S0400000_14 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        C82085WJl c82085WJl = (C82085WJl) obj;
        C82055WIh c82055WIh = (C82055WIh) aObjectS42S0400000_14.l0;
        C82054WIg c82054WIg = c82055WIh.LIZ;
        boolean z = c82085WJl.LIZ;
        c82054WIg.LIZ = z;
        InterfaceC82086WJm interfaceC82086WJm = c82055WIh.LIZIZ;
        if (interfaceC82086WJm != null) {
            c82054WIg.LIZIZ = interfaceC82086WJm.zy(z, false);
            C81975WFf LIZLLL = ((WI6) aObjectS42S0400000_14.l1).LIZLLL();
            LIZLLL.LJLJI = R.raw.icon_camera_flash_slash_fill;
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82053WIf.class, null)).LL(LIZLLL);
            C81975WFf LJ = ((WI6) aObjectS42S0400000_14.l1).LJ();
            LJ.LJLLL = c82085WJl.LIZIZ;
            SceneExtensionsKt.LIZIZ((WMH) aObjectS42S0400000_14.l3, new ARunnableS33S0200000_14(LJ, (C82622Wbi) aObjectS42S0400000_14.l2, 64));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(arrayList, (List<C81975WFf>) arrayList2, (List<C81975WFf>) 27);
            ((List) aqS141S0200000_10.invoke(Boolean.valueOf(!((C82055WIh) aObjectS42S0400000_14.l0).LIZ.LIZ))).add(((WI6) aObjectS42S0400000_14.l1).LIZLLL());
            ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82055WIh) aObjectS42S0400000_14.l0).LIZ.LIZIZ))).add(((WI6) aObjectS42S0400000_14.l1).LJFF());
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82053WIf.class, null)).a8(arrayList);
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82053WIf.class, null)).t1(arrayList2);
            ((InterfaceC82053WIf) ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82053WIf.class, null)).LJLLLL(C82055WIh.LIZIZ());
            return;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }

    public static final void onChanged$1(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        long j;
        EnumC82528WaC enumC82528WaC = (EnumC82528WaC) obj;
        int i = WIX.LIZ[((WIB) aObjectS42S0400000_14.l0).t2().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                j = 0;
            } else {
                throw new C162476Zf();
            }
        } else {
            j = 200;
        }
        AqS161S0200000_14 aqS161S0200000_14 = new AqS161S0200000_14((WI6) aObjectS42S0400000_14.l3, enumC82528WaC, 42);
        if (C53557L0f.LIZ()) {
            SafeHandler safeHandler = ((C82055WIh) aObjectS42S0400000_14.l1).LJI;
            if (safeHandler != null) {
                safeHandler.postDelayed(new ARunnableS25S0300000_14((WI6) aObjectS42S0400000_14.l3, aqS161S0200000_14, (C82622Wbi) aObjectS42S0400000_14.l2, 18), j);
                return;
            } else {
                o.LJIJI("safeHandler");
                throw null;
            }
        }
        aqS161S0200000_14.invoke();
        ((InterfaceC82053WIf) ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82053WIf.class, null)).LL(((WI6) aObjectS42S0400000_14.l3).LJII());
    }

    public static final void onChanged$2(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        long j;
        Boolean bool = (Boolean) obj;
        int i = WIZ.LIZ[((WIF) aObjectS42S0400000_14.l0).t2().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                j = 0;
            } else {
                throw new C162476Zf();
            }
        } else {
            j = 200;
        }
        C82064WIq.LIZLLL((C82064WIq) aObjectS42S0400000_14.l2, (C82622Wbi) aObjectS42S0400000_14.l3, (WID) aObjectS42S0400000_14.l1, new AqS161S0200000_14((WID) aObjectS42S0400000_14.l1, bool, 72), j);
    }

    public static final void onChanged$3(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        View R3;
        W0C w0c = (W0C) obj;
        ((WHV) aObjectS42S0400000_14.l0).s9(w0c.LJLIL);
        if (w0c.LJLIL != 0) {
            C82064WIq c82064WIq = (C82064WIq) aObjectS42S0400000_14.l1;
            SafeHandler safeHandler = c82064WIq.LJIIIIZZ;
            if (safeHandler != null) {
                safeHandler.postDelayed(new ARunnableS25S0300000_14((WID) aObjectS42S0400000_14.l3, c82064WIq, (C82622Wbi) aObjectS42S0400000_14.l2, 26), 100L);
            } else {
                o.LJIJI("safeHandler");
                throw null;
            }
        }
        if (w0c.LJLILLLLZI && (R3 = ((InterfaceC82062WIo) ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82062WIo.class, null)).R3(19)) != null) {
            ((WHV) aObjectS42S0400000_14.l0).j80(R3);
        }
    }

    public static final void onChanged$4(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        int i;
        WJ0 wj0 = (WJ0) obj;
        ShortVideoContext shortVideoContext = ((C82064WIq) aObjectS42S0400000_14.l0).LJ;
        if (shortVideoContext != null) {
            if (!V16.LJJLIIIJJI(shortVideoContext)) {
                return;
            }
            ((C76732zl) aObjectS42S0400000_14.l1).element = wj0.LJLIL;
            ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82062WIo.class, null);
            C81975WFf LJIILL = ((WID) aObjectS42S0400000_14.l3).LJIILL();
            int i2 = ((C76732zl) aObjectS42S0400000_14.l1).element;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 4) {
                        LJIILL.LJLJI = R.raw.icon_mic_slash_fill;
                        LJIILL.LJLJJI = R.attr.e7;
                        LJIILL.LJLJLLL = false;
                    }
                } else {
                    if (C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
                        i = R.raw.icon_color_right_bottom_checkbox;
                    } else {
                        i = R.raw.icon_color_right_bottom_none;
                    }
                    LJIILL.LJLL = i;
                    LJIILL.LJLJLLL = true;
                    LJIILL.LJLJJI = 0;
                    LJIILL.LJLJI = R.raw.icon_audio_editing_microphone;
                }
            } else {
                LJIILL.LJLJLLL = false;
                LJIILL.LJLJJI = 0;
                LJIILL.LJLJI = R.raw.icon_audio_editing_microphone;
            }
            C82064WIq c82064WIq = (C82064WIq) aObjectS42S0400000_14.l0;
            C82622Wbi c82622Wbi = (C82622Wbi) aObjectS42S0400000_14.l2;
            c82064WIq.getClass();
            C82064WIq.LJII(c82622Wbi, LJIILL);
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public static final void onChanged$5(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        Integer num = (Integer) obj;
        C81975WFf LJI = ((WID) aObjectS42S0400000_14.l0).LJI();
        if (num != null) {
            if (num.intValue() == 1) {
                LJI.LJLJI = R.raw.icon_arrow_left_arrow_right_fill;
                ((SafeHandler) aObjectS42S0400000_14.l1).post(new ARunnableS25S0300000_14(LJI, (C82064WIq) aObjectS42S0400000_14.l3, (C82622Wbi) aObjectS42S0400000_14.l2, 27));
                return;
            } else if (num.intValue() == 2) {
                LJI.LJLJI = R.raw.icon_arrow_up_arrow_down_fill;
                ((SafeHandler) aObjectS42S0400000_14.l1).post(new ARunnableS25S0300000_14(LJI, (C82064WIq) aObjectS42S0400000_14.l3, (C82622Wbi) aObjectS42S0400000_14.l2, 28));
                return;
            }
        }
        ((InterfaceC82062WIo) ((C82622Wbi) aObjectS42S0400000_14.l2).LJ(InterfaceC82062WIo.class, null)).LLFF(LJI);
    }

    public static final void onChanged$6(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        C82085WJl c82085WJl = (C82085WJl) obj;
        ShortVideoContext shortVideoContext = ((C82064WIq) aObjectS42S0400000_14.l0).LJ;
        if (shortVideoContext != null) {
            if (V16.LJJJJZ(shortVideoContext)) {
                return;
            }
            if (c82085WJl.LIZ) {
                InterfaceC82086WJm interfaceC82086WJm = ((C82064WIq) aObjectS42S0400000_14.l0).LIZIZ;
                if (interfaceC82086WJm != null) {
                    interfaceC82086WJm.Om(false);
                    ShortVideoContext shortVideoContext2 = ((C82064WIq) aObjectS42S0400000_14.l0).LJ;
                    if (shortVideoContext2 != null) {
                        shortVideoContext2.isAIEnhanceOn = false;
                    } else {
                        o.LJIJI("shortVideoContext");
                        throw null;
                    }
                } else {
                    o.LJIJI("cameraApiComponent");
                    throw null;
                }
            }
            C82064WIq c82064WIq = (C82064WIq) aObjectS42S0400000_14.l0;
            C82068WIu c82068WIu = c82064WIq.LIZ;
            boolean z = c82085WJl.LIZ;
            c82068WIu.LIZIZ = z;
            InterfaceC82086WJm interfaceC82086WJm2 = c82064WIq.LIZIZ;
            if (interfaceC82086WJm2 != null) {
                c82068WIu.LIZJ = interfaceC82086WJm2.zy(z, c82068WIu.LIZ);
                C82064WIq c82064WIq2 = (C82064WIq) aObjectS42S0400000_14.l0;
                C82068WIu c82068WIu2 = c82064WIq2.LIZ;
                InterfaceC82086WJm interfaceC82086WJm3 = c82064WIq2.LIZIZ;
                if (interfaceC82086WJm3 != null) {
                    c82068WIu2.LIZLLL = interfaceC82086WJm3.LLJJJJLIIL(c82068WIu2.LIZIZ);
                    C82064WIq c82064WIq3 = (C82064WIq) aObjectS42S0400000_14.l0;
                    C82068WIu c82068WIu3 = c82064WIq3.LIZ;
                    c82068WIu3.LJIIIIZZ = c82064WIq3.LJFF(c82068WIu3.LIZIZ);
                    ((C82064WIq) aObjectS42S0400000_14.l0).LJ();
                    C81975WFf LJII = ((WID) aObjectS42S0400000_14.l1).LJII();
                    LJII.LJLJI = R.raw.icon_camera_flash_slash_fill;
                    C82064WIq c82064WIq4 = (C82064WIq) aObjectS42S0400000_14.l0;
                    C82622Wbi c82622Wbi = (C82622Wbi) aObjectS42S0400000_14.l2;
                    c82064WIq4.getClass();
                    C82064WIq.LJII(c82622Wbi, LJII);
                    C81975WFf LJIIJJI = ((WID) aObjectS42S0400000_14.l1).LJIIJJI();
                    LJIIJJI.LJLLL = c82085WJl.LIZIZ;
                    SceneExtensionsKt.LIZIZ((WMH) aObjectS42S0400000_14.l3, new ARunnableS25S0300000_14(LJIIJJI, (C82064WIq) aObjectS42S0400000_14.l0, (C82622Wbi) aObjectS42S0400000_14.l2, 29));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    AqS141S0200000_10 aqS141S0200000_10 = new AqS141S0200000_10(arrayList, (List<C81975WFf>) arrayList2, (List<C81975WFf>) 58);
                    if (!L2F.LIZ()) {
                        ((List) aqS141S0200000_10.invoke(Boolean.valueOf(C1E5.LJII(((C82064WIq) aObjectS42S0400000_14.l0).LIZ)))).add(((WID) aObjectS42S0400000_14.l1).LJII());
                    }
                    ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS42S0400000_14.l0).LIZ.LIZLLL))).add(((WID) aObjectS42S0400000_14.l1).LJIJ());
                    ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS42S0400000_14.l0).LIZ.LIZJ))).add(((WID) aObjectS42S0400000_14.l1).LJIIL());
                    ((List) aqS141S0200000_10.invoke(Boolean.valueOf(((C82064WIq) aObjectS42S0400000_14.l0).LIZ.LJIIIIZZ))).add(((WID) aObjectS42S0400000_14.l1).LIZIZ());
                    ((C82064WIq) aObjectS42S0400000_14.l0).LIZIZ((C82622Wbi) aObjectS42S0400000_14.l2, arrayList, arrayList2);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ToolbarCreator,updateFlash onFrontRearChange.isFrontCamera:");
                    LIZ.append(((C82064WIq) aObjectS42S0400000_14.l0).LIZ.LIZIZ);
                    LIZ.append(",torchSupport:");
                    C13860gY.LIZIZ(LIZ, ((C82064WIq) aObjectS42S0400000_14.l0).LIZ.LJIIIZ, LIZ);
                    return;
                }
                o.LJIJI("cameraApiComponent");
                throw null;
            }
            o.LJIJI("cameraApiComponent");
            throw null;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public static final void onChanged$7(AObjectS42S0400000_14 aObjectS42S0400000_14, Object obj) {
        long j;
        EnumC82528WaC enumC82528WaC = (EnumC82528WaC) obj;
        int i = C82048WIa.LIZ[((WIF) aObjectS42S0400000_14.l0).t2().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                j = 0;
            } else {
                throw new C162476Zf();
            }
        } else {
            j = 200;
        }
        C82064WIq.LIZLLL((C82064WIq) aObjectS42S0400000_14.l2, (C82622Wbi) aObjectS42S0400000_14.l3, (WID) aObjectS42S0400000_14.l1, new AqS161S0200000_14((WID) aObjectS42S0400000_14.l1, enumC82528WaC, 74), j);
    }

    public AObjectS42S0400000_14(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
