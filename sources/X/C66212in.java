package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.components.ArticleImageLoader", f = "ArticleImageLoader.kt", l = {42}, m = "downloadImagesWithFilePaths")
/* renamed from: X.2in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66212in extends C3CS {
    public C78773Uvp LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C78773Uvp LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66212in(C78773Uvp c78773Uvp, InterfaceC67352kd<? super C66212in> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c78773Uvp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
