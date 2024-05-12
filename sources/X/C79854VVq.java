package X;

import Y.ARunnableS15S0101000_11;
import com.bytedance.ies.actionai.jni.IExecutorDelegate;
import com.bytedance.ies.actionai.jni.IExecutorRunnable;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.VVq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79854VVq extends IExecutorDelegate {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C79853VVp.LJLIL);

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public final void start() {
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public final void release() {
        ((ThreadPoolExecutor) this.LIZ.getValue()).shutdown();
    }

    @Override // com.bytedance.ies.actionai.jni.IExecutorDelegate
    public final void postRunnable(IExecutorRunnable iExecutorRunnable) {
        ((ThreadPoolExecutor) this.LIZ.getValue()).execute(new ARunnableS15S0101000_11(3, iExecutorRunnable, 9));
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public final void release(boolean z) {
        ((ThreadPoolExecutor) this.LIZ.getValue()).shutdown();
    }
}
