package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.HtF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45489HtF implements InterfaceC45767Hxj {
    public final /* synthetic */ C45473Hsz LIZ;
    public final /* synthetic */ C45765Hxh LIZIZ;

    @Override // X.InterfaceC45767Hxj
    public final void LIZIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LIZ.LJJJJ;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.InterfaceC45767Hxj
    public final void LIZ(boolean z) {
        if (HRX.LJFF() && z) {
            C45473Hsz c45473Hsz = this.LIZ;
            C45474Ht0 c45474Ht0 = c45473Hsz.LIZJ;
            if (c45474Ht0 != null) {
                Context context = c45474Ht0.getContext();
                o.LJIIIIZZ(context, "videoImageMixedView.context");
                c45473Hsz.LJJJJ = C44703HgZ.LIZJ(context, this.LIZIZ, "upload_page", this.LIZ.LIZ);
                return;
            }
            o.LJIJI("videoImageMixedView");
            throw null;
        }
    }

    public C45489HtF(C45473Hsz c45473Hsz, C45765Hxh c45765Hxh) {
        this.LIZ = c45473Hsz;
        this.LIZIZ = c45765Hxh;
    }
}
