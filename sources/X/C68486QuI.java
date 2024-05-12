package X;

import com.ss.android.ugc.localnotify.database.WorkManagerTaskDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QuI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68486QuI implements InterfaceC68480QuC {
    public static final C68486QuI LIZ = new C68486QuI();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C68502QuY.LJLIL);

    public static WorkManagerTaskDatabase LJIIIIZZ() {
        return (WorkManagerTaskDatabase) LIZIZ.getValue();
    }

    @Override // X.InterfaceC68480QuC
    public final List<C68476Qu8> LIZ() {
        List<C68476Qu8> LIZLLL;
        synchronized (C68476Qu8.LJLLILLLL) {
            LIZLLL = LJIIIIZZ().LJIJ().LIZLLL(1);
        }
        return LIZLLL;
    }

    @Override // X.InterfaceC68480QuC
    public final List<C68476Qu8> LIZLLL() {
        List<C68476Qu8> LIZLLL;
        synchronized (C68476Qu8.LJLLILLLL) {
            LIZLLL = LJIIIIZZ().LJIJ().LIZLLL(3);
        }
        return LIZLLL;
    }

    @Override // X.InterfaceC68480QuC
    public final void LJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clearExpiredTaskRecordsOfType(");
        LIZ2.append(3);
        LIZ2.append(')');
        C47629Imf.LIZ("WorkManagerDbService", X1D.LIZIZ(LIZ2));
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (LIZ) {
            LJIIIIZZ().LJIJ().LIZJ(currentTimeMillis);
        }
    }

    @Override // X.InterfaceC68480QuC
    public final void LIZIZ(List<C68476Qu8> list) {
        synchronized (C68476Qu8.LJLLILLLL) {
            if ((!((ArrayList) list).isEmpty()) && list != null) {
                LJIIIIZZ().LJIJ().LIZIZ(list);
            }
        }
    }

    @Override // X.InterfaceC68480QuC
    public final int LIZJ(List<Integer> types) {
        int LJI;
        o.LJIIIZ(types, "types");
        synchronized (C68476Qu8.LJLLILLLL) {
            LJI = LJIIIIZZ().LJIJ().LJI(types);
        }
        return LJI;
    }

    @Override // X.InterfaceC68480QuC
    public final void LJFF(C68476Qu8 c68476Qu8) {
        synchronized (C68476Qu8.LJLLILLLL) {
            LJIIIIZZ().LJIJ().LJ(c68476Qu8);
        }
    }

    @Override // X.InterfaceC68480QuC
    public final void LJI(List<Integer> types) {
        o.LJIIIZ(types, "types");
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("clearExpiredTaskRecordsOfTypes(");
        LIZ2.append(types);
        LIZ2.append(") - Now = ");
        LIZ2.append(C67257QaT.LIZLLL(currentTimeMillis));
        C47629Imf.LIZ("WorkManagerDbService", X1D.LIZIZ(LIZ2));
        synchronized (LIZ) {
            LJIIIIZZ().LJIJ().LIZ(currentTimeMillis, types);
        }
    }

    @Override // X.InterfaceC68480QuC
    public final int LJII(int i) {
        int LJFF;
        synchronized (C68476Qu8.LJLLILLLL) {
            LJFF = LJIIIIZZ().LJIJ().LJFF(i);
        }
        return LJFF;
    }
}
