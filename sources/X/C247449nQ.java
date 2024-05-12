package X;

import android.content.Context;

/* renamed from: X.9nQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247449nQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C247449nQ LJLIL = new C247449nQ();

    public C247449nQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Context LJ;
        boolean z = false;
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null && (LJ = abstractC247499nV.LJ()) != null && KL2.LJIIIZ(LJ) <= 640) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
