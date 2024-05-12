package X;

import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0MZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MZ {
    public static final List<Integer> LJIILLIIL = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> LJIIZILJ = Arrays.asList(2, 7, 4, 5);
    public static final int[] LJIJ = {8, 8, 8};
    public static final int[] LJIJI = {8};
    public static final byte[] LJIJJ = {-1, -40, -1};
    public static final byte[] LJIJJLI = {79, 76, 89, 77, 80, 0};
    public static final byte[] LJIL = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final String[] LJJ = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] LJJI = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] LJJIFFI = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final C0MX LJJII;
    public static final C0MX[][] LJJIII;
    public static final C0MX[] LJJIIJ;
    public static final C0MX LJJIIJZLJL;
    public static final C0MX LJJIIZ;
    public static final HashMap<Integer, C0MX>[] LJJIIZI;
    public static final HashMap<String, C0MX>[] LJJIJ;
    public static final HashSet<String> LJJIJIIJI;
    public static final HashMap<Integer, Integer> LJJIJIIJIL;
    public static final Charset LJJIJIL;
    public static final byte[] LJJIJL;
    public static final Pattern LJJIJLIJ;
    public final String LIZ;
    public int LIZIZ;
    public final HashMap<String, C0MW>[] LIZJ;
    public final java.util.Set<Integer> LIZLLL;
    public ByteOrder LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public byte[] LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;

    static {
        C0MX[] c0mxArr = {new C0MX("NewSubfileType", 254, 4), new C0MX("SubfileType", 255, 4), new C0MX("ImageWidth", 256), new C0MX("ImageLength", 257), new C0MX("BitsPerSample", 258, 3), new C0MX("Compression", 259, 3), new C0MX("PhotometricInterpretation", 262, 3), new C0MX("ImageDescription", 270, 2), new C0MX("Make", 271, 2), new C0MX("Model", 272, 2), new C0MX("StripOffsets", 273), new C0MX("Orientation", 274, 3), new C0MX("SamplesPerPixel", 277, 3), new C0MX("RowsPerStrip", 278), new C0MX("StripByteCounts", 279), new C0MX("XResolution", 282, 5), new C0MX("YResolution", 283, 5), new C0MX("PlanarConfiguration", 284, 3), new C0MX("ResolutionUnit", 296, 3), new C0MX("TransferFunction", 301, 3), new C0MX("Software", 305, 2), new C0MX("DateTime", 306, 2), new C0MX("Artist", 315, 2), new C0MX("WhitePoint", 318, 5), new C0MX("PrimaryChromaticities", 319, 5), new C0MX("SubIFDPointer", 330, 4), new C0MX("JPEGInterchangeFormat", 513, 4), new C0MX("JPEGInterchangeFormatLength", 514, 4), new C0MX("YCbCrCoefficients", 529, 5), new C0MX("YCbCrSubSampling", 530, 3), new C0MX("YCbCrPositioning", 531, 3), new C0MX("ReferenceBlackWhite", 532, 5), new C0MX("Copyright", 33432, 2), new C0MX("ExifIFDPointer", 34665, 4), new C0MX("GPSInfoIFDPointer", 34853, 4), new C0MX("SensorTopBorder", 4, 4), new C0MX("SensorLeftBorder", 5, 4), new C0MX("SensorBottomBorder", 6, 4), new C0MX("SensorRightBorder", 7, 4), new C0MX("ISO", 23, 3), new C0MX("JpgFromRaw", 46, 7)};
        C0MX[] c0mxArr2 = {new C0MX("ExposureTime", 33434, 5), new C0MX("FNumber", 33437, 5), new C0MX("ExposureProgram", 34850, 3), new C0MX("SpectralSensitivity", 34852, 2), new C0MX("PhotographicSensitivity", 34855, 3), new C0MX("OECF", 34856, 7), new C0MX("ExifVersion", 36864, 2), new C0MX("DateTimeOriginal", 36867, 2), new C0MX("DateTimeDigitized", 36868, 2), new C0MX("ComponentsConfiguration", 37121, 7), new C0MX("CompressedBitsPerPixel", 37122, 5), new C0MX("ShutterSpeedValue", 37377, 10), new C0MX("ApertureValue", 37378, 5), new C0MX("BrightnessValue", 37379, 10), new C0MX("ExposureBiasValue", 37380, 10), new C0MX("MaxApertureValue", 37381, 5), new C0MX("SubjectDistance", 37382, 5), new C0MX("MeteringMode", 37383, 3), new C0MX("LightSource", 37384, 3), new C0MX("Flash", 37385, 3), new C0MX("FocalLength", 37386, 5), new C0MX("SubjectArea", 37396, 3), new C0MX("MakerNote", 37500, 7), new C0MX("UserComment", 37510, 7), new C0MX("SubSecTime", 37520, 2), new C0MX("SubSecTimeOriginal", 37521, 2), new C0MX("SubSecTimeDigitized", 37522, 2), new C0MX("FlashpixVersion", 40960, 7), new C0MX("ColorSpace", 40961, 3), new C0MX("PixelXDimension", 40962), new C0MX("PixelYDimension", 40963), new C0MX("RelatedSoundFile", 40964, 2), new C0MX("InteroperabilityIFDPointer", 40965, 4), new C0MX("FlashEnergy", 41483, 5), new C0MX("SpatialFrequencyResponse", 41484, 7), new C0MX("FocalPlaneXResolution", 41486, 5), new C0MX("FocalPlaneYResolution", 41487, 5), new C0MX("FocalPlaneResolutionUnit", 41488, 3), new C0MX("SubjectLocation", 41492, 3), new C0MX("ExposureIndex", 41493, 5), new C0MX("SensingMethod", 41495, 3), new C0MX("FileSource", 41728, 7), new C0MX("SceneType", 41729, 7), new C0MX("CFAPattern", 41730, 7), new C0MX("CustomRendered", 41985, 3), new C0MX("ExposureMode", 41986, 3), new C0MX("WhiteBalance", 41987, 3), new C0MX("DigitalZoomRatio", 41988, 5), new C0MX("FocalLengthIn35mmFilm", 41989, 3), new C0MX("SceneCaptureType", 41990, 3), new C0MX("GainControl", 41991, 3), new C0MX("Contrast", 41992, 3), new C0MX("Saturation", 41993, 3), new C0MX("Sharpness", 41994, 3), new C0MX("DeviceSettingDescription", 41995, 7), new C0MX("SubjectDistanceRange", 41996, 3), new C0MX("ImageUniqueID", 42016, 2), new C0MX("DNGVersion", 50706, 1), new C0MX("DefaultCropSize", 50720)};
        C0MX[] c0mxArr3 = {new C0MX("GPSVersionID", 0, 1), new C0MX("GPSLatitudeRef", 1, 2), new C0MX("GPSLatitude", 2, 5), new C0MX("GPSLongitudeRef", 3, 2), new C0MX("GPSLongitude", 4, 5), new C0MX("GPSAltitudeRef", 5, 1), new C0MX("GPSAltitude", 6, 5), new C0MX("GPSTimeStamp", 7, 5), new C0MX("GPSSatellites", 8, 2), new C0MX("GPSStatus", 9, 2), new C0MX("GPSMeasureMode", 10, 2), new C0MX("GPSDOP", 11, 5), new C0MX("GPSSpeedRef", 12, 2), new C0MX("GPSSpeed", 13, 5), new C0MX("GPSTrackRef", 14, 2), new C0MX("GPSTrack", 15, 5), new C0MX("GPSImgDirectionRef", 16, 2), new C0MX("GPSImgDirection", 17, 5), new C0MX("GPSMapDatum", 18, 2), new C0MX("GPSDestLatitudeRef", 19, 2), new C0MX("GPSDestLatitude", 20, 5), new C0MX("GPSDestLongitudeRef", 21, 2), new C0MX("GPSDestLongitude", 22, 5), new C0MX("GPSDestBearingRef", 23, 2), new C0MX("GPSDestBearing", 24, 5), new C0MX("GPSDestDistanceRef", 25, 2), new C0MX("GPSDestDistance", 26, 5), new C0MX("GPSProcessingMethod", 27, 7), new C0MX("GPSAreaInformation", 28, 7), new C0MX("GPSDateStamp", 29, 2), new C0MX("GPSDifferential", 30, 3)};
        C0MX[] c0mxArr4 = {new C0MX("InteroperabilityIndex", 1, 2)};
        C0MX[] c0mxArr5 = {new C0MX("NewSubfileType", 254, 4), new C0MX("SubfileType", 255, 4), new C0MX("ThumbnailImageWidth", 256), new C0MX("ThumbnailImageLength", 257), new C0MX("BitsPerSample", 258, 3), new C0MX("Compression", 259, 3), new C0MX("PhotometricInterpretation", 262, 3), new C0MX("ImageDescription", 270, 2), new C0MX("Make", 271, 2), new C0MX("Model", 272, 2), new C0MX("StripOffsets", 273), new C0MX("Orientation", 274, 3), new C0MX("SamplesPerPixel", 277, 3), new C0MX("RowsPerStrip", 278), new C0MX("StripByteCounts", 279), new C0MX("XResolution", 282, 5), new C0MX("YResolution", 283, 5), new C0MX("PlanarConfiguration", 284, 3), new C0MX("ResolutionUnit", 296, 3), new C0MX("TransferFunction", 301, 3), new C0MX("Software", 305, 2), new C0MX("DateTime", 306, 2), new C0MX("Artist", 315, 2), new C0MX("WhitePoint", 318, 5), new C0MX("PrimaryChromaticities", 319, 5), new C0MX("SubIFDPointer", 330, 4), new C0MX("JPEGInterchangeFormat", 513, 4), new C0MX("JPEGInterchangeFormatLength", 514, 4), new C0MX("YCbCrCoefficients", 529, 5), new C0MX("YCbCrSubSampling", 530, 3), new C0MX("YCbCrPositioning", 531, 3), new C0MX("ReferenceBlackWhite", 532, 5), new C0MX("Copyright", 33432, 2), new C0MX("ExifIFDPointer", 34665, 4), new C0MX("GPSInfoIFDPointer", 34853, 4), new C0MX("DNGVersion", 50706, 1), new C0MX("DefaultCropSize", 50720)};
        LJJII = new C0MX("StripOffsets", 273, 3);
        LJJIII = new C0MX[][]{c0mxArr, c0mxArr2, c0mxArr3, c0mxArr4, c0mxArr5, c0mxArr, new C0MX[]{new C0MX("ThumbnailImage", 256, 7), new C0MX("CameraSettingsIFDPointer", 8224, 4), new C0MX("ImageProcessingIFDPointer", 8256, 4)}, new C0MX[]{new C0MX("PreviewImageStart", 257, 4), new C0MX("PreviewImageLength", 258, 4)}, new C0MX[]{new C0MX("AspectFrame", 4371, 3)}, new C0MX[]{new C0MX("ColorSpace", 55, 3)}};
        LJJIIJ = new C0MX[]{new C0MX("SubIFDPointer", 330, 4), new C0MX("ExifIFDPointer", 34665, 4), new C0MX("GPSInfoIFDPointer", 34853, 4), new C0MX("InteroperabilityIFDPointer", 40965, 4), new C0MX("CameraSettingsIFDPointer", 8224, 1), new C0MX("ImageProcessingIFDPointer", 8256, 1)};
        LJJIIJZLJL = new C0MX("JPEGInterchangeFormat", 513, 4);
        LJJIIZ = new C0MX("JPEGInterchangeFormatLength", 514, 4);
        LJJIIZI = new HashMap[10];
        LJJIJ = new HashMap[10];
        LJJIJIIJI = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        LJJIJIIJIL = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        LJJIJIL = forName;
        LJJIJL = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0MX[][] c0mxArr6 = LJJIII;
            if (i < c0mxArr6.length) {
                LJJIIZI[i] = new HashMap<>();
                LJJIJ[i] = new HashMap<>();
                for (C0MX c0mx : c0mxArr6[i]) {
                    LJJIIZI[i].put(Integer.valueOf(c0mx.LIZ), c0mx);
                    LJJIJ[i].put(c0mx.LIZIZ, c0mx);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = LJJIJIIJIL;
                C0MX[] c0mxArr7 = LJJIIJ;
                hashMap.put(Integer.valueOf(c0mxArr7[0].LIZ), 5);
                hashMap.put(Integer.valueOf(c0mxArr7[1].LIZ), 1);
                hashMap.put(Integer.valueOf(c0mxArr7[2].LIZ), 2);
                hashMap.put(Integer.valueOf(c0mxArr7[3].LIZ), 3);
                hashMap.put(Integer.valueOf(c0mxArr7[4].LIZ), 7);
                hashMap.put(Integer.valueOf(c0mxArr7[5].LIZ), 8);
                PatternProtector.compile(".*[1-9].*");
                LJJIJLIJ = PatternProtector.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public final void LIZ() {
        String LIZLLL = LIZLLL("DateTimeOriginal");
        if (LIZLLL != null && LIZLLL("DateTime") == null) {
            this.LIZJ[0].put("DateTime", C0MW.LIZ(LIZLLL));
        }
        if (LIZLLL("ImageWidth") == null) {
            this.LIZJ[0].put("ImageWidth", C0MW.LIZIZ(0L, this.LJ));
        }
        if (LIZLLL("ImageLength") == null) {
            this.LIZJ[0].put("ImageLength", C0MW.LIZIZ(0L, this.LJ));
        }
        if (LIZLLL("Orientation") == null) {
            this.LIZJ[0].put("Orientation", C0MW.LIZIZ(0L, this.LJ));
        }
        if (LIZLLL("LightSource") == null) {
            this.LIZJ[1].put("LightSource", C0MW.LIZIZ(0L, this.LJ));
        }
    }

    public final byte[] LJIIJJI() {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (!this.LJFF) {
            return null;
        }
        byte[] bArr = this.LJIIIIZZ;
        if (bArr != null) {
            return bArr;
        }
        try {
            if (this.LIZ != null) {
                fileInputStream = new FileInputStream(this.LIZ);
            } else {
                fileInputStream = null;
            }
        } catch (IOException unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (fileInputStream != null) {
                if (fileInputStream.skip(this.LJI) == this.LJI) {
                    byte[] bArr2 = new byte[this.LJII];
                    if (fileInputStream.read(bArr2) == this.LJII) {
                        this.LJIIIIZZ = bArr2;
                        LIZIZ(fileInputStream);
                        return bArr2;
                    }
                    throw new IOException("Corrupted image");
                }
                throw new IOException("Corrupted image");
            }
            throw new FileNotFoundException();
        } catch (IOException unused2) {
            LIZIZ(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            LIZIZ(fileInputStream2);
            throw th;
        }
    }

    public final void LJIJJ() {
        byte[] LJIIJJI;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (this.LJIILL && this.LIZIZ == 4) {
            if (this.LIZ != null) {
                int i = this.LJIIIZ;
                FileInputStream fileInputStream2 = null;
                if (i == 6 || i == 7) {
                    LJIIJJI = LJIIJJI();
                } else {
                    LJIIJJI = null;
                }
                this.LJIIIIZZ = LJIIJJI;
                StringBuilder LIZ = X1D.LIZ();
                File file = new File(JBR.LJFF(LIZ, this.LIZ, ".tmp", LIZ));
                if (new File(this.LIZ).renameTo(file)) {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            fileOutputStream = new FileOutputStream(this.LIZ);
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = null;
                            fileInputStream2 = fileInputStream;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                    try {
                        LJIJJLI(fileInputStream, fileOutputStream);
                        LIZIZ(fileInputStream);
                        LIZIZ(fileOutputStream);
                        C16880lQ.LLLZZIL(file);
                        this.LJIIIIZZ = null;
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        LIZIZ(fileInputStream2);
                        LIZIZ(fileOutputStream);
                        C16880lQ.LLLZZIL(file);
                        throw th;
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Could not rename to ");
                LIZ2.append(file.getAbsolutePath());
                throw new IOException(X1D.LIZIZ(LIZ2));
            }
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
    }

    public C0MZ(String str) {
        FileInputStream fileInputStream;
        C0MX[][] c0mxArr = LJJIII;
        this.LIZJ = new HashMap[c0mxArr.length];
        this.LIZLLL = new HashSet(c0mxArr.length);
        this.LJ = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            this.LIZ = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                LJIILL(fileInputStream);
                LIZIZ(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                LIZIZ(fileInputStream);
                throw th;
            }
        }
        throw new IllegalArgumentException("filename cannot be null");
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] LIZJ(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    public static Pair<Integer, Integer> LJIIL(String str) {
        int intValue;
        int i;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> LJIIL = LJIIL(split[0]);
            if (((Integer) LJIIL.first).intValue() == 2) {
                return LJIIL;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair<Integer, Integer> LJIIL2 = LJIIL(split[i2]);
                if (((Integer) LJIIL2.first).equals(LJIIL.first) || ((Integer) LJIIL2.second).equals(LJIIL.first)) {
                    intValue = ((Integer) LJIIL.first).intValue();
                } else {
                    intValue = -1;
                }
                if (((Integer) LJIIL.second).intValue() != -1 && (((Integer) LJIIL2.first).equals(LJIIL.second) || ((Integer) LJIIL2.second).equals(LJIIL.second))) {
                    i = ((Integer) LJIIL.second).intValue();
                } else {
                    i = -1;
                }
                if (intValue == -1 && i == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    LJIIL = new Pair<>(Integer.valueOf(i), -1);
                } else if (i == -1) {
                    LJIIL = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return LJIIL;
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) CastDoubleProtector.parseDouble(split2[0]);
                    long parseDouble2 = (long) CastDoubleProtector.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        }
        try {
            try {
                Long valueOf = Long.valueOf(CastLongProtector.parseLong(str));
                if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                    return new Pair<>(3, 4);
                }
                if (valueOf.longValue() < 0) {
                    return new Pair<>(9, -1);
                }
                return new Pair<>(4, -1);
            } catch (NumberFormatException unused2) {
                CastDoubleProtector.parseDouble(str);
                return new Pair<>(12, -1);
            }
        } catch (NumberFormatException unused3) {
            return new Pair<>(2, -1);
        }
    }

    public static ByteOrder LJIIZILJ(C0MU c0mu) {
        short readShort = c0mu.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid byte order: ");
            LIZ.append(Integer.toHexString(readShort));
            throw new IOException(X1D.LIZIZ(LIZ));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final String LIZLLL(String str) {
        C0MY[] c0myArr;
        C0MW LJ = LJ(str);
        if (LJ != null) {
            if (!LJJIJIIJI.contains(str)) {
                return LJ.LJIIIIZZ(this.LJ);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = LJ.LIZ;
                if ((i != 5 && i != 10) || (c0myArr = (C0MY[]) LJ.LJIIIZ(this.LJ)) == null || c0myArr.length != 3) {
                    return null;
                }
                C0MY c0my = c0myArr[0];
                C0MY c0my2 = c0myArr[1];
                C0MY c0my3 = c0myArr[2];
                return C16880lQ.LLLZ("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) c0my.LIZ) / ((float) c0my.LIZIZ))), Integer.valueOf((int) (((float) c0my2.LIZ) / ((float) c0my2.LIZIZ))), Integer.valueOf((int) (((float) c0my3.LIZ) / ((float) c0my3.LIZIZ)))});
            }
            try {
                return Double.toString(LJ.LJI(this.LJ));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C0MW LJ(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < LJJIII.length; i++) {
            C0MW c0mw = this.LIZJ[i].get(str);
            if (c0mw != null) {
                return c0mw;
            }
        }
        return null;
    }

    public final int LJI(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = LJIJJ;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                    for (int i2 = 0; i2 < bytes.length; i2++) {
                        if (bArr[i2] != bytes[i2]) {
                            C0MU c0mu = new C0MU(bArr);
                            ByteOrder LJIIZILJ2 = LJIIZILJ(c0mu);
                            this.LJ = LJIIZILJ2;
                            c0mu.LJLILLLLZI = LJIIZILJ2;
                            short readShort = c0mu.readShort();
                            c0mu.close();
                            if (readShort == 20306 || readShort == 21330) {
                                return 7;
                            }
                            C0MU c0mu2 = new C0MU(bArr);
                            ByteOrder LJIIZILJ3 = LJIIZILJ(c0mu2);
                            this.LJ = LJIIZILJ3;
                            c0mu2.LJLILLLLZI = LJIIZILJ3;
                            short readShort2 = c0mu2.readShort();
                            c0mu2.close();
                            if (readShort2 != 85) {
                                return 0;
                            }
                            return 10;
                        }
                    }
                    return 9;
                }
                i++;
            } else {
                return 4;
            }
        }
    }

    public final void LJII(C0MU c0mu) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        LJIIIZ(c0mu);
        C0MW c0mw = this.LIZJ[1].get("MakerNote");
        if (c0mw != null) {
            C0MU c0mu2 = new C0MU(c0mw.LIZJ);
            c0mu2.LJLILLLLZI = this.LJ;
            byte[] bArr = LJIJJLI;
            byte[] bArr2 = new byte[bArr.length];
            c0mu2.readFully(bArr2);
            c0mu2.LIZ(0L);
            byte[] bArr3 = LJIL;
            byte[] bArr4 = new byte[bArr3.length];
            c0mu2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0mu2.LIZ(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0mu2.LIZ(12L);
            }
            LJIJ(c0mu2, 6);
            C0MW c0mw2 = this.LIZJ[7].get("PreviewImageStart");
            C0MW c0mw3 = this.LIZJ[7].get("PreviewImageLength");
            if (c0mw2 != null && c0mw3 != null) {
                this.LIZJ[5].put("JPEGInterchangeFormat", c0mw2);
                this.LIZJ[5].put("JPEGInterchangeFormatLength", c0mw3);
            }
            C0MW c0mw4 = this.LIZJ[8].get("AspectFrame");
            if (c0mw4 == null || (iArr = (int[]) c0mw4.LJIIIZ(this.LJ)) == null || iArr.length != 4 || (i = iArr[2]) <= (i2 = iArr[0]) || (i3 = iArr[3]) <= (i4 = iArr[1])) {
                return;
            }
            int i5 = (i - i2) + 1;
            int i6 = (i3 - i4) + 1;
            if (i5 < i6) {
                int i7 = i5 + i6;
                i6 = i7 - i6;
                i5 = i7 - i6;
            }
            C0MW LJ = C0MW.LJ(i5, this.LJ);
            C0MW LJ2 = C0MW.LJ(i6, this.LJ);
            this.LIZJ[0].put("ImageWidth", LJ);
            this.LIZJ[0].put("ImageLength", LJ2);
        }
    }

    public final void LJIIIIZZ(C0MU c0mu) {
        c0mu.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c0mu.read(bArr);
        c0mu.skipBytes(4);
        c0mu.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        LJFF(c0mu, i, 5);
        c0mu.LIZ(i2);
        c0mu.LJLILLLLZI = ByteOrder.BIG_ENDIAN;
        int readInt = c0mu.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = c0mu.readUnsignedShort();
            int readUnsignedShort2 = c0mu.readUnsignedShort();
            if (readUnsignedShort == LJJII.LIZ) {
                short readShort = c0mu.readShort();
                short readShort2 = c0mu.readShort();
                C0MW LJ = C0MW.LJ(readShort, this.LJ);
                C0MW LJ2 = C0MW.LJ(readShort2, this.LJ);
                this.LIZJ[0].put("ImageLength", LJ);
                this.LIZJ[0].put("ImageWidth", LJ2);
                return;
            }
            c0mu.skipBytes(readUnsignedShort2);
        }
    }

    public final void LJIIIZ(C0MU c0mu) {
        C0MW c0mw;
        LJIILLIIL(c0mu, c0mu.available());
        LJIJ(c0mu, 0);
        LJJIFFI(c0mu, 0);
        LJJIFFI(c0mu, 5);
        LJJIFFI(c0mu, 4);
        LJJI(0, 5);
        LJJI(0, 4);
        LJJI(5, 4);
        C0MW c0mw2 = this.LIZJ[1].get("PixelXDimension");
        C0MW c0mw3 = this.LIZJ[1].get("PixelYDimension");
        if (c0mw2 != null && c0mw3 != null) {
            this.LIZJ[0].put("ImageWidth", c0mw2);
            this.LIZJ[0].put("ImageLength", c0mw3);
        }
        if (this.LIZJ[4].isEmpty() && LJIILJJIL(this.LIZJ[5])) {
            HashMap<String, C0MW>[] hashMapArr = this.LIZJ;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        LJIILJJIL(this.LIZJ[4]);
        if (this.LIZIZ == 8 && (c0mw = this.LIZJ[1].get("MakerNote")) != null) {
            C0MU c0mu2 = new C0MU(c0mw.LIZJ);
            c0mu2.LJLILLLLZI = this.LJ;
            c0mu2.LIZ(6L);
            LJIJ(c0mu2, 9);
            C0MW c0mw4 = this.LIZJ[9].get("ColorSpace");
            if (c0mw4 != null) {
                this.LIZJ[1].put("ColorSpace", c0mw4);
            }
        }
    }

    public final void LJIIJ(C0MU c0mu) {
        LJIIIZ(c0mu);
        if (this.LIZJ[0].get("JpgFromRaw") != null) {
            LJFF(c0mu, this.LJIILJJIL, 5);
        }
        C0MW c0mw = this.LIZJ[0].get("ISO");
        C0MW c0mw2 = this.LIZJ[1].get("PhotographicSensitivity");
        if (c0mw != null && c0mw2 == null) {
            this.LIZJ[1].put("PhotographicSensitivity", c0mw);
        }
    }

    public final boolean LJIILJJIL(HashMap hashMap) {
        C0MW c0mw = (C0MW) hashMap.get("ImageLength");
        C0MW c0mw2 = (C0MW) hashMap.get("ImageWidth");
        if (c0mw != null && c0mw2 != null) {
            int LJII = c0mw.LJII(this.LJ);
            int LJII2 = c0mw2.LJII(this.LJ);
            if (LJII <= 512 && LJII2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIILL(InputStream inputStream) {
        for (int i = 0; i < LJJIII.length; i++) {
            try {
                try {
                    this.LIZJ[i] = new HashMap<>();
                } catch (IOException unused) {
                    this.LJIILL = false;
                }
            } finally {
                LIZ();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.LIZIZ = LJI(bufferedInputStream);
        C0MU c0mu = new C0MU(bufferedInputStream);
        switch (this.LIZIZ) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIIIZ(c0mu);
                break;
            case 4:
                LJFF(c0mu, 0, 0);
                break;
            case 7:
                LJII(c0mu);
                break;
            case 9:
                LJIIIIZZ(c0mu);
                break;
            case 10:
                LJIIJ(c0mu);
                break;
        }
        LJJ(c0mu);
        this.LJIILL = true;
    }

    public final void LJIJI(String str) {
        for (int i = 0; i < LJJIII.length; i++) {
            this.LIZJ[i].remove(str);
        }
    }

    public final void LJIL(String str) {
        C0MX c0mx;
        int i;
        C0MW c0mw;
        String LIZIZ;
        int i2 = 2;
        int i3 = 1;
        if (str != null && LJJIJIIJI.contains("UserComment")) {
            if ("UserComment".equals("GPSTimeStamp")) {
                Matcher matcher = LJJIJLIJ.matcher(str);
                if (!matcher.find()) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(CastIntegerProtector.parseInt(matcher.group(1)));
                LIZ.append("/1,");
                LIZ.append(CastIntegerProtector.parseInt(matcher.group(2)));
                LIZ.append("/1,");
                LIZ.append(CastIntegerProtector.parseInt(matcher.group(3)));
                LIZ.append("/1");
                str = X1D.LIZIZ(LIZ);
            } else {
                try {
                    str = new C0MY((long) (CastDoubleProtector.parseDouble(str) * 10000.0d), 10000L).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < LJJIII.length) {
            if ((i5 != 4 || this.LJFF) && (c0mx = LJJIJ[i5].get("UserComment")) != null) {
                if (str == null) {
                    this.LIZJ[i5].remove("UserComment");
                } else {
                    Pair<Integer, Integer> LJIIL = LJIIL(str);
                    int i6 = -1;
                    if (c0mx.LIZJ == ((Integer) LJIIL.first).intValue() || c0mx.LIZJ == ((Integer) LJIIL.second).intValue()) {
                        i = c0mx.LIZJ;
                    } else {
                        int i7 = c0mx.LIZLLL;
                        if (i7 != -1 && (i7 == ((Integer) LJIIL.first).intValue() || c0mx.LIZLLL == ((Integer) LJIIL.second).intValue())) {
                            i = c0mx.LIZLLL;
                        } else {
                            i = c0mx.LIZJ;
                            if (i != i3 && i != 7 && i != i2) {
                                StringBuilder LIZLLL = C1FL.LIZLLL("Given tag (", "UserComment", ") value didn't match with one of expected ", "formats: ");
                                String[] strArr = LJJ;
                                LIZLLL.append(strArr[c0mx.LIZJ]);
                                String str2 = "";
                                if (c0mx.LIZLLL == -1) {
                                    LIZIZ = "";
                                } else {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(", ");
                                    LIZ2.append(strArr[c0mx.LIZLLL]);
                                    LIZIZ = X1D.LIZIZ(LIZ2);
                                }
                                LIZLLL.append(LIZIZ);
                                LIZLLL.append(" (guess: ");
                                LIZLLL.append(strArr[((Integer) LJIIL.first).intValue()]);
                                if (((Integer) LJIIL.second).intValue() != -1) {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append(", ");
                                    LIZ3.append(strArr[((Integer) LJIIL.second).intValue()]);
                                    str2 = X1D.LIZIZ(LIZ3);
                                }
                                C0MT.LJ(LIZLLL, str2, ")", LIZLLL);
                            }
                        }
                    }
                    switch (i) {
                        case 1:
                            HashMap<String, C0MW> hashMap = this.LIZJ[i5];
                            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                                c0mw = new C0MW(1, new byte[]{(byte) (str.charAt(0) - '0')}, 1);
                            } else {
                                byte[] bytes = str.getBytes(LJJIJIL);
                                c0mw = new C0MW(1, bytes, bytes.length);
                            }
                            hashMap.put("UserComment", c0mw);
                            break;
                        case 2:
                        case 7:
                            this.LIZJ[i5].put("UserComment", C0MW.LIZ(str));
                            break;
                        case 3:
                            String[] split = str.split(",", -1);
                            int[] iArr = new int[split.length];
                            while (i4 < split.length) {
                                iArr[i4] = CastIntegerProtector.parseInt(split[i4]);
                                i4++;
                            }
                            this.LIZJ[i5].put("UserComment", C0MW.LJFF(iArr, this.LJ));
                            break;
                        case 4:
                            String[] split2 = str.split(",", -1);
                            long[] jArr = new long[split2.length];
                            while (i4 < split2.length) {
                                jArr[i4] = CastLongProtector.parseLong(split2[i4]);
                                i4++;
                            }
                            this.LIZJ[i5].put("UserComment", C0MW.LIZJ(jArr, this.LJ));
                            break;
                        case 5:
                            int i8 = -1;
                            String[] split3 = str.split(",", -1);
                            C0MY[] c0myArr = new C0MY[split3.length];
                            int i9 = 0;
                            while (i9 < split3.length) {
                                String[] split4 = split3[i9].split("/", i8);
                                c0myArr[i9] = new C0MY((long) CastDoubleProtector.parseDouble(split4[0]), (long) CastDoubleProtector.parseDouble(split4[1]));
                                i9++;
                                i8 = -1;
                            }
                            this.LIZJ[i5].put("UserComment", C0MW.LIZLLL(c0myArr, this.LJ));
                            break;
                        case 9:
                            String[] split5 = str.split(",", -1);
                            int length = split5.length;
                            int[] iArr2 = new int[length];
                            for (int i10 = 0; i10 < split5.length; i10++) {
                                iArr2[i10] = CastIntegerProtector.parseInt(split5[i10]);
                            }
                            HashMap<String, C0MW> hashMap2 = this.LIZJ[i5];
                            ByteOrder byteOrder = this.LJ;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[LJJI[9] * length]);
                            wrap.order(byteOrder);
                            for (int i11 = 0; i11 < length; i11++) {
                                wrap.putInt(iArr2[i11]);
                            }
                            hashMap2.put("UserComment", new C0MW(9, wrap.array(), length));
                            break;
                        case 10:
                            String[] split6 = str.split(",", -1);
                            int length2 = split6.length;
                            C0MY[] c0myArr2 = new C0MY[length2];
                            int i12 = 0;
                            while (i12 < split6.length) {
                                String[] split7 = split6[i12].split("/", i6);
                                c0myArr2[i12] = new C0MY((long) CastDoubleProtector.parseDouble(split7[i4]), (long) CastDoubleProtector.parseDouble(split7[i3]));
                                i12++;
                                i3 = 1;
                                i4 = 0;
                                i6 = -1;
                            }
                            HashMap<String, C0MW> hashMap3 = this.LIZJ[i5];
                            ByteOrder byteOrder2 = this.LJ;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[LJJI[10] * length2]);
                            wrap2.order(byteOrder2);
                            for (int i13 = 0; i13 < length2; i13++) {
                                C0MY c0my = c0myArr2[i13];
                                wrap2.putInt((int) c0my.LIZ);
                                wrap2.putInt((int) c0my.LIZIZ);
                            }
                            hashMap3.put("UserComment", new C0MW(10, wrap2.array(), length2));
                            break;
                        case 12:
                            String[] split8 = str.split(",", -1);
                            int length3 = split8.length;
                            double[] dArr = new double[length3];
                            for (int i14 = 0; i14 < split8.length; i14++) {
                                dArr[i14] = CastDoubleProtector.parseDouble(split8[i14]);
                            }
                            HashMap<String, C0MW> hashMap4 = this.LIZJ[i5];
                            ByteOrder byteOrder3 = this.LJ;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[LJJI[12] * length3]);
                            wrap3.order(byteOrder3);
                            for (int i15 = 0; i15 < length3; i15++) {
                                wrap3.putDouble(dArr[i15]);
                            }
                            hashMap4.put("UserComment", new C0MW(12, wrap3.array(), length3));
                            break;
                    }
                }
            }
            i5++;
            i2 = 2;
            i3 = 1;
            i4 = 0;
        }
    }

    public final void LJJ(C0MU c0mu) {
        C0MW c0mw;
        HashMap<String, C0MW> hashMap = this.LIZJ[4];
        C0MW c0mw2 = hashMap.get("Compression");
        if (c0mw2 != null) {
            int LJII = c0mw2.LJII(this.LJ);
            this.LJIIIZ = LJII;
            if (LJII != 1) {
                if (LJII != 6) {
                    if (LJII != 7) {
                        return;
                    }
                } else {
                    LJIILIIL(c0mu, hashMap);
                    return;
                }
            }
            C0MW c0mw3 = hashMap.get("BitsPerSample");
            if (c0mw3 == null) {
                return;
            }
            int[] iArr = (int[]) c0mw3.LJIIIZ(this.LJ);
            int[] iArr2 = LJIJ;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.LIZIZ != 3 || (c0mw = hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int LJII2 = c0mw.LJII(this.LJ);
                if (LJII2 == 1) {
                    if (!Arrays.equals(iArr, LJIJI)) {
                        return;
                    }
                } else if (LJII2 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            C0MW c0mw4 = hashMap.get("StripOffsets");
            C0MW c0mw5 = hashMap.get("StripByteCounts");
            if (c0mw4 == null || c0mw5 == null) {
                return;
            }
            long[] LIZJ = LIZJ(c0mw4.LJIIIZ(this.LJ));
            long[] LIZJ2 = LIZJ(c0mw5.LJIIIZ(this.LJ));
            if (LIZJ == null || LIZJ2 == null) {
                return;
            }
            long j = 0;
            for (long j2 : LIZJ2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < LIZJ.length; i4++) {
                int i5 = (int) LIZJ[i4];
                int i6 = (int) LIZJ2[i4];
                int i7 = i5 - i2;
                c0mu.LIZ(i7);
                byte[] bArr2 = new byte[i6];
                c0mu.read(bArr2);
                i2 = i2 + i7 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.LJFF = true;
            this.LJIIIIZZ = bArr;
            this.LJII = i;
            return;
        }
        this.LJIIIZ = 6;
        LJIILIIL(c0mu, hashMap);
    }

    public final void LJIILIIL(C0MU c0mu, HashMap hashMap) {
        int i;
        C0MW c0mw = (C0MW) hashMap.get("JPEGInterchangeFormat");
        C0MW c0mw2 = (C0MW) hashMap.get("JPEGInterchangeFormatLength");
        if (c0mw != null && c0mw2 != null) {
            int LJII = c0mw.LJII(this.LJ);
            int min = Math.min(c0mw2.LJII(this.LJ), c0mu.available() - LJII);
            int i2 = this.LIZIZ;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.LJIIJ;
            } else {
                if (i2 == 7) {
                    i = this.LJIIJJI;
                }
                if (LJII <= 0 && min > 0) {
                    this.LJFF = true;
                    this.LJI = LJII;
                    this.LJII = min;
                    if (this.LIZ == null) {
                        byte[] bArr = new byte[min];
                        c0mu.LIZ(LJII);
                        c0mu.readFully(bArr);
                        this.LJIIIIZZ = bArr;
                        return;
                    }
                    return;
                }
            }
            LJII += i;
            if (LJII <= 0) {
            }
        }
    }

    public final void LJIILLIIL(C0MU c0mu, int i) {
        ByteOrder LJIIZILJ2 = LJIIZILJ(c0mu);
        this.LJ = LJIIZILJ2;
        c0mu.LJLILLLLZI = LJIIZILJ2;
        int readUnsignedShort = c0mu.readUnsignedShort();
        int i2 = this.LIZIZ;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = c0mu.readInt();
            if (readInt >= 8 && readInt < i) {
                int i3 = readInt - 8;
                if (i3 <= 0 || c0mu.skipBytes(i3) == i3) {
                    return;
                } else {
                    throw new IOException(KMP.LJ("Couldn't jump to first Ifd: ", i3));
                }
            }
            throw new IOException(KMP.LJ("Invalid first Ifd offset: ", readInt));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Invalid start code: ");
        LIZ.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0090, code lost:
    
        if (r5 == 9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0092, code lost:
    
        if (r10 == 9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x009b, code lost:
    
        if (r5 == 12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x009d, code lost:
    
        if (r10 == 12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a1, code lost:
    
        if (r7 == 11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0096, code lost:
    
        if (r7 == 8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x008b, code lost:
    
        if (r7 != 3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0084, code lost:
    
        if (r7 == 7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0089, code lost:
    
        if (r10 != 4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(X.C0MU r23, int r24) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MZ.LJIJ(X.0MU, int):void");
    }

    public final void LJIJJLI(InputStream inputStream, OutputStream outputStream) {
        short s;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C0MV c0mv = new C0MV(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            c0mv.LIZ(-1);
            if (dataInputStream.readByte() == -40) {
                c0mv.LIZ(-40);
                c0mv.LIZ(-1);
                c0mv.LIZ(-31);
                C0MX[][] c0mxArr = LJJIII;
                int[] iArr = new int[c0mxArr.length];
                int[] iArr2 = new int[c0mxArr.length];
                for (C0MX c0mx : LJJIIJ) {
                    LJIJI(c0mx.LIZIZ);
                }
                LJIJI(LJJIIJZLJL.LIZIZ);
                LJIJI(LJJIIZ.LIZIZ);
                for (int i = 0; i < LJJIII.length; i++) {
                    for (Object obj : this.LIZJ[i].entrySet().toArray()) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry.getValue() == null) {
                            this.LIZJ[i].remove(entry.getKey());
                        }
                    }
                }
                if (!this.LIZJ[1].isEmpty()) {
                    this.LIZJ[0].put(LJJIIJ[1].LIZIZ, C0MW.LIZIZ(0L, this.LJ));
                }
                if (!this.LIZJ[2].isEmpty()) {
                    this.LIZJ[0].put(LJJIIJ[2].LIZIZ, C0MW.LIZIZ(0L, this.LJ));
                }
                if (!this.LIZJ[3].isEmpty()) {
                    this.LIZJ[1].put(LJJIIJ[3].LIZIZ, C0MW.LIZIZ(0L, this.LJ));
                }
                if (this.LJFF) {
                    this.LIZJ[4].put(LJJIIJZLJL.LIZIZ, C0MW.LIZIZ(0L, this.LJ));
                    this.LIZJ[4].put(LJJIIZ.LIZIZ, C0MW.LIZIZ(this.LJII, this.LJ));
                }
                for (int i2 = 0; i2 < LJJIII.length; i2++) {
                    Iterator<Map.Entry<String, C0MW>> it = this.LIZJ[i2].entrySet().iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        C0MW value = it.next().getValue();
                        value.getClass();
                        int i4 = LJJI[value.LIZ] * value.LIZIZ;
                        if (i4 > 4) {
                            i3 += i4;
                        }
                    }
                    iArr2[i2] = iArr2[i2] + i3;
                }
                int i5 = 8;
                for (int i6 = 0; i6 < LJJIII.length; i6++) {
                    if (!this.LIZJ[i6].isEmpty()) {
                        iArr[i6] = i5;
                        i5 += (this.LIZJ[i6].size() * 12) + 2 + 4 + iArr2[i6];
                    }
                }
                if (this.LJFF) {
                    this.LIZJ[4].put(LJJIIJZLJL.LIZIZ, C0MW.LIZIZ(i5, this.LJ));
                    this.LJI = i5 + 6;
                    i5 += this.LJII;
                }
                int i7 = i5 + 8;
                if (!this.LIZJ[1].isEmpty()) {
                    this.LIZJ[0].put(LJJIIJ[1].LIZIZ, C0MW.LIZIZ(iArr[1], this.LJ));
                }
                if (!this.LIZJ[2].isEmpty()) {
                    this.LIZJ[0].put(LJJIIJ[2].LIZIZ, C0MW.LIZIZ(iArr[2], this.LJ));
                }
                if (!this.LIZJ[3].isEmpty()) {
                    this.LIZJ[1].put(LJJIIJ[3].LIZIZ, C0MW.LIZIZ(iArr[3], this.LJ));
                }
                c0mv.LIZJ((short) i7);
                c0mv.write(LJJIJL);
                if (this.LJ == ByteOrder.BIG_ENDIAN) {
                    s = 19789;
                } else {
                    s = 18761;
                }
                c0mv.LIZJ(s);
                c0mv.LJLILLLLZI = this.LJ;
                c0mv.LIZJ((short) 42);
                c0mv.LIZIZ((int) 8);
                for (int i8 = 0; i8 < LJJIII.length; i8++) {
                    if (!this.LIZJ[i8].isEmpty()) {
                        c0mv.LIZJ((short) this.LIZJ[i8].size());
                        int size = (this.LIZJ[i8].size() * 12) + iArr[i8] + 2 + 4;
                        for (Map.Entry<String, C0MW> entry2 : this.LIZJ[i8].entrySet()) {
                            int i9 = LJJIJ[i8].get(entry2.getKey()).LIZ;
                            C0MW value2 = entry2.getValue();
                            value2.getClass();
                            int i10 = LJJI[value2.LIZ] * value2.LIZIZ;
                            c0mv.LIZJ((short) i9);
                            c0mv.LIZJ((short) value2.LIZ);
                            c0mv.LIZIZ(value2.LIZIZ);
                            if (i10 > 4) {
                                c0mv.LIZIZ(size);
                                size += i10;
                            } else {
                                c0mv.write(value2.LIZJ);
                                if (i10 < 4) {
                                    do {
                                        c0mv.LIZ(0);
                                        i10++;
                                    } while (i10 < 4);
                                }
                            }
                        }
                        if (i8 == 0 && !this.LIZJ[4].isEmpty()) {
                            c0mv.LIZIZ(iArr[4]);
                        } else {
                            c0mv.LIZIZ((int) 0);
                        }
                        Iterator<Map.Entry<String, C0MW>> it2 = this.LIZJ[i8].entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr = it2.next().getValue().LIZJ;
                            if (bArr.length > 4) {
                                c0mv.write(bArr, 0, bArr.length);
                            }
                        }
                    }
                }
                if (this.LJFF) {
                    c0mv.write(LJIIJJI());
                }
                c0mv.LJLILLLLZI = ByteOrder.BIG_ENDIAN;
                byte[] bArr2 = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            c0mv.LIZ(-1);
                            c0mv.LIZ(readByte);
                            int readUnsignedShort = dataInputStream.readUnsignedShort();
                            c0mv.LIZJ((short) readUnsignedShort);
                            int i11 = readUnsignedShort - 2;
                            if (i11 >= 0) {
                                while (i11 > 0) {
                                    int read = dataInputStream.read(bArr2, 0, Math.min(i11, 4096));
                                    if (read >= 0) {
                                        c0mv.write(bArr2, 0, read);
                                        i11 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                            if (readUnsignedShort2 >= 0) {
                                byte[] bArr3 = new byte[6];
                                if (readUnsignedShort2 >= 6) {
                                    if (dataInputStream.read(bArr3) == 6) {
                                        if (Arrays.equals(bArr3, LJJIJL)) {
                                            int i12 = readUnsignedShort2 - 6;
                                            if (dataInputStream.skipBytes(i12) != i12) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                c0mv.LIZ(-1);
                                c0mv.LIZ(readByte);
                                c0mv.LIZJ((short) (readUnsignedShort2 + 2));
                                if (readUnsignedShort2 >= 6) {
                                    readUnsignedShort2 -= 6;
                                    c0mv.write(bArr3);
                                }
                                while (readUnsignedShort2 > 0) {
                                    int read2 = dataInputStream.read(bArr2, 0, Math.min(readUnsignedShort2, 4096));
                                    if (read2 >= 0) {
                                        c0mv.write(bArr2, 0, read2);
                                        readUnsignedShort2 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c0mv.LIZ(-1);
                        c0mv.LIZ(readByte);
                        byte[] bArr4 = new byte[FileUtils.BUFFER_SIZE];
                        while (true) {
                            int read3 = dataInputStream.read(bArr4);
                            if (read3 != -1) {
                                c0mv.write(bArr4, 0, read3);
                            } else {
                                return;
                            }
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void LJJI(int i, int i2) {
        if (this.LIZJ[i].isEmpty() || this.LIZJ[i2].isEmpty()) {
            return;
        }
        C0MW c0mw = this.LIZJ[i].get("ImageLength");
        C0MW c0mw2 = this.LIZJ[i].get("ImageWidth");
        C0MW c0mw3 = this.LIZJ[i2].get("ImageLength");
        C0MW c0mw4 = this.LIZJ[i2].get("ImageWidth");
        if (c0mw == null || c0mw2 == null || c0mw3 == null || c0mw4 == null) {
            return;
        }
        int LJII = c0mw.LJII(this.LJ);
        int LJII2 = c0mw2.LJII(this.LJ);
        int LJII3 = c0mw3.LJII(this.LJ);
        int LJII4 = c0mw4.LJII(this.LJ);
        if (LJII >= LJII3 || LJII2 >= LJII4) {
            return;
        }
        HashMap<String, C0MW>[] hashMapArr = this.LIZJ;
        HashMap<String, C0MW> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void LJJIFFI(C0MU c0mu, int i) {
        C0MW c0mw;
        C0MW LJ;
        C0MW LJ2;
        C0MW c0mw2 = this.LIZJ[i].get("DefaultCropSize");
        C0MW c0mw3 = this.LIZJ[i].get("SensorTopBorder");
        C0MW c0mw4 = this.LIZJ[i].get("SensorLeftBorder");
        C0MW c0mw5 = this.LIZJ[i].get("SensorBottomBorder");
        C0MW c0mw6 = this.LIZJ[i].get("SensorRightBorder");
        if (c0mw2 != null) {
            if (c0mw2.LIZ == 5) {
                C0MY[] c0myArr = (C0MY[]) c0mw2.LJIIIZ(this.LJ);
                if (c0myArr == null || c0myArr.length != 2) {
                    return;
                }
                LJ = C0MW.LIZLLL(new C0MY[]{c0myArr[0]}, this.LJ);
                LJ2 = C0MW.LIZLLL(new C0MY[]{c0myArr[1]}, this.LJ);
            } else {
                int[] iArr = (int[]) c0mw2.LJIIIZ(this.LJ);
                if (iArr == null || iArr.length != 2) {
                    return;
                }
                LJ = C0MW.LJ(iArr[0], this.LJ);
                LJ2 = C0MW.LJ(iArr[1], this.LJ);
            }
            this.LIZJ[i].put("ImageWidth", LJ);
            this.LIZJ[i].put("ImageLength", LJ2);
            return;
        }
        if (c0mw3 != null && c0mw4 != null && c0mw5 != null && c0mw6 != null) {
            int LJII = c0mw3.LJII(this.LJ);
            int LJII2 = c0mw5.LJII(this.LJ);
            int LJII3 = c0mw6.LJII(this.LJ);
            int LJII4 = c0mw4.LJII(this.LJ);
            if (LJII2 > LJII && LJII3 > LJII4) {
                C0MW LJ3 = C0MW.LJ(LJII2 - LJII, this.LJ);
                C0MW LJ4 = C0MW.LJ(LJII3 - LJII4, this.LJ);
                this.LIZJ[i].put("ImageLength", LJ3);
                this.LIZJ[i].put("ImageWidth", LJ4);
                return;
            }
            return;
        }
        C0MW c0mw7 = this.LIZJ[i].get("ImageLength");
        C0MW c0mw8 = this.LIZJ[i].get("ImageWidth");
        if ((c0mw7 == null || c0mw8 == null) && (c0mw = this.LIZJ[i].get("JPEGInterchangeFormat")) != null) {
            LJFF(c0mu, c0mw.LJII(this.LJ), i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0034, code lost:
    
        r10.LJLILLLLZI = r9.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x004e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0054. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0057. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C0MU r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MZ.LJFF(X.0MU, int, int):void");
    }
}
