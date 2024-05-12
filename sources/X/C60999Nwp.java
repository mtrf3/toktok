package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.o;
import com.lynx.tasm.TemplateData;

/* renamed from: X.Nwp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60999Nwp implements InterfaceC60819Ntv {
    public final /* synthetic */ String LJLIL;

    @Override // X.M2J
    public final void release() {
    }

    public C60999Nwp(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (C61000Nwq.LIZ[interfaceC60710NsA.getType().ordinal()] == 1) {
            ((C60606NqU) interfaceC60710NsA).LJIIIIZZ = TemplateData.LJFF(GsonProtectorUtils.parse(new o(), this.LJLIL).toString());
        }
    }
}
