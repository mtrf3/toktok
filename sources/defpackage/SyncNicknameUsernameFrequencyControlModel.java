package defpackage;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SyncNicknameUsernameFrequencyControlModel extends F9E {

    @InterfaceC65349Pkn("api")
    public final int apiInterval;

    @InterfaceC65349Pkn("popup")
    public final m popUpFrequency;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.apiInterval), this.popUpFrequency};
    }

    public SyncNicknameUsernameFrequencyControlModel(int i, m popUpFrequency) {
        o.LJIIIZ(popUpFrequency, "popUpFrequency");
        this.apiInterval = i;
        this.popUpFrequency = popUpFrequency;
    }
}
