package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes19.dex */
public final class ZU7 implements Callable<Void> {
    public final /* synthetic */ C64797Pbt LJLIL;
    public final /* synthetic */ InterfaceC37276Ek4 LJLILLLLZI;
    public final /* synthetic */ ZUO LJLJI;

    @Override // java.util.concurrent.Callable
    public final Void call() {
        InputStream inputStream;
        try {
            byte[] bArr = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = ((TypedInput) this.LJLIL.LIZIZ).in();
            while (true) {
                try {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("failed reason: ");
                        LIZ.append(th.getCause());
                        LIZ.append(th.getMessage());
                        X1D.LIZIZ(LIZ);
                        C47261Igj.LJIILL("BytebenchV2");
                    } finally {
                        InterfaceC37276Ek4 interfaceC37276Ek4 = this.LJLILLLLZI;
                        if (interfaceC37276Ek4 != null) {
                            interfaceC37276Ek4.cancel();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            this.LJLJI.LJLIL.LIZ(byteArrayOutputStream.toString());
            InterfaceC37276Ek4 interfaceC37276Ek42 = this.LJLILLLLZI;
            if (interfaceC37276Ek42 instanceof InterfaceC37818Eso) {
                ((InterfaceC37818Eso) interfaceC37276Ek42).doCollect();
                C64672PZs c64672PZs = (C64672PZs) this.LJLIL.LIZ.LJFF;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Request log: ");
                LIZ2.append(c64672PZs.LJIL);
                X1D.LIZIZ(LIZ2);
                C47261Igj.LJIILJJIL("BytebenchV2");
            }
            InterfaceC37276Ek4 interfaceC37276Ek43 = this.LJLILLLLZI;
            if (interfaceC37276Ek43 != null) {
                interfaceC37276Ek43.cancel();
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            inputStream.close();
        } catch (Throwable unused2) {
        }
        return null;
    }

    public ZU7(ZUO zuo, C64797Pbt c64797Pbt, InterfaceC37276Ek4 interfaceC37276Ek4) {
        this.LJLJI = zuo;
        this.LJLIL = c64797Pbt;
        this.LJLILLLLZI = interfaceC37276Ek4;
    }
}
