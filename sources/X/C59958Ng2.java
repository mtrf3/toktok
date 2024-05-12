package X;

import android.content.Context;
import android.view.View;
import com.lynx.tasm.TemplateData;

/* renamed from: X.Ng2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59958Ng2 implements InterfaceC60819Ntv {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ TemplateData LJLILLLLZI;

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        if (interfaceC60710NsA instanceof C60606NqU) {
            if (C52202KeE.LIZ) {
                C60606NqU c60606NqU = (C60606NqU) interfaceC60710NsA;
                c60606NqU.LJI = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(KL2.LJIIJJI(this.LJLIL), 1073741824));
                c60606NqU.LJFF = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
                C59815Ndj c59815Ndj = new C59815Ndj();
                c59815Ndj.LIZIZ = Integer.valueOf(EnumC59959Ng3.PART_ON_LAYOUT.id());
                c59815Ndj.LIZ = Boolean.TRUE;
                c60606NqU.LJJIII = c59815Ndj;
            }
            ((C60606NqU) interfaceC60710NsA).LJIIIIZZ = this.LJLILLLLZI;
        }
    }

    public C59958Ng2(Context context, TemplateData templateData) {
        this.LJLIL = context;
        this.LJLILLLLZI = templateData;
    }
}
