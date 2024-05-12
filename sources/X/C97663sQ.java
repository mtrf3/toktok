package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3sQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97663sQ extends AbstractC03160Am {
    public final /* synthetic */ int LIZ;

    @Override // X.AbstractC03160Am
    public final boolean LIZ(Object obj, Object obj2) {
        switch (this.LIZ) {
            case 0:
                return o.LJ(obj, obj2);
            default:
                EnumC97613sL enumC97613sL = (EnumC97613sL) obj;
                EnumC97613sL enumC97613sL2 = (EnumC97613sL) obj2;
                if (enumC97613sL.getConfig() instanceof AbstractC97583sI) {
                    if (enumC97613sL2.getConfig() instanceof AbstractC97583sI) {
                        return o.LJ(enumC97613sL.getConfig(), enumC97613sL2.getConfig());
                    }
                    "Check failed.".toString();
                    throw new IllegalStateException("Check failed.");
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
        }
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(Object obj, Object obj2) {
        switch (this.LIZ) {
            case 0:
                if (obj == obj2) {
                    return true;
                }
                return false;
            default:
                return o.LJ(((EnumC97613sL) obj).getNoticeCode(), ((EnumC97613sL) obj2).getNoticeCode());
        }
    }
}
