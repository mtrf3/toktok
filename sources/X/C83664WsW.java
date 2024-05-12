package X;

/* renamed from: X.WsW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83664WsW implements InterfaceC83878Wvy {
    public boolean LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public InterfaceC83703Wt9 LIZ = new C83789WuX(new C79543VJr());
    public InterfaceC82128WLc LIZIZ = C83735Wtf.LIZ;
    public InterfaceC65784Pro<Boolean> LIZLLL = C83694Wt0.LJLIL;

    @Override // X.InterfaceC83878Wvy
    public final void Q3() {
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableTakePhotoRatioType:");
        LIZ.append(0);
        LIZ.append(", ");
        LIZ.append("enableAudioCapture:");
        LIZ.append(this.LIZJ);
        LIZ.append(", ");
        LIZ.append("forbidOpenCameraInBackground:");
        LIZ.append(this.LIZLLL.invoke().booleanValue());
        LIZ.append(", ");
        LIZ.append("enableSoftEncodeAcc:");
        LIZ.append(this.LJ);
        LIZ.append(", ");
        LIZ.append("enableCloseMicWhenCameraClosed:");
        LIZ.append(this.LJFF);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC83878Wvy
    public final InterfaceC82128WLc H1() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC83878Wvy
    public final boolean LJJIIJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC83878Wvy
    public final InterfaceC83703Wt9 N3() {
        return this.LIZ;
    }

    @Override // X.InterfaceC83878Wvy
    public final boolean O3() {
        return this.LJ;
    }

    @Override // X.InterfaceC83878Wvy
    public final boolean P3() {
        return this.LJFF;
    }

    @Override // X.InterfaceC83878Wvy
    public final InterfaceC65784Pro<Boolean> R3() {
        return this.LIZLLL;
    }
}
