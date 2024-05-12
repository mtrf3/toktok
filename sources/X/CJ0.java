package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeShortPaySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJ0 extends ConstraintLayout implements InterfaceC28316B9k, CJO, CJP, CJN {
    public RecyclerView LJLIL;
    public final C31413CUn LJLILLLLZI;
    public final CJ1 LJLJI;
    public SSGridLayoutManager LJLJJI;
    public C0YL LJLJJL;
    public CJ3 LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public DataChannel LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final CJ2 LJLLLLLL;
    public final ArrayList<EmoteModel> LJLZ;
    public final C73318Sq2 LJZ;
    public int LJZI;

    public final void LJJLJLI() {
        boolean z;
        boolean z2;
        if (this.LJLZ.isEmpty()) {
            return;
        }
        this.LJLLLLLL.clear();
        Iterator<EmoteModel> it = this.LJLZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EmoteModel next = it.next();
            if (next.emotePrivateType == 1) {
                if (next != null) {
                    z = true;
                }
            }
        }
        z = false;
        CJ2 cj2 = this.LJLLLLLL;
        boolean z3 = this.LJLLJ;
        if (!z3 && !this.LJLLLL) {
            cj2.add(0, new CJ9(this.LJLLL, z3, z));
        }
        Iterator<EmoteModel> it2 = this.LJLZ.iterator();
        while (it2.hasNext()) {
            EmoteModel next2 = it2.next();
            if (!this.LJLLJ && !this.LJLLLL) {
                z2 = true;
            } else {
                z2 = false;
            }
            next2.readOnly = z2;
            next2.inputLimited = this.LJLLILLLL;
        }
        cj2.addAll(this.LJLZ);
        this.LJLILLLLZI.notifyDataSetChanged();
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("mRecyclerView");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C01D c01d;
        super.onAttachedToWindow();
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            C01E c01e = (C01E) dataChannel.kv0(C29P.class);
            if (c01e != null) {
                c01d = c01e.LIZ(InterfaceC30925CBt.class);
            } else {
                c01d = null;
            }
            InterfaceC30925CBt interfaceC30925CBt = (InterfaceC30925CBt) c01d;
            if (interfaceC30925CBt != null) {
                interfaceC30925CBt.LIZIZ(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C01D c01d;
        super.onDetachedFromWindow();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        this.LJZ.LIZLLL();
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            C01E c01e = (C01E) dataChannel.kv0(C29P.class);
            if (c01e != null) {
                c01d = c01e.LIZ(InterfaceC30925CBt.class);
            } else {
                c01d = null;
            }
            InterfaceC30925CBt interfaceC30925CBt = (InterfaceC30925CBt) c01d;
            if (interfaceC30925CBt != null) {
                interfaceC30925CBt.LIZIZ(false);
            }
        }
    }

    public final DataChannel getDataChannel() {
        return this.LJLLI;
    }

    public final int getOneLineCount() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC28316B9k
    public final void LJIIJJI(C31061Ju c31061Ju) {
        C0YL c0yl;
        if (c31061Ju == null || (c0yl = this.LJLJJL) == null) {
            return;
        }
        c0yl.LIZJ(c31061Ju);
    }

    public final void onEvent(CJ5 cj5) {
        FollowPair followPair;
        if (cj5 == null || (followPair = cj5.LIZ) == null) {
            return;
        }
        this.LJLLL = followPair.LIZIZ();
        LJJLJLI();
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLLI = dataChannel;
    }

    public final void setEmoteSelectPanelCallback(CJ3 callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJLL = callback;
    }

    public final void setOnEmojiSelectListener(C0YL c0yl) {
        this.LJLJJL = c0yl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJ0(Context context, DataChannel dataChannel) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        new LinkedHashMap();
        this.LJLILLLLZI = new C31413CUn();
        this.LJLJI = new CJ1();
        this.LJLJLJ = 5;
        this.LJLLLLLL = new CJ2();
        this.LJLZ = new ArrayList<>();
        this.LJZ = new C73318Sq2();
        this.LJZI = C15380j0.LIZ(58.0f);
        this.LJLLI = dataChannel;
        C16880lQ.LLLZIIL(R.layout.djx, C16880lQ.LLZIL(context), this);
    }

    @Override // X.CJP
    public final void Bg(String str, String str2) {
        String str3;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null) {
            CJ3 cj3 = this.LJLJJLL;
            if (cj3 != null) {
                cj3.LIZ();
            }
            Long l = null;
            if (getContext().getResources().getConfiguration().orientation == 2) {
                C73943T0h.LIZ().LIZIZ(new B3N("subscribe_entrance_emote_bar"));
                DataChannel dataChannel = this.LJLLI;
                if (dataChannel != null) {
                    l = (Long) dataChannel.kv0(AudienceShowOrientationBeginTime.class);
                }
                Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                if (l != null) {
                    IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
                    if (room2 == null || (str3 = C17280m4.LIZ(room2)) == null) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    iDefinitionService.Hu(1, l.longValue(), str3, 0, "click_sub");
                    return;
                }
                return;
            }
            if (SubscribeShortPaySetting.INSTANCE.getValue()) {
                String anchor_user_badge_or_emotes_subscribe = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_user_badge_or_emotes_subscribe();
                LinkedHashMap LIZ = C0JU.LIZ("page_type", "emotes");
                InterfaceC06390Mx LIZ2 = CN1.LIZ(ISubscribeService.class);
                o.LJIIIIZZ(LIZ2, "getService(ISubscribeService::class.java)");
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                ((ISubscribeService) LIZ2).Up(context, room, anchor_user_badge_or_emotes_subscribe, str, LIZ, null);
                return;
            }
            InterfaceC06390Mx LIZ3 = CN1.LIZ(ISubscribeService.class);
            o.LJIIIIZZ(LIZ3, "getService(ISubscribeService::class.java)");
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            ((ISubscribeService) LIZ3).kg0(context2, room, str, null);
        }
    }

    @Override // X.CJN
    public final void LJJLIIIJLJLI(C47061t0 v, EmoteModel emoji) {
        Long l;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(emoji, "emoji");
        if (!this.LJLL) {
            int i = 1;
            this.LJLL = true;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLLL;
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null) {
                return;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_subscription_audience_emote_load_duration");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(elapsedRealtime), "duration");
            LIZ.LJIJJ("comment_box", "show_position");
            LIZ.LJIJJ(1, "is_load_successful");
            User owner = room.getOwner();
            if (owner == null || !owner.isSubscribed()) {
                i = 0;
            }
            LIZ.LJIJJ(Integer.valueOf(i), "is_subscription");
            User owner2 = room.getOwner();
            if (owner2 != null) {
                l = Long.valueOf(owner2.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "anchor_id");
            LIZ.LJIJJ(Long.valueOf(room.getId()), "room_id");
            LIZ.LJJIIJZLJL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r5 != 3) goto L16;
     */
    @Override // X.CJO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIIJI(android.view.View r16, android.view.MotionEvent r17, int r18, com.bytedance.android.live.base.model.emoji.EmoteModel r19) {
        /*
            r15 = this;
            r12 = r18
            java.lang.String r0 = "v"
            r11 = r16
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "event"
            r8 = r17
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "emoji"
            r13 = r19
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            X.CUn r0 = r15.LJLILLLLZI
            r6 = 0
            int r0 = r0.getItemViewType(r6)
            if (r0 != 0) goto L24
            if (r12 <= 0) goto L24
            int r12 = r12 + (-1)
        L24:
            X.CJ1 r10 = r15.LJLJI
            boolean r0 = r15.LJLJL
            r10.getClass()
            if (r0 == 0) goto Lbe
            r0 = 5
        L2e:
            r10.LJIIJ = r0
            int r5 = r8.getAction()
            r9 = 1
            r7 = 0
            r0 = 0
            r2 = 500(0x1f4, double:2.47E-321)
            if (r5 == 0) goto L90
            if (r5 == r9) goto L52
            r4 = 2
            if (r5 == r4) goto L4c
            r4 = 3
            if (r5 == r4) goto L52
        L44:
            long r4 = r10.LIZIZ
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L4b
            r6 = 1
        L4b:
            return r6
        L4c:
            float r0 = r10.LJIIIIZZ
            r10.LIZ(r0, r11, r12, r13)
            goto L44
        L52:
            android.os.Handler r4 = r10.LJII
            r4.removeCallbacksAndMessages(r7)
            X.CJ4 r4 = r10.LJIIIZ
            if (r4 == 0) goto L69
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L69
            X.CJ4 r4 = r10.LJIIIZ
            kotlin.jvm.internal.o.LJI(r4)
            r4.dismiss()
        L69:
            int r4 = r10.LJFF
            if (r4 < 0) goto L76
            r4 = 2131369348(0x7f0a1d84, float:1.8358672E38)
            android.view.View r5 = r11.findViewById(r4)
            if (r5 != 0) goto L87
        L76:
            r4 = -1
            r10.LJFF = r4
            r10.LIZLLL = r9
            r10.LJ = r0
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r10.LIZJ
            long r4 = r4 - r0
            r10.LIZIZ = r4
            goto L44
        L87:
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r6)
            r5.setBackground(r4)
            goto L76
        L90:
            long r4 = java.lang.System.currentTimeMillis()
            r10.LIZJ = r4
            r10.LIZIZ = r0
            long r0 = java.lang.System.currentTimeMillis()
            r10.LJ = r0
            float r0 = r8.getX()
            r10.LIZ = r0
            float r0 = r8.getX()
            r10.LJIIIIZZ = r0
            r8.getY()
            android.os.Handler r0 = r10.LJII
            r0.removeCallbacksAndMessages(r7)
            android.os.Handler r0 = r10.LJII
            Y.ARunnableS6S0301000_5 r9 = new Y.ARunnableS6S0301000_5
            r14 = 1
            r9.<init>(r10, r11, r12, r13, r14)
            r0.postDelayed(r9, r2)
            goto L44
        Lbe:
            r0 = 10
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CJ0.LJJIJIIJI(android.view.View, android.view.MotionEvent, int, com.bytedance.android.live.base.model.emoji.EmoteModel):boolean");
    }
}
