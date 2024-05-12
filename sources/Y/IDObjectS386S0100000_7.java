package Y;

import X.C43619H9z;
import X.HAE;
import X.HAK;
import X.HAZ;
import X.InterfaceC84498XEg;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDObjectS386S0100000_7 implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                return;
            case 1:
                onFail$1(this, exceptionResult);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                return;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                return;
            default:
                return;
        }
    }

    public IDObjectS386S0100000_7(HAK hak, int i) {
        this.$t = i;
        this.l0 = hak;
    }

    public static final void onFail$0(IDObjectS386S0100000_7 iDObjectS386S0100000_7, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        long LIZ = ((HAK) iDObjectS386S0100000_7.l0).LIZJ.LIZ("fetch mv panel list", "failed.");
        C43619H9z c43619H9z = ((HAK) iDObjectS386S0100000_7.l0).LIZ.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LIZ = (int) LIZ;
            c43619H9z.LJIIJ = e.getMsg();
        }
        HAE hae = ((HAK) iDObjectS386S0100000_7.l0).LIZ;
        C43619H9z c43619H9z2 = hae.LIZ;
        if (c43619H9z2 != null) {
            c43619H9z2.LJIIIZ = 1;
        }
        HAZ haz = hae.LIZJ;
        if (haz != null) {
            haz.onFailed();
        }
    }

    public static final void onFail$1(IDObjectS386S0100000_7 iDObjectS386S0100000_7, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        HAK hak = (HAK) iDObjectS386S0100000_7.l0;
        InterfaceC84498XEg interfaceC84498XEg = hak.LIZ.LJI;
        o.LJI(interfaceC84498XEg);
        interfaceC84498XEg.LJJJJL(hak.LIZLLL, new IDObjectS386S0100000_7(hak, 0));
    }

    public static final void onSuccess$0(IDObjectS386S0100000_7 iDObjectS386S0100000_7, Object obj) {
        EffectChannelResponse response = (EffectChannelResponse) obj;
        o.LJIIIZ(response, "response");
        ((HAK) iDObjectS386S0100000_7.l0).LIZIZ(response);
    }

    public static final void onSuccess$1(IDObjectS386S0100000_7 iDObjectS386S0100000_7, Object obj) {
        EffectChannelResponse response = (EffectChannelResponse) obj;
        o.LJIIIZ(response, "response");
        if (!((HAK) iDObjectS386S0100000_7.l0).LIZIZ(response)) {
            HAK hak = (HAK) iDObjectS386S0100000_7.l0;
            InterfaceC84498XEg interfaceC84498XEg = hak.LIZ.LJI;
            o.LJI(interfaceC84498XEg);
            interfaceC84498XEg.LJJJJL(hak.LIZLLL, new IDObjectS386S0100000_7(hak, 0));
        }
    }
}
