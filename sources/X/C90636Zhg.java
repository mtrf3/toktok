package X;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Zhg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90636Zhg implements InterfaceC90481ZfB {
    public final /* synthetic */ AbstractC90875ZlX LIZ;

    public C90636Zhg(AbstractC90875ZlX abstractC90875ZlX) {
        this.LIZ = abstractC90875ZlX;
    }

    @Override // X.InterfaceC90481ZfB
    public final void LIZ(long j) {
        try {
            this.LIZ.LIZ(new C90874ZlW(new Status(2103, null, null)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // X.InterfaceC90481ZfB
    public final void LIZIZ(long j, int i, Object obj) {
        MediaError mediaError = null;
        if (true != (obj instanceof C90479Zf9)) {
            obj = null;
        }
        try {
            AbstractC90875ZlX abstractC90875ZlX = this.LIZ;
            Status status = new Status(i, null, null);
            if (obj != null) {
                mediaError = ((C90479Zf9) obj).LIZ;
            }
            abstractC90875ZlX.LIZ(new C90876ZlY(status, mediaError));
        } catch (IllegalStateException unused) {
        }
    }
}
