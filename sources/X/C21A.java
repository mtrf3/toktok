package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
/* renamed from: X.21A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21A extends C3CS {
    public InterfaceC13460fu LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C32991Rf LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21A(C32991Rf c32991Rf, InterfaceC67352kd<? super C21A> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c32991Rf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJFF(null, this);
    }
}
