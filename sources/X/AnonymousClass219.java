package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
/* renamed from: X.219, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass219 extends C3CS {
    public C32991Rf LJLIL;
    public Object LJLILLLLZI;
    public InterfaceC13460fu LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C32991Rf LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass219(C32991Rf c32991Rf, InterfaceC67352kd<? super AnonymousClass219> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c32991Rf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZJ(this);
    }
}
