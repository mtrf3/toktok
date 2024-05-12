package X;

import android.text.Editable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qnasearch.ui.QnaSearchComponent$observe$7$1$1", f = "QnaSearchComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ECe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36032ECe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C74137T7t LJLIL;
    public final /* synthetic */ QnaBannerViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36032ECe(C74137T7t c74137T7t, QnaBannerViewModel qnaBannerViewModel, InterfaceC67352kd<? super C36032ECe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c74137T7t;
        this.LJLILLLLZI = qnaBannerViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36032ECe(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ConstraintLayout constraintLayout = this.LJLIL.LIZLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        this.LJLILLLLZI.setState(E84.LJLIL);
        T5T LIZIZ = C74137T7t.LIZIZ(this.LJLIL.LIZLLL);
        if (LIZIZ != null) {
            LIZIZ.setEnabled(true);
            Editable text = LIZIZ.getText();
            if (text != null) {
                text.clear();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
