package X;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.IlT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47555IlT {
    public static void LIZ(String str) {
        System.currentTimeMillis();
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                map.load();
                map.isLoaded();
                map.capacity();
                randomAccessFile.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }
}
