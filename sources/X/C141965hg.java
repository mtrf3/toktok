package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.MusicBeatGenerate", f = "MusicBeatGenerate.kt", l = {166, 169}, m = "fetchAlgorithmModel2")
/* renamed from: X.5hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141965hg extends C3CS {
    public boolean LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C141945he LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141965hg(C141945he c141945he, InterfaceC67352kd<? super C141965hg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c141945he;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(this);
    }
}
