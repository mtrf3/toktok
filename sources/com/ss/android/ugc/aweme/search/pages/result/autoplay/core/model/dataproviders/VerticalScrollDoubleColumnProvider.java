package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C30581Hy;
import X.C48891JGt;
import X.C49140JQi;
import X.C49141JQj;
import X.C49142JQk;
import X.C49143JQl;
import X.C49804Jge;
import X.C62822Ol8;
import X.InterfaceC48888JGq;
import X.InterfaceC49148JQq;
import X.JQY;
import X.JU6;
import X.JU8;
import Y.IDrS47S0100000_8;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class VerticalScrollDoubleColumnProvider extends JU8 implements InterfaceC48888JGq {
    public static final /* synthetic */ int LJZ = 0;
    public final LifecycleOwner LJLJI;
    public final RecyclerView LJLJJI;
    public InterfaceC49148JQq LJLJJL;
    public InterfaceC49148JQq LJLJJLL;
    public int LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public InterfaceC49148JQq LJLLI;
    public long LJLLILLLL;
    public int LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final SearchContainerHeaderVM LJLZ;

    @Override // X.InterfaceC48888JGq
    public final void onPause() {
        this.LJLLI = null;
        this.LJLJJLL = null;
    }

    public final InterfaceC49148JQq[] LJII() {
        return (InterfaceC49148JQq[]) this.LJLLLL.getValue();
    }

    public final InterfaceC49148JQq[] LJIIIIZZ() {
        return (InterfaceC49148JQq[]) this.LJLLL.getValue();
    }

    public final void LJFF() {
        int length = LJIIIIZZ().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            LJIIIIZZ()[i3] = null;
            i2++;
            i3++;
        }
        int length2 = LJII().length;
        int i4 = 0;
        while (i < length2) {
            LJII()[i4] = null;
            i++;
            i4++;
        }
    }

    public final boolean LJIIIZ() {
        InterfaceC49148JQq[] LJIIIIZZ = LJIIIIZZ();
        int length = LJIIIIZZ.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (!o.LJ(LJIIIIZZ[i], LJII()[i2])) {
                return false;
            }
            i++;
            i2 = i3;
        }
        return true;
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C48891JGt.onDestroy(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C48891JGt.onResume(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C48891JGt.onStop(this);
    }

    @Override // X.JU9
    public final void LIZIZ(JU6 ju6) {
        if (this.LJLJLLL) {
            return;
        }
        super.LIZIZ(ju6);
    }

    public VerticalScrollDoubleColumnProvider(LifecycleOwner host, RecyclerView recyclerView) {
        ActivityC45651qj LJJIJIL;
        o.LJIIIZ(host, "host");
        this.LJLJI = host;
        this.LJLJJI = recyclerView;
        this.LJLJL = 1;
        this.LJLJLJ = C221108m2.LIZIZ(C49142JQk.LJLIL);
        this.LJLL = 1;
        host.getLifecycle().addObserver(this);
        this.LJLLL = C221108m2.LIZIZ(C49141JQj.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C49140JQi.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C49143JQl.LJLIL);
        this.LJLLLLLL = LIZIZ;
        if (C49804Jge.LJJIZ() && (LJJIJIL = C30581Hy.LJJIJIL(recyclerView)) != null) {
            this.LJLZ = (SearchContainerHeaderVM) ViewModelProviders.of(LJJIJIL).get(SearchContainerHeaderVM.class);
        }
        recyclerView.LJIIJJI(new IDrS47S0100000_8(this, 1));
        if (((JQY) LIZIZ.getValue()).LJII()) {
            ((JQY) LIZIZ.getValue()).LIZ();
            return;
        }
        Object parent = recyclerView.getParent().getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        ((JQY) LIZIZ.getValue()).LJ((View) parent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236 A[LOOP:2: B:108:0x0230->B:110:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0248 A[EDGE_INSN: B:143:0x0248->B:114:0x0248 BREAK  A[LOOP:3: B:118:0x029a->B:122:0x02ad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01eb  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider, X.JU8] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.JQq, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider.LJ(int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC49148JQq LJI(X.InterfaceC49148JQq[] r4, X.InterfaceC49148JQq[] r5) {
        /*
            r3 = this;
            boolean r0 = r3.LJIIIZ()
            r2 = 1
            if (r0 == 0) goto L14
            r1 = r4[r2]
        L9:
            if (r1 == 0) goto L13
        Lb:
            boolean r0 = r1.LLIIII()
            if (r0 != 0) goto L13
            r1 = r5[r2]
        L13:
            return r1
        L14:
            r0 = 0
            r1 = r4[r0]
            if (r1 != 0) goto Lb
            r1 = r5[r2]
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider.LJI(X.JQq[], X.JQq[]):X.JQq");
    }
}
