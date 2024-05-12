package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Tbj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74979Tbj {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static EnumC74778TWk LJIIIZ;
    public static final C74979Tbj LIZ = new C74979Tbj();
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C74980Tbk.LJLIL);
    public static boolean LJIIJJI = true;
    public static String LJIIL = "";
    public static String LJIILIIL = "";

    public static void LJII() {
        String str;
        String str2;
        boolean z = LIZLLL;
        if (z == (!LJ)) {
            if (z) {
                str2 = "fixed";
            } else {
                str2 = "unfixed";
            }
            LJ(str2, LJIILIIL);
        }
        boolean z2 = LIZIZ;
        if (z2 == (!LIZJ)) {
            if (z2) {
                str = "float";
            } else {
                str = "grid";
            }
            LIZLLL(str, LJIILIIL);
        }
        LIZIZ = false;
        LIZJ = false;
        LIZLLL = false;
        LJ = false;
        LJFF = false;
        LJIIJJI = true;
        LJI = 0L;
        LJII = 0L;
        LJIIL = "";
        LJIILIIL = "";
    }

    public static void LIZIZ(String str) {
        long j;
        String str2;
        InterfaceC05190Ih interfaceC05190Ih;
        if (LJIIIIZZ == 0) {
            return;
        }
        OSZ LJI2 = C74824TYe.LJI(LJIIIZ);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_layout_type_duration_onstage");
        LIZ2.LJIIZILJ();
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            j = interfaceC05190Ih.getId();
        } else {
            j = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j), "anchor_id");
        Room room = (Room) LJIIJ.getValue();
        if (room != null) {
            str2 = room.getIdStr();
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "room_id");
        LIZ2.LJIJJ(str, "trigger");
        LIZ2.LJIJJ(LJI2.getFirst(), "layout_setting");
        LIZ2.LJIJJ(LJI2.getSecond(), "window_setting");
        C28289B8j.LIZJ(System.currentTimeMillis(), LJIIIIZZ, LIZ2, "duration");
        LJIIIIZZ = 0L;
    }

    public static void LIZJ(String str) {
        String str2;
        InterfaceC05190Ih interfaceC05190Ih;
        long j = 0;
        if (LJIIIIZZ != 0) {
            return;
        }
        LJIIIIZZ = System.currentTimeMillis();
        EnumC74778TWk LJIIJ2 = C74824TYe.LJIIJ();
        LJIIIZ = LJIIJ2;
        OSZ LJI2 = C74824TYe.LJI(LJIIJ2);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_layout_type_start_onstage");
        LIZ2.LJIIZILJ();
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            j = interfaceC05190Ih.getId();
        }
        LIZ2.LJIJJ(Long.valueOf(j), "anchor_id");
        Room room = (Room) LJIIJ.getValue();
        if (room != null) {
            str2 = room.getIdStr();
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "room_id");
        LIZ2.LJIJJ(str, "trigger");
        LIZ2.LJIJJ(LJI2.getFirst(), "layout_setting");
        LIZ2.LJIJJ(LJI2.getSecond(), "window_setting");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIIIZ(boolean z) {
        if (z) {
            if (!LIZLLL) {
                boolean LJ2 = LJ("unfixed", LJIILIIL);
                LIZ("livesdk_anchor_window_type_start", "fixed", false, true, LJIIL);
                long currentTimeMillis = System.currentTimeMillis();
                LJI = currentTimeMillis;
                if (LJ2 || currentTimeMillis != 0) {
                    LIZLLL = true;
                    LJ = false;
                    return;
                }
                return;
            }
            return;
        }
        if (LJ) {
            return;
        }
        boolean LJ3 = LJ("fixed", LJIILIIL);
        if (!LJIIJJI || LJFF) {
            LIZ("livesdk_anchor_window_type_start", "unfixed", false, true, LJIIL);
            LJI = System.currentTimeMillis();
        }
        if (!LJ3 && LJI == 0) {
            return;
        }
        LIZLLL = false;
        LJ = true;
        if (!LJIIJJI) {
            return;
        }
        LJ = false;
    }

    public final void LJI(boolean z) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C74838TYs.LJ().LJJI;
        if (multiLiveAnchorPanelSettings == null) {
            return;
        }
        EnumC74991Tbv LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings);
        if (z) {
            if (LJJ == null) {
                return;
            }
            int i = C74981Tbl.LIZ[LJJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LJFF(EnumC74991Tbv.ZOOM_GRID_GUEST, false);
                return;
            }
            LJFF(EnumC74991Tbv.ZOOM_PANEL, false);
            return;
        }
        if (LJJ == null) {
            return;
        }
        int i2 = C74981Tbl.LIZ[LJJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            LJFF(EnumC74991Tbv.GRID_FLOAT, false);
            return;
        }
        LJFF(EnumC74991Tbv.FLOAT, false);
    }

    public static boolean LIZLLL(String str, String str2) {
        if (LJII == 0) {
            return false;
        }
        LIZ("livesdk_anchor_layout_type_duration", str, true, false, str2);
        LJII = 0L;
        return true;
    }

    public static boolean LJ(String str, String str2) {
        if (LJI == 0) {
            return false;
        }
        LIZ("livesdk_anchor_window_type_duration", str, true, true, str2);
        LJI = 0L;
        return true;
    }

    public static final void LJIIIIZZ(boolean z, boolean z2) {
        String str = "float";
        if (z) {
            if (!LIZIZ) {
                boolean LIZLLL2 = LIZLLL("grid", LJIILIIL);
                if (z2 || !LJIIJJI || LJFF) {
                    LIZ("livesdk_anchor_layout_type_start", "float", false, false, LJIIL);
                    LJII = System.currentTimeMillis();
                }
                if (LIZLLL2 || LJII != 0) {
                    LIZIZ = true;
                    LIZJ = false;
                    if (!z2 && LJIIJJI) {
                        LIZIZ = false;
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (!LIZJ) {
            boolean LIZLLL3 = LIZLLL("float", LJIILIIL);
            if (z2 || !LJIIJJI || LJFF) {
                LIZ("livesdk_anchor_layout_type_start", "grid", false, false, LJIIL);
                LJII = System.currentTimeMillis();
            }
            if (!LIZLLL3 && LJII == 0) {
                return;
            }
            LIZIZ = false;
            LIZJ = true;
            if (z2 || !LJIIJJI) {
                return;
            }
            LIZJ = false;
            return;
        }
        if (!LJIIJJI || z2 || LJII == 0) {
            return;
        }
        if (LIZJ) {
            str = "grid";
        }
        LIZLLL(str, LJIILIIL);
        LIZIZ = false;
        LIZJ = false;
    }

    public final void LJFF(EnumC74991Tbv enumC74991Tbv, boolean z) {
        int i;
        LJFF = z;
        if (enumC74991Tbv == null) {
            i = -1;
        } else {
            i = C74981Tbl.LIZ[enumC74991Tbv.ordinal()];
        }
        switch (i) {
            case 1:
                LJIIIZ(false);
                LJIIIIZZ(true, false);
                break;
            case 2:
                LJIIIZ(false);
                LJIIIIZZ(false, false);
                break;
            case 3:
                LJIIIZ(true);
                LJIIIIZZ(true, true);
                break;
            case 4:
                LJIIIZ(true);
                LJIIIIZZ(false, true);
                break;
            case 5:
                LJIIL = "enlarge_guest";
                LJIILIIL = "enlarge_guest";
                LJIIIZ(true);
                LJIIIIZZ(true, true);
                break;
            case 6:
            case 7:
                LJIIL = "enlarge_guest";
                LJIILIIL = "enlarge_guest";
                LJIIIZ(true);
                LJIIIIZZ(false, true);
                break;
            default:
                LJIIL = "";
                break;
        }
        LIZIZ("switch_layout");
        if (C78886Uxe.LJJJJZI(C8E.LJ()) > 0) {
            LIZJ("switch_layout");
        }
    }

    public static void LIZ(String str, String str2, boolean z, boolean z2, String str3) {
        long j;
        String str4;
        InterfaceC05190Ih interfaceC05190Ih;
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            j = interfaceC05190Ih.getId();
        } else {
            j = 0;
        }
        LIZ2.LJIJJ(Long.valueOf(j), "anchor_id");
        Room room = (Room) LJIIJ.getValue();
        if (room != null) {
            str4 = room.getIdStr();
        } else {
            str4 = null;
        }
        LIZ2.LJIJJ(str4, "room_id");
        LIZ2.LJIJJ(str3, "trigger");
        if (z2) {
            LIZ2.LJIJJ(str2, "window_type");
            if (z) {
                C28289B8j.LIZJ(System.currentTimeMillis(), LJI, LIZ2, "duration");
                return;
            } else {
                LIZ2.LJJIIJZLJL();
                return;
            }
        }
        LIZ2.LJIJJ(str2, "layout_type");
        if (z) {
            C28289B8j.LIZJ(System.currentTimeMillis(), LJII, LIZ2, "duration");
        } else {
            LIZ2.LJJIIJZLJL();
        }
    }
}
