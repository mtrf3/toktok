package X;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TFv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74347TFv implements InterfaceC83883Ww3, InterfaceC74331TFf, InterfaceC75158Tec, InterfaceC19890qH {
    public static final C74347TFv LJLIL = new C74347TFv();

    @Override // X.InterfaceC83883Ww3
    public String LIZ() {
        return "";
    }

    @Override // X.InterfaceC83883Ww3
    public boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC83883Ww3
    public boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC83883Ww3
    public int LIZLLL() {
        return 0;
    }

    @Override // X.InterfaceC75158Tec
    public void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC83883Ww3
    public int LJI() {
        return 0;
    }

    @Override // X.InterfaceC83883Ww3
    public String LJIIIIZZ() {
        return "";
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILL(Exception exc, String str) {
    }

    @Override // X.InterfaceC19890qH
    public void onShow() {
        InterfaceC30442Bx8.LLLZZIL.LIZ(Boolean.TRUE);
    }

    @Override // X.InterfaceC74331TFf
    public void LJII(InterfaceC74334TFi interfaceC74334TFi) {
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/profile/");
        LIZ.append(interfaceC74334TFi.getUid());
        C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
        c39061g6.LIZIZ("sec_user_id", interfaceC74334TFi.getSecUid());
        c39061g6.LIZIZ("enter_from", "prop_page");
        LIZLLL.LJII(c39061g6.LIZJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC58928NAu LJIIIZ(X.InterfaceC64672gJ r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C74348TFw
            if (r0 == 0) goto L25
            r4 = r7
            X.TFw r4 = (X.C74348TFw) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 == r0) goto L39
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            X.TFw r4 = new X.TFw
            r4.<init>(r7)
            goto L12
        L2b:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r5
            r4.LJLJI = r0
            java.lang.Object r0 = r5.emit(r6, r4)
            if (r0 != r2) goto L3e
            return r2
        L39:
            X.2gJ r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L3e:
            X.3CM r0 = new X.3CM
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74347TFv.LJIIIZ(X.2gJ, java.lang.Object, X.2kd):X.NAu");
    }

    @Override // X.InterfaceC75158Tec
    public void LJIILJJIL(int i, int i2, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(CA3.LIZ);
        linkedHashMap.put("banner_type", 1);
        linkedHashMap.put("duration", Long.valueOf(CA3.LIZIZ(CA3.LIZIZ, elapsedRealtime)));
        CA3.LJFF(0, "show", linkedHashMap);
    }
}
