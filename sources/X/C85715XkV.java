package X;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment;

/* renamed from: X.XkV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85715XkV implements InterfaceC70769Rq1 {
    public final /* synthetic */ CommonSetAvatarFragment LJLIL;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    public C85715XkV(CommonSetAvatarFragment commonSetAvatarFragment) {
        this.LJLIL = commonSetAvatarFragment;
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        this.LJLIL.LLII = SystemClock.elapsedRealtime();
        this.LJLIL.getClass();
        CommonSetAvatarFragment.Tl(null, "start");
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        CommonSetAvatarFragment commonSetAvatarFragment = this.LJLIL;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LJLIL.LLII);
        commonSetAvatarFragment.getClass();
        CommonSetAvatarFragment.Tl(valueOf, "fail");
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        CommonSetAvatarFragment commonSetAvatarFragment = this.LJLIL;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LJLIL.LLII);
        commonSetAvatarFragment.getClass();
        CommonSetAvatarFragment.Tl(valueOf, "success");
    }
}
