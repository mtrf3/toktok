package com.ss.android.ugc.aweme.modeo.ttep.moderation;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PMFaceVideo {

    @InterfaceC65349Pkn("idle")
    public final List<String> idle;

    @InterfaceC65349Pkn("nodding")
    public final List<String> nodding;

    @InterfaceC65349Pkn("openmouth")
    public final List<String> openMouth;

    @InterfaceC65349Pkn("raiseeyebrows")
    public final List<String> raiseEyeBrows;

    @InterfaceC65349Pkn("turnhead")
    public final List<String> turnHead;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PMFaceVideo)) {
            return false;
        }
        PMFaceVideo pMFaceVideo = (PMFaceVideo) obj;
        return o.LJ(this.idle, pMFaceVideo.idle) && o.LJ(this.nodding, pMFaceVideo.nodding) && o.LJ(this.openMouth, pMFaceVideo.openMouth) && o.LJ(this.raiseEyeBrows, pMFaceVideo.raiseEyeBrows) && o.LJ(this.turnHead, pMFaceVideo.turnHead);
    }

    public final int hashCode() {
        List<String> list = this.idle;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.nodding;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.openMouth;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.raiseEyeBrows;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.turnHead;
        return hashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PMFaceVideo(idle=");
        LIZ.append(this.idle);
        LIZ.append(", nodding=");
        LIZ.append(this.nodding);
        LIZ.append(", openMouth=");
        LIZ.append(this.openMouth);
        LIZ.append(", raiseEyeBrows=");
        LIZ.append(this.raiseEyeBrows);
        LIZ.append(", turnHead=");
        return C1NE.LIZIZ(LIZ, this.turnHead, ')', LIZ);
    }

    public PMFaceVideo(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.idle = list;
        this.nodding = list2;
        this.openMouth = list3;
        this.raiseEyeBrows = list4;
        this.turnHead = list5;
    }
}
