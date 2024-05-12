package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import X.C10K;
import X.C16880lQ;
import X.C170676mt;
import X.C2068389v;
import X.C221108m2;
import X.C41028G8i;
import X.C42301Giv;
import X.C42883GsJ;
import X.C43882HKc;
import X.C44694HgQ;
import X.C45495HtL;
import X.C45508HtY;
import X.C45700Hwe;
import X.C45794HyA;
import X.C52243Ket;
import X.C5KD;
import X.C5NI;
import X.C60903NvH;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C77357UXp;
import X.C78764Uvg;
import X.C81996WGa;
import X.C81997WGb;
import X.InterfaceC45640Hvg;
import X.InterpolatorC61446O9q;
import X.OSZ;
import X.W5G;
import X.WGQ;
import X.WGR;
import X.WGT;
import X.WGW;
import X.WGX;
import X.WGY;
import X.WGZ;
import X.YO7;
import Y.ACallableS117S0100000_14;
import Y.ARunnableS50S0100000_14;
import a04.IDfS1S0100000_14;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class PreviewVideoScene extends UserVisibleHintGroupScene implements InterfaceC45640Hvg {
    public final boolean LJLIL;
    public final CreativeInfo LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public WGZ LJLJJLL;
    public MyMediaModel LJLJL;
    public WGT LJLJLJ;
    public int LJLJLLL;
    public TTVideoEngine LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public Surface LJLLLL;
    public long LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public View LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public boolean LLD;
    public final C62822Ol8 LLF;
    public OSZ<Integer, Integer> LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final ARunnableS50S0100000_14 LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;

    @Override // X.InterfaceC45640Hvg
    public final void LJIIJ() {
        LLJJ(true);
    }

    @Override // X.InterfaceC45640Hvg
    public final void LJJIJL() {
        this.LLII = false;
        if (LLJJI()) {
            LLJJIII().post(this.LLIFFJFJJ);
        }
        if (LLJJIJIL() != null && !this.LLIIII) {
            LLJJJ();
        }
        SceneExtensionsKt.LIZJ(this, new ARunnableS50S0100000_14(this, 91), 300L);
    }

    @Override // X.InterfaceC45640Hvg
    public final void LLIIJI() {
        this.LLII = true;
        if (LLJJI()) {
            LLJJIII().removeCallbacks(this.LLIFFJFJJ);
        }
        LLJJJIL();
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 1) {
            TTVideoEngine tTVideoEngine2 = this.LJLL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LJJL();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }

    public final void LLJILJILJ() {
        this.LLD = false;
        if (((View) this.LL.getValue()).getVisibility() == 0) {
            ((C42883GsJ) this.LL.getValue()).setVisibility(8);
        }
    }

    public final void LLJJJ() {
        WGT wgt;
        OSZ<Integer, Integer> osz;
        ChoosePhotoPreviewPageConfig LJJZZI;
        int i;
        long j;
        int i2;
        ChoosePhotoPreviewPageConfig LJJZZI2;
        this.LLIIII = true;
        MyMediaModel myMediaModel = this.LJLJL;
        if (myMediaModel != null) {
            WGT wgt2 = this.LJLJLJ;
            int i3 = 0;
            if ((wgt2 != null && (LJJZZI2 = wgt2.LJJZZI()) != null && LJJZZI2.isUgcTemplate) || ((wgt = this.LJLJLJ) != null && (LJJZZI = wgt.LJJZZI()) != null && LJJZZI.isEditorProReplace)) {
                if (myMediaModel.selectIndex >= 0) {
                    j = myMediaModel.clipDuration;
                    if (j <= 0) {
                        i2 = myMediaModel.endTime;
                        osz = new OSZ<>(Integer.valueOf(myMediaModel.startTime), Integer.valueOf(i2));
                    }
                } else {
                    j = myMediaModel.duration;
                }
                i2 = (int) j;
                osz = new OSZ<>(Integer.valueOf(myMediaModel.startTime), Integer.valueOf(i2));
            } else {
                Integer valueOf = Integer.valueOf(myMediaModel.startTime);
                int i4 = myMediaModel.endTime;
                if (i4 <= 0) {
                    i4 = (int) myMediaModel.duration;
                }
                osz = new OSZ<>(valueOf, Integer.valueOf(i4));
            }
            this.LLFF = osz;
            YO7 LLJJIJIL = LLJJIJIL();
            if (LLJJIJIL != null) {
                C5KD c5kd = new C5KD(new String[]{myMediaModel.fileLocalUriPath});
                c5kd.LIZIZ(C5NI.VIDEO_OUT_RATIO_ORIGINAL);
                c5kd.LJI = new float[]{1.0f};
                LLJJIJIL.LLILII(c5kd);
                OSZ<Integer, Integer> osz2 = this.LLFF;
                if (osz2 != null) {
                    i = osz2.getFirst().intValue();
                } else {
                    i = 0;
                }
                OSZ<Integer, Integer> osz3 = this.LLFF;
                if (osz3 != null) {
                    i3 = osz3.getSecond().intValue();
                }
                LLJJIJIL.LLLFZ(i, i3);
                LLJJIJIL.LLLFFI(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE);
                LLJJIJIL.LLJILJIL(true);
                LLJJIJIL.LLIIII(new C81996WGa(this));
                LLJJIJIL.LLILLJJLI(103);
                LLJJIJIL.prepare();
            }
        }
    }

    @Override // X.InterfaceC45640Hvg
    public final boolean LJLLI() {
        C45495HtL c45495HtL;
        MyMediaModel myMediaModel = this.LJLJL;
        if (myMediaModel == null || (c45495HtL = myMediaModel.libraryState) == null) {
            return true;
        }
        if (c45495HtL.isComplete() && !this.LJLLILLLL) {
            return true;
        }
        if (c45495HtL.getLastDownloadFailed() && c45495HtL.isLoading()) {
            return true;
        }
        return false;
    }

    public final WGQ LLJILJIL() {
        WGQ wgq = new WGQ();
        wgq.LJ = 220L;
        wgq.LJFF = 220L;
        wgq.LJI = 220L;
        wgq.LJII = 220L;
        OSZ<PointF, PointF> osz = WGW.LIZ;
        wgq.LIZ = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        wgq.LIZIZ = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        wgq.LIZJ = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        wgq.LIZLLL = new InterpolatorC61446O9q(osz.getFirst(), osz.getSecond());
        return wgq;
    }

    public final boolean LLJJI() {
        return ((Boolean) this.LLFII.getValue()).booleanValue();
    }

    public final SafeHandler LLJJIII() {
        return (SafeHandler) this.LLI.getValue();
    }

    public final TextureView LLJJIJI() {
        return (TextureView) this.LJLZ.getValue();
    }

    public final W5G LLJJIJIIJIL() {
        return (W5G) this.LJZI.getValue();
    }

    public final YO7 LLJJIJIL() {
        return (YO7) this.LLFZ.getValue();
    }

    public final void LLJJL() {
        String str;
        MyMediaModel myMediaModel = this.LJLJL;
        if (myMediaModel == null) {
            return;
        }
        C45495HtL c45495HtL = myMediaModel.libraryState;
        if (c45495HtL == null || c45495HtL.isSucceed()) {
            C78764Uvg.LJIIIZ(LLJJIJIIJIL(), C44694HgQ.LJIIIIZZ(myMediaModel.fileLocalUriPath).toString(), -1, -1);
        } else {
            if ((!myMediaModel.libraryState.notDownloaded() && !myMediaModel.libraryState.isLoading()) || (str = myMediaModel.thumbnail) == null || str.length() <= 0) {
                return;
            }
            C170676mt.LIZIZ(LLJJIJIIJIL(), str, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // X.InterfaceC45640Hvg
    public final void LJJIJLIJ() {
        if (LLJJI()) {
            LLJJIII().post(this.LLIFFJFJJ);
        }
        LLJJLIIIJLLLLLLLZ();
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 2) {
            TTVideoEngine tTVideoEngine2 = this.LJLL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LJJLI();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }

    public final void LLJJJIL() {
        YO7 LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            LLJJIJIL.pause();
        }
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 1) {
            TTVideoEngine tTVideoEngine2 = this.LJLL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LJJL();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }

    public final void LLJJJJ() {
        if (C41028G8i.LIZ()) {
            this.LLD = true;
            SceneExtensionsKt.LIZJ(this, new ARunnableS50S0100000_14(this, 93), C42301Giv.LIZ());
        } else {
            ((C42883GsJ) this.LL.getValue()).setVisibility(0);
        }
    }

    public final void LLJJLIIIJLLLLLLLZ() {
        YO7 LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            if (!this.LLIIII) {
                LLJJJ();
            }
            LLJJIJIL.play();
        }
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 2) {
            TTVideoEngine tTVideoEngine2 = this.LJLL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LJJLI();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        int i;
        super.onDestroyView();
        YO7 LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            C10K.LIZJ(new ACallableS117S0100000_14(LLJJIJIL, 2));
        }
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
            Surface surface = this.LJLLLL;
            if (surface != null) {
                surface.release();
            }
            if (this.LJLLI) {
                boolean z = this.LJLLL;
                JSONObject jSONObject = new JSONObject();
                if (this.LJLJJLL == WGZ.DISABLE_4K) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("is_4k", i);
                jSONObject.put("error_code", this.LJLJJI);
                jSONObject.put("error_message", this.LJLJJL);
                jSONObject.put("display_status", this.LJLJJLL.ordinal());
                jSONObject.put("player_type", this.LJLJI);
                if (this.LJLL != null) {
                    jSONObject.put("video_watched_duration", Float.valueOf(r0.LJJJJI() / 1000));
                    C43882HKc.LIZLLL(z ? 1 : 0, "tool_performance_preview_video_play_status", jSONObject, true);
                } else {
                    o.LJIJI("videoEngine");
                    throw null;
                }
            }
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        if (LLJJI()) {
            LLJJIII().removeCallbacks(this.LLIFFJFJJ);
        }
        LLJJJIL();
        if (this.mUserVisibleHint && this.LJLLI) {
            TTVideoEngine tTVideoEngine = this.LJLL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJL();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (this.mUserVisibleHint && this.LJLLI) {
            TTVideoEngine tTVideoEngine = this.LJLL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJLI();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        }
        if (LLJJIJIL() != null) {
            if (isVisible() && !this.LLIIII) {
                LLJJJ();
            }
            SceneExtensionsKt.LIZJ(this, new ARunnableS50S0100000_14(this, 92), 300L);
        }
    }

    @Override // X.WM7
    public final void onStop() {
        WGT wgt;
        ChoosePhotoPreviewPageConfig LJJZZI;
        WGT wgt2;
        C45700Hwe LJJJIL;
        ChoosePhotoPreviewPageConfig LJJZZI2;
        super.onStop();
        WGT wgt3 = this.LJLJLJ;
        if (((wgt3 != null && (LJJZZI2 = wgt3.LJJZZI()) != null && LJJZZI2.isUgcTemplate) || ((wgt = this.LJLJLJ) != null && (LJJZZI = wgt.LJJZZI()) != null && LJJZZI.isEditorProReplace)) && (wgt2 = this.LJLJLJ) != null && (LJJJIL = wgt2.LJJJIL()) != null) {
            LJJJIL.LJLJLJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC45640Hvg
    public final void LLJIJIL(MyMediaModel myMediaModel) {
        this.LJLJL = myMediaModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ(boolean r9) {
        /*
            r8 = this;
            X.WGT r0 = r8.LJLJLJ
            if (r0 == 0) goto L7
            r0.LJJJJZI()
        L7:
            X.Ol8 r0 = r8.LLF
            java.lang.Object r1 = r0.getValue()
            X.Spp r1 = (X.C73305Spp) r1
            r0 = 8
            r1.setVisibility(r0)
            X.WGT r0 = r8.LJLJLJ
            if (r0 == 0) goto L51
            android.view.View r0 = r0.LJJLJLI()
            if (r0 == 0) goto L51
            X.WGc r1 = new X.WGc
            r1.<init>(r0)
            X.WGT r0 = r8.LJLJLJ
            if (r0 == 0) goto L2a
            r0.LJJJLL()
        L2a:
            android.view.View r0 = r8.LJZ
            X.WGR r2 = X.WGW.LIZ(r0)
            if (r2 == 0) goto L51
            android.graphics.Rect r3 = r1.LIZIZ()
            android.graphics.Rect r4 = r1.LIZJ()
            X.UXp r5 = new X.UXp
            r5.<init>()
            X.WGQ r6 = r8.LLJILJIL()
            kotlin.jvm.internal.AqS164S0100000_14 r7 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 145(0x91, float:2.03E-43)
            r7.<init>(r8, r0)
            r2.LIZ(r3, r4, r5, r6, r7)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L58
        L51:
            X.WGT r0 = r8.LJLJLJ
            if (r0 == 0) goto L58
            r0.onExit()
        L58:
            X.5oB r3 = new X.5oB
            r3.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r8.LJLLLLLL
            long r4 = r4 - r0
            java.lang.String r0 = "duration"
            r3.LIZIZ(r4, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            android.view.TextureView r0 = r8.LLJJIJI()
            int r0 = r0.getWidth()
            r1.append(r0)
            r4 = 42
            r1.append(r4)
            android.view.TextureView r0 = r8.LLJJIJI()
            int r0 = r0.getHeight()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "resolution"
            r3.LJI(r0, r1)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r0 = r8.LJLJL
            r1 = 0
            if (r0 == 0) goto Ld3
            int r0 = r0.width
        L9c:
            r2.append(r0)
            r2.append(r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r0 = r8.LJLJL
            if (r0 == 0) goto La8
            int r1 = r0.width
        La8:
            r2.append(r1)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "original_resolution"
            r3.LJI(r0, r1)
            java.lang.String r1 = "content_cnt"
            int r0 = r8.LJLJLLL
            r3.LIZ(r0, r1)
            java.lang.String r0 = "fps"
            r1 = -1
            r3.LIZ(r1, r0)
            java.lang.String r0 = "lag_count"
            r3.LIZ(r1, r0)
            java.lang.String r0 = "lag_total_duration"
            r3.LIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "tool_performance_content_preview"
            X.GXR.LIZ(r0, r1)
            return
        Ld3:
            r0 = 0
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene.LLJJ(boolean):void");
    }

    public final void LLJLIL(OSZ<Integer, Integer> range) {
        OSZ<Integer, Integer> osz;
        o.LJIIIZ(range, "range");
        MyMediaModel myMediaModel = this.LJLJL;
        if (myMediaModel == null || myMediaModel.fileLocalUriPath == null) {
            return;
        }
        OSZ<Integer, Integer> osz2 = this.LLFF;
        if (osz2 != null && range.getFirst().intValue() == osz2.getFirst().intValue() && (osz = this.LLFF) != null && range.getSecond().intValue() == osz.getSecond().intValue()) {
            return;
        }
        this.LLFF = range;
        YO7 LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            LLJJIJIL.LLLFZ(range.getFirst().intValue(), range.getSecond().intValue());
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        String str;
        String str2;
        MyMediaModel myMediaModel;
        int i2;
        C45495HtL c45495HtL;
        String str3;
        View LJJLJLI;
        WGT wgt;
        int i3;
        int i4;
        C45495HtL c45495HtL2;
        MyMediaModel myMediaModel2;
        super.onActivityCreated(bundle);
        this.LJLLLLLL = System.currentTimeMillis();
        LLJJIJI().setVisibility(8);
        LLJJIJIIJIL().setVisibility(8);
        ((ImageView) this.LJZL.getValue()).setVisibility(8);
        MyMediaModel myMediaModel3 = this.LJLJL;
        if (myMediaModel3 != null) {
            i = myMediaModel3.width;
        } else {
            i = 0;
        }
        if (i <= 0 ? myMediaModel3 != null : !(myMediaModel3 == null || myMediaModel3.height > 0)) {
            String str4 = myMediaModel3.fileLocalUriPath;
            if (str4 != null) {
                C60903NvH.LJIIJJI().LJIJ();
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str4);
                if (videoFileInfo != null && (myMediaModel2 = this.LJLJL) != null) {
                    myMediaModel2.width = videoFileInfo.width;
                    myMediaModel2.height = videoFileInfo.height;
                }
            }
        }
        MyMediaModel myMediaModel4 = this.LJLJL;
        if (myMediaModel4 != null && (c45495HtL2 = myMediaModel4.libraryState) != null && c45495HtL2.isFailed()) {
            ((C73305Spp) this.LLF.getValue()).setVisibility(0);
            C73305Spp c73305Spp = (C73305Spp) this.LLF.getValue();
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_refresh;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            String string = requireActivity().getString(R.string.fnd);
            o.LJIIIIZZ(string, "requireActivity().getStr…o_preview_loading_failed)");
            c73306Spq.LJFF = string;
            c73306Spq.LJIIIIZZ = new AqS180S0100000_14(this, 157);
            c73305Spp.setStatus(c73306Spq);
        } else {
            MyMediaModel myMediaModel5 = this.LJLJL;
            if (myMediaModel5 == null || myMediaModel5.libraryState == null) {
                if (myMediaModel5 != null) {
                    str = myMediaModel5.fileLocalUriPath;
                } else {
                    str = null;
                }
                if (!C45508HtY.LIZIZ(str, true)) {
                    this.LJLJJLL = WGZ.FILE_DELETED;
                    ((ImageView) this.LJZL.getValue()).setVisibility(0);
                }
            }
            if (WGW.LIZIZ(this.LJLJL)) {
                this.LJLJJLL = WGZ.DISABLE_4K;
                LLJJIJIIJIL().setVisibility(0);
                LLJJL();
            } else {
                this.LJLJJLL = WGZ.NORMAL_VIDEO_PLAY;
                LLJJIJIIJIL().setVisibility(0);
                LLJJL();
                LLJJIJI().setVisibility(0);
                LLJJJJ();
                if (LLJJIJIL() != null) {
                    MyMediaModel myMediaModel6 = this.LJLJL;
                    if (myMediaModel6 != null) {
                        C78764Uvg.LJIIIZ(LLJJIJIIJIL(), C44694HgQ.LJIIIIZZ(myMediaModel6.fileLocalUriPath).toString(), -1, -1);
                    }
                    LLJJJ();
                } else {
                    this.LJLJI = 0;
                    TTVideoEngine tTVideoEngine = new TTVideoEngine(C16880lQ.LLLLJ(requireActivity()), this.LJLJI);
                    this.LJLL = tTVideoEngine;
                    tTVideoEngine.LLILZ("preview");
                    TTVideoEngine tTVideoEngine2 = this.LJLL;
                    if (tTVideoEngine2 != null) {
                        tTVideoEngine2.LLFII(true);
                        MyMediaModel myMediaModel7 = this.LJLJL;
                        if (myMediaModel7 == null || (c45495HtL = myMediaModel7.libraryState) == null || c45495HtL.isSucceed()) {
                            TTVideoEngine tTVideoEngine3 = this.LJLL;
                            if (tTVideoEngine3 != null) {
                                MyMediaModel myMediaModel8 = this.LJLJL;
                                if (myMediaModel8 != null) {
                                    str2 = myMediaModel8.fileLocalUriPath;
                                } else {
                                    str2 = null;
                                }
                                tTVideoEngine3.LL(str2);
                            } else {
                                o.LJIJI("videoEngine");
                                throw null;
                            }
                        } else {
                            TTVideoEngine tTVideoEngine4 = this.LJLL;
                            if (tTVideoEngine4 != null) {
                                MyMediaModel myMediaModel9 = this.LJLJL;
                                if (myMediaModel9 != null) {
                                    str3 = myMediaModel9.thumbnail;
                                } else {
                                    str3 = null;
                                }
                                tTVideoEngine4.LJLJJLL(str3);
                            } else {
                                o.LJIJI("videoEngine");
                                throw null;
                            }
                        }
                        if (C52243Ket.LIZ() && (myMediaModel = this.LJLJL) != null) {
                            int i5 = myMediaModel.width;
                            int i6 = myMediaModel.height;
                            if (i5 < i6) {
                                i2 = i6;
                            } else {
                                i2 = i5;
                            }
                            if (i5 > i6) {
                                i5 = i6;
                            }
                            if (i2 >= 4096 || i5 >= 2160) {
                                TTVideoEngine tTVideoEngine5 = this.LJLL;
                                if (tTVideoEngine5 != null) {
                                    tTVideoEngine5.LJLLLL(7, 1);
                                } else {
                                    o.LJIJI("videoEngine");
                                    throw null;
                                }
                            }
                        }
                        TTVideoEngine tTVideoEngine6 = this.LJLL;
                        if (tTVideoEngine6 != null) {
                            tTVideoEngine6.LJZI(new IDfS1S0100000_14(this, 3));
                            LLJJIJI().setSurfaceTextureListener(new WGY(this));
                        } else {
                            o.LJIJI("videoEngine");
                            throw null;
                        }
                    } else {
                        o.LJIJI("videoEngine");
                        throw null;
                    }
                }
            }
        }
        View requireViewById = requireViewById(R.id.drn);
        this.LJZ = requireViewById;
        WGR LIZ = WGW.LIZ(requireViewById);
        if (LIZ != null) {
            MyMediaModel myMediaModel10 = this.LJLJL;
            if (myMediaModel10 != null) {
                i3 = myMediaModel10.width;
                i4 = myMediaModel10.height;
            } else {
                i3 = 0;
                i4 = 0;
            }
            LIZ.setVideoSize(i3, i4);
            LIZ.setGestureListener(new WGX(this));
        }
        WGT wgt2 = this.LJLJLJ;
        if (wgt2 != null && (LJJLJLI = wgt2.LJJLJLI()) != null && (wgt = this.LJLJLJ) != null && wgt.LJJJLZIJ()) {
            WGT wgt3 = this.LJLJLJ;
            if (wgt3 != null) {
                wgt3.LJLIIIL();
            }
            C81997WGb c81997WGb = new C81997WGb(LJJLJLI);
            WGR LIZ2 = WGW.LIZ(this.LJZ);
            if (LIZ2 != null) {
                LIZ2.LIZIZ(c81997WGb.LIZIZ(), c81997WGb.LIZJ(), new C77357UXp(), LLJILJIL());
            }
        }
        getUserVisibleHintLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene$onActivityCreated$4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                WGT wgt4;
                PreviewVideoScene previewVideoScene = PreviewVideoScene.this;
                WGZ wgz = previewVideoScene.LJLJJLL;
                if (wgz == WGZ.FILE_DELETED) {
                    WGT wgt5 = previewVideoScene.LJLJLJ;
                    if (wgt5 != null) {
                        wgt5.LLILZ(R.string.h46);
                        return;
                    }
                    return;
                }
                if (wgz != WGZ.DISABLE_4K || (wgt4 = previewVideoScene.LJLJLJ) == null) {
                    return;
                }
                wgt4.LLILZ(R.string.tgs);
            }
        });
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void setUserVisibleHint(boolean z) {
        WGR LIZ;
        super.setUserVisibleHint(z);
        if (!z && (LIZ = WGW.LIZ(this.LJZ)) != null) {
            LIZ.reset();
        }
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine != null) {
            if (this.LJLLI) {
                if (z) {
                    tTVideoEngine.LJJLI();
                    return;
                }
                tTVideoEngine.LJJL();
                TTVideoEngine tTVideoEngine2 = this.LJLL;
                if (tTVideoEngine2 != null) {
                    tTVideoEngine2.LJJLIIIJLJLI(0, null);
                    return;
                } else {
                    o.LJIJI("videoEngine");
                    throw null;
                }
            }
            if (this.LJLLJ || this.LJLLLL == null || !z) {
                return;
            }
            tTVideoEngine.LJJLI();
        }
    }

    public PreviewVideoScene(CreativeInfo creativeInfo, boolean z) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LJLIL = z;
        this.LJLILLLLZI = creativeInfo;
        this.LJLJI = 2;
        this.LJLJJL = "";
        this.LJLJJLL = WGZ.NONE;
        this.LJLZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 254));
        this.LJZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 255));
        this.LJZL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 150));
        this.LL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 253));
        this.LLD = true;
        this.LLF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 152));
        this.LLFFF = C221108m2.LIZIZ(C45794HyA.LJLIL);
        this.LLFII = C221108m2.LIZIZ(new AqS164S0100000_14(this, 151));
        this.LLFZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 154));
        this.LLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 153));
        this.LLIFFJFJJ = new ARunnableS50S0100000_14(this, 95);
    }

    @Override // X.InterfaceC45640Hvg
    public final void LLIIIJ(int i, WGT controller) {
        o.LJIIIZ(controller, "controller");
        this.LJLJLLL = i;
        this.LJLJLJ = controller;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (this.LJLIL) {
            i = R.layout.ce3;
        } else {
            i = R.layout.ce2;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
    }
}
