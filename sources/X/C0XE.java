package X;

import java.text.CharacterIterator;

/* renamed from: X.0XE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XE implements CharacterIterator {
    public final CharSequence LJLIL;
    public final int LJLJI;
    public final int LJLILLLLZI = 0;
    public int LJLJJI = 0;

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.LJLJJI;
        if (i == this.LJLJI) {
            return (char) 65535;
        }
        return this.LJLIL.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.LJLJJI = this.LJLILLLLZI;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        if (i == i2) {
            this.LJLJJI = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.LJLJJI = i3;
        return this.LJLIL.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.LJLJJI + 1;
        this.LJLJJI = i;
        int i2 = this.LJLJI;
        if (i >= i2) {
            this.LJLJJI = i2;
            return (char) 65535;
        }
        return this.LJLIL.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.LJLJJI;
        if (i <= this.LJLILLLLZI) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.LJLJJI = i2;
        return this.LJLIL.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.LJLILLLLZI;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.LJLJI;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.LJLJJI;
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        int i2 = this.LJLILLLLZI;
        if (i <= this.LJLJI && i2 <= i) {
            this.LJLJJI = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }

    public C0XE(int i, CharSequence charSequence) {
        this.LJLIL = charSequence;
        this.LJLJI = i;
    }
}
