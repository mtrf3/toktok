package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget", f = "CaptionTextWidget.kt", l = {355, 363, 367}, m = "refreshDataBuffer")
/* renamed from: X.BZu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29002BZu extends C3CS {
    public CaptionTextWidget LJLIL;
    public C29296Bee LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ CaptionTextWidget LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29002BZu(CaptionTextWidget captionTextWidget, InterfaceC67352kd<? super C29002BZu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = captionTextWidget;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJZL(null, null, this);
    }
}
