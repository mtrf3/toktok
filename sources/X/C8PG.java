package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.addiction.AntiAddictionToastAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.8PG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PG extends AbstractC65781Prl implements InterfaceC88471Ynr<AntiAddictionToastAssem, C43I<? extends C8PF>, C76800UCe> {
    public static final C8PG LJLIL = new C8PG();

    public C8PG() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AntiAddictionToastAssem antiAddictionToastAssem, C43I<? extends C8PF> c43i) {
        C8PF c8pf;
        TextView textView;
        AntiAddictionToastAssem selectSubscribe = antiAddictionToastAssem;
        C43I<? extends C8PF> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c8pf = (C8PF) c43i2.LIZ) != null) {
            ViewGroup viewGroup = selectSubscribe.LLIFFJFJJ;
            if (viewGroup != null) {
                textView = (TextView) viewGroup.findViewById(R.id.lz4);
            } else {
                textView = null;
            }
            if (c8pf.LJLIL && c8pf.LJLILLLLZI) {
                ViewGroup viewGroup2 = selectSubscribe.LLIFFJFJJ;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = selectSubscribe.LLIFFJFJJ;
                if (viewGroup3 != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = (int) KL2.LIZJ(selectSubscribe.getContext(), 48.0f);
                    marginLayoutParams.bottomMargin = (int) KL2.LIZJ(selectSubscribe.getContext(), -48.0f);
                    ViewGroup viewGroup4 = selectSubscribe.LLIFFJFJJ;
                    if (viewGroup4 != null) {
                        viewGroup4.setLayoutParams(marginLayoutParams);
                    }
                    if (textView != null) {
                        textView.setText(a.LIZLLL().LJ());
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                ViewGroup viewGroup5 = selectSubscribe.LLIFFJFJJ;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(8);
                }
                if (textView != null) {
                    textView.setText("");
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
