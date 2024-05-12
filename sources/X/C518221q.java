package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.text.input.TextInputServiceAndroid", f = "TextInputServiceAndroid.android.kt", l = {204}, m = "textInputCommandEventLoop")
/* renamed from: X.21q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C518221q extends C3CS {
    public C1UA LJLIL;
    public InterfaceC169716lL LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C1UA LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518221q(C1UA c1ua, InterfaceC67352kd<? super C518221q> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c1ua;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJFF(this);
    }
}
