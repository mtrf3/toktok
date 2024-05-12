package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.F1z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38315F1z extends AbstractC39429Fdh {
    public final /* synthetic */ InterfaceC60761Nsz LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ F3T LJLJI;
    public final /* synthetic */ C37942Euo LJLJJI;

    @Override // X.InterfaceC40516FvE
    public final F0S LLLIZZ() {
        if (this.LJLILLLLZI instanceof VNS) {
            return F0S.LYNX;
        }
        return F0S.WEB;
    }

    @Override // X.AbstractC39429Fdh, X.InterfaceC40516FvE
    public final F21 LLLLLLJ() {
        String str;
        C60737Nsb c60737Nsb = this.LJLJI.LIZIZ;
        if (c60737Nsb == null || (str = c60737Nsb.containerId) == null) {
            str = "";
        }
        return new F21(str);
    }

    @Override // X.AbstractC39429Fdh, X.InterfaceC40516FvE
    public final android.net.Uri rk() {
        android.net.Uri LIZIZ;
        InterfaceC60710NsA interfaceC60710NsA = this.LJLIL.getHybridContext().hybridParams;
        if (interfaceC60710NsA == null || (LIZIZ = interfaceC60710NsA.LIZIZ()) == null) {
            C60737Nsb hybridContext = this.LJLIL.getHybridContext();
            String str = null;
            if ((hybridContext instanceof SparkContext) && hybridContext != null) {
                str = hybridContext.url;
            }
            return UriProtector.parse(str);
        }
        return LIZIZ;
    }

    @Override // X.AbstractC39429Fdh, X.InterfaceC40516FvE
    public void onEvent(F22 event) {
        o.LJIIIZ(event, "event");
        this.LJLJJI.LIZ(event.getName(), (JSONObject) event.getParams());
    }

    public C38315F1z(InterfaceC60761Nsz interfaceC60761Nsz, View view, F3T f3t, C37942Euo c37942Euo) {
        this.LJLIL = interfaceC60761Nsz;
        this.LJLILLLLZI = view;
        this.LJLJI = f3t;
        this.LJLJJI = c37942Euo;
    }
}
