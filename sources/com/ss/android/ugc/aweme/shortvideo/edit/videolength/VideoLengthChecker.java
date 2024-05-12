package com.ss.android.ugc.aweme.shortvideo.edit.videolength;

import X.AbstractC42651GoZ;
import X.C145935o5;
import X.C1JD;
import X.C58096Mr6;
import X.C6F2;
import X.C76800UCe;
import X.C78555UsJ;
import X.C78685UuP;
import X.I9T;
import X.InterfaceC142545ic;
import X.InterfaceC143655kP;
import X.InterfaceC153045zY;
import Y.AObserverS63S0300000_2;
import Y.AObserverS66S0200000_2;
import Y.ARunnableS38S0100000_2;
import Y.ARunnableS6S0101000_2;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoLengthChecker implements IVideoLengthChecker {
    public static IVideoLengthChecker LJ() {
        Object LIZ = C58096Mr6.LIZ(IVideoLengthChecker.class, false);
        if (LIZ != null) {
            return (IVideoLengthChecker) LIZ;
        }
        if (C58096Mr6.X6 == null) {
            synchronized (IVideoLengthChecker.class) {
                if (C58096Mr6.X6 == null) {
                    C58096Mr6.X6 = new VideoLengthChecker();
                }
            }
        }
        return C58096Mr6.X6;
    }

    public static void LJI(InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel videoPublishEditModel) {
        float f;
        if (interfaceC153045zY == null) {
            return;
        }
        EditVideoInfoServiceImpl.LIZ().setVideoLength(videoPublishEditModel.getCreationId(), interfaceC153045zY.getDuration());
        IEditVideoInfoService LIZ = EditVideoInfoServiceImpl.LIZ();
        String creationId = videoPublishEditModel.getCreationId();
        float f2 = videoPublishEditModel.voiceVolume;
        float f3 = videoPublishEditModel.musicVolume;
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            f = audioRecorderParam.getRecordVolume();
        } else {
            f = 0.0f;
        }
        LIZ.setVideoInfoData(creationId, new VideoInfoData(f2, f3, f));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZIZ(Activity context, VideoPublishEditModel model) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(model, "model");
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(model.creativeModel.musicBuzModel);
        boolean U40 = CommerceToolsMusicService.LIZIZ(false).U40();
        if (C1JD.LJIIJJI(model) && U40 && extractAVMusic != null && !extractAVMusic.isCommerceMusic()) {
            I9T.LJI(null, false, model.creativeModel.musicBuzModel);
            model.setMMusicPath(null);
            model.setMusicId("");
            model.setMMusicStart(0);
            model.setIsSoundLoop(Boolean.FALSE);
            model.musicVolume = 0.5f;
            context.getWindow().getDecorView().post(new ARunnableS38S0100000_2(context, 70));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZ(InterfaceC143655kP interfaceC143655kP, LifecycleOwner owner, FTCEditToolbarViewModel editToolbarViewModel) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(editToolbarViewModel, "editToolbarViewModel");
        if (interfaceC143655kP == null) {
            return;
        }
        interfaceC143655kP.Kh().observe(owner, new AObserverS66S0200000_2(interfaceC143655kP, editToolbarViewModel, 8));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZLLL(VideoPublishEditModel model, InterfaceC143655kP interfaceC143655kP, LifecycleOwner owner) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(owner, "owner");
        if (interfaceC143655kP == null) {
            return;
        }
        if (((Boolean) C145935o5.LIZ.getValue()).booleanValue()) {
            interfaceC143655kP.bq0().observe(owner, new AObserverS63S0300000_2(this, model, interfaceC143655kP, 2));
        } else {
            interfaceC143655kP.Kh().observe(owner, new AObserverS66S0200000_2(this, model, 7));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker
    public final void LIZJ(AbstractC42651GoZ abstractC42651GoZ, VideoPublishEditModel model, InterfaceC143655kP interfaceC143655kP, C6F2 editRootScene) {
        String str;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(editRootScene, "editRootScene");
        Activity activity = abstractC42651GoZ.mActivity;
        if (activity == null) {
            return;
        }
        Bundle bundle = abstractC42651GoZ.mArguments;
        if (bundle != null) {
            str = bundle.getString("extra_edit_effect_uid");
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            return;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(model.creativeModel.musicBuzModel);
        boolean U40 = CommerceToolsMusicService.LIZIZ(false).U40();
        if (C1JD.LJIIJJI(model) && U40 && extractAVMusic != null && (!extractAVMusic.isCommerceMusic() || C1JD.LJIIL(extractAVMusic))) {
            LJFF(activity, model, interfaceC143655kP, editRootScene, R.string.iim);
            return;
        }
        if (C1JD.LJIIJJI(model) && extractAVMusic != null && C1JD.LJIIL(extractAVMusic) && !model.isDuet() && !model.isUploadDuetMode()) {
            LJFF(activity, model, interfaceC143655kP, editRootScene, R.string.hyq);
        }
    }

    public static void LJFF(Activity activity, VideoPublishEditModel videoPublishEditModel, InterfaceC143655kP interfaceC143655kP, C6F2 c6f2, int i) {
        long j;
        InterfaceC142545ic interfaceC142545ic;
        LiveData<C76800UCe> OU;
        I9T.LJI(null, false, videoPublishEditModel.creativeModel.musicBuzModel);
        videoPublishEditModel.setMMusicPath(null);
        videoPublishEditModel.setMusicId("");
        videoPublishEditModel.setMMusicStart(0);
        videoPublishEditModel.setIsSoundLoop(Boolean.FALSE);
        videoPublishEditModel.musicVolume = 0.5f;
        c6f2.LLJJ().clearMusic();
        SafeHandler safeHandler = new SafeHandler(c6f2);
        ARunnableS6S0101000_2 aRunnableS6S0101000_2 = new ARunnableS6S0101000_2(i, activity, 2);
        if (C78555UsJ.LJJJ(activity, videoPublishEditModel)) {
            j = 4000;
        } else {
            j = 0;
        }
        safeHandler.removeCallbacksAndMessages(null);
        safeHandler.postDelayed(aRunnableS6S0101000_2, j);
        if ((interfaceC143655kP instanceof InterfaceC142545ic) && (interfaceC142545ic = (InterfaceC142545ic) interfaceC143655kP) != null && (OU = interfaceC142545ic.OU()) != null) {
            OU.observe(c6f2, new AObserverS66S0200000_2(safeHandler, aRunnableS6S0101000_2, 9));
        }
    }
}
