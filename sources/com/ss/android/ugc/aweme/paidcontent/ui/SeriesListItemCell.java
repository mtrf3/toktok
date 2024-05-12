package com.ss.android.ugc.aweme.paidcontent.ui;

import X.A0F;
import X.A1P;
import X.A27;
import X.A28;
import X.A29;
import X.A2A;
import X.A2B;
import X.A2C;
import X.C16880lQ;
import X.C188727au;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C238249Wq;
import X.C26227ARb;
import X.C26231ARf;
import X.C27696Atw;
import X.C27697Atx;
import X.C27698Aty;
import X.C27699Atz;
import X.C27700Au0;
import X.C27701Au1;
import X.C32151Nz;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78685UuP;
import X.C78857UxB;
import X.C78928UyK;
import X.C7MY;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.T5T;
import X.TBT;
import X.TBW;
import X.UC0;
import X.ViewOnApplyWindowInsetsListenerC51180K6u;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS39S0200000_4;
import Y.IDCListenerS142S0200000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesItem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesPostViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesListItemCell extends PowerCell<SeriesItem> implements KPL {
    public SmartImageView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public C63044Ooi LJLJJI;
    public View LJLJJL;
    public TuxIconView LJLJJLL;
    public final C214298b3 LJLJL;
    public final C214298b3 LJLJLJ;
    public View LJLJLLL;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C8YN.LJII(this, M(), new TBT() { // from class: X.A25
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A1P) obj).LJLILLLLZI;
            }
        }, null, new AqS186S0100000_4(this, 166), 6);
    }

    public final SeriesListViewModel M() {
        return (SeriesListViewModel) this.LJLJL.getValue();
    }

    public SeriesListItemCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 631);
        A28 a28 = A28.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27696Atw.INSTANCE, new AqS154S0100000_4(this, 621), new AqS154S0100000_4(this, 623), A2A.INSTANCE, a28, new AqS154S0100000_4(this, 625), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27698Aty.INSTANCE, new AqS154S0100000_4(this, 627), new AqS154S0100000_4(this, 622), A29.INSTANCE, a28, new AqS154S0100000_4(this, 624), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27697Atx.INSTANCE, new AqS154S0100000_4(this, 626), new AqS154S0100000_4(this, 628), new AqS154S0100000_4(this, 629), a28, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(SeriesPostViewModel.class);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(LIZ2, 630);
        A27 a27 = A27.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27699Atz.INSTANCE, new AqS154S0100000_4(this, 632), new AqS154S0100000_4(this, 633), A2B.INSTANCE, a27, new AqS154S0100000_4(this, 634), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27700Au0.INSTANCE, new AqS154S0100000_4(this, 635), new AqS154S0100000_4(this, 636), A2C.INSTANCE, a27, new AqS154S0100000_4(this, 637), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27701Au1.INSTANCE, new AqS154S0100000_4(this, 638), new AqS154S0100000_4(this, 639), new AqS154S0100000_4(this, 620), a27, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJLJ = c214298b32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        String str = ((A1P) M().getState()).LJLJJLL;
        int i = ((A1P) M().getState()).LJLJJL;
        String str2 = ((A1P) M().getState()).LJLJL;
        C188727au LIZ = C78928UyK.LIZ(str, "enterFrom", str2, "entryPoint");
        LIZ.LJIIIZ("enter_from", str);
        LIZ.LIZLLL(i, "collection_cnt");
        LIZ.LJIIIZ("entry_point", str2);
        FMX.LJIIL("click_create_new_series", LIZ.LIZ);
        Context context = getContext();
        if (context != null) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(48), C7MY.LIZIZ(64));
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = C7MY.LIZIZ(16);
            tuxIconView.setLayoutParams(layoutParams);
            tuxIconView.setIconRes(R.raw.icon_pen);
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
            T5T t5t = null;
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bza, C16880lQ.LLZIL(context), null);
            this.LJLJLLL = LLLZIIL;
            if (LLLZIIL != null) {
                t5t = (T5T) LLLZIIL.findViewById(R.id.jpo);
            }
            View view = this.LJLJLLL;
            if (view != null) {
                C238249Wq c238249Wq = new C238249Wq(view);
                C26227ARb c26227ARb = new C26227ARb(context);
                C78857UxB.LJJI(c26227ARb, tuxIconView, A0F.LJLIL);
                c26227ARb.LJII = false;
                c26227ARb.LJFF(context.getResources().getString(R.string.qqm));
                c26227ARb.LIZIZ(context.getResources().getString(R.string.qqk));
                c26227ARb.LJIIJJI = c238249Wq;
                UC0.LIZJ(c26227ARb, new AqS108S0300000_4(context, t5t, this, 23));
                C26231ARf LJI = c26227ARb.LJI();
                View LJFF = LJI.LJFF(R.id.nj);
                LJFF.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC51180K6u(context, LJFF));
                LJI.LIZLLL();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(SeriesItem seriesItem) {
        String str;
        String str2;
        String str3;
        SeriesItem item = seriesItem;
        o.LJIIIZ(item, "item");
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            smartImageView.setActualImageResource(0);
            C63044Ooi c63044Ooi = this.LJLJJI;
            if (c63044Ooi != null) {
                c63044Ooi.setChecked(false);
                String str4 = M().gv0().LJLJI;
                if (str4 == null || str4.length() == 0) {
                    C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, item, 43), this.itemView);
                }
                C63044Ooi c63044Ooi2 = this.LJLJJI;
                if (c63044Ooi2 != null) {
                    c63044Ooi2.setOnCheckedChangeListener(new IDCListenerS142S0200000_4(this, item, 3));
                    if (getAbsoluteAdapterPosition() == 0 && ((str = M().gv0().LJLJI) == null || str.length() == 0)) {
                        String str5 = item.collectionName;
                        if (str5 == null || str5.length() == 0) {
                            TuxTextView tuxTextView = this.LJLILLLLZI;
                            if (tuxTextView != null) {
                                Context context = getContext();
                                if (context != null) {
                                    str2 = context.getString(R.string.qqj);
                                } else {
                                    str2 = null;
                                }
                                tuxTextView.setText(str2);
                                TuxTextView tuxTextView2 = this.LJLJI;
                                if (tuxTextView2 != null) {
                                    Context context2 = getContext();
                                    if (context2 != null) {
                                        str3 = context2.getString(R.string.qqi);
                                    } else {
                                        str3 = null;
                                    }
                                    tuxTextView2.setText(str3);
                                    TuxTextView tuxTextView3 = this.LJLJI;
                                    if (tuxTextView3 != null) {
                                        tuxTextView3.setVisibility(0);
                                        View view = this.LJLJJL;
                                        if (view != null) {
                                            view.setVisibility(8);
                                            TuxIconView tuxIconView = this.LJLJJLL;
                                            if (tuxIconView != null) {
                                                tuxIconView.setVisibility(0);
                                            } else {
                                                o.LJIJI("createSeriesIcon");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("seriesLabelContainer");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("seriesDesc");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("seriesDesc");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("seriesTitle");
                                throw null;
                            }
                        } else {
                            TuxTextView tuxTextView4 = this.LJLILLLLZI;
                            if (tuxTextView4 != null) {
                                tuxTextView4.setText(item.collectionName);
                                TuxTextView tuxTextView5 = this.LJLJI;
                                if (tuxTextView5 != null) {
                                    tuxTextView5.setVisibility(8);
                                    View view2 = this.LJLJJL;
                                    if (view2 != null) {
                                        view2.setVisibility(0);
                                        TuxIconView tuxIconView2 = this.LJLJJLL;
                                        if (tuxIconView2 != null) {
                                            tuxIconView2.setIconRes(R.raw.icon_3pt_image);
                                            TuxIconView tuxIconView3 = this.LJLJJLL;
                                            if (tuxIconView3 != null) {
                                                tuxIconView3.setVisibility(0);
                                            } else {
                                                o.LJIJI("createSeriesIcon");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("createSeriesIcon");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("seriesLabelContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("seriesDesc");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("seriesTitle");
                                throw null;
                            }
                        }
                    } else {
                        TuxTextView tuxTextView6 = this.LJLJI;
                        if (tuxTextView6 != null) {
                            tuxTextView6.setVisibility(8);
                            View view3 = this.LJLJJL;
                            if (view3 != null) {
                                view3.setVisibility(0);
                                TuxTextView tuxTextView7 = this.LJLILLLLZI;
                                if (tuxTextView7 != null) {
                                    tuxTextView7.setText(item.collectionName);
                                    String str6 = item.collectionCoverUrl;
                                    if (str6 == null || str6.length() == 0) {
                                        TuxIconView tuxIconView4 = this.LJLJJLL;
                                        if (tuxIconView4 != null) {
                                            tuxIconView4.setIconRes(R.raw.icon_3pt_image);
                                            TuxIconView tuxIconView5 = this.LJLJJLL;
                                            if (tuxIconView5 != null) {
                                                tuxIconView5.setVisibility(0);
                                            } else {
                                                o.LJIJI("createSeriesIcon");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("createSeriesIcon");
                                            throw null;
                                        }
                                    } else {
                                        TuxIconView tuxIconView6 = this.LJLJJLL;
                                        if (tuxIconView6 != null) {
                                            tuxIconView6.setVisibility(8);
                                        } else {
                                            o.LJIJI("createSeriesIcon");
                                            throw null;
                                        }
                                    }
                                    String str7 = item.collectionCoverUrl;
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str7);
                                    SmartImageView smartImageView2 = this.LJLIL;
                                    if (smartImageView2 != null) {
                                        LJIIIIZZ.LJJIIJ = smartImageView2;
                                        C16880lQ.LLJJJ(LJIIIIZZ);
                                    } else {
                                        o.LJIJI("seriesCoverView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("seriesTitle");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("seriesLabelContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("seriesDesc");
                            throw null;
                        }
                    }
                    if (o.LJ(((A1P) M().getState()).LJLILLLLZI.LIZ(), item) || (C78685UuP.LJJJZ(M().gv0().LJLJI) && o.LJ(M().gv0().LJLJI, item.collectionId))) {
                        C63044Ooi c63044Ooi3 = this.LJLJJI;
                        if (c63044Ooi3 != null) {
                            if (!c63044Ooi3.isChecked()) {
                                C63044Ooi c63044Ooi4 = this.LJLJJI;
                                if (c63044Ooi4 != null) {
                                    c63044Ooi4.setChecked(true);
                                    return;
                                } else {
                                    o.LJIJI("seriesSelectionRadio");
                                    throw null;
                                }
                            }
                            return;
                        }
                        o.LJIJI("seriesSelectionRadio");
                        throw null;
                    }
                    C63044Ooi c63044Ooi5 = this.LJLJJI;
                    if (c63044Ooi5 != null) {
                        c63044Ooi5.setChecked(false);
                        return;
                    } else {
                        o.LJIJI("seriesSelectionRadio");
                        throw null;
                    }
                }
                o.LJIJI("seriesSelectionRadio");
                throw null;
            }
            o.LJIJI("seriesSelectionRadio");
            throw null;
        }
        o.LJIJI("seriesCoverView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZ = C1DI.LIZ(viewGroup, "parent", R.layout.bz9, viewGroup, false, "view");
        View findViewById = LIZ.findViewById(R.id.n67);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.video_item_cover)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = LIZ.findViewById(R.id.jpp);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.series_title_tv)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = LIZ.findViewById(R.id.jp2);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.series_desc_tv)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = LIZ.findViewById(R.id.jp_);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.series_label_container)");
        this.LJLJJL = findViewById4;
        Drawable background = findViewById4.getBackground();
        if (background != null) {
            background.setAlpha(18);
        }
        View findViewById5 = LIZ.findViewById(R.id.bz1);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.create_series_icon)");
        this.LJLJJLL = (TuxIconView) findViewById5;
        View findViewById6 = LIZ.findViewById(R.id.jph);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.series_select_radio)");
        this.LJLJJI = (C63044Ooi) findViewById6;
        return LIZ;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
