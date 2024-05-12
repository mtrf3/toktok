package com.ss.android.ugc.aweme.mix.mixdetail.viewholder;

import X.C116714i3;
import X.C116724i4;
import X.C16880lQ;
import X.C188727au;
import X.C1EU;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C227968x6;
import X.C227978x7;
import X.C227988x8;
import X.C227998x9;
import X.C228018xB;
import X.C228028xC;
import X.C228048xE;
import X.C228058xF;
import X.C228098xJ;
import X.C228108xK;
import X.C228118xL;
import X.C33Q;
import X.C3C8;
import X.C55657Lsr;
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
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.FMX;
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
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS4S1100000_3;
import android.content.res.Resources;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class MixFeedCell extends PowerCell<C228108xK> implements KPL, InterfaceC228398xn {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

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
        LJIJI();
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.8xA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M7C) obj).LJLILLLLZI;
            }
        }, null, new AqS185S0100000_3(this, 57), 6);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 93), this.itemView);
    }

    @Override // X.InterfaceC228398xn
    public final void LJIIJJI() {
        this.itemView.setBackgroundColor(((Number) this.LJLILLLLZI.getValue()).intValue());
    }

    @Override // X.InterfaceC228398xn
    public final void LJIJI() {
        this.itemView.setBackgroundColor(0);
    }

    public MixFeedCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 506);
        C227998x9 c227998x9 = C227998x9.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C227978x7.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 507), new AqS153S0100000_3((InterfaceC93923mO) this, 508), C228028xC.INSTANCE, c227998x9, new AqS153S0100000_3((InterfaceC93923mO) this, 509), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C227988x8.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 510), new AqS153S0100000_3((InterfaceC93923mO) this, 501), C228018xB.INSTANCE, c227998x9, new AqS153S0100000_3((InterfaceC93923mO) this, 502), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C227968x6.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 503), new AqS153S0100000_3((InterfaceC93923mO) this, 504), new AqS153S0100000_3((InterfaceC93923mO) this, 505), c227998x9, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 499));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        this.LJLJJI = C221108m2.LIZIZ(C228048xE.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        if (!C228118xL.LIZIZ()) {
            return R.layout.btd;
        }
        return R.layout.btc;
    }

    public final String L(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2, Locale.getDefault(), "%02d:%02d", "format(locale, format, *args)");
        }
        return C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3, Locale.getDefault(), "%02d:%02d:%02d", "format(locale, format, *args)");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C228108xK c228108xK) {
        String str;
        String str2;
        Integer num;
        boolean z;
        String string;
        int i;
        int i2;
        PlayListInfo playListInfo;
        String mixId;
        String LIZ;
        String string2;
        int LJJLIIIJL;
        C228108xK t = c228108xK;
        o.LJIIIZ(t, "t");
        C212418Vh.LJIIJJI((AssemViewModel) this.LJLIL.getValue(), new AqS134S0200000_3(t, this, 287));
        Aweme aweme = t.LJLIL;
        PlayListInfo playListInfo2 = aweme.playlist_info;
        if (playListInfo2 != null) {
            str = playListInfo2.getMixId();
        } else {
            str = null;
        }
        String str3 = ((MixVideosViewModel) this.LJLIL.getValue()).LLFF;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "playlist");
        c188727au.LJIIIZ("playlist_id", str);
        c188727au.LJIIIZ("playlist_previous_page", str3);
        User author = aweme.getAuthor();
        if (author != null) {
            str2 = author.getUid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("group_id", aweme.getGroupId());
        FMX.LJIIL("playlist_item_show", c188727au.LIZ);
        ((InterfaceC207258Bl) this.LJLJI.getValue()).LIZIZ(t.LJLIL);
        C78765Uvh.LJFF((C62846OlW) this.itemView.findViewById(R.id.bxv), t.LJLJJI);
        PlayListInfo playListInfo3 = t.LJLIL.playlist_info;
        if (playListInfo3 != null) {
            num = playListInfo3.getIndex();
        } else {
            num = null;
        }
        String str4 = t.LJLJJL;
        if (str4 != null && str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "";
        if (z) {
            this.itemView.findViewById(R.id.gkg).setVisibility(0);
            if (C228098xJ.LIZJ() && num != null) {
                Integer LIZIZ = C77339UWx.LIZIZ(num, 1);
                String LIZ2 = C88913eJ.LIZ(this.itemView, R.string.rhe, "itemView.context.getString(R.string.space_str)");
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C1EU.LIZ(this.itemView, "itemView.context", R.attr.gp));
                if (C228058xF.LIZ()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(C86V.LJ().getString(R.string.jtw));
                    LIZ3.append(LIZ2);
                    LIZ3.append(LIZIZ);
                    string2 = X1D.LIZIZ(LIZ3);
                } else {
                    string2 = C86V.LJ().getString(R.string.jt9, LIZIZ);
                    o.LJIIIIZZ(string2, "{\n                      …ce)\n                    }");
                }
                String str6 = string2 + LIZ2 + '|' + LIZ2 + t.LJLJJL;
                C116724i4 c116724i4 = new C116724i4();
                c116724i4.LIZIZ(str6);
                C116714i3 c116714i3 = c116724i4.LIZ;
                if (s.LJJLIIIJL(str6, "|", 0, false, 6) < 0) {
                    LJJLIIIJL = 0;
                } else {
                    LJJLIIIJL = s.LJJLIIIJL(str6, "|", 0, false, 6);
                }
                c116714i3.setSpan(new StyleSpan(1), 0, string2.length() + 1, 33);
                c116714i3.setSpan(foregroundColorSpan, LJJLIIIJL + 1, LJJLIIIJL + 2, 33);
                ((TextView) this.itemView.findViewById(R.id.gkg)).setText(c116714i3);
            } else {
                TextView textView = (TextView) this.itemView.findViewById(R.id.gkg);
                C116724i4 c116724i42 = new C116724i4();
                String str7 = t.LJLJJL;
                if (str7 == null) {
                    str7 = "";
                }
                c116724i42.LIZIZ(str7);
                textView.setText(c116724i42.LIZ);
            }
        } else if (C228098xJ.LIZJ() && num != null) {
            Integer LIZIZ2 = C77339UWx.LIZIZ(num, 1);
            String LIZ4 = C88913eJ.LIZ(this.itemView, R.string.rhe, "itemView.context.getString(R.string.space_str)");
            this.itemView.findViewById(R.id.gkg).setVisibility(0);
            if (C228058xF.LIZ()) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(C86V.LJ().getString(R.string.jtw));
                LIZ5.append(LIZ4);
                LIZ5.append(LIZIZ2);
                string = X1D.LIZIZ(LIZ5);
            } else {
                string = C86V.LJ().getString(R.string.jt9, LIZIZ2);
                o.LJIIIIZZ(string, "{\n                    Re…quence)\n                }");
            }
            C116724i4 c116724i43 = new C116724i4();
            c116724i43.LIZIZ(string);
            C116714i3 c116714i32 = c116724i43.LIZ;
            c116714i32.setSpan(new StyleSpan(1), 0, string.length() + 1, 33);
            C76800UCe.LIZ.getClass();
            ((TextView) this.itemView.findViewById(R.id.gkg)).setText(c116714i32);
        } else {
            this.itemView.findViewById(R.id.gkg).setVisibility(8);
        }
        if (((Boolean) this.LJLJJI.getValue()).booleanValue() && t.LJLIL.getVideo().getDuration() > 0) {
            this.itemView.findViewById(R.id.gkh).setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.gkh)).setText(L(t.LJLIL.getVideo().getDuration()));
        } else {
            this.itemView.findViewById(R.id.gkh).setVisibility(8);
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.gkk);
        Resources LJ = C86V.LJ();
        AwemeStatistics statistics = t.LJLIL.getStatistics();
        if (statistics != null) {
            i = (int) statistics.getPlayCount();
        } else {
            i = 0;
        }
        textView2.setText(LJ.getQuantityString(R.plurals.jx, i, t.LJLJJLL));
        if (!C228118xL.LIZIZ()) {
            View findViewById = this.itemView.findViewById(R.id.gkk);
            o.LJIIIIZZ(findViewById, "itemView.mix_item_vv");
            if (findViewById.getVisibility() == 0) {
                View findViewById2 = this.itemView.findViewById(R.id.gkh);
                o.LJIIIIZZ(findViewById2, "itemView.mix_item_duration");
                if (findViewById2.getVisibility() == 0) {
                    this.itemView.findViewById(R.id.gkd).setVisibility(0);
                }
            }
            if (((Boolean) this.LJLJJI.getValue()).booleanValue() && t.LJLIL.getVideo().getDuration() > 0) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("");
                LIZ6.append(L(t.LJLIL.getVideo().getDuration()));
                str5 = X1D.LIZIZ(LIZ6);
            }
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(str5);
            Resources LJ2 = C86V.LJ();
            AwemeStatistics statistics2 = t.LJLIL.getStatistics();
            if (statistics2 != null) {
                i2 = (int) statistics2.getPlayCount();
            } else {
                i2 = 0;
            }
            LIZ7.append(LJ2.getQuantityString(R.plurals.jx, i2, t.LJLJJLL));
            X1D.LIZIZ(LIZ7);
            if ((!C228118xL.LIZJ() && !C228118xL.LIZ()) || (playListInfo = t.LJLIL.playlist_info) == null || (mixId = playListInfo.getMixId()) == null || (LIZ = C55657Lsr.LIZ(mixId)) == null || LIZ.length() == 0 || !o.LJ(LIZ, t.LJLIL.getAid()) || !((MixVideosViewModel) this.LJLIL.getValue()).LJLJLJ) {
                return;
            }
            String string3 = C86V.LJ().getString(R.string.jtd);
            o.LJIIIIZZ(string3, "getResources().getString…_fyp_video_watched_label)");
            ((TextView) this.itemView.findViewById(R.id.gkj)).setText(string3);
            this.itemView.findViewById(R.id.gkj).post(new ARunnableS4S1100000_3(this, string3, 4));
        }
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
