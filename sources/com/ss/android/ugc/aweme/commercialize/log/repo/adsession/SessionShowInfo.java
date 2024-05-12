package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class SessionShowInfo {
    public transient int LIZ;
    public transient int LIZIZ;
    public transient int LIZJ;

    @InterfaceC65349Pkn("click_session")
    public final SessionClickInfo clickSession;

    @InterfaceC65349Pkn("id")
    public final int id;

    @InterfaceC65349Pkn("other_click_session")
    public final SessionClickInfo otherClickSession;

    @InterfaceC65349Pkn("play_session")
    public final SessionPlayInfo playSession;

    @InterfaceC65349Pkn("time_stamp")
    public final long timeStamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionShowInfo)) {
            return false;
        }
        SessionShowInfo sessionShowInfo = (SessionShowInfo) obj;
        return this.id == sessionShowInfo.id && this.timeStamp == sessionShowInfo.timeStamp && o.LJ(this.playSession, sessionShowInfo.playSession) && o.LJ(this.clickSession, sessionShowInfo.clickSession) && o.LJ(this.otherClickSession, sessionShowInfo.otherClickSession) && this.LIZ == sessionShowInfo.LIZ && this.LIZIZ == sessionShowInfo.LIZIZ && this.LIZJ == sessionShowInfo.LIZJ;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.timeStamp, this.id * 31, 31);
        SessionPlayInfo sessionPlayInfo = this.playSession;
        int i = 0;
        if (sessionPlayInfo == null) {
            hashCode = 0;
        } else {
            hashCode = sessionPlayInfo.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        SessionClickInfo sessionClickInfo = this.clickSession;
        if (sessionClickInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = sessionClickInfo.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        SessionClickInfo sessionClickInfo2 = this.otherClickSession;
        if (sessionClickInfo2 != null) {
            i = sessionClickInfo2.hashCode();
        }
        return ((((((i3 + i) * 31) + this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionShowInfo(id=");
        LIZ.append(this.id);
        LIZ.append(", timeStamp=");
        LIZ.append(this.timeStamp);
        LIZ.append(", playSession=");
        LIZ.append(this.playSession);
        LIZ.append(", clickSession=");
        LIZ.append(this.clickSession);
        LIZ.append(", otherClickSession=");
        LIZ.append(this.otherClickSession);
        LIZ.append(", playNumber=");
        LIZ.append(this.LIZ);
        LIZ.append(", clickNumber=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", otherClickNumber=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public static SessionShowInfo LIZ(SessionShowInfo sessionShowInfo, SessionPlayInfo sessionPlayInfo, SessionClickInfo sessionClickInfo, SessionClickInfo sessionClickInfo2, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        SessionClickInfo sessionClickInfo3 = sessionClickInfo2;
        SessionPlayInfo sessionPlayInfo2 = sessionPlayInfo;
        SessionClickInfo sessionClickInfo4 = sessionClickInfo;
        if ((i & 1) != 0) {
            i2 = sessionShowInfo.id;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            j = sessionShowInfo.timeStamp;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            sessionPlayInfo2 = sessionShowInfo.playSession;
        }
        if ((i & 8) != 0) {
            sessionClickInfo4 = sessionShowInfo.clickSession;
        }
        if ((i & 16) != 0) {
            sessionClickInfo3 = sessionShowInfo.otherClickSession;
        }
        if ((i & 32) != 0) {
            i3 = sessionShowInfo.LIZ;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            i4 = sessionShowInfo.LIZIZ;
        } else {
            i4 = 0;
        }
        if ((i & 128) != 0) {
            i5 = sessionShowInfo.LIZJ;
        } else {
            i5 = 0;
        }
        sessionShowInfo.getClass();
        return new SessionShowInfo(i2, j, sessionPlayInfo2, sessionClickInfo4, sessionClickInfo3, i3, i4, i5);
    }

    public SessionShowInfo(int i, long j, SessionPlayInfo sessionPlayInfo, SessionClickInfo sessionClickInfo, SessionClickInfo sessionClickInfo2, int i2, int i3, int i4) {
        this.id = i;
        this.timeStamp = j;
        this.playSession = sessionPlayInfo;
        this.clickSession = sessionClickInfo;
        this.otherClickSession = sessionClickInfo2;
        this.LIZ = i2;
        this.LIZIZ = i3;
        this.LIZJ = i4;
    }

    public /* synthetic */ SessionShowInfo(int i, long j, SessionPlayInfo sessionPlayInfo, SessionClickInfo sessionClickInfo, SessionClickInfo sessionClickInfo2, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, (i5 & 4) != 0 ? null : sessionPlayInfo, (i5 & 8) != 0 ? null : sessionClickInfo, (i5 & 16) == 0 ? sessionClickInfo2 : null, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4);
    }
}
