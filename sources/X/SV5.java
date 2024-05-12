package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SV5 implements SXL {
    public final VideoMusicTitleRefactorAssem LIZ;
    public final LinearLayout LIZIZ;
    public final ImageView LIZJ;
    public final TuxIconView LIZLLL;
    public final InterfaceC65784Pro<Boolean> LJ;
    public final InterfaceC88472Yns<VideoItemParams, Boolean> LJFF;
    public final InterfaceC65784Pro<MusicInfo> LJI;
    public final InterfaceC65784Pro<Boolean> LJII;

    @Override // X.SXL
    public final void LIZ(VideoItemParams item) {
        SVA sva;
        o.LJIIIZ(item, "item");
        MusicInfo invoke = this.LJI.invoke();
        if (invoke == null) {
            return;
        }
        String aid = item.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        MusicDetailService.LJIJJ().LIZLLL(String.valueOf(item.getAweme().getMusic().getId()), aid);
        if (invoke.isTtm()) {
            SV7.LIZ.getClass();
            if (SV7.LJFF(false)) {
                if (invoke.isTtm()) {
                    sva = SVA.TIKTOK_MUSIC;
                } else {
                    sva = SVA.RESSO;
                }
                SV6.LIZIZ(sva, C74221TAz.LIZJ(item, "item.aweme.aid"), EnumC72191SUx.BRAND_ICON);
            }
        }
        IMusicDetailService LJIJJ = MusicDetailService.LJIJJ();
        invoke.getProduct();
        String trackId = invoke.getTrackId();
        String clipId = invoke.getClipId();
        String requestId = invoke.getRequestId();
        java.util.Map<String, String> logExtraMap = invoke.getLogExtraMap();
        boolean isPgc = invoke.isPgc();
        o.LJIIIIZZ(LJIJJ, "getService(IMusicDetailService::class.java)");
        LJIJJ.LJIILJJIL(trackId, clipId, aid, requestId, logExtraMap, isPgc);
    }

    @Override // X.SXL
    public final boolean LIZIZ(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return this.LJFF.invoke(item).booleanValue();
    }

    @Override // X.SXL
    public final void LIZJ(VideoItemParams item) {
        FrameLayout.LayoutParams layoutParams;
        int LIZIZ;
        o.LJIIIZ(item, "item");
        MusicInfo invoke = this.LJI.invoke();
        if (invoke == null) {
            return;
        }
        IMusicDetailService LJIJJ = MusicDetailService.LJIJJ();
        invoke.getProduct();
        LJIJJ.LJIIJJI();
        ImageView imageView = this.LIZJ;
        if (imageView != null) {
            C17N.LJJLIIIJJI(imageView);
        }
        LinearLayout linearLayout = this.LIZIZ;
        if (linearLayout != null) {
            C17N.LJJIIJZLJL(linearLayout);
        }
        TuxIconView tuxIconView = this.LIZLLL;
        if (tuxIconView != null) {
            C17N.LJJIIJZLJL(tuxIconView);
        }
        ImageView imageView2 = this.LIZJ;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (imageView2 != null) {
            layoutParams2 = imageView2.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            if (!this.LJ.invoke().booleanValue()) {
                layoutParams.topMargin = C7MY.LIZIZ(1);
            }
            if (invoke.isTtm()) {
                LIZIZ = C7MY.LIZIZ(88);
            } else {
                LIZIZ = C7MY.LIZIZ(70);
            }
            layoutParams.width = LIZIZ;
            ImageView imageView3 = this.LIZJ;
            if (imageView3 != null) {
                imageView3.setLayoutParams(layoutParams);
            }
        }
        ImageView imageView4 = this.LIZJ;
        if (imageView4 != null) {
            imageView4.setImageResource(R.drawable.bsm);
        }
        ImageView imageView5 = this.LIZJ;
        if (imageView5 != null) {
            C16880lQ.LJIILLIIL(imageView5, new Au2S19S0200000_12(this, item, 56));
        }
    }

    @Override // X.SXL
    public final boolean LIZLLL(VideoItemParams item, double d) {
        o.LJIIIZ(item, "item");
        SV9.LIZ.getClass();
        if (d <= SV9.LIZ()) {
            return false;
        }
        MusicInfo invoke = this.LJI.invoke();
        if (invoke != null && invoke.isTtm()) {
            SV7.LIZ.getClass();
            if (SV7.LJFF(false)) {
                TTMStoreLink storeLink = invoke.getLink().getStoreLink();
                SVA sva = SVA.TIKTOK_MUSIC;
                EnumC72191SUx enumC72191SUx = EnumC72191SUx.BRAND_ICON;
                Context context = this.LIZ.getContext();
                if (context != null) {
                    SV6.LIZ(new C72192SUy(enumC72191SUx, context, storeLink, C74221TAz.LIZJ(item, "item.aweme.aid")).LIZ(), sva);
                }
            }
        }
        return true;
    }

    public SV5(VideoMusicTitleRefactorAssem musicTitleAssem, LinearLayout linearLayout, ImageView imageView, TuxIconView tuxIconView, AqS162S0100000_12 aqS162S0100000_12, AqS170S0100000_4 aqS170S0100000_4, AqS162S0100000_12 aqS162S0100000_122, AqS162S0100000_12 aqS162S0100000_123) {
        o.LJIIIZ(musicTitleAssem, "musicTitleAssem");
        this.LIZ = musicTitleAssem;
        this.LIZIZ = linearLayout;
        this.LIZJ = imageView;
        this.LIZLLL = tuxIconView;
        this.LJ = aqS162S0100000_12;
        this.LJFF = aqS170S0100000_4;
        this.LJI = aqS162S0100000_122;
        this.LJII = aqS162S0100000_123;
    }
}
