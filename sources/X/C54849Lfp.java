package X;

import Y.ACListenerS29S0100000_9;
import Y.IDLListenerS196S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyEncouragePublishCardLayoutManger;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyEncouragePublishGuideVideoModel;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyVideoCardModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lfp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54849Lfp extends FrameLayout implements GenericLifecycleObserver {
    public final NearbyEncouragePublishCardLayoutManger LJLIL;
    public final C68395Qsp LJLILLLLZI;
    public final RecyclerView LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final TuxTextView LJLJJLL;
    public final C62846OlW LJLJL;
    public final View LJLJLJ;
    public final View LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public Integer LJLLILLLL;
    public Long LJLLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void onPause() {
        RecyclerView.ViewHolder LJJIZ = this.LJLJI.LJJIZ(this.LJLIL.LLI);
        if (LJJIZ != null) {
            ((M2Q) LJJIZ).LLLLLLLLL();
        }
        RecyclerView.ViewHolder LJJIZ2 = this.LJLJI.LJJIZ(this.LJLIL.LLI + 1);
        if (LJJIZ2 != null) {
            ((M2Q) LJJIZ2).M();
        }
        RecyclerView.ViewHolder LJJIZ3 = this.LJLJI.LJJIZ(this.LJLIL.LLI - 1);
        if (LJJIZ3 != null) {
            ((M2Q) LJJIZ3).M();
        }
        Long l = this.LJLLJ;
        if (l != null) {
            long longValue = l.longValue();
            if (this.LJLJJL) {
                C54682Ld8 c54682Ld8 = new C54682Ld8("click_post", this.LJLJJI, System.currentTimeMillis() - longValue);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c54682Ld8.invoke(linkedHashMap);
                FMX.LJIIL("nearby_educational_sample_videos_click", linkedHashMap);
            } else if (!this.LJLLI) {
                C54682Ld8 c54682Ld82 = new C54682Ld8("slide", this.LJLJJI, System.currentTimeMillis() - longValue);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                c54682Ld82.invoke(linkedHashMap2);
                FMX.LJIIL("nearby_educational_sample_videos_click", linkedHashMap2);
            }
        }
        this.LJLLJ = null;
    }

    public final void onResume() {
        this.LJLLJ = Long.valueOf(System.currentTimeMillis());
        this.LJLJJL = false;
        RecyclerView.ViewHolder LJJIZ = this.LJLJI.LJJIZ(this.LJLIL.LLI);
        if (LJJIZ != null) {
            ((M2Q) LJJIZ).LJIILLIIL();
        }
    }

    public final boolean getHasUserInteract() {
        return this.LJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54849Lfp(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new C68395Qsp(2);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bw3, this, true);
        View findViewById = LLLLIILL.findViewById(R.id.isd);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.recycle_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLJI = recyclerView;
        NearbyEncouragePublishCardLayoutManger nearbyEncouragePublishCardLayoutManger = new NearbyEncouragePublishCardLayoutManger(this);
        this.LJLIL = nearbyEncouragePublishCardLayoutManger;
        nearbyEncouragePublishCardLayoutManger.LLD = recyclerView;
        nearbyEncouragePublishCardLayoutManger.LLIFFJFJJ = 0;
        recyclerView.setLayoutManager(nearbyEncouragePublishCardLayoutManger);
        nearbyEncouragePublishCardLayoutManger.LJZI.LIZIZ(recyclerView);
        recyclerView.LJIIJJI(nearbyEncouragePublishCardLayoutManger.LLF);
        nearbyEncouragePublishCardLayoutManger.LLFF = new C42511GmJ(context);
        View findViewById2 = LLLLIILL.findViewById(R.id.ay1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.btn_post_video)");
        SY4 sy4 = (SY4) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.mo6);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.tv_title)");
        this.LJLJJLL = (TuxTextView) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.ezt);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.iv_card_bg)");
        this.LJLJL = (C62846OlW) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.gei);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.mask1)");
        this.LJLJLJ = findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.gej);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.mask2)");
        this.LJLJLLL = findViewById6;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cu);
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        Context context2 = sy4.getContext();
        o.LJIIIIZZ(context2, "btnPostVideo.context");
        sy4.setBackground(c110614Vt.LIZ(context2));
        C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(this, 136));
        nearbyEncouragePublishCardLayoutManger.LLFII.add(new C54847Lfn(this));
        getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS196S0100000_9(this, 5));
    }

    public final void setData(NearbyEncouragePublishGuideVideoModel videoCardModel) {
        o.LJIIIZ(videoCardModel, "videoCardModel");
        List<NearbyVideoCardModel> list = videoCardModel.videoList;
        if (list != null) {
            this.LJLJI.setAdapter(new M2P(list, this.LJLIL, this.LJLILLLLZI));
        }
        UrlModel urlModel = videoCardModel.cardBgUrl;
        if (urlModel != null) {
            C78765Uvh.LJFF(this.LJLJL, urlModel);
        }
    }

    public final void setHasUserInteract(boolean z) {
        this.LJLL = z;
    }

    public final void setPageSelected(boolean z) {
        this.LJLLI = z;
    }
}
