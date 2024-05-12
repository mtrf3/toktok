package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ici, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47012Ici extends AbstractC65781Prl implements InterfaceC88472Yns<C47007Icd, Boolean> {
    public static final C47012Ici LJLIL = new C47012Ici();

    public C47012Ici() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C47007Icd c47007Icd) {
        boolean z;
        C47007Icd it = c47007Icd;
        o.LJIIIZ(it, "it");
        IZL izl = it.LJFF.LIZIZ;
        if (izl != null) {
            z = izl.LJJJLZIJ();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
