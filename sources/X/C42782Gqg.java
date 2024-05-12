package X;

import com.ss.android.ugc.aweme.AnchorSelectionFragment;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42782Gqg extends C8BR<C42779Gqd, InterfaceC42777Gqb> implements InterfaceC51034K1e<Object> {
    public AnchorSelectionFragment LJLJJI;

    @Override // X.InterfaceC51034K1e
    public final void onItemDeleted(int i) {
    }

    @Override // X.InterfaceC51034K1e
    public final void onItemInserted(List<Object> list, int i) {
    }

    @Override // X.InterfaceC51034K1e
    public final /* synthetic */ boolean onItemInsertedNew(C2KF<Object> c2kf) {
        return false;
    }

    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        T t = this.LJLIL;
        if (t == 0 || this.LJLILLLLZI == 0) {
            return;
        }
        o.LJI(t);
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                K k = this.LJLILLLLZI;
                o.LJI(k);
                ((InterfaceC223218pR) k).showLoadMoreLoading();
                return;
            }
            K k2 = this.LJLILLLLZI;
            o.LJI(k2);
            ((InterfaceC223218pR) k2).Iw();
            return;
        }
        K k3 = this.LJLILLLLZI;
        o.LJI(k3);
        ((InterfaceC223218pR) k3).LJII();
    }

    public final void LJJIII() {
        T t = this.LJLIL;
        o.LJI(t);
        if (((C42779Gqd) t).LJLJL) {
            K k = this.LJLILLLLZI;
            o.LJI(k);
            ((InterfaceC42777Gqb) k).mE();
        } else {
            K k2 = this.LJLILLLLZI;
            o.LJI(k2);
            ((InterfaceC42777Gqb) k2).PK();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (((X.AbstractC51036K1g) r0).isNewDataEmpty() == false) goto L18;
     */
    @Override // X.C8BR, X.C8BT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            r4 = this;
            T extends X.8BS r0 = r4.LJLIL
            if (r0 == 0) goto L8
            K extends X.2K3 r0 = r4.LJLILLLLZI
            if (r0 != 0) goto L9
        L8:
            return
        L9:
            r4.LJJIII()
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.K1g r0 = (X.AbstractC51036K1g) r0
            int r1 = r0.mListQueryType
            r3 = 1
            if (r1 == r3) goto L6d
            r0 = 2
            if (r1 == r0) goto L4d
            r0 = 4
            if (r1 == r0) goto L1f
            goto L8
        L1f:
            K extends X.2K3 r2 = r4.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r2)
            X.8pR r2 = (X.InterfaceC223218pR) r2
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.Gqd r0 = (X.C42779Gqd) r0
            java.util.List<java.lang.Object> r1 = r0.LJLJI
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.Gqd r0 = (X.C42779Gqd) r0
            boolean r0 = r0.LJLJJLL
            if (r0 == 0) goto L4b
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.K1g r0 = (X.AbstractC51036K1g) r0
            boolean r0 = r0.isNewDataEmpty()
            if (r0 != 0) goto L4b
        L47:
            r2.j0(r1, r3)
            goto L8
        L4b:
            r3 = 0
            goto L47
        L4d:
            K extends X.2K3 r2 = r4.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r2)
            X.8pR r2 = (X.InterfaceC223218pR) r2
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.Gqd r0 = (X.C42779Gqd) r0
            java.util.List<java.lang.Object> r1 = r0.LJLJI
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.K1g r0 = (X.AbstractC51036K1g) r0
            boolean r0 = r0.isNewDataEmpty()
            r3 = r3 ^ r0
            r2.jh(r1, r3)
            goto L8
        L6d:
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.Gqd r0 = (X.C42779Gqd) r0
            java.util.List<com.ss.android.ugc.aweme.api.model.AnchorModule> r0 = r0.LJLJJI
            if (r0 == 0) goto L80
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb9
        L80:
            K extends X.2K3 r0 = r4.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r0)
            X.8pR r0 = (X.InterfaceC223218pR) r0
            r0.Ne()
        L8a:
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.Gqd r0 = (X.C42779Gqd) r0
            java.lang.String r2 = r0.LJLJLJ
            com.ss.android.ugc.aweme.AnchorSelectionFragment r0 = r4.LJLJJI
            if (r0 == 0) goto L8
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L8
            com.ss.android.ugc.aweme.AnchorSelectionFragment r0 = r4.LJLJJI
            kotlin.jvm.internal.o.LJI(r0)
            kotlin.jvm.internal.o.LJI(r2)
            android.view.View r1 = r0.LJLJLJ
            if (r1 == 0) goto L8
            r0 = 2131379938(0x7f0a46e2, float:1.838015E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L8
            r0.setText(r2)
            goto L8
        Lb9:
            K extends X.2K3 r2 = r4.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r2)
            X.8pR r2 = (X.InterfaceC223218pR) r2
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.Gqd r0 = (X.C42779Gqd) r0
            java.util.List<java.lang.Object> r1 = r0.LJLJI
            T extends X.8BS r0 = r4.LJLIL
            kotlin.jvm.internal.o.LJI(r0)
            X.Gqd r0 = (X.C42779Gqd) r0
            boolean r0 = r0.LJLJJLL
            r2.J5(r1, r0)
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42782Gqg.onSuccess():void");
    }

    @Override // X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        if (this.LJLIL == 0 || this.LJLILLLLZI == 0) {
            return;
        }
        LJJIII();
        T t = this.LJLIL;
        o.LJI(t);
        int i = ((AbstractC51036K1g) t).mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                K k = this.LJLILLLLZI;
                o.LJI(k);
                ((InterfaceC223218pR) k).nc(e);
                return;
            }
            K k2 = this.LJLILLLLZI;
            o.LJI(k2);
            ((InterfaceC223218pR) k2).Qw(e);
            return;
        }
        K k3 = this.LJLILLLLZI;
        o.LJI(k3);
        ((InterfaceC223218pR) k3).cb0(e);
    }
}
