package X;

/* renamed from: X.1HP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HP extends C0M9<Object, Object> {
    public final /* synthetic */ C1HQ LIZLLL;

    @Override // X.C0M9
    public final void LIZ() {
        this.LIZLLL.clear();
    }

    @Override // X.C0M9
    public final int LIZLLL() {
        return this.LIZLLL.LJLJI;
    }

    @Override // X.C0M9
    public final java.util.Map<Object, Object> LIZJ() {
        return this.LIZLLL;
    }

    public C1HP(C1HQ c1hq) {
        this.LIZLLL = c1hq;
    }

    @Override // X.C0M9
    public final int LJ(Object obj) {
        return this.LIZLLL.LJ(obj);
    }

    @Override // X.C0M9
    public final int LJFF(Object obj) {
        return this.LIZLLL.LJII(obj);
    }

    @Override // X.C0M9
    public final void LJII(int i) {
        this.LIZLLL.LJIIIZ(i);
    }

    @Override // X.C0M9
    public final Object LIZIZ(int i, int i2) {
        return this.LIZLLL.LJLILLLLZI[(i << 1) + i2];
    }

    @Override // X.C0M9
    public final void LJI(Object obj, Object obj2) {
        this.LIZLLL.put(obj, obj2);
    }

    @Override // X.C0M9
    public final Object LJIIIIZZ(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.LIZLLL.LJLILLLLZI;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
