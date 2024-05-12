package com.ss.android.ugc.aweme.tag;

import X.AJ9;
import X.C16880lQ;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C242479fP;
import X.C246899mX;
import X.C246949mc;
import X.C246959md;
import X.C246969me;
import X.C246979mf;
import X.C246989mg;
import X.C246999mh;
import X.C247029mk;
import X.C27704Au4;
import X.C27705Au5;
import X.C27706Au6;
import X.C27707Au7;
import X.C27708Au8;
import X.C27709Au9;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C76800UCe;
import X.C78765Uvh;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC246869mU;
import X.EnumC246939mb;
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
import X.OQY;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import X.YE1;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.tag.BaseFriendsListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AqS10S1201000_8;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class BaseFriendsListCell<T extends C246899mX> extends PowerCell<T> implements KPL {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public EnumC246939mb LJLJJL;
    public final EnumC246869mU LJLJJLL;

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
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 184), this.itemView);
        C8YN.LJII(this, M(), new TBT() { // from class: X.9fA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4((BaseFriendsListCell) this, 190), 4);
    }

    public final VideoTagFriendsListViewModel M() {
        return (VideoTagFriendsListViewModel) this.LJLIL.getValue();
    }

    public BaseFriendsListCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTagFriendsListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 846);
        C246949mc c246949mc = C246949mc.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27704Au4.INSTANCE, new AqS154S0100000_4(this, 836), new AqS154S0100000_4(this, 838), C246979mf.INSTANCE, c246949mc, new AqS154S0100000_4(this, 840), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27706Au6.INSTANCE, new AqS154S0100000_4(this, 842), new AqS154S0100000_4(this, 837), C246969me.INSTANCE, c246949mc, new AqS154S0100000_4(this, 839), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27705Au5.INSTANCE, new AqS154S0100000_4(this, 841), new AqS154S0100000_4(this, 843), new AqS154S0100000_4(this, 844), c246949mc, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoTagSearchListViewModel.class);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(LIZ2, 845);
        C246959md c246959md = C246959md.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27707Au7.INSTANCE, new AqS154S0100000_4(this, 847), new AqS154S0100000_4(this, 848), C246989mg.INSTANCE, c246959md, new AqS154S0100000_4(this, 849), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27708Au8.INSTANCE, new AqS154S0100000_4(this, 850), new AqS154S0100000_4(this, 851), C246999mh.INSTANCE, c246959md, new AqS154S0100000_4(this, 852), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27709Au9.INSTANCE, new AqS154S0100000_4(this, 833), new AqS154S0100000_4(this, 834), new AqS154S0100000_4(this, 835), c246959md, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b32;
        this.LJLJI = C221108m2.LIZIZ(C247029mk.LJLIL);
        this.LJLJJL = EnumC246939mb.NONE;
        this.LJLJJLL = EnumC246869mU.ANY;
    }

    public EnumC246869mU L() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(final T item) {
        int i;
        o.LJIIIZ(item, "item");
        this.itemView.setAlpha(1.0f);
        View view = this.itemView;
        C78765Uvh.LJFF((C62846OlW) view.findViewById(R.id.acf), item.LJLIL.getDisplayAvatar());
        TextView textView = (TextView) view.findViewById(R.id.gw7);
        String nickName = item.LJLIL.getNickName();
        boolean z = true;
        if (nickName.length() == 0) {
            nickName = item.LJLIL.getUniqueId();
        }
        textView.setText(nickName);
        AJ9.LJ(this.itemView.getContext(), item.LJLIL.getCustomVerify(), item.LJLIL.getEnterpriseVerifyReason(), (TextView) view.findViewById(R.id.gw7));
        ((TextView) view.findViewById(R.id.c9f)).setText(item.LJLIL.getUniqueId());
        if (item instanceof C242479fP) {
            ImageView imageView = (ImageView) view.findViewById(R.id.cxd);
            if (((C242479fP) item).LJLILLLLZI.getSearchIsBusinessAccount()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        if (((ISearchUserService) this.LJLJI.getValue()).LJ() && item.LJLIL.getFollowStatus() == 2) {
            ((ImageView) view.findViewById(R.id.iui)).setVisibility(0);
        } else {
            ((ImageView) view.findViewById(R.id.iui)).setVisibility(8);
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.9mY
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View v) {
                o.LJIIIZ(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View v) {
                o.LJIIIZ(v, "v");
                C246899mX c246899mX = C246899mX.this;
                if (c246899mX instanceof C242479fP) {
                    VideoTagSearchListViewModel videoTagSearchListViewModel = (VideoTagSearchListViewModel) this.LJLILLLLZI.getValue();
                    IMUser user = C246899mX.this.LJLIL;
                    o.LJIIIZ(user, "user");
                    if (!videoTagSearchListViewModel.LJLJLJ.contains(user.getUid())) {
                        java.util.Set<String> set = videoTagSearchListViewModel.LJLJLJ;
                        String uid = user.getUid();
                        o.LJIIIIZZ(uid, "user.uid");
                        set.add(uid);
                        C7DS.LIZIZ("tag_mention_head_show", new AqS135S0200000_4(videoTagSearchListViewModel, user, 176));
                    }
                    C246919mZ c246919mZ = ((C242479fP) C246899mX.this).LJLJJI;
                    if (c246919mZ != null) {
                        BaseFriendsListCell<T> baseFriendsListCell = this;
                        VideoTagSearchListViewModel videoTagSearchListViewModel2 = (VideoTagSearchListViewModel) baseFriendsListCell.LJLILLLLZI.getValue();
                        String str = c246919mZ.LIZ;
                        SearchSugEntity data = c246919mZ.LIZIZ;
                        int absoluteAdapterPosition = baseFriendsListCell.getAbsoluteAdapterPosition();
                        o.LJIIIZ(data, "data");
                        C7DS.LIZIZ("trending_words_show", new AqS10S1201000_8(str, videoTagSearchListViewModel2, data, (absoluteAdapterPosition - videoTagSearchListViewModel2.LJLJJI.size()) - 1, 1));
                        return;
                    }
                    return;
                }
                if (!(c246899mX instanceof C246899mX)) {
                    return;
                }
                VideoTagFriendsListViewModel M = this.M();
                IMUser user2 = C246899mX.this.LJLIL;
                M.getClass();
                o.LJIIIZ(user2, "user");
                if (M.LJLLLLLL.contains(user2.getUid())) {
                    return;
                }
                java.util.Set<String> set2 = M.LJLLLLLL;
                String uid2 = user2.getUid();
                o.LJIIIIZZ(uid2, "user.uid");
                set2.add(uid2);
                C7DS.LIZIZ("tag_mention_head_show", new AqS135S0200000_4(M, user2, 178));
            }
        });
        IMUser user = item.LJLIL;
        o.LJIIIZ(user, "user");
        VideoTagFriendsListViewModel M = M();
        M.getClass();
        if (M.iv0().size() == 0 || !M.iv0().contains(user)) {
            z = false;
        }
        if (this.LJLJJI != z) {
            this.LJLJJI = z;
            ((C71897SJp) this.itemView.findViewById(R.id.do2)).setChecked(z);
        }
        P(item.LJLIL);
    }

    public final void P(IMUser iMUser) {
        if (!this.LJLJJI) {
            if (iMUser.getVideoTagBlockStatus() != 3) {
                if (!((ArrayList) M().LJLLILLLL).contains(iMUser.getUid())) {
                    Set<String> set = M().LJLLJ.get(3);
                    if (set == null) {
                        set = OQY.INSTANCE;
                    }
                    if (!set.contains(iMUser.getUid())) {
                        if (((Number) M().LJLJI.getValue()).intValue() == 1 || ((((Number) M().LJLJI.getValue()).intValue() == 2 && iMUser.getFollowStatus() != 2) || ((Number) M().LJLJI.getValue()).intValue() == 4)) {
                            Q(EnumC246939mb.VISIBILITY);
                            return;
                        }
                        if (iMUser.getVideoTagBlockStatus() != 1 && iMUser.getVideoTagBlockStatus() != 2 && (!((Boolean) M().LJLJJLL.getValue()).booleanValue() || iMUser.getFollowStatus() == 2 || iMUser.getFollowerStatus() == 1)) {
                            Set<String> set2 = M().LJLLJ.get(1);
                            if (set2 == null) {
                                set2 = OQY.INSTANCE;
                            }
                            if (!set2.contains(iMUser.getUid())) {
                                Set<String> set3 = M().LJLLJ.get(2);
                                if (set3 == null) {
                                    set3 = OQY.INSTANCE;
                                }
                                if (!set3.contains(iMUser.getUid())) {
                                    if (M().iv0().size() >= 15) {
                                        Q(EnumC246939mb.EXCEED_SIZE);
                                        return;
                                    } else {
                                        Q(EnumC246939mb.NONE);
                                        return;
                                    }
                                }
                            }
                        }
                        Q(EnumC246939mb.PRIVACY);
                        return;
                    }
                }
            }
            Q(EnumC246939mb.SELF_REMOVE);
        }
    }

    public final void Q(EnumC246939mb type) {
        boolean z;
        float f;
        o.LJIIIZ(type, "type");
        this.LJLJJL = type;
        if (type != EnumC246939mb.NONE) {
            z = true;
        } else {
            z = false;
        }
        View view = this.itemView;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bse, viewGroup, false, "from(parent.context)\n   …ag_friend, parent, false)");
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
