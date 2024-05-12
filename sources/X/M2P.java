package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyEncouragePublishCardLayoutManger;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyVideoCardModel;
import com.ss.android.ugc.aweme.encouragepublish.manager.NearbyVideoCardPoiInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M2P extends AbstractC029409q<M2Q> {
    public final List<NearbyVideoCardModel> LJLIL;
    public final NearbyEncouragePublishCardLayoutManger LJLILLLLZI;
    public final C68395Qsp LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(M2Q m2q, int i) {
        String str;
        M2Q holder = m2q;
        o.LJIIIZ(holder, "holder");
        NearbyVideoCardModel nearbyVideoCardModel = (NearbyVideoCardModel) ORZ.LJLLLLLL(i, this.LJLIL);
        if (nearbyVideoCardModel != null) {
            Video video = nearbyVideoCardModel.video;
            holder.LJLLLLLL = video;
            holder.LJLLLL = nearbyVideoCardModel;
            int i2 = holder.LJLLILLLL;
            int i3 = holder.LJLLJ;
            if (video != null && video.getWidth() != 0 && video.getHeight() != 0) {
                float width = video.getWidth();
                float height = video.getHeight();
                float f = i2;
                float f2 = i3;
                if (height / f2 < width / f) {
                    i2 = O6R.LJJIIZ((f2 / height) * width);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cropW ");
                    LIZ.append(i2);
                    LIZ.append(',');
                    LIZ.append(i3);
                    X1D.LIZIZ(LIZ);
                } else {
                    i3 = O6R.LJJIIZ((f / width) * height);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("cropH ");
                    LIZ2.append(i2);
                    LIZ2.append(',');
                    LIZ2.append(i3);
                    X1D.LIZIZ(LIZ2);
                }
            }
            holder.LJLJJI.getLayoutParams().width = i2;
            holder.LJLJJI.getLayoutParams().height = i3;
            holder.LJLJJL.getLayoutParams().width = i2;
            holder.LJLJJL.getLayoutParams().height = i3;
            holder.M();
            Video video2 = holder.LJLLLLLL;
            if (video2 != null) {
                C62846OlW c62846OlW = holder.LJLJJI;
                UrlModel originCover = video2.getOriginCover();
                if (originCover == null) {
                    originCover = video2.getCover();
                }
                C78765Uvh.LJFF(c62846OlW, originCover);
            }
            TuxTextView tuxTextView = holder.LJLJJLL;
            NearbyVideoCardPoiInfo nearbyVideoCardPoiInfo = nearbyVideoCardModel.poiInfo;
            String str2 = null;
            if (nearbyVideoCardPoiInfo != null) {
                str2 = nearbyVideoCardPoiInfo.playCount;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            tuxTextView.setText(str2);
            TuxTextView tuxTextView2 = holder.LJLJL;
            NearbyVideoCardPoiInfo nearbyVideoCardPoiInfo2 = nearbyVideoCardModel.poiInfo;
            if (nearbyVideoCardPoiInfo2 != null && (str = nearbyVideoCardPoiInfo2.poiName) != null) {
                str3 = str;
            }
            tuxTextView2.setText(str3);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final M2Q com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bw4, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        M2Q m2q = new M2Q(view, this.LJLILLLLZI, this.LJLJI);
        C0AX.LIZ(viewGroup, m2q.itemView, R.id.lj7);
        View view2 = m2q.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (m2q.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(M2Q.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) m2q.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(m2q.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = M2Q.class.getName();
        return m2q;
    }

    public M2P(List<NearbyVideoCardModel> videoCardModelList, NearbyEncouragePublishCardLayoutManger layoutManger, C68395Qsp encouragePublishCardManager) {
        o.LJIIIZ(videoCardModelList, "videoCardModelList");
        o.LJIIIZ(layoutManger, "layoutManger");
        o.LJIIIZ(encouragePublishCardManager, "encouragePublishCardManager");
        this.LJLIL = videoCardModelList;
        this.LJLILLLLZI = layoutManger;
        this.LJLJI = encouragePublishCardManager;
    }
}
