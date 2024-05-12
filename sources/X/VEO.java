package X;

import Y.ARunnableS33S0200000_14;
import android.text.TextUtils;
import com.lynx.tasm.TemplateAssembler;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class VEO extends QXX {
    public final WeakReference<TemplateAssembler> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ TemplateAssembler LJLJI;

    @Override // X.QXX
    public final void LLLILZJ(VEH<String> veh) {
        if (!C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new ARunnableS33S0200000_14(this, veh, 19));
        } else {
            LLLLZ(veh);
        }
    }

    public final void LLLLZ(VEH<String> veh) {
        VNU vnu;
        TemplateAssembler templateAssembler = this.LJLIL.get();
        if (templateAssembler != null && !templateAssembler.LJII) {
            if (TextUtils.isEmpty(veh.LIZJ) && (vnu = templateAssembler.LJIIJJI.get()) != null) {
                vnu.LJIIJ(this.LJLILLLLZI, "I18nResource", "empty i18n resource return");
                templateAssembler.nativeUpdateI18nResource(this.LJLJI.LIZ, this.LJLILLLLZI, "", -1);
            } else {
                templateAssembler.nativeUpdateI18nResource(this.LJLJI.LIZ, this.LJLILLLLZI, veh.LIZJ, veh.LIZIZ);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VEO(TemplateAssembler templateAssembler, String str) {
        super((Object) null);
        this.LJLJI = templateAssembler;
        this.LJLILLLLZI = str;
        this.LJLIL = new WeakReference<>(templateAssembler);
    }
}
