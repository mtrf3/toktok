package com.ss.android.ugc.aweme.creative.model.publish;

import X.C41338GKg;
import X.C61878OQg;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PostPageModel implements Parcelable {
    public static final Parcelable.Creator<PostPageModel> CREATOR = new C41338GKg();

    @InterfaceC65349Pkn("caption")
    public CaptionModel captionModel;

    @GPV
    public int ccNotAllowDirectPost;

    @GPV
    public long clickCover;

    @GPV
    public String coverEnterFrom;

    @InterfaceC65349Pkn("is_direct_publish_by_cc")
    public boolean isDirectPublishByCC;

    @GPV
    public boolean isEnterFromEPDirectly;

    @InterfaceC65349Pkn("is_from_cc")
    public int isFromCC;

    @GPV
    public boolean isUpload;

    @GPV
    public String markupCaption;

    @GPV
    public List<AVTextExtraStruct> markupExtra;

    @GPV
    public int musicRecType;

    @GPV
    public String previewEnterFrom;

    @GPV
    public boolean publishSettingApplied;

    @GPV
    public List<AVTextExtraStruct> transientExtra;

    @GPV
    public String uploadItemType;

    public PostPageModel() {
        this(null, null, null, null, false, 0, 0, false, 0L, null, false, null, 0, null, false, 32767, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.markupCaption);
        Iterator LIZJ = UC7.LIZJ(this.markupExtra, out);
        while (LIZJ.hasNext()) {
            ((AVTextExtraStruct) LIZJ.next()).writeToParcel(out, i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.transientExtra, out);
        while (LIZJ2.hasNext()) {
            ((AVTextExtraStruct) LIZJ2.next()).writeToParcel(out, i);
        }
        this.captionModel.writeToParcel(out, i);
        out.writeInt(this.isDirectPublishByCC ? 1 : 0);
        out.writeInt(this.isFromCC);
        out.writeInt(this.ccNotAllowDirectPost);
        out.writeInt(this.publishSettingApplied ? 1 : 0);
        out.writeLong(this.clickCover);
        out.writeString(this.coverEnterFrom);
        out.writeInt(this.isUpload ? 1 : 0);
        out.writeString(this.uploadItemType);
        out.writeInt(this.musicRecType);
        out.writeString(this.previewEnterFrom);
        out.writeInt(this.isEnterFromEPDirectly ? 1 : 0);
    }

    public PostPageModel(String str, List<AVTextExtraStruct> markupExtra, List<AVTextExtraStruct> transientExtra, CaptionModel captionModel, boolean z, int i, int i2, boolean z2, long j, String coverEnterFrom, boolean z3, String str2, int i3, String previewEnterFrom, boolean z4) {
        o.LJIIIZ(markupExtra, "markupExtra");
        o.LJIIIZ(transientExtra, "transientExtra");
        o.LJIIIZ(captionModel, "captionModel");
        o.LJIIIZ(coverEnterFrom, "coverEnterFrom");
        o.LJIIIZ(previewEnterFrom, "previewEnterFrom");
        this.markupCaption = str;
        this.markupExtra = markupExtra;
        this.transientExtra = transientExtra;
        this.captionModel = captionModel;
        this.isDirectPublishByCC = z;
        this.isFromCC = i;
        this.ccNotAllowDirectPost = i2;
        this.publishSettingApplied = z2;
        this.clickCover = j;
        this.coverEnterFrom = coverEnterFrom;
        this.isUpload = z3;
        this.uploadItemType = str2;
        this.musicRecType = i3;
        this.previewEnterFrom = previewEnterFrom;
        this.isEnterFromEPDirectly = z4;
    }

    public PostPageModel(String str, List list, List list2, CaptionModel captionModel, boolean z, int i, int i2, boolean z2, long j, String str2, boolean z3, String str3, int i3, String str4, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? C61878OQg.INSTANCE : list, (i4 & 4) != 0 ? C61878OQg.INSTANCE : list2, (i4 & 8) != 0 ? new CaptionModel(null, null, null, false, 15, null) : captionModel, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? false : z2, (i4 & 256) != 0 ? 0L : j, (i4 & 512) != 0 ? "" : str2, (i4 & 1024) != 0 ? false : z3, (i4 & 2048) != 0 ? "" : str3, (i4 & 4096) != 0 ? -1 : i3, (i4 & FileUtils.BUFFER_SIZE) == 0 ? str4 : "", (i4 & 16384) != 0 ? false : z4);
    }
}
