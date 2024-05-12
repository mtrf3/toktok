package X;

import android.view.View;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder;
import java.util.ArrayList;

/* renamed from: X.NhS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60046NhS extends AbstractC60815Ntr {
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;

    public C60046NhS(java.util.Map<String, ? extends Object> map) {
        this.LJLILLLLZI = map;
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        C60606NqU c60606NqU;
        if (!(interfaceC60710NsA instanceof C60606NqU) || (c60606NqU = (C60606NqU) interfaceC60710NsA) == null) {
            return;
        }
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AbsKitInitParamHandler invoke  lynxClientSize = ");
        LIZ.append(((ArrayList) ((C60606NqU) interfaceC60710NsA).LJJ).size());
        C34B.LIZIZ(str, X1D.LIZIZ(LIZ));
        c60606NqU.LJIIIIZZ = TemplateData.LJ(this.LJLILLLLZI);
        if (((Number) C52709KmP.LIZ.getValue()).intValue() == 1) {
            c60606NqU.LJI = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
            c60606NqU.LJFF = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
            C59815Ndj c59815Ndj = new C59815Ndj();
            c59815Ndj.LIZIZ = Integer.valueOf(EnumC59959Ng3.PART_ON_LAYOUT.id());
            c59815Ndj.LIZ = Boolean.TRUE;
            c60606NqU.LJJIII = c59815Ndj;
        }
    }
}
