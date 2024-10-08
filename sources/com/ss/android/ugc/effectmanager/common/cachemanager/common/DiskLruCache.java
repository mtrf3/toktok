package com.ss.android.ugc.effectmanager.common.cachemanager.common;

import X.C0EH;
import X.C16880lQ;
import X.C40084FoG;
import X.C7MY;
import X.JBR;
import X.X1D;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes16.dex */
public final class DiskLruCache implements Closeable {
    public static final Pattern LEGAL_KEY_PATTERN = PatternProtector.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.2
        @Override // java.io.OutputStream
        public void write(int i) {
        }
    };
    public final int appVersion;
    public final File directory;
    public final File journalFile;
    public final File journalFileBackup;
    public final File journalFileTmp;
    public Writer journalWriter;
    public IAllowListRule mAllowKeyRule;
    public long maxSize;
    public int redundantOpCount;
    public long size;
    public final int valueCount;
    public final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    public long nextSequenceNumber = 0;
    public final ExecutorService executorService = C16880lQ.LLLLZLLIL();
    public final Callable<Void> cleanupCallable = new Callable<Void>() { // from class: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.1
        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (DiskLruCache.this) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.journalWriter == null) {
                    return null;
                }
                diskLruCache.trimToSize();
                if (DiskLruCache.this.journalRebuildRequired()) {
                    DiskLruCache.this.rebuildJournal();
                    DiskLruCache.this.redundantOpCount = 0;
                }
                return null;
            }
        }
    };

    /* loaded from: classes16.dex */
    public final class Editor {
        public boolean committed;
        public final Entry entry;
        public boolean hasErrors;
        public final boolean[] written;

        /* loaded from: classes15.dex */
        public class FaultHidingOutputStream extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }

            public FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    Editor.this.hasErrors = true;
                }
            }
        }

        public void abort() {
            DiskLruCache.this.completeEdit(this, false);
        }

        public void abortUnlessCommitted() {
            if (!this.committed) {
                try {
                    abort();
                } catch (IOException unused) {
                }
            }
        }

        public void commit() {
            if (this.hasErrors) {
                DiskLruCache.this.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                DiskLruCache.this.completeEdit(this, true);
            }
            this.committed = true;
        }

        public String getString(int i) {
            InputStream newInputStream = newInputStream(i);
            if (newInputStream != null) {
                return DiskLruCache.inputStreamToString(newInputStream);
            }
            return null;
        }

        public InputStream newInputStream(int i) {
            synchronized (DiskLruCache.this) {
                Entry entry = this.entry;
                if (entry.currentEditor == this) {
                    if (!entry.readable) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.entry.getCleanFile(i));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public OutputStream newOutputStream(int i) {
            FileOutputStream fileOutputStream;
            FaultHidingOutputStream faultHidingOutputStream;
            if (i >= 0) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (i < diskLruCache.valueCount) {
                    synchronized (diskLruCache) {
                        Entry entry = this.entry;
                        if (entry.currentEditor == this) {
                            if (!entry.readable) {
                                this.written[i] = true;
                            }
                            File dirtyFile = entry.getDirtyFile(i);
                            try {
                                fileOutputStream = new FileOutputStream(dirtyFile);
                            } catch (FileNotFoundException unused) {
                                DiskLruCache.this.directory.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(dirtyFile);
                                } catch (FileNotFoundException unused2) {
                                    return DiskLruCache.NULL_OUTPUT_STREAM;
                                }
                            }
                            faultHidingOutputStream = new FaultHidingOutputStream(fileOutputStream);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    return faultHidingOutputStream;
                }
            }
            StringBuilder LJ = C7MY.LJ("Expected index ", i, " to be greater than 0 and less than the maximum value count of ");
            LJ.append(DiskLruCache.this.valueCount);
            throw new IllegalArgumentException(X1D.LIZIZ(LJ));
        }

        public Editor(Entry entry) {
            boolean[] zArr;
            this.entry = entry;
            if (entry.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }

        public void set(int i, String str) {
            OutputStreamWriter outputStreamWriter;
            FileUtils fileUtils;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                OutputStream newOutputStream = newOutputStream(i);
                fileUtils = FileUtils.INSTANCE;
                outputStreamWriter = new OutputStreamWriter(newOutputStream, fileUtils.getUTF_8());
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                fileUtils.closeQuietly(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                FileUtils.INSTANCE.closeQuietly(outputStreamWriter2);
                throw th;
            }
        }
    }

    /* loaded from: classes16.dex */
    public final class Entry {
        public Editor currentEditor;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        public String getLengths() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private IOException invalidLengths(String[] strArr) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unexpected journal line: ");
            LIZ.append(Arrays.toString(strArr));
            throw new IOException(X1D.LIZIZ(LIZ));
        }

        public File getCleanFile(int i) {
            if (i == 0) {
                return new File(DiskLruCache.this.directory, this.key);
            }
            File file = DiskLruCache.this.directory;
            StringBuilder LIZ = X1D.LIZ();
            return new File(file, C40084FoG.LIZ(LIZ, this.key, ".", i, LIZ));
        }

        public File getDirtyFile(int i) {
            if (i == 0) {
                File file = DiskLruCache.this.directory;
                StringBuilder LIZ = X1D.LIZ();
                return new File(file, JBR.LJFF(LIZ, this.key, ".tmp", LIZ));
            }
            File file2 = DiskLruCache.this.directory;
            StringBuilder LIZ2 = X1D.LIZ();
            C0EH.LIZLLL(LIZ2, this.key, ".", i, ".tmp");
            return new File(file2, X1D.LIZIZ(LIZ2));
        }

        public void setLengths(String[] strArr) {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lengths[i] = CastLongProtector.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        public Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }
    }

    /* loaded from: classes16.dex */
    public final class Snapshot implements Closeable {
        public final File[] cleanFiles;
        public final InputStream[] ins;
        public final String key;
        public final long[] lengths;
        public final long sequenceNumber;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.ins) {
                FileUtils.INSTANCE.closeQuietly(inputStream);
            }
        }

        public Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public File getCleanFile(int i) {
            return this.cleanFiles[i];
        }

        public InputStream getInputStream(int i) {
            return this.ins[i];
        }

        public long getLength(int i) {
            return this.lengths[i];
        }

        public String getString(int i) {
            return DiskLruCache.inputStreamToString(getInputStream(i));
        }

        public Snapshot(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.cleanFiles = fileArr;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.journalWriter == null) {
            return;
        }
        Iterator it = new ArrayList(this.lruEntries.values()).iterator();
        while (it.hasNext()) {
            Editor editor = ((Entry) it.next()).currentEditor;
            if (editor != null) {
                editor.abort();
            }
        }
        trimToSize();
        this.journalWriter.close();
        this.journalWriter = null;
    }

    public synchronized void flush() {
        EPLog.d("DiskLruCache", "flush");
        checkNotClosed();
        trimToSize();
        this.journalWriter.flush();
    }

    public Set<String> getLruEntryKeys() {
        Set<String> unmodifiableSet;
        synchronized (this) {
            unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.lruEntries.keySet()));
        }
        return unmodifiableSet;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.journalWriter != null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public synchronized boolean isValid() {
        boolean z;
        File file = this.directory;
        if (file != null && file.exists()) {
            if (this.journalFile.exists()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public synchronized void rebuildJournal() {
        Writer writer = this.journalWriter;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), FileUtils.INSTANCE.getUS_ASCII()));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DIRTY ");
                    LIZ.append(entry.key);
                    LIZ.append('\n');
                    bufferedWriter.write(X1D.LIZIZ(LIZ));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("CLEAN ");
                    LIZ2.append(entry.key);
                    LIZ2.append(entry.getLengths());
                    LIZ2.append('\n');
                    bufferedWriter.write(X1D.LIZIZ(LIZ2));
                }
            }
            bufferedWriter.close();
            if (this.journalFile.exists()) {
                renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            C16880lQ.LLLZZIL(this.journalFileBackup);
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), FileUtils.INSTANCE.getUS_ASCII()));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public synchronized long size() {
        return this.size;
    }

    public synchronized void trimToSize() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trimToSize size: ");
        LIZ.append(this.size);
        EPLog.d("DiskLruCache", X1D.LIZIZ(LIZ));
        while (this.size > this.maxSize) {
            int size = this.lruEntries.size();
            int i = 0;
            for (Map.Entry<String, Entry> entry : this.lruEntries.entrySet()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("trimToSize key:");
                LIZ2.append(entry.getKey());
                EPLog.d("DiskLruCache", X1D.LIZIZ(LIZ2));
                IAllowListRule iAllowListRule = this.mAllowKeyRule;
                if (iAllowListRule != null && iAllowListRule.isAllowed(entry.getKey())) {
                    i++;
                } else {
                    EPLog.d("DiskLruCache", "trimToSize exe");
                    if (size - i < 10) {
                        setMaxSize(getMaxSize() * 2);
                    }
                    remove(entry.getKey());
                }
            }
        }
    }

    private void checkNotClosed() {
        if (this.journalWriter != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void processJournal() {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i = 0;
            if (next.currentEditor == null) {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            } else {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i));
                    deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void readJournal() {
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.journalFile), FileUtils.INSTANCE.getUS_ASCII());
        try {
            String readLine = strictLineReader.readLine();
            String readLine2 = strictLineReader.readLine();
            String readLine3 = strictLineReader.readLine();
            String readLine4 = strictLineReader.readLine();
            String readLine5 = strictLineReader.readLine();
            if ("libcore.io.DiskLruCache".equals(readLine) && "1".equals(readLine2) && Integer.toString(this.appVersion).equals(readLine3) && Integer.toString(this.valueCount).equals(readLine4) && "".equals(readLine5)) {
                int i = 0;
                while (true) {
                    try {
                        readJournalLine(strictLineReader.readLine());
                        i++;
                    } catch (EOFException unused) {
                        this.redundantOpCount = i - this.lruEntries.size();
                        if (strictLineReader.hasUnterminatedLine()) {
                            rebuildJournal();
                        } else {
                            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), FileUtils.INSTANCE.getUS_ASCII()));
                        }
                        FileUtils.INSTANCE.closeQuietly(strictLineReader);
                        return;
                    }
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("unexpected journal header: [");
                LIZ.append(readLine);
                LIZ.append(", ");
                LIZ.append(readLine2);
                LIZ.append(", ");
                LIZ.append(readLine4);
                LIZ.append(", ");
                LIZ.append(readLine5);
                LIZ.append("]");
                throw new IOException(X1D.LIZIZ(LIZ));
            }
        } catch (Throwable th) {
            FileUtils.INSTANCE.closeQuietly(strictLineReader);
            throw th;
        }
    }

    public void delete() {
        EPLog.d("DiskLruCache", "delete");
        close();
        FileUtils.INSTANCE.deleteContents(this.directory);
    }

    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i >= 2000 && i >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    public File getDirectory() {
        return this.directory;
    }

    public static void deleteIfExists(File file) {
        if (!file.exists() || C16880lQ.LLLZZIL(file)) {
        } else {
            throw new IOException();
        }
    }

    public static String inputStreamToString(InputStream inputStream) {
        FileUtils fileUtils = FileUtils.INSTANCE;
        return fileUtils.readFully(new InputStreamReader(inputStream, fileUtils.getUTF_8()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r5 == (-1)) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readJournalLine(java.lang.String r9) {
        /*
            r8 = this;
            r1 = 32
            int r6 = r9.indexOf(r1)
            java.lang.String r2 = "unexpected journal line: "
            r7 = -1
            if (r6 == r7) goto L98
            int r0 = r6 + 1
            int r5 = r9.indexOf(r1, r0)
            if (r5 != r7) goto L28
            java.lang.String r1 = r9.substring(r0)
            r0 = 6
            if (r6 != r0) goto L2c
            java.lang.String r0 = "REMOVE"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L2c
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Entry> r0 = r8.lruEntries
            r0.remove(r1)
            return
        L28:
            java.lang.String r1 = r9.substring(r0, r5)
        L2c:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Entry> r0 = r8.lruEntries
            java.lang.Object r3 = r0.get(r1)
            com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Entry r3 = (com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.Entry) r3
            r4 = 0
            if (r3 != 0) goto L41
            com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Entry r3 = new com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Entry
            r3.<init>(r1)
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Entry> r0 = r8.lruEntries
            r0.put(r1, r3)
        L41:
            r1 = 5
            if (r5 == r7) goto L65
            if (r6 != r1) goto L63
            java.lang.String r0 = "CLEAN"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L63
            r2 = 1
            int r0 = r5 + 1
            java.lang.String r1 = r9.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r0 = r1.split(r0)
            r3.readable = r2
            r3.currentEditor = r4
            r3.setLengths(r0)
        L62:
            return
        L63:
            if (r5 != r7) goto L77
        L65:
            if (r6 != r1) goto L79
            java.lang.String r0 = "DIRTY"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L85
            com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Editor r0 = new com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache$Editor
            r0.<init>(r3)
            r3.currentEditor = r0
            goto L62
        L77:
            if (r5 != r7) goto L85
        L79:
            r0 = 4
            if (r6 != r0) goto L85
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L85
            goto L62
        L85:
            java.lang.String r0 = "USE"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L8e
            goto L62
        L8e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = defpackage.i0.LJFF(r2, r9)
            r1.<init>(r0)
            throw r1
        L98:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = defpackage.i0.LJFF(r2, r9)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.cachemanager.common.DiskLruCache.readJournalLine(java.lang.String):void");
    }

    public static String toDiskLruCacheKey(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c != '_' && c != '-') {
                if (c >= 'a') {
                    if (c <= 'z') {
                    }
                    charArray[i] = '_';
                } else {
                    if (c >= '0' && c <= '9') {
                    }
                    charArray[i] = '_';
                }
            }
        }
        return new String(charArray);
    }

    public static String toDiskLruCacheKeyPattern(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == File.separatorChar) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    private boolean validateKey(String str) {
        return LEGAL_KEY_PATTERN.matcher(str).matches();
    }

    public synchronized boolean addEntryToCache(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addEntryToCache:");
        LIZ.append(str);
        EPLog.d("DiskLruCache", X1D.LIZIZ(LIZ));
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
            } else if (entry.currentEditor != null) {
                return false;
            }
            File cleanFile = entry.getCleanFile(0);
            if (cleanFile.exists()) {
                long j = entry.lengths[0];
                long length = cleanFile.length();
                if (cleanFile.isDirectory()) {
                    length = FileUtils.INSTANCE.getFolderSize(cleanFile);
                }
                entry.lengths[0] = length;
                this.size = (this.size - j) + length;
                this.redundantOpCount++;
                entry.currentEditor = null;
                entry.readable = true;
                Writer writer = this.journalWriter;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CLEAN ");
                LIZ2.append(entry.key);
                LIZ2.append(entry.getLengths());
                LIZ2.append('\n');
                writer.write(X1D.LIZIZ(LIZ2));
                long j2 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j2;
                entry.sequenceNumber = j2;
                this.journalWriter.flush();
                if (this.size > this.maxSize || journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                return true;
            }
            this.lruEntries.remove(entry.key);
            Writer writer2 = this.journalWriter;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("REMOVE ");
            LIZ3.append(entry.key);
            LIZ3.append('\n');
            writer2.write(X1D.LIZIZ(LIZ3));
            return false;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        LIZ4.append(str);
        LIZ4.append("\"");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ4));
    }

    public Editor edit(String str) {
        return edit(str, -1L);
    }

    public synchronized Snapshot get(String str) {
        InputStream inputStream;
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return null;
            }
            if (!entry.readable) {
                return null;
            }
            int i = this.valueCount;
            InputStream[] inputStreamArr = new InputStream[i];
            File[] fileArr = new File[i];
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                try {
                    fileArr[i2] = entry.getCleanFile(i2);
                    inputStreamArr[i2] = new FileInputStream(fileArr[i2]);
                } catch (FileNotFoundException unused) {
                    for (int i3 = 0; i3 < this.valueCount && (inputStream = inputStreamArr[i3]) != null; i3++) {
                        FileUtils.INSTANCE.closeQuietly(inputStream);
                    }
                    return null;
                }
            }
            this.redundantOpCount++;
            Writer writer = this.journalWriter;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("READ ");
            LIZ.append(str);
            LIZ.append('\n');
            writer.append((CharSequence) X1D.LIZIZ(LIZ));
            this.journalWriter.flush();
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return new Snapshot(str, entry.sequenceNumber, fileArr, inputStreamArr, entry.lengths);
        }
        remove(str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        LIZ2.append(str);
        LIZ2.append("\"");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public synchronized boolean has(String str) {
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return false;
            }
            if (!entry.readable) {
                return false;
            }
            try {
                this.redundantOpCount++;
                Writer writer = this.journalWriter;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("READ ");
                LIZ.append(str);
                LIZ.append('\n');
                writer.write(X1D.LIZIZ(LIZ));
                this.journalWriter.flush();
                if (journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
            } catch (IOException unused) {
            }
            return true;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        LIZ2.append(str);
        LIZ2.append("\"");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public synchronized void readKeyInMemory(String str) {
        checkNotClosed();
        this.lruEntries.get(str);
    }

    public synchronized boolean remove(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remove:");
        LIZ.append(str);
        EPLog.d("DiskLruCache", X1D.LIZIZ(LIZ));
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            boolean z = true;
            if (entry == null || entry.currentEditor != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("remove: can not:");
                if (entry != null) {
                    z = false;
                }
                LIZ2.append(z);
                EPLog.e("DiskLruCache", X1D.LIZIZ(LIZ2));
                return false;
            }
            this.redundantOpCount++;
            Writer writer = this.journalWriter;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("REMOVE ");
            LIZ3.append(str);
            LIZ3.append('\n');
            writer.append((CharSequence) X1D.LIZIZ(LIZ3));
            this.journalWriter.flush();
            this.lruEntries.remove(str);
            for (int i = 0; i < this.valueCount; i++) {
                File cleanFile = entry.getCleanFile(i);
                if (cleanFile.exists()) {
                    if (!cleanFile.isFile() || C16880lQ.LLLZZIL(cleanFile)) {
                        if (cleanFile.isDirectory() && !FileUtils.INSTANCE.deleteDir(cleanFile)) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("remove  err:");
                            LIZ4.append(str);
                            EPLog.e("DiskLruCache", X1D.LIZIZ(LIZ4));
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("failed to delete ");
                            LIZ5.append(cleanFile);
                            throw new IOException(X1D.LIZIZ(LIZ5));
                        }
                    } else {
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("remove  err:");
                        LIZ6.append(str);
                        EPLog.e("DiskLruCache", X1D.LIZIZ(LIZ6));
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("failed to delete ");
                        LIZ7.append(cleanFile);
                        throw new IOException(X1D.LIZIZ(LIZ7));
                    }
                }
                long j = this.size;
                long[] jArr = entry.lengths;
                this.size = j - jArr[i];
                jArr[i] = 0;
            }
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return true;
        }
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        LIZ8.append(str);
        LIZ8.append("\"");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ8));
    }

    public synchronized void setMaxSize(long j) {
        this.maxSize = j;
        this.executorService.submit(this.cleanupCallable);
    }

    public synchronized void completeEdit(Editor editor, boolean z) {
        String str;
        Entry entry = editor.entry;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("completeEdit start, key: ");
        if (entry != null) {
            str = entry.key;
        } else {
            str = "null";
        }
        LIZ.append(str);
        LIZ.append(", success: ");
        LIZ.append(z);
        EPLog.d("DiskLruCache", X1D.LIZIZ(LIZ));
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i = 0; i < this.valueCount; i++) {
                    if (editor.written[i]) {
                        if (!entry.getDirtyFile(i).exists()) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Newly created entry didn't create value for index ");
                        LIZ2.append(i);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                    }
                }
            }
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File dirtyFile = entry.getDirtyFile(i2);
                if (z) {
                    if (dirtyFile.exists()) {
                        File cleanFile = entry.getCleanFile(i2);
                        dirtyFile.renameTo(cleanFile);
                        long j = entry.lengths[i2];
                        long length = cleanFile.length();
                        entry.lengths[i2] = length;
                        this.size = (this.size - j) + length;
                    }
                } else {
                    deleteIfExists(dirtyFile);
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable | z) {
                entry.readable = true;
                Writer writer = this.journalWriter;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("CLEAN ");
                LIZ3.append(entry.key);
                LIZ3.append(entry.getLengths());
                LIZ3.append('\n');
                writer.write(X1D.LIZIZ(LIZ3));
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.sequenceNumber = j2;
                }
            } else {
                this.lruEntries.remove(entry.key);
                Writer writer2 = this.journalWriter;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("REMOVE ");
                LIZ4.append(entry.key);
                LIZ4.append('\n');
                writer2.write(X1D.LIZIZ(LIZ4));
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized Editor edit(String str, long j) {
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (j != -1) {
                if (entry == null || entry.sequenceNumber != j) {
                    return null;
                }
            } else if (entry == null) {
                entry = new Entry(str);
                this.lruEntries.put(str, entry);
                Editor editor = new Editor(entry);
                entry.currentEditor = editor;
                Writer writer = this.journalWriter;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DIRTY ");
                LIZ.append(str);
                LIZ.append('\n');
                writer.write(X1D.LIZIZ(LIZ));
                this.journalWriter.flush();
                return editor;
            }
            if (entry.currentEditor != null) {
                return null;
            }
            Editor editor2 = new Editor(entry);
            entry.currentEditor = editor2;
            Writer writer2 = this.journalWriter;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DIRTY ");
            LIZ2.append(str);
            LIZ2.append('\n');
            writer2.write(X1D.LIZIZ(LIZ2));
            this.journalWriter.flush();
            return editor2;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        LIZ3.append(str);
        LIZ3.append("\"");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
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

    public DiskLruCache(File file, int i, int i2, long j) {
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new File(file, "journal");
        this.journalFileTmp = new File(file, "journal.tmp");
        this.journalFileBackup = new File(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
    }

    public static synchronized DiskLruCache open(File file, int i, int i2, long j, IAllowListRule iAllowListRule) {
        synchronized (DiskLruCache.class) {
            if (j > 0) {
                if (i2 > 0) {
                    File file2 = new File(file, "journal.bkp");
                    if (file2.exists()) {
                        File file3 = new File(file, "journal");
                        if (file3.exists()) {
                            C16880lQ.LLLZZIL(file2);
                        } else {
                            renameTo(file2, file3, false);
                        }
                    }
                    DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
                    if (diskLruCache.journalFile.exists()) {
                        try {
                            diskLruCache.readJournal();
                            diskLruCache.processJournal();
                            return diskLruCache;
                        } catch (IOException e) {
                            PrintStream printStream = System.out;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("DiskLruCache ");
                            LIZ.append(file);
                            LIZ.append(" is corrupt: ");
                            LIZ.append(e.getMessage());
                            LIZ.append(", removing");
                            printStream.println(X1D.LIZIZ(LIZ));
                            diskLruCache.delete();
                        }
                    }
                    file.mkdirs();
                    DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
                    diskLruCache2.rebuildJournal();
                    if (iAllowListRule != null) {
                        diskLruCache2.mAllowKeyRule = iAllowListRule;
                    }
                    return diskLruCache2;
                }
                throw new IllegalArgumentException("valueCount <= 0");
            }
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
