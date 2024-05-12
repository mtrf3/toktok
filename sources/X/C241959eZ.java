package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9eZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241959eZ extends F9E implements C33Q {
    public final EnumC240989d0 LJLIL;

    public C241959eZ() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C241959eZ(EnumC240989d0 pinnedVideoStatus) {
        o.LJIIIZ(pinnedVideoStatus, "pinnedVideoStatus");
        this.LJLIL = pinnedVideoStatus;
    }

    public /* synthetic */ C241959eZ(int i) {
        this(EnumC240989d0.NOT_ALLOWED_SHOWN);
    }
}
