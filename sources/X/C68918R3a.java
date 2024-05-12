package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.profilebadge.UserGetResponse;

/* renamed from: X.R3a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68918R3a<T> implements InterfaceC64592gB {
    public static final C68918R3a<T> LJLIL = new C68918R3a<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        UserGetResponse userGetResponse = (UserGetResponse) obj;
        if (userGetResponse.getUser() != null) {
            AccountService.LJIJ().LJFF().updateCurUser(userGetResponse.getUser());
        }
    }
}
