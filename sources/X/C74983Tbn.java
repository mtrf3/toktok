package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizResumeParams;

/* renamed from: X.Tbn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74983Tbn {
    public static final C5H3<C74983Tbn> LIZJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C74985Tbp.LJLIL);
    public MultiGuestDataHolder LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C74984Tbo.LJLIL);

    public final MultiGuestDataHolder LJIIJJI() {
        MultiGuestDataHolder multiGuestDataHolder = this.LIZ;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("multiGuestDataHolder");
        throw null;
    }

    public final void LJIILL() {
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        if (c75559Tl5.LIZIZ("MULTI_GUEST_DATA_HOLDER") == null) {
            MultiGuestDataHolder multiGuestDataHolder = new MultiGuestDataHolder();
            c75559Tl5.LJI(multiGuestDataHolder, "MULTI_GUEST_DATA_HOLDER");
            this.LIZ = multiGuestDataHolder;
            C74824TYe.LIZIZ = multiGuestDataHolder;
        }
    }

    public C74983Tbn() {
        LJIILL();
    }

    public static EnumC74778TWk LIZJ() {
        C76696U8e c76696U8e;
        U8H LJJZZI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            c76696U8e = LJJZZI.LJJIII();
        } else {
            c76696U8e = null;
        }
        return LIZ(LJI(c76696U8e));
    }

    public static EnumC74991Tbv LIZLLL() {
        C76696U8e c76696U8e;
        U8H LJJZZI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            c76696U8e = LJJZZI.LJJIII();
        } else {
            c76696U8e = null;
        }
        EnumC74991Tbv LJI = LJI(c76696U8e);
        if (LJI == null) {
            return EnumC74991Tbv.NORMAL;
        }
        return LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LJ() {
        String str;
        U8H LJJZZI;
        C76696U8e LJJIII;
        MultiGuestDataHolder multiGuestDataHolder;
        U8H LJJZZI2;
        C76696U8e LJJIII2;
        String layoutId;
        if (TV3.LJIIJ()) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LJJZZI2 = R6.LJJZZI()) != null && (LJJIII2 = LJJZZI2.LJJIII()) != null && (layoutId = LJJIII2.getLayoutId()) != null) {
                return LJIIJ(layoutId) - 1;
            }
            return 8;
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null && (LJJZZI = R62.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null && (str = LJJIII.getLayoutBusinessType()) != null) {
            if (((Integer) C74740TUy.LIZLLL().LIZIZ).intValue() == 0) {
                MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
                if (o.LJ(str, EnumC74991Tbv.FLOAT.getBusinessType())) {
                    if (LJI != null) {
                        LJI.layoutType = 1;
                        LJI.fixMicNumAction = 1;
                    }
                } else if (o.LJ(str, EnumC74991Tbv.FLOAT_FIX.getBusinessType())) {
                    if (LJI != null) {
                        LJI.layoutType = 1;
                        LJI.fixMicNumAction = 0;
                    }
                } else if (o.LJ(str, EnumC74991Tbv.GRID_FLOAT.getBusinessType())) {
                    if (LJI != null) {
                        LJI.layoutType = 0;
                        LJI.fixMicNumAction = 1;
                    }
                } else if (o.LJ(str, EnumC74991Tbv.GRID_FIX.getBusinessType()) && LJI != null) {
                    LJI.layoutType = 0;
                    LJI.fixMicNumAction = 0;
                }
                Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
                if ((LIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) LIZ) != null) {
                    multiGuestDataHolder.LJIIJ = LJI;
                }
                C74838TYs.LJ().LJJI = LJI;
            }
        } else {
            str = "";
        }
        int LJIIIZ = LJIIIZ(str);
        if (LJIIIZ == 0) {
            return 5;
        }
        return LJIIIZ - 1;
    }

    public static int LJIIIIZZ() {
        if (LJIILIIL()) {
            return LJ();
        }
        return C74838TYs.LJ().LJJII;
    }

    public static boolean LJIILIIL() {
        if (C8E.LJ().R6() != null) {
            return true;
        }
        return false;
    }

    public static EnumC74778TWk LIZ(EnumC74991Tbv enumC74991Tbv) {
        if (enumC74991Tbv != null) {
            switch (C74982Tbm.LIZ[enumC74991Tbv.ordinal()]) {
                case 1:
                    return EnumC74778TWk.FLOATING_FIX;
                case 2:
                    return EnumC74778TWk.FLOATING;
                case 3:
                    return EnumC74778TWk.GRID_FIX;
                case 4:
                    return EnumC74778TWk.GRID;
                case 5:
                    return EnumC74778TWk.FLOATING_FIX;
                case 6:
                case 7:
                    return EnumC74778TWk.GRID_FIX;
            }
        }
        return EnumC74778TWk.NORMAL;
    }

    public static List LJFF(String str) {
        InterfaceC75011TcF LJZI;
        String LIZJ2;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LJZI = R6.LJZI()) == null || (LIZJ2 = LJZI.LIZJ(str)) == null || LIZJ2.length() == 0) {
            return C61878OQg.INSTANCE;
        }
        return C47261Igj.LJJIJ(LIZJ2);
    }

    public static EnumC74991Tbv LJI(InterfaceC75787Tol interfaceC75787Tol) {
        String layoutId;
        List LJFF;
        if (interfaceC75787Tol == null || (layoutId = interfaceC75787Tol.getLayoutId()) == null || (LJFF = LJFF(layoutId)) == null || LJFF.size() != 1) {
            return null;
        }
        return C45804HyK.LJI((String) ListProtector.get(LJFF, 0));
    }

    public static EnumC74991Tbv LJII(String str) {
        List LJFF = LJFF(str);
        if (LJFF != null && LJFF.size() == 1) {
            return C45804HyK.LJI((String) ListProtector.get(LJFF, 0));
        }
        return EnumC74991Tbv.NORMAL;
    }

    public static int LJIIIZ(String layoutBusinessType) {
        U8H LJJZZI;
        o.LJIIIZ(layoutBusinessType, "layoutBusinessType");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            return LJJZZI.LJJIFFI(layoutBusinessType);
        }
        return 0;
    }

    public static int LJIIJ(String layoutId) {
        U8H LJJZZI;
        o.LJIIIZ(layoutId, "layoutId");
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            return LJJZZI.LJJII(layoutId);
        }
        return 0;
    }

    public static boolean LJIIL(TWR twr) {
        if (twr == null) {
            return false;
        }
        if (twr.LIZJ != 0 && twr.LIZJ != 1 && twr.LIZJ != 3) {
            return false;
        }
        return true;
    }

    public static String LJIILJJIL(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_OneVn_MultiGuestV3Manager_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_OneVn_MultiGuestV3Manager_", i, LIZ2);
    }

    public final void LIZIZ(int i, String str, InterfaceC75441TjB interfaceC75441TjB, InterfaceC75414Tik<CreateChannelResult> interfaceC75414Tik, EnumC74990Tbu enumC74990Tbu) {
        BizCreateChannelParams bizCreateChannelParams = new BizCreateChannelParams();
        bizCreateChannelParams.displayId = 1;
        C76611U4x c76611U4x = new C76611U4x(i, str, bizCreateChannelParams, null);
        if (interfaceC75441TjB != null) {
            C74986Tbq c74986Tbq = new C74986Tbq(interfaceC75414Tik, enumC74990Tbu, this, c76611U4x);
            BizResumeParams bizResumeParams = new BizResumeParams();
            bizResumeParams.needShowInfo = MultiGuestLiveShowSetting.INSTANCE.isV1();
            interfaceC75441TjB.LLILL(c76611U4x, c74986Tbq, bizResumeParams);
        }
    }
}
