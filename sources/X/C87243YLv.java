package X;

import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YLv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87243YLv {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZJ() {
        if (C87245YLx.LIZJ()) {
            return C113554cx.LJJJLZIJ(new OSZ("compress", "zstd_dict"), new OSZ("zstd_dict_version", String.valueOf(C87245YLx.LIZIZ)));
        }
        return C113554cx.LJJJLZIJ(new OSZ("compress", "gzip"));
    }

    public static byte[] LIZ(PayloadItem payloadItem, java.util.Map map) {
        byte[] byteArray;
        if (payloadItem == null) {
            return new byte[1];
        }
        byte[] payload = payloadItem.getPayload();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        String compressType = payloadItem.getCompressType();
        if (o.LJ(compressType, "gzip")) {
            try {
                map.put("compress_type_proceeded", "gzip");
                map.put("compress_type_received", "gzip");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(payload);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = gZIPInputStream.read(bArr, 0, 4096);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                gZIPInputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
            } catch (Exception e) {
                C32079CiR.LJII(e.toString(), map);
                throw e;
            }
        } else if (o.LJ(compressType, "zstd_dict")) {
            try {
                map.put("compress_type_proceeded", "zstd");
                map.put("compress_type_received", "zstd");
                byteArray = C87245YLx.LIZ(payloadItem);
            } catch (YM2 e2) {
                C32079CiR.LJII(e2.getReason(), map);
                throw e2;
            }
        } else {
            String compressType2 = payloadItem.getCompressType();
            if (compressType2 == null) {
                compressType2 = "null";
            }
            map.put("compress_type_received", compressType2);
            byteArray = payload;
        }
        map.put("decompress_time", Long.valueOf(SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos));
        map.put("compress_ratio", Double.valueOf((payload.length * 1.0d) / byteArray.length));
        C32079CiR.LJIIIIZZ(map);
        return byteArray;
    }

    public static void LIZIZ(PayloadItem payloadItem, java.util.Map map, C84689XLp presetBuffer, AqS165S0100000_15 aqS165S0100000_15) {
        o.LJIIIZ(presetBuffer, "presetBuffer");
        if (payloadItem == null) {
            return;
        }
        byte[] payload = payloadItem.getPayload();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        String compressType = payloadItem.getCompressType();
        if (o.LJ(compressType, "gzip")) {
            try {
                map.put("compress_type_proceeded", "gzip");
                map.put("compress_type_received", "gzip");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(payload);
                YM3 ym3 = new YM3(aqS165S0100000_15);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                byte[] bArr = (byte[]) ym3.LIZ();
                if (bArr == null) {
                    bArr = new byte[4096];
                }
                while (true) {
                    int read = gZIPInputStream.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        break;
                    } else {
                        presetBuffer.write(bArr, 0, read);
                    }
                }
                gZIPInputStream.close();
            } catch (Exception e) {
                C32079CiR.LJII(e.toString(), map);
                throw e;
            }
        } else if (o.LJ(compressType, "zstd_dict")) {
            try {
                map.put("compress_type_proceeded", "zstd");
                map.put("compress_type_received", "zstd");
                C87245YLx.LIZIZ(payloadItem, presetBuffer);
            } catch (YM2 e2) {
                C32079CiR.LJII(e2.getReason(), map);
                throw e2;
            }
        } else {
            presetBuffer.write(payloadItem.getPayload());
            String compressType2 = payloadItem.getCompressType();
            if (compressType2 == null) {
                compressType2 = "null";
            }
            map.put("compress_type_received", compressType2);
        }
        map.put("decompress_time", Long.valueOf(SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos));
        map.put("compress_ratio", Double.valueOf((payload.length * 1.0d) / presetBuffer.LJLIL));
        C32079CiR.LJIIIIZZ(map);
    }
}
