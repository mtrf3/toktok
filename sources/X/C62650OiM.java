package X;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.OiM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62650OiM extends AbstractC62647OiJ {
    @Override // X.AbstractC62647OiJ
    public int getLayoutResId() {
        return R.layout.clz;
    }

    @Override // X.AbstractC62647OiJ
    public final void LJIIJ() {
        TextView textView;
        if (AVExternalServiceImpl.LIZ().publishService().isEnablePutSettingsIntoMoreOption()) {
            TuxIconView tuxIconView = (TuxIconView) getLayoutRoot().findViewById(R.id.jtc);
            if (tuxIconView != null) {
                tuxIconView.setTintColorRes(R.attr.go);
            }
            TuxTextView tuxTextView = (TuxTextView) getLayoutRoot().findViewById(R.id.jv6);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(42);
                tuxTextView.setTextColorRes(R.attr.go);
            }
        }
        if (C53316KwC.LIZ() && (textView = (TextView) getLayoutRoot().findViewById(R.id.jv6)) != null) {
            textView.setMaxLines(1);
        }
        this.LJLLILLLL = 36;
        this.LJLLJ = 22;
        C62629Oi1.LJ = 36;
        C62629Oi1.LJFF = 22;
        LJIIIIZZ();
        setSyncIconSize((int) KL2.LIZJ(getContext(), 36.0f));
    }

    @Override // X.AbstractC62647OiJ
    public final void LJIILIIL() {
        TextView textView;
        String string;
        EnumC62419Oed first;
        if (C53316KwC.LIZ() && (textView = (TextView) getLayoutRoot().findViewById(R.id.jsy)) != null) {
            OSZ<EnumC62419Oed, C63046Ook> currentChannelPair = getCurrentChannelPair();
            if (currentChannelPair == null || (first = currentChannelPair.getFirst()) == null || (string = first.getLabel()) == null) {
                string = textView.getContext().getString(R.string.rdj);
            }
            textView.setText(string);
            textView.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62650OiM(Context context) {
        super(context);
        a1.LJFF(context, "ctx");
    }

    @Override // X.AbstractC62647OiJ
    public final void LJIIL(C63046Ook c63046Ook) {
        C26338AVi.LJI(c63046Ook, AnonymousClass391.LIZJ(12), null, 0, null, false, 26);
    }
}
