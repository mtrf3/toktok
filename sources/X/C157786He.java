package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBean", f = "EffectTextBean.kt", l = {76}, m = "isNeedDownload")
/* renamed from: X.6He, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157786He extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C157776Hd LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157786He(C157776Hd c157776Hd, InterfaceC67352kd<? super C157786He> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c157776Hd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(this);
    }
}
