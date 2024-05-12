package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Hs5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45417Hs5 implements OW1 {
    public FeedPanelStateViewModel LIZ;
    public A90 LIZIZ;

    @Override // X.OW1
    public final void LIZ() {
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme != null && aweme.getAwemeACLShareInfo() != null && aweme.getAwemeACLShareInfo().getDownloadGeneral() != null && aweme.getAwemeACLShareInfo().getDownloadGeneral().getTranscode() != 1) {
            return true;
        }
        return false;
    }

    @Override // X.OW1
    public final void LIZIZ(Activity activity, Aweme aweme, String str, String str2) {
        String str3;
        if (activity.isFinishing()) {
            return;
        }
        o.LJIIIZ(aweme, "aweme");
        String LIZ = C36703Eap.LIZ();
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String path = new File(LIZ, aid).getPath();
        o.LJIIIIZZ(path, "File(path, getGifVideoFileName(aweme)).path");
        File file = new File(path);
        if (file.exists() && file.length() > 0) {
            if (activity.isFinishing()) {
                return;
            }
            VideoShare2GifEditActivity.LLFII(activity, aweme.getAid(), aweme.getAuthorUid(), LIZJ(aweme), path, str, str2);
            return;
        }
        if (activity instanceof ActivityC45651qj) {
            this.LIZ = (FeedPanelStateViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(FeedPanelStateViewModel.class);
        }
        if (aweme.getVideo() != null && aweme.getVideo().getPlayAddrH264() != null && aweme.getVideo().getPlayAddrH264().getUrlList() != null) {
            str3 = (String) ListProtector.get(aweme.getVideo().getPlayAddrH264().getUrlList(), 0);
        } else {
            str3 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        File file2 = new File(path);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdir();
        }
        DownloadTask with = C84261X5d.with(EF7.LIZIZ());
        with.url(str3);
        with.savePath(C36703Eap.LIZ());
        String aid2 = aweme.getAid();
        o.LJIIIIZZ(aid2, "aweme.aid");
        with.name(aid2);
        with.subThreadListener(new C45415Hs3(this, activity, aweme, str, str2, str3));
        with.download();
    }
}
