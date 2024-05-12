package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* renamed from: X.1HZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HZ extends AbstractC06170Mb {
    public final SparseIntArray LIZLLL;
    public final Parcel LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;

    @Override // X.AbstractC06170Mb
    public final C1HZ LIZ() {
        Parcel parcel = this.LJ;
        int dataPosition = parcel.dataPosition();
        int i = this.LJIIIZ;
        if (i == this.LJFF) {
            i = this.LJI;
        }
        StringBuilder LIZ = X1D.LIZ();
        return new C1HZ(parcel, dataPosition, i, JBR.LJFF(LIZ, this.LJII, "  ", LIZ), this.LIZ, this.LIZIZ, this.LIZJ);
    }

    @Override // X.AbstractC06170Mb
    public final boolean LJ() {
        if (this.LJ.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC06170Mb
    public final byte[] LJFF() {
        int readInt = this.LJ.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.LJ.readByteArray(bArr);
        return bArr;
    }

    @Override // X.AbstractC06170Mb
    public final CharSequence LJI() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.LJ);
    }

    @Override // X.AbstractC06170Mb
    public final int LJIIIIZZ() {
        return this.LJ.readInt();
    }

    @Override // X.AbstractC06170Mb
    public final <T extends Parcelable> T LJIIJ() {
        return (T) this.LJ.readParcelable(C1HZ.class.getClassLoader());
    }

    @Override // X.AbstractC06170Mb
    public final String LJIIL() {
        return this.LJ.readString();
    }

    public final void LJJ() {
        int i = this.LJIIIIZZ;
        if (i >= 0) {
            int i2 = this.LIZLLL.get(i);
            int dataPosition = this.LJ.dataPosition();
            this.LJ.setDataPosition(i2);
            this.LJ.writeInt(dataPosition - i2);
            this.LJ.setDataPosition(dataPosition);
        }
    }

    public C1HZ(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1HQ(), new C1HQ(), new C1HQ());
    }

    @Override // X.AbstractC06170Mb
    public final boolean LJII(int i) {
        while (this.LJIIIZ < this.LJI) {
            int i2 = this.LJIIJ;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.LJ.setDataPosition(this.LJIIIZ);
            int readInt = this.LJ.readInt();
            this.LJIIJ = this.LJ.readInt();
            this.LJIIIZ += readInt;
        }
        if (this.LJIIJ == i) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC06170Mb
    public final void LJIILJJIL(int i) {
        LJJ();
        this.LJIIIIZZ = i;
        this.LIZLLL.put(i, this.LJ.dataPosition());
        LJIJ(0);
        LJIJ(i);
    }

    @Override // X.AbstractC06170Mb
    public final void LJIILL(boolean z) {
        this.LJ.writeInt(z ? 1 : 0);
    }

    @Override // X.AbstractC06170Mb
    public final void LJIILLIIL(byte[] bArr) {
        if (bArr != null) {
            this.LJ.writeInt(bArr.length);
            this.LJ.writeByteArray(bArr);
        } else {
            this.LJ.writeInt(-1);
        }
    }

    @Override // X.AbstractC06170Mb
    public final void LJIIZILJ(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.LJ, 0);
    }

    @Override // X.AbstractC06170Mb
    public final void LJIJ(int i) {
        this.LJ.writeInt(i);
    }

    @Override // X.AbstractC06170Mb
    public final void LJIJJ(Parcelable parcelable) {
        this.LJ.writeParcelable(parcelable, 0);
    }

    @Override // X.AbstractC06170Mb
    public final void LJIJJLI(String str) {
        this.LJ.writeString(str);
    }

    public C1HZ(Parcel parcel, int i, int i2, String str, C1HQ<String, Method> c1hq, C1HQ<String, Method> c1hq2, C1HQ<String, Class> c1hq3) {
        super(c1hq, c1hq2, c1hq3);
        this.LIZLLL = new SparseIntArray();
        this.LJIIIIZZ = -1;
        this.LJIIJ = -1;
        this.LJ = parcel;
        this.LJFF = i;
        this.LJI = i2;
        this.LJIIIZ = i;
        this.LJII = str;
    }
}
