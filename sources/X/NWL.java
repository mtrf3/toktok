package X;

import android.text.TextUtils;
import com.bytedance.ies.bullet.ui.common.BulletContainerFragment;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWL {
    public InterfaceC59504NWy LIZ;
    public InterfaceC60187Njj LIZIZ;
    public String LIZJ;
    public final BulletContainerFragment LIZLLL;

    public final void LIZ() {
        InterfaceC60196Njs interfaceC60196Njs;
        F3T LLIIIILZ;
        NX1 nx1;
        AqS176S0100000_10 LIZ;
        if (this.LIZ == null || this.LIZIZ == null || TextUtils.isEmpty(this.LIZJ)) {
            return;
        }
        BulletContainerFragment bulletContainerFragment = this.LIZLLL;
        String str = this.LIZJ;
        InterfaceC60179Njb interfaceC60179Njb = null;
        if (str != null) {
            InterfaceC59504NWy interfaceC59504NWy = bulletContainerFragment.LJLJJL;
            if (interfaceC59504NWy != null) {
                interfaceC60196Njs = interfaceC59504NWy.LIZ();
            } else {
                interfaceC60196Njs = null;
            }
            if (!(interfaceC60196Njs instanceof C60219NkF)) {
                interfaceC60196Njs = null;
            }
            C60219NkF c60219NkF = (C60219NkF) interfaceC60196Njs;
            if (c60219NkF != null) {
                InterfaceC60247Nkh interfaceC60247Nkh = c60219NkF.LJLL.get(str);
                if (interfaceC60247Nkh != null && (LLIIIILZ = interfaceC60247Nkh.LLIIIILZ()) != null && (nx1 = (NX1) LLIIIILZ.LIZJ(NX1.class)) != null && (LIZ = nx1.LIZ()) != null) {
                    interfaceC60179Njb = (InterfaceC60179Njb) LIZ.invoke(c60219NkF.LJLJJL);
                }
                bulletContainerFragment.LJLJJI = interfaceC60179Njb;
                return;
            }
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    public NWL(BulletContainerFragment bulletContainerFragment) {
        this.LIZLLL = bulletContainerFragment;
    }
}
