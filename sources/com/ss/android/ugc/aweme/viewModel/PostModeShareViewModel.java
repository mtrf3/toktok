package com.ss.android.ugc.aweme.viewmodel;

import X.ActivityC45651qj;
import X.C200227tS;
import X.C200357tf;
import X.C200757uJ;
import X.C220488l2;
import X.C222578oP;
import X.C227768wm;
import X.C4LD;
import X.C79004UzY;
import X.C7HV;
import X.InterfaceC109364Qy;
import X.InterfaceC72642tA;
import X.JHM;
import X.V0N;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeShareViewModel extends AssemViewModel<C200227tS> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public Aweme LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C200227tS defaultState() {
        return new C200227tS(0);
    }

    public final void gv0(ActivityC45651qj activity, Fragment fragment, InterfaceC72642tA interfaceC72642tA, PostModeDetailParams postModeDetailParams) {
        String str;
        int i;
        String uid;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(activity, "activity");
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            Bundle bundle = new Bundle();
            if (postModeDetailParams != null) {
                str = postModeDetailParams.eventType;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            bundle.putString("event_type", str);
            bundle.putString("from_page", "graphic_detail");
            bundle.putInt("aweme_type", aweme.getAwemeType());
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                i = imageList.size();
            } else {
                i = 0;
            }
            bundle.putInt("pic_cnt", i);
            bundle.putString("enter_method", "click_share_button");
            bundle.putString("panel_source", "share_panel");
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null) {
                bundle.putInt("has_title", photoModeImageInfo2.hasTitle() ? 1 : 0);
            }
            C4LD.LIZ.LIZ(activity, fragment, aweme, C200357tf.LIZ(aweme), interfaceC72642tA, bundle);
            if (postModeDetailParams != null) {
                C220488l2 c220488l2 = C220488l2.LIZIZ;
                C200757uJ c200757uJ = new C200757uJ();
                String str3 = postModeDetailParams.eventType;
                if (str3 == null) {
                    str3 = "";
                }
                c200757uJ.LIZLLL = str3;
                c200757uJ.LJJIIZ(aweme);
                c200757uJ.LJIILLIIL = C227768wm.LJIIL(postModeDetailParams.pageType, aweme);
                User author = aweme.getAuthor();
                if (author != null && (uid = author.getUid()) != null) {
                    str2 = uid;
                }
                c200757uJ.LJJLI = str2;
                c200757uJ.LJJJJZ = C222578oP.LJFF(aweme.getAuthor());
                c200757uJ.LJJLL = C79004UzY.LJJJIL(activity, aweme);
                V0N.LJIIIZ(c200757uJ, aweme);
                Object LJII = c220488l2.LJII(aweme, c200757uJ);
                C222578oP.LIZJ(LJII, aweme, null, null, 14);
                ((JHM) LJII).LJIILIIL();
            }
            InterfaceC109364Qy LIZLLL = C7HV.LIZIZ.LIZLLL();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            LIZLLL.LJII(aid);
        }
    }
}
