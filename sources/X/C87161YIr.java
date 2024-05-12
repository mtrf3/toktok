package X;

/* renamed from: X.YIr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87161YIr implements YIV {
    public final YIH LIZ;
    public final YJH LIZIZ;
    public final boolean LIZJ;
    public final AbstractC87178YJi LIZLLL;

    @Override // X.YIV
    public final Object LJ() {
        return this.LIZ.LIZIZ().LJIIIZ();
    }

    @Override // X.YIV
    public final int LIZ(Object obj) {
        int hashCode = this.LIZIZ.LIZJ(obj).hashCode();
        if (!this.LIZJ) {
            return hashCode;
        }
        this.LIZLLL.LIZ(obj);
        throw null;
    }

    @Override // X.YIV
    public final void LIZIZ(Object obj) {
        this.LIZIZ.LJI(obj);
        this.LIZLLL.LIZIZ(obj);
    }

    @Override // X.YIV
    public final int LIZJ(Object obj) {
        YJH yjh = this.LIZIZ;
        int LIZIZ = yjh.LIZIZ(yjh.LIZJ(obj));
        if (!this.LIZJ) {
            return LIZIZ;
        }
        this.LIZLLL.LIZ(obj);
        throw null;
    }

    @Override // X.YIV
    public final boolean LJIIIIZZ(Object obj) {
        this.LIZLLL.LIZ(obj);
        throw null;
    }

    @Override // X.YIV
    public final void LIZLLL(Object obj, Object obj2) {
        YJH yjh = this.LIZIZ;
        yjh.LJII(obj, yjh.LIZLLL(yjh.LIZJ(obj), yjh.LIZJ(obj2)));
        if (!this.LIZJ) {
            return;
        }
        this.LIZLLL.LIZ(obj2);
        throw null;
    }

    @Override // X.YIV
    public final boolean LJFF(Object obj, Object obj2) {
        if (!this.LIZIZ.LIZJ(obj).equals(this.LIZIZ.LIZJ(obj2))) {
            return false;
        }
        if (!this.LIZJ) {
            return true;
        }
        this.LIZLLL.LIZ(obj);
        this.LIZLLL.LIZ(obj2);
        throw null;
    }

    @Override // X.YIV
    public final void LJI(Object obj, C87149YIf c87149YIf) {
        this.LIZLLL.LIZ(obj);
        throw null;
    }

    public C87161YIr(YJH yjh, AbstractC87178YJi abstractC87178YJi, YIH yih) {
        this.LIZIZ = yjh;
        this.LIZJ = abstractC87178YJi.LIZJ(yih);
        this.LIZLLL = abstractC87178YJi;
        this.LIZ = yih;
    }

    @Override // X.YIV
    public final void LJII(Object obj, byte[] bArr, int i, int i2, C87175YJf c87175YJf) {
        YIN yin = (YIN) obj;
        if (yin.zzc == C87157YIn.LJFF) {
            yin.zzc = C87157YIn.LIZIZ();
        }
        throw null;
    }
}
