package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc;

import X.AbstractC26082ALm;
import X.C26092ALw;
import X.F9E;
import X.InterfaceC61312at;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CPCState extends F9E implements InterfaceC61312at {
    public final AbstractC26082ALm<CpcPromptResponse> task;

    /* JADX WARN: Multi-variable type inference failed */
    public CPCState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CPCState copy$default(CPCState cPCState, AbstractC26082ALm abstractC26082ALm, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC26082ALm = cPCState.task;
        }
        return cPCState.copy(abstractC26082ALm);
    }

    public final CPCState copy(AbstractC26082ALm<CpcPromptResponse> task) {
        o.LJIIIZ(task, "task");
        return new CPCState(task);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.task};
    }

    public final AbstractC26082ALm<CpcPromptResponse> getTask() {
        return this.task;
    }

    public CPCState(AbstractC26082ALm<CpcPromptResponse> task) {
        o.LJIIIZ(task, "task");
        this.task = task;
    }

    public /* synthetic */ CPCState(AbstractC26082ALm abstractC26082ALm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C26092ALw.LIZ : abstractC26082ALm);
    }
}
