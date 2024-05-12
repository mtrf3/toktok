package com.ss.android.ugc.aweme.detail.panel;

import X.C116724i4;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C46192IAy;
import X.C47261Igj;
import X.C62846OlW;
import X.C74181T9l;
import X.C76800UCe;
import X.C78764Uvg;
import X.C80796VnM;
import X.C81156VtA;
import X.CK3;
import X.FMX;
import X.ORZ;
import Y.IDiS271S0100000_9;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class EffectDiscoverPanel extends ShootFeedPanel {
    public C62846OlW LLJLIL;
    public C81156VtA LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.ti3;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public final void initPanel() {
        super.initPanel();
        Aweme LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LLILII(LJJLJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        super.q1();
        C80796VnM c80796VnM = this.mViewPager;
        if (c80796VnM != null) {
            c80796VnM.LJI(new IDiS271S0100000_9(this, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
        NewFaceStickerBean stickerEntranceInfo;
        int i;
        String str;
        NewFaceStickerBean stickerEntranceInfo2;
        int i2;
        int i3 = 0;
        if (this.param.isFromEffectDiscoverTab()) {
            if (this.activity != null && MSAdaptionService.LJIIL().LJI(this.activity)) {
                Activity activity = this.activity;
                C16880lQ.LLZILL(Toast.makeText(activity, activity.getString(R.string.f1i), 0));
                return;
            }
            Aweme currentAweme = getCurrentAweme();
            if (currentAweme == null || (stickerEntranceInfo2 = currentAweme.getStickerEntranceInfo()) == null) {
                return;
            }
            IPropReuseService propReuseService = PropReuseServiceImpl.LJIIJ();
            Music music = currentAweme.getMusic();
            String aid = currentAweme.getAid();
            if (currentAweme.getVideo() != null) {
                i2 = currentAweme.getVideo().getVideoLength();
            } else {
                i2 = 0;
            }
            boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            o.LJIIIIZZ(propReuseService, "propReuseService");
            Activity activity2 = this.activity;
            o.LJIIIIZZ(activity2, "activity");
            ArrayList LJII = C47261Igj.LJII(stickerEntranceInfo2);
            String previousPage = getPreviousPage();
            o.LJIIIIZZ(previousPage, "previousPage");
            propReuseService.LJ(activity2, LJII, music, previousPage, aid, i2, downloadEffectOrMusicAfterEnterCamera, "prop_page_discover", null, null, "", false, false);
            return;
        }
        if (!this.param.isFromEffectDiscoverPanel()) {
            return;
        }
        Aweme currentAweme2 = getCurrentAweme();
        Music music2 = null;
        if (currentAweme2 != null && (stickerEntranceInfo = currentAweme2.getStickerEntranceInfo()) != null) {
            C188727au LIZ = CK3.LIZ("enter_from", "video_shoot_page");
            LIZ.LJI("group_id", currentAweme2.getAid());
            C80796VnM viewPager = getViewPager();
            if (viewPager != null) {
                i = viewPager.getCurrentItem() + 1;
            } else {
                i = 0;
            }
            LIZ.LIZLLL(i, "impr_position");
            NewFaceStickerBean stickerEntranceInfo3 = currentAweme2.getStickerEntranceInfo();
            if (stickerEntranceInfo3 != null) {
                str = stickerEntranceInfo3.id;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            LIZ.LJI("prop_id", str);
            Bundle arguments = getArguments();
            if (arguments != null) {
                LIZ.LJI("creation_id", arguments.getString("creation_id", ""));
                LIZ.LJI("shoot_way", arguments.getString("shoot_way", ""));
                LIZ.LJI("shoot_tab_name", arguments.getString("shoot_tab_name", ""));
            }
            FMX.LJIIL("prop_discover_prop_click", LIZ.LIZ);
            boolean downloadEffectOrMusicAfterEnterCamera2 = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            IPropReuseService LJIIJ = PropReuseServiceImpl.LJIIJ();
            Activity activity3 = this.activity;
            o.LJIIIIZZ(activity3, "activity");
            List<String> LJJIJ = C47261Igj.LJJIJ(stickerEntranceInfo.id);
            Music music3 = currentAweme2.getMusic();
            if (music3 != null && music3.isPgc()) {
                music2 = currentAweme2.getMusic();
            }
            Video video = currentAweme2.getVideo();
            if (video != null) {
                i3 = video.getVideoLength();
            }
            LJIIJ.LJFF(activity3, LJJIJ, new C74181T9l(null, "video_shoot_page", music2, null, true, null, null, "video_shoot_page", null, null, "prop_panel_discover", null, null, false, null, Integer.valueOf(i3), null, new C46192IAy(currentAweme2, this), null, false, null, null, null, 16447337), downloadEffectOrMusicAfterEnterCamera2);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        String string = this.activity.getString(R.string.g5w);
        o.LJIIIIZZ(string, "activity.getString(R.string.error_unknown)");
        Activity activity4 = this.activity;
        o.LJIIIIZZ(activity4, "activity");
        C26045AKb c26045AKb = new C26045AKb(activity4);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alu, relativeLayout, false);
        View findViewById = LLLLIILL.findViewById(R.id.khy);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.sticker_icon)");
        this.LLJLIL = (C62846OlW) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.d81);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.feed_marquee_desc)");
        this.LLJLILLLLZIIL = (C81156VtA) findViewById2;
        return LLLLIILL;
    }

    public final void LLILII(Aweme aweme) {
        String str;
        UrlModel urlModel;
        List<String> urlList;
        String str2;
        NewFaceStickerBean stickerEntranceInfo = aweme.getStickerEntranceInfo();
        if (stickerEntranceInfo != null && (urlModel = stickerEntranceInfo.iconUrl) != null && (urlList = urlModel.getUrlList()) != null && (str2 = (String) ORZ.LJLLLL(urlList)) != null) {
            C62846OlW c62846OlW = this.LLJLIL;
            if (c62846OlW != null) {
                C78764Uvg.LJIIIZ(c62846OlW, str2, -1, -1);
            } else {
                o.LJIJI("effectIcon");
                throw null;
            }
        }
        NewFaceStickerBean stickerEntranceInfo2 = aweme.getStickerEntranceInfo();
        if (stickerEntranceInfo2 != null && (str = stickerEntranceInfo2.name) != null) {
            C81156VtA c81156VtA = this.LLJLILLLLZIIL;
            if (c81156VtA != null) {
                C116724i4 c116724i4 = new C116724i4();
                c116724i4.LIZIZ(str);
                LLIL(c81156VtA, c116724i4.LIZ.toString());
                return;
            }
            o.LJIJI("effectName");
            throw null;
        }
    }
}
