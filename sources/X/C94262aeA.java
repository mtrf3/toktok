package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS15S0101000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aeA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94262aeA extends AbstractC029409q<C94261ae9> {
    public List<C94383ag7> LJLIL;
    public List<C94383ag7> LJLILLLLZI;
    public final int LJLJI;
    public final /* synthetic */ C93806aWo LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C94262aeA(C93806aWo c93806aWo, int i) {
        this.LJLJJI = c93806aWo;
        this.LJLJI = i;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLIL = c61878OQg;
        this.LJLILLLLZI = c61878OQg;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94261ae9 c94261ae9, int i) {
        float f;
        C94261ae9 holder = c94261ae9;
        o.LJIIIZ(holder, "holder");
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        LinearLayout linearLayout = this.LJLJJI.LJLILLLLZI.LJLIL;
        o.LJIIIIZZ(linearLayout, "binding.root");
        Context context = linearLayout.getContext();
        o.LJIIIIZZ(context, "binding.root.context");
        String str = ((C94383ag7) ListProtector.get(this.LJLIL, i)).LJLIL;
        ImageView imageView = holder.LJLIL;
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
        c94019aaF.LIZ(R.drawable.dfx);
        imageLoaderService.loadBitmap(context, str, imageView, new C94020aaG(c94019aaF));
        Context context2 = this.LJLJJI.getContext();
        o.LJIIIIZZ(context2, "context");
        String LIZ = C93848aXU.LIZ(context2, ((C94383ag7) ListProtector.get(this.LJLIL, i)).LJLJI);
        TextView textView = holder.LJLILLLLZI;
        if (LIZ.length() == 0) {
            LIZ = ((C94383ag7) ListProtector.get(this.LJLIL, i)).LJLILLLLZI;
        }
        textView.setText(LIZ);
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C93750aVu.LIZ(view, 800L, new IDqS15S0101000_42(this, i, 4));
        View view2 = holder.itemView;
        o.LJIIIIZZ(view2, "holder.itemView");
        view2.setClickable(((C94383ag7) ListProtector.get(this.LJLIL, i)).LJLJJI);
        View view3 = holder.itemView;
        o.LJIIIIZZ(view3, "holder.itemView");
        if (((C94383ag7) ListProtector.get(this.LJLIL, i)).LJLJJI) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        view3.setAlpha(f);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94261ae9 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI.getContext()), R.layout.dv2, parent, false);
        C93718aVO c93718aVO = new C93718aVO();
        o.LJIIIIZZ(LLLLIILL, "this");
        c93718aVO.LIZ(LLLLIILL, LLLLIILL);
        C94261ae9 c94261ae9 = new C94261ae9(LLLLIILL);
        c94261ae9.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94261ae9.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94261ae9.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94261ae9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94261ae9.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94261ae9.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94261ae9.class.getName();
        return c94261ae9;
    }
}
