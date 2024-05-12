package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.5bM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138045bM extends MB6 implements CoroutineExceptionHandler {
    public final /* synthetic */ C138075bP LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ReadTextEffectBean LJLJI;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        this.LJLIL.LLIZ(this.LJLILLLLZI, th.getMessage(), 900, this.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138045bM(AnonymousClass315 anonymousClass315, C138075bP c138075bP, int i, ReadTextEffectBean readTextEffectBean) {
        super(anonymousClass315);
        this.LJLIL = c138075bP;
        this.LJLILLLLZI = i;
        this.LJLJI = readTextEffectBean;
    }
}
