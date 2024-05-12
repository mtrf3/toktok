package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.vesdk.VESize;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.composer.task.GenerateNickNameStickerTask", f = "GenerateNickNameStickerTask.kt", l = {78}, m = "runInternal")
/* loaded from: classes8.dex */
public final class GZW extends C3CS {
    public GYA LJLIL;
    public Object LJLILLLLZI;
    public StickerItemModel LJLJI;
    public VESize LJLJJI;
    public OSZ LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ GZV LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GZW(GZV gzv, InterfaceC67352kd<? super GZW> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = gzv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LIZIZ(null, this);
    }
}
