package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.aHP, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92851aHP extends AbstractC65781Prl implements InterfaceC88476Ynw<UIAssem, EnumC91974a3G, String, String, String, String, C76800UCe> {
    public final /* synthetic */ C26021AJd LJLIL;
    public final /* synthetic */ C26018AJa LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92851aHP(C26021AJd c26021AJd, C26018AJa c26018AJa) {
        super(6);
        this.LJLIL = c26021AJd;
        this.LJLILLLLZI = c26018AJa;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UIAssem selectSubscribe, EnumC91974a3G status, String minAmount, String amountDue, String totalDue, String currency) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        o.LJIIIZ(minAmount, "minAmount");
        o.LJIIIZ(amountDue, "amountDue");
        o.LJIIIZ(totalDue, "totalDue");
        o.LJIIIZ(currency, "currency");
        View view = null;
        switch (C91947a2p.LIZ[status.ordinal()]) {
            case 1:
                this.LJLIL.LJI(false);
                String string = selectSubscribe.getContainerView().getContext().getString(R.string.joo);
                o.LJIIIIZZ(string, "containerView.context.ge…ment_amount_hint_minimum)");
                C26021AJd c26021AJd = this.LJLIL;
                String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{C91925a2T.LIZ(minAmount, currency)}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                c26021AJd.LJFF(LLLZ);
                this.LJLILLLLZI.setEnabled(true);
                View containerView = selectSubscribe.getContainerView();
                if (containerView != null) {
                    view = containerView.findViewById(R.id.cs);
                }
                ((SY4) view).setEnabled(false);
                return;
            case 2:
                this.LJLIL.LJI(true);
                String string2 = selectSubscribe.getContainerView().getContext().getString(R.string.jnp);
                o.LJIIIIZZ(string2, "containerView.context.ge…ror_exceed_repaid_amount)");
                C26021AJd c26021AJd2 = this.LJLIL;
                String LLLZ2 = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{C91925a2T.LIZ(totalDue, currency)}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                c26021AJd2.LIZLLL(LLLZ2);
                this.LJLIL.LJFF(null);
                View containerView2 = selectSubscribe.getContainerView();
                if (containerView2 != null) {
                    view = containerView2.findViewById(R.id.cs);
                }
                ((SY4) view).setEnabled(false);
                this.LJLILLLLZI.setEnabled(true);
                return;
            case 3:
                this.LJLIL.LJI(false);
                String string3 = selectSubscribe.getContainerView().getContext().getString(R.string.jon);
                o.LJIIIIZZ(string3, "containerView.context.ge…t_hint_exceed_due_amount)");
                C26021AJd c26021AJd3 = this.LJLIL;
                String LLLZ3 = C16880lQ.LLLZ(string3, Arrays.copyOf(new Object[]{C91925a2T.LIZ(amountDue, currency)}, 1));
                o.LJIIIIZZ(LLLZ3, "format(format, *args)");
                c26021AJd3.LJFF(LLLZ3);
                View containerView3 = selectSubscribe.getContainerView();
                if (containerView3 != null) {
                    view = containerView3.findViewById(R.id.cs);
                }
                ((SY4) view).setEnabled(true);
                this.LJLILLLLZI.setEnabled(true);
                return;
            case 4:
                this.LJLIL.LJI(true);
                String string4 = selectSubscribe.getContainerView().getContext().getString(R.string.jnq);
                o.LJIIIIZZ(string4, "containerView.context.ge…_error_less_than_minimum)");
                C26021AJd c26021AJd4 = this.LJLIL;
                String LLLZ4 = C16880lQ.LLLZ(string4, Arrays.copyOf(new Object[]{C91925a2T.LIZ(minAmount, currency)}, 1));
                o.LJIIIIZZ(LLLZ4, "format(format, *args)");
                c26021AJd4.LIZLLL(LLLZ4);
                this.LJLIL.LJFF(null);
                View containerView4 = selectSubscribe.getContainerView();
                if (containerView4 != null) {
                    view = containerView4.findViewById(R.id.cs);
                }
                ((SY4) view).setEnabled(false);
                this.LJLILLLLZI.setEnabled(true);
                return;
            case 5:
                this.LJLIL.LJI(false);
                String string5 = selectSubscribe.getContainerView().getContext().getString(R.string.jnr);
                o.LJIIIIZZ(string5, "containerView.context.ge…less_than_overdue_amount)");
                C26021AJd c26021AJd5 = this.LJLIL;
                String LLLZ5 = C16880lQ.LLLZ(string5, Arrays.copyOf(new Object[]{C91925a2T.LIZ(amountDue, currency)}, 1));
                o.LJIIIIZZ(LLLZ5, "format(format, *args)");
                c26021AJd5.LJFF(LLLZ5);
                this.LJLILLLLZI.setEnabled(true);
                View containerView5 = selectSubscribe.getContainerView();
                if (containerView5 != null) {
                    view = containerView5.findViewById(R.id.cs);
                }
                ((SY4) view).setEnabled(true);
                return;
            case 6:
                this.LJLIL.LJI(false);
                this.LJLIL.LJFF(selectSubscribe.getContainerView().getContext().getString(R.string.jnu));
                this.LJLILLLLZI.setEnabled(false);
                return;
            default:
                this.LJLIL.LJI(false);
                String string6 = selectSubscribe.getContainerView().getContext().getString(R.string.joo);
                o.LJIIIIZZ(string6, "containerView.context.ge…ment_amount_hint_minimum)");
                C26021AJd c26021AJd6 = this.LJLIL;
                String LLLZ6 = C16880lQ.LLLZ(string6, Arrays.copyOf(new Object[]{C91925a2T.LIZ(minAmount, currency)}, 1));
                o.LJIIIIZZ(LLLZ6, "format(format, *args)");
                c26021AJd6.LJFF(LLLZ6);
                View containerView6 = selectSubscribe.getContainerView();
                if (containerView6 != null) {
                    view = containerView6.findViewById(R.id.cs);
                }
                ((SY4) view).setEnabled(true);
                this.LJLILLLLZI.setEnabled(true);
                return;
        }
    }

    @Override // X.InterfaceC88476Ynw
    public /* bridge */ /* synthetic */ C76800UCe invoke(UIAssem uIAssem, EnumC91974a3G enumC91974a3G, String str, String str2, String str3, String str4) {
        invoke2(uIAssem, enumC91974a3G, str, str2, str3, str4);
        return C76800UCe.LIZ;
    }
}
