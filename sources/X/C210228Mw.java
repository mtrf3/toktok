package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nows.service.NowFeedPreLoadServiceImpl;
import com.ss.android.ugc.aweme.service.INowFeedPreLoadService;
import kotlin.jvm.internal.o;

/* renamed from: X.8Mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210228Mw implements INowFeedPreLoadService {
    public static final C210228Mw LIZIZ = new C210228Mw();
    public final /* synthetic */ INowFeedPreLoadService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INowFeedPreLoadService
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowFeedPreLoadService
    public final View LIZIZ(Context context, int i, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZIZ(context, i, viewGroup, layoutInflater);
    }

    public C210228Mw() {
        INowFeedPreLoadService iNowFeedPreLoadService;
        Object LIZ = C58096Mr6.LIZ(INowFeedPreLoadService.class, false);
        if (LIZ != null) {
            iNowFeedPreLoadService = (INowFeedPreLoadService) LIZ;
        } else {
            if (C58096Mr6.B3 == null) {
                synchronized (INowFeedPreLoadService.class) {
                    if (C58096Mr6.B3 == null) {
                        C58096Mr6.B3 = new NowFeedPreLoadServiceImpl();
                    }
                }
            }
            iNowFeedPreLoadService = C58096Mr6.B3;
        }
        this.LIZ = iNowFeedPreLoadService;
    }
}
