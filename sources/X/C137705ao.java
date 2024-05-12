package X;

import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.5ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137705ao extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ TTSFragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        this.LJLIL.lm(this.LJLILLLLZI, this.LJLJI, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137705ao(AnonymousClass315 anonymousClass315, TTSFragment tTSFragment, int i, int i2) {
        super(anonymousClass315);
        this.LJLIL = tTSFragment;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
