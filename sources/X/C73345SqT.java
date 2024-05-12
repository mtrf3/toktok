package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SqT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73345SqT {
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C73352Sqa.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C73348SqW.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C73351SqZ.LJLIL);
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C73350SqY.LJLIL);
    public static final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C73349SqX.LJLIL);
    public static final C62822Ol8 LJIIL = C221108m2.LIZIZ(C73347SqV.LJLIL);
    public static final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C73346SqU.LJLIL);
    public final HashMap<String, String> LIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C73356Sqe.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C73355Sqd.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C73354Sqc.LJLIL);

    public final void LIZLLL() {
        this.LIZJ = 0;
        C73357Sqf LJ = LJ();
        LJ.LIZ = -1L;
        LJ.LIZIZ = -1L;
        LJ.LIZJ = -1L;
        LJ.LIZLLL = -1L;
    }

    public final boolean LIZIZ() {
        if (this.LIZJ > 0 && !this.LIZLLL) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        if (this.LIZJ == 1 && !this.LIZLLL) {
            HashMap hashMap = new HashMap();
            LJFF();
            C73343SqR.LJFF(this, hashMap, 7);
        }
        LIZLLL();
    }

    public final C73357Sqf LJ() {
        return (C73357Sqf) this.LIZIZ.getValue();
    }

    public final HashMap<String, String> LJFF() {
        HashMap<String, String> hashMap = new HashMap<>();
        if (LJI().size() > 0) {
            hashMap.put("room_cnt", String.valueOf(LJI().size()));
            hashMap.put("room_id_list", LJI().toString());
            hashMap.put("anchor_id_list", this.LJI.getValue().toString());
            LJI().clear();
            ((List) this.LJI.getValue()).clear();
        }
        return hashMap;
    }

    public final List<String> LJI() {
        return (List) this.LJFF.getValue();
    }

    public final void LJII() {
        if (this.LIZJ > 0) {
            return;
        }
        this.LIZJ = 1;
        this.LIZLLL = false;
        this.LJ = false;
    }

    public final void LJIIIIZZ() {
        if (LIZIZ() && LJ().LIZLLL <= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C73357Sqf LJ = LJ();
            if (LJ.LIZIZ < 0 && LJ.LIZJ < 0) {
                LJ.LIZIZ = currentTimeMillis;
                LJ.LIZJ = currentTimeMillis;
            }
            LJ().LIZLLL = currentTimeMillis;
        }
    }

    public final void LJIIJ() {
        if (LIZIZ() && LJ().LIZIZ <= 0) {
            LJ().LIZIZ = System.currentTimeMillis();
        }
    }

    public final void LJIIJJI() {
        if (LIZIZ() && LJ().LIZJ <= 0) {
            LJ().LIZJ = System.currentTimeMillis();
        }
    }

    public C73345SqT(HashMap<String, String> hashMap) {
        this.LIZ = hashMap;
    }

    public final void LIZ(List<? extends User> list) {
        if (LIZIZ()) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                User user = (User) it.next();
                String roomId = String.valueOf(user.roomId);
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                o.LJIIIZ(roomId, "roomId");
                if (LIZIZ()) {
                    LJI().add(roomId);
                    ((List) this.LJI.getValue()).add(uid);
                }
            }
        }
    }

    public final void LJIIIZ(long j) {
        if (LIZIZ() && LJ().LIZ <= 0) {
            if (j > 0) {
                LJ().LIZ = j;
            } else {
                LJ().LIZ = System.currentTimeMillis();
            }
        }
    }

    public final void LJIIL(String str, String str2, String str3, HashMap<String, String> hashMap) {
        if (this.LIZJ == 1) {
            C188727au c188727au = new C188727au();
            c188727au.LJII(this.LIZ);
            C73357Sqf LJ = LJ();
            LJ.getClass();
            HashMap hashMap2 = new HashMap();
            long j = LJ.LIZ;
            if (j >= 0) {
                hashMap2.put("enter_timestamp", String.valueOf(j));
            }
            long j2 = LJ.LIZ;
            if (j2 >= 0) {
                long j3 = LJ.LIZIZ;
                if (j3 >= 0) {
                    long j4 = j3 - j2;
                    Long valueOf = Long.valueOf(j4);
                    if (valueOf.longValue() >= 0) {
                        valueOf.longValue();
                        C64504PTg.LIZJ(LJ.LIZIZ, hashMap2, "request_start_timestamp", j4, "enter2request_duration");
                    }
                }
            }
            if (LJ.LIZ >= 0) {
                long j5 = LJ.LIZIZ;
                if (j5 >= 0) {
                    long j6 = LJ.LIZJ;
                    if (j6 >= 0) {
                        long j7 = j6 - j5;
                        Long valueOf2 = Long.valueOf(j7);
                        if (valueOf2.longValue() >= 0) {
                            valueOf2.longValue();
                            C64504PTg.LIZJ(LJ.LIZJ, hashMap2, "respond_timestamp", j7, "request2respond_duration");
                        }
                    }
                }
            }
            if (LJ.LIZ >= 0 && LJ.LIZIZ >= 0) {
                long j8 = LJ.LIZJ;
                if (j8 >= 0) {
                    long j9 = LJ.LIZLLL;
                    if (j9 >= 0) {
                        long j10 = j9 - j8;
                        Long valueOf3 = Long.valueOf(j10);
                        if (valueOf3.longValue() >= 0) {
                            valueOf3.longValue();
                            C64504PTg.LIZJ(LJ.LIZLLL, hashMap2, "draw_over_timestamp", j10, "draw_duration");
                        }
                    }
                }
            }
            if (LJ.LIZ < 0 || LJ.LIZIZ < 0 || LJ.LIZJ < 0 || LJ.LIZLLL < 0) {
                hashMap2.put("is_left_page", "1");
            }
            c188727au.LJIIIIZZ(hashMap2);
            if (str != null) {
                c188727au.LJI("enter_from_merge", str);
            }
            if (str2 != null) {
                c188727au.LJI("enter_method", str2);
            }
            if (str3 != null) {
                c188727au.LJI("action_type", str3);
            }
            if (hashMap != null) {
                c188727au.LJII(hashMap);
            }
            FMX.LJIIL("livesdk_entrance_impr_duration", c188727au.LIZ);
            this.LIZJ = 2;
            this.LIZLLL = true;
            this.LJ = true;
        }
    }
}
