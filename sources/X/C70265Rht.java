package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.utils.Au2S3S0201000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rht, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70265Rht extends AbstractC28801Bc<Object, C70266Rhu> {
    public InterfaceC70264Rhs<InterfaceC70269Rhx, InterfaceC70267Rhv<InterfaceC70269Rhx>> LJLIL;
    public final /* synthetic */ C70261Rhp LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70265Rht(C70261Rhp c70261Rhp) {
        super(new C26782AfC());
        this.LJLILLLLZI = c70261Rhp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        InterfaceC70269Rhx interfaceC70269Rhx;
        InterfaceC70264Rhs<InterfaceC70269Rhx, InterfaceC70267Rhv<InterfaceC70269Rhx>> interfaceC70264Rhs;
        ViewGroup viewGroup;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C70266Rhu holder = (C70266Rhu) viewHolder;
        o.LJIIIZ(holder, "holder");
        Object item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        int position = holder.getPosition();
        if (!(item instanceof InterfaceC70269Rhx) || (interfaceC70269Rhx = (InterfaceC70269Rhx) item) == null || (interfaceC70264Rhs = holder.LJLILLLLZI.LJLIL) == null) {
            return;
        }
        InterfaceC70267Rhv<?> interfaceC70267Rhv = holder.LJLIL;
        InterfaceC70267Rhv interfaceC70267Rhv2 = interfaceC70267Rhv;
        if (interfaceC70267Rhv == null) {
            InterfaceC70267Rhv<InterfaceC70269Rhx> LIZ = interfaceC70264Rhs.LIZ(interfaceC70269Rhx);
            View view2 = holder.itemView;
            if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                C70261Rhp c70261Rhp = holder.LJLILLLLZI.LJLILLLLZI;
                if (viewGroup.getChildCount() > 0) {
                    viewGroup.removeAllViews();
                }
                if ((LIZ instanceof View) && (view = (View) LIZ) != null) {
                    viewGroup.addView(view);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMarginEnd(c70261Rhp.LJLILLLLZI);
                    }
                }
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            holder.LJLIL = LIZ;
            interfaceC70267Rhv2 = LIZ;
        }
        interfaceC70267Rhv2.LJJ(interfaceC70269Rhx);
        if (!interfaceC70269Rhx.isEnable()) {
            interfaceC70267Rhv2.LJJIII();
        } else if (interfaceC70269Rhx.LIZ()) {
            holder.LJLILLLLZI.LJLILLLLZI.LJLJJLL = position;
            interfaceC70267Rhv2.LJJIFFI();
        } else {
            interfaceC70267Rhv2.LJFF();
        }
        C16880lQ.LJIIJ(new Au2S3S0201000_12(interfaceC70269Rhx, holder.LJLILLLLZI.LJLILLLLZI, position, 7), (View) interfaceC70267Rhv2);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C70266Rhu c70266Rhu = new C70266Rhu(this);
        C0AX.LIZ(parent, c70266Rhu.itemView, R.id.lj7);
        View view = c70266Rhu.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c70266Rhu.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C70266Rhu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c70266Rhu.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c70266Rhu.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C70266Rhu.class.getName();
        return c70266Rhu;
    }
}
