package X;

import Y.ACListenerS30S0100000_10;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillModel;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel;
import com.ss.android.ugc.aweme.cct.AdACTEventLoger;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS98S0101000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N8D {
    public static boolean LJFF;
    public final ActivityC45651qj LIZ;
    public final boolean LIZIZ;
    public final View LIZJ;
    public AdAutofillPopupModel LIZLLL;
    public AdAutofillModel LJ;

    public final void LIZLLL() {
        String str;
        AdAutofillAdInfo adAutofillAdInfo;
        AdAutofillAdInfo adAutofillAdInfo2;
        AdAutofillModel adAutofillModel = null;
        r5 = null;
        String str2 = null;
        ASQ.LIZLLL(this.LIZJ, new N8O(false, null));
        if (this.LIZIZ) {
            NAW.LIZIZ(true);
            IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
            C58685N1l.LIZ.getClass();
            C58653N0f c58653N0f = C58685N1l.LJJIJIIJI;
            AdAutofillPopupModel adAutofillPopupModel = this.LIZLLL;
            if (adAutofillPopupModel == null || (adAutofillAdInfo2 = adAutofillPopupModel.adInfo) == null || (str = adAutofillAdInfo2.cid) == null) {
                str = "";
            }
            if (adAutofillPopupModel != null && (adAutofillAdInfo = adAutofillPopupModel.adInfo) != null) {
                str2 = adAutofillAdInfo.logExtra;
            }
            LJJIJ.LIZJ(c58653N0f, str, str2, null, new AqS176S0100000_10(this, 201));
            ASQ.LIZLLL(this.LIZJ, ASX.LIZ);
            return;
        }
        NAW.LIZIZ(false);
        try {
            View view = this.LIZJ;
            AdAutofillPopupModel adAutofillPopupModel2 = this.LIZLLL;
            if (adAutofillPopupModel2 != null) {
                adAutofillModel = adAutofillPopupModel2.autofillInfo;
            }
            NAW.LJIILJJIL(view, new JSONObject(C75792yF.LIZJ(adAutofillModel)), true, false, true, new AqS176S0100000_10(this, 202));
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    public final void LJ() {
        AdAutofillModel adAutofillModel;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AdAutofillPopupModel adAutofillPopupModel = this.LIZLLL;
        String str10 = null;
        if (adAutofillPopupModel != null) {
            adAutofillModel = adAutofillPopupModel.autofillInfo;
        } else {
            adAutofillModel = null;
        }
        this.LJ = adAutofillModel;
        StringBuilder LIZ = X1D.LIZ();
        AdAutofillModel adAutofillModel2 = this.LJ;
        if (adAutofillModel2 != null) {
            str = adAutofillModel2.firstName;
        } else {
            str = null;
        }
        LIZ.append(str);
        AdAutofillModel adAutofillModel3 = this.LJ;
        if (adAutofillModel3 != null) {
            str2 = adAutofillModel3.lastName;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        AdAutofillModel adAutofillModel4 = this.LJ;
        if (adAutofillModel4 != null) {
            str3 = adAutofillModel4.email;
            str4 = adAutofillModel4.mobile;
        } else {
            str3 = null;
            str4 = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        AdAutofillModel adAutofillModel5 = this.LJ;
        if (adAutofillModel5 != null) {
            str5 = adAutofillModel5.unit;
        } else {
            str5 = null;
        }
        LIZ2.append(str5);
        AdAutofillModel adAutofillModel6 = this.LJ;
        if (adAutofillModel6 != null) {
            str6 = adAutofillModel6.address;
        } else {
            str6 = null;
        }
        LIZ2.append(str6);
        AdAutofillModel adAutofillModel7 = this.LJ;
        if (adAutofillModel7 != null) {
            str7 = adAutofillModel7.city;
        } else {
            str7 = null;
        }
        LIZ2.append(str7);
        AdAutofillModel adAutofillModel8 = this.LJ;
        if (adAutofillModel8 != null) {
            str8 = adAutofillModel8.state;
        } else {
            str8 = null;
        }
        LIZ2.append(str8);
        AdAutofillModel adAutofillModel9 = this.LJ;
        if (adAutofillModel9 != null) {
            str9 = adAutofillModel9.zipCode;
        } else {
            str9 = null;
        }
        LIZ2.append(str9);
        AdAutofillModel adAutofillModel10 = this.LJ;
        if (adAutofillModel10 != null) {
            str10 = adAutofillModel10.country;
        }
        LIZ2.append(str10);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        String str11 = "";
        if (C78685UuP.LJJJZ(LIZIZ)) {
            str11 = i0.LJFF("", LIZIZ);
        }
        if (C78685UuP.LJJJZ(str3)) {
            if (C78685UuP.LJJJZ(str11)) {
                str3 = C00F.LIZIZ(str11, '\n', str3);
            }
            str11 = str3;
        }
        if (C78685UuP.LJJJZ(str4)) {
            if (C78685UuP.LJJJZ(str11)) {
                str4 = C00F.LIZIZ(str11, '\n', str4);
            }
            str11 = str4;
        }
        if (C78685UuP.LJJJZ(LIZIZ2)) {
            if (C78685UuP.LJJJZ(str11)) {
                LIZIZ2 = C00F.LIZIZ(str11, '\n', LIZIZ2);
            }
            str11 = LIZIZ2;
        }
        ((TextView) this.LIZJ.findViewById(R.id.aaz)).setText(str11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings$AdAutofillConfig r0 = com.ss.android.ugc.aweme.autofill.AdAutofillConfigSettings.LIZ()
            java.lang.String r2 = r0.settingLynxSchema
            X.FsQ r1 = X.C40343FsR.LJIILJJIL
            X.N8F r0 = new X.N8F
            r0.<init>()
            r1.getClass()
            X.C40342FsQ.LJI(r0)
            X.1qj r3 = r8.LIZ     // Catch: java.lang.Exception -> L41
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)     // Catch: java.lang.Exception -> L41
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "initialData"
            com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel r0 = r8.LIZLLL     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = X.C75792yF.LIZJ(r0)     // Catch: java.lang.Exception -> L41
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "target_handler"
            java.lang.String r0 = "ad_autofill_edit"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L41
            android.net.Uri r0 = r0.build()     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L41
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r3, r0)     // Catch: java.lang.Exception -> L41
            r0.open()     // Catch: java.lang.Exception -> L41
            goto L45
        L41:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L45:
            com.ss.android.ugc.aweme.log.IAdWebEventLogger r2 = com.ss.android.ugc.aweme.cct.AdACTEventLoger.LJJIJ()
            X.N1l r0 = X.C58685N1l.LIZ
            r0.getClass()
            X.N0f r3 = X.C58685N1l.LJJIJL
            com.ss.android.ugc.aweme.autofill.model.AdAutofillPopupModel r1 = r8.LIZLLL
            if (r1 == 0) goto L5c
            com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo r0 = r1.adInfo
            if (r0 == 0) goto L5c
            java.lang.String r4 = r0.cid
            if (r4 != 0) goto L60
        L5c:
            java.lang.String r4 = ""
            if (r1 == 0) goto L72
        L60:
            com.ss.android.ugc.aweme.autofill.model.AdAutofillAdInfo r0 = r1.adInfo
            if (r0 == 0) goto L72
            java.lang.String r5 = r0.logExtra
        L66:
            r6 = 0
            kotlin.jvm.internal.AqS176S0100000_10 r7 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 200(0xc8, float:2.8E-43)
            r7.<init>(r8, r0)
            r2.LIZJ(r3, r4, r5, r6, r7)
            return
        L72:
            r5 = 0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N8D.LIZJ():void");
    }

    public final T5R LIZ(boolean z) {
        String string;
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ.getString(R.string.by3));
            LIZ.append('.');
            string = X1D.LIZIZ(LIZ);
        } else {
            string = this.LIZ.getString(R.string.by2);
            o.LJIIIIZZ(string, "{\n            activity.g…claimer_text_1)\n        }");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(' ');
        LIZ2.append(this.LIZ.getString(R.string.by1));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        int length = string.length() - 1;
        int length2 = LIZIZ.length() + string.length();
        T5R t5r = new T5R(i0.LJFF(string, LIZIZ));
        t5r.LIZ(61);
        int i = length + 1;
        t5r.setSpan(new C58877N8v(), i, length2, 33);
        t5r.setSpan(new T5U(63, true), i, length2, 33);
        return t5r;
    }

    public final void LIZIZ(int i) {
        String str;
        String str2;
        AdAutofillAdInfo adAutofillAdInfo;
        AdAutofillAdInfo adAutofillAdInfo2;
        NAW.LIZIZ(false);
        AdAutofillPopupModel adAutofillPopupModel = this.LIZLLL;
        String str3 = null;
        if (adAutofillPopupModel != null) {
            str = adAutofillPopupModel.requestId;
        } else {
            str = null;
        }
        NAW.LJIIL(Integer.valueOf(this.LIZIZ ? 1 : 0), str);
        IAdWebEventLogger LJJIJ = AdACTEventLoger.LJJIJ();
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJJIJIIJIL;
        AdAutofillPopupModel adAutofillPopupModel2 = this.LIZLLL;
        if (adAutofillPopupModel2 == null || (adAutofillAdInfo2 = adAutofillPopupModel2.adInfo) == null || (str2 = adAutofillAdInfo2.cid) == null) {
            str2 = "";
        }
        if (adAutofillPopupModel2 != null && (adAutofillAdInfo = adAutofillPopupModel2.adInfo) != null) {
            str3 = adAutofillAdInfo.logExtra;
        }
        LJJIJ.LIZJ(c58653N0f, str2, str3, null, new AqS98S0101000_10(this, i, 1));
    }

    public N8D(ActivityC45651qj activityC45651qj, boolean z, JSONObject jSONObject) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = z;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activityC45651qj), R.layout.g5, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(activity)\n        .…_popup_view, null, false)");
        this.LIZJ = LLLLIILL;
        try {
            this.LIZLLL = (AdAutofillPopupModel) C75792yF.LIZ(jSONObject.toString(), AdAutofillPopupModel.class);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        this.LIZJ.findViewById(R.id.kug).getClass();
        if (this.LIZIZ) {
            ((TextView) this.LIZJ.findViewById(R.id.lao)).setText(this.LIZ.getString(R.string.q_c));
            ((TextView) this.LIZJ.findViewById(R.id.ks_)).setText(this.LIZ.getString(R.string.by6));
            ((TextView) this.LIZJ.findViewById(R.id.kug)).setText(this.LIZ.getString(R.string.by5));
            ((TextView) this.LIZJ.findViewById(R.id.h3h)).setText(this.LIZ.getString(R.string.q_b));
            this.LIZJ.findViewById(R.id.aax).setVisibility(0);
            ((TextView) this.LIZJ.findViewById(R.id.aax)).setText(LIZ(true));
            ((TextView) this.LIZJ.findViewById(R.id.aax)).setMovementMethod(AnonymousClass898.LIZ);
            this.LIZJ.findViewById(R.id.aay).setVisibility(8);
        } else {
            this.LIZJ.findViewById(R.id.aax).setVisibility(0);
            ((TextView) this.LIZJ.findViewById(R.id.aax)).setText(LIZ(false));
            ((TextView) this.LIZJ.findViewById(R.id.aax)).setMovementMethod(LinkMovementMethod.getInstance());
            ((TextView) this.LIZJ.findViewById(R.id.aay)).setText(this.LIZ.getString(R.string.by3));
            this.LIZJ.findViewById(R.id.aay).setVisibility(0);
            if (NAW.LJIIIIZZ() == null) {
                ((TextView) this.LIZJ.findViewById(R.id.lao)).setText(this.LIZ.getString(R.string.q_i));
                ((TextView) this.LIZJ.findViewById(R.id.kug)).setText(this.LIZ.getString(R.string.bk0));
                ((TextView) this.LIZJ.findViewById(R.id.h3h)).setText(this.LIZ.getString(R.string.q_b));
            } else {
                ((TextView) this.LIZJ.findViewById(R.id.lao)).setText(this.LIZ.getString(R.string.q_j));
                ((TextView) this.LIZJ.findViewById(R.id.kug)).setText(this.LIZ.getString(R.string.q_g));
                ((TextView) this.LIZJ.findViewById(R.id.h3h)).setText(this.LIZ.getString(R.string.q_a));
            }
        }
        if (!this.LIZIZ) {
            this.LIZJ.findViewById(R.id.ks_).setVisibility(8);
            ((ImageView) this.LIZJ.findViewById(R.id.ebu)).setVisibility(8);
        }
        C16880lQ.LJJJJI((TuxTextView) this.LIZJ.findViewById(R.id.ks_), new ACListenerS30S0100000_10(this, 147));
        C16880lQ.LJJJ((TuxIconView) this.LIZJ.findViewById(R.id.ebu), new ACListenerS30S0100000_10(this, 148));
        LJ();
        if (this.LIZIZ) {
            C16880lQ.LJJIZ((SY4) this.LIZJ.findViewById(R.id.kug), new ACListenerS30S0100000_10(this, 149));
        } else {
            C16880lQ.LJJIZ((SY4) this.LIZJ.findViewById(R.id.kug), new ACListenerS30S0100000_10(this, 150));
        }
        C16880lQ.LJJJJI((TuxTextView) this.LIZJ.findViewById(R.id.h3h), new ACListenerS30S0100000_10(this, 151));
    }
}
