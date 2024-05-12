package X;

import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T7r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74135T7r extends AbstractC28801Bc<C74125T7h, T8F> {
    public final T84 LJLIL;
    public final C37481dY LJLILLLLZI;
    public final MIL LJLJI;
    public final T8T LJLJJI;
    public final T8G LJLJJL;
    public final C38491fB LJLJJLL;
    public final C74127T7j LJLJL;

    public static final void LJLLLLLL(String str) {
        o.LJIIIZ(null, "questionId");
        throw null;
    }

    public /* synthetic */ C74135T7r(C74102T6k c74102T6k) {
        this(c74102T6k, null, null, null, null);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return getItem(i).LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        T8F holder = (T8F) viewHolder;
        o.LJIIIZ(holder, "holder");
        C74125T7h item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        holder.L(item);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder t8h;
        int i2;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        switch (i) {
            case 0:
                t8h = T8E.LIZ(parent);
                break;
            case 1:
                t8h = new T81(C1FL.LIZIZ(parent, R.layout.c_0, parent, false, "from(parent.context).inf…le_layout, parent, false)"));
                break;
            case 2:
                T84 qnaViewHolderClickDelegate = this.LJLIL;
                C37481dY c37481dY = this.LJLILLLLZI;
                MIL mil = this.LJLJI;
                o.LJIIIZ(qnaViewHolderClickDelegate, "qnaViewHolderClickDelegate");
                int LIZ = C00F.LIZ(31744, 0, "qna_layout_optimization_settings", true);
                if (LIZ == 2 || LIZ == 3) {
                    i2 = R.layout.c9y;
                } else {
                    i2 = R.layout.c9w;
                }
                View qnaCellLayout = C28289B8j.LIZ(parent, i2, parent, false);
                o.LJIIIIZZ(qnaCellLayout, "qnaCellLayout");
                Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                t8h = new C74133T7p(qnaViewHolderClickDelegate, qnaCellLayout, context, c37481dY, mil);
                break;
            case 3:
                T84 qnaViewHolderClickDelegate2 = this.LJLIL;
                o.LJIIIZ(qnaViewHolderClickDelegate2, "qnaViewHolderClickDelegate");
                View qnaCellLayout2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.c9k, parent, false);
                o.LJIIIIZZ(qnaCellLayout2, "qnaCellLayout");
                Context context2 = parent.getContext();
                o.LJIIIIZZ(context2, "parent.context");
                t8h = new T87(qnaViewHolderClickDelegate2, qnaCellLayout2, context2);
                break;
            case 4:
                T84 qnaViewHolderClickDelegate3 = this.LJLIL;
                o.LJIIIZ(qnaViewHolderClickDelegate3, "qnaViewHolderClickDelegate");
                View qnaCellLayout3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.c9p, parent, false);
                o.LJIIIIZZ(qnaCellLayout3, "qnaCellLayout");
                t8h = new T88(qnaViewHolderClickDelegate3, qnaCellLayout3);
                break;
            case 5:
                View LIZIZ = C1FL.LIZIZ(parent, R.layout.c9m, parent, false, "from(parent.context).inf…er_layout, parent, false)");
                Context context3 = parent.getContext();
                o.LJIIIIZZ(context3, "parent.context");
                t8h = new C74139T7v(context3, LIZIZ);
                break;
            case 6:
                float dimension = EF7.LIZIZ().getResources().getDimension(R.dimen.n6);
                View LIZ2 = C28289B8j.LIZ(parent, R.layout.c_1, parent, false);
                ViewGroup.LayoutParams layoutParams = LIZ2.getLayoutParams();
                layoutParams.height = (int) (dimension * 1.5f);
                LIZ2.setLayoutParams(layoutParams);
                t8h = new T8K(LIZ2);
                break;
            case 7:
                T8T t8t = this.LJLJJI;
                T8G t8g = this.LJLJJL;
                View LIZ3 = C28289B8j.LIZ(parent, R.layout.c9n, parent, false);
                C16880lQ.LJJJ((TuxIconView) LIZ3.findViewById(R.id.ihy), new ACListenerS46S0200000_12(t8t, t8g, 37));
                LIZ3.findViewById(R.id.iho).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(t8t, t8g, 38)));
                C16880lQ.LJIIJ(new ACListenerS46S0200000_12(t8t, t8g, 39), LIZ3);
                t8h = new T8H(LIZ3);
                break;
            default:
                t8h = T8E.LIZ(parent);
                break;
        }
        C0AX.LIZ(parent, t8h.itemView, R.id.lj7);
        View view = t8h.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (t8h.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(t8h.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) t8h.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(t8h.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = t8h.getClass().getName();
        return t8h;
    }

    public C74135T7r(C74102T6k c74102T6k, C37481dY c37481dY, MIL mil, T8T t8t, T8G t8g) {
        super(T8M.LIZ);
        this.LJLIL = c74102T6k;
        this.LJLILLLLZI = c37481dY;
        this.LJLJI = mil;
        this.LJLJJI = t8t;
        this.LJLJJL = t8g;
        this.LJLJJLL = new C38491fB(3);
        this.LJLJL = new C74127T7j(1);
    }
}
