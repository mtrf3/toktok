package com.ss.android.ugc.aweme.inbox.adapter;

import X.AGA;
import X.C15490jB;
import X.C15510jD;
import X.C15620jO;
import X.C221108m2;
import X.C2309494o;
import X.C47061t0;
import X.C53873LCj;
import X.C53882LCs;
import X.C53884LCu;
import X.C53887LCx;
import X.C54710Lda;
import X.C54711Ldb;
import X.C54714Lde;
import X.C56331M8x;
import X.C62822Ol8;
import X.C90193gN;
import X.EnumC53720L6m;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxLiveDoubleRVCell extends InboxLiveBaseCell<C54711Ldb> {
    public C47061t0 LJLILLLLZI;
    public C47061t0 LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public C53873LCj LJLJJLL;
    public C53873LCj LJLJL;
    public C53873LCj LJLJLJ;
    public TextView LJLJLLL;
    public C53873LCj LJLL;
    public C53873LCj LJLLI;
    public C53887LCx LJLLILLLL;
    public C53887LCx LJLLJ;
    public C53884LCu LJLLL;
    public C53884LCu LJLLLL;
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(C2309494o.LJLIL);
    public final boolean LJLZ;
    public final C62822Ol8 LJZ;

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    public final void M() {
        if (this.LJLZ) {
            if (V()) {
                C53884LCu c53884LCu = this.LJLLL;
                if (c53884LCu != null) {
                    c53884LCu.LJII();
                }
                C53884LCu c53884LCu2 = this.LJLLLL;
                if (c53884LCu2 != null) {
                    c53884LCu2.LJII();
                    return;
                }
                return;
            }
            C53887LCx c53887LCx = this.LJLLILLLL;
            if (c53887LCx != null) {
                c53887LCx.LJII();
            }
            C53887LCx c53887LCx2 = this.LJLLJ;
            if (c53887LCx2 == null) {
                return;
            }
            c53887LCx2.LJII();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.adapter.InboxLiveDoubleRVCell.P():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    public final void U() {
        if (this.LJLZ) {
            if (V()) {
                C53884LCu c53884LCu = this.LJLLL;
                if (c53884LCu != null) {
                    c53884LCu.LIZ();
                }
                C53884LCu c53884LCu2 = this.LJLLLL;
                if (c53884LCu2 != null) {
                    c53884LCu2.LIZ();
                    return;
                }
                return;
            }
            C53887LCx c53887LCx = this.LJLLILLLL;
            if (c53887LCx != null) {
                c53887LCx.LIZ();
            }
            C53887LCx c53887LCx2 = this.LJLLJ;
            if (c53887LCx2 == null) {
                return;
            }
            c53887LCx2.LIZ();
        }
    }

    public final boolean V() {
        return ((Boolean) this.LJLLLLLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return ((Number) C54714Lde.LJ.getValue()).intValue();
    }

    public InboxLiveDoubleRVCell() {
        boolean z;
        if (C54714Lde.LIZ() != 2 || !C54714Lde.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLZ = z;
        this.LJZ = C221108m2.LIZIZ(AGA.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell
    public final String N() {
        InboxLiveNotice inboxLiveNotice;
        SlimRoom roomInfo;
        String l;
        C54711Ldb c54711Ldb = (C54711Ldb) getItem();
        if (c54711Ldb == null || (inboxLiveNotice = c54711Ldb.LJLILLLLZI) == null || (roomInfo = inboxLiveNotice.getRoomInfo()) == null || (l = Long.valueOf(roomInfo.getOwnerUserId()).toString()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return l;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.f1_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_cover_top)");
        this.LJLILLLLZI = (C47061t0) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.f17);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover_bottom)");
        this.LJLJI = (C47061t0) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_name)");
        this.LJLJJI = (TextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.me9);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_plus)");
        this.LJLJLLL = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.f6_);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_live_circle_top)");
        this.LJLL = (C53873LCj) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.f69);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_live_circle_bottom)");
        this.LJLLI = (C53873LCj) findViewById6;
        if (this.LJLZ) {
            this.LJLJJL = (TextView) this.itemView.findViewById(R.id.ecq);
            if (V()) {
                C53882LCs syncController = C54710Lda.LIZIZ.getSyncController();
                if (syncController != null) {
                    C47061t0 c47061t0 = this.LJLILLLLZI;
                    if (c47061t0 != null) {
                        C53873LCj c53873LCj = this.LJLL;
                        if (c53873LCj != null) {
                            this.LJLLL = new C53884LCu(syncController, c47061t0, c47061t0, c53873LCj);
                            C47061t0 c47061t02 = this.LJLJI;
                            if (c47061t02 != null) {
                                C53873LCj c53873LCj2 = this.LJLLI;
                                if (c53873LCj2 != null) {
                                    this.LJLLLL = new C53884LCu(syncController, c47061t02, c47061t02, c53873LCj2);
                                    return;
                                } else {
                                    o.LJIJI("mLiveCircleViewBottom");
                                    throw null;
                                }
                            }
                            o.LJIJI("mCoverBottom");
                            throw null;
                        }
                        o.LJIJI("mLiveCircleViewTop");
                        throw null;
                    }
                    o.LJIJI("mCoverTop");
                    throw null;
                }
                return;
            }
            EnumC53720L6m enumC53720L6m = EnumC53720L6m.INBOX;
            C47061t0 c47061t03 = this.LJLILLLLZI;
            if (c47061t03 != null) {
                C53873LCj c53873LCj3 = this.LJLL;
                if (c53873LCj3 != null) {
                    this.LJLLILLLL = new C53887LCx(enumC53720L6m, c47061t03, c47061t03, c53873LCj3);
                    C47061t0 c47061t04 = this.LJLJI;
                    if (c47061t04 != null) {
                        C53873LCj c53873LCj4 = this.LJLLI;
                        if (c53873LCj4 != null) {
                            this.LJLLJ = new C53887LCx(enumC53720L6m, c47061t04, c47061t04, c53873LCj4);
                            return;
                        } else {
                            o.LJIJI("mLiveCircleViewBottom");
                            throw null;
                        }
                    }
                    o.LJIJI("mCoverBottom");
                    throw null;
                }
                o.LJIJI("mLiveCircleViewTop");
                throw null;
            }
            o.LJIJI("mCoverTop");
            throw null;
        }
        this.LJLJJLL = (C53873LCj) this.itemView.findViewById(R.id.fv2);
        this.LJLJL = (C53873LCj) this.itemView.findViewById(R.id.fv4);
        this.LJLJLJ = (C53873LCj) this.itemView.findViewById(R.id.fv3);
        Integer num = (Integer) this.LJZ.getValue();
        if (num == null || num.intValue() != 1) {
            C53873LCj c53873LCj5 = this.LJLJL;
            if (c53873LCj5 != null) {
                c53873LCj5.setVisibility(8);
            }
            C53873LCj c53873LCj6 = this.LJLJJLL;
            if (c53873LCj6 != null) {
                c53873LCj6.setVisibility(8);
            }
            C53873LCj c53873LCj7 = this.LJLJLJ;
            if (c53873LCj7 != null) {
                c53873LCj7.setVisibility(0);
            }
            C53873LCj c53873LCj8 = this.LJLJLJ;
            if (c53873LCj8 != null) {
                c53873LCj8.LIZ(-1, -1);
            }
            C53873LCj c53873LCj9 = this.LJLJLJ;
            if (c53873LCj9 == null) {
                return;
            }
            c53873LCj9.post(new ARunnableS45S0100000_9(this, 58));
            return;
        }
        C53873LCj c53873LCj10 = this.LJLJL;
        if (c53873LCj10 != null) {
            c53873LCj10.setVisibility(0);
        }
        C53873LCj c53873LCj11 = this.LJLJJLL;
        if (c53873LCj11 != null) {
            c53873LCj11.setVisibility(0);
        }
        C53873LCj c53873LCj12 = this.LJLJLJ;
        if (c53873LCj12 != null) {
            c53873LCj12.setVisibility(8);
        }
        C53873LCj c53873LCj13 = this.LJLJL;
        if (c53873LCj13 != null) {
            c53873LCj13.LIZ(-1, -1);
        }
        C53873LCj c53873LCj14 = this.LJLJJLL;
        if (c53873LCj14 == null) {
            return;
        }
        c53873LCj14.post(new ARunnableS45S0100000_9(this, 57));
    }

    @Override // com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: X, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C54711Ldb t) {
        SlimRoom roomInfo;
        List<User> list;
        User user;
        List<User> list2;
        User user2;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        if (this.LJLZ) {
            if (V()) {
                C53884LCu c53884LCu = this.LJLLL;
                if (c53884LCu != null) {
                    c53884LCu.LJFF = !t.LJLJI;
                }
                C53884LCu c53884LCu2 = this.LJLLLL;
                if (c53884LCu2 != null) {
                    c53884LCu2.LJFF = !t.LJLJI;
                }
            } else {
                C53887LCx c53887LCx = this.LJLLILLLL;
                if (c53887LCx != null) {
                    c53887LCx.LJIIJ(!t.LJLJI);
                }
                C53887LCx c53887LCx2 = this.LJLLJ;
                if (c53887LCx2 != null) {
                    c53887LCx2.LJIIJ(!t.LJLJI);
                }
            }
        }
        InboxLiveNotice inboxLiveNotice = t.LJLILLLLZI;
        if (inboxLiveNotice == null || (roomInfo = inboxLiveNotice.getRoomInfo()) == null) {
            return;
        }
        int i = 0;
        if (roomInfo.getLinkMic().followedList.size() >= 2) {
            SlimRoom.LinkMic linkMic = roomInfo.getLinkMic();
            if (linkMic != null && (list2 = linkMic.followedList) != null && (user2 = (User) ListProtector.get(list2, 0)) != null) {
                C47061t0 c47061t0 = this.LJLJI;
                if (c47061t0 != null) {
                    C15620jO.LIZIZ(user2.getAvatarThumb(), c47061t0);
                    TextView textView = this.LJLJJI;
                    if (textView != null) {
                        textView.setText(C56331M8x.LIZJ(user2.getNickName(), user2.getUsername(), false, true));
                    } else {
                        o.LJIJI("mTvName");
                        throw null;
                    }
                } else {
                    o.LJIJI("mCoverBottom");
                    throw null;
                }
            }
            SlimRoom.LinkMic linkMic2 = roomInfo.getLinkMic();
            if (linkMic2 != null && (list = linkMic2.followedList) != null && (user = (User) ListProtector.get(list, 1)) != null) {
                C47061t0 c47061t02 = this.LJLILLLLZI;
                if (c47061t02 != null) {
                    C15620jO.LIZIZ(user.getAvatarThumb(), c47061t02);
                } else {
                    o.LJIJI("mCoverTop");
                    throw null;
                }
            }
        }
        TextView textView2 = this.LJLJLLL;
        if (textView2 != null) {
            if (roomInfo.getLinkMic().followedCount > 1) {
                if (C90193gN.LIZ()) {
                    TextView textView3 = this.LJLJLLL;
                    if (textView3 != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(roomInfo.getLinkMic().followedCount - 1);
                        LIZ.append('+');
                        textView3.setText(X1D.LIZIZ(LIZ));
                    } else {
                        o.LJIJI("mTvPlusNum");
                        throw null;
                    }
                } else {
                    TextView textView4 = this.LJLJLLL;
                    if (textView4 != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append('+');
                        LIZ2.append(roomInfo.getLinkMic().followedCount - 1);
                        textView4.setText(X1D.LIZIZ(LIZ2));
                    } else {
                        o.LJIJI("mTvPlusNum");
                        throw null;
                    }
                }
            } else {
                i = 8;
            }
            textView2.setVisibility(i);
            TextView textView5 = this.LJLJJL;
            if (textView5 != null) {
                T(textView5);
            }
            if (t.LJLJI) {
                if (this.LJLZ) {
                    if (V()) {
                        C53884LCu c53884LCu3 = this.LJLLL;
                        if (c53884LCu3 != null) {
                            c53884LCu3.LIZIZ(null, InboxLiveDoubleRVCell.class, null, null);
                        }
                        C53884LCu c53884LCu4 = this.LJLLLL;
                        if (c53884LCu4 != null) {
                            c53884LCu4.LIZIZ(null, InboxLiveDoubleRVCell.class, null, null);
                            return;
                        }
                        return;
                    }
                    C53887LCx c53887LCx3 = this.LJLLILLLL;
                    if (c53887LCx3 != null) {
                        c53887LCx3.LJIIIIZZ(null, InboxLiveDoubleRVCell.class);
                    }
                    C53887LCx c53887LCx4 = this.LJLLJ;
                    if (c53887LCx4 == null) {
                        return;
                    }
                    c53887LCx4.LJIIIIZZ(null, InboxLiveDoubleRVCell.class);
                    return;
                }
                Integer num = (Integer) this.LJZ.getValue();
                if (num == null || num.intValue() != 1) {
                    C15490jB.LIZJ(this.LJLJLJ, C15510jD.LJIIIZ("tiktok_live_watch_resource_normal_1", "ttlive_item_rank_top_on_going_hd.webp"));
                    return;
                } else {
                    C15490jB.LIZJ(this.LJLJJLL, C15510jD.LJIIIZ("tiktok_live_watch_resource_normal_1", "live_skylight_icon_anim_small_size.webp"));
                    return;
                }
            }
            return;
        }
        o.LJIJI("mTvPlusNum");
        throw null;
    }
}
