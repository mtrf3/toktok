package X;

import com.bytedance.ies.xelement.picker.LynxPickerView;
import java.util.List;

/* renamed from: X.Mw6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58406Mw6 implements InterfaceC58352MvE {
    public final /* synthetic */ LynxPickerView LJLIL;
    public final /* synthetic */ List LJLILLLLZI;

    @Override // X.InterfaceC58352MvE
    public final java.util.Map<String, String> LIZ() {
        OSZ[] oszArr = new OSZ[2];
        String str = this.LJLIL.LJLL;
        if (str == null) {
            str = "Confirm";
        }
        oszArr[0] = new OSZ("confirm", str);
        String str2 = this.LJLIL.LJLLI;
        if (str2 == null) {
            str2 = "Cancel";
        }
        oszArr[1] = new OSZ("cancel", str2);
        return C113554cx.LJJL(oszArr);
    }

    public C58406Mw6(LynxPickerView lynxPickerView, List list) {
        this.LJLIL = lynxPickerView;
        this.LJLILLLLZI = list;
    }
}
