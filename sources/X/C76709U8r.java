package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.U8r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76709U8r implements UC4 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ U8I LIZIZ;
    public final /* synthetic */ InterfaceC75804Tp2 LIZJ;

    @Override // X.UC4
    public final void LIZ(DslLayout dslLayout) {
        DataChannel LJIIL;
        InterfaceC28296B8q interfaceC28296B8q;
        o.LJIIIZ(dslLayout, "dslLayout");
        C76665U6z c76665U6z = this.LIZ.LIZ;
        if (!c76665U6z.LJI && (LJIIL = c76665U6z.LJFF.LJIIL()) != null && (interfaceC28296B8q = (InterfaceC28296B8q) LJIIL.kv0(C28406BCw.class)) != null) {
            interfaceC28296B8q.LJIILJJIL();
        }
        this.LIZ.LJII(dslLayout);
        this.LIZIZ.LJ(dslLayout, (SeiAppData) this.LIZJ);
        this.LIZ.LJJIJLIJ = (SeiAppData) this.LIZJ;
    }

    public C76709U8r(U8H u8h, U8I u8i, InterfaceC75804Tp2 interfaceC75804Tp2) {
        this.LIZ = u8h;
        this.LIZIZ = u8i;
        this.LIZJ = interfaceC75804Tp2;
    }
}
