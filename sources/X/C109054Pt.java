package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.4Pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109054Pt extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJJL = 0;
    public SharePanelViewModel LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final int LJLJI;
    public IMContact LJLJJI;

    public C109054Pt(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        this.LJLIL = sharePanelViewModel;
        this.LJLJI = R.raw.icon_magnifying_glass_fill;
        o.LJIIIIZZ(h0.LJIIZILJ(R.id.gw7, view), "requireViewById(this, R.id.name_tv)");
        View LJIIZILJ = h0.LJIIZILJ(R.id.gml, view);
        o.LJIIIIZZ(LJIIZILJ, "requireViewById(this, R.id.more_iv)");
        this.LJLILLLLZI = (TuxIconView) LJIIZILJ;
        View LJIIZILJ2 = h0.LJIIZILJ(R.id.eut, view);
        o.LJIIIIZZ(LJIIZILJ2, "requireViewById(this, R.id.item_root_container_rl)");
        C16880lQ.LJIJ((RelativeLayout) LJIIZILJ2, new ACListenerS36S0200000_1(view, this, 86));
    }

    public final void L(IMContact contact, SharePanelViewModel newViewModel) {
        Bundle bundle;
        o.LJIIIZ(contact, "contact");
        o.LJIIIZ(newViewModel, "newViewModel");
        this.LJLJJI = contact;
        this.LJLIL = newViewModel;
        Context context = this.LJLILLLLZI.getContext();
        o.LJIIIIZZ(context, "moreIv.context");
        int i = this.LJLJI;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        SY9 LIZ = c2068389v.LIZ(context);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cu);
        c110614Vt.LIZJ = C61328O5c.LIZJ(24);
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
        c110614Vt.LJFF = Integer.valueOf(R.attr.dv);
        c110614Vt.LIZLLL = KNV.LIZIZ(0.5d);
        this.LJLILLLLZI.setImageDrawable(C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context)));
        SharePanelViewModel sharePanelViewModel = this.LJLIL;
        if (sharePanelViewModel != null) {
            SharePackage sharePackage = sharePanelViewModel.LJLIL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                bundle.putString("button_source", bundle.getString("enter_method"));
                bundle.putInt("rank_num", getBindingAdapterPosition());
            }
            sharePanelViewModel.LJIIJJI();
        }
    }
}
