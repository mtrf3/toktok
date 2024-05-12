package com.ss.android.ugc.aweme.mix.mixdetail.viewholder;

import X.C04330Ez;
import X.C116714i3;
import X.C116724i4;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C228058xF;
import X.C228078xH;
import X.C228098xJ;
import X.C228108xK;
import X.C228128xM;
import X.C228138xN;
import X.C228148xO;
import X.C228158xP;
import X.C228168xQ;
import X.C228178xR;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C62846OlW;
import X.C63144OqK;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77339UWx;
import X.C78765Uvh;
import X.C86V;
import X.C88913eJ;
import X.C8SG;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC207258Bl;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC228398xn;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC93923mO;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import X.X1D;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class MixFeedManageCell extends PowerCell<C228108xK> implements KPL, InterfaceC228398xn {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public InterfaceC207258Bl LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;

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
        this.LJLJI = C8SG.LIZIZ.LJI((ViewGroup) this.itemView.findViewById(R.id.bxm));
        C8YN.LJIIJ(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.8xT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228228xW) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.8xS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228228xW) obj).LJLJJLL;
            }
        }, null, new IDqS428S0100000_3(this, 8), 12);
    }

    @Override // X.InterfaceC228398xn
    public final void LJIIJJI() {
        View view = this.itemView;
        view.setBackgroundColor(view.getResources().getColor(R.color.aq));
    }

    @Override // X.InterfaceC228398xn
    public final void LJIJI() {
        this.itemView.setBackgroundColor(0);
    }

    public MixFeedManageCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosManageViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 517);
        C228158xP c228158xP = C228158xP.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C228138xN.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 518), new AqS153S0100000_3((InterfaceC93923mO) this, 519), C228178xR.INSTANCE, c228158xP, new AqS153S0100000_3((InterfaceC93923mO) this, 520), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C228148xO.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 521), new AqS153S0100000_3((InterfaceC93923mO) this, 512), C228168xQ.INSTANCE, c228158xP, new AqS153S0100000_3((InterfaceC93923mO) this, 513), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C228128xM.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 514), new AqS153S0100000_3((InterfaceC93923mO) this, 515), new AqS153S0100000_3((InterfaceC93923mO) this, 516), c228158xP, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 511));
        this.LJLJJI = C221108m2.LIZIZ(C228078xH.LJLIL);
    }

    public final String L(int i) {
        String LIZ = C88913eJ.LIZ(this.itemView, R.string.rhe, "itemView.context.getString(R.string.space_str)");
        if (C228058xF.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C86V.LJ().getString(R.string.jtw));
            LIZ2.append(LIZ);
            LIZ2.append(i);
            return X1D.LIZIZ(LIZ2);
        }
        String string = C86V.LJ().getString(R.string.jt9, Integer.valueOf(i));
        o.LJIIIIZZ(string, "{\n            getResourc…ber, sequence )\n        }");
        return string;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C228108xK t) {
        boolean z;
        int LJJLIIIJL;
        o.LJIIIZ(t, "t");
        InterfaceC207258Bl interfaceC207258Bl = this.LJLJI;
        if (interfaceC207258Bl != null) {
            interfaceC207258Bl.LIZIZ(t.LJLIL);
            C78765Uvh.LJFF((C62846OlW) this.itemView.findViewById(R.id.bxv), t.LJLJJI);
            Integer num = t.LJLJL;
            String str = t.LJLJJL;
            if (str != null && str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "";
            if (z) {
                this.itemView.findViewById(R.id.gkg).setVisibility(0);
                if (C228098xJ.LIZJ() && num != null) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C04330Ez.LIZIZ(this.itemView.getContext(), R.color.cn));
                    String L = L(num.intValue());
                    String LIZ = C88913eJ.LIZ(this.itemView, R.string.rhe, "itemView.context.getString(R.string.space_str)");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(L);
                    LIZ2.append(LIZ);
                    LIZ2.append('|');
                    LIZ2.append(LIZ);
                    LIZ2.append(t.LJLJJL);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    C116724i4 c116724i4 = new C116724i4();
                    c116724i4.LIZIZ(LIZIZ);
                    C116714i3 c116714i3 = c116724i4.LIZ;
                    if (s.LJJLIIIJL(LIZIZ, "|", 0, false, 6) < 0) {
                        LJJLIIIJL = 0;
                    } else {
                        LJJLIIIJL = s.LJJLIIIJL(LIZIZ, "|", 0, false, 6);
                    }
                    c116714i3.setSpan(new StyleSpan(1), 0, L.length() + 1, 33);
                    c116714i3.setSpan(foregroundColorSpan, LJJLIIIJL + 1, LJJLIIIJL + 2, 33);
                    ((TextView) this.itemView.findViewById(R.id.gkg)).setText(c116714i3);
                } else {
                    TextView textView = (TextView) this.itemView.findViewById(R.id.gkg);
                    C116724i4 c116724i42 = new C116724i4();
                    String str3 = t.LJLJJL;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c116724i42.LIZIZ(str3);
                    textView.setText(c116724i42.LIZ);
                }
            } else if (C228098xJ.LIZJ() && num != null) {
                this.itemView.findViewById(R.id.gkg).setVisibility(0);
                String L2 = L(num.intValue());
                C116724i4 c116724i43 = new C116724i4();
                c116724i43.LIZIZ(L2);
                C116714i3 c116714i32 = c116724i43.LIZ;
                c116714i32.setSpan(new StyleSpan(1), 0, L2.length() + 1, 33);
                C76800UCe.LIZ.getClass();
                ((TextView) this.itemView.findViewById(R.id.gkg)).setText(c116714i32);
            } else {
                this.itemView.findViewById(R.id.gkg).setVisibility(8);
            }
            ((TextView) this.itemView.findViewById(R.id.gkk)).setText(C86V.LJ().getQuantityString(R.plurals.jx, (int) t.LJLIL.getStatistics().getPlayCount(), t.LJLJJLL));
            if (((Boolean) this.LJLJJI.getValue()).booleanValue() && t.LJLIL.getVideo().getDuration() > 0) {
                this.itemView.findViewById(R.id.gkh).setVisibility(0);
                TextView textView2 = (TextView) this.itemView.findViewById(R.id.gkh);
                int duration = t.LJLIL.getVideo().getDuration();
                if (duration > 0) {
                    int i = duration / 1000;
                    int i2 = i % 60;
                    int i3 = i / 60;
                    int i4 = i3 / 60;
                    int i5 = i3 % 60;
                    if (i4 == 0) {
                        str2 = C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2, Locale.getDefault(), "%02d:%02d", "format(locale, format, *args)");
                    } else {
                        str2 = C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3, Locale.getDefault(), "%02d:%02d:%02d", "format(locale, format, *args)");
                    }
                }
                textView2.setText(str2);
            } else {
                this.itemView.findViewById(R.id.gkh).setVisibility(8);
            }
            C212418Vh.LJIIJJI((AssemViewModel) this.LJLIL.getValue(), new AqS169S0100000_3(this, 265));
            return;
        }
        o.LJIJI("iconController");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.btf);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C228108xK c228108xK, List payloads) {
        boolean z;
        int LJJLIIIJL;
        C228108xK t = c228108xK;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        if (payloads.isEmpty() || !(ListProtector.get(payloads, 0) instanceof Integer)) {
            onBindItemView(t);
            return;
        }
        String LIZ = C88913eJ.LIZ(this.itemView, R.string.rhe, "itemView.context.getString(R.string.space_str)");
        Object obj = ListProtector.get(payloads, 0);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        Integer num = (Integer) obj;
        t.LJLJL = num;
        int intValue = num.intValue();
        String str = t.LJLJJL;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.itemView.findViewById(R.id.gkg).setVisibility(0);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C04330Ez.LIZIZ(this.itemView.getContext(), R.color.cn));
            String L = L(intValue);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(L);
            LIZ2.append(LIZ);
            LIZ2.append('|');
            LIZ2.append(LIZ);
            LIZ2.append(t.LJLJJL);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZIZ(LIZIZ);
            C116714i3 c116714i3 = c116724i4.LIZ;
            if (s.LJJLIIIJL(LIZIZ, "|", 0, false, 6) < 0) {
                LJJLIIIJL = 0;
            } else {
                LJJLIIIJL = s.LJJLIIIJL(LIZIZ, "|", 0, false, 6);
            }
            c116714i3.setSpan(new StyleSpan(1), 0, L.length() + 1, 33);
            c116714i3.setSpan(foregroundColorSpan, LJJLIIIJL + 1, LJJLIIIJL + 2, 33);
            ((TextView) this.itemView.findViewById(R.id.gkg)).setText(c116714i3);
            return;
        }
        this.itemView.findViewById(R.id.gkg).setVisibility(0);
        String L2 = L(intValue);
        C116724i4 c116724i42 = new C116724i4();
        c116724i42.LIZIZ(L2);
        C116714i3 c116714i32 = c116724i42.LIZ;
        c116714i32.setSpan(new StyleSpan(1), 0, L2.length() + 1, 33);
        C76800UCe.LIZ.getClass();
        ((TextView) this.itemView.findViewById(R.id.gkg)).setText(c116714i32);
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
