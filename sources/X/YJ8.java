package X;

/* loaded from: classes16.dex */
public final class YJ8 {
    public final AbstractC87156YIm LIZ;

    public YJ8(AbstractC87156YIm abstractC87156YIm) {
        if (abstractC87156YIm != null) {
            this.LIZ = abstractC87156YIm;
            abstractC87156YIm.LIZ = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void LIZ(int i, AbstractC87141YHx abstractC87141YHx) {
        this.LIZ.LIZIZ(i, abstractC87141YHx);
    }

    public final void LIZJ(int i, Object obj) {
        if (obj instanceof AbstractC87141YHx) {
            this.LIZ.LJIIIIZZ(i, (AbstractC87141YHx) obj);
        } else {
            this.LIZ.LJIIIZ(i, (YIZ) obj);
        }
    }

    public final void LIZIZ(int i, YIU yiu, Object obj) {
        AbstractC87156YIm abstractC87156YIm = this.LIZ;
        abstractC87156YIm.LJJIIJZLJL(i, 3);
        yiu.LJIIIZ(obj, abstractC87156YIm.LIZ);
        abstractC87156YIm.LJJIIJZLJL(i, 4);
    }
}
