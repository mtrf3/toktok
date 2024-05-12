package X;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* renamed from: X.5yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152255yH extends AbstractC65781Prl implements InterfaceC88472Yns<FileDescriptor, C76800UCe> {
    public final /* synthetic */ byte[] LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152255yH(byte[] bArr) {
        super(1);
        this.LJLIL = bArr;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(FileDescriptor fileDescriptor) {
        FileDescriptor fileDescriptor2 = fileDescriptor;
        if (fileDescriptor2 != null) {
            byte[] bArr = this.LJLIL;
            FileInputStream fileInputStream = new FileInputStream(fileDescriptor2);
            try {
                fileInputStream.read(bArr);
                AnonymousClass636.LJFF(fileInputStream, null);
            } finally {
            }
        }
        return C76800UCe.LIZ;
    }
}
