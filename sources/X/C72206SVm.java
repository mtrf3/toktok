package X;

import Y.ARunnableS18S0110000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SVm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72206SVm implements C7OJ {
    public final /* synthetic */ C72207SVn LIZ;

    public C72206SVm(C72207SVn c72207SVn) {
        this.LIZ = c72207SVn;
    }

    @Override // X.C7OJ
    public final void LIZ(String id, boolean z) {
        o.LJIIIZ(id, "id");
        if (o.LJ(id, this.LIZ.getId())) {
            C72207SVn c72207SVn = this.LIZ;
            c72207SVn.post(new ARunnableS18S0110000_12(c72207SVn, z, 1));
        }
    }
}
