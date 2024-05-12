package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HTm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44126HTm implements InterfaceC43847HIt {
    public final /* synthetic */ C44125HTl LIZ;

    public C44126HTm(C44125HTl c44125HTl) {
        this.LIZ = c44125HTl;
    }

    @Override // X.InterfaceC43847HIt
    public final boolean LIZ(C46156I9o event) {
        o.LJIIIZ(event, "event");
        String localUrl = this.LIZ.getShortVideoContext().cameraComponentModel.mWorkspace.LJLIL.LLZZJLIL().getAbsolutePath();
        C44125HTl c44125HTl = this.LIZ;
        o.LJIIIIZZ(localUrl, "localUrl");
        c44125HTl.S20(localUrl);
        return true;
    }
}
