package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$readTextWithOutUI$4$1", f = "TTSPanelUIComponent.kt", l = {1539, 1551, 1561}, m = "invokeSuspend")
/* renamed from: X.5bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138005bI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C138075bP LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C68322mC<TextStickerData> LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ Effect LJLJLJ;
    public final /* synthetic */ SpeakerCenter.KevaSpeakerBean LJLJLLL;
    public final /* synthetic */ TextStickerData LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138005bI(C138075bP c138075bP, long j, C68322mC<TextStickerData> c68322mC, String str, String str2, Effect effect, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, TextStickerData textStickerData, InterfaceC67352kd<? super C138005bI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c138075bP;
        this.LJLJJI = j;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = effect;
        this.LJLJLLL = kevaSpeakerBean;
        this.LJLL = textStickerData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138005bI(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138005bI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
