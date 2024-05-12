package X;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.List;

/* renamed from: X.Ez8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38210Ez8 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C17230lz LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C38211Ez9 LJLJJI;

    public final void LIZ() {
        long j;
        List<TimeLineEvent> list;
        WebView webView = this.LJLJJI.LIZ.get();
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
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        C38222EzK.LJFF.LIZLLL(webView);
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

    public RunnableC38210Ez8(C38211Ez9 c38211Ez9, String str, C17230lz c17230lz, long j) {
        this.LJLJJI = c38211Ez9;
        this.LJLIL = str;
        this.LJLILLLLZI = c17230lz;
        this.LJLJI = j;
    }
}
