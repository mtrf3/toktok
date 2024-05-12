package X;

import Y.ARunnableS50S0100000_14;
import com.bytedance.ies.actionai.jni.ActionAIExecutorType;
import com.bytedance.ies.actionai.jni.IExecutorDelegate;
import com.bytedance.ies.actionai.jni.IExecutorRunnable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.WoB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83395WoB extends IExecutorDelegate {
    public final String LIZ;
    public final ActionAIExecutorType LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 15));

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public final void start() {
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public final void release() {
        ActionAIExecutorType actionAIExecutorType = this.LIZIZ;
        if (actionAIExecutorType == ActionAIExecutorType.DEFAULT || actionAIExecutorType == ActionAIExecutorType.IO) {
            return;
        }
        ((ExecutorService) this.LIZJ.getValue()).shutdown();
    }

    @Override // com.bytedance.ies.actionai.jni.IExecutorDelegate
    public final void postRunnable(IExecutorRunnable iExecutorRunnable) {
        ((ExecutorService) this.LIZJ.getValue()).execute(new ARunnableS50S0100000_14(iExecutorRunnable, 2));
    }

    @Override // com.bytedance.ies.actionai.jni.ActionAIExecutor
    public final void release(boolean z) {
        ActionAIExecutorType actionAIExecutorType = this.LIZIZ;
        if (actionAIExecutorType == ActionAIExecutorType.DEFAULT || actionAIExecutorType == ActionAIExecutorType.IO) {
            return;
        }
        ((ExecutorService) this.LIZJ.getValue()).shutdown();
    }

    public C83395WoB(String str, ActionAIExecutorType actionAIExecutorType) {
        this.LIZ = str;
        this.LIZIZ = actionAIExecutorType;
    }
}
