package X;

import com.bytedance.ies.xelement.pickview.LynxPickerViewColumn;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OX1 implements VLJ {
    public final /* synthetic */ LynxPickerViewColumn LIZ;

    public OX1(LynxPickerViewColumn lynxPickerViewColumn) {
        this.LIZ = lynxPickerViewColumn;
    }

    @Override // X.VLJ
    public final void LIZ(int i) {
        LynxPickerViewColumn lynxPickerViewColumn = this.LIZ;
        if (lynxPickerViewColumn.LJLJI) {
            C49615Jdb c49615Jdb = new C49615Jdb(lynxPickerViewColumn.getSign(), "change");
            c49615Jdb.LIZJ(Integer.valueOf(i), "value");
            VNU lynxContext = this.LIZ.mContext;
            o.LJFF(lynxContext, "lynxContext");
            lynxContext.LJLJJL.LIZIZ(c49615Jdb);
        }
    }
}
