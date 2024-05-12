package com.ss.ugc.android.editor.track;

import X.C5AE;
import X.EnumC127354zD;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* loaded from: classes3.dex */
public interface TrackPanelActionListener {
    NLETrackSlot getSelectedKeyframe();

    void mobSubTrackClipEvent(C5AE c5ae, NLETrackSlot nLETrackSlot, int i);

    void onAddResourceClick();

    void onAudioMuteClick(boolean z, boolean z2);

    void onClickBlankArea();

    void onClip(long j, long j2);

    void onClipEnd(NLETrackSlot nLETrackSlot, long j, long j2);

    void onClipMainToMinDuration();

    void onClipStart(NLETrackSlot nLETrackSlot);

    void onKeyframeSelected(NLETrackSlot nLETrackSlot);

    void onMainTrackDragBegin();

    void onMainTrackDragEnd(int i, int i2);

    void onMainTrackMoveSlot(NLETrackSlot nLETrackSlot, int i, int i2);

    void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z);

    void onMoveFail(NLETrackSlot nLETrackSlot);

    void onSaveSnapShot(Bitmap bitmap, boolean z);

    void onScale(float f);

    void onScaleBegin();

    void onScaleEnd();

    void onStartAndDuration(NLETrackSlot nLETrackSlot, long j, long j2, int i);

    void onTransitionClick(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2);

    void onUnableToSetTransition(int i);

    void onUpdateVideoCover();

    void onVideoPositionChanged(SeekInfo seekInfo);

    void sendFindNextSlotEvent();

    void switchPreviewEditType(boolean z, NLETrack nLETrack);

    void updateSelectSlot(NLETrack nLETrack, NLETrackSlot nLETrackSlot, EnumC127354zD enumC127354zD, boolean z);
}
