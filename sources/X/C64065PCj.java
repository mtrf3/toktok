package X;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PCj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64065PCj {
    public static C64069PCn LIZ(FileChannel fileChannel) {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535L);
            long j2 = 0;
            if (0 <= min) {
                while (true) {
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
                        long j4 = allocate2.getShort(0);
                        if (j4 == j2) {
                            ByteBuffer allocate3 = ByteBuffer.allocate(4);
                            allocate3.order(byteOrder);
                            fileChannel.position((fileChannel.size() - j4) - 6);
                            fileChannel.read(allocate3);
                            long j5 = allocate3.getInt(0);
                            if (j5 >= 32) {
                                fileChannel.position(j5 - 24);
                                ByteBuffer allocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(allocate4);
                                allocate4.order(byteOrder);
                                if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                                    long j6 = allocate4.getLong(0);
                                    if (j6 >= allocate4.capacity() && j6 <= 2147483639) {
                                        int i = (int) (8 + j6);
                                        long j7 = j5 - i;
                                        if (j7 >= 0) {
                                            fileChannel.position(j7);
                                            ByteBuffer allocate5 = ByteBuffer.allocate(i);
                                            fileChannel.read(allocate5);
                                            allocate5.order(byteOrder);
                                            long j8 = allocate5.getLong(0);
                                            if (j8 == j6) {
                                                return new C64069PCn(allocate5, Long.valueOf(j7));
                                            }
                                            StringBuilder LIZJ = V10.LIZJ("APK Signing Block sizes in header and footer do not match: ", j8, " vs ");
                                            LIZJ.append(j6);
                                            throw new C64066PCk(X1D.LIZIZ(LIZJ));
                                        }
                                        throw new C64066PCk(C61845OOz.LIZ("APK Signing Block offset out of range: ", j7));
                                    }
                                    throw new C64066PCk(C61845OOz.LIZ("APK Signing Block size out of range: ", j6));
                                }
                                throw new C64066PCk("No APK Signing Block before ZIP Central Directory");
                            }
                            throw new C64066PCk(C61845OOz.LIZ("APK too small for APK Signing Block. ZIP Central Directory offset: ", j5));
                        }
                    }
                    if (j2 == min) {
                        break;
                    }
                    j2++;
                }
            }
            throw new IOException("ZIP End of Central Directory (EOCD) record not found");
        }
        throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "r"
            r5.<init>(r7, r0)     // Catch: java.lang.Throwable -> L69
            java.nio.channels.FileChannel r1 = r5.getChannel()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "randomAccessFile.channel"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L6a
            X.PCn r0 = LIZ(r1)     // Catch: java.lang.Throwable -> L6a
            A r0 = r0.LIZ     // Catch: java.lang.Throwable -> L6a
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> L6a
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L6a
            java.util.Map r2 = LIZJ(r0)     // Catch: java.lang.Throwable -> L6a
            r1 = 1903654775(0x71777777, float:1.22539554E30)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L6c
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L6a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L6a
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L6a
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L6a
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> L6a
            byte[] r3 = r0.array()     // Catch: java.lang.Throwable -> L6a
            int r2 = r0.arrayOffset()     // Catch: java.lang.Throwable -> L6a
            int r1 = r0.position()     // Catch: java.lang.Throwable -> L6a
            int r1 = r1 + r2
            int r0 = r0.limit()     // Catch: java.lang.Throwable -> L6a
            int r0 = r0 + r2
            byte[] r1 = java.util.Arrays.copyOfRange(r3, r1, r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "copyOfRange(array, array…set + byteBuffer.limit())"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L6a
            java.nio.charset.Charset r0 = X.PVC.LIZ     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L6a
            r5.close()     // Catch: java.lang.Throwable -> L68
        L68:
            return r4
        L69:
            r5 = r6
        L6a:
            if (r5 == 0) goto L6f
        L6c:
            r5.close()     // Catch: java.lang.Throwable -> L6f
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64065PCj.LIZIZ(java.lang.String):java.lang.String");
    }

    public static java.util.Map LIZJ(ByteBuffer byteBuffer) {
        boolean z;
        boolean z2;
        boolean z3;
        if (o.LJ(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            int capacity = byteBuffer.capacity() - 24;
            int i = 0;
            if (capacity >= 8) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int capacity2 = byteBuffer.capacity();
                if (capacity <= byteBuffer.capacity()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
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
                            i++;
                            if (slice.remaining() >= 8) {
                                long j = slice.getLong();
                                if (j >= 4 && j <= 2147483647L) {
                                    int i2 = (int) j;
                                    int position2 = slice.position() + i2;
                                    if (i2 <= slice.remaining()) {
                                        Integer valueOf = Integer.valueOf(slice.getInt());
                                        int i3 = i2 - 4;
                                        if (i3 >= 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            int limit2 = slice.limit();
                                            int position3 = slice.position();
                                            int i4 = i3 + position3;
                                            if (i4 >= position3 && i4 <= limit2) {
                                                slice.limit(i4);
                                                try {
                                                    ByteBuffer slice2 = slice.slice();
                                                    slice2.order(slice.order());
                                                    slice.position(i4);
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
                                            String LJ = KMP.LJ("size: ", i3);
                                            LJ.toString();
                                            throw new IllegalArgumentException(LJ);
                                        }
                                    } else {
                                        StringBuilder LIZJ = C06460Ne.LIZJ("APK Signing Block entry #", i, " size out of range: ", i2, ", available: ");
                                        LIZJ.append(slice.remaining());
                                        throw new C64066PCk(X1D.LIZIZ(LIZJ));
                                    }
                                } else {
                                    throw new C64066PCk(C00F.LIZJ("APK Signing Block entry #", i, " size out of range: ", j));
                                }
                            } else {
                                throw new C64066PCk(KMP.LJ("Insufficient data to read size of APK Signing Block entry #", i));
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
                String LIZLLL = C48263Iwt.LIZLLL("end > capacity: ", capacity, " > ", capacity2);
                LIZLLL.toString();
                throw new IllegalArgumentException(LIZLLL);
            }
            String LIZLLL2 = C48263Iwt.LIZLLL("end < start: ", capacity, " < ", 8);
            LIZLLL2.toString();
            throw new IllegalArgumentException(LIZLLL2);
        }
        "ByteBuffer byte order must be little endian".toString();
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
}
