package X;

import Y.IDDListenerS143S0100000_3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.reviews.assem.PoiReviewNavAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("poi_review_intro_pop")
/* loaded from: classes5.dex */
public final class AQI extends AbstractC56327M8t<DialogFragment> {
    public final InterfaceC56322M8o LJLIL;
    public final FragmentManager LJLILLLLZI;
    public final InterfaceC186767Uq LJLJI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 10;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C26224AQy c26224AQy = new C26224AQy();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_bubble_ellipsis_right;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c26224AQy.LIZIZ = c2068389v;
        c26224AQy.LIZLLL = 3;
        String string = context.LIZ.getString(R.string.p1p);
        o.LJIIIIZZ(string, "context.context.getStrin…w_disclaimer_popup_title)");
        c26224AQy.LJ = string;
        String string2 = context.LIZ.getString(R.string.p1m);
        o.LJIIIIZZ(string2, "context.context.getStrin…r_popup_subheader_rating)");
        String string3 = context.LIZ.getString(R.string.p1l);
        o.LJIIIIZZ(string3, "context.context.getStrin…up_subheader_contributor)");
        String string4 = context.LIZ.getString(R.string.p1n);
        o.LJIIIIZZ(string4, "context.context.getStrin…subheader_removedreviews)");
        String string5 = context.LIZ.getString(R.string.p1o);
        o.LJIIIIZZ(string5, "context.context.getStrin…bheader_reviewevaluation)");
        c26224AQy.LJ(new C26220AQu(string2, true), new C26220AQu(string3, true), new C26220AQu(string4, true), new C26220AQu(string5, true));
        c26224AQy.LJIILIIL = true;
        String string6 = context.LIZ.getString(R.string.sab);
        AQJ aqj = AQJ.LJLIL;
        c26224AQy.LJII = string6;
        c26224AQy.LJIIIZ = aqj;
        TuxSheet tuxSheet = c26224AQy.LIZ().LIZ;
        tuxSheet.LJLJI = false;
        tuxSheet.LLD = false;
        tuxSheet.LL = false;
        tuxSheet.LJLILLLLZI = new IDDListenerS143S0100000_3(this, 7);
        tuxSheet.show(this.LJLILLLLZI, "poi_review_intro");
        return tuxSheet;
    }

    public AQI(PoiReviewNavAssem poiReviewNavAssem, FragmentManager fragmentManager, C186747Uo c186747Uo) {
        super(poiReviewNavAssem);
        this.LJLIL = poiReviewNavAssem;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = c186747Uo;
    }
}
