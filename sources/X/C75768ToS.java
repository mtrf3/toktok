package X;

import com.bytedance.android.live.base.model.ImageModel;

/* renamed from: X.ToS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75768ToS {
    public String LIZ;
    public String LIZIZ;
    public final ImageModel LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserInfo(displayId='");
        LIZ.append(this.LIZ);
        LIZ.append("', nickName='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', avatar=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C75768ToS(String str, String str2, ImageModel imageModel) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = imageModel;
    }
}
