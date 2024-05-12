package com.ss.android.ugc.aweme.detail.ui.story;

import X.C221108m2;
import X.C222578oP;
import X.C53816LAe;
import X.C62822Ol8;
import X.C77123UOp;
import X.KD6;
import X.LFH;
import X.LKF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryDetailComponent extends DetailPageComponent {
    public final C62822Ol8 LLIILII;

    public StoryDetailComponent() {
        new LinkedHashMap();
        this.LLIILII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 91));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void Jk() {
        String str;
        DetailFragmentPanel detailFragmentPanel;
        Aweme currentPlayAweme;
        String aid;
        if (C77123UOp.LJJIJIIJIL(getFrom())) {
            String from = getFrom();
            String str2 = "";
            if (from != null) {
                switch (from.hashCode()) {
                    case -961876022:
                        if (from.equals("STORY_ENTRANCE_FEED_TOP_LIST")) {
                            str = "homepage_friends";
                            break;
                        }
                        break;
                    case -796330400:
                        if (from.equals("STORY_ENTRANCE_INBOX_TOP_LIST")) {
                            str = "notification_page";
                            break;
                        }
                        break;
                    case -505526980:
                        if (from.equals("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST")) {
                            str = "homepage_follow";
                            break;
                        }
                        break;
                    case 1866617170:
                        if (from.equals("STORY_ENTRANCE_GUIDE_CARD")) {
                            str = "homepage_hot";
                            break;
                        }
                        break;
                }
                detailFragmentPanel = this.LJZL;
                if (detailFragmentPanel != null && (currentPlayAweme = detailFragmentPanel.getCurrentPlayAweme()) != null && (aid = currentPlayAweme.getAid()) != null) {
                    str2 = aid;
                }
                C222578oP.LJIILLIIL(str, "click", str2);
            }
            str = "";
            detailFragmentPanel = this.LJZL;
            if (detailFragmentPanel != null) {
                str2 = aid;
            }
            C222578oP.LJIILLIIL(str, "click", str2);
        }
        super.Jk();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        o.LJIIIZ(inflater, "inflater");
        View LIZ = KD6.LIZ(getActivity(), R.layout.alv, inflater, viewGroup);
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        C53816LAe c53816LAe = C53816LAe.LIZ;
        DetailFragmentPanel detailFragmentPanel = this.LJZL;
        if (detailFragmentPanel == null || (str = detailFragmentPanel.getSplitTag()) == null) {
            str = "";
        }
        LKF LIZ2 = c53816LAe.LIZ(LIZ, (Fragment) this.LLIILII.getValue(), str);
        this.LLFII = LIZ2;
        View LJIILJJIL = LIZ2.LJIILJJIL();
        if (LJIILJJIL == null) {
            return LIZ;
        }
        return LJIILJJIL;
    }
}
