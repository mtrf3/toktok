package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ada, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94226ada extends AbstractC029409q<C94225adZ> {
    public final Context LJLIL;
    public final List<C93474aRS> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<C93474aRS> list = this.LJLILLLLZI;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            i = this.LJLILLLLZI.size();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" GridRecyAdapter  size = ");
        LIZ.append(i);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        return i;
    }

    public C94226ada(Context context, List<C93474aRS> dataList) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataList, "dataList");
        this.LJLIL = context;
        this.LJLILLLLZI = dataList;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94225adZ c94225adZ, int i) {
        C94225adZ holder = c94225adZ;
        o.LJIIIZ(holder, "holder");
        File file = new File(((C93474aRS) ListProtector.get(this.LJLILLLLZI, i)).LIZ);
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
        c94019aaF.LIZ(R.drawable.dfx);
        C94020aaG c94020aaG = new C94020aaG(c94019aaF);
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        if (imageLoaderService != null) {
            imageLoaderService.loadFile(this.LJLIL, file, holder.LJLIL, c94020aaG);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94225adZ com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        ImageView imageView = new ImageView(this.LJLIL);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(48))));
        imageView.setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        C94225adZ c94225adZ = new C94225adZ(imageView);
        c94225adZ.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94225adZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94225adZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94225adZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94225adZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94225adZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94225adZ.class.getName();
        return c94225adZ;
    }
}
