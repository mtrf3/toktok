package com.bytedance.android.livesdk.usercard.profilev3;

import X.AbstractC29447Bh5;
import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.B5G;
import X.BJM;
import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C28509BGv;
import X.C28787BRn;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29443Bh1;
import X.C29448Bh6;
import X.C29484Bhg;
import X.C29743Blr;
import X.C2A7;
import X.C30929CBx;
import X.C45631qh;
import X.C78609UtB;
import X.CN1;
import X.EnumC29442Bh0;
import X.InterfaceC29444Bh2;
import X.InterfaceC29493Bhp;
import X.JF1;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.SubscribeSuccessEvent;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNickNameFontOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileAtSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes6.dex */
public final class LiveProfileAudienceOperationCell extends AbstractC29447Bh5 implements GenericLifecycleObserver, InterfaceC29493Bhp {
    public C2A7 LJLJJL;
    public C2A7 LJLJJLL;
    public InterfaceC29444Bh2 LJLJL;
    public C2A7 LJLJLJ;
    public C2A7 LJLJLLL;
    public C2A7 LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public View LJLLJ;
    public User LJLLL;
    public Room LJLLLL;
    public EnumC29442Bh0 LJLLLLLL;
    public UserProfileEvent LJLZ;
    public final UserCardPreloadViewModel LJZ;
    public final int LJZI;
    public final int LJZL;
    public final boolean LL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LJIILJJIL() {
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_show");
        Room room = this.LJLLLL;
        if (room != null) {
            LIZ.LJIJJ(Long.valueOf(room.getOwnerUserId()), "anchor_id");
            Room room2 = this.LJLLLL;
            if (room2 != null) {
                LIZ.LJIJJ(Long.valueOf(room2.getId()), "room_id");
                LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
                LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
                LIZ.LIZJ("click");
                LIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
                LIZ.LJIJJ(BJM.LJIJ(), "video_id");
                LIZ.LJIJJ("profile_card", "show_entrance");
                if (this.LJLIL.LIZJ.LIZ()) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                LIZ.LJIJJ(str, "user_type");
                LIZ.LJJIFFI(C29232Bdc.LJIJJ(this.LJLILLLLZI));
                LIZ.LJIILLIIL(this.LJLILLLLZI);
                LIZ.LJJIIJZLJL();
                C30929CBx.LJIILLIIL("profile_card");
                return;
            }
            o.LJIJI("room");
            throw null;
        }
        o.LJIJI("room");
        throw null;
    }

    @Override // X.AbstractC29482Bhe
    public final int LIZJ() {
        return this.LJZL;
    }

    @Override // X.AbstractC29482Bhe
    public final boolean LJFF() {
        return this.LL;
    }

    @Override // X.AbstractC29482Bhe
    public final int LJI() {
        return this.LJZI;
    }

    public LiveProfileAudienceOperationCell(C29484Bhg c29484Bhg) {
        super(c29484Bhg);
        int i;
        int i2;
        int i3;
        int LIZ;
        ActivityC45651qj activityC45651qj;
        LiveNickNameFontOptSetting liveNickNameFontOptSetting = LiveNickNameFontOptSetting.INSTANCE;
        if (liveNickNameFontOptSetting.enableOptRoundCorner()) {
            i = R.style.acm;
        } else {
            i = R.style.a2z;
        }
        this.LJLLI = i;
        if (liveNickNameFontOptSetting.enableOptRoundCorner()) {
            i2 = R.style.aco;
        } else {
            i2 = R.style.a3c;
        }
        this.LJLLILLLL = i2;
        Context context = c29484Bhg.LIZ;
        UserCardPreloadViewModel userCardPreloadViewModel = null;
        if ((context instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) context) != null) {
            userCardPreloadViewModel = (UserCardPreloadViewModel) ViewModelProviders.of(activityC45651qj).get(UserCardPreloadViewModel.class);
        }
        this.LJZ = userCardPreloadViewModel;
        c29484Bhg.LIZIZ.getLifecycle().addObserver(this);
        if (c29484Bhg.LJ) {
            i3 = C15380j0.LIZ(24.0f);
        } else {
            i3 = 0;
        }
        this.LJZI = i3;
        if (c29484Bhg.LJ) {
            LIZ = C15380j0.LIZ(24.0f);
        } else {
            LIZ = C15380j0.LIZ(16.0f);
        }
        this.LJZL = LIZ;
        this.LL = !c29484Bhg.LIZJ.LIZLLL();
    }

    @Override // X.InterfaceC29493Bhp
    public final void LIZIZ(boolean z) {
        if (z) {
            View view = this.LJLLJ;
            if (view != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(C15380j0.LIZIZ(R.color.abc));
                view.setBackground(gradientDrawable);
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        View view2 = this.LJLLJ;
        if (view2 != null) {
            view2.setBackground(null);
        } else {
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // X.AbstractC29482Bhe
    public final View LIZLLL(Context context) {
        View LIZLLL;
        o.LJIIIZ(context, "context");
        if (this.LJLIL.LJ) {
            LIZLLL = AnonymousClass030.LIZLLL(context, R.layout.cyb, null, false, "from(context).inflate(R.…ration_cell, null, false)");
        } else {
            LIZLLL = AnonymousClass030.LIZLLL(context, R.layout.cyc, null, false, "from(context).inflate(R.…l_landscape, null, false)");
        }
        this.LJLLJ = LIZLLL;
        C2A7 c2a7 = (C2A7) LIZLLL.findViewById(R.id.nhb);
        this.LJLJJL = c2a7;
        if (c2a7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C15380j0.LJIILJJIL(R.string.mpg));
            LIZ.append(" LIVE");
            c2a7.setText(X1D.LIZIZ(LIZ));
        }
        C2A7 c2a72 = this.LJLJJL;
        if (c2a72 != null) {
            c2a72.LJJLL(this.LJLLILLLL);
        }
        View view = this.LJLLJ;
        if (view != null) {
            C2A7 c2a73 = (C2A7) view.findViewById(R.id.a9_);
            this.LJLJJLL = c2a73;
            if (c2a73 != null) {
                c2a73.LJJLL(this.LJLLILLLL);
            }
            View view2 = this.LJLLJ;
            if (view2 != null) {
                C2A7 c2a74 = (C2A7) view2.findViewById(R.id.h4c);
                this.LJLJLLL = c2a74;
                if (c2a74 != null) {
                    c2a74.LJJLL(this.LJLLILLLL);
                }
                View view3 = this.LJLLJ;
                if (view3 != null) {
                    this.LJLL = (C2A7) view3.findViewById(R.id.kpq);
                    View view4 = this.LJLLJ;
                    if (view4 != null) {
                        return view4;
                    }
                    o.LJIJI("contentView");
                    throw null;
                }
                o.LJIJI("contentView");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r1 != LJIIJJI(r0)) goto L36;
     */
    @Override // X.AbstractC29482Bhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C29463BhL LJIIIIZZ(com.bytedance.android.live.base.model.user.User r10) {
        /*
            r9 = this;
            X.BhL r4 = new X.BhL
            X.BiB r1 = X.EnumC29515BiB.AUDIENCE_OPERATION
            r0 = 0
            r4.<init>(r0, r1)
            X.Bh0 r0 = r9.LJLLLLLL
            r8 = 0
            if (r0 == 0) goto L93
            int r1 = r0.ordinal()
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 == r3) goto L29
            r0 = 2
            if (r1 == r0) goto L1c
        L19:
            r9.LJLLL = r10
            return r4
        L1c:
            X.Bh2 r0 = r9.LJLJL
            if (r0 == 0) goto L19
            boolean r0 = r0.LIZ(r10)
            if (r0 != r3) goto L19
            r4.LIZ = r3
            goto L19
        L29:
            X.Bh2 r0 = r9.LJLJL
            if (r0 == 0) goto L19
            boolean r0 = r0.LIZ(r10)
            if (r0 != r3) goto L19
            r4.LIZ = r3
            goto L19
        L36:
            X.Bh2 r0 = r9.LJLJL
            if (r0 == 0) goto L3d
            r0.LIZ(r10)
        L3d:
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r10.getFollowInfo()
            long r6 = r0.getFollowStatus()
            com.bytedance.android.live.base.model.user.User r0 = r9.LJLLL
            java.lang.String r5 = "targetUser"
            if (r0 == 0) goto L8f
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            long r1 = r0.getFollowStatus()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L73
            boolean r1 = r9.LJIIL(r10)
            com.bytedance.android.live.base.model.user.User r0 = r9.LJLLL
            if (r0 == 0) goto L8b
            boolean r0 = r9.LJIIL(r0)
            if (r1 != r0) goto L73
            boolean r1 = r9.LJIIJJI(r10)
            com.bytedance.android.live.base.model.user.User r0 = r9.LJLLL
            if (r0 == 0) goto L87
            boolean r0 = r9.LJIIJJI(r0)
            if (r1 == r0) goto L19
        L73:
            r9.LJIILL(r10)
            r9.LJIIZILJ(r10)
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r10.getFollowInfo()
            long r0 = r0.getPushStatus()
            r9.LJIILLIIL(r0)
            r4.LIZ = r3
            goto L19
        L87:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r8
        L8b:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r8
        L8f:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r8
        L93:
            java.lang.String r0 = "target"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.profilev3.LiveProfileAudienceOperationCell.LJIIIIZZ(com.bytedance.android.live.base.model.user.User):X.BhL");
    }

    public final boolean LJIIJJI(User user) {
        SubscribeInfo subscribeInfo;
        if (!LJIIL(user) || (subscribeInfo = user.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            return false;
        }
        return true;
    }

    public final boolean LJIIL(User user) {
        SubscribeInfo subscribeInfo;
        if (user.getSubscribeInfo() == null || !C78609UtB.LJJJZ(this.LJLIL.LIZJ.LIZ()) || (subscribeInfo = user.getSubscribeInfo()) == null) {
            return false;
        }
        return subscribeInfo.isAnchorQualified();
    }

    public final void LJIILIIL(boolean z) {
        C2A7 c2a7;
        if (this.LJLIL.LIZJ.LIZJ()) {
            this.LJLLLLLL = EnumC29442Bh0.ANCHOR;
            C29306Beo.LJI(this.LJLJJL);
            C29306Beo.LJI(this.LJLJJLL);
            User user = this.LJLLL;
            if (user != null) {
                LJIILL(user);
                User user2 = this.LJLLL;
                if (user2 != null) {
                    LJIIZILJ(user2);
                    User user3 = this.LJLLL;
                    if (user3 != null) {
                        LJIILLIIL(user3.getFollowInfo().getPushStatus());
                        if (z) {
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                            LifecycleOwner lifecycleOwner = this.LJLIL.LIZIZ;
                            dataChannelGlobal.nv0(lifecycleOwner, lifecycleOwner, SubscribeSuccessEvent.class, new AqS171S0100000_5(this, 908));
                            if (!this.LJLIL.LIZJ.LIZLLL() && this.LJLIL.LIZJ.LIZJ()) {
                                User user4 = this.LJLLL;
                                if (user4 != null) {
                                    if (user4.isFollowing()) {
                                        LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from_merge", "message", "enter_method", "live_cell");
                                        User user5 = this.LJLLL;
                                        if (user5 != null) {
                                            LIZIZ.put("anchor_id", String.valueOf(user5.getId()));
                                            Room room = this.LJLLLL;
                                            if (room != null) {
                                                LIZIZ.put("room_id", String.valueOf(room.getId()));
                                                LIZIZ.put("is_setting", "1");
                                                BZI LIZ = C28787BRn.LIZ("livesdk_click_user_following_show");
                                                LIZ.LJJIFFI(LIZIZ);
                                                LIZ.LJIILLIIL(this.LJLILLLLZI);
                                                LIZ.LJIIL("click");
                                                LIZ.LJIIIZ("live");
                                                LIZ.LJIJJ("anchor_profile", "event_page");
                                                LIZ.LJJIIJZLJL();
                                                return;
                                            }
                                            o.LJIJI("room");
                                            throw null;
                                        }
                                        o.LJIJI("targetUser");
                                        throw null;
                                    }
                                    return;
                                }
                                o.LJIJI("targetUser");
                                throw null;
                            }
                            return;
                        }
                        return;
                    }
                    o.LJIJI("targetUser");
                    throw null;
                }
                o.LJIJI("targetUser");
                throw null;
            }
            o.LJIJI("targetUser");
            throw null;
        }
        if (this.LJLIL.LIZJ.LJ()) {
            this.LJLLLLLL = EnumC29442Bh0.OTHER_ANCHOR;
            C29306Beo.LJI(this.LJLJJLL);
            C29306Beo.LJI(this.LJLJLLL);
            C29306Beo.LJI(this.LJLL);
            User user6 = this.LJLLL;
            if (user6 != null) {
                LJIILL(user6);
                if (!z) {
                    return;
                }
                LinkedHashMap LIZIZ2 = JF1.LIZIZ("event_belong", "live_view", "event_type", "core");
                LIZIZ2.put("event_page", "live_detail");
                LIZIZ2.put("action_type", "click");
                LIZIZ2.put("event_module", "right_anchor");
                LIZIZ2.put("enter_from_merge", "live_detail");
                LIZIZ2.put("enter_method", "right_anchor");
                User user7 = this.LJLLL;
                if (user7 != null) {
                    LIZIZ2.put("anchor_id", String.valueOf(user7.getId()));
                    User user8 = this.LJLLL;
                    if (user8 != null) {
                        LIZIZ2.put("room_id", String.valueOf(user8.getLiveRoomId()));
                        User user9 = this.LJLLL;
                        if (user9 != null) {
                            LIZIZ2.put("right_user_id", String.valueOf(user9.getId()));
                            Room room2 = this.LJLLLL;
                            if (room2 != null) {
                                LiveMode streamType = room2.getStreamType();
                                o.LJIIIIZZ(streamType, "room.streamType");
                                LIZIZ2.put("live_type", C28509BGv.LIZ(streamType));
                                User user10 = this.LJLLL;
                                if (user10 != null) {
                                    LIZIZ2.put("initial_follow_status", String.valueOf(user10.followStatus));
                                    if (B5G.LIZIZ().LJFF > 0) {
                                        LIZIZ2.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
                                        B5G.LIZIZ();
                                        LIZIZ2.put("connection_type", "anchor");
                                    }
                                    if (o.LJ(BJM.LJIIIZ(), "click_push_live_cd_user")) {
                                        LIZIZ2.put("is_subscribe", "1");
                                    } else {
                                        LIZIZ2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
                                    }
                                    LIZIZ2.put("is_return", CardStruct.IStatusCode.DEFAULT);
                                    ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
                                    if (TextUtils.isEmpty(iLiveHostCrossRoomEventHelper.getFromRequestId()) && TextUtils.isEmpty(iLiveHostCrossRoomEventHelper.getFromRoomId())) {
                                        Room room3 = this.LJLLLL;
                                        if (room3 != null) {
                                            String valueOf = String.valueOf(room3.getId());
                                            String str = "";
                                            if (valueOf == null) {
                                                valueOf = "";
                                            }
                                            LIZIZ2.put("cohost_from_room_id", valueOf);
                                            Room room4 = this.LJLLLL;
                                            if (room4 != null) {
                                                String requestId = room4.getRequestId();
                                                if (requestId != null) {
                                                    str = requestId;
                                                }
                                                LIZIZ2.put("cohost_from_request_id", str);
                                            } else {
                                                o.LJIJI("room");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("room");
                                            throw null;
                                        }
                                    } else {
                                        LIZIZ2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                                        LIZIZ2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                                    }
                                    BZI LIZ2 = C28787BRn.LIZ("live_show");
                                    LIZ2.LJJIFFI(LIZIZ2);
                                    LIZ2.LJIILLIIL(this.LJLILLLLZI);
                                    LIZ2.LJJIIJZLJL();
                                    return;
                                }
                                o.LJIJI("targetUser");
                                throw null;
                            }
                            o.LJIJI("room");
                            throw null;
                        }
                        o.LJIJI("targetUser");
                        throw null;
                    }
                    o.LJIJI("targetUser");
                    throw null;
                }
                o.LJIJI("targetUser");
                throw null;
            }
            o.LJIJI("targetUser");
            throw null;
        }
        this.LJLLLLLL = EnumC29442Bh0.AUDIENCE;
        C29306Beo.LJI(this.LJLJJL);
        LiveProfileAtSetting liveProfileAtSetting = LiveProfileAtSetting.INSTANCE;
        if (!liveProfileAtSetting.isEnable() || C29232Bdc.LJFF(this.LJLILLLLZI)) {
            C29306Beo.LJI(this.LJLJJLL);
        }
        C29306Beo.LJI(this.LJLJLLL);
        C29306Beo.LJI(this.LJLL);
        if (!liveProfileAtSetting.isEnable() || C29232Bdc.LJFF(this.LJLILLLLZI)) {
            return;
        }
        EnumC29442Bh0 enumC29442Bh0 = this.LJLLLLLL;
        if (enumC29442Bh0 != null) {
            if (C29443Bh1.LIZ[enumC29442Bh0.ordinal()] == 3 && (c2a7 = this.LJLJJLL) != null) {
                ViewGroup.LayoutParams layoutParams = c2a7.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
                layoutParams2.setMarginStart(0);
                c2a7.setLayoutParams(layoutParams2);
            }
            User user11 = this.LJLLL;
            if (user11 != null) {
                LJIILL(user11);
                return;
            } else {
                o.LJIJI("targetUser");
                throw null;
            }
        }
        o.LJIJI("target");
        throw null;
    }

    public final void LJIILL(User user) {
        C2A7 c2a7;
        EnumC29442Bh0 enumC29442Bh0 = this.LJLLLLLL;
        if (enumC29442Bh0 != null) {
            int ordinal = enumC29442Bh0.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 || (c2a7 = this.LJLJLJ) == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = c2a7.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = 0;
                    layoutParams2.weight = 5.2f;
                    layoutParams2.setMarginStart(C15380j0.LIZ(8.0f));
                    c2a7.setLayoutParams(layoutParams2);
                    return;
                }
                C2A7 c2a72 = this.LJLJLJ;
                if (c2a72 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams3 = c2a72.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.width = 0;
                layoutParams4.weight = 1.0f;
                layoutParams4.setMarginStart(C15380j0.LIZ(8.0f));
                c2a72.setLayoutParams(layoutParams4);
                return;
            }
            if (user.isFollowing()) {
                C2A7 c2a73 = this.LJLJLJ;
                if (c2a73 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams5 = c2a73.getLayoutParams();
                o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.width = 0;
                layoutParams6.weight = 1.0f;
                c2a73.setLayoutParams(layoutParams6);
                c2a73.setText("");
                return;
            }
            if (!user.isFollowing() && LJIIJJI(user)) {
                C2A7 c2a74 = this.LJLJLJ;
                if (c2a74 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams7 = c2a74.getLayoutParams();
                o.LJII(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                layoutParams8.width = 0;
                layoutParams8.weight = 1.0f;
                c2a74.setLayoutParams(layoutParams8);
                c2a74.LJJLL(this.LJLLILLLL);
                c2a74.setIconAttr(R.attr.auz);
                c2a74.setText("");
                return;
            }
            C2A7 c2a75 = this.LJLJLJ;
            if (c2a75 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams9 = c2a75.getLayoutParams();
            o.LJII(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
            layoutParams10.width = 0;
            layoutParams10.weight = 1.0f;
            c2a75.setLayoutParams(layoutParams10);
            return;
        }
        o.LJIJI("target");
        throw null;
    }

    public final void LJIILLIIL(long j) {
        C2A7 c2a7;
        String LJIILJJIL;
        User user = this.LJLLL;
        ViewGroup.LayoutParams layoutParams = null;
        if (user != null) {
            if (user.isFollowing()) {
                C29306Beo.LJJLJLI(this.LJLJLLL);
            } else {
                C29306Beo.LJI(this.LJLJLLL);
            }
            if (j == 1) {
                C2A7 c2a72 = this.LJLJLLL;
                if (c2a72 != null) {
                    c2a72.setIcon(C259910h.LJ(R.attr.as5, this.LJLIL.LIZ));
                }
            } else if (j == 0 || j == 2) {
                C2A7 c2a73 = this.LJLJLLL;
                if (c2a73 != null) {
                    c2a73.setIcon(C259910h.LJ(R.attr.as4, this.LJLIL.LIZ));
                }
            } else if (j == 3 && (c2a7 = this.LJLJLLL) != null) {
                c2a7.setIcon(C259910h.LJ(R.attr.as6, this.LJLIL.LIZ));
            }
            C2A7 c2a74 = this.LJLJLLL;
            if (c2a74 == null) {
                return;
            }
            User user2 = this.LJLLL;
            if (user2 != null) {
                if (LJIIL(user2)) {
                    C2A7 c2a75 = this.LJLJLLL;
                    if (c2a75 != null) {
                        layoutParams = c2a75.getLayoutParams();
                    }
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.width = 0;
                    layoutParams2.weight = 1.0f;
                    C2A7 c2a76 = this.LJLJLLL;
                    if (c2a76 != null) {
                        c2a76.setLayoutParams(layoutParams2);
                    }
                    LJIILJJIL = "";
                } else {
                    C2A7 c2a77 = this.LJLJLLL;
                    if (c2a77 != null) {
                        layoutParams = c2a77.getLayoutParams();
                    }
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams3.width = 0;
                    layoutParams3.weight = 5.2f;
                    C2A7 c2a78 = this.LJLJLLL;
                    if (c2a78 != null) {
                        c2a78.setLayoutParams(layoutParams3);
                    }
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.ntm);
                }
                c2a74.setText(LJIILJJIL);
                return;
            }
            o.LJIJI("targetUser");
            throw null;
        }
        o.LJIJI("targetUser");
        throw null;
    }

    public final void LJIIZILJ(User user) {
        if (LJIIJJI(user)) {
            C2A7 c2a7 = this.LJLL;
            if (c2a7 != null) {
                ViewGroup.LayoutParams layoutParams = c2a7.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = 0;
                layoutParams2.weight = 5.2f;
                c2a7.setLayoutParams(layoutParams2);
                c2a7.LJJLL(this.LJLLILLLL);
                c2a7.setText(C15380j0.LJIILJJIL(R.string.ohv));
                C29306Beo.LJJLJLI(c2a7);
            }
            LJIILJJIL();
            return;
        }
        if (user.isFollowing() && LJIIL(user)) {
            C2A7 c2a72 = this.LJLL;
            if (c2a72 != null) {
                ViewGroup.LayoutParams layoutParams3 = c2a72.getLayoutParams();
                o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.width = 0;
                layoutParams4.weight = 4.0f;
                c2a72.setLayoutParams(layoutParams4);
                c2a72.LJJLL(this.LJLLI);
                c2a72.setText(C15380j0.LJIILJJIL(R.string.ob6));
                C29306Beo.LJJLJLI(c2a72);
            }
            LJIILJJIL();
            return;
        }
        C29306Beo.LJI(this.LJLL);
    }

    @Override // X.InterfaceC29493Bhp
    public final void LIZ(C45631qh scrollView, int i) {
        o.LJIIIZ(scrollView, "scrollView");
        if (scrollView.canScrollVertically(1)) {
            View view = this.LJLLJ;
            if (view != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(C15380j0.LIZIZ(R.color.abc));
                view.setBackground(gradientDrawable);
                return;
            }
            o.LJIJI("contentView");
            throw null;
        }
        View view2 = this.LJLLJ;
        if (view2 != null) {
            view2.setBackground(null);
        } else {
            o.LJIJI("contentView");
            throw null;
        }
    }

    @Override // X.AbstractC29447Bh5
    public final void LJIIJ(User user, boolean z) {
        C2A7 c2a7;
        MutableLiveData LIZIZ;
        o.LJIIIZ(user, "user");
        this.LJLLL = user;
        C29484Bhg c29484Bhg = this.LJLIL;
        this.LJLLLL = c29484Bhg.LJFF;
        this.LJLZ = c29484Bhg.LIZJ.LIZ;
        IUserCardService iUserCardService = (IUserCardService) CN1.LIZ(IUserCardService.class);
        C29484Bhg c29484Bhg2 = this.LJLIL;
        User user2 = this.LJLLL;
        if (user2 != null) {
            C29448Bh6 Ln0 = iUserCardService.Ln0(c29484Bhg2, user2, this.LJLILLLLZI);
            this.LJLJL = Ln0;
            if (Ln0 != null) {
                c2a7 = Ln0.LJIIIIZZ;
            } else {
                c2a7 = null;
            }
            this.LJLJLJ = c2a7;
            if (Ln0 != null) {
                View view = this.LJLLJ;
                if (view != null) {
                    Ln0.LIZJ(2, new LinearLayout.LayoutParams(0, -2, 1.0f), (ViewGroup) view);
                } else {
                    o.LJIJI("contentView");
                    throw null;
                }
            }
            C2A7 c2a72 = this.LJLJJL;
            if (c2a72 != null) {
                C16880lQ.LJJIII(c2a72, new ACListenerS25S0100000_5(this, 467));
            }
            C2A7 c2a73 = this.LJLJJLL;
            if (c2a73 != null) {
                C16880lQ.LJJIII(c2a73, new ACListenerS25S0100000_5(this, 469));
                h0.LJIJI(c2a73, new C29743Blr(c2a73, this));
            }
            C2A7 c2a74 = this.LJLJLLL;
            if (c2a74 != null) {
                C16880lQ.LJJIII(c2a74, new ACListenerS25S0100000_5(this, 471));
            }
            C2A7 c2a75 = this.LJLL;
            if (c2a75 != null) {
                C16880lQ.LJJIII(c2a75, new ACListenerS25S0100000_5(this, 473));
            }
            LJIILIIL(true);
            InterfaceC29444Bh2 interfaceC29444Bh2 = this.LJLJL;
            if (interfaceC29444Bh2 != null && (LIZIZ = interfaceC29444Bh2.LIZIZ()) != null) {
                LIZIZ.observe(this.LJLIL.LIZIZ, new AObserverS73S0100000_5(this, 68));
                return;
            }
            return;
        }
        o.LJIJI("targetUser");
        throw null;
    }
}
