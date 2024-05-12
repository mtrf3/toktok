package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.Soq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73244Soq extends AbstractC03120Ai {
    public final /* synthetic */ RunnableC73233Sof LIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZ.LJLJI.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.LJLILLLLZI.size();
    }

    public C73244Soq(RunnableC73233Sof runnableC73233Sof) {
        this.LIZ = runnableC73233Sof;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        Object obj = ListProtector.get(this.LIZ.LJLILLLLZI, i);
        Object obj2 = ListProtector.get(this.LIZ.LJLJI, i2);
        if (obj != null) {
            if (obj2 != null) {
                return this.LIZ.LJLIL.LJ.LIZIZ.LIZ(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        Object obj = ListProtector.get(this.LIZ.LJLILLLLZI, i);
        Object obj2 = ListProtector.get(this.LIZ.LJLJI, i2);
        if (obj != null) {
            if (obj2 != null) {
                return this.LIZ.LJLIL.LJ.LIZIZ.LIZIZ(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        Object obj = ListProtector.get(this.LIZ.LJLILLLLZI, i);
        Object obj2 = ListProtector.get(this.LIZ.LJLJI, i2);
        if (obj != null && obj2 != null) {
            return this.LIZ.LJLIL.LJ.LIZIZ.LIZJ(obj, obj2);
        }
        throw new AssertionError();
    }
}
