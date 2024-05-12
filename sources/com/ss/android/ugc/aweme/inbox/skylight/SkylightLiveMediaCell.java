package com.ss.android.ugc.aweme.inbox.skylight;

import X.AbstractC54715Ldf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C48705J9p;
import X.C54713Ldd;
import X.C54737Le1;
import X.C54738Le2;
import X.C54740Le4;
import X.C62562cu;
import X.C62822Ol8;
import X.C71799SFv;
import X.C77357UXp;
import X.C78688UuS;
import X.C78939UyV;
import X.EnumC48702J9m;
import X.EnumC72797Shd;
import X.FMX;
import X.InterfaceC86353Xun;
import X.KL0;
import X.L9N;
import X.ViewOnLongClickListenerC54739Le3;
import X.W5F;
import X.W5U;
import Y.ACListenerS44S0200000_9;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SkylightLiveMediaCell extends SkylightBaseMediaCard<C54713Ldd> {
    public FrameLayout LJLJL;
    public View LJLL;
    public L9N LJLLI;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C54738Le2.LJLIL);
    public long LJLJLLL = System.currentTimeMillis();
    public final InterfaceC86353Xun LJLLILLLL = LiveOuterService.LJJJLL().LJJJJZI(new C54737Le1(this), EnumC72797Shd.SEARCH);

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void U() {
        this.LJLLILLLL.LLZZLLIL();
        P().setVisibility(0);
        c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void T() {
        InboxLiveNotice inboxLiveNotice;
        LiveRoomStruct liveRoomStruct;
        C54713Ldd c54713Ldd = (C54713Ldd) getItem();
        if (c54713Ldd != null && (inboxLiveNotice = c54713Ldd.LJLILLLLZI) != null && (liveRoomStruct = inboxLiveNotice.getLiveRoomStruct()) != null) {
            InterfaceC86353Xun livePlayHelper = this.LJLLILLLL;
            o.LJIIIIZZ(livePlayHelper, "livePlayHelper");
            FrameLayout frameLayout = this.LJLJL;
            if (frameLayout == null) {
                o.LJIJI("playViewWrapper");
                throw null;
            }
            livePlayHelper.i(true, liveRoomStruct, frameLayout, false, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void X() {
        P().setVisibility(0);
        this.LJLLILLLL.LLZZLLIL();
        c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void Y() {
        InboxLiveNotice inboxLiveNotice;
        LiveRoomStruct liveRoomStruct;
        C54713Ldd c54713Ldd = (C54713Ldd) getItem();
        if (c54713Ldd != null && (inboxLiveNotice = c54713Ldd.LJLILLLLZI) != null && (liveRoomStruct = inboxLiveNotice.getLiveRoomStruct()) != null) {
            InterfaceC86353Xun livePlayHelper = this.LJLLILLLL;
            o.LJIIIIZZ(livePlayHelper, "livePlayHelper");
            FrameLayout frameLayout = this.LJLJL;
            if (frameLayout == null) {
                o.LJIJI("playViewWrapper");
                throw null;
            }
            livePlayHelper.i(true, liveRoomStruct, frameLayout, false, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0() {
        User user;
        InboxLiveNotice inboxLiveNotice;
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJLLL;
        this.LJLJLLL = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from_merge", "message");
        c188727au.LJIIIZ("enter_method", "live_cover");
        c188727au.LJIIIZ("action_type", "click");
        C54713Ldd c54713Ldd = (C54713Ldd) getItem();
        if (c54713Ldd != null && (inboxLiveNotice = c54713Ldd.LJLILLLLZI) != null) {
            user = inboxLiveNotice.getUser();
        } else {
            user = null;
        }
        c188727au.LIZLLL(C54740Le4.LIZIZ(user), "follow_status");
        c188727au.LJ(currentTimeMillis, "duration");
        FMX.LJIIL("livesdk_live_window_duration_v2", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.kuk);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.surface_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.LJLJL = frameLayout;
        frameLayout.setKeepScreenOn(true);
        View findViewById2 = this.itemView.findViewById(R.id.cfc);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.double_avatar_circle)");
        this.LJLL = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.chx);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.dual_avatar)");
        this.LJLLI = (L9N) findViewById3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void L(C54713Ldd c54713Ldd) {
        int i;
        UrlModel urlModel;
        InboxLiveNotice inboxLiveNotice;
        User user;
        String str;
        InboxLiveNotice inboxLiveNotice2;
        User user2;
        LiveRoomStruct liveRoomStruct;
        UrlModel urlModel2;
        InboxLiveNotice inboxLiveNotice3;
        User user3;
        SlimRoom roomInfo;
        SlimRoom.LinkMic linkMic;
        List<com.bytedance.android.live.base.model.user.User> list;
        SlimRoom roomInfo2;
        SlimRoom.LinkMic linkMic2;
        List<com.bytedance.android.live.base.model.user.User> list2;
        C54713Ldd t = c54713Ldd;
        o.LJIIIZ(t, "t");
        InboxLiveNotice inboxLiveNotice4 = t.LJLILLLLZI;
        if (inboxLiveNotice4 != null && (roomInfo2 = inboxLiveNotice4.getRoomInfo()) != null && (linkMic2 = roomInfo2.getLinkMic()) != null && (list2 = linkMic2.followedList) != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        UrlModel urlModel3 = null;
        if (i >= 2) {
            M().setVisibility(8);
            View view = this.LJLL;
            if (view != null) {
                view.setVisibility(0);
                N().setVisibility(8);
                L9N l9n = this.LJLLI;
                if (l9n != null) {
                    l9n.setVisibility(0);
                    InboxLiveNotice inboxLiveNotice5 = t.LJLILLLLZI;
                    if (inboxLiveNotice5 != null && (roomInfo = inboxLiveNotice5.getRoomInfo()) != null && (linkMic = roomInfo.getLinkMic()) != null && (list = linkMic.followedList) != null) {
                        com.bytedance.android.live.base.model.user.User user4 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 0);
                        if (user4 != null) {
                            L9N l9n2 = this.LJLLI;
                            if (l9n2 != null) {
                                L9N.LIZ(l9n2, new C62562cu(user4.getAvatarThumb().getUrls()));
                            } else {
                                o.LJIJI("dualAvatar");
                                throw null;
                            }
                        }
                        com.bytedance.android.live.base.model.user.User user5 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 1);
                        if (user5 != null) {
                            L9N l9n3 = this.LJLLI;
                            if (l9n3 != null) {
                                L9N.LIZIZ(l9n3, new C62562cu(user5.getAvatarThumb().getUrls()));
                            } else {
                                o.LJIJI("dualAvatar");
                                throw null;
                            }
                        }
                    }
                    L9N l9n4 = this.LJLLI;
                    if (l9n4 != null) {
                        l9n4.setOnLongClickListener(ViewOnLongClickListenerC54739Le3.LJLIL);
                    } else {
                        o.LJIJI("dualAvatar");
                        throw null;
                    }
                } else {
                    o.LJIJI("dualAvatar");
                    throw null;
                }
            } else {
                o.LJIJI("doubleCircle");
                throw null;
            }
        } else {
            M().setVisibility(0);
            View view2 = this.LJLL;
            if (view2 != null) {
                view2.setVisibility(8);
                N().setVisibility(0);
                L9N l9n5 = this.LJLLI;
                if (l9n5 != null) {
                    l9n5.setVisibility(8);
                    M().LIZ(0);
                    C71799SFv N = N();
                    C54713Ldd c54713Ldd2 = (C54713Ldd) getItem();
                    if (c54713Ldd2 != null && (inboxLiveNotice = c54713Ldd2.LJLILLLLZI) != null && (user = inboxLiveNotice.getUser()) != null) {
                        urlModel = user.getAvatarThumb();
                    } else {
                        urlModel = null;
                    }
                    C71799SFv.LJIIJ(N, C78939UyV.LJ(urlModel), null, false, null, 126);
                } else {
                    o.LJIJI("dualAvatar");
                    throw null;
                }
            } else {
                o.LJIJI("doubleCircle");
                throw null;
            }
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            C54713Ldd c54713Ldd3 = (C54713Ldd) getItem();
            if (c54713Ldd3 != null && (inboxLiveNotice3 = c54713Ldd3.LJLILLLLZI) != null && (user3 = inboxLiveNotice3.getUser()) != null) {
                str = user3.getNickname();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            P().setVisibility(0);
            InboxLiveNotice inboxLiveNotice6 = t.LJLILLLLZI;
            if (inboxLiveNotice6 == null || (liveRoomStruct = inboxLiveNotice6.getLiveRoomStruct()) == null || (urlModel2 = liveRoomStruct.roomCover) == null) {
                C54713Ldd c54713Ldd4 = (C54713Ldd) getItem();
                if (c54713Ldd4 != null && (inboxLiveNotice2 = c54713Ldd4.LJLILLLLZI) != null && (user2 = inboxLiveNotice2.getUser()) != null) {
                    urlModel3 = user2.getAvatarLarger();
                }
            } else {
                urlModel3 = urlModel2;
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel3));
            LJII.LJJI = KL0.HIGH;
            LJII.LIZIZ(toString());
            LJII.LJJIIJ = P();
            C16880lQ.LLJJJ(LJII);
            C16880lQ.LJIIJ(new ACListenerS44S0200000_9(t, this, 22), this.itemView);
            return;
        }
        o.LJIJI("userName");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseMediaCard
    public final void a0(EnumC48702J9m event, Map<String, Object> map) {
        InboxLiveNotice inboxLiveNotice;
        Long l;
        String str;
        User user;
        Integer num;
        String str2;
        User user2;
        String str3;
        String str4;
        InboxLiveNotice inboxLiveNotice2;
        InboxLiveNotice inboxLiveNotice3;
        LiveRoomStruct liveRoomStruct;
        User user3;
        SlimRoom roomInfo;
        User user4;
        User user5;
        User user6;
        String str5;
        InboxLiveNotice inboxLiveNotice4;
        InboxLiveNotice inboxLiveNotice5;
        LiveRoomStruct liveRoomStruct2;
        User user7;
        o.LJIIIZ(event, "event");
        int i = C48705J9p.LIZ[event.ordinal()];
        boolean z = true;
        User user8 = null;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C54713Ldd c54713Ldd = (C54713Ldd) getItem();
            if (c54713Ldd != null && (inboxLiveNotice5 = c54713Ldd.LJLILLLLZI) != null && (liveRoomStruct2 = inboxLiveNotice5.getLiveRoomStruct()) != null && (user7 = liveRoomStruct2.owner) != null) {
                str5 = user7.getUid();
            } else {
                str5 = null;
            }
            C54713Ldd c54713Ldd2 = (C54713Ldd) getItem();
            if (c54713Ldd2 != null && (inboxLiveNotice4 = c54713Ldd2.LJLILLLLZI) != null) {
                user8 = inboxLiveNotice4.getUser();
            }
            C77357UXp.LJJIJIIJI(this, "live", str5, Integer.valueOf(C54740Le4.LIZIZ(user8)), null, map, 50);
            return;
        }
        C54713Ldd c54713Ldd3 = (C54713Ldd) getItem();
        if (c54713Ldd3 != null) {
            inboxLiveNotice = c54713Ldd3.LJLILLLLZI;
        } else {
            inboxLiveNotice = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("enter_from_merge", "message");
        c188727au.LJIIIZ("enter_method", "live_cover");
        if (inboxLiveNotice != null && (user6 = inboxLiveNotice.getUser()) != null) {
            l = Long.valueOf(user6.roomId);
        } else {
            l = null;
        }
        c188727au.LJFF(l, "room_id");
        if (inboxLiveNotice != null && (user5 = inboxLiveNotice.getUser()) != null) {
            str = user5.getUid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("anchor_id", str);
        if (inboxLiveNotice != null) {
            user = inboxLiveNotice.getUser();
        } else {
            user = null;
        }
        c188727au.LIZLLL(C54740Le4.LIZIZ(user), "follow_status");
        AbstractC54715Ldf abstractC54715Ldf = (AbstractC54715Ldf) getItem();
        if (abstractC54715Ldf != null) {
            num = Integer.valueOf(abstractC54715Ldf.LJLIL);
        } else {
            num = null;
        }
        c188727au.LJFF(num, "room_position");
        if (inboxLiveNotice == null || (user4 = inboxLiveNotice.getUser()) == null || (str2 = user4.getRequestId()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("request_id", str2);
        if (inboxLiveNotice != null) {
            user2 = inboxLiveNotice.getUser();
        } else {
            user2 = null;
        }
        c188727au.LIZLLL(C54740Le4.LIZIZ(user2), "initial_follow_status");
        if (inboxLiveNotice == null || !inboxLiveNotice.isFresh()) {
            z = false;
        }
        String str6 = "1";
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_fresh", str3);
        if (inboxLiveNotice != null && (roomInfo = inboxLiveNotice.getRoomInfo()) != null) {
            if (!roomInfo.hasCommerceGoods) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_ecom", str6);
            SlimRoom.RoomAuthStatus roomAuthStatus = roomInfo.roomAuthStatus;
            if (roomAuthStatus != null) {
                c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
            }
        }
        C78688UuS.LJJJJZ(c188727au.LIZ);
        C54713Ldd c54713Ldd4 = (C54713Ldd) getItem();
        if (c54713Ldd4 != null && (inboxLiveNotice3 = c54713Ldd4.LJLILLLLZI) != null && (liveRoomStruct = inboxLiveNotice3.getLiveRoomStruct()) != null && (user3 = liveRoomStruct.owner) != null) {
            str4 = user3.getUid();
        } else {
            str4 = null;
        }
        C54713Ldd c54713Ldd5 = (C54713Ldd) getItem();
        if (c54713Ldd5 != null && (inboxLiveNotice2 = c54713Ldd5.LJLILLLLZI) != null) {
            user8 = inboxLiveNotice2.getUser();
        }
        C77357UXp.LJJIJIIJIL(this, "live", str4, C54740Le4.LIZIZ(user8), null, map, 50);
    }
}
