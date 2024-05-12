package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PTn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64511PTn implements InterfaceC64510PTm<String>, InterfaceC64509PTl<String> {
    public final InterfaceC64510PTm<String> LIZ;
    public InterfaceC64509PTl<String> LIZIZ;
    public AnonymousClass636 LIZJ;

    public C64511PTn(InterfaceC64510PTm interfaceC64510PTm) {
        this.LIZ = interfaceC64510PTm;
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZ(C32420Cnw c32420Cnw, int i) {
        InterfaceC64509PTl<String> interfaceC64509PTl = this.LIZIZ;
        if (interfaceC64509PTl != null) {
            interfaceC64509PTl.LIZ(c32420Cnw, i);
        }
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZIZ(C32420Cnw c32420Cnw, C32425Co1 c32425Co1) {
        InterfaceC64509PTl<String> interfaceC64509PTl = this.LIZIZ;
        if (interfaceC64509PTl != null) {
            interfaceC64509PTl.LIZIZ(c32420Cnw, c32425Co1);
        }
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZJ(C32420Cnw request, String str) {
        File file;
        MessageDigest messageDigest;
        String str2 = str;
        if (this.LIZJ != null) {
            o.LJIIIZ(request, "request");
            long nanoTime = System.nanoTime();
            Iterator it = ((CopyOnWriteArrayList) PU0.LJI().LIZJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC64518PTu) it.next()).LIZLLL(nanoTime, request);
            }
        }
        try {
            file = new File(str2);
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            LIZIZ(request, new C32426Co2(C16880lQ.LLLZ("File %1$s md5 error", new Object[]{str2}), e, request, ""));
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, FileUtils.BUFFER_SIZE);
                    if (read <= 0) {
                        break;
                    } else {
                        messageDigest.update(bArr, 0, read);
                    }
                }
                String LIZIZ = C38355F3n.LIZIZ(messageDigest.digest());
                fileInputStream.close();
                if (!request.LJ.equals(LIZIZ)) {
                    LIZIZ(request, new C32426Co2(C16880lQ.LLLZ("File %1$s md5 is not equals", new Object[]{str2}), request, LIZIZ));
                    C16880lQ.LLLZZIL(file);
                    return;
                }
                InterfaceC64509PTl<String> interfaceC64509PTl = this.LIZIZ;
                if (interfaceC64509PTl != null) {
                    interfaceC64509PTl.LIZJ(request, str2);
                }
                if (this.LIZJ != null) {
                    o.LJIIIZ(request, "request");
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
        }
    }

    @Override // X.InterfaceC64510PTm
    public final void LIZLLL(C32420Cnw c32420Cnw, InterfaceC64509PTl<String> interfaceC64509PTl) {
        this.LIZIZ = interfaceC64509PTl;
        this.LIZ.LIZLLL(c32420Cnw, this);
    }
}
