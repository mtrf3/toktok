package X;

import Y.ACListenerS44S0200000_9;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.discovery.model.Category;
import com.ss.android.ugc.aweme.kids.discovery.model.Challenge;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MJz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56619MJz extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<Category> LJLIL = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return 2147483644;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String str;
        String str2;
        Challenge challenge;
        Challenge challenge2;
        o.LJIIIZ(holder, "holder");
        Category category = (Category) ListProtector.get(this.LJLIL, i);
        MK0 mk0 = (MK0) holder;
        String str3 = null;
        if (category != null) {
            C27740Aue.LJIIIZ(0, mk0.itemView.findViewById(R.id.j71));
            Challenge challenge3 = category.challenge;
            if (mk0.LJLIL == null) {
                C56618MJy c56618MJy = new C56618MJy(mk0.LJLILLLLZI);
                mk0.LJLIL = c56618MJy;
                c56618MJy.LJLJJI = category;
                View view = new View(mk0.LJLILLLLZI);
                view.setLayoutParams(new ViewGroup.LayoutParams((int) KL2.LIZJ(mk0.LJLILLLLZI, 14.0f), -1));
                C56618MJy c56618MJy2 = mk0.LJLIL;
                if (c56618MJy2 != null) {
                    c56618MJy2.LJLIL = view;
                    c56618MJy2.notifyItemInserted(0);
                    RecyclerView recyclerView = (RecyclerView) mk0.itemView.findViewById(R.id.j_9);
                    C56618MJy c56618MJy3 = mk0.LJLIL;
                    if (c56618MJy3 != null) {
                        recyclerView.setAdapter(c56618MJy3);
                    } else {
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            if (challenge3 != null) {
                int i2 = 8;
                ((ImageView) mk0.itemView.findViewById(R.id.cau)).setVisibility(8);
                if (C78685UuP.LJJJZ(challenge3.iconUrl)) {
                    String str4 = challenge3.iconUrl;
                    o.LJI(str4);
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str4);
                    LJIIIIZZ.LJJIIJ = (SmartImageView) mk0.itemView.findViewById(R.id.fbz);
                    C16880lQ.LLJJJ(LJIIIIZZ);
                } else {
                    ((W5G) mk0.itemView.findViewById(R.id.fbz)).setImageResource(R.drawable.bm9);
                }
                if (!TextUtils.isEmpty(challenge3.desc)) {
                    ((TextView) mk0.itemView.findViewById(R.id.mpo)).setText(challenge3.desc);
                    mk0.itemView.findViewById(R.id.mpo).setVisibility(0);
                } else {
                    mk0.itemView.findViewById(R.id.mpo).setVisibility(8);
                }
                ((TextView) mk0.itemView.findViewById(R.id.mo6)).setText(challenge3.challengeName);
                C56618MJy c56618MJy4 = mk0.LJLIL;
                if (c56618MJy4 != null) {
                    c56618MJy4.LJLJJLL = challenge3.cid;
                    c56618MJy4.LJLJJI = category;
                    c56618MJy4.LJLJL = challenge3.challengeName;
                    c56618MJy4.LJLJLJ = challenge3.feedType;
                    View findViewById = mk0.itemView.findViewById(R.id.mjc);
                    if (category.challenge.feedType == 1) {
                        i2 = 0;
                    }
                    findViewById.setVisibility(i2);
                    C16880lQ.LJJJIL((C119244m8) mk0.itemView.findViewById(R.id.mjc), new ACListenerS44S0200000_9(mk0, challenge3, 5));
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            C56618MJy c56618MJy5 = mk0.LJLIL;
            if (c56618MJy5 != null) {
                IReportAwemeManager iReportAwemeManager = MK0.LJLJI;
                List<? extends Aweme> list = category.items;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                c56618MJy5.setData(iReportAwemeManager.LIZIZ(list));
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        C56618MJy c56618MJy6 = mk0.LJLIL;
        if (c56618MJy6 != null) {
            c56618MJy6.LJLJJL = true;
        }
        if (category != null && (challenge2 = category.challenge) != null && challenge2.feedType == 1) {
            str = "show_category";
            str2 = "category_id";
        } else {
            str = "show_trending_content";
            str2 = "trending_content_id";
        }
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_from", "discovery");
        c198517qh.LIZ.put("order", Integer.valueOf(i));
        if (category != null && (challenge = category.challenge) != null) {
            str3 = challenge.cid;
        }
        C39398FdC.LIZIZ(str, q.LIZJ(c198517qh.LIZ, str2, str3, c198517qh, c39398FdC));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bfd, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        MK0 mk0 = new MK0(view);
        C0AX.LIZ(viewGroup, mk0.itemView, R.id.lj7);
        View view2 = mk0.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (mk0.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(MK0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) mk0.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(mk0.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = MK0.class.getName();
        return mk0;
    }
}
