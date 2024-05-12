package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C57105Mb7;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPagePostTimeAssem extends BaseFullPageAssem {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        long j;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.hzo));
        Long l = null;
        if (view2 == null) {
            View containerView = getContainerView();
            if (containerView != null && (view2 = containerView.findViewById(R.id.hzo)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.hzo), view2);
            } else {
                view2 = null;
            }
        }
        TextView textView = (TextView) view2;
        if (textView != null) {
            textView.setVisibility(0);
            Aweme aweme = A3().getAweme();
            if (aweme != null) {
                l = Long.valueOf(aweme.getCreateTime());
            }
            Context context = textView.getContext();
            if (l != null) {
                j = l.longValue() * 1000;
            } else {
                j = 0;
            }
            textView.setText(C57105Mb7.LIZJ(j, context));
            textView.setGravity(8388611);
        }
    }
}
