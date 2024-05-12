package X;

import Y.ACListenerS35S0100000_15;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJI extends AbstractC029409q<KJJ> {
    public final View.OnClickListener LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final List<MusicTag> LJLJI = new ArrayList();
    public int[] LJLJJI = new int[2];

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public KJI(ACListenerS35S0100000_15 aCListenerS35S0100000_15, RecyclerView recyclerView) {
        this.LJLIL = aCListenerS35S0100000_15;
        this.LJLILLLLZI = recyclerView;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(KJJ kjj, int i) {
        boolean z;
        String tagTitleColor;
        String tagColor;
        KJJ holder = kjj;
        o.LJIIIZ(holder, "holder");
        MusicTag tag = (MusicTag) ListProtector.get(this.LJLJI, i);
        C16880lQ.LJIIJ(this.LJLIL, holder.itemView);
        o.LJIIIZ(tag, "tag");
        if (TextUtils.isEmpty(tag.getTagColor()) || TextUtils.isEmpty(tag.getTagTitle())) {
            return;
        }
        TextView textView = holder.LJLIL;
        if (textView != null) {
            textView.setText(tag.getTagTitle());
        }
        View itemView = holder.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if ((C30581Hy.LJJIJIL(itemView) instanceof SearchResultActivity) && C50238Jne.LJ()) {
            z = true;
            if (TextUtils.isEmpty(tag.getTagColorDark())) {
                return;
            }
        } else {
            z = false;
        }
        try {
            TextView textView2 = holder.LJLIL;
            if (textView2 != null) {
                if (!z) {
                    tagColor = tag.getTagColor();
                } else {
                    tagColor = tag.getTagColorDark();
                }
                textView2.setBackgroundColor(Color.parseColor(tagColor));
            }
            TextView textView3 = holder.LJLIL;
            if (textView3 != null) {
                if (!z) {
                    tagTitleColor = tag.getTagTitleColor();
                } else {
                    tagTitleColor = tag.getTagTitleColorDark();
                }
                textView3.setTextColor(Color.parseColor(tagTitleColor));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        TextView textView4 = holder.LJLIL;
        if (textView4 != null) {
            textView4.setLayoutParams((ViewGroup.LayoutParams) holder.LJLILLLLZI.getValue());
        }
        TextView textView5 = holder.LJLIL;
        if (textView5 == null) {
            return;
        }
        textView5.setOutlineProvider(new C43251GyF(textView5.getResources().getDimensionPixelOffset(R.dimen.a6p)));
        textView5.setClipToOutline(true);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final KJJ com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.be2, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        KJJ kjj = new KJJ(view);
        C0AX.LIZ(viewGroup, kjj.itemView, R.id.lj7);
        View view2 = kjj.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (kjj.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(KJJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) kjj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(kjj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = KJJ.class.getName();
        return kjj;
    }
}
