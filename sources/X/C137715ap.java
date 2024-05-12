package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.TTSFragment$downloadMultiAudio$1", f = "TTSFragment.kt", l = {490, 498}, m = "invokeSuspend")
/* renamed from: X.5ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137715ap extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public TTSFragment LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public NLETrackSlot LJLJL;
    public Object LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final /* synthetic */ TTSFragment LJLLILLLL;
    public final /* synthetic */ ArrayList<NLETrackSlot> LJLLJ;
    public final /* synthetic */ ArrayList<C137775av> LJLLL;
    public final /* synthetic */ String LJLLLL;
    public final /* synthetic */ String LJLLLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137715ap(TTSFragment tTSFragment, ArrayList<NLETrackSlot> arrayList, ArrayList<C137775av> arrayList2, String str, String str2, InterfaceC67352kd<? super C137715ap> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLLILLLL = tTSFragment;
        this.LJLLJ = arrayList;
        this.LJLLL = arrayList2;
        this.LJLLLL = str;
        this.LJLLLLLL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137715ap(this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0040, code lost:
    
        r4.LLIIL = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:16:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0136 -> B:6:0x0033). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137715ap.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
