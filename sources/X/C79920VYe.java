package X;

import com.bytedance.ies.xelement.picker.LynxPickerView;
import kotlin.jvm.internal.o;

/* renamed from: X.VYe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79920VYe implements InterfaceC79926VYk {
    public final /* synthetic */ LynxPickerView LIZ;

    public C79920VYe(LynxPickerView lynxPickerView) {
        this.LIZ = lynxPickerView;
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
