package X;

import android.content.Context;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeSharePackageV2;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Odx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62377Odx implements InterfaceC62383Oe3 {
    @Override // X.InterfaceC62383Oe3
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        Challenge challenge;
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        ShareModel shareModel = sharePackage.shareModel;
        Serializable serializable = null;
        if (shareModel != null) {
            serializable = shareModel.customModel;
        }
        if ((serializable instanceof Challenge) && (challenge = (Challenge) serializable) != null && C62379Odz.LIZ(action)) {
            C62410OeU c62410OeU = ChallengeSharePackageV2.Companion;
            String key = action.key();
            c62410OeU.getClass();
            C62410OeU.LIZ(key, true, context, challenge);
        }
    }
}
