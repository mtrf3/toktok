package X;

import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AAu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25804AAu implements InterfaceC25805AAv {
    public final /* synthetic */ CaptionsPanelFragment LIZ;

    @Override // X.InterfaceC25805AAv
    public final void LIZ() {
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }

    public C25804AAu(CaptionsPanelFragment captionsPanelFragment) {
        this.LIZ = captionsPanelFragment;
    }

    @Override // X.InterfaceC25805AAv
    public final void LIZIZ(String[] changedLanguageCodes, String[] changedLanguageNames) {
        o.LJIIIZ(changedLanguageCodes, "changedLanguageCodes");
        o.LJIIIZ(changedLanguageNames, "changedLanguageNames");
        C25792AAi.LIZ().LIZLLL(changedLanguageCodes);
        C25792AAi.LIZ().LJIIL(changedLanguageNames);
        CaptionsPanelFragment captionsPanelFragment = this.LIZ;
        C25825ABp c25825ABp = captionsPanelFragment.LJLJLLL;
        if (c25825ABp != null) {
            c25825ABp.LJIIJ(new AqS170S0100000_4(captionsPanelFragment, 936));
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.daz);
        c26045AKb.LJIIJ();
    }
}
