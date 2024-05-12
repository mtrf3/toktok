package X;

import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Skx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73003Skx extends AbstractC73005Skz {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        InterfaceC73004Sky interfaceC73004Sky = (InterfaceC73004Sky) ED5.LIZJ(InterfaceC73004Sky.class, null);
        interfaceC73004Sky.setMaxDuration(Long.valueOf(((IHostSetting) CN1.LIZ(IHostSetting.class)).IF() / 1000));
        c37356ElM.onSuccess(interfaceC73004Sky, "");
    }
}
