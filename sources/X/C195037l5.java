package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostDeleteServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.7l5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195037l5 implements INowDeleteService {
    public static final C195037l5 LIZIZ = new C195037l5();
    public final /* synthetic */ INowDeleteService LIZ;

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZIZ(Aweme aweme, String str) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LIZIZ(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZLLL(String str) {
        this.LIZ.LIZLLL(str);
    }

    public C195037l5() {
        INowDeleteService nowPostDeleteServiceImpl;
        Object LIZ = C58096Mr6.LIZ(INowDeleteService.class, false);
        if (LIZ != null) {
            nowPostDeleteServiceImpl = (INowDeleteService) LIZ;
        } else {
            nowPostDeleteServiceImpl = new NowPostDeleteServiceImpl();
        }
        this.LIZ = nowPostDeleteServiceImpl;
    }
}
