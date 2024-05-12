package net.jpountz.lz4;

/* loaded from: classes15.dex */
public final class LZ4JavaSafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r17, r5, r7, r15, r6);
        r7 = r7 - r0;
        r5 = r5 - r0;
        r4 = r7 - r6;
        r3 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if ((((r3 + r4) + 8) + (r4 >>> 8)) > r22) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r4 < 15) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, 240);
        r3 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r17, r6, r20, r3, r4);
        r3 = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeShortLE(r20, r3, (short) (r7 - r5));
        r3 = r3 + 2;
        r7 = r7 + 4;
        r4 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r17, r5 + 4, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (((r3 + 6) + (r4 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r7 = r7 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r4 < 15) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, net.jpountz.util.ByteBufferUtils.readByte(r20, r1) | 15);
        r1 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r7 <= r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r3 = r7 - 2;
        net.jpountz.util.SafeUtils.writeShort(r8, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r3)), r3 - r15);
        r3 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r7));
        r5 = net.jpountz.util.SafeUtils.readShort(r8, r3) + r15;
        net.jpountz.util.SafeUtils.writeShort(r8, r3, r7 - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r17, r7, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        r3 = r1 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, r4 | net.jpountz.util.ByteBufferUtils.readByte(r20, r1));
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, r4 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r3 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r13, r7, r10, r24, r2);
        r10 = r10 - r3;
        r7 = r7 - r3;
        r6 = r10 - r2;
        r5 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if ((((r5 + r6) + 8) + (r6 >>> 8)) > r15) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (r6 < 15) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r12, r1, 240);
        r5 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r6 - 15, r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r13, r2, r12, r5, r6);
        r5 = r5 + r6;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeShortLE(r12, r5, r0);
        r4 = r5 + 2;
        r2 = r2 + 4;
        r5 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r13, r7 + 4, r2, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        if (((r4 + 6) + (r5 >>> 8)) > r15) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
    
        r2 = r2 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        if (r5 < 15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r12, r1, net.jpountz.util.ByteBufferUtils.readByte(r12, r1) | 15);
        r1 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r5 - 15, r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ee, code lost:
    
        if (r2 <= r14) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
    
        r4 = r2 - 2;
        net.jpountz.util.SafeUtils.writeInt(r8, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r13, r4)), r4);
        r0 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r13, r2));
        r7 = net.jpountz.util.SafeUtils.readInt(r8, r0);
        net.jpountz.util.SafeUtils.writeInt(r8, r0, r2);
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0112, code lost:
    
        if (r0 >= 65536) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r13, r7, r2) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        r5 = r1 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r12, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        return net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r13, r2, r18 - r2, r12, r1, r15) - r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0125, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r12, r1, r5 | net.jpountz.util.ByteBufferUtils.readByte(r12, r1));
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0140, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012f, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r12, r1, r6 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0146, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(java.nio.ByteBuffer r23, int r24, int r25, java.nio.ByteBuffer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        r0 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r17, r5, r7, r15, r6);
        r7 = r7 - r0;
        r5 = r5 - r0;
        r4 = r7 - r6;
        r3 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if ((((r3 + r4) + 8) + (r4 >>> 8)) > r22) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r4 < 15) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, 240);
        r3 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r17, r6, r20, r3, r4);
        r3 = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        net.jpountz.util.SafeUtils.writeShortLE(r20, r3, (short) (r7 - r5));
        r3 = r3 + 2;
        r7 = r7 + 4;
        r4 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r17, r5 + 4, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (((r3 + 6) + (r4 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r7 = r7 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r4 < 15) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, net.jpountz.util.SafeUtils.readByte(r20, r1) | 15);
        r1 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r7 <= r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r3 = r7 - 2;
        net.jpountz.util.SafeUtils.writeShort(r8, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.SafeUtils.readInt(r17, r3)), r3 - r15);
        r3 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.SafeUtils.readInt(r17, r7));
        r5 = net.jpountz.util.SafeUtils.readShort(r8, r3) + r15;
        net.jpountz.util.SafeUtils.writeShort(r8, r3, r7 - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r17, r7, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        r3 = r1 + 1;
        net.jpountz.util.SafeUtils.writeByte(r20, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, r4 | net.jpountz.util.SafeUtils.readByte(r20, r1));
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, r4 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        r0 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r19, r12, r4, r20, r14);
        r4 = r4 - r0;
        r12 = r12 - r0;
        r15 = r4 - r14;
        r13 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        if ((((r13 + r15) + 8) + (r15 >>> 8)) > r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r15 < 15) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, 240);
        r13 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r15 - 15, r22, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r19, r14, r22, r13, r15);
        r13 = r13 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        net.jpountz.util.SafeUtils.writeShortLE(r22, r13, r11);
        r11 = r13 + 2;
        r4 = r4 + 4;
        r12 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r19, r12 + 4, r4, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (((r11 + 6) + (r12 >>> 8)) > r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        r4 = r4 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (r12 < 15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, net.jpountz.util.SafeUtils.readByte(r22, r1) | 15);
        r1 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r12 - 15, r22, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (r4 <= r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        r11 = r4 - 2;
        net.jpountz.util.SafeUtils.writeInt(r3, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.SafeUtils.readInt(r19, r11)), r11);
        r0 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.SafeUtils.readInt(r19, r4));
        r12 = net.jpountz.util.SafeUtils.readInt(r3, r0);
        net.jpountz.util.SafeUtils.writeInt(r3, r0, r4);
        r11 = r4 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        if (r11 >= 65536) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r19, r12, r4) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        r13 = r1 + 1;
        net.jpountz.util.SafeUtils.writeByte(r22, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0052, code lost:
    
        return net.jpountz.lz4.LZ4SafeUtils.lastLiterals(r19, r14, r7 - r14, r22, r1, r10) - r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, r12 | net.jpountz.util.SafeUtils.readByte(r22, r1));
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, r15 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011a, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }
}
