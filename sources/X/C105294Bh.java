package X;

import Y.ACListenerS19S0201000_1;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS464S0100000;
import o3.h0;

/* renamed from: X.4Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105294Bh extends C105364Bo<InterfaceC105334Bl> {
    public TextView LJLIL;
    public final /* synthetic */ C105274Bf LJLILLLLZI;

    @Override // X.C105364Bo
    public final void M() {
        View findViewById = this.itemView.findViewById(R.id.kys);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tab_iv)");
        this.LJLIL = (TextView) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105294Bh(C105274Bf c105274Bf, View view) {
        super(view);
        this.LJLILLLLZI = c105274Bf;
    }

    @Override // X.C105364Bo
    public final void bind(InterfaceC105334Bl interfaceC105334Bl, final int i) {
        final InterfaceC105334Bl tabItem = interfaceC105334Bl;
        o.LJIIIZ(tabItem, "tabItem");
        TextView textView = this.LJLIL;
        if (textView != null) {
            boolean z = false;
            textView.setPadding(0, 0, 0, 0);
            if (tabItem.LJ() == 5) {
                TextView textView2 = this.LJLIL;
                if (textView2 != null) {
                    textView2.setText(tabItem.LJIIIZ());
                } else {
                    o.LJIJI("tabIv");
                    throw null;
                }
            }
            if (!TextUtils.isEmpty(tabItem.getName())) {
                TextView textView3 = this.LJLIL;
                if (textView3 != null) {
                    h0.LJIJI(textView3, new IDaS464S0100000(new InterfaceC025608e() { // from class: X.4DG
                        @Override // X.InterfaceC025608e
                        public final void LIZ(View host, C17760mq info) {
                            o.LJIIIZ(host, "host");
                            o.LJIIIZ(info, "info");
                            if (!TextUtils.isEmpty(InterfaceC105334Bl.this.getName())) {
                                host.setContentDescription(InterfaceC105334Bl.this.getName());
                            }
                            info.LJIILJJIL(TextView.class.getName());
                        }
                    }, 0));
                } else {
                    o.LJIJI("tabIv");
                    throw null;
                }
            }
            int i2 = this.LJLILLLLZI.LJLIL.LJLJJLL.LJII;
            TextView textView4 = this.LJLIL;
            if (textView4 != null) {
                if (i == i2) {
                    z = true;
                }
                textView4.setSelected(z);
                TextView textView5 = this.LJLIL;
                if (textView5 != null) {
                    C16880lQ.LJIJI(textView5, new ACListenerS19S0201000_1(this, this.LJLILLLLZI, i, 4));
                    final InterfaceC88471Ynr<View, Integer, Boolean> interfaceC88471Ynr = this.LJLILLLLZI.LJLILLLLZI;
                    if (interfaceC88471Ynr != null) {
                        TextView textView6 = this.LJLIL;
                        if (textView6 != null) {
                            textView6.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.3TL
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View it) {
                                    InterfaceC88471Ynr<View, Integer, Boolean> interfaceC88471Ynr2 = interfaceC88471Ynr;
                                    o.LJIIIIZZ(it, "it");
                                    return interfaceC88471Ynr2.invoke(it, Integer.valueOf(i)).booleanValue();
                                }
                            });
                            return;
                        } else {
                            o.LJIJI("tabIv");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("tabIv");
                throw null;
            }
            o.LJIJI("tabIv");
            throw null;
        }
        o.LJIJI("tabIv");
        throw null;
    }
}
