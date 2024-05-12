package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XqJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86075XqJ implements InterfaceC86091XqZ {
    public final Context LIZ;
    public final AgeGateSdkRegistrationFlow LIZIZ;

    @Override // X.InterfaceC86091XqZ
    public final void LIZLLL(C63062Op0 c63062Op0) {
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LIZIZ() {
        String string = this.LIZ.getString(R.string.bj_);
        String string2 = this.LIZ.getString(R.string.bj9);
        String string3 = this.LIZ.getString(R.string.bj7);
        o.LJIIIIZZ(string3, "context.getString(R.stri…hday_add_birthday_button)");
        String string4 = this.LIZ.getString(R.string.bj8);
        o.LJIIIIZZ(string4, "context.getString(R.stri…_birthday_go_back_button)");
        return new PNSFeedbackModel(null, new PNSDialogModel(string2, string, C47261Igj.LJJIJIIJI(new PNSAgeConfirmOption(string3, null, EnumC86061Xq5.CONTINUE.getType(), 2, null), new PNSAgeConfirmOption(string4, null, EnumC86061Xq5.DISMISS.getType(), 2, null)), Integer.valueOf(EnumC86062Xq6.ACTION.getValue()), 0, true, false, false, null, 336, null), null, 5, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final C86057Xq1 LJ() {
        String string;
        Context context;
        int i;
        String string2;
        Context context2;
        int i2;
        Date date;
        List list;
        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow = this.LIZIZ;
        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow2 = AgeGateSdkRegistrationFlow.NEW_COMPONENT;
        if (ageGateSdkRegistrationFlow == ageGateSdkRegistrationFlow2) {
            string = "";
        } else {
            string = this.LIZ.getString(R.string.doj);
            o.LJIIIIZZ(string, "context.getString(\n     …el_entry_2,\n            )");
        }
        if (this.LIZIZ == ageGateSdkRegistrationFlow2) {
            context = this.LIZ;
            i = R.string.q_0;
        } else {
            context = this.LIZ;
            i = R.string.c_p;
        }
        String string3 = context.getString(i);
        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow3 = this.LIZIZ;
        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow4 = AgeGateSdkRegistrationFlow.SIGN_UP;
        if (ageGateSdkRegistrationFlow3 != ageGateSdkRegistrationFlow4) {
            string2 = this.LIZ.getString(R.string.ce7);
        } else {
            string2 = this.LIZ.getString(R.string.ipr);
        }
        if (this.LIZIZ == ageGateSdkRegistrationFlow2) {
            context2 = this.LIZ;
            i2 = R.string.q9y;
        } else {
            context2 = this.LIZ;
            i2 = R.string.iae;
        }
        String string4 = context2.getString(i2);
        String string5 = this.LIZ.getString(R.string.iad);
        boolean z = true;
        if (C62960OnM.LIZ() != 0) {
            date = new Date(System.currentTimeMillis() - 34300800000L);
        } else {
            date = new Date(System.currentTimeMillis() - 31536000000L);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        Date time = calendar.getTime();
        o.LJIIIIZZ(time, "maxDate.time");
        EnumC86081XqP enumC86081XqP = EnumC86081XqP.HIDE;
        if (this.LIZIZ == ageGateSdkRegistrationFlow4) {
            list = C47261Igj.LJJIJ(new PNSNavButton(EnumC86082XqQ.LEFT, EnumC86085XqT.BACK, null, "", ""));
        } else {
            list = C61878OQg.INSTANCE;
        }
        if (this.LIZIZ != ageGateSdkRegistrationFlow4) {
            z = false;
        }
        return new C86057Xq1(string, string3, string2, string4, null, string5, date, time, null, enumC86081XqP, list, null, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJI() {
        String string = this.LIZ.getString(R.string.c_k);
        String string2 = this.LIZ.getString(R.string.c_j);
        String string3 = this.LIZ.getString(R.string.dt6);
        o.LJIIIIZZ(string3, "context.getString(R.string.confirm_use)");
        return new PNSFeedbackModel(null, new PNSDialogModel(string2, string, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string3, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), null, 0, false, false, false, null, 504, null), null, 5, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final Context getContext() {
        return this.LIZ;
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LIZ(String str) {
        String string = this.LIZ.getString(R.string.qb2);
        String string2 = this.LIZ.getString(R.string.qb1, str);
        String string3 = this.LIZ.getString(R.string.dt6);
        o.LJIIIIZZ(string3, "context.getString(R.string.confirm_use)");
        return new PNSFeedbackModel(null, new PNSDialogModel(string2, string, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string3, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), null, 0, false, false, false, C47261Igj.LJJIJ(new PNSHyperlink(str, "")), 184, null), null, 5, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJII(String str) {
        String string = this.LIZ.getString(R.string.p2);
        o.LJIIIIZZ(string, "context.getString(R.string.OK)");
        return new PNSFeedbackModel(null, new PNSDialogModel(str, null, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), null, 0, false, false, false, null, 442, null), null, 5, null);
    }

    public C86075XqJ(Context context, AgeGateSdkRegistrationFlow flow) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flow, "flow");
        this.LIZ = context;
        this.LIZIZ = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // X.InterfaceC86091XqZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel LIZJ(java.lang.Integer r13, java.lang.String r14) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel r6 = new com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel
            r5 = 2131689545(0x7f0f0049, float:1.9008108E38)
            r4 = 0
            r2 = 1
            if (r13 != 0) goto L5c
        L9:
            if (r14 == 0) goto L11
            int r0 = r14.length()
            if (r0 != 0) goto L1a
        L11:
            android.content.Context r1 = r12.LIZ
            r0 = 2131845548(0x7f1161ac, float:1.932452E38)
            java.lang.String r14 = r1.getString(r0)
        L1a:
            java.util.HashSet<java.lang.Integer> r0 = X.C36342EOc.LIZ
            boolean r0 = X.ORZ.LJLJJI(r13, r0)
            if (r0 == 0) goto L39
            X.XqU r0 = X.EnumC86086XqU.MAJOR
            int r0 = r0.getType()
        L28:
            com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel r7 = new com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.<init>(r0, r14)
            r8 = 0
            r10 = 6
            r9 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L39:
            if (r13 != 0) goto L42
        L3b:
            X.XqU r0 = X.EnumC86086XqU.MINOR
            int r0 = r0.getType()
            goto L28
        L42:
            int r1 = r13.intValue()
            r0 = 3008009(0x2de609, float:4.215118E-39)
            if (r1 != r0) goto L52
        L4b:
            X.XqU r0 = X.EnumC86086XqU.MEDIUM
            int r0 = r0.getType()
            goto L28
        L52:
            int r1 = r13.intValue()
            r0 = 3008011(0x2de60b, float:4.215121E-39)
            if (r1 != r0) goto L3b
            goto L4b
        L5c:
            int r1 = r13.intValue()
            r0 = 3008010(0x2de60a, float:4.21512E-39)
            if (r1 != r0) goto L78
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r4, r1)
            goto L1a
        L78:
            int r1 = r13.intValue()
            r0 = 3008012(0x2de60c, float:4.215123E-39)
            if (r1 != r0) goto L94
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r2, r1)
            goto L1a
        L94:
            int r1 = r13.intValue()
            r0 = 3008008(0x2de608, float:4.215117E-39)
            if (r1 != r0) goto Lb2
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1a
        Lb2:
            int r1 = r13.intValue()
            r0 = 3008026(0x2de61a, float:4.215142E-39)
            if (r1 != r0) goto Ld0
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1a
        Ld0:
            int r1 = r13.intValue()
            r0 = 3008020(0x2de614, float:4.215134E-39)
            if (r1 != r0) goto Lee
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1a
        Lee:
            int r1 = r13.intValue()
            r0 = 3008038(0x2de626, float:4.215159E-39)
            if (r1 != r0) goto L9
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131848412(0x7f116cdc, float:1.9330329E38)
            java.lang.String r14 = r1.getString(r0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86075XqJ.LIZJ(java.lang.Integer, java.lang.String):com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel");
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJFF(C62962OnO c62962OnO, java.util.Map<String, String> logParams) {
        o.LJIIIZ(logParams, "logParams");
        int i = C63003Oo3.LIZ[c62962OnO.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return LJII(c62962OnO.LIZLLL);
            }
            String LIZIZ = Q8U.LIZIZ(new Object[]{this.LIZ.getString(R.string.c_v), this.LIZ.getString(R.string.c_w)}, 2, "%s\n\n%s", "format(format, *args)");
            String string = this.LIZ.getString(R.string.c_u);
            o.LJIIIIZZ(string, "context.getString(R.stri…thdayscreen_modal_button)");
            return new PNSFeedbackModel(null, new PNSDialogModel(LIZIZ, null, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), Integer.valueOf(EnumC86062Xq6.BUTTON.getValue()), 0, false, false, false, null, 498, null), null, 5, null);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("exit_method", "success");
        FMX.LJIIL("guest_mode_age_gate_exit", c188727au.LIZ);
        return null;
    }
}
