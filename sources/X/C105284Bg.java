package X;

import Y.ACListenerS19S0201000_1;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS464S0100000;
import o3.h0;

/* renamed from: X.4Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105284Bg extends C105364Bo<InterfaceC105334Bl> {
    public C62846OlW LJLIL;
    public final /* synthetic */ C105274Bf LJLILLLLZI;

    @Override // X.C105364Bo
    public final void M() {
        View findViewById = this.itemView.findViewById(R.id.kys);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tab_iv)");
        this.LJLIL = (C62846OlW) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105284Bg(C105274Bf c105274Bf, View view) {
        super(view);
        this.LJLILLLLZI = c105274Bf;
    }

    @Override // X.C105364Bo
    public final void bind(InterfaceC105334Bl interfaceC105334Bl, final int i) {
        final InterfaceC105334Bl tabItem = interfaceC105334Bl;
        o.LJIIIZ(tabItem, "tabItem");
        C62846OlW c62846OlW = this.LJLIL;
        if (c62846OlW != null) {
            boolean z = false;
            c62846OlW.setPadding(0, 0, 0, 0);
            if (tabItem.LJ() == 2) {
                int LIZJ = (int) KL2.LIZJ(this.itemView.getContext(), 6.0f);
                C62846OlW c62846OlW2 = this.LJLIL;
                if (c62846OlW2 != null) {
                    c62846OlW2.setPadding(LIZJ, LIZJ, LIZJ, LIZJ);
                    C62846OlW c62846OlW3 = this.LJLIL;
                    if (c62846OlW3 != null) {
                        C78765Uvh.LJIIIZ(c62846OlW3, tabItem.LJIIIIZZ(), -1, -1);
                    } else {
                        o.LJIJI("tabIv");
                        throw null;
                    }
                } else {
                    o.LJIJI("tabIv");
                    throw null;
                }
            } else {
                if (tabItem.LJ() == 6) {
                    int LIZJ2 = (int) KL2.LIZJ(this.itemView.getContext(), 6.0f);
                    C62846OlW c62846OlW4 = this.LJLIL;
                    if (c62846OlW4 != null) {
                        c62846OlW4.setPadding(LIZJ2, LIZJ2, LIZJ2, LIZJ2);
                    } else {
                        o.LJIJI("tabIv");
                        throw null;
                    }
                }
                if (tabItem.LJFF() > 0) {
                    C62846OlW c62846OlW5 = this.LJLIL;
                    if (c62846OlW5 != null) {
                        c62846OlW5.setImageResource(tabItem.LJFF());
                    } else {
                        o.LJIJI("tabIv");
                        throw null;
                    }
                } else {
                    Drawable LIZ = tabItem.LIZ();
                    if (LIZ != null) {
                        C62846OlW c62846OlW6 = this.LJLIL;
                        if (c62846OlW6 != null) {
                            c62846OlW6.setImageDrawable(LIZ);
                        } else {
                            o.LJIJI("tabIv");
                            throw null;
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(tabItem.getName())) {
                C62846OlW c62846OlW7 = this.LJLIL;
                if (c62846OlW7 != null) {
                    h0.LJIJI(c62846OlW7, new IDaS464S0100000(new InterfaceC025608e() { // from class: X.4DE
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
            C62846OlW c62846OlW8 = this.LJLIL;
            if (c62846OlW8 != null) {
                if (i == i2) {
                    z = true;
                }
                c62846OlW8.setSelected(z);
                C62846OlW c62846OlW9 = this.LJLIL;
                if (c62846OlW9 != null) {
                    C16880lQ.LJJJJJL(c62846OlW9, new ACListenerS19S0201000_1(this, this.LJLILLLLZI, i, 3));
                    final InterfaceC88471Ynr<View, Integer, Boolean> interfaceC88471Ynr = this.LJLILLLLZI.LJLILLLLZI;
                    if (interfaceC88471Ynr != null) {
                        C62846OlW c62846OlW10 = this.LJLIL;
                        if (c62846OlW10 != null) {
                            c62846OlW10.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.3TK
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
