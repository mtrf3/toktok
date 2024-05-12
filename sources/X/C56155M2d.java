package X;

import Y.ACListenerS29S0100000_9;
import Y.IDCListenerS246S0100000_9;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.M2d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56155M2d extends AbstractC208618Gr<Aweme> {
    public static final /* synthetic */ int LJLLI = 0;
    public final View LJLJJLL;
    public final String LJLJL;
    public final C56473MEj LJLJLJ;
    public Aweme LJLJLLL;
    public long LJLL;

    public final Aweme P() {
        String str;
        UserStory userStory;
        List<Aweme> LJIIIZ;
        User author;
        Aweme aweme = this.LJLJLLL;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        if (!C54838Lfe.LJIIJJI(str) || (LJIIIZ = C55723Ltv.LIZIZ.LJIILJJIL().LJIIIZ()) == null || LJIIIZ.isEmpty()) {
            Aweme aweme2 = this.LJLJLLL;
            if (aweme2 == null || (userStory = aweme2.getUserStory()) == null) {
                return null;
            }
            Aweme currentStory = UserStoryKt.currentStory(userStory);
            if (currentStory == null) {
                return (Aweme) ORZ.LJLLLLLL(0, userStory.getStories());
            }
            return currentStory;
        }
        return (Aweme) ORZ.LLFF(LJIIIZ);
    }

    @Override // X.MFR
    public final void LLZLLLL() {
        N(P());
    }

    public final void N(Aweme aweme) {
        boolean z;
        Video video;
        if (aweme != null && !aweme.isSharedStoryVisible()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SmartImageView smartImageView = (SmartImageView) this.LJLJJLL.findViewById(R.id.f12);
            o.LJIIIIZZ(smartImageView, "view.iv_cover");
            C111204Ya.LIZ(smartImageView);
            return;
        }
        Bitmap.Config config = null;
        if (aweme == null || (video = aweme.getVideo()) == null || video.getCover() == null) {
            ((W5G) this.LJLJJLL.findViewById(R.id.f12)).setActualImageResource(R.attr.cf);
            return;
        }
        List<String> urlList = video.getCover().getUrlList();
        if (C248339or.LIZ()) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (AbstractC208618Gr.M() && video.isCallback()) {
            SmartImageView smartImageView2 = (SmartImageView) this.LJLJJLL.findViewById(R.id.f12);
            o.LJIIIIZZ(smartImageView2, "view.iv_cover");
            if (C208458Gb.LIZLLL(smartImageView2, video, "StoryCollectionViewHolder", false, null, null, false, config, false, 888)) {
                this.LJLJI = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("refreshCover: use dynamic img, url list: ");
                LIZ.append(urlList);
                C189837ch.LIZ("StoryV5VH", X1D.LIZIZ(LIZ));
                return;
            }
        }
        this.LJLJI = false;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("refreshCover: use static img, url list: ");
        LIZ2.append(urlList);
        C189837ch.LIZ("StoryV5VH", X1D.LIZIZ(LIZ2));
        W5F LJII = W5U.LJII(C78939UyV.LJ(video.getCover()));
        int[] LIZ3 = J7H.LIZ(200);
        if (LIZ3 != null) {
            LJII.LJIILIIL(LIZ3);
        }
        LJII.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.f12);
        LJII.LIZIZ("StoryCollectionViewHolder");
        C16880lQ.LLJJJ(LJII);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56155M2d(View view, String str, C56473MEj adapter) {
        super(view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(adapter, "adapter");
        this.LJLJJLL = view;
        this.LJLJL = str;
        this.LJLJLJ = adapter;
        this.LJLL = -1L;
        this.LJLILLLLZI = (SmartImageView) view.findViewById(R.id.f12);
        View findViewById = view.findViewById(R.id.moj);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d7);
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        findViewById.setBackground(c110614Vt.LIZ(context));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 1), view);
        view.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 0));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new C56153M2b(this));
    }
}
