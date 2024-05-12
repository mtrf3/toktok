package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gw9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43121Gw9 extends AbstractC43122GwA {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        Object obj;
        Context context;
        o.LJIIIZ(type, "type");
        String content = ((InterfaceC43123GwB) xBaseParamModel).getContent();
        if (content == null || content.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C31626Cb8.LIZ(c37356ElM, 0, "content is empty", 4);
            return;
        }
        try {
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
                obj = C16880lQ.LLILL(context, "clipboard");
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData clipData = ClipData.newPlainText(content, content);
            OHS ohs = C252609vk.LIZ;
            o.LJIIIIZZ(clipData, "clipData");
            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476399128, "bpea-593");
            ohs.getClass();
            OHS.LIZIZ((ClipboardManager) obj, clipData, LJJIIJ);
        } catch (Exception unused) {
            C31626Cb8.LIZ(c37356ElM, 0, "", 4);
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC43124GwC.class, null), "");
    }
}
