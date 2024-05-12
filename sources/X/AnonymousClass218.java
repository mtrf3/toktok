package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

@InterfaceC65848Psq(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {61, BaseNotice.CREATOR}, m = "awaitLoad")
/* renamed from: X.218, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass218 extends C3CS {
    public C32941Ra LJLIL;
    public InterfaceC13460fu LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C32941Ra LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass218(C32941Ra c32941Ra, InterfaceC67352kd<? super AnonymousClass218> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c32941Ra;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
