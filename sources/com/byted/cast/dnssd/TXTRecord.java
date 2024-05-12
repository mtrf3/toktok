package com.byted.cast.dnssd;

import X.C63832P3k;
import X.X1D;
import java.io.UnsupportedEncodingException;

/* loaded from: classes29.dex */
public class TXTRecord {
    public byte[] fBytes;

    public int size() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.fBytes;
            if (i < bArr.length) {
                i += (bArr[i] + 1) & 255;
                i2++;
            } else {
                return i2;
            }
        }
    }

    public String toString() {
        String LIZIZ;
        String str = null;
        int i = 0;
        while (true) {
            String key = getKey(i);
            if (key == null) {
                break;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(String.valueOf(i));
            LIZ.append("={");
            LIZ.append(key);
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            String valueAsString = getValueAsString(i);
            if (key.equals(C63832P3k.LIZ)) {
                valueAsString = "xxx.xxx.xxx.xxx";
            }
            if (valueAsString != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ2);
                LIZ2.append("=");
                LIZ2.append(valueAsString);
                LIZ2.append("}");
                LIZIZ = X1D.LIZIZ(LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ2);
                LIZ3.append("}");
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            if (str == null) {
                str = LIZIZ;
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(str);
                LIZ4.append(", ");
                LIZ4.append(LIZIZ);
                str = X1D.LIZIZ(LIZ4);
            }
            i++;
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public byte[] getRawBytes() {
        return (byte[]) this.fBytes.clone();
    }

    public TXTRecord() {
        this.fBytes = new byte[0];
    }

    public TXTRecord(byte[] bArr) {
        this.fBytes = (byte[]) bArr.clone();
    }

    public boolean contains(String str) {
        int i = 0;
        while (true) {
            String key = getKey(i);
            if (key == null) {
                return false;
            }
            if (str.compareToIgnoreCase(key) == 0) {
                return true;
            }
            i++;
        }
    }

    public String getKey(int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte[] bArr = this.fBytes;
            if (i3 >= bArr.length) {
                break;
            }
            i3 += bArr[i3] + 1;
        }
        byte[] bArr2 = this.fBytes;
        if (i3 < bArr2.length) {
            byte b = bArr2[i3];
            while (i2 < b && this.fBytes[i3 + i2 + 1] != 61) {
                i2++;
            }
            return new String(this.fBytes, i3 + 1, i2);
        }
        return null;
    }

    public byte[] getValue(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = this.fBytes;
            if (i2 >= bArr.length) {
                break;
            }
            i2 += bArr[i2] + 1;
        }
        byte[] bArr2 = this.fBytes;
        if (i2 < bArr2.length) {
            int i4 = bArr2[i2];
            for (int i5 = 0; i5 < i4; i5++) {
                byte[] bArr3 = this.fBytes;
                int i6 = i2 + i5;
                if (bArr3[i6 + 1] == 61) {
                    int i7 = (i4 - i5) - 1;
                    byte[] bArr4 = new byte[i7];
                    System.arraycopy(bArr3, i6 + 2, bArr4, 0, i7);
                    return bArr4;
                }
            }
        }
        return null;
    }

    public String getValueAsString(int i) {
        byte[] value = getValue(i);
        if (value != null) {
            return new String(value);
        }
        return null;
    }

    public int remove(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.fBytes;
            if (i < bArr.length) {
                int i3 = bArr[i];
                if (str.length() <= i3 && ((str.length() == i3 || this.fBytes[str.length() + i + 1] == 61) && str.compareToIgnoreCase(Utils.newString(this.fBytes, i + 1, str.length())) == 0)) {
                    byte[] bArr2 = this.fBytes;
                    byte[] bArr3 = new byte[(bArr2.length - i3) - 1];
                    this.fBytes = bArr3;
                    System.arraycopy(bArr2, 0, bArr3, 0, i);
                    System.arraycopy(bArr2, i + i3 + 1, this.fBytes, i, ((bArr2.length - i) - i3) - 1);
                    return i2;
                }
                i += (i3 + 1) & 255;
                i2++;
            } else {
                return -1;
            }
        }
    }

    public byte[] getValue(String str) {
        int i = 0;
        while (true) {
            String key = getKey(i);
            if (key != null) {
                if (str.compareToIgnoreCase(key) == 0) {
                    return getValue(i);
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public String getValueAsString(String str) {
        byte[] value = getValue(str);
        if (value != null) {
            return new String(value);
        }
        return null;
    }

    public void set(String str, byte[] bArr) {
        int i;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        try {
            byte[] bytes = str.getBytes("US-ASCII");
            for (byte b : bytes) {
                if (b == 61) {
                    throw new IllegalArgumentException();
                }
            }
            if (bytes.length + i < 255) {
                int remove = remove(str);
                if (remove == -1) {
                    remove = size();
                }
                insert(bytes, bArr, remove);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException();
        }
    }

    public void set(String str, String str2) {
        byte[] bArr;
        if (str2 != null) {
            bArr = str2.getBytes();
        } else {
            bArr = null;
        }
        set(str, bArr);
    }

    public void insert(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int i3;
        byte[] bArr3 = this.fBytes;
        if (bArr2 != null) {
            i2 = bArr2.length;
        } else {
            i2 = 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            byte[] bArr4 = this.fBytes;
            if (i4 >= bArr4.length) {
                break;
            }
            i4 += (bArr4[i4] + 1) & 255;
        }
        int length = bArr.length + i2;
        if (bArr2 != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = length + i3;
        int length2 = bArr3.length + i6 + 1;
        byte[] bArr5 = new byte[length2];
        this.fBytes = bArr5;
        System.arraycopy(bArr3, 0, bArr5, 0, i4);
        int length3 = bArr3.length - i4;
        System.arraycopy(bArr3, i4, this.fBytes, length2 - length3, length3);
        byte[] bArr6 = this.fBytes;
        bArr6[i4] = (byte) i6;
        int i7 = i4 + 1;
        System.arraycopy(bArr, 0, bArr6, i7, bArr.length);
        if (bArr2 != null) {
            byte[] bArr7 = this.fBytes;
            bArr7[i7 + bArr.length] = 61;
            System.arraycopy(bArr2, 0, bArr7, i4 + bArr.length + 2, i2);
        }
    }
}
