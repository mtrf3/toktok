package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.4bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112724bc extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ User LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112724bc(Context context, User user, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, String str) {
        super(0);
        this.LJLIL = context;
        this.LJLILLLLZI = user;
        this.LJLJI = c68322mC;
        this.LJLJJI = c68322mC2;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C112714bb.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI.element, this.LJLJJI.element, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
