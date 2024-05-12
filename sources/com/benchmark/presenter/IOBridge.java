package com.benchmark.presenter;

import X.C16880lQ;
import X.C47261Igj;
import X.C89993ZTp;
import X.X1D;
import android.os.StatFs;
import com.benchmark.settings.BXIOSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes19.dex */
public class IOBridge {
    public static Random randomGenerator = new Random();
    public boolean internal;
    public BXIOSettings settings;
    public String testFile;

    public void afterRun() {
        C89993ZTp.LIZ(this.testFile);
    }

    public HashMap<String, Float> runIOTest() {
        HashMap<String, Float> hashMap = new HashMap<>();
        BXIOSettings bXIOSettings = this.settings;
        float write = write(bXIOSettings.blockSize, bXIOSettings.blockNum, true, this.testFile);
        C89993ZTp.LIZ(this.testFile);
        BXIOSettings bXIOSettings2 = this.settings;
        float write2 = write(bXIOSettings2.blockSize, bXIOSettings2.blockNum, false, this.testFile);
        BXIOSettings bXIOSettings3 = this.settings;
        float read = read(bXIOSettings3.blockSize, bXIOSettings3.blockNum, true, this.testFile);
        BXIOSettings bXIOSettings4 = this.settings;
        float read2 = read(bXIOSettings4.blockSize, bXIOSettings4.blockNum, false, this.testFile);
        float floor = ((float) Math.floor(write * 100.0f)) / 100.0f;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("runIOTest: random_write: ");
        LIZ.append(floor);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("IOBridge");
        hashMap.put("random_write", Float.valueOf(floor));
        float floor2 = ((float) Math.floor(read * 100.0f)) / 100.0f;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("runIOTest: random_read: ");
        LIZ2.append(floor2);
        X1D.LIZIZ(LIZ2);
        C47261Igj.LJIILJJIL("IOBridge");
        hashMap.put("random_read", Float.valueOf(floor2));
        float floor3 = ((float) Math.floor(write2 * 100.0f)) / 100.0f;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("runIOTest: sequential_write: ");
        LIZ3.append(floor3);
        X1D.LIZIZ(LIZ3);
        C47261Igj.LJIILJJIL("IOBridge");
        hashMap.put("sequential_write", Float.valueOf(floor3));
        float floor4 = ((float) Math.floor(read2 * 100.0f)) / 100.0f;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("runIOTest: sequential_read: ");
        LIZ4.append(floor4);
        X1D.LIZIZ(LIZ4);
        C47261Igj.LJIILJJIL("IOBridge");
        hashMap.put("sequential_read", Float.valueOf(floor4));
        return hashMap;
    }

    public boolean isExternalStorageWritable() {
        return "mounted".equals(C16880lQ.LLLLLLLZIL());
    }

    public int prepare(BXIOSettings bXIOSettings) {
        long blockSizeLong;
        long availableBlocksLong;
        if (!this.internal && !isExternalStorageWritable()) {
            return -10003;
        }
        if (bXIOSettings.mode.equalsIgnoreCase("internal")) {
            this.internal = true;
        }
        long j = -1;
        try {
            if (this.internal) {
                StatFs statFs = new StatFs(bXIOSettings.cachePathDir);
                blockSizeLong = statFs.getBlockSizeLong();
                availableBlocksLong = statFs.getAvailableBlocksLong();
            } else {
                StatFs statFs2 = new StatFs(bXIOSettings.externalCacheDir);
                blockSizeLong = statFs2.getBlockSizeLong();
                availableBlocksLong = statFs2.getAvailableBlocksLong();
            }
            j = availableBlocksLong * blockSizeLong;
        } catch (IllegalArgumentException unused) {
        }
        if (j >= bXIOSettings.blockNum * 10 * bXIOSettings.blockSize) {
            this.settings = bXIOSettings;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(bXIOSettings.cachePathDir);
            String str = File.separator;
            LIZ.append(str);
            LIZ.append("test.file");
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(bXIOSettings.externalCacheDir);
            LIZ2.append(str);
            LIZ2.append("test.file");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (!this.internal) {
                LIZIZ = LIZIZ2;
            }
            this.testFile = LIZIZ;
            return 0;
        }
        return -10002;
    }

    public static float read(int i, int i2, boolean z, String str) {
        long nanoTime;
        int i3;
        File file = new File(str);
        byte[] bArr = new byte[i];
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                try {
                    try {
                        randomAccessFile.seek(randomGenerator.nextInt(i2 - 1) * i);
                        randomAccessFile.readFully(bArr, 0, i);
                        i3 += i;
                    } catch (IOException e) {
                        throw e;
                    }
                } finally {
                    randomAccessFile.close();
                }
            }
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    try {
                        fileInputStream.read(bArr, 0, i);
                        i3 += i;
                    } catch (IOException e2) {
                        throw e2;
                    }
                } finally {
                    fileInputStream.close();
                }
            }
        }
        return (i3 / ((float) (System.nanoTime() - nanoTime))) * 1000.0f;
    }

    public static float write(int i, int i2, boolean z, String str) {
        long nanoTime;
        int i3;
        byte[] bArr = new byte[i];
        for (int i4 = 0; i4 < i; i4++) {
            bArr[i4] = -16;
        }
        File file = new File(str);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
            C47261Igj.LJIILL("IOBenchmarkTest");
        }
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    try {
                        randomAccessFile.seek(randomGenerator.nextInt(i2 - 1) * i);
                        randomAccessFile.write(bArr, 0, i);
                        i3 += i;
                    } finally {
                        randomAccessFile.close();
                    }
                } catch (IOException e) {
                    throw e;
                }
            }
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            nanoTime = System.nanoTime();
            i3 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                try {
                    try {
                        fileOutputStream.write(bArr, 0, i);
                        i3 += i;
                    } finally {
                        fileOutputStream.close();
                    }
                } catch (IOException e2) {
                    throw e2;
                }
            }
        }
        return (i3 / ((float) (System.nanoTime() - nanoTime))) * 1000.0f;
    }
}
