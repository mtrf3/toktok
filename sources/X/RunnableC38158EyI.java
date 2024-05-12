package X;

import android.text.TextUtils;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EyI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38158EyI implements Runnable {
    public final /* synthetic */ C38159EyJ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C17230lz LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public RunnableC38158EyI(C38159EyJ c38159EyJ, String str, C17230lz c17230lz, int i, String str2, long j) {
        this.LJLIL = c38159EyJ;
        this.LJLILLLLZI = str;
        this.LJLJI = c17230lz;
        this.LJLJJI = i;
        this.LJLJJL = str2;
        this.LJLJJLL = j;
    }

    public final void LIZ() {
        long j;
        List<TimeLineEvent> list;
        VNS vns = (VNS) this.LJLIL.LIZ.LIZ();
        if (vns == null || TextUtils.isEmpty(this.LJLILLLLZI)) {
            return;
        }
        C17230lz c17230lz = this.LJLJI;
        if (c17230lz != null && (list = (List) c17230lz.LIZJ) != null) {
            j = 0;
            for (TimeLineEvent timeLineEvent : list) {
                if (timeLineEvent != null && o.LJ("label_create_java_call", timeLineEvent.getLabel())) {
                    j = timeLineEvent.getElapsedTimestamp();
                }
            }
        } else {
            j = 0;
        }
        C38162EyM c38162EyM = new C38162EyM();
        String str = this.LJLILLLLZI;
        int i = this.LJLJJI;
        String str2 = this.LJLJJL;
        long j2 = this.LJLJJLL;
        c38162EyM.LJLILLLLZI = str;
        c38162EyM.LJLJI = C38159EyJ.LIZLLL(i);
        c38162EyM.LJLJJI = str2;
        c38162EyM.LJLJJLL = j;
        if (j != 0) {
            c38162EyM.LJLJL = j2;
            c38162EyM.LJLJJL = j2 - j;
        }
        UHB uhb = LynxViewMonitor.Companion;
        uhb.getClass();
        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
        lynxViewMonitor.reportJsbInfo(vns, c38162EyM);
        C38164EyO c38164EyO = new C38164EyO();
        String str3 = this.LJLILLLLZI;
        int i2 = this.LJLJJI;
        String str4 = this.LJLJJL;
        c38164EyO.LJLJJI = str3;
        c38164EyO.LJLILLLLZI = C38159EyJ.LIZLLL(i2);
        c38164EyO.LJLJI = str4;
        uhb.getClass();
        lynxViewMonitor.reportJsbError(vns, c38164EyO);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
