package com.ss.android.ugc.aweme.setting.ui.beta;

import X.AI8;
import X.AID;
import X.AIM;
import X.AIN;
import X.AnonymousClass898;
import X.C16360ka;
import X.C16700l8;
import X.C16720lA;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C32151Nz;
import X.C47261Igj;
import X.C5H3;
import X.EnumC221088m0;
import X.FMX;
import X.InterfaceC61213O0r;
import X.O6R;
import X.OSZ;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class BetaExplainPage extends BasePage {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLJI = C221108m2.LIZ(EnumC221088m0.NONE, new AqS153S0100000_3(this, 857));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cju;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = requireActivity().getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            C16720lA.LIZ(window, false);
        } else {
            C16700l8.LIZ(window, false);
        }
        window.setStatusBarColor(0);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16360ka.LJIJJ(view.findViewById(R.id.n_p), AIN.LIZ);
        ((TuxTextView) view.findViewById(R.id.title)).LJJJ(30.0f);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gwg);
        c252709vu.LJIILJJIL(false);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 816));
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZJ(0);
        c252709vu.setNavActions(c235119Kp);
        Context context = view.getContext();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.b86);
        viewGroup.removeAllViews();
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        int i = 0;
        for (Object obj : (List) this.LJLJI.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                OSZ osz = (OSZ) obj;
                o.LJIIIIZZ(context, "context");
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setText((CharSequence) osz.getSecond());
                tuxTextView.setPadding(LJJIIZ, 0, LJJIIZ, LJJIIZ);
                if (osz.getSecond() instanceof Spanned) {
                    tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
                }
                AI8 ai8 = new AI8(context, null, 6);
                ai8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                String string = getString(((Number) osz.getFirst()).intValue());
                o.LJIIIIZZ(string, "getString(pair.first)");
                ai8.setTitle(string);
                AID aid = new AID(context, tuxTextView, null);
                aid.LIZLLL = new AIM(i);
                ai8.setAccessory(aid);
                viewGroup.addView(ai8);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        FMX.onEventV3("tiktok_beta_FAQ_page_show");
    }
}
