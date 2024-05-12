package X;

import com.bytedance.ies.xelement.picker.LynxPickerView;
import kotlin.jvm.internal.o;

/* renamed from: X.VPw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79704VPw implements VID {
    public final /* synthetic */ LynxPickerView LIZ;

    public C79704VPw(LynxPickerView lynxPickerView) {
        this.LIZ = lynxPickerView;
    }

    @Override // X.VID
    public final void LIZ(int i, Integer num) {
        LynxPickerView lynxPickerView = this.LIZ;
        if (lynxPickerView.LJZI) {
            VNU lynxContext = lynxPickerView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "columnchange");
            c49615Jdb.LIZJ(Integer.valueOf(i), "column");
            c49615Jdb.LIZJ(num, "value");
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
