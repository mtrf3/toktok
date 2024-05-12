package X;

import com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.journey.feed.notinterested.NotInterestedTutorialService;
import java.lang.ref.WeakReference;

/* renamed from: X.2Oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57712Oh implements INotInterestedTutorialService {
    public static final C57712Oh LIZIZ = new C57712Oh();
    public final /* synthetic */ INotInterestedTutorialService LIZ;

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZ(WeakReference<IDR> weakReference, WeakReference<C54258LRe> weakReference2) {
        this.LIZ.LIZ(weakReference, weakReference2);
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZIZ(int i, Aweme aweme) {
        this.LIZ.LIZIZ(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.guide.notinterested.INotInterestedTutorialService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    public C57712Oh() {
        INotInterestedTutorialService iNotInterestedTutorialService;
        Object LIZ = C58096Mr6.LIZ(INotInterestedTutorialService.class, false);
        if (LIZ != null) {
            iNotInterestedTutorialService = (INotInterestedTutorialService) LIZ;
        } else {
            if (C58096Mr6.F1 == null) {
                synchronized (INotInterestedTutorialService.class) {
                    if (C58096Mr6.F1 == null) {
                        C58096Mr6.F1 = new NotInterestedTutorialService();
                    }
                }
            }
            iNotInterestedTutorialService = C58096Mr6.F1;
        }
        this.LIZ = iNotInterestedTutorialService;
    }
}
