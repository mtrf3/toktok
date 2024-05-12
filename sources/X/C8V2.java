package X;

import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;

/* renamed from: X.8V2, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8V2<T extends UISlotAssem> extends C7TL<T> {
    public int LJI;
    public transient View LJII;
    public C212518Vr LJIIIIZZ = C212518Vr.LIZ;

    @Override // X.C8V1
    public final /* bridge */ /* synthetic */ C8W0 LIZIZ(C8W0 c8w0) {
        UISlotAssem uISlotAssem = (UISlotAssem) c8w0;
        LJFF(uISlotAssem);
        return uISlotAssem;
    }

    public final void LJFF(UISlotAssem uISlotAssem) {
        boolean z;
        uISlotAssem.setConfig(this);
        uISlotAssem.LJLIL = this.LJI;
        uISlotAssem.F3(this.LJIIIIZZ);
        View view = this.LJII;
        if (view != null) {
            uISlotAssem.E3(view);
        }
        if (this.LIZJ == C8VK.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        uISlotAssem.active = z;
        uISlotAssem.assemTagInternal = this.LIZIZ;
    }
}
