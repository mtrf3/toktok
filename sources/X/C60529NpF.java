package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.jvm.internal.o;

/* renamed from: X.NpF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60529NpF implements GBL {
    public final /* synthetic */ CompletionBlock<InterfaceC60530NpG> LJLIL;

    @Override // X.GBL
    public void onExit() {
    }

    public C60529NpF(C37356ElM c37356ElM) {
        this.LJLIL = c37356ElM;
    }

    @Override // X.GBL
    public void onChanged(String phoneCode, String shortCountryName) {
        o.LJIIIZ(phoneCode, "phoneCode");
        o.LJIIIZ(shortCountryName, "shortCountryName");
        InterfaceC60530NpG interfaceC60530NpG = (InterfaceC60530NpG) ED5.LIZJ(InterfaceC60530NpG.class, null);
        interfaceC60530NpG.setPhoneCode(phoneCode);
        interfaceC60530NpG.setShortCountryName(shortCountryName);
        this.LJLIL.onSuccess(interfaceC60530NpG, "");
    }
}
