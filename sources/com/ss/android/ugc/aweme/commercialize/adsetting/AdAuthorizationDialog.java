package com.ss.android.ugc.aweme.commercialize.adsetting;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C17N;
import X.C25947AGh;
import X.InterfaceC25948AGi;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AdAuthorizationDialog extends AdBaseDialogFragment {
    public static final /* synthetic */ int LJLJLJ = 0;
    public InterfaceC25948AGi LJLJI;
    public long LJLJJL;
    public long LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public String LJLILLLLZI = "";
    public long LJLJJI = 30;

    public static int vl(long j) {
        if (j == 7) {
            return 0;
        }
        if (j == 30) {
            return 1;
        }
        if (j == 60) {
            return 2;
        }
        return j == 365 ? 3 : -1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.AdBaseDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.AdBaseDialogFragment
    public final int getLayoutRes() {
        return R.layout.am1;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.AdBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.adsetting.AdBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(R.id.mo6)).setText(this.LJLILLLLZI);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (this.LJLJJL != 0) {
            _$_findCachedViewById(R.id.mc1).setVisibility(0);
            long j = (this.LJLJJI * 24 * 60 * 60) + this.LJLJJLL;
            TextView textView = (TextView) _$_findCachedViewById(R.id.mc1);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getResources().getString(R.string.bw6));
            LIZ.append(":\n");
            LIZ.append(simpleDateFormat.format(Long.valueOf(this.LJLJJL * 1000)));
            LIZ.append(" - ");
            LIZ.append(simpleDateFormat.format(new Date(j * 1000)));
            textView.setText(X1D.LIZIZ(LIZ));
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.m05), new ACListenerS24S0100000_4(this, 24));
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.lyy), new ACListenerS24S0100000_4(this, 25));
            ((TextView) _$_findCachedViewById(R.id.m05)).setText(getResources().getString(R.string.pjh));
            ((TextView) _$_findCachedViewById(R.id.lyy)).setText(getResources().getString(R.string.qxz));
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.lyy);
            Context context = _$_findCachedViewById(R.id.lyy).getContext();
            o.LJIIIIZZ(context, "tv_ad_terms_of_service.context");
            textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
            ((TextView) _$_findCachedViewById(R.id.lyy)).setGravity(17);
            View tv_authorize = _$_findCachedViewById(R.id.m05);
            o.LJIIIIZZ(tv_authorize, "tv_authorize");
            wl(C17N.LJIILL(6.0d), tv_authorize);
            View tv_ad_terms_of_service = _$_findCachedViewById(R.id.lyy);
            o.LJIIIIZZ(tv_ad_terms_of_service, "tv_ad_terms_of_service");
            wl(C17N.LJIILL(12.0d), tv_ad_terms_of_service);
        } else {
            _$_findCachedViewById(R.id.mc1).setVisibility(8);
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.m05), new ACListenerS24S0100000_4(this, 26));
            ((TextView) _$_findCachedViewById(R.id.m05)).setText(getResources().getString(R.string.bvp));
            ((TextView) _$_findCachedViewById(R.id.lyy)).setText(getResources().getString(R.string.egw));
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.lyy);
            Context context2 = _$_findCachedViewById(R.id.lyy).getContext();
            o.LJIIIIZZ(context2, "tv_ad_terms_of_service.context");
            textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context2));
            ((TextView) _$_findCachedViewById(R.id.lyy)).setGravity(8388611);
            View tv_authorize2 = _$_findCachedViewById(R.id.m05);
            o.LJIIIIZZ(tv_authorize2, "tv_authorize");
            wl(C17N.LJIILL(16.0d), tv_authorize2);
            View tv_ad_terms_of_service2 = _$_findCachedViewById(R.id.lyy);
            o.LJIIIIZZ(tv_ad_terms_of_service2, "tv_ad_terms_of_service");
            wl(C17N.LJIILL(16.0d), tv_ad_terms_of_service2);
        }
        ((RadioGroup) _$_findCachedViewById(R.id.j1p)).setOnCheckedChangeListener(new C25947AGh(this, simpleDateFormat));
        C16880lQ.LJIILLIIL((ImageView) view.findViewById(R.id.f0h), new ACListenerS24S0100000_4(this, 27));
    }

    public final void wl(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
