package com.bytedance.retrofit2.mime;

import X.C16880lQ;
import X.V0N;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TTRequestCompressManager {
    public static AddZstdCompressCallback sAddZstdCompressCallback = null;
    public static int sBrotliCompressQuality = 4;
    public static volatile CompressDataCallback sCallback = null;
    public static int sMaxBodyCompressSize = 1048576;
    public static int sMinBodyCompressSize = 100;
    public static volatile boolean sRequestCompressEnabled = false;
    public static int sZstdCompressLevel = 6;
    public static CompressType sCompressType = CompressType.NONE;
    public static CopyOnWriteArraySet<String> sEqualPathArraySet = new CopyOnWriteArraySet<>();
    public static CopyOnWriteArraySet<String> sPrefixPathArraySet = new CopyOnWriteArraySet<>();

    /* loaded from: classes12.dex */
    public interface AddZstdCompressCallback {
        byte[] compress(byte[] bArr, int i);

        byte[] decompress(byte[] bArr, int i);
    }

    /* loaded from: classes12.dex */
    public interface CompressDataCallback {
        byte[] compressData(byte[] bArr, int i, int i2, int i3);

        byte[] decompressData(byte[] bArr, int i, int i2);
    }

    public static void resetCompressConfig() {
        sRequestCompressEnabled = false;
        sMaxBodyCompressSize = 1048576;
        sMinBodyCompressSize = 100;
        sCompressType = CompressType.NONE;
        sEqualPathArraySet.clear();
        sPrefixPathArraySet.clear();
    }

    /* loaded from: classes12.dex */
    public enum CompressType {
        NONE(0),
        GZIP(1),
        BROTLI(2),
        ZSTD(3);

        public final int mType;

        public int getType() {
            return this.mType;
        }

        public static CompressType valueOf(String str) {
            return (CompressType) V0N.LJJJ(CompressType.class, str);
        }

        CompressType(int i) {
            this.mType = i;
        }
    }

    public static void covertIntToCompressType(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    sCompressType = CompressType.NONE;
                    return;
                } else {
                    sCompressType = CompressType.ZSTD;
                    return;
                }
            }
            sCompressType = CompressType.BROTLI;
            return;
        }
        sCompressType = CompressType.GZIP;
    }

    public static byte[] gzipDecompress(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        } catch (IOException unused) {
            gZIPInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            gZIPInputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused2) {
            if (gZIPInputStream != null) {
                try {
                    gZIPInputStream.close();
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                    return null;
                }
            }
            byteArrayOutputStream.close();
            return null;
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream2 = gZIPInputStream;
            if (gZIPInputStream2 != null) {
                try {
                    gZIPInputStream2.close();
                } catch (IOException e3) {
                    C16880lQ.LLLLIIL(e3);
                    throw th;
                }
            }
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public static boolean isEmptySet(Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isPathMatched(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!isEmptySet(sEqualPathArraySet) && sEqualPathArraySet.contains(str)) {
            return true;
        }
        if (!isEmptySet(sPrefixPathArraySet)) {
            Iterator<String> it = sPrefixPathArraySet.iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void onServerConfigChanged(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        resetCompressConfig();
        JSONObject optJSONObject = jSONObject.optJSONObject("tt_compress");
        if (optJSONObject == null) {
            return;
        }
        boolean z = false;
        if (optJSONObject.optInt("enabled", 0) > 0) {
            z = true;
        }
        sRequestCompressEnabled = z;
        sMaxBodyCompressSize = optJSONObject.optInt("max_body_size", 1048576);
        sMinBodyCompressSize = optJSONObject.optInt("min_body_size", 100);
        int optInt = optJSONObject.optInt("br_level", 4);
        if (optInt >= 0 && optInt <= 11) {
            sBrotliCompressQuality = optInt;
        }
        int optInt2 = optJSONObject.optInt("zstd_level", 6);
        if (optInt2 >= 1 && optInt2 <= 22) {
            sZstdCompressLevel = optInt2;
        }
        covertIntToCompressType(optJSONObject.optInt("type", CompressType.GZIP.getType()));
        parseArraySetStringConfig(optJSONObject.optJSONArray("equal_path"), sEqualPathArraySet);
        parseArraySetStringConfig(optJSONObject.optJSONArray("prefix_path"), sPrefixPathArraySet);
    }

    public static void setAddZstdCompressCallback(AddZstdCompressCallback addZstdCompressCallback) {
        sAddZstdCompressCallback = addZstdCompressCallback;
    }

    public static void setCompressDataCallback(CompressDataCallback compressDataCallback) {
        sCallback = compressDataCallback;
    }

    public static byte[] brotliDecompress(byte[] bArr, int i) {
        if (bArr == null || sCallback == null) {
            return null;
        }
        return sCallback.decompressData(bArr, i, CompressType.BROTLI.getType());
    }

    public static byte[] gzipCompress(byte[] bArr, int i) {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e2) {
                        C16880lQ.LLLLIIL(e2);
                        return null;
                    }
                }
                byteArrayOutputStream.close();
                return null;
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e3) {
                        C16880lQ.LLLLIIL(e3);
                        throw th;
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused2) {
            gZIPOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void parseArraySetStringConfig(JSONArray jSONArray, CopyOnWriteArraySet copyOnWriteArraySet) {
        if (jSONArray == null || copyOnWriteArraySet == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArraySet.add(string);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    public static byte[] zstdCompress(byte[] bArr, int i) {
        AddZstdCompressCallback addZstdCompressCallback = sAddZstdCompressCallback;
        if (addZstdCompressCallback != null) {
            return addZstdCompressCallback.compress(bArr, i);
        }
        return null;
    }

    public static byte[] zstdDecompress(byte[] bArr, int i) {
        AddZstdCompressCallback addZstdCompressCallback = sAddZstdCompressCallback;
        if (addZstdCompressCallback != null) {
            return addZstdCompressCallback.decompress(bArr, i);
        }
        return null;
    }

    public static byte[] brotliCompress(byte[] bArr, int i, int i2) {
        if (bArr == null || sCallback == null) {
            return null;
        }
        return sCallback.compressData(bArr, i, i2, CompressType.BROTLI.getType());
    }

    public static Pair<byte[], String> compressBody(byte[] bArr, int i, String str, boolean z) {
        byte[] zstdCompress;
        if (sRequestCompressEnabled && sCompressType != CompressType.NONE && ((z || isPathMatched(str)) && i <= sMaxBodyCompressSize && i >= sMinBodyCompressSize)) {
            if (sCompressType == CompressType.GZIP) {
                if (gzipCompress(bArr, i) == null) {
                    return null;
                }
                return new Pair<>(gzipCompress(bArr, i), "gzip");
            }
            if (sCompressType == CompressType.BROTLI) {
                byte[] brotliCompress = brotliCompress(bArr, i, sBrotliCompressQuality);
                if (brotliCompress == null) {
                    return null;
                }
                return new Pair<>(brotliCompress, "br");
            }
            if (sCompressType != CompressType.ZSTD || (zstdCompress = zstdCompress(bArr, sZstdCompressLevel)) == null) {
                return null;
            }
            return new Pair<>(zstdCompress, "zstd");
        }
        return null;
    }
}
