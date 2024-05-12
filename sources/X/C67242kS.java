package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView", f = "StickerItemView.kt", l = {494}, m = "loadBitmap")
/* renamed from: X.2kS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67242kS extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C130525Ai LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67242kS(C130525Ai c130525Ai, InterfaceC67352kd<? super C67242kS> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c130525Ai;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIIJJI(null, null, 0, 0, this);
    }
}
