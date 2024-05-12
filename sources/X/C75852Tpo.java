package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tpo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75852Tpo {
    public static final ConcurrentHashMap<String, InterfaceC75855Tpr> LIZ = new ConcurrentHashMap<>();

    public static final void LIZIZ() {
        for (Map.Entry<String, InterfaceC75855Tpr> entry : LIZ.entrySet()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("clear tag = ");
            LIZ2.append(entry.getValue().tag());
            LIZ2.append(", dialog = ");
            LIZ2.append(entry.getValue());
            C0NB.LJIIIZ("CoHostDialogManager", X1D.LIZIZ(LIZ2));
            entry.getValue().dismiss();
        }
        LIZ.clear();
    }

    public static final InteractDialogFragmentBaseContract$AbsView LIZJ() {
        InterfaceC76094Tti xl;
        InterfaceC75855Tpr interfaceC75855Tpr = LIZ.get("LinkDialog");
        if (interfaceC75855Tpr instanceof C75853Tpp) {
            InterfaceC75854Tpq interfaceC75854Tpq = ((C75853Tpp) interfaceC75855Tpr).LIZIZ;
            if ((interfaceC75854Tpq instanceof LinkDialog) && (xl = ((LinkDialog) interfaceC75854Tpq).xl()) != null) {
                return xl.LIZJ();
            }
        }
        return null;
    }

    public static final boolean LIZLLL() {
        InterfaceC75855Tpr interfaceC75855Tpr = LIZ.get("LinkDialog");
        if (interfaceC75855Tpr != null && interfaceC75855Tpr.isVisible()) {
            return true;
        }
        return false;
    }

    public static final void LIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dismiss tag = ");
        LIZ2.append(tag);
        LIZ2.append(", dialog = ");
        ConcurrentHashMap<String, InterfaceC75855Tpr> concurrentHashMap = LIZ;
        LIZ2.append(concurrentHashMap.get(tag));
        C0NB.LJIIIZ("CoHostDialogManager", X1D.LIZIZ(LIZ2));
        InterfaceC75855Tpr interfaceC75855Tpr = concurrentHashMap.get(tag);
        if (interfaceC75855Tpr != null) {
            interfaceC75855Tpr.dismiss();
        }
        concurrentHashMap.remove(tag);
    }

    public static final void LJ(InterfaceC75855Tpr interfaceC75855Tpr) {
        ConcurrentHashMap<String, InterfaceC75855Tpr> concurrentHashMap = LIZ;
        InterfaceC75855Tpr interfaceC75855Tpr2 = concurrentHashMap.get(interfaceC75855Tpr.tag());
        if (interfaceC75855Tpr2 != null) {
            interfaceC75855Tpr2.dismiss();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("add tag = ");
        LIZ2.append(interfaceC75855Tpr.tag());
        LIZ2.append(", dialog = ");
        LIZ2.append(interfaceC75855Tpr);
        C0NB.LJIIIZ("CoHostDialogManager", X1D.LIZIZ(LIZ2));
        concurrentHashMap.put(interfaceC75855Tpr.tag(), interfaceC75855Tpr);
        interfaceC75855Tpr.LIZ(new AqS163S0100000_13(interfaceC75855Tpr, 324));
        interfaceC75855Tpr.show();
    }
}
