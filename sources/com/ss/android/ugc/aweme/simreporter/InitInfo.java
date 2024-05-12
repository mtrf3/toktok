package com.ss.android.ugc.aweme.simreporter;

import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InitInfo {
    public String uid = "";
    public String playerName = "tiktok-ttplayer";
    public String playerVersion = "";

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InitInfo(uid='");
        LIZ.append(this.uid);
        LIZ.append("', playerName='");
        LIZ.append(this.playerName);
        LIZ.append("', playerVersion='");
        return JBR.LJFF(LIZ, this.playerVersion, "')", LIZ);
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String getPlayerVersion() {
        return this.playerVersion;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setPlayerName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.playerName = str;
    }

    public final void setPlayerVersion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.playerVersion = str;
    }

    public final void setUid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uid = str;
    }
}
