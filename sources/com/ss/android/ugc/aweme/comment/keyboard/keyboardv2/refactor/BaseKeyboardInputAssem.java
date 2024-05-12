package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C55096Ljo;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class BaseKeyboardInputAssem extends UISlotAssem implements IKeyboardInputPanelAssemAbility {
    public BaseKeyboardInputAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }
}
