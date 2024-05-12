package X;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
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
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: X.R1v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68887R1v {
    public static final boolean LJIIZILJ = android.util.Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> LJIJ = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> LJIJI = Arrays.asList(2, 7, 4, 5);
    public static final int[] LJIJJ = {8, 8, 8};
    public static final int[] LJIJJLI = {8};
    public static final byte[] LJIL = {-1, -40, -1};
    public static final byte[] LJJ = {102, 116, 121, 112};
    public static final byte[] LJJI = {109, 105, 102, 49};
    public static final byte[] LJJIFFI = {104, 101, 105, 99};
    public static final byte[] LJJII = {79, 76, 89, 77, 80, 0};
    public static final byte[] LJJIII = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] LJJIIJ = {-119, 80, 78, 71, XC5.LJFF, 10, 26, 10};
    public static final byte[] LJJIIJZLJL = {101, 88, 73, 102};
    public static final byte[] LJJIIZ = {73, 72, 68, 82};
    public static final byte[] LJJIIZI = {73, 69, 78, 68};
    public static final byte[] LJJIJ = {82, 73, 70, 70};
    public static final byte[] LJJIJIIJI = {87, 69, 66, 80};
    public static final byte[] LJJIJIIJIL = {69, 88, 73, 70};
    public static final byte[] LJJIJIL = {-99, 1, 42};
    public static final byte[] LJJIJL = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] LJJIJLIJ = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] LJJIL = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] LJJIZ = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] LJJJ = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] LJJJI = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] LJJJIL = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] LJJJJ = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final R21 LJJJJI;
    public static final R21[][] LJJJJIZL;
    public static final R21[] LJJJJJ;
    public static final R21 LJJJJJL;
    public static final R21 LJJJJL;
    public static final HashMap<Integer, R21>[] LJJJJLI;
    public static final HashMap<String, R21>[] LJJJJLL;
    public static final HashSet<String> LJJJJZ;
    public static final HashMap<Integer, Integer> LJJJJZI;
    public static final Charset LJJJLIIL;
    public static final byte[] LJJJLL;
    public static final byte[] LJJJLZIJ;
    public static final Pattern LJJJZ;
    public String LIZ;
    public FileDescriptor LIZIZ;
    public int LIZJ;
    public final HashMap<String, C68888R1w>[] LIZLLL;
    public final java.util.Set<Integer> LJ;
    public ByteOrder LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public byte[] LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;

    static {
        R21[] r21Arr = {new R21("NewSubfileType", 254, 4), new R21("SubfileType", 255, 4), new R21("ImageWidth", 256, 3, 4), new R21("ImageLength", 257, 3, 4), new R21("BitsPerSample", 258, 3), new R21("Compression", 259, 3), new R21("PhotometricInterpretation", 262, 3), new R21("ImageDescription", 270, 2), new R21("Make", 271, 2), new R21("Model", 272, 2), new R21("StripOffsets", 273, 3, 4), new R21("Orientation", 274, 3), new R21("SamplesPerPixel", 277, 3), new R21("RowsPerStrip", 278, 3, 4), new R21("StripByteCounts", 279, 3, 4), new R21("XResolution", 282, 5), new R21("YResolution", 283, 5), new R21("PlanarConfiguration", 284, 3), new R21("ResolutionUnit", 296, 3), new R21("TransferFunction", 301, 3), new R21("Software", 305, 2), new R21("DateTime", 306, 2), new R21("Artist", 315, 2), new R21("WhitePoint", 318, 5), new R21("PrimaryChromaticities", 319, 5), new R21("SubIFDPointer", 330, 4), new R21("JPEGInterchangeFormat", 513, 4), new R21("JPEGInterchangeFormatLength", 514, 4), new R21("YCbCrCoefficients", 529, 5), new R21("YCbCrSubSampling", 530, 3), new R21("YCbCrPositioning", 531, 3), new R21("ReferenceBlackWhite", 532, 5), new R21("Copyright", 33432, 2), new R21("ExifIFDPointer", 34665, 4), new R21("GPSInfoIFDPointer", 34853, 4), new R21("SensorTopBorder", 4, 4), new R21("SensorLeftBorder", 5, 4), new R21("SensorBottomBorder", 6, 4), new R21("SensorRightBorder", 7, 4), new R21("ISO", 23, 3), new R21("JpgFromRaw", 46, 7), new R21("Xmp", 700, 1)};
        R21[] r21Arr2 = {new R21("ExposureTime", 33434, 5), new R21("FNumber", 33437, 5), new R21("ExposureProgram", 34850, 3), new R21("SpectralSensitivity", 34852, 2), new R21("PhotographicSensitivity", 34855, 3), new R21("OECF", 34856, 7), new R21("SensitivityType", 34864, 3), new R21("StandardOutputSensitivity", 34865, 4), new R21("RecommendedExposureIndex", 34866, 4), new R21("ISOSpeed", 34867, 4), new R21("ISOSpeedLatitudeyyy", 34868, 4), new R21("ISOSpeedLatitudezzz", 34869, 4), new R21("ExifVersion", 36864, 2), new R21("DateTimeOriginal", 36867, 2), new R21("DateTimeDigitized", 36868, 2), new R21("OffsetTime", 36880, 2), new R21("OffsetTimeOriginal", 36881, 2), new R21("OffsetTimeDigitized", 36882, 2), new R21("ComponentsConfiguration", 37121, 7), new R21("CompressedBitsPerPixel", 37122, 5), new R21("ShutterSpeedValue", 37377, 10), new R21("ApertureValue", 37378, 5), new R21("BrightnessValue", 37379, 10), new R21("ExposureBiasValue", 37380, 10), new R21("MaxApertureValue", 37381, 5), new R21("SubjectDistance", 37382, 5), new R21("MeteringMode", 37383, 3), new R21("LightSource", 37384, 3), new R21("Flash", 37385, 3), new R21("FocalLength", 37386, 5), new R21("SubjectArea", 37396, 3), new R21("MakerNote", 37500, 7), new R21("UserComment", 37510, 7), new R21("SubSecTime", 37520, 2), new R21("SubSecTimeOriginal", 37521, 2), new R21("SubSecTimeDigitized", 37522, 2), new R21("FlashpixVersion", 40960, 7), new R21("ColorSpace", 40961, 3), new R21("PixelXDimension", 40962, 3, 4), new R21("PixelYDimension", 40963, 3, 4), new R21("RelatedSoundFile", 40964, 2), new R21("InteroperabilityIFDPointer", 40965, 4), new R21("FlashEnergy", 41483, 5), new R21("SpatialFrequencyResponse", 41484, 7), new R21("FocalPlaneXResolution", 41486, 5), new R21("FocalPlaneYResolution", 41487, 5), new R21("FocalPlaneResolutionUnit", 41488, 3), new R21("SubjectLocation", 41492, 3), new R21("ExposureIndex", 41493, 5), new R21("SensingMethod", 41495, 3), new R21("FileSource", 41728, 7), new R21("SceneType", 41729, 7), new R21("CFAPattern", 41730, 7), new R21("CustomRendered", 41985, 3), new R21("ExposureMode", 41986, 3), new R21("WhiteBalance", 41987, 3), new R21("DigitalZoomRatio", 41988, 5), new R21("FocalLengthIn35mmFilm", 41989, 3), new R21("SceneCaptureType", 41990, 3), new R21("GainControl", 41991, 3), new R21("Contrast", 41992, 3), new R21("Saturation", 41993, 3), new R21("Sharpness", 41994, 3), new R21("DeviceSettingDescription", 41995, 7), new R21("SubjectDistanceRange", 41996, 3), new R21("ImageUniqueID", 42016, 2), new R21("CameraOwnerName", 42032, 2), new R21("BodySerialNumber", 42033, 2), new R21("LensSpecification", 42034, 5), new R21("LensMake", 42035, 2), new R21("LensModel", 42036, 2), new R21("Gamma", 42240, 5), new R21("DNGVersion", 50706, 1), new R21("DefaultCropSize", 50720, 3, 4)};
        R21[] r21Arr3 = {new R21("GPSVersionID", 0, 1), new R21("GPSLatitudeRef", 1, 2), new R21("GPSLatitude", 2, 5, 10), new R21("GPSLongitudeRef", 3, 2), new R21("GPSLongitude", 4, 5, 10), new R21("GPSAltitudeRef", 5, 1), new R21("GPSAltitude", 6, 5), new R21("GPSTimeStamp", 7, 5), new R21("GPSSatellites", 8, 2), new R21("GPSStatus", 9, 2), new R21("GPSMeasureMode", 10, 2), new R21("GPSDOP", 11, 5), new R21("GPSSpeedRef", 12, 2), new R21("GPSSpeed", 13, 5), new R21("GPSTrackRef", 14, 2), new R21("GPSTrack", 15, 5), new R21("GPSImgDirectionRef", 16, 2), new R21("GPSImgDirection", 17, 5), new R21("GPSMapDatum", 18, 2), new R21("GPSDestLatitudeRef", 19, 2), new R21("GPSDestLatitude", 20, 5), new R21("GPSDestLongitudeRef", 21, 2), new R21("GPSDestLongitude", 22, 5), new R21("GPSDestBearingRef", 23, 2), new R21("GPSDestBearing", 24, 5), new R21("GPSDestDistanceRef", 25, 2), new R21("GPSDestDistance", 26, 5), new R21("GPSProcessingMethod", 27, 7), new R21("GPSAreaInformation", 28, 7), new R21("GPSDateStamp", 29, 2), new R21("GPSDifferential", 30, 3), new R21("GPSHPositioningError", 31, 5)};
        R21[] r21Arr4 = {new R21("InteroperabilityIndex", 1, 2)};
        R21[] r21Arr5 = {new R21("NewSubfileType", 254, 4), new R21("SubfileType", 255, 4), new R21("ThumbnailImageWidth", 256, 3, 4), new R21("ThumbnailImageLength", 257, 3, 4), new R21("BitsPerSample", 258, 3), new R21("Compression", 259, 3), new R21("PhotometricInterpretation", 262, 3), new R21("ImageDescription", 270, 2), new R21("Make", 271, 2), new R21("Model", 272, 2), new R21("StripOffsets", 273, 3, 4), new R21("ThumbnailOrientation", 274, 3), new R21("SamplesPerPixel", 277, 3), new R21("RowsPerStrip", 278, 3, 4), new R21("StripByteCounts", 279, 3, 4), new R21("XResolution", 282, 5), new R21("YResolution", 283, 5), new R21("PlanarConfiguration", 284, 3), new R21("ResolutionUnit", 296, 3), new R21("TransferFunction", 301, 3), new R21("Software", 305, 2), new R21("DateTime", 306, 2), new R21("Artist", 315, 2), new R21("WhitePoint", 318, 5), new R21("PrimaryChromaticities", 319, 5), new R21("SubIFDPointer", 330, 4), new R21("JPEGInterchangeFormat", 513, 4), new R21("JPEGInterchangeFormatLength", 514, 4), new R21("YCbCrCoefficients", 529, 5), new R21("YCbCrSubSampling", 530, 3), new R21("YCbCrPositioning", 531, 3), new R21("ReferenceBlackWhite", 532, 5), new R21("Copyright", 33432, 2), new R21("ExifIFDPointer", 34665, 4), new R21("GPSInfoIFDPointer", 34853, 4), new R21("DNGVersion", 50706, 1), new R21("DefaultCropSize", 50720, 3, 4)};
        LJJJJI = new R21("StripOffsets", 273, 3);
        LJJJJIZL = new R21[][]{r21Arr, r21Arr2, r21Arr3, r21Arr4, r21Arr5, r21Arr, new R21[]{new R21("ThumbnailImage", 256, 7), new R21("CameraSettingsIFDPointer", 8224, 4), new R21("ImageProcessingIFDPointer", 8256, 4)}, new R21[]{new R21("PreviewImageStart", 257, 4), new R21("PreviewImageLength", 258, 4)}, new R21[]{new R21("AspectFrame", 4371, 3)}, new R21[]{new R21("ColorSpace", 55, 3)}};
        LJJJJJ = new R21[]{new R21("SubIFDPointer", 330, 4), new R21("ExifIFDPointer", 34665, 4), new R21("GPSInfoIFDPointer", 34853, 4), new R21("InteroperabilityIFDPointer", 40965, 4), new R21("CameraSettingsIFDPointer", 8224, 1), new R21("ImageProcessingIFDPointer", 8256, 1)};
        LJJJJJL = new R21("JPEGInterchangeFormat", 513, 4);
        LJJJJL = new R21("JPEGInterchangeFormatLength", 514, 4);
        LJJJJLI = new HashMap[10];
        LJJJJLL = new HashMap[10];
        LJJJJZ = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        LJJJJZI = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        LJJJLIIL = forName;
        LJJJLL = "Exif\u0000\u0000".getBytes(forName);
        LJJJLZIJ = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            R21[][] r21Arr6 = LJJJJIZL;
            if (i < r21Arr6.length) {
                LJJJJLI[i] = new HashMap<>();
                LJJJJLL[i] = new HashMap<>();
                for (R21 r21 : r21Arr6[i]) {
                    LJJJJLI[i].put(Integer.valueOf(r21.LIZ), r21);
                    LJJJJLL[i].put(r21.LIZIZ, r21);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = LJJJJZI;
                R21[] r21Arr7 = LJJJJJ;
                hashMap.put(Integer.valueOf(r21Arr7[0].LIZ), 5);
                hashMap.put(Integer.valueOf(r21Arr7[1].LIZ), 1);
                hashMap.put(Integer.valueOf(r21Arr7[2].LIZ), 2);
                hashMap.put(Integer.valueOf(r21Arr7[3].LIZ), 3);
                hashMap.put(Integer.valueOf(r21Arr7[4].LIZ), 7);
                hashMap.put(Integer.valueOf(r21Arr7[5].LIZ), 8);
                PatternProtector.compile(".*[1-9].*");
                LJJJZ = PatternProtector.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                PatternProtector.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                PatternProtector.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public final void LJJ() {
        int i = 0;
        while (true) {
            HashMap<String, C68888R1w>[] hashMapArr = this.LIZLLL;
            if (i < hashMapArr.length) {
                Iterator<Map.Entry<String, C68888R1w>> it = hashMapArr[i].entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void LJJIJL() {
        LJJIJIIJIL(0, 5);
        LJJIJIIJIL(0, 4);
        LJJIJIIJIL(5, 4);
        C68888R1w c68888R1w = this.LIZLLL[1].get("PixelXDimension");
        C68888R1w c68888R1w2 = this.LIZLLL[1].get("PixelYDimension");
        if (c68888R1w != null && c68888R1w2 != null) {
            this.LIZLLL[0].put("ImageWidth", c68888R1w);
            this.LIZLLL[0].put("ImageLength", c68888R1w2);
        }
        if (this.LIZLLL[4].isEmpty() && LJIJJ(this.LIZLLL[5])) {
            HashMap<String, C68888R1w>[] hashMapArr = this.LIZLLL;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        LJIJJ(this.LIZLLL[4]);
    }

    public final void LIZ() {
        String LJII = LJII("DateTimeOriginal");
        if (LJII != null && LJII("DateTime") == null) {
            this.LIZLLL[0].put("DateTime", C68888R1w.LIZ(LJII));
        }
        if (LJII("ImageWidth") == null) {
            this.LIZLLL[0].put("ImageWidth", C68888R1w.LIZIZ(0L, this.LJFF));
        }
        if (LJII("ImageLength") == null) {
            this.LIZLLL[0].put("ImageLength", C68888R1w.LIZIZ(0L, this.LJFF));
        }
        if (LJII("Orientation") == null) {
            this.LIZLLL[0].put("Orientation", C68888R1w.LIZIZ(0L, this.LJFF));
        }
        if (LJII("LightSource") == null) {
            this.LIZLLL[1].put("LightSource", C68888R1w.LIZIZ(0L, this.LJFF));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] LJIILLIIL() {
        /*
            r9 = this;
            boolean r0 = r9.LJI
            r8 = 0
            if (r0 != 0) goto L6
            return r8
        L6:
            byte[] r0 = r9.LJIIJ
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L75
            if (r0 == 0) goto L18
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L75
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L75
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L75
            r5 = r8
            goto L2a
        L18:
            java.io.FileDescriptor r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L75
            java.io.FileDescriptor r5 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L75
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L6b
            r0 = 0
            android.system.Os.lseek(r5, r0, r2)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L6b
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L6b
            r4.<init>(r5)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L6b
        L2a:
            int r1 = r9.LJIIIIZZ     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            int r0 = r9.LJIIL     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            long r6 = r4.skip(r0)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            int r1 = r9.LJIIIIZZ     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            int r0 = r9.LJIIL     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            int r1 = r1 + r0
            long r1 = (long) r1
            java.lang.String r3 = "Corrupted image"
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L5d
            int r0 = r9.LJIIIZ     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            int r1 = r4.read(r2)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            int r0 = r9.LJIIIZ     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            if (r1 != r0) goto L57
            r9.LJIIJ = r2     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            LIZJ(r4)
            if (r5 == 0) goto L56
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L56
        L56:
            return r2
        L57:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            throw r0     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
        L5d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
            throw r0     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L77
        L63:
            r0 = move-exception
            r8 = r4
            goto L6c
        L66:
            r4 = r8
            goto L77
        L68:
            r0 = move-exception
            r5 = r8
            goto L6c
        L6b:
            r0 = move-exception
        L6c:
            LIZJ(r8)
            if (r5 == 0) goto L74
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L74
        L74:
            throw r0
        L75:
            r4 = r8
            r5 = r8
        L77:
            LIZJ(r4)
            if (r5 == 0) goto L7f
            android.system.Os.close(r5)     // Catch: java.lang.Exception -> L7f
        L7f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68887R1v.LJIILLIIL():byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[Catch: all -> 0x00e8, Exception -> 0x00eb, TryCatch #19 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:59:0x00bb, B:61:0x00bf, B:62:0x00cd, B:66:0x00d2), top: B:58:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[Catch: all -> 0x00e8, Exception -> 0x00eb, TRY_LEAVE, TryCatch #19 {Exception -> 0x00eb, all -> 0x00e8, blocks: (B:59:0x00bb, B:61:0x00bf, B:62:0x00cd, B:66:0x00d2), top: B:58:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68887R1v.LJJIIJ():void");
    }

    public C68887R1v(String str) {
        FileInputStream fileInputStream;
        R21[][] r21Arr = LJJJJIZL;
        this.LIZLLL = new HashMap[r21Arr.length];
        this.LJ = new HashSet(r21Arr.length);
        this.LJFF = ByteOrder.BIG_ENDIAN;
        this.LIZ = str;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.LIZIZ = fileInputStream.getFD();
            } catch (Exception unused) {
                this.LIZIZ = null;
            }
            LJIJJLI(fileInputStream);
            LIZJ(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            LIZJ(fileInputStream2);
            throw th;
        }
    }

    public static String LIZIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(C16880lQ.LLLZ("%02x", new Object[]{Byte.valueOf(b)}));
        }
        return sb.toString();
    }

    public static void LIZJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] LIZLLL(Object obj) {
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

    public static Pair<Integer, Integer> LJIJ(String str) {
        int intValue;
        int i;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> LJIJ2 = LJIJ(split[0]);
            if (((Integer) LJIJ2.first).intValue() == 2) {
                return LJIJ2;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair<Integer, Integer> LJIJ3 = LJIJ(split[i2]);
                if (((Integer) LJIJ3.first).equals(LJIJ2.first) || ((Integer) LJIJ3.second).equals(LJIJ2.first)) {
                    intValue = ((Integer) LJIJ2.first).intValue();
                } else {
                    intValue = -1;
                }
                if (((Integer) LJIJ2.second).intValue() != -1 && (((Integer) LJIJ3.first).equals(LJIJ2.second) || ((Integer) LJIJ3.second).equals(LJIJ2.second))) {
                    i = ((Integer) LJIJ2.second).intValue();
                } else {
                    i = -1;
                }
                if (intValue == -1 && i == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    LJIJ2 = new Pair<>(Integer.valueOf(i), -1);
                } else if (i == -1) {
                    LJIJ2 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return LJIJ2;
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

    public static ByteOrder LJJI(C68889R1x c68889R1x) {
        short readShort = c68889R1x.readShort();
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

    public final String LJII(String str) {
        String str2;
        C68888R1w c68888R1w;
        C68891R1z[] c68891R1zArr;
        if ("ISOSpeedRatings".equals(str)) {
            str2 = "PhotographicSensitivity";
        } else {
            str2 = str;
        }
        int i = 0;
        while (true) {
            if (i < LJJJJIZL.length) {
                c68888R1w = this.LIZLLL[i].get(str2);
                if (c68888R1w != null) {
                    break;
                }
                i++;
            } else {
                c68888R1w = null;
                break;
            }
        }
        if (c68888R1w != null) {
            if (!LJJJJZ.contains(str)) {
                return c68888R1w.LJIIIIZZ(this.LJFF);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = c68888R1w.LIZ;
                if ((i2 != 5 && i2 != 10) || (c68891R1zArr = (C68891R1z[]) c68888R1w.LJIIIZ(this.LJFF)) == null || c68891R1zArr.length != 3) {
                    return null;
                }
                C68891R1z c68891R1z = c68891R1zArr[0];
                C68891R1z c68891R1z2 = c68891R1zArr[1];
                C68891R1z c68891R1z3 = c68891R1zArr[2];
                return C16880lQ.LLLZ("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) c68891R1z.LIZ) / ((float) c68891R1z.LIZIZ))), Integer.valueOf((int) (((float) c68891R1z2.LIZ) / ((float) c68891R1z2.LIZIZ))), Integer.valueOf((int) (((float) c68891R1z3.LIZ) / ((float) c68891R1z3.LIZIZ)))});
            }
            try {
                return Double.toString(c68888R1w.LJI(this.LJFF));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void LJIIIIZZ(C68889R1x c68889R1x) {
        String str;
        String str2;
        String str3;
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new R20(c68889R1x));
            } else {
                FileDescriptor fileDescriptor = this.LIZIZ;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str4 = this.LIZ;
                    if (str4 != null) {
                        mediaMetadataRetriever.setDataSource(str4);
                    } else {
                        return;
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (str != null) {
                this.LIZLLL[0].put("ImageWidth", C68888R1w.LJ(Integer.parseInt(str), this.LJFF));
            }
            if (str2 != null) {
                this.LIZLLL[0].put("ImageLength", C68888R1w.LJ(Integer.parseInt(str2), this.LJFF));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                if (parseInt != 90) {
                    if (parseInt != 180) {
                        if (parseInt != 270) {
                            i = 1;
                        } else {
                            i = 8;
                        }
                    } else {
                        i = 3;
                    }
                } else {
                    i = 6;
                }
                this.LIZLLL[0].put("Orientation", C68888R1w.LJ(i, this.LJFF));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    c68889R1x.LIZ(parseInt2);
                    byte[] bArr = new byte[6];
                    if (c68889R1x.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, LJJJLL)) {
                            byte[] bArr2 = new byte[i3];
                            if (c68889R1x.read(bArr2) == i3) {
                                this.LJIIL = i2;
                                LJJIFFI(0, bArr2);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00b5, code lost:
    
        if (r7 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010d, code lost:
    
        if (0 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e1, code lost:
    
        if (r2 != null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.R1v] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.R1v] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.R1x, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIJ(java.io.BufferedInputStream r17) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68887R1v.LJIIJ(java.io.BufferedInputStream):int");
    }

    public final void LJIIJJI(C68889R1x c68889R1x) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        LJIILJJIL(c68889R1x);
        C68888R1w c68888R1w = this.LIZLLL[1].get("MakerNote");
        if (c68888R1w != null) {
            C68889R1x c68889R1x2 = new C68889R1x(c68888R1w.LIZLLL);
            c68889R1x2.LJLILLLLZI = this.LJFF;
            byte[] bArr = LJJII;
            byte[] bArr2 = new byte[bArr.length];
            c68889R1x2.readFully(bArr2);
            c68889R1x2.LIZ(0L);
            byte[] bArr3 = LJJIII;
            byte[] bArr4 = new byte[bArr3.length];
            c68889R1x2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c68889R1x2.LIZ(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c68889R1x2.LIZ(12L);
            }
            LJJII(c68889R1x2, 6);
            C68888R1w c68888R1w2 = this.LIZLLL[7].get("PreviewImageStart");
            C68888R1w c68888R1w3 = this.LIZLLL[7].get("PreviewImageLength");
            if (c68888R1w2 != null && c68888R1w3 != null) {
                this.LIZLLL[5].put("JPEGInterchangeFormat", c68888R1w2);
                this.LIZLLL[5].put("JPEGInterchangeFormatLength", c68888R1w3);
            }
            C68888R1w c68888R1w4 = this.LIZLLL[8].get("AspectFrame");
            if (c68888R1w4 == null || (iArr = (int[]) c68888R1w4.LJIIIZ(this.LJFF)) == null || iArr.length != 4 || (i = iArr[2]) <= (i2 = iArr[0]) || (i3 = iArr[3]) <= (i4 = iArr[1])) {
                return;
            }
            int i5 = (i - i2) + 1;
            int i6 = (i3 - i4) + 1;
            if (i5 < i6) {
                int i7 = i5 + i6;
                i6 = i7 - i6;
                i5 = i7 - i6;
            }
            C68888R1w LJ = C68888R1w.LJ(i5, this.LJFF);
            C68888R1w LJ2 = C68888R1w.LJ(i6, this.LJFF);
            this.LIZLLL[0].put("ImageWidth", LJ);
            this.LIZLLL[0].put("ImageLength", LJ2);
        }
    }

    public final void LJIIL(C68889R1x c68889R1x) {
        c68889R1x.mark(0);
        c68889R1x.LJLILLLLZI = ByteOrder.BIG_ENDIAN;
        byte[] bArr = LJJIIJ;
        c68889R1x.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c68889R1x.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (c68889R1x.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 != 16 || Arrays.equals(bArr2, LJJIIZ)) {
                        if (!Arrays.equals(bArr2, LJJIIZI)) {
                            if (Arrays.equals(bArr2, LJJIIJZLJL)) {
                                byte[] bArr3 = new byte[readInt];
                                if (c68889R1x.read(bArr3) == readInt) {
                                    int readInt2 = c68889R1x.readInt();
                                    CRC32 crc32 = new CRC32();
                                    crc32.update(bArr2);
                                    crc32.update(bArr3);
                                    if (((int) crc32.getValue()) == readInt2) {
                                        this.LJIIL = i2;
                                        LJJIFFI(0, bArr3);
                                        LJJIJL();
                                        LJJIJIIJI(new C68889R1x(bArr3));
                                        return;
                                    }
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                                    LIZ.append(readInt2);
                                    LIZ.append(", calculated CRC value: ");
                                    LIZ.append(crc32.getValue());
                                    throw new IOException(X1D.LIZIZ(LIZ));
                                }
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Failed to read given length for given PNG chunk type: ");
                                LIZ2.append(LIZIZ(bArr2));
                                throw new IOException(X1D.LIZIZ(LIZ2));
                            }
                            int i3 = readInt + 4;
                            c68889R1x.skipBytes(i3);
                            length = i2 + i3;
                        } else {
                            return;
                        }
                    } else {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void LJIILIIL(C68889R1x c68889R1x) {
        c68889R1x.mark(0);
        c68889R1x.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c68889R1x.read(bArr);
        c68889R1x.read(bArr2);
        c68889R1x.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c68889R1x.LIZ(i);
        c68889R1x.read(bArr4);
        LJIIIZ(new C68889R1x(bArr4), i, 5);
        c68889R1x.LIZ(i3);
        c68889R1x.LJLILLLLZI = ByteOrder.BIG_ENDIAN;
        int readInt = c68889R1x.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c68889R1x.readUnsignedShort();
            int readUnsignedShort2 = c68889R1x.readUnsignedShort();
            if (readUnsignedShort == LJJJJI.LIZ) {
                short readShort = c68889R1x.readShort();
                short readShort2 = c68889R1x.readShort();
                C68888R1w LJ = C68888R1w.LJ(readShort, this.LJFF);
                C68888R1w LJ2 = C68888R1w.LJ(readShort2, this.LJFF);
                this.LIZLLL[0].put("ImageLength", LJ);
                this.LIZLLL[0].put("ImageWidth", LJ2);
                return;
            }
            c68889R1x.skipBytes(readUnsignedShort2);
        }
    }

    public final void LJIILJJIL(C68889R1x c68889R1x) {
        C68888R1w c68888R1w;
        LJIL(c68889R1x, c68889R1x.available());
        LJJII(c68889R1x, 0);
        LJJIJIL(c68889R1x, 0);
        LJJIJIL(c68889R1x, 5);
        LJJIJIL(c68889R1x, 4);
        LJJIJL();
        if (this.LIZJ == 8 && (c68888R1w = this.LIZLLL[1].get("MakerNote")) != null) {
            C68889R1x c68889R1x2 = new C68889R1x(c68888R1w.LIZLLL);
            c68889R1x2.LJLILLLLZI = this.LJFF;
            c68889R1x2.LIZ(6L);
            LJJII(c68889R1x2, 9);
            C68888R1w c68888R1w2 = this.LIZLLL[9].get("ColorSpace");
            if (c68888R1w2 != null) {
                this.LIZLLL[1].put("ColorSpace", c68888R1w2);
            }
        }
    }

    public final void LJIILL(C68889R1x c68889R1x) {
        LJIILJJIL(c68889R1x);
        C68888R1w c68888R1w = this.LIZLLL[0].get("JpgFromRaw");
        if (c68888R1w != null) {
            LJIIIZ(new C68889R1x(c68888R1w.LIZLLL), (int) c68888R1w.LIZJ, 5);
        }
        C68888R1w c68888R1w2 = this.LIZLLL[0].get("ISO");
        C68888R1w c68888R1w3 = this.LIZLLL[1].get("PhotographicSensitivity");
        if (c68888R1w2 != null && c68888R1w3 == null) {
            this.LIZLLL[1].put("PhotographicSensitivity", c68888R1w2);
        }
    }

    public final void LJIIZILJ(C68889R1x c68889R1x) {
        c68889R1x.mark(0);
        c68889R1x.LJLILLLLZI = ByteOrder.LITTLE_ENDIAN;
        c68889R1x.skipBytes(LJJIJ.length);
        int readInt = c68889R1x.readInt() + 8;
        int skipBytes = c68889R1x.skipBytes(LJJIJIIJI.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (c68889R1x.read(bArr) == 4) {
                    int readInt2 = c68889R1x.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(LJJIJIIJIL, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (c68889R1x.read(bArr2) == readInt2) {
                            this.LJIIL = i;
                            LJJIFFI(0, bArr2);
                            LJJIJIIJI(new C68889R1x(bArr2));
                            return;
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Failed to read given length for given PNG chunk type: ");
                            LIZ.append(LIZIZ(bArr));
                            throw new IOException(X1D.LIZIZ(LIZ));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 == readInt) {
                        return;
                    }
                    if (i2 <= readInt) {
                        int skipBytes2 = c68889R1x.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final boolean LJIJJ(HashMap hashMap) {
        C68888R1w c68888R1w = (C68888R1w) hashMap.get("ImageLength");
        C68888R1w c68888R1w2 = (C68888R1w) hashMap.get("ImageWidth");
        if (c68888R1w != null && c68888R1w2 != null) {
            int LJII = c68888R1w.LJII(this.LJFF);
            int LJII2 = c68888R1w2.LJII(this.LJFF);
            if (LJII <= 512 && LJII2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIJJLI(InputStream inputStream) {
        for (int i = 0; i < LJJJJIZL.length; i++) {
            try {
                this.LIZLLL[i] = new HashMap<>();
            } catch (IOException unused) {
                LIZ();
                if (!LJIIZILJ) {
                    return;
                }
            } catch (Throwable th) {
                LIZ();
                if (LJIIZILJ) {
                    LJJ();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.LIZJ = LJIIJ(bufferedInputStream);
        C68889R1x c68889R1x = new C68889R1x(bufferedInputStream);
        switch (this.LIZJ) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJIILJJIL(c68889R1x);
                break;
            case 4:
                LJIIIZ(c68889R1x, 0, 0);
                LIZ();
                if (LJIIZILJ) {
                    LJJ();
                    return;
                }
                return;
            case 7:
                LJIIJJI(c68889R1x);
                break;
            case 9:
                LJIILIIL(c68889R1x);
                LIZ();
                if (LJIIZILJ) {
                    LJJ();
                    return;
                }
                return;
            case 10:
                LJIILL(c68889R1x);
                LIZ();
                if (LJIIZILJ) {
                    LJJ();
                    return;
                }
                return;
            case 12:
                LJIIIIZZ(c68889R1x);
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJIIL(c68889R1x);
                LIZ();
                if (LJIIZILJ) {
                    LJJ();
                    return;
                }
                return;
            case 14:
                LJIIZILJ(c68889R1x);
                LIZ();
                if (LJIIZILJ) {
                    LJJ();
                    return;
                }
                return;
        }
        c68889R1x.LIZ(this.LJIIL);
        LJJIJIIJI(c68889R1x);
        LIZ();
        if (!LJIIZILJ) {
            return;
        }
        LJJ();
    }

    public final void LJJIII(String str) {
        for (int i = 0; i < LJJJJIZL.length; i++) {
            this.LIZLLL[i].remove(str);
        }
    }

    public final void LJJIJ(String str) {
        R21 r21;
        int i;
        C68888R1w c68888R1w;
        String LIZIZ;
        String str2 = str;
        int i2 = 2;
        int i3 = 1;
        if (str2 != null && LJJJJZ.contains("UserComment")) {
            if ("UserComment".equals("GPSTimeStamp")) {
                Matcher matcher = LJJJZ.matcher(str2);
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
                str2 = X1D.LIZIZ(LIZ);
            } else {
                try {
                    str2 = new C68891R1z((long) (CastDoubleProtector.parseDouble(str2) * 10000.0d), 10000L).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        char c = 0;
        int i4 = 0;
        while (i4 < LJJJJIZL.length) {
            if ((i4 != 4 || this.LJI) && (r21 = LJJJJLL[i4].get("UserComment")) != null) {
                if (str2 == null) {
                    this.LIZLLL[i4].remove("UserComment");
                } else {
                    Pair<Integer, Integer> LJIJ2 = LJIJ(str2);
                    if (r21.LIZJ == ((Integer) LJIJ2.first).intValue() || r21.LIZJ == ((Integer) LJIJ2.second).intValue()) {
                        i = r21.LIZJ;
                    } else {
                        int i5 = r21.LIZLLL;
                        if (i5 != -1 && (i5 == ((Integer) LJIJ2.first).intValue() || r21.LIZLLL == ((Integer) LJIJ2.second).intValue())) {
                            i = r21.LIZLLL;
                        } else {
                            i = r21.LIZJ;
                            if (i != i3 && i != 7 && i != i2) {
                                if (LJIIZILJ) {
                                    StringBuilder LIZIZ2 = C25620zW.LIZIZ("Given tag (", "UserComment", ") value didn't match with one of expected formats: ");
                                    String[] strArr = LJJJI;
                                    LIZIZ2.append(strArr[r21.LIZJ]);
                                    String str3 = "";
                                    if (r21.LIZLLL == -1) {
                                        LIZIZ = "";
                                    } else {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append(", ");
                                        LIZ2.append(strArr[r21.LIZLLL]);
                                        LIZIZ = X1D.LIZIZ(LIZ2);
                                    }
                                    LIZIZ2.append(LIZIZ);
                                    LIZIZ2.append(" (guess: ");
                                    LIZIZ2.append(strArr[((Integer) LJIJ2.first).intValue()]);
                                    if (((Integer) LJIJ2.second).intValue() != -1) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append(", ");
                                        LIZ3.append(strArr[((Integer) LJIJ2.second).intValue()]);
                                        str3 = X1D.LIZIZ(LIZ3);
                                    }
                                    C0MT.LJ(LIZIZ2, str3, ")", LIZIZ2);
                                }
                            }
                        }
                    }
                    switch (i) {
                        case 1:
                            HashMap<String, C68888R1w> hashMap = this.LIZLLL[i4];
                            if (str2.length() == 1 && str2.charAt(0) >= '0' && str2.charAt(0) <= '1') {
                                c68888R1w = new C68888R1w(1, new byte[]{(byte) (str2.charAt(0) - '0')}, 1);
                            } else {
                                byte[] bytes = str2.getBytes(LJJJLIIL);
                                c68888R1w = new C68888R1w(1, bytes, bytes.length);
                            }
                            hashMap.put("UserComment", c68888R1w);
                            break;
                        case 2:
                        case 7:
                            if ("UserComment".equals("UserComment")) {
                                HashMap<String, C68888R1w> hashMap2 = this.LIZLLL[i4];
                                byte[] bytes2 = C42398GkU.LIZIZ(str2, c).getBytes(LJJJLIIL);
                                byte[] bArr = LJJJJ;
                                int length = bArr.length + bytes2.length;
                                byte[] bArr2 = new byte[length];
                                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                                System.arraycopy(bytes2, 0, bArr2, bArr.length, bytes2.length);
                                hashMap2.put("UserComment", new C68888R1w(7, bArr2, length));
                                break;
                            } else {
                                this.LIZLLL[i4].put("UserComment", C68888R1w.LIZ(str2));
                                break;
                            }
                        case 3:
                            String[] split = str2.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i6 = c; i6 < split.length; i6++) {
                                iArr[i6] = CastIntegerProtector.parseInt(split[i6]);
                            }
                            this.LIZLLL[i4].put("UserComment", C68888R1w.LJFF(iArr, this.LJFF));
                            break;
                        case 4:
                            String[] split2 = str2.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i7 = c; i7 < split2.length; i7++) {
                                jArr[i7] = CastLongProtector.parseLong(split2[i7]);
                            }
                            this.LIZLLL[i4].put("UserComment", C68888R1w.LIZJ(jArr, this.LJFF));
                            break;
                        case 5:
                            String[] split3 = str2.split(",", -1);
                            C68891R1z[] c68891R1zArr = new C68891R1z[split3.length];
                            for (int i8 = c; i8 < split3.length; i8++) {
                                String[] split4 = split3[i8].split("/", -1);
                                c68891R1zArr[i8] = new C68891R1z((long) CastDoubleProtector.parseDouble(split4[0]), (long) CastDoubleProtector.parseDouble(split4[1]));
                            }
                            this.LIZLLL[i4].put("UserComment", C68888R1w.LIZLLL(c68891R1zArr, this.LJFF));
                            break;
                        case 9:
                            String[] split5 = str2.split(",", -1);
                            int length2 = split5.length;
                            int[] iArr2 = new int[length2];
                            for (int i9 = 0; i9 < split5.length; i9++) {
                                iArr2[i9] = CastIntegerProtector.parseInt(split5[i9]);
                            }
                            HashMap<String, C68888R1w> hashMap3 = this.LIZLLL[i4];
                            ByteOrder byteOrder = this.LJFF;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[LJJJIL[9] * length2]);
                            wrap.order(byteOrder);
                            for (int i10 = 0; i10 < length2; i10++) {
                                wrap.putInt(iArr2[i10]);
                            }
                            hashMap3.put("UserComment", new C68888R1w(9, wrap.array(), length2));
                            break;
                        case 10:
                            String[] split6 = str2.split(",", -1);
                            int length3 = split6.length;
                            C68891R1z[] c68891R1zArr2 = new C68891R1z[length3];
                            int i11 = 0;
                            char c2 = c;
                            while (i11 < split6.length) {
                                String[] split7 = split6[i11].split("/", -1);
                                c68891R1zArr2[i11] = new C68891R1z((long) CastDoubleProtector.parseDouble(split7[c2]), (long) CastDoubleProtector.parseDouble(split7[i3]));
                                i11++;
                                i3 = 1;
                                c2 = 0;
                            }
                            HashMap<String, C68888R1w> hashMap4 = this.LIZLLL[i4];
                            ByteOrder byteOrder2 = this.LJFF;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[LJJJIL[10] * length3]);
                            wrap2.order(byteOrder2);
                            for (int i12 = 0; i12 < length3; i12++) {
                                C68891R1z c68891R1z = c68891R1zArr2[i12];
                                wrap2.putInt((int) c68891R1z.LIZ);
                                wrap2.putInt((int) c68891R1z.LIZIZ);
                            }
                            hashMap4.put("UserComment", new C68888R1w(10, wrap2.array(), length3));
                            break;
                        case 12:
                            String[] split8 = str2.split(",", -1);
                            int length4 = split8.length;
                            double[] dArr = new double[length4];
                            for (int i13 = 0; i13 < split8.length; i13++) {
                                dArr[i13] = CastDoubleProtector.parseDouble(split8[i13]);
                            }
                            HashMap<String, C68888R1w> hashMap5 = this.LIZLLL[i4];
                            ByteOrder byteOrder3 = this.LJFF;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[LJJJIL[12] * length4]);
                            wrap3.order(byteOrder3);
                            for (int i14 = 0; i14 < length4; i14++) {
                                wrap3.putDouble(dArr[i14]);
                            }
                            hashMap5.put("UserComment", new C68888R1w(12, wrap3.array(), length4));
                            break;
                    }
                }
            }
            i4++;
            i2 = 2;
            i3 = 1;
            c = 0;
        }
    }

    public final void LJJIJIIJI(C68889R1x c68889R1x) {
        C68888R1w c68888R1w;
        HashMap<String, C68888R1w> hashMap = this.LIZLLL[4];
        C68888R1w c68888R1w2 = hashMap.get("Compression");
        if (c68888R1w2 != null) {
            int LJII = c68888R1w2.LJII(this.LJFF);
            this.LJIIJJI = LJII;
            if (LJII != 1) {
                if (LJII != 6) {
                    if (LJII != 7) {
                        return;
                    }
                } else {
                    LJIJI(c68889R1x, hashMap);
                    return;
                }
            }
            C68888R1w c68888R1w3 = hashMap.get("BitsPerSample");
            if (c68888R1w3 == null) {
                return;
            }
            int[] iArr = (int[]) c68888R1w3.LJIIIZ(this.LJFF);
            int[] iArr2 = LJIJJ;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.LIZJ != 3 || (c68888R1w = hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int LJII2 = c68888R1w.LJII(this.LJFF);
                if (LJII2 == 1) {
                    if (!Arrays.equals(iArr, LJIJJLI)) {
                        return;
                    }
                } else if (LJII2 != 6 || !Arrays.equals(iArr, iArr2)) {
                    return;
                }
            }
            C68888R1w c68888R1w4 = hashMap.get("StripOffsets");
            C68888R1w c68888R1w5 = hashMap.get("StripByteCounts");
            if (c68888R1w4 == null || c68888R1w5 == null) {
                return;
            }
            long[] LIZLLL = LIZLLL(c68888R1w4.LJIIIZ(this.LJFF));
            long[] LIZLLL2 = LIZLLL(c68888R1w5.LJIIIZ(this.LJFF));
            if (LIZLLL == null || LIZLLL.length == 0 || LIZLLL2 == null || LIZLLL2.length == 0 || LIZLLL.length != LIZLLL2.length) {
                return;
            }
            long j = 0;
            for (long j2 : LIZLLL2) {
                j += j2;
            }
            int i = (int) j;
            byte[] bArr = new byte[i];
            this.LJII = true;
            this.LJI = true;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < LIZLLL.length; i4++) {
                int i5 = (int) LIZLLL[i4];
                int i6 = (int) LIZLLL2[i4];
                if (i4 < LIZLLL.length - 1 && i5 + i6 != LIZLLL[i4 + 1]) {
                    this.LJII = false;
                }
                int i7 = i5 - i2;
                if (i7 < 0) {
                    return;
                }
                long j3 = i7;
                if (c68889R1x.skip(j3) != j3) {
                    return;
                }
                int i8 = i2 + i7;
                byte[] bArr2 = new byte[i6];
                if (c68889R1x.read(bArr2) != i6) {
                    return;
                }
                i2 = i8 + i6;
                System.arraycopy(bArr2, 0, bArr, i3, i6);
                i3 += i6;
            }
            this.LJIIJ = bArr;
            if (!this.LJII) {
                return;
            }
            this.LJIIIIZZ = (int) LIZLLL[0];
            this.LJIIIZ = i;
            return;
        }
        this.LJIIJJI = 6;
        LJIJI(c68889R1x, hashMap);
    }

    public final void LJJIJLIJ(C68890R1y c68890R1y) {
        short s;
        R21[][] r21Arr = LJJJJIZL;
        int[] iArr = new int[r21Arr.length];
        int[] iArr2 = new int[r21Arr.length];
        for (R21 r21 : LJJJJJ) {
            LJJIII(r21.LIZIZ);
        }
        LJJIII(LJJJJJL.LIZIZ);
        LJJIII(LJJJJL.LIZIZ);
        for (int i = 0; i < LJJJJIZL.length; i++) {
            for (Object obj : this.LIZLLL[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.LIZLLL[i].remove(entry.getKey());
                }
            }
        }
        if (!this.LIZLLL[1].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[1].LIZIZ, C68888R1w.LIZIZ(0L, this.LJFF));
        }
        if (!this.LIZLLL[2].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[2].LIZIZ, C68888R1w.LIZIZ(0L, this.LJFF));
        }
        if (!this.LIZLLL[3].isEmpty()) {
            this.LIZLLL[1].put(LJJJJJ[3].LIZIZ, C68888R1w.LIZIZ(0L, this.LJFF));
        }
        if (this.LJI) {
            this.LIZLLL[4].put(LJJJJJL.LIZIZ, C68888R1w.LIZIZ(0L, this.LJFF));
            this.LIZLLL[4].put(LJJJJL.LIZIZ, C68888R1w.LIZIZ(this.LJIIIZ, this.LJFF));
        }
        for (int i2 = 0; i2 < LJJJJIZL.length; i2++) {
            Iterator<Map.Entry<String, C68888R1w>> it = this.LIZLLL[i2].entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                C68888R1w value = it.next().getValue();
                value.getClass();
                int i4 = LJJJIL[value.LIZ] * value.LIZIZ;
                if (i4 > 4) {
                    i3 += i4;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i5 = 8;
        for (int i6 = 0; i6 < LJJJJIZL.length; i6++) {
            if (!this.LIZLLL[i6].isEmpty()) {
                iArr[i6] = i5;
                i5 = (this.LIZLLL[i6].size() * 12) + 2 + 4 + iArr2[i6] + i5;
            }
        }
        if (this.LJI) {
            this.LIZLLL[4].put(LJJJJJL.LIZIZ, C68888R1w.LIZIZ(i5, this.LJFF));
            this.LJIIIIZZ = i5;
            i5 += this.LJIIIZ;
        }
        if (this.LIZJ == 4) {
            i5 += 8;
        }
        if (LJIIZILJ) {
            for (int i7 = 0; i7 < LJJJJIZL.length; i7++) {
            }
        }
        if (!this.LIZLLL[1].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[1].LIZIZ, C68888R1w.LIZIZ(iArr[1], this.LJFF));
        }
        if (!this.LIZLLL[2].isEmpty()) {
            this.LIZLLL[0].put(LJJJJJ[2].LIZIZ, C68888R1w.LIZIZ(iArr[2], this.LJFF));
        }
        if (!this.LIZLLL[3].isEmpty()) {
            this.LIZLLL[1].put(LJJJJJ[3].LIZIZ, C68888R1w.LIZIZ(iArr[3], this.LJFF));
        }
        int i8 = this.LIZJ;
        if (i8 != 4) {
            if (i8 != 13) {
                if (i8 == 14) {
                    c68890R1y.write(LJJIJIIJIL);
                    c68890R1y.LIZIZ(i5);
                }
            } else {
                c68890R1y.LIZIZ(i5);
                c68890R1y.write(LJJIIJZLJL);
            }
        } else {
            c68890R1y.LIZJ((short) i5);
            c68890R1y.write(LJJJLL);
        }
        if (this.LJFF == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c68890R1y.LIZJ(s);
        c68890R1y.LJLILLLLZI = this.LJFF;
        c68890R1y.LIZJ((short) 42);
        c68890R1y.LIZIZ((int) 8);
        for (int i9 = 0; i9 < LJJJJIZL.length; i9++) {
            if (!this.LIZLLL[i9].isEmpty()) {
                c68890R1y.LIZJ((short) this.LIZLLL[i9].size());
                int size = (this.LIZLLL[i9].size() * 12) + iArr[i9] + 2 + 4;
                for (Map.Entry<String, C68888R1w> entry2 : this.LIZLLL[i9].entrySet()) {
                    int i10 = LJJJJLL[i9].get(entry2.getKey()).LIZ;
                    C68888R1w value2 = entry2.getValue();
                    value2.getClass();
                    int i11 = LJJJIL[value2.LIZ] * value2.LIZIZ;
                    c68890R1y.LIZJ((short) i10);
                    c68890R1y.LIZJ((short) value2.LIZ);
                    c68890R1y.LIZIZ(value2.LIZIZ);
                    if (i11 > 4) {
                        c68890R1y.LIZIZ(size);
                        size += i11;
                    } else {
                        c68890R1y.write(value2.LIZLLL);
                        if (i11 < 4) {
                            do {
                                c68890R1y.LIZ(0);
                                i11++;
                            } while (i11 < 4);
                        }
                    }
                }
                if (i9 == 0 && !this.LIZLLL[4].isEmpty()) {
                    c68890R1y.LIZIZ(iArr[4]);
                } else {
                    c68890R1y.LIZIZ((int) 0);
                }
                Iterator<Map.Entry<String, C68888R1w>> it2 = this.LIZLLL[i9].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().LIZLLL;
                    if (bArr.length > 4) {
                        c68890R1y.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.LJI) {
            c68890R1y.write(LJIILLIIL());
        }
        if (this.LIZJ == 14 && i5 % 2 == 1) {
            c68890R1y.LIZ(0);
        }
        c68890R1y.LJLILLLLZI = ByteOrder.BIG_ENDIAN;
    }

    public static void LJ(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public final void LJIJI(C68889R1x c68889R1x, HashMap hashMap) {
        C68888R1w c68888R1w = (C68888R1w) hashMap.get("JPEGInterchangeFormat");
        C68888R1w c68888R1w2 = (C68888R1w) hashMap.get("JPEGInterchangeFormatLength");
        if (c68888R1w != null && c68888R1w2 != null) {
            int LJII = c68888R1w.LJII(this.LJFF);
            int LJII2 = c68888R1w2.LJII(this.LJFF);
            if (this.LIZJ == 7) {
                LJII += this.LJIILIIL;
            }
            int min = Math.min(LJII2, c68889R1x.LJLJI - LJII);
            if (LJII > 0 && min > 0) {
                this.LJI = true;
                if (this.LIZ == null && this.LIZIZ == null) {
                    byte[] bArr = new byte[min];
                    c68889R1x.skip(LJII);
                    c68889R1x.read(bArr);
                    this.LJIIJ = bArr;
                }
                this.LJIIIIZZ = LJII;
                this.LJIIIZ = min;
            }
        }
    }

    public final void LJIL(C68889R1x c68889R1x, int i) {
        ByteOrder LJJI2 = LJJI(c68889R1x);
        this.LJFF = LJJI2;
        c68889R1x.LJLILLLLZI = LJJI2;
        int readUnsignedShort = c68889R1x.readUnsignedShort();
        int i2 = this.LIZJ;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = c68889R1x.readInt();
            if (readInt >= 8 && readInt < i) {
                int i3 = readInt - 8;
                if (i3 <= 0 || c68889R1x.skipBytes(i3) == i3) {
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

    public final void LJJIFFI(int i, byte[] bArr) {
        C68889R1x c68889R1x = new C68889R1x(bArr);
        LJIL(c68889R1x, bArr.length);
        LJJII(c68889R1x, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00bb, code lost:
    
        if (r1 != 4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00c2, code lost:
    
        if (r3 == 9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00c4, code lost:
    
        if (r1 == 9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00cd, code lost:
    
        if (r3 == 12) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00cf, code lost:
    
        if (r1 == 12) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00d3, code lost:
    
        if (r7 == 11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00c8, code lost:
    
        if (r7 == 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00bd, code lost:
    
        if (r7 != 3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00b5, code lost:
    
        if (r7 == 7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(X.C68889R1x r28, int r29) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68887R1v.LJJII(X.R1x, int):void");
    }

    public final void LJJIIJZLJL(InputStream inputStream, OutputStream outputStream) {
        C68888R1w c68888R1w;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C68890R1y c68890R1y = new C68890R1y(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            c68890R1y.LIZ(-1);
            if (dataInputStream.readByte() == -40) {
                c68890R1y.LIZ(-40);
                if (LJII("Xmp") != null && this.LJIILLIIL) {
                    c68888R1w = this.LIZLLL[0].remove("Xmp");
                } else {
                    c68888R1w = null;
                }
                c68890R1y.LIZ(-1);
                c68890R1y.LIZ(-31);
                LJJIJLIJ(c68890R1y);
                if (c68888R1w != null) {
                    this.LIZLLL[0].put("Xmp", c68888R1w);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            c68890R1y.LIZ(-1);
                            c68890R1y.LIZ(readByte);
                            int readUnsignedShort = dataInputStream.readUnsignedShort();
                            c68890R1y.LIZJ((short) readUnsignedShort);
                            int i = readUnsignedShort - 2;
                            if (i >= 0) {
                                while (i > 0) {
                                    int read = dataInputStream.read(bArr, 0, Math.min(i, 4096));
                                    if (read >= 0) {
                                        c68890R1y.write(bArr, 0, read);
                                        i -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                            if (readUnsignedShort2 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (readUnsignedShort2 >= 6) {
                                    if (dataInputStream.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, LJJJLL)) {
                                            int i2 = readUnsignedShort2 - 6;
                                            if (dataInputStream.skipBytes(i2) != i2) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                c68890R1y.LIZ(-1);
                                c68890R1y.LIZ(readByte);
                                c68890R1y.LIZJ((short) (readUnsignedShort2 + 2));
                                if (readUnsignedShort2 >= 6) {
                                    readUnsignedShort2 -= 6;
                                    c68890R1y.write(bArr2);
                                }
                                while (readUnsignedShort2 > 0) {
                                    int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                    if (read2 >= 0) {
                                        c68890R1y.write(bArr, 0, read2);
                                        readUnsignedShort2 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c68890R1y.LIZ(-1);
                        c68890R1y.LIZ(readByte);
                        LJ(dataInputStream, c68890R1y);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void LJJIIZ(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C68890R1y c68890R1y = new C68890R1y(outputStream, byteOrder);
        byte[] bArr = LJJIIJ;
        LJFF(dataInputStream, c68890R1y, bArr.length);
        int i = this.LJIIL;
        if (i == 0) {
            int readInt = dataInputStream.readInt();
            c68890R1y.LIZIZ(readInt);
            LJFF(dataInputStream, c68890R1y, readInt + 4 + 4);
        } else {
            LJFF(dataInputStream, c68890R1y, ((i - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
        }
        try {
            C68890R1y c68890R1y2 = new C68890R1y(byteArrayOutputStream, byteOrder);
            LJJIJLIJ(c68890R1y2);
            byte[] byteArray = ((ByteArrayOutputStream) c68890R1y2.LJLIL).toByteArray();
            c68890R1y.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c68890R1y.LIZIZ((int) crc32.getValue());
            LIZJ(byteArrayOutputStream);
            LJ(dataInputStream, c68890R1y);
        } catch (Throwable th2) {
            th = th2;
            LIZJ(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x018a A[Catch: Exception -> 0x01d1, all -> 0x01e0, TryCatch #4 {Exception -> 0x01d1, all -> 0x01e0, blocks: (B:6:0x0025, B:8:0x0030, B:9:0x0048, B:13:0x005e, B:15:0x0066, B:17:0x0073, B:19:0x007b, B:20:0x007f, B:23:0x0091, B:25:0x009c, B:26:0x00a1, B:35:0x00ae, B:28:0x00b2, B:30:0x00c0, B:32:0x00c2, B:36:0x00c6, B:38:0x00d2, B:40:0x00da, B:42:0x00e2, B:44:0x00ea, B:45:0x00ee, B:47:0x00f9, B:49:0x0104, B:51:0x010c, B:53:0x013e, B:55:0x018a, B:56:0x0195, B:57:0x019d, B:59:0x01a5, B:60:0x01b9, B:61:0x01c0, B:62:0x011c, B:64:0x0124, B:66:0x012a, B:67:0x01c1, B:68:0x01c8, B:71:0x01c9, B:72:0x01d0), top: B:5:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d A[Catch: Exception -> 0x01d1, all -> 0x01e0, TryCatch #4 {Exception -> 0x01d1, all -> 0x01e0, blocks: (B:6:0x0025, B:8:0x0030, B:9:0x0048, B:13:0x005e, B:15:0x0066, B:17:0x0073, B:19:0x007b, B:20:0x007f, B:23:0x0091, B:25:0x009c, B:26:0x00a1, B:35:0x00ae, B:28:0x00b2, B:30:0x00c0, B:32:0x00c2, B:36:0x00c6, B:38:0x00d2, B:40:0x00da, B:42:0x00e2, B:44:0x00ea, B:45:0x00ee, B:47:0x00f9, B:49:0x0104, B:51:0x010c, B:53:0x013e, B:55:0x018a, B:56:0x0195, B:57:0x019d, B:59:0x01a5, B:60:0x01b9, B:61:0x01c0, B:62:0x011c, B:64:0x0124, B:66:0x012a, B:67:0x01c1, B:68:0x01c8, B:71:0x01c9, B:72:0x01d0), top: B:5:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(java.io.InputStream r20, java.io.OutputStream r21) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68887R1v.LJJIIZI(java.io.InputStream, java.io.OutputStream):void");
    }

    public final void LJJIJIIJIL(int i, int i2) {
        if (this.LIZLLL[i].isEmpty() || this.LIZLLL[i2].isEmpty()) {
            return;
        }
        C68888R1w c68888R1w = this.LIZLLL[i].get("ImageLength");
        C68888R1w c68888R1w2 = this.LIZLLL[i].get("ImageWidth");
        C68888R1w c68888R1w3 = this.LIZLLL[i2].get("ImageLength");
        C68888R1w c68888R1w4 = this.LIZLLL[i2].get("ImageWidth");
        if (c68888R1w == null || c68888R1w2 == null || c68888R1w3 == null || c68888R1w4 == null) {
            return;
        }
        int LJII = c68888R1w.LJII(this.LJFF);
        int LJII2 = c68888R1w2.LJII(this.LJFF);
        int LJII3 = c68888R1w3.LJII(this.LJFF);
        int LJII4 = c68888R1w4.LJII(this.LJFF);
        if (LJII >= LJII3 || LJII2 >= LJII4) {
            return;
        }
        HashMap<String, C68888R1w>[] hashMapArr = this.LIZLLL;
        HashMap<String, C68888R1w> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void LJJIJIL(C68889R1x c68889R1x, int i) {
        C68888R1w LJ;
        C68888R1w LJ2;
        C68888R1w c68888R1w = this.LIZLLL[i].get("DefaultCropSize");
        C68888R1w c68888R1w2 = this.LIZLLL[i].get("SensorTopBorder");
        C68888R1w c68888R1w3 = this.LIZLLL[i].get("SensorLeftBorder");
        C68888R1w c68888R1w4 = this.LIZLLL[i].get("SensorBottomBorder");
        C68888R1w c68888R1w5 = this.LIZLLL[i].get("SensorRightBorder");
        if (c68888R1w != null) {
            if (c68888R1w.LIZ == 5) {
                C68891R1z[] c68891R1zArr = (C68891R1z[]) c68888R1w.LJIIIZ(this.LJFF);
                if (c68891R1zArr == null || c68891R1zArr.length != 2) {
                    return;
                }
                LJ = C68888R1w.LIZLLL(new C68891R1z[]{c68891R1zArr[0]}, this.LJFF);
                LJ2 = C68888R1w.LIZLLL(new C68891R1z[]{c68891R1zArr[1]}, this.LJFF);
            } else {
                int[] iArr = (int[]) c68888R1w.LJIIIZ(this.LJFF);
                if (iArr == null || iArr.length != 2) {
                    return;
                }
                LJ = C68888R1w.LJ(iArr[0], this.LJFF);
                LJ2 = C68888R1w.LJ(iArr[1], this.LJFF);
            }
            this.LIZLLL[i].put("ImageWidth", LJ);
            this.LIZLLL[i].put("ImageLength", LJ2);
            return;
        }
        if (c68888R1w2 != null && c68888R1w3 != null && c68888R1w4 != null && c68888R1w5 != null) {
            int LJII = c68888R1w2.LJII(this.LJFF);
            int LJII2 = c68888R1w4.LJII(this.LJFF);
            int LJII3 = c68888R1w5.LJII(this.LJFF);
            int LJII4 = c68888R1w3.LJII(this.LJFF);
            if (LJII2 > LJII && LJII3 > LJII4) {
                C68888R1w LJ3 = C68888R1w.LJ(LJII2 - LJII, this.LJFF);
                C68888R1w LJ4 = C68888R1w.LJ(LJII3 - LJII4, this.LJFF);
                this.LIZLLL[i].put("ImageLength", LJ3);
                this.LIZLLL[i].put("ImageWidth", LJ4);
                return;
            }
            return;
        }
        C68888R1w c68888R1w6 = this.LIZLLL[i].get("ImageLength");
        C68888R1w c68888R1w7 = this.LIZLLL[i].get("ImageWidth");
        if (c68888R1w6 == null || c68888R1w7 == null) {
            C68888R1w c68888R1w8 = this.LIZLLL[i].get("JPEGInterchangeFormat");
            C68888R1w c68888R1w9 = this.LIZLLL[i].get("JPEGInterchangeFormatLength");
            if (c68888R1w8 != null && c68888R1w9 != null) {
                int LJII5 = c68888R1w8.LJII(this.LJFF);
                int LJII6 = c68888R1w8.LJII(this.LJFF);
                c68889R1x.LIZ(LJII5);
                byte[] bArr = new byte[LJII6];
                c68889R1x.read(bArr);
                LJIIIZ(new C68889R1x(bArr), LJII5, i);
            }
        }
    }

    public static void LJFF(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (i > 0) {
            int min = Math.min(i, FileUtils.BUFFER_SIZE);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0036, code lost:
    
        r19.LJLILLLLZI = r18.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x004f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0052. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0055. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0058. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[LOOP:0: B:6:0x001d->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C68889R1x r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68887R1v.LJIIIZ(X.R1x, int, int):void");
    }

    public static void LJI(C68889R1x c68889R1x, C68890R1y c68890R1y, byte[] bArr, byte[] bArr2) {
        String LIZIZ;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c68889R1x.read(bArr3) != 4) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = LJJJLIIL;
                LIZ.append(new String(bArr, charset));
                if (bArr2 == null) {
                    LIZIZ = "";
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(" or ");
                    LIZ2.append(new String(bArr2, charset));
                    LIZIZ = X1D.LIZIZ(LIZ2);
                }
                LIZ.append(LIZIZ);
                throw new IOException(X1D.LIZIZ(LIZ));
            }
            int readInt = c68889R1x.readInt();
            c68890R1y.write(bArr3);
            c68890R1y.LIZIZ(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            LJFF(c68889R1x, c68890R1y, readInt);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
