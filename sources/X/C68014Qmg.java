package X;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qmg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68014Qmg implements InterfaceC68015Qmh {
    public final Status LJLIL;
    public final Credential LJLILLLLZI;

    public C68014Qmg(Status status, Credential credential) {
        this.LJLIL = status;
        this.LJLILLLLZI = credential;
    }

    @Override // X.InterfaceC68015Qmh
    public final Credential LJJJJJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC67754QiU
    public final Status getStatus() {
        return this.LJLIL;
    }
}
