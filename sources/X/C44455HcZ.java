package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.IConfigService;

/* renamed from: X.HcZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44455HcZ extends AbstractC65781Prl implements InterfaceC65784Pro<IConfigService> {
    public static final C44455HcZ LJLIL = new C44455HcZ();

    public C44455HcZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IConfigService invoke() {
        return AVExternalServiceImpl.LIZ().configService();
    }
}
