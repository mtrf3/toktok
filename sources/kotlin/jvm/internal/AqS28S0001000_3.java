package kotlin.jvm.internal;

import X.AbstractC221978nR;
import X.AbstractC65781Prl;
import X.AnonymousClass720;
import X.AnonymousClass724;
import X.AnonymousClass783;
import X.C141335gf;
import X.C175886vI;
import X.C177616y5;
import X.C177906yY;
import X.C178336zF;
import X.C185887Rg;
import X.C185907Ri;
import X.C185937Rl;
import X.C186157Sh;
import X.C189487c8;
import X.C194437k7;
import X.C194567kK;
import X.C203127y8;
import X.C212208Um;
import X.C212518Vr;
import X.C216318eJ;
import X.C216348eM;
import X.C216758f1;
import X.C3C5;
import X.C43I;
import X.C65352Pkq;
import X.C72912tb;
import X.C76800UCe;
import X.C77H;
import X.C7AH;
import X.C82B;
import X.C8HZ;
import X.C8SO;
import X.C8V5;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.assem.FeedSkylightContainerAssem;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementBottomBarAssem;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementTitleAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdvertiserFollowerCountLabelAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import java.math.RoundingMode;
import ujb.s;

/* loaded from: classes4.dex */
public class AqS28S0001000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0001000_3(int i) {
        super(1);
        this.$t = i;
        this.i0 = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0001000_3(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C8V5 uiSlotAssem = (C8V5) obj;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LJI = aqS28S0001000_3.i0;
        uiSlotAssem.LIZ = C65352Pkq.LIZ(CommentManagementBottomBarAssem.class);
        uiSlotAssem.LJIIIZ = new CommentManagementBottomBarAssem();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C8V5 uiSlotAssem = (C8V5) obj;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LJI = aqS28S0001000_3.i0;
        uiSlotAssem.LIZ = C65352Pkq.LIZ(CommentManagementTitleAssem.class);
        uiSlotAssem.LJIIIZ = new CommentManagementTitleAssem();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C185937Rl setState = (C185937Rl) obj;
        o.LJIIIZ(setState, "$this$setState");
        C43I c43i = new C43I(Integer.valueOf(aqS28S0001000_3.i0));
        C8HZ<C185907Ri> listState = setState.LJLILLLLZI;
        o.LJIIIZ(listState, "listState");
        return new C185937Rl(c43i, listState);
    }

    public static final Object invoke$11(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, aqS28S0001000_3.i0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -129, 31);
    }

    public static final Object invoke$12(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, aqS28S0001000_3.i0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -65, 31);
    }

    public static final Object invoke$13(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C186157Sh setState = (C186157Sh) obj;
        o.LJIIIZ(setState, "$this$setState");
        float f = setState.LJLIL;
        long j = setState.LJLILLLLZI;
        float f2 = (f * ((float) j)) + aqS28S0001000_3.i0;
        long j2 = j + 1;
        return C186157Sh.L(setState, f2 / ((float) j2), j2, 0L, false, false, null, 60);
    }

    public static final Object invoke$14(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        AbstractC221978nR invokeSection = (AbstractC221978nR) obj;
        o.LJIIIZ(invokeSection, "$this$invokeSection");
        invokeSection.LIZIZ(aqS28S0001000_3.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        AbstractC221978nR invokeSection = (AbstractC221978nR) obj;
        o.LJIIIZ(invokeSection, "$this$invokeSection");
        invokeSection.LIZ(aqS28S0001000_3.i0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C7AH setState = (C7AH) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C7AH.LIZ(setState, null, null, null, null, null, aqS28S0001000_3.i0, 31);
    }

    public static final Object invoke$17(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C8V5 uiSlotAssem = (C8V5) obj;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LJI = aqS28S0001000_3.i0;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZLLL;
        uiSlotAssem.LIZ = C65352Pkq.LIZ(FeedSkylightContainerAssem.class);
        uiSlotAssem.LJIIIZ = new FeedSkylightContainerAssem();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        AnonymousClass724 setState = (AnonymousClass724) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AnonymousClass724.LIZ(setState, AnonymousClass720.SOFT_KEYBOARD, aqS28S0001000_3.i0, true, false, null, 24);
    }

    public static final Object invoke$19(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        AnonymousClass724 setState = (AnonymousClass724) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AnonymousClass724.LIZ(setState, null, aqS28S0001000_3.i0, false, false, null, 25);
    }

    public static final Object invoke$2(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C189487c8 setState = (C189487c8) obj;
        o.LJIIIZ(setState, "$this$setState");
        int i = setState.LJLILLLLZI;
        int i2 = aqS28S0001000_3.i0;
        if (i == i2) {
            return C189487c8.LIZ(setState, null, 0, null, null, new C43I(Boolean.TRUE), 15);
        }
        return C189487c8.LIZ(setState, null, 0, null, new C43I(Integer.valueOf(i2)), null, 23);
    }

    public static final Object invoke$20(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C77H setState = (C77H) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C77H.LIZ(setState, null, null, false, false, null, null, aqS28S0001000_3.i0, null, 191);
    }

    public static final Object invoke$21(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        Object LIZ;
        String str;
        boolean z;
        String str2;
        double doubleValue = ((Number) obj).doubleValue();
        String str3 = "K";
        boolean z2 = true;
        BigDecimal scale = new BigDecimal(String.valueOf(aqS28S0001000_3.i0 / doubleValue)).setScale(1, RoundingMode.FLOOR);
        String valueOf = String.valueOf(scale);
        try {
            int LJJLIIIJL = s.LJJLIIIJL(valueOf, ".", 0, false, 6);
            int i = LJJLIIIJL + 2;
            if (o.LJ(valueOf.subSequence(LJJLIIIJL + 1, i), CardStruct.IStatusCode.DEFAULT)) {
                CharSequence subSequence = valueOf.subSequence(0, LJJLIIIJL);
                o.LJII(subSequence, "null cannot be cast to non-null type kotlin.String");
                str = (String) subSequence;
            } else {
                CharSequence subSequence2 = valueOf.subSequence(0, i);
                o.LJII(subSequence2, "null cannot be cast to non-null type kotlin.String");
                str = (String) subSequence2;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            if (doubleValue == 1000.0d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = "K";
            } else {
                str2 = "M";
            }
            LIZ2.append(str2);
            LIZ = X1D.LIZIZ(LIZ2);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(scale);
        if (doubleValue != 1000.0d) {
            z2 = false;
        }
        if (!z2) {
            str3 = "M";
        }
        sb.append(str3);
        String sb2 = sb.toString();
        if (C3C5.m12isFailureimpl(LIZ)) {
            return sb2;
        }
        return LIZ;
    }

    public static final Object invoke$22(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        AnonymousClass783 setStateImmediate = (AnonymousClass783) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return AnonymousClass783.LIZ(setStateImmediate, null, null, null, null, new C43I(Integer.valueOf(aqS28S0001000_3.i0)), 31);
    }

    public static final Object invoke$23(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, new C43I(Integer.valueOf(aqS28S0001000_3.i0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777213);
    }

    public static final Object invoke$24(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Integer.valueOf(aqS28S0001000_3.i0)), null, null, null, null, null, null, null, null, null, null, null, null, 134201343);
    }

    public static final Object invoke$25(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Integer.valueOf(aqS28S0001000_3.i0)), null, null, null, null, null, null, null, null, null, 134086655);
    }

    public static final Object invoke$26(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C8SO setState = (C8SO) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C8SO.LIZ(setState, new C72912tb(Integer.valueOf(aqS28S0001000_3.i0)));
    }

    public static final Object invoke$27(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C8SO setState = (C8SO) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C8SO.LIZ(setState, new C72912tb(Integer.valueOf(aqS28S0001000_3.i0)));
    }

    public static final Object invoke$28(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216318eJ c216318eJ = it.LJ;
        int i = aqS28S0001000_3.i0;
        c216318eJ.getClass();
        if (i < 0) {
            i = 4;
        }
        c216318eJ.LIZLLL = i;
        c216318eJ.LIZ.LIZ(1402);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216348eM c216348eM = it.LIZLLL;
        c216348eM.LIZJ = aqS28S0001000_3.i0;
        c216348eM.LIZ.LIZ(1201);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C194567kK setStateImmediate = (C194567kK) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C194567kK.LIZ(setStateImmediate, null, 0, 0, aqS28S0001000_3.i0, false, 23);
    }

    public static final Object invoke$30(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216348eM c216348eM = it.LIZLLL;
        c216348eM.LJFF = aqS28S0001000_3.i0;
        c216348eM.LIZ.LIZ(1204);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C203127y8 setState = (C203127y8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C203127y8.LIZ(setState, 0, false, false, false, false, null, false, null, null, false, setState.LJLLI + aqS28S0001000_3.i0, null, null, false, 15359);
    }

    public static final Object invoke$4(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C194437k7 setState = (C194437k7) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C194437k7.LIZ(setState, null, null, null, null, null, null, null, null, Integer.valueOf(aqS28S0001000_3.i0), false, 1535);
    }

    public static final Object invoke$5(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C178336zF setState = (C178336zF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C178336zF.LIZ(setState, null, null, null, false, aqS28S0001000_3.i0, null, null, new C43I(Boolean.TRUE), null, false, null, null, null, null, false, false, false, 1047359);
    }

    public static final Object invoke$6(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C178336zF setState = (C178336zF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C178336zF.LIZ(setState, null, null, null, false, aqS28S0001000_3.i0, null, null, null, null, false, null, null, null, null, false, false, false, 1048383);
    }

    public static final Object invoke$7(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C178336zF setState = (C178336zF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C178336zF.LIZ(setState, null, null, C177906yY.LIZ, true, aqS28S0001000_3.i0, null, null, null, null, false, null, null, null, null, false, false, false, 1048375);
    }

    public static final Object invoke$8(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, new C43I(Integer.valueOf(aqS28S0001000_3.i0)), null, null, null, null, false, 62);
    }

    public static final Object invoke$9(AqS28S0001000_3 aqS28S0001000_3, Object obj) {
        C185887Rg setState = (C185887Rg) obj;
        o.LJIIIZ(setState, "$this$setState");
        C43I c43i = new C43I(Integer.valueOf(aqS28S0001000_3.i0));
        C8HZ<C185907Ri> listState = setState.LJLILLLLZI;
        o.LJIIIZ(listState, "listState");
        return new C185887Rg(c43i, listState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0001000_3(int i, AdvertiserFollowerCountLabelAssem advertiserFollowerCountLabelAssem, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS28S0001000_3(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }
}
