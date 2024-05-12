package X;

import com.bytedance.ies.xelement.picker.LynxPickerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OWV implements InterfaceC58209Msv {
    public final /* synthetic */ LynxPickerView LIZ;

    public OWV(LynxPickerView lynxPickerView) {
        this.LIZ = lynxPickerView;
    }

    @Override // X.InterfaceC58209Msv
    public final void LIZ(List<Integer> list) {
        LynxPickerView lynxPickerView = this.LIZ;
        if (lynxPickerView.LJZ) {
            VNU lynxContext = lynxPickerView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "change");
            c49615Jdb.LIZJ(list, "value");
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
