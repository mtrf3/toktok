package X;

import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* renamed from: X.OQj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61881OQj extends AbstractC61884OQm<Integer> implements RandomAccess {
    public final /* synthetic */ int[] LJLILLLLZI;

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

    public C61881OQj(int[] iArr) {
        this.LJLILLLLZI = iArr;
    }

    @Override // X.OQZ, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return ORY.LJJIJ(((Number) obj).intValue(), this.LJLILLLLZI);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.LJLILLLLZI;
        o.LJIIIZ(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (intValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.LJLILLLLZI;
        o.LJIIIZ(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
