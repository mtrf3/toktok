package X;

import Y.ACListenerS29S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS77S0100000_9;
import Y.IDCListenerS246S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyEncouragePublishCardLayoutManger;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyVideoCardModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS2S1000100_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M2Q extends RecyclerView.ViewHolder implements InterfaceC54855Lfv {
    public final NearbyEncouragePublishCardLayoutManger LJLIL;
    public final C68395Qsp LJLILLLLZI;
    public boolean LJLJI;
    public final C62846OlW LJLJJI;
    public final C47689Ind LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final LinearLayout LJLJLJ;
    public final LinearLayout LJLJLLL;
    public final View LJLL;
    public final View LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public Long LJLLL;
    public NearbyVideoCardModel LJLLLL;
    public Video LJLLLLLL;
    public final C56462Jm LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public VideoViewComponent LJZL;
    public final M2R LL;

    public final void LLLLLLLLL() {
        long j;
        this.LJZ = false;
        if (this.LJLZ.LIZ != 0) {
            VideoViewComponent videoViewComponent = this.LJZL;
            String str = null;
            if (videoViewComponent != null) {
                videoViewComponent.LJIIJJI();
                VideoViewComponent videoViewComponent2 = this.LJZL;
                if (videoViewComponent2 != null) {
                    videoViewComponent2.LJIIIZ();
                    VideoViewComponent videoViewComponent3 = this.LJZL;
                    if (videoViewComponent3 != null) {
                        videoViewComponent3.LLIIIILZ(this.LL);
                        this.LJLZ.LIZ = 0;
                        NearbyVideoCardModel nearbyVideoCardModel = this.LJLLLL;
                        if (nearbyVideoCardModel != null) {
                            str = nearbyVideoCardModel.groupId;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        Long l = this.LJLLL;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        AqS2S1000100_9 aqS2S1000100_9 = new AqS2S1000100_9(str, currentTimeMillis - j, 2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        aqS2S1000100_9.invoke(linkedHashMap);
                        FMX.LJIIL("nearby_educational_video_play_time", linkedHashMap);
                    } else {
                        o.LJIJI("videoView");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoView");
                    throw null;
                }
            } else {
                o.LJIJI("videoView");
                throw null;
            }
        }
        M();
    }

    public final void L() {
        if (!this.LJLJI || this.LJLJJI.getVisibility() != 0) {
            return;
        }
        this.LJZI = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 34));
        ofFloat.setDuration(500L);
        ofFloat.addListener(new IDAListenerS77S0100000_9(this, 13));
        ofFloat.start();
    }

    public final void LJIILLIIL() {
        VideoViewComponent videoViewComponent = this.LJZL;
        if (videoViewComponent != null) {
            if (!videoViewComponent.LJLJI.d4() || this.LJLLLLLL == null) {
                this.LJZ = true;
                return;
            }
            int i = this.LJLZ.LIZ;
            if (i != 0) {
                if (i != 3) {
                    return;
                }
                L();
                VideoViewComponent videoViewComponent2 = this.LJZL;
                if (videoViewComponent2 != null) {
                    videoViewComponent2.LJIIL(this.LJLLLLLL);
                    this.LJLZ.LIZ = 4;
                    return;
                } else {
                    o.LJIJI("videoView");
                    throw null;
                }
            }
            VideoViewComponent videoViewComponent3 = this.LJZL;
            if (videoViewComponent3 != null) {
                videoViewComponent3.LIZ(this.LL);
                VideoViewComponent videoViewComponent4 = this.LJZL;
                if (videoViewComponent4 != null) {
                    Video video = this.LJLLLLLL;
                    FFL.LJIIIZ().getClass();
                    videoViewComponent4.LJII(video, FFL.LJIIJ(31744, 0, "decoder_type", true));
                    this.LJZ = false;
                    this.LJLZ.LIZ = 2;
                    return;
                }
                o.LJIJI("videoView");
                throw null;
            }
            o.LJIJI("videoView");
            throw null;
        }
        o.LJIJI("videoView");
        throw null;
    }

    public final void M() {
        String str;
        this.LJLJJI.setAlpha(1.0f);
        this.LJLJJI.setVisibility(0);
        this.LJZI = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showCover,");
        NearbyVideoCardModel nearbyVideoCardModel = this.LJLLLL;
        if (nearbyVideoCardModel != null) {
            str = nearbyVideoCardModel.groupId;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2Q(View view, NearbyEncouragePublishCardLayoutManger layoutManger, C68395Qsp encouragePublishCardManager) {
        super(view);
        o.LJIIIZ(layoutManger, "layoutManger");
        o.LJIIIZ(encouragePublishCardManager, "encouragePublishCardManager");
        this.LJLIL = layoutManger;
        this.LJLILLLLZI = encouragePublishCardManager;
        View findViewById = view.findViewById(R.id.f12);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_cover)");
        this.LJLJJI = (C62846OlW) findViewById;
        View findViewById2 = view.findViewById(R.id.l60);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.texture_video)");
        C47689Ind c47689Ind = (C47689Ind) findViewById2;
        this.LJLJJL = c47689Ind;
        View findViewById3 = view.findViewById(R.id.me4);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_play_count)");
        this.LJLJJLL = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mec);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_poi_name)");
        this.LJLJL = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.g55);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.ll_play_count)");
        this.LJLJLJ = (LinearLayout) findViewById5;
        View findViewById6 = view.findViewById(R.id.g59);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.ll_poi_name)");
        this.LJLJLLL = (LinearLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.geh);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.mask)");
        this.LJLL = findViewById7;
        View findViewById8 = view.findViewById(R.id.j44);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.rl_bg)");
        this.LJLLI = findViewById8;
        this.LJLLILLLL = (int) KL2.LIZJ(view.getContext(), 231.0f);
        this.LJLLJ = (int) KL2.LIZJ(view.getContext(), 354.0f);
        this.LJLZ = new C56462Jm();
        this.LL = new M2R(this);
        view.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 5));
        VideoViewComponent videoViewComponent = new VideoViewComponent(0);
        this.LJZL = videoViewComponent;
        videoViewComponent.LJIILJJIL(c47689Ind);
        VideoViewComponent videoViewComponent2 = this.LJZL;
        if (videoViewComponent2 != null) {
            videoViewComponent2.LJLJI.N7(new M2S(this));
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 118), view);
            o.LJIIIIZZ(view.getContext(), "itemView.context");
            int LJIIJJI = (int) (KL2.LJIIJJI(r1) * 0.712f);
            this.LJLLILLLL = LJIIJJI;
            this.LJLLJ = (int) (LJIIJJI * 1.34f);
            C71899SJr c71899SJr = new C71899SJr();
            Context context = findViewById7.getContext();
            o.LJIIIIZZ(context, "viewMask.context");
            c71899SJr.LIZJ = C79045V0n.LJ(R.attr.d4, context);
            c71899SJr.LJ = Float.valueOf(0.0f);
            c71899SJr.LJFF = Float.valueOf(1.0f);
            c71899SJr.LJI = EnumC71803SFz.VERTICAL;
            c71899SJr.LJII = EnumC71900SJs.LINEAR;
            Context context2 = findViewById7.getContext();
            o.LJIIIIZZ(context2, "viewMask.context");
            findViewById7.setBackground(c71899SJr.LIZ(context2));
            return;
        }
        o.LJIJI("videoView");
        throw null;
    }

    @Override // X.InterfaceC54855Lfv
    public final void LJIIIZ(int i, View view, RecyclerView recyclerView) {
        if (!this.LJLIL.LJLZ.LJLLI) {
            return;
        }
        if (getAdapterPosition() != i) {
            LLLLLLLLL();
        } else {
            if (recyclerView == null || recyclerView.getVisibility() != 0 || !LJ5.LIZIZ) {
                return;
            }
            LJIILLIIL();
        }
    }
}
