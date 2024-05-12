package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.PhotoModeImageLoader", f = "PhotoModeImageLoader.kt", l = {42}, m = "downloadImagesWithFilePaths")
/* renamed from: X.2io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66222io extends C3CS {
    public C78774Uvq LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C78774Uvq LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66222io(C78774Uvq c78774Uvq, InterfaceC67352kd<? super C66222io> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c78774Uvq;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
