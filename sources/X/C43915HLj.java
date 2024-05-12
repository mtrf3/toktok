package X;

import android.graphics.Bitmap;

/* renamed from: X.HLj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43915HLj implements InterfaceC63955P8d {
    public final /* synthetic */ InterfaceC43919HLn<OSZ<Bitmap, Long>> LIZ;
    public final /* synthetic */ long LIZIZ;

    public C43915HLj(C84657XKj c84657XKj, long j) {
        this.LIZ = c84657XKj;
        this.LIZIZ = j;
    }

    @Override // X.InterfaceC63955P8d
    public final void LIZ(int i, Bitmap bitmap) {
        if (!this.LIZ.isCompleted()) {
            this.LIZ.LJ(new OSZ<>(bitmap, Long.valueOf(System.currentTimeMillis() - this.LIZIZ)));
        }
    }
}
