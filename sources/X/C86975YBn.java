package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YBn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86975YBn {
    public final int LIZ;
    public final int LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            sb.append("?");
                        } else {
                            sb.append("screen");
                        }
                    } else {
                        sb.append("parent");
                    }
                } else {
                    sb.append("next");
                }
            } else {
                sb.append("prev");
            }
        } else {
            sb.append("this");
        }
        sb.append(".");
        int i2 = this.LIZIZ;
        if (i2 != 10) {
            if (i2 != 15) {
                if (i2 != 20) {
                    if (i2 != 21) {
                        switch (i2) {
                            case 0:
                                sb.append("left");
                                break;
                            case 1:
                                sb.append("top");
                                break;
                            case 2:
                                sb.append("right");
                                break;
                            case 3:
                                sb.append("bottom");
                                break;
                            case 4:
                                sb.append("centerX");
                                break;
                            case 5:
                                sb.append("centerY");
                                break;
                            case 6:
                                sb.append("width");
                                break;
                            case 7:
                                sb.append("height");
                                break;
                            default:
                                sb.append("?");
                                break;
                        }
                    } else {
                        sb.append("isLand");
                    }
                } else {
                    sb.append("isPad");
                }
            } else {
                sb.append("tag");
            }
        } else {
            sb.append("visible");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public C86975YBn(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
