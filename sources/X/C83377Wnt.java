package X;

import com.bytedance.ies.actionai.jni.ActionAIExecutorCreatorWrapper;
import com.bytedance.ies.actionai.jni.ActionAILogger;
import com.bytedance.ies.actionai.jni.ActionAILoggerListener;
import com.bytedance.ies.actionai.jni.ActionAIMonitor;
import com.bytedance.ies.actionai.jni.ActionAINetworkClientDelegateWrapper;
import com.bytedance.ies.actionai.jni.IActionAIExecutorCreator;
import com.bytedance.ies.actionai.jni.IActionAIHTTPClientDelegateWrapper;
import com.bytedance.ies.actionai.jni.IActionAIMonitorDelegate;
import com.bytedance.ies.actionai.jni.LogLevel;
import com.ss.android.ugc.aweme.actionai.net.ActionAINetworkClient;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wnt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83377Wnt {
    public static boolean LIZJ;
    public static ActionAILoggerListener LIZLLL;
    public static IActionAIHTTPClientDelegateWrapper LJFF;
    public static IActionAIExecutorCreator LJI;
    public static IActionAIMonitorDelegate LJII;
    public static final C83377Wnt LIZ = new C83377Wnt();
    public static InterfaceC120694oT LIZIZ = new InterfaceC120694oT() { // from class: X.4oS
        @Override // X.InterfaceC120694oT
        public final boolean LIZ(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                C16880lQ.LLJJJIL(it.next());
            }
            return true;
        }
    };
    public static LogLevel LJ = LogLevel.LEVEL_DEBUG;

    public final synchronized void LIZ() {
        LIZIZ.LIZ(C47261Igj.LJJIJ("ActionAIJni"));
        if (!LIZJ) {
            ActionAILoggerListener actionAILoggerListener = LIZLLL;
            if (actionAILoggerListener != null) {
                ActionAILogger.obtain().setDelegate(actionAILoggerListener);
            }
            ActionAILogger.obtain().setLogLevel(LJ);
            IActionAIHTTPClientDelegateWrapper iActionAIHTTPClientDelegateWrapper = LJFF;
            if (iActionAIHTTPClientDelegateWrapper != null) {
                ActionAINetworkClientDelegateWrapper.setHttpClientWrapper(iActionAIHTTPClientDelegateWrapper);
            }
            IActionAIExecutorCreator iActionAIExecutorCreator = LJI;
            if (iActionAIExecutorCreator == null) {
                C83389Wo5 c83389Wo5 = new C83389Wo5();
                LIZIZ(c83389Wo5);
                ActionAIExecutorCreatorWrapper.setDefaultActionExecutorCreator(c83389Wo5);
            } else {
                ActionAIExecutorCreatorWrapper.setDefaultActionExecutorCreator(iActionAIExecutorCreator);
            }
            IActionAIMonitorDelegate iActionAIMonitorDelegate = LJII;
            if (iActionAIMonitorDelegate != null) {
                ActionAIMonitor.obtain().setListener(iActionAIMonitorDelegate);
            }
        }
        LIZJ = true;
    }

    public final void LIZIZ(IActionAIExecutorCreator iActionAIExecutorCreator) {
        synchronized (this) {
            LJI = iActionAIExecutorCreator;
            if (LIZJ) {
                ActionAIExecutorCreatorWrapper.setDefaultActionExecutorCreator(iActionAIExecutorCreator);
            }
        }
    }

    public final void LIZJ(ActionAINetworkClient actionAINetworkClient) {
        synchronized (this) {
            LJFF = actionAINetworkClient;
            if (LIZJ) {
                ActionAINetworkClientDelegateWrapper.setHttpClientWrapper(actionAINetworkClient);
            }
        }
    }
}
