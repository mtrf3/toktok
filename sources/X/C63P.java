package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.63P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63P extends AbstractC65781Prl implements InterfaceC88472Yns<Effect, Boolean> {
    public final /* synthetic */ C164246cW LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ C34K LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ C34K LJLL;
    public final /* synthetic */ boolean LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63P(C164246cW c164246cW, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C34K c34k, boolean z7, C34K c34k2, boolean z8) {
        super(1);
        this.LJLIL = c164246cW;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
        this.LJLJJLL = z5;
        this.LJLJL = z6;
        this.LJLJLJ = c34k;
        this.LJLJLLL = z7;
        this.LJLL = c34k2;
        this.LJLLI = z8;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Effect effect) {
        Effect it = effect;
        o.LJIIIZ(it, "it");
        boolean z = false;
        if (!this.LJLIL.LLJJIJIIJIL(it) && ((this.LJLILLLLZI || !it.getTags().contains("LyricsSticker")) && ((this.LJLJI || !it.getTags().contains("donation")) && ((this.LJLJJI || !it.getTags().contains("addyours")) && ((this.LJLJJL || !it.getTags().contains("CountdownSticker")) && ((this.LJLJJLL || !it.getTags().contains("pollsticker")) && ((!C77117UOj.LJIJ(it) || !C77117UOj.LJIJ(it) || (e1.LIZ(31744, "info_sticker_support_uploading_pictures", true, false) && !C1DG.LJIIIIZZ())) && ((this.LJLJL || (!it.getTags().contains("mention") && !it.getTags().contains("hashtag"))) && ((this.LJLJLJ.element || !it.getTags().contains("commentPanel")) && ((this.LJLJLLL || !C77117UOj.LJIJJLI(it)) && ((this.LJLL.element || !it.getTags().contains("plantScanner")) && (this.LJLLI || !it.getTags().contains("location"))))))))))))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
