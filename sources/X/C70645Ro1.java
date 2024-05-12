package X;

import Y.ACListenerS32S0110000_5;
import Y.ACListenerS40S0200000_5;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviStaticImageDataModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ro1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70645Ro1 extends RecyclerView.ViewHolder {
    public final SmartImageView LJLIL;
    public final FrameLayout LJLILLLLZI;

    public C70645Ro1(View view) {
        super(view);
        this.LJLIL = (SmartImageView) view.findViewById(R.id.i96);
        this.LJLILLLLZI = (FrameLayout) view.findViewById(R.id.i97);
    }

    public final void L(ProfileNaviDataModel profileNaviDataModel, int i, InterfaceC28320B9o eventHandler, boolean z) {
        UrlModel thumbnailUrl;
        List<String> urlList;
        String str;
        float f;
        o.LJIIIZ(eventHandler, "eventHandler");
        if (i == 0) {
            View view = this.itemView;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            view.setAlpha(f);
            C16880lQ.LJIIJ(new ACListenerS32S0110000_5(eventHandler, z, 2), this.itemView);
            return;
        }
        if (profileNaviDataModel == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(profileNaviDataModel, eventHandler, 90), this.itemView);
        try {
            String background_color = profileNaviDataModel.getBackground_color();
            if (background_color == null || background_color.length() == 0) {
                str = "#A5E6FF";
            } else {
                str = profileNaviDataModel.getBackground_color();
            }
            this.LJLILLLLZI.setBackgroundColor(Color.parseColor(str));
        } catch (Exception unused) {
        }
        List<ProfileNaviStaticImageDataModel> staticImage = profileNaviDataModel.getStaticImage();
        if (staticImage == null || !(true ^ staticImage.isEmpty()) || (thumbnailUrl = ((ProfileNaviStaticImageDataModel) ListProtector.get(staticImage, 0)).getThumbnailUrl()) == null || (urlList = thumbnailUrl.getUrlList()) == null || urlList.size() <= 0) {
            return;
        }
        W5F LJFF = W5U.LJFF(UriProtector.parse((String) ListProtector.get(urlList, 0)));
        LJFF.LIZJ = this.LJLIL.getContext();
        LJFF.LJJIIJ = this.LJLIL;
        LJFF.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
        C16880lQ.LLJJJ(LJFF);
    }
}
