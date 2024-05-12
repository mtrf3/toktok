package X;

import com.ss.android.common.applog.AppLog;

/* renamed from: X.FkA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39830FkA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C39830FkA LJLIL = new C39830FkA();

    public C39830FkA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return AppLog.getServerDeviceId();
    }
}
