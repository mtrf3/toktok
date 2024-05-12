package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.JAc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48718JAc extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C48718JAc INSTANCE = new C48718JAc();

    public C48718JAc() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MidAdCellComponent selectSubscribe, C43I<C76800UCe> c43i) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i == null) {
            return;
        }
        TuxTextView u4 = selectSubscribe.u4();
        String string = selectSubscribe.u4().getContext().getString(R.string.gdl);
        o.LJIIIIZZ(string, "buttonTextView.context.g…d_ads_mid_roll_countdown)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{"5"}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        u4.setText(LLLZ);
        selectSubscribe.getContainerView().setVisibility(8);
        selectSubscribe.LLIILII = false;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends C76800UCe> c43i) {
        invoke2(midAdCellComponent, (C43I<C76800UCe>) c43i);
        return C76800UCe.LIZ;
    }
}
