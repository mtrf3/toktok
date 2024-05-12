package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import X.C36662EaA;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* loaded from: classes7.dex */
public final class z1 {
    public static final C13T LJII = new C13T("SliceMetadataManager");
    public final y LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final byte[] LIZ = new byte[FileUtils.BUFFER_SIZE];
    public int LJI = -1;

    public z1(y yVar, String str, int i, long j, String str2) {
        this.LIZIZ = yVar;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = j;
        this.LJFF = str2;
    }

    public final void LIZ(int i, long j, long j2, String str) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.LJI));
        FileOutputStream fileOutputStream = new FileOutputStream(LJIIJJI());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C36662EaA.LIZ(th, th2);
            }
            throw th;
        }
    }

    public final void LIZJ(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(LJIIIIZZ().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.LJI));
        FileOutputStream fileOutputStream = new FileOutputStream(LJIIJJI());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C36662EaA.LIZ(th, th2);
            }
            throw th;
        }
    }

    public final void LIZLLL(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.LJI));
        FileOutputStream fileOutputStream = new FileOutputStream(LJIIJJI());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C36662EaA.LIZ(th, th2);
            }
            throw th;
        }
    }

    public final void LJI(InputStream inputStream, byte[] bArr) {
        this.LJI++;
        FileOutputStream fileOutputStream = new FileOutputStream(LJIIIIZZ());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.LIZ);
            while (read > 0) {
                fileOutputStream.write(this.LIZ, 0, read);
                read = inputStream.read(this.LIZ);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C36662EaA.LIZ(th, th2);
            }
            throw th;
        }
    }

    public final void LJII(int i, long j, byte[] bArr, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(LJIIIIZZ(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C36662EaA.LIZ(th, th2);
            }
            throw th;
        }
    }

    public final void LJIIJ(int i, byte[] bArr) {
        this.LJI++;
        FileOutputStream fileOutputStream = new FileOutputStream(LJIIIIZZ());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C36662EaA.LIZ(th, th2);
            }
            throw th;
        }
    }

    public final y1 LJ() {
        y yVar = this.LIZIZ;
        String str = this.LIZJ;
        int i = this.LIZLLL;
        long j = this.LJ;
        String str2 = this.LJFF;
        yVar.getClass();
        File file = new File(new File(new File(new File(yVar.LIZLLL(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null && properties.getProperty("previousChunk") != null) {
                    try {
                        int parseInt = CastIntegerProtector.parseInt(properties.getProperty("fileStatus"));
                        String property = properties.getProperty("fileName");
                        long parseLong = CastLongProtector.parseLong(properties.getProperty("fileOffset", "-1"));
                        long parseLong2 = CastLongProtector.parseLong(properties.getProperty("remainingBytes", "-1"));
                        int parseInt2 = CastIntegerProtector.parseInt(properties.getProperty("previousChunk"));
                        this.LJI = CastIntegerProtector.parseInt(properties.getProperty("metadataFileCounter", CardStruct.IStatusCode.DEFAULT));
                        return new y1(parseLong, parseLong2, parseInt, parseInt2, property);
                    } catch (NumberFormatException e) {
                        throw new m0("Slice checkpoint file corrupt.", e);
                    }
                }
                throw new m0("Slice checkpoint file corrupt.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    C36662EaA.LIZ(th, th2);
                }
                throw th;
            }
        }
        throw new m0("Slice checkpoint file does not exist.");
    }

    public final File LJIIIIZZ() {
        y yVar = this.LIZIZ;
        String str = this.LIZJ;
        int i = this.LIZLLL;
        long j = this.LJ;
        String str2 = this.LJFF;
        yVar.getClass();
        File file = new File(new File(new File(yVar.LIZLLL(i, j, str), "_slices"), "_metadata"), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, C16880lQ.LLLZ("%s-NAM.dat", new Object[]{Integer.valueOf(this.LJI)}));
    }

    public final int LJIIIZ() {
        y yVar = this.LIZIZ;
        String str = this.LIZJ;
        int i = this.LIZLLL;
        long j = this.LJ;
        String str2 = this.LJFF;
        yVar.getClass();
        File file = new File(new File(new File(new File(yVar.LIZLLL(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (CastIntegerProtector.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return CastIntegerProtector.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new m0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C36662EaA.LIZ(th, th2);
            }
            throw th;
        }
    }

    public final File LJIIJJI() {
        y yVar = this.LIZIZ;
        String str = this.LIZJ;
        int i = this.LIZLLL;
        long j = this.LJ;
        String str2 = this.LJFF;
        yVar.getClass();
        File file = new File(new File(new File(new File(yVar.LIZLLL(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }

    public final void LJFF(byte[] bArr) {
        this.LJI++;
        y yVar = this.LIZIZ;
        String str = this.LIZJ;
        int i = this.LIZLLL;
        long j = this.LJ;
        String str2 = this.LJFF;
        yVar.getClass();
        File file = new File(new File(new File(yVar.LIZLLL(i, j, str), "_slices"), "_metadata"), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, C16880lQ.LLLZ("%s-LFH.dat", new Object[]{Integer.valueOf(this.LJI)})));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            throw new m0("Could not write metadata file.", e);
        }
    }

    public final void LIZIZ(int i, byte[] bArr) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.LJI));
        FileOutputStream fileOutputStream = new FileOutputStream(LJIIJJI());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            y yVar = this.LIZIZ;
            String str = this.LIZJ;
            int i2 = this.LIZLLL;
            long j = this.LJ;
            String str2 = this.LJFF;
            yVar.getClass();
            File file = new File(new File(new File(new File(yVar.LIZLLL(i2, j, str), "_slices"), "_metadata"), str2), "checkpoint_ext.dat");
            if (file.exists()) {
                C16880lQ.LLLZZIL(file);
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } finally {
        }
    }
}
