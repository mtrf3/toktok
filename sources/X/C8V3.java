package X;

import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;

/* renamed from: X.8V3, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8V3<T extends UIContentAssem> extends C7TL<T> {
    public int LJI;
    public transient View LJII;

    @Override // X.C8V1
    public final /* bridge */ /* synthetic */ C8W0 LIZIZ(C8W0 c8w0) {
        UIContentAssem uIContentAssem = (UIContentAssem) c8w0;
        LJFF(uIContentAssem);
        return uIContentAssem;
    }

    public final void LJFF(UIContentAssem uIContentAssem) {
        boolean z;
        uIContentAssem.setConfig(this);
        uIContentAssem.contentLayoutId = this.LJI;
        View view = this.LJII;
        if (view != null) {
            uIContentAssem.setContainerView(view);
        }
        if (this.LIZJ == C8VK.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        uIContentAssem.active = z;
        uIContentAssem.assemTagInternal = this.LIZIZ;
    }
}
