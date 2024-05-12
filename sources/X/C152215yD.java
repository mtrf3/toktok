package X;

import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.util.LruCache;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.vesdk.VEUtils;
import java.io.FileInputStream;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.5yD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152215yD {
    public static final C152215yD LIZ = new C152215yD();
    public static final LruCache<String, C145735nl> LIZIZ = new LruCache<>(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
    public static final byte[] LIZJ;
    public static final byte[] LIZLLL;
    public static final byte[][] LJ;

    static {
        new LruCache(LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        LIZJ = new byte[]{82, 73, 70, 70};
        LIZLLL = new byte[]{87, 69, 66, 80};
        LJ = new byte[][]{new byte[]{-1, -40}, new byte[]{-119, 80, 78, 71, XC5.LJFF, 10, 26, 10}, new byte[]{71, 73, 70, 56, 55, 97}, new byte[]{71, 73, 70, 56, 57, 97}, new byte[]{66, 77}, new byte[]{0, 0, 0, 24, 102, 116, 121, 112, 104, 101, 105, 99}};
    }

    public static boolean LIZIZ(String path) {
        byte[] bArr;
        o.LJIIIZ(path, "path");
        if (!F9B.LIZ(path)) {
            return false;
        }
        try {
            bArr = new byte[12];
            FileInputStream fileInputStream = new FileInputStream(path);
            try {
                fileInputStream.read(bArr);
                AnonymousClass636.LJFF(fileInputStream, null);
            } finally {
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isImage ");
            LIZ2.append(path);
            LIZ2.append(" error ");
            LIZ2.append(e);
            C131935Ft.LIZLLL("MediaUtil", X1D.LIZIZ(LIZ2));
        }
        if (Arrays.equals(LIZJ, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(0, 4))) && Arrays.equals(LIZLLL, ORY.LJJLIIIJJI(bArr, C78842Uww.LJJ(8, 12)))) {
            return true;
        }
        for (byte[] bArr2 : LJ) {
            o.LJIIIZ(bArr2, "<this>");
            if (Arrays.equals(bArr2, ORY.LJJLIIIJJI(bArr, new C40517FvF(0, bArr2.length - 1)))) {
                return true;
            }
        }
        C131935Ft.LIZIZ("MediaUtil", "file header: " + ORY.LJJJJJL(bArr, " ", ORA.LJLIL));
        return false;
    }

    public final synchronized C145735nl LIZ(String path) {
        C145735nl c145735nl;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o.LJIIIZ(path, "path");
        c145735nl = LIZIZ.get(path);
        if (c145735nl == null) {
            if (LIZIZ(path)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(path, options);
                int LIZ2 = C152225yE.LIZ(path);
                Size size = new Size(options.outWidth, options.outHeight);
                c145735nl = new C145735nl(path, size.getWidth(), size.getHeight(), LIZ2, 60000, 0, 0, "image", 1504);
            } else {
                int[] iArr = new int[11];
                int videoFileInfo = VEUtils.getVideoFileInfo(path, iArr);
                if (videoFileInfo == 0 && iArr[0] > 0 && iArr[1] > 0 && iArr[10] > 0) {
                    int i7 = iArr[0];
                    int i8 = iArr[1];
                    int i9 = iArr[2];
                    int i10 = iArr[10];
                    int i11 = iArr[6];
                    int i12 = iArr[7];
                    int i13 = iArr[8];
                    int i14 = iArr[3];
                    String videoEncodeTypeByID = VEUtils.getVideoEncodeTypeByID(i13);
                    o.LJIIIIZZ(videoEncodeTypeByID, "getVideoEncodeTypeByID(veInfo[8])");
                    c145735nl = new C145735nl(i7, i8, i9, i10, i11, i12, i13, i14, iArr[9], path, videoEncodeTypeByID);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("VEUtils.getVideoFileInfo ");
                    LIZ3.append(path);
                    LIZ3.append(": ");
                    LIZ3.append(videoFileInfo);
                    C131935Ft.LIZLLL("MediaUtil", X1D.LIZIZ(LIZ3));
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(path);
                            String LIZIZ2 = HOT.LIZIZ(mediaMetadataRetriever);
                            if (LIZIZ2 != null) {
                                i = Integer.parseInt(LIZIZ2);
                            } else {
                                i = 0;
                            }
                            String LIZ4 = HOT.LIZ(mediaMetadataRetriever);
                            if (LIZ4 != null) {
                                i2 = Integer.parseInt(LIZ4);
                            } else {
                                i2 = 0;
                            }
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                            if (extractMetadata != null) {
                                i3 = Integer.parseInt(extractMetadata);
                            } else {
                                i3 = 0;
                            }
                            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(9);
                            if (extractMetadata2 != null) {
                                i4 = Integer.parseInt(extractMetadata2);
                            } else {
                                i4 = 0;
                            }
                            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
                            if (extractMetadata3 != null) {
                                i5 = Integer.parseInt(extractMetadata3);
                            } else {
                                i5 = 0;
                            }
                            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(25);
                            if (extractMetadata4 != null) {
                                i6 = Integer.parseInt(extractMetadata4);
                            } else {
                                i6 = 0;
                            }
                            String extractMetadata5 = mediaMetadataRetriever.extractMetadata(12);
                            if (extractMetadata5 == null) {
                                extractMetadata5 = "unknown";
                            }
                            c145735nl = new C145735nl(path, i, i2, i3, i4, i5, i6, extractMetadata5, 1408);
                        } catch (Exception e) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("MediaMetadataRetriever ");
                            LIZ5.append(path);
                            LIZ5.append("   ");
                            LIZ5.append(e);
                            C131935Ft.LIZLLL("MediaUtil", X1D.LIZIZ(LIZ5));
                            c145735nl = new C145735nl(path, 0, 0, 0, 0, 0, 0, null, 2016);
                        }
                        mediaMetadataRetriever.release();
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        throw th;
                    }
                }
            }
            LIZIZ.put(path, c145735nl);
        }
        return c145735nl;
    }
}
