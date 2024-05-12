package kotlin.jvm.internal;

import X.ARH;
import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.AbstractDialogInterfaceC26236ARk;
import X.C101713yx;
import X.C227738wj;
import X.C3Q9;
import X.C4WC;
import X.C50420Jqa;
import X.C60392Yp;
import X.C73849Syb;
import X.C75782yE;
import X.C76800UCe;
import X.C793439m;
import X.EnumC101493yb;
import X.EnumC101633yp;
import X.InterfaceC101763z2;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import X.KU5;
import X.X1D;
import X.XJL;
import X.XKS;
import Y.IDcS135S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.IMInputEditTextAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestDeleteAllBtnAssem;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes2.dex */
public class AqS44S1200000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if (X.C1GE.LJIILIIL(r2) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS44S1200000_1 r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS44S1200000_1.invoke$0(kotlin.jvm.internal.AqS44S1200000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = ((C793439m) aqS44S1200000_1.l1).LJLJJLL.get();
        if (interfaceC72642tA != null) {
            interfaceC72642tA.onInternalEvent(new C50420Jqa(2, (Aweme) aqS44S1200000_1.l2));
        }
        C227738wj.LJ(true, (Aweme) aqS44S1200000_1.l2, ((C793439m) aqS44S1200000_1.l1).LJLILLLLZI, aqS44S1200000_1.s0, "", false, 96);
        it.LIZ().LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS44S1200000_1 aqS44S1200000_1, Object it) {
        o.LJIIIZ(it, "it");
        Activity activity = (Activity) aqS44S1200000_1.l1;
        String str = aqS44S1200000_1.s0;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS44S1200000_1.l2;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LIZLLL(str, new IDcS135S0200000_1(activity, interfaceC65784Pro, 14));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJ(R.string.hab, new AqS44S1200000_1((Activity) aqS44S1200000_1.l1, aqS44S1200000_1.s0, (InterfaceC65784Pro) aqS44S1200000_1.l2, 10));
        actionGroup.LJIIIIZZ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI = true;
        actionGroup.LJI(R.string.dsg, new AqS44S1200000_1((C793439m) aqS44S1200000_1.l1, (Aweme) aqS44S1200000_1.l2, aqS44S1200000_1.s0, 1));
        actionGroup.LJIIIIZZ(R.string.cga, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Context) aqS44S1200000_1.l1).getString(R.string.efd);
        o.LJIIIIZZ(string, "context.getString(R.string.delete)");
        actionGroup.LJFF(string, new AqS55S1100000_1((MessageRequestDeleteAllBtnAssem) aqS44S1200000_1.l2, aqS44S1200000_1.s0, 13));
        String string2 = ((Context) aqS44S1200000_1.l1).getString(R.string.cg_);
        o.LJIIIIZZ(string2, "context.getString(R.string.cancel)");
        actionGroup.LJIIIZ(string2, new AqS26S1000000_1(aqS44S1200000_1.s0, 8));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        String string;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = aqS44S1200000_1.s0;
        if (str == null || ujb.o.LJJJJJL(str)) {
            string = ((Activity) aqS44S1200000_1.l1).getString(R.string.dt6);
        } else {
            string = aqS44S1200000_1.s0;
        }
        o.LJIIIIZZ(string, "if (confirmText.isNullOr…irm_use) else confirmText");
        actionGroup.LJII(string, new AqS167S0100000_1((InterfaceC65784Pro) aqS44S1200000_1.l2, (InterfaceC65784Pro<C76800UCe>) 461));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        ((XJL) aqS44S1200000_1.l1).LJJIJIL(null);
        ((KU5) aqS44S1200000_1.l2).LIZ().remove(aqS44S1200000_1.s0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionHandler>>> canceled: tag:");
        LIZ.append(((KU5) aqS44S1200000_1.l2).LIZ);
        LIZ.append(", key:");
        LIZ.append(aqS44S1200000_1.s0);
        LIZ.append(", ");
        LIZ.append((KU5) aqS44S1200000_1.l2);
        C60392Yp.LIZ("LComponent", X1D.LIZIZ(LIZ), 12);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJFF(aqS44S1200000_1.s0, new AqS105S0300000_1(buttonGroup, (C101713yx) aqS44S1200000_1.l1, (EnumC101493yb) aqS44S1200000_1.l2, 16));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS44S1200000_1 aqS44S1200000_1, Object obj) {
        AbstractDialogInterfaceC26236ARk it = (AbstractDialogInterfaceC26236ARk) obj;
        o.LJIIIZ(it, "it");
        Object obj2 = it.LJLJL;
        EnumC101633yp enumC101633yp = EnumC101633yp.CLICK_RED_BUTTON;
        if (obj2 != enumC101633yp) {
            if (obj2 instanceof String) {
                enumC101633yp = EnumC101633yp.CLICK_CLOSE_BUTTON;
            } else {
                enumC101633yp = EnumC101633yp.CLICK_BACKGROUND;
            }
        }
        ((C101713yx) aqS44S1200000_1.l1).LIZIZ.LIZ(enumC101633yp, aqS44S1200000_1.s0);
        ((InterfaceC101763z2) aqS44S1200000_1.l2).LIZ(enumC101633yp);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS44S1200000_1 aqS44S1200000_1, Object $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) aqS44S1200000_1.l1;
        Map map = (Map) aqS44S1200000_1.l2;
        String userID = aqS44S1200000_1.s0;
        activityStatusViewModelImpl.getClass();
        o.LJIIIZ(map, "<this>");
        o.LJIIIZ(userID, "userID");
        Object obj = map.get(userID);
        if (obj == null) {
            obj = 0;
            map.put(userID, obj);
        }
        map.put(userID, Integer.valueOf(((Number) obj).intValue() + 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS44S1200000_1 aqS44S1200000_1, Object $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) aqS44S1200000_1.l1;
        Map map = (Map) aqS44S1200000_1.l2;
        String userID = aqS44S1200000_1.s0;
        activityStatusViewModelImpl.getClass();
        o.LJIIIZ(map, "<this>");
        o.LJIIIZ(userID, "userID");
        Integer num = (Integer) map.get(userID);
        if (num != null) {
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                map.remove(userID);
            } else {
                map.put(userID, Integer.valueOf(intValue));
            }
        }
        C73849Syb<ActivityStatus> c73849Syb = ((ActivityStatusViewModelImpl) aqS44S1200000_1.l1).LJLJJL.get(aqS44S1200000_1.s0);
        if (c73849Syb != null && c73849Syb.LJLILLLLZI.get().length == 0) {
            ((ActivityStatusViewModelImpl) aqS44S1200000_1.l1).LJLJJL.remove(aqS44S1200000_1.s0);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS44S1200000_1(android.app.Activity r3, java.lang.String r4, X.InterfaceC65784Pro r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 4: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r1.l2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS44S1200000_1.<init>(android.app.Activity, java.lang.String, X.Pro, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1200000_1(C793439m c793439m, Aweme aweme, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c793439m;
        this.l2 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1200000_1(C101713yx c101713yx, String str, InterfaceC101763z2 interfaceC101763z2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c101713yx;
        this.s0 = str;
        this.l2 = interfaceC101763z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1200000_1(XKS xks, KU5 ku5, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = xks;
        this.l2 = ku5;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1200000_1(Activity activity, String str, AqS151S0100000_1 aqS151S0100000_1, int i) {
        super(1);
        this.$t = i;
        this.l1 = activity;
        this.s0 = str;
        this.l2 = aqS151S0100000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1200000_1(Context context, MessageRequestDeleteAllBtnAssem messageRequestDeleteAllBtnAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.l2 = messageRequestDeleteAllBtnAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS44S1200000_1(ActivityStatusViewModelImpl activityStatusViewModelImpl, ActivityStatusViewModelImpl activityStatusViewModelImpl2, Map<String, Integer> map, String str) {
        super(1);
        this.$t = str;
        this.l1 = activityStatusViewModelImpl;
        this.l2 = activityStatusViewModelImpl2;
        this.s0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1200000_1(IMInputEditTextAssem iMInputEditTextAssem, Editable editable, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = iMInputEditTextAssem;
        this.l2 = editable;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS44S1200000_1(String str, C101713yx c101713yx, EnumC101493yb enumC101493yb, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c101713yx;
        this.l2 = enumC101493yb;
    }
}
