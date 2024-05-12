package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;

/* renamed from: X.5bO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138065bO extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C138075bP LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ C68322mC<SpeakerCenter.KevaSpeakerBean> LJLJJI;
    public final /* synthetic */ TextStickerData LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138065bO(C138075bP c138075bP, String str, C68322mC<String> c68322mC, C68322mC<SpeakerCenter.KevaSpeakerBean> c68322mC2, TextStickerData textStickerData, boolean z) {
        super(0);
        this.LJLIL = c138075bP;
        this.LJLILLLLZI = str;
        this.LJLJI = c68322mC;
        this.LJLJJI = c68322mC2;
        this.LJLJJL = textStickerData;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.dH(this.LJLILLLLZI, this.LJLJI.element, this.LJLJJI.element, this.LJLJJL, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
