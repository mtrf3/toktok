package X;

import android.content.ClipDescription;
import android.os.Build;

/* renamed from: X.0rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20440rA {
    public final InterfaceC20430r9 LIZ;

    public C20440rA(C34761Ya c34761Ya) {
        this.LIZ = c34761Ya;
    }

    public C20440rA(final android.net.Uri uri, final ClipDescription clipDescription, final android.net.Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.LIZ = new C34761Ya(uri, clipDescription, uri2);
        } else {
            this.LIZ = new InterfaceC20430r9(uri, clipDescription, uri2) { // from class: X.1Yb
                public final android.net.Uri LIZ;
                public final ClipDescription LIZIZ;
                public final android.net.Uri LIZJ;

                @Override // X.InterfaceC20430r9
                public final void LIZ() {
                }

                @Override // X.InterfaceC20430r9
                public final Object LIZLLL() {
                    return null;
                }

                @Override // X.InterfaceC20430r9
                public final android.net.Uri LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC20430r9
                public final android.net.Uri LIZJ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC20430r9
                public final ClipDescription getDescription() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = uri;
                    this.LIZIZ = clipDescription;
                    this.LIZJ = uri2;
                }
            };
        }
    }
}
