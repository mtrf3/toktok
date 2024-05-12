package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C16880lQ;
import X.C2068389v;
import X.C220858ld;
import X.C62819Ol5;
import X.C7MY;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageMuteAssem extends BaseFullPageAssem {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJI;
        Integer valueOf = Integer.valueOf(R.id.hzr);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.hzr)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Aweme aweme = A3().getAweme();
        if (aweme != null && C62819Ol5.LJIJJLI(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.hzr);
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.hzr);
        if (tuxIconView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = C7MY.LIZIZ(12);
            }
        } else {
            marginLayoutParams = null;
        }
        tuxIconView.setLayoutParams(marginLayoutParams);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 252));
        PostModeContainerViewModel v3 = v3();
        if ((v3 == null || !v3.LLIZLLLIL) && !C220858ld.LJII(A3().getAweme())) {
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        tuxIconView.setTuxIcon(c2068389v);
    }
}
