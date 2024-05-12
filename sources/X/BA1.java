package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
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
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class BA1 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<PictionaryFullInfo> LJLIL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size() + 1;
    }

    public BA1(List<PictionaryFullInfo> list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (((PictionaryFullInfo) ListProtector.get(this.LJLIL, i - 1)).pictionaryStatistics.firstUser != null) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i2;
        String LJIILJJIL;
        o.LJIIIZ(holder, "holder");
        ImageModel imageModel = null;
        if (holder instanceof BA2) {
            PictionaryFullInfo pictionaryFullInfo = (PictionaryFullInfo) ListProtector.get(this.LJLIL, i - 1);
            PictionaryInfo pictionaryInfo = pictionaryFullInfo.pictionaryInfo;
            String word = pictionaryInfo.word;
            PictionaryStatistics pictionaryStatistics = pictionaryFullInfo.pictionaryStatistics;
            long j = pictionaryStatistics.guessCorrectUv;
            User user = pictionaryStatistics.firstUser;
            ImageModel imageModel2 = pictionaryInfo.drawUrl;
            o.LJIIIZ(word, "word");
            ((TextView) holder.itemView.findViewById(R.id.mqt)).setText(word);
            TextView textView = (TextView) holder.itemView.findViewById(R.id.m82);
            if (j > 0) {
                int i3 = (int) j;
                LJIILJJIL = C15380j0.LJIIIIZZ(R.plurals.ko, i3, BAF.LIZLLL(i3));
            } else {
                LJIILJJIL = C15380j0.LJIILJJIL(R.string.kri);
            }
            textView.setText(LJIILJJIL);
            if (user != null) {
                ((TextView) holder.itemView.findViewById(R.id.db6)).setText(C05170If.LIZ(user));
                BQO LIZ = C15650jR.LIZ();
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                }
                C78720Uuy LJIIIZ = LIZ.LJIIIZ(imageModel);
                LJIIIZ.LJIIL = Boolean.TRUE;
                LJIIIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
                LJIIIZ.LJIIIIZZ = R.drawable.cul;
                LJIIIZ.LJIIJJI(holder.itemView.findViewById(R.id.db5));
            }
            C78720Uuy LJIIIZ2 = C15650jR.LIZ().LJIIIZ(imageModel2);
            LJIIIZ2.LIZLLL(ImageView.ScaleType.FIT_XY);
            LJIIIZ2.LJIIJJI(holder.itemView.findViewById(R.id.chc));
            return;
        }
        if (!(holder instanceof BA3)) {
            return;
        }
        Iterator<PictionaryFullInfo> it = this.LJLIL.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().pictionaryStatistics.guessTotalPv;
        }
        List<PictionaryFullInfo> list = this.LJLIL;
        if ((list instanceof Collection) && list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<PictionaryFullInfo> it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (it2.next().pictionaryStatistics.guessCorrectUv > 0 && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        int size = this.LJLIL.size();
        if (i2 > 0) {
            String titleText = C15380j0.LJIIIIZZ(R.plurals.kp, i2, Integer.valueOf(i2));
            o.LJIIIIZZ(titleText, "titleText");
            int LJJLIIIJL = s.LJJLIIIJL(titleText, String.valueOf(i2), 0, false, 6);
            if (LJJLIIIJL >= 0) {
                int length = String.valueOf(i2).length() + LJJLIIIJL;
                TextView textView2 = (TextView) holder.itemView.findViewById(R.id.title);
                SpannableString spannableString = new SpannableString(titleText);
                spannableString.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.c7)), LJJLIIIJL, length, 18);
                textView2.setText(spannableString);
            } else {
                ((TextView) holder.itemView.findViewById(R.id.title)).setText(titleText);
            }
            C29306Beo.LJJLJLI(holder.itemView.findViewById(R.id.b84));
            C15490jB.LJ(holder.itemView.findViewById(R.id.b84), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_draw_guess_result.png");
        } else {
            ((TextView) holder.itemView.findViewById(R.id.title)).setText(C15380j0.LJII(R.plurals.kq, size));
            C29306Beo.LJI(holder.itemView.findViewById(R.id.b84));
        }
        ((TextView) holder.itemView.findViewById(R.id.desc)).setText(C15380j0.LJIILL(R.string.ksc, BAF.LIZLLL((int) j2)));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder ba3;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                ba3 = new BA2(C29306Beo.LJIIIIZZ(R.layout.daa, parent, false));
            } else {
                ba3 = new BA2(C29306Beo.LJIIIIZZ(R.layout.da_, parent, false));
            }
        } else {
            ba3 = new BA3(C29306Beo.LJIIIIZZ(R.layout.daf, parent, false));
        }
        C0AX.LIZ(parent, ba3.itemView, R.id.lj7);
        View view = ba3.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (ba3.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ba3.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) ba3.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(ba3.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ba3.getClass().getName();
        return ba3;
    }
}
