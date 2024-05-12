package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.Aj9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractViewOnClickListenerC27027Aj9 extends RecyclerView.ViewHolder implements View.OnClickListener {
    public InterfaceC27028AjA LJLIL;

    public abstract void L(CandInputData candInputData, int i, ViewStyle viewStyle, String str);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractViewOnClickListenerC27027Aj9(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        C16880lQ.LJIIJ(this, itemView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC27028AjA interfaceC27028AjA = this.LJLIL;
        if (interfaceC27028AjA != null) {
            interfaceC27028AjA.onItemClick(getLayoutPosition());
        }
    }
}
