package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* renamed from: X.4qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122194qt extends AbstractC65781Prl implements InterfaceC88472Yns<C122034qd, C76800UCe> {
    public final /* synthetic */ C124074tv LJLIL;
    public final /* synthetic */ C143265jm LJLILLLLZI;
    public final /* synthetic */ FilterBean LJLJI;
    public final /* synthetic */ FilterBean LJLJJI;
    public final /* synthetic */ float LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C122194qt(C124074tv c124074tv, C143265jm c143265jm, FilterBean filterBean, FilterBean filterBean2, float f) {
        super(1);
        this.LJLIL = c124074tv;
        this.LJLILLLLZI = c143265jm;
        this.LJLJI = filterBean;
        this.LJLJJI = filterBean2;
        this.LJLJJL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C122034qd c122034qd) {
        C122034qd editorPro = c122034qd;
        o.LJIIIZ(editorPro, "editorPro");
        C121584pu c121584pu = new C121584pu(EnumC121554pr.COLOR_NO_COMPOSER);
        c121584pu.LIZ = this.LJLJI.getFilterFolder();
        c121584pu.LIZLLL = this.LJLJJI.getFilterFolder();
        c121584pu.LJI = this.LJLJI.getResId();
        c121584pu.LJFF = this.LJLJJL;
        c121584pu.LIZJ = true;
        FilterBean filterBean = this.LJLJI;
        InterfaceC148845sm value = this.LJLILLLLZI.LJLLILLLL().getValue();
        o.LJI(value);
        c121584pu.LIZIZ = TML.LIZJ(filterBean, value, this.LJLIL);
        FilterBean filterBean2 = this.LJLJJI;
        InterfaceC148845sm value2 = this.LJLILLLLZI.LJLLILLLL().getValue();
        o.LJI(value2);
        c121584pu.LJ = TML.LIZJ(filterBean2, value2, this.LJLIL);
        editorPro.LJI().LJJIJIL(c121584pu);
        return C76800UCe.LIZ;
    }
}
