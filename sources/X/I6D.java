package X;

import Y.AObjectS86S0100000_7;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I6D extends I6N {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIZ;
    public final String LJLZ;
    public boolean LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public int LLFF;
    public boolean LLFFF;
    public int LLFII;
    public int LLFZ;
    public final C82632Wbs LLI;
    public final C82632Wbs LLIFFJFJJ;
    public final C82632Wbs LLII;
    public final C82632Wbs LLIIII;
    public final C82632Wbs LLIIIILZ;
    public View LLIIIJ;
    public TextView LLIIIL;

    static {
        TBT tbt = new TBT(I6D.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I6D.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6D.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0, c65351Pkp), C61845OOz.LIZJ(I6D.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0, c65351Pkp), C61845OOz.LIZJ(I6D.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp)};
    }

    @Override // X.I6N
    public final int LLJJI() {
        return R.layout.ip;
    }

    private final EditAdjustClipsBottomViewModel LLJILJIL() {
        return (EditAdjustClipsBottomViewModel) this.LLIIIILZ.LIZ(this, LLIIIZ[4]);
    }

    private final VideoEditViewModel LLJJIJI() {
        return (VideoEditViewModel) this.LLIFFJFJJ.LIZ(this, LLIIIZ[1]);
    }

    public final boolean LLJJJ() {
        C82632Wbs c82632Wbs = this.LLI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIIIZ;
        if (!C78946Uyc.LJIILL((I61) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0])) || !this.LJZ || C44384HbQ.LJJIIZI(((I61) this.LLI.LIZ(this, interfaceC74236TBoArr[0])).LIZJ)) {
            return false;
        }
        return true;
    }

    public final void LLJJJJ() {
        boolean z;
        int i = 0;
        if (LLJILJIL().Ov0().getCurrentTabIndex() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.LLFF != 1) {
            View view = this.LLIIIJ;
            if (view != null) {
                view.setVisibility(8);
                ((I6H) this.LLF.getValue()).show();
                ((I6H) this.LL.getValue()).hide();
                ((I6H) this.LJZI.getValue()).hide();
                if (LLJJJ()) {
                    ((I6H) this.LJZL.getValue()).show();
                    return;
                }
                return;
            }
            o.LJIJI("editViewContainer");
            throw null;
        }
        View view2 = this.LLIIIJ;
        if (view2 != null) {
            view2.setVisibility(0);
            ((I6H) this.LLF.getValue()).hide();
            if (LLJJJ()) {
                ((I6H) this.LJZL.getValue()).show();
            } else {
                ((I6H) this.LJZI.getValue()).show();
            }
            ((I6H) this.LL.getValue()).show();
            TextView textView = this.LLIIIL;
            if (textView != null) {
                if (!LLJJJ()) {
                    i = 8;
                }
                textView.setVisibility(i);
                return;
            }
            o.LJIJI("tvDurationIndicator");
            throw null;
        }
        o.LJIJI("editViewContainer");
        throw null;
    }

    @Override // X.I6N
    public final void initView() {
        super.initView();
        View requireViewById = requireViewById(R.id.ddp);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.fl_edit_view_container)");
        this.LLIIIJ = requireViewById;
        View requireViewById2 = requireViewById(R.id.n41);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.videoEditView)");
        this.LJLJJL = (I50) requireViewById2;
        View requireViewById3 = requireViewById(R.id.m5w);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.tv_duration_indicator)");
        this.LLIIIL = (TextView) requireViewById3;
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLZ;
    }

    public final void LLJJLIIIJLLLLLLLZ(OSZ<Integer, Integer> osz) {
        String str;
        String str2;
        TextView textView = this.LLIIIL;
        if (textView != null) {
            textView.setVisibility(8);
            VideoSegment curEditVideo = (VideoSegment) ListProtector.get(LLJJIJI().kv0(), osz.getSecond().intValue());
            this.LJZ = false;
            ((I6H) this.LJZL.getValue()).hide();
            ((I6H) this.LL.getValue()).hide();
            ((I6H) this.LJZI.getValue()).show();
            if (LLJILJIL().Ov0().getCurrentTabIndex() == 0) {
                I5Z i5z = (I5Z) this.LJLLLL.getValue();
                if (i5z.LJLL.isShowing(i5z)) {
                    i5z.LJLL.remove(i5z);
                }
            } else {
                ((I5Z) this.LJLLLL.getValue()).show();
            }
            I6E i6e = (I6E) this.LLD.getValue();
            i6e.show();
            o.LJIIIIZZ(curEditVideo, "curEditVideo");
            if (TextUtils.isEmpty(curEditVideo.thumbnail)) {
                str = curEditVideo.LJII(false);
                str2 = "video.getPath(false)";
            } else {
                str = curEditVideo.thumbnail;
                str2 = "video.thumbnail";
            }
            o.LJIIIIZZ(str, str2);
            W5G w5g = i6e.LJLJJL;
            if (w5g != null) {
                C162366Yu.LIZ(w5g, str, C78127UlP.LIZJ(637534207, 637534207, 0, SFS.LJI(2.0d)), SFS.LJI(48.0d), (C162396Yx) i6e.LJLL.LIZ(i6e, I6E.LJLLI[2]));
                ((I6G) this.LLIIII.LIZ(this, LLIIIZ[3])).NU(osz.getFirst().intValue(), osz.getSecond().intValue());
                return;
            } else {
                o.LJIJI("ivCover");
                throw null;
            }
        }
        o.LJIJI("tvDurationIndicator");
        throw null;
    }

    @Override // X.I6N, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLJILJIL().Iv0(this, new TBT() { // from class: X.I67
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getAddVideosEvent();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 421));
        LLJILJIL().Iv0(this, new TBT() { // from class: X.I63
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getModeChangeEvent();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 422));
        LLJILJIL().Iv0(this, new TBT() { // from class: X.I6L
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getStickPointStatus());
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 423));
        LLJILJIL().Iv0(this, new TBT() { // from class: X.I6J
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getCurrentTabIndex());
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 424));
        LLJILJIL().Iv0(this, new TBT() { // from class: X.I6K
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getSelectTime();
            }
        }, new C73165SnZ(), new AqS169S0100000_3(this, 1012));
        LLJJIJI().LJLLL.observe(this, new AObjectS86S0100000_7(this, 265));
        LLJJIJI().LJLLLL.observe(this, new AObjectS86S0100000_7(this, 266));
        LLJJIJI().LJLLLLLL.observe(this, new AObjectS86S0100000_7(this, 267));
        LLJJIJI().LJLZ.observe(this, new AObjectS86S0100000_7(this, 268));
        LLJILJILJ().LJLLI.observe(this, new AObjectS86S0100000_7(this, 269));
        LLJJJJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I6D(C82622Wbi diContainer, C46084I6u parentScene) {
        super(diContainer, parentScene);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLZ = "MultiClipsAdjustBottomScene";
        this.LJZ = true;
        this.LJZI = C221108m2.LIZIZ(new AqS154S0200000_7(diContainer, this, 150));
        this.LJZL = C221108m2.LIZIZ(new AqS154S0200000_7(diContainer, this, 145));
        this.LL = C221108m2.LIZIZ(new AqS154S0200000_7(diContainer, this, 146));
        this.LLD = C221108m2.LIZIZ(new AqS154S0200000_7(diContainer, this, 147));
        this.LLF = C221108m2.LIZIZ(new AqS154S0200000_7(diContainer, this, 148));
        this.LLFF = 1;
        this.LLFFF = true;
        this.LLFII = -1;
        this.LLFZ = -1;
        this.LLI = UCI.LJI(this.LJLIL, I61.class, null);
        this.LLIFFJFJJ = UCI.LJI(this.LJLIL, VideoEditViewModel.class, null);
        this.LLII = UCI.LJI(this.LJLIL, InterfaceC146755pP.class, null);
        this.LLIIII = UCI.LJI(this.LJLIL, I6G.class, null);
        this.LLIIIILZ = UCI.LJI(this.LJLIL, EditAdjustClipsBottomViewModel.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void LLJJL(boolean z, boolean z2) {
        int i;
        ?? r3;
        if (z2) {
            VideoEditViewModel LLJJIJI = LLJJIJI();
            o.LJIIIZ(LLJJIJI, "<this>");
            List<VideoSegment> ov0 = LLJJIJI.ov0();
            if (ov0 != null) {
                r3 = new ArrayList();
                for (VideoSegment videoSegment : ov0) {
                    if (!videoSegment.isDeleted) {
                        r3.add(videoSegment);
                    }
                }
            } else {
                r3 = C61878OQg.INSTANCE;
            }
            if (r3.isEmpty()) {
                ((I6G) this.LLII.LIZ(this, LLIIIZ[2])).q10();
                return;
            }
        }
        this.LJZ = true;
        I5Z i5z = (I5Z) this.LJLLLL.getValue();
        if (i5z.LJLL.isShowing(i5z)) {
            i5z.LJLL.remove(i5z);
        }
        ((I6H) this.LLD.getValue()).hide();
        if (LLJJJ()) {
            ((I6H) this.LJZI.getValue()).hide();
            ((I6H) this.LJZL.getValue()).show();
        }
        ((I6H) this.LL.getValue()).show();
        ((I6G) this.LLIIII.LIZ(this, LLIIIZ[3])).Uj0(z, z2);
        TextView textView = this.LLIIIL;
        if (textView != null) {
            if (LLJJJ()) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            return;
        }
        o.LJIJI("tvDurationIndicator");
        throw null;
    }

    public final void LLJJJIL(OSZ<Integer, Integer> osz, OSZ<Integer, Integer> osz2, boolean z) {
        LLJJIII().LJIIIIZZ();
        ((I6G) this.LLIIII.LIZ(this, LLIIIZ[3])).Gp0(osz, osz2, z);
    }
}
