package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.05u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C019405u {
    public final String LIZ;
    public final EnumC019305t LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public String LJ;
    public boolean LJFF;
    public int LJI;

    public static int LIZ(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public final float LIZIZ() {
        switch (C019205s.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.LIZJ;
            case 4:
                return this.LIZLLL;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                if (this.LJFF) {
                    return 1.0f;
                }
                return 0.0f;
            case 7:
                return this.LIZLLL;
            default:
                return Float.NaN;
        }
    }

    public final int LIZLLL() {
        int i = C019205s.LIZ[this.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            return 1;
        }
        return 4;
    }

    public final void LIZJ(float[] fArr) {
        float f;
        switch (C019205s.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 2:
                int i = this.LJI;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 3:
                fArr[0] = this.LIZJ;
                return;
            case 4:
                fArr[0] = this.LIZLLL;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                if (this.LJFF) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                fArr[0] = f;
                return;
            case 7:
                fArr[0] = this.LIZLLL;
                return;
            default:
                return;
        }
    }

    public final void LJII(Object obj) {
        switch (C019205s.LIZ[this.LIZIZ.ordinal()]) {
            case 1:
            case 2:
                this.LJI = ((Integer) obj).intValue();
                return;
            case 3:
                this.LIZJ = ((Integer) obj).intValue();
                return;
            case 4:
                this.LIZLLL = ((Float) obj).floatValue();
                return;
            case 5:
                this.LJ = (String) obj;
                return;
            case 6:
                this.LJFF = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.LIZLLL = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C019405u(C019405u c019405u, Object obj) {
        this.LIZ = c019405u.LIZ;
        this.LIZIZ = c019405u.LIZIZ;
        LJII(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0030. Please report as an issue. */
    public static void LJFF(View view, HashMap<String, C019405u> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C019405u c019405u = hashMap.get(str);
            String LJFF = i0.LJFF("set", str);
            try {
                switch (C019205s.LIZ[c019405u.LIZIZ.ordinal()]) {
                    case 1:
                        cls.getMethod(LJFF, Integer.TYPE).invoke(view, Integer.valueOf(c019405u.LJI));
                        break;
                    case 2:
                        Method method = cls.getMethod(LJFF, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c019405u.LJI);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(LJFF, Integer.TYPE).invoke(view, Integer.valueOf(c019405u.LIZJ));
                        break;
                    case 4:
                        cls.getMethod(LJFF, Float.TYPE).invoke(view, Float.valueOf(c019405u.LIZLLL));
                        break;
                    case 5:
                        cls.getMethod(LJFF, CharSequence.class).invoke(view, c019405u.LJ);
                        break;
                    case 6:
                        cls.getMethod(LJFF, Boolean.TYPE).invoke(view, Boolean.valueOf(c019405u.LJFF));
                        break;
                    case 7:
                        cls.getMethod(LJFF, Float.TYPE).invoke(view, Float.valueOf(c019405u.LIZLLL));
                        break;
                }
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (NoSuchMethodException unused) {
            } catch (InvocationTargetException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x002b. Please report as an issue. */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void LJI(View view, float[] fArr) {
        Method method;
        Object[] objArr;
        Method method2;
        Object[] objArr2;
        Method method3;
        Object[] objArr3;
        Class<?> cls = view.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set");
        LIZ.append(this.LIZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        try {
            try {
                try {
                    try {
                        boolean z = true;
                        switch (C019205s.LIZ[this.LIZIZ.ordinal()]) {
                            case 1:
                                try {
                                    Class<?>[] clsArr = new Class[1];
                                    try {
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            try {
                                                Method method4 = cls.getMethod(LIZIZ, clsArr);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                Object[] objArr4 = new Object[1];
                                                                                                try {
                                                                                                    try {
                                                                                                        objArr4[0] = Integer.valueOf((LIZ((int) (fArr[3] * 255.0f)) << 24) | (LIZ((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (LIZ((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | LIZ((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                                                                                                        try {
                                                                                                            method4.invoke(view, objArr4);
                                                                                                            return;
                                                                                                        } catch (IllegalAccessException e) {
                                                                                                            e = e;
                                                                                                            C16880lQ.LLLLIIL(e);
                                                                                                            return;
                                                                                                        } catch (NoSuchMethodException e2) {
                                                                                                            e = e2;
                                                                                                            C16880lQ.LLLLIIL(e);
                                                                                                            return;
                                                                                                        } catch (InvocationTargetException e3) {
                                                                                                            e = e3;
                                                                                                            C16880lQ.LLLLIIL(e);
                                                                                                            return;
                                                                                                        }
                                                                                                    } catch (IllegalAccessException e4) {
                                                                                                        e = e4;
                                                                                                    } catch (NoSuchMethodException e5) {
                                                                                                        e = e5;
                                                                                                    } catch (InvocationTargetException e6) {
                                                                                                        e = e6;
                                                                                                    }
                                                                                                } catch (IllegalAccessException e7) {
                                                                                                    e = e7;
                                                                                                } catch (NoSuchMethodException e8) {
                                                                                                    e = e8;
                                                                                                } catch (InvocationTargetException e9) {
                                                                                                    e = e9;
                                                                                                }
                                                                                            } catch (IllegalAccessException e10) {
                                                                                                e = e10;
                                                                                            } catch (NoSuchMethodException e11) {
                                                                                                e = e11;
                                                                                            } catch (InvocationTargetException e12) {
                                                                                                e = e12;
                                                                                            }
                                                                                        } catch (IllegalAccessException e13) {
                                                                                            e = e13;
                                                                                        } catch (NoSuchMethodException e14) {
                                                                                            e = e14;
                                                                                        } catch (InvocationTargetException e15) {
                                                                                            e = e15;
                                                                                        }
                                                                                    } catch (IllegalAccessException e16) {
                                                                                        e = e16;
                                                                                    } catch (NoSuchMethodException e17) {
                                                                                        e = e17;
                                                                                    } catch (InvocationTargetException e18) {
                                                                                        e = e18;
                                                                                    }
                                                                                } catch (IllegalAccessException e19) {
                                                                                    e = e19;
                                                                                } catch (NoSuchMethodException e20) {
                                                                                    e = e20;
                                                                                } catch (InvocationTargetException e21) {
                                                                                    e = e21;
                                                                                }
                                                                            } catch (IllegalAccessException e22) {
                                                                                e = e22;
                                                                            } catch (NoSuchMethodException e23) {
                                                                                e = e23;
                                                                            } catch (InvocationTargetException e24) {
                                                                                e = e24;
                                                                            }
                                                                        } catch (IllegalAccessException e25) {
                                                                            e = e25;
                                                                        } catch (NoSuchMethodException e26) {
                                                                            e = e26;
                                                                        } catch (InvocationTargetException e27) {
                                                                            e = e27;
                                                                        }
                                                                    } catch (IllegalAccessException e28) {
                                                                        e = e28;
                                                                    } catch (NoSuchMethodException e29) {
                                                                        e = e29;
                                                                    } catch (InvocationTargetException e30) {
                                                                        e = e30;
                                                                    }
                                                                } catch (IllegalAccessException e31) {
                                                                    e = e31;
                                                                } catch (NoSuchMethodException e33) {
                                                                    e = e33;
                                                                } catch (InvocationTargetException e34) {
                                                                    e = e34;
                                                                }
                                                            } catch (IllegalAccessException e35) {
                                                                e = e35;
                                                            } catch (NoSuchMethodException e36) {
                                                                e = e36;
                                                            } catch (InvocationTargetException e37) {
                                                                e = e37;
                                                            }
                                                        } catch (IllegalAccessException e38) {
                                                            e = e38;
                                                        } catch (NoSuchMethodException e39) {
                                                            e = e39;
                                                        } catch (InvocationTargetException e40) {
                                                            e = e40;
                                                        }
                                                    } catch (IllegalAccessException e41) {
                                                        e = e41;
                                                    } catch (NoSuchMethodException e42) {
                                                        e = e42;
                                                    } catch (InvocationTargetException e43) {
                                                        e = e43;
                                                    }
                                                } catch (IllegalAccessException e44) {
                                                    e = e44;
                                                } catch (NoSuchMethodException e45) {
                                                    e = e45;
                                                } catch (InvocationTargetException e46) {
                                                    e = e46;
                                                }
                                            } catch (IllegalAccessException e47) {
                                                e = e47;
                                            } catch (NoSuchMethodException e48) {
                                                e = e48;
                                            } catch (InvocationTargetException e49) {
                                                e = e49;
                                            }
                                        } catch (IllegalAccessException e50) {
                                            e = e50;
                                        } catch (NoSuchMethodException e51) {
                                            e = e51;
                                        } catch (InvocationTargetException e52) {
                                            e = e52;
                                        }
                                    } catch (IllegalAccessException e53) {
                                        e = e53;
                                    } catch (NoSuchMethodException e54) {
                                        e = e54;
                                    } catch (InvocationTargetException e55) {
                                        e = e55;
                                    }
                                } catch (IllegalAccessException e56) {
                                    e = e56;
                                } catch (NoSuchMethodException e57) {
                                    e = e57;
                                } catch (InvocationTargetException e58) {
                                    e = e58;
                                }
                            case 2:
                                try {
                                    Class<?>[] clsArr2 = new Class[1];
                                    try {
                                        clsArr2[0] = Drawable.class;
                                        try {
                                            Method method5 = cls.getMethod(LIZIZ, clsArr2);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        int LIZ2 = (LIZ((int) (fArr[3] * 255.0f)) << 24) | (LIZ((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (LIZ((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | LIZ((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                                                                                        try {
                                                                                            try {
                                                                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                                                                try {
                                                                                                    colorDrawable.setColor(LIZ2);
                                                                                                    try {
                                                                                                        Object[] objArr5 = new Object[1];
                                                                                                        try {
                                                                                                            objArr5[0] = colorDrawable;
                                                                                                            try {
                                                                                                                method5.invoke(view, objArr5);
                                                                                                                return;
                                                                                                            } catch (IllegalAccessException e59) {
                                                                                                                e = e59;
                                                                                                                C16880lQ.LLLLIIL(e);
                                                                                                                return;
                                                                                                            } catch (NoSuchMethodException e60) {
                                                                                                                e = e60;
                                                                                                                C16880lQ.LLLLIIL(e);
                                                                                                                return;
                                                                                                            } catch (InvocationTargetException e61) {
                                                                                                                e = e61;
                                                                                                                C16880lQ.LLLLIIL(e);
                                                                                                                return;
                                                                                                            }
                                                                                                        } catch (IllegalAccessException e62) {
                                                                                                            e = e62;
                                                                                                        } catch (NoSuchMethodException e63) {
                                                                                                            e = e63;
                                                                                                        } catch (InvocationTargetException e64) {
                                                                                                            e = e64;
                                                                                                        }
                                                                                                    } catch (IllegalAccessException e65) {
                                                                                                        e = e65;
                                                                                                    } catch (NoSuchMethodException e66) {
                                                                                                        e = e66;
                                                                                                    } catch (InvocationTargetException e67) {
                                                                                                        e = e67;
                                                                                                    }
                                                                                                } catch (IllegalAccessException e68) {
                                                                                                    e = e68;
                                                                                                } catch (NoSuchMethodException e69) {
                                                                                                    e = e69;
                                                                                                } catch (InvocationTargetException e70) {
                                                                                                    e = e70;
                                                                                                }
                                                                                            } catch (IllegalAccessException e71) {
                                                                                                e = e71;
                                                                                            } catch (NoSuchMethodException e72) {
                                                                                                e = e72;
                                                                                            } catch (InvocationTargetException e73) {
                                                                                                e = e73;
                                                                                            }
                                                                                        } catch (IllegalAccessException e74) {
                                                                                            e = e74;
                                                                                        } catch (NoSuchMethodException e75) {
                                                                                            e = e75;
                                                                                        } catch (InvocationTargetException e76) {
                                                                                            e = e76;
                                                                                        }
                                                                                    } catch (IllegalAccessException e77) {
                                                                                        e = e77;
                                                                                    } catch (NoSuchMethodException e78) {
                                                                                        e = e78;
                                                                                    } catch (InvocationTargetException e79) {
                                                                                        e = e79;
                                                                                    }
                                                                                } catch (IllegalAccessException e80) {
                                                                                    e = e80;
                                                                                } catch (NoSuchMethodException e81) {
                                                                                    e = e81;
                                                                                } catch (InvocationTargetException e82) {
                                                                                    e = e82;
                                                                                }
                                                                            } catch (IllegalAccessException e83) {
                                                                                e = e83;
                                                                            } catch (NoSuchMethodException e84) {
                                                                                e = e84;
                                                                            } catch (InvocationTargetException e85) {
                                                                                e = e85;
                                                                            }
                                                                        } catch (IllegalAccessException e86) {
                                                                            e = e86;
                                                                        } catch (NoSuchMethodException e87) {
                                                                            e = e87;
                                                                        } catch (InvocationTargetException e88) {
                                                                            e = e88;
                                                                        }
                                                                    } catch (IllegalAccessException e89) {
                                                                        e = e89;
                                                                    } catch (NoSuchMethodException e90) {
                                                                        e = e90;
                                                                    } catch (InvocationTargetException e91) {
                                                                        e = e91;
                                                                    }
                                                                } catch (IllegalAccessException e92) {
                                                                    e = e92;
                                                                } catch (NoSuchMethodException e93) {
                                                                    e = e93;
                                                                } catch (InvocationTargetException e94) {
                                                                    e = e94;
                                                                }
                                                            } catch (IllegalAccessException e95) {
                                                                e = e95;
                                                            } catch (NoSuchMethodException e96) {
                                                                e = e96;
                                                            } catch (InvocationTargetException e97) {
                                                                e = e97;
                                                            }
                                                        } catch (IllegalAccessException e98) {
                                                            e = e98;
                                                        } catch (NoSuchMethodException e99) {
                                                            e = e99;
                                                        } catch (InvocationTargetException e100) {
                                                            e = e100;
                                                        }
                                                    } catch (IllegalAccessException e101) {
                                                        e = e101;
                                                    } catch (NoSuchMethodException e102) {
                                                        e = e102;
                                                    } catch (InvocationTargetException e103) {
                                                        e = e103;
                                                    }
                                                } catch (IllegalAccessException e104) {
                                                    e = e104;
                                                } catch (NoSuchMethodException e105) {
                                                    e = e105;
                                                } catch (InvocationTargetException e106) {
                                                    e = e106;
                                                }
                                            } catch (IllegalAccessException e107) {
                                                e = e107;
                                            } catch (NoSuchMethodException e108) {
                                                e = e108;
                                            } catch (InvocationTargetException e109) {
                                                e = e109;
                                            }
                                        } catch (IllegalAccessException e110) {
                                            e = e110;
                                        } catch (NoSuchMethodException e111) {
                                            e = e111;
                                        } catch (InvocationTargetException e112) {
                                            e = e112;
                                        }
                                    } catch (IllegalAccessException e113) {
                                        e = e113;
                                    } catch (NoSuchMethodException e114) {
                                        e = e114;
                                    } catch (InvocationTargetException e115) {
                                        e = e115;
                                    }
                                } catch (IllegalAccessException e116) {
                                    e = e116;
                                } catch (NoSuchMethodException e117) {
                                    e = e117;
                                } catch (InvocationTargetException e118) {
                                    e = e118;
                                }
                            case 3:
                                try {
                                    Class<?>[] clsArr3 = new Class[1];
                                    try {
                                        try {
                                            clsArr3[0] = Integer.TYPE;
                                            try {
                                                method2 = cls.getMethod(LIZIZ, clsArr3);
                                                try {
                                                    objArr2 = new Object[1];
                                                    try {
                                                        try {
                                                            try {
                                                                objArr2[0] = Integer.valueOf((int) fArr[0]);
                                                            } catch (IllegalAccessException e119) {
                                                                e = e119;
                                                            } catch (NoSuchMethodException e120) {
                                                                e = e120;
                                                            } catch (InvocationTargetException e121) {
                                                                e = e121;
                                                            }
                                                        } catch (IllegalAccessException e122) {
                                                            e = e122;
                                                        } catch (NoSuchMethodException e123) {
                                                            e = e123;
                                                        } catch (InvocationTargetException e124) {
                                                            e = e124;
                                                        }
                                                    } catch (IllegalAccessException e125) {
                                                        e = e125;
                                                    } catch (NoSuchMethodException e126) {
                                                        e = e126;
                                                    } catch (InvocationTargetException e127) {
                                                        e = e127;
                                                    }
                                                } catch (IllegalAccessException e128) {
                                                    e = e128;
                                                } catch (NoSuchMethodException e129) {
                                                    e = e129;
                                                } catch (InvocationTargetException e130) {
                                                    e = e130;
                                                }
                                            } catch (IllegalAccessException e131) {
                                                e = e131;
                                            } catch (NoSuchMethodException e132) {
                                                e = e132;
                                            } catch (InvocationTargetException e133) {
                                                e = e133;
                                            }
                                        } catch (IllegalAccessException e134) {
                                            e = e134;
                                        } catch (NoSuchMethodException e135) {
                                            e = e135;
                                        } catch (InvocationTargetException e136) {
                                            e = e136;
                                        }
                                    } catch (IllegalAccessException e137) {
                                        e = e137;
                                    } catch (NoSuchMethodException e138) {
                                        e = e138;
                                    } catch (InvocationTargetException e139) {
                                        e = e139;
                                    }
                                } catch (IllegalAccessException e140) {
                                    e = e140;
                                } catch (NoSuchMethodException e141) {
                                    e = e141;
                                } catch (InvocationTargetException e142) {
                                    e = e142;
                                }
                                try {
                                    method2.invoke(view, objArr2);
                                    return;
                                } catch (IllegalAccessException e143) {
                                    e = e143;
                                    C16880lQ.LLLLIIL(e);
                                    return;
                                } catch (NoSuchMethodException e144) {
                                    e = e144;
                                    C16880lQ.LLLLIIL(e);
                                    return;
                                } catch (InvocationTargetException e145) {
                                    e = e145;
                                    C16880lQ.LLLLIIL(e);
                                    return;
                                }
                            case 4:
                                try {
                                    Class<?>[] clsArr4 = new Class[1];
                                    try {
                                        try {
                                            clsArr4[0] = Float.TYPE;
                                            try {
                                                method3 = cls.getMethod(LIZIZ, clsArr4);
                                                try {
                                                    objArr3 = new Object[1];
                                                    try {
                                                        try {
                                                            try {
                                                                objArr3[0] = Float.valueOf(fArr[0]);
                                                            } catch (IllegalAccessException e146) {
                                                                e = e146;
                                                            } catch (NoSuchMethodException e147) {
                                                                e = e147;
                                                            } catch (InvocationTargetException e148) {
                                                                e = e148;
                                                            }
                                                        } catch (IllegalAccessException e149) {
                                                            e = e149;
                                                        } catch (NoSuchMethodException e150) {
                                                            e = e150;
                                                        } catch (InvocationTargetException e151) {
                                                            e = e151;
                                                        }
                                                    } catch (IllegalAccessException e152) {
                                                        e = e152;
                                                    } catch (NoSuchMethodException e153) {
                                                        e = e153;
                                                    } catch (InvocationTargetException e154) {
                                                        e = e154;
                                                    }
                                                } catch (IllegalAccessException e155) {
                                                    e = e155;
                                                } catch (NoSuchMethodException e156) {
                                                    e = e156;
                                                } catch (InvocationTargetException e157) {
                                                    e = e157;
                                                }
                                            } catch (IllegalAccessException e158) {
                                                e = e158;
                                            } catch (NoSuchMethodException e159) {
                                                e = e159;
                                            } catch (InvocationTargetException e160) {
                                                e = e160;
                                            }
                                        } catch (IllegalAccessException e161) {
                                            e = e161;
                                        } catch (NoSuchMethodException e162) {
                                            e = e162;
                                        } catch (InvocationTargetException e163) {
                                            e = e163;
                                        }
                                    } catch (IllegalAccessException e164) {
                                        e = e164;
                                    } catch (NoSuchMethodException e165) {
                                        e = e165;
                                    } catch (InvocationTargetException e166) {
                                        e = e166;
                                    }
                                    try {
                                        method3.invoke(view, objArr3);
                                        return;
                                    } catch (IllegalAccessException e167) {
                                        e = e167;
                                        C16880lQ.LLLLIIL(e);
                                        return;
                                    } catch (NoSuchMethodException e168) {
                                        e = e168;
                                        C16880lQ.LLLLIIL(e);
                                        return;
                                    } catch (InvocationTargetException e169) {
                                        e = e169;
                                        C16880lQ.LLLLIIL(e);
                                        return;
                                    }
                                } catch (IllegalAccessException e170) {
                                    e = e170;
                                } catch (NoSuchMethodException e171) {
                                    e = e171;
                                } catch (InvocationTargetException e172) {
                                    e = e172;
                                }
                            case 5:
                                try {
                                    try {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        try {
                                            LIZ3.append("unable to interpolate strings ");
                                            try {
                                                try {
                                                    LIZ3.append(this.LIZ);
                                                    try {
                                                        try {
                                                        } catch (IllegalAccessException e173) {
                                                            e = e173;
                                                        } catch (NoSuchMethodException e174) {
                                                            e = e174;
                                                        } catch (InvocationTargetException e175) {
                                                            e = e175;
                                                        }
                                                        try {
                                                            throw new RuntimeException(X1D.LIZIZ(LIZ3));
                                                        } catch (IllegalAccessException e176) {
                                                            e = e176;
                                                            C16880lQ.LLLLIIL(e);
                                                            return;
                                                        } catch (NoSuchMethodException e177) {
                                                            e = e177;
                                                            C16880lQ.LLLLIIL(e);
                                                            return;
                                                        } catch (InvocationTargetException e178) {
                                                            e = e178;
                                                            C16880lQ.LLLLIIL(e);
                                                            return;
                                                        }
                                                    } catch (IllegalAccessException e179) {
                                                        e = e179;
                                                    } catch (NoSuchMethodException e180) {
                                                        e = e180;
                                                    } catch (InvocationTargetException e181) {
                                                        e = e181;
                                                    }
                                                } catch (IllegalAccessException e182) {
                                                    e = e182;
                                                } catch (NoSuchMethodException e183) {
                                                    e = e183;
                                                } catch (InvocationTargetException e184) {
                                                    e = e184;
                                                }
                                            } catch (IllegalAccessException e185) {
                                                e = e185;
                                            } catch (NoSuchMethodException e186) {
                                                e = e186;
                                            } catch (InvocationTargetException e187) {
                                                e = e187;
                                            }
                                        } catch (IllegalAccessException e188) {
                                            e = e188;
                                        } catch (NoSuchMethodException e189) {
                                            e = e189;
                                        } catch (InvocationTargetException e190) {
                                            e = e190;
                                        }
                                    } catch (IllegalAccessException e191) {
                                        e = e191;
                                    } catch (NoSuchMethodException e192) {
                                        e = e192;
                                    } catch (InvocationTargetException e193) {
                                        e = e193;
                                    }
                                } catch (IllegalAccessException e194) {
                                    e = e194;
                                } catch (NoSuchMethodException e195) {
                                    e = e195;
                                } catch (InvocationTargetException e196) {
                                    e = e196;
                                }
                            case 6:
                                try {
                                    Class<?>[] clsArr5 = new Class[1];
                                    try {
                                        try {
                                            clsArr5[0] = Boolean.TYPE;
                                            try {
                                                Method method6 = cls.getMethod(LIZIZ, clsArr5);
                                                try {
                                                    Object[] objArr6 = new Object[1];
                                                    try {
                                                        if (fArr[0] <= 0.5f) {
                                                            z = false;
                                                        }
                                                        try {
                                                            try {
                                                                objArr6[0] = Boolean.valueOf(z);
                                                            } catch (IllegalAccessException e197) {
                                                                e = e197;
                                                            } catch (NoSuchMethodException e198) {
                                                                e = e198;
                                                            } catch (InvocationTargetException e199) {
                                                                e = e199;
                                                            }
                                                            try {
                                                                method6.invoke(view, objArr6);
                                                                return;
                                                            } catch (IllegalAccessException e200) {
                                                                e = e200;
                                                                C16880lQ.LLLLIIL(e);
                                                                return;
                                                            } catch (NoSuchMethodException e201) {
                                                                e = e201;
                                                                C16880lQ.LLLLIIL(e);
                                                                return;
                                                            } catch (InvocationTargetException e202) {
                                                                e = e202;
                                                                C16880lQ.LLLLIIL(e);
                                                                return;
                                                            }
                                                        } catch (IllegalAccessException e203) {
                                                            e = e203;
                                                        } catch (NoSuchMethodException e204) {
                                                            e = e204;
                                                        } catch (InvocationTargetException e205) {
                                                            e = e205;
                                                        }
                                                    } catch (IllegalAccessException e206) {
                                                        e = e206;
                                                    } catch (NoSuchMethodException e207) {
                                                        e = e207;
                                                    } catch (InvocationTargetException e208) {
                                                        e = e208;
                                                    }
                                                } catch (IllegalAccessException e209) {
                                                    e = e209;
                                                } catch (NoSuchMethodException e210) {
                                                    e = e210;
                                                } catch (InvocationTargetException e211) {
                                                    e = e211;
                                                }
                                            } catch (IllegalAccessException e212) {
                                                e = e212;
                                            } catch (NoSuchMethodException e213) {
                                                e = e213;
                                            } catch (InvocationTargetException e214) {
                                                e = e214;
                                            }
                                        } catch (IllegalAccessException e215) {
                                            e = e215;
                                        } catch (NoSuchMethodException e216) {
                                            e = e216;
                                        } catch (InvocationTargetException e217) {
                                            e = e217;
                                        }
                                    } catch (IllegalAccessException e218) {
                                        e = e218;
                                    } catch (NoSuchMethodException e219) {
                                        e = e219;
                                    } catch (InvocationTargetException e220) {
                                        e = e220;
                                    }
                                } catch (IllegalAccessException e221) {
                                    e = e221;
                                } catch (NoSuchMethodException e222) {
                                    e = e222;
                                } catch (InvocationTargetException e223) {
                                    e = e223;
                                }
                            case 7:
                                try {
                                    Class<?>[] clsArr6 = new Class[1];
                                    try {
                                        try {
                                            clsArr6[0] = Float.TYPE;
                                            try {
                                                method = cls.getMethod(LIZIZ, clsArr6);
                                                try {
                                                    objArr = new Object[1];
                                                    try {
                                                        try {
                                                            try {
                                                                objArr[0] = Float.valueOf(fArr[0]);
                                                            } catch (IllegalAccessException e224) {
                                                                e = e224;
                                                            } catch (NoSuchMethodException e225) {
                                                                e = e225;
                                                            } catch (InvocationTargetException e226) {
                                                                e = e226;
                                                            }
                                                        } catch (IllegalAccessException e227) {
                                                            e = e227;
                                                        } catch (NoSuchMethodException e228) {
                                                            e = e228;
                                                        } catch (InvocationTargetException e229) {
                                                            e = e229;
                                                        }
                                                    } catch (IllegalAccessException e230) {
                                                        e = e230;
                                                    } catch (NoSuchMethodException e231) {
                                                        e = e231;
                                                    } catch (InvocationTargetException e232) {
                                                        e = e232;
                                                    }
                                                } catch (IllegalAccessException e233) {
                                                    e = e233;
                                                } catch (NoSuchMethodException e234) {
                                                    e = e234;
                                                } catch (InvocationTargetException e235) {
                                                    e = e235;
                                                }
                                            } catch (IllegalAccessException e236) {
                                                e = e236;
                                            } catch (NoSuchMethodException e237) {
                                                e = e237;
                                            } catch (InvocationTargetException e238) {
                                                e = e238;
                                            }
                                        } catch (IllegalAccessException e239) {
                                            e = e239;
                                        } catch (NoSuchMethodException e240) {
                                            e = e240;
                                        } catch (InvocationTargetException e241) {
                                            e = e241;
                                        }
                                    } catch (IllegalAccessException e242) {
                                        e = e242;
                                    } catch (NoSuchMethodException e243) {
                                        e = e243;
                                    } catch (InvocationTargetException e244) {
                                        e = e244;
                                    }
                                    try {
                                        method.invoke(view, objArr);
                                        return;
                                    } catch (IllegalAccessException e245) {
                                        e = e245;
                                        C16880lQ.LLLLIIL(e);
                                        return;
                                    } catch (NoSuchMethodException e246) {
                                        e = e246;
                                        C16880lQ.LLLLIIL(e);
                                        return;
                                    } catch (InvocationTargetException e247) {
                                        e = e247;
                                        C16880lQ.LLLLIIL(e);
                                        return;
                                    }
                                } catch (IllegalAccessException e248) {
                                    e = e248;
                                } catch (NoSuchMethodException e249) {
                                    e = e249;
                                } catch (InvocationTargetException e250) {
                                    e = e250;
                                }
                            default:
                                return;
                        }
                    } catch (IllegalAccessException e251) {
                        e = e251;
                    } catch (NoSuchMethodException e252) {
                        e = e252;
                    } catch (InvocationTargetException e253) {
                        e = e253;
                    }
                } catch (IllegalAccessException e254) {
                    e = e254;
                } catch (NoSuchMethodException e255) {
                    e = e255;
                } catch (InvocationTargetException e256) {
                    e = e256;
                }
            } catch (IllegalAccessException e257) {
                e = e257;
            } catch (NoSuchMethodException e258) {
                e = e258;
            } catch (InvocationTargetException e259) {
                e = e259;
            }
        } catch (IllegalAccessException e260) {
            e = e260;
        } catch (NoSuchMethodException e261) {
            e = e261;
        } catch (InvocationTargetException e262) {
            e = e262;
        }
    }

    public C019405u(String str, EnumC019305t enumC019305t, Object obj) {
        this.LIZ = str;
        this.LIZIZ = enumC019305t;
        LJII(obj);
    }

    public static void LJ(Context context, XmlPullParser xmlPullParser, HashMap<String, C019405u> hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.wd, R.attr.a8t, R.attr.a8u, R.attr.a8v, R.attr.a8w, R.attr.a8x, R.attr.a8y, R.attr.a90, R.attr.a91});
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC019305t enumC019305t = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                if (str != null && str.length() > 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(Character.toUpperCase(str.charAt(0)));
                    LIZ.append(str.substring(1));
                    str = X1D.LIZIZ(LIZ);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC019305t = EnumC019305t.BOOLEAN_TYPE;
            } else if (index == 3) {
                enumC019305t = EnumC019305t.COLOR_TYPE;
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
            } else if (index == 2) {
                enumC019305t = EnumC019305t.COLOR_DRAWABLE_TYPE;
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
            } else if (index == 7) {
                enumC019305t = EnumC019305t.DIMENSION_TYPE;
                obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
            } else if (index == 4) {
                enumC019305t = EnumC019305t.DIMENSION_TYPE;
                obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
            } else if (index == 5) {
                enumC019305t = EnumC019305t.FLOAT_TYPE;
                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
            } else if (index == 6) {
                enumC019305t = EnumC019305t.INT_TYPE;
                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
            } else if (index == 8) {
                enumC019305t = EnumC019305t.STRING_TYPE;
                obj = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C019405u(str, enumC019305t, obj));
        }
        obtainStyledAttributes.recycle();
    }
}
