package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tid, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C75407Tid extends TBS implements InterfaceC88472Yns<List<? extends UserState>, C76800UCe> {
    public C75407Tid(Object obj) {
        super(1, obj, C75406Tic.class, "onUserStateChanged", "onUserStateChanged(Ljava/util/List;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends UserState> p0) {
        o.LJIIIZ(p0, "p0");
        InterfaceC88472Yns<? super List<UserState>, C76800UCe> interfaceC88472Yns = ((C75406Tic) this.receiver).LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(p0);
        }
        return C76800UCe.LIZ;
    }
}
