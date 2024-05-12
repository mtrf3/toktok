package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Cht, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32045Cht extends AbstractC32046Chu {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC32047Chv interfaceC32047Chv = (InterfaceC32047Chv) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            C12830et c12830et = C12840eu.LIZ.LIZ.get(CastLongProtector.parseLong(interfaceC32047Chv.getSheetStackToken()));
            if (c12830et != null) {
                c12830et.LIZ();
            }
        } catch (Throwable unused) {
        }
    }
}
