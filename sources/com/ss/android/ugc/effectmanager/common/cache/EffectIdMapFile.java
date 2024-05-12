package com.ss.android.ugc.effectmanager.common.cache;

import X.C16880lQ;
import X.X1D;
import com.ss.android.ugc.effectmanager.common.cachemanager.common.StrictLineReader;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.i0;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public class EffectIdMapFile {
    public final LinkedHashMap<String, String> effectidMap = new LinkedHashMap<>(0, 0.75f, true);
    public int mapCount;
    public final File mapFile;
    public final File mapFileBak;
    public final File mapFileTmp;
    public Writer mapWriter;

    private synchronized void rebuildMap() {
        Writer writer = this.mapWriter;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFileTmp), FileUtils.INSTANCE.getUS_ASCII()));
        try {
            bufferedWriter.write("id.to.effectid");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            this.mapCount = 0;
            for (Map.Entry<String, String> entry : this.effectidMap.entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(entry.getKey());
                LIZ.append(' ');
                LIZ.append(entry.getValue());
                LIZ.append('\n');
                bufferedWriter.write(X1D.LIZIZ(LIZ));
                this.mapCount++;
            }
            bufferedWriter.close();
            if (this.mapFile.exists()) {
                renameTo(this.mapFile, this.mapFileBak, true);
            }
            renameTo(this.mapFileTmp, this.mapFile, false);
            C16880lQ.LLLZZIL(this.mapFileBak);
            this.mapWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFile, true), FileUtils.INSTANCE.getUS_ASCII()));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private void checkNotClosed() {
        if (this.mapWriter != null) {
            if (!this.mapFile.exists()) {
                rebuildMap();
                return;
            }
            return;
        }
        throw new IllegalStateException("map file is closed");
    }

    private void readMap() {
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.mapFile), FileUtils.INSTANCE.getUS_ASCII());
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            if ("id.to.effectid".equals(readLine) && "1".equals(readLine2) && "".equals(readLine3)) {
                int i = 0;
                while (true) {
                    try {
                        readMapLine(strictLineReader.readLine());
                        i++;
                    } catch (EOFException unused) {
                        this.mapCount = i;
                        if (strictLineReader.hasUnterminatedLine()) {
                            rebuildMap();
                        } else {
                            this.mapWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.mapFile, true), FileUtils.INSTANCE.getUS_ASCII()));
                        }
                        FileUtils.INSTANCE.closeQuietly(strictLineReader);
                        return;
                    }
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unexpected Map header: [");
                LIZ.append(readLine);
                LIZ.append(", ");
                LIZ.append(readLine2);
                LIZ.append(", ");
                LIZ.append(readLine3);
                LIZ.append("]");
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } catch (Throwable th) {
            FileUtils.INSTANCE.closeQuietly(strictLineReader);
            throw th;
        }
    }

    public EffectIdMapFile(File file) {
        File file2 = new File(file, "effectidmap");
        this.mapFile = file2;
        this.mapFileTmp = new File(file, "effectidmap.tmp");
        File file3 = new File(file, "effectidmap.bak");
        this.mapFileBak = file3;
        try {
            if (file3.exists()) {
                if (file2.exists()) {
                    C16880lQ.LLLZZIL(file3);
                } else {
                    renameTo(file3, file2, false);
                }
            }
            if (file2.exists()) {
                readMap();
            } else {
                rebuildMap();
            }
        } catch (IOException e) {
            PrintStream printStream = System.out;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectIdMapFile ");
            LIZ.append(file);
            LIZ.append(" is corrupt: ");
            LIZ.append(e.getMessage());
            LIZ.append(", removing");
            printStream.println(X1D.LIZIZ(LIZ));
            C16880lQ.LLLZZIL(this.mapFile);
        }
    }

    public static void deleteIfExists(File file) {
        if (!file.exists() || C16880lQ.LLLZZIL(file)) {
        } else {
            throw new IOException();
        }
    }

    private void readMapLine(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            this.effectidMap.put(str.substring(0, indexOf), str.substring(indexOf + 1));
            return;
        }
        throw new IOException(i0.LJFF("unexpected Map line: ", str));
    }

    public String getEffectId(String str) {
        return this.effectidMap.get(str);
    }

    public void writeEffectId(String str, String str2) {
        if (this.effectidMap.containsKey(str)) {
            return;
        }
        this.effectidMap.put(str, str2);
        try {
            checkNotClosed();
            Writer writer = this.mapWriter;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(' ');
            LIZ.append(str2);
            LIZ.append('\n');
            writer.write(X1D.LIZIZ(LIZ));
            this.mapWriter.flush();
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EffectIdMapFile write failed by ");
            LIZ2.append(e.toString());
            EPLog.e("EffectIdMapFile", X1D.LIZIZ(LIZ2));
        }
    }

    public static void renameTo(File file, File file2, boolean z) {
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }
}
