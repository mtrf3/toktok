package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import Y.ACListenerS44S1100000_5;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.live.OrganizationModelExt;
import com.bytedance.android.livesdkapi.depend.live.OrganizationResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BXl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28941BXl extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final ActivityC45651qj LJLIL;
    public final List<OrganizationModelExt> LJLILLLLZI = new ArrayList();
    public String LJLJI = "";

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size() + 1;
    }

    public C28941BXl(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    public final void LJLLLLLL(OrganizationResponse orgResponse) {
        List list;
        o.LJIIIZ(orgResponse, "orgResponse");
        List<OrganizationModelExt> list2 = this.LJLILLLLZI;
        List<OrganizationModelExt> list3 = orgResponse.orgExtList;
        if (list3 != null) {
            list = ORZ.LJLL(list3);
        } else {
            list = C61878OQg.INSTANCE;
        }
        ((ArrayList) list2).addAll(list);
        String str = orgResponse.poweredBy;
        if (str == null) {
            str = "";
        }
        this.LJLJI = str;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i != getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder vh, int i) {
        String str;
        String str2;
        ImageModel imageModel;
        o.LJIIIZ(vh, "vh");
        if (vh instanceof C28943BXn) {
            C28943BXn c28943BXn = (C28943BXn) vh;
            ActivityC45651qj fragmentActivity = this.LJLIL;
            OrganizationModelExt organizationModelExt = (OrganizationModelExt) ORZ.LJLLLLLL(i, this.LJLILLLLZI);
            o.LJIIIZ(fragmentActivity, "fragmentActivity");
            TextView textView = c28943BXn.LJLJI;
            if (organizationModelExt != null) {
                str = organizationModelExt.name;
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = c28943BXn.LJLJJI;
            if (organizationModelExt != null) {
                str2 = organizationModelExt.desc;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            c28943BXn.LJLIL.setImageDrawable(null);
            ImageView imageView = c28943BXn.LJLIL;
            if (organizationModelExt == null || (imageModel = organizationModelExt.icon) == null) {
                imageModel = new ImageModel();
            }
            C15640jQ.LJIIIIZZ(imageView, imageModel);
            C16880lQ.LJIILLIIL(c28943BXn.LJLILLLLZI, new ACListenerS40S0200000_5(fragmentActivity, organizationModelExt, 13));
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(organizationModelExt, 131), c28943BXn.itemView);
            return;
        }
        if (!(vh instanceof C28942BXm)) {
            return;
        }
        C28942BXm c28942BXm = (C28942BXm) vh;
        ActivityC45651qj fragmentActivity2 = this.LJLIL;
        String str3 = this.LJLJI;
        o.LJIIIZ(fragmentActivity2, "fragmentActivity");
        String originStr = C15380j0.LJIILL(R.string.np_, c28942BXm.LJLIL);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(originStr);
        o.LJIIIIZZ(originStr, "originStr");
        int LJJLIIIJL = s.LJJLIIIJL(originStr, c28942BXm.LJLIL, 0, false, 6);
        if (str3 == null || str3.length() == 0) {
            TextView textView3 = c28942BXm.LJLILLLLZI;
            if (textView3 == null) {
                return;
            }
            C87277YNd.LJJIIZ(textView3);
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ColorProtector.parseColor("#FE2C55")), LJJLIIIJL, c28942BXm.LJLIL.length() + LJJLIIIJL, 33);
        c28942BXm.LJLILLLLZI.setText(spannableStringBuilder);
        C16880lQ.LJIJI(c28942BXm.LJLILLLLZI, new ACListenerS44S1100000_5(fragmentActivity2, str3, 1));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c28943BXn;
        o.LJIIIZ(viewGroup, "viewGroup");
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                c28943BXn = new C28942BXm(C1FL.LIZIZ(viewGroup, R.layout.d9p, viewGroup, false, "from(viewGroup.context).…ficial, viewGroup, false)"));
            } else {
                throw new IllegalArgumentException("wrong view type");
            }
        } else {
            c28943BXn = new C28943BXn(C1FL.LIZIZ(viewGroup, R.layout.d9o, viewGroup, false, "from(viewGroup.context).…n_item, viewGroup, false)"));
        }
        C0AX.LIZ(viewGroup, c28943BXn.itemView, R.id.lj7);
        View view = c28943BXn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c28943BXn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c28943BXn.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c28943BXn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c28943BXn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c28943BXn.getClass().getName();
        return c28943BXn;
    }
}
