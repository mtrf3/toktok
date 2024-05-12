package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import X.AML;
import X.AbstractC156316Bn;
import X.AbstractC26082ALm;
import X.AbstractC42651GoZ;
import X.ActivityC45651qj;
import X.AnonymousClass668;
import X.C10K;
import X.C113584d0;
import X.C136705Yc;
import X.C140345f4;
import X.C157166Eu;
import X.C158536Kb;
import X.C158556Kd;
import X.C158566Ke;
import X.C158606Ki;
import X.C162626Zu;
import X.C163756bj;
import X.C16880lQ;
import X.C170466mY;
import X.C170696mv;
import X.C173636rf;
import X.C1EU;
import X.C221108m2;
import X.C29701Eo;
import X.C2KE;
import X.C38995FSd;
import X.C45927I0t;
import X.C5H3;
import X.C5HC;
import X.C5MM;
import X.C5S1;
import X.C5UO;
import X.C62905OmT;
import X.C62906OmU;
import X.C65352Pkq;
import X.C6KV;
import X.C6KW;
import X.C6KX;
import X.C6KY;
import X.C6KZ;
import X.C6W9;
import X.C6WA;
import X.C6YX;
import X.C73139Sn9;
import X.C73140SnA;
import X.C73165SnZ;
import X.C73297Sph;
import X.C73305Spp;
import X.C76800UCe;
import X.C78127UlP;
import X.C78847Ux1;
import X.C78885Uxd;
import X.C81184Vtc;
import X.C82622Wbi;
import X.C83728WtY;
import X.C86793Y4n;
import X.EnumC158826Le;
import X.EnumC83730Wta;
import X.FP1;
import X.InterfaceC115514g7;
import X.InterfaceC135635Tz;
import X.InterfaceC143655kP;
import X.InterfaceC143795kd;
import X.InterfaceC15040iS;
import X.InterfaceC153045zY;
import X.InterfaceC162186Yc;
import X.InterfaceC45540Hu4;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.KL2;
import X.O6R;
import X.TBT;
import X.TBW;
import X.TMF;
import X.TMG;
import X.UCI;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnTouchListenerC141755hL;
import X.W1T;
import X.WFB;
import X.WM7;
import X.WMH;
import X.X1D;
import Y.ACallableS105S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS0S0100001_2;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS3S1100000_2;
import Y.AUListenerS91S0100000_2;
import Y.IDCListenerS156S0100000_2;
import Y.IDCListenerS203S0100000_2;
import Y.IDCListenerS295S0100000_2;
import Y.IDTListenerS112S0100000_2;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditAudioRecordScene extends WM7 implements WeakHandler.IHandler, InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public static final C158606Ki Companion;
    public C6KV audioRecordSeekBar;
    public C6KY audioRecordStartButton;
    public boolean audioRecordStartButtonLongClicking;
    public boolean audioRecordStartButtonShortClicking;
    public AudioRecorderParam audioRecorderParam;
    public View backView;
    public CheckBox checkBox;
    public volatile boolean clickable;
    public ViewGroup contentLayout;
    public Point curPoint;
    public final IDlS62S0100000_2 debounceOnClickListener;
    public final C82622Wbi diContainer;
    public int duration;
    public final C5H3 editAudioRecordViewModel$delegate;
    public final InterfaceC115514g7 editPreviewApi$delegate;
    public MutableLiveData<Bitmap> firstFrameBitmap;
    public MutableLiveData<Boolean> firstFrameVisible;
    public boolean isPaused;
    public boolean isPlaying;
    public boolean isRecording;
    public C29701Eo lottieAnimationView;
    public View mCancelView;
    public ViewOnTouchListenerC141755hL mChooseVideoCoverView;
    public VEVideoCoverGeneratorImpl mEffectVideoCoverGenerator;
    public final WeakHandler mHandler;
    public InterfaceC45540Hu4 mListenableActivityRegistry;
    public C73305Spp mLoadingStatusView;
    public View mLoadingStatusViewLayout;
    public final C158536Kb mOnKeyDownListener;
    public View mPlayView;
    public MutableLiveData<C5MM> mPreviewControlOpLiveData;
    public float mProcess;
    public View mSaveView;
    public WFB mSharedVideoCoverDataSource;
    public InterfaceC153045zY mVEEditor;
    public final InterfaceC115514g7 mVideoPublishEditModel$delegate;
    public final C5H3 needOriginalSoundLiveData$delegate;
    public final C6KX onSeekChangeListener;
    public View parentLayout;
    public final C5H3 processTimeLiveData$delegate;
    public final ValueAnimator progressGetter;
    public FrameLayout seekLayout;
    public C170466mY tvMsg;
    public C136705Yc veAudioRecorderWrapper;
    public View videoLayout;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6Ki] */
    static {
        TBT tbt = new TBT(FTCEditAudioRecordScene.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, new TBT(FTCEditAudioRecordScene.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};
        Companion = new Object() { // from class: X.6Ki
        };
    }

    private final void modCancelDub() {
    }

    private final void modClick() {
    }

    private final void modDeleteDub() {
    }

    private final void pauseRecord() {
        if (this.isRecording) {
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_PAUSE, EnumC158826Le.PAGE_INVISIBLE), 3, null);
        }
    }

    private final void saveDub() {
    }

    public final void backRecord() {
        if (this.isRecording || this.isPlaying) {
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_BACK_RECORD, EnumC158826Le.USER_OPERATION), 3, null);
        }
        modDeleteDub();
        this.audioRecorderParam.setNeedDel(true);
        C78847Ux1.LJIIJJI(getEditPreviewApi(), this.audioRecorderParam);
        C6KV c6kv = this.audioRecordSeekBar;
        if (c6kv != null) {
            if (c6kv.LJLILLLLZI.getMStack().empty()) {
                return;
            }
            Point pop = c6kv.LJLILLLLZI.getMStack().pop();
            c6kv.LIZLLL();
            if (pop == null) {
                return;
            }
            float x = pop.getX() / this.duration;
            pop.setY(pop.getY() + 100);
            int y = pop.getY();
            int i = this.duration;
            if (y > i) {
                pop.setY(i);
            }
            C136705Yc c136705Yc = this.veAudioRecorderWrapper;
            if (c136705Yc != null) {
                c136705Yc.LIZ.delete(pop.getX(), pop.getY());
            }
            this.onSeekChangeListener.LIZ(x, true);
            C6KV c6kv2 = this.audioRecordSeekBar;
            if (c6kv2 != null) {
                c6kv2.post(new ARunnableS0S0100001_2(c6kv2, x, 0));
                AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
                C6KV c6kv3 = this.audioRecordSeekBar;
                if (c6kv3 != null) {
                    audioRecorderParam.setMStack(c6kv3.getStack());
                    if (this.audioRecorderParam.getMStack().isEmpty()) {
                        View view = this.backView;
                        if (view != null) {
                            view.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("backView");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("audioRecordSeekBar");
                throw null;
            }
            o.LJIJI("audioRecordSeekBar");
            throw null;
        }
        o.LJIJI("audioRecordSeekBar");
        throw null;
    }

    public final void cancel() {
        if (this.isRecording || this.isPlaying) {
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_CANCEL, EnumC158826Le.USER_OPERATION), 3, null);
        }
        modCancelDub();
        saveToAudioRecorderParam();
        if (AudioRecorderParam.hasChange$default(this.audioRecorderParam, getMVideoPublishEditModel().veAudioRecorderParam, false, 2, null)) {
            showCancleDialog();
            return;
        }
        getEditAudioRecordViewModel().Jv0(getMVideoPublishEditModel().musicVolume, getMVideoPublishEditModel().voiceVolume);
        closeWithDelFile(this.audioRecorderParam.getAudioUrl());
        if (getMVideoPublishEditModel().veAudioRecorderParam == null || !getMVideoPublishEditModel().veAudioRecorderParam.hasRecord() || getMVideoPublishEditModel().veAudioRecorderParam.getAudioRecordIndex() != -2) {
            return;
        }
        InterfaceC143655kP editPreviewApi = getEditPreviewApi();
        AudioRecorderParam audioRecorderParam = getMVideoPublishEditModel().veAudioRecorderParam;
        o.LJIIIIZZ(audioRecorderParam, "mVideoPublishEditModel.veAudioRecorderParam");
        C78847Ux1.LJIIJJI(editPreviewApi, audioRecorderParam);
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
    /* renamed from: getReceiver */
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

    @Override // X.WM7
    public void onResume() {
        this.isPaused = false;
        super.onResume();
    }

    public final void recordDubEnd(String str) {
    }

    public final void recordDubStart(String str) {
    }

    public final void save() {
        String audioUrl;
        if (this.isRecording || this.isPlaying) {
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_SAVE, EnumC158826Le.USER_OPERATION), 3, null);
        }
        saveToAudioRecorderParam();
        if (this.veAudioRecorderWrapper != null) {
            getEditAudioRecordViewModel().Jv0(getMVideoPublishEditModel().musicVolume, getMVideoPublishEditModel().voiceVolume);
            if (this.audioRecorderParam.getAudioRecordIndex() < 0 && this.audioRecorderParam.hasRecord()) {
                C78847Ux1.LJIIJJI(getEditPreviewApi(), this.audioRecorderParam);
            }
        }
        String str = "";
        if (getMVideoPublishEditModel().veAudioRecorderParam == null) {
            getMVideoPublishEditModel().veAudioRecorderParam = new AudioRecorderParam();
            audioUrl = "";
        } else {
            audioUrl = getMVideoPublishEditModel().veAudioRecorderParam.getAudioUrl();
        }
        getMVideoPublishEditModel().veAudioRecorderParam.copyFrom(this.audioRecorderParam);
        if (ujb.o.LJJJJ(audioUrl, "wav", false)) {
            getMVideoPublishEditModel().veAudioRecorderParam.setExtraUrl(audioUrl);
        } else {
            str = audioUrl;
        }
        this.audioRecorderParam.getNeedOriginalSound();
        saveDub();
        closeWithDelFile(str);
    }

    private final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.editPreviewApi$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    private final int getVideoPlayMaxHeight() {
        return ((C81184Vtc.LIZIZ(this.mActivity) - ((int) KL2.LIZJ(this.mActivity, 334.0f))) - C81184Vtc.LJFF(this.mActivity)) - C81184Vtc.LIZJ(this.mActivity);
    }

    private final boolean hasRecord() {
        AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
        C6KV c6kv = this.audioRecordSeekBar;
        if (c6kv != null) {
            audioRecorderParam.setMStack(c6kv.getStack());
            return !this.audioRecorderParam.getMStack().isEmpty();
        }
        o.LJIJI("audioRecordSeekBar");
        throw null;
    }

    private final void initClick() {
        View view = this.mSaveView;
        if (view != null) {
            C16880lQ.LJIIJ(this.debounceOnClickListener, view);
            View view2 = this.mCancelView;
            if (view2 != null) {
                C16880lQ.LJIIJ(this.debounceOnClickListener, view2);
                View view3 = this.mPlayView;
                if (view3 != null) {
                    C16880lQ.LJIIJ(this.debounceOnClickListener, view3);
                    View view4 = this.videoLayout;
                    if (view4 != null) {
                        C16880lQ.LJIIJ(this.debounceOnClickListener, view4);
                        View view5 = this.backView;
                        if (view5 != null) {
                            C16880lQ.LJIIJ(this.debounceOnClickListener, view5);
                            C6KY c6ky = this.audioRecordStartButton;
                            if (c6ky != null) {
                                c6ky.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 9)));
                                C6KY c6ky2 = this.audioRecordStartButton;
                                if (c6ky2 != null) {
                                    c6ky2.setOnLongClickListener(new IDCListenerS295S0100000_2(this, 0));
                                    C6KY c6ky3 = this.audioRecordStartButton;
                                    if (c6ky3 != null) {
                                        c6ky3.setOnTouchListener(new IDTListenerS112S0100000_2(this, 2));
                                        return;
                                    } else {
                                        o.LJIJI("audioRecordStartButton");
                                        throw null;
                                    }
                                }
                                o.LJIJI("audioRecordStartButton");
                                throw null;
                            }
                            o.LJIJI("audioRecordStartButton");
                            throw null;
                        }
                        o.LJIJI("backView");
                        throw null;
                    }
                    o.LJIJI("videoLayout");
                    throw null;
                }
                o.LJIJI("mPlayView");
                throw null;
            }
            o.LJIJI("mCancelView");
            throw null;
        }
        o.LJIJI("mSaveView");
        throw null;
    }

    private final void initCoverView() {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        InterfaceC153045zY interfaceC153045zY = this.mVEEditor;
        if (interfaceC153045zY == null) {
            return;
        }
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = this.mChooseVideoCoverView;
        if (viewOnTouchListenerC141755hL != null) {
            viewOnTouchListenerC141755hL.LIZLLL();
            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL2 = this.mChooseVideoCoverView;
            if (viewOnTouchListenerC141755hL2 != null) {
                viewOnTouchListenerC141755hL2.setLayoutManager(new WrapLinearLayoutManager(0));
                ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL3 = this.mChooseVideoCoverView;
                if (viewOnTouchListenerC141755hL3 != null) {
                    int frameHeight = viewOnTouchListenerC141755hL3.getFrameHeight();
                    ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL4 = this.mChooseVideoCoverView;
                    if (viewOnTouchListenerC141755hL4 != null) {
                        int frameWidth = viewOnTouchListenerC141755hL4.getFrameWidth();
                        int ceil = (int) Math.ceil((KL2.LJIIJJI(this.mActivity) - (O6R.LJJIIZ(KL2.LIZJ(this.mActivity, 16.0f)) * 2)) / (frameWidth * 1.0f));
                        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL5 = this.mChooseVideoCoverView;
                        if (viewOnTouchListenerC141755hL5 != null) {
                            viewOnTouchListenerC141755hL5.setCoverSize(ceil);
                            if (C6WA.LIZ()) {
                                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                            } else {
                                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                            }
                            AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this);
                            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL6 = this.mChooseVideoCoverView;
                            if (viewOnTouchListenerC141755hL6 != null) {
                                this.mEffectVideoCoverGenerator = new VEVideoCoverGeneratorImpl(interfaceC153045zY, LJJIJIIJIL, viewOnTouchListenerC141755hL6.getCoverSize(), get_frames_flags, "ai_music");
                                VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.mEffectVideoCoverGenerator;
                                if (vEVideoCoverGeneratorImpl != null) {
                                    this.mSharedVideoCoverDataSource = new WFB(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                                    if (getMVideoPublishEditModel().isMvThemeVideoType()) {
                                        final C113584d0 c113584d0 = new C113584d0(frameWidth, frameHeight);
                                        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL7 = this.mChooseVideoCoverView;
                                        if (viewOnTouchListenerC141755hL7 != null) {
                                            viewOnTouchListenerC141755hL7.setAdapter(c113584d0);
                                            C6YX c6yx = new C6YX();
                                            c6yx.LIZIZ = new InterfaceC162186Yc() { // from class: X.6Kg
                                                @Override // X.InterfaceC162186Yc
                                                public final void onError(String str) {
                                                    C0JU.LIZLLL(str);
                                                }
                                            };
                                            MutableLiveData<Boolean> mutableLiveData = this.firstFrameVisible;
                                            if (mutableLiveData != null) {
                                                c6yx.LJIIL = mutableLiveData;
                                                MutableLiveData<Bitmap> mutableLiveData2 = this.firstFrameBitmap;
                                                if (mutableLiveData2 != null) {
                                                    c6yx.LJIIJJI = mutableLiveData2;
                                                    c6yx.LJIILL = C6W9.LIZ();
                                                    c6yx.LJIILJJIL = frameWidth;
                                                    Activity activity = this.mActivity;
                                                    if (activity instanceof SAAActivity) {
                                                        ((SAAActivity) activity).LLIIJI("getIntent", new AqS7S0401000_2(c6yx, activity, this, ceil, c113584d0, 1));
                                                    } else {
                                                        c6yx.LIZ(activity, this.mVEEditor, ceil, new C5UO() { // from class: X.6Kc
                                                            @Override // X.C5UO
                                                            public final void LIZ(List<Bitmap> list) {
                                                                C113584d0.this.LJLLLLLL(list);
                                                            }
                                                        });
                                                    }
                                                    ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL8 = this.mChooseVideoCoverView;
                                                    if (viewOnTouchListenerC141755hL8 != null) {
                                                        viewOnTouchListenerC141755hL8.setAdapter(c113584d0);
                                                        return;
                                                    } else {
                                                        o.LJIJI("mChooseVideoCoverView");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("firstFrameBitmap");
                                                throw null;
                                            }
                                            o.LJIJI("firstFrameVisible");
                                            throw null;
                                        }
                                        o.LJIJI("mChooseVideoCoverView");
                                        throw null;
                                    }
                                    WFB wfb = this.mSharedVideoCoverDataSource;
                                    if (wfb != null) {
                                        C162626Zu c162626Zu = new C162626Zu(wfb, frameWidth, frameHeight);
                                        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL9 = this.mChooseVideoCoverView;
                                        if (viewOnTouchListenerC141755hL9 != null) {
                                            viewOnTouchListenerC141755hL9.setAdapter(c162626Zu);
                                            return;
                                        } else {
                                            o.LJIJI("mChooseVideoCoverView");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("mSharedVideoCoverDataSource");
                                    throw null;
                                }
                                o.LJIJI("mEffectVideoCoverGenerator");
                                throw null;
                            }
                            o.LJIJI("mChooseVideoCoverView");
                            throw null;
                        }
                        o.LJIJI("mChooseVideoCoverView");
                        throw null;
                    }
                    o.LJIJI("mChooseVideoCoverView");
                    throw null;
                }
                o.LJIJI("mChooseVideoCoverView");
                throw null;
            }
            o.LJIJI("mChooseVideoCoverView");
            throw null;
        }
        o.LJIJI("mChooseVideoCoverView");
        throw null;
    }

    private final void initProgressGetter() {
        this.progressGetter.setDuration(1000L);
        this.progressGetter.setRepeatCount(-1);
        this.progressGetter.addUpdateListener(new AUListenerS91S0100000_2(this, 8));
    }

    private final void resetFromModel() {
        ARunnableS38S0100000_2 aRunnableS38S0100000_2 = new ARunnableS38S0100000_2(this, 29);
        this.veAudioRecorderWrapper = new C136705Yc();
        C10K.LIZIZ(new ACallableS105S0100000_2(aRunnableS38S0100000_2, 7), C38995FSd.LIZLLL(), null);
    }

    private final void saveToAudioRecorderParam() {
        AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
        C6KV c6kv = this.audioRecordSeekBar;
        if (c6kv != null) {
            audioRecorderParam.setMStack(c6kv.getStack());
            Boolean value = getNeedOriginalSoundLiveData().getValue();
            if (value != null) {
                this.audioRecorderParam.setNeedOriginalSound(value.booleanValue());
                return;
            }
            return;
        }
        o.LJIJI("audioRecordSeekBar");
        throw null;
    }

    private final void showCancleDialog() {
        Activity activity = this.mActivity;
        if (activity != null) {
            C62905OmT c62905OmT = new C62905OmT(activity);
            c62905OmT.LJ(R.string.e2t);
            c62905OmT.LJII(R.string.e31, null);
            c62905OmT.LJIIJ(R.string.e30, new IDCListenerS156S0100000_2(this, 2));
            new C62906OmU(c62905OmT).LIZLLL();
        }
    }

    public final FTCEditAudioRecordViewModel getEditAudioRecordViewModel() {
        return (FTCEditAudioRecordViewModel) this.editAudioRecordViewModel$delegate.getValue();
    }

    public final VideoPublishEditModel getMVideoPublishEditModel() {
        return (VideoPublishEditModel) this.mVideoPublishEditModel$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final MutableLiveData<Boolean> getNeedOriginalSoundLiveData() {
        return (MutableLiveData) this.needOriginalSoundLiveData$delegate.getValue();
    }

    public final MutableLiveData<Long> getProcessTimeLiveData() {
        return (MutableLiveData) this.processTimeLiveData$delegate.getValue();
    }

    private final void initObserve() {
        getProcessTimeLiveData().observe(this, new AObserverS70S0100000_2(this, 30));
        getNeedOriginalSoundLiveData().observe(this, new AObserverS70S0100000_2(this, 31));
    }

    @Override // X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        this.progressGetter.cancel();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // X.WM7
    public void onPause() {
        super.onPause();
        pauseRecord();
        this.isPaused = true;
    }

    public final void useModelParam() {
        AudioRecorderParam audioRecorderParam = getMVideoPublishEditModel().veAudioRecorderParam;
        if (this.audioRecorderParam.getAudioRecordIndex() >= 0 && this.audioRecorderParam.hasRecord()) {
            this.audioRecorderParam.setNeedDel(true);
            C78847Ux1.LJIIJJI(getEditPreviewApi(), this.audioRecorderParam);
        }
        if (audioRecorderParam != null) {
            if (audioRecorderParam.getAudioRecordIndex() < 0 && audioRecorderParam.hasRecord()) {
                C78847Ux1.LJIIJJI(getEditPreviewApi(), audioRecorderParam);
            }
            if (audioRecorderParam.getNeedOriginalSound()) {
                getMVideoPublishEditModel().voiceVolume = audioRecorderParam.getVoiceVolume();
            } else {
                getMVideoPublishEditModel().voiceVolume = 0.0f;
            }
        } else {
            getMVideoPublishEditModel().voiceVolume = this.audioRecorderParam.getVoiceVolume();
        }
        getEditAudioRecordViewModel().Jv0(getMVideoPublishEditModel().musicVolume, getMVideoPublishEditModel().voiceVolume);
        closeWithDelFile(this.audioRecorderParam.getAudioUrl());
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.6Kb] */
    public FTCEditAudioRecordScene(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.diContainer = diContainer;
        this.duration = 1;
        this.processTimeLiveData$delegate = C221108m2.LIZIZ(C158566Ke.LJLIL);
        this.needOriginalSoundLiveData$delegate = C221108m2.LIZIZ(C158556Kd.LJLIL);
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        o.LJIIIIZZ(ofInt, "ofInt(1, 10)");
        this.progressGetter = ofInt;
        this.isPaused = true;
        this.mVideoPublishEditModel$delegate = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.editPreviewApi$delegate = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.editAudioRecordViewModel$delegate = C221108m2.LIZIZ(new AqS152S0100000_2(this, 74));
        this.audioRecorderParam = new AudioRecorderParam();
        this.clickable = true;
        this.mHandler = new WeakHandler(this);
        this.onSeekChangeListener = new C6KX(this);
        this.mOnKeyDownListener = new C5HC() { // from class: X.6Kb
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4 && FTCEditAudioRecordScene.this.isVisible()) {
                    View view = FTCEditAudioRecordScene.this.mCancelView;
                    if (view != null) {
                        view.performClick();
                        return true;
                    }
                    o.LJIJI("mCancelView");
                    throw null;
                }
                return false;
            }
        };
        this.debounceOnClickListener = new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 8);
    }

    private final void closeWithDelFile(String str) {
        C136705Yc c136705Yc = this.veAudioRecorderWrapper;
        if (c136705Yc != null) {
            c136705Yc.LIZ.destory();
        }
        C10K.LIZIZ(new ACallableS105S0100000_2(new ARunnableS3S1100000_2(this, str, 0), 6), C38995FSd.LIZLLL(), null);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                this.clickable = true;
                C73305Spp c73305Spp = this.mLoadingStatusView;
                if (c73305Spp != null) {
                    c73305Spp.setVisibility(8);
                    View view = this.mLoadingStatusViewLayout;
                    if (view != null) {
                        view.setVisibility(8);
                        getEditAudioRecordViewModel().mJ(false);
                        InterfaceC153045zY interfaceC153045zY = this.mVEEditor;
                        if (interfaceC153045zY != null) {
                            interfaceC153045zY.LLJILJIL(true);
                        }
                        MutableLiveData<C5MM> mutableLiveData = this.mPreviewControlOpLiveData;
                        if (mutableLiveData != null) {
                            mutableLiveData.setValue(C5MM.LIZ());
                            return;
                        } else {
                            o.LJIJI("mPreviewControlOpLiveData");
                            throw null;
                        }
                    }
                    o.LJIJI("mLoadingStatusViewLayout");
                    throw null;
                }
                o.LJIJI("mLoadingStatusView");
                throw null;
            }
            this.clickable = true;
            C73305Spp c73305Spp2 = this.mLoadingStatusView;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(8);
                View view2 = this.mLoadingStatusViewLayout;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("mLoadingStatusViewLayout");
                    throw null;
                }
            }
            o.LJIJI("mLoadingStatusView");
            throw null;
        }
        this.clickable = false;
        View view3 = this.mLoadingStatusViewLayout;
        if (view3 != null) {
            view3.setVisibility(0);
            C73305Spp c73305Spp3 = this.mLoadingStatusView;
            if (c73305Spp3 != null) {
                c73305Spp3.setVisibility(0);
                C73305Spp c73305Spp4 = this.mLoadingStatusView;
                if (c73305Spp4 != null) {
                    c73305Spp4.LJFF();
                    return;
                } else {
                    o.LJIJI("mLoadingStatusView");
                    throw null;
                }
            }
            o.LJIJI("mLoadingStatusView");
            throw null;
        }
        o.LJIJI("mLoadingStatusViewLayout");
        throw null;
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mPreviewControlOpLiveData = getEditPreviewApi().DM();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        this.mVEEditor = value;
        if (value != null) {
            this.duration = value.getDuration();
        }
        View findViewById = findViewById(R.id.mij);
        o.LJI(findViewById);
        this.mSaveView = findViewById;
        View findViewById2 = findViewById(R.id.m1h);
        o.LJI(findViewById2);
        this.mCancelView = findViewById2;
        View findViewById3 = findViewById(R.id.f8p);
        o.LJI(findViewById3);
        this.mPlayView = findViewById3;
        View findViewById4 = findViewById(R.id.jkj);
        o.LJI(findViewById4);
        this.seekLayout = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(R.id.n9k);
        o.LJI(findViewById5);
        this.videoLayout = findViewById5;
        View findViewById6 = findViewById(R.id.btt);
        o.LJI(findViewById6);
        this.contentLayout = (ViewGroup) findViewById6;
        View findViewById7 = findViewById(R.id.kd1);
        o.LJI(findViewById7);
        this.audioRecordStartButton = (C6KY) findViewById7;
        View findViewById8 = findViewById(R.id.af2);
        o.LJI(findViewById8);
        this.backView = findViewById8;
        View findViewById9 = findViewById(R.id.mbf);
        o.LJI(findViewById9);
        C170466mY c170466mY = (C170466mY) findViewById9;
        this.tvMsg = c170466mY;
        c170466mY.LJJIJLIJ();
        View findViewById10 = findViewById(R.id.b73);
        o.LJI(findViewById10);
        CheckBox checkBox = (CheckBox) findViewById10;
        this.checkBox = checkBox;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("  ");
        LIZ.append(getString(R.string.e2x));
        checkBox.setText(X1D.LIZIZ(LIZ));
        View findViewById11 = findViewById(R.id.g8y);
        o.LJI(findViewById11);
        this.mLoadingStatusView = (C73305Spp) findViewById11;
        View findViewById12 = findViewById(R.id.g90);
        o.LJI(findViewById12);
        this.mLoadingStatusViewLayout = findViewById12;
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.6Kh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, findViewById12);
        View findViewById13 = findViewById(R.id.ga_);
        o.LJI(findViewById13);
        C29701Eo c29701Eo = (C29701Eo) findViewById13;
        this.lottieAnimationView = c29701Eo;
        c29701Eo.setAnimation("tool_recording_dark_lottie.json");
        C29701Eo c29701Eo2 = this.lottieAnimationView;
        if (c29701Eo2 != null) {
            c29701Eo2.setRepeatCount(-1);
            View findViewById14 = findViewById(R.id.cjh);
            o.LJI(findViewById14);
            findViewById14.setVisibility(8);
            View view = this.backView;
            if (view != null) {
                view.setBackgroundResource(R.drawable.q1);
                Activity activity = this.mActivity;
                o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C6KV c6kv = new C6KV((ActivityC45651qj) activity, this);
                this.audioRecordSeekBar = c6kv;
                int LIZJ = (int) KL2.LIZJ(this.mActivity, 16.0f);
                int LIZJ2 = (int) KL2.LIZJ(this.mActivity, 6.0f);
                int LIZJ3 = (int) KL2.LIZJ(this.mActivity, 4.0f);
                int i = this.duration;
                C6KX c6kx = this.onSeekChangeListener;
                c6kv.LJLJI = LIZJ;
                c6kv.LJLJJI = LIZJ3 * 5;
                c6kv.LJLJLLL = i;
                c6kv.LJLL = c6kx;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.bottomMargin = LIZJ2;
                layoutParams.topMargin = LIZJ2;
                layoutParams.rightMargin = LIZJ;
                layoutParams.leftMargin = LIZJ;
                C6KW c6kw = c6kv.LJLILLLLZI;
                int parseColor = ColorProtector.parseColor("#ccfe2c55");
                c6kw.getClass();
                c6kw.LJLILLLLZI.setColor(parseColor);
                c6kw.LJLILLLLZI.setStyle(Paint.Style.FILL);
                c6kw.LJLJI = i;
                c6kw.LJLJJI = KL2.LIZJ(c6kw.getContext(), 0.0f);
                c6kv.addView(c6kv.LJLILLLLZI, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(c6kv.LJLJJI, -1);
                if (C173636rf.LIZIZ(c6kv.getContext())) {
                    layoutParams2.addRule(21);
                    layoutParams2.setMarginEnd(LIZJ - (c6kv.LJLJJI / 2));
                } else {
                    layoutParams2.leftMargin = LIZJ - (c6kv.LJLJJI / 2);
                }
                c6kv.LJLIL.setImageDrawable(C78127UlP.LIZJ(0, -1, 1, (int) KL2.LIZJ(c6kv.getContext(), 2.0f)));
                int i2 = (int) (c6kv.LJLJJI * 0.4f);
                c6kv.LJLIL.setPadding(i2, 0, i2, 0);
                c6kv.addView(c6kv.LJLIL, layoutParams2);
                c6kv.LJLIL.setOnTouchListener(new IDTListenerS112S0100000_2(c6kv, 3));
                FrameLayout frameLayout = this.seekLayout;
                if (frameLayout != null) {
                    C6KV c6kv2 = this.audioRecordSeekBar;
                    if (c6kv2 != null) {
                        frameLayout.addView(c6kv2, new FrameLayout.LayoutParams(-1, -1));
                        View findViewById15 = findViewById(R.id.bbc);
                        o.LJI(findViewById15);
                        this.mChooseVideoCoverView = (ViewOnTouchListenerC141755hL) findViewById15;
                        this.mListenableActivityRegistry = C163756bj.LIZIZ(this);
                        this.firstFrameVisible = getEditPreviewApi().x7();
                        this.firstFrameBitmap = getEditPreviewApi().C0();
                        initProgressGetter();
                        initClick();
                        initObserve();
                        CheckBox checkBox2 = this.checkBox;
                        if (checkBox2 != null) {
                            checkBox2.setOnCheckedChangeListener(new IDCListenerS203S0100000_2(this, 0));
                            initCoverView();
                            return;
                        } else {
                            o.LJIJI("checkBox");
                            throw null;
                        }
                    }
                    o.LJIJI("audioRecordSeekBar");
                    throw null;
                }
                o.LJIJI("seekLayout");
                throw null;
            }
            o.LJIJI("backView");
            throw null;
        }
        o.LJIJI("lottieAnimationView");
        throw null;
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public final void setRecording(boolean z) {
        this.isRecording = z;
    }

    public final void showOrHideScene$tools_camera_edit_release(final boolean z) {
        WMH wmh;
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
        if (z && (wmh = (WMH) this.mParentScene) != null) {
            wmh.show(this);
        }
        ViewGroup viewGroup = this.contentLayout;
        if (viewGroup != null) {
            C170696mv.LIZJ(viewGroup, z, (int) KL2.LIZJ(this.mActivity, 282.0f), findViewById(R.id.dp8), new InterfaceC15040iS() { // from class: X.6Ka
                @Override // X.InterfaceC15040iS
                public final void accept(Object obj) {
                    if (z) {
                        View view = this.mSaveView;
                        if (view != null) {
                            view.setVisibility(0);
                            View view2 = this.mCancelView;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                return;
                            } else {
                                o.LJIJI("mCancelView");
                                throw null;
                            }
                        }
                        o.LJIJI("mSaveView");
                        throw null;
                    }
                    FTCEditAudioRecordScene fTCEditAudioRecordScene = this;
                    WMH wmh2 = (WMH) fTCEditAudioRecordScene.mParentScene;
                    if (wmh2 == null) {
                        return;
                    }
                    wmh2.hide(fTCEditAudioRecordScene);
                }
            });
            if (z) {
                modClick();
                if (getMVideoPublishEditModel().veAudioRecorderParam != null) {
                    getMVideoPublishEditModel().veAudioRecorderParam.setNeedDel(true);
                    InterfaceC143655kP editPreviewApi = getEditPreviewApi();
                    AudioRecorderParam audioRecorderParam = getMVideoPublishEditModel().veAudioRecorderParam;
                    o.LJIIIIZZ(audioRecorderParam, "mVideoPublishEditModel.veAudioRecorderParam");
                    C78847Ux1.LJIIJJI(editPreviewApi, audioRecorderParam);
                } else {
                    this.audioRecorderParam = new AudioRecorderParam();
                }
                this.audioRecorderParam.copyFrom(getMVideoPublishEditModel().veAudioRecorderParam);
                if (this.audioRecorderParam.getNeedOriginalSound()) {
                    this.audioRecorderParam.setVoiceVolume(getMVideoPublishEditModel().voiceVolume);
                }
                this.curPoint = null;
                CheckBox checkBox = this.checkBox;
                if (checkBox != null) {
                    checkBox.setChecked(this.audioRecorderParam.getNeedOriginalSound());
                    getNeedOriginalSoundLiveData().setValue(Boolean.valueOf(this.audioRecorderParam.getNeedOriginalSound()));
                    View view = this.mPlayView;
                    if (view != null) {
                        view.setVisibility(0);
                        this.onSeekChangeListener.LIZ(0.0f, true);
                        C6KV c6kv = this.audioRecordSeekBar;
                        if (c6kv != null) {
                            c6kv.setStack(this.audioRecorderParam.getMStack());
                            C6KV c6kv2 = this.audioRecordSeekBar;
                            if (c6kv2 != null) {
                                c6kv2.post(new ARunnableS0S0100001_2(c6kv2, 0.0f, 0));
                                getProcessTimeLiveData().setValue(0L);
                                if (this.audioRecorderParam.getMStack().isEmpty()) {
                                    View view2 = this.backView;
                                    if (view2 != null) {
                                        view2.setVisibility(8);
                                    } else {
                                        o.LJIJI("backView");
                                        throw null;
                                    }
                                } else {
                                    View view3 = this.backView;
                                    if (view3 != null) {
                                        view3.setVisibility(0);
                                    } else {
                                        o.LJIJI("backView");
                                        throw null;
                                    }
                                }
                                InterfaceC45540Hu4 interfaceC45540Hu4 = this.mListenableActivityRegistry;
                                if (interfaceC45540Hu4 != null) {
                                    interfaceC45540Hu4.registerActivityOnKeyDownListener(this.mOnKeyDownListener);
                                }
                                resetFromModel();
                                if (getMVideoPublishEditModel().veAudioEffectParam != null) {
                                    C5S1 c5s1 = new C5S1(this.mActivity);
                                    c5s1.LIZJ(R.string.e4d);
                                    c5s1.LJ();
                                }
                                InterfaceC143655kP editPreviewApi2 = getEditPreviewApi();
                                int LIZIZ = C78885Uxd.LIZIZ(true, false, false, false);
                                int LJFF = C81184Vtc.LJFF(this.mActivity) + ((int) KL2.LIZJ(this.mActivity, 52.0f));
                                int LIZJ = (int) KL2.LIZJ(this.mActivity, 282.0f);
                                int videoPlayMaxHeight = getVideoPlayMaxHeight();
                                AnonymousClass668.LIZIZ().LIZ();
                                editPreviewApi2.oF(C140345f4.LIZIZ(LIZIZ, LJFF, LIZJ, videoPlayMaxHeight, false, false, 960));
                                return;
                            }
                            o.LJIJI("audioRecordSeekBar");
                            throw null;
                        }
                        o.LJIJI("audioRecordSeekBar");
                        throw null;
                    }
                    o.LJIJI("mPlayView");
                    throw null;
                }
                o.LJIJI("checkBox");
                throw null;
            }
            View view4 = this.mSaveView;
            if (view4 != null) {
                view4.setVisibility(8);
                View view5 = this.mCancelView;
                if (view5 != null) {
                    view5.setVisibility(8);
                    InterfaceC45540Hu4 interfaceC45540Hu42 = this.mListenableActivityRegistry;
                    if (interfaceC45540Hu42 != null) {
                        interfaceC45540Hu42.unRegisterActivityOnKeyDownListener(this.mOnKeyDownListener);
                    }
                    this.progressGetter.cancel();
                    InterfaceC143655kP editPreviewApi3 = getEditPreviewApi();
                    View view6 = this.mSaveView;
                    if (view6 != null) {
                        int LIZ = C1EU.LIZ(view6, "mSaveView.context", R.attr.d4);
                        int LJFF2 = C81184Vtc.LJFF(this.mActivity) + ((int) KL2.LIZJ(this.mActivity, 52.0f));
                        int LIZJ2 = (int) KL2.LIZJ(this.mActivity, 282.0f);
                        int videoPlayMaxHeight2 = getVideoPlayMaxHeight();
                        AnonymousClass668.LIZIZ().LIZ();
                        editPreviewApi3.oF(C140345f4.LIZ(LIZ, LJFF2, LIZJ2, videoPlayMaxHeight2));
                        return;
                    }
                    o.LJIJI("mSaveView");
                    throw null;
                }
                o.LJIJI("mCancelView");
                throw null;
            }
            o.LJIJI("mSaveView");
            throw null;
        }
        o.LJIJI("contentLayout");
        throw null;
    }

    public final void cleanWorkSpace(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            o.LJIIIIZZ(files, "files");
            for (File file2 : files) {
                String s = file2.getPath();
                o.LJIIIIZZ(s, "s");
                if (!ujb.o.LJJJJ(s, "wav", false) && !s.equals(str2)) {
                    C16880lQ.LLLZZIL(file2);
                }
            }
        }
    }

    public final void start(boolean z, Cert policyPlaceholder) {
        float f;
        float f2;
        InterfaceC153045zY interfaceC153045zY = this.mVEEditor;
        if (interfaceC153045zY == null) {
            return;
        }
        View view = this.mPlayView;
        if (view != null) {
            view.setVisibility(4);
            int i = 0;
            if (z) {
                this.audioRecorderParam.setNeedDel(true);
                C78847Ux1.LJIIJJI(getEditPreviewApi(), this.audioRecorderParam);
                C170466mY c170466mY = this.tvMsg;
                if (c170466mY != null) {
                    c170466mY.setVisibility(4);
                    View view2 = this.backView;
                    if (view2 != null) {
                        view2.setVisibility(4);
                        C29701Eo c29701Eo = this.lottieAnimationView;
                        if (c29701Eo != null) {
                            c29701Eo.playAnimation();
                            C29701Eo c29701Eo2 = this.lottieAnimationView;
                            if (c29701Eo2 != null) {
                                c29701Eo2.setVisibility(0);
                                f2 = 0.0f;
                                f = 0.0f;
                            } else {
                                o.LJIJI("lottieAnimationView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("lottieAnimationView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("backView");
                        throw null;
                    }
                } else {
                    o.LJIJI("tvMsg");
                    throw null;
                }
            } else {
                this.isPlaying = true;
                if (hasRecord() && this.veAudioRecorderWrapper != null && this.audioRecorderParam.getAudioRecordIndex() < 0) {
                    C78847Ux1.LJIIJJI(getEditPreviewApi(), this.audioRecorderParam);
                }
                f = getMVideoPublishEditModel().voiceVolume;
                f2 = getMVideoPublishEditModel().musicVolume;
            }
            getEditAudioRecordViewModel().Jv0(f2, f);
            if (z) {
                if (this.curPoint != null) {
                    MutableLiveData<C5MM> mutableLiveData = this.mPreviewControlOpLiveData;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(C5MM.LIZLLL(r0.getY()));
                        C6KV c6kv = this.audioRecordSeekBar;
                        if (c6kv != null) {
                            Point point = this.curPoint;
                            o.LJI(point);
                            int y = point.getY();
                            Point push = c6kv.LJLILLLLZI.getMStack().push(new Point(y, y, System.currentTimeMillis()));
                            o.LJIIIIZZ(push, "seekBar.mStack.push(Poin…tem.currentTimeMillis()))");
                            this.curPoint = push;
                        } else {
                            o.LJIJI("audioRecordSeekBar");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mPreviewControlOpLiveData");
                        throw null;
                    }
                } else {
                    int LJZL = interfaceC153045zY.LJZL();
                    if (LJZL >= 50) {
                        i = LJZL;
                    }
                    C6KV c6kv2 = this.audioRecordSeekBar;
                    if (c6kv2 != null) {
                        Point push2 = c6kv2.LJLILLLLZI.getMStack().push(new Point(i, i, System.currentTimeMillis()));
                        o.LJIIIIZZ(push2, "seekBar.mStack.push(Poin…tem.currentTimeMillis()))");
                        this.curPoint = push2;
                    } else {
                        o.LJIJI("audioRecordSeekBar");
                        throw null;
                    }
                }
                this.isRecording = true;
                C136705Yc c136705Yc = this.veAudioRecorderWrapper;
                if (c136705Yc != null) {
                    int LJZL2 = interfaceC153045zY.LJZL() + 50;
                    int i2 = this.duration;
                    o.LJIIIZ(policyPlaceholder, "policyPlaceholder");
                    ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZ();
                    c136705Yc.LIZ.startRecord(1.0f, LJZL2, i2, policyPlaceholder);
                }
            }
            MutableLiveData<C5MM> mutableLiveData2 = this.mPreviewControlOpLiveData;
            if (mutableLiveData2 != null) {
                mutableLiveData2.setValue(C5MM.LIZ());
                this.progressGetter.start();
                return;
            } else {
                o.LJIJI("mPreviewControlOpLiveData");
                throw null;
            }
        }
        o.LJIJI("mPlayView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    @Override // X.WM7
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZ = FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd1, viewGroup, false, "inflater.inflate(R.layou…record, container, false)");
        this.parentLayout = LIZ;
        return LIZ;
    }

    public final void pause(boolean z, int i, Cert policyPlaceholder) {
        MutableLiveData<C5MM> mutableLiveData = this.mPreviewControlOpLiveData;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(C5MM.LIZJ());
            InterfaceC153045zY interfaceC153045zY = this.mVEEditor;
            if (interfaceC153045zY != null) {
                interfaceC153045zY.LIZJ();
                getProcessTimeLiveData().setValue(Long.valueOf(interfaceC153045zY.LJZL()));
            }
            this.progressGetter.cancel();
            View view = this.mPlayView;
            if (view != null) {
                view.setVisibility(0);
                if (this.audioRecordStartButtonLongClicking) {
                    this.audioRecordStartButtonLongClicking = false;
                    C6KY c6ky = this.audioRecordStartButton;
                    if (c6ky != null) {
                        c6ky.LJLJI.end();
                        c6ky.LJLJJI.start();
                    } else {
                        o.LJIJI("audioRecordStartButton");
                        throw null;
                    }
                }
                if (this.audioRecordStartButtonShortClicking) {
                    this.audioRecordStartButtonShortClicking = false;
                    C6KY c6ky2 = this.audioRecordStartButton;
                    if (c6ky2 != null) {
                        C6KZ c6kz = c6ky2.LJLILLLLZI;
                        if (c6kz != null) {
                            c6kz.LJLJJI.end();
                            c6kz.LJLJI.start();
                        } else {
                            o.LJIJI("centerView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("audioRecordStartButton");
                        throw null;
                    }
                }
                if (this.isRecording) {
                    C136705Yc c136705Yc = this.veAudioRecorderWrapper;
                    if (c136705Yc != null) {
                        if (z) {
                            Point point = this.curPoint;
                            if (point != null) {
                                point.setY(this.duration);
                            }
                            o.LJIIIZ(policyPlaceholder, "policyPlaceholder");
                            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZIZ();
                            c136705Yc.LIZ.stopRecord(policyPlaceholder);
                        } else {
                            o.LJIIIZ(policyPlaceholder, "policyPlaceholder");
                            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZIZ();
                            int stopRecord = (int) c136705Yc.LIZ.stopRecord(policyPlaceholder);
                            if (i == -1) {
                                i = stopRecord;
                            }
                            Point point2 = this.curPoint;
                            if (point2 != null) {
                                point2.setY(i);
                            }
                            MutableLiveData<C5MM> mutableLiveData2 = this.mPreviewControlOpLiveData;
                            if (mutableLiveData2 != null) {
                                mutableLiveData2.setValue(C5MM.LIZLLL(i));
                                C6KV c6kv = this.audioRecordSeekBar;
                                if (c6kv != null) {
                                    c6kv.post(new ARunnableS0S0100001_2(c6kv, i / this.duration, 0));
                                } else {
                                    o.LJIJI("audioRecordSeekBar");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mPreviewControlOpLiveData");
                                throw null;
                            }
                        }
                        C6KV c6kv2 = this.audioRecordSeekBar;
                        if (c6kv2 != null) {
                            c6kv2.LIZLLL();
                        } else {
                            o.LJIJI("audioRecordSeekBar");
                            throw null;
                        }
                    }
                    this.isRecording = false;
                    if (this.curPoint != null) {
                        getProcessTimeLiveData().setValue(Long.valueOf(r0.getY()));
                    }
                }
                this.isPlaying = false;
                AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
                C6KV c6kv3 = this.audioRecordSeekBar;
                if (c6kv3 != null) {
                    audioRecorderParam.setMStack(c6kv3.getStack());
                    if (this.audioRecorderParam.getMStack().isEmpty()) {
                        View view2 = this.backView;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        } else {
                            o.LJIJI("backView");
                            throw null;
                        }
                    } else {
                        View view3 = this.backView;
                        if (view3 != null) {
                            view3.setVisibility(0);
                        } else {
                            o.LJIJI("backView");
                            throw null;
                        }
                    }
                    C170466mY c170466mY = this.tvMsg;
                    if (c170466mY != null) {
                        c170466mY.setVisibility(0);
                        C29701Eo c29701Eo = this.lottieAnimationView;
                        if (c29701Eo != null) {
                            c29701Eo.setVisibility(4);
                            C29701Eo c29701Eo2 = this.lottieAnimationView;
                            if (c29701Eo2 != null) {
                                c29701Eo2.cancelAnimation();
                                return;
                            } else {
                                o.LJIJI("lottieAnimationView");
                                throw null;
                            }
                        }
                        o.LJIJI("lottieAnimationView");
                        throw null;
                    }
                    o.LJIJI("tvMsg");
                    throw null;
                }
                o.LJIJI("audioRecordSeekBar");
                throw null;
            }
            o.LJIJI("mPlayView");
            throw null;
        }
        o.LJIJI("mPreviewControlOpLiveData");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIILLIIL(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIJJLI(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C2KE<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIL(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIILL(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIJJ(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIILJJIL(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIJI(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    public static /* synthetic */ void pause$default(FTCEditAudioRecordScene fTCEditAudioRecordScene, boolean z, int i, Cert cert, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        fTCEditAudioRecordScene.pause(z, i, cert);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIILIIL(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIJ(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73297Sph.LJIIIIZZ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}
