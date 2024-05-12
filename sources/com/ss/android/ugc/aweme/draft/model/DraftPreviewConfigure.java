package com.ss.android.ugc.aweme.draft.model;

import X.AnonymousClass391;
import X.C47959Irz;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class DraftPreviewConfigure {

    @InterfaceC65349Pkn("draftDir")
    public String draftDir;

    @InterfaceC65349Pkn("fps")
    public int mFps;

    @InterfaceC65349Pkn("volume")
    public float mVolume;

    @InterfaceC65349Pkn("preview_height")
    public int previewHeight;

    @InterfaceC65349Pkn("preview_width")
    public int previewWidth;

    @InterfaceC65349Pkn("scene_in")
    public int sceneIn;

    @InterfaceC65349Pkn("scene_out")
    public int sceneOut;

    @InterfaceC65349Pkn("video_segment_list")
    public List<DraftVideoSegment> videoSegments;

    public DraftPreviewConfigure() {
        this(0, 0, null, 0.0f, 0, 0, 0, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftPreviewConfigure)) {
            return false;
        }
        DraftPreviewConfigure draftPreviewConfigure = (DraftPreviewConfigure) obj;
        return this.previewWidth == draftPreviewConfigure.previewWidth && this.previewHeight == draftPreviewConfigure.previewHeight && o.LJ(this.videoSegments, draftPreviewConfigure.videoSegments) && Float.compare(this.mVolume, draftPreviewConfigure.mVolume) == 0 && this.mFps == draftPreviewConfigure.mFps && this.sceneIn == draftPreviewConfigure.sceneIn && this.sceneOut == draftPreviewConfigure.sceneOut && o.LJ(this.draftDir, draftPreviewConfigure.draftDir);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = (((((C47959Irz.LIZIZ(this.mVolume, AnonymousClass391.LIZIZ(this.videoSegments, ((this.previewWidth * 31) + this.previewHeight) * 31, 31), 31) + this.mFps) * 31) + this.sceneIn) * 31) + this.sceneOut) * 31;
        String str = this.draftDir;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftPreviewConfigure(previewWidth=");
        LIZ.append(this.previewWidth);
        LIZ.append(", previewHeight=");
        LIZ.append(this.previewHeight);
        LIZ.append(", videoSegments=");
        LIZ.append(this.videoSegments);
        LIZ.append(", mVolume=");
        LIZ.append(this.mVolume);
        LIZ.append(", mFps=");
        LIZ.append(this.mFps);
        LIZ.append(", sceneIn=");
        LIZ.append(this.sceneIn);
        LIZ.append(", sceneOut=");
        LIZ.append(this.sceneOut);
        LIZ.append(", draftDir=");
        return q.LIZIZ(LIZ, this.draftDir, ')', LIZ);
    }

    public DraftPreviewConfigure(int i, int i2, List<DraftVideoSegment> videoSegments, float f, int i3, int i4, int i5, String str) {
        o.LJIIIZ(videoSegments, "videoSegments");
        this.previewWidth = i;
        this.previewHeight = i2;
        this.videoSegments = videoSegments;
        this.mVolume = f;
        this.mFps = i3;
        this.sceneIn = i4;
        this.sceneOut = i5;
        this.draftDir = str;
    }

    public DraftPreviewConfigure(int i, int i2, List list, float f, int i3, int i4, int i5, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 576 : i, (i6 & 2) != 0 ? 1024 : i2, (i6 & 4) != 0 ? C61878OQg.INSTANCE : list, (i6 & 8) != 0 ? 0.0f : f, (i6 & 16) != 0 ? -1 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) == 0 ? i5 : 0, (i6 & 128) != 0 ? null : str);
    }
}
