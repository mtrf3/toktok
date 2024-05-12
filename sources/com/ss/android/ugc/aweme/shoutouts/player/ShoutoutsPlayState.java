package com.ss.android.ugc.aweme.shoutouts.player;

import X.EnumC51721KRp;
import X.F9E;
import X.InterfaceC61312at;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ShoutoutsPlayState extends F9E implements InterfaceC61312at {
    public final int progress;
    public final EnumC51721KRp status;

    /* JADX WARN: Multi-variable type inference failed */
    public ShoutoutsPlayState() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShoutoutsPlayState copy$default(ShoutoutsPlayState shoutoutsPlayState, int i, EnumC51721KRp enumC51721KRp, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shoutoutsPlayState.progress;
        }
        if ((i2 & 2) != 0) {
            enumC51721KRp = shoutoutsPlayState.status;
        }
        return shoutoutsPlayState.copy(i, enumC51721KRp);
    }

    public final ShoutoutsPlayState copy(int i, EnumC51721KRp status) {
        o.LJIIIZ(status, "status");
        return new ShoutoutsPlayState(i, status);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.progress), this.status};
    }

    public final int getProgress() {
        return this.progress;
    }

    public final EnumC51721KRp getStatus() {
        return this.status;
    }

    public ShoutoutsPlayState(int i, EnumC51721KRp status) {
        o.LJIIIZ(status, "status");
        this.progress = i;
        this.status = status;
    }

    public /* synthetic */ ShoutoutsPlayState(int i, EnumC51721KRp enumC51721KRp, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? EnumC51721KRp.PREPARED : enumC51721KRp);
    }
}
