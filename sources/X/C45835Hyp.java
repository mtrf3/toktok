package X;

import com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener;
import com.ss.android.ugc.aweme.openshare.IShareRespSendService;
import com.ss.android.ugc.aweme.share.ShareRespSendServiceImpl;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Hyp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45835Hyp implements HandleMediaListener {
    public final /* synthetic */ SystemShareActivity LIZ;

    @Override // com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener
    public final void onArgsError() {
        IShareRespSendService LJ = ShareRespSendServiceImpl.LJ();
        SystemShareActivity systemShareActivity = this.LIZ;
        C43722HDy c43722HDy = systemShareActivity.LJLILLLLZI;
        if (c43722HDy != null) {
            LJ.LIZJ(systemShareActivity, c43722HDy, C45828Hyi.LJIIIIZZ);
        } else {
            o.LJIJI("shareContext");
            throw null;
        }
    }

    public C45835Hyp(SystemShareActivity systemShareActivity) {
        this.LIZ = systemShareActivity;
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener
    public final void onGetImagePath(ArrayList<String> arrayList) {
        this.LIZ.LLFZ(arrayList, EnumC70862qI.IMAGE);
    }

    @Override // com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener
    public final void onGetVideoPath(ArrayList<String> arrayList) {
        this.LIZ.LLFZ(arrayList, EnumC70862qI.VIDEO);
    }
}
