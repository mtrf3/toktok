package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.XxU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86520XxU<T> implements InterfaceC64592gB {
    public static final C86520XxU<T> LJLIL = new C86520XxU<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            C86497Xx7.LJ().erase("wait_status_messages");
        }
    }
}
