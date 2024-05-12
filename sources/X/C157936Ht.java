package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextRepository", f = "EffectTextBean.kt", l = {218, 220, 223}, m = "getEffectTextFontFromCacheOrNet")
/* renamed from: X.6Ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157936Ht extends C3CS {
    public C157926Hs LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C157926Hs LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157936Ht(C157926Hs c157926Hs, InterfaceC67352kd<? super C157936Ht> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c157926Hs;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
