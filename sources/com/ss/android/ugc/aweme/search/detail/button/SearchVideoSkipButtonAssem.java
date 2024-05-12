package com.ss.android.ugc.aweme.search.detail.button;

import X.C16880lQ;
import X.C214348b8;
import X.C5H3;
import X.C65352Pkq;
import X.C7MY;
import X.JQR;
import X.JQS;
import X.Q8U;
import Y.ACListenerS43S0200000_8;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoSkipVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchVideoSkipButtonAssem extends BaseCellSlotComponent<SearchVideoSkipButtonAssem> {
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public Aweme LLI;
    public TuxTextView LLIFFJFJJ;
    public View LLII;
    public String LLIIII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cj_;
    }

    public SearchVideoSkipButtonAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchVideoHolderVM.class), JQR.INSTANCE);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchVideoSkipVM.class), JQS.INSTANCE);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        List<Float> videoSkipRelevantTime;
        Float f;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        this.LLI = aweme;
        if (aweme != null && (videoSkipRelevantTime = aweme.getVideoSkipRelevantTime()) != null && (f = (Float) ListProtector.get(videoSkipRelevantTime, 0)) != null) {
            float floatValue = f.floatValue();
            Object value = this.LLFZ.getValue();
            String str2 = this.LLIIII;
            if (str2 != null) {
                value.getClass();
                float f2 = floatValue / 1000;
                float f3 = 60;
                str = Q8U.LIZIZ(new Object[]{Integer.valueOf((int) (f2 / f3)), Integer.valueOf((int) (f2 % f3))}, 2, i0.LJFF("%02d:%02d ", str2), "format(format, *args)");
            } else {
                o.LJIJI("constText");
                throw null;
            }
        } else {
            str = null;
        }
        TuxTextView tuxTextView = this.LLIFFJFJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
            TuxTextView tuxTextView2 = this.LLIFFJFJJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setMinTextSize(10.0f);
                return;
            } else {
                o.LJIJI("descText");
                throw null;
            }
        }
        o.LJIJI("descText");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLIFFJFJJ = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.k2k, "view.findViewById(R.id.skip_button_desc_inner)");
        View findViewById = view.findViewById(R.id.n81);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.v…o_skip_button_view_inner)");
        this.LLII = findViewById;
        TuxTextView tuxTextView = this.LLIFFJFJJ;
        if (tuxTextView != null) {
            this.LLIIII = tuxTextView.getText().toString();
            View view2 = this.LLII;
            if (view2 != null) {
                view2.setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS43S0200000_8(this, view2, 17), view2);
                return;
            } else {
                o.LJIJI("videoSkipButton");
                throw null;
            }
        }
        o.LJIJI("descText");
        throw null;
    }
}
