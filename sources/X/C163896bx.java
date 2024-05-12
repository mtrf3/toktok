package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163896bx extends AbstractC65781Prl implements InterfaceC65784Pro<C88623dq> {
    public static final C163896bx LJLIL = new C163896bx();

    public C163896bx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3dq] */
    @Override // X.InterfaceC65784Pro
    public final C88623dq invoke() {
        return new AbstractC28801Bc<Integer, C88643ds>() { // from class: X.3dq
            @Override // X.AbstractC029409q
            public final int getItemViewType(int i) {
                return i;
            }

            {
                C88633dr c88633dr = C88653dt.LIZ;
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(RecyclerView.ViewHolder holderNature, int i) {
                o.LJIIIZ(holderNature, "holderNature");
            }

            @Override // X.AbstractC029409q
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                final View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bdb, viewGroup, false);
                View findViewById = LIZIZ.findViewById(R.id.cf6);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.gp);
                c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(3));
                Context context = findViewById.getContext();
                o.LJIIIIZZ(context, "dotItem.context");
                findViewById.setBackground(c110614Vt.LIZ(context));
                if (i == 0) {
                    ViewGroup.LayoutParams layoutParams = LIZIZ.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart((C74275TDb.LJ(viewGroup.getContext()) - (getItemCount() * LIZIZ.getLayoutParams().width)) / 2);
                    LIZIZ.setLayoutParams(marginLayoutParams);
                    C110614Vt c110614Vt2 = new C110614Vt();
                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.go);
                    c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(3));
                    Context context2 = findViewById.getContext();
                    o.LJIIIIZZ(context2, "dotItem.context");
                    findViewById.setBackground(c110614Vt2.LIZ(context2));
                }
                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(LIZIZ) { // from class: X.3ds
                };
                C0AX.LIZ(viewGroup, viewHolder.itemView, R.id.lj7);
                View view = viewHolder.itemView;
                if (view != null) {
                    view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                }
                try {
                    if (viewHolder.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C88643ds.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                            if (viewGroup2 != null) {
                                C16880lQ.LJLLL(viewHolder.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C88643ds.class.getName();
                return viewHolder;
            }
        };
    }
}
