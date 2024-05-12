package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.Mfc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57384Mfc implements InterfaceC73463SsN<FollowStatus> {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    public C57384Mfc(AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL = aqS173S0100000_7;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(FollowStatus followStatus) {
        this.LJLIL.invoke(Integer.valueOf(followStatus.followStatus));
    }
}
