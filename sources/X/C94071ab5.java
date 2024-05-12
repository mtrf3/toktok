package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.featurepage.FeatureFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ab5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94071ab5 extends AbstractC029409q<C94070ab4> {
    public List<? extends AbstractC94512aiC> LJLIL = C61878OQg.INSTANCE;
    public final /* synthetic */ FeatureFragment LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C94071ab5(FeatureFragment featureFragment) {
        this.LJLILLLLZI = featureFragment;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94070ab4 c94070ab4, int i) {
        C94070ab4 holder = c94070ab4;
        o.LJIIIZ(holder, "holder");
        C93794aWc c93794aWc = holder.LJLIL;
        String icon = ((AbstractC94371afv) ListProtector.get(this.LJLIL, i)).LIZJ();
        c93794aWc.getClass();
        o.LJIIIZ(icon, "icon");
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        Context context = c93794aWc.getContext();
        o.LJIIIIZZ(context, "context");
        AppCompatImageView appCompatImageView = c93794aWc.LJLIL;
        if (appCompatImageView != null) {
            C94019aaF c94019aaF = new C94019aaF();
            c94019aaF.LIZIZ(ImageView.ScaleType.CENTER_INSIDE);
            c94019aaF.LIZ = Integer.valueOf(c93794aWc.getHeight());
            c94019aaF.LIZIZ = Integer.valueOf(c93794aWc.getHeight());
            imageLoaderService.compatLoadBitmap(context, icon, appCompatImageView, new C94020aaG(c94019aaF), null);
            return;
        }
        o.LJIJI("iconImage");
        throw null;
    }

    @Override // X.AbstractC029409q
    public final C94070ab4 onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "context");
        C93794aWc c93794aWc = new C93794aWc(context);
        c93794aWc.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        C94070ab4 c94070ab4 = new C94070ab4(c93794aWc);
        c94070ab4.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94070ab4.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94070ab4.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94070ab4.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94070ab4.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94070ab4.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94070ab4.class.getName();
        return c94070ab4;
    }
}
