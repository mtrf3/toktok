package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui;

import X.C7MY;
import X.C8VR;
import X.C8XO;
import X.C97N;
import X.InterfaceC49014JLm;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AggregatedVideoRootAssme extends ReusedUISlotAssem<AggregatedVideoRootAssme> implements C8XO<InterfaceC49014JLm> {
    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.chp;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AggregatedVideoRootAssme() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final void F0(InterfaceC49014JLm item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49014JLm interfaceC49014JLm) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View findViewById;
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(view, "view");
        C97N.LIZ.getClass();
        if (C97N.LIZ() && (findViewById = view.findViewById(R.id.j7m)) != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = C7MY.LIZIZ(278);
        }
        C8VR.LIZ(this, new AqS139S0200000_8(this, view, 16));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49014JLm interfaceC49014JLm) {
    }
}
