package X;

import Y.AObserverS69S0100000_1;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.44k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1035044k implements AnonymousClass456 {
    public final ChatRoomViewModel LIZ;
    public final C1034344d LIZIZ;

    @Override // X.AnonymousClass456
    public final void LIZIZ() {
        C57082Lw.LIZ.LIZ("#MINUS_ITEM_HEIGHT_EVENT");
    }

    @Override // X.AnonymousClass456
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        NextLiveData LIZIZ = C57082Lw.LIZ.LIZIZ("#MINUS_ITEM_HEIGHT_EVENT");
        o.LJIIIIZZ(LIZIZ, "get().with(MINUS_ITEM_HE…usHeightInfo::class.java)");
        LIZIZ.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 129), false);
    }

    public C1035044k(ChatRoomViewModel chatRoomViewModel, C1034344d mediator) {
        o.LJIIIZ(mediator, "mediator");
        this.LIZ = chatRoomViewModel;
        this.LIZIZ = mediator;
    }
}
