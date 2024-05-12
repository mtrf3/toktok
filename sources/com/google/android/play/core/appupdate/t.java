package com.google.android.play.core.appupdate;

/* loaded from: classes7.dex */
public final class t extends d {
    public final int LIZ;
    public final boolean LIZIZ;

    public /* synthetic */ t(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final int LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.LIZ == dVar.LIZIZ() && this.LIZIZ == dVar.LIZ()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.LIZ ^ 1000003) * 1000003) ^ (true != this.LIZIZ ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.LIZ;
        boolean z = this.LIZIZ;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
