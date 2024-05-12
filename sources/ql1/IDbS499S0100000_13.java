package ql1;

import X.AbstractC60811Ntn;
import X.AbstractC76473Tzp;
import X.C32257ClJ;
import X.C60704Ns4;
import X.C78215Ump;
import X.InterfaceC60761Nsz;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDbS499S0100000_13 extends AbstractC60811Ntn {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz interfaceC60761Nsz, String str, C60704Ns4 c60704Ns4) {
        switch (this.$t) {
            case 1:
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
            case 1:
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
            case 1:
                LJJJJJL$0(this, interfaceC60761Nsz, str);
                return;
            default:
                super.LJJJJJL(interfaceC60761Nsz, str);
                return;
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
        switch (this.$t) {
            case 0:
                LJJJJZI$0(this, sparkContext);
                return;
            default:
                super.LJJJJZI(sparkContext);
                return;
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
        switch (this.$t) {
            case 0:
                LJJJLIIL$0(this, sparkContext);
                return;
            default:
                super.LJJJLIIL(sparkContext);
                return;
        }
    }

    public IDbS499S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJJJ$0(IDbS499S0100000_13 iDbS499S0100000_13, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13((C78215Ump) iDbS499S0100000_13.l0, 565));
    }

    public static final void LJJJJZI$0(IDbS499S0100000_13 iDbS499S0100000_13, SparkContext sparkContext) {
        DataChannel LJJIIZI = ((AbstractC76473Tzp) iDbS499S0100000_13.l0).LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.rv0(MvpDialogVisibleChannel.class, Boolean.TRUE);
        }
    }

    public static final void LJJJLIIL$0(IDbS499S0100000_13 iDbS499S0100000_13, SparkContext sparkContext) {
        DataChannel LJJIIZI = ((AbstractC76473Tzp) iDbS499S0100000_13.l0).LJJIIZI();
        if (LJJIIZI != null) {
            LJJIIZI.rv0(MvpDialogVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void LJJJJJL$0(IDbS499S0100000_13 iDbS499S0100000_13, InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        C32257ClJ.LJIIIIZZ(new AqS163S0100000_13((C78215Ump) iDbS499S0100000_13.l0, 566));
    }

    public static final void LJJJJIZL$0(IDbS499S0100000_13 iDbS499S0100000_13, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C32257ClJ.LJIIIIZZ(new AqS160S0200000_13(c60704Ns4, (C78215Ump) iDbS499S0100000_13.l0, 100));
    }
}
