package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResult;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.VCStageUtils", f = "VCStageUtils.kt", l = {657, 665}, m = "writeToFile")
/* renamed from: X.6hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167196hH extends C3CS {
    public VCAudioResult LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C167106h8 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167196hH(C167106h8 c167106h8, InterfaceC67352kd<? super C167196hH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c167106h8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJ(null, null, null, this);
    }
}
