package X;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: X.Qtg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68448Qtg extends AbstractBinderC68451Qtj {
    public final int LJLILLLLZI;

    @Override // X.InterfaceC68455Qtn
    public final int LIZIZ() {
        return this.LJLILLLLZI;
    }

    public abstract byte[] LLJJIII();

    public final int hashCode() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC68455Qtn
    public final InterfaceC68163Qp5 LIZLLL() {
        return new BinderC68153Qov(LLJJIII());
    }

    public AbstractBinderC68448Qtg(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        QH7.LIZIZ(z);
        this.LJLILLLLZI = Arrays.hashCode(bArr);
    }

    public static byte[] LLJI(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC68163Qp5 LIZLLL;
        if (obj != null && (obj instanceof InterfaceC68455Qtn)) {
            try {
                InterfaceC68455Qtn interfaceC68455Qtn = (InterfaceC68455Qtn) obj;
                if (interfaceC68455Qtn.LIZIZ() == this.LJLILLLLZI && (LIZLLL = interfaceC68455Qtn.LIZLLL()) != null) {
                    return Arrays.equals(LLJJIII(), (byte[]) BinderC68153Qov.LLJJIII(LIZLLL));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
