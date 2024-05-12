package X;

import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.VoiceSearchResponse;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model.VoiceSearchResult;
import java.util.List;

/* renamed from: X.alL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94707alL extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C94351afb LJLIL;
    public final /* synthetic */ VoiceSearchResponse LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94707alL(C94351afb c94351afb, VoiceSearchResponse voiceSearchResponse, boolean z) {
        super(0);
        this.LJLIL = c94351afb;
        this.LJLILLLLZI = voiceSearchResponse;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        List<VoiceSearchResult> list;
        VoiceSearchResult voiceSearchResult;
        InterfaceC93964aZM interfaceC93964aZM = this.LJLIL.LIZIZ;
        if (interfaceC93964aZM != null) {
            VoiceSearchResponse voiceSearchResponse = this.LJLILLLLZI;
            if (voiceSearchResponse == null || (list = voiceSearchResponse.result) == null || (voiceSearchResult = (VoiceSearchResult) ORZ.LJLLLLLL(0, list)) == null || (str = voiceSearchResult.text) == null) {
                str = "";
            }
            interfaceC93964aZM.LIZ(new C94309aev(str, "", "", 1), this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
