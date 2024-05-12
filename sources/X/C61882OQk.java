package X;

import java.util.RandomAccess;

/* renamed from: X.OQk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61882OQk extends AbstractC61884OQm<Float> implements RandomAccess {
    public final /* synthetic */ float[] LJLILLLLZI;

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

    public C61882OQk(float[] fArr) {
        this.LJLILLLLZI = fArr;
    }

    @Override // X.OQZ, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Float)) {
            return false;
        }
        float floatValue = ((Number) obj).floatValue();
        for (float f : this.LJLILLLLZI) {
            if (Float.floatToIntBits(f) == Float.floatToIntBits(floatValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final Object get(int i) {
        return Float.valueOf(this.LJLILLLLZI[i]);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.LJLILLLLZI;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(floatValue)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.LJLILLLLZI;
        int length = fArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(floatValue)) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
