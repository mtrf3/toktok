package X;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62488Ofk extends AbstractC62496Ofs {
    public List<? extends InterfaceC62486Ofi> LJLIL;
    public List<Integer> LJLILLLLZI;
    public final InterfaceC62548Ogi LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC62496Ofs
    public final void LJLLLLLL(List<Integer> list) {
        this.LJLILLLLZI = list;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        C62490Ofm c62490Ofm = (C62490Ofm) holder;
        int adapterPosition = c62490Ofm.getAdapterPosition();
        if (adapterPosition < 0 || adapterPosition >= getItemCount()) {
            return;
        }
        InterfaceC62486Ofi interfaceC62486Ofi = (InterfaceC62486Ofi) ListProtector.get(this.LJLIL, adapterPosition);
        TuxIconView tuxIconView = c62490Ofm.LJLIL;
        View view = c62490Ofm.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        interfaceC62486Ofi.LJIIZILJ(tuxIconView, view, adapterPosition);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        C62490Ofm c62490Ofm = (C62490Ofm) holder;
        Animation animation = c62490Ofm.LJLIL.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(c62490Ofm);
    }

    @Override // X.AbstractC62496Ofs
    public final void setData(List<? extends InterfaceC62486Ofi> actions) {
        o.LJIIIZ(actions, "actions");
        this.LJLIL = actions;
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d A[LOOP:0: B:30:0x0127->B:32:0x012d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009e  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62488Ofk.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        int i2;
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bm6, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C62490Ofm c62490Ofm = new C62490Ofm(itemView);
        int i3 = this.LJLJJI;
        if (i3 != 0 && (i2 = this.LJLJJL) != 0) {
            c62490Ofm.LJLIL.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            c62490Ofm.LJLILLLLZI.setTextColor(i3);
        }
        C0AX.LIZ(viewGroup, c62490Ofm.itemView, R.id.lj7);
        View view = c62490Ofm.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c62490Ofm.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C62490Ofm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c62490Ofm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c62490Ofm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C62490Ofm.class.getName();
        return c62490Ofm;
    }

    public C62488Ofk(InterfaceC62548Ogi listener, int i, int i2) {
        o.LJIIIZ(listener, "listener");
        this.LJLJI = listener;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLIL = c61878OQg;
        this.LJLILLLLZI = c61878OQg;
    }
}
