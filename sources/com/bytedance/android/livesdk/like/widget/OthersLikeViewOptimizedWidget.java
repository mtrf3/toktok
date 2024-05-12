package com.bytedance.android.livesdk.like.widget;

import X.B83;
import X.BJM;
import X.BZI;
import X.C025908h;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29927Bop;
import X.C29982Bpi;
import X.C31014CFe;
import X.C31309CQn;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC29980Bpg;
import X.InterfaceC29988Bpo;
import X.InterfaceC29990Bpq;
import X.V0Q;
import X.YK3;
import android.graphics.Bitmap;
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
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class OthersLikeViewOptimizedWidget extends LiveRecyclableWidget implements OnMessageListener, Handler.Callback, InterfaceC29988Bpo {
    public YK3 LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;
    public IMessageManager LJLJJI;
    public boolean LJLJJL;
    public LikeHelper LJLJJLL;
    public int LJLJL = 1;
    public long LJLJLJ = 300;
    public final Handler LJLJLLL = new Handler(C16880lQ.LLJJJJ(), this);
    public final LinkedList<Bitmap> LJLL = new LinkedList<>();
    public final LinkedList<Integer> LJLLI = new LinkedList<>();
    public int LJLLILLLL;
    public int LJLLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dc1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
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
                LIZ.LJIJJ(bjm.LIZJ(), "live_type");
                LIZ.LJJIJ();
                LIZ.LJI();
                LIZ.LJJIIZI();
            }
            this.LJLLJ = 0;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        YK3 yk3 = this.LJLIL;
        if (yk3 != null) {
            yk3.LIZIZ();
            IMessageManager iMessageManager = this.LJLJJI;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
            this.LJLJLLL.removeCallbacksAndMessages(null);
            LJLZ();
            this.LJLLILLLL = 0;
            this.LJLLJ = 0;
            this.LJLL.clear();
            this.LJLLI.clear();
            LikeHelper likeHelper = this.LJLJJLL;
            if (likeHelper != null && likeHelper.LLF) {
                likeHelper.LLIILZL = null;
                return;
            }
            return;
        }
        o.LJIJI("bottomLikeView");
        throw null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == 1) {
            LJZI(this.LJLL.poll(), this.LJLLI.poll());
            if (!this.LJLL.isEmpty()) {
                this.LJLJLLL.sendEmptyMessageDelayed(1, this.LJLJLJ);
            }
            return true;
        }
        if (i == 2) {
            LJLZ();
            this.LJLJLLL.sendEmptyMessageDelayed(2, 60000L);
            return false;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.he6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.others_like_view)");
        this.LJLIL = (YK3) findViewById;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long j;
        IMessageManager iMessageManager;
        LikeHelper likeHelper;
        int i;
        long j2;
        int LJFF;
        Boolean bool;
        Room room;
        boolean z = false;
        this.LJLJJL = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJLILLLLZI = j;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        }
        this.LJLJI = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            iMessageManager = (IMessageManager) dataChannel3.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJJI = iMessageManager;
        InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LJLILLLLZI);
        if (hq0 instanceof LikeHelper) {
            likeHelper = (LikeHelper) hq0;
        } else {
            likeHelper = null;
        }
        this.LJLJJLL = likeHelper;
        if (likeHelper != null && likeHelper.LLF && !LiveLikeDegradeSettings.INSTANCE.disableOtherLike(this.dataChannel)) {
            likeHelper.LLIILZL = this;
            IMessageManager iMessageManager2 = this.LJLJJI;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(EnumC31509CYf.LIKE.getIntType(), this);
            }
        }
        LikeHelper likeHelper2 = this.LJLJJLL;
        if (likeHelper2 != null) {
            i = likeHelper2.LJLL;
        } else {
            i = 1;
        }
        this.LJLJL = i;
        if (likeHelper2 != null) {
            j2 = likeHelper2.LJLLI;
        } else {
            j2 = 300;
        }
        this.LJLJLJ = j2;
        this.LJLJLLL.sendEmptyMessageDelayed(2, 60000L);
        YK3 yk3 = this.LJLIL;
        if (yk3 != null) {
            ViewGroup.LayoutParams layoutParams = yk3.getLayoutParams();
            LikeHelper likeHelper3 = this.LJLJJLL;
            if (likeHelper3 != null) {
                LJFF = likeHelper3.LJJIIJ();
            } else {
                LJFF = C15380j0.LJFF(R.dimen.a_d);
            }
            layoutParams.width = LJFF;
            YK3 yk32 = this.LJLIL;
            if (yk32 != null) {
                yk32.setLayoutParams(yk32.getLayoutParams());
                return;
            } else {
                o.LJIJI("bottomLikeView");
                throw null;
            }
        }
        o.LJIJI("bottomLikeView");
        throw null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        if (!(iMessage instanceof LikeMessage) || !this.isViewValid) {
            return;
        }
        if (this.LJLJI && !this.LJLJJL) {
            this.LJLJJL = true;
            RoomMessage LJIJ = C31309CQn.LJIJ(this.LJLILLLLZI, this.context.getString(R.string.m0k));
            IMessageManager iMessageManager = this.LJLJJI;
            if (iMessageManager != null) {
                iMessageManager.insertMessage(LJIJ, true);
            }
        }
        LikeMessage likeMessage = (LikeMessage) iMessage;
        User user = likeMessage.user;
        if (user != null && user.getId() == C025908h.LIZ()) {
            return;
        }
        List<ImageModel> list = likeMessage.icons;
        LikeHelper likeHelper = this.LJLJJLL;
        if (likeHelper != null) {
            bitmap = likeHelper.LJJIIJZLJL(list);
        } else {
            bitmap = null;
        }
        LJZ(-1, bitmap);
    }

    @Override // X.InterfaceC29988Bpo
    public final void LJLIIL(int i, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled() && isViewValid()) {
            LJZ(i, bitmap);
        }
    }

    public final void LJZ(int i, Bitmap bitmap) {
        if (i == -1) {
            int i2 = this.LJLLILLLL + this.LJLJL;
            this.LJLLILLLL = i2;
            C29982Bpi.LIZ = i2;
        }
        int i3 = 0;
        if (this.LJLJLJ < 0) {
            if (i == -1) {
                int i4 = this.LJLJL;
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
            int i5 = this.LJLJL;
            while (i3 < i5) {
                this.LJLL.offer(bitmap);
                this.LJLLI.offer(Integer.valueOf(i));
                i3++;
            }
        } else {
            this.LJLL.offer(bitmap);
            this.LJLLI.offer(Integer.valueOf(i));
        }
        if (!this.LJLJLLL.hasMessages(1) && (!this.LJLL.isEmpty())) {
            this.LJLJLLL.sendEmptyMessageDelayed(1, this.LJLJLJ);
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
                    LikeHelper likeHelper = this.LJLJJLL;
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
            LikeHelper likeHelper2 = this.LJLJJLL;
            if (likeHelper2 != null) {
                LJFF = likeHelper2.LJJIIJ();
            } else {
                LJFF = C15380j0.LJFF(R.dimen.a_d);
            }
            int i3 = (LJFF - YK3.LJLJJL) / 2;
            if (i3 > 0) {
                i = V0Q.Default.nextInt(-i3, i3);
            } else {
                i = 0;
            }
            C31014CFe.LJIILLIIL();
            YK3 yk3 = this.LJLIL;
            if (yk3 != null) {
                float f = LJFF / 2;
                float f2 = f + i;
                yk3.LIZ(bitmap, f, OptimizedLikeHelper.LLILZLL, f2, OptimizedLikeHelper.LLIZ, f2, OptimizedLikeHelper.LLILZIL);
                return;
            }
            o.LJIJI("bottomLikeView");
            throw null;
        }
    }
}
