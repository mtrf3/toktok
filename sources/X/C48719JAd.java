package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JAd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48719JAd extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Integer>, C76800UCe> {
    public static final C48719JAd INSTANCE = new C48719JAd();

    public C48719JAd() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MidAdCellComponent selectSubscribe, C43I<Integer> it) {
        String str;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it.LIZ.intValue() >= 0) {
            Aweme aweme = selectSubscribe.A4().LJLJLLL;
            AwemeRawAd awemeRawAd = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (JAY.LIZ(str) || !selectSubscribe.LLIIJLIL) {
                return;
            }
            if (!selectSubscribe.LLIILII) {
                selectSubscribe.LLIILII = true;
                selectSubscribe.getContainerView().setVisibility(0);
                Aweme aweme2 = selectSubscribe.A4().LJLL;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                C025908h.LIZLLL("draw_ad", "othershow", awemeRawAd, "count_down", "refer");
            }
            TuxTextView u4 = selectSubscribe.u4();
            String string = selectSubscribe.u4().getContext().getString(R.string.gdl);
            o.LJIIIIZZ(string, "buttonTextView.context.g…d_ads_mid_roll_countdown)");
            C025908h.LJ(new Object[]{String.valueOf(it.LIZ.intValue())}, 1, string, "format(format, *args)", u4);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Integer> c43i) {
        invoke2(midAdCellComponent, (C43I<Integer>) c43i);
        return C76800UCe.LIZ;
    }
}
