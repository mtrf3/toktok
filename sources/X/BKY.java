package X;

import androidx.lifecycle.MutableLiveData;

/* loaded from: classes6.dex */
public final class BKY {
    public static volatile BKY LJFF;
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final MutableLiveData<Boolean> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJ = new MutableLiveData<>();

    public static BKY LIZIZ() {
        if (LJFF == null) {
            synchronized (BKY.class) {
                if (LJFF == null) {
                    LJFF = new BKY();
                }
            }
        }
        return LJFF;
    }

    public final void LIZ() {
        if (!this.LIZ) {
            return;
        }
        this.LIZIZ++;
        LIZLLL();
    }

    public final boolean LIZJ() {
        if (!this.LIZ) {
            return false;
        }
        if (this.LIZIZ == 0 && !this.LIZJ) {
            return false;
        }
        return true;
    }

    public final void LIZLLL() {
        if (this.LIZIZ == 0 && !this.LIZJ) {
            this.LIZLLL.postValue(Boolean.TRUE);
        } else {
            this.LIZLLL.postValue(Boolean.FALSE);
        }
    }

    public final void LJ() {
        if (!this.LIZ) {
            return;
        }
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        if (i < 0) {
            this.LIZIZ = 0;
        }
        if (this.LIZIZ == 0) {
            LIZLLL();
        }
    }

    public final void LJFF(boolean z) {
        if (!this.LIZ) {
            return;
        }
        this.LIZJ = z;
        this.LJ.postValue(Boolean.valueOf(z));
        LIZLLL();
    }
}
