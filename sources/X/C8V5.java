package X;

import com.bytedance.assem.arch.view.UISlotAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8V5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8V5 extends C8V2<UISlotAssem> implements C8VP {
    public UISlotAssem LJIIIZ;

    @Override // X.C8V1, X.C8VP
    public final C8W0 build() {
        UISlotAssem uISlotAssem = this.LJIIIZ;
        if (uISlotAssem == null) {
            uISlotAssem = (UISlotAssem) C39557Ffl.LIZ(LIZJ()).newInstance();
        }
        o.LJIIIIZZ(uISlotAssem, "instance ?: type.java.newInstance()");
        LJFF(uISlotAssem);
        return uISlotAssem;
    }
}
