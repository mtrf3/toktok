package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog", f = "LiveProfileDialog.kt", l = {172, 177}, m = "awaitThenShow")
/* renamed from: X.Bhf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29483Bhf extends C3CS {
    public LiveProfileDialog LJLIL;
    public FragmentManager LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ LiveProfileDialog LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29483Bhf(LiveProfileDialog liveProfileDialog, InterfaceC67352kd<? super C29483Bhf> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = liveProfileDialog;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.vl(null, null, null, this);
    }
}
