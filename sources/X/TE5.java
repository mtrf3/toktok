package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TE5 extends AbstractC65781Prl implements InterfaceC65784Pro<C3XH> {
    public static final TE5 LJLIL = new TE5();

    public TE5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3XH] */
    @Override // X.InterfaceC65784Pro
    public final C3XH invoke() {
        return new AbstractC029409q<C3XI>() { // from class: X.3XH
            public static final /* synthetic */ int LJLILLLLZI = 0;
            public final int LJLIL = R.string.fzy;

            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return 1;
            }

            @Override // X.AbstractC029409q
            public final int getItemViewType(int i) {
                return R.layout.ate;
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(C3XI c3xi, int i) {
                C3XI holder = c3xi;
                o.LJIIIZ(holder, "holder");
                holder.LJLIL.setText(this.LJLIL);
            }

            @Override // X.AbstractC029409q
            public final C3XI onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ate, viewGroup, false);
                o.LJIIIIZZ(view, "view");
                C3XI c3xi = new C3XI(view);
                C0AX.LIZ(viewGroup, c3xi.itemView, R.id.lj7);
                View view2 = c3xi.itemView;
                if (view2 != null) {
                    view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                }
                try {
                    if (c3xi.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C3XI.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c3xi.itemView.getParent();
                            if (viewGroup2 != null) {
                                C16880lQ.LJLLL(c3xi.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C3XI.class.getName();
                return c3xi;
            }
        };
    }
}
