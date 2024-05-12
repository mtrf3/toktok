package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Qtf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68447Qtf extends AbstractBinderC68448Qtg {
    public static final WeakReference<byte[]> LJLJJI = new WeakReference<>(null);
    public WeakReference<byte[]> LJLJI;

    @Override // X.AbstractBinderC68448Qtg
    public final byte[] LLJJIII() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.LJLJI.get();
            if (bArr == null) {
                bArr = LLZZJLIL();
                this.LJLJI = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] LLZZJLIL();

    public AbstractBinderC68447Qtf(byte[] bArr) {
        super(bArr);
        this.LJLJI = LJLJJI;
    }
}
