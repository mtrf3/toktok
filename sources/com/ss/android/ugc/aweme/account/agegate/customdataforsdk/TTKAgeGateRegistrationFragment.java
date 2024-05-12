package com.ss.android.ugc.aweme.account.agegate.customdataforsdk;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C141415gn;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C235929Ns;
import X.C252709vu;
import X.C26045AKb;
import X.C26227ARb;
import X.C29S;
import X.C36222EJm;
import X.C3C5;
import X.C62822Ol8;
import X.C74090T5y;
import X.C76800UCe;
import X.C77123UOp;
import X.C78454Uqg;
import X.C78455Uqh;
import X.C79045V0n;
import X.C81108VsO;
import X.C85990Xow;
import X.C86057Xq1;
import X.C86059Xq3;
import X.C86083XqR;
import X.C86087XqV;
import X.C90903hW;
import X.C9KF;
import X.EnumC86062Xq6;
import X.EnumC86081XqP;
import X.EnumC86082XqQ;
import X.EnumC86085XqT;
import X.EnumC86086XqU;
import X.FMX;
import X.G50;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OJD;
import X.ORZ;
import X.SY4;
import X.T5S;
import X.T5U;
import X.UC0;
import X.ViewOnClickListenerC78453Uqf;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import Y.IDCSpanS5S0200000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSHyperlink;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.ss.android.ugc.aweme.services.AgeGateSdkRegistrationFlow;
import com.ss.android.ugc.aweme.setting.services.LanguageService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS60S0400000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public class TTKAgeGateRegistrationFragment extends PNSAgeGateBaseFragment {
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final Map<String, String> LJLIL = C113554cx.LJJLIL(RegistrationAgeGateServiceImpl.LIZJ);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C78455Uqh.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 237));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new C78454Uqg(this));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 238));

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final int Ol() {
        return ((Number) this.LJLJI.getValue()).intValue();
    }

    public final TTKCustomViewModel Pl() {
        return (TTKCustomViewModel) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final LiveData Al() {
        return Pl().LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Gl() {
        _$_findCachedViewById(R.id.hbe).setVisibility(0);
    }

    public void Vl() {
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.yr);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS35S0100000_15(this, 16));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(this.LJLIL);
        DateFormat dateInstance = DateFormat.getDateInstance(3, new Locale(LanguageService.LIZ().getAppLanguage(), C85990Xow.LIZ()));
        o.LJII(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String pattern = ((SimpleDateFormat) dateInstance).toLocalizedPattern();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        o.LJIIIIZZ(pattern, "pattern");
        Locale locale = Locale.ROOT;
        String LIZIZ = C141415gn.LIZIZ(locale, "ROOT", pattern, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = LIZIZ.length();
        for (int i = 0; i < length; i++) {
            char charAt = LIZIZ.charAt(i);
            if (!hashSet.contains(Character.valueOf(charAt))) {
                if (charAt == 'y') {
                    arrayList.add("yyyy");
                } else if (charAt == 'm') {
                    arrayList.add("mm");
                } else if (charAt == 'd') {
                    arrayList.add("dd");
                }
                hashSet.add(Character.valueOf(charAt));
            }
        }
        c188727au.LJIIIZ("default_format", ORZ.LLD(arrayList, "", null, null, null, 62));
        c188727au.LIZLLL(this.LJLJJL, "day");
        c188727au.LIZLLL(this.LJLJJLL, "month");
        c188727au.LIZLLL(this.LJLJL, "year");
        c188727au.LIZLLL(Math.max(this.LJLJJL, Math.max(this.LJLJJLL, this.LJLJL)), "selected_cnt");
        c188727au.LIZLLL(this.LJLJLJ ? 1 : 0, "is_submit");
        FMX.LJIIL("age_scroll_result", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (Ol() != AgeGateSdkRegistrationFlow.SIGN_UP.getFlow()) {
            G50.LIZ("background");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            KeyboardUtils.LJ(16, 240, mo49getActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public MutableLiveData<C76800UCe> wl() {
        return Pl().LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final LiveData<Date> xl() {
        return Pl().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public void Dl(C86057Xq1 c86057Xq1) {
        PNSNavButton pNSNavButton;
        EditText editText;
        if (c86057Xq1 == null) {
            return;
        }
        Tl(c86057Xq1);
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
        int i = 0;
        _$_findCachedViewById(R.id.ys).setVisibility(0);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ys);
        C235119Kp c235119Kp = new C235119Kp();
        boolean z = true;
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
        } else if (ujb.o.LJJJJJL(imageUrl)) {
            ((ImageView) _$_findCachedViewById(R.id.yo)).setVisibility(8);
        } else if (!ujb.o.LJJJJJL(imageUrl)) {
            W5F LJFF = W5U.LJFF(UriProtector.parse(imageUrl));
            LJFF.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.yo);
            C16880lQ.LLJJJ(LJFF);
            ((ImageView) _$_findCachedViewById(R.id.yo)).setVisibility(0);
        }
        String inputPlaceHolder = c86057Xq1.getInputPlaceHolder();
        C74090T5y c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.yn);
        if (c74090T5y != null && (editText = c74090T5y.getEditText()) != null) {
            editText.setHint(inputPlaceHolder);
            editText.setInputType(0);
            editText.setTypeface(Typeface.DEFAULT);
            editText.setEnabled(true);
        }
        Date defaultDate = c86057Xq1.getDefaultDate();
        if (defaultDate == null) {
            defaultDate = new Date();
        }
        C81108VsO c81108VsO = (C81108VsO) _$_findCachedViewById(R.id.ym);
        c81108VsO.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        if (calendar.getTime().before(defaultDate)) {
            calendar = Calendar.getInstance();
            calendar.set(defaultDate.getYear() + 1900, 11, 31);
        }
        c81108VsO.setNonRecurrentForYear(true);
        c81108VsO.LIZJ(defaultDate);
        c81108VsO.setUpperBoundDate(calendar);
        Date upperBound = c86057Xq1.getUpperBound();
        if (upperBound == null) {
            upperBound = new Date();
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(upperBound);
        ((C81108VsO) _$_findCachedViewById(R.id.ym)).setUpperBoundDate(calendar2);
        if (c86057Xq1.getIndicatorType() != EnumC86081XqP.DISPLAY) {
            z = false;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.yq);
        if (_$_findCachedViewById == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Hl(String str) {
        ((TextView) _$_findCachedViewById(R.id.yq)).setText(str);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public void Il(String str) {
        C74090T5y c74090T5y;
        if (str != null && (c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.yn)) != null) {
            c74090T5y.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Jl(boolean z) {
        ((SY4) _$_findCachedViewById(R.id.yr)).setEnabled(z);
        if (z) {
            _$_findCachedViewById(R.id.yu).setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void Kl(boolean z) {
        ((SY4) _$_findCachedViewById(R.id.yr)).setLoading(z);
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
            switch (C86083XqR.LIZ[type.ordinal()]) {
                case 1:
                    return new C235929Ns();
                case 2:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS165S0100000_15(this, 47));
                case 3:
                    return Ml(R.raw.icon_x_mark, new AqS165S0100000_15(this, 48));
                case 4:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS162S0200000_15(this, pNSNavButton, 6));
                case 5:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS162S0200000_15(this, pNSNavButton, 7));
                case 6:
                    return Ml(R.raw.icon_arrow_left_ltr, new AqS162S0200000_15(this, pNSNavButton, 8));
            }
        }
        return new C235929Ns();
    }

    public final void Ql(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(this.LJLIL);
        c188727au.LJIIIZ("enter_method", "quit_confirmation");
        c188727au.LJIIIZ("result", str);
        FMX.LJIIL("confirmation_pop_up_response", c188727au.LIZ);
    }

    public final void Sl(String str) {
        ((TextView) _$_findCachedViewById(R.id.yl)).setText(str);
        _$_findCachedViewById(R.id.yl).setVisibility(0);
    }

    public void Tl(C86057Xq1 c86057Xq1) {
        String str;
        boolean z;
        String str2;
        String contentDesc;
        String str3;
        List<PNSHyperlink> list;
        String str4 = null;
        if (c86057Xq1 != null) {
            str = c86057Xq1.getTitle();
        } else {
            str = null;
        }
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.yl).setVisibility(8);
        } else {
            if (c86057Xq1 != null) {
                str2 = c86057Xq1.getTitle();
            } else {
                str2 = null;
            }
            Sl(str2);
        }
        if (c86057Xq1 == null || (contentDesc = c86057Xq1.getContentDesc()) == null || ujb.o.LJJJJJL(contentDesc)) {
            _$_findCachedViewById(R.id.yk).setVisibility(8);
        } else {
            if (c86057Xq1 != null) {
                str3 = c86057Xq1.getContentDesc();
                list = c86057Xq1.getHyperLinks();
            } else {
                str3 = null;
                list = null;
            }
            Rl(str3, list);
        }
        if (c86057Xq1 != null) {
            str4 = c86057Xq1.getNextBtnText();
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.yr);
        if (textView == null) {
            return;
        }
        textView.setText(str4);
    }

    public final C234529Ii Ml(int i, InterfaceC65784Pro interfaceC65784Pro) {
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = i;
        LIZJ.LJI = true;
        LIZJ.LIZIZ(new AqS160S0100000_10(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 616));
        return LIZJ;
    }

    public final void Rl(String str, List<PNSHyperlink> list) {
        int i;
        int i2;
        ((TextView) _$_findCachedViewById(R.id.yk)).setText(str);
        _$_findCachedViewById(R.id.yk).setVisibility(0);
        TextView textView = (TextView) _$_findCachedViewById(R.id.yk);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Integer LJI = C79045V0n.LJI(R.attr.gu, requireContext);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        textView.setTextColor(i);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.yk);
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        Integer LJI2 = C79045V0n.LJI(R.attr.ca, requireContext2);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        textView2.setHighlightColor(i2);
        if (list == null || list.isEmpty()) {
            return;
        }
        ((TextView) _$_findCachedViewById(R.id.yk)).setText(Wl(((AppCompatTextView) _$_findCachedViewById(R.id.yk)).getText().toString(), list));
        ((TextView) _$_findCachedViewById(R.id.yk)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final SpannableStringBuilder Wl(String str, List list) {
        String str2;
        Spanned fromHtml;
        int i;
        if (str != null) {
            str2 = ujb.o.LJJJJZ(str, "\n", "<br>", false);
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
        o.LJIIIIZZ(spans, "getSpans(0, length, URLSpan::class.java)");
        for (Object obj : spans) {
            URLSpan uRLSpan = (URLSpan) obj;
            valueOf.setSpan(new IDCSpanS5S0200000_13(this, uRLSpan, 3), valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), 17);
            valueOf.setSpan(new T5U(42, false), valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), 18);
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
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

    public final void Xl(String str, boolean z) {
        int i;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.yt);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Integer LJI = C79045V0n.LJI(R.attr.a4k, requireContext);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        _$_findCachedViewById(R.id.yu).setVisibility(0);
        ((TextView) _$_findCachedViewById(R.id.yp)).setText(str);
        if (z) {
            View ageGateWarningLayout = _$_findCachedViewById(R.id.yu);
            o.LJIIIIZZ(ageGateWarningLayout, "ageGateWarningLayout");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.playSequentially(ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, -C17N.LJIILL(6.0d)).setDuration(80L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", -C17N.LJIILL(6.0d), 0.0f).setDuration(80L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, C17N.LJIILL(4.0d)).setDuration(60L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", C17N.LJIILL(4.0d), 0.0f).setDuration(60L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, -C17N.LJIILL(2.0d)).setDuration(40L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", -C17N.LJIILL(2.0d), 0.0f).setDuration(40L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, C17N.LJIILL(1.0d)).setDuration(20L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", C17N.LJIILL(1.0d), 0.0f).setDuration(20L));
            animatorSet.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("platform");
        } else {
            str = null;
        }
        if (o.LJ(str, "google_onetap")) {
            InterfaceC88472Yns<? super ViewGroup, C76800UCe> interfaceC88472Yns = RegistrationAgeGateServiceImpl.LIZIZ;
            View ageGateBottomView = _$_findCachedViewById(R.id.yj);
            o.LJIIIIZZ(ageGateBottomView, "ageGateBottomView");
            interfaceC88472Yns.invoke(ageGateBottomView);
        }
        Vl();
        C81108VsO c81108VsO = (C81108VsO) _$_findCachedViewById(R.id.ym);
        if (c81108VsO != null) {
            c81108VsO.LJLJL = new C86059Xq3(this);
        }
        int Ol = Ol();
        AgeGateSdkRegistrationFlow ageGateSdkRegistrationFlow = AgeGateSdkRegistrationFlow.SIGN_UP;
        if (Ol != ageGateSdkRegistrationFlow.getFlow()) {
            int i = ((Keva) this.LJLILLLLZI.getValue()).getInt("times_shown", 0) + 1;
            ((Keva) this.LJLILLLLZI.getValue()).storeInt("times_shown", i);
            this.LJLIL.put("times_of_appearance", String.valueOf(i));
        }
        if (((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            str2 = "f_age_gate_registration_show";
        } else {
            str2 = "age_gate_registration_show";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(this.LJLIL);
        C36222EJm.LIZ(c188727au);
        FMX.LJIIL(str2, c188727au.LIZ);
        if (Ol() != ageGateSdkRegistrationFlow.getFlow()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            String string = mo49getActivity.getString(R.string.dq8);
            o.LJIIIIZZ(string, "nonNullActivity.getStrin…gistration_panel_entry_2)");
            String string2 = mo49getActivity.getString(R.string.dq7, string);
            o.LJIIIIZZ(string2, "nonNullActivity.getStrin…nel_entry_1, loginString)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
            if (LJJLIIIJL >= 0) {
                Integer LJI = C79045V0n.LJI(R.attr.eb, mo49getActivity);
                if (LJI == null) {
                    return;
                }
                final int intValue = LJI.intValue();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(intValue) { // from class: com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment$setupLoginView$1
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        o.LJIIIZ(textPaint, "textPaint");
                        super.updateDrawState(textPaint);
                        T5S t5s = new T5S();
                        t5s.LIZ(82);
                        textPaint.setTypeface(t5s.getTypeface());
                    }
                }, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
            }
            ((TextView) _$_findCachedViewById(R.id.g9z)).setText(spannableStringBuilder);
            _$_findCachedViewById(R.id.g9z).setVisibility(0);
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.g9z), new ViewOnClickListenerC78453Uqf(this));
            return;
        }
        _$_findCachedViewById(R.id.g9z).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment
    public final void vl(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> action) {
        PNSDialogModel pNSDialogModel;
        CharSequence message;
        PNSErrorModel errorModel;
        String errorMessage;
        o.LJIIIZ(action, "action");
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
            o.LJIIIIZZ(requireContext, "requireContext()");
            C26227ARb c26227ARb = new C26227ARb(requireContext);
            String title = pNSDialogModel.getTitle();
            if (title == null) {
                title = "";
            }
            c26227ARb.LJFF(title);
            if (pNSDialogModel.getHyperLinks() != null) {
                message = Wl(pNSDialogModel.getMessage(), pNSDialogModel.getHyperLinks());
            } else {
                message = pNSDialogModel.getMessage();
            }
            c26227ARb.LIZIZ(message);
            c26227ARb.LJII = pNSDialogModel.getCancellable();
            Integer style = pNSDialogModel.getStyle();
            int value = EnumC86062Xq6.ACTION.getValue();
            if (style == null || style.intValue() != value) {
                C77123UOp.LJIILL(c26227ARb, new AqS119S0300000_15(pNSDialogModel, (PNSDialogModel) this, (TTKAgeGateRegistrationFragment) action, (InterfaceC65784Pro<C76800UCe>) 13));
            } else {
                UC0.LIZJ(c26227ARb, new AqS60S0400000_15(pNSDialogModel, (PNSDialogModel) this, (TTKAgeGateRegistrationFragment) action, (InterfaceC65784Pro<C76800UCe>) num, (Integer) 6));
            }
            c26227ARb.LJII = pNSDialogModel.getCancellable();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIIZZ(this.LJLIL);
            c188727au.LJFF(num, "type");
            FMX.LJIIL("age_gate_popup_show", c188727au.LIZ);
            c26227ARb.LJI().LIZLLL();
        }
        if (pNSFeedbackModel != null && (errorModel = pNSFeedbackModel.getErrorModel()) != null) {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIIZZ(this.LJLIL);
            Integer errorType = errorModel.getErrorType();
            if (errorType != null) {
                errorType.intValue();
                c188727au2.LJFF(pNSFeedbackModel.getCase(), "type");
            }
            FMX.LJIIL("age_gate_response_error_show", c188727au2.LIZ);
            Integer errorType2 = errorModel.getErrorType();
            if (errorType2 != null) {
                int intValue = errorType2.intValue();
                EnumC86086XqU.Companion.getClass();
                int i = C86083XqR.LIZIZ[C86087XqV.LIZ(intValue).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 || (errorMessage = errorModel.getErrorMessage()) == null) {
                            return;
                        }
                        C26045AKb c26045AKb = new C26045AKb(this);
                        if (errorMessage.length() == 0) {
                            errorMessage = getString(R.string.img);
                            o.LJIIIIZZ(errorMessage, "getString(R.string.network_unavailable)");
                        }
                        c26045AKb.LJIIIZ(errorMessage);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    Xl(errorModel.getErrorMessage(), false);
                    return;
                }
                Xl(errorModel.getErrorMessage(), true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        inflater.getContext().setTheme(R.style.ul);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rg, viewGroup, false);
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
