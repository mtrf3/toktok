package X;

import com.bytedance.pns.psi.PsiEncrypt;

/* renamed from: X.ELx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36285ELx extends AbstractC65781Prl implements InterfaceC65784Pro<byte[]> {
    public static final C36285ELx LJLIL = new C36285ELx();

    public C36285ELx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final byte[] invoke() {
        return PsiEncrypt.LIZ.createNewKey();
    }
}
