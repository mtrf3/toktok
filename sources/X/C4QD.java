package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;

/* renamed from: X.4QD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4QD extends AbstractC65781Prl implements InterfaceC65784Pro<C4QE> {
    public static final C4QD LJLIL = new C4QD();

    public C4QD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4QE] */
    @Override // X.InterfaceC65784Pro
    public final C4QE invoke() {
        return new IMContact() { // from class: X.4QE
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
