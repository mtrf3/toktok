package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.profile.model.AgeGateHyperlink;
import com.ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.ss.android.ugc.aweme.profile.model.AgeGateNavButton;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.XqL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86077XqL implements InterfaceC86091XqZ {
    public final Context LIZ;
    public final AgeGateInfo LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final Date LJ = new Date(System.currentTimeMillis() - 31536000000L);

    @Override // X.InterfaceC86091XqZ
    public final void LIZLLL(C63062Op0 c63062Op0) {
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LIZIZ() {
        return new PNSFeedbackModel(null, null, null, 7, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final C86057Xq1 LJ() {
        String str;
        String str2;
        String string;
        String str3;
        String string2;
        String str4;
        String string3;
        String string4;
        EnumC86081XqP enumC86081XqP;
        String str5;
        String str6;
        Integer ageIndicatorType;
        List<AgeGateHyperlink> hyperlinks;
        List<AgeGateNavButton> navButtons;
        EnumC86082XqQ enumC86082XqQ;
        EnumC86085XqT enumC86085XqT;
        ArrayList arrayList = new ArrayList();
        AgeGateInfo ageGateInfo = this.LIZIZ;
        if (ageGateInfo != null && (navButtons = ageGateInfo.getNavButtons()) != null) {
            for (AgeGateNavButton ageGateNavButton : navButtons) {
                Integer position = ageGateNavButton.getPosition();
                if (position != null) {
                    int intValue = position.intValue();
                    EnumC86082XqQ.Companion.getClass();
                    EnumC86082XqQ[] values = EnumC86082XqQ.values();
                    int length = values.length;
                    for (int i = 0; i < length; i++) {
                        enumC86082XqQ = values[i];
                        if (enumC86082XqQ.getPosition() != intValue) {
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                enumC86082XqQ = null;
                Integer type = ageGateNavButton.getType();
                if (type != null) {
                    int intValue2 = type.intValue();
                    EnumC86085XqT.Companion.getClass();
                    EnumC86085XqT[] values2 = EnumC86085XqT.values();
                    int length2 = values2.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        enumC86085XqT = values2[i2];
                        if (enumC86085XqT.getType() == intValue2) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                enumC86085XqT = null;
                arrayList.add(new PNSNavButton(enumC86082XqQ, enumC86085XqT, ageGateNavButton.getIconUrl(), ageGateNavButton.getContent(), ageGateNavButton.getActionUrl()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        AgeGateInfo ageGateInfo2 = this.LIZIZ;
        if (ageGateInfo2 != null && (hyperlinks = ageGateInfo2.getHyperlinks()) != null) {
            for (AgeGateHyperlink ageGateHyperlink : hyperlinks) {
                arrayList2.add(new PNSHyperlink(ageGateHyperlink.getAgeGateHyperlinkText(), ageGateHyperlink.getAgeGateHyperlinkAction()));
            }
        }
        AgeGateInfo ageGateInfo3 = this.LIZIZ;
        String str7 = "";
        if (ageGateInfo3 == null || (str = ageGateInfo3.getHeader()) == null) {
            str = "";
        }
        AgeGateInfo ageGateInfo4 = this.LIZIZ;
        if (ageGateInfo4 != null) {
            str2 = ageGateInfo4.getTitle();
        } else {
            str2 = null;
        }
        if (C78685UuP.LJJJZ(str2)) {
            AgeGateInfo ageGateInfo5 = this.LIZIZ;
            if (ageGateInfo5 != null) {
                string = ageGateInfo5.getTitle();
            } else {
                string = null;
            }
        } else {
            string = this.LIZ.getString(R.string.c_p);
        }
        AgeGateInfo ageGateInfo6 = this.LIZIZ;
        if (ageGateInfo6 != null) {
            str3 = ageGateInfo6.getNextButtonText();
        } else {
            str3 = null;
        }
        if (C78685UuP.LJJJZ(str3)) {
            AgeGateInfo ageGateInfo7 = this.LIZIZ;
            if (ageGateInfo7 != null) {
                string2 = ageGateInfo7.getNextButtonText();
            } else {
                string2 = null;
            }
        } else {
            string2 = this.LIZ.getString(R.string.ipr);
        }
        AgeGateInfo ageGateInfo8 = this.LIZIZ;
        if (ageGateInfo8 != null) {
            str4 = ageGateInfo8.getContent();
        } else {
            str4 = null;
        }
        if (C78685UuP.LJJJZ(str4)) {
            AgeGateInfo ageGateInfo9 = this.LIZIZ;
            if (ageGateInfo9 != null) {
                string3 = ageGateInfo9.getContent();
            } else {
                string3 = null;
            }
        } else if (this.LIZJ == EnumC62956OnI.US_FTC.getValue()) {
            string3 = this.LIZ.getString(R.string.ic2);
        } else {
            string3 = this.LIZ.getString(R.string.c_o);
        }
        if (!this.LIZLLL) {
            AgeGateInfo ageGateInfo10 = this.LIZIZ;
            if (ageGateInfo10 != null) {
                str7 = ageGateInfo10.getAgeGateImageUrl();
            } else {
                str7 = null;
            }
        }
        AgeGateInfo ageGateInfo11 = this.LIZIZ;
        if (ageGateInfo11 == null || (string4 = ageGateInfo11.getAgeGateInputPlaceHolder()) == null) {
            string4 = this.LIZ.getString(R.string.iad);
            o.LJIIIIZZ(string4, "context.getString(R.string.mus_age_gate_hint)");
        }
        AgeGateInfo ageGateInfo12 = this.LIZIZ;
        if (ageGateInfo12 != null && (ageIndicatorType = ageGateInfo12.getAgeIndicatorType()) != null) {
            int intValue3 = ageIndicatorType.intValue();
            EnumC86081XqP.Companion.getClass();
            EnumC86081XqP[] values3 = EnumC86081XqP.values();
            int length3 = values3.length;
            for (int i3 = 0; i3 < length3; i3++) {
                enumC86081XqP = values3[i3];
                if (enumC86081XqP.getType() != intValue3) {
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        enumC86081XqP = EnumC86081XqP.HIDE;
        AgeGateInfo ageGateInfo13 = this.LIZIZ;
        if (ageGateInfo13 != null) {
            str5 = ageGateInfo13.getDefaultDate();
        } else {
            str5 = null;
        }
        Date LIZ = C63761P0r.LIZ(str5);
        if (LIZ == null) {
            LIZ = this.LJ;
        }
        AgeGateInfo ageGateInfo14 = this.LIZIZ;
        if (ageGateInfo14 != null) {
            str6 = ageGateInfo14.getUpperBoundDate();
        } else {
            str6 = null;
        }
        Date LIZ2 = C63761P0r.LIZ(str6);
        if (LIZ2 == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, -1);
            calendar.set(6, calendar.getActualMaximum(6));
            calendar.set(2, calendar.getActualMaximum(2));
            LIZ2 = calendar.getTime();
            o.LJIIIIZZ(LIZ2, "calendar.time");
        }
        return new C86057Xq1(str, string, string2, string3, str7, string4, LIZ, LIZ2, null, enumC86081XqP, arrayList, arrayList2, null, 4352, null);
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
        return new PNSFeedbackModel(null, null, null, 7, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJII(String str) {
        String string = this.LIZ.getString(R.string.p2);
        o.LJIIIIZZ(string, "context.getString(R.string.OK)");
        return new PNSFeedbackModel(null, new PNSDialogModel(str, null, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), null, 0, false, false, false, null, 442, null), null, 5, null);
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
            r2 = 1
            r4 = 0
            if (r13 != 0) goto L5b
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
            if (r1 == r0) goto L54
            int r1 = r13.intValue()
            r0 = 3008011(0x2de60b, float:4.215121E-39)
            if (r1 != r0) goto L3b
        L54:
            X.XqU r0 = X.EnumC86086XqU.MEDIUM
            int r0 = r0.getType()
            goto L28
        L5b:
            int r1 = r13.intValue()
            r0 = 3008010(0x2de60a, float:4.21512E-39)
            if (r1 != r0) goto L77
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r4, r1)
            goto L1a
        L77:
            int r1 = r13.intValue()
            r0 = 3008012(0x2de60c, float:4.215123E-39)
            if (r1 != r0) goto L93
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r2, r1)
            goto L1a
        L93:
            int r1 = r13.intValue()
            r0 = 3008008(0x2de608, float:4.215117E-39)
            if (r1 != r0) goto Lb1
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1a
        Lb1:
            int r1 = r13.intValue()
            r0 = 3008026(0x2de61a, float:4.215142E-39)
            if (r1 != r0) goto Lcf
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1a
        Lcf:
            int r1 = r13.intValue()
            r0 = 3008020(0x2de614, float:4.215134E-39)
            if (r1 != r0) goto Led
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r3 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r4] = r0
            java.lang.String r14 = r3.getQuantityString(r5, r1, r2)
            goto L1a
        Led:
            int r1 = r13.intValue()
            r0 = 3008038(0x2de626, float:4.215159E-39)
            if (r1 != r0) goto L9
            android.content.Context r0 = r12.LIZ
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131848412(0x7f116cdc, float:1.9330329E38)
            java.lang.String r14 = r1.getString(r0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86077XqL.LIZJ(java.lang.Integer, java.lang.String):com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel");
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJFF(C62962OnO c62962OnO, java.util.Map<String, String> logParams) {
        o.LJIIIZ(logParams, "logParams");
        if (C63004Oo4.LIZ[c62962OnO.LIZ.ordinal()] == 1) {
            return LJI();
        }
        return null;
    }

    public C86077XqL(Context context, AgeGateInfo ageGateInfo, int i, boolean z) {
        this.LIZ = context;
        this.LIZIZ = ageGateInfo;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
