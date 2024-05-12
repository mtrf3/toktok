package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.JwI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50774JwI implements IEvent {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public C50774JwI(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView, IM2 loadStatus) {
        o.LJIIIZ(sparkView, "sparkView");
        o.LJIIIZ(loadStatus, "loadStatus");
        this.LJLIL = sparkView;
    }
}
