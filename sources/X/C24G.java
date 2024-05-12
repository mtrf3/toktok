package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.24G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24G extends AbstractC65781Prl implements InterfaceC65784Pro<Context> {
    public static final C24G LJLIL = new C24G();

    public C24G() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Context invoke() {
        return ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
    }
}
