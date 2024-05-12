package com.ss.android.ugc.gamora.editorpro.anchor;

import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.C110614Vt;
import X.C163626bW;
import X.C16530kr;
import X.C16880lQ;
import X.C188727au;
import X.C1DH;
import X.C2068389v;
import X.C221108m2;
import X.C26338AVi;
import X.C38891fp;
import X.C44687HgJ;
import X.C48203Ivv;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C64532PUi;
import X.C65803Ps7;
import X.C72972SkS;
import X.C73305Spp;
import X.C73306Spq;
import X.C75792yF;
import X.C78915Uy7;
import X.C7MY;
import X.C82800Wea;
import X.FMX;
import X.HPT;
import X.HS4;
import X.J0F;
import X.KL2;
import X.PU7;
import X.SY4;
import X.W1A;
import X.W1B;
import X.W1C;
import X.W1D;
import X.W1E;
import X.X1D;
import Y.ACListenerS30S0100000_10;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.services.external.ui.EditorProAnchorConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EditorProAnchorActivity extends ActivityC86117Xqz {
    public FrameLayout LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public SY4 LJLJJI;
    public TuxIconView LJLJJL;
    public PlayerController LJLJJLL;
    public EditorProAnchorConfig LJLJL;
    public Surface LJLJLLL;
    public TTVideoEngine LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final boolean LJLJLJ = HS4.LIZ();
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 208));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LJLLLLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFII() {
        int i;
        EditorProAnchorConfig editorProAnchorConfig = this.LJLJL;
        if (editorProAnchorConfig != null) {
            if (!C48203Ivv.LJ(this)) {
                if (C48203Ivv.LIZJ(this)) {
                    i = R.string.dtk;
                } else if (C163626bW.LIZ().isWeakNetwork()) {
                    i = R.string.sjj;
                } else if (C163626bW.LIZ().isFakeNetwork()) {
                    i = R.string.dtm;
                } else {
                    i = R.string.dtf;
                }
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(i);
                C78915Uy7.LJJIIZI(this, 6001, creativeToastBuilder);
                LLIIIZ(W1C.NETWORK_ERROR);
                LLII("network error, use default");
                return;
            }
            LLIIIZ(W1C.LOADING);
            C82800Wea.LIZ(editorProAnchorConfig.getAnchorSubType(), editorProAnchorConfig.getVideoGuideUrl(), W1E.LJLIL, new AqS180S0100000_14(this, 224));
        }
    }

    public final void LLIIIILZ() {
        LLIIIZ(W1C.PLAY);
        EditorProAnchorConfig editorProAnchorConfig = this.LJLJL;
        if (editorProAnchorConfig != null) {
            C82800Wea.LIZJ(editorProAnchorConfig.getAnchorSubType(), editorProAnchorConfig.getVideoGuideUrl(), false, true, null);
            HPT hpt = (HPT) this.LJLLLL.getValue();
            long currentTimeMillis = System.currentTimeMillis() - this.LJLLJ;
            C188727au LIZ = hpt.LIZ();
            LIZ.LJ(currentTimeMillis, "loading_time");
            FMX.LJIIL("ep_anchor_guide_start", LIZ.LIZ);
        }
        this.LJLLL = System.currentTimeMillis();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLFZ(false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
            Surface surface = this.LJLJLLL;
            if (surface != null) {
                surface.release();
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        PlayerController playerController = this.LJLJJLL;
        if (playerController != null) {
            playerController.pause();
        }
        TTVideoEngine tTVideoEngine = this.LJLL;
        if (tTVideoEngine == null || tTVideoEngine.LJJIJIIJIL() != 1) {
            return;
        }
        TTVideoEngine tTVideoEngine2 = this.LJLL;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LJJL();
        } else {
            o.LJIJI("videoEngine");
            throw null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity", "onResume", true);
        super.onResume();
        C1DH.LJJIJIIJIL(300L, new ARunnableS50S0100000_14(this, 110));
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity", "onResume", false);
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

    public final void LLFZ(boolean z) {
        String str;
        int i;
        C188727au LIZ = ((HPT) this.LJLLLL.getValue()).LIZ();
        LIZ.LJIIIZ("show_from", "ep_anchor");
        if (z) {
            str = "use";
        } else {
            str = "cancel";
        }
        LIZ.LJIIIZ("click_result", str);
        FMX.LJIIL("editor_pro_popup_click", LIZ.LIZ);
        HPT hpt = (HPT) this.LJLLLL.getValue();
        if (this.LJLLI) {
            TTVideoEngine tTVideoEngine = this.LJLL;
            if (tTVideoEngine != null) {
                i = tTVideoEngine.LJJJJI();
            } else {
                o.LJIJI("videoEngine");
                throw null;
            }
        } else if (this.LJLLL != 0) {
            i = (int) (System.currentTimeMillis() - this.LJLLL);
        } else {
            i = 0;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLLJ;
        int i2 = this.LJLLILLLL;
        C188727au LIZ2 = hpt.LIZ();
        LIZ2.LIZLLL(i, "guide_playtime");
        LIZ2.LJ(currentTimeMillis, "guide_staytime");
        LIZ2.LIZLLL(i2, "finish_cnt");
        FMX.LJIIL("ep_anchor_guide_finish", LIZ2.LIZ);
    }

    public final void LLII(String str) {
        EditorProAnchorConfig editorProAnchorConfig = this.LJLJL;
        if (editorProAnchorConfig != null) {
            C82800Wea.LIZJ(editorProAnchorConfig.getAnchorSubType(), editorProAnchorConfig.getVideoGuideUrl(), false, false, str);
        }
    }

    public final void LLIIIJ(String str) {
        PlayerController playerController;
        Surface surface;
        if (this.LJLJLJ) {
            TTVideoEngine tTVideoEngine = this.LJLL;
            if (tTVideoEngine != null && this.LJLJLLL != null) {
                tTVideoEngine.LJJLI();
                return;
            }
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            TTVideoEngine tTVideoEngine2 = new TTVideoEngine(applicationContext, 0);
            this.LJLL = tTVideoEngine2;
            tTVideoEngine2.LLILZ("editor_pro_guide_page");
            TTVideoEngine tTVideoEngine3 = this.LJLL;
            if (tTVideoEngine3 != null) {
                tTVideoEngine3.LLFII(true);
                File[] listFiles = new File(str).listFiles();
                if (listFiles == null) {
                    return;
                }
                for (File file : listFiles) {
                    String name = file.getName();
                    o.LJIIIIZZ(name, "it.name");
                    if (ujb.o.LJJJJ(name, ".mp4", false)) {
                        String path = file.getPath();
                        if (path == null) {
                            return;
                        }
                        TTVideoEngine tTVideoEngine4 = this.LJLL;
                        if (tTVideoEngine4 != null) {
                            tTVideoEngine4.LL(path);
                            TTVideoEngine tTVideoEngine5 = this.LJLL;
                            if (tTVideoEngine5 != null) {
                                tTVideoEngine5.LJLLLL(199, 1);
                                TTVideoEngine tTVideoEngine6 = this.LJLL;
                                if (tTVideoEngine6 != null) {
                                    tTVideoEngine6.LJLLLL(4, 2);
                                    TTVideoEngine tTVideoEngine7 = this.LJLL;
                                    if (tTVideoEngine7 != null) {
                                        tTVideoEngine7.LJZI(new W1A(this));
                                        TTVideoEngine tTVideoEngine8 = this.LJLL;
                                        if (tTVideoEngine8 == null || (surface = this.LJLJLLL) == null) {
                                            return;
                                        }
                                        tTVideoEngine8.LLILZIL(surface);
                                        TTVideoEngine tTVideoEngine9 = this.LJLL;
                                        if (tTVideoEngine9 != null) {
                                            tTVideoEngine9.LJJLI();
                                            return;
                                        } else {
                                            o.LJIJI("videoEngine");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("videoEngine");
                                    throw null;
                                }
                                o.LJIJI("videoEngine");
                                throw null;
                            }
                            o.LJIJI("videoEngine");
                            throw null;
                        }
                        o.LJIJI("videoEngine");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("videoEngine");
            throw null;
        }
        Configuration configuration = new Configuration();
        configuration.setContext(this);
        configuration.setLifecycleOwner(this);
        configuration.setAlphaVideoViewType(1);
        try {
            playerController = PlayerController.get(configuration, new J0F(this, new AqS164S0100000_14(this, 382)));
        } catch (Exception unused) {
            playerController = PlayerController.get(configuration, new DefaultSystemPlayer());
        }
        this.LJLJJLL = playerController;
        if (playerController != null) {
            FrameLayout frameLayout = this.LJLIL;
            if (frameLayout != null) {
                playerController.attachAlphaView(frameLayout);
            } else {
                o.LJIJI("playerContainer");
                throw null;
            }
        }
        PlayerController playerController2 = this.LJLJJLL;
        if (playerController2 != null) {
            playerController2.withVideoAction(new W1D(this));
        }
        File[] listFiles2 = new File(str).listFiles();
        if (listFiles2 == null) {
            return;
        }
        for (File file2 : listFiles2) {
            String name2 = file2.getName();
            o.LJIIIIZZ(name2, "it.name");
            if (ujb.o.LJJJJ(name2, ".json", false)) {
                try {
                    C64532PUi LIZ = PU7.LIZ(PU7.LJI(file2));
                    try {
                        LIZ.LJLILLLLZI.j(LIZ.LJLJI);
                        String LJIILL = LIZ.LJLILLLLZI.LJIILL();
                        AnonymousClass636.LJFF(LIZ, null);
                        if (LJIILL.length() == 0) {
                            LLII("read configJson failed");
                            return;
                        }
                        VideoFileModel videoFileModel = (VideoFileModel) C75792yF.LIZ(LJIILL, VideoFileModel.class);
                        if (videoFileModel == null) {
                            return;
                        }
                        DataSource dataSource = new DataSource();
                        if (videoFileModel.portrait != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append(File.separator);
                            LIZ2.append(videoFileModel.portrait.path);
                            DataSource.DataInfo dataInfo = new DataSource.DataInfo(X1D.LIZIZ(LIZ2));
                            dataInfo.setScaleType(videoFileModel.portrait.align);
                            dataInfo.setVersion(videoFileModel.portrait.version);
                            dataInfo.setVideoWidth(videoFileModel.portrait.videoWidth);
                            dataInfo.setVideoHeight(videoFileModel.portrait.videoHeight);
                            dataInfo.setActualWidth(videoFileModel.portrait.actualWidth);
                            dataInfo.setActualHeight(videoFileModel.portrait.actualHeight);
                            dataInfo.setAlphaArea(videoFileModel.portrait.alphaFrame);
                            dataInfo.setRgbArea(videoFileModel.portrait.rgbFrame);
                            dataSource.setPortraitDataInfo(dataInfo);
                        }
                        if (videoFileModel.landscape != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(str);
                            LIZ3.append(File.separator);
                            LIZ3.append(videoFileModel.landscape.path);
                            DataSource.DataInfo dataInfo2 = new DataSource.DataInfo(X1D.LIZIZ(LIZ3));
                            dataInfo2.setScaleType(videoFileModel.landscape.align);
                            dataInfo2.setVersion(videoFileModel.landscape.version);
                            dataInfo2.setVideoWidth(videoFileModel.landscape.videoWidth);
                            dataInfo2.setVideoHeight(videoFileModel.landscape.videoHeight);
                            dataInfo2.setActualWidth(videoFileModel.landscape.actualWidth);
                            dataInfo2.setActualHeight(videoFileModel.landscape.actualHeight);
                            dataInfo2.setAlphaArea(videoFileModel.landscape.alphaFrame);
                            dataInfo2.setRgbArea(videoFileModel.landscape.rgbFrame);
                            dataSource.setLandscapeDataInfo(dataInfo2);
                        }
                        dataSource.setLoop(true);
                        PlayerController playerController3 = this.LJLJJLL;
                        if (playerController3 == null) {
                            return;
                        }
                        playerController3.start(dataSource);
                        return;
                    } finally {
                    }
                } catch (Exception unused2) {
                    LLII("parse configJson failed");
                    return;
                }
            }
        }
    }

    public final void LLIIIZ(W1C w1c) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (!this.LJLJLJ) {
            return;
        }
        int state = w1c.getState();
        boolean z2 = true;
        int i4 = 0;
        if (state == W1C.FAIL.getState()) {
            z = true;
        } else {
            z = false;
        }
        if (state != W1C.NETWORK_ERROR.getState()) {
            z2 = false;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.l61);
        if (!z2) {
            i = 0;
        } else {
            i = 4;
        }
        _$_findCachedViewById.setVisibility(i);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.e5o);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        _$_findCachedViewById2.setVisibility(i2);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.gys);
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        _$_findCachedViewById3.setVisibility(i3);
        if (z) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.dtm);
            C78915Uy7.LJJIIZI(this, 6001, creativeToastBuilder);
        }
        if (z2) {
            C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
            C73306Spq c73306Spq = new C73306Spq();
            String string = getString(R.string.dte);
            o.LJIIIIZZ(string, "getString(R.string.connection_error_retry)");
            c73306Spq.LJFF = string;
            String string2 = getString(R.string.dtb);
            o.LJIIIIZZ(string2, "getString(R.string.connection_airplanepage_desc)");
            c73306Spq.LJI = string2;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_refresh;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73306Spq.LJII = new AqS180S0100000_14(this, 225);
            c73306Spq.LJIIIIZZ = new AqS180S0100000_14(this, 226);
            c73305Spp.setStatus(c73306Spq);
        }
        if (state == W1C.LOADING.getState()) {
            C73305Spp c73305Spp2 = (C73305Spp) _$_findCachedViewById(R.id.g94);
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
            }
            C73305Spp c73305Spp3 = (C73305Spp) _$_findCachedViewById(R.id.g94);
            if (c73305Spp3 != null) {
                c73305Spp3.LJFF();
            }
        } else {
            C73305Spp c73305Spp4 = (C73305Spp) _$_findCachedViewById(R.id.g94);
            if (c73305Spp4 != null) {
                c73305Spp4.setVisibility(8);
            }
        }
        SY4 sy4 = this.LJLJJI;
        if (sy4 != null) {
            if (z2) {
                i4 = 8;
            }
            sy4.setVisibility(i4);
            return;
        }
        o.LJIJI("tryButton");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        EditorProAnchorConfig editorProAnchorConfig;
        String str;
        String detailDescription;
        String detailTitle;
        String detailBtnTitle;
        int i2;
        int i3;
        C65803Ps7.LIZ(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity", "onCreate", true);
        super.onCreate(bundle);
        if (this.LJLJLJ) {
            i = R.layout.e7;
        } else {
            i = R.layout.e6;
        }
        setContentView(i);
        View findViewById = findViewById(R.id.cql);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.editor_pro_anchor_try_button)");
        this.LJLJJI = (SY4) findViewById;
        View findViewById2 = findViewById(R.id.cqg);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.editor_pro_anchor_close)");
        this.LJLJJL = (TuxIconView) findViewById2;
        Serializable serializableExtra = getIntent().getSerializableExtra("editor_pro_anchor_config");
        if (serializableExtra instanceof EditorProAnchorConfig) {
            editorProAnchorConfig = (EditorProAnchorConfig) serializableExtra;
        } else {
            editorProAnchorConfig = null;
        }
        this.LJLJL = editorProAnchorConfig;
        if (this.LJLJLJ) {
            View findViewById3 = findViewById(R.id.e5l);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d2);
            c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(2));
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            o.LJIIIIZZ(applicationContext, "applicationContext");
            findViewById3.setBackground(c110614Vt.LIZ(applicationContext));
            View findViewById4 = findViewById(R.id.e5m);
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.d2);
            c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(20));
            Context applicationContext2 = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext2 == null) {
                applicationContext2 = C38891fp.LJLILLLLZI;
            }
            o.LJIIIIZZ(applicationContext2, "applicationContext");
            findViewById4.setBackground(c110614Vt2.LIZ(applicationContext2));
            if (C63081OpJ.LJJJJJL(this) / C63081OpJ.LJJJJL(this) <= 1.7777778f) {
                _$_findCachedViewById(R.id.j7n).setFitsSystemWindows(false);
                TuxIconView tuxIconView = this.LJLJJL;
                if (tuxIconView != null) {
                    ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        i2 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
                    } else {
                        i2 = 0;
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    TuxIconView tuxIconView2 = this.LJLJJL;
                    if (tuxIconView2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = tuxIconView2.getLayoutParams();
                        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams2 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams != null) {
                            i3 = marginLayoutParams.topMargin;
                        } else {
                            i3 = 0;
                        }
                        C26338AVi.LJI(tuxIconView, valueOf, Integer.valueOf(C63081OpJ.LJJJJLI(this) + i3), 0, 0, false, 16);
                    } else {
                        o.LJIJI("closeButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("closeButton");
                    throw null;
                }
            } else {
                _$_findCachedViewById(R.id.j7n).setFitsSystemWindows(true);
            }
        } else {
            View findViewById5 = findViewById(R.id.cqj);
            o.LJIIIIZZ(findViewById5, "findViewById(R.id.editor…_anchor_player_container)");
            this.LJLIL = (FrameLayout) findViewById5;
            o.LJIIIIZZ(findViewById(R.id.cqi), "findViewById(R.id.editor…anchor_placeholder_image)");
            View findViewById6 = findViewById(R.id.cqk);
            o.LJIIIIZZ(findViewById6, "findViewById(R.id.editor_pro_anchor_title)");
            this.LJLILLLLZI = (TuxTextView) findViewById6;
            View findViewById7 = findViewById(R.id.cqh);
            o.LJIIIIZZ(findViewById7, "findViewById(R.id.editor_pro_anchor_description)");
            this.LJLJI = (TuxTextView) findViewById7;
            EditorProAnchorConfig editorProAnchorConfig2 = this.LJLJL;
            if (editorProAnchorConfig2 != null && (detailTitle = editorProAnchorConfig2.getDetailTitle()) != null) {
                TuxTextView tuxTextView = this.LJLILLLLZI;
                if (tuxTextView != null) {
                    tuxTextView.setText(detailTitle);
                } else {
                    o.LJIJI("titleTextView");
                    throw null;
                }
            }
            EditorProAnchorConfig editorProAnchorConfig3 = this.LJLJL;
            if (editorProAnchorConfig3 != null && (detailDescription = editorProAnchorConfig3.getDetailDescription()) != null && detailDescription.length() != 0) {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView2 = this.LJLJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                    int LIZJ = (int) KL2.LIZJ(this, 32.0f);
                    TuxTextView tuxTextView3 = this.LJLILLLLZI;
                    if (tuxTextView3 != null) {
                        C26338AVi.LJI(tuxTextView3, Integer.valueOf(LIZJ), 0, Integer.valueOf(LIZJ), Integer.valueOf(LIZJ), false, 16);
                    } else {
                        o.LJIJI("titleTextView");
                        throw null;
                    }
                } else {
                    o.LJIJI("descriptionTextView");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView4 = this.LJLJI;
                if (tuxTextView4 != null) {
                    EditorProAnchorConfig editorProAnchorConfig4 = this.LJLJL;
                    if (editorProAnchorConfig4 != null) {
                        str = editorProAnchorConfig4.getDetailDescription();
                    } else {
                        str = null;
                    }
                    tuxTextView4.setText(str);
                } else {
                    o.LJIJI("descriptionTextView");
                    throw null;
                }
            }
        }
        EditorProAnchorConfig editorProAnchorConfig5 = this.LJLJL;
        if (editorProAnchorConfig5 != null && (detailBtnTitle = editorProAnchorConfig5.getDetailBtnTitle()) != null) {
            SY4 sy4 = this.LJLJJI;
            if (sy4 != null) {
                sy4.setText(detailBtnTitle);
            } else {
                o.LJIJI("tryButton");
                throw null;
            }
        }
        SY4 sy42 = this.LJLJJI;
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS30S0100000_10(this, 61));
            TuxIconView tuxIconView3 = this.LJLJJL;
            if (tuxIconView3 != null) {
                C16880lQ.LJJJ(tuxIconView3, new ACListenerS30S0100000_10(this, 62));
                getWindow().setNavigationBarColor(-16777216);
                TextureView textureView = (TextureView) _$_findCachedViewById(R.id.l61);
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(new W1B(this));
                }
                this.LJLLJ = System.currentTimeMillis();
                EditorProAnchorConfig editorProAnchorConfig6 = this.LJLJL;
                if (editorProAnchorConfig6 != null) {
                    StringBuilder LJFF = C72972SkS.LJFF(C82800Wea.LIZIZ(), '/');
                    LJFF.append(editorProAnchorConfig6.getAnchorSubType());
                    String LIZIZ = X1D.LIZIZ(LJFF);
                    LLIIIZ(W1C.LOADING);
                    if (!C44687HgJ.LIZIZ(LIZIZ)) {
                        LLFII();
                    } else {
                        LLIIIJ(LIZIZ);
                    }
                }
                ActivityAgent.onTrace("com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity", "onCreate", false);
                return;
            }
            o.LJIJI("closeButton");
            throw null;
        }
        o.LJIJI("tryButton");
        throw null;
    }
}
