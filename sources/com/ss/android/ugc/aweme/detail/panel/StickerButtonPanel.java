package com.ss.android.ugc.aweme.detail.panel;

import X.C05040Hs;
import X.C16630l1;
import X.C16650l3;
import X.C16880lQ;
import X.C188727au;
import X.C47261Igj;
import X.C54838Lfe;
import X.FMX;
import X.InterfaceC56421MCj;
import Y.ARunnableS8S1200000_9;
import Y.IDiS271S0100000_9;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes10.dex */
public final class StickerButtonPanel extends ShootFeedPanel {
    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.ti3;
    }

    public final void LLILLIZIL() {
        Object obj = this.mViewModel;
        if (obj instanceof InterfaceC56421MCj) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.effect.IStickerQuery");
            ((InterfaceC56421MCj) obj).Uq0(LJJLJ(), new AqS175S0100000_9(this, 29));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void LJLLILLLL(List<Aweme> list) {
        LJLLJ(list, false);
        LLILLIZIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alr, relativeLayout, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…ottom, parentView, false)");
        return LLLLIILL;
    }

    public final void LLILIL(Context context, NewFaceStickerBean newFaceStickerBean) {
        String str;
        String str2;
        String str3 = newFaceStickerBean.effectId;
        if (str3 != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", getPreviousPage());
            c188727au.LJIIIZ("prop_id", newFaceStickerBean.effectId);
            c188727au.LJIIIZ("author_id", newFaceStickerBean.ownerId);
            Aweme LJJLJ = LJJLJ();
            Music music = null;
            if (LJJLJ != null) {
                str = LJJLJ.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            c188727au.LJIIIZ("enter_method", "profile_tab_bottom");
            o.LJ(getPreviousPage(), "from_music");
            FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://stickers/detail");
            buildRoute.withParam("extra_sticker_from", "from_sticker_master_profile");
            buildRoute.withParam("extra_music_from", "from_sticker_master_profile");
            buildRoute.withParam("extra_related_item", newFaceStickerBean.relatedAweme);
            buildRoute.withParam("extra_owner_id", newFaceStickerBean.ownerId);
            buildRoute.withParam("extra_open_from_profile_page", true);
            buildRoute.withParam("extra_url_icon", newFaceStickerBean.iconUrl);
            buildRoute.withParam("featured_video_source", newFaceStickerBean.featureVideoSource);
            buildRoute.withParam("extra_stickers", C47261Igj.LJII(str3));
            Aweme LJJLJ2 = LJJLJ();
            if (LJJLJ2 != null) {
                music = LJJLJ2.getMusic();
            }
            buildRoute.withParam("music_model", music);
            if (C54838Lfe.LJIIJJI(newFaceStickerBean.ownerId)) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            C05040Hs.LJ(buildRoute, "prop_page_enter_from", str2, "prop_page_enter_method", "profile_tab_bottom");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLILLIZIL();
        this.mViewPager.LJI(new IDiS271S0100000_9(this, 3));
    }

    public static void LLILII(View view, TuxTextView tuxTextView, String str) {
        C16650l3 LIZ = h0.LIZ(view);
        LIZ.LIZ(0.0f);
        LIZ.LIZJ(100L);
        ARunnableS8S1200000_9 aRunnableS8S1200000_9 = new ARunnableS8S1200000_9(tuxTextView, str, view, 1);
        View view2 = LIZ.LIZ.get();
        if (view2 != null) {
            C16630l1.LIZ(view2.animate(), aRunnableS8S1200000_9);
        }
        LIZ.LJ();
    }
}
