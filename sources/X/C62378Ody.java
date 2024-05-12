package X;

import android.content.Context;
import com.ss.android.ugc.aweme.challenge.presenter.ChallengeSharePackageV2;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Ody, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62378Ody implements InterfaceC62382Oe2 {
    @Override // X.InterfaceC62382Oe2
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        Challenge challenge;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.presenter.ChallengeSharePackageV2");
        ShareModel shareModel = baseSharePackage.shareModel;
        Serializable serializable = null;
        if (shareModel != null) {
            serializable = shareModel.customModel;
        }
        if (!(serializable instanceof Challenge) || (challenge = (Challenge) serializable) == null) {
            return;
        }
        C62410OeU c62410OeU = ChallengeSharePackageV2.Companion;
        String key = channel.key();
        c62410OeU.getClass();
        C62410OeU.LIZ(key, z, context, challenge);
    }
}
