package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS15S0101000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ae7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94259ae7 extends AbstractC029409q<C94258ae6> {
    public List<C94383ag7> LJLIL = C61878OQg.INSTANCE;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94258ae6 c94258ae6, int i) {
        C94258ae6 holder = c94258ae6;
        o.LJIIIZ(holder, "holder");
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        String str = ((C94383ag7) ListProtector.get(this.LJLIL, i)).LJLIL;
        ImageView imageView = holder.LJLIL;
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.CENTER_INSIDE);
        c94019aaF.LJI = true;
        c94019aaF.LIZ(R.drawable.dfw);
        imageLoaderService.compatLoadBitmap(context, str, imageView, new C94020aaG(c94019aaF), null);
        if (i == this.LJLIL.size() - 1) {
            View view2 = holder.itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
        }
        TextView textView = holder.LJLILLLLZI;
        View view3 = holder.itemView;
        o.LJIIIIZZ(view3, "holder.itemView");
        Context context2 = view3.getContext();
        o.LJIIIIZZ(context2, "holder.itemView.context");
        textView.setText(C93848aXU.LIZ(context2, ((C94383ag7) ListProtector.get(this.LJLIL, i)).LJLJI));
        View view4 = holder.itemView;
        o.LJIIIIZZ(view4, "holder.itemView");
        C93750aVu.LIZ(view4, 800L, new IDqS15S0101000_42(this, i, 3));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94258ae6 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        RecyclerView recyclerView = (RecyclerView) parent;
        LinearLayout linearLayout = new LinearLayout(recyclerView.getContext());
        linearLayout.setLayoutParams(C93902aYM.LJ(recyclerView, C93742aVm.LIZIZ(56), 0, 0, null, Integer.valueOf(C93742aVm.LIZIZ(12)), 124));
        C94653akT attrBlock = C94653akT.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(linearLayout);
        C94258ae6 c94258ae6 = new C94258ae6(linearLayout);
        c94258ae6.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94258ae6.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94258ae6.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94258ae6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94258ae6.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94258ae6.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94258ae6.class.getName();
        return c94258ae6;
    }
}
