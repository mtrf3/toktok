package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.B9y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28330B9y extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<PictionaryFullInfo> LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size() + 1;
    }

    public C28330B9y(List<PictionaryFullInfo> list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return Math.min(i, 1);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i2;
        boolean z;
        int i3;
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C28331B9z) {
            PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) ListProtector.get(this.LJLIL, i - 1);
            C28331B9z c28331B9z = (C28331B9z) holder;
            PictionaryInfo pictionaryInfo = pictionaryFullInfo.pictionaryInfo;
            String word = pictionaryInfo.word;
            PictionaryStatistics pictionaryStatistics = pictionaryFullInfo.pictionaryStatistics;
            long j = pictionaryStatistics.guessCorrectUv;
            boolean z2 = pictionaryFullInfo.guessCorrect;
            ImageModel imageModel = pictionaryInfo.drawUrl;
            User user = pictionaryStatistics.firstUser;
            if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            o.LJIIIZ(word, "word");
            ((TextView) c28331B9z.itemView.findViewById(R.id.mqt)).setText(word);
            int i4 = (int) j;
            ((TextView) c28331B9z.itemView.findViewById(R.id.m85)).setText(C15380j0.LJIIIIZZ(R.plurals.kn, i4, BAF.LIZLLL(i4)));
            TextView textView = (TextView) c28331B9z.itemView.findViewById(R.id.m83);
            if (z2) {
                i3 = R.string.ksm;
            } else {
                i3 = R.string.kt9;
            }
            textView.setText(i3);
            C29306Beo.LJJLIIIJJI(c28331B9z.itemView.findViewById(R.id.dae), C29306Beo.LJJLIIIJLJLI(Boolean.valueOf(z), new AqS155S0100000_5(c28331B9z, 301)));
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
            LJIIIZ.LIZLLL(ImageView.ScaleType.FIT_XY);
            LJIIIZ.LJIIJJI(c28331B9z.itemView.findViewById(R.id.chc));
            return;
        }
        if (!(holder instanceof BA0)) {
            return;
        }
        List<PictionaryFullInfo> list = this.LJLIL;
        if ((list instanceof Collection) && list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<PictionaryFullInfo> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().guessCorrect && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        if (i2 > 0) {
            ((TextView) holder.itemView.findViewById(R.id.title)).setText(C15380j0.LJIIIIZZ(R.plurals.ku, i2, Integer.valueOf(i2)));
            ((TextView) holder.itemView.findViewById(R.id.desc)).setText(R.string.ktw);
            C29306Beo.LJJLJLI(holder.itemView.findViewById(R.id.b84));
            C15490jB.LJ(holder.itemView.findViewById(R.id.b84), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_draw_guess_result.png");
            return;
        }
        ((TextView) holder.itemView.findViewById(R.id.title)).setText(R.string.kty);
        ((TextView) holder.itemView.findViewById(R.id.desc)).setText(R.string.ktx);
        C29306Beo.LJI(holder.itemView.findViewById(R.id.b84));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c28331B9z;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            c28331B9z = new BA0(C29306Beo.LJIIIIZZ(R.layout.daf, parent, false));
        } else {
            c28331B9z = new C28331B9z(C29306Beo.LJIIIIZZ(R.layout.dab, parent, false));
        }
        C0AX.LIZ(parent, c28331B9z.itemView, R.id.lj7);
        View view = c28331B9z.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c28331B9z.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c28331B9z.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c28331B9z.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c28331B9z.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c28331B9z.getClass().getName();
        return c28331B9z;
    }
}
