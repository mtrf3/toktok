package com.ss.android.ugc.aweme.creative.model;

import X.C1FJ;
import X.C279017q;
import X.C41336GKe;
import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditPostModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditPostModel> CREATOR = new C41336GKe();

    @GPV
    @InterfaceC65349Pkn("anchor_text")
    public String anchorText;

    @GPV
    @InterfaceC65349Pkn("anchor_url_model")
    public UrlModel anchorUrlModel;

    @GPV
    @InterfaceC65349Pkn("text_extra")
    public List<AVTextExtraStruct> avTextExtraForBackUp;

    @GPV
    @InterfaceC65349Pkn("aweme_create_time")
    public long awemeCreateTime;

    @GPV
    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;

    @GPV
    @InterfaceC65349Pkn("aweme_type")
    public Integer awemeType;

    @GPV
    @InterfaceC65349Pkn("backup_markup_text")
    public String backupMarkUpText;

    @GPV
    @InterfaceC65349Pkn("edit_post_check_result")
    public EditPostCheckResult editPostCheckResult;

    @GPV
    @InterfaceC65349Pkn("edit_post_permission")
    public EditPostPermission editPostPermission;

    @GPV
    @InterfaceC65349Pkn("images")
    public List<PhotoModeImageUrlModel> imageList;

    @GPV
    @InterfaceC65349Pkn("is_changge_cover")
    public boolean isChangeCover;

    @GPV
    @InterfaceC65349Pkn("is_duet_video")
    public boolean isDuet;

    @GPV
    @InterfaceC65349Pkn("markup_text")
    public String markUpText;

    @GPV
    @InterfaceC65349Pkn("aweme_musci_info")
    public EditCapCutReuseModel.MusicInfo musicInfo;

    @GPV
    @InterfaceC65349Pkn("aweme_music_url_model")
    public UrlModel musicUrlModel;

    @GPV
    @InterfaceC65349Pkn("origin_poi_data")
    public PoiData originPoiData;

    @GPV
    @InterfaceC65349Pkn("video_permission")
    public int permission;

    @GPV
    @InterfaceC65349Pkn("photo_mode_heading")
    public String photoModeHeading;

    @GPV
    @InterfaceC65349Pkn("poi_data")
    public PoiData poiData;

    @GPV
    @InterfaceC65349Pkn("video_cache_model")
    public SimVideoUrlModel videoCacheModel;

    @GPV
    @InterfaceC65349Pkn("compiled_video_canvasHeight")
    public int videoCanvasHeight;

    @GPV
    @InterfaceC65349Pkn("compiled_video_canvasWidth")
    public int videoCanvasWidth;

    @GPV
    @InterfaceC65349Pkn("video_cover_addr")
    public UrlModel videoCoverAddr;

    @GPV
    @InterfaceC65349Pkn("video_play_addr")
    public VideoUrlModel videoPlayAddr;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditPostModel() {
        /*
            r28 = this;
            r1 = 0
            r2 = 0
            r11 = 0
            r26 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r28
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r13 = r2
            r14 = r2
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r2
            r20 = r2
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r27 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.EditPostModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAnchorText() {
        return this.anchorText;
    }

    public final UrlModel getAnchorUrlModel() {
        return this.anchorUrlModel;
    }

    public final List<AVTextExtraStruct> getAvTextExtraForBackUp() {
        return this.avTextExtraForBackUp;
    }

    public final long getAwemeCreateTime() {
        return this.awemeCreateTime;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getAwemeType() {
        return this.awemeType;
    }

    public final String getBackupMarkUpText() {
        return this.backupMarkUpText;
    }

    public final EditPostCheckResult getEditPostCheckResult() {
        return this.editPostCheckResult;
    }

    public final EditPostPermission getEditPostPermission() {
        return this.editPostPermission;
    }

    public final List<PhotoModeImageUrlModel> getImageList() {
        return this.imageList;
    }

    public final String getMarkUpText() {
        return this.markUpText;
    }

    public final EditCapCutReuseModel.MusicInfo getMusicInfo() {
        return this.musicInfo;
    }

    public final UrlModel getMusicUrlModel() {
        return this.musicUrlModel;
    }

    public final PoiData getOriginPoiData() {
        return this.originPoiData;
    }

    public final int getPermission() {
        return this.permission;
    }

    public final String getPhotoModeHeading() {
        return this.photoModeHeading;
    }

    public final PoiData getPoiData() {
        return this.poiData;
    }

    public final SimVideoUrlModel getVideoCacheModel() {
        return this.videoCacheModel;
    }

    public final int getVideoCanvasHeight() {
        return this.videoCanvasHeight;
    }

    public final int getVideoCanvasWidth() {
        return this.videoCanvasWidth;
    }

    public final UrlModel getVideoCoverAddr() {
        return this.videoCoverAddr;
    }

    public final VideoUrlModel getVideoPlayAddr() {
        return this.videoPlayAddr;
    }

    public final boolean isChangeCover() {
        return this.isChangeCover;
    }

    public final boolean isDuet() {
        return this.isDuet;
    }

    public final void setAnchorText(String str) {
        this.anchorText = str;
    }

    public final void setAnchorUrlModel(UrlModel urlModel) {
        this.anchorUrlModel = urlModel;
    }

    public final void setAvTextExtraForBackUp(List<AVTextExtraStruct> list) {
        this.avTextExtraForBackUp = list;
    }

    public final void setAwemeCreateTime(long j) {
        this.awemeCreateTime = j;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setAwemeType(Integer num) {
        this.awemeType = num;
    }

    public final void setBackupMarkUpText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.backupMarkUpText = str;
    }

    public final void setChangeCover(boolean z) {
        this.isChangeCover = z;
    }

    public final void setDuet(boolean z) {
        this.isDuet = z;
    }

    public final void setEditPostCheckResult(EditPostCheckResult editPostCheckResult) {
        this.editPostCheckResult = editPostCheckResult;
    }

    public final void setEditPostPermission(EditPostPermission editPostPermission) {
        this.editPostPermission = editPostPermission;
    }

    public final void setImageList(List<PhotoModeImageUrlModel> list) {
        this.imageList = list;
    }

    public final void setMarkUpText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.markUpText = str;
    }

    public final void setMusicInfo(EditCapCutReuseModel.MusicInfo musicInfo) {
        this.musicInfo = musicInfo;
    }

    public final void setMusicUrlModel(UrlModel urlModel) {
        this.musicUrlModel = urlModel;
    }

    public final void setOriginPoiData(PoiData poiData) {
        this.originPoiData = poiData;
    }

    public final void setPermission(int i) {
        this.permission = i;
    }

    public final void setPhotoModeHeading(String str) {
        this.photoModeHeading = str;
    }

    public final void setPoiData(PoiData poiData) {
        this.poiData = poiData;
    }

    public final void setVideoCacheModel(SimVideoUrlModel simVideoUrlModel) {
        this.videoCacheModel = simVideoUrlModel;
    }

    public final void setVideoCanvasHeight(int i) {
        this.videoCanvasHeight = i;
    }

    public final void setVideoCanvasWidth(int i) {
        this.videoCanvasWidth = i;
    }

    public final void setVideoCoverAddr(UrlModel urlModel) {
        this.videoCoverAddr = urlModel;
    }

    public final void setVideoPlayAddr(VideoUrlModel videoUrlModel) {
        this.videoPlayAddr = videoUrlModel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isDuet ? 1 : 0);
        out.writeSerializable(this.videoPlayAddr);
        out.writeSerializable(this.videoCoverAddr);
        out.writeSerializable(this.videoCacheModel);
        out.writeString(this.markUpText);
        out.writeString(this.backupMarkUpText);
        List<AVTextExtraStruct> list = this.avTextExtraForBackUp;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((AVTextExtraStruct) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.anchorText);
        out.writeSerializable(this.anchorUrlModel);
        EditPostCheckResult editPostCheckResult = this.editPostCheckResult;
        if (editPostCheckResult == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            editPostCheckResult.writeToParcel(out, i);
        }
        out.writeLong(this.awemeCreateTime);
        EditCapCutReuseModel.MusicInfo musicInfo = this.musicInfo;
        if (musicInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            musicInfo.writeToParcel(out, i);
        }
        out.writeSerializable(this.musicUrlModel);
        out.writeInt(this.permission);
        out.writeInt(this.isChangeCover ? 1 : 0);
        out.writeInt(this.videoCanvasWidth);
        out.writeInt(this.videoCanvasHeight);
        out.writeSerializable(this.editPostPermission);
        out.writeSerializable(this.originPoiData);
        out.writeSerializable(this.poiData);
        Integer num = this.awemeType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.awemeId);
        List<PhotoModeImageUrlModel> list2 = this.imageList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ2.next());
            }
        }
        out.writeString(this.photoModeHeading);
    }

    public EditPostModel(boolean z, VideoUrlModel videoUrlModel, UrlModel urlModel, SimVideoUrlModel simVideoUrlModel, String markUpText, String backupMarkUpText, List<AVTextExtraStruct> list, String str, UrlModel urlModel2, EditPostCheckResult editPostCheckResult, long j, EditCapCutReuseModel.MusicInfo musicInfo, UrlModel urlModel3, int i, boolean z2, int i2, int i3, EditPostPermission editPostPermission, PoiData poiData, PoiData poiData2, Integer num, String str2, List<PhotoModeImageUrlModel> list2, String str3) {
        o.LJIIIZ(markUpText, "markUpText");
        o.LJIIIZ(backupMarkUpText, "backupMarkUpText");
        this.isDuet = z;
        this.videoPlayAddr = videoUrlModel;
        this.videoCoverAddr = urlModel;
        this.videoCacheModel = simVideoUrlModel;
        this.markUpText = markUpText;
        this.backupMarkUpText = backupMarkUpText;
        this.avTextExtraForBackUp = list;
        this.anchorText = str;
        this.anchorUrlModel = urlModel2;
        this.editPostCheckResult = editPostCheckResult;
        this.awemeCreateTime = j;
        this.musicInfo = musicInfo;
        this.musicUrlModel = urlModel3;
        this.permission = i;
        this.isChangeCover = z2;
        this.videoCanvasWidth = i2;
        this.videoCanvasHeight = i3;
        this.editPostPermission = editPostPermission;
        this.originPoiData = poiData;
        this.poiData = poiData2;
        this.awemeType = num;
        this.awemeId = str2;
        this.imageList = list2;
        this.photoModeHeading = str3;
    }

    public /* synthetic */ EditPostModel(boolean z, VideoUrlModel videoUrlModel, UrlModel urlModel, SimVideoUrlModel simVideoUrlModel, String str, String str2, List list, String str3, UrlModel urlModel2, EditPostCheckResult editPostCheckResult, long j, EditCapCutReuseModel.MusicInfo musicInfo, UrlModel urlModel3, int i, boolean z2, int i2, int i3, EditPostPermission editPostPermission, PoiData poiData, PoiData poiData2, Integer num, String str4, List list2, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? null : videoUrlModel, (i4 & 4) != 0 ? null : urlModel, (i4 & 8) != 0 ? null : simVideoUrlModel, (i4 & 16) != 0 ? "" : str, (i4 & 32) == 0 ? str2 : "", (i4 & 64) != 0 ? null : list, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? null : urlModel2, (i4 & 512) != 0 ? null : editPostCheckResult, (i4 & 1024) != 0 ? 0L : j, (i4 & 2048) != 0 ? null : musicInfo, (i4 & 4096) != 0 ? null : urlModel3, (i4 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i, (i4 & 16384) != 0 ? false : z2, (32768 & i4) != 0 ? -1 : i2, (65536 & i4) == 0 ? i3 : -1, (131072 & i4) != 0 ? null : editPostPermission, (262144 & i4) != 0 ? null : poiData, (524288 & i4) != 0 ? null : poiData2, (1048576 & i4) != 0 ? null : num, (2097152 & i4) != 0 ? null : str4, (4194304 & i4) != 0 ? null : list2, (i4 & 8388608) != 0 ? null : str5);
    }
}
