package com.ss.android.ugc.aweme.i18n.musically.cut;

import X.GMK;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AvatarCutActivityArgs implements IRouteArg {
    public static final Parcelable.Creator<AvatarCutActivityArgs> CREATOR = new GMK();
    public String filePath;

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarCutActivityArgs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static AvatarCutActivityArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("file_path")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("file_path"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        return new AvatarCutActivityArgs(str, i, defaultConstructorMarker);
    }

    public static /* synthetic */ AvatarCutActivityArgs copy$default(AvatarCutActivityArgs avatarCutActivityArgs, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarCutActivityArgs.filePath;
        }
        return avatarCutActivityArgs.copy(str);
    }

    public final AvatarCutActivityArgs copy(String str) {
        return new AvatarCutActivityArgs(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarCutActivityArgs) && o.LJ(this.filePath, ((AvatarCutActivityArgs) obj).filePath);
    }

    public int hashCode() {
        String str = this.filePath;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.filePath);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarCutActivityArgs(filePath=");
        return q.LIZIZ(LIZ, this.filePath, ')', LIZ);
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public AvatarCutActivityArgs(String str) {
        this.filePath = str;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public /* synthetic */ AvatarCutActivityArgs(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
