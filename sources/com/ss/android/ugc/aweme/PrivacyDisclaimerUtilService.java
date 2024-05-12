package com.ss.android.ugc.aweme;

import X.AGJ;
import X.AnonymousClass636;
import X.AnonymousClass894;
import X.C03880Dg;
import X.C04330Ez;
import X.C188517aZ;
import X.C198517qh;
import X.C58096Mr6;
import X.C65300Pk0;
import X.C81626W1u;
import X.C85681Xjx;
import X.C85682Xjy;
import X.C85683Xjz;
import X.C85687Xk3;
import X.C85837XmT;
import X.DialogC81625W1t;
import X.O0X;
import X.Q13;
import X.UZF;
import Y.ACListenerS39S0200000_4;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public final class PrivacyDisclaimerUtilService implements IPrivacyDisclaimerUtil {
    public static void LJFF(DialogC81625W1t dialogC81625W1t) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/account/base/component/AwemeProtocolDialog", "show", dialogC81625W1t, new Object[0], "void", new C65300Pk0(false, "()V", "-2581001297074631081")).LIZ) {
            return;
        }
        dialogC81625W1t.show();
    }

    public static IPrivacyDisclaimerUtil LJI() {
        Object LIZ = C58096Mr6.LIZ(IPrivacyDisclaimerUtil.class, false);
        if (LIZ != null) {
            return (IPrivacyDisclaimerUtil) LIZ;
        }
        if (C58096Mr6.LJJLIIIJLLLLLLLZ == null) {
            synchronized (IPrivacyDisclaimerUtil.class) {
                if (C58096Mr6.LJJLIIIJLLLLLLLZ == null) {
                    C58096Mr6.LJJLIIIJLLLLLLLZ = new PrivacyDisclaimerUtilService();
                }
            }
        }
        return C58096Mr6.LJJLIIIJLLLLLLLZ;
    }

    public static void LJII(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZIZ(new O0X(AGJ.VIDEO_GIFT.getValue(), str, true, true, 4), new C85687Xk3());
        }
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZ(VideoGiftEligibilityActivity context) {
        o.LJIIIZ(context, "context");
        if (C188517aZ.LIZ()) {
            LJII("terms-of-use");
            return;
        }
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        c81626W1u.LIZ = UZF.LIZIZ("terms-of-use");
        LJFF(c81626W1u.LIZ(context));
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZIZ(VideoGiftEligibilityActivity context) {
        o.LJIIIZ(context, "context");
        if (C188517aZ.LIZ()) {
            LJII("privacy-policy");
            return;
        }
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        c81626W1u.LIZ = UZF.LIZIZ("privacy-policy");
        LJFF(c81626W1u.LIZ(context));
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZLLL(Context context) {
        if (C188517aZ.LIZ()) {
            LJII("tiktok-series-sale-terms");
            return;
        }
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        c81626W1u.LIZ = "https://www.tiktok.com/legal/tiktok-series-sale-terms";
        LJFF(c81626W1u.LIZ(context));
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LJ(VideoGiftEligibilityActivity context) {
        o.LJIIIZ(context, "context");
        if (C188517aZ.LIZ()) {
            LJII("rewards-policy-eea");
            return;
        }
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        c81626W1u.LIZ = UZF.LIZIZ("rewards-policy-eea");
        LJFF(c81626W1u.LIZ(context));
    }

    @Override // com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil
    public final void LIZJ(Context context, TuxTextView tuxTextView, ACListenerS39S0200000_4 aCListenerS39S0200000_4, ACListenerS39S0200000_4 aCListenerS39S0200000_42, ACListenerS39S0200000_4 aCListenerS39S0200000_43) {
        o.LJIIIZ(context, "context");
        try {
            String string = context.getString(R.string.dua);
            String string2 = context.getString(R.string.du_);
            String string3 = context.getString(R.string.tpu);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.tps, string, string2, string3));
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, context);
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.d4, context);
            C85681Xjx c85681Xjx = new C85681Xjx(LJIIIIZZ, LJIIIIZZ2, aCListenerS39S0200000_4);
            C85682Xjy c85682Xjy = new C85682Xjy(LJIIIIZZ, LJIIIIZZ2, aCListenerS39S0200000_42);
            C85683Xjz c85683Xjz = new C85683Xjz(LJIIIIZZ, LJIIIIZZ2, aCListenerS39S0200000_43);
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int indexOf = lowerCase.indexOf(string.toLowerCase(Locale.getDefault()));
            int indexOf2 = lowerCase.indexOf(string2.toLowerCase(Locale.getDefault()));
            int indexOf3 = lowerCase.indexOf(string3.toLowerCase(Locale.getDefault()));
            if (indexOf < 0 || indexOf2 < 0 || indexOf3 < 0) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("enter_from", "login");
                Q13.LIZ(c198517qh.LJ());
            }
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(c85681Xjx, indexOf, string.length() + indexOf, 34);
                if (C188517aZ.LIZ()) {
                    C85837XmT.LJIIIIZZ(AGJ.VIDEO_GIFT.getValue(), "terms-of-use");
                }
            }
            if (indexOf2 >= 0) {
                spannableStringBuilder.setSpan(c85682Xjy, indexOf2, string2.length() + indexOf2, 34);
                if (C188517aZ.LIZ()) {
                    C85837XmT.LJIIIIZZ(AGJ.VIDEO_GIFT.getValue(), "privacy-policy");
                }
            }
            if (indexOf3 >= 0) {
                spannableStringBuilder.setSpan(c85683Xjz, indexOf3, string3.length() + indexOf3, 34);
                if (C188517aZ.LIZ()) {
                    C85837XmT.LJIIIIZZ(AGJ.VIDEO_GIFT.getValue(), "rewards-policy-eea");
                }
            }
            tuxTextView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(AnonymousClass894.LIZ());
        } catch (Exception unused) {
        }
    }
}
