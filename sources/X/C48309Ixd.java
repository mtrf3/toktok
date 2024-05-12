package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.Ixd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48309Ixd<T, R> implements InterfaceC48038ItG<PVM, C76800UCe> {
    public final /* synthetic */ C48308Ixc LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C48309Ixd(C48308Ixc c48308Ixc, String str) {
        this.LJLIL = c48308Ixc;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final C76800UCe apply(PVM pvm) {
        PUG LJ;
        PVM it = pvm;
        o.LJIIIZ(it, "it");
        C48308Ixc c48308Ixc = this.LJLIL;
        InputStream byteStream = it.byteStream();
        o.LJIIIIZZ(byteStream, "it.byteStream()");
        String str = this.LJLILLLLZI;
        c48308Ixc.getClass();
        File file = new File(str);
        try {
            LJ = PU7.LJ(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            LJ = PU7.LJ(file);
        }
        LJ.close();
        try {
            if (file.exists()) {
                C16880lQ.LLLZZIL(file);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = byteStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        AnonymousClass636.LJFF(fileOutputStream, null);
                        AnonymousClass636.LJFF(byteStream, null);
                        return C76800UCe.LIZ;
                    }
                }
            } finally {
            }
        } finally {
        }
    }
}
