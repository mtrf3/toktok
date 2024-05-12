package X;

/* loaded from: classes16.dex */
public class YVB extends YVA {
    public final YVC LIZIZ;
    public final Character LIZJ;

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZIZ.hashCode();
        Character ch = this.LIZJ;
        if (ch == null) {
            hashCode = 0;
        } else {
            hashCode = ch.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.LIZIZ);
        if (8 % this.LIZIZ.LIZLLL != 0) {
            if (this.LIZJ == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.LIZJ);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YVB) {
            YVB yvb = (YVB) obj;
            if (this.LIZIZ.equals(yvb.LIZIZ)) {
                Character ch = this.LIZJ;
                Character ch2 = yvb.LIZJ;
                if (ch != ch2) {
                    if (ch != null && ch.equals(ch2)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public YVB(YVC yvc, Character ch) {
        this.LIZIZ = yvc;
        if (ch != null) {
            ch.charValue();
            if (yvc.LJI[61] != -1) {
                throw new IllegalArgumentException(PTI.LIZ("Padding character %s was already in alphabet", ch));
            }
        }
        this.LIZJ = ch;
    }

    public YVB(String str, String str2, Character ch) {
        this(new YVC(str, str2.toCharArray()), ch);
    }

    @Override // X.YVA
    public void LIZ(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        C47265Ign.LIZJ(0, i, bArr.length);
        while (i2 < i) {
            LIZJ(appendable, bArr, i2, Math.min(this.LIZIZ.LJFF, i - i2));
            i2 += this.LIZIZ.LJFF;
        }
    }

    public final void LIZJ(Appendable appendable, byte[] bArr, int i, int i2) {
        C47265Ign.LIZJ(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.LIZIZ.LJFF) {
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | (bArr[i + i4] & 255)) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.LIZIZ.LIZLLL;
            while (i3 < i2 * 8) {
                YVC yvc = this.LIZIZ;
                ((StringBuilder) appendable).append(yvc.LIZIZ[yvc.LIZJ & ((int) (j >>> (i5 - i3)))]);
                i3 += this.LIZIZ.LIZLLL;
            }
            if (this.LIZJ != null) {
                while (i3 < this.LIZIZ.LJFF * 8) {
                    this.LIZJ.charValue();
                    ((StringBuilder) appendable).append('=');
                    i3 += this.LIZIZ.LIZLLL;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
