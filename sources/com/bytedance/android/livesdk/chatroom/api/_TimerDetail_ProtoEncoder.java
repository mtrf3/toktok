package com.bytedance.android.livesdk.chatroom.api;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes6.dex */
public final class _TimerDetail_ProtoEncoder implements InterfaceC64604PXc<TimerDetail> {
    public static int LIZJ(TimerDetail timerDetail) {
        return C30957CCz.LJI(22, timerDetail.auditStatus) + C30957CCz.LJI(21, timerDetail.antidirtStatus) + C30957CCz.LJI(20, timerDetail.timerStatus) + C30957CCz.LJIIIZ(19, timerDetail.screenH) + C30957CCz.LJIIIZ(18, timerDetail.screenW) + C30957CCz.LJIIIZ(17, timerDetail.stickerY) + C30957CCz.LJIIIZ(16, timerDetail.stickerX) + C30957CCz.LJIIIZ(15, timerDetail.timestampS) + C30957CCz.LJIIIZ(14, timerDetail.remainingTimeS) + C30957CCz.LJIIIZ(13, timerDetail.totalTimeS) + C30957CCz.LJIIIZ(12, timerDetail.lastPauseTimestampS) + C30957CCz.LJIIIZ(11, timerDetail.totalPauseTimeS) + C30957CCz.LJ(10) + C30957CCz.LJI(9, timerDetail.subCount) + C30957CCz.LJIIIZ(8, timerDetail.timeIncreaseCapS) + C30957CCz.LJIIIZ(7, timerDetail.timeIncreasePerSubS) + C30957CCz.LJIIL(6, timerDetail.userSideTitle) + C30957CCz.LJIIL(5, timerDetail.anchorSideTitle) + C30957CCz.LJIIIZ(4, timerDetail.startCountdownTimeS) + C30957CCz.LJIIIZ(3, timerDetail.startTimestampS) + C30957CCz.LJIIIZ(2, timerDetail.anchorId) + C30957CCz.LJIIIZ(1, timerDetail.timerId);
    }

    public static void LIZIZ(CD6 cd6, TimerDetail timerDetail) {
        long j = timerDetail.timerId;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        long j2 = timerDetail.anchorId;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j2);
        long j3 = timerDetail.startTimestampS;
        cd6.LIZLLL(3, 0);
        cd6.LJFF(j3);
        long j4 = timerDetail.startCountdownTimeS;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j4);
        C30957CCz.LIZLLL(cd6, 5, timerDetail.anchorSideTitle);
        C30957CCz.LIZLLL(cd6, 6, timerDetail.userSideTitle);
        long j5 = timerDetail.timeIncreasePerSubS;
        cd6.LIZLLL(7, 0);
        cd6.LJFF(j5);
        long j6 = timerDetail.timeIncreaseCapS;
        cd6.LIZLLL(8, 0);
        cd6.LJFF(j6);
        int i = timerDetail.subCount;
        cd6.LIZLLL(9, 0);
        cd6.LIZJ(i);
        boolean z = timerDetail.timeIncreaseReachCap;
        cd6.LIZLLL(10, 0);
        cd6.LJ(z ? 1 : 0);
        long j7 = timerDetail.totalPauseTimeS;
        cd6.LIZLLL(11, 0);
        cd6.LJFF(j7);
        long j8 = timerDetail.lastPauseTimestampS;
        cd6.LIZLLL(12, 0);
        cd6.LJFF(j8);
        long j9 = timerDetail.totalTimeS;
        cd6.LIZLLL(13, 0);
        cd6.LJFF(j9);
        long j10 = timerDetail.remainingTimeS;
        cd6.LIZLLL(14, 0);
        cd6.LJFF(j10);
        long j11 = timerDetail.timestampS;
        cd6.LIZLLL(15, 0);
        cd6.LJFF(j11);
        long j12 = timerDetail.stickerX;
        cd6.LIZLLL(16, 0);
        cd6.LJFF(j12);
        long j13 = timerDetail.stickerY;
        cd6.LIZLLL(17, 0);
        cd6.LJFF(j13);
        long j14 = timerDetail.screenW;
        cd6.LIZLLL(18, 0);
        cd6.LJFF(j14);
        long j15 = timerDetail.screenH;
        cd6.LIZLLL(19, 0);
        cd6.LJFF(j15);
        int i2 = timerDetail.timerStatus;
        cd6.LIZLLL(20, 0);
        cd6.LIZJ(i2);
        int i3 = timerDetail.antidirtStatus;
        cd6.LIZLLL(21, 0);
        cd6.LIZJ(i3);
        int i4 = timerDetail.auditStatus;
        cd6.LIZLLL(22, 0);
        cd6.LIZJ(i4);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, TimerDetail timerDetail) {
        LIZIZ(cd6, timerDetail);
    }
}
