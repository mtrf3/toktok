package Y;

import X.ActivityC45651qj;
import X.C2U8;
import X.C40984G6q;
import X.C45497HtN;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.UDV;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.dm.DMAlbumMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import defpackage.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS145S0100000_7 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS145S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS145S0100000_7 aObjectS145S0100000_7, Object obj) {
        ActivityC45651qj activityC45651qj;
        ArrayList<? extends Parcelable> data = (ArrayList) obj;
        o.LJIIIZ(data, "data");
        if (((MvChoosePhotoScene) aObjectS145S0100000_7.l0).LLLLZ()) {
            ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aObjectS145S0100000_7.l0).LLLLLIL;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.setState(new AqS173S0100000_7(new MediaListState(data, System.currentTimeMillis(), null, 4, null), 270));
            }
        } else {
            int i = ((MvChoosePhotoScene) aObjectS145S0100000_7.l0).e;
            if (i != 1 && i != 2) {
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("choose_photo", data);
                MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aObjectS145S0100000_7.l0;
                Activity activity = mvChoosePhotoScene.mActivity;
                if (activity != null) {
                    activity.setResult(mvChoosePhotoScene.LLZZZIL, intent);
                }
                String str = ((MvChoosePhotoScene) aObjectS145S0100000_7.l0).LLLLLLLZIL;
                if (str != null) {
                    C2U8.LIZ(new DMAlbumMediaPublishEvent(str, data));
                }
                ((MvChoosePhotoScene) aObjectS145S0100000_7.l0).LLLZL(false);
            } else if (data.size() > 0) {
                Activity requireActivity = ((MvChoosePhotoScene) aObjectS145S0100000_7.l0).requireActivity();
                FragmentManager fragmentManager = null;
                if ((requireActivity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) requireActivity) != null) {
                    fragmentManager = activityC45651qj.getSupportFragmentManager();
                }
                List LJJJIL = g0.LJJJIL(data);
                MvChoosePhotoScene mvChoosePhotoScene2 = (MvChoosePhotoScene) aObjectS145S0100000_7.l0;
                LiveOuterService.LJJJLL().LJJIJIL().H8(new UDV(fragmentManager, LJJJIL, mvChoosePhotoScene2.f, mvChoosePhotoScene2.e, mvChoosePhotoScene2.d, new C45497HtN(mvChoosePhotoScene2)));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS145S0100000_7 aObjectS145S0100000_7, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS145S0100000_7.l0;
        C40984G6q c40984G6q = videoPublishContainerScene.LLILZ;
        if (c40984G6q != null) {
            c40984G6q.LJIILJJIL(videoPublishContainerScene.LLLFF(), videoPublishContainerScene.LLILZLL);
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS145S0100000_7 aObjectS145S0100000_7, Object avatarUrl) {
        o.LJIIIZ(avatarUrl, "avatarUrl");
        ((InterfaceC88472Yns) aObjectS145S0100000_7.l0).invoke(avatarUrl);
        return C76800UCe.LIZ;
    }
}
