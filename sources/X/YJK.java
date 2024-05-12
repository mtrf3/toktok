package X;

/* loaded from: classes16.dex */
public final class YJK implements InterfaceC87181YJl {
    public final YIZ LIZ;
    public final String LIZIZ;
    public final Object[] LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC87181YJl
    public final int LIZIZ() {
        if ((this.LIZLLL & 1) == 1) {
            return 1;
        }
        return 2;
    }

    @Override // X.InterfaceC87181YJl
    public final boolean LIZJ() {
        if ((this.LIZLLL & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC87181YJl
    public final YIZ LIZ() {
        return this.LIZ;
    }

    public YJK(YIO yio, String str, Object[] objArr) {
        this.LIZ = yio;
        this.LIZIZ = str;
        this.LIZJ = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.LIZLLL = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.LIZLLL = i | (charAt2 << i3);
                return;
            }
        }
    }
}
