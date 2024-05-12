package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeensVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182667Ew extends AbstractC029409q<C182677Ex> {
    public final String LJLIL;
    public final List<PrivacyHighlightsForTeensVideo> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C182667Ew(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C182677Ex c182677Ex, final int i) {
        final C182677Ex holder = c182677Ex;
        o.LJIIIZ(holder, "holder");
        PrivacyHighlightsForTeensVideo phlVideo = (PrivacyHighlightsForTeensVideo) ListProtector.get(this.LJLILLLLZI, i);
        o.LJIIIZ(phlVideo, "phlVideo");
        AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        o.LJII(bindingAdapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.business.phl.PhlAdapter");
        final String str = ((C182667Ew) bindingAdapter).LJLIL;
        if (o.LJ(str, "new_user_journey")) {
            ViewGroup.LayoutParams layoutParams = holder.LJLIL.getLayoutParams();
            layoutParams.width = C7MY.LIZIZ(112);
            holder.LJLIL.setLayoutParams(layoutParams);
        }
        TextView textView = holder.LJLJI;
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZIZ(phlVideo.title);
        textView.setText(c116724i4.LIZ);
        holder.LJLJJI.setText(C5SK.LIZ(phlVideo.videoInfo.getDuration() / 1000));
        W5F LJII = W5U.LJII(C78939UyV.LJ(phlVideo.videoInfo.getCover()));
        LJII.LJJIIJ = holder.LJLILLLLZI;
        C16880lQ.LLJJJ(LJII);
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.7Ey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "//compliance/privacy_highlights_for_teens_feed");
                buildRoute.withParam("enter_from", str);
                buildRoute.withParam("init_position", i);
                AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter2 = holder.getBindingAdapter();
                o.LJII(bindingAdapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.business.phl.PhlAdapter");
                List<PrivacyHighlightsForTeensVideo> list = ((C182667Ew) bindingAdapter2).LJLILLLLZI;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    PrivacyHighlightsForTeensVideo privacyHighlightsForTeensVideo = (PrivacyHighlightsForTeensVideo) it.next();
                    Video video = privacyHighlightsForTeensVideo.videoInfo;
                    video.setSourceId(privacyHighlightsForTeensVideo.id);
                    arrayList.add(video);
                }
                List LLJI = ORZ.LLJI(arrayList);
                o.LJII(LLJI, "null cannot be cast to non-null type java.io.Serializable");
                buildRoute.withParam("video_list", (Serializable) LLJI);
                buildRoute.open();
            }
        }, holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C182677Ex com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ag5, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C182677Ex c182677Ex = new C182677Ex(view);
        C0AX.LIZ(viewGroup, c182677Ex.itemView, R.id.lj7);
        View view2 = c182677Ex.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c182677Ex.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C182677Ex.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c182677Ex.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c182677Ex.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C182677Ex.class.getName();
        return c182677Ex;
    }
}
