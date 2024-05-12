package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import kotlin.jvm.internal.AqS35S1300000_13;

/* renamed from: X.Tc7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75003Tc7 implements UC6 {
    public final /* synthetic */ SeiAppData LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Layout, C76800UCe> LIZIZ;
    public final /* synthetic */ InterfaceC75011TcF LIZJ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        String str;
        int i;
        if (layout == null) {
            SeiDsl seiDsl = this.LIZ.dsl;
            if (seiDsl != null && (str = seiDsl.layoutId) != null) {
                InterfaceC75011TcF interfaceC75011TcF = this.LIZJ;
                InterfaceC88472Yns<Layout, C76800UCe> interfaceC88472Yns = this.LIZIZ;
                if (seiDsl != null) {
                    i = seiDsl.version;
                } else {
                    i = -1;
                }
                interfaceC75011TcF.LJIIZILJ(i, str, new C75010TcE(interfaceC88472Yns));
                return;
            }
            return;
        }
        this.LIZIZ.invoke(layout);
    }

    public C75003Tc7(SeiAppData seiAppData, AqS35S1300000_13 aqS35S1300000_13, InterfaceC75011TcF interfaceC75011TcF) {
        this.LIZ = seiAppData;
        this.LIZIZ = aqS35S1300000_13;
        this.LIZJ = interfaceC75011TcF;
    }
}
