package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager;
import com.ss.android.ugc.aweme.ad.feed.utils.FeedBackDialogManagerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Mu7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58283Mu7 implements IFeedBackDialogManager {
    public static final C58283Mu7 LIZIZ = new C58283Mu7();
    public final /* synthetic */ IFeedBackDialogManager LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final boolean LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZJ(Context context, Aweme aweme) {
        this.LIZ.LIZJ(context, aweme);
    }

    public C58283Mu7() {
        IFeedBackDialogManager iFeedBackDialogManager;
        Object LIZ = C58096Mr6.LIZ(IFeedBackDialogManager.class, false);
        if (LIZ != null) {
            iFeedBackDialogManager = (IFeedBackDialogManager) LIZ;
        } else {
            if (C58096Mr6.LL == null) {
                synchronized (IFeedBackDialogManager.class) {
                    if (C58096Mr6.LL == null) {
                        C58096Mr6.LL = new FeedBackDialogManagerService();
                    }
                }
            }
            iFeedBackDialogManager = C58096Mr6.LL;
        }
        this.LIZ = iFeedBackDialogManager;
    }
}
