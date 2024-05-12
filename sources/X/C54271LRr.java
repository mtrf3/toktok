package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;

/* renamed from: X.LRr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54271LRr extends AbstractC65781Prl implements InterfaceC65784Pro<ILiveBubblePopService> {
    public static final C54271LRr LJLIL = new C54271LRr();

    public C54271LRr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService] */
    @Override // X.InterfaceC65784Pro
    public final ILiveBubblePopService invoke() {
        return ServiceManager.get().getService(ILiveBubblePopService.class);
    }
}
