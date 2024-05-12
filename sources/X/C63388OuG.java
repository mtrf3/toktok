package X;

import com.bytedance.im.core.repair.completeness.IMCompletenessConfiguration;
import djb.IDaS25S0000000_10;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.OuG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63388OuG {
    /* JADX WARN: Type inference failed for: r0v7, types: [X.4ea] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.4ea] */
    public static C63383OuB LIZ() {
        C63402OuU c63402OuU = C63402OuU.LJLIL;
        C63589OxV c63589OxV = new C63589OxV(C63401OuT.LJLIL, c63402OuU, new C63583OxP(), new C78565UsT());
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()).plus(new IDaS25S0000000_10(CoroutineExceptionHandler.LJJJJIZL, 0)));
        C63205OrJ c63205OrJ = new C63205OrJ(0);
        C63630OyA c63630OyA = new C63630OyA(c63589OxV, LIZ);
        C63363Otr c63363Otr = new C63363Otr(c63589OxV, c63205OrJ, c63630OyA, LIZ);
        C63521OwP LIZIZ = C63521OwP.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "inst()");
        C63366Otu c63366Otu = new C63366Otu();
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "inst()");
        C63385OuD c63385OuD = new C63385OuD(c63366Otu, LIZLLL, C96073pr.LJLIL, c63363Otr, c63205OrJ, c63630OyA, LIZ);
        C63309Osz LIZLLL2 = C63309Osz.LIZLLL();
        o.LJIIIIZZ(LIZLLL2, "inst()");
        int i = 0;
        return new C63383OuB(c63402OuU, c63589OxV, LIZIZ, c63385OuD, new C63408Oua(LIZLLL2), c63205OrJ, c63363Otr, new C63364Ots(c63589OxV), c63630OyA, new C63560Ox2(c63589OxV), new C63389OuH(new C63651OyV(c63589OxV), new InterfaceC63409Oub(i) { // from class: X.4ea
            public final InterfaceC65784Pro<C63291Osh> LIZ;
            public final InterfaceC65784Pro<IMCompletenessConfiguration> LIZIZ;
            public final InterfaceC65784Pro<Long> LIZJ;

            @Override // X.InterfaceC63409Oub
            public final void LIZ() {
                C63291Osh invoke = this.LIZ.invoke();
                long longValue = this.LIZJ.invoke().longValue();
                invoke.getClass();
                C63291Osh.LIZLLL.LIZIZ(Long.valueOf(longValue), "key_last_message_check_time");
            }

            @Override // X.InterfaceC63409Oub
            public final boolean LIZJ() {
                if (!this.LIZIZ.invoke().isMessageCheckEnabled()) {
                    return false;
                }
                this.LIZ.invoke().getClass();
                long LIZLLL3 = C63291Osh.LIZLLL.LIZLLL(0L, "key_last_message_check_time");
                if (LIZLLL3 <= 0) {
                    return true;
                }
                if (this.LIZJ.invoke().longValue() - LIZLLL3 <= r8.getMessageCheckInterval() * 1000) {
                    return false;
                }
                return true;
            }

            {
                C114584ec getSpUtils = C114584ec.LJLIL;
                C114554eZ getConfiguration = C114554eZ.LJLIL;
                C114574eb getCurrentTimeInMs = C114574eb.LJLIL;
                o.LJIIIZ(getSpUtils, "getSpUtils");
                o.LJIIIZ(getConfiguration, "getConfiguration");
                o.LJIIIZ(getCurrentTimeInMs, "getCurrentTimeInMs");
                this.LIZ = getSpUtils;
                this.LIZIZ = getConfiguration;
                this.LIZJ = getCurrentTimeInMs;
            }

            @Override // X.InterfaceC63409Oub
            public final boolean LIZIZ(int i2) {
                if (!this.LIZIZ.invoke().isConversationCheckEnabled()) {
                    return false;
                }
                C63291Osh invoke = this.LIZ.invoke();
                InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
                invoke.getClass();
                long LIZLLL3 = interfaceC63293Osj.LIZLLL(0L, C63291Osh.LJIIIIZZ(i2, "key_last_conversation_check_time"));
                if (LIZLLL3 <= 0) {
                    return true;
                }
                if (this.LIZJ.invoke().longValue() - LIZLLL3 <= r8.getConversationCheckInterval() * 1000) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC63409Oub
            public final void LIZLLL(int i2) {
                C63291Osh invoke = this.LIZ.invoke();
                long longValue = this.LIZJ.invoke().longValue();
                InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
                invoke.getClass();
                interfaceC63293Osj.LIZIZ(Long.valueOf(longValue), C63291Osh.LJIIIIZZ(i2, "key_last_conversation_check_time"));
            }
        }), new C63410Ouc(new C63650OyU(c63589OxV), new InterfaceC63409Oub(i) { // from class: X.4ea
            public final InterfaceC65784Pro<C63291Osh> LIZ;
            public final InterfaceC65784Pro<IMCompletenessConfiguration> LIZIZ;
            public final InterfaceC65784Pro<Long> LIZJ;

            @Override // X.InterfaceC63409Oub
            public final void LIZ() {
                C63291Osh invoke = this.LIZ.invoke();
                long longValue = this.LIZJ.invoke().longValue();
                invoke.getClass();
                C63291Osh.LIZLLL.LIZIZ(Long.valueOf(longValue), "key_last_message_check_time");
            }

            @Override // X.InterfaceC63409Oub
            public final boolean LIZJ() {
                if (!this.LIZIZ.invoke().isMessageCheckEnabled()) {
                    return false;
                }
                this.LIZ.invoke().getClass();
                long LIZLLL3 = C63291Osh.LIZLLL.LIZLLL(0L, "key_last_message_check_time");
                if (LIZLLL3 <= 0) {
                    return true;
                }
                if (this.LIZJ.invoke().longValue() - LIZLLL3 <= r8.getMessageCheckInterval() * 1000) {
                    return false;
                }
                return true;
            }

            {
                C114584ec getSpUtils = C114584ec.LJLIL;
                C114554eZ getConfiguration = C114554eZ.LJLIL;
                C114574eb getCurrentTimeInMs = C114574eb.LJLIL;
                o.LJIIIZ(getSpUtils, "getSpUtils");
                o.LJIIIZ(getConfiguration, "getConfiguration");
                o.LJIIIZ(getCurrentTimeInMs, "getCurrentTimeInMs");
                this.LIZ = getSpUtils;
                this.LIZIZ = getConfiguration;
                this.LIZJ = getCurrentTimeInMs;
            }

            @Override // X.InterfaceC63409Oub
            public final boolean LIZIZ(int i2) {
                if (!this.LIZIZ.invoke().isConversationCheckEnabled()) {
                    return false;
                }
                C63291Osh invoke = this.LIZ.invoke();
                InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
                invoke.getClass();
                long LIZLLL3 = interfaceC63293Osj.LIZLLL(0L, C63291Osh.LJIIIIZZ(i2, "key_last_conversation_check_time"));
                if (LIZLLL3 <= 0) {
                    return true;
                }
                if (this.LIZJ.invoke().longValue() - LIZLLL3 <= r8.getConversationCheckInterval() * 1000) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC63409Oub
            public final void LIZLLL(int i2) {
                C63291Osh invoke = this.LIZ.invoke();
                long longValue = this.LIZJ.invoke().longValue();
                InterfaceC63293Osj interfaceC63293Osj = C63291Osh.LIZLLL;
                invoke.getClass();
                interfaceC63293Osj.LIZIZ(Long.valueOf(longValue), C63291Osh.LJIIIIZZ(i2, "key_last_conversation_check_time"));
            }
        }), LIZ);
    }
}
