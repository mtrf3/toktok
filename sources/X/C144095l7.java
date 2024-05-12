package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.compile.Video2StickerNextTaskRunnerKt", f = "Video2StickerNextTaskRunner.kt", l = {102, 106, 125}, m = "textAudit")
/* renamed from: X.5l7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144095l7 extends C3CS {
    public Object LJLIL;
    public C144265lO LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public int LJLJJLL;

    public C144095l7(InterfaceC67352kd<? super C144095l7> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C144045l2.LIZIZ(null, null, null, this);
    }
}
