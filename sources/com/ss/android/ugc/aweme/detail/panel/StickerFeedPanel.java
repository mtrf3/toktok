package com.ss.android.ugc.aweme.detail.panel;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C61447O9r;
import X.C62846OlW;
import X.C78765Uvh;
import X.C81156VtA;
import X.HT5;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class StickerFeedPanel extends ShootFeedPanel {
    public final List<NewFaceStickerBean> LLJLIL;
    public View LLJLILLLLZIIL;
    public final String LLJLL;
    public final String LLJLLIL;
    public final String LLJLLL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.ti3;
    }

    public final NewFaceStickerBean LLILII() {
        List<NewFaceStickerBean> list = this.LLJLIL;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (NewFaceStickerBean) ListProtector.get(this.LLJLIL, 0);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC61452O9w
    public final void onAdapterFinish() {
        View view;
        super.onAdapterFinish();
        if (C61447O9r.LJIILJJIL == 0 && (view = this.LLJLILLLLZIIL) != null) {
            view.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ch, getContext()));
        }
    }

    public StickerFeedPanel(Bundle bundle) {
        this.LLJLIL = (List) bundle.getSerializable("feed_data_sticker_model");
        bundle.getString("feed_data_sticker_group_id", "");
        this.LLJLL = bundle.getString("from_user_id", "");
        this.LLJLLIL = bundle.getString("shoot_enter_from", "");
        this.LLJLLL = bundle.getString("extra_edit_effect_uid", "");
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public void LLIIL(View view) {
        if (this.activity != null && MSAdaptionService.LJIIL().LJI(this.activity)) {
            Activity activity = this.activity;
            C16880lQ.LLZILL(Toast.makeText(activity, activity.getString(R.string.f1i), 0));
        } else {
            LLILIL(this.LLJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alu, relativeLayout, false);
        this.LLJLILLLLZIIL = LLLLIILL.findViewById(R.id.khz);
        NewFaceStickerBean LLILII = LLILII();
        if (LLILII != null) {
            C78765Uvh.LJFF((C62846OlW) LLLLIILL.findViewById(R.id.khy), LLILII.iconUrl);
            LLIL((C81156VtA) LLLLIILL.findViewById(R.id.d81), LLILII.name);
            HT5.LIZJ(LLILII.isFavorite);
        }
        return LLLLIILL;
    }

    public final void LLILIL(List<NewFaceStickerBean> list) {
        Music music;
        String str;
        int i;
        String str2;
        IPropReuseService LJIIJ = PropReuseServiceImpl.LJIIJ();
        if (LLILII() != null) {
            Aweme currentAweme = getCurrentAweme();
            if (currentAweme != null) {
                music = currentAweme.getMusic();
                str = currentAweme.getAid();
                if (currentAweme.getVideo() != null) {
                    i = currentAweme.getVideo().getVideoLength();
                } else {
                    i = 0;
                }
            } else {
                music = null;
                str = null;
                i = 0;
            }
            boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            Activity activity = this.activity;
            ArrayList arrayList = new ArrayList(list);
            String previousPage = getPreviousPage();
            String previousPage2 = getPreviousPage();
            previousPage2.getClass();
            if (!previousPage2.equals("notification_page")) {
                if (!previousPage2.equals("homepage_hot_card")) {
                    str2 = "prop_page";
                } else {
                    str2 = "prop_recommend_card";
                }
            } else {
                str2 = "friends_effect";
            }
            LJIIJ.LJ(activity, arrayList, music, previousPage, str, i, downloadEffectOrMusicAfterEnterCamera, str2, this.LLJLL, this.LLJLLIL, this.LLJLLL, ((NewFaceStickerBean) ListProtector.get(list, 0)).isFriendVideoPresent, ((NewFaceStickerBean) ListProtector.get(list, 0)).isFollowerVideoPresent);
        }
    }
}
