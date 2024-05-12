package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.featurepage.FeatureFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS15S0101000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ab3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94069ab3 extends AbstractC029409q<C94068ab2> {
    public List<? extends AbstractC94512aiC> LJLIL = C61878OQg.INSTANCE;
    public final /* synthetic */ FeatureFragment LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C94069ab3(FeatureFragment featureFragment) {
        this.LJLILLLLZI = featureFragment;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94068ab2 c94068ab2, int i) {
        boolean z;
        C94068ab2 holder = c94068ab2;
        o.LJIIIZ(holder, "holder");
        C93795aWd c93795aWd = holder.LJLIL;
        AbstractC94371afv objectItemData = (AbstractC94371afv) ListProtector.get(this.LJLIL, i);
        List<AbstractC94512aiC> value = this.LJLILLLLZI.Hl().LJLJI.LIZ.getValue();
        if (value != null) {
            z = value.contains(ListProtector.get(this.LJLIL, i));
        } else {
            z = false;
        }
        boolean Il = this.LJLILLLLZI.Il();
        IDqS15S0101000_42 iDqS15S0101000_42 = new IDqS15S0101000_42(this, i, 1);
        c93795aWd.getClass();
        o.LJIIIZ(objectItemData, "objectItemData");
        if (Il) {
            View view = c93795aWd.LJLIL.LJLJJI;
            o.LJIIIIZZ(view, "binding.vSelect");
            view.setBackground(c93795aWd.getContext().getDrawable(R.drawable.dfs));
        } else {
            View view2 = c93795aWd.LJLIL.LJLJJI;
            o.LJIIIIZZ(view2, "binding.vSelect");
            view2.setBackground(c93795aWd.getContext().getDrawable(R.drawable.dfn));
        }
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        Context context = c93795aWd.getContext();
        o.LJIIIIZZ(context, "context");
        String LIZJ = objectItemData.LIZJ();
        C94163acZ c94163acZ = c93795aWd.LJLIL.LJLILLLLZI;
        o.LJIIIIZZ(c94163acZ, "binding.ivIcon");
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.FIT_CENTER);
        c94019aaF.LIZ = Integer.valueOf(c93795aWd.getHeight());
        c94019aaF.LIZIZ = Integer.valueOf(c93795aWd.getHeight());
        c94019aaF.LIZ(R.drawable.dfx);
        imageLoaderService.compatLoadBitmap(context, LIZJ, c94163acZ, new C94020aaG(c94019aaF), null);
        TextView textView = c93795aWd.LJLIL.LJLJI;
        o.LJIIIIZZ(textView, "binding.tvObjectName");
        textView.setText(objectItemData.LIZLLL());
        LinearLayout linearLayout = c93795aWd.LJLIL.LJLIL;
        o.LJIIIIZZ(linearLayout, "binding.root");
        linearLayout.setSelected(z);
        View view3 = c93795aWd.LJLIL.LJLJJI;
        o.LJIIIIZZ(view3, "binding.vSelect");
        view3.setSelected(z);
        c93795aWd.LJLILLLLZI = iDqS15S0101000_42;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94068ab2 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C93795aWd c93795aWd = new C93795aWd(context);
        c93795aWd.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C94068ab2 c94068ab2 = new C94068ab2(c93795aWd);
        c94068ab2.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94068ab2.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94068ab2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94068ab2.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94068ab2.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94068ab2.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94068ab2.class.getName();
        return c94068ab2;
    }
}
