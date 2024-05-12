package X;

import Y.ACListenerS27S0201000_10;
import Y.ACListenerS36S0300000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OXB extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;
    public final double LJLJJL;
    public final ArrayList<MediaModel> LJLJJLL;
    public List<Integer> LJLJL;
    public List<Integer> LJLJLJ;
    public List<OXE> LJLJLLL;
    public final int LJLL;
    public boolean LJLLI;
    public AbstractC65781Prl LJLLILLLL;
    public AbstractC65781Prl LJLLJ;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJLL.size();
    }

    public final void LJLLLLLL(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            int i = layoutParams.width;
            int i2 = this.LJLL;
            if (i != i2) {
                int i3 = layoutParams.height;
                double d = this.LJLJJL;
                if (i3 != ((int) (i2 * d))) {
                    layoutParams.width = i2;
                    layoutParams.height = (int) (i2 * d);
                }
            }
        }
    }

    public final void LJLZ(Collection<? extends MediaModel> collection) {
        this.LJLJJLL.clear();
        this.LJLJJLL.addAll(collection);
        int size = this.LJLJJLL.size();
        List<Integer> list = this.LJLJLJ;
        if (list == null) {
            this.LJLJLJ = new ArrayList();
        } else {
            ((ArrayList) list).clear();
        }
        List<Integer> list2 = this.LJLJL;
        if (list2 == null) {
            this.LJLJL = new ArrayList();
        } else {
            ((ArrayList) list2).clear();
        }
        for (int i = 0; i < size; i++) {
            List<Integer> list3 = this.LJLJL;
            if (list3 != null) {
                ((ArrayList) list3).add(-1);
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        int i2;
        float f;
        o.LJIIIZ(holder, "holder");
        OXC oxc = (OXC) holder;
        LJLLLLLL(oxc.LJLIL);
        LJLLLLLL(oxc.LJLJJI);
        Object obj = ListProtector.get(this.LJLJJLL, i);
        o.LJIIIIZZ(obj, "mMediaTotal[position]");
        MediaModel mediaModel = (MediaModel) obj;
        List<Integer> list = this.LJLJL;
        o.LJI(list);
        int intValue = ((Number) ListProtector.get(list, i)).intValue();
        float f2 = 1.0f;
        if (intValue >= 0) {
            TextView textView = oxc.LJLILLLLZI;
            if (textView != null) {
                textView.setText(String.valueOf(intValue + 1));
            }
            TextView textView2 = oxc.LJLILLLLZI;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.bnk);
            }
            View view = oxc.LJLJJI;
            if (view != null) {
                view.setVisibility(0);
            }
            f = 1.1f;
        } else {
            TextView textView3 = oxc.LJLILLLLZI;
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = oxc.LJLILLLLZI;
            if (textView4 != null) {
                textView4.setBackgroundResource(R.drawable.bnj);
            }
            View view2 = oxc.LJLJJI;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            List<Integer> list2 = this.LJLJLJ;
            if (list2 != null) {
                i2 = ((ArrayList) list2).size();
            } else {
                i2 = 0;
            }
            if (i2 >= this.LJLILLLLZI) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            f = 1.0f;
        }
        C62846OlW c62846OlW = oxc.LJLIL;
        if (c62846OlW != null) {
            if (c62846OlW.getAlpha() != f2) {
                c62846OlW.setAlpha(f2);
            }
            if (c62846OlW.getScaleX() != f) {
                c62846OlW.setScaleX(f);
                c62846OlW.setScaleY(f);
            }
        }
        if (!TextUtils.equals(oxc.LJLJJL, mediaModel.fileLocalUriPath)) {
            String str = mediaModel.fileLocalUriPath;
            oxc.LJLJJL = str;
            C62846OlW c62846OlW2 = oxc.LJLIL;
            String uri = C44694HgQ.LJIIIIZZ(str).toString();
            int i3 = this.LJLL;
            C78765Uvh.LJIIIZ(c62846OlW2, uri, i3, i3);
        }
        C16880lQ.LJIIJ(new ACListenerS27S0201000_10(this, intValue, oxc, 0), oxc.itemView);
        FrameLayout frameLayout = oxc.LJLJI;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS36S0300000_10(this, oxc, mediaModel, 1));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View convertView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.ajk, parent, false);
        o.LJIIIIZZ(convertView, "convertView");
        OXC oxc = new OXC(convertView);
        oxc.LJLIL = (C62846OlW) convertView.findViewById(R.id.ggp);
        oxc.LJLILLLLZI = (TextView) convertView.findViewById(R.id.ehy);
        oxc.LJLJI = (FrameLayout) convertView.findViewById(R.id.ded);
        oxc.LJLJJI = convertView.findViewById(R.id.jsd);
        C0AX.LIZ(parent, oxc.itemView, R.id.lj7);
        View view = oxc.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (oxc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(OXC.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) oxc.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(oxc.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = OXC.class.getName();
        return oxc;
    }

    public OXB(Context mContext, int i, int i2, long j, boolean z) {
        o.LJIIIZ(mContext, "mContext");
        this.LJLIL = mContext;
        this.LJLILLLLZI = i2;
        this.LJLJI = j;
        this.LJLJJI = z;
        this.LJLJJL = 1.0d;
        this.LJLJJLL = new ArrayList<>();
        mContext.getResources().getDimensionPixelOffset(R.dimen.l_);
        this.LJLL = (KL2.LJIIJJI(mContext) - ((i - 1) * ((int) KL2.LIZJ(mContext, 1.5f)))) / i;
    }
}
