package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder$onFocusChanged$1", f = "SearchInputItemViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238709Yk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SearchInputItemViewHolder LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238709Yk(SearchInputItemViewHolder searchInputItemViewHolder, InterfaceC67352kd<? super C238709Yk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchInputItemViewHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238709Yk(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C141335gf.LIZJ(obj);
        ViewParent parent = this.LJLIL.itemView.getParent();
        o.LJII(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) parent;
        int indexOfChild = recyclerView.indexOfChild(this.LJLIL.itemView);
        int top = this.LJLIL.itemView.getTop();
        if (top > 0 && indexOfChild > 0) {
            ViewParent parent2 = this.LJLIL.itemView.getParent();
            o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent2;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            for (int i2 = indexOfChild; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    int height = childAt.getHeight() + i;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        if (i2 > indexOfChild) {
                            height += marginLayoutParams.topMargin;
                        }
                        height += marginLayoutParams.bottomMargin;
                    }
                    i = height;
                }
                if (i >= viewGroup.getHeight()) {
                    break;
                }
            }
            if (i < recyclerView.getHeight()) {
                this.LJLIL.LJLIL.Gl(recyclerView.getHeight() - i);
            }
        }
        recyclerView.LJLIIIL(0, top);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
