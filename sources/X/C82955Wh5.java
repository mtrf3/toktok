package X;

import Y.ARunnableS25S0300000_14;
import android.os.Handler;
import org.json.JSONObject;

/* renamed from: X.Wh5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82955Wh5 implements InterfaceC269413y {
    public final /* synthetic */ JSONObject LIZ;
    public final /* synthetic */ InterfaceC36488ETs LIZIZ;
    public final /* synthetic */ InterfaceC37146Ehy LIZJ;

    @Override // X.InterfaceC269413y
    public final void LIZ() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS25S0300000_14(this.LIZJ, this.LIZ, this.LIZIZ, 9));
    }

    public C82955Wh5(InterfaceC37146Ehy interfaceC37146Ehy, InterfaceC36488ETs interfaceC36488ETs, JSONObject jSONObject) {
        this.LIZ = jSONObject;
        this.LIZIZ = interfaceC36488ETs;
        this.LIZJ = interfaceC37146Ehy;
    }
}
