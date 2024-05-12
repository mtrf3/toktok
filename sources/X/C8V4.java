package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8V4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8V4 extends C8V3<UIContentAssem> implements C8VP {
    public UIContentAssem LJIIIIZZ;

    @Override // X.C8V1, X.C8VP
    public final C8W0 build() {
        UIContentAssem uIContentAssem = this.LJIIIIZZ;
        if (uIContentAssem == null) {
            uIContentAssem = (UIContentAssem) C39557Ffl.LIZ(LIZJ()).newInstance();
        }
        o.LJIIIIZZ(uIContentAssem, "instance ?: type.java.newInstance()");
        LJFF(uIContentAssem);
        return uIContentAssem;
    }
}
