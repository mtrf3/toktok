package X;

/* loaded from: classes12.dex */
public class QCF extends ThreadLocal<byte[]> {
    @Override // java.lang.ThreadLocal
    public final byte[] initialValue() {
        return new byte[512];
    }
}
