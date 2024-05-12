package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ulg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78144Ulg implements VC8 {
    public final /* synthetic */ C78140Ulc LIZ;

    @Override // X.VC8
    public final void LIZ(String reason) {
        o.LJIIIZ(reason, "reason");
    }

    @Override // X.VC8
    public final boolean isMute() {
        if (this.LIZ.LJZI != EnumC78141Uld.CLOSED) {
            return true;
        }
        return false;
    }

    public C78144Ulg(C78140Ulc c78140Ulc) {
        this.LIZ = c78140Ulc;
    }
}
