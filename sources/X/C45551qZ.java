package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1654, 1683}, m = "boundsUpdatesEventLoop")
/* renamed from: X.1qZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45551qZ extends C3CS {
    public C1A5 LJLIL;
    public C0M4 LJLILLLLZI;
    public InterfaceC169716lL LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C1A5 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45551qZ(C1A5 c1a5, InterfaceC67352kd<? super C45551qZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c1a5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(this);
    }
}
