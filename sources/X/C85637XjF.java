package X;

import Y.ARunnableS37S0100000_1;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeySetUpFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XjF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85637XjF implements InterfaceC85767XlL {
    public final /* synthetic */ PasskeySetUpFragment LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;

    @Override // X.InterfaceC85767XlL
    public final void LJII() {
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.runOnUiThread(new ARunnableS37S0100000_1(mo49getActivity, 97));
        }
    }

    @Override // X.InterfaceC85767XlL
    public final void LJJJJZI(Parcelable parcelable) {
        PasskeySetUpFragment passkeySetUpFragment = this.LJLIL;
        ActivityC45651qj currentActivity = this.LJLILLLLZI;
        o.LJIIIIZZ(currentActivity, "currentActivity");
        passkeySetUpFragment.getClass();
        C26045AKb c26045AKb = new C26045AKb(currentActivity);
        c26045AKb.LJIIIZ(currentActivity.getString(R.string.jf3));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
        this.LJLIL.Dl(new Bundle());
    }

    public C85637XjF(PasskeySetUpFragment passkeySetUpFragment, ActivityC45651qj activityC45651qj) {
        this.LJLIL = passkeySetUpFragment;
        this.LJLILLLLZI = activityC45651qj;
    }

    @Override // X.InterfaceC85767XlL
    public final void LJJZ(Throwable th, boolean z, Boolean bool, boolean z2) {
        PasskeySetUpFragment passkeySetUpFragment = this.LJLIL;
        ActivityC45651qj mo49getActivity = passkeySetUpFragment.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.runOnUiThread(new RunnableC85638XjG(passkeySetUpFragment, th, mo49getActivity, z, bool));
        }
    }
}
