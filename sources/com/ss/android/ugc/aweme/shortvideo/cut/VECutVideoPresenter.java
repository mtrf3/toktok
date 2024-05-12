package com.ss.android.ugc.aweme.shortvideo.cut;

import X.ActivityC45651qj;
import X.C10K;
import X.C113554cx;
import X.C122034qd;
import X.C139895eL;
import X.C145805ns;
import X.C15070iV;
import X.C16880lQ;
import X.C17N;
import X.C221108m2;
import X.C43117Gw5;
import X.C43882HKc;
import X.C44502HdK;
import X.C44503HdL;
import X.C44505HdN;
import X.C44506HdO;
import X.C44513HdV;
import X.C44660Hfs;
import X.C5KL;
import X.C62822Ol8;
import X.C6HJ;
import X.C6HV;
import X.C6HW;
import X.C73994T2g;
import X.C77119UOl;
import X.C78885Uxd;
import X.CallableC44510HdS;
import X.H7B;
import X.HC8;
import X.HET;
import X.InterfaceC153045zY;
import X.InterfaceC44501HdJ;
import X.InterfaceC44507HdP;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OSZ;
import X.X1D;
import Y.ACallableS110S0100000_7;
import Y.AObserverS70S0100000_2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import defpackage.s1;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VECutVideoPresenter implements GenericLifecycleObserver {
    public final String LJLIL;
    public final InterfaceC44501HdJ LJLILLLLZI;
    public boolean LJLJI;
    public final CreativeInfo LJLJJI;
    public final C62822Ol8 LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;
    public final boolean LJLJLLL;
    public boolean LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public C6HJ LJLLL;
    public InterfaceC153045zY LJLLLL;
    public C44502HdK LJLLLLLL;
    public CutMultiVideoViewModel LJLZ;
    public VEVideoCutterViewModel LJZ;
    public VideoEditViewModel LJZI;
    public final C44503HdL LJZL;
    public final C5KL LL;
    public C44506HdO LLD;
    public boolean LLF;
    public long LLFF;
    public long LLFFF;
    public VEEditorAutoStartStopArbiter LLFII;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            performInit();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public final int LIZLLL() {
        VideoEditViewModel videoEditViewModel = this.LJZI;
        if (videoEditViewModel != null) {
            if (videoEditViewModel.kv0().size() == 1) {
                return 1;
            }
            VideoEditViewModel videoEditViewModel2 = this.LJZI;
            if (videoEditViewModel2 != null) {
                List<VideoSegment> kv0 = videoEditViewModel2.kv0();
                ArrayList LIZIZ = s1.LIZIZ(kv0, "videoEditViewModel.originVideoList");
                for (VideoSegment videoSegment : kv0) {
                    if (!videoSegment.isDeleted) {
                        LIZIZ.add(videoSegment);
                    }
                }
                if (LIZIZ.size() > 1) {
                    return 2;
                }
                return 3;
            }
            o.LJIJI("videoEditViewModel");
            throw null;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        String sb;
        if (!this.LJLLJ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VECutVideoPresenter Destroy method stack: \n");
        StackTraceElement[] stackTraceElement = C16880lQ.LLLLIIIILLL().getStackTrace();
        StringBuilder sb2 = new StringBuilder();
        o.LJIIIIZZ(stackTraceElement, "stackTraceElement");
        int length = stackTraceElement.length;
        int i = 0;
        while (true) {
            if (i < length) {
                StackTraceElement stackTraceElement2 = stackTraceElement[i];
                if (i >= 10) {
                    sb = sb2.toString();
                    break;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("at ");
                LIZ2.append(stackTraceElement2);
                LIZ2.append('\n');
                sb2.append(X1D.LIZIZ(LIZ2));
                i++;
            } else {
                sb = sb2.toString();
                break;
            }
        }
        LIZ.append(sb);
        H7B.LJ(X1D.LIZIZ(LIZ));
        this.LJLLJ = false;
        InterfaceC153045zY interfaceC153045zY = this.LJLLLL;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.destroy();
        }
        this.LJLILLLLZI.LLILZLL();
        if (this.LJLLL != null) {
            this.LJLLL = null;
        }
        this.LJZL.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02ec, code lost:
    
        if (r1 != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01cd, code lost:
    
        if (r8.size() > 1) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0287  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Throwable, X.5Ne] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performInit() {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.performInit():void");
    }

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        C10K.LIZIZ(new ACallableS110S0100000_7(interfaceC65784Pro, 9), C10K.LJIIIIZZ, null);
    }

    public static final boolean LJ(VECutVideoPresenter vECutVideoPresenter) {
        int LJI;
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.LJZI;
        if (videoEditViewModel != null) {
            List<VideoSegment> kv0 = videoEditViewModel.kv0();
            ArrayList LIZIZ = s1.LIZIZ(kv0, "videoEditViewModel.originVideoList");
            for (VideoSegment videoSegment : kv0) {
                if (true ^ videoSegment.isDeleted) {
                    LIZIZ.add(videoSegment);
                }
            }
            int size = LIZIZ.size();
            for (int i = 0; i < size; i++) {
                VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(LIZIZ, i);
                C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                String LJII = videoSegment2.LJII(false);
                c43117Gw5.getClass();
                if (C43117Gw5.LJIIIZ(LJII)) {
                    vECutVideoPresenter.LJLJJLL = -11009;
                    if (C145805ns.LIZ() && (!C139895eL.LIZIZ)) {
                        return true;
                    }
                    return false;
                }
                int min = Math.min(videoSegment2.width, videoSegment2.height);
                int max = Math.max(videoSegment2.width, videoSegment2.height);
                try {
                    if (C145805ns.LIZ()) {
                        LJI = videoSegment2.LJI();
                    } else {
                        LJI = (int) (videoSegment2.LJI() * videoSegment2.LJIIIIZZ());
                    }
                    OSZ LIZ = C44660Hfs.LIZ(min, max, LJI, videoSegment2.LIZLLL());
                    vECutVideoPresenter.LJLJJLL = ((Number) LIZ.getFirst()).intValue();
                    videoSegment2.fastImportDependHW = ((Boolean) LIZ.getSecond()).booleanValue();
                } catch (Exception e) {
                    H7B.LIZJ(e.getMessage());
                }
                if (vECutVideoPresenter.LJLJJLL != 0) {
                    return false;
                }
            }
            return true;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public final void LIZ(ActivityC45651qj activityC45651qj) {
        this.LJLZ = (CutMultiVideoViewModel) ViewModelProviders.of(activityC45651qj).get(CutMultiVideoViewModel.class);
        this.LJZ = (VEVideoCutterViewModel) ViewModelProviders.of(activityC45651qj).get(VEVideoCutterViewModel.class);
        this.LJZI = (VideoEditViewModel) ViewModelProviders.of(activityC45651qj).get(VideoEditViewModel.class);
        this.LLF = o.LJ("from_chat", C16880lQ.LLJJIJIIJIL(activityC45651qj.getIntent(), "enter_from"));
        this.LJLILLLLZI.LJJJJLI().getLifecycle().addObserver(this);
        VEVideoCutterViewModel vEVideoCutterViewModel = this.LJZ;
        if (vEVideoCutterViewModel != null) {
            vEVideoCutterViewModel.gv0().observe(this.LJLILLLLZI.LJJJJLI(), new AObserverS70S0100000_2(this, 234));
        } else {
            o.LJIJI("veVideoCutterViewModel");
            throw null;
        }
    }

    public final void LJII(C15070iV<Long, Long> c15070iV) {
        long j;
        long LLIIIL = this.LJLILLLLZI.LLIIIL();
        Long l = c15070iV.LIZ;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = c15070iV.LIZIZ;
        if (l2 != null) {
            LLIIIL = l2.longValue();
        }
        int i = (int) j;
        int i2 = (int) LLIIIL;
        C44505HdN c44505HdN = this.LJZL.LIZ;
        if (c44505HdN != null) {
            c44505HdN.LIZ.LLLFZ(i, i2);
        }
    }

    public VECutVideoPresenter(String workspace, InterfaceC44501HdJ viewProvider, boolean z, CreativeInfo creativeInfo) {
        o.LJIIIZ(workspace, "workspace");
        o.LJIIIZ(viewProvider, "viewProvider");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LJLIL = workspace;
        this.LJLILLLLZI = viewProvider;
        this.LJLJI = z;
        this.LJLJJI = creativeInfo;
        this.LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 199));
        this.LJLJJLL = -1;
        this.LJLJL = true;
        this.LJLJLLL = true;
        this.LJLLILLLL = C78885Uxd.LIZIZ(true, false, false, false);
        this.LJZL = new C44503HdL();
        this.LL = new C5KL();
    }

    public static void LJFF(int i, long j, long j2, CutVideoCompileSettings cutVideoCompileSettings, int i2, String str) {
        C43882HKc.LIZLLL(i, "av_ve_import_compile", C73994T2g.LJJIJLIJ(C113554cx.LJJL(new OSZ("fps_time", String.valueOf(j)), new OSZ("compile_time", String.valueOf(j2)), new OSZ("is_hard_encode", String.valueOf(cutVideoCompileSettings.LIZLLL)), new OSZ("fps", String.valueOf(cutVideoCompileSettings.LIZJ)), new OSZ("errorCode", String.valueOf(i2)), new OSZ("error_message", str))), true);
    }

    public static void LJI(VECutVideoPresenter vECutVideoPresenter, int i, float f, float f2, float f3, int i2, int i3, int i4) {
        boolean z;
        NLETrack mainTrack;
        NLETimeSpaceNode nLETimeSpaceNode;
        int i5 = i3;
        float f4 = f2;
        int i6 = i2;
        if ((i4 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        float f5 = 1.0f;
        if ((i4 & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 16) == 0) {
            f5 = f3;
        }
        if ((i4 & 32) != 0) {
            i6 = 0;
        }
        if ((i4 & 64) != 0) {
            i5 = 0;
        }
        vECutVideoPresenter.LJLLI = f;
        if (z) {
            vECutVideoPresenter.LJZL.LIZ(f, f4, f5, i6, i5);
            return;
        }
        if (C6HW.LIZ()) {
            vECutVideoPresenter.LJZL.LIZ(0.0f, 1.0f, 1.0f, 0, 0);
            InterfaceC153045zY interfaceC153045zY = vECutVideoPresenter.LJLLLL;
            if (interfaceC153045zY == null) {
                return;
            }
            NLEModel LJJ = C17N.LJJ(interfaceC153045zY);
            if (LJJ != null && (mainTrack = LJJ.getMainTrack()) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LJLLLLLL(i, mainTrack.LJIILLIIL())) != null) {
                nLETimeSpaceNode.setRotation(360 - f);
            }
            interfaceC153045zY.LLLF();
            return;
        }
        C44505HdN c44505HdN = vECutVideoPresenter.LJZL.LIZ;
        if (c44505HdN == null) {
            return;
        }
        c44505HdN.LIZ.LLJJIJIIJIL(i, C44513HdV.LIZJ((int) f));
    }

    public static void LIZJ(VECutVideoPresenter vECutVideoPresenter, Workspace workspace, CutVideoCompileConfigure cutVideoCompileConfigure, boolean z, boolean z2, InterfaceC44507HdP interfaceC44507HdP, boolean z3, HET het, DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure, int i) {
        boolean z4;
        long j;
        boolean z5;
        long j2;
        boolean LJ;
        VideoSegment videoSegment;
        InterfaceC153045zY interfaceC153045zY;
        C122034qd LJJI;
        DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure2 = diyPropUploadVideoAutoCutConfigure;
        HET het2 = het;
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            het2 = null;
        }
        if ((i & 128) != 0) {
            diyPropUploadVideoAutoCutConfigure2 = null;
        }
        vECutVideoPresenter.getClass();
        o.LJIIIZ(workspace, "workspace");
        if (!vECutVideoPresenter.LJLLJ) {
            H7B.LIZ("VECutVideo,return compile because of editor not init");
            return;
        }
        if (C6HW.LIZ() && (interfaceC153045zY = vECutVideoPresenter.LJLLLL) != null && (LJJI = C17N.LJJI(interfaceC153045zY)) != null) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, LJJI.LJIIJ.LJ().getMainTrack().LJIILL());
            if (nLETrackSlot != null) {
                nLETrackSlot.setStartTime(0L);
                nLETrackSlot.setEndTime((vECutVideoPresenter.LLFFF - vECutVideoPresenter.LLFF) * 1000);
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
                if (LJJ != null) {
                    LJJ.LJIJJLI(vECutVideoPresenter.LLFF * 1000);
                    LJJ.LJIJJ(vECutVideoPresenter.LLFFF * 1000);
                }
            }
            LJJI.LJIIJ.LIZIZ();
        }
        if (cutVideoCompileConfigure != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.LJZI;
        if (videoEditViewModel != null) {
            List<VideoSegment> kv0 = videoEditViewModel.kv0();
            if (kv0 != null && (videoSegment = (VideoSegment) ORZ.LJLLLLLL(0, kv0)) != null) {
                j = videoSegment.duration;
            } else {
                j = -1;
            }
            CutMultiVideoViewModel cutMultiVideoViewModel = vECutVideoPresenter.LJLZ;
            if (cutMultiVideoViewModel != null) {
                if (j > cutMultiVideoViewModel.LJLLL) {
                    VideoEditViewModel videoEditViewModel2 = vECutVideoPresenter.LJZI;
                    if (videoEditViewModel2 != null) {
                        List<VideoSegment> kv02 = videoEditViewModel2.kv0();
                        o.LJIIIIZZ(kv02, "videoEditViewModel.originVideoList");
                        C77119UOl.LJI(kv02);
                    } else {
                        o.LJIJI("videoEditViewModel");
                        throw null;
                    }
                }
                C6HJ c6hj = vECutVideoPresenter.LJLLL;
                if (c6hj != null) {
                    z5 = c6hj.LIZJ().LJLJJI;
                } else {
                    z5 = false;
                }
                vECutVideoPresenter.LJLL = z5;
                VEVideoCutterViewModel vEVideoCutterViewModel = vECutVideoPresenter.LJZ;
                if (vEVideoCutterViewModel != null) {
                    vEVideoCutterViewModel.hv0(new C6HV(2, true));
                    C6HJ c6hj2 = vECutVideoPresenter.LJLLL;
                    if (c6hj2 != null) {
                        j2 = c6hj2.LIZ();
                    } else {
                        j2 = 0;
                    }
                    vECutVideoPresenter.LJLJLJ = j2;
                    if (z2) {
                        vECutVideoPresenter.LJLJJLL = -11008;
                    } else if (!z4 && !z) {
                        if (vECutVideoPresenter.LJLILLLLZI.LL() == 0) {
                            LJ = LJ(vECutVideoPresenter);
                        } else {
                            LJ = LJ(vECutVideoPresenter);
                        }
                        if (LJ && !z3) {
                            HC8.LJFF(vECutVideoPresenter.LIZLLL(), String.valueOf(vECutVideoPresenter.LJLJJLL), true);
                            interfaceC44507HdP.LIZ(true);
                            H7B.LIZ("VECutVideo,using fastImport strategy");
                            interfaceC44507HdP.onCompileDone();
                            if (((Boolean) vECutVideoPresenter.LJLJJL.getValue()).booleanValue()) {
                                InterfaceC153045zY interfaceC153045zY2 = vECutVideoPresenter.LJLLLL;
                                if (interfaceC153045zY2 != null) {
                                    interfaceC153045zY2.stop();
                                }
                                InterfaceC153045zY interfaceC153045zY3 = vECutVideoPresenter.LJLLLL;
                                if (interfaceC153045zY3 != null) {
                                    interfaceC153045zY3.LIZIZ();
                                }
                                vECutVideoPresenter.LJLLJ = false;
                                if (vECutVideoPresenter.LJLLL == null) {
                                    return;
                                }
                                vECutVideoPresenter.LJLLL = null;
                                if (vECutVideoPresenter.LLFII == null) {
                                    return;
                                }
                                Lifecycle lifecycle = vECutVideoPresenter.LJLILLLLZI.LJJJJLI().getLifecycle();
                                VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = vECutVideoPresenter.LLFII;
                                o.LJI(vEEditorAutoStartStopArbiter);
                                lifecycle.removeObserver(vEEditorAutoStartStopArbiter);
                                return;
                            }
                            vECutVideoPresenter.destroy();
                            return;
                        }
                    }
                    interfaceC44507HdP.LIZ(false);
                    H7B.LIZ("VECutVideo,using normalImport strategy");
                    C10K.LIZJ(new CallableC44510HdS(currentTimeMillis, cutVideoCompileConfigure, vECutVideoPresenter, workspace, het2, diyPropUploadVideoAutoCutConfigure2, interfaceC44507HdP));
                    return;
                }
                o.LJIJI("veVideoCutterViewModel");
                throw null;
            }
            o.LJIJI("cutMultiVideoViewModel");
            throw null;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }
}
