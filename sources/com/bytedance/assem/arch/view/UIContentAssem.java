package com.bytedance.assem.arch.view;

import X.X1D;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;

/* loaded from: classes4.dex */
public abstract class UIContentAssem extends UIAssem {
    public int contentLayoutId;

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onCreateView() {
        View view;
        if (isContainerViewAssigned()) {
            handleOnViewCreated(getContainerView());
            return;
        }
        if (this.contentLayoutId != 0 && (view = getSupervisor().LJLLL) != null) {
            View findViewById = view.findViewById(this.contentLayoutId);
            if (findViewById != null) {
                setContainerView(findViewById);
                handleOnViewCreated(findViewById);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("can not find view for ");
            LIZ.append(this);
            LIZ.append(", id ");
            LIZ.append(this.contentLayoutId);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalStateException(LIZIZ);
        }
    }
}
