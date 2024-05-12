package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C221108m2;
import X.C2W6;
import X.C49339JXz;
import X.C62822Ol8;
import X.C8XO;
import X.InterfaceC49025JLx;
import X.InterfaceC65784Pro;
import X.JY0;
import X.JY1;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchCardFeedbackAssem<T extends InterfaceC49025JLx> extends ReusedUIContentAssem<SearchCardFeedbackAssem<T>> implements C8XO<T>, JY1 {
    public final C62822Ol8 LJZL;
    public View LL;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public boolean c4() {
        return true;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCardFeedbackAssem() {
        new LinkedHashMap();
        this.LJZL = C221108m2.LIZIZ(new AqS158S0100000_8((SearchCardFeedbackAssem) this, 113));
    }

    public InterfaceC65784Pro<List<View>> a4() {
        return C2W6.LJLIL;
    }

    public View b4() {
        return this.LL;
    }

    public final void Z3(View view) {
        if (view != null) {
            C49339JXz c49339JXz = new C49339JXz(this, view, view.getContext());
            c49339JXz.LJLJLJ = new JY0(this, view);
            c49339JXz.LJLJLLL = new IDTListenerS117S0100000_8(view, 2);
            view.setOnTouchListener(c49339JXz);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: e4, reason: merged with bridge method [inline-methods] */
    public void F0(T item) {
        o.LJIIIZ(item, "item");
        getContainerView().post(new ARunnableS44S0100000_8(this, 30));
    }

    public void g4(View view) {
        this.LL = view;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        view.post(new ARunnableS27S0200000_8(view, this, 27));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
    }
}
