package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingMonitor;

/* renamed from: X.X8t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84355X8t extends ContentObserver {
    public final /* synthetic */ AccessibilityEventTrackingMonitor LIZ;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        String LIZ = J1R.LIZ(this.LIZ.btmMapping(C12460eI.LJFF()));
        for (EnumC84359X8x enumC84359X8x : EnumC84359X8x.values()) {
            C40206FqE.LIZJ(enumC84359X8x, this.LIZ.getContext(), LIZ, "setting_update");
            C40206FqE.LIZIZ(enumC84359X8x, this.LIZ.getContext(), LIZ, "setting_update");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84355X8t(AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor, Handler handler) {
        super(handler);
        this.LIZ = accessibilityEventTrackingMonitor;
    }
}
