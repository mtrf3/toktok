package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui;

import X.C16880lQ;
import X.C8XO;
import X.InterfaceC49014JLm;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AggregatedVideoInteractAssem extends ReusedUIContentAssem<AggregatedVideoInteractAssem> implements C8XO<InterfaceC49014JLm> {
    public InterfaceC49014JLm LJZL;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AggregatedVideoInteractAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49014JLm interfaceC49014JLm) {
        InterfaceC49014JLm item = interfaceC49014JLm;
        o.LJIIIZ(item, "item");
        this.LJZL = item;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49014JLm interfaceC49014JLm) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 43), view);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49014JLm interfaceC49014JLm) {
    }
}
