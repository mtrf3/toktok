package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes15.dex */
public final class LZ4HCJavaSafeCompressor extends LZ4Compressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaSafeCompressor();
    public final int compressionLevel;
    public final int maxAttempts;

    public LZ4HCJavaSafeCompressor() {
        this(9);
    }

    /* loaded from: classes15.dex */
    public class HashTable {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final int base;
        public final short[] chainTable;
        public final int[] hashTable;
        public int nextToUpdate;

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        private int next(int i) {
            return i - (this.chainTable[i & 65535] & 65535);
        }

        public HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
            this.chainTable = new short[65536];
        }

        private void addHash(int i, int i2) {
            int hashHC = LZ4Utils.hashHC(i);
            int[] iArr = this.hashTable;
            int i3 = i2 - iArr[hashHC];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.chainTable[65535 & i2] = (short) i3;
            iArr[hashHC] = i2;
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i));
        }

        public void insert(int i, ByteBuffer byteBuffer) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(byteBuffer, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i), i);
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(SafeUtils.readInt(bArr, i));
        }

        public void insert(int i, byte[] bArr) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(bArr, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private void addHash(byte[] bArr, int i) {
            addHash(SafeUtils.readInt(bArr, i), i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        
            r6 = (r5 + r9) - 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
        
            if (r9 >= (r6 - r4)) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
        
            r7.chainTable[65535 & r9] = (short) r4;
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        
            r7.chainTable[r9 & 65535] = (short) r4;
            r7.hashTable[net.jpountz.lz4.LZ4Utils.hashHC(net.jpountz.util.ByteBufferUtils.readInt(r8, r9))] = r9;
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (r9 < r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
        
            r7.nextToUpdate = r6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean insertAndFindBestMatch(java.nio.ByteBuffer r8, int r9, int r10, net.jpountz.lz4.LZ4Utils.Match r11) {
            /*
                r7 = this;
                r11.start = r9
                r3 = 0
                r11.len = r3
                r7.insert(r9, r8)
                int r6 = r7.hashPointer(r8, r9)
                int r0 = r9 + (-4)
                if (r6 < r0) goto L7e
                if (r6 > r9) goto L7e
                int r0 = r7.base
                if (r6 < r0) goto L7e
                boolean r0 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r8, r6, r9)
                if (r0 == 0) goto L7b
                int r4 = r9 - r6
                int r1 = r6 + 4
                int r0 = r9 + 4
                int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r8, r1, r0, r10)
                int r5 = r0 + 4
                r11.len = r5
                r11.ref = r6
            L2c:
                int r6 = r7.next(r6)
            L30:
                r2 = 0
            L31:
                net.jpountz.lz4.LZ4HCJavaSafeCompressor r0 = net.jpountz.lz4.LZ4HCJavaSafeCompressor.this
                int r0 = r0.maxAttempts
                if (r2 >= r0) goto L47
                int r1 = r7.base
                r0 = 65536(0x10000, float:9.1835E-41)
                int r0 = r9 - r0
                int r0 = r0 + 1
                int r0 = java.lang.Math.max(r1, r0)
                if (r6 < r0) goto L47
                if (r6 <= r9) goto L5c
            L47:
                if (r5 == 0) goto L9a
                int r5 = r5 + r9
                int r6 = r5 + (-3)
            L4c:
                int r0 = r6 - r4
                r5 = 65535(0xffff, float:9.1834E-41)
                if (r9 >= r0) goto L81
                short[] r1 = r7.chainTable
                r5 = r5 & r9
                short r0 = (short) r4
                r1[r5] = r0
                int r9 = r9 + 1
                goto L4c
            L5c:
                boolean r0 = net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r8, r6, r9)
                if (r0 == 0) goto L74
                int r1 = r6 + 4
                int r0 = r9 + 4
                int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r8, r1, r0, r10)
                int r1 = r0 + 4
                int r0 = r11.len
                if (r1 <= r0) goto L74
                r11.ref = r6
                r11.len = r1
            L74:
                int r6 = r7.next(r6)
                int r2 = r2 + 1
                goto L31
            L7b:
                r4 = 0
                r5 = 0
                goto L2c
            L7e:
                r4 = 0
                r5 = 0
                goto L30
            L81:
                short[] r2 = r7.chainTable
                r1 = r9 & r5
                short r0 = (short) r4
                r2[r1] = r0
                int[] r1 = r7.hashTable
                int r0 = net.jpountz.util.ByteBufferUtils.readInt(r8, r9)
                int r0 = net.jpountz.lz4.LZ4Utils.hashHC(r0)
                r1[r0] = r9
                int r9 = r9 + 1
                if (r9 < r6) goto L81
                r7.nextToUpdate = r6
            L9a:
                int r0 = r11.len
                if (r0 == 0) goto L9f
                r3 = 1
            L9f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.HashTable.insertAndFindBestMatch(java.nio.ByteBuffer, int, int, net.jpountz.lz4.LZ4Utils$Match):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        
            r6 = (r5 + r9) - 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
        
            if (r9 >= (r6 - r4)) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
        
            r7.chainTable[65535 & r9] = (short) r4;
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        
            r7.chainTable[r9 & 65535] = (short) r4;
            r7.hashTable[net.jpountz.lz4.LZ4Utils.hashHC(net.jpountz.util.SafeUtils.readInt(r8, r9))] = r9;
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (r9 < r6) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
        
            r7.nextToUpdate = r6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean insertAndFindBestMatch(byte[] r8, int r9, int r10, net.jpountz.lz4.LZ4Utils.Match r11) {
            /*
                r7 = this;
                r11.start = r9
                r3 = 0
                r11.len = r3
                r7.insert(r9, r8)
                int r6 = r7.hashPointer(r8, r9)
                int r0 = r9 + (-4)
                if (r6 < r0) goto L7e
                if (r6 > r9) goto L7e
                int r0 = r7.base
                if (r6 < r0) goto L7e
                boolean r0 = net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r8, r6, r9)
                if (r0 == 0) goto L7b
                int r4 = r9 - r6
                int r1 = r6 + 4
                int r0 = r9 + 4
                int r0 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r8, r1, r0, r10)
                int r5 = r0 + 4
                r11.len = r5
                r11.ref = r6
            L2c:
                int r6 = r7.next(r6)
            L30:
                r2 = 0
            L31:
                net.jpountz.lz4.LZ4HCJavaSafeCompressor r0 = net.jpountz.lz4.LZ4HCJavaSafeCompressor.this
                int r0 = r0.maxAttempts
                if (r2 >= r0) goto L47
                int r1 = r7.base
                r0 = 65536(0x10000, float:9.1835E-41)
                int r0 = r9 - r0
                int r0 = r0 + 1
                int r0 = java.lang.Math.max(r1, r0)
                if (r6 < r0) goto L47
                if (r6 <= r9) goto L5c
            L47:
                if (r5 == 0) goto L9a
                int r5 = r5 + r9
                int r6 = r5 + (-3)
            L4c:
                int r0 = r6 - r4
                r5 = 65535(0xffff, float:9.1834E-41)
                if (r9 >= r0) goto L81
                short[] r1 = r7.chainTable
                r5 = r5 & r9
                short r0 = (short) r4
                r1[r5] = r0
                int r9 = r9 + 1
                goto L4c
            L5c:
                boolean r0 = net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r8, r6, r9)
                if (r0 == 0) goto L74
                int r1 = r6 + 4
                int r0 = r9 + 4
                int r0 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r8, r1, r0, r10)
                int r1 = r0 + 4
                int r0 = r11.len
                if (r1 <= r0) goto L74
                r11.ref = r6
                r11.len = r1
            L74:
                int r6 = r7.next(r6)
                int r2 = r2 + 1
                goto L31
            L7b:
                r4 = 0
                r5 = 0
                goto L2c
            L7e:
                r4 = 0
                r5 = 0
                goto L30
            L81:
                short[] r2 = r7.chainTable
                r1 = r9 & r5
                short r0 = (short) r4
                r2[r1] = r0
                int[] r1 = r7.hashTable
                int r0 = net.jpountz.util.SafeUtils.readInt(r8, r9)
                int r0 = net.jpountz.lz4.LZ4Utils.hashHC(r0)
                r1[r0] = r9
                int r9 = r9 + 1
                if (r9 < r6) goto L81
                r7.nextToUpdate = r6
            L9a:
                int r0 = r11.len
                if (r0 == 0) goto L9f
                r3 = 1
            L9f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.HashTable.insertAndFindBestMatch(byte[], int, int, net.jpountz.lz4.LZ4Utils$Match):boolean");
        }

        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i)) {
                    int commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i3) + 4;
                    int commonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, hashPointer, i, this.base, i2);
                    int i6 = commonBytes + commonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = hashPointer - commonBytesBackward;
                        match.start = i - commonBytesBackward;
                    }
                }
                hashPointer = next(hashPointer);
            }
            if (match.len <= i4) {
                return false;
            }
            return true;
        }

        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i)) {
                    int commonBytes = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i3) + 4;
                    int commonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, hashPointer, i, this.base, i2);
                    int i6 = commonBytes + commonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = hashPointer - commonBytesBackward;
                        match.start = i - commonBytesBackward;
                    }
                }
                hashPointer = next(hashPointer);
            }
            if (match.len <= i4) {
                return false;
            }
            return true;
        }
    }

    public LZ4HCJavaSafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5 = i;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return compress(byteBuffer.array(), byteBuffer.arrayOffset() + i5, i2, byteBuffer2.array(), byteBuffer2.arrayOffset() + i3, i4);
        }
        ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(inNativeByteOrder, i5, i2);
        ByteBufferUtils.checkRange(inNativeByteOrder2, i3, i4);
        int i6 = i5 + i2;
        int i7 = i3 + i4;
        int i8 = i6 - 12;
        int i9 = i6 - 5;
        int i10 = i5 + 1;
        HashTable hashTable = new HashTable(i5);
        LZ4Utils.Match match = new LZ4Utils.Match();
        LZ4Utils.Match match2 = new LZ4Utils.Match();
        LZ4Utils.Match match3 = new LZ4Utils.Match();
        LZ4Utils.Match match4 = new LZ4Utils.Match();
        int i11 = i3;
        while (i10 < i8) {
            if (!hashTable.insertAndFindBestMatch(inNativeByteOrder, i10, i9, match2)) {
                i10++;
            } else {
                LZ4Utils.copyTo(match2, match);
                while (match2.end() < i8) {
                    if (!hashTable.insertAndFindWiderMatch(inNativeByteOrder, match2.end() - 2, match2.start + 1, i9, match2.len, match3)) {
                        break;
                    }
                    int i12 = match.start;
                    int i13 = match2.start;
                    if (i12 < i13 && match3.start < i13 + match.len) {
                        LZ4Utils.copyTo(match, match2);
                    }
                    if (match3.start - match2.start < 3) {
                        LZ4Utils.copyTo(match3, match2);
                    } else {
                        while (true) {
                            int i14 = match3.start;
                            int i15 = match2.start;
                            if (i14 - i15 < 18) {
                                int i16 = match2.len;
                                if (i16 > 18) {
                                    i16 = 18;
                                }
                                if (i15 + i16 > match3.end() - 4) {
                                    i16 = ((match3.start - match2.start) + match3.len) - 4;
                                }
                                int i17 = i16 - (match3.start - match2.start);
                                if (i17 > 0) {
                                    match3.fix(i17);
                                }
                            }
                            if (match3.start + match3.len >= i8) {
                                break;
                            }
                            HashTable hashTable2 = hashTable;
                            if (!hashTable.insertAndFindWiderMatch(inNativeByteOrder, match3.end() - 3, match3.start, i9, match3.len, match4)) {
                                hashTable = hashTable2;
                                break;
                            }
                            if (match4.start < match2.end() + 3) {
                                if (match4.start >= match2.end()) {
                                    if (match3.start < match2.end()) {
                                        match3.fix(match2.end() - match3.start);
                                        if (match3.len < 4) {
                                            LZ4Utils.copyTo(match4, match3);
                                        }
                                    }
                                    i11 = LZ4ByteBufferUtils.encodeSequence(inNativeByteOrder, i5, match2.start, match2.ref, match2.len, inNativeByteOrder2, i11, i7);
                                    i5 = match2.end();
                                    LZ4Utils.copyTo(match4, match2);
                                    LZ4Utils.copyTo(match3, match);
                                    hashTable = hashTable2;
                                } else {
                                    LZ4Utils.copyTo(match4, match3);
                                    hashTable = hashTable2;
                                }
                            } else {
                                if (match3.start < match2.end()) {
                                    int i18 = match3.start;
                                    int i19 = match2.start;
                                    if (i18 - i19 < 15) {
                                        if (match2.len > 18) {
                                            match2.len = 18;
                                        }
                                        if (match2.end() > match3.end() - 4) {
                                            match2.len = (match3.end() - match2.start) - 4;
                                        }
                                        match3.fix(match2.end() - match3.start);
                                    } else {
                                        match2.len = i18 - i19;
                                    }
                                }
                                i11 = LZ4ByteBufferUtils.encodeSequence(inNativeByteOrder, i5, match2.start, match2.ref, match2.len, inNativeByteOrder2, i11, i7);
                                i5 = match2.end();
                                LZ4Utils.copyTo(match3, match2);
                                LZ4Utils.copyTo(match4, match3);
                                hashTable = hashTable2;
                            }
                        }
                        if (match3.start < match2.end()) {
                            match2.len = match3.start - match2.start;
                        }
                        i11 = LZ4ByteBufferUtils.encodeSequence(inNativeByteOrder, match2.end(), match3.start, match3.ref, match3.len, inNativeByteOrder2, LZ4ByteBufferUtils.encodeSequence(inNativeByteOrder, i5, match2.start, match2.ref, match2.len, inNativeByteOrder2, i11, i7), i7);
                        i5 = match3.end();
                        i10 = i5;
                    }
                }
                i11 = LZ4ByteBufferUtils.encodeSequence(inNativeByteOrder, i5, match2.start, match2.ref, match2.len, inNativeByteOrder2, i11, i7);
                i5 = match2.end();
                i10 = i5;
            }
        }
        return LZ4ByteBufferUtils.lastLiterals(inNativeByteOrder, i5, i6 - i5, inNativeByteOrder2, i11, i7) - i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r1.start >= r0.end()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f2, code lost:
    
        r0.len = r1.start - r0.start;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f9, code lost:
    
        r19 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r33, r0.end(), r1.start, r1.ref, r1.len, r36, net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r33, r14, r0.start, r0.ref, r0.len, r36, r19, r20), r20);
        r14 = r1.end();
        r8 = r14;
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r33, int r34, int r35, byte[] r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }
}
