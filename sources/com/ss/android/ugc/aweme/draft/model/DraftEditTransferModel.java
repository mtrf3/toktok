package com.ss.android.ugc.aweme.draft.model;

import X.C1NE;
import X.C279017q;
import X.C41443GOh;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftEditTransferModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<DraftEditTransferModel> CREATOR = new C41443GOh();
    public final String primaryKey;
    public final List<EditVideoSegment> videoSegmentsCopy;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftEditTransferModel copy$default(DraftEditTransferModel draftEditTransferModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftEditTransferModel.primaryKey;
        }
        if ((i & 2) != 0) {
            list = draftEditTransferModel.videoSegmentsCopy;
        }
        return draftEditTransferModel.copy(str, list);
    }

    public final DraftEditTransferModel copy(String str, List<? extends EditVideoSegment> list) {
        return new DraftEditTransferModel(str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftEditTransferModel)) {
            return false;
        }
        DraftEditTransferModel draftEditTransferModel = (DraftEditTransferModel) obj;
        return o.LJ(this.primaryKey, draftEditTransferModel.primaryKey) && o.LJ(this.videoSegmentsCopy, draftEditTransferModel.videoSegmentsCopy);
    }

    public int hashCode() {
        String str = this.primaryKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftEditTransferModel(primaryKey=");
        LIZ.append(this.primaryKey);
        LIZ.append(", videoSegmentsCopy=");
        return C1NE.LIZIZ(LIZ, this.videoSegmentsCopy, ')', LIZ);
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final List<EditVideoSegment> getVideoSegmentsCopy() {
        return this.videoSegmentsCopy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraftEditTransferModel(String str, List<? extends EditVideoSegment> list) {
        this.primaryKey = str;
        this.videoSegmentsCopy = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.primaryKey);
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            out.writeParcelable((Parcelable) LIZIZ.next(), i);
        }
    }

    public /* synthetic */ DraftEditTransferModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
