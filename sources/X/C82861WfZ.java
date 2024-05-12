package X;

import Y.ACListenerS34S0100000_14;
import Y.AObserverS70S0100000_2;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS1S0102000_6;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WfZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82861WfZ extends AbstractC56012Ht<C6GQ, C6GX> {
    public CutMultiVideoViewModel LJLIL;
    public VideoEditViewModel LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 173));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 171));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 172));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 174));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 292));
    public final C6HV LJLJLJ = new C6HV(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing, null);

    public final C82858WfW LLJILJIL() {
        return (C82858WfW) this.LJLJJLL.getValue();
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 37), (View) this.LJLJI.getValue());
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 38), (View) this.LJLJJI.getValue());
        LLJILJIL().setMinVideoLength(100L);
        C82858WfW LLJILJIL = LLJILJIL();
        SettingsManager.LIZLLL().getClass();
        LLJILJIL.setMaxVideoLength(SettingsManager.LJFF("video2sticker_max_selected_duration", 2500L));
        LLJILJIL().LJLIL = false;
        LLJILJIL().setExtractFramesInRoughMode(true);
        Activity activity = this.mActivity;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLILLLLZI = (VideoEditViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(VideoEditViewModel.class);
        Activity activity2 = this.mActivity;
        o.LJII(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.LJLIL = (CutMultiVideoViewModel) ViewModelProviders.of((ActivityC45651qj) activity2).get(CutMultiVideoViewModel.class);
        C82858WfW LLJILJIL2 = LLJILJIL();
        ViewModelProvider LJIIIIZZ = C165706es.LJIIIIZZ(this, null, null, 6);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLIL;
        if (cutMultiVideoViewModel != null) {
            LLJILJIL2.LJFF(this, LJIIIIZZ, cutMultiVideoViewModel, getUiActions().LJLJI.invoke());
            LLJILJIL().setOnSelectMinTime(new AqS164S0100000_14(this, 170));
            C82858WfW LLJILJIL3 = LLJILJIL();
            int i = (int) ((Video2StickerModel) this.LJLJL.getValue()).videoTimeTrimData.startTime;
            C82849WfN c82849WfN = LLJILJIL3.LLIIII;
            long j2 = c82849WfN.LIZLLL;
            long j3 = i;
            long j4 = j2 - j3;
            long j5 = c82849WfN.LJFF;
            if (j4 < j5) {
                long j6 = j2 - j5;
                j = j3 - j6;
                j3 = j6;
            } else {
                j = 0;
            }
            if (j3 != 0) {
                int i2 = (int) ((((float) j3) * 1.0f) / c82849WfN.LJ);
                if (C79255V8p.LIZ(LLJILJIL3.LJLJJLL)) {
                    i2 = -i2;
                }
                LLJILJIL3.LJLJLJ.sv0(LLJILJIL3.LLILLL, i2);
                LLJILJIL3.LLIIIL.LJLI(0);
                LLJILJIL3.LLIIIL.post(new ARunnableS1S0102000_6(i2, 0, LLJILJIL3, 0));
            }
            if (j != 0) {
                LLJILJIL3.LJLLI.setStartX(((((float) j) * 1.0f) / LLJILJIL3.LLIIII.LJ) + LLJILJIL3.LLJZ);
                LLJILJIL3.LJJ((int) LLJILJIL3.LJLLI.getStartX(), (int) LLJILJIL3.LJLL.getStartX());
                LLJILJIL3.setCurPointerContainerStartX(LLJILJIL3.LJLLI.getStartX() + C82848WfM.LIZJ);
            }
            LLJILJIL3.LJII();
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6GU
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C6GQ) obj).LJLIL;
                }
            }, null, new AqS180S0100000_14(this, 175), 2, null);
            getUiActions().LJLJLLL.invoke(new AqS180S0100000_14(this, 176));
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6GR
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C6GQ) obj).LJLILLLLZI);
                }
            }, null, new AqS180S0100000_14(this, 177), 2, null);
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5SR
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C6GQ) obj).LJLJI);
                }
            }, null, new AqS180S0100000_14(this, 178), 2, null);
            VideoEditViewModel videoEditViewModel = this.LJLILLLLZI;
            if (videoEditViewModel != null) {
                videoEditViewModel.LJLJI.observe(this, new AObserverS82S0100000_14(this, 29));
                VideoEditViewModel videoEditViewModel2 = this.LJLILLLLZI;
                if (videoEditViewModel2 != null) {
                    videoEditViewModel2.LJLILLLLZI.observe(this, new AObserverS82S0100000_14(this, 30));
                    VideoEditViewModel videoEditViewModel3 = this.LJLILLLLZI;
                    if (videoEditViewModel3 != null) {
                        videoEditViewModel3.LJLJJI.observe(this, new AObserverS70S0100000_2(this, 65));
                        VideoEditViewModel videoEditViewModel4 = this.LJLILLLLZI;
                        if (videoEditViewModel4 != null) {
                            videoEditViewModel4.LJLJJLL.observe(this, new AObserverS82S0100000_14(this, 31));
                            VideoEditViewModel videoEditViewModel5 = this.LJLILLLLZI;
                            if (videoEditViewModel5 != null) {
                                videoEditViewModel5.LJLJJL.observe(this, new AObserverS82S0100000_14(this, 32));
                                VideoEditViewModel videoEditViewModel6 = this.LJLILLLLZI;
                                if (videoEditViewModel6 != null) {
                                    videoEditViewModel6.LJLJL.observe(this, new AObserverS82S0100000_14(this, 33));
                                    VideoEditViewModel videoEditViewModel7 = this.LJLILLLLZI;
                                    if (videoEditViewModel7 != null) {
                                        videoEditViewModel7.LJLL.observe(this, new AObserverS82S0100000_14(this, 24));
                                        VideoEditViewModel videoEditViewModel8 = this.LJLILLLLZI;
                                        if (videoEditViewModel8 != null) {
                                            videoEditViewModel8.LJLLI.observe(this, new AObserverS82S0100000_14(this, 25));
                                            VideoEditViewModel videoEditViewModel9 = this.LJLILLLLZI;
                                            if (videoEditViewModel9 != null) {
                                                videoEditViewModel9.LJLLILLLL.observe(this, new AObserverS82S0100000_14(this, 26));
                                                VideoEditViewModel videoEditViewModel10 = this.LJLILLLLZI;
                                                if (videoEditViewModel10 != null) {
                                                    videoEditViewModel10.LJLJLJ.observe(this, new AObserverS82S0100000_14(this, 27));
                                                    VideoEditViewModel videoEditViewModel11 = this.LJLILLLLZI;
                                                    if (videoEditViewModel11 != null) {
                                                        videoEditViewModel11.LJLJLLL.observe(this, new AObserverS82S0100000_14(this, 28));
                                                        return;
                                                    } else {
                                                        o.LJIJI("videoEditViewModel");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("videoEditViewModel");
                                                throw null;
                                            }
                                            o.LJIJI("videoEditViewModel");
                                            throw null;
                                        }
                                        o.LJIJI("videoEditViewModel");
                                        throw null;
                                    }
                                    o.LJIJI("videoEditViewModel");
                                    throw null;
                                }
                                o.LJIJI("videoEditViewModel");
                                throw null;
                            }
                            o.LJIJI("videoEditViewModel");
                            throw null;
                        }
                        o.LJIJI("videoEditViewModel");
                        throw null;
                    }
                    o.LJIJI("videoEditViewModel");
                    throw null;
                }
                o.LJIJI("videoEditViewModel");
                throw null;
            }
            o.LJIJI("videoEditViewModel");
            throw null;
        }
        o.LJIJI("cutMultiVideoViewModel");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.it, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
