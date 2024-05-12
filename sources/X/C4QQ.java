package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;

/* renamed from: X.4QQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QQ extends AbstractC65781Prl implements InterfaceC65784Pro<C4QH> {
    public static final C4QQ LJLIL = new C4QQ();

    public C4QQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4QH] */
    @Override // X.InterfaceC65784Pro
    public final C4QH invoke() {
        return new IMContact() { // from class: X.4QH
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
