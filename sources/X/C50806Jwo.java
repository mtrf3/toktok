package X;

import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Jwo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50806Jwo extends AbstractC60800Ntc {
    public final /* synthetic */ C68322mC<C50811Jwt> LJLIL;
    public final /* synthetic */ C50799Jwh LJLILLLLZI;
    public final /* synthetic */ AbstractC60800Ntc LJLJI;
    public final /* synthetic */ DynamicPatch LJLJJI;
    public final /* synthetic */ TemplateData LJLJJL;
    public final /* synthetic */ LynxViewClient LJLJJLL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C50811Jwt c50811Jwt = this.LJLIL.element;
        if (c50811Jwt != null) {
            C50802Jwk.LJ(this.LJLILLLLZI, c50811Jwt, this.LJLJI, this.LJLJJI, this.LJLJJL);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        C50802Jwk c50802Jwk = C50802Jwk.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI.LJIIJJI;
        String str2 = this.LJLJJI.schema;
        o.LJIIIIZZ(str2, "dynamicPatch.schema");
        C50802Jwk.LIZIZ(c50802Jwk, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str2, this.LJLJJL, false, this.LJLJI, this.LJLJJLL, null, 64);
    }

    public C50806Jwo(C68322mC c68322mC, C50799Jwh c50799Jwh, C50800Jwi c50800Jwi, DynamicPatch dynamicPatch, TemplateData templateData, LynxViewClient lynxViewClient) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c50799Jwh;
        this.LJLJI = c50800Jwi;
        this.LJLJJI = dynamicPatch;
        this.LJLJJL = templateData;
        this.LJLJJLL = lynxViewClient;
    }
}
