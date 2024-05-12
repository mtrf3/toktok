package Y;

import X.C68972R5c;
import X.C69084R9k;
import X.C69093R9t;
import X.C69099R9z;
import X.C85649XjR;
import X.EnumC69113RAn;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.Q13;
import X.RC2;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS0S2201000_11 implements InterfaceC64592gB {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S2201000_11 afS0S2201000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C69099R9z.LIZIZ(1, afS0S2201000_11.i4, c69084R9k.getErrorCode(), c69084R9k.getMessage(), afS0S2201000_11.s0);
        EnumC69113RAn enumC69113RAn = (EnumC69113RAn) afS0S2201000_11.l2;
        if (enumC69113RAn == EnumC69113RAn.INPUT_PHONE_SIGN_UP) {
            RC2.LIZ(Integer.valueOf(c69084R9k.getErrorCode()), ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJLLLLLLLZ(), "phone");
        } else if (enumC69113RAn == EnumC69113RAn.INPUT_PHONE_LOGIN) {
            C85649XjR.LIZ(false, ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJLLLLLLLZ(), null, 0, null, 28);
        }
        C68972R5c.LJIIJ(((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LLZZ(), c69084R9k.getErrorCode(), afS0S2201000_11.s1, afS0S2201000_11.i4, "text", c69084R9k.getErrorMsg(), null, null, null, null, null, C69093R9t.LJIJ((EnumC69113RAn) afS0S2201000_11.l2), 15872);
    }

    public static final void accept$1(AfS0S2201000_11 afS0S2201000_11, Object obj) {
        C69099R9z.LIZIZ(0, afS0S2201000_11.i4, 0, "", afS0S2201000_11.s0);
        C68972R5c.LJIIJ(((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LLZZ(), 0, afS0S2201000_11.s1, afS0S2201000_11.i4, "text", null, null, null, null, null, null, C69093R9t.LJIJ((EnumC69113RAn) afS0S2201000_11.l3), 15872);
    }

    public static final void accept$2(AfS0S2201000_11 afS0S2201000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C69099R9z.LIZIZ(1, afS0S2201000_11.i4, c69084R9k.getErrorCode(), c69084R9k.getMessage(), null);
        C68972R5c.LJIIJ(((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LLZZ(), c69084R9k.getErrorCode(), afS0S2201000_11.s0, afS0S2201000_11.i4, "voice", c69084R9k.getErrorMsg(), afS0S2201000_11.s1, null, null, null, null, C69093R9t.LJIJ((EnumC69113RAn) afS0S2201000_11.l3), 15872);
    }

    public static final void accept$3(AfS0S2201000_11 afS0S2201000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        Q13.LIZIZ("monitor_whatsapp_sms", 1, C69099R9z.LIZ(c69084R9k.getErrorCode(), afS0S2201000_11.i4, c69084R9k.getMessage(), "choose_dialog"));
        EnumC69113RAn enumC69113RAn = (EnumC69113RAn) afS0S2201000_11.l2;
        if (enumC69113RAn == EnumC69113RAn.INPUT_PHONE_SIGN_UP) {
            RC2.LIZ(Integer.valueOf(c69084R9k.getErrorCode()), ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJLLLLLLLZ(), "phone");
        } else if (enumC69113RAn == EnumC69113RAn.INPUT_PHONE_LOGIN) {
            C85649XjR.LIZ(false, ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJLLLLLLLZ(), null, 0, null, 28);
        }
        C68972R5c.LJIIJ(((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS0S2201000_11.l3).q9().LLZZ(), c69084R9k.getErrorCode(), afS0S2201000_11.s0, afS0S2201000_11.i4, "whatsapp", c69084R9k.getErrorMsg(), afS0S2201000_11.s1, null, null, null, null, C69093R9t.LJIJ((EnumC69113RAn) afS0S2201000_11.l2), 15872);
    }

    public static final void accept$4(AfS0S2201000_11 afS0S2201000_11, Object obj) {
        Q13.LIZIZ("monitor_whatsapp_sms", 0, C69099R9z.LIZ(0, afS0S2201000_11.i4, "", "choose_dialog"));
        C68972R5c.LJIIJ(((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LLZZ(), 0, afS0S2201000_11.s0, afS0S2201000_11.i4, "whatsapp", null, afS0S2201000_11.s1, null, null, null, null, C69093R9t.LJIJ((EnumC69113RAn) afS0S2201000_11.l3), 15872);
    }

    public static final void accept$5(AfS0S2201000_11 afS0S2201000_11, Object obj) {
        C69099R9z.LIZIZ(0, afS0S2201000_11.i4, 0, "", null);
        C68972R5c.LJIIJ(((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LLZZ(), 0, afS0S2201000_11.s0, afS0S2201000_11.i4, "text", null, afS0S2201000_11.s1, null, null, null, null, C69093R9t.LJIJ((EnumC69113RAn) afS0S2201000_11.l3), 15872);
    }

    public static final void accept$6(AfS0S2201000_11 afS0S2201000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C69084R9k c69084R9k = (C69084R9k) th;
        C69099R9z.LIZIZ(1, afS0S2201000_11.i4, c69084R9k.getErrorCode(), c69084R9k.getMessage(), null);
        C68972R5c.LJIIJ(((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS0S2201000_11.l2).q9().LLZZ(), c69084R9k.getErrorCode(), afS0S2201000_11.s0, afS0S2201000_11.i4, "text", c69084R9k.getErrorMsg(), afS0S2201000_11.s1, null, null, null, null, C69093R9t.LJIJ((EnumC69113RAn) afS0S2201000_11.l3), 15872);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S2201000_11(int r2, X.EnumC69113RAn r3, X.InterfaceC69056R8i r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 0: goto L2c;
                case 1: goto L20;
                case 2: goto L14;
                case 3: goto L5;
                case 4: goto L14;
                case 5: goto L14;
                case 6: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i4 = r2
            r0.l2 = r3
            r0.l3 = r4
            r0.s0 = r5
            r0.s1 = r6
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.i4 = r2
            r0.l2 = r4
            r0.s0 = r5
            r0.s1 = r6
            r0.l3 = r3
            goto L10
        L20:
            r0 = r1
            r0.i4 = r2
            r0.s0 = r5
            r0.l2 = r4
            r0.s1 = r6
            r0.l3 = r3
            goto L10
        L2c:
            r0 = r1
            r0.i4 = r2
            r0.s0 = r5
            r0.l2 = r3
            r0.l3 = r4
            r0.s1 = r6
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S2201000_11.<init>(int, X.RAn, X.R8i, java.lang.String, java.lang.String, int):void");
    }
}
