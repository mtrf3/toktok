package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadResultListener;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import ujb.o;

/* renamed from: X.ItL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48043ItL implements InterfaceC48512J2e {
    public final /* synthetic */ SmartFeedPreloadServiceImpl LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    public C48043ItL(SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl, Aweme aweme) {
        this.LIZ = smartFeedPreloadServiceImpl;
        this.LIZIZ = aweme;
    }

    @Override // X.InterfaceC48512J2e
    public final void LIZ(boolean z, int i, C48044ItM c48044ItM, IFF iff) {
        String str;
        String str2;
        SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl = this.LIZ;
        smartFeedPreloadServiceImpl.LIZLLL = false;
        float f = -1.0f;
        if (z && c48044ItM != null && (str2 = c48044ItM.LIZ) != null) {
            Float LIZIZ = c48044ItM.LIZIZ();
            if (LIZIZ != null) {
                f = LIZIZ.floatValue();
            }
            this.LIZ.LJII = str2;
            SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl2 = this.LIZ;
            smartFeedPreloadServiceImpl2.LJIIIIZZ = f;
            if (!smartFeedPreloadServiceImpl2.LJIIIZ.isEmpty()) {
                SmartFeedPreloadService.Companion.getClass();
                if (SmartFeedPreloadService.debug) {
                    System.currentTimeMillis();
                }
                String str3 = "";
                if (!TextUtils.isEmpty(str2)) {
                    if (o.LJJJLIIL(str2, "lt", false)) {
                        str3 = "lt";
                    } else if (o.LJJJLIIL(str2, "gt", false)) {
                        str3 = "gt";
                    } else {
                        str3 = "nor";
                    }
                }
                synchronized (smartFeedPreloadServiceImpl2.LJIIIZ) {
                    Iterator<ISmartFeedPreloadResultListener> it = smartFeedPreloadServiceImpl2.LJIIIZ.iterator();
                    while (it.hasNext()) {
                        it.next().onSmartFeedPreloadResult(str3, str2, f);
                    }
                }
                SmartFeedPreloadService.Companion.getClass();
                if (SmartFeedPreloadService.debug) {
                    System.currentTimeMillis();
                }
            }
        } else {
            smartFeedPreloadServiceImpl.LJII = "";
            this.LIZ.LJIIIIZZ = -1.0f;
        }
        SmartFeedPreloadService.Companion.getClass();
        if (SmartFeedPreloadService.debug) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startSmartPreloadV2Judge end aid:");
            LIZ.append(this.LIZIZ.getAid());
            LIZ.append('-');
            User author = this.LIZIZ.getAuthor();
            if (author != null) {
                str = author.getNickname();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(" predictLabelResult:");
            LIZ.append(this.LIZ.LJII);
            LIZ.append(" predictProbabilityResult:");
            LIZ.append(this.LIZ.LJIIIIZZ);
            LIZ.append(" success:");
            LIZ.append(z);
            LIZ.append(" errorCode:");
            LIZ.append(i);
            LIZ.append(" output:");
            LIZ.append(c48044ItM);
            X1D.LIZIZ(LIZ);
        }
    }
}
