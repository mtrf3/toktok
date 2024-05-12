package com.google.android.play.core.assetpacks;

import X.C40654FxS;
import X.InterfaceC153055zZ;
import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes7.dex */
public final class o2 implements InterfaceC153055zZ<Object> {
    public final InterfaceC153055zZ<i2> LJLIL;
    public final InterfaceC153055zZ<Context> LJLILLLLZI;

    public o2(InterfaceC153055zZ interfaceC153055zZ, p2 p2Var) {
        this.LJLIL = interfaceC153055zZ;
        this.LJLILLLLZI = p2Var;
    }

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        i2 a = this.LJLIL.a();
        Context a2 = ((p2) this.LJLILLLLZI).a();
        C40654FxS.LJFF(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        C40654FxS.LJFF(a2.getPackageManager(), new ComponentName(a2.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        C40654FxS.LJI(a);
        return a;
    }
}
