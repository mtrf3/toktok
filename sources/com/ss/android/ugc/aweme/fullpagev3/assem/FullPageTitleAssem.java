package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C118824lS;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageTitleAssem extends BaseFullPageAssem {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        PhotoModeImageInfo photoModeImageInfo;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Aweme aweme = A3().getAweme();
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (str = photoModeImageInfo.getTitle()) == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.hzp));
        if (view2 == null) {
            View containerView = getContainerView();
            if (containerView != null && (view2 = containerView.findViewById(R.id.hzp)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.hzp), view2);
            } else {
                view2 = null;
            }
        }
        TextView textView = (TextView) view2;
        if (textView != null) {
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
                textView.setVisibility(0);
                C118824lS.LIZJ(textView, null);
                return;
            }
            textView.setVisibility(8);
        }
    }
}
