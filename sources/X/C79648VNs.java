package X;

import android.graphics.Rect;
import android.view.View;
import com.lynx.tasm.behavior.ui.UIGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.VNs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79648VNs extends AbstractC65781Prl implements InterfaceC88471Ynr<VNS, Rect, C76800UCe> {
    public final /* synthetic */ C79678VOw LJLIL;
    public final /* synthetic */ Rect LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ VJI LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79648VNs(C79678VOw c79678VOw, Rect rect, View view, VJI vji) {
        super(2);
        this.LJLIL = c79678VOw;
        this.LJLILLLLZI = rect;
        this.LJLJI = view;
        this.LJLJJI = vji;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VNS vns, Rect rect) {
        VNS v = vns;
        Rect bound = rect;
        o.LJIIJ(v, "v");
        o.LJIIJ(bound, "bound");
        int i = bound.left;
        Rect rect2 = this.LJLILLLLZI;
        int i2 = i - rect2.left;
        int i3 = bound.top - rect2.top;
        C79678VOw c79678VOw = this.LJLIL;
        VJI vji = this.LJLJJI;
        UIGroup<VOT> lynxUIRoot = v.getLynxUIRoot();
        o.LJFF(lynxUIRoot, "v.lynxUIRoot");
        int width = v.getWidth() + i2;
        int height = v.getHeight() + i3;
        c79678VOw.getClass();
        C79678VOw.LIZIZ(vji, lynxUIRoot, 0, 0, i2, i3, width, height);
        return C76800UCe.LIZ;
    }
}
