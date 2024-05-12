package X;

import Y.ACListenerS18S0301000_7;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gc6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41878Gc6 extends AbstractC029409q<C41879Gc7> {
    public RecyclerView LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 760));
    public final List<Effect> LJLJI = new ArrayList();
    public int LJLJJI = -1;
    public InterfaceC88472Yns<? super Effect, C76800UCe> LJLJJL;
    public boolean LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLIL = recyclerView;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C41879Gc7 c41879Gc7, int i) {
        C41879Gc7 holder = c41879Gc7;
        o.LJIIIZ(holder, "holder");
        if (((ArrayList) this.LJLJI).size() > i) {
            Effect effect = (Effect) ListProtector.get(this.LJLJI, i);
            holder.LJLILLLLZI.setVisibility(8);
            if (!effect.getIcon_url().getUrl_list().isEmpty()) {
                String thumbnail = (String) ListProtector.get(effect.getIcon_url().getUrl_list(), 0);
                o.LJIIIZ(thumbnail, "thumbnail");
                Context context = holder.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                float LIZ = C44392HbY.LIZ(context, 22.0f);
                S3I s3i = new S3I();
                s3i.LIZ = true;
                s3i.LIZLLL = LIZ;
                S3L s3l = new S3L(s3i);
                holder.LJLIL.setCircleOptions(s3l);
                W5F LJIIIIZZ = W5U.LJIIIIZZ(thumbnail);
                LJIIIIZZ.LIZJ = holder.LJLIL.getContext();
                LJIIIIZZ.LJJIIJ = holder.LJLIL;
                LJIIIIZZ.LJIJJLI = s3l;
                C16880lQ.LLJJJ(LJIIIIZZ);
            }
            C16880lQ.LJIIJ(new ACListenerS18S0301000_7(i, effect, this, holder, 1), holder.itemView);
        }
    }

    @Override // X.AbstractC029409q
    public final C41879Gc7 onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C41879Gc7 c41879Gc7 = new C41879Gc7(C1FL.LIZIZ(parent, R.layout.c70, parent, false, "from(parent.context)\n   …list_item, parent, false)"));
        boolean z = true;
        if (((Number) this.LJLILLLLZI.getValue()).intValue() < O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)) * 6) {
            c41879Gc7.itemView.getLayoutParams().width = C7MY.LIZIZ(47);
            c41879Gc7.itemView.getLayoutParams().height = C7MY.LIZIZ(47);
            View itemView = c41879Gc7.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), C1FJ.LIZIZ(1), C1FJ.LIZIZ(1), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), 16);
        }
        C0AX.LIZ(parent, c41879Gc7.itemView, R.id.lj7);
        View view = c41879Gc7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c41879Gc7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C41879Gc7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c41879Gc7.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c41879Gc7.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C41879Gc7.class.getName();
        return c41879Gc7;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C41879Gc7 c41879Gc7, int i, List payloads) {
        C41879Gc7 holder = c41879Gc7;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        Object LJLLLL = ORZ.LJLLLL(payloads);
        if (LJLLLL != null) {
            if (o.LJ(LJLLLL, 1)) {
                holder.LJLILLLLZI.setVisibility(8);
            } else {
                holder.LJLILLLLZI.setVisibility(0);
                if (this.LJLJJLL) {
                    holder.LJLILLLLZI.setBackgroundTintList(ColorStateList.valueOf(C44384HbQ.LJJJJZ(R.color.abc)));
                } else {
                    holder.LJLILLLLZI.setBackgroundTintList(null);
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
