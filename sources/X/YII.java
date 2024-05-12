package X;

/* loaded from: classes16.dex */
public class YII {
    public volatile YIH LIZ;
    public volatile AbstractC87134YHq LIZIZ;

    public final int hashCode() {
        return 1;
    }

    public final AbstractC87134YHq LIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        synchronized (this) {
            if (this.LIZIZ != null) {
                return this.LIZIZ;
            }
            if (this.LIZ == null) {
                this.LIZIZ = AbstractC87134YHq.zzb;
            } else {
                this.LIZIZ = this.LIZ.LJ();
            }
            return this.LIZIZ;
        }
    }

    static {
        C68313QrV.LIZ();
    }

    public final void LIZIZ(YIH yih) {
        if (this.LIZ != null) {
            return;
        }
        synchronized (this) {
            if (this.LIZ == null) {
                try {
                    this.LIZ = yih;
                    this.LIZIZ = AbstractC87134YHq.zzb;
                } catch (C87144YIa unused) {
                    this.LIZ = yih;
                    this.LIZIZ = AbstractC87134YHq.zzb;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YII)) {
            return false;
        }
        YII yii = (YII) obj;
        YIH yih = this.LIZ;
        YIH yih2 = yii.LIZ;
        if (yih == null) {
            if (yih2 != null) {
                LIZIZ(yih2.LIZLLL());
                return this.LIZ.equals(yih2);
            }
            return LIZ().equals(yii.LIZ());
        }
        if (yih2 == null) {
            yii.LIZIZ(yih.LIZLLL());
            return yih.equals(yii.LIZ);
        }
        return yih.equals(yih2);
    }
}
