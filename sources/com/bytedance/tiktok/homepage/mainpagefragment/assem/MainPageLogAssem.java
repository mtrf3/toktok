package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.AbstractC48820JEa;
import X.C221108m2;
import X.C54055LJj;
import X.C5H3;
import X.EnumC221088m0;
import X.X1D;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainPageLogAssem extends BaseMainPageFragmentUIAssem {
    public final C5H3 LJLIL;

    public MainPageLogAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZ(EnumC221088m0.NONE, C54055LJj.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((AbstractC48820JEa) this.LJLIL.getValue()).LJIIIIZZ("onDestroy");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void LLZILL(View container) {
        o.LJIIIZ(container, "container");
        ((AbstractC48820JEa) this.LJLIL.getValue()).LJIIIIZZ("[onFragmentViewCreated]");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem, X.InterfaceC54059LJn
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LJLIL.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onTabChanged], ");
        LIZ.append(str);
        LIZ.append(',');
        LIZ.append(str2);
        LIZ.append(',');
        LIZ.append(z);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }
}
