package X;

import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* renamed from: X.OQz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61897OQz extends AbstractC61884OQm<Byte> implements RandomAccess {
    public final /* synthetic */ byte[] LJLILLLLZI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLILLLLZI.length;
    }

    @Override // X.OQZ, java.util.Collection
    public final boolean isEmpty() {
        if (this.LJLILLLLZI.length == 0) {
            return true;
        }
        return false;
    }

    public C61897OQz(byte[] bArr) {
        this.LJLILLLLZI = bArr;
    }

    @Override // X.OQZ, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Byte)) {
            return false;
        }
        byte byteValue = ((Number) obj).byteValue();
        byte[] bArr = this.LJLILLLLZI;
        o.LJIIIZ(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (byteValue == bArr[i]) {
                if (i < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final Object get(int i) {
        return Byte.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        byte byteValue = ((Number) obj).byteValue();
        byte[] bArr = this.LJLILLLLZI;
        o.LJIIIZ(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (byteValue == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        byte byteValue = ((Number) obj).byteValue();
        byte[] bArr = this.LJLILLLLZI;
        o.LJIIIZ(bArr, "<this>");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (byteValue == bArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
