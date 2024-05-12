package com.byted.cast.render.parser;

import X.X1D;
import com.byted.cast.mediacommon.render.parameters.CodecId;
import com.byted.cast.render.utils.Logger;
import com.byted.cast.render.utils.NALBitstream;

/* loaded from: classes29.dex */
public class golomb {
    public int nStartBit;

    /* renamed from: com.byted.cast.render.parser.golomb$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$mediacommon$render$parameters$CodecId;

        static {
            int[] iArr = new int[CodecId.values().length];
            $SwitchMap$com$byted$cast$mediacommon$render$parameters$CodecId = iArr;
            try {
                iArr[CodecId.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$mediacommon$render$parameters$CodecId[CodecId.H265.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        if (r0 != 2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.byted.cast.render.parser.SPS ParseH264(byte[] r14) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.render.parser.golomb.ParseH264(byte[]):com.byted.cast.render.parser.SPS");
    }

    public int read_se(byte[] bArr) {
        int read_ue = read_ue(bArr);
        if ((read_ue & 1) != 0) {
            return (read_ue + 1) / 2;
        }
        return -(read_ue / 2);
    }

    public int read_ue(byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            i = this.nStartBit;
            if (i >= bArr.length * 8 || (bArr[i / 8] & (128 >> (i % 8))) != 0) {
                break;
            }
            i2++;
            this.nStartBit = i + 1;
        }
        this.nStartBit = i + 1;
        return ((1 << i2) - 1) + read_u(i2, bArr);
    }

    public void skip_bits(int i) {
        this.nStartBit += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r1 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
    
        if ((r7[r5] & 126) == 33) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
    
        return ParseSequenceParameterSet(r7, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.byted.cast.render.parser.SPS Parse(byte[] r7, com.byted.cast.mediacommon.render.parameters.CodecId r8) {
        /*
            r6 = this;
            int[] r1 = com.byted.cast.render.parser.golomb.AnonymousClass1.$SwitchMap$com$byted$cast$mediacommon$render$parameters$CodecId
            int r0 = r8.ordinal()
            r1 = r1[r0]
            r2 = 4
            r3 = 1
            if (r1 == r3) goto L74
            r0 = 2
            if (r1 == r0) goto L15
        Lf:
            com.byted.cast.render.parser.SPS r0 = new com.byted.cast.render.parser.SPS
            r0.<init>()
            return r0
        L15:
            r0 = r7[r2]
            r1 = r0 & 126(0x7e, float:1.77E-43)
            int r1 = r1 >> r3
            r0 = 32
            if (r1 == r0) goto L1f
            goto Lf
        L1f:
            int r0 = r7.length
            if (r2 >= r0) goto Lf
            r0 = r7[r2]
            if (r0 != 0) goto L3b
            int r0 = r2 + 1
            r0 = r7[r0]
            if (r0 != 0) goto L3b
            int r0 = r2 + 2
            r0 = r7[r0]
            if (r0 != 0) goto L3b
            int r0 = r2 + 3
            r0 = r7[r0]
            if (r0 != r3) goto L3b
            if (r2 != 0) goto L3e
            goto Lf
        L3b:
            int r2 = r2 + 1
            goto L1f
        L3e:
            int r5 = r2 + 4
            r0 = r7[r5]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r0 = r0 >> r3
            r4 = 33
            if (r0 == r4) goto L4a
            goto Lf
        L4a:
            r1 = r5
        L4b:
            int r0 = r7.length
            if (r1 >= r0) goto L66
            r0 = r7[r1]
            if (r0 != 0) goto L71
            int r0 = r1 + 1
            r0 = r7[r0]
            if (r0 != 0) goto L71
            int r0 = r1 + 2
            r0 = r7[r0]
            if (r0 != 0) goto L71
            int r0 = r1 + 3
            r0 = r7[r0]
            if (r0 != r3) goto L71
            if (r1 != 0) goto L6c
        L66:
            r0 = r7[r5]
            r0 = r0 & 126(0x7e, float:1.77E-43)
            if (r0 != r4) goto Lf
        L6c:
            com.byted.cast.render.parser.SPS r0 = r6.ParseSequenceParameterSet(r7, r2)
            return r0
        L71:
            int r1 = r1 + 1
            goto L4b
        L74:
            r0 = r7[r2]
            r1 = r0 & 31
            r0 = 7
            if (r1 != r0) goto Lf
        L7b:
            int r0 = r7.length
            if (r2 >= r0) goto Lf
            r0 = r7[r2]
            if (r0 != 0) goto L9b
            int r0 = r2 + 1
            r0 = r7[r0]
            if (r0 != 0) goto L9b
            int r0 = r2 + 2
            r0 = r7[r0]
            if (r0 != 0) goto L9b
            int r0 = r2 + 3
            r0 = r7[r0]
            if (r0 != r3) goto L9b
            if (r2 == 0) goto Lf
            com.byted.cast.render.parser.SPS r0 = r6.ParseH264(r7)
            return r0
        L9b:
            int r2 = r2 + 1
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.render.parser.golomb.Parse(byte[], com.byted.cast.mediacommon.render.parameters.CodecId):com.byted.cast.render.parser.SPS");
    }

    public SPS ParseSequenceParameterSet(byte[] bArr, int i) {
        SPS sps = new SPS();
        if (bArr.length < 20) {
            Logger.e("golomb", "ParseSequenceParameterSet data.length<20");
            return sps;
        }
        NALBitstream nALBitstream = new NALBitstream(bArr, i);
        nALBitstream.GetWord(32);
        nALBitstream.GetWord(16);
        nALBitstream.GetWord(4);
        int GetWord = nALBitstream.GetWord(3);
        if (GetWord > 6) {
            Logger.e("golomb", "sps_max_sub_layers_minus1>6");
            return sps;
        }
        nALBitstream.GetWord(1);
        nALBitstream.GetWord(2);
        nALBitstream.GetWord(1);
        sps.profile_idc = nALBitstream.GetWord(5);
        nALBitstream.GetWord(32);
        nALBitstream.GetWord(1);
        nALBitstream.GetWord(1);
        nALBitstream.GetWord(1);
        nALBitstream.GetWord(1);
        nALBitstream.GetWord(44);
        sps.level_idc = nALBitstream.GetWord(8);
        byte[] bArr2 = new byte[6];
        byte[] bArr3 = new byte[6];
        int i2 = 0;
        for (int i3 = 0; i3 < GetWord; i3++) {
            bArr2[i3] = (byte) nALBitstream.GetWord(1);
            bArr3[i3] = (byte) nALBitstream.GetWord(1);
        }
        if (GetWord > 0) {
            int i4 = GetWord;
            do {
                nALBitstream.GetWord(2);
                i4++;
            } while (i4 < 8);
            do {
                if (bArr2[i2] != 0) {
                    nALBitstream.GetWord(2);
                    nALBitstream.GetWord(1);
                    nALBitstream.GetWord(5);
                    nALBitstream.GetWord(32);
                    nALBitstream.GetWord(1);
                    nALBitstream.GetWord(1);
                    nALBitstream.GetWord(1);
                    nALBitstream.GetWord(1);
                    nALBitstream.GetWord(44);
                }
                if (bArr3[i2] != 0) {
                    nALBitstream.GetWord(8);
                }
                i2++;
            } while (i2 < GetWord);
        }
        int GetUE = nALBitstream.GetUE();
        if (GetUE > 15) {
            Logger.e("golomb", "sps_seq_parameter_set_id>15");
            return sps;
        }
        int GetUE2 = nALBitstream.GetUE();
        if (GetUE > 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sps_seq_parameter_set_id>3   ");
            LIZ.append(GetUE);
            Logger.e("golomb", X1D.LIZIZ(LIZ));
            return sps;
        }
        if (GetUE2 == 3) {
            nALBitstream.GetWord(1);
        }
        sps.width = nALBitstream.GetUE();
        sps.height = nALBitstream.GetUE();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("width=");
        LIZ2.append(sps.width);
        LIZ2.append(" height=");
        LIZ2.append(sps.height);
        Logger.i("golomb", X1D.LIZIZ(LIZ2));
        if (nALBitstream.GetWord(1) != 0) {
            nALBitstream.GetUE();
            nALBitstream.GetUE();
            nALBitstream.GetUE();
            nALBitstream.GetUE();
        }
        if (nALBitstream.GetUE() != nALBitstream.GetUE()) {
            Logger.e("golomb", "bit_depth_luma_minus8 != bit_depth_chroma_minus8");
            return sps;
        }
        sps.bVaild = true;
        return sps;
    }

    public int read_u(int i, byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 <<= 1;
            int i4 = this.nStartBit;
            if ((bArr[i4 / 8] & (128 >> (i4 % 8))) != 0) {
                i2++;
            }
            this.nStartBit = i4 + 1;
        }
        return i2;
    }
}
