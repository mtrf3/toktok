package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI;

/* renamed from: X.3fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89773fh extends AbstractC65781Prl implements InterfaceC65784Pro<QAInvitationAPI.InterfaceC0028QAInvitationAPI> {
    public static final C89773fh LJLIL = new C89773fh();

    public C89773fh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI$QAInvitationAPI] */
    @Override // X.InterfaceC65784Pro
    public final QAInvitationAPI.InterfaceC0028QAInvitationAPI invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, QAInvitationAPI.InterfaceC0028QAInvitationAPI.class);
    }
}
