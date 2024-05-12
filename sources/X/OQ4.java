package X;

import android.content.Context;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OQ4 extends C46181IAn {
    public OQ4() {
        super("fromWeb", true);
    }

    @Override // X.C46181IAn, X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Aweme o6 = AwemeService.LIZ().o6(sharePackage.extras.getString("aweme_id"));
        if (o6 == null) {
            return;
        }
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIIJJI(context, o6, sharePackage);
        super.LIZLLL(context, sharePackage);
    }
}
