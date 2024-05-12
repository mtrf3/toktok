package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;

/* renamed from: X.4QB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QB extends AbstractC65781Prl implements InterfaceC65784Pro<C4QC> {
    public static final C4QB LJLIL = new C4QB();

    public C4QB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4QC] */
    @Override // X.InterfaceC65784Pro
    public final C4QC invoke() {
        return new IMContact() { // from class: X.4QC
            @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
            public UrlModel getDisplayAvatar() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
            public String getDisplayName() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.im.service.model.IMContact
            public String getNickName() {
                return null;
            }
        };
    }
}
