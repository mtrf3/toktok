package com.ss.android.ugc.aweme.feed.adapter;

import X.AbstractC48820JEa;
import X.AbstractC55082Lja;
import X.C221108m2;
import X.C2MA;
import X.C35070Dpa;
import X.C3DG;
import X.C50420Jqa;
import X.C51928KZo;
import X.C55079LjX;
import X.C55081LjZ;
import X.C55136LkS;
import X.C62822Ol8;
import X.ExecutorC142245i8;
import X.FF9;
import X.FFA;
import X.FW9;
import X.InterfaceC2302191t;
import X.InterfaceC72642tA;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS45S0001000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class FullFeedPagerAdapter extends AbstractC55082Lja implements FFA {
    public int LLI;
    public final C55079LjX LLIFFJFJJ;
    public final int LLII;
    public final C62822Ol8 LLIIII;
    public final FullFeedPagerAdapter$lifecycleObserver$1 LLIIIILZ;

    @Override // X.AbstractC55082Lja
    public String LJJIJLIJ() {
        return "full_feed";
    }

    @Override // X.FFA
    public final void LJFF() {
        int length;
        if (!((Boolean) C35070Dpa.LIZ.getValue()).booleanValue() || (length = this.LJLILLLLZI.length) == 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                LinkedList<View> linkedList = this.LJLILLLLZI[i];
                if (!linkedList.isEmpty()) {
                    linkedList.clear();
                }
            }
        }
    }

    @Override // X.AbstractC55082Lja
    public C55136LkS LJJJ() {
        return new C55136LkS(new AqS167S0100000_1(this, 40));
    }

    @Override // X.AbstractC55082Lja, androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        ((AbstractC48820JEa) this.LLIIII.getValue()).LJIIJ(C55081LjZ.LJLIL);
    }

    @Override // X.AbstractC55082Lja, androidx.viewpager.widget.PagerAdapter
    public int LJIIL(Object any) {
        o.LJIIIZ(any, "any");
        C2MA LJJJI = AbstractC55082Lja.LJJJI((View) any);
        if (LJJJI == null || LJJJI.getAweme() == null || !LJJJI.getAweme().isLiveNoDeduplicate() || !FW9.LIZ()) {
            return super.LJIIL(any);
        }
        int count = getCount();
        for (int i = 0; i < count; i++) {
            if (o.LJ(((Aweme) ListProtector.get(Q8(), i)).getUniqueId(), LJJJI.getAweme().getUniqueId())) {
                return i;
            }
        }
        return -2;
    }

    @Override // X.AbstractC55082Lja
    public final void LJJIJL(int i) {
        super.LJJIJL(i);
        ((AbstractC48820JEa) this.LLIIII.getValue()).LJIIJ(new AqS45S0001000_9(i, 2));
    }

    @Override // X.AbstractC55082Lja, X.InterfaceC55062LjG
    public void setData(List<? extends Aweme> list) {
        super.setData(list);
        ((AbstractC48820JEa) this.LLIIII.getValue()).LJIIJ(new AqS151S0100000_1(list, (List<String>) 58));
    }

    @Override // X.AbstractC55082Lja
    public final void LJJJJ(int i, Aweme aweme) {
        super.LJJJJ(i, aweme);
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LLIIII.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[insert] ");
        LIZ.append(i);
        abstractC48820JEa.LJII(aweme, X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC55082Lja
    public final void LJJJJJ(int i, Aweme aweme) {
        super.LJJJJJ(i, aweme);
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LLIIII.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[replaceAweme] ");
        LIZ.append(i);
        abstractC48820JEa.LJII(aweme, X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    @Override // X.AbstractC55082Lja, X.AbstractC48746JBe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIIZ(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter.LJJIIZ(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter$lifecycleObserver$1, androidx.lifecycle.LifecycleObserver] */
    public FullFeedPagerAdapter(Context context, LayoutInflater inflater, InterfaceC72642tA<C50420Jqa> listener, Fragment fragment, View.OnTouchListener tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        super(context, inflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        this.LLI = -1;
        this.LLIFFJFJJ = new C55079LjX();
        this.LLII = 1;
        this.LLIIII = C221108m2.LIZIZ(C3DG.LJLIL);
        ?? r1 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS45S0100000_9(FullFeedPagerAdapter.this, 29));
                }
            }
        };
        this.LLIIIILZ = r1;
        if (C51928KZo.LIZ) {
            fragment.getLifecycle().addObserver(r1);
        }
        if (((Boolean) C35070Dpa.LIZ.getValue()).booleanValue()) {
            ((ArrayList) FF9.LIZ).add(new WeakReference(this));
        }
    }
}
