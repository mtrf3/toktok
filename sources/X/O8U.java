package X;

import Y.ARunnableS8S0201000_5;
import Y.IDRunnableS6S0101000;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8U extends PthreadAsyncTask<Void, Void, Void> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final String LIZ;
    public final boolean LIZIZ;
    public long LIZJ;
    public MessageDigest LIZLLL;
    public long LJ = -1;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;

    public final byte[] LIZ() {
        long nextLong;
        long j;
        int i;
        int i2;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(5);
        byte[] array = allocate.array();
        byte[] bArr = new byte[4];
        new Random().nextBytes(bArr);
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(this.LJFF);
        byte[] array2 = allocate2.array();
        Long valueOf2 = Long.valueOf(System.currentTimeMillis());
        ByteBuffer allocate3 = ByteBuffer.allocate(8);
        allocate3.putLong(valueOf2.longValue());
        byte[] array3 = allocate3.array();
        SecureRandom secureRandom = new SecureRandom();
        do {
            nextLong = (secureRandom.nextLong() << 1) >>> 1;
            j = nextLong % 8999999999L;
        } while ((nextLong - j) + 8999999998L < 0);
        long j2 = j + 1000000000;
        if (j2 == -1) {
            return null;
        }
        this.LIZJ = j2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("random number :");
        LIZ.append(j2);
        X1D.LIZIZ(LIZ);
        if (new Random().nextInt(2) == 0) {
            this.LIZLLL = MessageDigest.getInstance("SHA-256");
            i = 2;
            i2 = 0;
        } else {
            this.LIZLLL = MessageDigest.getInstance("SHA-512");
            i = 3;
            i2 = 1;
        }
        int i3 = Build.VERSION.SDK_INT | LiveLayoutPreloadThreadPriority.DEFAULT;
        ByteBuffer allocate4 = ByteBuffer.allocate(4);
        allocate4.putInt(i3);
        byte[] array4 = allocate4.array();
        ByteBuffer allocate5 = ByteBuffer.allocate(4);
        allocate5.putInt(this.LJI);
        byte[] array5 = allocate5.array();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(array);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(array2);
        byteArrayOutputStream.write(array3);
        byte[] bArr2 = new byte[8];
        int i4 = 7;
        do {
            bArr2[i4] = (byte) (255 & j2);
            j2 >>= 8;
            i4--;
        } while (i4 >= 0);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(array5);
        byteArrayOutputStream.write(array4);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("packetToDigest: ");
        char[] cArr = new char[byteArray.length * 2];
        for (int i5 = 0; i5 < byteArray.length; i5++) {
            int i6 = byteArray[i5] & 255;
            int i7 = i5 * 2;
            char[] cArr2 = O8V.LIZ;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        LIZ2.append(new String(cArr));
        LIZ2.append(" length: ");
        LIZ2.append(byteArray.length);
        X1D.LIZIZ(LIZ2);
        JSONObject jSONObject = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        byte[] digest = this.LIZLLL.digest(byteArray);
        jSONObject.putOpt("digest_duration", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        byteArrayOutputStream.write(digest);
        jSONObject.putOpt("generate_duration", Long.valueOf(System.currentTimeMillis() - valueOf.longValue()));
        O8O.LIZLLL().LJIIIIZZ("service_udp_send_packet_duration", i2, jSONObject, null);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }

    public final boolean LIZJ(byte[] bArr) {
        LIZIZ(0, bArr, 4);
        LIZIZ(4, bArr, 5);
        byte[] LIZIZ = LIZIZ(5, bArr, 15);
        byte[] LIZIZ2 = LIZIZ(15, bArr, 23);
        byte[] LIZIZ3 = LIZIZ(23, bArr, 31);
        byte[] LIZIZ4 = LIZIZ(31, bArr, 39);
        long j = ByteBuffer.wrap(LIZIZ(39, bArr, 47)).getLong();
        int i = (int) ((j * 8) + 47);
        byte[] LIZIZ5 = LIZIZ(47, bArr, i);
        int i2 = i + 8;
        long j2 = ByteBuffer.wrap(LIZIZ(i, bArr, i2)).getLong();
        int i3 = (int) ((8 * j2 * 2) + i2);
        byte[] LIZIZ6 = LIZIZ(i2, bArr, i3);
        int i4 = i3 + 8;
        int i5 = (int) (i4 + ByteBuffer.wrap(LIZIZ(i3, bArr, i4)).getLong());
        byte[] LIZIZ7 = LIZIZ(i4, bArr, i5);
        byte[] LIZIZ8 = LIZIZ(i5, bArr, bArr.length);
        byte[] digest = this.LIZLLL.digest(LIZIZ(0, bArr, i5));
        if (!Arrays.equals(digest, Arrays.copyOfRange(LIZIZ8, 0, digest.length))) {
            return true;
        }
        String valueOf = String.valueOf(this.LIZJ);
        int i6 = 0;
        for (int i7 = 0; i7 < valueOf.length(); i7++) {
            int numericValue = Character.getNumericValue(valueOf.charAt(i7));
            if (numericValue > LIZIZ.length) {
                return true;
            }
            i6 += LIZIZ[numericValue] & 255;
        }
        if (this.LJII) {
            O74.LIZIZ().LJIIJ.add(new IDRunnableS6S0101000(2, LIZIZ2, 30));
        } else {
            O7A.LIZ().LIZIZ(ByteBuffer.wrap(LIZIZ2).getLong());
        }
        if ((ByteBuffer.wrap(LIZIZ3).getLong() & 1) != 0) {
            final String str = new String(LIZIZ7);
            final long j3 = ByteBuffer.wrap(LIZIZ4).getLong();
            Runnable runnable = new Runnable() { // from class: X.O7q
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j4 = j3;
                    try {
                        HashMap<String, Object> hashMap = new HashMap<>(1);
                        HashMap<String, Object> hashMap2 = new HashMap<>(1);
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("log_extra", str2);
                        }
                        hashMap2.put("action", Long.valueOf(j4));
                        O79.LIZIZ().LJI(null, 84378473382L, "udp_stop", hashMap, hashMap2);
                    } catch (Throwable unused) {
                    }
                }
            };
            if (this.LJII) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(runnable, 5000L);
            } else {
                runnable.run();
            }
            long[] jArr = new long[(int) j];
            long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, (int) j2, 2);
            if ((j3 & 2) != 0 && LIZIZ5 != null && LIZIZ5.length > 0) {
                for (int i8 = 0; i8 < j; i8++) {
                    jArr[i8] = ByteBuffer.wrap(LIZIZ5, i8 * 8, 8).getLong();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("The stop vote cid is:");
                    LIZ.append(jArr[i8]);
                    C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
                }
            }
            if ((4 & j3) != 0 && LIZIZ6 != null && LIZIZ6.length > 0) {
                for (int i9 = 0; i9 < j2; i9++) {
                    jArr2[i9][0] = ByteBuffer.wrap(LIZIZ6, i9 * 8 * 2, 8).getLong() * 1000;
                    jArr2[i9][1] = ByteBuffer.wrap(LIZIZ6, ((i9 * 2) + 1) * 8, 8).getLong() * 1000;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("The start time of the suspension period is:");
                    LIZ2.append(O7K.LIZ(jArr2[i9][0]));
                    LIZ2.append(", the end time period is:");
                    LIZ2.append(O7K.LIZ(jArr2[i9][1]));
                    C1DJ.LJIJJ(X1D.LIZIZ(LIZ2));
                }
            }
            O74.LIZIZ().LJIIIZ.add(new ARunnableS8S0201000_5(2, jArr, jArr2, 3));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("sum: ");
        LIZ3.append(i6);
        X1D.LIZIZ(LIZ3);
        if (i6 % 10 > 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed A[Catch: all -> 0x0019, TryCatch #13 {all -> 0x0019, blocks: (B:28:0x00dc, B:30:0x00ed, B:31:0x0123, B:33:0x012c, B:35:0x0134, B:37:0x00f5), top: B:27:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c A[Catch: all -> 0x0019, TryCatch #13 {all -> 0x0019, blocks: (B:28:0x00dc, B:30:0x00ed, B:31:0x0123, B:33:0x012c, B:35:0x0134, B:37:0x00f5), top: B:27:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5 A[Catch: all -> 0x0019, TryCatch #13 {all -> 0x0019, blocks: (B:28:0x00dc, B:30:0x00ed, B:31:0x0123, B:33:0x012c, B:35:0x0134, B:37:0x00f5), top: B:27:0x00dc }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r16) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O8U.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        super.onProgressUpdate(objArr);
    }

    public O8U(String str, int i, int i2) {
        if (i > 0) {
            this.LJFF = i;
        } else if (C61359O6h.LIZIZ() != null) {
            this.LJFF = CastIntegerProtector.parseInt(C61359O6h.LIZIZ().LIZIZ());
        }
        this.LIZ = str;
        this.LIZIZ = false;
        this.LJII = false;
        this.LJI = i2;
    }

    public static byte[] LIZIZ(int i, byte[] bArr, int i2) {
        if (i >= i2) {
            return null;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }
}
