package X;

import android.content.ClipDescription;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.1Ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34761Ya implements InterfaceC20430r9 {
    public final InputContentInfo LIZ;

    @Override // X.InterfaceC20430r9
    public final void LIZ() {
        this.LIZ.requestPermission();
    }

    @Override // X.InterfaceC20430r9
    public final android.net.Uri LIZIZ() {
        return this.LIZ.getContentUri();
    }

    @Override // X.InterfaceC20430r9
    public final android.net.Uri LIZJ() {
        return this.LIZ.getLinkUri();
    }

    @Override // X.InterfaceC20430r9
    public final ClipDescription getDescription() {
        return this.LIZ.getDescription();
    }

    @Override // X.InterfaceC20430r9
    public final Object LIZLLL() {
        return this.LIZ;
    }

    public C34761Ya(Object obj) {
        this.LIZ = (InputContentInfo) obj;
    }

    public C34761Ya(android.net.Uri uri, ClipDescription clipDescription, android.net.Uri uri2) {
        this.LIZ = new InputContentInfo(uri, clipDescription, uri2);
    }
}
