package X;

import Y.ACListenerS24S0201000_7;
import Y.ACListenerS25S0101000_7;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.photodownload.PhotoSelectionViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ghx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42241Ghx extends AbstractC029409q<C42242Ghy> {
    public final Aweme LJLIL;
    public final PhotoSelectionViewModel LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = this.LJLIL.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            return imageList.size();
        }
        return 0;
    }

    public C42241Ghx(Aweme aweme, PhotoSelectionViewModel photoSelectionViewModel) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        this.LJLILLLLZI = photoSelectionViewModel;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C42242Ghy c42242Ghy, int i) {
        String str;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel thumbnail;
        List<String> urlList;
        C42242Ghy holder = c42242Ghy;
        o.LJIIIZ(holder, "holder");
        PhotoModeImageInfo photoModeImageInfo = this.LJLIL.getPhotoModeImageInfo();
        boolean z = false;
        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(imageList, i)) == null || (thumbnail = photoModeImageUrlModel.getThumbnail()) == null || (urlList = thumbnail.getUrlList()) == null || (str = (String) ListProtector.get(urlList, 0)) == null) {
            str = "";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LJIIIIZZ.LJJIIJ = holder.LJLIL;
        LJIIIIZZ.LIZIZ("DownloadPhotoSelectionAdapter");
        C16880lQ.LLJJJ(LJIIIIZZ);
        C16880lQ.LJJJI(holder.LJLILLLLZI, new ACListenerS25S0101000_7(i, this, 5));
        C16880lQ.LJJIJLIJ(holder.LJLIL, new ACListenerS24S0201000_7(i, this, holder, 5));
        C71897SJp c71897SJp = holder.LJLILLLLZI;
        java.util.Set<Integer> value = this.LJLILLLLZI.gv0().getValue();
        if (value != null) {
            z = value.contains(Integer.valueOf(i));
        }
        c71897SJp.setChecked(z);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C42242Ghy com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View contentView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c2f, viewGroup, false);
        o.LJIIIIZZ(contentView, "contentView");
        C42242Ghy c42242Ghy = new C42242Ghy(contentView);
        C0AX.LIZ(viewGroup, c42242Ghy.itemView, R.id.lj7);
        View view = c42242Ghy.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c42242Ghy.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C42242Ghy.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c42242Ghy.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c42242Ghy.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C42242Ghy.class.getName();
        return c42242Ghy;
    }
}
