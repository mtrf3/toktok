package com.byted.cast.sdk.model;

/* loaded from: classes29.dex */
public class NALBitstream {
    public int m_bits;
    public byte m_byte;
    public byte[] m_data;
    public int m_idx;
    public int m_len;
    public int m_zeros;

    public int GetUE() {
        int i = 0;
        while (this.m_idx < this.m_len && GetBit() == 0) {
            i++;
        }
        return GetWord(i) + ((1 << i) - 1);
    }

    public byte GetBYTE() {
        int i = this.m_idx;
        int i2 = this.m_len;
        if (i >= i2) {
            return (byte) 0;
        }
        byte[] bArr = this.m_data;
        int i3 = i + 1;
        this.m_idx = i3;
        byte b = bArr[i];
        if (b == 0) {
            int i4 = this.m_zeros + 1;
            this.m_zeros = i4;
            if (i3 < i2 && i4 == 2 && bArr[i3] == 3) {
                this.m_idx = i3 + 1;
                this.m_zeros = 0;
            }
        } else {
            this.m_zeros = 0;
        }
        return b;
    }

    public int GetBit() {
        if (this.m_bits == 0) {
            this.m_byte = GetBYTE();
            this.m_bits = 8;
        }
        int i = this.m_bits - 1;
        this.m_bits = i;
        return (this.m_byte >> i) & 1;
    }

    public int GetSE() {
        boolean z;
        int GetUE = GetUE();
        if ((GetUE & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = (GetUE + 1) >> 1;
        if (!z) {
            return -i;
        }
        return i;
    }

    /* loaded from: classes29.dex */
    public class vc_params_t {
        public int height;
        public int level;
        public int nal_length_size;
        public int profile;
        public int width;

        public vc_params_t() {
        }
    }

    public int GetWord(int i) {
        int i2 = 0;
        while (i > 0) {
            i2 = (i2 << 1) | GetBit();
            i--;
        }
        return i2;
    }

    public NALBitstream(byte[] bArr, int i) {
        Init(bArr, i);
    }

    private void Init(byte[] bArr, int i) {
        this.m_data = bArr;
        this.m_len = bArr.length;
        this.m_idx = i;
        this.m_bits = 0;
        this.m_byte = (byte) 0;
        this.m_zeros = 0;
    }
}
