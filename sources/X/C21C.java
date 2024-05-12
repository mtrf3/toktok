package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {399}, m = "runCached")
/* renamed from: X.21C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21C extends C3CS {
    public C13420fq LJLIL;
    public C13400fo LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C13420fq LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21C(C13420fq c13420fq, InterfaceC67352kd<? super C21C> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c13420fq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, null, this);
    }
}
