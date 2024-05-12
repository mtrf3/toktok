package kotlin.jvm.internal;

import X.AEL;
import X.ARN;
import X.AbstractC65781Prl;
import X.C03880Dg;
import X.C10K;
import X.C162476Zf;
import X.C16880lQ;
import X.C26231ARf;
import X.C35936E8m;
import X.C39519Ff9;
import X.C40535FvX;
import X.C41123GBz;
import X.C64375POh;
import X.C65300Pk0;
import X.C65337Pkb;
import X.C65338Pkc;
import X.C65341Pkf;
import X.C66324Q1g;
import X.C67623QgN;
import X.C67624QgO;
import X.C67625QgP;
import X.C69084R9k;
import X.C69101RAb;
import X.C71945SLl;
import X.C76800UCe;
import X.C78886Uxe;
import X.C85144XbI;
import X.FMX;
import X.InterfaceC37276Ek4;
import X.InterfaceC63834P3m;
import X.InterfaceC64383POp;
import X.InterfaceC65079PgR;
import X.InterfaceC65332PkW;
import X.InterfaceC88472Yns;
import X.OHW;
import X.P3K;
import X.P3L;
import X.P3M;
import X.PIF;
import X.PIU;
import X.Q2C;
import X.R40;
import X.R41;
import X.R6O;
import X.RB3;
import X.RC4;
import X.RC8;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import Y.ARunnableS30S0200000_11;
import android.hardware.camera2.CameraDevice;
import android.media.AudioRecord;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SignUpTermsConsentFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.QuitBaAccountProcessor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.trace.PageTraceApiImpl;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.List;
import yq4.a;

/* loaded from: classes12.dex */
public class AqS177S0100000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

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
            default:
                return null;
        }
    }

    public final void invoke$0(C66324Q1g receiver) {
        o.LJIIJ(receiver, "$receiver");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(C16880lQ.LJLLJ(C66324Q1g.class));
        LIZ.append("]code:305  msg:");
        LIZ.append(((Throwable) this.l0).getLocalizedMessage());
        receiver.LIZ = X1D.LIZIZ(LIZ);
        receiver.LIZJ = (Throwable) this.l0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(InterfaceC37276Ek4 interfaceC37276Ek4, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC37276Ek4;
    }

    public static final Object invoke$0(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        long longValue = ((Number) obj).longValue();
        PIU piu = (PIU) aqS177S0100000_11.l0;
        if (piu != null) {
            piu.LIZIZ(longValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((Number) obj).longValue();
        C64375POh.LJFF = (InterfaceC64383POp) aqS177S0100000_11.l0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS177S0100000_11 aqS177S0100000_11, Object it) {
        o.LJIIIZ(it, "it");
        ((LoginMethodListFragment) aqS177S0100000_11.l0).LJIJ();
        LoginMethodListFragment loginMethodListFragment = (LoginMethodListFragment) aqS177S0100000_11.l0;
        Bundle arguments = loginMethodListFragment.getArguments();
        o.LJI(arguments);
        loginMethodListFragment.Dl(arguments);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        BaseViewModel activityConfiguration = (BaseViewModel) obj;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(new AqS161S0100000_11((CommonFlowActivity) aqS177S0100000_11.l0, 22));
        activityConfiguration.config(new AqS161S0100000_11((CommonFlowActivity) aqS177S0100000_11.l0, 23));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        C69084R9k it = (C69084R9k) obj;
        o.LJIIIZ(it, "it");
        InputCodeFragment inputCodeFragment = (InputCodeFragment) aqS177S0100000_11.l0;
        String platForm = (String) inputCodeFragment.LLIL.getValue();
        o.LJIIIIZZ(platForm, "platForm");
        inputCodeFragment.fm(it.getErrorCode(), platForm, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        C69084R9k it = (C69084R9k) obj;
        o.LJIIIZ(it, "it");
        InputCodeFragment inputCodeFragment = (InputCodeFragment) aqS177S0100000_11.l0;
        String platForm = (String) inputCodeFragment.LLIL.getValue();
        o.LJIIIIZZ(platForm, "platForm");
        inputCodeFragment.fm(it.getErrorCode(), platForm, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((SignUpTermsConsentFragment) aqS177S0100000_11.l0).Rl("total", ((Boolean) obj).booleanValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((SignUpTermsConsentFragment) aqS177S0100000_11.l0).Rl("single", ((Boolean) obj).booleanValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((SignUpTermsConsentFragment) aqS177S0100000_11.l0).Rl("single", ((Boolean) obj).booleanValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        String str;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", ((SignUpTermsConsentFragment) aqS177S0100000_11.l0).getEnterFrom());
        c35936E8m.LIZLLL("enter_method", ((SignUpTermsConsentFragment) aqS177S0100000_11.l0).getEnterMethod());
        c35936E8m.LIZLLL("platform", ((SignUpTermsConsentFragment) aqS177S0100000_11.l0).LL);
        if (booleanValue) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c35936E8m.LIZLLL("trending_on", str);
        FMX.LJIIL("register_terms_click", c35936E8m.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        C69084R9k it = (C69084R9k) obj;
        o.LJIIIZ(it, "it");
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) aqS177S0100000_11.l0;
        int errorCode = it.getErrorCode();
        verifyPasswordFragment.getClass();
        String platform = verifyPasswordFragment.Xl();
        o.LJIIIIZZ(platform, "platform");
        C85144XbI.LJJ(platform, "password", false);
        String enterFrom = verifyPasswordFragment.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = verifyPasswordFragment.getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String platform2 = verifyPasswordFragment.Xl();
        o.LJIIIIZZ(platform2, "platform");
        C85144XbI.LJIJI(enterFrom, enterMethod, platform2, "password", ((CompoundButton) verifyPasswordFragment._$_findCachedViewById(R.id.b_d)).isChecked(), 0, Integer.valueOf(errorCode));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        BaseViewModel activityConfiguration = (BaseViewModel) obj;
        o.LJIIIZ(activityConfiguration, "$this$activityConfiguration");
        activityConfiguration.config(new AqS161S0100000_11((BindOrModifyPhoneActivity) aqS177S0100000_11.l0, 46));
        activityConfiguration.config(C41123GBz.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        return ((InterfaceC63834P3m) aqS177S0100000_11.l0).invoke();
    }

    public static final Object invoke$20(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        RB3 it = (RB3) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!((List) aqS177S0100000_11.l0).contains(it.LIZ));
    }

    public static final Object invoke$21(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((InterfaceC65079PgR) aqS177S0100000_11.l0).cancel();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((InterfaceC65079PgR) aqS177S0100000_11.l0).cancel();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((InterfaceC65079PgR) aqS177S0100000_11.l0).cancel();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        aqS177S0100000_11.invoke$0((C66324Q1g) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        return AEL.LJIILJJIL(it, null, false, (View.OnClickListener) aqS177S0100000_11.l0, false, false, false, 16351);
    }

    public static final Object invoke$26(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        C65338Pkc c65338Pkc;
        String valueOf;
        C65337Pkb it = (C65337Pkb) obj;
        o.LJIIIZ(it, "it");
        ((C65338Pkc) aqS177S0100000_11.l0).getClass();
        if (it.LIZ == null) {
            return "*";
        }
        InterfaceC65332PkW interfaceC65332PkW = it.LIZIZ;
        if (interfaceC65332PkW instanceof C65338Pkc) {
            c65338Pkc = (C65338Pkc) interfaceC65332PkW;
        } else {
            c65338Pkc = null;
        }
        if (c65338Pkc == null || (valueOf = c65338Pkc.LIZIZ(true)) == null) {
            valueOf = String.valueOf(it.LIZIZ);
        }
        int i = C65341Pkf.LIZ[it.LIZ.ordinal()];
        if (i == 1) {
            return valueOf;
        }
        if (i != 2) {
            if (i == 3) {
                return i0.LJFF("out ", valueOf);
            }
            throw new C162476Zf();
        }
        return i0.LJFF("in ", valueOf);
    }

    public static final Object invoke$27(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Execute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("execute stubFunctionCommand functionName = ");
        LIZ.append(((Q2C) aqS177S0100000_11.l0).LIZIZ);
        LIZ.append(" argsCount = ");
        LIZ.append(((Q2C) aqS177S0100000_11.l0).LIZJ);
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Execute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unregistered function = ");
        LIZ.append(((Q2C) aqS177S0100000_11.l0).LIZIZ);
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        QuitBaAccountProcessor quitBaAccountProcessor = (QuitBaAccountProcessor) aqS177S0100000_11.l0;
        C26231ARf LIZ = it.LIZ();
        quitBaAccountProcessor.getClass();
        C71945SLl.LJ().LJIIIIZZ().switchProAccount(0, null, null, 0, new R6O(quitBaAccountProcessor, LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        return ((InterfaceC63834P3m) aqS177S0100000_11.l0).invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r8 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$30(kotlin.jvm.internal.AqS177S0100000_11 r10, java.lang.Object r11) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIJ(r11, r0)
            boolean r0 = X.Q0O.LIZ
            java.lang.String r5 = "SandboxManager"
            if (r0 == 0) goto L10
            java.lang.String r0 = "start sandbox check"
            X.Q0L.LIZ(r5, r0)
        L10:
            java.lang.Object r0 = r10.l0
            X.OHW r0 = (X.OHW) r0
            com.bytedance.bpea.basics.Cert r0 = r0.LIZIZ
            r9 = 0
            if (r0 == 0) goto Lb2
            java.lang.Integer r8 = X.C87277YNd.LJIIIIZZ(r0)
            if (r8 != 0) goto L2a
        L1f:
            java.lang.Object r2 = r10.l0
            X.OHW r2 = (X.OHW) r2
            r1 = -4001(0xfffffffffffff05f, float:NaN)
            java.lang.String r0 = "dataflowID is empty"
            X.C66293Q0b.LIZJ(r1, r2, r0)
        L2a:
            java.lang.Object r1 = r10.l0
            X.OHW r1 = (X.OHW) r1
            java.lang.String r0 = "$this$getClassIdentifier"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            java.lang.String r0 = "classIdentifier"
            java.lang.Object r7 = r1.LIZ(r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 != 0) goto L3e
            r7 = r9
        L3e:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r10.l0
            X.OHW r1 = (X.OHW) r1
            java.lang.String r0 = "$this$getMethodSignature"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            java.lang.String r0 = "methodSignature"
            java.lang.Object r6 = r1.LIZ(r0)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L54
            r6 = r9
        L54:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r10.l0
            X.OHW r1 = (X.OHW) r1
            java.lang.String r0 = "$this$getMethodParams"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.LIZ
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.String r0 = "methodParams"
            java.lang.Object r4 = r1.get(r0)
            boolean r0 = r4 instanceof java.util.Map
            if (r0 != 0) goto L6e
            r4 = r9
        L6e:
            java.util.Map r4 = (java.util.Map) r4
            if (r7 == 0) goto L74
            if (r6 != 0) goto L7f
        L74:
            java.lang.Object r2 = r10.l0
            X.OHW r2 = (X.OHW) r2
            r1 = -4004(0xfffffffffffff05c, float:NaN)
            java.lang.String r0 = "sandbox params is empty"
            X.C66293Q0b.LIZJ(r1, r2, r0)
        L7f:
            X.FXf r3 = new X.FXf
            r3.<init>(r8, r7, r6, r4)
            boolean r0 = X.Q0O.LIZ
            if (r0 == 0) goto L9c
            java.lang.String r2 = "classIdentifier>>"
            java.lang.String r1 = "  methodSignature>>"
            java.lang.String r0 = "  methodParams>>"
            java.lang.StringBuilder r0 = X.C06540Nm.LIZLLL(r2, r7, r1, r6, r0)
            r0.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            X.Q0L.LIZ(r5, r0)
        L9c:
            java.lang.Object r0 = r10.l0
            X.OHW r0 = (X.OHW) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.LIZ
            java.lang.String r0 = "sandboxExecuted"
            r1.put(r0, r2)
            X.FXg r0 = X.C66293Q0b.LIZIZ
            if (r0 == 0) goto Lb1
            X.Q0i r9 = r0.LIZ(r3)
        Lb1:
            return r9
        Lb2:
            r8 = r9
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS177S0100000_11.invoke$30(kotlin.jvm.internal.AqS177S0100000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$31(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        C67624QgO c67624QgO = (C67624QgO) aqS177S0100000_11.l0;
        Integer num = c67624QgO.LJLJL;
        o.LJI(num);
        return AEL.LJIILJJIL(it, c67624QgO.LJIILIIL(num.intValue(), Float.valueOf(0.0f)), false, null, false, false, false, 16379);
    }

    public static final Object invoke$32(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        C67624QgO c67624QgO = (C67624QgO) aqS177S0100000_11.l0;
        Integer num = c67624QgO.LJLJL;
        o.LJI(num);
        return AEL.LJIILJJIL(it, c67624QgO.LJIILIIL(num.intValue(), Float.valueOf(0.0f)), false, null, false, false, false, 16379);
    }

    public static final Object invoke$33(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        C67623QgN c67623QgN = (C67623QgN) aqS177S0100000_11.l0;
        Integer num = c67623QgN.LJLJLLL;
        o.LJI(num);
        return AEL.LJIILJJIL(it, c67623QgN.LJIILIIL(num.intValue(), Float.valueOf(0.0f)), false, null, false, false, false, 16379);
    }

    public static final Object invoke$34(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        C67623QgN c67623QgN = (C67623QgN) aqS177S0100000_11.l0;
        Integer num = c67623QgN.LJLJLLL;
        o.LJI(num);
        return AEL.LJIILJJIL(it, c67623QgN.LJIILIIL(num.intValue(), Float.valueOf(0.0f)), false, null, false, false, false, 16379);
    }

    public static final Object invoke$35(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        return AEL.LJIILJJIL(it, ((C67625QgP) aqS177S0100000_11.l0).LJIILIIL(R.string.cfn, Float.valueOf(0.0f)), false, null, false, false, false, 16379);
    }

    public static final Object invoke$36(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        return AEL.LJIILJJIL(it, ((C67625QgP) aqS177S0100000_11.l0).LJIILIIL(R.string.cfn, Float.valueOf(0.0f)), false, null, false, false, false, 16379);
    }

    public static final Object invoke$37(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AudioRecord audioRecord = (AudioRecord) aqS177S0100000_11.l0;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "3233701466491135512");
        if (c03880Dg.LIZJ(100403, "android/media/AudioRecord", "release", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.release();
            c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AudioRecord audioRecord = (AudioRecord) aqS177S0100000_11.l0;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "3233701466491135512");
        if (c03880Dg.LIZJ(100400, "android/media/AudioRecord", "startRecording", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.startRecording();
            c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        AudioRecord audioRecord = (AudioRecord) aqS177S0100000_11.l0;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "3233701466491135512");
        if (c03880Dg.LIZJ(100401, "android/media/AudioRecord", "stop", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.stop();
            c03880Dg.LIZIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord, c65300Pk0, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        return ((InterfaceC63834P3m) aqS177S0100000_11.l0).invoke();
    }

    public static final Object invoke$40(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        CameraDevice cameraDevice = (CameraDevice) aqS177S0100000_11.l0;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "8001604037654132810");
        if (c03880Dg.LIZJ(100201, "android/hardware/camera2/CameraDevice", "close", cameraDevice, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, false);
        } else {
            cameraDevice.close();
            c03880Dg.LIZIZ(100201, "android/hardware/camera2/CameraDevice", "close", null, objArr, cameraDevice, c65300Pk0, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        C10K task = (C10K) obj;
        o.LJIIIZ(task, "task");
        ((FtcRegistrationCompleteActivity) aqS177S0100000_11.l0).finish();
        if (R41.LJI()) {
            R41.LJIIL(1, 1, "");
        }
        C69101RAb.LIZIZ(11);
        R41.LJIIIIZZ(R41.LIZJ());
        task.LJIIJJI();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        BaseLoginMethod it = (BaseLoginMethod) obj;
        o.LJIIIZ(it, "it");
        o.LJI((List) aqS177S0100000_11.l0);
        return Boolean.valueOf(!r1.contains(it.getUid()));
    }

    public static final Object invoke$43(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        BaseLoginMethod it = (BaseLoginMethod) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(o.LJ(it.getUid(), ((BaseLoginMethod) aqS177S0100000_11.l0).getUid()));
    }

    public static final Object invoke$44(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        Object createScreenCaptureIntent;
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) aqS177S0100000_11.l0;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(102100, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent", mediaProjectionManager, new Object[0], "android.content.Intent", new C65300Pk0(false, "()Landroid/content/Intent;", "5527588878949377496"));
        if (LIZJ.LIZ) {
            createScreenCaptureIntent = LIZJ.LIZIZ;
        } else {
            createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
        }
        o.LJFF(createScreenCaptureIntent, "this.createScreenCaptureIntent()");
        return createScreenCaptureIntent;
    }

    public static final Object invoke$45(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        String str;
        String str2 = (String) obj;
        String str3 = ((RC4) aqS177S0100000_11.l0).LIZJ;
        if (str2 == null) {
            str = "response is null";
        } else {
            str = str2;
        }
        C78886Uxe.LJJLI(str3, str, false);
        if (str2 == null || str2.length() == 0) {
            ((RC4) aqS177S0100000_11.l0).LIZ.LJLJL(null, Integer.valueOf(R.string.ieo));
        } else {
            ((RC4) aqS177S0100000_11.l0).LIZ.LJIILL(str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        R40 r40 = (R40) obj;
        C78886Uxe.LJJLIIIIJ(true, ((RC4) aqS177S0100000_11.l0).LIZJ, r40, "");
        if (((RC4) aqS177S0100000_11.l0).LIZIZ) {
            C40535FvX.LIZLLL(false);
        }
        a.LJI().LJIILLIIL(new ARunnableS30S0200000_11((RC4) aqS177S0100000_11.l0, r40, 82), true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        String str;
        String str2;
        R40 r40 = (R40) obj;
        String str3 = ((RC4) aqS177S0100000_11.l0).LIZJ;
        String str4 = null;
        if (r40 != null) {
            str = r40.LJFF;
        } else {
            str = null;
        }
        C78886Uxe.LJJLIIIIJ(false, str3, r40, str);
        if (r40 == null || (str2 = r40.LJFF) == null || str2.length() == 0) {
            ((RC4) aqS177S0100000_11.l0).LIZ.LJLJL(null, Integer.valueOf(R.string.ieo));
        } else {
            RC8 rc8 = ((RC4) aqS177S0100000_11.l0).LIZ;
            if (r40 != null) {
                str4 = r40.LJFF;
            }
            rc8.LJIILL(str4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        return ((InterfaceC63834P3m) aqS177S0100000_11.l0).invoke();
    }

    public static final Object invoke$6(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        return ((InterfaceC63834P3m) aqS177S0100000_11.l0).invoke();
    }

    public static final Object invoke$7(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((InterfaceC37276Ek4) aqS177S0100000_11.l0).cancel();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((InterfaceC37276Ek4) aqS177S0100000_11.l0).cancel();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS177S0100000_11 aqS177S0100000_11, Object obj) {
        ((InterfaceC37276Ek4) aqS177S0100000_11.l0).cancel();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(OHW ohw, int i) {
        super(1);
        this.$t = i;
        this.l0 = ohw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(P3K p3k, int i) {
        super(1);
        this.$t = i;
        this.l0 = p3k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(P3L p3l, int i) {
        super(1);
        this.$t = i;
        this.l0 = p3l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(P3M p3m, int i) {
        super(1);
        this.$t = i;
        this.l0 = p3m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(InterfaceC63834P3m interfaceC63834P3m, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC63834P3m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(PIF pif, int i) {
        super(1);
        this.$t = i;
        this.l0 = pif;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(InterfaceC65079PgR interfaceC65079PgR, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC65079PgR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(C65338Pkc c65338Pkc, int i) {
        super(1);
        this.$t = i;
        this.l0 = c65338Pkc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(Q2C q2c, int i) {
        super(1);
        this.$t = i;
        this.l0 = q2c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(C67623QgN c67623QgN, int i) {
        super(1);
        this.$t = i;
        this.l0 = c67623QgN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(C67624QgO c67624QgO, int i) {
        super(1);
        this.$t = i;
        this.l0 = c67624QgO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(C67625QgP c67625QgP, int i) {
        super(1);
        this.$t = i;
        this.l0 = c67625QgP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(RC4 rc4, int i) {
        super(1);
        this.$t = i;
        this.l0 = rc4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(ACListenerS35S0100000_15 aCListenerS35S0100000_15, int i) {
        super(1);
        this.$t = i;
        this.l0 = aCListenerS35S0100000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(CameraDevice cameraDevice, int i) {
        super(1);
        this.$t = i;
        this.l0 = cameraDevice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(AudioRecord audioRecord, int i) {
        super(1);
        this.$t = i;
        this.l0 = audioRecord;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(MediaProjectionManager mediaProjectionManager, int i) {
        super(1);
        this.$t = i;
        this.l0 = mediaProjectionManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = ftcRegistrationCompleteActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(BaseLoginMethod baseLoginMethod, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseLoginMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(LoginMethodListFragment loginMethodListFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = loginMethodListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(CommonFlowActivity commonFlowActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = commonFlowActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(InputCodeFragment inputCodeFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = inputCodeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(SignUpTermsConsentFragment signUpTermsConsentFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = signUpTermsConsentFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(VerifyPasswordFragment verifyPasswordFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = verifyPasswordFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(BindOrModifyPhoneActivity bindOrModifyPhoneActivity, int i) {
        super(1);
        this.$t = i;
        this.l0 = bindOrModifyPhoneActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(QuitBaAccountProcessor quitBaAccountProcessor, int i) {
        super(1);
        this.$t = i;
        this.l0 = quitBaAccountProcessor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(PageTraceApiImpl pageTraceApiImpl, int i) {
        super(1);
        this.$t = i;
        this.l0 = pageTraceApiImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0100000_11(Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l0 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS177S0100000_11(List list, List<String> list2) {
        super(1);
        this.$t = list2;
        this.l0 = list;
    }
}
