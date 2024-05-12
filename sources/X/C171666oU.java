package X;

import android.content.Context;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import java.util.List;

/* renamed from: X.6oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171666oU extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ List<C171726oa> LJLILLLLZI;
    public final /* synthetic */ List<C171726oa> LJLJI;
    public final /* synthetic */ C56K LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ InterfaceC171716oZ LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171666oU(NLECutCompressActivity nLECutCompressActivity, List list, List list2, C56K c56k, float f, C171706oY c171706oY) {
        super(1);
        this.LJLIL = nLECutCompressActivity;
        this.LJLILLLLZI = list;
        this.LJLJI = list2;
        this.LJLJJI = c56k;
        this.LJLJJL = f;
        this.LJLJJLL = c171706oY;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C171656oT.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI.element, this.LJLJJL, this.LJLJJLL);
        } else {
            this.LJLJJLL.LIZIZ(new C171736ob("resize video failed"));
        }
        return C76800UCe.LIZ;
    }
}
