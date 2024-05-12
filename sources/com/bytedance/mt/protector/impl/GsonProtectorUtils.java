package com.bytedance.mt.protector.impl;

import X.C65385PlN;
import X.C65403Plf;
import X.C65415Plr;
import X.C78685UuP;
import X.EnumC65856Psy;
import X.PTF;
import com.bytedance.mt.protector.SelfDataManager;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.io.Reader;
import java.lang.reflect.Type;

/* loaded from: classes12.dex */
public class GsonProtectorUtils {
    public static Gson createGson() {
        if (C65415Plr.LIZIZ()) {
            try {
                return new Gson();
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    if (LIZ.LIZ instanceof j) {
                        return new Gson();
                    }
                    return null;
                }
                addSelfData("createGson", th, "Gson<init>");
                throw th;
            }
        }
        return new Gson();
    }

    public static j parse(o oVar, String str) {
        if (C65415Plr.LIZIZ()) {
            try {
                oVar.getClass();
                return o.LIZ(str);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof String) {
                        oVar.getClass();
                        return o.LIZ((String) obj);
                    }
                    return null;
                }
                addSelfData("parse", th, str);
                throw th;
            }
        }
        oVar.getClass();
        return o.LIZ(str);
    }

    public static String toJson(Gson gson, j jVar) {
        if (C65415Plr.LIZIZ()) {
            try {
                return gson.LJIILJJIL(jVar);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return (String) LIZ.LIZ;
                }
                throw th;
            }
        }
        return gson.LJIILJJIL(jVar);
    }

    public static j toJsonTree(Gson gson, Object obj) {
        if (C65415Plr.LIZIZ()) {
            try {
                return gson.LJIJJLI(obj);
            } catch (Throwable th) {
                if (C65415Plr.LIZ(EnumC65856Psy.JSON, th) != null) {
                    return null;
                }
                throw th;
            }
        }
        return gson.LJIJJLI(obj);
    }

    public static String toJson(Gson gson, Object obj) {
        if (C65415Plr.LIZIZ()) {
            try {
                return gson.LJIILL(obj);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return (String) LIZ.LIZ;
                }
                throw th;
            }
        }
        return gson.LJIILL(obj);
    }

    public static void addSelfData(String str, Throwable th, String str2) {
        try {
            String LJJJJJL = C78685UuP.LJJJJJL(th);
            m mVar = new m();
            mVar.LJJIIZ("stackTrace", LJJJJJL);
            mVar.LJJIIZ("inputData", str2);
            SelfDataManager.LJ.LIZ(str, th, mVar);
        } catch (Throwable unused) {
            C65415Plr.LJ.LJ();
        }
    }

    public static <T> T fromJson(Gson gson, C65385PlN c65385PlN, Type type) {
        if (C65415Plr.LIZIZ()) {
            try {
                return (T) gson.LJIIIIZZ(c65385PlN, type);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return (T) gson.LIZLLL((j) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, "unsupport JsonReader");
                throw th;
            }
        }
        return (T) gson.LJIIIIZZ(c65385PlN, type);
    }

    public static void toJson(Gson gson, Object obj, Appendable appendable) {
        if (C65415Plr.LIZIZ()) {
            try {
                gson.getClass();
                if (obj != null) {
                    gson.LJIJI(obj, obj.getClass(), appendable);
                } else {
                    gson.LJIIZILJ(l.LJLIL, appendable);
                }
            } catch (Throwable th) {
                if (C65415Plr.LIZ(EnumC65856Psy.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.getClass();
        if (obj != null) {
            gson.LJIJI(obj, obj.getClass(), appendable);
        } else {
            gson.LJIIZILJ(l.LJLIL, appendable);
        }
    }

    public static j toJsonTree(Gson gson, Object obj, Type type) {
        if (C65415Plr.LIZIZ()) {
            try {
                return gson.LJIL(obj, type);
            } catch (Throwable th) {
                if (C65415Plr.LIZ(EnumC65856Psy.JSON, th) != null) {
                    return null;
                }
                throw th;
            }
        }
        return gson.LJIL(obj, type);
    }

    public static void addSelfData(String str, Throwable th, j jVar) {
        String str2;
        if (jVar != null) {
            str2 = jVar.toString();
        } else {
            str2 = "null-param";
        }
        addSelfData(str, th, str2);
    }

    public static <T> T fromJson(Gson gson, Reader reader, Class<T> cls) {
        if (C65415Plr.LIZIZ()) {
            try {
                return (T) gson.LJ(reader, cls);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return (T) gson.LIZJ((j) obj, cls);
                    }
                    return null;
                }
                addSelfData("fromJson", th, "unsupport Reader");
                throw th;
            }
        }
        return (T) gson.LJ(reader, cls);
    }

    public static String toJson(Gson gson, Object obj, Type type) {
        if (C65415Plr.LIZIZ()) {
            try {
                return gson.LJIILLIIL(obj, type);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    return (String) LIZ.LIZ;
                }
                throw th;
            }
        }
        return gson.LJIILLIIL(obj, type);
    }

    public static <T> T fromJson(Gson gson, Reader reader, Type type) {
        if (C65415Plr.LIZIZ()) {
            try {
                return (T) gson.LJFF(reader, type);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return (T) gson.LIZLLL((j) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, "unsupport Reader");
                throw th;
            }
        }
        return (T) gson.LJFF(reader, type);
    }

    public static void toJson(Gson gson, j jVar, Appendable appendable) {
        if (C65415Plr.LIZIZ()) {
            try {
                gson.LJIIZILJ(jVar, appendable);
            } catch (Throwable th) {
                if (C65415Plr.LIZ(EnumC65856Psy.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.LJIIZILJ(jVar, appendable);
    }

    public static <T> T fromJson(Gson gson, j jVar, Class<T> cls) {
        if (C65415Plr.LIZIZ()) {
            try {
                return (T) gson.LIZJ(jVar, cls);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return (T) gson.LIZJ((j) obj, cls);
                    }
                    return null;
                }
                addSelfData("fromJson", th, jVar);
                throw th;
            }
        }
        return (T) gson.LIZJ(jVar, cls);
    }

    public static <T> T fromJson(Gson gson, j jVar, Type type) {
        if (C65415Plr.LIZIZ()) {
            try {
                return (T) gson.LIZLLL(jVar, type);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return (T) gson.LIZLLL((j) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, jVar);
                throw th;
            }
        }
        return (T) gson.LIZLLL(jVar, type);
    }

    public static <T> T fromJson(Gson gson, String str, Class<T> cls) {
        if (C65415Plr.LIZIZ()) {
            try {
                return (T) gson.LJI(str, cls);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return (T) gson.LIZJ((j) obj, cls);
                    }
                    return null;
                }
                addSelfData("fromJson", th, str);
                throw th;
            }
        }
        return (T) gson.LJI(str, cls);
    }

    public static <T> T fromJson(Gson gson, String str, Type type) {
        if (C65415Plr.LIZIZ()) {
            try {
                return (T) gson.LJII(str, type);
            } catch (Throwable th) {
                PTF LIZ = C65415Plr.LIZ(EnumC65856Psy.JSON, th);
                if (LIZ != null) {
                    Object obj = LIZ.LIZ;
                    if (obj instanceof j) {
                        return (T) gson.LIZLLL((j) obj, type);
                    }
                    return null;
                }
                addSelfData("fromJson", th, str);
                throw th;
            }
        }
        return (T) gson.LJII(str, type);
    }

    public static void toJson(Gson gson, Object obj, Type type, C65403Plf c65403Plf) {
        if (C65415Plr.LIZIZ()) {
            try {
                gson.LJIJJ(obj, type, c65403Plf);
            } catch (Throwable th) {
                if (C65415Plr.LIZ(EnumC65856Psy.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.LJIJJ(obj, type, c65403Plf);
    }

    public static void toJson(Gson gson, Object obj, Type type, Appendable appendable) {
        if (C65415Plr.LIZIZ()) {
            try {
                gson.LJIJI(obj, type, appendable);
            } catch (Throwable th) {
                if (C65415Plr.LIZ(EnumC65856Psy.JSON, th) != null) {
                    return;
                } else {
                    throw th;
                }
            }
        }
        gson.LJIJI(obj, type, appendable);
    }
}
