package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;

/* renamed from: X.4QJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QJ extends AbstractC65781Prl implements InterfaceC65784Pro<C4QI> {
    public static final C4QJ LJLIL = new C4QJ();

    public C4QJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4QI] */
    @Override // X.InterfaceC65784Pro
    public final C4QI invoke() {
        return new IMContact() { // from class: X.4QI
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
