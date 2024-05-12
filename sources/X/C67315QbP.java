package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: X.QbP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67315QbP {
    public static int LJJIII(Parcel parcel) {
        String str;
        int readInt = parcel.readInt();
        int LJJIFFI = LJJIFFI(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new C67308QbI(str, parcel);
        }
        int i = LJJIFFI + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C67308QbI(sb.toString(), parcel);
    }

    public static BigDecimal LIZ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle LIZIZ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return readBundle;
    }

    public static byte[] LIZJ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return createByteArray;
    }

    public static int[] LIZLLL(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return createIntArray;
    }

    public static ArrayList<Integer> LJ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return arrayList;
    }

    public static long[] LJFF(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return createLongArray;
    }

    public static String LJII(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return readString;
    }

    public static String[] LJIIIIZZ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return createStringArray;
    }

    public static ArrayList<String> LJIIIZ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return createStringArrayList;
    }

    public static void LJIIL(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new C67308QbI(sb.toString(), parcel);
    }

    public static boolean LJIILIIL(Parcel parcel, int i) {
        LJJIIJZLJL(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean LJIILJJIL(Parcel parcel, int i) {
        boolean z;
        int LJJIFFI = LJJIFFI(parcel, i);
        if (LJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, LJJIFFI, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static byte LJIILL(Parcel parcel, int i) {
        LJJIIJZLJL(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double LJIILLIIL(Parcel parcel, int i) {
        LJJIIJZLJL(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double LJIIZILJ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        if (LJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, LJJIFFI, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float LJIJ(Parcel parcel, int i) {
        LJJIIJZLJL(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float LJIJI(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        if (LJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, LJJIFFI, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder LJIJJ(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return readStrongBinder;
    }

    public static int LJIJJLI(Parcel parcel, int i) {
        LJJIIJZLJL(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer LJIL(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        if (LJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, LJJIFFI, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long LJJ(Parcel parcel, int i) {
        LJJIIJZLJL(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long LJJI(Parcel parcel, int i) {
        int LJJIFFI = LJJIFFI(parcel, i);
        if (LJJIFFI == 0) {
            return null;
        }
        LJJIIJ(parcel, LJJIFFI, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int LJJIFFI(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static void LJJII(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + LJJIFFI(parcel, i));
    }

    public static <T extends Parcelable> T LJI(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return createFromParcel;
    }

    public static <T> T[] LJIIJ(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return tArr;
    }

    public static <T> ArrayList<T> LJIIJJI(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int LJJIFFI = LJJIFFI(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (LJJIFFI == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + LJJIFFI);
        return createTypedArrayList;
    }

    public static void LJJIIJ(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        C1EU.LIZJ(sb, "Expected size ", i2, " got ", i);
        throw new C67308QbI(FP1.LIZLLL(sb, " (0x", hexString, ")"), parcel);
    }

    public static void LJJIIJZLJL(Parcel parcel, int i, int i2) {
        int LJJIFFI = LJJIFFI(parcel, i);
        if (LJJIFFI == i2) {
            return;
        }
        String hexString = Integer.toHexString(LJJIFFI);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        C1EU.LIZJ(sb, "Expected size ", i2, " got ", LJJIFFI);
        throw new C67308QbI(FP1.LIZLLL(sb, " (0x", hexString, ")"), parcel);
    }
}
