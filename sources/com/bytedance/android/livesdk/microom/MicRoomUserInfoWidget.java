package com.bytedance.android.livesdk.microom;

import X.B79;
import X.B7A;
import X.B83;
import X.BJM;
import X.BU8;
import X.BY3;
import X.BZI;
import X.C05170If;
import X.C05590Jv;
import X.C06490Nh;
import X.C15380j0;
import X.C15620jO;
import X.C15640jQ;
import X.C16880lQ;
import X.C199097rd;
import X.C28594BKc;
import X.C28787BRn;
import X.C29306Beo;
import X.C29364Bfk;
import X.C29374Bfu;
import X.C29504Bi0;
import X.C29682Bks;
import X.C29683Bkt;
import X.C29717BlR;
import X.C29727Blb;
import X.C2A4;
import X.C31597Caf;
import X.C31665Cbl;
import X.C32151Nz;
import X.C38354F3m;
import X.C47061t0;
import X.C47121t6;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73603Sud;
import X.C73969T1h;
import X.C78501UrR;
import X.C87095YGd;
import X.CN1;
import X.EnumC29732Blg;
import X.InterfaceC06390Mx;
import X.InterfaceC29405BgP;
import X.InterfaceC29980Bpg;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.O6R;
import X.T16;
import Y.ACListenerS25S0100000_5;
import Y.ALAdapterS4S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS97S0200000_5;
import Y.AfS57S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ShowUserProfileEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.UserBorderUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveStreamerLayoutBGSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconNeedHideTextSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionAudienceEntranceEnhanceSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveMicRoomStrengthenSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.api.RankBorderChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public class MicRoomUserInfoWidget extends RoomRecycleWidget implements InterfaceC72822Si2 {
    public C47061t0 LJLIL;
    public Room LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC29405BgP LJLJJL;
    public View LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public boolean LJLL;
    public View LJLLJ;
    public ViewGroup LJLLL;
    public C47121t6 LJLLLL;
    public LiveIconView LJLLLLLL;
    public View LJLZ;
    public C2A4 LJZ;
    public ImageView LJZI;
    public ImageView LJZL;
    public TextView LL;
    public ViewGroup LLD;
    public C31597Caf LLF;
    public ViewGroup LLFF;
    public C29727Blb LLFFF;
    public final boolean LLFII;
    public boolean LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public final String LLIIII;
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public boolean LJLJJLL = ((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj();
    public String LJLLI = "";
    public String LJLLILLLL = "";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ddo;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZ() {
        ViewGroup viewGroup;
        long j;
        User owner;
        DataChannel dataChannel;
        InterfaceC29980Bpg hq0;
        ImageModel imageModel;
        C47121t6 c47121t6;
        C29727Blb c29727Blb;
        C29727Blb c29727Blb2 = this.LLFFF;
        if (c29727Blb2 != null) {
            c29727Blb2.LIZ(EnumC29732Blg.UNFOLLOW);
        }
        if (LJZI(this.LJLILLLLZI) && (c29727Blb = this.LLFFF) != null) {
            c29727Blb.LIZ(EnumC29732Blg.FOLLOWED);
        }
        C47061t0 c47061t0 = this.LJLIL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(8);
            Room room = this.LJLILLLLZI;
            if (room != null) {
                if (room.getOwner() == null) {
                    return;
                }
                this.LLF = (C31597Caf) findViewById(R.id.a3v);
                if (!this.LJLJI && room.getOwner().getAvatarThumb() != null) {
                    C31665Cbl.LJIIIZ(this.LLF, room.getOwner().getAvatarThumb(), R.drawable.cuk);
                    C15640jQ.LJIIIZ(this.LLF, room.getOwner().getAvatarThumb(), 0, 0, R.drawable.cuk, new B79(this));
                    this.LJLJI = true;
                }
                C47121t6 c47121t62 = (C47121t6) findViewById(R.id.a2v);
                if (this.LJLJJLL) {
                    c47121t62.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(76)));
                } else {
                    c47121t62.setMaxWidth(Integer.MAX_VALUE);
                }
                this.LJLJLJ = c47121t62;
                this.LJLJLLL = (C47121t6) findViewById(R.id.k02);
                String LIZ = C05170If.LIZ(room.getOwner());
                o.LJIIIIZZ(LIZ, "getDisplayName(owner)");
                this.LJLLILLLL = LIZ;
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.m8x);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_lineup_listname)");
                this.LJLLI = LJIILJJIL;
                C47121t6 c47121t63 = this.LJLJLJ;
                if (c47121t63 != null) {
                    c47121t63.setText(this.LJLLILLLL);
                }
                C47121t6 c47121t64 = this.LJLJLLL;
                if (c47121t64 != null) {
                    c47121t64.setText(this.LJLLI);
                }
                if (LiveMicRoomStrengthenSetting.INSTANCE.enable() && !this.LJLJJLL && (c47121t6 = this.LJLJLJ) != null) {
                    c47121t6.post(new ARunnableS41S0100000_5(this, 167));
                }
                C47121t6 c47121t65 = this.LJLJLJ;
                if (c47121t65 != null) {
                    C16880lQ.LJJIIZ(c47121t65, new ACListenerS25S0100000_5(this, 202));
                }
                C31597Caf c31597Caf = this.LLF;
                if (c31597Caf != null) {
                    C16880lQ.LJJIJIIJI(c31597Caf, new ACListenerS25S0100000_5(this, 203));
                }
                BorderInfo LIZ2 = C29504Bi0.LIZ(room.getOwner());
                if (LIZ2 != null && (imageModel = LIZ2.icon) != null) {
                    C47061t0 c47061t02 = this.LJLIL;
                    if (c47061t02 != null) {
                        C15620jO.LIZIZ(imageModel, c47061t02);
                        C47061t0 c47061t03 = this.LJLIL;
                        if (c47061t03 != null) {
                            c47061t03.setVisibility(0);
                            User owner2 = room.getOwner();
                            C29504Bi0.LIZIZ(owner2, "top_left_corner", C29306Beo.LJIIJ(this.dataChannel), C29504Bi0.LIZ(owner2));
                        } else {
                            o.LJIJI("border");
                            throw null;
                        }
                    } else {
                        o.LJIJI("border");
                        throw null;
                    }
                }
                LLFF(C29504Bi0.LIZ(room.getOwner()));
                IBarrageService iBarrageService = (IBarrageService) CN1.LIZ(IBarrageService.class);
                if (iBarrageService != null && (hq0 = iBarrageService.hq0(room.getId())) != null && hq0.isEnabled() && hq0.LIZIZ()) {
                    hq0.LIZ(this.LLF);
                }
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.lv0(this, RankBorderChannel.class, new AqS171S0100000_5(this, 460));
                dataChannel2.lv0(this, MuteMicChannel.class, new AqS171S0100000_5(this, 461));
            }
            if (C29306Beo.LJIIJ(this.dataChannel) && (dataChannel = this.dataChannel) != null) {
                dataChannel.lv0(this, UserBorderUpdateChannel.class, new AqS171S0100000_5(this, 462));
            }
            InterfaceC29405BgP interfaceC29405BgP = this.LJLJJL;
            if (interfaceC29405BgP != null) {
                Room room2 = this.LJLILLLLZI;
                if (room2 != null && (owner = room2.getOwner()) != null) {
                    j = owner.getId();
                } else {
                    j = 0;
                }
                C73603Sud LIZ3 = interfaceC29405BgP.LIZ(j);
                if (LIZ3 != null) {
                    this.LJLJJI.LIZ(LIZ3.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 147), B7A.LJLIL));
                }
            }
            if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).O10(this.LJLILLLLZI) && (viewGroup = this.LLD) != null) {
                viewGroup.setVisibility(8);
            }
            show();
            return;
        }
        o.LJIJI("border");
        throw null;
    }

    public final void LL() {
        Drawable drawable;
        if (LiveStreamerLayoutBGSetting.INSTANCE.getValue()) {
            ViewGroup viewGroup = this.LLD;
            if (viewGroup != null) {
                drawable = viewGroup.getBackground();
            } else {
                drawable = null;
            }
            o.LJII(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(ColorProtector.parseColor("#33000000"));
            gradientDrawable.setStroke(0, ColorProtector.parseColor("#00000000"));
        }
    }

    public final void LLF() {
        C47121t6 c47121t6;
        C47121t6 c47121t62;
        int i;
        if (this.LJLL && (c47121t6 = this.LJLJLJ) != null && (c47121t62 = this.LJLJLLL) != null) {
            ViewGroup viewGroup = this.LJLLL;
            if (viewGroup != null) {
                i = C15380j0.LIZ(4.0f) + viewGroup.getWidth();
            } else {
                i = 0;
            }
            float measureText = c47121t62.getPaint().measureText(this.LJLLI) - c47121t62.getWidth();
            if (measureText > 0.0f) {
                float f = i;
                if (measureText <= f) {
                    c47121t6.setMaxWidth((int) ((f - measureText) + c47121t6.getWidth()));
                    return;
                }
                return;
            }
            c47121t6.setMaxWidth(c47121t6.getWidth() + i);
        }
    }

    public final void LLFFF() {
        long j;
        Room room = this.LJLILLLLZI;
        if (room == null) {
            return;
        }
        User owner = room.getOwner();
        if (owner != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(j);
        userProfileEvent.mSource = "video_head";
        if (!LJZI(this.LJLILLLLZI) && !this.LJLJJLL) {
            Room room2 = this.LJLILLLLZI;
            if (room2 != null) {
                LJLZ(room2, "lineup_topleft");
                return;
            }
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null) {
            return;
        }
        dataChannel.qv0(ShowUserProfileEvent.class, userProfileEvent);
    }

    public MicRoomUserInfoWidget() {
        boolean z;
        if (SubscriptionAudienceEntranceEnhanceSetting.INSTANCE.getValue() && C15380j0.LJIJ(C15380j0.LJIIL()) > SubscriptionIconHideTextMinimumDimensionSetting.INSTANCE.getValue() && !SubscriptionIconNeedHideTextSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LLFII = z;
        this.LLIIII = "userBorderUpdateEvent";
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        this.LJLL = false;
        C29727Blb c29727Blb = this.LLFFF;
        if (c29727Blb != null) {
            c29727Blb.LJIIZILJ(false);
        }
        this.LJLJJI.LIZLLL();
        C72818Shy.LJII(this.LLIIII, this);
        LL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r5 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJZI(com.bytedance.android.livesdkapi.depend.model.live.Room r5) {
        /*
            if (r5 == 0) goto L32
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L1a
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            if (r0 == 0) goto L1a
            long r3 = r0.getFollowStatus()
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
            if (r5 == 0) goto L32
        L1a:
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L32
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            if (r0 == 0) goto L32
            long r3 = r0.getFollowStatus()
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
        L30:
            r0 = 1
        L31:
            return r0
        L32:
            r0 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget.LJZI(com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    public final void LJZL(String str) {
        Context context = this.context;
        if (context != null) {
            C29682Bks LIZ = C29683Bkt.LIZ(str);
            LIZ.LJIJJ("bottom");
            LIZ.LJIILLIIL("end");
            LIZ.LJIIIZ("bottom");
            LIZ.LJIILJJIL("end");
            LIZ.LJIIJ(434, BY3.DP);
            BY3 by3 = BY3.PERCENT;
            LIZ.LJIILL(100, by3);
            LIZ.LJIL(100, by3);
            C29682Bks.LJIIZILJ(LIZ, 375);
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
            String uri = LIZ.LIZ().toString();
            o.LJIIIIZZ(uri, "sparkPopupSchemaBuilder.build().toString()");
            C05590Jv.LJ((IHybridContainerService) LIZ2, context, uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF(com.bytedance.android.livesdk.model.BorderInfo r5) {
        /*
            r4 = this;
            com.bytedance.android.livesdk.livesetting.other.LiveStreamerLayoutBGSetting r0 = com.bytedance.android.livesdk.livesetting.other.LiveStreamerLayoutBGSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L5b
            r3 = 0
            if (r5 == 0) goto Lf
            com.bytedance.android.live.base.model.ImageModel r0 = r5.icon
            if (r0 != 0) goto L13
        Lf:
            r4.LL()
            return
        L13:
            android.view.ViewGroup r0 = r4.LLD
            if (r0 == 0) goto L86
            android.graphics.drawable.Drawable r2 = r0.getBackground()
        L1b:
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"
            kotlin.jvm.internal.o.LJII(r2, r0)
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            if (r5 == 0) goto L84
            java.lang.String r0 = r5.avatarBackgroundColor
        L26:
            java.lang.String r1 = ""
            if (r0 == 0) goto L34
            if (r5 == 0) goto L82
            java.lang.String r0 = r5.avatarBackgroundColor
        L2e:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L74
        L34:
            java.lang.String r0 = "#33000000"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.setColor(r0)
        L3d:
            if (r5 == 0) goto L4d
            java.lang.String r0 = r5.avatarBackgroundBorderColor
            if (r0 == 0) goto L4d
            if (r5 == 0) goto L72
            java.lang.String r0 = r5.avatarBackgroundBorderColor
        L47:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L60
        L4d:
            java.lang.String r0 = "#00000000"
            int r1 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r0 = 0
            r2.setStroke(r0, r1)
        L57:
            android.view.ViewGroup r0 = r4.LLD
            if (r0 != 0) goto L5c
        L5b:
            return
        L5c:
            r0.setBackground(r2)
            goto L5b
        L60:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = X.C15380j0.LIZ(r0)
            if (r5 == 0) goto L6a
            java.lang.String r3 = r5.avatarBackgroundBorderColor
        L6a:
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r3)
            r2.setStroke(r1, r0)
            goto L57
        L72:
            r0 = r3
            goto L47
        L74:
            if (r5 == 0) goto L80
            java.lang.String r0 = r5.avatarBackgroundColor
        L78:
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.setColor(r0)
            goto L3d
        L80:
            r0 = r3
            goto L78
        L82:
            r0 = r3
            goto L2e
        L84:
            r0 = r3
            goto L26
        L86:
            r2 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget.LLFF(com.bytedance.android.livesdk.model.BorderInfo):void");
    }

    public final void LLFII(boolean z) {
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 != null) {
            c47121t6.setClickable(z);
        }
        C31597Caf c31597Caf = this.LLF;
        if (c31597Caf != null) {
            c31597Caf.setClickable(z);
        }
        C47121t6 c47121t62 = this.LJLLLL;
        if (c47121t62 != null) {
            c47121t62.setClickable(z);
        }
        LiveIconView liveIconView = this.LJLLLLLL;
        if (liveIconView != null) {
            liveIconView.setClickable(z);
        }
        View view = this.LJLZ;
        if (view != null) {
            view.setClickable(z);
        }
        ImageView imageView = this.LJZI;
        if (imageView != null) {
            imageView.setClickable(z);
        }
        TextView textView = this.LL;
        if (textView != null) {
            textView.setClickable(z);
        }
        ImageView imageView2 = this.LJZL;
        if (imageView2 != null) {
            imageView2.setClickable(z);
        }
        ViewGroup viewGroup = this.LLFF;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setClickable(z);
    }

    public final void onEvent(C29717BlR c29717BlR) {
        boolean z = c29717BlR.LIZ;
        if (z != this.LLFZ) {
            this.LLFZ = z;
            C29727Blb c29727Blb = this.LLFFF;
            if (c29727Blb != null) {
                c29727Blb.LJFF();
            }
            if (this.LLFZ) {
                ViewGroup viewGroup = this.LJLLL;
                o.LJI(viewGroup);
                this.LLI = viewGroup.getMeasuredWidth();
                ViewGroup viewGroup2 = this.LJLLL;
                o.LJI(viewGroup2);
                this.LLIFFJFJJ = viewGroup2.getMeasuredHeight();
                ViewGroup viewGroup3 = this.LJLLL;
                o.LJI(viewGroup3);
                this.LLII = viewGroup3.getVisibility();
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.LLII == 0) {
                    ViewGroup viewGroup4 = this.LJLLL;
                    o.LJI(viewGroup4);
                    Drawable background = viewGroup4.getBackground();
                    o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.addUpdateListener(new AUListenerS97S0200000_5(this, gradientDrawable, 17));
                    ofFloat.addListener(new ALAdapterS4S0200000_5(gradientDrawable, this, 18));
                    ofFloat.setDuration(200L);
                    animatorSet.playTogether(ofFloat);
                }
                animatorSet.addListener(new ALAdapterS4S0100000_5(this, 46));
                animatorSet.start();
                BZI LIZ = C28787BRn.LIZ("livesdk_clear_screen_anchor_show");
                LIZ.LJIJJ(c29717BlR.LIZIZ, "clear_type");
                LIZ.LJIILLIIL(this.dataChannel);
                LIZ.LJJIIJZLJL();
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            C29727Blb c29727Blb2 = this.LLFFF;
            if (c29727Blb2 != null) {
                if ((c29727Blb2.LJIIL == EnumC29732Blg.FOLLOW_ANIM && !c29727Blb2.LJIIIIZZ()) || c29727Blb2.LJIIL == EnumC29732Blg.FOLLOWED) {
                    c29727Blb2.LJIIL = EnumC29732Blg.FOLLOWED;
                } else {
                    ViewGroup viewGroup5 = this.LJLLL;
                    o.LJI(viewGroup5);
                    Drawable background2 = viewGroup5.getBackground();
                    o.LJII(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    GradientDrawable gradientDrawable2 = (GradientDrawable) background2;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat2.addUpdateListener(new AUListenerS97S0200000_5(this, gradientDrawable2, 16));
                    ofFloat2.addListener(new ALAdapterS4S0200000_5(gradientDrawable2, this, 17));
                    ofFloat2.setDuration(200L);
                    animatorSet2.playTogether(ofFloat2);
                }
            }
            animatorSet2.addListener(new ALAdapterS4S0100000_5(this, 47));
            animatorSet2.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        this.LJLILLLLZI = room;
        LJZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        String str;
        ACListenerS25S0100000_5 aCListenerS25S0100000_5 = new ACListenerS25S0100000_5(this, 208);
        View findViewById = findViewById(R.id.a1q);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.anchor_avatar_boarder)");
        this.LJLIL = (C47061t0) findViewById;
        this.LLD = (ViewGroup) findViewById(R.id.git);
        this.LJLJL = findViewById(R.id.gw3);
        this.LJLLJ = findViewById(R.id.d3d);
        this.LJLLL = (ViewGroup) findViewById(R.id.dkh);
        C47121t6 c47121t6 = (C47121t6) findViewById(R.id.djm);
        this.LJLLLL = c47121t6;
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS25S0100000_5(this, 204));
        }
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.v1);
        this.LJLLLLLL = liveIconView;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this, 205));
        }
        View findViewById2 = findViewById(R.id.kpw);
        this.LJLZ = findViewById2;
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(aCListenerS25S0100000_5, findViewById2);
        }
        View view = this.LJLZ;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJZ = (C2A4) findViewById(R.id.dkt);
        ImageView imageView = (ImageView) findViewById(R.id.kpy);
        this.LJZI = imageView;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, aCListenerS25S0100000_5);
        }
        TextView textView = this.LL;
        if (textView != null) {
            C16880lQ.LJIJI(textView, aCListenerS25S0100000_5);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.i58);
        this.LJZL = imageView2;
        if (imageView2 != null) {
            C16880lQ.LJIILLIIL(imageView2, new ACListenerS25S0100000_5(this, 206));
        }
        this.LL = (TextView) findViewById(R.id.kq7);
        ViewGroup viewGroup = this.LJLLL;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.chs);
        }
        C47121t6 c47121t62 = this.LJLLLL;
        if (c47121t62 != null) {
            c47121t62.setTextColor(this.context.getResources().getColor(R.color.acm));
        }
        LiveIconView liveIconView2 = this.LJLLLLLL;
        if (liveIconView2 != null) {
            liveIconView2.setIconTint(this.context.getResources().getColor(R.color.acm));
        }
        if (LiveMicRoomStrengthenSetting.INSTANCE.enable() && !this.LJLJJLL) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.giu);
            this.LLFF = viewGroup2;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            ViewGroup viewGroup3 = this.LLFF;
            if (viewGroup3 != null) {
                C16880lQ.LJIIL(viewGroup3, new ACListenerS25S0100000_5(this, 207));
            }
            IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.Nl()) {
                str = "live_house_user";
            } else {
                str = "basic_user";
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_show_list_entrance");
            LIZ.LJIILLIIL(this.dataChannel);
            C06490Nh.LIZLLL(LIZ, str, "show_list_user_type", "live_detail_page_icon", "request_page");
        } else {
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.giu);
            this.LLFF = viewGroup4;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
        }
        String l = C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale());
        if (!o.LJ(l, "id-ID")) {
            o.LJIIIIZZ(l, "l");
            if (!s.LJJJLZIJ(l, "zh", false)) {
                return;
            }
        }
        C47121t6 c47121t63 = this.LJLLLL;
        if (c47121t63 != null) {
            c47121t63.setTextSize(1, 13.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget.onLoad(java.lang.Object[]):void");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String str;
        String str2;
        InterfaceC78280Uns interfaceC78280Uns2;
        String str3;
        if (C29306Beo.LJIIJ(this.dataChannel) && o.LJ(c199097rd.LJLIL, this.LLIIII)) {
            try {
                String str4 = null;
                if (!LiveStreamerLayoutBGSetting.INSTANCE.getValue()) {
                    InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                    if (interfaceC78280Uns3 != null) {
                        interfaceC78280Uns2 = interfaceC78280Uns3.getMap("icon");
                    } else {
                        interfaceC78280Uns2 = null;
                    }
                    Gson gson = new Gson();
                    if (interfaceC78280Uns2 == null) {
                        str3 = null;
                    } else {
                        str3 = C78501UrR.LIZIZ(interfaceC78280Uns2).toString();
                    }
                    ImageModel imageModel = (ImageModel) gson.LJI(str3, ImageModel.class);
                    C47061t0 c47061t0 = this.LJLIL;
                    if (c47061t0 != null) {
                        C15620jO.LIZIZ(imageModel, c47061t0);
                        C47061t0 c47061t02 = this.LJLIL;
                        if (c47061t02 != null) {
                            c47061t02.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("border");
                            throw null;
                        }
                    }
                    o.LJIJI("border");
                    throw null;
                }
                InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns4 != null && interfaceC78280Uns4.getInt("is_anchor_avatar") == 1) {
                    if (!C29306Beo.LJIIJ(this.dataChannel)) {
                        return;
                    }
                } else if (C29306Beo.LJIIJ(this.dataChannel)) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns5 != null) {
                    interfaceC78280Uns = interfaceC78280Uns5.getMap("icon");
                } else {
                    interfaceC78280Uns = null;
                }
                Gson gson2 = new Gson();
                if (interfaceC78280Uns == null) {
                    str = null;
                } else {
                    str = C78501UrR.LIZIZ(interfaceC78280Uns).toString();
                }
                ImageModel imageModel2 = (ImageModel) gson2.LJI(str, ImageModel.class);
                C47061t0 c47061t03 = this.LJLIL;
                if (c47061t03 != null) {
                    C15620jO.LIZIZ(imageModel2, c47061t03);
                    C47061t0 c47061t04 = this.LJLIL;
                    if (c47061t04 != null) {
                        c47061t04.setVisibility(0);
                        BorderInfo borderInfo = new BorderInfo();
                        InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
                        if (interfaceC78280Uns6 != null) {
                            str2 = interfaceC78280Uns6.getString("avatar_background_color");
                        } else {
                            str2 = null;
                        }
                        borderInfo.avatarBackgroundColor = str2;
                        InterfaceC78280Uns interfaceC78280Uns7 = c199097rd.LJLILLLLZI;
                        if (interfaceC78280Uns7 != null) {
                            str4 = interfaceC78280Uns7.getString("avatar_background_border_color");
                        }
                        borderInfo.avatarBackgroundBorderColor = str4;
                        LLFF(borderInfo);
                        return;
                    }
                    o.LJIJI("border");
                    throw null;
                }
                o.LJIJI("border");
                throw null;
            } catch (Exception unused) {
            }
        }
    }

    public final void LJLZ(Room room, String str) {
        String str2;
        String str3;
        FollowInfo followInfo;
        LLF();
        C29727Blb c29727Blb = this.LLFFF;
        if (c29727Blb != null) {
            c29727Blb.LIZ(EnumC29732Blg.FOLLOW_ANIM);
        }
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService != null && !iMicRoomService.Nl()) {
            str2 = "loyal_audience_c_anchor";
        } else {
            str2 = "carousel_audience_c_anchor";
        }
        long id = room.getOwner().getId();
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        C29364Bfk c29364Bfk = new C29364Bfk();
        c29364Bfk.LIZIZ(id);
        room.getRequestId();
        c29364Bfk.LIZLLL();
        c29364Bfk.LIZLLL();
        c29364Bfk.LIZLLL();
        long j = 0;
        c29364Bfk.LJ(0L);
        room.getLabels();
        c29364Bfk.LIZLLL();
        ((C29374Bfu) LIZIZ).LJIIIIZZ(c29364Bfk.LIZJ()).LJJJLIIL(new AfS57S0100000_5(this, 145), new AfS57S0100000_5(this, 146));
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("growth_deepevent", "1");
            if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
                String LIZLLL = C28594BKc.LIZJ().LIZLLL();
                o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
                hashMap.put("enter_live_method", LIZLLL);
            }
            String LJIIIZ = BJM.LJIIIZ();
            if (!TextUtils.isEmpty(LJIIIZ) && o.LJ("click_push_live_cd_user", LJIIIZ)) {
                hashMap.put("is_subscribe", "1");
            } else {
                hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
            }
            if (!s.LJJJLZIJ(str2, "carousel_audience_c", false) && !s.LJJJLZIJ(str2, "loyal_audience_c", false)) {
                str2 = "live_over";
            }
            if (C15380j0.LJIILLIIL()) {
                str3 = "portrait";
            } else {
                str3 = "landscape";
            }
            hashMap.put("room_orientation", str3);
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                j = followInfo.getFollowStatus();
            }
            if (j != 1 && j != 3) {
                hashMap.put("follow_type", "single");
            } else {
                hashMap.put("follow_type", "mutual");
            }
            hashMap.put("click_user_position", str);
            BZI LIZ = C28787BRn.LIZ("follow");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIILIIL(new BU8(str2, room.getOwner().getId()));
            LIZ.LJIIIZ("live_interact");
            LIZ.LJIIL("core");
            if (o.LJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "manual_pk")) {
                if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                    LIZ.LJIJJ("pk_phase", "match_status");
                } else {
                    LIZ.LJIJJ("punish", "match_status");
                }
                LIZ.LJJIFFI(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
            }
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
            LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
            LIZ.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "connection_type");
            LIZ.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }
}
