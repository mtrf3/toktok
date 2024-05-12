package X;

import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: X.Qi8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67732Qi8 {
    public boolean LIZ;
    public String[] LIZIZ;

    public final CredentialRequest LIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new String[0];
        }
        if (this.LIZ || this.LIZIZ.length != 0) {
            return new CredentialRequest(4, this.LIZ, this.LIZIZ, null, null, false, null, null, false);
        }
        throw new IllegalStateException("At least one authentication method must be specified");
    }
}
