package com.bytedance.jedi.arch;

import X.InterfaceC61312at;

/* loaded from: classes13.dex */
public interface NestedState<SUB extends InterfaceC61312at> extends InterfaceC61312at {
    SUB getSubstate();

    NestedState<SUB> newSubstate(SUB sub);
}
