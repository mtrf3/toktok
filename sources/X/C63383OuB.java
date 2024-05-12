package X;

import com.bytedance.im.core.proto.SendMessageResponseBody;
import djb.IDaS20S0000000_1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.OuB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63383OuB {
    public static final java.util.Set<Integer> LJIIZILJ = C77275UUl.LJIIIIZZ(Integer.valueOf(EnumC63625Oy5.GET_MESSAGES_BY_USER.getValue()), Integer.valueOf(EnumC63625Oy5.SEND_MESSAGE.getValue()), Integer.valueOf(EnumC63625Oy5.ACK_MESSAGE.getValue()), Integer.valueOf(EnumC63625Oy5.NEW_MSG_NOTIFY.getValue()), Integer.valueOf(EnumC63625Oy5.GET_CONVERSATIONS_CHECK_INFO_V2.getValue()), Integer.valueOf(EnumC63625Oy5.GET_MESSAGES_CHECK_INFO_V2.getValue()), Integer.valueOf(EnumC63625Oy5.CREATE_CONVERSATION_V2.getValue()));
    public final InterfaceC65784Pro<C114444eO> LIZ;
    public final InterfaceC117594jT LIZIZ;
    public final C63521OwP LIZJ;
    public final C63385OuD LIZLLL;
    public final C63408Oua LJ;
    public final C63205OrJ LJFF;
    public final C63363Otr LJI;
    public final C63364Ots LJII;
    public final C63630OyA LJIIIIZZ;
    public final C63560Ox2 LJIIIZ;
    public final InterfaceC75342xW LJIIJ;
    public final AnonymousClass302 LJIIJJI;
    public final InterfaceC70422pa LJIIL;
    public final C63686Oz4<SendMessageResponseBody> LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final java.util.Map<Integer, InterfaceC63396OuO> LJIILL;
    public boolean LJIILLIIL;

    public final void LIZJ() {
        C63322OtC.LIZIZ("IMUseCaseClient", "on logout");
        C79146V4k.LJIJJ(this.LJIIL.getCoroutineContext());
        this.LIZIZ.clear();
        Iterator it = ((LinkedHashMap) this.LJIILL).entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC63396OuO) ((Map.Entry) it.next()).getValue()).clear();
        }
        ((LinkedHashMap) this.LJIILL).clear();
        this.LJIILIIL.getClass();
        C63322OtC.LJI("SendMessageQueue", "User logout", null);
    }

    public final InterfaceC63396OuO LIZ(int i) {
        java.util.Map<Integer, InterfaceC63396OuO> map = this.LJIILL;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            long j = this.LIZ.invoke().LJLIIIL;
            boolean z = this.LIZ.invoke().LJLIIL;
            boolean z2 = this.LIZ.invoke().LJLIL;
            C63205OrJ processMessageBodyUseCase = this.LJFF;
            C63630OyA batchAckUseCase = this.LJIIIIZZ;
            InterfaceC70422pa userLifecycleScope = this.LJIIL;
            C63382OuA c63382OuA = new C63382OuA(this);
            o.LJIIIZ(userLifecycleScope, "userLifecycleScope");
            o.LJIIIZ(processMessageBodyUseCase, "processMessageBodyUseCase");
            o.LJIIIZ(batchAckUseCase, "batchAckUseCase");
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            XKW LIZ = C120394nz.LIZ();
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "inst()");
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            o.LJIIIIZZ(LJIILIIL, "inst()");
            obj = new C63420Oum(i, j, z, z2, new C63365Ott(abstractC78621UtN, LIZ, userLifecycleScope, processMessageBodyUseCase, batchAckUseCase, LIZLLL, LJIILIIL, c63382OuA));
            linkedHashMap.put(valueOf, obj);
        }
        return (InterfaceC63396OuO) obj;
    }

    public final void LIZIZ(int i, int i2, java.util.Map<String, ? extends Object> map) {
        boolean z;
        synchronized (C65352Pkq.LIZ(C63269OsL.class)) {
            java.util.Set<Integer> set = C63269OsL.LIZJ;
            if (((CopyOnWriteArraySet) set).contains(Integer.valueOf(i)) || C63269OsL.LJFF(i)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("pull, reason:");
                LIZ.append(i2);
                LIZ.append(", inbox:");
                LIZ.append(i);
                LIZ.append(", already pulling, return");
                C63322OtC.LJI("IMUseCaseClient", X1D.LIZIZ(LIZ), null);
                return;
            }
            ((CopyOnWriteArraySet) set).add(Integer.valueOf(i));
            if (this.LJIILLIIL || this.LIZ.invoke().LJLI) {
                z = true;
            } else {
                z = false;
            }
            this.LJIILLIIL = z;
            if (z) {
                XKX.LIZLLL(this.LJIIL, null, null, new C63380Ou8(this, i, i2, map, null), 3);
            } else {
                XKX.LIZLLL(this.LJIIL, C120394nz.LIZ(), null, new C63381Ou9(this, i, i2, map, null), 2);
            }
        }
    }

    public C63383OuB(C63402OuU c63402OuU, C63589OxV c63589OxV, C63521OwP c63521OwP, C63385OuD c63385OuD, C63408Oua c63408Oua, C63205OrJ c63205OrJ, C63363Otr c63363Otr, C63364Ots c63364Ots, C63630OyA c63630OyA, C63560Ox2 c63560Ox2, C63389OuH c63389OuH, C63410Ouc c63410Ouc, C64962gm c64962gm) {
        this.LIZ = c63402OuU;
        this.LIZIZ = c63589OxV;
        this.LIZJ = c63521OwP;
        this.LIZLLL = c63385OuD;
        this.LJ = c63408Oua;
        this.LJFF = c63205OrJ;
        this.LJI = c63363Otr;
        this.LJII = c63364Ots;
        this.LJIIIIZZ = c63630OyA;
        this.LJIIIZ = c63560Ox2;
        this.LJIIJ = c63389OuH;
        this.LJIIJJI = c63410Ouc;
        this.LJIIL = c64962gm;
        C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()).plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 11)));
        this.LJIILIIL = new C63686Oz4<>(c64962gm);
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 449));
        this.LJIILL = new LinkedHashMap();
    }
}
