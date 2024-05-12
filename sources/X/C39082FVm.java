package X;

import Y.ARunnableS8S0000100_6;
import android.os.SystemClock;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FVm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39082FVm {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile int LJ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(DR4.LJLIL);
    public static volatile C39083FVn LIZLLL = new C39083FVn();
    public static final Object LJFF = new Object();
    public static volatile long LJI = -1;

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final boolean LIZ() {
        if (LIZIZ() && !LIZIZ && LIZJ) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(java.util.Map<String, ? extends Object> map) {
        try {
            if (!LIZ()) {
                return;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                switch (key.hashCode()) {
                    case -439023270:
                        if (key.equals("ui_page")) {
                            LIZLLL.LIZ(entry.getValue(), entry.getKey());
                            Object value = entry.getValue();
                            if (o.LJ(value, "fyp")) {
                                LIZLLL.LIZ(1, "ui_has_fyp");
                                break;
                            } else if (o.LJ(value, "follow")) {
                                LIZLLL.LIZ(1, "ui_has_follow");
                                break;
                            } else if (o.LJ(value, "dm")) {
                                LIZLLL.LIZ(1, "ui_has_dm");
                                break;
                            } else if (o.LJ(value, "profile_public")) {
                                LIZLLL.LIZ(1, "ui_has_post");
                                break;
                            } else if (o.LJ(value, "profile_private")) {
                                LIZLLL.LIZ(1, "ui_has_private");
                                break;
                            } else if (o.LJ(value, "profile_likes")) {
                                LIZLLL.LIZ(1, "ui_has_likes");
                                break;
                            } else if (o.LJ(value, "favorite_videos")) {
                                LIZLLL.LIZ(1, "ui_has_favorite");
                                break;
                            } else if (o.LJ(value, "music")) {
                                LIZLLL.LIZ(1, "ui_has_music");
                                break;
                            } else if (o.LJ(value, "challenge")) {
                                LIZLLL.LIZ(1, "ui_has_challenge");
                                break;
                            } else {
                                LIZLLL.LIZ(1, "ui_has_other");
                                break;
                            }
                        } else {
                            break;
                        }
                    case -363502076:
                        if (key.equals("data_page")) {
                            LIZLLL.LIZ(entry.getValue(), entry.getKey());
                            Object value2 = entry.getValue();
                            if (o.LJ(value2, "fyp")) {
                                LIZLLL.LIZ(1, "data_has_fyp");
                                break;
                            } else if (o.LJ(value2, "follow")) {
                                LIZLLL.LIZ(1, "data_has_follow");
                                break;
                            } else if (o.LJ(value2, "dm")) {
                                LIZLLL.LIZ(1, "data_has_dm");
                                break;
                            } else if (o.LJ(value2, "profile_public")) {
                                LIZLLL.LIZ(1, "data_has_post");
                                break;
                            } else if (o.LJ(value2, "profile_private")) {
                                LIZLLL.LIZ(1, "data_has_private");
                                break;
                            } else if (o.LJ(value2, "profile_likes")) {
                                LIZLLL.LIZ(1, "data_has_likes");
                                break;
                            } else if (o.LJ(value2, "favorite_videos")) {
                                LIZLLL.LIZ(1, "data_has_favorite");
                                break;
                            } else if (o.LJ(value2, "music")) {
                                LIZLLL.LIZ(1, "data_has_music");
                                break;
                            } else if (o.LJ(value2, "challenge")) {
                                LIZLLL.LIZ(1, "data_has_challenge");
                                break;
                            } else {
                                LIZLLL.LIZ(1, "data_has_other");
                                break;
                            }
                        } else {
                            break;
                        }
                    case -230065082:
                        if (key.equals("launch_type")) {
                            C39083FVn c39083FVn = LIZLLL;
                            String key2 = entry.getKey();
                            Object value3 = entry.getValue();
                            c39083FVn.getClass();
                            if (key2 != null && value3 != null && !c39083FVn.LIZ.containsKey(key2)) {
                                if (!(value3 instanceof Integer) && !o.LJ(value3, C39087FVr.LIZ) && !o.LJ(value3, C39086FVq.LIZ)) {
                                    c39083FVn.LIZ.put(key2, value3.toString());
                                    break;
                                }
                                c39083FVn.LIZ.put(key2, value3);
                                break;
                            }
                        } else {
                            break;
                        }
                        break;
                    case 820285452:
                        if (key.equals("vv_code")) {
                            Object value4 = entry.getValue();
                            if (value4 instanceof Integer) {
                                Number number = (Number) value4;
                                if (LJ < number.intValue()) {
                                    LJ = number.intValue();
                                    LIZLLL.LIZ(Integer.valueOf(LJ), "vv_code");
                                    if (LJ == 9000) {
                                        LIZIZ = true;
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                }
                LIZLLL.LIZ(entry.getValue(), entry.getKey());
            }
            if (LJ >= 200) {
                C38995FSd.LIZLLL().execute(new ARunnableS8S0000100_6(SystemClock.uptimeMillis(), 7));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
