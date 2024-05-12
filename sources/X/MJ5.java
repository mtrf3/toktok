package X;

import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class MJ5<V> implements Callable {
    public final /* synthetic */ NewFaceStickerBean LJLIL;
    public final /* synthetic */ TrendingTopicViewHolder LJLILLLLZI;
    public final /* synthetic */ Challenge LJLJI;
    public final /* synthetic */ TrendingTopic LJLJJI;
    public final /* synthetic */ Music LJLJJL;

    public MJ5(NewFaceStickerBean newFaceStickerBean, TrendingTopicViewHolder trendingTopicViewHolder, Challenge challenge, TrendingTopic trendingTopic, Music music) {
        this.LJLIL = newFaceStickerBean;
        this.LJLILLLLZI = trendingTopicViewHolder;
        this.LJLJI = challenge;
        this.LJLJJI = trendingTopic;
        this.LJLJJL = music;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.LJLIL != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("prop_id", this.LJLIL.effectId);
            c188727au.LIZLLL(this.LJLILLLLZI.M(), "client_order");
            FMX.LJIIL("show_effect", c188727au.LIZ);
        } else if (this.LJLJI != null) {
            CommerceChallengeServiceImpl.LIZIZ().LJIIIIZZ(this.LJLJI.getSchema(), this.LJLJI.getCid());
            this.LJLILLLLZI.LJLJLJ.getContext();
            FMX.LJII("show_challenge", 0L, "discovery", this.LJLJI.getCid());
            MJ6 mj6 = new MJ6();
            mj6.LJIILJJIL = "discovery";
            mj6.LJIILL = this.LJLJI.getCid();
            mj6.LJIILIIL();
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "discovery");
            c188727au2.LJIIIZ("tag_id", this.LJLJI.getCid());
            c188727au2.LIZLLL(this.LJLILLLLZI.M(), "client_order");
            FMX.LJIIL("cell_show", c188727au2.LIZ);
            MJ9 mj9 = this.LJLILLLLZI.LJZ;
            if (mj9 != null) {
                mj9.LIZ(this.LJLILLLLZI.M(), TrendingTopicViewHolder.L(this.LJLJJI), this.LJLJJI.getDesc());
            }
            if (this.LJLJJI.isAd()) {
                C62819Ol5.LJJI(this.LJLILLLLZI.LJLLLLLL, this.LJLJJI);
            }
        } else if (this.LJLJJL != null) {
            this.LJLILLLLZI.LJLJLJ.getContext();
            FMX.LJII("show_music", 0L, "discovery", this.LJLJJL.getMid());
            C188727au c188727au3 = new C188727au();
            c188727au3.LJIIIZ("enter_from", "discovery");
            c188727au3.LJIIIZ("music_id", this.LJLJJL.getMid());
            c188727au3.LIZLLL(this.LJLILLLLZI.M(), "client_order");
            FMX.LJIIL("cell_show", c188727au3.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
