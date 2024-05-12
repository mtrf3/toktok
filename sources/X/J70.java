package X;

/* loaded from: classes9.dex */
public final class J70 extends F9E {
    public char[] LJLIL;
    public int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public J70(int i) {
        if (i >= 0) {
            this.LJLIL = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    public final void L(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.LJLILLLLZI + length;
        char[] cArr = this.LJLIL;
        if (i > cArr.length) {
            char[] cArr2 = new char[Math.max(cArr.length << 1, i)];
            System.arraycopy(this.LJLIL, 0, cArr2, 0, this.LJLILLLLZI);
            this.LJLIL = cArr2;
        }
        str.getChars(0, length, this.LJLIL, this.LJLILLLLZI);
        this.LJLILLLLZI = i;
    }
}
