package X;

import X.InterfaceC143655kP;
import Y.AObjectS84S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS3S0200001_2;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IDqS449S0100000_2;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.5jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C143265jm<T extends InterfaceC143655kP> extends AbstractC29891Fh<T> implements InterfaceC143655kP, InterfaceC135635Tz, InterfaceC143795kd {
    public final C5H3 LJLIL;
    public C143555kF LJLILLLLZI;
    public final C140815fp LJLJI;
    public C143455k5 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public C5MG LJLJL;
    public final C5H3 LJLJLJ;
    public final MutableLiveData<C143405k0> LJLJLLL;
    public final C5H3 LJLL;
    public boolean LJLLI;
    public final MutableLiveData<C140415fB> LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final C5H3 LJZL;
    public final MutableLiveData<OSZ<Boolean, C143515kB>> LL;
    public final MutableLiveData<C76800UCe> LLD;
    public final MutableLiveData<C76800UCe> LLF;
    public final MutableLiveData<Boolean> LLFF;
    public final MutableLiveData<C76800UCe> LLFFF;
    public final MutableLiveData<C76800UCe> LLFII;
    public final MutableLiveData<C76800UCe> LLFZ;
    public final MutableLiveData<OSZ<C76800UCe, String>> LLI;
    public final MutableLiveData<OSZ<C76800UCe, String>> LLIFFJFJJ;
    public final MutableLiveData<OSZ<C76800UCe, String>> LLII;
    public final MutableLiveData<OSZ<Boolean, Integer>> LLIIII;
    public final MutableLiveData<OSZ<Boolean, Integer>> LLIIIILZ;
    public final MutableLiveData<OSZ<Boolean, Integer>> LLIIIJ;
    public final MutableLiveData<OSZ<C76800UCe, String>> LLIIIL;
    public final MutableLiveData<C76800UCe> LLIIIZ;
    public final MutableLiveData<OSZ<Boolean, Integer>> LLIIJI;
    public final MutableLiveData<Boolean> LLIIJLIL;
    public final MutableLiveData<String> LLIIL;
    public final MutableLiveData<Integer> LLIILII;
    public final MutableLiveData<Integer> LLIILZL;
    public final MutableLiveData<Boolean> LLIIZ;
    public final ConcurrentHashMap<Integer, MutableLiveData<String>> LLIL;
    public boolean LLILII;
    public int LLILIL;
    public int LLILL;
    public C10K<C76800UCe> LLILLIZIL;
    public n<C76800UCe> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final MutableLiveData<Void> LLILZIL;
    public final MutableLiveData<Void> LLILZLL;
    public final MutableLiveData<Void> LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final C5H3 LLJ;
    public final C5H3 LLJI;
    public final LiveData<SurfaceView> LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final ReplayLiveData<C5RT> LLJILJILJ;
    public final StoredLiveData<C5RV> LLJILLL;
    public final ArrayList<EffectPointModel> LLJJ;
    public final MutableLiveData<Boolean> LLJJI;
    public final MutableLiveData<C5RV> LLJJIII;
    public final MutableLiveData<Integer> LLJJIJI;
    public final MutableLiveData<IAudioEffectParam> LLJJIJIIJIL;
    public final MutableLiveData<C5MM> LLJJIJIL;
    public final MutableLiveData<VEPreviewMusicParams> LLJJJ;
    public int LLJJJIL;
    public MutableLiveData<Integer> LLJJJJ;
    public final C5H3 LLJJJJJIL;
    public final C5H3 LLJJJJLIIL;
    public final MutableLiveData<C140335f3> LLJJL;
    public final C5H3 LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public SurfaceView LLJLILLLLZIIL;
    public ImageView LLJLL;
    public volatile boolean LLJLLIL;
    public FrameLayout LLJLLL;
    public FrameLayout LLJZ;
    public final boolean LLJZIJLIL;
    public boolean LLL;
    public C5PF LLLF;
    public final C82622Wbi LLLFF;
    public InterfaceC133095Kf LLLFFI;

    private final MutableLiveData<VEEditorAutoStartStopArbiter> LJLJJLL() {
        return (MutableLiveData) this.LJZL.getValue();
    }

    private final MutableLiveData<InterfaceC122704ri> LJLJLJ() {
        return (MutableLiveData) this.LJLLJ.getValue();
    }

    private final MutableLiveData<Boolean> LJLLL() {
        return (MutableLiveData) this.LJLLLLLL.getValue();
    }

    private final MutableLiveData<C123774tR> LJLZ() {
        return (MutableLiveData) this.LJLLLL.getValue();
    }

    private final MutableLiveData<Boolean> LJZI() {
        return (MutableLiveData) this.LJZ.getValue();
    }

    private final MutableLiveData<OSJ<Boolean, Boolean, Boolean>> LLF() {
        return (MutableLiveData) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final MutableLiveData<C123754tP> LLFFF() {
        return (MutableLiveData) this.LJLZ.getValue();
    }

    private final MutableLiveData<VEVolumeChangeOp> LLIILZL() {
        return (MutableLiveData) this.LJLLL.getValue();
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Bitmap> C0() {
        return (MutableLiveData) this.LLJI.getValue();
    }

    public T LJJLIIJ() {
        return this;
    }

    public final MutableLiveData<InterfaceC148845sm> LJLLILLLL() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }

    public final MutableLiveData<InterfaceC153045zY> LLIFFJFJJ() {
        return (MutableLiveData) this.LJZI.getValue();
    }

    public final MutableLiveData<C143495k9> LLIIIL() {
        return (MutableLiveData) this.LJLL.getValue();
    }

    public void LLLL() {
    }

    public void LLLLJI() {
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C122144qo> Lo0() {
        return (MutableLiveData) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC143655kP
    public C5S3 N40() {
        return (C5S3) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC143655kP
    public void Nj0(C143555kF param) {
        o.LJIIIZ(param, "param");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Boolean> Rq() {
        return (MutableLiveData) this.LLJJJJLIIL.getValue();
    }

    @Override // X.InterfaceC143655kP
    public C5MG WS() {
        return (C5MG) this.LJLJJLL.getValue();
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        this.LLILZ = true;
        AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(this, new AqS152S0100000_2((C143265jm) this, 269), 26);
        LLJJJIL(new AqS152S0100000_2(aqS149S0200000_2, 266));
        LLJLIL(new AqS149S0200000_2(this, aqS149S0200000_2, 25));
        super.onStop();
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Boolean> x7() {
        return (MutableLiveData) this.LLJ.getValue();
    }

    @Override // X.InterfaceC143655kP
    public void x8() {
    }

    @Override // X.InterfaceC143655kP
    public void y00() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.SurfaceView, X.5k3] */
    private final void LLIIZ() {
        this.LLJLLL = new FrameLayout(getActivity());
        final ActivityC45651qj activity = getActivity();
        ?? r1 = new SurfaceView(activity) { // from class: X.5k3
            public YTM LJLIL = new YTM(super.getHolder());

            @Override // android.view.SurfaceView
            public SurfaceHolder getHolder() {
                return this.LJLIL;
            }

            public void setEditorOptimizer(InterfaceC143545kE interfaceC143545kE) {
                YTM ytm = this.LJLIL;
                if (ytm != null) {
                    ytm.getClass();
                }
            }
        };
        this.LJLJI.getClass();
        r1.setEditorOptimizer(null);
        this.LLJLILLLLZIIL = r1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SurfaceView surfaceView = this.LLJLILLLLZIIL;
        if (surfaceView != null) {
            surfaceView.setLayoutParams(layoutParams);
            FrameLayout frameLayout = this.LLJLLL;
            if (frameLayout != null) {
                SurfaceView surfaceView2 = this.LLJLILLLLZIIL;
                if (surfaceView2 != null) {
                    frameLayout.addView(surfaceView2);
                    this.LLJLL = new ImageView(getActivity());
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    ImageView imageView = this.LLJLL;
                    if (imageView != null) {
                        imageView.setLayoutParams(layoutParams2);
                        FrameLayout frameLayout2 = this.LLJLLL;
                        if (frameLayout2 != null) {
                            ImageView imageView2 = this.LLJLL;
                            if (imageView2 != null) {
                                frameLayout2.addView(imageView2);
                                ImageView imageView3 = this.LLJLL;
                                if (imageView3 != null) {
                                    imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                                    if (this.LLJZIJLIL) {
                                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                                        SurfaceView surfaceView3 = this.LLJLILLLLZIIL;
                                        if (surfaceView3 != null) {
                                            FrameLayout frameLayout3 = new FrameLayout(surfaceView3.getContext());
                                            frameLayout3.setBackgroundColor(ColorProtector.parseColor("#80FF0000"));
                                            frameLayout3.setLayoutParams(layoutParams3);
                                            FrameLayout frameLayout4 = this.LLJLLL;
                                            if (frameLayout4 != null) {
                                                frameLayout4.addView(this.LLJZ);
                                                this.LLJZ = frameLayout3;
                                                return;
                                            } else {
                                                o.LJIJI("frameLayout");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("surfaceView");
                                        throw null;
                                    }
                                    return;
                                }
                                o.LJIJI("firstFrameView");
                                throw null;
                            }
                            o.LJIJI("firstFrameView");
                            throw null;
                        }
                        o.LJIJI("frameLayout");
                        throw null;
                    }
                    o.LJIJI("firstFrameView");
                    throw null;
                }
                o.LJIJI("surfaceView");
                throw null;
            }
            o.LJIJI("frameLayout");
            throw null;
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    private final void LLILZLL() {
        LLJLLIL(new C140415fB(this.LJLJJI.LIZ, (String) null, true, false, false));
    }

    @Override // X.InterfaceC143655kP
    public void BE() {
        this.LLFZ.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC143655kP
    public FrameLayout Iy() {
        FrameLayout frameLayout = this.LLJLLL;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("frameLayout");
        throw null;
    }

    public final void LJJLIIIJILLIZJL() {
        this.LJLJI.getClass();
    }

    public C5MG LJJLIIIJJIZ() {
        C135235Sl c135235Sl = this.LJLJI.LJFF;
        PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("EditPreviewComponent"));
        return new C5KW(c135235Sl);
    }

    public final ImageView LJJLL() {
        ImageView imageView = this.LLJLL;
        if (imageView != null) {
            return imageView;
        }
        o.LJIJI("firstFrameView");
        throw null;
    }

    public final FrameLayout LJJZZI() {
        FrameLayout frameLayout = this.LLJLLL;
        if (frameLayout != null) {
            return frameLayout;
        }
        o.LJIJI("frameLayout");
        throw null;
    }

    public final void LLLI() {
        int i = this.LLILIL;
        if (i > 0 && i == this.LLILL && this.LJLJI.LIZJ.invoke().booleanValue()) {
            this.LLILII = false;
            if (this.LJLJI.LJFF.LJII) {
                C5MG WS = WS();
                if (WS != null) {
                    WS.LJIJJLI().submit(new ARunnableS38S0100000_2(this, 76));
                }
            } else {
                InterfaceC153045zY LJLIIL = LJLIIL();
                if (LJLIIL != null) {
                    LJLIIL.LLIIIJ();
                }
                PS(true);
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AudioFadeout || all tasks have been finished, finishNum:");
                LIZ.append(this.LLILIL);
                LIZLLL.d(X1D.LIZIZ(LIZ));
            }
            this.LLILLJJLI.LIZJ(null);
        }
    }

    @Override // X.InterfaceC143655kP
    public void Mo0() {
        C6QQ.LIZ(new AqS152S0100000_2((C143265jm) this, 270));
    }

    @Override // X.InterfaceC143655kP
    public void Mt0() {
        this.LLFF.setValue(Boolean.FALSE);
    }

    @Override // X.InterfaceC143655kP
    public void Ru() {
        this.LLF.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC143655kP
    public void S50() {
        C6QQ.LIZ(new AqS152S0100000_2((C143265jm) this, 272));
    }

    @Override // X.InterfaceC143655kP
    public FilterBean W40() {
        return this.LJLJJI.LIZ;
    }

    @Override // X.InterfaceC143655kP
    public int W60() {
        SurfaceView surfaceView = this.LLJLILLLLZIIL;
        if (surfaceView != null) {
            return surfaceView.getHeight();
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public ViewGroup.MarginLayoutParams cd() {
        SurfaceView surfaceView = this.LLJLILLLLZIIL;
        if (surfaceView != null) {
            ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            if (layoutParams != null) {
                return (ViewGroup.MarginLayoutParams) layoutParams;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public void dq0() {
        this.LLFFF.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC143655kP
    public void finish() {
        this.LLFII.setValue(C76800UCe.LIZ);
    }

    public final SurfaceView getSurfaceView() {
        SurfaceView surfaceView = this.LLJLILLLLZIIL;
        if (surfaceView != null) {
            return surfaceView;
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public void go0() {
        C6QQ.LIZ(new AqS152S0100000_2((C143265jm) this, 268));
    }

    @Override // X.InterfaceC143655kP
    public void i90() {
        this.LLIIIZ.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC143655kP
    public void lN() {
        this.LLD.setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC143655kP
    public int lU() {
        SurfaceView surfaceView = this.LLJLILLLLZIIL;
        if (surfaceView != null) {
            return surfaceView.getWidth();
        }
        o.LJIJI("surfaceView");
        throw null;
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        this.LJLJI.LJIIJ.invoke(new AbstractC142705is() { // from class: X.5it
        }, new ARunnableS38S0100000_2(this, 73));
        super.onDestroy();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        LLJLIL(new AqS152S0100000_2((C143265jm) this, 263));
        super.onResume();
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        LLJLIL(new AqS152S0100000_2((C143265jm) this, 264));
        super.onStart();
        if (this.LJLJI.LJFF.LJII) {
            C5MG WS = WS();
            if (WS != null) {
                WS.LJIJJLI().submit(new ARunnableS38S0100000_2(this, 74));
                return;
            }
            return;
        }
        if (!this.LLL) {
            return;
        }
        LLLL();
        C5MG WS2 = WS();
        if (WS2 != null) {
            WS2.LJJIII(true);
        }
        PS(false);
        C82891Wg3.LIZLLL().i("AudioFadeout || EditPreviewComponent#onStart prepare");
    }

    private final void LLILZIL() {
        C5MG WS = WS();
        if (WS != null) {
            WS.LIZLLL = this.LLJJIJIIJIL;
        }
        LLJJL();
        C5MG WS2 = WS();
        if (WS2 != null) {
            WS2.LJ = J7();
        }
        Sj0().observe(this, new C134275Ot(this));
        Sj0().observe(this, new C135665Uc());
        C5MG WS3 = WS();
        if (WS3 != null) {
            WS3.LIZIZ = this.LLJJI;
        }
        C5MG WS4 = WS();
        if (WS4 != null) {
            WS4.LIZJ = this.LLJJIII;
        }
    }

    private final void LLIZ() {
        LJLLILLLL().setValue(LJJLIIIJJI(this.LJLJI.LIZLLL.invoke()));
        C5MG WS = WS();
        if (WS != null) {
            WS.LJIILJJIL = LJLLILLLL().getValue();
        }
        LJLJLJ().setValue(new InterfaceC122704ri() { // from class: X.4tw
            @Override // X.InterfaceC122704ri
            public final float LIZ(FilterBean filterBean) {
                o.LJIIIZ(filterBean, "filterBean");
                float LIZLLL = C44659Hfr.LIZLLL(filterBean);
                if (LIZLLL == 0.0f) {
                    C143265jm c143265jm = C143265jm.this;
                    String filterFolder = filterBean.getFilterFolder();
                    o.LJIIIIZZ(filterFolder, "filterBean.filterFolder");
                    return c143265jm.LJJLJLI(filterFolder);
                }
                return LIZLLL;
            }
        });
        this.LJLLILLLL.observe(this, new C135665Uc());
        this.LJLLILLLL.observe(this, new AObjectS84S0100000_2(this, 78));
    }

    private final void LLJ() {
        Rq().observe(this, new AObjectS84S0100000_2(this, 79));
    }

    private final void LLJJ() {
        DM().observe(this, new AObjectS84S0100000_2(this, 72));
    }

    private final void LLJJI() {
        LJZI().observe(this, new AObjectS84S0100000_2(this, 73));
    }

    private final void LLJJIII() {
        LLFFF().observe(this, new AObjectS84S0100000_2(this, 74));
    }

    private final void LLJJIJIL() {
        LLIILZL().observe(this, new AObjectS84S0100000_2(this, 75));
        LLIILZL().observe(this, new C135665Uc());
    }

    private final void LLJZIJLIL() {
        InterfaceC153045zY interfaceC153045zY;
        LLLFFI();
        IAudioEffectParam veAudioEffectParam = this.LLLFFI.getVeAudioEffectParam();
        if (veAudioEffectParam != null) {
            C78841Uwv.LJJIIZ("EditPreviewComponent#veAudioEffectParam", new AqS149S0200000_2(veAudioEffectParam, this, 27));
        }
        MutableLiveData<InterfaceC153045zY> LLIFFJFJJ = LLIFFJFJJ();
        C5MG WS = WS();
        if (WS != null) {
            interfaceC153045zY = WS.LJJ();
        } else {
            interfaceC153045zY = null;
        }
        LLIFFJFJJ.setValue(interfaceC153045zY);
        InterfaceC153045zY value = LLIFFJFJJ().getValue();
        if (value != null) {
            value.LLIILII(new AqS168S0100000_2(this, 196));
        }
        LJLJJLL().setValue(LJJLJ());
        if (WS() != null) {
            MutableLiveData<C5MM> previewControlLiveData = DM();
            o.LJIIIZ(previewControlLiveData, "previewControlLiveData");
        }
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> Av() {
        return LJLLL();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<InterfaceC153045zY> Kh() {
        return LLIFFJFJJ();
    }

    public final VEEditorAutoStartStopArbiter LJJLJ() {
        C5MG WS = WS();
        if (WS != null) {
            return WS.LJFF;
        }
        return null;
    }

    public final InterfaceC153045zY LJLIIL() {
        C5MG WS = WS();
        if (WS != null) {
            return WS.LJJ();
        }
        return null;
    }

    @Override // X.InterfaceC143655kP
    /* renamed from: LJLJJL, reason: merged with bridge method [inline-methods] */
    public MutableLiveData<VEVolumeChangeOp> tZ() {
        return LLIILZL();
    }

    public void LLJI() {
        LJLZ().observe(this, new AObjectS84S0100000_2(this, 80));
        LJLZ().observe(this, new C135665Uc());
    }

    public int LLJJIJI() {
        C5MG WS = WS();
        if (WS != null) {
            WS.LJJ = new C5MX() { // from class: X.5eK
                @Override // X.C5MX
                public final void LIZ() {
                    VEEditorAutoStartStopArbiter value;
                    C143265jm.this.LLLLJI();
                    C143265jm c143265jm = C143265jm.this;
                    if (!c143265jm.LLJL) {
                        c143265jm.LLJL = true;
                        C82891Wg3.LIZLLL().d("receive prepare done event");
                        C143265jm c143265jm2 = C143265jm.this;
                        if (c143265jm2.LJLJI.LJFF.LJIIIZ && (value = c143265jm2.wz().getValue()) != null) {
                            value.LIZLLL();
                        }
                        C143265jm.this.LLILZIL.postValue(null);
                    }
                    C143265jm.this.LJLJI.LIZIZ.getClass();
                }
            };
        }
        C5MG WS2 = WS();
        if (WS2 != null) {
            WS2.LJJI = new C5MS() { // from class: X.5jq
                @Override // X.C5MS
                public final void LIZ(float f) {
                    C143405k0 c143405k0;
                    MutableLiveData<C143405k0> mutableLiveData = C143265jm.this.LJLJLLL;
                    C143405k0 value = mutableLiveData.getValue();
                    if (value != null) {
                        c143405k0 = C143405k0.L(value, f, 0, 0, 0.0f, 14);
                    } else {
                        c143405k0 = null;
                    }
                    mutableLiveData.postValue(c143405k0);
                }

                @Override // X.C5MS
                public final void LIZIZ(int i) {
                    C143405k0 c143405k0;
                    MutableLiveData<C143405k0> mutableLiveData = C143265jm.this.LJLJLLL;
                    C143405k0 value = mutableLiveData.getValue();
                    if (value != null) {
                        c143405k0 = C143405k0.L(value, 0.0f, 0, i, 0.0f, 11);
                    } else {
                        c143405k0 = null;
                    }
                    mutableLiveData.postValue(c143405k0);
                }

                @Override // X.C5MS
                public final void LIZJ(float f) {
                    C143405k0 c143405k0;
                    MutableLiveData<C143405k0> mutableLiveData = C143265jm.this.LJLJLLL;
                    C143405k0 value = mutableLiveData.getValue();
                    if (value != null) {
                        c143405k0 = C143405k0.L(value, 0.0f, 0, 0, f, 7);
                    } else {
                        c143405k0 = null;
                    }
                    mutableLiveData.postValue(c143405k0);
                }

                @Override // X.C5MS
                public final void LIZLLL(int i) {
                    C143405k0 c143405k0;
                    MutableLiveData<C143405k0> mutableLiveData = C143265jm.this.LJLJLLL;
                    C143405k0 value = mutableLiveData.getValue();
                    if (value != null) {
                        c143405k0 = C143405k0.L(value, 0.0f, i, 0, 0.0f, 13);
                    } else {
                        c143405k0 = null;
                    }
                    mutableLiveData.postValue(c143405k0);
                }
            };
        }
        C5MG WS3 = WS();
        if (WS3 != null) {
            WS3.LJJIFFI = new C5MY() { // from class: X.5k4
                @Override // X.C5MY
                public final void LIZ(int i, int i2, int i3) {
                    C143265jm.this.LLIIIL().postValue(new C143495k9(i, i2, i3));
                }
            };
        }
        C5MG WS4 = WS();
        if (WS4 != null) {
            ActivityC45651qj activity = getActivity();
            InterfaceC133095Kf interfaceC133095Kf = this.LLLFFI;
            SurfaceView surfaceView = this.LLJLILLLLZIIL;
            if (surfaceView != null) {
                return WS4.LJJII(activity, interfaceC133095Kf, surfaceView, this);
            }
            o.LJIJI("surfaceView");
            throw null;
        }
        return -1;
    }

    public void LLJJL() {
        pJ().observe(this, new AObjectS84S0100000_2(this, 76));
        pJ().observe(this, new C135665Uc());
    }

    public void LLLFFI() {
        C5MG WS = WS();
        if (WS != null) {
            C125984x0 c125984x0 = new C125984x0(WS);
            C133765Mu c133765Mu = WS.LJII;
            if (c133765Mu != null) {
                c133765Mu.LLIIJLIL(c125984x0);
            } else {
                o.LJIJI("mVEEditor");
                throw null;
            }
        }
        C5MG WS2 = WS();
        if (WS2 != null) {
            ConcurrentHashMap<Integer, MutableLiveData<String>> callbackData = this.LLIL;
            o.LJIIIZ(callbackData, "callbackData");
            C133765Mu c133765Mu2 = WS2.LJII;
            if (c133765Mu2 != null) {
                C78841Uwv.LJJIII(WS2, "setEffectMessageCenterCallback", c133765Mu2, new AqS168S0100000_2(callbackData, 37));
            } else {
                o.LJIJI("mVEEditor");
                throw null;
            }
        }
        C5MG WS3 = WS();
        if (WS3 != null) {
            WS3.LJJIII(LJJZZIII());
        }
    }

    public void LLLILZLLLI() {
        LLJZIJLIL();
        LLIZ();
        LLILZLL();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<InterfaceC148845sm> Nm() {
        return LJLLILLLL();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSJ<Boolean, Boolean, Boolean>> Zq0() {
        return LLF();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C123754tP> eA() {
        return LLFFF();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLJJIJI();
        LLJZIJLIL();
        LLIZ();
        if (this.LJLJI.LJI) {
            LLILZLL();
        }
        LLILZIL();
        LLJJ();
        LLJJIJIL();
        LLJI();
        LLJJIII();
        LLJ();
        LLJJI();
        LiveData<SurfaceView> D50 = D50();
        if (D50 != null) {
            SurfaceView surfaceView = this.LLJLILLLLZIIL;
            if (surfaceView != null) {
                D50.setValue(surfaceView);
                return;
            } else {
                o.LJIJI("surfaceView");
                throw null;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<android.view.SurfaceView>");
    }

    @Override // X.InterfaceC143655kP
    public void p1() {
        FilterBean filterBean;
        C5MG WS = WS();
        if (WS == null || (filterBean = WS.LJJIIZ) == null || !C44659Hfr.LJ(filterBean)) {
            return;
        }
        C133765Mu c133765Mu = WS.LJII;
        if (c133765Mu != null) {
            C78841Uwv.LJJIII(WS, "", c133765Mu, new AqS133S0200000_2(WS, filterBean, 14));
        } else {
            o.LJIJI("mVEEditor");
            throw null;
        }
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C123774tR> pR() {
        return LJLZ();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C143495k9> pp0() {
        return LLIIIL();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> q40() {
        return LJZI();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<InterfaceC122704ri> v50() {
        return LJLJLJ();
    }

    @Override // X.InterfaceC143655kP
    public LiveData<VEEditorAutoStartStopArbiter> wz() {
        return LJLJJLL();
    }

    @Override // X.InterfaceC143655kP
    public InterfaceC133095Kf Ax() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<SurfaceView> D50() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C5MM> DM() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C140415fB> Dm() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> Dw() {
        return this.LLI;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> Hi0() {
        return this.LLIIIL;
    }

    @Override // X.InterfaceC143655kP
    public ArrayList<EffectPointModel> J7() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC143655kP
    public boolean Jt0() {
        return this.LJLLI;
    }

    public boolean LJJZZIII() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> Lg0() {
        return this.LLIIIILZ;
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C143405k0> Mq() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<C140335f3> PM() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> Qs() {
        return this.LLIIJI;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> SW() {
        return this.LLFF;
    }

    @Override // X.InterfaceC143655kP
    public StoredLiveData<C5RV> Sj0() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> TL() {
        return this.LLF;
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Integer> UR() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC143655kP
    public int V30() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> We0() {
        return this.LLIIIZ;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> Xb0() {
        return this.LLIIZ;
    }

    @Override // X.InterfaceC143655kP
    public /* bridge */ /* synthetic */ LiveData Zj0() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC143655kP
    public /* bridge */ /* synthetic */ LiveData bq0() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC143655kP
    public /* bridge */ /* synthetic */ LiveData dZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Integer> fc0() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        LJJLIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> he0() {
        return this.LLIIIJ;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C5RV> i3() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> jC() {
        return this.LLII;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> jb() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<VEPreviewMusicParams> jn() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> kn0() {
        return this.LLD;
    }

    @Override // X.InterfaceC143655kP
    public ReplayLiveData<C5RT> pJ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC143655kP
    public boolean pi() {
        return this.LLL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Boolean> q60() {
        return this.LLIIJLIL;
    }

    @Override // X.InterfaceC143655kP
    public boolean qF() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, C143515kB>> qP() {
        return this.LL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> sI() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<IAudioEffectParam> sP() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> sU() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC143655kP
    public MutableLiveData<Boolean> tG() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<C76800UCe> tH() {
        return this.LLFII;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Integer> tf() {
        return this.LLIILZL;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<Boolean, Integer>> vE() {
        return this.LLIIII;
    }

    @Override // X.InterfaceC143655kP
    public /* bridge */ /* synthetic */ LiveData wf0() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<OSZ<C76800UCe, String>> xm0() {
        return this.LLIFFJFJJ;
    }

    @Override // X.InterfaceC143655kP
    public LiveData<Integer> zL() {
        return this.LLIILII;
    }

    private final void LLILL(C143505kA c143505kA) {
        Lo0().observe(this, new AObjectS84S0100000_2(this, 77));
    }

    private final void LLJJJIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C140815fp c140815fp = this.LJLJI;
        if (!c140815fp.LJII) {
            c140815fp.getClass();
            this.LJLJI.getClass();
            interfaceC65784Pro.invoke();
        }
    }

    private final void LLJLIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C140815fp c140815fp = this.LJLJI;
        if (c140815fp.LJII) {
            c140815fp.getClass();
            this.LJLJI.getClass();
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC143655kP
    public void AE(C140415fB op) {
        o.LJIIIZ(op, "op");
        this.LJLLILLLL.setValue(op);
        FilterBean filterBean = op.LJLILLLLZI;
        if (filterBean != null) {
            C143455k5 c143455k5 = this.LJLJJI;
            c143455k5.getClass();
            c143455k5.LIZ = filterBean;
        }
    }

    @Override // X.InterfaceC143655kP
    public void Ay(int i) {
        this.LLJJJIL = i;
    }

    @Override // X.InterfaceC143655kP
    public void Dl0(VEVolumeChangeOp volumeChangeOp) {
        o.LJIIIZ(volumeChangeOp, "volumeChangeOp");
        C77357UXp.LJJJJI(LLIILZL(), volumeChangeOp);
    }

    @Override // X.InterfaceC143655kP
    public void Ea(C122144qo autoEnhanceControlOp) {
        o.LJIIIZ(autoEnhanceControlOp, "autoEnhanceControlOp");
        Lo0().setValue(autoEnhanceControlOp);
    }

    @Override // X.InterfaceC143655kP
    public void Ic(String str) {
        this.LLIFFJFJJ.setValue(new OSZ<>(C76800UCe.LIZ, str));
    }

    @Override // X.InterfaceC143655kP
    public void Kp(int i) {
        WS();
    }

    public void LJJLIIIIJ(C140415fB c140415fB) {
        if (c140415fB != null) {
            if (!c140415fB.LJLJI) {
                C5MG WS = WS();
                if (WS != null) {
                    WS.LJIIJ(this.LJLJI.LIZ.invoke().booleanValue(), c140415fB.LJLILLLLZI);
                    return;
                }
                return;
            }
            FilterBean filterBean = c140415fB.LJLILLLLZI;
            if (filterBean == null) {
                return;
            }
            LJJLI(filterBean, c140415fB.LJLJJI);
        }
    }

    public InterfaceC148845sm LJJLIIIJJI(String tag) {
        o.LJIIIZ(tag, "tag");
        return C43909HLd.LIZ(tag);
    }

    public final void LJJLIIIJLLLLLLLZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LJLJI.LJFF.LJII) {
            C5MG WS = WS();
            if (WS != null) {
                WS.LJIJJLI().submit(new ARunnableS38S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 75));
                return;
            }
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public float LJJLJLI(String filterPath) {
        o.LJIIIZ(filterPath, "filterPath");
        InterfaceC153045zY value = LLIFFJFJJ().getValue();
        if (value != null) {
            return value.LL(filterPath);
        }
        return 0.0f;
    }

    public final void LLJLLIL(C140415fB op) {
        o.LJIIIZ(op, "op");
        this.LJLLILLLL.postValue(op);
    }

    public final void LLLFZ(InterfaceC133095Kf params) {
        o.LJIIIZ(params, "params");
        this.LLLFFI = params;
    }

    public final void LLLIIIL(boolean z) {
        if (!N40().LIZJ) {
            return;
        }
        C83964WxM.LIZ.LIZ("AudioFadeout || EditPreviewComponent#resetAudioFadeout");
        N40().LIZJ(z);
    }

    public final void LLLJ(ImageView imageView) {
        o.LJIIIZ(imageView, "<set-?>");
        this.LLJLL = imageView;
    }

    public final void LLLJIL(FrameLayout frameLayout) {
        o.LJIIIZ(frameLayout, "<set-?>");
        this.LLJLLL = frameLayout;
    }

    public void LLLJL(boolean z) {
        this.LLJLIL = z;
    }

    public final void LLLLJ(SurfaceView surfaceView) {
        o.LJIIIZ(surfaceView, "<set-?>");
        this.LLJLILLLLZIIL = surfaceView;
    }

    @Override // X.InterfaceC143655kP
    public void MK(C5PF effectOp) {
        o.LJIIIZ(effectOp, "effectOp");
        C5MG WS = WS();
        if (WS != null) {
            this.LJLJI.LJ.invoke();
            WS.LJIIIIZZ(effectOp);
        }
        this.LLLF = effectOp;
    }

    @Override // X.InterfaceC143655kP
    public void Ml(boolean z) {
        VEEditorAutoStartStopArbiter LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.LIZJ(z, false);
        }
    }

    public void N6(boolean z) {
        FilterBean filterBean;
        C5MG WS = WS();
        if (WS != null) {
            C140415fB value = this.LJLLILLLL.getValue();
            if (value != null) {
                filterBean = value.LJLILLLLZI;
            } else {
                filterBean = null;
            }
            C133765Mu c133765Mu = WS.LJII;
            if (c133765Mu != null) {
                C78841Uwv.LJJIII(WS, "", c133765Mu, new AqS168S0100000_2(filterBean, 33));
            } else {
                o.LJIJI("mVEEditor");
                throw null;
            }
        }
        C143455k5 c143455k5 = this.LJLJJI;
        FilterBean filterBean2 = (FilterBean) C82238WPi.LIZIZ.getValue();
        c143455k5.getClass();
        o.LJIIIZ(filterBean2, "<set-?>");
        c143455k5.LIZ = filterBean2;
    }

    @Override // X.InterfaceC143655kP
    public void Nn0(boolean z) {
        this.LLFF.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC143655kP
    public void Ov(boolean z) {
        this.LJLLI = z;
    }

    @Override // X.InterfaceC143655kP
    public void PS(boolean z) {
        C82891Wg3.LIZLLL().d("AudioFadeout || EditPreviewComponent#markEngineReleaseState");
        this.LLL = z;
    }

    @Override // X.InterfaceC143655kP
    public void Pf0(boolean z) {
        VEEditorAutoStartStopArbiter LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.LIZJ(z, false);
        }
    }

    @Override // X.InterfaceC143655kP
    public void UE(String str) {
        this.LLIIIL.setValue(new OSZ<>(C76800UCe.LIZ, str));
    }

    @Override // X.InterfaceC143655kP
    public void YM(int i) {
        this.LLIILZL.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC143655kP
    public void Zm(MutableLiveData<Integer> mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<set-?>");
        this.LLJJJJ = mutableLiveData;
    }

    @Override // X.InterfaceC143655kP
    public void ak(String str) {
        this.LLII.setValue(new OSZ<>(C76800UCe.LIZ, str));
    }

    @Override // X.InterfaceC143655kP
    public void dn(boolean z) {
        Rq().setValue(Boolean.valueOf(z));
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 viewModel1) {
        o.LJIIIZ(viewModel1, "viewModel1");
        return (S1) C73297Sph.LIZIZ(this, viewModel1);
    }

    @Override // X.InterfaceC143655kP
    public void gw(int i) {
        this.LLIILII.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC143655kP
    public LiveData<String> ij(int i) {
        if (this.LLIL.get(Integer.valueOf(i)) == null) {
            this.LLIL.put(Integer.valueOf(i), new MutableLiveData<>());
        }
        return this.LLIL.get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC143655kP
    public void jo(String str) {
        this.LLI.setValue(new OSZ<>(C76800UCe.LIZ, str));
    }

    @Override // X.InterfaceC143655kP
    public void m70(boolean z) {
        this.LLIIZ.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC143655kP
    public void nc0(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC143655kP
    public void oF(C140335f3 previewScaleOp) {
        o.LJIIIZ(previewScaleOp, "previewScaleOp");
        PM().setValue(previewScaleOp);
    }

    @Override // X.InterfaceC143655kP
    public void rZ(boolean z) {
        LJLLL().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC143655kP
    public void tt0(C123754tP soundLoopChangeOp) {
        o.LJIIIZ(soundLoopChangeOp, "soundLoopChangeOp");
        LLFFF().setValue(soundLoopChangeOp);
    }

    @Override // X.InterfaceC143655kP
    public void uC(C123774tR musicStartChangeOp) {
        o.LJIIIZ(musicStartChangeOp, "musicStartChangeOp");
        LJLZ().setValue(musicStartChangeOp);
    }

    @Override // X.InterfaceC143655kP
    public void wZ(boolean z) {
        LJZI().setValue(Boolean.valueOf(z));
    }

    public boolean x70(VEPreviewMusicParams params) {
        o.LJIIIZ(params, "params");
        C77357UXp.LJJJJI(this.LLJJJ, params);
        C5MG WS = WS();
        if (WS != null) {
            return WS.LJIIJJI(params);
        }
        return false;
    }

    @Override // X.InterfaceC143655kP
    public void Gd(boolean z, int i) {
        this.LLIIIILZ.setValue(new OSZ<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    public String LJJLI(FilterBean filterBean, String str) {
        C5MG WS = WS();
        if (WS == null || filterBean == null) {
            return null;
        }
        C133765Mu c133765Mu = WS.LJII;
        if (c133765Mu != null) {
            C78841Uwv.LJJIII(WS, "", c133765Mu, new AqS56S1100000_2(WS, str, 0));
            return WS.LJJIII;
        }
        o.LJIJI("mVEEditor");
        throw null;
    }

    @Override // X.InterfaceC143655kP
    public void Ot(boolean z, C143515kB c143515kB) {
        this.LL.setValue(new OSZ<>(Boolean.valueOf(z), c143515kB));
    }

    @Override // X.InterfaceC143655kP
    public void Uc(boolean z, int i) {
        this.LLIIIJ.setValue(new OSZ<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    @Override // X.InterfaceC143655kP
    public void aM(boolean z, int i) {
        this.LLIIII.setValue(new OSZ<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    @Override // X.InterfaceC143655kP
    public void ul0(boolean z, int i) {
        this.LLIIJLIL.setValue(Boolean.valueOf(z));
        this.LLIIJI.setValue(new OSZ<>(Boolean.valueOf(z), Integer.valueOf(i)));
    }

    @Override // X.InterfaceC143655kP
    public void updateTrackFilterParam(int i, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        C5MG WS = WS();
        if (WS != null) {
            WS.LJJ().updateTrackFilterParam(i, param);
        }
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIIZILJ(viewModel1, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, InterfaceC88472Yns<? super PROP1, ? extends R> block) {
        o.LJIIIZ(middleware1, "middleware1");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIL(middleware1, block);
    }

    @Override // X.InterfaceC143655kP
    public void I7(int i, int i2, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        C5MG WS = WS();
        if (WS != null) {
            WS.LJJ().I7(i, i2, param);
        }
    }

    @Override // X.InterfaceC143655kP
    public void U2(boolean z, boolean z2, boolean z3) {
        LLF().setValue(new OSJ<>(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJIIIZ(this, subscribe, config, subscriber);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.4tv] */
    public void tp(FilterBean filterBean, FilterBean filterBean2, float f) {
        float f2;
        if (filterBean == null || filterBean2 == null) {
            return;
        }
        if (f < 0) {
            f2 = Math.abs(f);
        } else {
            f2 = 1 - f;
        }
        InterfaceC153045zY value = LLIFFJFJJ().getValue();
        if (value == null) {
            return;
        }
        if (this.LJLJI.LIZ.invoke().booleanValue()) {
            C78841Uwv.LJJIIJZLJL("EditPreviewComponent.setFilterOnFling_new", value, new C122194qt(new InterfaceC122704ri() { // from class: X.4tv
                @Override // X.InterfaceC122704ri
                public final float LIZ(FilterBean filterBean3) {
                    o.LJIIIZ(filterBean3, "filterBean");
                    float LIZLLL = C44659Hfr.LIZLLL(filterBean3);
                    if (LIZLLL == 0.0f) {
                        C143265jm c143265jm = C143265jm.this;
                        String filterFolder = filterBean3.getFilterFolder();
                        o.LJIIIIZZ(filterFolder, "filterBean.filterFolder");
                        return c143265jm.LJJLJLI(filterFolder);
                    }
                    return LIZLLL;
                }
            }, this, filterBean, filterBean2, f2));
        } else {
            C78841Uwv.LJJIIJZLJL("EditPreviewComponent.setFilterOnFling", value, new AqS3S0200001_2(filterBean, filterBean2, f2, 1));
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(viewModel2, "viewModel2");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIILLIIL(viewModel1, viewModel2, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> block) {
        o.LJIIIZ(middleware1, "middleware1");
        o.LJIIIZ(middleware2, "middleware2");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIJJLI(middleware1, middleware2, block);
    }

    public C143265jm(C82622Wbi diContainer, InterfaceC133095Kf params, InterfaceC88472Yns<? super C140815fp, C76800UCe> interfaceC88472Yns, C143455k5 c143455k5) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(params, "params");
        this.LLLFF = diContainer;
        this.LLLFFI = params;
        this.LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2((C143265jm) this, 265));
        C140815fp c140815fp = new C140815fp();
        this.LJLJI = c140815fp;
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2((C143265jm) this, 267));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c140815fp);
        }
        LLIIZ();
        this.LJLJJI = c143455k5 == null ? new C143455k5() : c143455k5;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2((C143265jm) this, 274));
        this.LJLJLJ = C221108m2.LIZIZ(C143355jv.LJLIL);
        MutableLiveData<C143405k0> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new C143405k0(0));
        this.LJLJLLL = mutableLiveData;
        this.LJLL = C221108m2.LIZIZ(C143365jw.LJLIL);
        this.LJLLI = true;
        this.LJLLILLLL = new MutableLiveData<>();
        this.LJLLJ = C221108m2.LIZIZ(C143345ju.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(C140905fy.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C140885fw.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C140975g5.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C140895fx.LJLIL);
        this.LJZ = C221108m2.LIZIZ(C140985g6.LJLIL);
        this.LJZI = C221108m2.LIZIZ(C140995g7.LJLIL);
        this.LJZL = C221108m2.LIZIZ(C143335jt.LJLIL);
        this.LL = new MutableLiveData<>();
        this.LLD = new MutableLiveData<>();
        this.LLF = new MutableLiveData<>();
        this.LLFF = new MutableLiveData<>();
        this.LLFFF = new MutableLiveData<>();
        this.LLFII = new MutableLiveData<>();
        this.LLFZ = new MutableLiveData<>();
        this.LLI = new MutableLiveData<>();
        this.LLIFFJFJJ = new MutableLiveData<>();
        this.LLII = new MutableLiveData<>();
        this.LLIIII = new MutableLiveData<>();
        this.LLIIIILZ = new MutableLiveData<>();
        this.LLIIIJ = new MutableLiveData<>();
        this.LLIIIL = new MutableLiveData<>();
        this.LLIIIZ = new MutableLiveData<>();
        this.LLIIJI = new MutableLiveData<>();
        this.LLIIJLIL = new MutableLiveData<>();
        this.LLIIL = new MutableLiveData<>();
        this.LLIILII = new MutableLiveData<>();
        this.LLIILZL = new MutableLiveData<>();
        this.LLIIZ = new MutableLiveData<>();
        this.LLIL = new ConcurrentHashMap<>();
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(null);
        o.LJIIIIZZ(LJIIIZ, "Task.forResult(null)");
        this.LLILLIZIL = LJIIIZ;
        this.LLILLJJLI = new n<>();
        this.LLILZIL = new MutableLiveData<>();
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = new MutableLiveData<>();
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = C221108m2.LIZIZ(new AqS152S0100000_2((C143265jm) this, 273));
        this.LLJI = C221108m2.LIZIZ(new AqS152S0100000_2((C143265jm) this, 271));
        this.LLJIJIL = new MutableLiveData();
        this.LLJILJIL = new MutableLiveData<>();
        this.LLJILJILJ = new ReplayLiveData<>();
        this.LLJILLL = new StoredLiveData<>();
        this.LLJJ = new ArrayList<>();
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new MutableLiveData<>();
        this.LLJJIJIIJIL = new MutableLiveData<>();
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJ = new MutableLiveData<>();
        this.LLJJJJ = new MutableLiveData<>();
        this.LLJJJJJIL = C221108m2.LIZIZ(C143375jx.LJLIL);
        this.LLJJJJLIIL = C221108m2.LIZIZ(C141005g8.LJLIL);
        this.LLJJL = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = C221108m2.LIZIZ(C140915fz.LJLIL);
        this.LLJLIL = true;
    }

    @Override // X.InterfaceC143655kP
    public void LJJIJL(int i, long j, long j2, String arg3) {
        o.LJIIIZ(arg3, "arg3");
        C5MG WS = WS();
        if (WS != null) {
            C133765Mu c133765Mu = WS.LJII;
            if (c133765Mu != null) {
                C78841Uwv.LJJIII(WS, "sendEffectMsg", c133765Mu, new C5NK(i, j, j2, arg3));
            } else {
                o.LJIJI("mVEEditor");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> selectNonNullSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(selectNonNullSubscribe, "$this$selectNonNullSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        C73297Sph.LIZJ(this, selectNonNullSubscribe, prop1, config, subscriber);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJ(this, selectSubscribe, prop1, config, subscriber);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> subscribeEvent, TBW<S, ? extends C45927I0t<? extends A>> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(subscribeEvent, "$this$subscribeEvent");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        C73297Sph.LJIIJ(this, subscribeEvent, prop1, config, subscriber);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> subscribeMultiEvent, TBW<S, ? extends C2KE<? extends A>> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> subscriber) {
        o.LJIIIZ(subscribeMultiEvent, "$this$subscribeMultiEvent");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        C73297Sph.LJIIL(this, subscribeMultiEvent, prop1, config, subscriber);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, VM3 viewModel3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(viewModel2, "viewModel2");
        o.LJIIIZ(viewModel3, "viewModel3");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIILL(viewModel1, viewModel2, viewModel3, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, C73139Sn9<S3, PROP3> middleware3, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> block) {
        o.LJIIIZ(middleware1, "middleware1");
        o.LJIIIZ(middleware2, "middleware2");
        o.LJIIIZ(middleware3, "middleware3");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIJJ(middleware1, middleware2, middleware3, block);
    }

    @Override // X.InterfaceC143655kP
    public void LA(VEPreviewMusicParams params, long j, long j2, long j3, long j4) {
        int i;
        int i2;
        C123764tQ c123764tQ;
        o.LJIIIZ(params, "params");
        C5MG WS = WS();
        if (WS != null) {
            int i3 = params.mShootDuration;
            if (i3 > 0 && Math.abs(params.mDuration - i3) >= 1000) {
                i = params.mInPoint;
                i2 = params.mShootDuration;
            } else {
                i = params.mInPoint;
                i2 = params.mDuration;
            }
            int i4 = i + i2;
            if (params.mPath != null && (c123764tQ = WS.LJIIL) != null) {
                int i5 = c123764tQ.LJLJJLL;
                if (i5 != 0) {
                    C1301758z.LIZ(i5, j, j2, j3, j4, new IDqS449S0100000_2(c123764tQ, 1));
                } else {
                    c123764tQ.LJLILLLLZI = params.mInPoint;
                    c123764tQ.LJLJI = i4;
                }
            }
        }
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJFF(this, selectSubscribe, prop1, prop2, config, subscriber);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, VM3 viewModel3, VM4 viewModel4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(viewModel2, "viewModel2");
        o.LJIIIZ(viewModel3, "viewModel3");
        o.LJIIIZ(viewModel4, "viewModel4");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIILJJIL(viewModel1, viewModel2, viewModel3, viewModel4, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, C73139Sn9<S3, PROP3> middleware3, C73139Sn9<S4, PROP4> middleware4, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> block) {
        o.LJIIIZ(middleware1, "middleware1");
        o.LJIIIZ(middleware2, "middleware2");
        o.LJIIIZ(middleware3, "middleware3");
        o.LJIIIZ(middleware4, "middleware4");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIJI(middleware1, middleware2, middleware3, middleware4, block);
    }

    public /* synthetic */ C143265jm(C82622Wbi c82622Wbi, InterfaceC133095Kf interfaceC133095Kf, InterfaceC88472Yns interfaceC88472Yns, C143455k5 c143455k5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, interfaceC133095Kf, (i & 4) != 0 ? null : interfaceC88472Yns, (i & 8) != 0 ? null : c143455k5);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        return C73297Sph.LIZ(this, asyncSubscribe, prop, config, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJI(this, selectSubscribe, prop1, prop2, prop3, config, subscriber);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, VM3 viewModel3, VM4 viewModel4, VM5 viewModel5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(viewModel2, "viewModel2");
        o.LJIIIZ(viewModel3, "viewModel3");
        o.LJIIIZ(viewModel4, "viewModel4");
        o.LJIIIZ(viewModel5, "viewModel5");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIILIIL(viewModel1, viewModel2, viewModel3, viewModel4, viewModel5, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, C73139Sn9<S3, PROP3> middleware3, C73139Sn9<S4, PROP4> middleware4, C73139Sn9<S5, PROP5> middleware5, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> block) {
        o.LJIIIZ(middleware1, "middleware1");
        o.LJIIIZ(middleware2, "middleware2");
        o.LJIIIZ(middleware3, "middleware3");
        o.LJIIIZ(middleware4, "middleware4");
        o.LJIIIZ(middleware5, "middleware5");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIJ(middleware1, middleware2, middleware3, middleware4, middleware5, block);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJII(this, selectSubscribe, prop1, prop2, prop3, prop4, config, subscriber);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C73165SnZ<TMF> config, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(prop5, "prop5");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJIIIIZZ(this, selectSubscribe, prop1, prop2, prop3, prop4, prop5, config, subscriber);
    }
}
