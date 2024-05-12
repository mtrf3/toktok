package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.AbstractActivityC162676Zz;
import X.C145995oB;
import X.C157236Fb;
import X.C165616ej;
import X.C2U8;
import X.C43585H8r;
import X.C46004I3s;
import X.C46008I3w;
import X.C60903NvH;
import X.C65803Ps7;
import X.C77412UZs;
import X.C78983UzD;
import X.C78996UzQ;
import X.FMX;
import X.H78;
import X.HEJ;
import X.HEM;
import X.HEP;
import X.HU5;
import X.KL2;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS7S0002000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StitchTrimmingActivity extends AbstractActivityC162676Zz {
    public static boolean LJLLL = true;
    public C46004I3s LJLJLLL;
    public CutVideoViewModel LJLL;
    public CreativeInfo LJLLI;
    public DuetAndStitchRouterConfig LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        if (cutVideoViewModel != null && !cutVideoViewModel.Ov0()) {
            C46004I3s c46004I3s = this.LJLJLLL;
            if (c46004I3s != null) {
                CutVideoViewModel cutVideoViewModel2 = c46004I3s.LJLILLLLZI;
                if (cutVideoViewModel2 != null) {
                    if (!cutVideoViewModel2.Ov0()) {
                        VideoEditViewModel videoEditViewModel = c46004I3s.LJLJJL;
                        if (videoEditViewModel != null) {
                            int i = ((VideoSegment) ListProtector.get(videoEditViewModel.kv0(), 0)).width;
                            VideoEditViewModel videoEditViewModel2 = c46004I3s.LJLJJL;
                            if (videoEditViewModel2 != null) {
                                int min = Math.min(i, ((VideoSegment) ListProtector.get(videoEditViewModel2.kv0(), 0)).height);
                                VideoEditViewModel videoEditViewModel3 = c46004I3s.LJLJJL;
                                if (videoEditViewModel3 != null) {
                                    int i2 = ((VideoSegment) ListProtector.get(videoEditViewModel3.kv0(), 0)).width;
                                    VideoEditViewModel videoEditViewModel4 = c46004I3s.LJLJJL;
                                    if (videoEditViewModel4 != null) {
                                        int max = Math.max(i2, ((VideoSegment) ListProtector.get(videoEditViewModel4.kv0(), 0)).height);
                                        CutVideoPreviewViewModel cutVideoPreviewViewModel = c46004I3s.LJLJI;
                                        if (cutVideoPreviewViewModel != null) {
                                            cutVideoPreviewViewModel.setState(new AqS7S0002000_7(min, max, 3));
                                            return;
                                        } else {
                                            o.LJIJI("previewViewModel");
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
                    return;
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            o.LJIJI("mRootScene");
            throw null;
        }
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        String str;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", true);
        super.onResume();
        CreativeInfo creativeInfo = this.LJLLI;
        if (creativeInfo != null) {
            String creationId = creativeInfo.getCreationId();
            boolean z = LJLLL;
            o.LJIIIZ(creationId, "creationId");
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", "stitch");
            c145995oB.LJI("enter_from", "video_stitch_page");
            c145995oB.LJI("creation_id", creationId);
            c145995oB.LJI("content_source", "shoot");
            c145995oB.LJI("content_type", "video");
            if (z) {
                str = "normal";
            } else {
                str = "back";
            }
            c145995oB.LJI("enter_method", str);
            FMX.LJIIL("enter_video_stitch_page", c145995oB.LIZ);
            LJLLL = false;
            C2U8.LIZ(new HEM());
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", false);
            return;
        }
        o.LJIJI("creativeInfo");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
        int LIZJ;
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        int i = 0;
        if (cutVideoViewModel != null && !cutVideoViewModel.Ov0()) {
            C46004I3s c46004I3s = this.LJLJLLL;
            if (c46004I3s != null) {
                CutVideoViewModel cutVideoViewModel2 = c46004I3s.LJLILLLLZI;
                if (cutVideoViewModel2 != null) {
                    if (!cutVideoViewModel2.Ov0()) {
                        C46008I3w LLJILJIL = c46004I3s.LLJILJIL();
                        LLJILJIL.getClass();
                        int LJI = C157236Fb.LIZ.LJI();
                        ViewGroup.LayoutParams layoutParams = LLJILJIL.LLJILJIL().mView.getLayoutParams();
                        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (z) {
                            LIZJ = LJI;
                        } else {
                            LIZJ = (int) KL2.LIZJ(LLJILJIL.mActivity, 132.0f);
                        }
                        marginLayoutParams.height = LIZJ;
                        LLJILJIL.LLJILJIL().mView.setLayoutParams(marginLayoutParams);
                        ViewGroup.LayoutParams layoutParams2 = LLJILJIL.LLJILJILJ().mView.getLayoutParams();
                        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (z) {
                            i = (int) (KL2.LIZJ(LLJILJIL.mActivity, 5.5f) + LJI);
                        }
                        marginLayoutParams2.bottomMargin = i;
                        LLJILJIL.LLJILJILJ().mView.setLayoutParams(marginLayoutParams2);
                        return;
                    }
                    return;
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            o.LJIJI("mRootScene");
            throw null;
        }
    }

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Workspace workspace;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", true);
        super.onCreate(bundle);
        C60903NvH.LJIIJJI().LJIJ();
        setContentView(R.layout.dx);
        if (!getIntent().hasExtra("stitch_params")) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
            return;
        }
        this.LJLLI = C77412UZs.LJIJI(getIntent());
        this.LJLLILLLL = (DuetAndStitchRouterConfig) getIntent().getParcelableExtra("duet_and_stitch_router_config");
        JediViewModel LIZ = C165616ej.LIZ(this).LIZ(CutVideoViewModel.class);
        o.LJIIIIZZ(LIZ, "of(this).get(CutVideoViewModel::class.java)");
        this.LJLL = (CutVideoViewModel) LIZ;
        C43585H8r c43585H8r = new C43585H8r();
        StitchParams stitchParams = (StitchParams) getIntent().getParcelableExtra("stitch_params");
        if (stitchParams != null) {
            c43585H8r.LJIIZILJ = C77412UZs.LJIJI(getIntent());
            CreativeModel LJIILL = C78996UzQ.LJIILL(getIntent());
            c43585H8r.LJIJ = LJIILL;
            LJIILL.initialModel.duetAndStitchRouterConfig = this.LJLLILLLL;
            FollowUpPublishTrackerModel followUpPublishTrackerModel = LJIILL.followUpPublishTrackerModel;
            followUpPublishTrackerModel.followUpFirstItemId = C78983UzD.LJLJLLL;
            followUpPublishTrackerModel.followUpItemIdGroups = C78983UzD.LJLL;
            followUpPublishTrackerModel.enterRecordFromFeed = stitchParams.getEnterRecordFromFeed();
            c43585H8r.LJJIIZI = stitchParams;
            String videoPath = stitchParams.getVideoPath();
            if (TextUtils.isEmpty(videoPath)) {
                finish();
            } else {
                ArrayList<MediaModel> arrayList = new ArrayList<>();
                MediaModel mediaModel = new MediaModel(1L);
                mediaModel.fileLocalUriPath = videoPath;
                arrayList.add(mediaModel);
                c43585H8r.LIZ = arrayList;
                c43585H8r.LIZJ = true;
                getIntent().getLongExtra("min_duration", 3000L);
                if (bundle == null) {
                    CreativeInfo creativeInfo = this.LJLLI;
                    if (creativeInfo != null) {
                        workspace = HU5.LIZ(creativeInfo);
                    } else {
                        o.LJIJI("creativeInfo");
                        throw null;
                    }
                } else {
                    workspace = (Workspace) bundle.getParcelable("workspace");
                }
                c43585H8r.LJIIIZ = workspace;
                CutVideoViewModel cutVideoViewModel = this.LJLL;
                if (cutVideoViewModel != null) {
                    cutVideoViewModel.LJLJJLL = c43585H8r;
                    H78.LIZJ("cutVideoModel initialized");
                } else {
                    o.LJIJI("cutVideoViewModel");
                    throw null;
                }
            }
        }
        CreativeInfo creativeInfo2 = this.LJLLI;
        if (creativeInfo2 != null) {
            this.LJLJLLL = new C46004I3s(creativeInfo2);
            HEP hep = new HEP(this, C46004I3s.class);
            hep.LJI = false;
            hep.LJII = new HEJ(this);
            hep.LIZLLL = false;
            hep.LJ = false;
            hep.LJFF = R.id.j5l;
            hep.LIZ();
            CutVideoViewModel cutVideoViewModel2 = this.LJLL;
            if (cutVideoViewModel2 != null) {
                if (cutVideoViewModel2.LJLJJLL != null && cutVideoViewModel2.Ov0()) {
                    this.LJLJJL = false;
                }
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
                return;
            }
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        o.LJIJI("creativeInfo");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        CutVideoViewModel cutVideoViewModel = this.LJLL;
        if (cutVideoViewModel != null) {
            if (cutVideoViewModel.LJLJJLL != null && cutVideoViewModel.Mv0().LJIIIZ != null) {
                CutVideoViewModel cutVideoViewModel2 = this.LJLL;
                if (cutVideoViewModel2 != null) {
                    outState.putParcelable("workspace", cutVideoViewModel2.Mv0().LJIIIZ);
                    return;
                } else {
                    o.LJIJI("cutVideoViewModel");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("cutVideoViewModel");
        throw null;
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            finish();
        }
    }
}
