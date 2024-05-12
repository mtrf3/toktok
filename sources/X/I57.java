package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS11S0010000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I57 extends AnimatorListenerAdapter {
    public final /* synthetic */ I56 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        Activity activity = this.LJLIL.mActivity;
        if (activity != null && activity.isFinishing()) {
            return;
        }
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.LJLIL.LJLLLLLL;
        if (cutVideoSpeedViewModel != null) {
            cutVideoSpeedViewModel.setState(new AqS11S0010000_6(true, 4));
            TextView textView = this.LJLIL.LJLL;
            if (textView != null) {
                textView.setVisibility(8);
                View view = this.LJLIL.LJLJJLL;
                if (view != null) {
                    view.setVisibility(0);
                    if (this.LJLILLLLZI) {
                        VideoEditViewModel videoEditViewModel = this.LJLIL.LJLLJ;
                        if (videoEditViewModel != null) {
                            List<VideoSegment> kv0 = videoEditViewModel.kv0();
                            CutVideoListViewModel cutVideoListViewModel = this.LJLIL.LL;
                            if (cutVideoListViewModel != null) {
                                String LJII = ((VideoSegment) ListProtector.get(kv0, cutVideoListViewModel.LJLJL)).LJII(true);
                                CutVideoContext value = videoEditViewModel.LLD.getValue();
                                if (value != null) {
                                    Iterator<VideoSegment> it = value.getVideoSegmentList().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        VideoSegment next = it.next();
                                        if (next.LJII(true).equals(LJII)) {
                                            I5U i5u = videoEditViewModel.LLFFF;
                                            if (i5u != null) {
                                                I56 i56 = i5u.LIZ;
                                                System.currentTimeMillis();
                                                i56.getClass();
                                                C46048I5k c46048I5k = i5u.LIZ.LJLIL;
                                                if (c46048I5k != null) {
                                                    c46048I5k.LJZ(next);
                                                }
                                            }
                                            next.isDeleted = true;
                                        }
                                    }
                                }
                            } else {
                                o.LJIJI("cutVideoListViewModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("videoEditViewModel");
                            throw null;
                        }
                    }
                    C46048I5k c46048I5k2 = this.LJLIL.LJLIL;
                    o.LJI(c46048I5k2);
                    c46048I5k2.LJLJJI = true;
                    I56 i562 = this.LJLIL;
                    CutVideoBottomBarViewModel cutVideoBottomBarViewModel = i562.LJLZ;
                    if (cutVideoBottomBarViewModel != null) {
                        I53 i53 = i562.LJLJJI;
                        if (i53 != null) {
                            cutVideoBottomBarViewModel.Mv0(i53.LJJJ().getSelectedTime());
                            this.LJLIL.LLFZ = false;
                            return;
                        } else {
                            o.LJIJI("previewEditCallback");
                            throw null;
                        }
                    }
                    o.LJIJI("bottomBarViewModel");
                    throw null;
                }
                o.LJIJI("animTabDot");
                throw null;
            }
            o.LJIJI("singleEditTitle");
            throw null;
        }
        o.LJIJI("speedViewModel");
        throw null;
    }

    public I57(I56 i56, boolean z) {
        this.LJLIL = i56;
        this.LJLILLLLZI = z;
    }
}
