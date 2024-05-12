package X;

import android.view.View;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.cla.et.newet.NotTransGuideShowEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS14S2100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ABn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC25823ABn implements View.OnClickListener {
    public final /* synthetic */ C25825ABp LJLIL;
    public final /* synthetic */ CaptionsPanelFragment LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public ViewOnClickListenerC25823ABn(C25825ABp c25825ABp, CaptionsPanelFragment captionsPanelFragment, boolean z, boolean z2) {
        this.LJLIL = c25825ABp;
        this.LJLILLLLZI = captionsPanelFragment;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Aweme aweme;
        this.LJLIL.LJIIJ(C25822ABm.LJLIL);
        boolean z = this.LJLIL.LJFF().LJZI;
        AK4.LIZ().LJIILJJIL(z);
        if (z) {
            this.LJLILLLLZI.Nl();
            C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
            c26045AKb.LJIIIIZZ(R.string.dau);
            c26045AKb.LJIIJ();
        } else {
            this.LJLILLLLZI.Ml();
            C26045AKb c26045AKb2 = new C26045AKb(this.LJLILLLLZI);
            c26045AKb2.LJIIIIZZ(R.string.dat);
            c26045AKb2.LJIIJ();
        }
        if (C53150KtW.LIZ() && !C79004UzY.LJJIJIIJI(this.LJLILLLLZI.getContext())) {
            if (this.LJLJI && !z && !this.LJLJJI && (aweme = this.LJLILLLLZI.xl().LIZ.getAweme()) != null && C86670Xzu.LJIIIZ(aweme) != null && !o.LJ(C86670Xzu.LJIIIZ(aweme), "un")) {
                if (!ORY.LJJIJIIJIL(C86670Xzu.LJIIIZ(aweme), C86670Xzu.LJI()) && !AK4.LIZ().LJJIJIIJI()) {
                    AK4.LIZ().LJIIIZ(true);
                    String LJIIIZ = C86670Xzu.LJIIIZ(this.LJLILLLLZI.xl().LIZ.getAweme());
                    String str = CaptionKevaServiceImpl.LJJJJI().LJJIL().get(LJIIIZ);
                    this.LJLIL.LJIIJ(new AqS58S1100000_4(this.LJLILLLLZI, str, 23));
                    this.LJLIL.LJIIJ(new AqS14S2100000_4(LJIIIZ, str, this.LJLILLLLZI, 1));
                    if (LJIIIZ == null) {
                        return;
                    }
                    this.LJLILLLLZI.getClass();
                    NotTransGuideShowEvent notTransGuideShowEvent = new NotTransGuideShowEvent();
                    notTransGuideShowEvent.LIZLLL("caption_panel", "enter_from");
                    notTransGuideShowEvent.LIZLLL(LJIIIZ, "display_language");
                    notTransGuideShowEvent.LJFF();
                    return;
                }
            }
            if (!this.LJLJJI) {
                this.LJLIL.LJIIJ(C25821ABl.LJLIL);
            }
        }
    }
}
