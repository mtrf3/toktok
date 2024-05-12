package com.ss.android.ugc.aweme.shortvideo.editcut;

import X.C145425nG;
import X.C150575vZ;
import X.C45927I0t;
import X.I6C;
import X.I7X;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditAdjustClipsBottomViewState implements InterfaceC61312at {
    public static final I7X Companion = new I7X();
    public final C45927I0t<List<VideoSegment>> addVideosEvent;
    public final int currentEditIndex;
    public final int currentEditOriginIndex;
    public final int currentTabIndex;
    public final C150575vZ<Integer, VideoSegment> deleteVideoEvent;
    public final Integer editState;
    public final Boolean focusEditMode;
    public final Boolean isLibraryMode;
    public final Boolean isMusicSyncMode;
    public final C145425nG modeChangeEvent;
    public final C45927I0t<I6C> restoreEditEvent;
    public final C145425nG restoreMusicSyncEvent;
    public final Float scale;
    public final C145425nG seekDoneEvent;
    public final Float selectTime;
    public final int stickPointStatus;
    public final C150575vZ<Integer, VideoSegment> updateVideoEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditAdjustClipsBottomViewState() {
        /*
            r20 = this;
            r1 = 0
            r5 = 0
            r18 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r20
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r19 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState.<init>():void");
    }

    public static /* synthetic */ EditAdjustClipsBottomViewState copy$default(EditAdjustClipsBottomViewState editAdjustClipsBottomViewState, int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, Boolean bool3, C150575vZ c150575vZ, C150575vZ c150575vZ2, C45927I0t c45927I0t, C45927I0t c45927I0t2, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, int i5, Object obj) {
        int i6 = i;
        int i7 = i2;
        Float f3 = f;
        Boolean bool4 = bool;
        int i8 = i3;
        int i9 = i4;
        Boolean bool5 = bool3;
        Boolean bool6 = bool2;
        Float f4 = f2;
        Integer num2 = num;
        C45927I0t c45927I0t3 = c45927I0t;
        C150575vZ c150575vZ3 = c150575vZ;
        C45927I0t c45927I0t4 = c45927I0t2;
        C150575vZ c150575vZ4 = c150575vZ2;
        C145425nG c145425nG4 = c145425nG3;
        C145425nG c145425nG5 = c145425nG;
        C145425nG c145425nG6 = c145425nG2;
        if ((i5 & 1) != 0) {
            i6 = editAdjustClipsBottomViewState.currentEditIndex;
        }
        if ((i5 & 2) != 0) {
            i7 = editAdjustClipsBottomViewState.currentEditOriginIndex;
        }
        if ((i5 & 4) != 0) {
            i8 = editAdjustClipsBottomViewState.currentTabIndex;
        }
        if ((i5 & 8) != 0) {
            i9 = editAdjustClipsBottomViewState.stickPointStatus;
        }
        if ((i5 & 16) != 0) {
            bool4 = editAdjustClipsBottomViewState.isMusicSyncMode;
        }
        if ((i5 & 32) != 0) {
            f3 = editAdjustClipsBottomViewState.scale;
        }
        if ((i5 & 64) != 0) {
            f4 = editAdjustClipsBottomViewState.selectTime;
        }
        if ((i5 & 128) != 0) {
            num2 = editAdjustClipsBottomViewState.editState;
        }
        if ((i5 & 256) != 0) {
            bool6 = editAdjustClipsBottomViewState.focusEditMode;
        }
        if ((i5 & 512) != 0) {
            bool5 = editAdjustClipsBottomViewState.isLibraryMode;
        }
        if ((i5 & 1024) != 0) {
            c150575vZ3 = editAdjustClipsBottomViewState.deleteVideoEvent;
        }
        if ((i5 & 2048) != 0) {
            c150575vZ4 = editAdjustClipsBottomViewState.updateVideoEvent;
        }
        if ((i5 & 4096) != 0) {
            c45927I0t3 = editAdjustClipsBottomViewState.restoreEditEvent;
        }
        if ((i5 & FileUtils.BUFFER_SIZE) != 0) {
            c45927I0t4 = editAdjustClipsBottomViewState.addVideosEvent;
        }
        if ((i5 & 16384) != 0) {
            c145425nG5 = editAdjustClipsBottomViewState.modeChangeEvent;
        }
        if ((32768 & i5) != 0) {
            c145425nG6 = editAdjustClipsBottomViewState.seekDoneEvent;
        }
        if ((i5 & 65536) != 0) {
            c145425nG4 = editAdjustClipsBottomViewState.restoreMusicSyncEvent;
        }
        Boolean bool7 = bool4;
        return editAdjustClipsBottomViewState.copy(i6, i7, i8, i9, bool7, f3, f4, num2, bool6, bool5, c150575vZ3, c150575vZ4, c45927I0t3, c45927I0t4, c145425nG5, c145425nG6, c145425nG4);
    }

    public final EditAdjustClipsBottomViewState copy(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, Boolean bool3, C150575vZ<Integer, VideoSegment> c150575vZ, C150575vZ<Integer, VideoSegment> c150575vZ2, C45927I0t<I6C> c45927I0t, C45927I0t<? extends List<? extends VideoSegment>> c45927I0t2, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3) {
        return new EditAdjustClipsBottomViewState(i, i2, i3, i4, bool, f, f2, num, bool2, bool3, c150575vZ, c150575vZ2, c45927I0t, c45927I0t2, c145425nG, c145425nG2, c145425nG3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsBottomViewState)) {
            return false;
        }
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return this.currentEditIndex == editAdjustClipsBottomViewState.currentEditIndex && this.currentEditOriginIndex == editAdjustClipsBottomViewState.currentEditOriginIndex && this.currentTabIndex == editAdjustClipsBottomViewState.currentTabIndex && this.stickPointStatus == editAdjustClipsBottomViewState.stickPointStatus && o.LJ(this.isMusicSyncMode, editAdjustClipsBottomViewState.isMusicSyncMode) && o.LJ(this.scale, editAdjustClipsBottomViewState.scale) && o.LJ(this.selectTime, editAdjustClipsBottomViewState.selectTime) && o.LJ(this.editState, editAdjustClipsBottomViewState.editState) && o.LJ(this.focusEditMode, editAdjustClipsBottomViewState.focusEditMode) && o.LJ(this.isLibraryMode, editAdjustClipsBottomViewState.isLibraryMode) && o.LJ(this.deleteVideoEvent, editAdjustClipsBottomViewState.deleteVideoEvent) && o.LJ(this.updateVideoEvent, editAdjustClipsBottomViewState.updateVideoEvent) && o.LJ(this.restoreEditEvent, editAdjustClipsBottomViewState.restoreEditEvent) && o.LJ(this.addVideosEvent, editAdjustClipsBottomViewState.addVideosEvent) && o.LJ(this.modeChangeEvent, editAdjustClipsBottomViewState.modeChangeEvent) && o.LJ(this.seekDoneEvent, editAdjustClipsBottomViewState.seekDoneEvent) && o.LJ(this.restoreMusicSyncEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public int hashCode() {
        int i = ((((((this.currentEditIndex * 31) + this.currentEditOriginIndex) * 31) + this.currentTabIndex) * 31) + this.stickPointStatus) * 31;
        Boolean bool = this.isMusicSyncMode;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.scale;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.selectTime;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.editState;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.focusEditMode;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLibraryMode;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C150575vZ<Integer, VideoSegment> c150575vZ = this.deleteVideoEvent;
        int hashCode7 = (hashCode6 + (c150575vZ == null ? 0 : c150575vZ.hashCode())) * 31;
        C150575vZ<Integer, VideoSegment> c150575vZ2 = this.updateVideoEvent;
        int hashCode8 = (hashCode7 + (c150575vZ2 == null ? 0 : c150575vZ2.hashCode())) * 31;
        C45927I0t<I6C> c45927I0t = this.restoreEditEvent;
        int hashCode9 = (hashCode8 + (c45927I0t == null ? 0 : c45927I0t.hashCode())) * 31;
        C45927I0t<List<VideoSegment>> c45927I0t2 = this.addVideosEvent;
        int hashCode10 = (hashCode9 + (c45927I0t2 == null ? 0 : c45927I0t2.hashCode())) * 31;
        C145425nG c145425nG = this.modeChangeEvent;
        int hashCode11 = (hashCode10 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        C145425nG c145425nG2 = this.seekDoneEvent;
        int hashCode12 = (hashCode11 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C145425nG c145425nG3 = this.restoreMusicSyncEvent;
        return hashCode12 + (c145425nG3 != null ? c145425nG3.hashCode() : 0);
    }

    public String toString() {
        return "EditAdjustClipsBottomViewState(currentEditIndex=" + this.currentEditIndex + ", currentEditOriginIndex=" + this.currentEditOriginIndex + ", currentTabIndex=" + this.currentTabIndex + ", stickPointStatus=" + this.stickPointStatus + ", isMusicSyncMode=" + this.isMusicSyncMode + ", scale=" + this.scale + ", selectTime=" + this.selectTime + ", editState=" + this.editState + ", focusEditMode=" + this.focusEditMode + ", isLibraryMode=" + this.isLibraryMode + ", deleteVideoEvent=" + this.deleteVideoEvent + ", updateVideoEvent=" + this.updateVideoEvent + ", restoreEditEvent=" + this.restoreEditEvent + ", addVideosEvent=" + this.addVideosEvent + ", modeChangeEvent=" + this.modeChangeEvent + ", seekDoneEvent=" + this.seekDoneEvent + ", restoreMusicSyncEvent=" + this.restoreMusicSyncEvent + ')';
    }

    public final C45927I0t<List<VideoSegment>> getAddVideosEvent() {
        return this.addVideosEvent;
    }

    public final int getCurrentEditIndex() {
        return this.currentEditIndex;
    }

    public final int getCurrentEditOriginIndex() {
        return this.currentEditOriginIndex;
    }

    public final int getCurrentTabIndex() {
        return this.currentTabIndex;
    }

    public final C150575vZ<Integer, VideoSegment> getDeleteVideoEvent() {
        return this.deleteVideoEvent;
    }

    public final Integer getEditState() {
        return this.editState;
    }

    public final Boolean getFocusEditMode() {
        return this.focusEditMode;
    }

    public final C145425nG getModeChangeEvent() {
        return this.modeChangeEvent;
    }

    public final C45927I0t<I6C> getRestoreEditEvent() {
        return this.restoreEditEvent;
    }

    public final C145425nG getRestoreMusicSyncEvent() {
        return this.restoreMusicSyncEvent;
    }

    public final Float getScale() {
        return this.scale;
    }

    public final C145425nG getSeekDoneEvent() {
        return this.seekDoneEvent;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final int getStickPointStatus() {
        return this.stickPointStatus;
    }

    public final C150575vZ<Integer, VideoSegment> getUpdateVideoEvent() {
        return this.updateVideoEvent;
    }

    public final Boolean isLibraryMode() {
        return this.isLibraryMode;
    }

    public final Boolean isMusicSyncMode() {
        return this.isMusicSyncMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditAdjustClipsBottomViewState(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, Boolean bool3, C150575vZ<Integer, VideoSegment> c150575vZ, C150575vZ<Integer, VideoSegment> c150575vZ2, C45927I0t<I6C> c45927I0t, C45927I0t<? extends List<? extends VideoSegment>> c45927I0t2, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3) {
        this.currentEditIndex = i;
        this.currentEditOriginIndex = i2;
        this.currentTabIndex = i3;
        this.stickPointStatus = i4;
        this.isMusicSyncMode = bool;
        this.scale = f;
        this.selectTime = f2;
        this.editState = num;
        this.focusEditMode = bool2;
        this.isLibraryMode = bool3;
        this.deleteVideoEvent = c150575vZ;
        this.updateVideoEvent = c150575vZ2;
        this.restoreEditEvent = c45927I0t;
        this.addVideosEvent = c45927I0t2;
        this.modeChangeEvent = c145425nG;
        this.seekDoneEvent = c145425nG2;
        this.restoreMusicSyncEvent = c145425nG3;
    }

    public /* synthetic */ EditAdjustClipsBottomViewState(int i, int i2, int i3, int i4, Boolean bool, Float f, Float f2, Integer num, Boolean bool2, Boolean bool3, C150575vZ c150575vZ, C150575vZ c150575vZ2, C45927I0t c45927I0t, C45927I0t c45927I0t2, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) == 0 ? i2 : 0, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) == 0 ? i4 : 1, (i5 & 16) != 0 ? null : bool, (i5 & 32) != 0 ? null : f, (i5 & 64) != 0 ? null : f2, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? null : bool2, (i5 & 512) != 0 ? null : bool3, (i5 & 1024) != 0 ? null : c150575vZ, (i5 & 2048) != 0 ? null : c150575vZ2, (i5 & 4096) != 0 ? null : c45927I0t, (i5 & FileUtils.BUFFER_SIZE) != 0 ? null : c45927I0t2, (i5 & 16384) != 0 ? null : c145425nG, (32768 & i5) != 0 ? null : c145425nG2, (i5 & 65536) != 0 ? null : c145425nG3);
    }
}
