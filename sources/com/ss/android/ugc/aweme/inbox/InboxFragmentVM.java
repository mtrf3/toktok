package com.ss.android.ugc.aweme.inbox;

import X.C2U8;
import X.C54251LQx;
import X.C54362LVe;
import X.C56627MKh;
import X.C56640MKu;
import X.ENR;
import X.EnumC56637MKr;
import X.EnumC94693nd;
import X.M9W;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxFragmentVM extends ViewModel {
    public static final M9W LJLL = new M9W();
    public final NextLiveData<EnumC56637MKr> LJLIL;
    public final NextLiveData<Integer> LJLILLLLZI;
    public final ChangeLiveData<Integer> LJLJI;
    public final ChangeLiveData<C56627MKh> LJLJJI;
    public final ChangeLiveData LJLJJL;
    public final NextLiveData LJLJJLL;
    public final NextLiveData LJLJL;
    public final LiveData<EnumC94693nd> LJLJLJ;
    public final ChangeLiveData<C56627MKh> LJLJLLL;

    public InboxFragmentVM() {
        NextLiveData<EnumC56637MKr> nextLiveData = new NextLiveData<>();
        this.LJLIL = nextLiveData;
        NextLiveData<Integer> nextLiveData2 = new NextLiveData<>();
        this.LJLILLLLZI = nextLiveData2;
        ChangeLiveData<Integer> changeLiveData = new ChangeLiveData<>();
        this.LJLJI = changeLiveData;
        ChangeLiveData<C56627MKh> changeLiveData2 = new ChangeLiveData<>();
        this.LJLJJI = changeLiveData2;
        this.LJLJJL = changeLiveData;
        this.LJLJJLL = nextLiveData;
        this.LJLJL = nextLiveData2;
        LiveData<EnumC94693nd> map = Transformations.map(nextLiveData, C56640MKu.LJLIL);
        o.LJIIIIZZ(map, "map(_inboxState) {\n     …null case\n        }\n    }");
        this.LJLJLJ = map;
        this.LJLJLLL = changeLiveData2;
    }

    public static void hv0() {
        if (ENR.LIZ()) {
            C54362LVe.LIZIZ(260);
        } else {
            C2U8.LIZ(new C54251LQx(260, -1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean gv0(java.util.Collection<? extends com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget> r9, int r10, boolean r11) {
        /*
            r8 = this;
            java.util.Iterator r7 = r9.iterator()
            r6 = 0
            r5 = 0
        L6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r4 = r7.next()
            com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget r4 = (com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget) r4
            X.09q r0 = r4.LJIIJ()
            int r3 = r0.getItemCount()
            r1 = 0
        L1b:
            if (r1 >= r3) goto L39
            int r2 = r4.LJIIIZ(r1)
            r0 = -1
            if (r2 == r0) goto L39
            int r2 = r2 + r5
            if (r2 > r10) goto L2b
            if (r11 == 0) goto L36
            if (r2 < r10) goto L36
        L2b:
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<java.lang.Integer> r1 = r8.LJLILLLLZI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.postValue(r0)
            r0 = 1
            return r0
        L36:
            int r1 = r1 + 1
            goto L1b
        L39:
            int r5 = r5 + r3
            goto L6
        L3b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.InboxFragmentVM.gv0(java.util.Collection, int, boolean):boolean");
    }
}
