package com.ss.android.ugc.aweme.compliance.business.agegate.view;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C235929Ns;
import X.C252709vu;
import X.C26045AKb;
import X.C26227ARb;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C62978One;
import X.C62979Onf;
import X.C76800UCe;
import X.C77123UOp;
import X.C79045V0n;
import X.C86057Xq1;
import X.C86084XqS;
import X.C86087XqV;
import X.C90903hW;
import X.C9KF;
import X.EnumC86062Xq6;
import X.EnumC86081XqP;
import X.EnumC86082XqQ;
import X.EnumC86085XqT;
import X.EnumC86086XqU;
import X.InterfaceC65784Pro;
import X.OJD;
import X.OPZ;
import X.T5U;
import X.UC0;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.IDCSpanS4S0200000_10;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS60S0400000_15;
import ujb.o;

/* loaded from: classes16.dex */
public final class AgeGateFragment extends PNSAgeGateBaseFragment {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 57));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C62978One.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C62979Onf.LJLIL);

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Gl() {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Map<String, String> Ol() {
        return (Map) this.LJLILLLLZI.getValue();
    }

    public final AgeGateBaseLowerFragment Pl() {
        return (AgeGateBaseLowerFragment) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final LiveData<Boolean> Al() {
        return Pl().xl();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Window window = mo49getActivity.getWindow();
            int i = window.getAttributes().softInputMode;
            if ((i & 240) == 16) {
                return;
            }
            window.setSoftInputMode((i & (-241)) ^ 16);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final MutableLiveData<C76800UCe> wl() {
        return Pl().vl();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final LiveData<Date> xl() {
        return Pl().wl();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Dl(C86057Xq1 c86057Xq1) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        PNSNavButton pNSNavButton;
        if (c86057Xq1 == null) {
            return;
        }
        String title = c86057Xq1.getTitle();
        boolean z3 = true;
        if (title == null || o.LJJJJJL(title)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.yl).setVisibility(8);
        } else {
            ((TextView) _$_findCachedViewById(R.id.yl)).setText(c86057Xq1.getTitle());
            _$_findCachedViewById(R.id.yl).setVisibility(0);
        }
        String contentDesc = c86057Xq1.getContentDesc();
        if (contentDesc == null || o.LJJJJJL(contentDesc)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            _$_findCachedViewById(R.id.yk).setVisibility(8);
        } else {
            String contentDesc2 = c86057Xq1.getContentDesc();
            List<PNSHyperlink> hyperLinks = c86057Xq1.getHyperLinks();
            ((TextView) _$_findCachedViewById(R.id.yk)).setText(contentDesc2);
            _$_findCachedViewById(R.id.yk).setVisibility(0);
            TextView textView = (TextView) _$_findCachedViewById(R.id.yk);
            Context requireContext = requireContext();
            kotlin.jvm.internal.o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.gu, requireContext);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            textView.setTextColor(i);
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.yk);
            Context requireContext2 = requireContext();
            kotlin.jvm.internal.o.LJIIIIZZ(requireContext2, "requireContext()");
            Integer LJI2 = C79045V0n.LJI(R.attr.ca, requireContext2);
            if (LJI2 != null) {
                i2 = LJI2.intValue();
            } else {
                i2 = 0;
            }
            textView2.setHighlightColor(i2);
            if (hyperLinks != null && !hyperLinks.isEmpty()) {
                ((TextView) _$_findCachedViewById(R.id.yk)).setText(Ql(((AppCompatTextView) _$_findCachedViewById(R.id.yk)).getText().toString(), hyperLinks));
                ((TextView) _$_findCachedViewById(R.id.yk)).setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        List<PNSNavButton> navButtons = c86057Xq1.getNavButtons();
        String header = c86057Xq1.getHeader();
        PNSNavButton pNSNavButton2 = null;
        if (navButtons != null) {
            pNSNavButton = null;
            for (PNSNavButton pNSNavButton3 : navButtons) {
                if (pNSNavButton3.getPosition() == EnumC86082XqQ.LEFT) {
                    pNSNavButton2 = pNSNavButton3;
                } else if (pNSNavButton3.getPosition() == EnumC86082XqQ.RIGHT) {
                    pNSNavButton = pNSNavButton3;
                }
            }
        } else {
            pNSNavButton = null;
        }
        _$_findCachedViewById(R.id.ys).setVisibility(0);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ys);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{Nl(pNSNavButton2)});
        if (header == null) {
            header = "";
        }
        LIZLLL.LIZJ = header;
        c235119Kp.LIZJ = LIZLLL;
        c235119Kp.LIZIZ(Nl(pNSNavButton));
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        String imageUrl = c86057Xq1.getImageUrl();
        if (imageUrl == null) {
            W5F LJ = W5U.LJ(R.drawable.akk);
            LJ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.yo);
            C16880lQ.LLJJJ(LJ);
        } else if (o.LJJJJJL(imageUrl)) {
            ((ImageView) _$_findCachedViewById(R.id.yo)).setVisibility(8);
        } else if (!o.LJJJJJL(imageUrl)) {
            W5F LJFF = W5U.LJFF(UriProtector.parse(imageUrl));
            LJFF.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.yo);
            C16880lQ.LLJJJ(LJFF);
            ((ImageView) _$_findCachedViewById(R.id.yo)).setVisibility(0);
        }
        Pl().Ll(c86057Xq1.getNextBtnText());
        Pl().Il(c86057Xq1.getInputPlaceHolder());
        Date defaultDate = c86057Xq1.getDefaultDate();
        if (defaultDate == null) {
            defaultDate = new Date();
        }
        Pl().Gl(defaultDate);
        Date upperBound = c86057Xq1.getUpperBound();
        if (upperBound == null) {
            upperBound = new Date();
        }
        Pl().Ml(upperBound);
        if (c86057Xq1.getIndicatorType() != EnumC86081XqP.DISPLAY) {
            z3 = false;
        }
        Pl().Al(z3);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Hl(String str) {
        Pl().Dl(str);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Il(String str) {
        Pl().Hl(str);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Jl(boolean z) {
        Pl().Jl(z);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Kl(boolean z) {
        Pl().Kl(z);
    }

    public final void Ll(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        SmartRouter.buildRoute(getContext(), str).open();
    }

    public final AbstractC234519Ih Nl(PNSNavButton pNSNavButton) {
        EnumC86085XqT type;
        if (pNSNavButton != null && (type = pNSNavButton.getType()) != null) {
            switch (C86084XqS.LIZ[type.ordinal()]) {
                case 1:
                    return new C235929Ns();
                case 2:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS165S0100000_15(this, 231));
                case 3:
                    return Ml(R.raw.icon_x_mark, new AqS165S0100000_15(this, 232));
                case 4:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS162S0200000_15(this, pNSNavButton, 12));
                case 5:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS162S0200000_15(this, pNSNavButton, 13));
                case 6:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS162S0200000_15(this, pNSNavButton, 14));
            }
        }
        return new C235929Ns();
    }

    public final C234529Ii Ml(int i, InterfaceC65784Pro interfaceC65784Pro) {
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = i;
        LIZJ.LJI = true;
        LIZJ.LIZIZ(new AqS160S0100000_10(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 472));
        return LIZJ;
    }

    public final SpannableStringBuilder Ql(String str, List list) {
        String str2;
        Spanned fromHtml;
        int i;
        if (str != null) {
            str2 = o.LJJJJZ(str, "\n", "<br>", false);
        } else {
            str2 = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PNSHyperlink pNSHyperlink = (PNSHyperlink) it.next();
                if (str2 != null) {
                    String ageGateHyperlinkText = pNSHyperlink.getAgeGateHyperlinkText();
                    if (ageGateHyperlinkText == null) {
                        ageGateHyperlinkText = "";
                    }
                    OJD ojd = new OJD(ageGateHyperlinkText);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("<a href=\"");
                    LIZ.append(pNSHyperlink.getAgeGateHyperlinkAction());
                    LIZ.append("\">");
                    LIZ.append(pNSHyperlink.getAgeGateHyperlinkText());
                    LIZ.append("</a>");
                    str2 = ojd.replace(str2, X1D.LIZIZ(LIZ));
                } else {
                    str2 = null;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str2, 63);
        } else {
            fromHtml = Html.fromHtml(str2);
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(fromHtml);
        Object[] spans = valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        kotlin.jvm.internal.o.LJIIIIZZ(spans, "getSpans(0, length, URLSpan::class.java)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            valueOf.setSpan(new IDCSpanS4S0200000_10(this, uRLSpan, 1), valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), 17);
            valueOf.setSpan(new T5U(42, false), valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), 18);
            Context requireContext = requireContext();
            kotlin.jvm.internal.o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.go, requireContext);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            valueOf.setSpan(new ForegroundColorSpan(i), valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), 18);
        }
        return valueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LIZIZ(R.id.gag, Pl());
        c1b3.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void vl(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> action) {
        PNSDialogModel pNSDialogModel;
        CharSequence message;
        PNSErrorModel errorModel;
        String errorMessage;
        kotlin.jvm.internal.o.LJIIIZ(action, "action");
        Integer num = null;
        if (pNSFeedbackModel != null) {
            pNSDialogModel = pNSFeedbackModel.getDialogModel();
            num = pNSFeedbackModel.getCase();
        } else {
            pNSDialogModel = null;
        }
        if (pNSDialogModel == null) {
            action.invoke();
        } else {
            Context requireContext = requireContext();
            kotlin.jvm.internal.o.LJIIIIZZ(requireContext, "requireContext()");
            C26227ARb c26227ARb = new C26227ARb(requireContext);
            String title = pNSDialogModel.getTitle();
            if (title == null) {
                title = "";
            }
            c26227ARb.LJFF(title);
            if (pNSDialogModel.getHyperLinks() != null) {
                message = Ql(pNSDialogModel.getMessage(), pNSDialogModel.getHyperLinks());
            } else {
                message = pNSDialogModel.getMessage();
            }
            c26227ARb.LIZIZ(message);
            c26227ARb.LJII = pNSDialogModel.getCancellable();
            Integer style = pNSDialogModel.getStyle();
            int value = EnumC86062Xq6.ACTION.getValue();
            if (style == null || style.intValue() != value) {
                C77123UOp.LJIILL(c26227ARb, new AqS119S0300000_15(pNSDialogModel, (PNSDialogModel) this, (AgeGateFragment) action, (InterfaceC65784Pro<C76800UCe>) 7));
            } else {
                UC0.LIZJ(c26227ARb, new AqS60S0400000_15(pNSDialogModel, (PNSDialogModel) this, (AgeGateFragment) action, (InterfaceC65784Pro<C76800UCe>) num, (Integer) 5));
            }
            c26227ARb.LJII = pNSDialogModel.getCancellable();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", String.valueOf(num));
            OPZ.LJ("age_gate_popup_show", linkedHashMap, Ol());
            c26227ARb.LJI().LIZLLL();
        }
        if (pNSFeedbackModel != null && (errorModel = pNSFeedbackModel.getErrorModel()) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Integer errorType = errorModel.getErrorType();
            if (errorType != null) {
                errorType.intValue();
                linkedHashMap2.put("type", String.valueOf(pNSFeedbackModel.getCase()));
            }
            OPZ.LJ("age_gate_response_error_show", linkedHashMap2, Ol());
            Integer errorType2 = errorModel.getErrorType();
            if (errorType2 != null) {
                int intValue = errorType2.intValue();
                EnumC86086XqU.Companion.getClass();
                int i = C86084XqS.LIZIZ[C86087XqV.LIZ(intValue).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 || (errorMessage = errorModel.getErrorMessage()) == null) {
                            return;
                        }
                        C26045AKb c26045AKb = new C26045AKb(this);
                        if (errorMessage.length() == 0) {
                            errorMessage = getString(R.string.img);
                            kotlin.jvm.internal.o.LJIIIIZZ(errorMessage, "getString(R.string.network_unavailable)");
                        }
                        c26045AKb.LJIIIZ(errorMessage);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    Pl().Nl(errorModel.getErrorMessage(), false);
                    return;
                }
                Pl().Nl(errorModel.getErrorMessage(), true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agh, viewGroup, false);
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
}
