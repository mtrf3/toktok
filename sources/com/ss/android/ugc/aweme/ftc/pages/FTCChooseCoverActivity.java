package com.ss.android.ugc.aweme.ftc.pages;

import X.C135285Sq;
import X.C135315St;
import X.C141525gy;
import X.C162076Xr;
import X.C16880lQ;
import X.C169816lV;
import X.C1B3;
import X.C1B6;
import X.C44172HVg;
import X.C44526Hdi;
import X.C5MG;
import X.C5MM;
import X.C5RV;
import X.C60178Nja;
import X.C60903NvH;
import X.C65803Ps7;
import X.C69B;
import X.C6Y8;
import X.C6YM;
import X.C78866UxK;
import X.C78926UyI;
import X.GBO;
import X.H7R;
import X.InterfaceC145655nd;
import X.InterfaceC153045zY;
import X.InterfaceC162066Xq;
import X.OQN;
import Y.AObserverS70S0100000_2;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.zhiliaoapp.musically.R;
import dmt.av.video.StoredLiveData;
import dmt.av.video.VEPreviewParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCChooseCoverActivity extends GBO implements InterfaceC162066Xq, InterfaceC145655nd {
    public static final /* synthetic */ int LJLJLLL = 0;
    public VideoPublishEditModel LJLJI;
    public C135315St LJLJJI;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final MutableLiveData<C5MM> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<Bitmap> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C16880lQ.LJLLJ(FTCChooseCoverActivity.class);
        C6YM.LIZ();
        C69B.LIZ();
        C69B.LIZJ();
    }

    @Override // X.InterfaceC162066Xq
    public final VideoPublishEditModel LIZLLL() {
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        o.LJIJI("mModel");
        throw null;
    }

    @Override // X.InterfaceC162066Xq
    public final InterfaceC153045zY getEditor() {
        C135315St c135315St = this.LJLJJI;
        if (c135315St != null) {
            InterfaceC153045zY interfaceC153045zY = c135315St.LJIIIZ;
            o.LJIIIIZZ(interfaceC153045zY, "mPresenter.mVEEditor");
            return interfaceC153045zY;
        }
        o.LJIJI("mPresenter");
        throw null;
    }

    @Override // X.InterfaceC145655nd
    public final void LJLIIIL() {
        FTCChooseCoverFragment fTCChooseCoverFragment;
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("cover");
        if (!(LJJJIL instanceof FTCChooseCoverFragment) || (fTCChooseCoverFragment = (FTCChooseCoverFragment) LJJJIL) == null || !fTCChooseCoverFragment.LJLJL) {
            return;
        }
        InterfaceC162066Xq interfaceC162066Xq = fTCChooseCoverFragment.LJLIL;
        if (interfaceC162066Xq != null) {
            Bitmap LLJL = interfaceC162066Xq.getEditor().LLJL();
            if (LLJL == null) {
                return;
            }
            if (fTCChooseCoverFragment.LJLIL != null) {
                fTCChooseCoverFragment.LJLILLLLZI = r0.getEditor().LJZL();
                ((C6Y8) fTCChooseCoverFragment._$_findCachedViewById(R.id.n3z)).setVideoCoverFrameView(LLJL);
                LLJL.recycle();
                return;
            }
            o.LJIJI("mDependency");
            throw null;
        }
        o.LJIJI("mDependency");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.x, R.anim.y);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        FTCChooseCoverFragment fTCChooseCoverFragment;
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("cover");
        if ((LJJJIL instanceof FTCChooseCoverFragment) && (fTCChooseCoverFragment = (FTCChooseCoverFragment) LJJJIL) != null) {
            AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 67);
            if (fTCChooseCoverFragment.LJLIL != null) {
                C60903NvH.LJIIJJI().LJFF().LJFF(new AqS133S0200000_2(fTCChooseCoverFragment, aqS168S0100000_2, 95), !OQN.LJIIIIZZ(r0.LIZLLL().mVideoCoverStartTm, fTCChooseCoverFragment.LJLILLLLZI / 1000.0f));
            } else {
                o.LJIJI("mDependency");
                throw null;
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        LifecycleRegistry lifecycleRegistry;
        C65803Ps7.LIZIZ(this);
        Lifecycle lifecycle = getLifecycle();
        if ((lifecycle instanceof LifecycleRegistry) && (lifecycleRegistry = (LifecycleRegistry) lifecycle) != null) {
            lifecycleRegistry.markState(Lifecycle.State.DESTROYED);
        }
        getEditor().LLJJJJLIIL();
        C135315St c135315St = this.LJLJJI;
        if (c135315St != null) {
            c135315St.LIZIZ();
            super.onDestroy();
        } else {
            o.LJIJI("mPresenter");
            throw null;
        }
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

    @Override // X.InterfaceC162066Xq
    public final MutableLiveData<C5MM> LJIIIZ() {
        return this.LJLJJL;
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int videoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        FTCChooseCoverFragment fTCChooseCoverFragment;
        LifecycleRegistry lifecycleRegistry;
        Window window;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.ea);
        if (!C60178Nja.LIZIZ(this) && (window = getWindow()) != null) {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        C60903NvH.LJIIJJI().LJIJ();
        VideoPublishEditModel LJJIJIL = C78866UxK.LJJIJIL(getIntent());
        this.LJLJI = LJJIJIL;
        C135315St c135315St = new C135315St(LJJIJIL.getVideoEditorType());
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        if (videoPublishEditModel != null) {
            c135315St.LJIJ = videoPublishEditModel.nleData;
            this.LJLJJI = c135315St;
            c135315St.LJIILL = 2;
            C5MG c5mg = c135315St.LJIILJJIL;
            if (c5mg != null) {
                c5mg.LJIIZILJ = 2;
            }
            if (videoPublishEditModel.notUseCanvasSize()) {
                VideoPublishEditModel videoPublishEditModel2 = this.LJLJI;
                if (videoPublishEditModel2 != null) {
                    int[] LIZLLL = C44526Hdi.LIZLLL(videoPublishEditModel2);
                    i = LIZLLL[0];
                    videoHeight = LIZLLL[1];
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            } else {
                VideoPublishEditModel videoPublishEditModel3 = this.LJLJI;
                if (videoPublishEditModel3 != null) {
                    i = videoPublishEditModel3.mVideoCanvasWidth;
                    if (i <= 0 || (videoHeight = videoPublishEditModel3.mVideoCanvasHeight) <= 0) {
                        i = videoPublishEditModel3.videoWidth();
                        VideoPublishEditModel videoPublishEditModel4 = this.LJLJI;
                        if (videoPublishEditModel4 != null) {
                            videoHeight = videoPublishEditModel4.videoHeight();
                            if (videoHeight == 0 || i == 0) {
                                VideoPublishEditModel videoPublishEditModel5 = this.LJLJI;
                                if (videoPublishEditModel5 != null) {
                                    if (videoPublishEditModel5.getOriginal() == 0) {
                                        iVideoConfigService = C44172HVg.LJIILIIL;
                                    } else {
                                        iVideoConfigService = C44172HVg.LJIIL;
                                    }
                                    i = iVideoConfigService.getVideoWidth();
                                    VideoPublishEditModel videoPublishEditModel6 = this.LJLJI;
                                    if (videoPublishEditModel6 != null) {
                                        if (videoPublishEditModel6.getOriginal() == 0) {
                                            iVideoConfigService2 = C44172HVg.LJIILIIL;
                                        } else {
                                            iVideoConfigService2 = C44172HVg.LJIIL;
                                        }
                                        videoHeight = iVideoConfigService2.getVideoHeight();
                                    } else {
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            VideoPublishEditModel videoPublishEditModel7 = this.LJLJI;
            if (videoPublishEditModel7 != null) {
                VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(videoPublishEditModel7, 2, 30, 4);
                VideoPublishEditModel videoPublishEditModel8 = this.LJLJI;
                if (videoPublishEditModel8 != null) {
                    if (videoPublishEditModel8.notUseCanvasSize()) {
                        VideoPublishEditModel videoPublishEditModel9 = this.LJLJI;
                        if (videoPublishEditModel9 != null) {
                            int[] LIZLLL2 = C44526Hdi.LIZLLL(videoPublishEditModel9);
                            LJJJJZ.setCanvasWidth(LIZLLL2[0]);
                            LJJJJZ.setCanvasHeight(LIZLLL2[1]);
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    } else {
                        VideoPublishEditModel videoPublishEditModel10 = this.LJLJI;
                        if (videoPublishEditModel10 != null) {
                            LJJJJZ.setCanvasWidth(videoPublishEditModel10.mVideoCanvasWidth);
                            VideoPublishEditModel videoPublishEditModel11 = this.LJLJI;
                            if (videoPublishEditModel11 != null) {
                                LJJJJZ.setCanvasHeight(videoPublishEditModel11.mVideoCanvasHeight);
                            } else {
                                o.LJIJI("mModel");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mModel");
                            throw null;
                        }
                    }
                    LJJJJZ.mPageMode = 102;
                    MutableLiveData mutableLiveData = new MutableLiveData();
                    mutableLiveData.setValue(LJJJJZ);
                    StoredLiveData storedLiveData = new StoredLiveData();
                    C135315St c135315St2 = this.LJLJJI;
                    if (c135315St2 != null) {
                        int LJIJJ = c135315St2.LJIILJJIL.LJIJJ();
                        VideoPublishEditModel videoPublishEditModel12 = this.LJLJI;
                        if (videoPublishEditModel12 != null) {
                            C5RV LJFF = C169816lV.LJFF(LJIJJ, videoPublishEditModel12);
                            if (LJFF != null) {
                                storedLiveData.setValue(LJFF);
                            }
                            C135315St c135315St3 = this.LJLJJI;
                            if (c135315St3 != null) {
                                c135315St3.LIZLLL = mutableLiveData;
                                c135315St3.LJ = this.LJLJJL;
                                StoredLiveData storedLiveData2 = new StoredLiveData();
                                MutableLiveData mutableLiveData2 = new MutableLiveData();
                                Lifecycle lifecycle = getLifecycle();
                                if ((lifecycle instanceof LifecycleRegistry) && (lifecycleRegistry = (LifecycleRegistry) lifecycle) != null) {
                                    lifecycleRegistry.markState(Lifecycle.State.STARTED);
                                }
                                C135315St c135315St4 = this.LJLJJI;
                                if (c135315St4 != null) {
                                    SurfaceView surfaceView = (SurfaceView) _$_findCachedViewById(R.id.i1m);
                                    VideoPublishEditModel videoPublishEditModel13 = this.LJLJI;
                                    if (videoPublishEditModel13 != null) {
                                        c135315St4.LIZ(this, this, surfaceView, videoPublishEditModel13);
                                        VideoPublishEditModel videoPublishEditModel14 = this.LJLJI;
                                        if (videoPublishEditModel14 != null) {
                                            AudioRecorderParam audioRecorderParam = videoPublishEditModel14.veAudioRecorderParam;
                                            if (audioRecorderParam != null) {
                                                mutableLiveData2.setValue(audioRecorderParam);
                                            }
                                            VideoPublishEditModel videoPublishEditModel15 = this.LJLJI;
                                            if (videoPublishEditModel15 != null) {
                                                AudioEffectParam audioEffectParam = videoPublishEditModel15.veAudioEffectParam;
                                                if (audioEffectParam != null) {
                                                    audioEffectParam.setShowErrorToast(false);
                                                    VideoPublishEditModel videoPublishEditModel16 = this.LJLJI;
                                                    if (videoPublishEditModel16 != null) {
                                                        AudioEffectParam audioEffectParam2 = videoPublishEditModel16.veAudioEffectParam;
                                                        o.LJI(audioEffectParam2);
                                                        audioEffectParam2.setPreprocessResult(null);
                                                        VideoPublishEditModel videoPublishEditModel17 = this.LJLJI;
                                                        if (videoPublishEditModel17 != null) {
                                                            storedLiveData2.setValue(C135285Sq.LIZ(true, videoPublishEditModel17.veAudioEffectParam));
                                                        } else {
                                                            o.LJIJI("mModel");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                }
                                                VideoPublishEditModel videoPublishEditModel18 = this.LJLJI;
                                                if (videoPublishEditModel18 != null) {
                                                    H7R.LIZLLL(videoPublishEditModel18, C60903NvH.LJIIJJI().LJIILL().LJI());
                                                    if (this.LJLJI != null) {
                                                        C141525gy.LIZJ(i, videoHeight, _$_findCachedViewById(R.id.i1m));
                                                        if (bundle == null || !(getSupportFragmentManager().LJJJIL("cover") instanceof VEChooseVideoCoverFragment)) {
                                                            fTCChooseCoverFragment = new FTCChooseCoverFragment();
                                                            FragmentManager supportFragmentManager = getSupportFragmentManager();
                                                            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                                                            LIZ.LJIIIIZZ(R.id.fmm, 1, fTCChooseCoverFragment, "cover");
                                                            LIZ.LJI();
                                                        } else {
                                                            Fragment LJJJIL = getSupportFragmentManager().LJJJIL("cover");
                                                            o.LJII(LJJJIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment");
                                                            fTCChooseCoverFragment = (FTCChooseCoverFragment) LJJJIL;
                                                        }
                                                        this.LJLJL.observe(this, new AObserverS70S0100000_2(this, 217));
                                                        this.LJLJJLL.observe(this, new AObserverS70S0100000_2(this, 218));
                                                        fTCChooseCoverFragment.LJLJJL = this.LJLJL;
                                                        fTCChooseCoverFragment.LJLJJI = this.LJLJJLL;
                                                        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                                                        VideoPublishEditModel videoPublishEditModel19 = this.LJLJI;
                                                        if (videoPublishEditModel19 != null) {
                                                            C135315St c135315St5 = this.LJLJJI;
                                                            if (c135315St5 != null) {
                                                                supportFragmentManager2.LJJLIL(new C162076Xr(this, fTCChooseCoverFragment, videoPublishEditModel19, c135315St5, new AqS152S0100000_2(this, 705), new AqS152S0100000_2(this, 706)), false);
                                                                ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onCreate", false);
                                                                return;
                                                            } else {
                                                                o.LJIJI("mPresenter");
                                                                throw null;
                                                            }
                                                        }
                                                        o.LJIJI("mModel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mModel");
                                                    throw null;
                                                }
                                                o.LJIJI("mModel");
                                                throw null;
                                            }
                                            o.LJIJI("mModel");
                                            throw null;
                                        }
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                                o.LJIJI("mPresenter");
                                throw null;
                            }
                            o.LJIJI("mPresenter");
                            throw null;
                        }
                        o.LJIJI("mModel");
                        throw null;
                    }
                    o.LJIJI("mPresenter");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }
}
