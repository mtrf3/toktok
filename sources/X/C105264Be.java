package X;

import Y.ACListenerS19S0201000_1;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS464S0100000;
import o3.h0;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.4Be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105264Be extends C105364Bo<InterfaceC105334Bl> {
    public C62846OlW LJLIL;
    public TuxIconView LJLILLLLZI;
    public AVS LJLJI;
    public InterfaceC105334Bl LJLJJI;
    public final /* synthetic */ C105254Bd LJLJJL;

    @Override // X.C105364Bo
    public final void M() {
        View findViewById = this.itemView.findViewById(R.id.kys);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tab_iv)");
        this.LJLIL = (C62846OlW) findViewById;
        this.LJLILLLLZI = (TuxIconView) this.itemView.findViewById(R.id.kyk);
        this.LJLJI = (AVS) this.itemView.findViewById(R.id.isy);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowRedDot(C72092sH event) {
        o.LJIIIZ(event, "event");
        InterfaceC105334Bl interfaceC105334Bl = this.LJLJJI;
        if (interfaceC105334Bl != null && interfaceC105334Bl.LJ() == 7) {
            if (event.LJLIL && C113634d5.LIZ()) {
                AVS avs = this.LJLJI;
                if (avs == null) {
                    return;
                }
                avs.setVisibility(0);
                return;
            }
            AVS avs2 = this.LJLJI;
            if (avs2 == null) {
                return;
            }
            avs2.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105264Be(C105254Bd c105254Bd, View view) {
        super(view);
        this.LJLJJL = c105254Bd;
    }

    @Override // X.C105364Bo
    public final void bind(InterfaceC105334Bl interfaceC105334Bl, final int i) {
        AVS avs;
        final InterfaceC105334Bl tabItem = interfaceC105334Bl;
        o.LJIIIZ(tabItem, "tabItem");
        this.LJLJJI = tabItem;
        AVS avs2 = this.LJLJI;
        if (avs2 != null) {
            avs2.setVisibility(8);
        }
        C62846OlW c62846OlW = this.LJLIL;
        if (c62846OlW != null) {
            boolean z = false;
            c62846OlW.setPadding(0, 0, 0, 0);
            if (tabItem.LJ() == 2 || tabItem.LJ() == 9) {
                TuxIconView tuxIconView = this.LJLILLLLZI;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(8);
                }
                C62846OlW c62846OlW2 = this.LJLIL;
                if (c62846OlW2 != null) {
                    c62846OlW2.setVisibility(0);
                    int LIZJ = (int) KL2.LIZJ(this.itemView.getContext(), 6.0f);
                    C62846OlW c62846OlW3 = this.LJLIL;
                    if (c62846OlW3 != null) {
                        c62846OlW3.setPadding(LIZJ, LIZJ, LIZJ, LIZJ);
                        C62846OlW c62846OlW4 = this.LJLIL;
                        if (c62846OlW4 != null) {
                            C4AS.LJIIIIZZ(c62846OlW4, C4AS.LJIIJ(tabItem.LJIIIIZZ()), "TabIndicatorAdapterV2", R.drawable.bjo, R.drawable.bjo, null, null, C7MY.LIZIZ(36), C7MY.LIZIZ(36), 608);
                        } else {
                            o.LJIJI("tabIv");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tabIv");
                        throw null;
                    }
                } else {
                    o.LJIJI("tabIv");
                    throw null;
                }
            } else if (tabItem.LJ() == 7 || tabItem.LJ() == 8) {
                TuxIconView tuxIconView2 = this.LJLILLLLZI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(0);
                }
                C62846OlW c62846OlW5 = this.LJLIL;
                if (c62846OlW5 != null) {
                    c62846OlW5.setVisibility(8);
                    if (tabItem.LJ() == 7) {
                        if (C91093hp.LJ() && C113634d5.LIZ() && (avs = this.LJLJI) != null) {
                            avs.setVisibility(0);
                        }
                        if (C88963eO.LJFF()) {
                            TuxIconView tuxIconView3 = this.LJLILLLLZI;
                            if (tuxIconView3 != null) {
                                tuxIconView3.setIconRes(R.raw.icon_star);
                            }
                        } else {
                            TuxIconView tuxIconView4 = this.LJLILLLLZI;
                            if (tuxIconView4 != null) {
                                tuxIconView4.setIconRes(R.raw.icon_star_light);
                            }
                        }
                        TuxIconView tuxIconView5 = this.LJLILLLLZI;
                        if (tuxIconView5 != null) {
                            tuxIconView5.setTintColorRes(R.attr.go);
                        }
                    } else {
                        if (C88963eO.LJFF()) {
                            TuxIconView tuxIconView6 = this.LJLILLLLZI;
                            if (tuxIconView6 != null) {
                                tuxIconView6.setIconRes(R.raw.icon_star);
                            }
                            int LIZIZ = C7MY.LIZIZ(31);
                            TuxIconView tuxIconView7 = this.LJLILLLLZI;
                            if (tuxIconView7 != null) {
                                ViewGroup.LayoutParams layoutParams = tuxIconView7.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = LIZIZ;
                                    layoutParams.width = LIZIZ;
                                    tuxIconView7.setLayoutParams(layoutParams);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                            }
                        }
                        TuxIconView tuxIconView8 = this.LJLILLLLZI;
                        if (tuxIconView8 != null) {
                            tuxIconView8.setImageDrawable(tabItem.LIZ());
                        }
                    }
                } else {
                    o.LJIJI("tabIv");
                    throw null;
                }
            } else if (tabItem.LJ() == 5) {
                TuxIconView tuxIconView9 = this.LJLILLLLZI;
                if (tuxIconView9 != null) {
                    tuxIconView9.setVisibility(0);
                }
                C62846OlW c62846OlW6 = this.LJLIL;
                if (c62846OlW6 != null) {
                    c62846OlW6.setVisibility(8);
                    TuxIconView tuxIconView10 = this.LJLILLLLZI;
                    if (tuxIconView10 != null) {
                        tuxIconView10.setIconRes(R.raw.icon_emoji);
                    }
                } else {
                    o.LJIJI("tabIv");
                    throw null;
                }
            } else {
                TuxIconView tuxIconView11 = this.LJLILLLLZI;
                if (tuxIconView11 != null) {
                    tuxIconView11.setVisibility(8);
                }
                C62846OlW c62846OlW7 = this.LJLIL;
                if (c62846OlW7 != null) {
                    c62846OlW7.setVisibility(0);
                    if (tabItem.LJ() == 6) {
                        int LIZJ2 = (int) KL2.LIZJ(this.itemView.getContext(), 6.0f);
                        C62846OlW c62846OlW8 = this.LJLIL;
                        if (c62846OlW8 != null) {
                            c62846OlW8.setPadding(LIZJ2, LIZJ2, LIZJ2, LIZJ2);
                        } else {
                            o.LJIJI("tabIv");
                            throw null;
                        }
                    }
                    if (tabItem.LJFF() > 0) {
                        C62846OlW c62846OlW9 = this.LJLIL;
                        if (c62846OlW9 != null) {
                            c62846OlW9.setImageResource(tabItem.LJFF());
                        } else {
                            o.LJIJI("tabIv");
                            throw null;
                        }
                    } else {
                        Drawable LIZ = tabItem.LIZ();
                        if (LIZ != null) {
                            C62846OlW c62846OlW10 = this.LJLIL;
                            if (c62846OlW10 != null) {
                                c62846OlW10.setImageDrawable(LIZ);
                            } else {
                                o.LJIJI("tabIv");
                                throw null;
                            }
                        }
                    }
                } else {
                    o.LJIJI("tabIv");
                    throw null;
                }
            }
            if (!TextUtils.isEmpty(tabItem.getName())) {
                C62846OlW c62846OlW11 = this.LJLIL;
                if (c62846OlW11 != null) {
                    h0.LJIJI(c62846OlW11, new IDaS464S0100000(new InterfaceC025608e() { // from class: X.4DI
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
            int i2 = this.LJLJJL.LJLIL.LJLJLJ.LJII;
            View view = this.itemView;
            if (i == i2) {
                z = true;
            }
            view.setSelected(z);
            C16880lQ.LJIIJ(new ACListenerS19S0201000_1(this, this.LJLJJL, i, 5), this.itemView);
            final InterfaceC88471Ynr<View, Integer, Boolean> interfaceC88471Ynr = this.LJLJJL.LJLILLLLZI;
            if (interfaceC88471Ynr != null) {
                this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.3TM
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View it) {
                        InterfaceC88471Ynr<View, Integer, Boolean> interfaceC88471Ynr2 = interfaceC88471Ynr;
                        o.LJIIIIZZ(it, "it");
                        return interfaceC88471Ynr2.invoke(it, Integer.valueOf(i)).booleanValue();
                    }
                });
                return;
            }
            return;
        }
        o.LJIJI("tabIv");
        throw null;
    }
}
