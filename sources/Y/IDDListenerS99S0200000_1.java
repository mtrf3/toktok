package Y;

import X.ActivityC45651qj;
import X.C2IP;
import X.C2U8;
import X.C4HQ;
import X.C4IJ;
import X.C59522Vg;
import X.C70552pn;
import X.C77266UUc;
import X.C78613UtF;
import X.LRD;
import X.XKX;
import android.content.DialogInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.im.sdk.share.fragment.DownloadAndShareFragment;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDDListenerS99S0200000_1 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS99S0200000_1 iDDListenerS99S0200000_1, DialogInterface dialogInterface) {
        ((DownloadAndShareFragment) iDDListenerS99S0200000_1.l0).LJLILLLLZI = false;
        DownloadAndShareFragment downloadAndShareFragment = (DownloadAndShareFragment) iDDListenerS99S0200000_1.l0;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDDListenerS99S0200000_1.l1;
        SharePackage sharePackage = downloadAndShareFragment.LJLJJI;
        if (sharePackage != null) {
            String string = sharePackage.extras.getString("enter_from");
            if (string == null) {
                string = "";
            }
            if (C59522Vg.LIZ()) {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj), C78613UtF.LIZJ, null, new C70552pn(activityC45651qj, string, null), 2);
            } else {
                C77266UUc.LIZIZ.LJFF(activityC45651qj, string, 0, "download");
            }
            ShareExtService LJJLIIJ = ShareExtServiceImpl.LJJLIIJ();
            SharePackage sharePackage2 = ((DownloadAndShareFragment) iDDListenerS99S0200000_1.l0).LJLJJI;
            if (sharePackage2 != null) {
                LJJLIIJ.LJJIIZ(sharePackage2);
                LRD.LIZ((ActivityC45651qj) iDDListenerS99S0200000_1.l1).LJIIJ("downloaded_video_share_dialog", false, null);
                FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
                if (LJIIZILJ != null) {
                    LJIIZILJ.LJIILLIIL(false);
                }
                C2U8.LIZ(new C2IP(false, true));
                return;
            }
            o.LJIJI("sharePackage");
            throw null;
        }
        o.LJIJI("sharePackage");
        throw null;
    }

    public static final void onDismiss$1(IDDListenerS99S0200000_1 iDDListenerS99S0200000_1, DialogInterface dialogInterface) {
        C4HQ c4hq = (C4HQ) iDDListenerS99S0200000_1.l0;
        C4IJ c4ij = (C4IJ) iDDListenerS99S0200000_1.l1;
        c4ij.getClass();
        c4hq.LIZ(new ArrayList(c4ij.LJLJLJ));
    }

    public IDDListenerS99S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
