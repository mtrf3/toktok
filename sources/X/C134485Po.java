package X;

import Y.ACListenerS37S0200000_2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5Po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134485Po extends AbstractC029409q<C134505Pq> {
    public final Context LJLIL;
    public InterfaceC134575Px LJLJI;
    public final ArrayList<C134535Pt> LJLILLLLZI = new ArrayList<>();
    public C5PL LJLJJI = C5PL.FREE;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C134485Po(Context context) {
        this.LJLIL = context;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C134505Pq c134505Pq, int i) {
        C134505Pq holder = c134505Pq;
        o.LJIIIZ(holder, "holder");
        Object obj = ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIIZZ(obj, "data[position]");
        C134535Pt c134535Pt = (C134535Pt) obj;
        TuxTextView tuxTextView = holder.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(c134535Pt.LIZ);
        }
        C134425Pi c134425Pi = new C134425Pi();
        C5PL cropMode = c134535Pt.LIZIZ;
        o.LJIIIZ(cropMode, "cropMode");
        c134425Pi.LIZIZ = cropMode;
        if (this.LJLJJI == c134535Pt.LIZIZ) {
            Integer LJI = C79045V0n.LJI(R.attr.eb, this.LJLIL);
            if (LJI != null) {
                int intValue = LJI.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                if (valueOf != null) {
                    valueOf.intValue();
                    c134425Pi.LIZ.setColor(valueOf.intValue());
                }
                TuxTextView tuxTextView2 = holder.LJLIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColor(intValue);
                }
            }
        } else {
            Integer LJI2 = C79045V0n.LJI(R.attr.dj, this.LJLIL);
            if (LJI2 != null) {
                int intValue2 = LJI2.intValue();
                Integer valueOf2 = Integer.valueOf(intValue2);
                if (valueOf2 != null) {
                    valueOf2.intValue();
                    c134425Pi.LIZ.setColor(valueOf2.intValue());
                }
                TuxTextView tuxTextView3 = holder.LJLIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColor(intValue2);
                }
            }
        }
        AppCompatImageView appCompatImageView = holder.LJLILLLLZI;
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(c134425Pi);
        }
        C16880lQ.LJIIJ(new ACListenerS37S0200000_2(this, c134535Pt, 0), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C134505Pq com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.asg, viewGroup, false);
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent.context");
        LIZIZ.setLayoutParams(new RecyclerView.LayoutParams((C63081OpJ.LJJJJL(context) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(32))) / 6, C7MY.LIZIZ(51)));
        C134505Pq c134505Pq = new C134505Pq(LIZIZ);
        C0AX.LIZ(viewGroup, c134505Pq.itemView, R.id.lj7);
        View view = c134505Pq.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c134505Pq.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C134505Pq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c134505Pq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c134505Pq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C134505Pq.class.getName();
        return c134505Pq;
    }
}
