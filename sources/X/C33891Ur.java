package X;

import android.content.ClipData;
import android.view.ContentInfo;

/* renamed from: X.1Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33891Ur implements InterfaceC16180kI {
    public final ContentInfo LIZ;

    @Override // X.InterfaceC16180kI
    public final ClipData LIZ() {
        return this.LIZ.getClip();
    }

    @Override // X.InterfaceC16180kI
    public final int LLLLLLLLL() {
        return this.LIZ.getFlags();
    }

    @Override // X.InterfaceC16180kI
    public final int getSource() {
        return this.LIZ.getSource();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentInfoCompat{");
        LIZ.append(this.LIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC16180kI
    public final ContentInfo LIZIZ() {
        return this.LIZ;
    }

    public C33891Ur(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.LIZ = contentInfo;
    }
}
