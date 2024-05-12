package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Jxk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50864Jxk extends AbstractC60800Ntc {
    public final /* synthetic */ C68322mC<C2JZ> LJLIL;
    public final /* synthetic */ C50863Jxj LJLILLLLZI;
    public final /* synthetic */ AbstractC60800Ntc LJLJI;
    public final /* synthetic */ DynamicPatch LJLJJI;
    public final /* synthetic */ TemplateData LJLJJL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C68322mC<C2JZ> c68322mC = this.LJLIL;
        if (c68322mC.element == null) {
            return;
        }
        C50863Jxj c50863Jxj = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("continue preload succeed:");
        LIZ.append(c68322mC.element);
        C15280iq.LIZIZ("SparkLoadHelper", X1D.LIZIZ(LIZ));
        c50863Jxj.LJIIJJI = true;
        o.LJIIIZ(null, "<set-?>");
        throw null;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("continue preload failed:");
        LIZ.append(this.LJLIL.element);
        C15280iq.LIZIZ("SparkLoadHelper", X1D.LIZIZ(LIZ));
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI.LJIIJ;
        String str2 = this.LJLJJI.schema;
        o.LJIIIIZZ(str2, "dynamicPatch.schema");
        C50859Jxf.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str2, this.LJLJJL, false, this.LJLJI, null, null);
    }

    public C50864Jxk(C68322mC c68322mC, C50863Jxj c50863Jxj, C50857Jxd c50857Jxd, DynamicPatch dynamicPatch, TemplateData templateData) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c50863Jxj;
        this.LJLJI = c50857Jxd;
        this.LJLJJI = dynamicPatch;
        this.LJLJJL = templateData;
    }
}
