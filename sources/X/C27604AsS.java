package X;

import Y.ACListenerS39S0200000_4;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.business.phl.feed.PhlFeedFragment;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AsS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27604AsS extends AbstractC029409q<C27605AsT> {
    public final List<Video> LJLIL;
    public final Fragment LJLILLLLZI;
    public Long LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C27604AsS(List dataList, PhlFeedFragment fragment) {
        o.LJIIIZ(dataList, "dataList");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = dataList;
        this.LJLILLLLZI = fragment;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C27605AsT c27605AsT, int i) {
        C27605AsT holder = c27605AsT;
        o.LJIIIZ(holder, "holder");
        Video item = (Video) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(item, "item");
        holder.LJLILLLLZI.LJFF(false);
        holder.LJLILLLLZI.findViewById(R.id.hso).findViewById(R.id.bs8).setAlpha(0.0f);
        holder.LJLJJI.LIZLLL = item;
        C27606AsU c27606AsU = new C27606AsU();
        c27606AsU.LIZ = holder.LJLJJI;
        c27606AsU.LIZLLL = new C73043Slb(item.getWidth(), item.getHeight());
        c27606AsU.LJ = Integer.valueOf(item.getVideoLength() / 1000);
        Window window = null;
        c27606AsU.LJI = null;
        ActivityC45651qj mo49getActivity = holder.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            window = mo49getActivity.getWindow();
        }
        c27606AsU.LIZJ = window;
        View view = holder.itemView;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        c27606AsU.LIZIZ = (ViewGroup) view;
        c27606AsU.LJIIIIZZ = true;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_a_rectangle;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c27606AsU.LJII = new C27609AsX(c2068389v, new ACListenerS39S0200000_4(holder, item, 110));
        W5F LJII = W5U.LJII(C78939UyV.LJ(item.getCover()));
        LJII.LIZJ = holder.itemView.getContext();
        LJII.LJIJI = Bitmap.Config.ARGB_8888;
        LJII.LJIIIZ(new C27607AsV(c27606AsU, holder));
        holder.LJLILLLLZI.setParams(c27606AsU);
        ((ImageView) holder.LJLILLLLZI.LJ(R.id.k4s)).setVisibility(0);
        holder.L("");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C27605AsT com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C27605AsT c27605AsT = new C27605AsT(parent, this.LJLILLLLZI);
        C0AX.LIZ(parent, c27605AsT.itemView, R.id.lj7);
        View view = c27605AsT.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c27605AsT.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C27605AsT.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c27605AsT.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c27605AsT.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C27605AsT.class.getName();
        return c27605AsT;
    }
}
