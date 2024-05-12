package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFloat;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ad9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94199ad9 extends AbstractC93422aQc<UIAnnotationFloat, C94198ad8> {
    public InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.AbstractC93422aQc
    public final C94198ad8 LIZIZ(RecyclerView parent) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dvo, parent, false);
        o.LJIIIIZZ(view, "view");
        return new C94198ad8(this, view);
    }

    @Override // X.AbstractC93422aQc
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        UIAnnotationFloat data = (UIAnnotationFloat) obj;
        C94198ad8 viewHolder2 = (C94198ad8) viewHolder;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder2, "viewHolder");
        viewHolder2.LJLJJL = data;
        TextView textView = viewHolder2.LJLILLLLZI;
        String name = data.getName();
        o.LJIIIIZZ(name, "data.name");
        View itemView = viewHolder2.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        Context context = itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        View itemView2 = viewHolder2.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        Resources resources = itemView2.getResources();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AME_editEffect_inspector_");
        LIZ.append(name);
        int identifier = resources.getIdentifier(X1D.LIZIZ(LIZ), "string", context.getPackageName());
        if (identifier > 0) {
            View itemView3 = viewHolder2.itemView;
            o.LJIIIIZZ(itemView3, "itemView");
            name = itemView3.getResources().getString(identifier);
            o.LJIIIIZZ(name, "itemView.resources.getString(stringResId)");
        }
        textView.setText(name);
        viewHolder2.LJLJJLL = (int) (data.getMinValue() * viewHolder2.LJLIL);
        viewHolder2.LJLJL = (int) (data.getMaxValue() * viewHolder2.LJLIL);
        viewHolder2.LJLJJI.setProgress(((int) (data.getCurrentValue() * viewHolder2.LJLIL)) - viewHolder2.LJLJJLL);
        viewHolder2.LJLJJI.setMax(viewHolder2.LJLJL - viewHolder2.LJLJJLL);
        viewHolder2.LJLJI.setText(C94198ad8.L(data));
    }
}
