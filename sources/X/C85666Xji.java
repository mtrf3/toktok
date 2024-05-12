package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;

/* renamed from: X.Xji, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85666Xji implements InterfaceC85669Xjl {
    public final /* synthetic */ PhoneLoginFragment LIZ;

    @Override // X.InterfaceC85669Xjl
    public final void onCancel() {
        DialogC85670Xjm dialogC85670Xjm = this.LIZ.LJZL;
        if (dialogC85670Xjm != null) {
            V1B.LJLILLLLZI(dialogC85670Xjm);
        }
    }

    public C85666Xji(PhoneLoginFragment phoneLoginFragment) {
        this.LIZ = phoneLoginFragment;
    }
}
