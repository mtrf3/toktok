package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.2TL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2TL LJLIL = new C2TL();

    public C2TL() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            Boolean valueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("open_bdtracker_event_priority", false));
            C3C5.m7constructorimpl(valueOf);
            bool = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            bool = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(bool) == null) {
            return bool;
        }
        return Boolean.FALSE;
    }
}
