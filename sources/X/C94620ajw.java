package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.foundation.image.ImageLoaderService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ajw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94620ajw extends AbstractC94454ahG {
    public final InterfaceC88471Ynr<C94033aaT, C94620ajw, C76800UCe> LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C94620ajw(InterfaceC88471Ynr<? super C94033aaT, ? super C94620ajw, C76800UCe> interfaceC88471Ynr) {
        this.LJLJI = interfaceC88471Ynr;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String string;
        int i2;
        o.LJIIIZ(holder, "holder");
        C94033aaT c94033aaT = (C94033aaT) ListProtector.get(this.LJLIL, i);
        View view = holder.itemView;
        ImageLoaderService imageLoaderService = ImageLoaderService.INSTANCE;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        String str = c94033aaT.LIZIZ;
        View findViewById = view.findViewById(R.id.nne);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_effect_kind_icon)");
        C94019aaF c94019aaF = new C94019aaF();
        c94019aaF.LIZIZ(ImageView.ScaleType.CENTER_CROP);
        c94019aaF.LIZ(R.drawable.dfx);
        imageLoaderService.loadBitmap(context, str, (ImageView) findViewById, new C94020aaG(c94019aaF));
        View findViewById2 = view.findViewById(R.id.npo);
        o.LJIIIIZZ(findViewById2, "findViewById<TextView>(R.id.tv_effect_kind_name)");
        ((TextView) findViewById2).setText(c94033aaT.LIZJ);
        TextView textView = (TextView) view.findViewById(R.id.npn);
        Context context2 = textView.getContext();
        o.LJIIIIZZ(context2, "context");
        String key = c94033aaT.LJFF;
        o.LJIIIZ(key, "key");
        if (!ujb.o.LJJJLIIL(key, "effect_tool_", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("effect_tool_");
            LIZ.append(key);
            key = X1D.LIZIZ(LIZ);
        }
        int hashCode = key.hashCode();
        if (hashCode != -1743461890) {
            if (hashCode != -1649410762) {
                if (hashCode == -783226715 && key.equals("effect_tool_template_intermediate")) {
                    string = context2.getResources().getString(R.string.fy2);
                    o.LJIIIIZZ(string, "context.resources.getStr…ol_template_intermediate)");
                }
                string = "";
            } else {
                if (key.equals("effect_tool_template_Advance")) {
                    string = context2.getResources().getString(R.string.tzk);
                    o.LJIIIIZZ(string, "context.resources.getStr…ct_tool_template_Advance)");
                }
                string = "";
            }
        } else {
            if (key.equals("effect_tool_template_beginner")) {
                string = context2.getResources().getString(R.string.fy1);
                o.LJIIIIZZ(string, "context.resources.getStr…t_tool_template_beginner)");
            }
            string = "";
        }
        textView.setText(string);
        try {
            i2 = Color.parseColor(c94033aaT.LJI);
        } catch (Exception unused) {
            i2 = -1;
        }
        textView.setTextColor(i2);
        C93750aVu.LIZ(view, 800L, new IDqS175S0200000_42(c94033aaT, this, 11));
        StatisticReporter LIZ2 = C93670aUc.LIZ();
        if (LIZ2 != null) {
            LIZ2.onEvent("addsheet_template_show", C51029K0z.LJJIIZI(new OSZ("template_id", c94033aaT.LJ)));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.dvt, parent, false);
        float LIZ = C93410aQQ.LIZ(8.0f);
        View findViewById = LLLLIILL.findViewById(R.id.b5l);
        o.LJIIIIZZ(findViewById, "findViewById<View>(R.id.card_container)");
        findViewById.setBackground(C93787aWV.LIZ(LIZ, LIZ, LIZ, LIZ, C04330Ez.LIZIZ(LLLLIILL.getContext(), R.color.adm), C04330Ez.LIZIZ(LLLLIILL.getContext(), R.color.ado)));
        View findViewById2 = LLLLIILL.findViewById(R.id.eb4);
        o.LJIIIIZZ(findViewById2, "item.findViewById(R.id.icon_container)");
        C94453ahF c94453ahF = new C94453ahF((FrameLayout) LLLLIILL, (ViewGroup) findViewById2);
        c94453ahF.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94453ahF.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94453ahF.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94453ahF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94453ahF.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94453ahF.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94453ahF.class.getName();
        return c94453ahF;
    }
}
