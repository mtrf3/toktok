package X;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.CgP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31953CgP implements InterfaceC48038ItG<String, InterfaceC115714gR<Long>> {
    public final /* synthetic */ C31951CgN LJLIL;

    public C31953CgP(C31951CgN c31951CgN) {
        this.LJLIL = c31951CgN;
    }

    @Override // X.InterfaceC48038ItG
    public final InterfaceC115714gR<Long> apply(String str) {
        long j;
        C0EF LIZLLL;
        String str2 = str;
        C31951CgN c31951CgN = this.LJLIL;
        synchronized (c31951CgN) {
            j = 0;
            if (c31951CgN.LIZ != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BufferedInputStream bufferedInputStream = null;
                try {
                    LIZLLL = c31951CgN.LIZ.LIZLLL(str2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                }
                if (LIZLLL == null) {
                    C38891fp.LJIIJJI(byteArrayOutputStream);
                } else {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(LIZLLL.LJLIL[0]);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = bufferedInputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        allocate.put(byteArray);
                        allocate.flip();
                        j = allocate.getLong();
                        C38891fp.LJIIJJI(bufferedInputStream2);
                    } catch (Exception unused2) {
                        bufferedInputStream = bufferedInputStream2;
                        C38891fp.LJIIJJI(bufferedInputStream);
                        C38891fp.LJIIJJI(byteArrayOutputStream);
                        return AbstractC73672Svk.LJJIJIL(Long.valueOf(j));
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        C38891fp.LJIIJJI(bufferedInputStream);
                        C38891fp.LJIIJJI(byteArrayOutputStream);
                        throw th;
                    }
                    C38891fp.LJIIJJI(byteArrayOutputStream);
                }
            }
        }
        return AbstractC73672Svk.LJJIJIL(Long.valueOf(j));
    }
}
