package kotlin.jvm.internal;

import X.AbstractC234519Ih;
import X.AbstractC65781Prl;
import X.AnonymousClass724;
import X.C175886vI;
import X.C177616y5;
import X.C178336zF;
import X.C178786zy;
import X.C183707Iw;
import X.C185427Pm;
import X.C189487c8;
import X.C190187dG;
import X.C192027gE;
import X.C192217gX;
import X.C194437k7;
import X.C194567kK;
import X.C2061387d;
import X.C209038Ih;
import X.C212208Um;
import X.C221298mL;
import X.C226008tw;
import X.C227438wF;
import X.C227878wx;
import X.C228228xW;
import X.C228798yR;
import X.C234509Ig;
import X.C234529Ii;
import X.C25848ACm;
import X.C32I;
import X.C43I;
import X.C44384HbQ;
import X.C61447O9r;
import X.C61878OQg;
import X.C72912tb;
import X.C73U;
import X.C76800UCe;
import X.C77H;
import X.C7RN;
import X.C82B;
import X.C83X;
import X.InterfaceC88472Yns;
import X.M7C;
import X.S6S;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS8S0010000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            case 34:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case 36:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this, obj);
            case C61447O9r.LJIIJ:
                return invoke$49(this, obj);
            case 50:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS8S0010000_3(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 3: goto Le;
                case 24: goto Le;
                case 32: goto Le;
                case 33: goto Le;
                case 45: goto Le;
                case 46: goto Le;
                case 48: goto Le;
                case 51: goto Le;
                case 52: goto Le;
                case 53: goto Le;
                case 54: goto Le;
                default: goto L5;
            }
        L5:
            r1 = r2
            r0 = 0
            r1.z0 = r0
            r0 = 1
        La:
            r1.<init>(r0)
            return
        Le:
            r1 = r2
            r0 = 1
            r1.z0 = r0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS8S0010000_3.<init>(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0010000_3(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, null, null, null, aqS8S0010000_3.z0, 31);
    }

    public static final Object invoke$1(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, false, 61);
    }

    public static final Object invoke$10(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C178336zF setStateImmediate = (C178336zF) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C178336zF.LIZ(setStateImmediate, null, null, null, false, 0, null, null, null, null, false, null, null, null, null, false, aqS8S0010000_3.z0, false, 786431);
    }

    public static final Object invoke$11(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C178336zF setStateImmediate = (C178336zF) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C178336zF.LIZ(setStateImmediate, null, null, null, false, 0, null, null, null, null, aqS8S0010000_3.z0, null, null, null, null, false, false, false, 1044479);
    }

    public static final Object invoke$12(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, aqS8S0010000_3.z0, false, false, null, -1, 30);
    }

    public static final Object invoke$13(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, aqS8S0010000_3.z0, false, false, false, false, false, null, -268435457, 31);
    }

    public static final Object invoke$14(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        if (it instanceof C234529Ii) {
            ((C234529Ii) it).LJI = aqS8S0010000_3.z0;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        String str;
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        if (aqS8S0010000_3.z0) {
            str = "tag_people_page";
        } else {
            str = "video_post_page";
        }
        sendEventTracking.put("page_name", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C185427Pm setState = (C185427Pm) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C185427Pm.L(setState, null, !aqS8S0010000_3.z0, 1);
    }

    public static final Object invoke$17(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C7RN setState = (C7RN) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C7RN.L(setState, null, !aqS8S0010000_3.z0, 1);
    }

    public static final Object invoke$18(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C7RN setState = (C7RN) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C7RN.L(setState, null, !aqS8S0010000_3.z0, 1);
    }

    public static final Object invoke$19(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        ((C234509Ig) it).LJFF = !aqS8S0010000_3.z0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C234529Ii c234529Ii;
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        if ((it instanceof C234529Ii) && (c234529Ii = (C234529Ii) it) != null) {
            c234529Ii.LJI = aqS8S0010000_3.z0;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, aqS8S0010000_3.z0, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -33, 31);
    }

    public static final Object invoke$21(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, aqS8S0010000_3.z0, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -33, 31);
    }

    public static final Object invoke$22(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, false, null, null, null, false, false, false, false, false, false, null, -32769, 31);
    }

    public static final Object invoke$23(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, aqS8S0010000_3.z0, false, false, false, false, null, -536870913, 31);
    }

    public static final Object invoke$24(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, aqS8S0010000_3.z0, false, false, false, null, Integer.MAX_VALUE, 31);
    }

    public static final Object invoke$25(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, aqS8S0010000_3.z0, false, null, -1, 29);
    }

    public static final Object invoke$26(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, aqS8S0010000_3.z0, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, false, null, -4097, 31);
    }

    public static final Object invoke$27(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C177616y5 setState = (C177616y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C177616y5.LIZ(setState, null, null, false, 0, 0, null, false, false, null, null, null, null, null, null, false, null, null, null, false, false, false, false, false, aqS8S0010000_3.z0, null, -1, 27);
    }

    public static final Object invoke$28(AqS8S0010000_3 aqS8S0010000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C226008tw(!aqS8S0010000_3.z0);
    }

    public static final Object invoke$29(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C25848ACm switchItem = (C25848ACm) obj;
        o.LJIIIZ(switchItem, "switchItem");
        return C44384HbQ.LLIIZ(switchItem, aqS8S0010000_3.z0);
    }

    public static final Object invoke$3(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C189487c8 setState = (C189487c8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C189487c8.LIZ(setState, null, 0, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), 15);
    }

    public static final Object invoke$30(AqS8S0010000_3 aqS8S0010000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C209038Ih(new C43I(Boolean.valueOf(aqS8S0010000_3.z0)));
    }

    public static final Object invoke$31(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C221298mL setState = (C221298mL) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C221298mL.LIZ(setState, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, 0, 0, false, false, false, null, 4087);
    }

    public static final Object invoke$32(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C221298mL setState = (C221298mL) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C221298mL.LIZ(setState, null, null, null, null, null, null, 0, 0, false, false, false, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), 2047);
    }

    public static final Object invoke$33(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C221298mL setState = (C221298mL) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C221298mL.LIZ(setState, null, null, null, null, null, null, 0, 0, aqS8S0010000_3.z0, false, false, null, 3839);
    }

    public static final Object invoke$34(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C221298mL setStateImmediate = (C221298mL) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C221298mL.LIZ(setStateImmediate, null, null, null, null, null, null, 0, 0, false, false, aqS8S0010000_3.z0, null, 3071);
    }

    public static final Object invoke$35(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C227438wF setState = (C227438wF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C227438wF.LIZ(setState, null, null, null, aqS8S0010000_3.z0, null, 23);
    }

    public static final Object invoke$36(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        AnonymousClass724 setState = (AnonymousClass724) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AnonymousClass724.LIZ(setState, null, 0, false, aqS8S0010000_3.z0, null, 23);
    }

    public static final Object invoke$37(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C227878wx setState = (C227878wx) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C227878wx.LIZ(setState, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, 5);
    }

    public static final Object invoke$38(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C2061387d setState = (C2061387d) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C2061387d.LIZ(setState, null, aqS8S0010000_3.z0, 3);
    }

    public static final Object invoke$39(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C77H setState = (C77H) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C77H.LIZ(setState, null, null, aqS8S0010000_3.z0, false, null, null, 0, null, 251);
    }

    public static final Object invoke$4(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C194567kK setState = (C194567kK) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C194567kK.LIZ(setState, null, 0, 0, 0, aqS8S0010000_3.z0, 15);
    }

    public static final Object invoke$40(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C77H setState = (C77H) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C77H.LIZ(setState, null, null, false, aqS8S0010000_3.z0, null, null, 0, null, 247);
    }

    public static final Object invoke$41(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C73U setStateImmediate = (C73U) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return C73U.LIZ(setStateImmediate, null, null, null, null, aqS8S0010000_3.z0, 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final Object invoke$42(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        Object obj2;
        C192027gE setState = (C192027gE) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<C192217gX> LIZ = setState.LJLILLLLZI.LIZ();
        if (LIZ != null) {
            boolean z = aqS8S0010000_3.z0;
            obj2 = new ArrayList(C32I.LJJL(LIZ, 10));
            Iterator<C192217gX> it = LIZ.iterator();
            while (it.hasNext()) {
                obj2.add(new C192217gX(z ? 1 : 0, it.next().LJLIL));
            }
        } else {
            obj2 = C61878OQg.INSTANCE;
        }
        return C192027gE.L(setState, null, new C72912tb(obj2), false, 13);
    }

    public static final Object invoke$43(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        S6S setStateImmediate = (S6S) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return S6S.LIZ(setStateImmediate, null, false, aqS8S0010000_3.z0, null, null, 55);
    }

    public static final Object invoke$44(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C228798yR setState = (C228798yR) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C228798yR.LIZ(setState, null, null, null, null, null, null, aqS8S0010000_3.z0, 1023);
    }

    public static final Object invoke$45(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214);
    }

    public static final Object invoke$46(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777211);
    }

    public static final Object invoke$47(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, null, null, null, null, null, null, null, null, null, null, 134209535);
    }

    public static final Object invoke$48(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, 15728639);
    }

    public static final Object invoke$49(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), 67108863);
    }

    public static final Object invoke$5(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C194437k7 setState = (C194437k7) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C194437k7.LIZ(setState, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, false, 1791);
    }

    public static final Object invoke$50(AqS8S0010000_3 aqS8S0010000_3, Object setStateImmediate) {
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return new C183707Iw(new C43I(Boolean.valueOf(aqS8S0010000_3.z0)));
    }

    public static final Object invoke$51(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777207);
    }

    public static final Object invoke$52(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777199);
    }

    public static final Object invoke$53(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, null, null, null, null, 133693439);
    }

    public static final Object invoke$54(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C82B setState = (C82B) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82B.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, null, null, null, null, null, null, null, null, 134184959);
    }

    public static final Object invoke$55(AqS8S0010000_3 aqS8S0010000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C190187dG(aqS8S0010000_3.z0);
    }

    public static final Object invoke$56(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C83X setState = (C83X) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C83X.LIZ(setState, null, null, null, null, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), 255);
    }

    public static final Object invoke$57(AqS8S0010000_3 aqS8S0010000_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C178786zy(aqS8S0010000_3.z0);
    }

    public static final Object invoke$58(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        M7C setState = (M7C) obj;
        o.LJIIIZ(setState, "$this$setState");
        return M7C.LIZ(setState, null, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), 0, false, 0, null, null, null, 1019);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public static final Object invoke$59(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        ?? r6;
        C228228xW setState = (C228228xW) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (!aqS8S0010000_3.z0) {
            List<Aweme> list = setState.LJLIL;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<Aweme> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getAid());
                }
                List<String> list2 = setState.LJLILLLLZI;
                if (list2 != null) {
                    r6 = new ArrayList();
                    for (String str : list2) {
                        if (!arrayList.contains(str)) {
                            r6.add(str);
                        }
                    }
                }
            }
            r6 = 0;
        } else {
            r6 = setState.LJLILLLLZI;
        }
        return C228228xW.LIZ(setState, null, r6, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, null, 117);
    }

    public static final Object invoke$6(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C194437k7 setState = (C194437k7) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C194437k7.LIZ(setState, null, null, null, null, null, null, null, null, null, aqS8S0010000_3.z0, 1023);
    }

    public static final Object invoke$7(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C178336zF setState = (C178336zF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C178336zF.LIZ(setState, null, null, null, false, 0, null, null, null, null, false, null, new C43I(Boolean.valueOf(aqS8S0010000_3.z0)), null, null, false, false, false, 1032191);
    }

    public static final Object invoke$8(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C178336zF setState = (C178336zF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C178336zF.LIZ(setState, null, null, null, false, 0, null, null, null, null, false, null, null, null, null, aqS8S0010000_3.z0, false, false, 917503);
    }

    public static final Object invoke$9(AqS8S0010000_3 aqS8S0010000_3, Object obj) {
        C178336zF setState = (C178336zF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C178336zF.LIZ(setState, null, null, null, false, 0, null, null, null, null, false, null, null, null, null, false, false, aqS8S0010000_3.z0, 524287);
    }
}
