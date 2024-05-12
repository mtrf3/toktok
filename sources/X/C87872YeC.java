package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionClickInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionPlayInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.YeC, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87872YeC implements InterfaceC58538MyE {
    public final java.util.Map<String, SessionInfo> LIZIZ;

    public C87872YeC() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ads_");
        LIZ.append(C16880lQ.LJLLJ(C87872YeC.class));
        X1D.LIZIZ(LIZ);
        this.LIZIZ = new LinkedHashMap();
    }

    @Override // X.InterfaceC58538MyE
    public final synchronized SessionInfo LIZ(InterfaceC87880YeK interfaceC87880YeK) {
        SessionInfo sessionInfo = (SessionInfo) ((LinkedHashMap) this.LIZIZ).get(interfaceC87880YeK.LJIJI());
        if (!interfaceC87880YeK.LLILZLL()) {
            return sessionInfo;
        }
        SessionInfo LIZJ = LIZJ(sessionInfo, interfaceC87880YeK);
        if (LIZJ != null) {
            SessionInfo LIZLLL = LIZLLL(LIZJ, interfaceC87880YeK);
            if (LIZLLL != null) {
                sessionInfo = LIZLLL;
            }
        }
        return sessionInfo;
    }

    @Override // X.InterfaceC58538MyE
    public final synchronized SessionInfo LIZIZ(String str) {
        return (SessionInfo) ((LinkedHashMap) this.LIZIZ).get(str);
    }

    public static SessionInfo LIZJ(SessionInfo sessionInfo, InterfaceC87880YeK interfaceC87880YeK) {
        OSZ<? extends SessionInfo, ? extends SessionShowInfo> invoke;
        OSZ<? extends SessionInfo, ? extends SessionShowInfo> invoke2;
        SessionShowInfo LIZ;
        OSZ<? extends SessionInfo, ? extends SessionShowInfo> invoke3;
        OSZ<? extends SessionInfo, ? extends SessionShowInfo> invoke4;
        if (sessionInfo == null) {
            if (!(b.LJIIZILJ(interfaceC87880YeK.LJ()) instanceof K1B)) {
                return null;
            }
            return new SessionInfo(interfaceC87880YeK.LJLJJI(), null, interfaceC87880YeK.LJIJI(), 0, 10, null);
        }
        QXX LJIIZILJ = b.LJIIZILJ(interfaceC87880YeK.LJ());
        if (LJIIZILJ instanceof K1B) {
            return null;
        }
        if (LJIIZILJ instanceof K1D) {
            int i = sessionInfo.LIZIZ + 1;
            sessionInfo.LIZIZ = i;
            return SessionInfo.LIZ(sessionInfo, new SessionShowInfo(i, interfaceC87880YeK.getTimeStamp(), null, null, null, 0, 0, 0, 252, null), 13);
        }
        if (LJIIZILJ instanceof K17) {
            if (!((Boolean) C87873YeD.LIZ.invoke(sessionInfo)).booleanValue()) {
                return null;
            }
            return SessionInfo.LIZ(sessionInfo, null, 13);
        }
        if (LJIIZILJ instanceof K1C) {
            if (!((Boolean) C87873YeD.LIZ.invoke(sessionInfo)).booleanValue() || (invoke4 = C87873YeD.LJ.invoke(sessionInfo)) == null) {
                return null;
            }
            C87876YeG c87876YeG = C87873YeD.LJFF;
            SessionInfo first = invoke4.getFirst();
            SessionShowInfo second = invoke4.getSecond();
            int i2 = second.LIZ + 1;
            second.LIZ = i2;
            return (SessionInfo) c87876YeG.invoke(first, SessionShowInfo.LIZ(second, new SessionPlayInfo(i2, interfaceC87880YeK.getTimeStamp()), null, null, 251));
        }
        if (LJIIZILJ instanceof K18) {
            if (!((Boolean) C87873YeD.LIZ.invoke(sessionInfo)).booleanValue() || (invoke3 = C87873YeD.LJ.invoke(sessionInfo)) == null) {
                return null;
            }
            if (!((Boolean) C87873YeD.LIZIZ.invoke(invoke3.getSecond())).booleanValue()) {
                return null;
            }
            return (SessionInfo) C87873YeD.LJFF.invoke(invoke3.getFirst(), SessionShowInfo.LIZ(invoke3.getSecond(), null, null, null, 251));
        }
        if (LJIIZILJ instanceof K1A) {
            if (!((Boolean) C87873YeD.LIZ.invoke(sessionInfo)).booleanValue() || (invoke2 = C87873YeD.LJ.invoke(sessionInfo)) == null) {
                return null;
            }
            C87876YeG c87876YeG2 = C87873YeD.LJFF;
            SessionInfo first2 = invoke2.getFirst();
            SessionShowInfo second2 = invoke2.getSecond();
            if (o.LJ(interfaceC87880YeK.LJ(), "click")) {
                int i3 = second2.LIZIZ + 1;
                second2.LIZIZ = i3;
                LIZ = SessionShowInfo.LIZ(second2, null, new SessionClickInfo(i3, interfaceC87880YeK.getRefer(), interfaceC87880YeK.getTag(), interfaceC87880YeK.getTimeStamp()), null, 231);
            } else {
                int i4 = second2.LIZJ + 1;
                second2.LIZJ = i4;
                LIZ = SessionShowInfo.LIZ(second2, null, null, new SessionClickInfo(i4, interfaceC87880YeK.getRefer(), interfaceC87880YeK.getTag(), interfaceC87880YeK.getTimeStamp()), 231);
            }
            return (SessionInfo) c87876YeG2.invoke(first2, LIZ);
        }
        if (LJIIZILJ instanceof K19) {
            if (!((Boolean) C87873YeD.LIZ.invoke(sessionInfo)).booleanValue() || (invoke = C87873YeD.LJ.invoke(sessionInfo)) == null) {
                return null;
            }
            SessionShowInfo second3 = invoke.getSecond();
            if (!((Boolean) C87873YeD.LIZJ.invoke(second3)).booleanValue() && !((Boolean) C87873YeD.LIZLLL.invoke(second3)).booleanValue()) {
                return null;
            }
            return (SessionInfo) C87873YeD.LJFF.invoke(invoke.getFirst(), SessionShowInfo.LIZ(invoke.getSecond(), null, null, null, 231));
        }
        if (LJIIZILJ instanceof K16) {
            return null;
        }
        throw new C162476Zf();
    }

    public final SessionInfo LIZLLL(SessionInfo sessionInfo, InterfaceC87880YeK interfaceC87880YeK) {
        String LJIJI = interfaceC87880YeK.LJIJI();
        String LLIILII = b.LJIIZILJ(interfaceC87880YeK.LJ()).LLIILII();
        if (o.LJ(LLIILII, "session_event_type_generate")) {
            this.LIZIZ.put(LJIJI, sessionInfo);
            return sessionInfo;
        }
        if (o.LJ(LLIILII, "session_event_type_destroy")) {
            SessionInfo sessionInfo2 = (SessionInfo) ((LinkedHashMap) this.LIZIZ).get(LJIJI);
            this.LIZIZ.put(LJIJI, sessionInfo);
            return sessionInfo2;
        }
        return null;
    }
}
