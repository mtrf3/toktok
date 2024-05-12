package com.ss.android.ugc.aweme.feed.feedwidget;

import X.AbstractC86187Xs7;
import X.C207668Da;
import X.C62846OlW;
import X.C86188Xs8;
import Y.ARunnableS11S0201000_8;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* loaded from: classes16.dex */
public abstract class AbsFeedWidget extends GenericWidget {
    public AbstractC86187Xs7 LJLJLJ;

    public abstract C86188Xs8 LJIILL(View view);

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LJLJJI;
        dataCenter.iv0("video_params", this, false);
        dataCenter.iv0("on_viewpager_page_selected", this, false);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        AbstractC86187Xs7 abstractC86187Xs7 = this.LJLJLJ;
        if (abstractC86187Xs7 != null) {
            ((C86188Xs8) abstractC86187Xs7).LJLJLLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
        AbstractC86187Xs7 abstractC86187Xs7 = this.LJLJLJ;
        if (abstractC86187Xs7 != null) {
            abstractC86187Xs7.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        C86188Xs8 LJIILL = LJIILL(view);
        this.LJLJLJ = LJIILL;
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter == null) {
            LJIILL.getClass();
        } else {
            LJIILL.LJLJI = dataCenter;
            dataCenter.iv0("live_has_end", LJIILL, false);
        }
        VideoItemParams videoItemParams = (VideoItemParams) this.LJLJJI.get("video_params");
        if (videoItemParams != null) {
            AbstractC86187Xs7 abstractC86187Xs7 = this.LJLJLJ;
            abstractC86187Xs7.getClass();
            abstractC86187Xs7.LJLIL = videoItemParams.getAweme();
            abstractC86187Xs7.LJLILLLLZI = videoItemParams.mEventType;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* renamed from: LJIILJJIL */
    public void onChanged(C207668Da c207668Da) {
        C86188Xs8 c86188Xs8;
        Aweme aweme;
        UrlModel avatarLarger;
        C62846OlW c62846OlW;
        if (c207668Da != null) {
            String str = c207668Da.LIZ;
            str.getClass();
            if (!str.equals("on_viewpager_page_selected")) {
                if (!str.equals("video_params")) {
                    return;
                }
                Object obj = c207668Da.LIZIZ;
                if (obj == null) {
                    obj = null;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                AbstractC86187Xs7 abstractC86187Xs7 = this.LJLJLJ;
                if (abstractC86187Xs7 == null || videoItemParams == null) {
                    return;
                }
                abstractC86187Xs7.LJLIL = videoItemParams.getAweme();
                abstractC86187Xs7.LJLILLLLZI = videoItemParams.mEventType;
                return;
            }
            AbstractC86187Xs7 abstractC86187Xs72 = this.LJLJLJ;
            if (abstractC86187Xs72 == null || (aweme = (c86188Xs8 = (C86188Xs8) abstractC86187Xs72).LJLIL) == null || aweme.getAuthor() == null || (avatarLarger = c86188Xs8.LJLIL.getAuthor().getAvatarLarger()) == null || (c62846OlW = c86188Xs8.LJLJJLL) == null) {
                return;
            }
            c62846OlW.post(new ARunnableS11S0201000_8(1, c86188Xs8, avatarLarger, 13));
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(C207668Da c207668Da) {
        onChanged(c207668Da);
    }
}
