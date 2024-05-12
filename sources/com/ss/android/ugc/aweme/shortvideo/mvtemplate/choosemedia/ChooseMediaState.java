package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C145425nG;
import X.C150545vW;
import X.C45569HuX;
import X.C45575Hud;
import X.InterfaceC61312at;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChooseMediaState implements InterfaceC61312at {
    public final AlbumToEditPageState albumToEditPageState;
    public final boolean albumViewFullShow;
    public final C45569HuX allMediaList;
    public final ClosingChooseMediaPageState closingChooseMediaPageState;
    public final C145425nG dockerHasShown;
    public final MediaListState goNextMediaState;
    public final boolean isChangeMusicDownloadSuccess;
    public final PreMusicState lastPreMusicState;
    public final MediaState libraryDownloadEvent;
    public final MediaState libraryDownloadProgressState;
    public final MediaState libraryDownloadResultState;
    public final MediaListState mediaListState;
    public final MediaState nextBtnWithDirectUseState;
    public final C150545vW notifyCloseRecord;
    public final C45575Hud notifyRefreshCoverWhenExitPreviewPage;
    public final OpeningChooseMediaPageState openingChooseMediaPageState;
    public final C45569HuX photoMediaList;
    public final PreMusicState preChangeMusicState;
    public final PreMusicState preMusicState;
    public final MyMediaModel previewAutoCutBtnClickState;
    public final MediaState previewDockerAddMediaState;
    public final MediaState previewDockerDelMediaState;
    public final MediaListState previewDockerInitMediaList;
    public final PreviewDockerState previewDockerState;
    public final MediaState previewMediaState;
    public final C145425nG previewNextBtnClickState;
    public final MediaState previewNextBtnMediaState;
    public final PreviewNextBtnState previewNextBtnState;
    public final PreviewSwapState previewSwapState;
    public final C150545vW recordPageExitState;
    public final RecordPresetResourceState recordPresetResourceState;
    public final MediaState selectMediaState;
    public final MediaState unSelectMediaState;
    public final MyMediaModel updateSelectedMediaClipRange;
    public final C45569HuX videoMediaList;

    public ChooseMediaState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public static /* synthetic */ ChooseMediaState copy$default(ChooseMediaState chooseMediaState, MediaListState mediaListState, MediaState mediaState, MediaState mediaState2, MyMediaModel myMediaModel, MediaState mediaState3, PreMusicState preMusicState, PreMusicState preMusicState2, PreMusicState preMusicState3, OpeningChooseMediaPageState openingChooseMediaPageState, ClosingChooseMediaPageState closingChooseMediaPageState, C45569HuX c45569HuX, C45569HuX c45569HuX2, C45569HuX c45569HuX3, boolean z, PreviewDockerState previewDockerState, MediaListState mediaListState2, PreviewSwapState previewSwapState, MediaState mediaState4, MediaState mediaState5, MediaState mediaState6, MediaState mediaState7, C145425nG c145425nG, PreviewNextBtnState previewNextBtnState, MyMediaModel myMediaModel2, C145425nG c145425nG2, boolean z2, RecordPresetResourceState recordPresetResourceState, AlbumToEditPageState albumToEditPageState, MediaState mediaState8, MediaState mediaState9, MediaState mediaState10, C45575Hud c45575Hud, MediaListState mediaListState3, C150545vW c150545vW, C150545vW c150545vW2, int i, int i2, Object obj) {
        boolean z3 = z;
        C45569HuX c45569HuX4 = c45569HuX3;
        C45569HuX c45569HuX5 = c45569HuX2;
        C45569HuX c45569HuX6 = c45569HuX;
        ClosingChooseMediaPageState closingChooseMediaPageState2 = closingChooseMediaPageState;
        OpeningChooseMediaPageState openingChooseMediaPageState2 = openingChooseMediaPageState;
        PreMusicState preMusicState4 = preMusicState3;
        PreMusicState preMusicState5 = preMusicState2;
        MediaState mediaState11 = mediaState;
        MediaListState mediaListState4 = mediaListState;
        MediaState mediaState12 = mediaState2;
        MyMediaModel myMediaModel3 = myMediaModel;
        MediaState mediaState13 = mediaState3;
        PreMusicState preMusicState6 = preMusicState;
        MediaListState mediaListState5 = mediaListState3;
        C45575Hud c45575Hud2 = c45575Hud;
        MediaState mediaState14 = mediaState6;
        MediaState mediaState15 = mediaState5;
        MediaState mediaState16 = mediaState4;
        PreviewSwapState previewSwapState2 = previewSwapState;
        PreviewDockerState previewDockerState2 = previewDockerState;
        MediaListState mediaListState6 = mediaListState2;
        MediaState mediaState17 = mediaState7;
        C145425nG c145425nG3 = c145425nG;
        PreviewNextBtnState previewNextBtnState2 = previewNextBtnState;
        C150545vW c150545vW3 = c150545vW;
        MediaState mediaState18 = mediaState10;
        MyMediaModel myMediaModel4 = myMediaModel2;
        C150545vW c150545vW4 = c150545vW2;
        C145425nG c145425nG4 = c145425nG2;
        boolean z4 = z2;
        RecordPresetResourceState recordPresetResourceState2 = recordPresetResourceState;
        AlbumToEditPageState albumToEditPageState2 = albumToEditPageState;
        MediaState mediaState19 = mediaState8;
        MediaState mediaState20 = mediaState9;
        if ((i & 1) != 0) {
            mediaListState4 = chooseMediaState.mediaListState;
        }
        if ((i & 2) != 0) {
            mediaState11 = chooseMediaState.selectMediaState;
        }
        if ((i & 4) != 0) {
            mediaState12 = chooseMediaState.unSelectMediaState;
        }
        if ((i & 8) != 0) {
            myMediaModel3 = chooseMediaState.updateSelectedMediaClipRange;
        }
        if ((i & 16) != 0) {
            mediaState13 = chooseMediaState.previewMediaState;
        }
        if ((i & 32) != 0) {
            preMusicState6 = chooseMediaState.preMusicState;
        }
        if ((i & 64) != 0) {
            preMusicState5 = chooseMediaState.preChangeMusicState;
        }
        if ((i & 128) != 0) {
            preMusicState4 = chooseMediaState.lastPreMusicState;
        }
        if ((i & 256) != 0) {
            openingChooseMediaPageState2 = chooseMediaState.openingChooseMediaPageState;
        }
        if ((i & 512) != 0) {
            closingChooseMediaPageState2 = chooseMediaState.closingChooseMediaPageState;
        }
        if ((i & 1024) != 0) {
            c45569HuX6 = chooseMediaState.allMediaList;
        }
        if ((i & 2048) != 0) {
            c45569HuX5 = chooseMediaState.photoMediaList;
        }
        if ((i & 4096) != 0) {
            c45569HuX4 = chooseMediaState.videoMediaList;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z3 = chooseMediaState.isChangeMusicDownloadSuccess;
        }
        if ((i & 16384) != 0) {
            previewDockerState2 = chooseMediaState.previewDockerState;
        }
        if ((32768 & i) != 0) {
            mediaListState6 = chooseMediaState.previewDockerInitMediaList;
        }
        if ((65536 & i) != 0) {
            previewSwapState2 = chooseMediaState.previewSwapState;
        }
        if ((131072 & i) != 0) {
            mediaState16 = chooseMediaState.previewDockerDelMediaState;
        }
        if ((262144 & i) != 0) {
            mediaState15 = chooseMediaState.previewDockerAddMediaState;
        }
        if ((524288 & i) != 0) {
            mediaState14 = chooseMediaState.previewNextBtnMediaState;
        }
        if ((1048576 & i) != 0) {
            mediaState17 = chooseMediaState.nextBtnWithDirectUseState;
        }
        if ((2097152 & i) != 0) {
            c145425nG3 = chooseMediaState.previewNextBtnClickState;
        }
        if ((4194304 & i) != 0) {
            previewNextBtnState2 = chooseMediaState.previewNextBtnState;
        }
        if ((8388608 & i) != 0) {
            myMediaModel4 = chooseMediaState.previewAutoCutBtnClickState;
        }
        if ((16777216 & i) != 0) {
            c145425nG4 = chooseMediaState.dockerHasShown;
        }
        if ((33554432 & i) != 0) {
            z4 = chooseMediaState.albumViewFullShow;
        }
        if ((67108864 & i) != 0) {
            recordPresetResourceState2 = chooseMediaState.recordPresetResourceState;
        }
        if ((134217728 & i) != 0) {
            albumToEditPageState2 = chooseMediaState.albumToEditPageState;
        }
        if ((268435456 & i) != 0) {
            mediaState19 = chooseMediaState.libraryDownloadEvent;
        }
        if ((536870912 & i) != 0) {
            mediaState20 = chooseMediaState.libraryDownloadResultState;
        }
        if ((1073741824 & i) != 0) {
            mediaState18 = chooseMediaState.libraryDownloadProgressState;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            c45575Hud2 = chooseMediaState.notifyRefreshCoverWhenExitPreviewPage;
        }
        if ((i2 & 1) != 0) {
            mediaListState5 = chooseMediaState.goNextMediaState;
        }
        if ((i2 & 2) != 0) {
            c150545vW3 = chooseMediaState.recordPageExitState;
        }
        if ((i2 & 4) != 0) {
            c150545vW4 = chooseMediaState.notifyCloseRecord;
        }
        return chooseMediaState.copy(mediaListState4, mediaState11, mediaState12, myMediaModel3, mediaState13, preMusicState6, preMusicState5, preMusicState4, openingChooseMediaPageState2, closingChooseMediaPageState2, c45569HuX6, c45569HuX5, c45569HuX4, z3, previewDockerState2, mediaListState6, previewSwapState2, mediaState16, mediaState15, mediaState14, mediaState17, c145425nG3, previewNextBtnState2, myMediaModel4, c145425nG4, z4, recordPresetResourceState2, albumToEditPageState2, mediaState19, mediaState20, mediaState18, c45575Hud2, mediaListState5, c150545vW3, c150545vW4);
    }

    public final ChooseMediaState copy(MediaListState mediaListState, MediaState selectMediaState, MediaState unSelectMediaState, MyMediaModel updateSelectedMediaClipRange, MediaState previewMediaState, PreMusicState preMusicState, PreMusicState preChangeMusicState, PreMusicState lastPreMusicState, OpeningChooseMediaPageState openingChooseMediaPageState, ClosingChooseMediaPageState closingChooseMediaPageState, C45569HuX allMediaList, C45569HuX photoMediaList, C45569HuX videoMediaList, boolean z, PreviewDockerState previewDockerState, MediaListState previewDockerInitMediaList, PreviewSwapState previewSwapState, MediaState previewDockerDelMediaState, MediaState previewDockerAddMediaState, MediaState previewNextBtnMediaState, MediaState nextBtnWithDirectUseState, C145425nG c145425nG, PreviewNextBtnState previewNextBtnState, MyMediaModel myMediaModel, C145425nG c145425nG2, boolean z2, RecordPresetResourceState recordPresetResourceState, AlbumToEditPageState albumToEditPageState, MediaState libraryDownloadEvent, MediaState libraryDownloadResultState, MediaState libraryDownloadProgressState, C45575Hud notifyRefreshCoverWhenExitPreviewPage, MediaListState goNextMediaState, C150545vW recordPageExitState, C150545vW notifyCloseRecord) {
        o.LJIIIZ(mediaListState, "mediaListState");
        o.LJIIIZ(selectMediaState, "selectMediaState");
        o.LJIIIZ(unSelectMediaState, "unSelectMediaState");
        o.LJIIIZ(updateSelectedMediaClipRange, "updateSelectedMediaClipRange");
        o.LJIIIZ(previewMediaState, "previewMediaState");
        o.LJIIIZ(preMusicState, "preMusicState");
        o.LJIIIZ(preChangeMusicState, "preChangeMusicState");
        o.LJIIIZ(lastPreMusicState, "lastPreMusicState");
        o.LJIIIZ(openingChooseMediaPageState, "openingChooseMediaPageState");
        o.LJIIIZ(allMediaList, "allMediaList");
        o.LJIIIZ(photoMediaList, "photoMediaList");
        o.LJIIIZ(videoMediaList, "videoMediaList");
        o.LJIIIZ(previewDockerState, "previewDockerState");
        o.LJIIIZ(previewDockerInitMediaList, "previewDockerInitMediaList");
        o.LJIIIZ(previewSwapState, "previewSwapState");
        o.LJIIIZ(previewDockerDelMediaState, "previewDockerDelMediaState");
        o.LJIIIZ(previewDockerAddMediaState, "previewDockerAddMediaState");
        o.LJIIIZ(previewNextBtnMediaState, "previewNextBtnMediaState");
        o.LJIIIZ(nextBtnWithDirectUseState, "nextBtnWithDirectUseState");
        o.LJIIIZ(previewNextBtnState, "previewNextBtnState");
        o.LJIIIZ(recordPresetResourceState, "recordPresetResourceState");
        o.LJIIIZ(albumToEditPageState, "albumToEditPageState");
        o.LJIIIZ(libraryDownloadEvent, "libraryDownloadEvent");
        o.LJIIIZ(libraryDownloadResultState, "libraryDownloadResultState");
        o.LJIIIZ(libraryDownloadProgressState, "libraryDownloadProgressState");
        o.LJIIIZ(notifyRefreshCoverWhenExitPreviewPage, "notifyRefreshCoverWhenExitPreviewPage");
        o.LJIIIZ(goNextMediaState, "goNextMediaState");
        o.LJIIIZ(recordPageExitState, "recordPageExitState");
        o.LJIIIZ(notifyCloseRecord, "notifyCloseRecord");
        return new ChooseMediaState(mediaListState, selectMediaState, unSelectMediaState, updateSelectedMediaClipRange, previewMediaState, preMusicState, preChangeMusicState, lastPreMusicState, openingChooseMediaPageState, closingChooseMediaPageState, allMediaList, photoMediaList, videoMediaList, z, previewDockerState, previewDockerInitMediaList, previewSwapState, previewDockerDelMediaState, previewDockerAddMediaState, previewNextBtnMediaState, nextBtnWithDirectUseState, c145425nG, previewNextBtnState, myMediaModel, c145425nG2, z2, recordPresetResourceState, albumToEditPageState, libraryDownloadEvent, libraryDownloadResultState, libraryDownloadProgressState, notifyRefreshCoverWhenExitPreviewPage, goNextMediaState, recordPageExitState, notifyCloseRecord);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseMediaState)) {
            return false;
        }
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return o.LJ(this.mediaListState, chooseMediaState.mediaListState) && o.LJ(this.selectMediaState, chooseMediaState.selectMediaState) && o.LJ(this.unSelectMediaState, chooseMediaState.unSelectMediaState) && o.LJ(this.updateSelectedMediaClipRange, chooseMediaState.updateSelectedMediaClipRange) && o.LJ(this.previewMediaState, chooseMediaState.previewMediaState) && o.LJ(this.preMusicState, chooseMediaState.preMusicState) && o.LJ(this.preChangeMusicState, chooseMediaState.preChangeMusicState) && o.LJ(this.lastPreMusicState, chooseMediaState.lastPreMusicState) && o.LJ(this.openingChooseMediaPageState, chooseMediaState.openingChooseMediaPageState) && o.LJ(this.closingChooseMediaPageState, chooseMediaState.closingChooseMediaPageState) && o.LJ(this.allMediaList, chooseMediaState.allMediaList) && o.LJ(this.photoMediaList, chooseMediaState.photoMediaList) && o.LJ(this.videoMediaList, chooseMediaState.videoMediaList) && this.isChangeMusicDownloadSuccess == chooseMediaState.isChangeMusicDownloadSuccess && o.LJ(this.previewDockerState, chooseMediaState.previewDockerState) && o.LJ(this.previewDockerInitMediaList, chooseMediaState.previewDockerInitMediaList) && o.LJ(this.previewSwapState, chooseMediaState.previewSwapState) && o.LJ(this.previewDockerDelMediaState, chooseMediaState.previewDockerDelMediaState) && o.LJ(this.previewDockerAddMediaState, chooseMediaState.previewDockerAddMediaState) && o.LJ(this.previewNextBtnMediaState, chooseMediaState.previewNextBtnMediaState) && o.LJ(this.nextBtnWithDirectUseState, chooseMediaState.nextBtnWithDirectUseState) && o.LJ(this.previewNextBtnClickState, chooseMediaState.previewNextBtnClickState) && o.LJ(this.previewNextBtnState, chooseMediaState.previewNextBtnState) && o.LJ(this.previewAutoCutBtnClickState, chooseMediaState.previewAutoCutBtnClickState) && o.LJ(this.dockerHasShown, chooseMediaState.dockerHasShown) && this.albumViewFullShow == chooseMediaState.albumViewFullShow && o.LJ(this.recordPresetResourceState, chooseMediaState.recordPresetResourceState) && o.LJ(this.albumToEditPageState, chooseMediaState.albumToEditPageState) && o.LJ(this.libraryDownloadEvent, chooseMediaState.libraryDownloadEvent) && o.LJ(this.libraryDownloadResultState, chooseMediaState.libraryDownloadResultState) && o.LJ(this.libraryDownloadProgressState, chooseMediaState.libraryDownloadProgressState) && o.LJ(this.notifyRefreshCoverWhenExitPreviewPage, chooseMediaState.notifyRefreshCoverWhenExitPreviewPage) && o.LJ(this.goNextMediaState, chooseMediaState.goNextMediaState) && o.LJ(this.recordPageExitState, chooseMediaState.recordPageExitState) && o.LJ(this.notifyCloseRecord, chooseMediaState.notifyCloseRecord);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.openingChooseMediaPageState.hashCode() + ((this.lastPreMusicState.hashCode() + ((this.preChangeMusicState.hashCode() + ((this.preMusicState.hashCode() + ((this.previewMediaState.hashCode() + ((this.updateSelectedMediaClipRange.hashCode() + ((this.unSelectMediaState.hashCode() + ((this.selectMediaState.hashCode() + (this.mediaListState.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        ClosingChooseMediaPageState closingChooseMediaPageState = this.closingChooseMediaPageState;
        int hashCode2 = (this.videoMediaList.hashCode() + ((this.photoMediaList.hashCode() + ((this.allMediaList.hashCode() + ((hashCode + (closingChooseMediaPageState == null ? 0 : closingChooseMediaPageState.hashCode())) * 31)) * 31)) * 31)) * 31;
        boolean z = this.isChangeMusicDownloadSuccess;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (this.nextBtnWithDirectUseState.hashCode() + ((this.previewNextBtnMediaState.hashCode() + ((this.previewDockerAddMediaState.hashCode() + ((this.previewDockerDelMediaState.hashCode() + ((this.previewSwapState.hashCode() + ((this.previewDockerInitMediaList.hashCode() + ((this.previewDockerState.hashCode() + ((hashCode2 + i) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        C145425nG c145425nG = this.previewNextBtnClickState;
        int hashCode4 = (this.previewNextBtnState.hashCode() + ((hashCode3 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31)) * 31;
        MyMediaModel myMediaModel = this.previewAutoCutBtnClickState;
        int hashCode5 = (hashCode4 + (myMediaModel == null ? 0 : myMediaModel.hashCode())) * 31;
        C145425nG c145425nG2 = this.dockerHasShown;
        return this.notifyCloseRecord.hashCode() + ((this.recordPageExitState.hashCode() + ((this.goNextMediaState.hashCode() + ((this.notifyRefreshCoverWhenExitPreviewPage.hashCode() + ((this.libraryDownloadProgressState.hashCode() + ((this.libraryDownloadResultState.hashCode() + ((this.libraryDownloadEvent.hashCode() + ((this.albumToEditPageState.hashCode() + ((this.recordPresetResourceState.hashCode() + ((((hashCode5 + (c145425nG2 != null ? c145425nG2.hashCode() : 0)) * 31) + (this.albumViewFullShow ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ChooseMediaState(mediaListState=" + this.mediaListState + ", selectMediaState=" + this.selectMediaState + ", unSelectMediaState=" + this.unSelectMediaState + ", updateSelectedMediaClipRange=" + this.updateSelectedMediaClipRange + ", previewMediaState=" + this.previewMediaState + ", preMusicState=" + this.preMusicState + ", preChangeMusicState=" + this.preChangeMusicState + ", lastPreMusicState=" + this.lastPreMusicState + ", openingChooseMediaPageState=" + this.openingChooseMediaPageState + ", closingChooseMediaPageState=" + this.closingChooseMediaPageState + ", allMediaList=" + this.allMediaList + ", photoMediaList=" + this.photoMediaList + ", videoMediaList=" + this.videoMediaList + ", isChangeMusicDownloadSuccess=" + this.isChangeMusicDownloadSuccess + ", previewDockerState=" + this.previewDockerState + ", previewDockerInitMediaList=" + this.previewDockerInitMediaList + ", previewSwapState=" + this.previewSwapState + ", previewDockerDelMediaState=" + this.previewDockerDelMediaState + ", previewDockerAddMediaState=" + this.previewDockerAddMediaState + ", previewNextBtnMediaState=" + this.previewNextBtnMediaState + ", nextBtnWithDirectUseState=" + this.nextBtnWithDirectUseState + ", previewNextBtnClickState=" + this.previewNextBtnClickState + ", previewNextBtnState=" + this.previewNextBtnState + ", previewAutoCutBtnClickState=" + this.previewAutoCutBtnClickState + ", dockerHasShown=" + this.dockerHasShown + ", albumViewFullShow=" + this.albumViewFullShow + ", recordPresetResourceState=" + this.recordPresetResourceState + ", albumToEditPageState=" + this.albumToEditPageState + ", libraryDownloadEvent=" + this.libraryDownloadEvent + ", libraryDownloadResultState=" + this.libraryDownloadResultState + ", libraryDownloadProgressState=" + this.libraryDownloadProgressState + ", notifyRefreshCoverWhenExitPreviewPage=" + this.notifyRefreshCoverWhenExitPreviewPage + ", goNextMediaState=" + this.goNextMediaState + ", recordPageExitState=" + this.recordPageExitState + ", notifyCloseRecord=" + this.notifyCloseRecord + ')';
    }

    public final AlbumToEditPageState getAlbumToEditPageState() {
        return this.albumToEditPageState;
    }

    public final boolean getAlbumViewFullShow() {
        return this.albumViewFullShow;
    }

    public final C45569HuX getAllMediaList() {
        return this.allMediaList;
    }

    public final ClosingChooseMediaPageState getClosingChooseMediaPageState() {
        return this.closingChooseMediaPageState;
    }

    public final C145425nG getDockerHasShown() {
        return this.dockerHasShown;
    }

    public final MediaListState getGoNextMediaState() {
        return this.goNextMediaState;
    }

    public final PreMusicState getLastPreMusicState() {
        return this.lastPreMusicState;
    }

    public final MediaState getLibraryDownloadEvent() {
        return this.libraryDownloadEvent;
    }

    public final MediaState getLibraryDownloadProgressState() {
        return this.libraryDownloadProgressState;
    }

    public final MediaState getLibraryDownloadResultState() {
        return this.libraryDownloadResultState;
    }

    public final MediaListState getMediaListState() {
        return this.mediaListState;
    }

    public final MediaState getNextBtnWithDirectUseState() {
        return this.nextBtnWithDirectUseState;
    }

    public final C150545vW getNotifyCloseRecord() {
        return this.notifyCloseRecord;
    }

    public final C45575Hud getNotifyRefreshCoverWhenExitPreviewPage() {
        return this.notifyRefreshCoverWhenExitPreviewPage;
    }

    public final OpeningChooseMediaPageState getOpeningChooseMediaPageState() {
        return this.openingChooseMediaPageState;
    }

    public final C45569HuX getPhotoMediaList() {
        return this.photoMediaList;
    }

    public final PreMusicState getPreChangeMusicState() {
        return this.preChangeMusicState;
    }

    public final PreMusicState getPreMusicState() {
        return this.preMusicState;
    }

    public final MyMediaModel getPreviewAutoCutBtnClickState() {
        return this.previewAutoCutBtnClickState;
    }

    public final MediaState getPreviewDockerAddMediaState() {
        return this.previewDockerAddMediaState;
    }

    public final MediaState getPreviewDockerDelMediaState() {
        return this.previewDockerDelMediaState;
    }

    public final MediaListState getPreviewDockerInitMediaList() {
        return this.previewDockerInitMediaList;
    }

    public final PreviewDockerState getPreviewDockerState() {
        return this.previewDockerState;
    }

    public final MediaState getPreviewMediaState() {
        return this.previewMediaState;
    }

    public final C145425nG getPreviewNextBtnClickState() {
        return this.previewNextBtnClickState;
    }

    public final MediaState getPreviewNextBtnMediaState() {
        return this.previewNextBtnMediaState;
    }

    public final PreviewNextBtnState getPreviewNextBtnState() {
        return this.previewNextBtnState;
    }

    public final PreviewSwapState getPreviewSwapState() {
        return this.previewSwapState;
    }

    public final C150545vW getRecordPageExitState() {
        return this.recordPageExitState;
    }

    public final RecordPresetResourceState getRecordPresetResourceState() {
        return this.recordPresetResourceState;
    }

    public final MediaState getSelectMediaState() {
        return this.selectMediaState;
    }

    public final MediaState getUnSelectMediaState() {
        return this.unSelectMediaState;
    }

    public final MyMediaModel getUpdateSelectedMediaClipRange() {
        return this.updateSelectedMediaClipRange;
    }

    public final C45569HuX getVideoMediaList() {
        return this.videoMediaList;
    }

    public final boolean isChangeMusicDownloadSuccess() {
        return this.isChangeMusicDownloadSuccess;
    }

    public ChooseMediaState(MediaListState mediaListState, MediaState selectMediaState, MediaState unSelectMediaState, MyMediaModel updateSelectedMediaClipRange, MediaState previewMediaState, PreMusicState preMusicState, PreMusicState preChangeMusicState, PreMusicState lastPreMusicState, OpeningChooseMediaPageState openingChooseMediaPageState, ClosingChooseMediaPageState closingChooseMediaPageState, C45569HuX allMediaList, C45569HuX photoMediaList, C45569HuX videoMediaList, boolean z, PreviewDockerState previewDockerState, MediaListState previewDockerInitMediaList, PreviewSwapState previewSwapState, MediaState previewDockerDelMediaState, MediaState previewDockerAddMediaState, MediaState previewNextBtnMediaState, MediaState nextBtnWithDirectUseState, C145425nG c145425nG, PreviewNextBtnState previewNextBtnState, MyMediaModel myMediaModel, C145425nG c145425nG2, boolean z2, RecordPresetResourceState recordPresetResourceState, AlbumToEditPageState albumToEditPageState, MediaState libraryDownloadEvent, MediaState libraryDownloadResultState, MediaState libraryDownloadProgressState, C45575Hud notifyRefreshCoverWhenExitPreviewPage, MediaListState goNextMediaState, C150545vW recordPageExitState, C150545vW notifyCloseRecord) {
        o.LJIIIZ(mediaListState, "mediaListState");
        o.LJIIIZ(selectMediaState, "selectMediaState");
        o.LJIIIZ(unSelectMediaState, "unSelectMediaState");
        o.LJIIIZ(updateSelectedMediaClipRange, "updateSelectedMediaClipRange");
        o.LJIIIZ(previewMediaState, "previewMediaState");
        o.LJIIIZ(preMusicState, "preMusicState");
        o.LJIIIZ(preChangeMusicState, "preChangeMusicState");
        o.LJIIIZ(lastPreMusicState, "lastPreMusicState");
        o.LJIIIZ(openingChooseMediaPageState, "openingChooseMediaPageState");
        o.LJIIIZ(allMediaList, "allMediaList");
        o.LJIIIZ(photoMediaList, "photoMediaList");
        o.LJIIIZ(videoMediaList, "videoMediaList");
        o.LJIIIZ(previewDockerState, "previewDockerState");
        o.LJIIIZ(previewDockerInitMediaList, "previewDockerInitMediaList");
        o.LJIIIZ(previewSwapState, "previewSwapState");
        o.LJIIIZ(previewDockerDelMediaState, "previewDockerDelMediaState");
        o.LJIIIZ(previewDockerAddMediaState, "previewDockerAddMediaState");
        o.LJIIIZ(previewNextBtnMediaState, "previewNextBtnMediaState");
        o.LJIIIZ(nextBtnWithDirectUseState, "nextBtnWithDirectUseState");
        o.LJIIIZ(previewNextBtnState, "previewNextBtnState");
        o.LJIIIZ(recordPresetResourceState, "recordPresetResourceState");
        o.LJIIIZ(albumToEditPageState, "albumToEditPageState");
        o.LJIIIZ(libraryDownloadEvent, "libraryDownloadEvent");
        o.LJIIIZ(libraryDownloadResultState, "libraryDownloadResultState");
        o.LJIIIZ(libraryDownloadProgressState, "libraryDownloadProgressState");
        o.LJIIIZ(notifyRefreshCoverWhenExitPreviewPage, "notifyRefreshCoverWhenExitPreviewPage");
        o.LJIIIZ(goNextMediaState, "goNextMediaState");
        o.LJIIIZ(recordPageExitState, "recordPageExitState");
        o.LJIIIZ(notifyCloseRecord, "notifyCloseRecord");
        this.mediaListState = mediaListState;
        this.selectMediaState = selectMediaState;
        this.unSelectMediaState = unSelectMediaState;
        this.updateSelectedMediaClipRange = updateSelectedMediaClipRange;
        this.previewMediaState = previewMediaState;
        this.preMusicState = preMusicState;
        this.preChangeMusicState = preChangeMusicState;
        this.lastPreMusicState = lastPreMusicState;
        this.openingChooseMediaPageState = openingChooseMediaPageState;
        this.closingChooseMediaPageState = closingChooseMediaPageState;
        this.allMediaList = allMediaList;
        this.photoMediaList = photoMediaList;
        this.videoMediaList = videoMediaList;
        this.isChangeMusicDownloadSuccess = z;
        this.previewDockerState = previewDockerState;
        this.previewDockerInitMediaList = previewDockerInitMediaList;
        this.previewSwapState = previewSwapState;
        this.previewDockerDelMediaState = previewDockerDelMediaState;
        this.previewDockerAddMediaState = previewDockerAddMediaState;
        this.previewNextBtnMediaState = previewNextBtnMediaState;
        this.nextBtnWithDirectUseState = nextBtnWithDirectUseState;
        this.previewNextBtnClickState = c145425nG;
        this.previewNextBtnState = previewNextBtnState;
        this.previewAutoCutBtnClickState = myMediaModel;
        this.dockerHasShown = c145425nG2;
        this.albumViewFullShow = z2;
        this.recordPresetResourceState = recordPresetResourceState;
        this.albumToEditPageState = albumToEditPageState;
        this.libraryDownloadEvent = libraryDownloadEvent;
        this.libraryDownloadResultState = libraryDownloadResultState;
        this.libraryDownloadProgressState = libraryDownloadProgressState;
        this.notifyRefreshCoverWhenExitPreviewPage = notifyRefreshCoverWhenExitPreviewPage;
        this.goNextMediaState = goNextMediaState;
        this.recordPageExitState = recordPageExitState;
        this.notifyCloseRecord = notifyCloseRecord;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChooseMediaState(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r58, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r59, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r60, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r61, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r62, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreMusicState r63, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreMusicState r64, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreMusicState r65, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState r66, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState r67, X.C45569HuX r68, X.C45569HuX r69, X.C45569HuX r70, boolean r71, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewDockerState r72, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r73, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewSwapState r74, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r75, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r76, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r77, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r78, X.C145425nG r79, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewNextBtnState r80, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r81, X.C145425nG r82, boolean r83, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.RecordPresetResourceState r84, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AlbumToEditPageState r85, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r86, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r87, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r88, X.C45575Hud r89, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r90, X.C150545vW r91, X.C150545vW r92, int r93, int r94, kotlin.jvm.internal.DefaultConstructorMarker r95) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState.<init>(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreMusicState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreMusicState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreMusicState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState, X.HuX, X.HuX, X.HuX, boolean, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewDockerState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewSwapState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, X.5nG, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewNextBtnState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel, X.5nG, boolean, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.RecordPresetResourceState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AlbumToEditPageState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState, X.Hud, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState, X.5vW, X.5vW, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
