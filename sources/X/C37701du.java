package X;

import Y.IDCListenerS135S0100000;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37701du implements InterfaceC266512v {
    public final DataChannel LJLIL;
    public final InterfaceC266512v LJLILLLLZI;
    public C37811e5 LJLJI;
    public final InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> LJLJJI;
    public final C73318Sq2 LJLJJL;
    public C73411SrX LJLJJLL;
    public int LJLJL;
    public EnumC264412a LJLJLJ;
    public CharSequence LJLJLLL;
    public Object LJLL;

    @Override // X.InterfaceC266512v
    public final void LJJLI(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
    }

    @Override // X.InterfaceC266512v
    public final void dismiss() {
        this.LJLJI = null;
        this.LJLILLLLZI.dismiss();
        DataChannel dataChannel = this.LJLIL;
        dataChannel.getClass();
        dataChannel.jv0(this);
        this.LJLJJL.dispose();
        C73411SrX c73411SrX = this.LJLJJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // X.InterfaceC266512v
    public final void LJJIIJ() {
        LIZ(this, C12X.RETURN_APP);
    }

    @Override // X.InterfaceC266512v
    public final void LJJJZ() {
        LIZ(this, C12X.HIDE_TIP);
    }

    @Override // X.InterfaceC266512v
    public final boolean LLIIIJ() {
        if (this.LJLILLLLZI.LLIIIJ() || C29306Beo.LJJIIJ(this.LJLJI)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC266512v
    public final View getContentView() {
        return this.LJLILLLLZI.getContentView();
    }

    @Override // X.InterfaceC266512v
    public final int getWidth() {
        return this.LJLILLLLZI.getWidth();
    }

    @Override // X.InterfaceC266512v
    public final void hide() {
        C37811e5 c37811e5 = this.LJLJI;
        if (c37811e5 != null) {
            C87277YNd.LJJIIZ(c37811e5);
        }
        this.LJLILLLLZI.hide();
    }

    @Override // X.InterfaceC266512v
    public final void init() {
        this.LJLILLLLZI.init();
    }

    @Override // X.InterfaceC266512v
    public final void onDestroy() {
        this.LJLILLLLZI.onDestroy();
    }

    @Override // X.InterfaceC266512v
    public final int LJIILLIIL() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC266512v
    public final EnumC264412a LJJJJL() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC266512v
    public final void LJIILJJIL(boolean z) {
        int i = this.LJLJL;
        if (i != 0 && i != 1) {
            LIZ(this, C12X.CHANGE_STATE);
        }
        hide();
        this.LJLILLLLZI.LJIILJJIL(z);
    }

    @Override // X.InterfaceC266512v
    public final void LJJ(int i) {
        this.LJLILLLLZI.LJJ(i);
    }

    @Override // X.InterfaceC266512v
    public final void LJJI(int i) {
        this.LJLILLLLZI.LJJI(i);
    }

    @Override // X.InterfaceC266512v
    public final void LJJIJIIJI(boolean z) {
        CharSequence charSequence;
        int i = this.LJLJL;
        if ((i == 0 || i == 1) && (charSequence = this.LJLJLLL) != null) {
            if (z) {
                C37811e5 c37811e5 = this.LJLJI;
                if (c37811e5 != null) {
                    c37811e5.LJJLL(this.LJLJLJ, charSequence, this.LJLL);
                }
                C37811e5 c37811e52 = this.LJLJI;
                if (c37811e52 != null) {
                    C87277YNd.LJJIJ(c37811e52);
                    return;
                }
                return;
            }
            this.LJLILLLLZI.LJJJJZ(this.LJLJLJ, charSequence, false, this.LJLL);
        }
    }

    @Override // X.InterfaceC266512v
    public final void LJJJJJ(EnumC264412a enumC264412a) {
        InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt = this.LJLJJI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(enumC264412a, C12X.HIDE_TIP, this.LJLL);
        }
    }

    public static void LIZ(C37701du c37701du, C12X c12x) {
        InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt;
        boolean LLIIIJ = c37701du.LLIIIJ();
        EnumC264412a enumC264412a = c37701du.LJLJLJ;
        EnumC264412a enumC264412a2 = EnumC264412a.LIVE_TIP_UNKNOWN;
        o.LJIIIZ(enumC264412a2, "<set-?>");
        c37701du.LJLJLJ = enumC264412a2;
        c37701du.LJLJL = 2;
        c37701du.hide();
        if (LLIIIJ && enumC264412a != enumC264412a2 && (interfaceC88473Ynt = c37701du.LJLJJI) != null) {
            interfaceC88473Ynt.invoke(enumC264412a, c12x, c37701du.LJLL);
        }
    }

    @Override // X.InterfaceC266512v
    public final void LJFF(boolean z, boolean z2) {
        this.LJLILLLLZI.LJFF(z, z2);
    }

    public C37701du(DataChannel dataChannel, C55792Gx c55792Gx, C37811e5 c37811e5, IDqS425S0100000 iDqS425S0100000) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = c55792Gx;
        this.LJLJI = c37811e5;
        this.LJLJJI = iDqS425S0100000;
        this.LJLJJL = new C73318Sq2();
        this.LJLJL = 2;
        this.LJLJLJ = EnumC264412a.LIVE_TIP_UNKNOWN;
        C37811e5 c37811e52 = this.LJLJI;
        if (c37811e52 != null) {
            c37811e52.setOnCloseClickListener(new IDCListenerS135S0100000(this, 86));
        }
        c55792Gx.LLIIIZ = new IDCListenerS135S0100000(this, 87);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // X.InterfaceC266512v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZ(X.EnumC264412a r4, java.lang.CharSequence r5, boolean r6, java.lang.Object r7) {
        /*
            r3 = this;
            java.lang.String r0 = "floatTipType"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "tipContent"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.12a r2 = r3.LJLJLJ
            r3.LJLJLJ = r4
            if (r4 != r2) goto L16
            boolean r0 = X.C264512b.LIZIZ(r4, r2)
            if (r0 == 0) goto L2d
        L16:
            X.12a r1 = r3.LJLJLJ
            X.12a r0 = X.EnumC264412a.LIVE_TIP_UNKNOWN
            if (r1 == r0) goto L2d
            if (r2 == r0) goto L2d
            boolean r0 = r3.LLIIIJ()
            if (r0 == 0) goto L2d
            X.Ynt<X.12a, X.12X, java.lang.Object, X.UCe> r1 = r3.LJLJJI
            if (r1 == 0) goto L2d
            X.12X r0 = X.C12X.NEW_TIP
            r1.invoke(r2, r0, r7)
        L2d:
            r3.LJLJLLL = r5
            int r0 = r4.getPriority()
            r3.LJLJL = r0
            r3.LJLL = r7
            X.SrX r0 = r3.LJLJJLL
            if (r0 == 0) goto L3e
            r0.dispose()
        L3e:
            int r1 = r4.getPriority()
            r0 = 2
            if (r1 == r0) goto L66
            r0 = 3
            if (r1 == r0) goto L63
        L48:
            if (r6 == 0) goto L5b
            X.1e5 r1 = r3.LJLJI
            if (r1 == 0) goto L53
            X.12a r0 = r3.LJLJLJ
            r1.LJJLL(r0, r5, r7)
        L53:
            X.1e5 r0 = r3.LJLJI
            if (r0 == 0) goto L5a
            X.C87277YNd.LJJIJ(r0)
        L5a:
            return
        L5b:
            X.12v r1 = r3.LJLILLLLZI
            X.12a r0 = r3.LJLJLJ
            X.C266412u.LIZ(r1, r0, r5, r7)
            goto L5a
        L63:
            r0 = 5000(0x1388, double:2.4703E-320)
            goto L68
        L66:
            r0 = 10000(0x2710, double:4.9407E-320)
        L68:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.SrN r1 = X.AbstractC73672Svk.LJJLIIIJLJLI(r0, r2)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r2 = r1.LJJJ(r0)
            Y.IDfS292S0100000 r1 = new Y.IDfS292S0100000
            r0 = 46
            r1.<init>(r3, r0)
            X.3kP r0 = r2.LJJJJZI(r1)
            X.SrX r0 = (X.C73411SrX) r0
            r3.LJLJJLL = r0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37701du.LJJJJZ(X.12a, java.lang.CharSequence, boolean, java.lang.Object):void");
    }
}
