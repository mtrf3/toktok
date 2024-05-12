package X;

import android.media.ExifInterface;
import java.io.FileDescriptor;

/* renamed from: X.5yI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152265yI extends AbstractC65781Prl implements InterfaceC88472Yns<FileDescriptor, C76800UCe> {
    public final /* synthetic */ C68322mC<ExifInterface> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152265yI(C68322mC<ExifInterface> c68322mC) {
        super(1);
        this.LJLIL = c68322mC;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.media.ExifInterface] */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(FileDescriptor fileDescriptor) {
        FileDescriptor fileDescriptor2 = fileDescriptor;
        if (fileDescriptor2 != null) {
            this.LJLIL.element = new ExifInterface(fileDescriptor2);
        }
        return C76800UCe.LIZ;
    }
}
