package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class OW8 extends AbstractC029409q<OW9> implements View.OnClickListener {
    public static final int LJLJI = EF7.LIZIZ().getResources().getDisplayMetrics().widthPixels / 3;
    public static final int LJLJJI = (int) (EF7.LIZIZ().getResources().getDisplayMetrics().widthPixels * 0.44f);
    public final List<LiveWallPaperBean> LJLIL = new ArrayList();
    public OWA LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OWA owa = this.LJLILLLLZI;
        if (owa != null) {
            LiveWallPaperBean liveWallPaperBean = (LiveWallPaperBean) view.getTag();
            if (TextUtils.isEmpty(liveWallPaperBean.getVideoPath())) {
                owa.LIZ.LLFII(liveWallPaperBean);
                return;
            }
            LocalLiveWallPaperActivity localLiveWallPaperActivity = owa.LIZ;
            localLiveWallPaperActivity.getClass();
            Intent intent = new Intent(localLiveWallPaperActivity, (Class<?>) LiveWallPaperPreviewActivity.class);
            intent.putExtra("live_wall_paper", liveWallPaperBean);
            intent.putExtra("from", localLiveWallPaperActivity.LJLJL);
            C78598Ut0.LJIJJ(intent, localLiveWallPaperActivity);
            localLiveWallPaperActivity.startActivity(intent);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(OW9 ow9, int i) {
        LiveWallPaperBean liveWallPaperBean;
        OW9 ow92 = ow9;
        if (i >= ((ArrayList) this.LJLIL).size() || i < 0 || (liveWallPaperBean = (LiveWallPaperBean) ListProtector.get(this.LJLIL, i)) == null) {
            return;
        }
        if (TextUtils.isEmpty(liveWallPaperBean.getThumbnailPath())) {
            C78765Uvh.LJI(ow92.LJLIL, liveWallPaperBean.getThumbnailUrlModel(), LJLJI, LJLJJI, null);
        } else {
            C62846OlW c62846OlW = ow92.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            LIZ.append(liveWallPaperBean.getThumbnailPath());
            C78765Uvh.LJIIIZ(c62846OlW, X1D.LIZIZ(LIZ), LJLJI, LJLJJI);
        }
        ow92.itemView.setTag(liveWallPaperBean);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final OW9 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), R.layout.du2, viewGroup, false);
        C16880lQ.LJIIJ(this, LLLLIILL);
        OW9 ow9 = new OW9(LLLLIILL);
        C0AX.LIZ(viewGroup, ow9.itemView, R.id.lj7);
        View view = ow9.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (ow9.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(OW9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) ow9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(ow9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = OW9.class.getName();
        return ow9;
    }
}
