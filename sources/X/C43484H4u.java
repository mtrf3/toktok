package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.H4u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43484H4u {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;
    public final H58 LJ;
    public final ConcurrentLinkedQueue<String> LJFF;
    public final int LJI;
    public C73411SrX LJII;
    public long LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public volatile boolean LJIIJJI;

    public final void LIZ(H52 resultState) {
        o.LJIIIZ(resultState, "resultState");
        if (this.LJI <= 0) {
            return;
        }
        this.LJIIJJI = true;
        C73411SrX c73411SrX = this.LJII;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LJII;
            o.LJI(c73411SrX2);
            c73411SrX2.dispose();
        }
        LIZIZ(resultState);
    }

    public final void LIZIZ(H52 h52) {
        String str;
        String str2;
        C145995oB LIZIZ = GFJ.LIZIZ(1, "mob_lost_assist");
        LIZIZ.LJI("shoot_way", this.LIZIZ);
        LIZIZ.LJI("content_type", this.LJIIJ);
        LIZIZ.LIZIZ(SystemClock.uptimeMillis() - this.LJIIIIZZ, "mob_lost_gap");
        LIZIZ.LIZ(20001, "status");
        LIZIZ.LIZJ(h52, "upload_is_success");
        String str3 = "1";
        if (this.LIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJI("retry_publish", str);
        this.LJ.LIZIZ();
        LIZIZ.LJI("is_synthetic_success", CardStruct.IStatusCode.DEFAULT);
        this.LJ.LIZ();
        LIZIZ.LIZ(-1, "synthetic_error_code");
        LIZIZ.LIZ(32, "publish_step");
        if (this.LIZLLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJI("is_click_publish", str2);
        if (!C47918IrK.LIZ(C60903NvH.LJ)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJI("network_available", str3);
        ArrayList arrayList = new ArrayList(this.LJFF);
        this.LJFF.clear();
        Iterator it = arrayList.iterator();
        String str4 = "";
        String str5 = "";
        while (it.hasNext()) {
            str5 = a1.LJ(str5, " | ", (String) it.next());
        }
        LIZIZ.LJI("upload_error_msg", str5);
        String str6 = this.LJIIIZ;
        if (str6 != null) {
            str4 = str6;
        }
        LIZIZ.LJI("creation_id", str4);
        LIZIZ.LJI("publish_id", this.LIZ);
        FMX.LJIIL("parallel_publish_result", LIZIZ.LIZ);
    }

    public C43484H4u(String publishId, String shootWay, boolean z, boolean z2, H56 h56) {
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(shootWay, "shootWay");
        this.LIZ = publishId;
        this.LIZIZ = shootWay;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = h56;
        this.LJFF = new ConcurrentLinkedQueue<>();
        this.LJI = C00F.LIZ(31744, -1, "upload_status_report_gap_s", true);
        this.LJIIIIZZ = -1L;
    }
}
