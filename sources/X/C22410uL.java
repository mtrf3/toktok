package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0uL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22410uL {
    public final List<AbstractC22370uH> LIZ;

    public C22410uL() {
        throw null;
    }

    public C22410uL(List credentialOptions) {
        o.LJIIIZ(credentialOptions, "credentialOptions");
        this.LIZ = credentialOptions;
        if (!credentialOptions.isEmpty()) {
            return;
        }
        "credentialOptions should not be empty".toString();
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }
}
