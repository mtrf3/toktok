package X;

import Y.ACListenerS39S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AIi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26000AIi extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC88472Yns<AbstractC25997AIf, C76800UCe> LJLIL;
    public final List<AbstractC72372sj> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C26000AIi(InterfaceC88472Yns<? super AbstractC25997AIf, C76800UCe> eventHandler) {
        o.LJIIIZ(eventHandler, "eventHandler");
        this.LJLIL = eventHandler;
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String str;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof C26002AIk) && (ListProtector.get(this.LJLILLLLZI, i) instanceof C72362si)) {
            Object obj = ListProtector.get(this.LJLILLLLZI, i);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.profile.ProfileVideoData.KidsProfileHeader");
            C26002AIk c26002AIk = (C26002AIk) holder;
            C72382sk headerData = ((C72362si) obj).LIZ;
            o.LJIIIZ(headerData, "headerData");
            C119624mk c119624mk = (C119624mk) c26002AIk.itemView.findViewById(R.id.e3m);
            C78765Uvh.LJFF(c119624mk, headerData.LIZ);
            C16880lQ.LJJJJIZL(c119624mk, new ACListenerS39S0200000_4(c26002AIk, headerData, 2));
            ((TextView) c26002AIk.itemView.findViewById(R.id.feo)).setText(headerData.LIZLLL);
            return;
        }
        if (!(holder instanceof C25998AIg) || !(ListProtector.get(this.LJLILLLLZI, i) instanceof C72352sh)) {
            return;
        }
        Object obj2 = ListProtector.get(this.LJLILLLLZI, i);
        o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.profile.ProfileVideoData.DraftVideo");
        C25998AIg c25998AIg = (C25998AIg) holder;
        AwemeDraft data = ((C72352sh) obj2).LIZ;
        o.LJIIIZ(data, "data");
        View findViewById = c25998AIg.itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.cover)");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        if (data.LJIIL()) {
            MvCreateVideoData mvCreateVideoData = data.LJJJJI.mvCreateVideoData;
            if (mvCreateVideoData == null) {
                str = null;
            } else {
                str = mvCreateVideoData.videoCoverImgPath;
            }
            if (C39579Fg7.LIZIZ(str)) {
                W5F LJI = W5U.LJI(new File(str));
                LJI.LJJIIJ = smartImageView;
                LJI.LIZIZ("DraftBoxViewHolder");
                C16880lQ.LLJJJ(LJI);
            }
        } else if (data.LJIIJJI()) {
            String LJII = data.LJII();
            if (C39579Fg7.LIZIZ(LJII)) {
                W5F LJI2 = W5U.LJI(new File(LJII));
                LJI2.LJJIIJ = smartImageView;
                LJI2.LIZIZ("DraftBoxViewHolder");
                C16880lQ.LLJJJ(LJI2);
            }
        } else {
            AVExternalServiceImpl.LIZ().abilityService().infoService().videoCover(data, new C26001AIj(smartImageView));
        }
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(c25998AIg, data, 1), c25998AIg.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c25998AIg;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            c25998AIg = new C26002AIk(C1FL.LIZIZ(parent, R.layout.bgp, parent, false, "from(parent.context)\n   …ader_view, parent, false)"));
        } else {
            c25998AIg = new C25998AIg(C1FL.LIZIZ(parent, R.layout.bgl, parent, false, "from(parent.context)\n   …raft_item, parent, false)"), this.LJLIL);
        }
        C0AX.LIZ(parent, c25998AIg.itemView, R.id.lj7);
        View view = c25998AIg.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c25998AIg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c25998AIg.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c25998AIg.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c25998AIg.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c25998AIg.getClass().getName();
        return c25998AIg;
    }
}
