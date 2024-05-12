package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.interaction.pictionary.RankEntry;

/* renamed from: X.B9e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28310B9e extends AbstractC029409q<C28311B9f> {
    public final List<RankEntry> LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C28310B9e(List<RankEntry> list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C28311B9f holder, int i) {
        ImageModel imageModel;
        o.LJIIIZ(holder, "holder");
        RankEntry rankEntry = (RankEntry) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(rankEntry, "rankEntry");
        ((TextView) holder.itemView.findViewById(R.id.mg8)).setText(String.valueOf(rankEntry.userRank));
        long j = rankEntry.userRank;
        if (1 <= j && j < 4) {
            C87277YNd.LJJIIJZLJL((C47121t6) holder.itemView.findViewById(R.id.mg8), R.color.a_l);
        }
        BQO LIZ = C15650jR.LIZ();
        User user = rankEntry.user;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        C78720Uuy LJIIIZ = LIZ.LJIIIZ(imageModel);
        LJIIIZ.LJIIL = Boolean.TRUE;
        LJIIIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        LJIIIZ.LJIIIIZZ = R.drawable.cul;
        LJIIIZ.LJIIJJI(holder.itemView.findViewById(R.id.e35));
        ((TextView) holder.itemView.findViewById(R.id.gvs)).setText(C05170If.LIZ(rankEntry.user));
        ((TextView) holder.itemView.findViewById(R.id.time)).setText(C15380j0.LJIILL(R.string.lm7, String.valueOf(rankEntry.duration)));
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(rankEntry, 277), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C28311B9f com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C28311B9f c28311B9f = new C28311B9f(C29306Beo.LJIIIIZZ(R.layout.dae, parent, false));
        C0AX.LIZ(parent, c28311B9f.itemView, R.id.lj7);
        View view = c28311B9f.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c28311B9f.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C28311B9f.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c28311B9f.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c28311B9f.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C28311B9f.class.getName();
        return c28311B9f;
    }
}
