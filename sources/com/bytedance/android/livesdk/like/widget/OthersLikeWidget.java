package com.bytedance.android.livesdk.like.widget;

import X.B83;
import X.BCW;
import X.BJM;
import X.BZI;
import X.C025908h;
import X.C05200Ii;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29460BhI;
import X.C29927Bop;
import X.C29974Bpa;
import X.C29975Bpb;
import X.C29982Bpi;
import X.C29992Bps;
import X.C29993Bpt;
import X.C31014CFe;
import X.C31309CQn;
import X.C31665Cbl;
import X.C5H3;
import X.C73969T1h;
import X.C78996UzQ;
import X.C7MY;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC29856Bng;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.InterfaceC29988Bpo;
import X.InterfaceC29990Bpq;
import X.InterfaceC64592gB;
import X.T16;
import X.V0Q;
import X.YKA;
import X.YKB;
import Y.AfS57S0100000_5;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeDifferentialHeatSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class OthersLikeWidget extends LiveRecyclableWidget implements OnMessageListener, InterfaceC29986Bpm, Handler.Callback, InterfaceC29988Bpo {
    public static final int LLD = C15380j0.LIZ(32.0f);
    public static final float LLF = 134.0f;
    public static final float LLFF = 236.0f;
    public YKA LJLIL;
    public long LJLJI;
    public Room LJLJJI;
    public boolean LJLJJL;
    public IMessageManager LJLJJLL;
    public boolean LJLJL;
    public final Handler LJLL;
    public LikeHelper LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public final int LJLLL;
    public final LinkedList<Bitmap> LJLLLL;
    public final LinkedList<Integer> LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public float LJZI;
    public float LJZL;
    public float LL;
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 239));
    public int LJLJLJ = 1;
    public long LJLJLLL = 300;

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "OthersLikeWidget";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dc0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
    }

    public final void LJLZ() {
        Long l;
        Long l2;
        String str;
        InterfaceC05190Ih interfaceC05190Ih;
        UserAttr userAttr;
        if (this.LJLLJ > 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_like_special_effect_show");
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
            Boolean bool = null;
            if (LIZIZ != null) {
                l = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId());
            } else {
                l = null;
            }
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            if (o.LJ(l, l2)) {
                str = "anchor";
            } else {
                if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null && (userAttr = interfaceC05190Ih.getUserAttr()) != null) {
                    bool = Boolean.valueOf(userAttr.isAdmin);
                }
                if (C29306Beo.LJJIFFI(bool)) {
                    str = "admin";
                } else {
                    str = "user";
                }
            }
            LIZ.LJIJJ(str, "admin_type");
            LIZ.LJIJJ(Integer.valueOf(this.LJLLJ), "special_effect_amount");
            BJM bjm = BJM.LJLIL;
            LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
            if (o.LJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "manual_pk")) {
                if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                    LIZ.LJIJJ("pk_phase", "match_status");
                } else {
                    LIZ.LJIJJ("punish", "match_status");
                }
            }
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJIILLIIL(this.dataChannel);
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJI();
                LIZ.LJIJJ(bjm.LIZJ(), "live_type");
                LIZ.LJJIIZI();
            }
            this.LJLLJ = 0;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        YKA yka = ((C29992Bps) this.LJLILLLLZI.getValue()).LIZIZ.LJLIL;
        if (yka != null) {
            yka.LIZ();
            IMessageManager iMessageManager = this.LJLJJLL;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
            LikeHelper likeHelper = this.LJLLI;
            if (likeHelper != null && likeHelper.LLF) {
                likeHelper.LLIILZL = null;
                if (likeHelper.LL) {
                    likeHelper.LJIILJJIL(this);
                }
            }
            this.LJLL.removeCallbacksAndMessages(null);
            LJLZ();
            this.LJLLILLLL = 0;
            this.LJLLJ = 0;
            this.LJLLLL.clear();
            this.LJLLLLLL.clear();
            this.LJLILLLLZI.getValue().getClass();
            return;
        }
        o.LJIJI("bottomLikeView");
        throw null;
    }

    public OthersLikeWidget() {
        LinkedList<Bitmap> c29993Bpt;
        int i;
        LinkedList<Integer> c29993Bpt2;
        int likeQueueCapacity = LiveLikeOptSetting.INSTANCE.getLikeQueueCapacity();
        this.LJLL = new Handler(C16880lQ.LLJJJJ(), this);
        int value = LiveLikeDifferentialHeatSetting.INSTANCE.getValue();
        this.LJLLL = value;
        if (likeQueueCapacity <= 0) {
            c29993Bpt = new LinkedList<>();
        } else {
            if (value == 0) {
                i = likeQueueCapacity;
            } else {
                i = 100;
            }
            c29993Bpt = new C29993Bpt<>(i);
        }
        this.LJLLLL = c29993Bpt;
        if (likeQueueCapacity <= 0) {
            c29993Bpt2 = new LinkedList<>();
        } else {
            c29993Bpt2 = new C29993Bpt<>(value != 0 ? 100 : likeQueueCapacity);
        }
        this.LJLLLLLL = c29993Bpt2;
        this.LJLZ = true;
        this.LJZI = LLFF;
        this.LJZL = LLF;
        this.LL = 55.0f;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == 1) {
            if (!LiveLikeDegradeSettings.INSTANCE.isScalableDowngrade(this.dataChannel)) {
                LJZI(this.LJLLLL.poll(), this.LJLLLLLL.poll());
                if (!this.LJLLLL.isEmpty()) {
                    this.LJLL.sendEmptyMessageDelayed(1, this.LJLJLLL);
                }
            }
            return true;
        }
        if (i == 2) {
            LJLZ();
            this.LJLL.sendEmptyMessageDelayed(2, 60000L);
            return false;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        InterfaceC29856Bng interfaceC29856Bng;
        View findViewById = findViewById(R.id.jn6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.self_digg_view)");
        this.LJLIL = (YKA) findViewById;
        C29992Bps c29992Bps = (C29992Bps) this.LJLILLLLZI.getValue();
        c29992Bps.getClass();
        ImageModel avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
        if (avatarThumb != null && (interfaceC29856Bng = (InterfaceC29856Bng) C31665Cbl.LIZJ(avatarThumb).LJJIJL(C29974Bpa.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(c29992Bps.LIZIZ))) != null) {
            interfaceC29856Bng.LIZJ(new AfS57S0100000_5(c29992Bps, 130), new InterfaceC64592gB() { // from class: X.9DL
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        long j;
        IMessageManager iMessageManager;
        LikeHelper likeHelper;
        int i;
        long j2;
        int LJFF;
        int LJFF2;
        LikeEffect likeEffect;
        Boolean bool;
        Boolean bool2;
        this.LJLJL = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJI = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
            bool2.booleanValue();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJJL = z;
        C05200Ii.LIZIZ();
        Room room2 = this.LJLJJI;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        this.LJLJI = j;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJJLL = iMessageManager;
        C29992Bps c29992Bps = (C29992Bps) this.LJLILLLLZI.getValue();
        c29992Bps.getClass();
        ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIL().LJJIII(C29460BhI.LJLIL, false).LJJJ(T16.LIZ()).LJJIJL(C29975Bpb.LJLIL).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(c29992Bps.LIZIZ))).LIZJ(new AfS57S0100000_5(c29992Bps, 131), new InterfaceC64592gB() { // from class: X.9DM
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LJLJI);
        if (hq0 instanceof LikeHelper) {
            likeHelper = (LikeHelper) hq0;
        } else {
            likeHelper = null;
        }
        this.LJLLI = likeHelper;
        if (likeHelper != null) {
            i = likeHelper.LJLL;
        } else {
            i = 1;
        }
        this.LJLJLJ = i;
        if (likeHelper != null) {
            j2 = likeHelper.LJLLI;
        } else {
            j2 = 300;
        }
        this.LJLJLLL = j2;
        this.LJLL.sendEmptyMessageDelayed(2, 60000L);
        YKA yka = this.LJLIL;
        if (yka != null) {
            ViewGroup.LayoutParams layoutParams = yka.getLayoutParams();
            LikeHelper likeHelper2 = this.LJLLI;
            if (likeHelper2 != null) {
                LJFF = likeHelper2.LJJIIJ();
            } else {
                LJFF = C15380j0.LJFF(R.dimen.a_d);
            }
            layoutParams.width = LJFF;
            YKA yka2 = this.LJLIL;
            if (yka2 != null) {
                yka2.setLayoutParams(yka2.getLayoutParams());
                Room room3 = (Room) this.dataChannel.kv0(RoomChannel.class);
                this.LJLZ = true;
                this.LJZ = false;
                if (this.LJLLL != 0 && room3 != null && (likeEffect = room3.likeEffect) != null) {
                    this.LJLJLLL = likeEffect.effectIntervalMs;
                    if (likeEffect.effectCnt > 0) {
                        this.dataChannel.ov0(this, FirstFrameChannelEvent.class, new AqS136S0200000_5(this, likeEffect, 10));
                    }
                }
                LikeHelper likeHelper3 = this.LJLLI;
                if (likeHelper3 != null && likeHelper3.LLF && !LiveLikeDegradeSettings.INSTANCE.disableOtherLike(this.dataChannel)) {
                    IMessageManager iMessageManager2 = this.LJLJJLL;
                    if (iMessageManager2 != null) {
                        iMessageManager2.addMessageListener(EnumC31509CYf.LIKE.getIntType(), this);
                    }
                    likeHelper3.LLIILZL = this;
                    if (likeHelper3.LL) {
                        likeHelper3.LJ(this);
                    }
                }
                this.LJLL.sendEmptyMessageDelayed(2, 60000L);
                YKA yka3 = this.LJLIL;
                if (yka3 != null) {
                    yka3.LIZJ(false);
                    YKA yka4 = this.LJLIL;
                    if (yka4 != null) {
                        ViewGroup.LayoutParams layoutParams2 = yka4.getLayoutParams();
                        LikeHelper likeHelper4 = this.LJLLI;
                        if (likeHelper4 != null) {
                            LJFF2 = likeHelper4.LJJIIJ();
                        } else {
                            LJFF2 = C15380j0.LJFF(R.dimen.a_d);
                        }
                        layoutParams2.width = LJFF2;
                        YKA yka5 = this.LJLIL;
                        if (yka5 != null) {
                            if (yka5.getLayoutParams().height > 0) {
                                YKA yka6 = this.LJLIL;
                                if (yka6 != null) {
                                    ViewGroup.LayoutParams layoutParams3 = yka6.getLayoutParams();
                                    float LIZIZ = C7MY.LIZIZ(272);
                                    YKA yka7 = this.LJLIL;
                                    if (yka7 != null) {
                                        layoutParams3.height = (int) (yka7.getOthersLikeAnimationDistanceRatio() * LIZIZ);
                                    } else {
                                        o.LJIJI("bottomLikeView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("bottomLikeView");
                                    throw null;
                                }
                            }
                            YKA yka8 = this.LJLIL;
                            if (yka8 != null) {
                                yka8.setLayoutParams(yka8.getLayoutParams());
                                float f = LLFF;
                                YKA yka9 = this.LJLIL;
                                if (yka9 != null) {
                                    this.LJZI = yka9.getOthersLikeAnimationDistanceRatio() * f;
                                    float f2 = LLF;
                                    YKA yka10 = this.LJLIL;
                                    if (yka10 != null) {
                                        this.LJZL = yka10.getOthersLikeAnimationDistanceRatio() * f2;
                                        YKA yka11 = this.LJLIL;
                                        if (yka11 != null) {
                                            this.LL = yka11.getOthersLikeAnimationDistanceRatio() * 55.0f;
                                            return;
                                        } else {
                                            o.LJIJI("bottomLikeView");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("bottomLikeView");
                                    throw null;
                                }
                                o.LJIJI("bottomLikeView");
                                throw null;
                            }
                            o.LJIJI("bottomLikeView");
                            throw null;
                        }
                        o.LJIJI("bottomLikeView");
                        throw null;
                    }
                    o.LJIJI("bottomLikeView");
                    throw null;
                }
                o.LJIJI("bottomLikeView");
                throw null;
            }
            o.LJIJI("bottomLikeView");
            throw null;
        }
        o.LJIJI("bottomLikeView");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        List<LikeEffect> list;
        if (!(iMessage instanceof LikeMessage) || !this.isViewValid) {
            return;
        }
        if (!this.LJLJJL && LiveLikeDegradeSettings.INSTANCE.isScalableDowngrade(this.dataChannel)) {
            return;
        }
        if (this.LJLJJL && !this.LJLJL) {
            this.LJLJL = true;
            RoomMessage LJIJ = C31309CQn.LJIJ(this.LJLJI, this.context.getString(R.string.m0k));
            IMessageManager iMessageManager = this.LJLJJLL;
            if (iMessageManager != null) {
                iMessageManager.insertMessage(LJIJ, true);
            }
        }
        LikeMessage likeMessage = (LikeMessage) iMessage;
        User user = likeMessage.user;
        int i = 0;
        if (user != null && user.getId() == C025908h.LIZ()) {
            return;
        }
        LikeHelper likeHelper = this.LJLLI;
        if (likeHelper != null) {
            bitmap = likeHelper.LJJIIJZLJL(likeMessage.icons);
        } else {
            bitmap = null;
        }
        int i2 = (int) likeMessage.effectCnt;
        if (i2 <= 0) {
            i2 = 1;
        }
        if (this.LJLLL != 0 && (list = likeMessage.likeEffect) != null) {
            for (LikeEffect likeEffect : list) {
                if (likeEffect.version == this.LJLLL) {
                    if (this.LJLZ || this.LJLLLL.size() == 0) {
                        this.LJLZ = true;
                        i2 = (int) likeEffect.effectCnt;
                    } else {
                        i2 = 0;
                    }
                    this.LJLJLLL = likeEffect.effectIntervalMs;
                }
            }
            if (i2 <= 0) {
                return;
            }
        }
        do {
            LJZ(-1, bitmap);
            i++;
        } while (i < i2);
    }

    @Override // X.InterfaceC29988Bpo
    public final void LJLIIL(int i, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled() && isViewValid()) {
            LJZ(i, bitmap);
        }
    }

    public final void LJZ(int i, Bitmap bitmap) {
        if (i == -1) {
            int i2 = this.LJLLILLLL + this.LJLJLJ;
            this.LJLLILLLL = i2;
            C29982Bpi.LIZ = i2;
        }
        int i3 = 0;
        if (this.LJLJLLL < 0) {
            if (i == -1) {
                int i4 = this.LJLJLJ;
                while (i3 < i4) {
                    LJZI(bitmap, Integer.valueOf(i));
                    i3++;
                }
                return;
            }
            LJZI(bitmap, Integer.valueOf(i));
            return;
        }
        if (i == -1) {
            int i5 = this.LJLJLJ;
            while (i3 < i5) {
                this.LJLLLL.offer(bitmap);
                this.LJLLLLLL.offer(Integer.valueOf(i));
                i3++;
            }
        } else {
            this.LJLLLL.offer(bitmap);
            this.LJLLLLLL.offer(Integer.valueOf(i));
        }
        if (!this.LJLL.hasMessages(1) && (!this.LJLLLL.isEmpty())) {
            this.LJLL.sendEmptyMessageDelayed(1, this.LJLJLLL);
        }
    }

    public final void LJZI(Bitmap bitmap, Integer num) {
        List<InterfaceC29990Bpq> list;
        int LJFF;
        int i;
        if (bitmap != null) {
            if (num != null) {
                if (num.intValue() != -1) {
                    int intValue = num.intValue();
                    LikeHelper likeHelper = this.LJLLI;
                    if (likeHelper != null && (list = likeHelper.LLIIZ) != null) {
                        Iterator it = ((ArrayList) list).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC29990Bpq) it.next()).LIZ(intValue);
                        }
                    }
                } else {
                    int i2 = this.LJLLJ + 1;
                    this.LJLLJ = i2;
                    C29982Bpi.LIZIZ = i2;
                }
            }
            C29992Bps c29992Bps = (C29992Bps) this.LJLILLLLZI.getValue();
            c29992Bps.getClass();
            if (LiveLikePerformanceOptimizeSettings.INSTANCE.enableFunctionRemove()) {
                return;
            }
            Bitmap bitmap2 = c29992Bps.LIZ;
            OthersLikeWidget othersLikeWidget = c29992Bps.LIZIZ;
            LikeHelper likeHelper2 = othersLikeWidget.LJLLI;
            if (likeHelper2 != null) {
                LJFF = likeHelper2.LJJIIJ();
            } else {
                LJFF = C15380j0.LJFF(R.dimen.a_d);
            }
            int i3 = (LJFF - YKA.LLIIII) / 2;
            if (i3 > 0) {
                i = V0Q.Default.nextInt(-i3, i3);
            } else {
                i = 0;
            }
            C31014CFe.LJIILLIIL();
            YKA yka = othersLikeWidget.LJLIL;
            if (yka != null) {
                float f = LJFF / 2;
                PointF pointF = new PointF(f, C15380j0.LIZ(othersLikeWidget.LJZI));
                float f2 = f + i;
                yka.LLF.add(new YKB(yka, false, bitmap2, bitmap, pointF, new PointF(f2, C15380j0.LIZ(othersLikeWidget.LJZL)), new PointF(f2, C15380j0.LIZ(othersLikeWidget.LL))));
                if (!LiveLikeAnimationOptConfig.likeAnimationFluencyOpt() || yka.LLIFFJFJJ) {
                    return;
                }
                yka.LLII.doFrame(0L);
                yka.LLIFFJFJJ = true;
                return;
            }
            o.LJIJI("bottomLikeView");
            throw null;
        }
    }
}
