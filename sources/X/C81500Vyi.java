package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Vyi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81500Vyi {
    public final AbstractC81511Vyt LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final Effect LJ;
    public final boolean LJFF;
    public final C44243HXz LJI;
    public final C08630Vn<Boolean> LJII;
    public final C08630Vn<C76800UCe> LJIIIIZZ;
    public final C08630Vn<Boolean> LJIIIZ;
    public final C08630Vn<C76800UCe> LJIIJ;
    public final C08630Vn<Integer> LJIIJJI;
    public final C08630Vn<Boolean> LJIIL;
    public final C08630Vn<Boolean> LJIILIIL;

    public C81500Vyi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81500Vyi)) {
            return false;
        }
        C81500Vyi c81500Vyi = (C81500Vyi) obj;
        return o.LJ(this.LIZ, c81500Vyi.LIZ) && this.LIZIZ == c81500Vyi.LIZIZ && this.LIZJ == c81500Vyi.LIZJ && o.LJ(this.LIZLLL, c81500Vyi.LIZLLL) && o.LJ(this.LJ, c81500Vyi.LJ) && this.LJFF == c81500Vyi.LJFF && o.LJ(this.LJI, c81500Vyi.LJI) && o.LJ(this.LJII, c81500Vyi.LJII) && o.LJ(this.LJIIIIZZ, c81500Vyi.LJIIIIZZ) && o.LJ(this.LJIIIZ, c81500Vyi.LJIIIZ) && o.LJ(this.LJIIJ, c81500Vyi.LJIIJ) && o.LJ(this.LJIIJJI, c81500Vyi.LJIIJJI) && o.LJ(this.LJIIL, c81500Vyi.LJIIL) && o.LJ(this.LJIILIIL, c81500Vyi.LJIILIIL);
    }

    public final String toString() {
        return "RecordDuetLayoutUISceneStates(asyncFetchStatus=" + this.LIZ + ", changeDirectionMode=" + this.LIZIZ + ", chosenPosition=" + this.LIZJ + ", toast=" + this.LIZLLL + ", layout=" + this.LJ + ", frontCameraEnable=" + this.LJFF + ", stickerMessage=" + this.LJI + ", enterOrExitAnimationUIEvent=" + this.LJII + ", layoutTopMarginUIEvent=" + this.LJIIIIZZ + ", layoutBottomMarginUIEvent=" + this.LJIIIZ + ", exitDuetModeUIEvent=" + this.LJIIJ + ", restoreDuetLayoutUIEvent=" + this.LJIIJJI + ", showLayoutText=" + this.LJIIL + ", showLayout=" + this.LJIILIIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int LJ = C79062V1e.LJ(this.LIZLLL, ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31, 31);
        Effect effect = this.LJ;
        int i = 0;
        if (effect == null) {
            hashCode = 0;
        } else {
            hashCode = effect.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        boolean z = this.LJFF;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        C44243HXz c44243HXz = this.LJI;
        if (c44243HXz == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c44243HXz.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        C08630Vn<Boolean> c08630Vn = this.LJII;
        if (c08630Vn == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c08630Vn.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        C08630Vn<C76800UCe> c08630Vn2 = this.LJIIIIZZ;
        if (c08630Vn2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c08630Vn2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        C08630Vn<Boolean> c08630Vn3 = this.LJIIIZ;
        if (c08630Vn3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c08630Vn3.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        C08630Vn<C76800UCe> c08630Vn4 = this.LJIIJ;
        if (c08630Vn4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c08630Vn4.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        C08630Vn<Integer> c08630Vn5 = this.LJIIJJI;
        if (c08630Vn5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c08630Vn5.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        C08630Vn<Boolean> c08630Vn6 = this.LJIIL;
        if (c08630Vn6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c08630Vn6.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        C08630Vn<Boolean> c08630Vn7 = this.LJIILIIL;
        if (c08630Vn7 != null) {
            i = c08630Vn7.hashCode();
        }
        return i11 + i;
    }

    public /* synthetic */ C81500Vyi(int i) {
        this(C81504Vym.LIZ, 0, 0, "", null, false, null, null, null, null, null, null, null, null);
    }

    public C81500Vyi(AbstractC81511Vyt asyncFetchStatus, int i, int i2, String toast, Effect effect, boolean z, C44243HXz c44243HXz, C08630Vn<Boolean> c08630Vn, C08630Vn<C76800UCe> c08630Vn2, C08630Vn<Boolean> c08630Vn3, C08630Vn<C76800UCe> c08630Vn4, C08630Vn<Integer> c08630Vn5, C08630Vn<Boolean> c08630Vn6, C08630Vn<Boolean> c08630Vn7) {
        o.LJIIIZ(asyncFetchStatus, "asyncFetchStatus");
        o.LJIIIZ(toast, "toast");
        this.LIZ = asyncFetchStatus;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = toast;
        this.LJ = effect;
        this.LJFF = z;
        this.LJI = c44243HXz;
        this.LJII = c08630Vn;
        this.LJIIIIZZ = c08630Vn2;
        this.LJIIIZ = c08630Vn3;
        this.LJIIJ = c08630Vn4;
        this.LJIIJJI = c08630Vn5;
        this.LJIIL = c08630Vn6;
        this.LJIILIIL = c08630Vn7;
    }

    public static C81500Vyi LIZ(C81500Vyi c81500Vyi, AbstractC81511Vyt abstractC81511Vyt, int i, int i2, String str, Effect effect, boolean z, C44243HXz c44243HXz, C08630Vn c08630Vn, C08630Vn c08630Vn2, C08630Vn c08630Vn3, C08630Vn c08630Vn4, C08630Vn c08630Vn5, C08630Vn c08630Vn6, C08630Vn c08630Vn7, int i3) {
        C08630Vn c08630Vn8 = c08630Vn7;
        C08630Vn c08630Vn9 = c08630Vn6;
        C08630Vn c08630Vn10 = c08630Vn5;
        C08630Vn c08630Vn11 = c08630Vn4;
        C08630Vn c08630Vn12 = c08630Vn3;
        C08630Vn c08630Vn13 = c08630Vn2;
        C08630Vn c08630Vn14 = c08630Vn;
        C44243HXz c44243HXz2 = c44243HXz;
        int i4 = i;
        AbstractC81511Vyt asyncFetchStatus = abstractC81511Vyt;
        int i5 = i2;
        String toast = str;
        Effect effect2 = effect;
        boolean z2 = z;
        if ((i3 & 1) != 0) {
            asyncFetchStatus = c81500Vyi.LIZ;
        }
        if ((i3 & 2) != 0) {
            i4 = c81500Vyi.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i5 = c81500Vyi.LIZJ;
        }
        if ((i3 & 8) != 0) {
            toast = c81500Vyi.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            effect2 = c81500Vyi.LJ;
        }
        if ((i3 & 32) != 0) {
            z2 = c81500Vyi.LJFF;
        }
        if ((i3 & 64) != 0) {
            c44243HXz2 = c81500Vyi.LJI;
        }
        if ((i3 & 128) != 0) {
            c08630Vn14 = c81500Vyi.LJII;
        }
        if ((i3 & 256) != 0) {
            c08630Vn13 = c81500Vyi.LJIIIIZZ;
        }
        if ((i3 & 512) != 0) {
            c08630Vn12 = c81500Vyi.LJIIIZ;
        }
        if ((i3 & 1024) != 0) {
            c08630Vn11 = c81500Vyi.LJIIJ;
        }
        if ((i3 & 2048) != 0) {
            c08630Vn10 = c81500Vyi.LJIIJJI;
        }
        if ((i3 & 4096) != 0) {
            c08630Vn9 = c81500Vyi.LJIIL;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            c08630Vn8 = c81500Vyi.LJIILIIL;
        }
        c81500Vyi.getClass();
        o.LJIIIZ(asyncFetchStatus, "asyncFetchStatus");
        o.LJIIIZ(toast, "toast");
        return new C81500Vyi(asyncFetchStatus, i4, i5, toast, effect2, z2, c44243HXz2, c08630Vn14, c08630Vn13, c08630Vn12, c08630Vn11, c08630Vn10, c08630Vn9, c08630Vn8);
    }
}
