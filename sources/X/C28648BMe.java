package X;

import android.view.View;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BMe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28648BMe extends AbstractC31901Na {
    public final PagingViewModel LJLIL;
    public final LiveIconView LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final C47121t6 LJLJJI;
    public final View LJLJJL;
    public final C73318Sq2 LJLJJLL;

    @Override // X.AbstractC31901Na
    public final void M() {
        this.LJLJJLL.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    @Override // X.AbstractC31901Na
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(boolean r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.itemView
            r0.getContext()
            r4 = 0
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L27
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L27
            if (r0 == 0) goto L27
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = r5.LJLILLLLZI
            r0 = 2130970625(0x7f040801, float:1.7549965E38)
            r1.setIconAttr(r0)
            X.1t6 r1 = r5.LJLJI
            r0 = 2131839032(0x7f114838, float:1.9311304E38)
            r1.setText(r0)
            X.1t6 r1 = r5.LJLJJI
            r0 = 2131839033(0x7f114839, float:1.9311306E38)
            r1.setText(r0)
            goto L3f
        L27:
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = r5.LJLILLLLZI
            r0 = 2130970627(0x7f040803, float:1.754997E38)
            r1.setIconAttr(r0)
            X.1t6 r1 = r5.LJLJI
            r0 = 2131840168(0x7f114ca8, float:1.9313608E38)
            r1.setText(r0)
            X.1t6 r1 = r5.LJLJJI
            r0 = 2131840169(0x7f114ca9, float:1.931361E38)
            r1.setText(r0)
        L3f:
            android.view.View r3 = r5.LJLJJL
            Y.ACListenerS24S0101000_5 r2 = new Y.ACListenerS24S0101000_5
            r1 = 2
            r0 = 0
            r2.<init>(r1, r5, r0)
            X.C16880lQ.LJIIJ(r2, r3)
            if (r6 != 0) goto L74
            com.bytedance.android.live.core.paging.viewmodel.PagingViewModel r0 = r5.LJLIL
            X.0TQ<T> r0 = r0.LJLL
            X.1MU r0 = (X.C1MU) r0
            X.00s<CacheKey, T> r1 = r0.LJIIIZ
            CacheKey r0 = r0.LJIIJ
            int r3 = r1.LIZLLL(r0)
        L5b:
            if (r4 >= r3) goto L74
            com.bytedance.android.live.core.paging.viewmodel.PagingViewModel r0 = r5.LJLIL
            X.0TQ<T> r2 = r0.LJLL
            X.1MU r2 = (X.C1MU) r2
            X.00s<CacheKey, T> r1 = r2.LJIIIZ
            CacheKey r0 = r2.LJIIJ
            r1.LIZ(r0)
            X.SzJ<java.lang.Object> r1 = r2.LJI
            java.lang.Object r0 = X.BTJ.LIZJ
            r1.onNext(r0)
            int r4 = r4 + 1
            goto L5b
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28648BMe.L(boolean):void");
    }

    public C28648BMe(View view, PagingViewModel pagingViewModel) {
        super(view);
        this.LJLJJLL = new C73318Sq2();
        this.LJLIL = pagingViewModel;
        this.LJLILLLLZI = (LiveIconView) view.findViewById(R.id.cyf);
        this.LJLJI = (C47121t6) view.findViewById(R.id.cyt);
        this.LJLJJI = (C47121t6) view.findViewById(R.id.cy6);
        this.LJLJJL = view.findViewById(R.id.cyl);
    }
}
