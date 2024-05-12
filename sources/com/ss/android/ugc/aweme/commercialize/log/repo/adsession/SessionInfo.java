package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SessionInfo {
    public final transient String LIZ;
    public transient int LIZIZ;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    @InterfaceC65349Pkn("show_session")
    public final SessionShowInfo showSession;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return o.LJ(this.sessionId, sessionInfo.sessionId) && o.LJ(this.showSession, sessionInfo.showSession) && o.LJ(this.LIZ, sessionInfo.LIZ) && this.LIZIZ == sessionInfo.LIZIZ;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.sessionId.hashCode() * 31;
        SessionShowInfo sessionShowInfo = this.showSession;
        if (sessionShowInfo == null) {
            hashCode = 0;
        } else {
            hashCode = sessionShowInfo.hashCode();
        }
        return C79062V1e.LJ(this.LIZ, (hashCode2 + hashCode) * 31, 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionInfo(sessionId=");
        LIZ.append(this.sessionId);
        LIZ.append(", showSession=");
        LIZ.append(this.showSession);
        LIZ.append(", cid=");
        LIZ.append(this.LIZ);
        LIZ.append(", showNumber=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public static SessionInfo LIZ(SessionInfo sessionInfo, SessionShowInfo sessionShowInfo, int i) {
        String sessionId;
        int i2;
        String cid = null;
        if ((i & 1) != 0) {
            sessionId = sessionInfo.sessionId;
        } else {
            sessionId = null;
        }
        if ((i & 2) != 0) {
            sessionShowInfo = sessionInfo.showSession;
        }
        if ((i & 4) != 0) {
            cid = sessionInfo.LIZ;
        }
        if ((i & 8) != 0) {
            i2 = sessionInfo.LIZIZ;
        } else {
            i2 = 0;
        }
        sessionInfo.getClass();
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(cid, "cid");
        return new SessionInfo(sessionId, sessionShowInfo, cid, i2);
    }

    public SessionInfo(String sessionId, SessionShowInfo sessionShowInfo, String cid, int i) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(cid, "cid");
        this.sessionId = sessionId;
        this.showSession = sessionShowInfo;
        this.LIZ = cid;
        this.LIZIZ = i;
    }

    public /* synthetic */ SessionInfo(String str, SessionShowInfo sessionShowInfo, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : sessionShowInfo, str2, (i2 & 8) != 0 ? 0 : i);
    }
}
