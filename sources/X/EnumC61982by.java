package X;

import defpackage.b0;

/* renamed from: X.2by, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC61982by {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);

    public final int LJLIL;

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChannelType{Type=");
        return b0.LIZJ(LIZ, this.LJLIL, '}', LIZ);
    }

    public int getVal() {
        return this.LJLIL;
    }

    public static EnumC61982by of(int i) {
        if (i == 1) {
            return CHANNEL_SELF;
        }
        return CHANNEL_OK;
    }

    public static EnumC61982by valueOf(String str) {
        return (EnumC61982by) V0N.LJJJ(EnumC61982by.class, str);
    }

    EnumC61982by(int i) {
        this.LJLIL = i;
    }
}
