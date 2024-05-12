package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Fmo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39994Fmo extends AbstractC39996Fmq {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        InterfaceC39998Fms interfaceC39998Fms = (InterfaceC39998Fms) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "spark context is null", 4);
            return;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "spark context must be lifecycleOwner", 4);
            return;
        }
        try {
            C39990Fmk.LIZ(LJJIFFI).LIZJ(interfaceC39998Fms.getAudioUrl());
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC39999Fmt.class, null);
            ((InterfaceC39999Fmt) LIZJ).setAudioUrl(interfaceC39998Fms.getAudioUrl());
            c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop audio: ");
            LIZ.append(interfaceC39998Fms.getAudioUrl());
            LIZ.append(" error: ");
            LIZ.append(th.getMessage());
            C31626Cb8.LIZ(c37356ElM, 0, X1D.LIZIZ(LIZ), 4);
        }
    }
}
