package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.Osh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63291Osh {
    public static volatile long LIZ;
    public static volatile long LIZIZ;
    public static C63291Osh LIZJ;
    public static InterfaceC63293Osj LIZLLL;
    public static InterfaceC63293Osj LJ;

    public static synchronized C63291Osh LIZ() {
        C63291Osh c63291Osh;
        synchronized (C63291Osh.class) {
            long uid = C63308Osy.LJI().LIZIZ().getUid();
            long appId = C63308Osy.LJI().LIZIZ().getAppId();
            if (LIZJ == null || uid != LIZ || appId != LIZIZ) {
                synchronized (C63291Osh.class) {
                    if (LIZJ == null || uid != LIZ || appId != LIZIZ) {
                        LIZJ = new C63291Osh();
                    }
                }
            }
            c63291Osh = LIZJ;
        }
        return c63291Osh;
    }

    public static long LIZIZ() {
        long LIZLLL2 = LIZLLL.LIZLLL(-1L, LJIIIZ("base_msg_index_v2"));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils getBaseMsgIndexV2, result:");
        LIZ2.append(LIZLLL2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        return LIZLLL2;
    }

    public C63291Osh() {
        LIZ = C63308Osy.LJI().LIZIZ().getUid();
        LIZIZ = C63308Osy.LJI().LIZIZ().getAppId();
        InterfaceC63293Osj LIZLLL2 = C63308Osy.LJI().LIZIZ().LIZLLL(LJII());
        if (LIZLLL2 != null) {
            LIZLLL = LIZLLL2;
        } else {
            final String LJII = LJII();
            LIZLLL = new InterfaceC63293Osj(LJII) { // from class: X.4fg
                public final SharedPreferences LIZ;

                @Override // X.InterfaceC63293Osj
                public final void clearAll() {
                    this.LIZ.edit().clear().commit();
                }

                {
                    Context context = C63308Osy.LJI().LIZ;
                    if (context == null) {
                        C63308Osy.LJI().LJIILJJIL.getClass();
                        context = EF7.LIZIZ();
                    }
                    this.LIZ = F9J.LIZIZ(context, 0, LJII);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DefaultSP constructor, spName:");
                    LIZ2.append(LJII);
                    C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                }

                @Override // X.InterfaceC63293Osj
                public final void LIZ(Float f) {
                    this.LIZ.edit().putFloat("db_report_rate", f.floatValue()).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final Float LIZJ(Float f) {
                    return Float.valueOf(this.LIZ.getFloat("db_report_rate", f.floatValue()));
                }

                @Override // X.InterfaceC63293Osj
                public final boolean getBoolean(String str) {
                    return this.LIZ.getBoolean(str, false);
                }

                @Override // X.InterfaceC63293Osj
                public final int getInt(String str) {
                    return this.LIZ.getInt(str, 0);
                }

                @Override // X.InterfaceC63293Osj
                public final void LIZIZ(Long l, String str) {
                    this.LIZ.edit().putLong(str, l.longValue()).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final long LIZLLL(Long l, String str) {
                    return this.LIZ.getLong(str, l.longValue());
                }

                @Override // X.InterfaceC63293Osj
                public final String getString(String str, String str2) {
                    return this.LIZ.getString(str, str2);
                }

                @Override // X.InterfaceC63293Osj
                public final void putBoolean(String str, boolean z) {
                    this.LIZ.edit().putBoolean(str, z).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final void putInt(String str, int i) {
                    this.LIZ.edit().putInt(str, i).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final void putString(String str, String str2) {
                    this.LIZ.edit().putString(str, str2).commit();
                }
            };
        }
        InterfaceC63292Osi LIZIZ2 = C63308Osy.LJI().LIZIZ();
        C63308Osy.LJI().LIZLLL().getClass();
        final String str = "imsdk_0";
        InterfaceC63293Osj LIZLLL3 = LIZIZ2.LIZLLL("imsdk_0");
        if (LIZLLL3 != null) {
            LJ = LIZLLL3;
        } else {
            C47922IrO.LIZ();
            LJ = new InterfaceC63293Osj(str) { // from class: X.4fg
                public final SharedPreferences LIZ;

                @Override // X.InterfaceC63293Osj
                public final void clearAll() {
                    this.LIZ.edit().clear().commit();
                }

                {
                    Context context = C63308Osy.LJI().LIZ;
                    if (context == null) {
                        C63308Osy.LJI().LJIILJJIL.getClass();
                        context = EF7.LIZIZ();
                    }
                    this.LIZ = F9J.LIZIZ(context, 0, str);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DefaultSP constructor, spName:");
                    LIZ2.append(str);
                    C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                }

                @Override // X.InterfaceC63293Osj
                public final void LIZ(Float f) {
                    this.LIZ.edit().putFloat("db_report_rate", f.floatValue()).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final Float LIZJ(Float f) {
                    return Float.valueOf(this.LIZ.getFloat("db_report_rate", f.floatValue()));
                }

                @Override // X.InterfaceC63293Osj
                public final boolean getBoolean(String str2) {
                    return this.LIZ.getBoolean(str2, false);
                }

                @Override // X.InterfaceC63293Osj
                public final int getInt(String str2) {
                    return this.LIZ.getInt(str2, 0);
                }

                @Override // X.InterfaceC63293Osj
                public final void LIZIZ(Long l, String str2) {
                    this.LIZ.edit().putLong(str2, l.longValue()).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final long LIZLLL(Long l, String str2) {
                    return this.LIZ.getLong(str2, l.longValue());
                }

                @Override // X.InterfaceC63293Osj
                public final String getString(String str2, String str22) {
                    return this.LIZ.getString(str2, str22);
                }

                @Override // X.InterfaceC63293Osj
                public final void putBoolean(String str2, boolean z) {
                    this.LIZ.edit().putBoolean(str2, z).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final void putInt(String str2, int i) {
                    this.LIZ.edit().putInt(str2, i).commit();
                }

                @Override // X.InterfaceC63293Osj
                public final void putString(String str2, String str22) {
                    this.LIZ.edit().putString(str2, str22).commit();
                }
            };
        }
        if (C63308Osy.LJI().LIZIZ().getUid() <= 0 || LIZLLL.getBoolean(LJIIIZ(LJIIIZ("key_has_process_error")))) {
            return;
        }
        for (int i : C63308Osy.LJI().LIZLLL().LJIIZILJ) {
            long LIZLLL4 = LJ.LIZLLL(-1L, LJIIIIZZ(i, "msg_by_user_cursor"));
            long LIZLLL5 = LIZLLL.LIZLLL(-1L, LJIIIIZZ(i, "msg_by_user_cursor"));
            StringBuilder LIZJ2 = V10.LIZJ("processHistoryError imsdk0Curosr = ", LIZLLL4, " normalCurosr = ");
            LIZJ2.append(LIZLLL5);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZJ2));
            if (LIZLLL5 == -1 && LIZLLL4 > 0) {
                LIZLLL.putBoolean(LJIIIIZZ(i, "im_init"), LJ.getBoolean(LJIIIIZZ(i, "im_init")));
                LIZLLL.putBoolean(LJIIIIZZ(i, "msg_flag_bits_updated"), LJ.getBoolean(LJIIIIZZ(i, "msg_flag_bits_updated")));
            }
            if (LIZLLL4 > LIZLLL5) {
                LIZLLL.LIZIZ(Long.valueOf(LIZLLL4), LJIIIIZZ(i, "msg_by_user_cursor"));
            }
            long LIZLLL6 = LJ.LIZLLL(0L, LJIIIIZZ(i, "im_init_page_cursor"));
            long LIZLLL7 = LIZLLL.LIZLLL(0L, LJIIIIZZ(i, "im_init_page_cursor"));
            StringBuilder LIZJ3 = V10.LIZJ("processHistoryError imsdk0InitCurosr = ", LIZLLL6, " normalInitCurosr = ");
            LIZJ3.append(LIZLLL7);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZJ3));
            if (LIZLLL6 > LIZLLL7) {
                LIZLLL.LIZIZ(Long.valueOf(LIZLLL6), LJIIIIZZ(i, "im_init_page_cursor"));
            }
        }
        LIZLLL.putBoolean(LJIIIZ(LJIIIZ("key_has_process_error")), true);
    }

    public static String LJII() {
        String LIZIZ2;
        if (C63308Osy.LJI().LIZIZ().LIZJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("imsdk_");
            LIZ2.append(C63308Osy.LJI().LIZIZ().getUid());
            LIZIZ2 = X1D.LIZIZ(LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("imsdk_sub_");
            LIZ3.append(C63308Osy.LJI().LIZIZ().getUid());
            LIZIZ2 = X1D.LIZIZ(LIZ3);
        }
        C47922IrO.LIZ();
        return LIZIZ2;
    }

    public static long LIZJ(int i) {
        String LJIIIIZZ = LJIIIIZZ(i, "cmd_index");
        long LIZLLL2 = LIZLLL.LIZLLL(-1L, LJIIIIZZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils getCmdIndex, key:");
        LIZ2.append(LJIIIIZZ);
        LIZ2.append(", index:");
        LIZ2.append(LIZLLL2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        return LIZLLL2;
    }

    public static long LIZLLL(int i) {
        String LJIIIIZZ = LJIIIIZZ(i, "msg_by_user_cursor");
        long LIZLLL2 = LIZLLL.LIZLLL(-1L, LJIIIIZZ);
        StringBuilder LIZJ2 = C06490Nh.LIZJ("SPUtils getCursor, key:", LJIIIIZZ, ", cursor:", LIZLLL2);
        V1I.LIZLLL(LIZJ2, ", inbox:", i, ", uid:");
        LIZJ2.append(LIZ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZJ2));
        return LIZLLL2;
    }

    public static Pair LJ(int i) {
        String LJIIIIZZ = LJIIIIZZ(i, "error_cursor");
        String string = LIZLLL.getString(LJIIIIZZ, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split(":");
        if (split.length != 2) {
            return null;
        }
        int i2 = 0;
        long LJ2 = C63312Ot2.LJ(split[0], 0L);
        String str = split[1];
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = CastIntegerProtector.parseInt(str);
            } catch (Exception e) {
                C63322OtC.LJ(C63312Ot2.LIZ, e);
            }
        }
        StringBuilder LIZJ2 = C06490Nh.LIZJ("SPUtils getErrorCursor, key:", LJIIIIZZ, ", cursor:", LJ2);
        LIZJ2.append(", count:");
        LIZJ2.append(i2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZJ2));
        return new Pair(Long.valueOf(LJ2), Integer.valueOf(i2));
    }

    public static long LJFF(int i) {
        String LJIIIIZZ = LJIIIIZZ(i, "msg_by_user_cursor_in_recent");
        long LIZLLL2 = LIZLLL.LIZLLL(-1L, LJIIIIZZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils getMixCursorInRecentMode, key:");
        LIZ2.append(LJIIIIZZ);
        LIZ2.append(", cursor:");
        LIZ2.append(LIZLLL2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        return LIZLLL2;
    }

    public static long LJI(int i) {
        String LJIIIIZZ = LJIIIIZZ(i, "recent_conv_version");
        long LIZLLL2 = LIZLLL.LIZLLL(-1L, LJIIIIZZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils getRecentVersion, key:");
        LIZ2.append(LJIIIIZZ);
        LIZ2.append(", version:");
        LIZ2.append(LIZLLL2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        return LIZLLL2;
    }

    public static String LJIIIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C63308Osy.LJI().LIZIZ().getUid());
        LIZ2.append("_");
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LJIILL(int i) {
        String LJIIIIZZ = LJIIIIZZ(i, "error_conv_version");
        int i2 = LIZLLL.getInt(LJIIIIZZ) + 1;
        if (i2 <= 2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SPUtils shouldIgnoreError, key:");
            LIZ2.append(LJIIIIZZ);
            LIZ2.append(", errorCount:");
            LIZ2.append(i2);
            LIZ2.append(", return forbid");
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            LIZLLL.putInt(LJIIIIZZ, i2);
            return false;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("SPUtils shouldIgnoreError, key:");
        LIZ3.append(LJIIIIZZ);
        LIZ3.append(", errorCount:");
        LIZ3.append(i2);
        LIZ3.append(", return ignore");
        C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
        LIZLLL.putInt(LJIIIIZZ, 0);
        return true;
    }

    public static String LJIIIIZZ(int i, String str) {
        if (i == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C63308Osy.LJI().LIZIZ().getUid());
            LIZ2.append("_");
            LIZ2.append(str);
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C63308Osy.LJI().LIZIZ().getUid());
        LIZ3.append("_");
        LIZ3.append(str);
        LIZ3.append("_");
        LIZ3.append(i);
        return X1D.LIZIZ(LIZ3);
    }

    public static void LJIIJ(int i, long j) {
        String LJIIIIZZ = LJIIIIZZ(i, "cmd_index");
        LIZLLL.LIZIZ(Long.valueOf(j), LJIIIIZZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils setCmdIndex, key:");
        LIZ2.append(LJIIIIZZ);
        LIZ2.append(", index:");
        LIZ2.append(j);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        if (j < 0) {
            C63322OtC.LJI("imsdk", C61845OOz.LIZ("SPUtils, setCmdIndex=", j), new Throwable());
        }
    }

    public static void LJIIJJI(int i, long j) {
        String LJIIIIZZ = LJIIIIZZ(i, "msg_by_user_cursor");
        LIZLLL.LIZIZ(Long.valueOf(j), LJIIIIZZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils setCursor, key:");
        LIZ2.append(LJIIIIZZ);
        LIZ2.append(", cursor:");
        C06510Nj.LIZIZ(LIZ2, j, ", inbox:", i);
        LIZ2.append(", uid:");
        LIZ2.append(LIZ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        if (j < 0) {
            C63322OtC.LJI("imsdk", C61845OOz.LIZ("SPUtils setCursor=", j), new Throwable());
        }
    }

    public static void LJIILIIL(int i, long j) {
        String LJIIIIZZ = LJIIIIZZ(i, "msg_by_user_cursor_in_recent");
        LIZLLL.LIZIZ(Long.valueOf(j), LJIIIIZZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils setMixCursorInRecentMode, key:");
        LIZ2.append(LJIIIIZZ);
        LIZ2.append(", cursor:");
        LIZ2.append(j);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        if (j < 0) {
            C63322OtC.LJI("imsdk", C61845OOz.LIZ("SPUtils, setMixCursorInRecentMode=", j), new Throwable());
        }
    }

    public static void LJIILJJIL(int i, long j) {
        String LJIIIIZZ = LJIIIIZZ(i, "recent_conv_version");
        LIZLLL.LIZIZ(Long.valueOf(j), LJIIIIZZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SPUtils setRecentVersion, key:");
        LIZ2.append(LJIIIIZZ);
        LIZ2.append(", version:");
        LIZ2.append(j);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        if (j < 0) {
            C63322OtC.LJI("imsdk", C61845OOz.LIZ("SPUtils setRecentVersion=", j), new Throwable());
        }
    }

    public static void LJIIL(int i, int i2, long j) {
        String LJIIIIZZ = LJIIIIZZ(i, "error_cursor");
        InterfaceC63293Osj interfaceC63293Osj = LIZLLL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(j);
        LIZ2.append(":");
        LIZ2.append(i2);
        interfaceC63293Osj.putString(LJIIIIZZ, X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("SPUtils setErrorCursor, key:");
        LIZ3.append(LJIIIIZZ);
        C0MT.LIZLLL(LIZ3, ", cursor:", j, ", count:");
        LIZ3.append(i2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
    }
}
