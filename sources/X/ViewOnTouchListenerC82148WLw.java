package X;

import Y.ARunnableS50S0100000_14;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WLw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC82148WLw extends WM7 implements InterfaceC143795kd, View.OnTouchListener, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIJ;
    public final C82622Wbi LJLIL;
    public ImageView LJLILLLLZI;
    public SY2 LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public WG4 LJLJJLL;
    public TextView LJLJL;
    public RelativeLayout LJLJLJ;
    public FrameLayout LJLJLLL;
    public View LJLL;
    public InterfaceC145445nI LJLLI;
    public VideoPublishEditModel LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public float LJZI;
    public float LJZL;
    public int LL;
    public final Handler LLD;
    public InterfaceC45540Hu4 LLF;
    public WM5 LLFF;
    public C82150WLy LLFFF;
    public FTCEditStickerViewModel LLFII;
    public FTCEditMusicCutViewModel LLFZ;
    public final C82632Wbs LLI;
    public final WM2 LLIFFJFJJ;
    public final C82151WLz LLII;
    public final ARunnableS50S0100000_14 LLIIII;
    public boolean LLIIIILZ;

    static {
        TBT tbt = new TBT(ViewOnTouchListenerC82148WLw.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final int LLJILJIL() {
        if (this.LJLLJ >= this.LJZ) {
            if (this.LJLJI != null) {
                return (int) (((1.0f * r0.getWidth()) * ((float) LivePlayEnforceIntervalSetting.DEFAULT)) / this.LJZ);
            }
            o.LJIJI("mKTVView");
            throw null;
        }
        if (this.LJLJI != null) {
            return (int) (((1.0d * r0.getWidth()) * this.LJLLJ) / this.LJZ);
        }
        o.LJIJI("mKTVView");
        throw null;
    }

    public final int LLJILJILJ() {
        if (this.LJLLJ >= this.LJZ) {
            SY2 sy2 = this.LJLJI;
            if (sy2 != null) {
                return sy2.getWidth();
            }
            o.LJIJI("mKTVView");
            throw null;
        }
        if (this.LJLJI != null) {
            return (int) (((1.0d * r0.getWidth()) * this.LJLLJ) / this.LJZ);
        }
        o.LJIJI("mKTVView");
        throw null;
    }

    public final VideoPublishEditModel LLJJ() {
        VideoPublishEditModel videoPublishEditModel = this.LJLLILLLL;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public final void LLJJIII() {
        int i;
        int i2;
        WM5 wm5 = this.LLFF;
        if (wm5 != null) {
            VideoPublishEditModel LLJJ = wm5.LIZ.LLJJ();
            LLJJ.setMMusicStart(wm5.LIZ.LJLLL);
            LLJJ.setIsSoundLoop(Boolean.valueOf(wm5.LIZ.LJLLLLLL));
            int LIZIZ = HOH.LIZIZ(4, LLJJ.getMMusicPath());
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LLJJ.creativeModel.musicBuzModel);
            if (extractAVMusic != null && extractAVMusic.getShootDuration() > 0) {
                if (Math.abs(LIZIZ - extractAVMusic.getShootDuration()) >= 1000) {
                    LIZIZ = extractAVMusic.getShootDuration();
                }
            } else {
                InterfaceC153045zY value = wm5.LIZ.getEditPreviewApi().Kh().getValue();
                if (value != null) {
                    i = value.getDuration();
                } else {
                    i = 0;
                }
                LIZIZ = Math.min(15000, i);
            }
            InterfaceC153045zY value2 = wm5.LIZ.getEditPreviewApi().Kh().getValue();
            if (value2 != null) {
                i2 = value2.getDuration();
            } else {
                i2 = 0;
            }
            int min = Math.min(LIZIZ, i2);
            LLJJ.setMMusicEnd(wm5.LIZ.LJLLL + min);
            if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && !AVCommerceServiceImpl.LJIIJ().LIZ()) {
                wm5.LIZ.getEditPreviewApi().U2(false, false, false);
            } else {
                wm5.LIZ.getEditPreviewApi().U2(true, false, true);
            }
            wm5.LIZ.LLJJIJI(false);
            FTCEditStickerViewModel fTCEditStickerViewModel = wm5.LIZ.LLFII;
            if (fTCEditStickerViewModel != null) {
                MutableLiveData<Boolean> A10 = fTCEditStickerViewModel.A10();
                Boolean bool = Boolean.TRUE;
                A10.setValue(bool);
                wm5.LIZ.getEditPreviewApi().Ml(false);
                InterfaceC143655kP editPreviewApi = wm5.LIZ.getEditPreviewApi();
                int mMusicStart = LLJJ.getMMusicStart();
                Boolean isSoundLoop = LLJJ.getIsSoundLoop();
                o.LJIIIIZZ(isSoundLoop, "mModel.isSoundLoop");
                editPreviewApi.uC(new C123774tR(mMusicStart, min, isSoundLoop.booleanValue()));
                if (LLJJ.hasOriginalSound()) {
                    InterfaceC143655kP editPreviewApi2 = wm5.LIZ.getEditPreviewApi();
                    VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(LLJJ.voiceVolume);
                    o.LJIIIIZZ(ofVoice, "ofVoice(mModel.voiceVolume)");
                    editPreviewApi2.Dl0(ofVoice);
                }
                ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw = wm5.LIZ;
                if (viewOnTouchListenerC82148WLw.LLJJI() <= viewOnTouchListenerC82148WLw.LLJJ().getMCurMusicLength()) {
                    FTCEditStickerViewModel fTCEditStickerViewModel2 = viewOnTouchListenerC82148WLw.LLFII;
                    if (fTCEditStickerViewModel2 != null) {
                        fTCEditStickerViewModel2.A10().setValue(bool);
                    } else {
                        o.LJIJI("stickerViewModel");
                        throw null;
                    }
                }
                if (LLJJ.isMvThemeVideoType() && LLJJ.mvCreateVideoData.mvType == 1) {
                    InterfaceC145445nI interfaceC145445nI = wm5.LIZ.LJLLI;
                    if (interfaceC145445nI != null) {
                        String mMusicPath = LLJJ.getMMusicPath();
                        o.LJIIIIZZ(mMusicPath, "mModel.mMusicPath");
                        interfaceC145445nI.LLIIIZ(LLJJ.getMMusicStart(), LLJJ.getMMusicEnd(), false, mMusicPath, -1);
                    } else {
                        o.LJIJI("musicCallback");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("stickerViewModel");
                throw null;
            }
        }
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LLF;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LLII);
        }
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LLI.LIZ(this, LLIIIJ[0]);
    }

    public final int LLJJI() {
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            return value.getDuration();
        }
        return 0;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public ViewOnTouchListenerC82148WLw(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LLD = new Handler(C16880lQ.LLJJJJ());
        this.LLI = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LLIFFJFJJ = new WM2(this);
        this.LLII = new C82151WLz(this);
        this.LLIIII = new ARunnableS50S0100000_14(this, 219);
    }

    public final void LLJJIJI(boolean z) {
        if (z) {
            View view = this.LJLL;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    return;
                }
                View view2 = this.LJLL;
                if (view2 != null) {
                    view2.setVisibility(0);
                    View view3 = this.LJLL;
                    if (view3 != null) {
                        view3.setAlpha(0.0f);
                        View view4 = this.LJLL;
                        if (view4 != null) {
                            view4.animate().alpha(1.0f).setDuration(200L).start();
                            this.LLD.post(this.LLIIII);
                            return;
                        } else {
                            o.LJIJI("mDragLayout");
                            throw null;
                        }
                    }
                    o.LJIJI("mDragLayout");
                    throw null;
                }
                o.LJIJI("mDragLayout");
                throw null;
            }
            o.LJIJI("mDragLayout");
            throw null;
        }
        View view5 = this.LJLL;
        if (view5 != null) {
            if (view5.getVisibility() == 4) {
                return;
            }
            View view6 = this.LJLL;
            if (view6 != null) {
                view6.setVisibility(4);
                this.LLD.removeCallbacksAndMessages(null);
                return;
            } else {
                o.LJIJI("mDragLayout");
                throw null;
            }
        }
        o.LJIJI("mDragLayout");
        throw null;
    }

    public final void LLJJIJIIJIL(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        SY2 sy2 = this.LJLJI;
        if (sy2 != null) {
            int i6 = 8;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            sy2.setVisibility(i);
            TextView textView = this.LJLJJI;
            if (textView != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                TextView textView2 = this.LJLJJL;
                if (textView2 != null) {
                    if (z) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    textView2.setVisibility(i3);
                    WG4 wg4 = this.LJLJJLL;
                    if (wg4 != null) {
                        if (z) {
                            i4 = 8;
                        } else {
                            i4 = 0;
                        }
                        wg4.setVisibility(i4);
                        ImageView imageView = this.LJLILLLLZI;
                        if (imageView != null) {
                            if (z) {
                                i6 = 0;
                            }
                            imageView.setVisibility(i6);
                            if (this.LJLJJLL != null) {
                                LLJJI();
                                LLJJ().getMCurMusicLength();
                                TextView textView3 = this.LJLJL;
                                if (textView3 != null) {
                                    if (LLJJI() > LLJJ().getMCurMusicLength() + 1000) {
                                        i5 = R.string.cgv;
                                    } else {
                                        i5 = R.string.ezs;
                                    }
                                    textView3.setText(getString(i5));
                                    C145995oB c145995oB = new C145995oB();
                                    c145995oB.LJI(WM7.SCENE_SERVICE, "EditMusicCutScene");
                                    c145995oB.LIZ(!z ? 1 : 0, "status");
                                    GXR.LIZ("tool_performance_show_music_wave", c145995oB.LIZ);
                                    return;
                                }
                                o.LJIJI("mCutMusicTips");
                                throw null;
                            }
                            o.LJIJI("cutMusicLayout");
                            throw null;
                        }
                        o.LJIJI("mSlide");
                        throw null;
                    }
                    o.LJIJI("cutMusicLayout");
                    throw null;
                }
                o.LJIJI("mTextViewTotalTime");
                throw null;
            }
            o.LJIJI("mTextViewTimeStart");
            throw null;
        }
        o.LJIJI("mKTVView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0256, code lost:
    
        if (r1 == null) goto L70;
     */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC82148WLw.onActivityCreated(android.os.Bundle):void");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            int i = 0;
            if (action != 1) {
                if (action == 2) {
                    float rawX = this.LJZL + (event.getRawX() - this.LJZI);
                    SY2 sy2 = this.LJLJI;
                    if (sy2 != null) {
                        float x = sy2.getX();
                        if (this.LJLILLLLZI != null) {
                            if (rawX < x - (r0.getWidth() / 2)) {
                                SY2 sy22 = this.LJLJI;
                                if (sy22 != null) {
                                    float x2 = sy22.getX();
                                    if (this.LJLILLLLZI != null) {
                                        rawX = x2 - (r0.getWidth() / 2);
                                    } else {
                                        o.LJIJI("mSlide");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mKTVView");
                                    throw null;
                                }
                            }
                            SY2 sy23 = this.LJLJI;
                            if (sy23 != null) {
                                float x3 = rawX - sy23.getX();
                                if (this.LJLILLLLZI != null) {
                                    float width = x3 + (r0.getWidth() / 2);
                                    if (this.LJLJI != null) {
                                        if (width >= r0.getWidth() - LLJILJIL()) {
                                            SY2 sy24 = this.LJLJI;
                                            if (sy24 != null) {
                                                float x4 = sy24.getX();
                                                if (this.LJLILLLLZI != null) {
                                                    float width2 = x4 - (r0.getWidth() / 2);
                                                    if (this.LJLJI != null) {
                                                        rawX = (width2 + r0.getWidth()) - LLJILJIL();
                                                    } else {
                                                        o.LJIJI("mKTVView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mSlide");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mKTVView");
                                                throw null;
                                            }
                                        }
                                        if (rawX < 0.0f) {
                                            rawX = 0.0f;
                                        }
                                        ImageView imageView = this.LJLILLLLZI;
                                        if (imageView != null) {
                                            imageView.animate().x(rawX).setDuration(0L).start();
                                            ImageView imageView2 = this.LJLILLLLZI;
                                            if (imageView2 != null) {
                                                float x5 = imageView2.getX();
                                                if (this.LJLILLLLZI != null) {
                                                    float width3 = x5 + (r0.getWidth() / 2);
                                                    SY2 sy25 = this.LJLJI;
                                                    if (sy25 != null) {
                                                        int x6 = (int) (width3 - sy25.getX());
                                                        SY2 sy26 = this.LJLJI;
                                                        if (sy26 != null) {
                                                            sy26.setStart(x6);
                                                            SY2 sy27 = this.LJLJI;
                                                            if (sy27 != null) {
                                                                sy27.setLength(LLJILJILJ());
                                                                TextView textView = this.LJLJJI;
                                                                if (textView != null) {
                                                                    if (this.LJLILLLLZI != null) {
                                                                        double x7 = r0.getX() * 1.0d;
                                                                        if (this.LJLJI != null) {
                                                                            double x8 = x7 - r0.getX();
                                                                            if (this.LJLILLLLZI != null) {
                                                                                double width4 = x8 + (r0.getWidth() / 2);
                                                                                if (this.LJLJI != null) {
                                                                                    int i2 = this.LJZ;
                                                                                    int width5 = (int) ((width4 / r0.getWidth()) * i2);
                                                                                    if (width5 < 0) {
                                                                                        width5 = 0;
                                                                                    }
                                                                                    if (width5 <= i2) {
                                                                                        i = width5;
                                                                                    }
                                                                                    textView.setText(C78605Ut7.LJIIL(i));
                                                                                } else {
                                                                                    o.LJIJI("mKTVView");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("mSlide");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("mKTVView");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("mSlide");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("mTextViewTimeStart");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("mKTVView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("mKTVView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mKTVView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mSlide");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mSlide");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("mSlide");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mKTVView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mSlide");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mKTVView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mSlide");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mKTVView");
                        throw null;
                    }
                }
            } else {
                ImageView imageView3 = this.LJLILLLLZI;
                if (imageView3 != null) {
                    float x9 = imageView3.getX();
                    SY2 sy28 = this.LJLJI;
                    if (sy28 != null) {
                        float x10 = x9 - sy28.getX();
                        if (this.LJLILLLLZI != null) {
                            int width6 = (int) (x10 + (r0.getWidth() / 2));
                            if (width6 >= 0) {
                                i = width6;
                            }
                            double d = i * 1.0d;
                            if (this.LJLJI != null) {
                                this.LJLLL = (int) ((d / r0.getWidth()) * this.LJZ);
                                C82150WLy c82150WLy = this.LLFFF;
                                if (c82150WLy != null) {
                                    c82150WLy.LIZ();
                                }
                            } else {
                                o.LJIJI("mKTVView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mSlide");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mKTVView");
                        throw null;
                    }
                } else {
                    o.LJIJI("mSlide");
                    throw null;
                }
            }
        } else {
            this.LJZI = event.getRawX();
            ImageView imageView4 = this.LJLILLLLZI;
            if (imageView4 != null) {
                this.LJZL = imageView4.getX();
            } else {
                o.LJIJI("mSlide");
                throw null;
            }
        }
        return true;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LayoutInflater LLZIL = C16880lQ.LLZIL(this.mActivity);
        FrameLayout frameLayout = this.LJLJLLL;
        if (frameLayout != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.biu, frameLayout, false);
            o.LJIIIIZZ(LLLLIILL, "from(activity).inflate(R…fs, mParentLayout, false)");
            this.LJLL = LLLLIILL;
            FrameLayout frameLayout2 = this.LJLJLLL;
            if (frameLayout2 != null) {
                frameLayout2.addView(LLLLIILL);
                return;
            } else {
                o.LJIJI("mParentLayout");
                throw null;
            }
        }
        o.LJIJI("mParentLayout");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public final void LLJJIJIL(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
        int i3;
        StringBuilder LJ = C7MY.LJ("SoundLoop, EditMusicCutScene.updateMusicWaveData musicLength = ", i, " videoLength = ");
        LJ.append(this.LJLLJ);
        H7B.LIZ(X1D.LIZIZ(LJ));
        this.LL = i;
        LLJJIJIIJIL(true);
        if (aVMusicWaveBean != null && C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            WG0.LJ(aVMusicWaveBean);
            WG0.LJI.LIZ(aVMusicWaveBean, this.LJLLJ, i);
            LLJJIJIIJIL(false);
            if (i2 == 0) {
                WG4 wg4 = this.LJLJJLL;
                if (wg4 != null) {
                    wg4.LIZ();
                } else {
                    o.LJIJI("cutMusicLayout");
                    throw null;
                }
            } else {
                WG4 wg42 = this.LJLJJLL;
                if (wg42 != null) {
                    wg42.LIZIZ((i2 * 1.0f) / i);
                    WG4 wg43 = this.LJLJJLL;
                    if (wg43 != null) {
                        wg43.setTimeBubble(i2);
                    } else {
                        o.LJIJI("cutMusicLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("cutMusicLayout");
                    throw null;
                }
            }
            WG4 wg44 = this.LJLJJLL;
            if (wg44 != null) {
                WG0 wg0 = WG0.LJI;
                if (this.LJLLJ > 0) {
                    int i4 = wg0.LJFF;
                    int i5 = wg0.LIZIZ;
                    i3 = (i4 + i5) / (wg0.LIZ + i5);
                } else {
                    i3 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                }
                wg44.setOnScreenMaxWavePointCount(i3);
                WG4 wg45 = this.LJLJJLL;
                if (wg45 != null) {
                    wg45.setAudioWaveViewData(aVMusicWaveBean);
                    return;
                } else {
                    o.LJIJI("cutMusicLayout");
                    throw null;
                }
            }
            o.LJIJI("cutMusicLayout");
            throw null;
        }
        LLJJIJIIJIL(true);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd5, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.LJLJLLL = frameLayout;
        return frameLayout;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
