package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C57434MgQ;
import X.C84B;
import X.C8YN;
import X.TBT;
import X.V16;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageDotIndicatorAssem extends BaseFullPageAssem {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner LIZIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContext();
        if (context == null || (LIZIZ = C57434MgQ.LIZIZ(context)) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.hos));
        if (view2 == null) {
            View containerView = getContainerView();
            if (containerView != null && (view2 = containerView.findViewById(R.id.hos)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.hos), view2);
            } else {
                view2 = null;
            }
        }
        C84B c84b = (C84B) view2;
        if (c84b == null) {
            return;
        }
        int i = 0;
        c84b.setVisibility(0);
        c84b.LJLJLJ = true;
        c84b.setLifecycleOwner(LIZIZ);
        Aweme aweme = A3().getAweme();
        if (aweme != null) {
            i = V16.LJJIFFI(aweme);
        }
        c84b.setCount(i);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.7Oe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C203127y8) obj).LJLIL);
            }
        }, null, new AqS185S0100000_3(c84b, 206), 6);
    }
}
