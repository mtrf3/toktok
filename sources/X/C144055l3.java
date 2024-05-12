package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.compile.Video2StickerNextTaskRunnerKt", f = "Video2StickerNextTaskRunner.kt", l = {46, 51, 71, 86}, m = "onNext")
/* renamed from: X.5l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144055l3 extends C3CS {
    public Object LJLIL;
    public VideoPublishEditModel LJLILLLLZI;
    public C133765Mu LJLJI;
    public InterfaceC136385Ww LJLJJI;
    public C144265lO LJLJJL;
    public Video2StickerModel LJLJJLL;
    public Object LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public int LJLJLLL;

    public C144055l3(InterfaceC67352kd<? super C144055l3> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C144045l2.LIZ(null, null, null, null, null, this);
    }
}
