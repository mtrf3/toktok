package com.bytedance.applog.compress;

import X.C16880lQ;
import X.C66576QAy;
import X.F9J;
import X.InterfaceC66577QAz;
import X.InterfaceC66740QHg;
import X.QIX;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.compression.zstd.ZstdCompress;
import com.bytedance.compression.zstd.ZstdDictCompress;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class CompressManager implements Handler.Callback {
    public static volatile boolean reportStatsEnabled = true;
    public volatile boolean dictionaryInitialized;
    public final Context mContext;
    public byte[] mDictionary;
    public C66576QAy[][] mEventRecord;
    public Handler mHandler;
    public final InterfaceC66740QHg mLogger;
    public final InterfaceC66577QAz mReporter;
    public final SharedPreferences mSp;

    private void resetEventRecord() {
        this.mEventRecord = (C66576QAy[][]) Array.newInstance((Class<?>) C66576QAy.class, 3, 12);
        int i = 0;
        do {
            int i2 = 0;
            do {
                this.mEventRecord[i][i2] = new C66576QAy();
                i2++;
            } while (i2 < 12);
            i++;
        } while (i < 3);
    }

    private void doSave() {
        C66576QAy[][] c66576QAyArr;
        if (!reportStatsEnabled || (c66576QAyArr = this.mEventRecord) == null || c66576QAyArr.length == 0) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            do {
                JSONArray jSONArray2 = new JSONArray();
                int i2 = 0;
                do {
                    JSONObject jSONObject = new JSONObject();
                    C66576QAy c66576QAy = this.mEventRecord[i][i2];
                    jSONObject.put("compressSize", c66576QAy.LIZIZ);
                    jSONObject.put("dataSize", c66576QAy.LIZ);
                    jSONObject.put("encodeType", c66576QAy.LIZJ);
                    jSONObject.put("result", c66576QAy.LJ);
                    jSONObject.put("token", c66576QAy.LJFF);
                    jSONObject.put("compressTime", c66576QAy.LIZLLL);
                    jSONArray2.put(jSONObject);
                    i2++;
                } while (i2 < 12);
                jSONArray.put(jSONArray2);
                i++;
            } while (i < 3);
            String jSONArray3 = jSONArray.toString();
            this.mSp.edit().putString("sp_tea_log_compress_record", jSONArray3).apply();
            this.mLogger.LJII("compress monitor data saved: {}", 14, jSONArray3);
        } finally {
            try {
            } finally {
            }
        }
    }

    private void initEventRecord() {
        if (!reportStatsEnabled) {
            return;
        }
        String string = this.mSp.getString("sp_tea_log_compress_record", "");
        if (!TextUtils.isEmpty(string)) {
            readDataFromJson(string);
            if (System.currentTimeMillis() - this.mSp.getLong("sp_tea_log_compress_report", 0L) > 86400000) {
                report();
            }
        }
    }

    private void report() {
        if (!reportStatsEnabled) {
            return;
        }
        for (int i = 0; i < 3; i++) {
            int i2 = 0;
            do {
                try {
                    C66576QAy c66576QAy = this.mEventRecord[i][i2];
                    if (c66576QAy.LJFF > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("encode_type", i);
                        int i3 = c66576QAy.LJFF - c66576QAy.LJ;
                        jSONObject.put("compress_time", c66576QAy.LIZLLL);
                        jSONObject.put("compress_ratio", C16880lQ.LLLZ("%.2f", new Object[]{Double.valueOf((c66576QAy.LIZ * 1.0d) / c66576QAy.LIZIZ)}));
                        jSONObject.put("data_size", c66576QAy.LIZ);
                        jSONObject.put("compress_size", c66576QAy.LIZIZ);
                        jSONObject.put("success_count", i3);
                        jSONObject.put("count", c66576QAy.LJFF);
                        jSONObject.put("data_level", i2 + 1);
                        this.mReporter.LIZ(jSONObject);
                        this.mSp.edit().remove("sp_tea_log_compress_record").putLong("sp_tea_log_compress_report", System.currentTimeMillis()).apply();
                    }
                    i2++;
                } catch (Throwable th) {
                    this.mLogger.LIZJ(14, "report data failed", th, new Object[0]);
                }
            } while (i2 < 12);
        }
        this.mLogger.LJII("report data completed", 14, new Object[0]);
        resetEventRecord();
    }

    private int getEncodeType(int i) {
        if (i == 2 && this.mDictionary == null) {
            return 1;
        }
        return i;
    }

    private String[] getKeyIv(Context context) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStream = context.getAssets().open("log_tea_dict.kv");
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            return byteArrayOutputStream.toString("UTF-8").split("\\|");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        this.mLogger.LIZJ(14, "get key iv failed", th, new Object[0]);
                        return null;
                    } finally {
                        safeClose(byteArrayOutputStream);
                        safeClose(inputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            byteArrayOutputStream = null;
        }
    }

    private void initDictionary(Context context) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        if (this.dictionaryInitialized) {
            return;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStream = context.getAssets().open("log_tea_dict.txt");
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            String[] keyIv = getKeyIv(context);
            if (keyIv != null && keyIv.length == 2) {
                this.mDictionary = gzipUncompress(decryptAesCbc(byteArrayOutputStream.toByteArray(), keyIv[0], keyIv[1]));
            }
            byte[] bArr2 = this.mDictionary;
            if (bArr2 != null && bArr2.length != 49152) {
                this.mDictionary = null;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                this.mDictionary = null;
                this.mLogger.LIZJ(14, "load zstd dict failed", th, new Object[0]);
            } finally {
                this.dictionaryInitialized = true;
                safeClose(byteArrayOutputStream);
                safeClose(inputStream);
            }
        }
    }

    private void readDataFromJson(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i = 0;
            do {
                JSONArray jSONArray2 = JSONArrayProtectorUtils.getJSONArray(jSONArray, i);
                int i2 = 0;
                do {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray2, i2);
                    C66576QAy c66576QAy = this.mEventRecord[i][i2];
                    c66576QAy.LIZIZ = jSONObject.optInt("compressSize", 0);
                    c66576QAy.LIZ = jSONObject.optInt("dataSize", 0);
                    c66576QAy.LIZJ = jSONObject.optInt("encodeType", 0);
                    c66576QAy.LJ = jSONObject.optInt("result", 0);
                    c66576QAy.LJFF = jSONObject.optInt("token", 0);
                    c66576QAy.LIZLLL = jSONObject.optLong("compressTime", 0L);
                    i2++;
                } while (i2 < 12);
                i++;
            } while (i < 3);
        } catch (Throwable th) {
            this.mLogger.LIZJ(14, "Read data from json failed", th, new Object[0]);
        }
    }

    private void record(C66576QAy c66576QAy) {
        try {
            int i = c66576QAy.LIZ / 1024;
            if (i > 0 && (i = ((int) Math.floor(Math.log(i) / Math.log(2.0d))) + 1) >= 12) {
                i = 11;
            }
            C66576QAy c66576QAy2 = this.mEventRecord[c66576QAy.LIZJ][i];
            int i2 = c66576QAy.LJ;
            if (i2 == 0) {
                c66576QAy2.LIZ += c66576QAy.LIZ;
                c66576QAy2.LIZLLL += c66576QAy.LIZLLL;
                c66576QAy2.LIZIZ += c66576QAy.LIZIZ;
            }
            c66576QAy2.LJ += i2;
            c66576QAy2.LJFF++;
            this.mHandler.removeMessages(1);
            this.mHandler.sendEmptyMessageDelayed(1, 1000L);
        } catch (Throwable th) {
            this.mLogger.LIZJ(14, "record data failed", th, new Object[0]);
        }
    }

    private void recordEvent(C66576QAy c66576QAy) {
        Handler handler;
        if (reportStatsEnabled && (handler = this.mHandler) != null && c66576QAy != null) {
            handler.obtainMessage(0, c66576QAy).sendToTarget();
        }
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void setReportStatsEnabled(boolean z) {
        reportStatsEnabled = z;
    }

    public static byte[] transStrCharToByte(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    private void waitDictionaryLoad(int i) {
        if (!this.dictionaryInitialized) {
            if (i == 2 || i == 1) {
                int i2 = 0;
                while (!this.dictionaryInitialized) {
                    int i3 = i2 + 1;
                    if (i2 >= 10) {
                        break;
                    }
                    this.mLogger.LJII("Wait dictionary initializing for 500ms... Try:{}", 14, Integer.valueOf(i3));
                    try {
                        Thread.sleep(500L);
                    } catch (Throwable unused) {
                    }
                    i2 = i3;
                }
                if (!this.dictionaryInitialized) {
                    this.mLogger.LIZ(new Object[0]);
                }
            }
        }
    }

    public byte[] gzipUncompress(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        this.mLogger.LIZJ(14, "uncompress gzip failed", th, new Object[0]);
                        safeClose(gZIPInputStream);
                        safeClose(byteArrayInputStream);
                        return byteArrayOutputStream.toByteArray();
                    } catch (Throwable th2) {
                        safeClose(gZIPInputStream);
                        safeClose(byteArrayInputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
            gZIPInputStream = null;
        }
        safeClose(gZIPInputStream);
        safeClose(byteArrayInputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        initDictionary(this.mContext);
                        initEventRecord();
                    }
                } else {
                    report();
                    this.mHandler.sendEmptyMessageDelayed(2, 86400000L);
                }
            } else {
                doSave();
            }
        } else {
            record((C66576QAy) message.obj);
        }
        return true;
    }

    public byte[] compressUsingGzip(byte[] bArr, C66576QAy c66576QAy) {
        int length;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        c66576QAy.LIZ = length;
        c66576QAy.LIZJ = 0;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(FileUtils.BUFFER_SIZE);
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                if (bArr != null) {
                    try {
                        gZIPOutputStream.write(bArr);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            this.mLogger.LIZJ(14, "compress with gzip failed", th, new Object[0]);
                            c66576QAy.LJ = 1;
                            return null;
                        } finally {
                            safeClose(gZIPOutputStream);
                            safeClose(byteArrayOutputStream);
                        }
                    }
                }
                safeClose(gZIPOutputStream);
                safeClose(byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                long currentTimeMillis2 = System.currentTimeMillis();
                c66576QAy.LJ = 0;
                c66576QAy.LIZLLL = currentTimeMillis2 - currentTimeMillis;
                c66576QAy.LIZIZ = byteArray.length;
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }

    public byte[] compress(byte[] bArr, int i, C66576QAy c66576QAy) {
        waitDictionaryLoad(i);
        int encodeType = getEncodeType(i);
        if (encodeType != 0) {
            if (encodeType == 1 || encodeType == 2) {
                bArr = compressUsingZstd(bArr, c66576QAy, i);
            }
        } else {
            bArr = compressUsingGzip(bArr, c66576QAy);
        }
        if (bArr == null || bArr.length == 0) {
            recordEvent(c66576QAy);
            bArr = compressUsingGzip(bArr, c66576QAy);
        }
        recordEvent(c66576QAy);
        return bArr;
    }

    public byte[] compressUsingZstd(byte[] bArr, C66576QAy c66576QAy, int i) {
        c66576QAy.LIZ = bArr.length;
        c66576QAy.LIZJ = i;
        c66576QAy.LJFF = 0;
        byte[] bArr2 = null;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (i == 2 && this.mDictionary != null) {
                bArr2 = ZstdCompress.compress(bArr, new ZstdDictCompress(this.mDictionary, 15));
            } else {
                bArr2 = ZstdCompress.compress(bArr, 15);
            }
            c66576QAy.LIZLLL = System.currentTimeMillis() - currentTimeMillis;
            c66576QAy.LIZIZ = bArr2.length;
            c66576QAy.LJ = 0;
        } catch (Throwable th) {
            this.mLogger.LIZJ(14, "compress with zstd failed", th, new Object[0]);
            c66576QAy.LJ = 1;
        }
        return bArr2;
    }

    public byte[] decryptAesCbc(byte[] bArr, String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, new SecretKeySpec(transStrCharToByte(str), "AES"), new IvParameterSpec(transStrCharToByte(str2)));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            this.mLogger.LIZJ(14, "decryptAesCbc failed", th, new Object[0]);
            return null;
        }
    }

    public CompressManager(Context context, String str, InterfaceC66577QAz interfaceC66577QAz, InterfaceC66740QHg interfaceC66740QHg) {
        this.mContext = context;
        this.mSp = F9J.LIZIZ(context, 0, TextUtils.isEmpty(str) ? "sp_tea_log_compress" : str);
        this.mReporter = interfaceC66577QAz;
        interfaceC66740QHg = interfaceC66740QHg == null ? QIX.LJIJJ() : interfaceC66740QHg;
        this.mLogger = interfaceC66740QHg;
        interfaceC66740QHg.LJII("Init compress manager...", 14, new Object[0]);
        try {
            resetEventRecord();
            HandlerThread handlerThread = new HandlerThread("tea_log_compress");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.mHandler = handler;
            handler.sendEmptyMessage(3);
            this.mHandler.sendEmptyMessageDelayed(1, 60000L);
            this.mHandler.sendEmptyMessageDelayed(2, 86400000L);
            interfaceC66740QHg.LJII("Compress manager init end.", 14, new Object[0]);
        } catch (Throwable th) {
            this.mLogger.LIZJ(14, "Init compress manager failed", th, new Object[0]);
        }
    }
}
