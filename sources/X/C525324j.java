package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {159, 183, 186}, m = "processNewAnchors$material_release")
/* renamed from: X.24j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C525324j extends C3CS {
    public C21470sp LJLIL;
    public Object LJLILLLLZI;
    public float LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C21470sp<T> LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C525324j(C21470sp<T> c21470sp, InterfaceC67352kd<? super C525324j> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c21470sp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJII(null, null, this);
    }
}
