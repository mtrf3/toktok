package X;

import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.viewmodel.MusicRecognitionVM;
import kotlin.jvm.internal.o;

/* renamed from: X.ajS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94590ajS extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC70422pa, C76800UCe> {
    public final /* synthetic */ MusicRecognitionVM LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94590ajS(MusicRecognitionVM musicRecognitionVM, String str, String str2) {
        super(1);
        this.LJLIL = musicRecognitionVM;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC70422pa runOnUIThread) {
        o.LJIIIZ(runOnUIThread, "$this$runOnUIThread");
        this.LJLIL.setStateImmediate(new C94591ajT(this.LJLILLLLZI, this.LJLJI));
        this.LJLIL.hv0(EnumC93590aTK.RECOGNITION_SUCCESS);
        return C76800UCe.LIZ;
    }
}
