package X;

import Y.AObserverS75S0100000_7;
import Y.IDTListenerS116S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VideoLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.I5n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46051I5n {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final VideoEditViewModel LIZJ;
    public final CutMultiVideoViewModel LIZLLL;
    public long LJ;
    public int LJFF;
    public ValueAnimator LJI;
    public C46048I5k LJII;
    public RecyclerView LJIIIIZZ;
    public View LJIIIZ;

    public C46051I5n(Context context, LifecycleOwner lifecycleOwner, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(videoEditViewModel, "videoEditViewModel");
        o.LJIIIZ(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = videoEditViewModel;
        this.LIZLLL = cutMultiVideoViewModel;
        this.LJFF = 1;
        videoEditViewModel.LJLIL.observe(lifecycleOwner, new AObserverS75S0100000_7(this, 139));
        cutMultiVideoViewModel.LJLIL.observe(lifecycleOwner, new AObserverS75S0100000_7(this, UserLevelGeckoUpdateSetting.DEFAULT));
    }

    public final void LIZ(RecyclerView recyclerView, View view, C46058I5u c46058I5u, InterfaceC46060I5w interfaceC46060I5w) {
        C46048I5k c46048I5k;
        C0B4 c43981HNx;
        this.LJIIIIZZ = recyclerView;
        this.LJIIIZ = view;
        if (c46058I5u.LJLIL) {
            VideoEditViewModel videoEditViewModel = this.LIZJ;
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LIZLLL;
            List<VideoSegment> ov0 = videoEditViewModel.ov0();
            o.LJIIIIZZ(ov0, "videoEditViewModel.videoEditedList");
            C46049I5l c46049I5l = new C46049I5l(videoEditViewModel, cutMultiVideoViewModel, ov0);
            c46049I5l.LJLL = c46058I5u.LJLJI;
            c46049I5l.notifyDataSetChanged();
            c46048I5k = c46049I5l;
        } else {
            VideoEditViewModel videoEditViewModel2 = this.LIZJ;
            c46048I5k = new C46048I5k(videoEditViewModel2, this.LIZLLL, videoEditViewModel2.ov0());
        }
        this.LJII = c46048I5k;
        c46048I5k.LJLJI = interfaceC46060I5w;
        c46048I5k.LJLJLJ = c46058I5u.LJLILLLLZI;
        if (c46058I5u.LJLIL) {
            C46048I5k c46048I5k2 = this.LJII;
            if (c46048I5k2 != null) {
                c43981HNx = new C43982HNy(c46048I5k2);
            } else {
                o.LJIJI("videoSegAdapter");
                throw null;
            }
        } else {
            C46048I5k c46048I5k3 = this.LJII;
            if (c46048I5k3 != null) {
                c43981HNx = new C43981HNx(c46048I5k3);
            } else {
                o.LJIJI("videoSegAdapter");
                throw null;
            }
        }
        C1C8 c1c8 = new C1C8(c43981HNx);
        RecyclerView recyclerView2 = this.LJIIIIZZ;
        if (recyclerView2 != null) {
            c1c8.LJII(recyclerView2);
            RecyclerView recyclerView3 = this.LJIIIIZZ;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new VideoLayoutManager(this.LIZ));
                RecyclerView recyclerView4 = this.LJIIIIZZ;
                if (recyclerView4 != null) {
                    C46048I5k c46048I5k4 = this.LJII;
                    if (c46048I5k4 != null) {
                        recyclerView4.setAdapter(c46048I5k4);
                        RecyclerView recyclerView5 = this.LJIIIIZZ;
                        if (recyclerView5 != null) {
                            C40171ht c40171ht = new C40171ht();
                            c40171ht.LIZLLL = 300L;
                            c40171ht.LJFF = 300L;
                            c40171ht.LJ = 300L;
                            c40171ht.LIZJ = 300L;
                            recyclerView5.setItemAnimator(c40171ht);
                            RecyclerView recyclerView6 = this.LJIIIIZZ;
                            if (recyclerView6 != null) {
                                recyclerView6.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC46053I5p(this));
                                RecyclerView recyclerView7 = this.LJIIIIZZ;
                                if (recyclerView7 != null) {
                                    recyclerView7.setOnTouchListener(new IDTListenerS116S0100000_7(this, 13));
                                    C46048I5k c46048I5k5 = this.LJII;
                                    if (c46048I5k5 != null) {
                                        c46048I5k5.notifyDataSetChanged();
                                        return;
                                    } else {
                                        o.LJIJI("videoSegAdapter");
                                        throw null;
                                    }
                                }
                                o.LJIJI("videoRecyclerView");
                                throw null;
                            }
                            o.LJIJI("videoRecyclerView");
                            throw null;
                        }
                        o.LJIJI("videoRecyclerView");
                        throw null;
                    }
                    o.LJIJI("videoSegAdapter");
                    throw null;
                }
                o.LJIJI("videoRecyclerView");
                throw null;
            }
            o.LJIJI("videoRecyclerView");
            throw null;
        }
        o.LJIJI("videoRecyclerView");
        throw null;
    }
}
