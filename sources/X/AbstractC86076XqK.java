package X;

import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.XqK, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86076XqK implements InterfaceC86091XqZ {
    public C63062Op0 LIZ;

    @Override // X.InterfaceC86091XqZ
    public PNSFeedbackModel LIZIZ() {
        String string = getContext().getString(R.string.bj_);
        String string2 = getContext().getString(R.string.bj9);
        String string3 = getContext().getString(R.string.bj7);
        o.LJIIIIZZ(string3, "context.getString(R.stri…hday_add_birthday_button)");
        String string4 = getContext().getString(R.string.bj8);
        o.LJIIIIZZ(string4, "context.getString(R.stri…_birthday_go_back_button)");
        return new PNSFeedbackModel(null, new PNSDialogModel(string2, string, C47261Igj.LJJIJIIJI(new PNSAgeConfirmOption(string3, null, EnumC86061Xq5.CONTINUE.getType(), 2, null), new PNSAgeConfirmOption(string4, null, EnumC86061Xq5.DISMISS.getType(), 2, null)), Integer.valueOf(EnumC86062Xq6.ACTION.getValue()), 0, true, false, false, null, 336, null), null, 5, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJI() {
        String string = getContext().getString(R.string.c_k);
        String string2 = getContext().getString(R.string.c_j);
        String string3 = getContext().getString(R.string.dt6);
        o.LJIIIIZZ(string3, "context.getString(R.string.confirm_use)");
        return new PNSFeedbackModel(null, new PNSDialogModel(string2, string, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string3, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), null, 0, false, false, false, null, 504, null), null, 5, null);
    }

    public static final Date LJIIIIZZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        Date time = calendar.getTime();
        o.LJIIIIZZ(time, "maxDate.time");
        return time;
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LIZ(String str) {
        String string = getContext().getString(R.string.qb2);
        String string2 = getContext().getString(R.string.qb1, str);
        String string3 = getContext().getString(R.string.dt6);
        o.LJIIIIZZ(string3, "context.getString(R.string.confirm_use)");
        return new PNSFeedbackModel(null, new PNSDialogModel(string2, string, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string3, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), null, 0, false, false, false, C47261Igj.LJJIJ(new PNSHyperlink(str, "")), 184, null), null, 5, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final void LIZLLL(C63062Op0 c63062Op0) {
        this.LIZ = c63062Op0;
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJII(String str) {
        String string = getContext().getString(R.string.p2);
        o.LJIIIIZZ(string, "context.getString(R.string.OK)");
        return new PNSFeedbackModel(null, new PNSDialogModel(str, null, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), null, 0, false, false, false, null, 442, null), null, 5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
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
            r2 = 1
            r4 = 0
            if (r13 != 0) goto L5d
        L9:
            if (r14 == 0) goto L11
            int r0 = r14.length()
            if (r0 != 0) goto L1c
        L11:
            android.content.Context r1 = r12.getContext()
            r0 = 2131845548(0x7f1161ac, float:1.932452E38)
            java.lang.String r14 = r1.getString(r0)
        L1c:
            java.util.HashSet<java.lang.Integer> r0 = X.C36342EOc.LIZ
            boolean r0 = X.ORZ.LJLJJI(r13, r0)
            if (r0 == 0) goto L3b
            X.XqU r0 = X.EnumC86086XqU.MAJOR
            int r0 = r0.getType()
        L2a:
            com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel r7 = new com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.<init>(r0, r14)
            r8 = 0
            r10 = 6
            r9 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L3b:
            if (r13 != 0) goto L44
        L3d:
            X.XqU r0 = X.EnumC86086XqU.MINOR
            int r0 = r0.getType()
            goto L2a
        L44:
            int r1 = r13.intValue()
            r0 = 3008009(0x2de609, float:4.215118E-39)
            if (r1 == r0) goto L56
            int r1 = r13.intValue()
            r0 = 3008011(0x2de60b, float:4.215121E-39)
            if (r1 != r0) goto L3d
        L56:
            X.XqU r0 = X.EnumC86086XqU.MEDIUM
            int r0 = r0.getType()
            goto L2a
        L5d:
            int r1 = r13.intValue()
            r0 = 3008010(0x2de60a, float:4.21512E-39)
            if (r1 != r0) goto L7b
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r4, r1)
            goto L1c
        L7b:
            int r1 = r13.intValue()
            r0 = 3008012(0x2de60c, float:4.215123E-39)
            if (r1 != r0) goto L99
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r2, r1)
            goto L1c
        L99:
            int r1 = r13.intValue()
            r0 = 3008008(0x2de608, float:4.215117E-39)
            if (r1 != r0) goto Lb9
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1c
        Lb9:
            int r1 = r13.intValue()
            r0 = 3008026(0x2de61a, float:4.215142E-39)
            if (r1 != r0) goto Ld9
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1c
        Ld9:
            int r1 = r13.intValue()
            r0 = 3008020(0x2de614, float:4.215134E-39)
            if (r1 != r0) goto Lf9
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1c
        Lf9:
            int r1 = r13.intValue()
            r0 = 3008038(0x2de626, float:4.215159E-39)
            if (r1 != r0) goto L9
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131848412(0x7f116cdc, float:1.9330329E38)
            java.lang.String r14 = r1.getString(r0)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86076XqK.LIZJ(java.lang.Integer, java.lang.String):com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel");
    }
}
