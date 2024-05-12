package com.ss.android.ugc.aweme.compliance.consent.termsconditions.component;

import X.AnonymousClass898;
import X.C16880lQ;
import X.C1EU;
import X.C47704Ins;
import X.C55749LuL;
import X.C63092OpU;
import X.C63093OpV;
import X.C63094OpW;
import X.C63095OpX;
import X.C63096OpY;
import X.C71897SJp;
import X.C72062SPy;
import X.C88913eJ;
import X.SY4;
import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TermsConditionsAssem extends UISlotAssem {
    public TuxTextView LJLJLLL;
    public C71897SJp LJLL;
    public TuxTextView LJLLI;
    public C71897SJp LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxTextView LJLLL;
    public C71897SJp LJLLLL;
    public TuxTextView LJLLLLLL;
    public TuxTextView LJLZ;
    public C71897SJp LJZ;
    public TuxTextView LJZI;
    public TuxTextView LJZL;
    public SY4 LL;
    public boolean LLD;
    public final C55749LuL LLF;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aga;
    }

    public TermsConditionsAssem() {
        new LinkedHashMap();
        this.LLF = new C55749LuL(C47704Ins.LIZJ(this, C63093OpV.class, "terms_conditions_ui_data"), checkSupervisorPrepared());
    }

    public final C63093OpV H3() {
        return (C63093OpV) this.LLF.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        TermsConsentInfo termsConsentInfo;
        String string2;
        TermsConsentInfo termsConsentInfo2;
        String string3;
        TermsConsentInfo termsConsentInfo3;
        String string4;
        TermsConsentInfo termsConsentInfo4;
        String string5;
        TermsConsentInfo termsConsentInfo5;
        String string6;
        TermsConsentInfo termsConsentInfo6;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = (TuxTextView) view.findViewById(R.id.mo6);
        this.LJLL = (C71897SJp) view.findViewById(R.id.b76);
        this.LJLLI = (TuxTextView) view.findViewById(R.id.lz9);
        this.LJLLILLLL = (C71897SJp) view.findViewById(R.id.b7a);
        this.LJLLJ = (TuxTextView) view.findViewById(R.id.lze);
        this.LJLLL = (TuxTextView) view.findViewById(R.id.lzf);
        this.LJLLLL = (C71897SJp) view.findViewById(R.id.b78);
        this.LJLLLLLL = (TuxTextView) view.findViewById(R.id.lzc);
        this.LJLZ = (TuxTextView) view.findViewById(R.id.lzd);
        this.LJZ = (C71897SJp) view.findViewById(R.id.b77);
        this.LJZI = (TuxTextView) view.findViewById(R.id.lzb);
        this.LJZL = (TuxTextView) view.findViewById(R.id.lza);
        this.LL = (SY4) view.findViewById(R.id.axf);
        TuxTextView tuxTextView = this.LJLJLLL;
        if (tuxTextView != null) {
            C63093OpV H3 = H3();
            if (H3 == null || (termsConsentInfo = H3.LJLIL) == null || (string = termsConsentInfo.getTitle()) == null || string.length() == 0) {
                string = view.getContext().getString(R.string.dqz);
            }
            tuxTextView.setText(string);
        }
        TuxTextView tuxTextView2 = this.LJLLI;
        if (tuxTextView2 != null) {
            C63093OpV H32 = H3();
            if (H32 == null || (termsConsentInfo2 = H32.LJLIL) == null || (string2 = termsConsentInfo2.getCheckboxAll()) == null || string2.length() == 0) {
                string2 = view.getContext().getString(R.string.gik);
            }
            tuxTextView2.setText(string2);
        }
        TuxTextView tuxTextView3 = this.LJLLJ;
        if (tuxTextView3 != null) {
            C63093OpV H33 = H3();
            if (H33 == null || (termsConsentInfo3 = H33.LJLIL) == null || (string3 = termsConsentInfo3.getCheckboxTerms()) == null || string3.length() == 0) {
                string3 = view.getContext().getString(R.string.gin);
            }
            tuxTextView3.setText(string3);
        }
        TuxTextView tuxTextView4 = this.LJLLL;
        if (tuxTextView4 != null) {
            tuxTextView4.setMovementMethod(AnonymousClass898.LIZ);
            C72062SPy c72062SPy = new C72062SPy();
            c72062SPy.LIZIZ = C88913eJ.LIZ(view, R.string.gim, "view.context.getString(R…nsent_kr_sign_up_details)");
            c72062SPy.LIZ = true;
            c72062SPy.LIZIZ(42);
            c72062SPy.LJ(3);
            c72062SPy.LJFF = new AqS157S0200000_10(this, tuxTextView4, 17);
            Context context = tuxTextView4.getContext();
            o.LJIIIIZZ(context, "it.context");
            tuxTextView4.setText(c72062SPy.LIZ(context));
        }
        TuxTextView tuxTextView5 = this.LJLLLLLL;
        if (tuxTextView5 != null) {
            C63093OpV H34 = H3();
            if (H34 == null || (termsConsentInfo4 = H34.LJLIL) == null || (string4 = termsConsentInfo4.getCheckboxPP()) == null || string4.length() == 0) {
                string4 = view.getContext().getString(R.string.gil);
            }
            tuxTextView5.setText(string4);
        }
        TuxTextView tuxTextView6 = this.LJLZ;
        if (tuxTextView6 != null) {
            tuxTextView6.setMovementMethod(AnonymousClass898.LIZ);
            C72062SPy c72062SPy2 = new C72062SPy();
            c72062SPy2.LIZIZ = C88913eJ.LIZ(view, R.string.gim, "view.context.getString(R…nsent_kr_sign_up_details)");
            c72062SPy2.LIZ = true;
            c72062SPy2.LIZIZ(42);
            c72062SPy2.LJ(3);
            c72062SPy2.LJFF = new AqS157S0200000_10(this, tuxTextView6, 18);
            Context context2 = tuxTextView6.getContext();
            o.LJIIIIZZ(context2, "it.context");
            tuxTextView6.setText(c72062SPy2.LIZ(context2));
        }
        TuxTextView tuxTextView7 = this.LJZI;
        if (tuxTextView7 != null) {
            C63093OpV H35 = H3();
            if (H35 == null || (termsConsentInfo5 = H35.LJLIL) == null || (string5 = termsConsentInfo5.getCbNotificationTitle()) == null || string5.length() == 0) {
                string5 = view.getContext().getString(R.string.gip);
            }
            tuxTextView7.setText(string5);
        }
        TuxTextView tuxTextView8 = this.LJZL;
        if (tuxTextView8 != null) {
            C63093OpV H36 = H3();
            if (H36 == null || (termsConsentInfo6 = H36.LJLIL) == null || (string6 = termsConsentInfo6.getCbNotificationSubTitle()) == null || string6.length() == 0 || string6 == null) {
                string6 = view.getContext().getString(R.string.pzf);
            }
            tuxTextView8.setText(string6);
        }
        C71897SJp c71897SJp = this.LJLL;
        if (c71897SJp != null) {
            C71897SJp c71897SJp2 = this.LJLLILLLL;
            if (c71897SJp2 != null) {
                C71897SJp c71897SJp3 = this.LJLLLL;
                if (c71897SJp3 != null) {
                    C71897SJp c71897SJp4 = this.LJZ;
                    if (c71897SJp4 != null) {
                        c71897SJp.setOnCheckedChangeListener(new C63092OpU(c71897SJp2, c71897SJp3, c71897SJp4, this));
                        c71897SJp2.setOnCheckedChangeListener(new C63094OpW(c71897SJp3, c71897SJp4, c71897SJp, this, c71897SJp2));
                        c71897SJp3.setOnCheckedChangeListener(new C63095OpX(c71897SJp2, c71897SJp4, c71897SJp, this, c71897SJp3));
                        c71897SJp4.setOnCheckedChangeListener(new C63096OpY(c71897SJp2, c71897SJp3, c71897SJp, this));
                        SY4 sy4 = this.LL;
                        if (sy4 != null) {
                            sy4.setSupportClickWhenDisable(true);
                            C16880lQ.LJJIZ(sy4, new ACListenerS30S0100000_10(this, 68));
                            return;
                        }
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void I3(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Uri.Builder LIZIZ = C1EU.LIZIZ(str, "use_spark", "1");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        buildRoute.withParam("url", LIZIZ.toString());
        buildRoute.withParam("use_webview_title", true);
        buildRoute.open();
    }
}
