package ms.bd.o;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class y {

    /* loaded from: classes7.dex */
    public static final class a<A, B> {
        public final A LIZ;
        public final B LIZIZ;

        public a(A a, B b) {
            this.LIZ = a;
            this.LIZIZ = b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            A a = this.LIZ;
            if (a == null) {
                if (aVar.LIZ != null) {
                    return false;
                }
            } else if (!a.equals(aVar.LIZ)) {
                return false;
            }
            B b = this.LIZIZ;
            B b2 = aVar.LIZIZ;
            return b == null ? b2 == null : b.equals(b2);
        }

        public final int hashCode() {
            A a = this.LIZ;
            int hashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
            B b = this.LIZIZ;
            return hashCode + (b != null ? b.hashCode() : 0);
        }
    }

    /* loaded from: classes7.dex */
    public static class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZJ() {
        boolean z;
        try {
            Class.forName(new String[]{k.a(16777217, 0, 0L, "8864bc", new byte[]{42, 53, 72, 14, 95, 109, 47, 28, 99, 101, 39, 57, 64, 14, 73, 96, 53, 28, 115, 42, 29, 14, 107, 69, 73, 93, 53, 16, 115})}[0]);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        return true & z;
    }

    public static Map<Integer, ByteBuffer> LIZ(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            int capacity = byteBuffer.capacity() - 24;
            if (capacity >= 8) {
                byteBuffer.capacity();
                if (capacity <= byteBuffer.capacity()) {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(capacity);
                        byteBuffer.position(8);
                        ByteBuffer slice = byteBuffer.slice();
                        slice.order(byteBuffer.order());
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (slice.hasRemaining()) {
                            if (slice.remaining() >= 8) {
                                long j = slice.getLong();
                                if (j >= 4 && j <= 2147483647L) {
                                    int i = (int) j;
                                    int position2 = slice.position() + i;
                                    if (i <= slice.remaining()) {
                                        Integer valueOf = Integer.valueOf(slice.getInt());
                                        int i2 = i - 4;
                                        if (i2 >= 0) {
                                            int limit2 = slice.limit();
                                            int position3 = slice.position();
                                            int i3 = i2 + position3;
                                            if (i3 >= position3 && i3 <= limit2) {
                                                slice.limit(i3);
                                                try {
                                                    ByteBuffer slice2 = slice.slice();
                                                    slice2.order(slice.order());
                                                    slice.position(i3);
                                                    slice.limit(limit2);
                                                    linkedHashMap.put(valueOf, slice2);
                                                    slice.position(position2);
                                                } catch (Throwable th) {
                                                    slice.limit(limit2);
                                                    throw th;
                                                }
                                            } else {
                                                throw new BufferUnderflowException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException((String) k.a(16777217, 0, 0L, "7979b6", new byte[]{116}));
                                        }
                                    } else {
                                        throw new b((String) k.a(16777217, 0, 0L, "2c6bf0", new byte[]{123}));
                                    }
                                } else {
                                    throw new b((String) k.a(16777217, 0, 0L, "8cf120", new byte[]{126}));
                                }
                            } else {
                                throw new b((String) k.a(16777217, 0, 0L, "21f846", new byte[]{117}));
                            }
                        }
                        return linkedHashMap;
                    } catch (Throwable th2) {
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        throw th2;
                    }
                }
                throw new IllegalArgumentException((String) k.a(16777217, 0, 0L, "974440", new byte[]{125}));
            }
            throw new IllegalArgumentException((String) k.a(16777217, 0, 0L, "64e613", new byte[]{115}));
        }
        throw new IllegalArgumentException((String) k.a(16777217, 0, 0L, "ec1062", new byte[]{37}));
    }

    public static a<ByteBuffer, Long> LIZIZ(FileChannel fileChannel) {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535L);
            int i = 0;
            while (true) {
                long j2 = i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(byteOrder);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            ByteBuffer allocate3 = ByteBuffer.allocate(4);
                            allocate3.order(byteOrder);
                            fileChannel.position((fileChannel.size() - s) - 6);
                            fileChannel.read(allocate3);
                            long j4 = allocate3.getInt(0);
                            if (j4 >= 32) {
                                fileChannel.position(j4 - 24);
                                ByteBuffer allocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(allocate4);
                                allocate4.order(byteOrder);
                                if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                                    long j5 = allocate4.getLong(0);
                                    if (j5 >= allocate4.capacity() && j5 <= 2147483639) {
                                        int i2 = (int) (8 + j5);
                                        long j6 = j4 - i2;
                                        if (j6 >= 0) {
                                            fileChannel.position(j6);
                                            ByteBuffer allocate5 = ByteBuffer.allocate(i2);
                                            fileChannel.read(allocate5);
                                            allocate5.order(byteOrder);
                                            if (allocate5.getLong(0) == j5) {
                                                return new a<>(allocate5, Long.valueOf(j6));
                                            }
                                        }
                                    }
                                }
                                return null;
                            }
                            throw new b((String) k.a(16777217, 0, 0L, "a550c3", new byte[]{41}));
                        }
                    }
                    i++;
                } else {
                    throw new IOException((String) k.a(16777217, 0, 0L, "260ad5", new byte[]{114, 100}));
                }
            }
        } else {
            throw new IOException((String) k.a(16777217, 0, 0L, "433011", new byte[]{116, 96}));
        }
    }
}
