package X;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0kG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16160kG {
    public final InterfaceC16170kH LIZ;

    public C16160kG(final ClipData clipData, final int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.LIZ = new InterfaceC16170kH(clipData, i) { // from class: X.1Up
                public final ContentInfo.Builder LIZ;

                @Override // X.InterfaceC16170kH
                public final C16190kJ build() {
                    return new C16190kJ(new C33891Ur(this.LIZ.build()));
                }

                @Override // X.InterfaceC16170kH
                public final void LIZ(android.net.Uri uri) {
                    this.LIZ.setLinkUri(uri);
                }

                @Override // X.InterfaceC16170kH
                public final void LIZIZ(int i2) {
                    this.LIZ.setFlags(i2);
                }

                @Override // X.InterfaceC16170kH
                public final void setExtras(Bundle bundle) {
                    this.LIZ.setExtras(bundle);
                }

                {
                    this.LIZ = new ContentInfo.Builder(clipData, i);
                }
            };
        } else {
            this.LIZ = new C33881Uq(clipData, i);
        }
    }
}
