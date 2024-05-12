package com.lynx.jsbridge;

import X.VNU;

/* loaded from: classes7.dex */
public class LynxContextModule extends LynxModule {
    public VNU mLynxContext;

    @Override // com.lynx.jsbridge.LynxModule
    public void destroy() {
        super.destroy();
    }

    public LynxContextModule(VNU vnu) {
        super(vnu);
        this.mLynxContext = vnu;
    }

    public LynxContextModule(VNU vnu, Object obj) {
        super(vnu, obj);
        this.mLynxContext = vnu;
    }
}
