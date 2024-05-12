package com.ss.android.ugc.aweme.compliance.consent.deviceconsent;

import X.AGI;
import X.AGJ;
import X.AR9;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C04270Et;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.O0X;
import X.SY4;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.IDCListenerS205S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes5.dex */
public final class PNSKrDeviceConsentUI extends UniversalPopupUI {
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 93));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 95));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 96));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 94));

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Al(SpannableStringBuilder spannableStringBuilder) {
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Gl(String iconUrl, String iconUrlDark) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(iconUrlDark, "iconUrlDark");
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Hl(String title) {
        o.LJIIIZ(title, "title");
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void xl(Map<String, String> map) {
    }

    public final void Ll() {
        int i;
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        View view = (View) this.LJLJJL.getValue();
        int i2 = 8;
        if (view != null) {
            CompoundButton compoundButton3 = (CompoundButton) this.LJLJL.getValue();
            if (compoundButton3 != null && compoundButton3.isChecked() && (compoundButton = (CompoundButton) this.LJLJLJ.getValue()) != null && compoundButton.isChecked()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        View view2 = (View) this.LJLJJLL.getValue();
        if (view2 == null) {
            return;
        }
        CompoundButton compoundButton4 = (CompoundButton) this.LJLJL.getValue();
        if (compoundButton4 == null || !compoundButton4.isChecked() || (compoundButton2 = (CompoundButton) this.LJLJLJ.getValue()) == null || !compoundButton2.isChecked()) {
            i2 = 0;
        }
        view2.setVisibility(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    public final void Jl(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZIZ(new O0X(AGJ.CONSENT_BOX_KR.getValue(), str, true, false, 20), new AR9());
        }
    }

    public final void Ml(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZ(new O0X(AGJ.CONSENT_BOX_KR.getValue(), str, false, false, 28));
        }
    }

    public final void Kl(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://webview?url=");
        LIZ.append(URLEncoder.encode(str, "UTF-8"));
        SmartRoute buildRoute = SmartRouter.buildRoute(this, X1D.LIZIZ(LIZ));
        buildRoute.withParam("title", str2);
        buildRoute.withParam("skip_consent", true);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = (View) this.LJLJJLL.getValue();
        if (view2 != null) {
            view2.setBackground(C04270Et.LIZIZ(requireActivity(), R.drawable.aki));
        }
        TextView textView = (TextView) this.LJLJJLL.getValue();
        if (textView != null) {
            Context context = getContext();
            if (context != null && (LJI = C79045V0n.LJI(R.attr.eb, context)) != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            textView.setTextColor(i);
        }
        SY4 sy4 = (SY4) this.LJLJJLL.getValue();
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 40));
        }
        Ll();
        CompoundButton compoundButton = (CompoundButton) this.LJLJL.getValue();
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(new IDCListenerS205S0100000_4(this, 3));
        }
        CompoundButton compoundButton2 = (CompoundButton) this.LJLJLJ.getValue();
        if (compoundButton2 != null) {
            compoundButton2.setOnCheckedChangeListener(new IDCListenerS205S0100000_4(this, 4));
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        View findViewById = view.findViewById(R.id.mn3);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_terms)");
        Il(requireActivity, (TuxTextView) findViewById, R.string.dua, R.string.dtv, new ACListenerS24S0100000_4(this, 41));
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        View findViewById2 = view.findViewById(R.id.met);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_privacy)");
        Il(requireActivity2, (TuxTextView) findViewById2, R.string.du_, R.string.dtu, new ACListenerS24S0100000_4(this, 42));
        if (AGI.LIZ()) {
            Ml("terms-of-use");
            Ml("privacy-policy");
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI
    public final void Dl(List list, Boolean bool, AqS169S0100000_3 aqS169S0100000_3) {
        SY4 sy4 = (SY4) this.LJLJJL.getValue();
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS39S0200000_4(aqS169S0100000_3, list, 118));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        inflater.getContext().setTheme(R.style.ul);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ag7, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public static void Il(ActivityC45651qj activityC45651qj, TuxTextView tuxTextView, int i, int i2, final View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activityC45651qj.getString(i2));
        String string = activityC45651qj.getString(i);
        o.LJIIIIZZ(string, "context.getString(clickStrId)");
        final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gu, activityC45651qj);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, string, 0, false, 6);
        try {
            spannableStringBuilder.setSpan(new ClickableSpan(LJIIIIZZ, onClickListener) { // from class: X.7aa
                public final int LJLIL;
                public final View.OnClickListener LJLILLLLZI;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                    View.OnClickListener onClickListener2 = this.LJLILLLLZI;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setColor(this.LJLIL);
                    T5S t5s = new T5S();
                    t5s.LIZ(82);
                    ds.setTypeface(t5s.getTypeface());
                    ds.setUnderlineText(false);
                }

                {
                    this.LJLIL = LJIIIIZZ;
                    this.LJLILLLLZI = onClickListener;
                }
            }, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
            tuxTextView.setHighlightColor(0);
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
