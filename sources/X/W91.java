package X;

import android.util.Pair;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class W91 {
    public static void LIZ(InputStream inputStream) {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static Pair<Integer, Integer> LIZIZ(InputStream inputStream) {
        inputStream.skip(7L);
        short read = (short) (inputStream.read() & 255);
        short read2 = (short) (inputStream.read() & 255);
        short read3 = (short) (inputStream.read() & 255);
        if (read != 157 || read2 != 1 || read3 != 42) {
            return null;
        }
        byte read4 = (byte) inputStream.read();
        return new Pair<>(Integer.valueOf((read4 & 255) | ((((byte) inputStream.read()) << 8) & 65280)), Integer.valueOf(((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255)));
    }

    public static Pair<Integer, Integer> LIZJ(InputStream inputStream) {
        LIZ(inputStream);
        if (((byte) (inputStream.read() & 255)) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        int read2 = ((byte) inputStream.read()) & 255;
        int read3 = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | (read3 << 2) | ((read2 & 192) >> 6)) + 1));
    }

    public static int LIZLLL(InputStream inputStream) {
        byte read = (byte) (inputStream.read() & 255);
        return ((((byte) (inputStream.read() & 255)) << 16) & 16711680) | ((((byte) (inputStream.read() & 255)) << 8) & 65280) | (read & 255);
    }
}
