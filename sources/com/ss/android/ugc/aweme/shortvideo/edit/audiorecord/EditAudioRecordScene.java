package com.ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import X.AbstractC156316Bn;
import X.ActivityC45651qj;
import X.AnonymousClass668;
import X.C10K;
import X.C113584d0;
import X.C122034qd;
import X.C124574uj;
import X.C140345f4;
import X.C145995oB;
import X.C162626Zu;
import X.C163756bj;
import X.C16880lQ;
import X.C170466mY;
import X.C170696mv;
import X.C17N;
import X.C1EU;
import X.C221108m2;
import X.C269113v;
import X.C29701Eo;
import X.C38995FSd;
import X.C44384HbQ;
import X.C5H3;
import X.C5HC;
import X.C5MM;
import X.C5S1;
import X.C5T7;
import X.C5TD;
import X.C5TG;
import X.C5TH;
import X.C5U2;
import X.C5U3;
import X.C5UO;
import X.C5XM;
import X.C62905OmT;
import X.C62906OmU;
import X.C65352Pkq;
import X.C6KF;
import X.C6KI;
import X.C6KN;
import X.C6KO;
import X.C6KQ;
import X.C6KT;
import X.C6KU;
import X.C6W9;
import X.C6YR;
import X.C6YX;
import X.C73305Spp;
import X.C78847Ux1;
import X.C78885Uxd;
import X.C81184Vtc;
import X.C82622Wbi;
import X.C83728WtY;
import X.C8HI;
import X.EnumC158826Le;
import X.EnumC83730Wta;
import X.FMX;
import X.FP1;
import X.H7B;
import X.H8F;
import X.InterfaceC115514g7;
import X.InterfaceC135635Tz;
import X.InterfaceC139655dx;
import X.InterfaceC142515iZ;
import X.InterfaceC143655kP;
import X.InterfaceC143855kj;
import X.InterfaceC146665pG;
import X.InterfaceC15040iS;
import X.InterfaceC153045zY;
import X.InterfaceC162186Yc;
import X.InterfaceC45540Hu4;
import X.InterfaceC74236TBo;
import X.KL2;
import X.O6R;
import X.TBT;
import X.UCI;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnTouchListenerC141755hL;
import X.WFB;
import X.WM7;
import X.WMH;
import X.WUK;
import X.X1D;
import Y.ACallableS105S0100000_2;
import Y.AObserverS70S0100000_2;
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
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditAudioRecordScene extends WM7 implements WeakHandler.IHandler, InterfaceC135635Tz, C6KQ {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public static final C6KN Companion;
    public final int MSG_CLOSE;
    public final int MSG_DISSLOADING;
    public final int MSG_SHOWLOADING;
    public C6KO audioRecordSeekBar;
    public C6KU audioRecordStartButton;
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
    public final InterfaceC115514g7 editAdapterApi$delegate;
    public final InterfaceC115514g7 editAudioMetricsApi$delegate;
    public final InterfaceC115514g7 editAudioRecordApi$delegate;
    public final InterfaceC115514g7 editLoudnessApi$delegate;
    public final C5H3 editPreviewApi$delegate;
    public final InterfaceC115514g7 editSubtitleApi$delegate;
    public final InterfaceC115514g7 editVolumeV2Api$delegate;
    public MutableLiveData<Bitmap> firstFrameBitmap;
    public MutableLiveData<Boolean> firstFrameVisible;
    public boolean initNeedOriginalSoundState;
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
    public final C6KI mOnKeyDownListener;
    public View mPlayView;
    public MutableLiveData<C5MM> mPreviewControlOpLiveData;
    public float mProcess;
    public View mSaveView;
    public WFB mSharedVideoCoverDataSource;
    public InterfaceC153045zY mVEEditor;
    public final InterfaceC115514g7 mVideoPublishEditModel$delegate;
    public final C5H3 needOriginalSoundLiveData$delegate;
    public final C6KF onSeekChangeListener;
    public View parentLayout;
    public final C5H3 processTimeLiveData$delegate;
    public final ValueAnimator progressGetter;
    public int recordDubIndex;
    public FrameLayout seekLayout;
    public AudioRecorderParam tempAudioRecorderParam;
    public C170466mY tvMsg;
    public C5T7 veAudioRecorderWrapper;
    public View videoLayout;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.6KN] */
    static {
        TBT tbt = new TBT(EditAudioRecordScene.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, new TBT(EditAudioRecordScene.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(EditAudioRecordScene.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new TBT(EditAudioRecordScene.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new TBT(EditAudioRecordScene.class, "editLoudnessApi", "getEditLoudnessApi()Lcom/ss/android/ugc/gamora/editor/loudness/EditLoudnessApiComponent;", 0), new TBT(EditAudioRecordScene.class, "editAudioMetricsApi", "getEditAudioMetricsApi()Lcom/ss/android/ugc/gamora/editor/audiometrics/EditAudioMetricsApiComponent;", 0), new TBT(EditAudioRecordScene.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0)};
        Companion = new Object() { // from class: X.6KN
        };
    }

    public final void backRecord() {
        if (this.isRecording || this.isPlaying) {
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_BACK_RECORD, EnumC158826Le.USER_OPERATION), 3, null);
        }
        modDeleteDub();
        this.audioRecorderParam.setNeedDel(true);
        C78847Ux1.LJIIJJI(getEditPreviewApi(), this.audioRecorderParam);
        C6KO c6ko = this.audioRecordSeekBar;
        if (c6ko != null) {
            Point LIZJ = c6ko.LIZJ();
            if (LIZJ == null) {
                return;
            }
            float x = LIZJ.getX() / this.duration;
            LIZJ.setY(LIZJ.getY() + 100);
            int y = LIZJ.getY();
            int i = this.duration;
            if (y > i) {
                LIZJ.setY(i);
            }
            C5T7 c5t7 = this.veAudioRecorderWrapper;
            if (c5t7 != null) {
                c5t7.LIZJ.delete(LIZJ.getX(), LIZJ.getY());
            }
            this.onSeekChangeListener.LIZ(x, true);
            C6KO c6ko2 = this.audioRecordSeekBar;
            if (c6ko2 != null) {
                c6ko2.LJJIIJ(x);
                AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
                C6KO c6ko3 = this.audioRecordSeekBar;
                if (c6ko3 != null) {
                    audioRecorderParam.setMStack(c6ko3.getStack());
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
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_CANCEL, EnumC158826Le.USER_OPERATION), 3, null);
        }
        modCancelDub();
        saveToAudioRecorderParam();
        enableAddedAudio(true);
        if (this.audioRecorderParam.hasChange(getMVideoPublishEditModel().veAudioRecorderParam, this.initNeedOriginalSoundState)) {
            showCancleDialog();
            return;
        }
        C5XM editVolumeV2Api = getEditVolumeV2Api();
        if (editVolumeV2Api != null) {
            editVolumeV2Api.DE(true);
        }
        closeWithDelFile(this.audioRecorderParam.getAudioUrl());
        if (getMVideoPublishEditModel().veAudioRecorderParam == null || !getMVideoPublishEditModel().veAudioRecorderParam.hasRecord() || getMVideoPublishEditModel().veAudioRecorderParam.getAudioRecordIndex() != -2) {
            return;
        }
        InterfaceC143655kP editPreviewApi = getEditPreviewApi();
        AudioRecorderParam audioRecorderParam = getMVideoPublishEditModel().veAudioRecorderParam;
        o.LJIIIIZZ(audioRecorderParam, "mVideoPublishEditModel.veAudioRecorderParam");
        C78847Ux1.LJIIJJI(editPreviewApi, audioRecorderParam);
    }

    @Override // X.WM7
    public void onResume() {
        this.isPaused = false;
        super.onResume();
    }

    public final void save() {
        String audioUrl;
        NLEModel nLEModel;
        if (this.isRecording || this.isPlaying) {
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_SAVE, EnumC158826Le.USER_OPERATION), 3, null);
        }
        saveToAudioRecorderParam();
        enableAddedAudio(true);
        if (this.veAudioRecorderWrapper != null) {
            C5XM editVolumeV2Api = getEditVolumeV2Api();
            if (editVolumeV2Api != null) {
                editVolumeV2Api.DE(true);
            }
            if (this.audioRecorderParam.getAudioRecordIndex() < 0 && this.audioRecorderParam.hasRecord()) {
                C78847Ux1.LJIIJJI(getEditPreviewApi(), this.audioRecorderParam);
            }
        }
        String str = "";
        if (getMVideoPublishEditModel().veAudioRecorderParam == null) {
            getMVideoPublishEditModel().veAudioRecorderParam = new AudioRecorderParam();
            getMVideoPublishEditModel().creativeModel.micDataModel.editVolumeChangeMark = true;
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
        saveDub(this.audioRecorderParam.getNeedOriginalSound() ? 1 : 0);
        closeWithDelFile(str);
        InterfaceC143855kj editSubtitleApi = getEditSubtitleApi();
        if (editSubtitleApi != null && C5TH.LIZ(getMVideoPublishEditModel()) && editSubtitleApi.Xg()) {
            editSubtitleApi.LE();
            InterfaceC153045zY interfaceC153045zY = this.mVEEditor;
            if (interfaceC153045zY != null) {
                nLEModel = C17N.LJJ(interfaceC153045zY);
            } else {
                nLEModel = null;
            }
            editSubtitleApi.Jp(nLEModel);
        }
        doLoudnessBalance();
        C5TG editAudioMetricsApi = getEditAudioMetricsApi();
        if (editAudioMetricsApi != null) {
            editAudioMetricsApi.bO();
        }
    }

    private final InterfaceC142515iZ getEditAdapterApi() {
        return (InterfaceC142515iZ) this.editAdapterApi$delegate.LIZ(this, $$delegatedProperties[6]);
    }

    private final C5TG getEditAudioMetricsApi() {
        return (C5TG) this.editAudioMetricsApi$delegate.LIZ(this, $$delegatedProperties[5]);
    }

    private final InterfaceC146665pG getEditAudioRecordApi() {
        return (InterfaceC146665pG) this.editAudioRecordApi$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    private final C5TD getEditLoudnessApi() {
        return (C5TD) this.editLoudnessApi$delegate.LIZ(this, $$delegatedProperties[4]);
    }

    private final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.editPreviewApi$delegate.getValue();
    }

    private final InterfaceC143855kj getEditSubtitleApi() {
        return (InterfaceC143855kj) this.editSubtitleApi$delegate.LIZ(this, $$delegatedProperties[3]);
    }

    private final C145995oB getEventMapBuilder() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", H8F.LJI(getMVideoPublishEditModel()));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", getMVideoPublishEditModel().mShootWay);
        c145995oB.LJI("creation_id", getMVideoPublishEditModel().getCreationId());
        c145995oB.LJI("content_type", "video");
        return c145995oB;
    }

    private final int getVideoPlayMaxHeight() {
        return ((C81184Vtc.LIZIZ(this.mActivity) - ((int) KL2.LIZJ(this.mActivity, 334.0f))) - C81184Vtc.LJFF(this.mActivity)) - C81184Vtc.LIZJ(this.mActivity);
    }

    private final boolean hasRecord() {
        AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
        C6KO c6ko = this.audioRecordSeekBar;
        if (c6ko != null) {
            audioRecorderParam.setMStack(c6ko.getStack());
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
                            C6KU c6ku = this.audioRecordStartButton;
                            if (c6ku != null) {
                                c6ku.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 14)));
                                C6KU c6ku2 = this.audioRecordStartButton;
                                if (c6ku2 != null) {
                                    c6ku2.setOnLongClickListener(new IDCListenerS295S0100000_2(this, 3));
                                    C6KU c6ku3 = this.audioRecordStartButton;
                                    if (c6ku3 != null) {
                                        c6ku3.setOnTouchListener(new IDTListenerS112S0100000_2(this, 7));
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
                            ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL6 = this.mChooseVideoCoverView;
                            if (viewOnTouchListenerC141755hL6 != null) {
                                this.mEffectVideoCoverGenerator = new VEVideoCoverGeneratorImpl(interfaceC153045zY, this, viewOnTouchListenerC141755hL6.getCoverSize(), null, "ai_music");
                                VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.mEffectVideoCoverGenerator;
                                if (vEVideoCoverGeneratorImpl != null) {
                                    this.mSharedVideoCoverDataSource = new WFB(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                                    if (getMVideoPublishEditModel().isMvThemeVideoType()) {
                                        final C113584d0 c113584d0 = new C113584d0(frameWidth, frameHeight);
                                        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL7 = this.mChooseVideoCoverView;
                                        if (viewOnTouchListenerC141755hL7 != null) {
                                            viewOnTouchListenerC141755hL7.setAdapter(c113584d0);
                                            C6YX c6yx = new C6YX();
                                            c6yx.LIZIZ = new InterfaceC162186Yc() { // from class: X.6KL
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
                                                        ((SAAActivity) activity).LLIIJI("getIntent", new AqS7S0401000_2(c6yx, activity, this, ceil, c113584d0, 3));
                                                    } else {
                                                        c6yx.LIZ(activity, this.mVEEditor, ceil, new C5UO() { // from class: X.6KJ
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
        this.progressGetter.addUpdateListener(new AUListenerS91S0100000_2(this, 14));
    }

    private final void resetFromModel() {
        ARunnableS38S0100000_2 aRunnableS38S0100000_2 = new ARunnableS38S0100000_2(this, 63);
        this.veAudioRecorderWrapper = new C5T7();
        C10K.LIZIZ(new ACallableS105S0100000_2(aRunnableS38S0100000_2, 13), C38995FSd.LIZLLL(), null);
    }

    private final void saveToAudioRecorderParam() {
        AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
        C6KO c6ko = this.audioRecordSeekBar;
        if (c6ko != null) {
            audioRecorderParam.setMStack(c6ko.getStack());
        } else {
            o.LJIJI("audioRecordSeekBar");
            throw null;
        }
    }

    private final void showCancleDialog() {
        Activity activity = this.mActivity;
        if (activity != null) {
            C62905OmT c62905OmT = new C62905OmT(activity);
            c62905OmT.LJ(R.string.e2t);
            c62905OmT.LJII(R.string.e31, null);
            c62905OmT.LJIIJ(R.string.e30, new IDCListenerS156S0100000_2(this, 3));
            new C62906OmU(c62905OmT).LIZLLL();
        }
    }

    public final void doLoudnessBalance() {
        if (!AudioRecorderParam.hasChange$default(this.tempAudioRecorderParam, this.audioRecorderParam, false, 2, null)) {
            return;
        }
        this.tempAudioRecorderParam.copyFrom(this.audioRecorderParam);
        C5TD editLoudnessApi = getEditLoudnessApi();
        if (editLoudnessApi != null) {
            editLoudnessApi.fP(this.audioRecorderParam.getAudioUrl(), this.audioRecorderParam.getAudioRecordIndex(), this.mVEEditor);
        }
    }

    public final C5XM getEditVolumeV2Api() {
        return (C5XM) this.editVolumeV2Api$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    public final VideoPublishEditModel getMVideoPublishEditModel() {
        return (VideoPublishEditModel) this.mVideoPublishEditModel$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    public final MutableLiveData<Boolean> getNeedOriginalSoundLiveData() {
        return (MutableLiveData) this.needOriginalSoundLiveData$delegate.getValue();
    }

    public final MutableLiveData<Long> getProcessTimeLiveData() {
        return (MutableLiveData) this.processTimeLiveData$delegate.getValue();
    }

    public final boolean needReset$tools_camera_edit_release() {
        InterfaceC153045zY interfaceC153045zY = this.mVEEditor;
        if (interfaceC153045zY == null) {
            return false;
        }
        int i = this.duration;
        o.LJI(interfaceC153045zY);
        if (i == interfaceC153045zY.getDuration()) {
            return false;
        }
        return true;
    }

    private final InterfaceC139655dx getEditTextAdapterApi() {
        return getEditAdapterApi().mu().LIZ();
    }

    private final void initObserve() {
        getProcessTimeLiveData().observe(this, new AObserverS70S0100000_2(this, 48));
        getNeedOriginalSoundLiveData().observe(this, new AObserverS70S0100000_2(this, 49));
    }

    private final void modCancelDub() {
        FMX.LJIIL("cancel_dub", getEventMapBuilder().LIZ);
    }

    private final void modClick() {
        FMX.LJIIL("click_dub", getEventMapBuilder().LIZ);
    }

    private final void modDeleteDub() {
        FMX.LJIIL("delete_dub", getEventMapBuilder().LIZ);
    }

    private final void pauseRecord() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAudioRecordScene pauseRecord isRecording ");
        LIZ.append(this.isRecording);
        H7B.LJ(X1D.LIZIZ(LIZ));
        if (this.isRecording) {
            pause$default(this, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_PAUSE, EnumC158826Le.PAGE_INVISIBLE), 3, null);
        }
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
        if (audioRecorderParam != null && audioRecorderParam.getAudioRecordIndex() < 0 && audioRecorderParam.hasRecord()) {
            C78847Ux1.LJIIJJI(getEditPreviewApi(), audioRecorderParam);
        }
        C5XM editVolumeV2Api = getEditVolumeV2Api();
        if (editVolumeV2Api != null) {
            editVolumeV2Api.DE(true);
        }
        enableAddedAudio(true);
        closeWithDelFile(this.audioRecorderParam.getAudioUrl());
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    public final AudioRecorderParam getTempAudioRecorderParam() {
        return this.tempAudioRecorderParam;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    @Override // X.C6KQ
    public boolean isSceneRecording() {
        return this.isRecording;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.6KI] */
    public EditAudioRecordScene(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.diContainer = diContainer;
        this.editAudioRecordApi$delegate = UCI.LJI(getDiContainer(), InterfaceC146665pG.class, null);
        this.duration = 1;
        this.processTimeLiveData$delegate = C221108m2.LIZIZ(C5U3.LJLIL);
        this.needOriginalSoundLiveData$delegate = C221108m2.LIZIZ(C5U2.LJLIL);
        this.recordDubIndex = -1;
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
        o.LJIIIIZZ(ofInt, "ofInt(1, 10)");
        this.progressGetter = ofInt;
        this.isPaused = true;
        this.initNeedOriginalSoundState = true;
        this.mVideoPublishEditModel$delegate = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.editPreviewApi$delegate = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.editVolumeV2Api$delegate = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.editSubtitleApi$delegate = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.editLoudnessApi$delegate = UCI.LJII(getDiContainer(), C5TD.class, null);
        this.editAudioMetricsApi$delegate = UCI.LJII(getDiContainer(), C5TG.class, null);
        this.editAdapterApi$delegate = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.audioRecorderParam = new AudioRecorderParam();
        this.clickable = true;
        this.mHandler = new WeakHandler(this);
        this.MSG_SHOWLOADING = 1;
        this.MSG_DISSLOADING = 2;
        this.MSG_CLOSE = 4;
        this.onSeekChangeListener = new C6KF(this);
        this.mOnKeyDownListener = new C5HC() { // from class: X.6KI
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4 && EditAudioRecordScene.this.isVisible()) {
                    View view = EditAudioRecordScene.this.mCancelView;
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
        this.debounceOnClickListener = new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 13);
        this.tempAudioRecorderParam = new AudioRecorderParam();
    }

    private final void closeWithDelFile(String str) {
        C5T7 c5t7 = this.veAudioRecorderWrapper;
        if (c5t7 != null && !c5t7.LIZIZ) {
            c5t7.LIZIZ = true;
            c5t7.LIZJ.destory();
        }
        C10K.LIZIZ(new ACallableS105S0100000_2(new ARunnableS3S1100000_2(this, str, 1), 12), C38995FSd.LIZLLL(), null);
    }

    private final void saveDub(int i) {
        C145995oB eventMapBuilder = getEventMapBuilder();
        eventMapBuilder.LIZ(i, "original_sound");
        FMX.LJIIL("save_dub", eventMapBuilder.LIZ);
    }

    public final void enableAddedAudio(boolean z) {
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value == null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(value);
        if (LJJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enableAddedAudio, isEnable:");
            LIZ.append(z);
            H7B.LIZIZ("EditAudioRecordScene", X1D.LIZIZ(LIZ));
            VecNLETrackSPtr tracks = LJJI.LJIIJ.LJ().getTracks();
            o.LJIIIIZZ(tracks, "editorPro.editor.model.tracks");
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                NLETrack it2 = next;
                o.LJIIIIZZ(it2, "it");
                if (C124574uj.LJJJJZ(it2) || C124574uj.LJJJJLL(it2)) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((NLENode) it3.next()).setEnable(z);
            }
            LJJI.LJIIJ.LIZIZ();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == this.MSG_SHOWLOADING) {
            this.clickable = false;
            View view = this.mLoadingStatusViewLayout;
            if (view != null) {
                view.setVisibility(0);
                C73305Spp c73305Spp = this.mLoadingStatusView;
                if (c73305Spp != null) {
                    c73305Spp.setVisibility(0);
                    C73305Spp c73305Spp2 = this.mLoadingStatusView;
                    if (c73305Spp2 != null) {
                        c73305Spp2.LJFF();
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
        if (i == this.MSG_DISSLOADING) {
            this.clickable = true;
            C73305Spp c73305Spp3 = this.mLoadingStatusView;
            if (c73305Spp3 != null) {
                c73305Spp3.setVisibility(8);
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
        if (i != this.MSG_CLOSE) {
            return;
        }
        this.clickable = true;
        C73305Spp c73305Spp4 = this.mLoadingStatusView;
        if (c73305Spp4 != null) {
            c73305Spp4.setVisibility(8);
            View view3 = this.mLoadingStatusViewLayout;
            if (view3 != null) {
                view3.setVisibility(8);
                getEditAudioRecordApi().mJ(false);
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
        this.audioRecordStartButton = (C6KU) findViewById7;
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
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("regular");
        if (LIZLLL != null) {
            CheckBox checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                checkBox2.setTypeface(LIZLLL);
            } else {
                o.LJIJI("checkBox");
                throw null;
            }
        }
        View findViewById11 = findViewById(R.id.g8y);
        o.LJI(findViewById11);
        this.mLoadingStatusView = (C73305Spp) findViewById11;
        View findViewById12 = findViewById(R.id.g90);
        o.LJI(findViewById12);
        this.mLoadingStatusViewLayout = findViewById12;
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.6KM
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
                C6KO c6ko = new C6KO((ActivityC45651qj) activity, this);
                this.audioRecordSeekBar = c6ko;
                c6ko.LJFF((int) KL2.LIZJ(this.mActivity, 16.0f), (int) KL2.LIZJ(this.mActivity, 6.0f), (int) KL2.LIZJ(this.mActivity, 4.0f), this.duration, this.onSeekChangeListener);
                FrameLayout frameLayout = this.seekLayout;
                if (frameLayout != null) {
                    C6KO c6ko2 = this.audioRecordSeekBar;
                    if (c6ko2 != null) {
                        frameLayout.addView(c6ko2, new FrameLayout.LayoutParams(-1, -1));
                        View findViewById15 = findViewById(R.id.bbc);
                        o.LJI(findViewById15);
                        this.mChooseVideoCoverView = (ViewOnTouchListenerC141755hL) findViewById15;
                        this.mListenableActivityRegistry = C163756bj.LIZIZ(this);
                        this.firstFrameVisible = getEditPreviewApi().x7();
                        this.firstFrameBitmap = getEditPreviewApi().C0();
                        initProgressGetter();
                        initClick();
                        initObserve();
                        CheckBox checkBox3 = this.checkBox;
                        if (checkBox3 != null) {
                            checkBox3.setOnCheckedChangeListener(new IDCListenerS203S0100000_2(this, 1));
                            CheckBox checkBox4 = this.checkBox;
                            if (checkBox4 != null) {
                                checkBox4.setVisibility(8);
                                VideoPublishEditModel mVideoPublishEditModel = getMVideoPublishEditModel();
                                if (mVideoPublishEditModel.realHasOriginalSound() || mVideoPublishEditModel.isFastImport) {
                                    CheckBox checkBox5 = this.checkBox;
                                    if (checkBox5 != null) {
                                        checkBox5.setVisibility(0);
                                    } else {
                                        o.LJIJI("checkBox");
                                        throw null;
                                    }
                                }
                                if (mVideoPublishEditModel.editMusicSyncMode || mVideoPublishEditModel.isDuet() || C44384HbQ.LJZL(mVideoPublishEditModel) || mVideoPublishEditModel.isStickPointMode) {
                                    CheckBox checkBox6 = this.checkBox;
                                    if (checkBox6 != null) {
                                        checkBox6.setVisibility(8);
                                    } else {
                                        o.LJIJI("checkBox");
                                        throw null;
                                    }
                                }
                                initCoverView();
                                return;
                            }
                            o.LJIJI("checkBox");
                            throw null;
                        }
                        o.LJIJI("checkBox");
                        throw null;
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

    public final void recordDubEnd(String str) {
        C145995oB eventMapBuilder = getEventMapBuilder();
        eventMapBuilder.getClass();
        eventMapBuilder.LJI("enter_method", str);
        FMX.LJIIL("record_dub_end", eventMapBuilder.LIZ);
    }

    public final void recordDubStart(String str) {
        C145995oB eventMapBuilder = getEventMapBuilder();
        eventMapBuilder.getClass();
        eventMapBuilder.LJI("enter_method", str);
        FMX.LJIIL("record_dub_start", eventMapBuilder.LIZ);
    }

    public final void setAudioRecordStartButtonLongClicking(boolean z) {
        this.audioRecordStartButtonLongClicking = z;
        InterfaceC139655dx editTextAdapterApi = getEditTextAdapterApi();
        if (editTextAdapterApi != null) {
            editTextAdapterApi.LJLLLLLL(z);
        }
    }

    public final void setAudioRecordStartButtonShortClicking(boolean z) {
        this.audioRecordStartButtonShortClicking = z;
        InterfaceC139655dx editTextAdapterApi = getEditTextAdapterApi();
        if (editTextAdapterApi != null) {
            editTextAdapterApi.LJLLLLLL(z);
        }
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public final void setRecording(boolean z) {
        this.isRecording = z;
    }

    public final void setTempAudioRecorderParam(AudioRecorderParam audioRecorderParam) {
        o.LJIIIZ(audioRecorderParam, "<set-?>");
        this.tempAudioRecorderParam = audioRecorderParam;
    }

    public final void showOrHideScene$tools_camera_edit_release(final boolean z) {
        WMH wmh;
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
        if (z && (wmh = (WMH) this.mParentScene) != null) {
            wmh.show(this);
        }
        ViewGroup viewGroup = this.contentLayout;
        if (viewGroup != null) {
            C170696mv.LIZJ(viewGroup, z, (int) KL2.LIZJ(this.mActivity, 282.0f), findViewById(R.id.dp8), new InterfaceC15040iS() { // from class: X.6KG
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
                    EditAudioRecordScene editAudioRecordScene = this;
                    WMH wmh2 = (WMH) editAudioRecordScene.mParentScene;
                    if (wmh2 == null) {
                        return;
                    }
                    wmh2.hide(editAudioRecordScene);
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
                    if (getMVideoPublishEditModel().creativeModel.micDataModel.editDefaultVolume == 0.0f && getMVideoPublishEditModel().creativeModel.micDataModel.editDefaultVolume == getMVideoPublishEditModel().voiceVolume && !getMVideoPublishEditModel().creativeModel.micDataModel.editVolumeChangeMark) {
                        getMVideoPublishEditModel().voiceVolume = WUK.LJIIZILJ;
                        C5XM editVolumeV2Api = getEditVolumeV2Api();
                        if (editVolumeV2Api != null) {
                            editVolumeV2Api.RU(false);
                        }
                        this.initNeedOriginalSoundState = false;
                    }
                }
                this.audioRecorderParam.copyFrom(getMVideoPublishEditModel().veAudioRecorderParam);
                if (this.audioRecorderParam.getNeedOriginalSound()) {
                    this.audioRecorderParam.setVoiceVolume(getMVideoPublishEditModel().voiceVolume);
                }
                this.curPoint = null;
                CheckBox checkBox = this.checkBox;
                if (checkBox != null) {
                    checkBox.setChecked(this.audioRecorderParam.getNeedOriginalSound());
                    CheckBox checkBox2 = this.checkBox;
                    if (checkBox2 != null) {
                        checkBox2.setEnabled(!this.audioRecorderParam.getMuteByAudioCopyright());
                        getNeedOriginalSoundLiveData().setValue(Boolean.valueOf(this.audioRecorderParam.getNeedOriginalSound()));
                        View view = this.mPlayView;
                        if (view != null) {
                            view.setVisibility(0);
                            this.onSeekChangeListener.LIZ(0.0f, true);
                            C6KO c6ko = this.audioRecordSeekBar;
                            if (c6ko != null) {
                                c6ko.setStack(this.audioRecorderParam.getMStack());
                                C6KO c6ko2 = this.audioRecordSeekBar;
                                if (c6ko2 != null) {
                                    c6ko2.LJJIIJ(0.0f);
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

    private final void cleanWorkSpace(String str, String str2) {
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

    public final void start(boolean z, Cert cert) {
        Integer num;
        int i;
        InterfaceC153045zY interfaceC153045zY = this.mVEEditor;
        if (interfaceC153045zY == null) {
            return;
        }
        View view = this.mPlayView;
        if (view != null) {
            view.setVisibility(4);
            int i2 = 0;
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
                                C5XM editVolumeV2Api = getEditVolumeV2Api();
                                if (editVolumeV2Api != null) {
                                    editVolumeV2Api.DE(false);
                                }
                                enableAddedAudio(false);
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
                C5XM editVolumeV2Api2 = getEditVolumeV2Api();
                if (editVolumeV2Api2 != null) {
                    editVolumeV2Api2.DE(true);
                }
                enableAddedAudio(true);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditAudioRecordScene startRecording isRecording ");
            LIZ.append(this.isRecording);
            LIZ.append(" isRecord ");
            LIZ.append(z);
            H7B.LJ(X1D.LIZIZ(LIZ));
            if (z) {
                if (this.curPoint != null) {
                    MutableLiveData<C5MM> mutableLiveData = this.mPreviewControlOpLiveData;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(C5MM.LIZLLL(r0.getY()));
                        C6KO c6ko = this.audioRecordSeekBar;
                        if (c6ko != null) {
                            Point point = this.curPoint;
                            if (point != null) {
                                this.curPoint = c6ko.LIZLLL(point.getY());
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
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
                        i2 = LJZL;
                    }
                    C6KO c6ko2 = this.audioRecordSeekBar;
                    if (c6ko2 != null) {
                        this.curPoint = c6ko2.LIZLLL(i2);
                    } else {
                        o.LJIJI("audioRecordSeekBar");
                        throw null;
                    }
                }
                this.isRecording = true;
                C5T7 c5t7 = this.veAudioRecorderWrapper;
                if (c5t7 != null) {
                    num = Integer.valueOf(c5t7.LIZIZ(interfaceC153045zY.LJZL() + 50, this.duration, cert));
                } else {
                    num = null;
                }
                String creationId = getMVideoPublishEditModel().getCreationId();
                o.LJIIIIZZ(creationId, "mVideoPublishEditModel.creationId");
                C6YR.LIZIZ(creationId);
                if (num == null || num.intValue() != 0) {
                    String creationId2 = getMVideoPublishEditModel().getCreationId();
                    o.LJIIIIZZ(creationId2, "mVideoPublishEditModel.creationId");
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    C6YR.LIZJ(i, creationId2, "");
                } else {
                    String creationId3 = getMVideoPublishEditModel().getCreationId();
                    o.LJIIIIZZ(creationId3, "mVideoPublishEditModel.creationId");
                    C6YR.LIZLLL(creationId3);
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

    @Override // X.WM7
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZ = FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cc7, viewGroup, false, "inflater.inflate(R.layou…record, container, false)");
        this.parentLayout = LIZ;
        return LIZ;
    }

    public final void pause(boolean z, int i, Cert cert) {
        if (!z) {
            MutableLiveData<C5MM> mutableLiveData = this.mPreviewControlOpLiveData;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(C5MM.LIZJ());
            } else {
                o.LJIJI("mPreviewControlOpLiveData");
                throw null;
            }
        }
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
                setAudioRecordStartButtonLongClicking(false);
                C6KU c6ku = this.audioRecordStartButton;
                if (c6ku != null) {
                    c6ku.LJLJI.end();
                    c6ku.LJLJJI.start();
                } else {
                    o.LJIJI("audioRecordStartButton");
                    throw null;
                }
            }
            if (this.audioRecordStartButtonShortClicking) {
                setAudioRecordStartButtonShortClicking(false);
                C6KU c6ku2 = this.audioRecordStartButton;
                if (c6ku2 != null) {
                    C6KT c6kt = c6ku2.LJLILLLLZI;
                    if (c6kt != null) {
                        c6kt.LJLJJI.end();
                        c6kt.LJLJI.start();
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
                C5T7 c5t7 = this.veAudioRecorderWrapper;
                if (c5t7 != null) {
                    if (z) {
                        Point point = this.curPoint;
                        if (point != null) {
                            point.setY(this.duration);
                        }
                        c5t7.LIZJ(cert);
                    } else {
                        int LIZJ = (int) c5t7.LIZJ(cert);
                        if (i == -1) {
                            i = LIZJ;
                        }
                        Point point2 = this.curPoint;
                        if (point2 != null) {
                            point2.setY(i);
                        }
                        MutableLiveData<C5MM> mutableLiveData2 = this.mPreviewControlOpLiveData;
                        if (mutableLiveData2 != null) {
                            mutableLiveData2.setValue(C5MM.LIZLLL(i));
                            C6KO c6ko = this.audioRecordSeekBar;
                            if (c6ko != null) {
                                c6ko.LJJIIJ(i / this.duration);
                            } else {
                                o.LJIJI("audioRecordSeekBar");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mPreviewControlOpLiveData");
                            throw null;
                        }
                    }
                    String creationId = getMVideoPublishEditModel().getCreationId();
                    o.LJIIIIZZ(creationId, "mVideoPublishEditModel.creationId");
                    C6YR.LJ(creationId);
                    C6KO c6ko2 = this.audioRecordSeekBar;
                    if (c6ko2 != null) {
                        c6ko2.LIZIZ();
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
            C6KO c6ko3 = this.audioRecordSeekBar;
            if (c6ko3 != null) {
                audioRecorderParam.setMStack(c6ko3.getStack());
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

    public static /* synthetic */ void pause$default(EditAudioRecordScene editAudioRecordScene, boolean z, int i, Cert cert, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        editAudioRecordScene.pause(z, i, cert);
    }
}
