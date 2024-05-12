package X;

import Y.AObjectS89S0100000_14;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ActionExecutor;
import com.bytedance.ies.actionai.jni.ActionModel;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WoX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83417WoX extends ActionExecutor {
    public final LifecycleOwner LIZ;
    public final AbstractC82626Wbm<InterfaceC83402WoI> LIZIZ;
    public XKQ LIZJ;
    public ExecutionContext LIZLLL;
    public final C62822Ol8 LJ;
    public AObjectS89S0100000_14 LJFF;

    public abstract String LIZ();

    public abstract EnumC83408WoO LIZIZ();

    public abstract C83467WpL<String, String> LIZJ();

    public abstract C83427Woh<?> LIZLLL();

    @Override // com.bytedance.ies.actionai.jni.ActionExecutor
    public final ActionModel getActionModel() {
        ActionModel actionModel = new ActionModel();
        actionModel.setName(LIZ());
        actionModel.setPriority(LIZIZ().getPriority());
        return actionModel;
    }

    public AbstractC83417WoX(LifecycleOwner lifecycleOwner, Context context, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = lifecycleOwner;
        this.LIZIZ = diContainer.LJIIIZ(null, InterfaceC83402WoI.class);
        this.LJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 357));
    }

    @Override // com.bytedance.ies.actionai.jni.ActionExecutor
    public final void execute(ExecutionContext executionContext, String str, ActionExecuteCallback actionExecuteCallback) {
        String str2;
        InterfaceC83402WoI LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Call action execute: ");
        LIZ.append(this);
        LIZ.append("  ");
        if (executionContext != null) {
            str2 = executionContext.getMessageId();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        XKQ xkq = this.LIZJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        AbstractC82626Wbm<InterfaceC83402WoI> abstractC82626Wbm = this.LIZIZ;
        if (abstractC82626Wbm != null && (LIZIZ = abstractC82626Wbm.LIZIZ()) != null) {
            LIZIZ.eO(new C83361Wnd(EnumC83360Wnc.START_EXECUTE, -1));
        }
        this.LIZLLL = executionContext;
        this.LIZJ = XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C83419WoZ(this, executionContext, actionExecuteCallback, str, null), 3);
    }
}
