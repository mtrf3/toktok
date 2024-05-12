package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113564cy extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final List<Bitmap> LJLJI = new ArrayList(7);
    public final int LJLJJI = 1;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size() / this.LJLJJI;
    }

    public C113564cy(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        Bitmap bitmap = (Bitmap) ListProtector.get(this.LJLJI, i);
        View view = holder.itemView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.cqg, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) LLLLIILL;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.LJLILLLLZI;
        layoutParams.width = this.LJLIL;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams);
        C113574cz c113574cz = new C113574cz(imageView);
        C0AX.LIZ(parent, c113574cz.itemView, R.id.lj7);
        View view = c113574cz.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c113574cz.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C113574cz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c113574cz.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c113574cz.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C113574cz.class.getName();
        return c113574cz;
    }
}
