package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JkR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50039JkR implements InterfaceC50037JkP {
    public final /* synthetic */ BMR LIZ;

    public C50039JkR(C28609BKr c28609BKr) {
        this.LIZ = c28609BKr;
    }

    @Override // X.InterfaceC50037JkP
    public final void LIZ(List<? extends Aweme> rooms, InterfaceC78468Uqu interfaceC78468Uqu) {
        o.LJIIIZ(rooms, "rooms");
        this.LIZ.onSuccess(C78469Uqv.LIZ(rooms, interfaceC78468Uqu));
    }

    @Override // X.InterfaceC50037JkP
    public final void onFail(int i, String str) {
        this.LIZ.onFail();
    }
}
