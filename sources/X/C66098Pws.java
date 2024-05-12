package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Pws, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66098Pws implements InterfaceC66095Pwp {
    public final C68148Qoq LIZ;

    public C66098Pws(C68148Qoq c68148Qoq) {
        this.LIZ = c68148Qoq;
    }

    public static String LIZIZ(C66106Px0 c66106Px0, String str) {
        int size = c66106Px0.LIZ.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(ListProtector.get(c66106Px0.LIZ, i))) {
                return (String) ListProtector.get(c66106Px0.LIZIZ, i);
            }
        }
        return null;
    }

    @Override // X.InterfaceC66095Pwp
    public final boolean LIZ(C66096Pwq c66096Pwq, C66105Pwz c66105Pwz, C66104Pwy c66104Pwy) {
        if ("websocket".equalsIgnoreCase(LIZIZ(c66105Pwz, "Upgrade")) && "Upgrade".equals(LIZIZ(c66105Pwz, "Connection")) && "13".equals(LIZIZ(c66105Pwz, "Sec-WebSocket-Version"))) {
            c66104Pwy.LIZJ = 101;
            c66104Pwy.LIZLLL = "Switching Protocols";
            c66104Pwy.LIZ("Upgrade", "websocket");
            c66104Pwy.LIZ("Connection", "Upgrade");
            c66104Pwy.LJ = null;
            String LIZIZ = LIZIZ(c66105Pwz, "Sec-WebSocket-Key");
            if (LIZIZ != null) {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZIZ);
                    LIZ.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String LIZIZ2 = X1D.LIZIZ(LIZ);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    try {
                        messageDigest.update(LIZIZ2.getBytes("UTF-8"));
                        c66104Pwy.LIZ("Sec-WebSocket-Accept", Base64.encodeToString(messageDigest.digest(), 2));
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(e2);
                }
            }
            C39718FiM LIZ2 = c66096Pwq.LIZIZ.LIZ();
            OutputStream outputStream = c66096Pwq.LIZ.getOutputStream();
            C66097Pwr.LIZIZ(c66104Pwy, new C66107Px1(new BufferedOutputStream(outputStream)));
            C66099Pwt c66099Pwt = new C66099Pwt(LIZ2, outputStream, this.LIZ);
            if (!c66099Pwt.LIZLLL.getAndSet(true)) {
                ((InterfaceC37628Epk) c66099Pwt.LIZJ.LJLIL).LIZ(c66099Pwt);
            }
            try {
                c66099Pwt.LIZ.LIZ(c66099Pwt.LJFF);
            } catch (EOFException unused) {
                c66099Pwt.LIZIZ();
            } catch (IOException e3) {
                c66099Pwt.LIZIZ();
                throw e3;
            }
            return false;
        }
        c66104Pwy.LIZJ = 501;
        c66104Pwy.LIZLLL = "Not Implemented";
        c66104Pwy.LJ = AbstractC38911fr.LJIILIIL("Not a supported WebSocket upgrade request\n", "text/plain");
        return true;
    }
}
