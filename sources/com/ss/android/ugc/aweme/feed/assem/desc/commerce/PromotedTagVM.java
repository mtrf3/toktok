package com.ss.android.ugc.aweme.feed.assem.desc.commerce;

import X.C33Q;
import X.C8F9;
import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Boost;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PromotedTagVM extends FeedBaseViewModel<C8F9> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C8F9(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C8F9 iv0(C8F9 c8f9, VideoItemParams item) {
        String str;
        int parseColor;
        int i;
        boolean z;
        C8F9 state = c8f9;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            Boost boost = aweme.getBoost();
            if (boost != null) {
                str = boost.getText();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (state.LJLIL != 8 || state.LJLILLLLZI != 8) {
                    return new C8F9(8, 8, state.LJLJI, state.LJLJJI, state.LJLJJL, state.LJLJJLL);
                }
                return state;
            }
            try {
                parseColor = Color.parseColor(boost.getBgColor());
            } catch (Exception unused) {
                parseColor = ColorProtector.parseColor("#C0FFFFFF");
            }
            try {
                i = Color.parseColor(boost.getTextColor());
                z = false;
            } catch (Exception unused2) {
                i = 16777215;
                z = true;
            }
            return new C8F9(0, 0, Integer.valueOf(parseColor), Integer.valueOf(i), boost.getText(), z);
        }
        return state;
    }
}
