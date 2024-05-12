package com.ss.android.ugc.aweme.creative.model.draft;

import X.C43235Gxz;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.WM7;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftInfoModel implements Parcelable {
    public static final Parcelable.Creator<DraftInfoModel> CREATOR = new C43235Gxz();

    @InterfaceC65349Pkn("draft_aweme_type")
    public int draftAwemeType;

    @InterfaceC65349Pkn("from_draft_popup")
    public boolean fromDraftPopup;

    @GPV
    public boolean isConvertToNormalDraft;

    @GPV
    public boolean isDraft;

    @GPV
    public boolean isPublishedDraft;

    @InterfaceC65349Pkn("is_record_full_screen")
    public boolean isRecordFullScreen;

    @GPV
    public String publishedAwemeId;

    @GPV
    public long publishedTime;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String saveDraftScene;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DraftInfoModel() {
        /*
            r13 = this;
            r1 = 0
            r4 = 0
            r6 = 0
            r11 = 511(0x1ff, float:7.16E-43)
            r0 = r13
            r2 = r1
            r3 = r1
            r7 = r1
            r8 = r1
            r9 = r6
            r10 = r1
            r12 = r6
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isDraft ? 1 : 0);
        out.writeInt(this.fromDraftPopup ? 1 : 0);
        out.writeInt(this.isPublishedDraft ? 1 : 0);
        out.writeLong(this.publishedTime);
        out.writeString(this.publishedAwemeId);
        out.writeInt(this.isConvertToNormalDraft ? 1 : 0);
        out.writeInt(this.isRecordFullScreen ? 1 : 0);
        out.writeString(this.saveDraftScene);
        out.writeInt(this.draftAwemeType);
    }

    public DraftInfoModel(boolean z, boolean z2, boolean z3, long j, String publishedAwemeId, boolean z4, boolean z5, String saveDraftScene, int i) {
        o.LJIIIZ(publishedAwemeId, "publishedAwemeId");
        o.LJIIIZ(saveDraftScene, "saveDraftScene");
        this.isDraft = z;
        this.fromDraftPopup = z2;
        this.isPublishedDraft = z3;
        this.publishedTime = j;
        this.publishedAwemeId = publishedAwemeId;
        this.isConvertToNormalDraft = z4;
        this.isRecordFullScreen = z5;
        this.saveDraftScene = saveDraftScene;
        this.draftAwemeType = i;
    }

    public /* synthetic */ DraftInfoModel(boolean z, boolean z2, boolean z3, long j, String str, boolean z4, boolean z5, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? false : z4, (i2 & 64) == 0 ? z5 : false, (i2 & 128) != 0 ? WM7.SCENE_SERVICE : str2, (i2 & 256) != 0 ? -1 : i);
    }
}
