package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Hkh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44959Hkh implements InterfaceC45398Hrm {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ AlertDialogC45396Hrk LJLILLLLZI;
    public final /* synthetic */ SharePackage LJLJI;
    public final /* synthetic */ Aweme LJLJJI;

    public C44959Hkh(Context context, Aweme aweme, SharePackage sharePackage, AlertDialogC45396Hrk alertDialogC45396Hrk) {
        this.LJLIL = context;
        this.LJLILLLLZI = alertDialogC45396Hrk;
        this.LJLJI = sharePackage;
        this.LJLJJI = aweme;
    }

    @Override // X.InterfaceC45398Hrm
    public final void LIZIZ() {
        String str;
        Bundle bundle;
        Bundle bundle2;
        if (C44896Hjg.LIZIZ) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(shareService, "shareService()");
            shareService.LJIL(this.LJLIL, false);
            RuntimeBehaviorServiceImpl.LJ().LIZ("download_cancel");
        }
        C62340OdM.LIZ(this.LJLIL, this.LJLILLLLZI);
        C188727au c188727au = new C188727au();
        SharePackage sharePackage = this.LJLJI;
        String str2 = null;
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            str = bundle2.getString("enter_from");
        } else {
            str = null;
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", this.LJLJJI.getAid());
        SharePackage sharePackage2 = this.LJLJI;
        if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
            str2 = bundle.getString("download_method");
        }
        c188727au.LJIIIZ("download_method", str2);
        FMX.LJIIL("download_cancel", c188727au.LIZ);
    }
}
