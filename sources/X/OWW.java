package X;

import com.bytedance.ies.xelement.picker.LynxPickerView;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OWW implements VZ5 {
    public final /* synthetic */ LynxPickerView LIZ;

    public OWW(LynxPickerView lynxPickerView) {
        this.LIZ = lynxPickerView;
    }

    @Override // X.VZ5
    public final void LIZ(String str) {
        LynxPickerView lynxPickerView = this.LIZ;
        if (lynxPickerView.LJZ) {
            VNU lynxContext = lynxPickerView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "change");
            c49615Jdb.LIZJ(str, "value");
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
