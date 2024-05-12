package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper$onBind$4$7$3", f = "TextInputHelper.kt", l = {273}, m = "invokeSuspend")
/* renamed from: X.Amk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27250Amk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TextInputHelper LJLILLLLZI;
    public final /* synthetic */ C252989wM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27250Amk(TextInputHelper textInputHelper, C252989wM c252989wM, InterfaceC67352kd<? super C27250Amk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = textInputHelper;
        this.LJLJI = c252989wM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27250Amk(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        int i;
        int sumHeight;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LJLILLLLZI.fragment.LJLLILLLL;
            if (keyBoardVisibilityUtil != null && !keyBoardVisibilityUtil.LJLJJI) {
                C252989wM c252989wM = this.LJLJI;
                this.LJLIL = 1;
                if (OUP.LJJIJLIJ(c252989wM, this, true) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        ViewParent parent = this.LJLILLLLZI.targetView.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            TextInputHelper textInputHelper = this.LJLILLLLZI;
            int indexOfChild = recyclerView.indexOfChild(textInputHelper.targetView);
            if (indexOfChild >= 1 && textInputHelper.viewModel.hw0().size() > indexOfChild) {
                int i3 = indexOfChild - 1;
                if (o.LJ(((C27021Aj3) ListProtector.get(textInputHelper.viewModel.hw0(), i3)).LIZ.key, "districts")) {
                    indexOfChild = i3;
                }
            }
            View childAt = recyclerView.getChildAt(indexOfChild);
            if (childAt != null) {
                i = childAt.getTop();
                if (i > 0 && (sumHeight = textInputHelper.sumHeight(indexOfChild)) < recyclerView.getHeight()) {
                    textInputHelper.fragment.Gl(recyclerView.getHeight() - sumHeight);
                }
            } else {
                i = 0;
            }
            recyclerView.LJLIIIL(0, i);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
