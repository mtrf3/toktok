package X;

import com.bytedance.ies.xelement.picker.LynxPickerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VYf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79921VYf implements InterfaceC79926VYk {
    public final /* synthetic */ LynxPickerView LIZ;
    public final /* synthetic */ List LIZIZ;

    public C79921VYf(LynxPickerView lynxPickerView, List list) {
        this.LIZ = lynxPickerView;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC79926VYk
    public final void onCancel() {
        LynxPickerView lynxPickerView = this.LIZ;
        if (lynxPickerView.LJLZ) {
            VNU lynxContext = lynxPickerView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            lynxContext.LJLJJL.LIZIZ(new C49615Jdb(this.LIZ.getSign(), "cancel"));
        }
    }
}
