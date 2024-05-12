package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105854Dl extends AbstractC029409q<C105884Do> {
    public final Context LJLIL;
    public final List<AbstractC105864Dm> LJLILLLLZI = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C105854Dl(Context context) {
        this.LJLIL = context;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C105884Do holder, int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        o.LJIIIZ(holder, "holder");
        AbstractC105864Dm action = (AbstractC105864Dm) ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIZ(action, "action");
        TuxIconView tuxIconView = (TuxIconView) holder.itemView.findViewById(R.id.o9);
        TuxTextView tuxTextView = (TuxTextView) holder.itemView.findViewById(R.id.oc);
        Drawable background = holder.itemView.findViewById(R.id.o_).getBackground();
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Integer LJI = C79045V0n.LJI(C49R.LIZ().LJLIL, context);
        if (LJI != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(LJI.intValue(), PorterDuff.Mode.SRC_OVER);
        } else {
            porterDuffColorFilter = null;
        }
        background.setColorFilter(porterDuffColorFilter);
        C16880lQ.LJIIJ(action.LIZ(), holder.itemView);
        tuxIconView.setTuxIcon(action.LIZIZ());
        tuxTextView.setText(holder.itemView.getContext().getString(action.LJI()));
        tuxTextView.setTextColorRes(action.LJFF());
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(action.LIZLLL())));
        layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(action.LIZJ())));
        tuxIconView.setLayoutParams(layoutParams);
        if (getItemCount() <= 3) {
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, X.4Do] */
    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C105884Do com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = this.LJLIL;
        o.LJIIIZ(context, "context");
        final View LIZLLL = AnonymousClass030.LIZLLL(context, R.layout.b6p, parent, false, "from(context).inflate(R.…_bar_item, parent, false)");
        ?? r2 = new RecyclerView.ViewHolder(LIZLLL) { // from class: X.4Do
            public static final /* synthetic */ int LJLIL = 0;
        };
        C0AX.LIZ(parent, r2.itemView, R.id.lj7);
        View view = r2.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (r2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C105884Do.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) r2.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(r2.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C105884Do.class.getName();
        return r2;
    }
}
