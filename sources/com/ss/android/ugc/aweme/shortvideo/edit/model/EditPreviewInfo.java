package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C165266eA;
import X.C32I;
import X.InterfaceC43620HAa;
import X.ORZ;
import Y.IDCreatorS47S0000000_2;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditPreviewInfo implements Parcelable, Serializable {
    public int calculateHeight;
    public int calculateSourceHeight;
    public int calculateSourceWidth;
    public int calculateWidth;
    public String draftDir;
    public final String initDraftDir;
    public int previewHeight;
    public int previewVideoLength;
    public int previewWidth;

    @InterfaceC43620HAa
    public String[] reverseAudioArray;

    @InterfaceC43620HAa(blockCreative = true)
    public String[] reverseVideoArray;
    public long sceneIn;
    public long sceneOut;

    @InterfaceC43620HAa
    public String[] tempVideoArray;
    public final List<EditVideoSegment> videoList;
    public static final C165266eA Companion = new Object() { // from class: X.6eA
    };
    public static final Parcelable.Creator<EditPreviewInfo> CREATOR = new IDCreatorS47S0000000_2(3);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int[] getTotalVideoHeight() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<EditVideoSegment> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getVideoFileInfo().getHeight()));
        }
        return ORZ.LLJ(arrayList);
    }

    public final int[] getTotalVideoWidth() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<EditVideoSegment> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getVideoFileInfo().getWidth()));
        }
        return ORZ.LLJ(arrayList);
    }

    public final String reverseVideo() {
        String[] strArr = this.reverseVideoArray;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    public final int getCalculateHeight() {
        return this.calculateHeight;
    }

    public final int getCalculateSourceHeight() {
        return this.calculateSourceHeight;
    }

    public final int getCalculateSourceWidth() {
        return this.calculateSourceWidth;
    }

    public final int getCalculateWidth() {
        return this.calculateWidth;
    }

    public final String getDraftDir() {
        return this.draftDir;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewVideoLength() {
        return this.previewVideoLength;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    public final String[] getReverseAudioArray() {
        return this.reverseAudioArray;
    }

    public final String[] getReverseVideoArray() {
        return this.reverseVideoArray;
    }

    public final long getSceneIn() {
        return this.sceneIn;
    }

    public final long getSceneOut() {
        return this.sceneOut;
    }

    public final String[] getTempVideoArray() {
        return this.tempVideoArray;
    }

    public final List<EditVideoSegment> getVideoList() {
        return this.videoList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditPreviewInfo(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            android.os.Parcelable$Creator<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r0 = com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment.CREATOR
            java.util.ArrayList r2 = r11.createTypedArrayList(r0)
            if (r2 == 0) goto L53
        Ld:
            int r3 = r11.readInt()
            int r4 = r11.readInt()
            long r5 = r11.readLong()
            long r7 = r11.readLong()
            java.lang.String r9 = ""
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r7, r9)
            java.lang.String r0 = r11.readString()
            if (r0 == 0) goto L50
        L29:
            r1.draftDir = r0
            int r0 = r11.readInt()
            r1.calculateWidth = r0
            int r0 = r11.readInt()
            r1.calculateHeight = r0
            int r0 = r11.readInt()
            r1.previewVideoLength = r0
            java.lang.String[] r0 = r11.createStringArray()
            r1.reverseVideoArray = r0
            java.lang.String[] r0 = r11.createStringArray()
            r1.reverseAudioArray = r0
            java.lang.String[] r0 = r11.createStringArray()
            r1.tempVideoArray = r0
            return
        L50:
            java.lang.String r0 = ""
            goto L29
        L53:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo.<init>(android.os.Parcel):void");
    }

    public final EditPreviewInfo cloneWithNewVideos(List<EditVideoSegment> newVideoList) {
        o.LJIIIZ(newVideoList, "newVideoList");
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(newVideoList, this.previewWidth, this.previewHeight, this.sceneIn, this.sceneOut, this.draftDir);
        editPreviewInfo.calculateWidth = this.calculateWidth;
        editPreviewInfo.calculateHeight = this.calculateHeight;
        editPreviewInfo.previewVideoLength = this.previewVideoLength;
        editPreviewInfo.reverseVideoArray = this.reverseVideoArray;
        editPreviewInfo.reverseAudioArray = this.reverseAudioArray;
        editPreviewInfo.tempVideoArray = this.tempVideoArray;
        return editPreviewInfo;
    }

    public final void setCalculateHeight(int i) {
        this.calculateHeight = i;
    }

    public final void setCalculateSourceHeight(int i) {
        this.calculateSourceHeight = i;
    }

    public final void setCalculateSourceWidth(int i) {
        this.calculateSourceWidth = i;
    }

    public final void setCalculateWidth(int i) {
        this.calculateWidth = i;
    }

    public final void setDraftDir(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.draftDir = str;
    }

    public final void setPreviewHeight(int i) {
        this.previewHeight = i;
    }

    public final void setPreviewVideoLength(int i) {
        this.previewVideoLength = i;
    }

    public final void setPreviewWidth(int i) {
        this.previewWidth = i;
    }

    public final void setReverseAudioArray(String[] strArr) {
        this.reverseAudioArray = strArr;
    }

    public final void setReverseVideoArray(String[] strArr) {
        this.reverseVideoArray = strArr;
    }

    public final void setSceneIn(long j) {
        this.sceneIn = j;
    }

    public final void setSceneOut(long j) {
        this.sceneOut = j;
    }

    public final void setTempVideoArray(String[] strArr) {
        this.tempVideoArray = strArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeTypedList(this.videoList);
        dest.writeInt(this.previewWidth);
        dest.writeInt(this.previewHeight);
        dest.writeLong(this.sceneIn);
        dest.writeLong(this.sceneOut);
        dest.writeString(this.draftDir);
        dest.writeInt(this.calculateWidth);
        dest.writeInt(this.calculateHeight);
        dest.writeInt(this.previewVideoLength);
        dest.writeStringArray(this.reverseVideoArray);
        dest.writeStringArray(this.reverseAudioArray);
        dest.writeStringArray(this.tempVideoArray);
    }

    public final void updateReverseVideoContent(String[] strArr, String[] strArr2, String[] strArr3) {
        this.reverseVideoArray = strArr;
        this.reverseAudioArray = strArr2;
        this.tempVideoArray = strArr3;
    }

    public EditPreviewInfo(List<EditVideoSegment> videoList, int i, int i2, long j, long j2, String initDraftDir) {
        o.LJIIIZ(videoList, "videoList");
        o.LJIIIZ(initDraftDir, "initDraftDir");
        this.videoList = videoList;
        this.previewWidth = i;
        this.previewHeight = i2;
        this.sceneIn = j;
        this.sceneOut = j2;
        this.initDraftDir = initDraftDir;
        this.draftDir = initDraftDir;
    }

    public /* synthetic */ EditPreviewInfo(List list, int i, int i2, long j, long j2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? -1L : j, (i3 & 16) != 0 ? -1L : j2, str);
    }
}
