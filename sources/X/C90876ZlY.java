package X;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;

/* renamed from: X.ZlY, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90876ZlY implements InterfaceC90638Zhi {
    public final Status LJLIL;
    public final MediaError LJLILLLLZI;

    public C90876ZlY(Status status, MediaError mediaError) {
        this.LJLIL = status;
        this.LJLILLLLZI = mediaError;
    }

    @Override // X.InterfaceC90638Zhi
    public final MediaError LJJJJI() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC67754QiU
    public final Status getStatus() {
        return this.LJLIL;
    }
}
