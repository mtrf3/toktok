package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Siy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72880Siy extends AbstractC65781Prl implements InterfaceC88472Yns<C72879Six, C72879Six> {
    public static final C72880Siy LJLIL = new C72880Siy();

    public C72880Siy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C72879Six invoke(C72879Six c72879Six) {
        boolean z;
        C72879Six setSearchStatus = c72879Six;
        o.LJIIIZ(setSearchStatus, "$this$setSearchStatus");
        if (setSearchStatus.LJLIL.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return C72879Six.L(setSearchStatus, null, false, z, 1);
    }
}
