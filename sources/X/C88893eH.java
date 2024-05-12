package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.vcloud.vctrace.BuildConfig;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.StickerStoreHelper", f = "StickerStoreHelper.kt", l = {275, 277, BuildConfig.VERSION_CODE}, m = "addFavSticker")
/* renamed from: X.3eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88893eH extends C3CS {
    public Object LJLIL;
    public InterfaceC71992s7 LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C88873eF LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88893eH(C88873eF c88873eF, InterfaceC67352kd<? super C88893eH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c88873eF;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, null, 0L, 0, null, null, this);
    }
}
