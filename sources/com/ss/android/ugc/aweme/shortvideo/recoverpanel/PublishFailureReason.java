package com.ss.android.ugc.aweme.shortvideo.recoverpanel;

import X.C41367GLj;
import X.C41759GaB;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishFailureReason implements Parcelable {
    public static final Parcelable.Creator<PublishFailureReason> CREATOR = new C41367GLj();
    public final C41759GaB cause;
    public final String errorMsg;
    public final boolean isServerException;
    public final String scene;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishFailureReason)) {
            return false;
        }
        PublishFailureReason publishFailureReason = (PublishFailureReason) obj;
        return o.LJ(this.cause, publishFailureReason.cause) && this.isServerException == publishFailureReason.isServerException && o.LJ(this.scene, publishFailureReason.scene) && o.LJ(this.errorMsg, publishFailureReason.errorMsg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeSerializable(this.cause);
        out.writeInt(this.isServerException ? 1 : 0);
        out.writeString(this.scene);
        out.writeString(this.errorMsg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        C41759GaB c41759GaB = this.cause;
        int i = 0;
        if (c41759GaB == null) {
            hashCode = 0;
        } else {
            hashCode = c41759GaB.hashCode();
        }
        int i2 = hashCode * 31;
        boolean z = this.isServerException;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LJ = C79062V1e.LJ(this.scene, (i2 + i3) * 31, 31);
        String str = this.errorMsg;
        if (str != null) {
            i = str.hashCode();
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishFailureReason(cause=");
        LIZ.append(this.cause);
        LIZ.append(", isServerException=");
        LIZ.append(this.isServerException);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.errorMsg, ')', LIZ);
    }

    public PublishFailureReason(C41759GaB c41759GaB, boolean z, String scene, String str) {
        o.LJIIIZ(scene, "scene");
        this.cause = c41759GaB;
        this.isServerException = z;
        this.scene = scene;
        this.errorMsg = str;
    }
}
