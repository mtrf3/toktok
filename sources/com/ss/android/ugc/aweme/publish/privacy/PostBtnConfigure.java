package com.ss.android.ugc.aweme.publish.privacy;

import X.F9E;
import X.G9J;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PostBtnConfigure extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<PostBtnConfigure> CREATOR = new G9J();
    public final String btnText;
    public final boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public PostBtnConfigure() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PostBtnConfigure copy$default(PostBtnConfigure postBtnConfigure, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = postBtnConfigure.enable;
        }
        if ((i & 2) != 0) {
            str = postBtnConfigure.btnText;
        }
        return postBtnConfigure.copy(z, str);
    }

    public final PostBtnConfigure copy(boolean z, String btnText) {
        o.LJIIIZ(btnText, "btnText");
        return new PostBtnConfigure(z, btnText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.btnText};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.enable ? 1 : 0);
        out.writeString(this.btnText);
    }

    public final String getBtnText() {
        return this.btnText;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public PostBtnConfigure(boolean z, String btnText) {
        o.LJIIIZ(btnText, "btnText");
        this.enable = z;
        this.btnText = btnText;
    }

    public /* synthetic */ PostBtnConfigure(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str);
    }
}
