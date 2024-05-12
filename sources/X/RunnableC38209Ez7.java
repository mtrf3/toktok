package X;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.List;

/* renamed from: X.Ez7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38209Ez7 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C17230lz LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ C38211Ez9 LJLJJLL;

    public final void LIZ() {
        long j;
        List<TimeLineEvent> list;
        WebView webView = this.LJLJJLL.LIZ.get();
        if (webView == null || TextUtils.isEmpty(this.LJLIL)) {
            return;
        }
        C17230lz c17230lz = this.LJLILLLLZI;
        if (c17230lz != null && (list = (List) c17230lz.LIZJ) != null) {
            for (TimeLineEvent timeLineEvent : list) {
                if (timeLineEvent != null && "label_create_java_call".equals(timeLineEvent.getLabel())) {
                    j = timeLineEvent.getElapsedTimestamp();
                    break;
                }
            }
        }
        j = 0;
        new C38100ExM();
        C38211Ez9 c38211Ez9 = this.LJLJJLL;
        int i = this.LJLJI;
        c38211Ez9.getClass();
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        C38222EzK c38222EzK = C38222EzK.LJFF;
        c38222EzK.LIZLLL(webView);
        new C38102ExO();
        C38211Ez9 c38211Ez92 = this.LJLJJLL;
        int i3 = this.LJLJI;
        c38211Ez92.getClass();
        c38222EzK.LIZJ(webView);
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

    public RunnableC38209Ez7(C38211Ez9 c38211Ez9, String str, C17230lz c17230lz, int i, String str2, long j) {
        this.LJLJJLL = c38211Ez9;
        this.LJLIL = str;
        this.LJLILLLLZI = c17230lz;
        this.LJLJI = i;
        this.LJLJJI = str2;
        this.LJLJJL = j;
    }
}
