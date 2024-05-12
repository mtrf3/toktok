package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS15S0101000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.agC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94388agC extends AbstractC029409q<C94387agB> {
    public List<String> LJLIL = C61878OQg.INSTANCE;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C94388agC(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94387agB c94387agB, int i) {
        C94387agB holder = c94387agB;
        o.LJIIIZ(holder, "holder");
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        String str = (String) ListProtector.get(this.LJLIL, i);
        ImageView imageView = holder.LJLIL;
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.CENTER_CROP);
        c94019aaF.LIZ(R.drawable.dfx);
        imageLoaderService.loadBitmap(context, str, imageView, new C94020aaG(c94019aaF));
        View view2 = holder.itemView;
        o.LJIIIIZZ(view2, "holder.itemView");
        C93750aVu.LIZ(view2, 800L, new IDqS15S0101000_42(this, i, 5));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94387agB com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dvj, parent, false);
        o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(pare…l_picture, parent, false)");
        C94387agB c94387agB = new C94387agB(LLLLIILL);
        c94387agB.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94387agB.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94387agB.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94387agB.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94387agB.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94387agB.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94387agB.class.getName();
        return c94387agB;
    }
}
