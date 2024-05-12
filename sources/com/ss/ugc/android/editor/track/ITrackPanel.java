package com.ss.ugc.android.editor.track;

import X.C51D;
import X.EnumC127354zD;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import java.util.List;

/* loaded from: classes3.dex */
public interface ITrackPanel {
    public static final C51D Companion = new Object() { // from class: X.51D
    };

    void adjustAnimation(NLEVideoAnimation nLEVideoAnimation);

    void compressSubTrack(boolean z);

    CurrentSlotInfo getCurrentSlotInfo();

    EnumC127354zD getSelectTrackStyle(NLETrack nLETrack);

    void selectCurrentSlot(EnumC127354zD enumC127354zD);

    void selectSlot(NLETrackSlot nLETrackSlot, EnumC127354zD enumC127354zD);

    void setActionListener(TrackPanelActionListener trackPanelActionListener);

    void setActive(boolean z);

    void setCoverImage(Bitmap bitmap);

    void setSelectTrackStyle(EnumC127354zD enumC127354zD);

    void startRecordAudio(long j, int i);

    void stopRecordAudio();

    void switchUIState(TrackState trackState);

    void unSelectCurrentSlot();

    void unSelectTransition();

    void updateNLEModel(NLEModel nLEModel, int i);

    void updatePlayState(PlayPositionState playPositionState, boolean z);

    void updateRecordWavePoint(List<Float> list);
}
