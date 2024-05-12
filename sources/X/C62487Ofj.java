package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62487Ofj extends AbstractC62496Ofs {
    public List<? extends InterfaceC62486Ofi> LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final InterfaceC62548Ogi LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;
    public final BaseSharePackage LJLJL;
    public final boolean LJLJLJ;

    public final int LJLZ() {
        return ((Number) this.LJLILLLLZI.getValue()).intValue();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        C62491Ofn c62491Ofn = (C62491Ofn) holder;
        int adapterPosition = c62491Ofn.getAdapterPosition();
        if (adapterPosition < 0 || adapterPosition >= getItemCount()) {
            return;
        }
        InterfaceC62486Ofi interfaceC62486Ofi = (InterfaceC62486Ofi) ListProtector.get(this.LJLIL, adapterPosition);
        ImageView imageView = c62491Ofn.LJLIL;
        View view = c62491Ofn.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        interfaceC62486Ofi.LJIIZILJ(imageView, view, adapterPosition);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        C62491Ofn c62491Ofn = (C62491Ofn) holder;
        Animation animation = c62491Ofn.LJLIL.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(c62491Ofn);
    }

    @Override // X.AbstractC62496Ofs
    public final void setData(List<? extends InterfaceC62486Ofi> actions) {
        o.LJIIIZ(actions, "actions");
        this.LJLIL = actions;
        notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0185  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62487Ofj.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bm5, parent, false);
        o.LJIIIIZZ(itemView, "itemView");
        C62491Ofn c62491Ofn = new C62491Ofn(itemView);
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        boolean z = true;
        if (interfaceC62484Ofg != null && interfaceC62484Ofg.LJIIJ(this.LJLJL)) {
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            Context context = itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            layoutParams.width = context.getResources().getDimensionPixelOffset(R.dimen.a76);
            C26338AVi.LJI(itemView, C1FJ.LIZIZ(0), null, null, null, false, 30);
            c62491Ofn.LJLILLLLZI.getLayoutParams().width = -1;
            c62491Ofn.LJLJJI.getLayoutParams().width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LJLZ())));
            c62491Ofn.LJLJJI.getLayoutParams().height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(LJLZ())));
        } else {
            InterfaceC62484Ofg interfaceC62484Ofg2 = C62494Ofq.LIZ;
            if (interfaceC62484Ofg2 != null && interfaceC62484Ofg2.LJIIIZ(this.LJLJL)) {
                ViewGroup.LayoutParams layoutParams2 = itemView.getLayoutParams();
                Context context2 = itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                layoutParams2.width = context2.getResources().getDimensionPixelOffset(R.dimen.a76);
                C26338AVi.LJI(itemView, C1FJ.LIZIZ(0), null, null, null, false, 30);
            }
        }
        int i2 = this.LJLJJI;
        if (i2 != 0 && this.LJLJJL != 0) {
            Integer valueOf = Integer.valueOf(i2);
            int i3 = this.LJLJJL;
            if (i3 != 0) {
                c62491Ofn.LJLIL.setColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
            }
            if (valueOf != null && valueOf.intValue() != 0) {
                c62491Ofn.LJLILLLLZI.setTextColor(valueOf.intValue());
            }
        }
        C13930gf.LIZ(itemView, new C62493Ofp(c62491Ofn));
        C0AX.LIZ(parent, c62491Ofn.itemView, R.id.lj7);
        View view = c62491Ofn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c62491Ofn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C62491Ofn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c62491Ofn.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c62491Ofn.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C62491Ofn.class.getName();
        return c62491Ofn;
    }

    public C62487Ofj(InterfaceC62548Ogi listener, int i, int i2, String enterMethod, BaseSharePackage baseSharePackage, boolean z) {
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLJI = listener;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = enterMethod;
        this.LJLJL = baseSharePackage;
        this.LJLJLJ = z;
        this.LJLIL = C61878OQg.INSTANCE;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 441));
    }
}
