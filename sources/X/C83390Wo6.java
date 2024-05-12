package X;

import com.bytedance.ies.actionai.jni.ActionAIExecutor;
import com.bytedance.ies.actionai.jni.ActionAIExecutorType;
import com.bytedance.ies.actionai.jni.IActionAIExecutorCreator;

/* renamed from: X.Wo6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83390Wo6 extends IActionAIExecutorCreator {
    public static final C83390Wo6 LIZ = new C83390Wo6();

    @Override // com.bytedance.ies.actionai.jni.IActionAIExecutorCreator
    public final ActionAIExecutor createExecutor(String str, ActionAIExecutorType actionAIExecutorType) {
        return new C83395WoB(str, actionAIExecutorType);
    }
}
