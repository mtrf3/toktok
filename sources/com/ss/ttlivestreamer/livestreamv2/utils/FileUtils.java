package com.ss.ttlivestreamer.livestreamv2.utils;

import X.C16880lQ;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class FileUtils {

    /* loaded from: classes7.dex */
    public static class File {
        public FileOutputStream mFileOutputStream;
        public String mName;

        public void close() {
            try {
                this.mFileOutputStream.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }

        public String name() {
            return this.mName;
        }

        public void write(byte[] bArr) {
            try {
                this.mFileOutputStream.write(bArr);
                this.mFileOutputStream.flush();
            } catch (IOException e) {
                throw new AndroidRuntimeException(e.getMessage());
            }
        }

        public void write(Buffer buffer) {
            if (buffer instanceof ByteBuffer) {
                write((ByteBuffer) buffer);
                return;
            }
            throw new AndroidRuntimeException("Unsupport");
        }

        public void write(ByteBuffer byteBuffer) {
            byteBuffer.position(0);
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr);
            write(bArr);
        }

        public File(FileOutputStream fileOutputStream, String str) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Open write file ");
            LIZ.append(str);
            AVLog.w("Utils.File", X1D.LIZIZ(LIZ));
            this.mFileOutputStream = fileOutputStream;
            this.mName = str;
        }
    }

    public static File CreateWriteFile(String str) {
        try {
            return new File(new FileOutputStream(new java.io.File(str)), str);
        } catch (FileNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            throw new AndroidRuntimeException(e.getMessage());
        }
    }
}
