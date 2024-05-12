package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import X.C42138GgI;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditAdjustClipsState implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditAdjustClipsState> CREATOR = new C42138GgI();

    @InterfaceC65349Pkn(alternate = {"a"}, value = "lastEditBoundary")
    public final OSZ<Long, Long> lastEditBoundary;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "viewBoundary")
    public final OSZ<Long, Long> viewBoundary;

    /* JADX WARN: Multi-variable type inference failed */
    public EditAdjustClipsState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditAdjustClipsState copy$default(EditAdjustClipsState editAdjustClipsState, OSZ osz, OSZ osz2, int i, Object obj) {
        if ((i & 1) != 0) {
            osz = editAdjustClipsState.lastEditBoundary;
        }
        if ((i & 2) != 0) {
            osz2 = editAdjustClipsState.viewBoundary;
        }
        return editAdjustClipsState.copy(osz, osz2);
    }

    public final EditAdjustClipsState copy(OSZ<Long, Long> osz, OSZ<Long, Long> osz2) {
        return new EditAdjustClipsState(osz, osz2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAdjustClipsState)) {
            return false;
        }
        EditAdjustClipsState editAdjustClipsState = (EditAdjustClipsState) obj;
        return o.LJ(this.lastEditBoundary, editAdjustClipsState.lastEditBoundary) && o.LJ(this.viewBoundary, editAdjustClipsState.viewBoundary);
    }

    public int hashCode() {
        OSZ<Long, Long> osz = this.lastEditBoundary;
        int hashCode = (osz == null ? 0 : osz.hashCode()) * 31;
        OSZ<Long, Long> osz2 = this.viewBoundary;
        return hashCode + (osz2 != null ? osz2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAdjustClipsState(lastEditBoundary=");
        LIZ.append(this.lastEditBoundary);
        LIZ.append(", viewBoundary=");
        LIZ.append(this.viewBoundary);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeSerializable(this.lastEditBoundary);
        out.writeSerializable(this.viewBoundary);
    }

    public final OSZ<Long, Long> getLastEditBoundary() {
        return this.lastEditBoundary;
    }

    public final OSZ<Long, Long> getViewBoundary() {
        return this.viewBoundary;
    }

    public EditAdjustClipsState(OSZ<Long, Long> osz, OSZ<Long, Long> osz2) {
        this.lastEditBoundary = osz;
        this.viewBoundary = osz2;
    }

    public /* synthetic */ EditAdjustClipsState(OSZ osz, OSZ osz2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : osz, (i & 2) != 0 ? null : osz2);
    }
}
