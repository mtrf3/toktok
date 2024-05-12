package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ux3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78849Ux3 extends C0M6<String, byte[]> {
    public C78849Ux3(int i) {
        super(i);
    }

    @Override // X.C0M6
    public final int LJI(String key, byte[] bArr) {
        byte[] value = bArr;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        return value.length;
    }
}
