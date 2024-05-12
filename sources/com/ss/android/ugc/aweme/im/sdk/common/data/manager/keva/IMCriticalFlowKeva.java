package com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva;

import X.C16880lQ;
import X.C3ON;
import X.C3OP;
import X.C48841JEv;
import X.C78580Usi;
import X.C78613UtF;
import X.C89523fI;
import X.InterfaceC65349Pkn;
import X.X1D;
import X.XKX;
import com.bytedance.keva.Keva;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMCriticalFlowKeva {
    public static final IMCriticalFlowKeva LIZ = new IMCriticalFlowKeva();
    public static Keva LIZIZ;
    public static Keva LIZJ;
    public static Keva LIZLLL;
    public static Keva LJ;

    public final synchronized Keva LIZ() {
        Keva keva;
        keva = LIZJ;
        if (keva == null) {
            keva = Keva.getRepo("chat_video_play_performance");
            LIZJ = keva;
            o.LJIIIIZZ(keva, "getRepo(CHAT_VIDEO_PLAY_…).also { awemeKeva = it }");
        }
        return keva;
    }

    public final synchronized Keva LIZJ() {
        Keva keva;
        keva = LIZIZ;
        if (keva == null) {
            keva = Keva.getRepo("critical_flow_repo");
            LIZIZ = keva;
            o.LJIIIIZZ(keva, "getRepo(KEVA_REPO).also { keva = it }");
        }
        return keva;
    }

    public final synchronized Keva LIZLLL() {
        Keva keva;
        keva = LIZLLL;
        if (keva == null) {
            keva = Keva.getRepo("enter_chat_performance");
            LIZLLL = keva;
            o.LJIIIIZZ(keva, "getRepo(ENTER_CHAT_PERFO…lso { chatRoomKeva = it }");
        }
        return keva;
    }

    public final synchronized Keva LJ() {
        Keva keva;
        keva = LJ;
        if (keva == null) {
            keva = Keva.getRepo("enter_report_page_performance");
            LJ = keva;
            o.LJIIIIZZ(keva, "getRepo(ENTER_REPORT_PAG…o { reportPageKeva = it }");
        }
        return keva;
    }

    /* loaded from: classes2.dex */
    public static final class ReportPageConfig {

        @InterfaceC65349Pkn("report_page_entrance")
        public final String entrance;

        @InterfaceC65349Pkn("report_page_clicked_timestamp")
        public final long timeStamp;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportPageConfig)) {
                return false;
            }
            ReportPageConfig reportPageConfig = (ReportPageConfig) obj;
            return this.timeStamp == reportPageConfig.timeStamp && o.LJ(this.entrance, reportPageConfig.entrance);
        }

        public final int hashCode() {
            return this.entrance.hashCode() + (C16880lQ.LLJIJIL(this.timeStamp) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ReportPageConfig(timeStamp=");
            LIZ.append(this.timeStamp);
            LIZ.append(", entrance=");
            return q.LIZIZ(LIZ, this.entrance, ')', LIZ);
        }

        public ReportPageConfig(long j, String entrance) {
            o.LJIIIZ(entrance, "entrance");
            this.timeStamp = j;
            this.entrance = entrance;
        }
    }

    public static long LIZIZ(String conversationId) {
        Keva LIZLLL2 = LIZ.LIZLLL();
        o.LJIIIZ(conversationId, "conversationId");
        if (((Boolean) C89523fI.LIZ.getValue()).booleanValue() || conversationId.length() == 0) {
            return -1L;
        }
        long j = LIZLLL2.getLong(conversationId, -1L);
        LIZLLL2.clear();
        return j;
    }

    public static long LJFF(String str) {
        Keva LIZJ2 = LIZ.LIZJ();
        long LIZIZ2 = C78580Usi.LIZIZ("share_head_show_performance", str, LIZJ2, -1L);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("share_head_show_performance");
        LIZ2.append(str);
        LIZJ2.erase(X1D.LIZIZ(LIZ2));
        return LIZIZ2;
    }

    public static void LJI(String conversationId) {
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIZ(conversationId, "conversationId");
        if (((Boolean) C89523fI.LIZ.getValue()).booleanValue()) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3ON(currentTimeMillis, conversationId, null), 3);
    }

    public static void LJII(String aid) {
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIZ(aid, "aid");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OP(currentTimeMillis, aid, null), 3);
    }

    public static void LJIIIIZZ(String aid, int i) {
        Keva LIZ2 = LIZ.LIZ();
        o.LJIIIZ(aid, "aid");
        String LLLZ = C16880lQ.LLLZ("tag_type_%s", Arrays.copyOf(new Object[]{aid}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        LIZ2.storeInt(LLLZ, i);
    }
}
