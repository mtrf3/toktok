package ql1;

import X.AbstractC60673NrZ;
import X.AbstractC60811Ntn;
import X.C60704Ns4;
import X.InterfaceC40159FpT;
import X.InterfaceC60761Nsz;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDbS496S0100000_6 extends AbstractC60811Ntn {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz interfaceC60761Nsz, String str) {
        switch (this.$t) {
            case 0:
                LJJJJ$0(this, interfaceC60761Nsz, str);
                return;
            default:
                super.LJJJJ(interfaceC60761Nsz, str);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz interfaceC60761Nsz, String str, String str2) {
        switch (this.$t) {
            case 0:
                LJJJJI$0(this, interfaceC60761Nsz, str, str2);
                return;
            default:
                super.LJJJJI(interfaceC60761Nsz, str, str2);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz interfaceC60761Nsz, String str, C60704Ns4 c60704Ns4) {
        switch (this.$t) {
            case 0:
                LJJJJIZL$0(this, interfaceC60761Nsz, str, c60704Ns4);
                return;
            default:
                super.LJJJJIZL(interfaceC60761Nsz, str, c60704Ns4);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz interfaceC60761Nsz) {
        switch (this.$t) {
            case 0:
                LJJJJJ$0(this, interfaceC60761Nsz);
                return;
            default:
                super.LJJJJJ(interfaceC60761Nsz);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz interfaceC60761Nsz, String str) {
        switch (this.$t) {
            case 0:
                LJJJJJL$0(this, interfaceC60761Nsz, str);
                return;
            default:
                super.LJJJJJL(interfaceC60761Nsz, str);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        switch (this.$t) {
            case 0:
                LJJJJLL$0(this);
                return;
            case 1:
                LJJJJLL$1(this);
                return;
            default:
                super.LJJJJLL();
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        switch (this.$t) {
            case 0:
                onDestroy$0(this);
                return;
            default:
                super.onDestroy();
                return;
        }
    }

    public static final void LJJJJLL$0(IDbS496S0100000_6 iDbS496S0100000_6) {
        ((AbstractC60673NrZ) iDbS496S0100000_6.l0).LJJJJLL();
    }

    public static final void LJJJJLL$1(IDbS496S0100000_6 iDbS496S0100000_6) {
        InterfaceC40159FpT LJIILL = ((SparkContext) iDbS496S0100000_6.l0).LJIILL();
        if (LJIILL != null) {
            LJIILL.close();
        }
    }

    public static final void onDestroy$0(IDbS496S0100000_6 iDbS496S0100000_6) {
        ((AbstractC60673NrZ) iDbS496S0100000_6.l0).onDestroy();
    }

    public IDbS496S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJJJ$0(IDbS496S0100000_6 iDbS496S0100000_6, InterfaceC60761Nsz view) {
        o.LJIIJ(view, "view");
        ((AbstractC60673NrZ) iDbS496S0100000_6.l0).LJJJJJ(view);
    }

    public static final void LJJJJ$0(IDbS496S0100000_6 iDbS496S0100000_6, InterfaceC60761Nsz view, String url) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        ((AbstractC60673NrZ) iDbS496S0100000_6.l0).LJJJJ(view, url);
    }

    public static final void LJJJJJL$0(IDbS496S0100000_6 iDbS496S0100000_6, InterfaceC60761Nsz view, String url) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        ((AbstractC60673NrZ) iDbS496S0100000_6.l0).LJJJJJL(view, url);
    }

    public static final void LJJJJI$0(IDbS496S0100000_6 iDbS496S0100000_6, InterfaceC60761Nsz view, String url, String str) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        ((AbstractC60673NrZ) iDbS496S0100000_6.l0).LJJJJI(view, url, str);
    }

    public static final void LJJJJIZL$0(IDbS496S0100000_6 iDbS496S0100000_6, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        ((AbstractC60673NrZ) iDbS496S0100000_6.l0).LJJJJIZL(view, url, c60704Ns4);
    }
}
