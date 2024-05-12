package com.ss.android.ugc.aweme.trending.ui.billboardpage.list;

import X.AbstractC13940gg;
import X.C06490Nh;
import X.C116724i4;
import X.C118084kG;
import X.C13930gf;
import X.C16880lQ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C76800UCe;
import X.C77123UOp;
import X.C78897Uxp;
import X.C8YZ;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.W5F;
import X.W5U;
import Y.ACListenerS36S0200000_1;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.trending.ui.MobAbility;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardModel;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingIndependentCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingIndependentCell extends PowerCell<C118084kG> implements KPL {
    public final String LJLIL = "//trending/detail?enter_method=trending_billboard&video_from=from_trending_inflow";
    public int LJLILLLLZI;

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
    public final void onBindItemView(C118084kG c118084kG) {
        long j;
        int i;
        C118084kG t = c118084kG;
        o.LJIIIZ(t, "t");
        TextView textView = (TextView) this.itemView.findViewById(R.id.lku);
        C116724i4 c116724i4 = new C116724i4();
        String str = t.LJLIL.trendingName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c116724i4.LIZLLL(str);
        textView.setText(c116724i4.LIZ.toString());
        int layoutPosition = getLayoutPosition() + 1;
        ((TextView) this.itemView.findViewById(R.id.im6)).setText(String.valueOf(layoutPosition));
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.llb);
        String str3 = t.LJLIL.heatValue;
        if (str3 != null) {
            j = CastLongProtector.parseLong(str3);
        } else {
            j = 0;
        }
        CharSequence quantityText = textView2.getResources().getQuantityText(R.plurals.tl, (int) j);
        o.LJIIIIZZ(quantityText, "resources.getQuantityTex…ion_number, heat.toInt())");
        C116724i4 c116724i42 = new C116724i4();
        String charSequence = quantityText.toString();
        String LJJIIJ = C77123UOp.LJJIIJ(j);
        o.LJIIIIZZ(LJJIIJ, "getDisplayCount(heat)");
        c116724i42.LIZIZ(ujb.o.LJJJJZ(charSequence, "%d", LJJIIJ, false));
        textView2.setText(c116724i42.LIZ);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.cover);
        String str4 = t.LJLIL.hotLink;
        if (str4 != null) {
            str2 = str4;
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
        LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
        LJIIIIZZ.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        Integer num = t.LJLIL.iconType;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        ((TuxTextView) this.itemView.findViewById(R.id.lku)).setTextColorRes(R.attr.go);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.im6);
        if (layoutPosition > 3) {
            tuxTextView.setTextColorRes(R.attr.gp);
        } else {
            tuxTextView.setTextColorRes(R.attr.eb);
        }
        ((TuxTextView) this.itemView.findViewById(R.id.llb)).setTextColorRes(R.attr.gx);
        int i2 = this.LJLILLLLZI;
        if (i2 != 1) {
            if (i2 != 2) {
                ((ImageView) this.itemView.findViewById(R.id.bvf)).setVisibility(4);
                ((ImageView) this.itemView.findViewById(R.id.bvg)).setVisibility(4);
            } else {
                ((ImageView) this.itemView.findViewById(R.id.bvf)).setVisibility(4);
                ((ImageView) this.itemView.findViewById(R.id.bvg)).setVisibility(0);
            }
        } else {
            ((ImageView) this.itemView.findViewById(R.id.bvf)).setVisibility(0);
            ((ImageView) this.itemView.findViewById(R.id.bvg)).setVisibility(4);
        }
        C16880lQ.LJIIJ(new ACListenerS36S0200000_1(t, this, 13), this.itemView);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78897Uxp.LJJJJJL(itemView, 0.0f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.cu1, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new AbstractC13940gg(this) { // from class: X.4kH
            public InterfaceC65784Pro<String> LJ;
            public final C118104kI LJFF;

            @Override // X.AbstractC13940gg
            public final boolean LJI() {
                return false;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJFF;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.4kI] */
            {
                this.LJ = new AqS151S0100000_1(this, 726);
                this.LJFF = new InterfaceC19530ph() { // from class: X.4kI
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        o.LJIIIZ(itemID, "itemID");
                        LifecycleOwner currentLifecycleOwner = TrendingIndependentCell.this.getCurrentLifecycleOwner();
                        if (currentLifecycleOwner != null) {
                            TrendingIndependentCell trendingIndependentCell = TrendingIndependentCell.this;
                            Fragment LIZLLL = C212428Vi.LIZLLL(currentLifecycleOwner);
                            if (LIZLLL != null) {
                                TrendingBillboardModel trendingBillboardModel = null;
                                MobAbility mobAbility = (MobAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), MobAbility.class, null);
                                if (mobAbility != null) {
                                    C118084kG item = trendingIndependentCell.getItem();
                                    if (item != null) {
                                        trendingBillboardModel = item.LJLIL;
                                    }
                                    mobAbility.HW(trendingBillboardModel);
                                }
                            }
                        }
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }
        });
        return itemView;
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
