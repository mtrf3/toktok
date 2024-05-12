package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GuideBubbleVisibilityChannel;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftIconInfo;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Cqt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32603Cqt implements InterfaceViewOnClickListenerC30227Btf, InterfaceC32642CrW {
    public final DataChannel LJLIL;
    public C32609Cqz LJLILLLLZI;
    public C32604Cqu LJLJI;
    public C73411SrX LJLJJL;
    public boolean LJLJJLL;
    public C32633CrN LJLJL;
    public long LJLLLL;
    public boolean LJZ;
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public final List<Integer> LJLJLJ = new ArrayList();
    public final C32593Cqj LJLJLLL = new C32593Cqj(this);
    public final C32592Cqi LJLL = new C32592Cqi(this);
    public final AqS171S0100000_5 LJLLI = new AqS171S0100000_5(this, 831);
    public final AqS171S0100000_5 LJLLILLLL = new AqS171S0100000_5(this, 833);
    public final AqS171S0100000_5 LJLLJ = new AqS171S0100000_5(this, 834);
    public final AqS171S0100000_5 LJLLL = new AqS171S0100000_5(this, 829);
    public final AqS171S0100000_5 LJLLLLLL = new AqS171S0100000_5(this, 832);
    public final AqS171S0100000_5 LJLZ = new AqS171S0100000_5(this, 830);

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public C32603Cqt(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    @Override // X.InterfaceC32642CrW
    public final void LIZ(C32633CrN c32633CrN) {
        C32604Cqu c32604Cqu = this.LJLJI;
        if (c32604Cqu != null) {
            c32604Cqu.LIZ(c32633CrN);
            this.LJLJJI.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(10L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0200000_5(this, c32633CrN, 67)));
        }
    }

    @Override // X.InterfaceC32642CrW
    public final void LIZIZ(C32633CrN c32633CrN) {
        this.LJLJL = c32633CrN;
        C32604Cqu c32604Cqu = this.LJLJI;
        if (c32604Cqu != null) {
            c32604Cqu.LIZ(c32633CrN);
        }
    }

    @Override // X.InterfaceC32642CrW
    public final void LIZJ(C32633CrN type) {
        C32604Cqu c32604Cqu;
        o.LJIIIZ(type, "type");
        C32609Cqz c32609Cqz = this.LJLILLLLZI;
        if (c32609Cqz != null) {
            c32609Cqz.setShowingBubbleGuide(false);
        }
        C32609Cqz c32609Cqz2 = this.LJLILLLLZI;
        if (c32609Cqz2 != null) {
            c32609Cqz2.LJII();
        }
        this.LJLJJI.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(5L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0200000_5(this, type, 68)));
        long j = type.LJ;
        if (j > 0 && (c32604Cqu = this.LJLJI) != null) {
            c32604Cqu.LIZIZ = type;
            InterfaceC92693kP LJJJJZI = AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 327));
            this.LJLJJL = (C73411SrX) LJJJJZI;
            this.LJLJJI.LIZ(LJJJJZI);
        }
        C32609Cqz c32609Cqz3 = this.LJLILLLLZI;
        if (c32609Cqz3 != null) {
            c32609Cqz3.postDelayed(RunnableC32637CrR.LJLIL, 3000L);
        }
    }

    @Override // X.InterfaceC32642CrW
    public final void LIZLLL(C32633CrN type) {
        o.LJIIIZ(type, "type");
        C32609Cqz c32609Cqz = this.LJLILLLLZI;
        if (c32609Cqz != null) {
            c32609Cqz.setShowingBubbleGuide(true);
        }
        C32604Cqu c32604Cqu = this.LJLJI;
        if (c32604Cqu != null) {
            c32604Cqu.LIZ(type);
            C73411SrX c73411SrX = this.LJLJJL;
            if (c73411SrX != null && !c73411SrX.isDisposed()) {
                C73411SrX c73411SrX2 = this.LJLJJL;
                if (c73411SrX2 != null) {
                    c73411SrX2.dispose();
                }
                this.LJLJJL = null;
            }
            C32604Cqu c32604Cqu2 = this.LJLJI;
            if (c32604Cqu2 != null) {
                c32604Cqu2.LIZIZ = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [X.CrO, O] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        LiveMode liveType;
        C32633CrN c32633CrN;
        EnumC32619Cr9 enumC32619Cr9;
        String str;
        Integer num;
        Integer num2;
        o.LJIIIZ(v, "v");
        if (this.LJLIL != null) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IUserLevelService.class);
            o.LJIIIIZZ(LIZ, "getService(\n            …class.java,\n            )");
            ((IUserLevelService) LIZ).DK(false, null, "gift", Boolean.FALSE, "");
            C32634CrO c32634CrO = (C32634CrO) this.LJLIL.kv0(C32591Cqh.class);
            if (c32634CrO != null) {
                ((C32537Cpp) this.LJLIL.gv0(C32591Cqh.class)).LIZ = new C32634CrO(c32634CrO.LJLIL, c32634CrO.LJLILLLLZI, System.currentTimeMillis());
            }
            if (this.LJLIL != null) {
                C32004ChE c32004ChE = new C32004ChE(null);
                c32004ChE.LIZIZ = "icon";
                c32004ChE.LJIIL = SystemClock.uptimeMillis();
                C32634CrO c32634CrO2 = (C32634CrO) this.LJLIL.kv0(C32591Cqh.class);
                if (c32634CrO2 != null && (c32634CrO2.LJLIL || Math.abs(c32634CrO2.LJLJI - c32634CrO2.LJLILLLLZI) < 500)) {
                    c32004ChE.LIZIZ = "event_unlock";
                    c32004ChE.LJIIIIZZ = this.LJLLLL;
                }
                C32616Cr6 c32616Cr6 = (C32616Cr6) this.LJLIL.kv0(C32648Crc.class);
                if (c32616Cr6 != null && System.currentTimeMillis() - c32616Cr6.LIZJ <= 20000 && (num2 = c32616Cr6.LIZ) != null) {
                    EnumC124204u8 enumC124204u8 = c32616Cr6.LIZLLL;
                    if (enumC124204u8 == EnumC124204u8.BUBBLE || enumC124204u8 == EnumC124204u8.DETAIL_PAGE) {
                        c32004ChE.LIZIZ = "match_item_get_bubble";
                    }
                    c32004ChE.LJIIIZ = new C32644CrY(num2.intValue(), c32616Cr6.LIZIZ);
                    ((C32537Cpp) this.LJLIL.gv0(C32648Crc.class)).LIZ = null;
                }
                C32604Cqu c32604Cqu = this.LJLJI;
                if (c32604Cqu != null) {
                    C32633CrN c32633CrN2 = c32604Cqu.LIZIZ;
                    if (c32633CrN2 != null) {
                        c32004ChE.LJIIIIZZ = c32633CrN2.LIZJ;
                    }
                    EnumC32619Cr9 enumC32619Cr92 = EnumC32619Cr9.NORMAL;
                    if (c32604Cqu.LIZ.size() > 0) {
                        Iterator<C32633CrN> it = c32604Cqu.LIZ.iterator();
                        int i = 0;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (it.hasNext()) {
                            EnumC32627CrH enumC32627CrH = it.next().LIZIZ;
                            if (enumC32627CrH == EnumC32627CrH.BUBBLE) {
                                if (!z) {
                                    i++;
                                    enumC32619Cr92 = EnumC32619Cr9.BUBBLE;
                                    z = true;
                                }
                            } else if (enumC32627CrH == EnumC32627CrH.ANIMATION) {
                                if (!z2) {
                                    i++;
                                    enumC32619Cr92 = EnumC32619Cr9.ANIMATION;
                                    z2 = true;
                                }
                            } else if (enumC32627CrH == EnumC32627CrH.DOT && !z3) {
                                i++;
                                enumC32619Cr92 = EnumC32619Cr9.DOT;
                                z3 = true;
                            }
                        }
                        if (i > 1) {
                            enumC32619Cr92 = EnumC32619Cr9.MIX;
                        }
                    }
                    EnumC32607Cqx enumC32607Cqx = EnumC32607Cqx.NONE;
                    C32604Cqu c32604Cqu2 = this.LJLJI;
                    if (c32604Cqu2 != null) {
                        c32633CrN = c32604Cqu2.LIZ.peekFirst();
                        if (c32633CrN != null) {
                            if (c32633CrN.LIZ == EnumC32608Cqy.EVENT) {
                                enumC32607Cqx = EnumC32607Cqx.EVENT;
                            } else if (c32633CrN.LIZ == EnumC32608Cqy.COLOR_GIFT) {
                                enumC32607Cqx = EnumC32607Cqx.COLOR_GIFT;
                            } else if (c32633CrN.LIZ == EnumC32608Cqy.UNLOCK) {
                                enumC32607Cqx = EnumC32607Cqx.UNLOCK;
                            } else if (c32633CrN.LIZ == EnumC32608Cqy.GIFT_GUIDE) {
                                enumC32607Cqx = EnumC32607Cqx.GIFT_GUIDE;
                            } else if (c32633CrN.LIZ == EnumC32608Cqy.RANDOM_GIFT) {
                                enumC32607Cqx = EnumC32607Cqx.RANDOM_GIFT;
                            } else if (c32633CrN.LIZ == EnumC32608Cqy.WEEKLY_RANKING_GIFT) {
                                enumC32607Cqx = EnumC32607Cqx.WEEKLY_RANKING_GIFT;
                            } else if (c32633CrN.LIZ == EnumC32608Cqy.RANDOM_FIREWORKS) {
                                enumC32607Cqx = EnumC32607Cqx.RANDOM_FIREWORKS;
                            }
                            c32004ChE.LJIIIIZZ = c32633CrN.LIZJ;
                            if (c32004ChE.LJIIIZ == null && (num = c32633CrN.LIZLLL) != null) {
                                c32004ChE.LJIIIZ = new C32644CrY(num.intValue(), null);
                                c32004ChE.LIZIZ = "match_item_use_bubble";
                            }
                        }
                    } else {
                        c32633CrN = null;
                    }
                    Room room = (Room) this.LJLIL.kv0(RoomChannel.class);
                    if (enumC32619Cr92 == null) {
                        enumC32619Cr9 = EnumC32619Cr9.NORMAL;
                    } else {
                        enumC32619Cr9 = enumC32619Cr92;
                    }
                    C32000ChA.LIZ(room, enumC32619Cr9, enumC32607Cqx);
                    if (enumC32619Cr92 == null || (str = enumC32619Cr92.getDesc()) == null) {
                        str = "normal";
                    }
                    c32004ChE.LJIIJJI = str;
                    IInteractService iInteractService = C31120CJg.LIZ;
                    if (iInteractService.cx()) {
                        c32004ChE.LJI = true;
                        c32004ChE.LIZ = iInteractService.Yt();
                        c32004ChE.LJII = true;
                    } else {
                        c32004ChE.LJI = false;
                    }
                    this.LJLIL.qv0(SendGiftEvent.class, c32004ChE);
                    if (c32633CrN != null && c32633CrN.LIZ == EnumC32608Cqy.COLOR_GIFT) {
                        InterfaceC30442Bx8.b.LIZ(Boolean.TRUE);
                    }
                }
            }
            C32609Cqz c32609Cqz = this.LJLILLLLZI;
            if (c32609Cqz != null) {
                c32609Cqz.removeCallbacks(c32609Cqz.LLF);
                View view = c32609Cqz.LJLJJL;
                if (view != null) {
                    view.setVisibility(8);
                }
                this.LJLJJI.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(5L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 328)));
            }
            if (!LandscapeWatchLiveGestureOpt.INSTANCE.getEnable()) {
                this.LJLIL.pv0(ResetSilentTimerEvent.class);
            }
            if (o.LJ(this.LJLIL.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                Room room2 = (Room) this.LJLIL.kv0(RoomChannel.class);
                if (room2 != null) {
                    liveType = room2.getStreamType();
                } else {
                    liveType = LiveMode.VIDEO;
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_gift_click");
                LIZ2.LJIILLIIL(this.LJLIL);
                o.LJIIIIZZ(liveType, "liveType");
                LIZ2.LJIJJ(C28509BGv.LIZ(liveType), "live_type");
                LIZ2.LJJIIJZLJL();
            }
        }
    }

    public final void LJ(C32633CrN c32633CrN, int i) {
        C32609Cqz c32609Cqz = this.LJLILLLLZI;
        if (c32609Cqz != null) {
            c32609Cqz.postDelayed(RunnableC32594Cqk.LJLIL, 3000L);
        }
        LIZJ(c32633CrN);
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(GuideBubbleVisibilityChannel.class, Boolean.FALSE);
        }
        if (i != 1) {
            if (i != 3) {
                C32793Ctx.LIZ(EnumC32853Cuv.OTHER, EnumC32606Cqw.GIFT_GUIDE);
                return;
            } else {
                C32793Ctx.LIZ(EnumC32853Cuv.USER_CLOSE, EnumC32606Cqw.GIFT_GUIDE);
                return;
            }
        }
        C32793Ctx.LIZ(EnumC32853Cuv.TIME_UP, EnumC32606Cqw.GIFT_GUIDE);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C32609Cqz c32609Cqz = this.LJLILLLLZI;
        if (c32609Cqz != null) {
            C73411SrX c73411SrX = c32609Cqz.LJLZ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            c32609Cqz.LJLLILLLL = EnumC32618Cr8.DAILY;
            c32609Cqz.LJLLJ = null;
            C32638CrS c32638CrS = c32609Cqz.LJLJJLL;
            if (c32638CrS != null) {
                c32638CrS.LIZIZ = null;
                c32638CrS.LIZJ.LIZLLL();
            }
            c32609Cqz.LJLJLLL.LIZLLL();
            C32612Cr2 c32612Cr2 = c32609Cqz.LJLJL;
            c32612Cr2.LIZLLL = false;
            c32612Cr2.LIZ.LIZLLL();
            C32640CrU c32640CrU = c32609Cqz.LJLJLJ;
            c32640CrU.LIZ = null;
            c32640CrU.LIZJ = false;
            C15610jN.LIZ().removeCallbacks(new ARunnableS41S0100000_5(c32640CrU.LIZLLL, 302));
        }
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null) {
            dataChannel2.jv0(this);
        }
        this.LJLJJI.LIZLLL();
        this.LJZ = false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        boolean z;
        int i;
        long j;
        Room room;
        GiftIconInfo giftIconInfo;
        ActivityC45651qj activityC45651qj;
        V92 hierarchy;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLJI = new C32604Cqu();
        Boolean bool = (Boolean) dataChannel.kv0(BNK.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJJLL = z;
        if (!ToolBarRefactor.enable() && this.LJLJJLL) {
            C78949Uyf.LJIIIIZZ(interfaceC30237Btp);
        }
        Context context = interfaceC30237Btp.getContext();
        Room room2 = null;
        if (context != null) {
            C32609Cqz c32609Cqz = new C32609Cqz(context, dataChannel, this);
            this.LJLILLLLZI = c32609Cqz;
            if (c32609Cqz.LJLLL) {
                i = R.layout.d5r;
            } else {
                i = R.layout.d5q;
            }
            View LJIIIZ = C20910rv.LJIIIZ(i);
            if (LJIIIZ == null) {
                LJIIIZ = C29306Beo.LJIIIIZZ(i, c32609Cqz, false);
            }
            c32609Cqz.addView(LJIIIZ);
            c32609Cqz.setClipChildren(false);
            if (c32609Cqz.LJLLL) {
                ((TextView) c32609Cqz.findViewById(R.id.ldm)).setText(C15380j0.LJIILJJIL(R.string.mrd));
            } else {
                c32609Cqz.LJLILLLLZI = c32609Cqz.findViewById(R.id.dtc);
            }
            C47061t0 c47061t0 = (C47061t0) c32609Cqz.findViewById(R.id.dt9);
            c32609Cqz.LJLJJI = c47061t0;
            if (c47061t0 != null && (hierarchy = c47061t0.getHierarchy()) != null) {
                hierarchy.LJIILLIIL(0);
            }
            c32609Cqz.LJLJI = (ImageView) c32609Cqz.findViewById(R.id.dt_);
            if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
                ImageView imageView = c32609Cqz.LJLJI;
                if (imageView != null) {
                    imageView.post(new ARunnableS41S0100000_5(c32609Cqz, 318));
                }
                if (C32663Crr.LIZ(c32609Cqz) instanceof LifecycleOwner) {
                    activityC45651qj = C32663Crr.LIZ(c32609Cqz);
                    o.LJII(activityC45651qj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                } else {
                    activityC45651qj = null;
                }
                c32609Cqz.LJLL.ov0(activityC45651qj, CommentCompressOnSmallEvent.class, new AqS171S0100000_5(c32609Cqz, 835));
            }
            c32609Cqz.LJLJJL = c32609Cqz.findViewById(R.id.it1);
            Boolean LIZJ = InterfaceC30442Bx8.c.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_GIFT_COLOR_RED_POINT_SHOWN.value");
            if (LIZJ.booleanValue() && !InterfaceC30442Bx8.b.LIZJ().booleanValue()) {
                Long giftId = InterfaceC30442Bx8.d.LIZJ();
                View view = c32609Cqz.LJLJJL;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = c32609Cqz.LJLJJL;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                EnumC32608Cqy enumC32608Cqy = EnumC32608Cqy.COLOR_GIFT;
                EnumC32627CrH enumC32627CrH = EnumC32627CrH.DOT;
                o.LJIIIIZZ(giftId, "giftId");
                C32633CrN c32633CrN = new C32633CrN(enumC32608Cqy, enumC32627CrH, giftId.longValue());
                InterfaceC32642CrW interfaceC32642CrW = c32609Cqz.LJLIL;
                if (interfaceC32642CrW != null) {
                    interfaceC32642CrW.LIZIZ(c32633CrN);
                }
                C32000ChA.LIZIZ(giftId);
            }
            C32612Cr2 c32612Cr2 = c32609Cqz.LJLJL;
            c32612Cr2.LIZIZ = c32609Cqz.LJLL;
            c32612Cr2.LIZJ = c32609Cqz;
            C32640CrU c32640CrU = c32609Cqz.LJLJLJ;
            c32640CrU.getClass();
            c32640CrU.LIZ = c32609Cqz;
            C32638CrS c32638CrS = new C32638CrS(c32609Cqz.LJLL);
            c32609Cqz.LJLJJLL = c32638CrS;
            c32638CrS.LIZIZ = c32609Cqz;
            c32638CrS.LIZJ.LIZ(C73943T0h.LIZ().LJ(C32595Cql.class).LJJJJZI(new AfS57S0100000_5(c32638CrS, 319)));
            c32638CrS.LIZJ.LIZ(C73943T0h.LIZ().LJ(C32118Cj4.class).LJJJJZI(new AfS57S0100000_5(c32638CrS, 320)));
            c32638CrS.LIZJ.LIZ(C73943T0h.LIZ().LJ(C32647Crb.class).LJJJJZI(new AfS57S0100000_5(c32638CrS, 321)));
            Room room3 = (Room) c32638CrS.LIZ.kv0(RoomChannel.class);
            if (room3 != null) {
                j = room3.getId();
            } else {
                j = 0;
            }
            GiftsInfo giftIconInfo2 = GiftManager.inst().getGiftIconInfo(j);
            if (giftIconInfo2 != null && (giftIconInfo = giftIconInfo2.giftIconInfo) != null) {
                long j2 = 1000;
                if (giftIconInfo.mValidStartAt < System.currentTimeMillis() / j2 && giftIconInfo.mValidEndAt > System.currentTimeMillis() / j2) {
                    InterfaceC32639CrT interfaceC32639CrT = c32638CrS.LIZIZ;
                    if (interfaceC32639CrT != null) {
                        interfaceC32639CrT.LIZLLL(GiftManager.inst().getGiftIconInfo(j), true);
                    }
                    room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    if (room != null || !room.hasCommerceGoods) {
                        c32609Cqz.LJZ.add(new C32629CrJ(EnumC32626CrG.DAILY, null, 0L));
                        c32609Cqz.LJII();
                    }
                    interfaceC30237Btp.LJZI(this.LJLILLLLZI);
                }
            }
            InterfaceC32639CrT interfaceC32639CrT2 = c32638CrS.LIZIZ;
            if (interfaceC32639CrT2 != null) {
                interfaceC32639CrT2.LIZLLL(null, true);
            }
            room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
            }
            c32609Cqz.LJZ.add(new C32629CrJ(EnumC32626CrG.DAILY, null, 0L));
            c32609Cqz.LJII();
            interfaceC30237Btp.LJZI(this.LJLILLLLZI);
        }
        interfaceC30237Btp.LIZIZ();
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C15820ji.class).LJJJJZI(new AfS57S0100000_5(this.LJLLI, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 329)));
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C15920js.class).LJJJJZI(new AfS57S0100000_5(this.LJLLILLLL, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 329)));
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C15810jh.class).LJJJJZI(new AfS57S0100000_5(this.LJLLLLLL, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 329)));
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C15930jt.class).LJJJJZI(new AfS57S0100000_5(this.LJLLL, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 329)));
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C32623CrD.class).LJJJJZI(new AfS57S0100000_5(this.LJLZ, (InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe>) 329)));
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null) {
            dataChannel2.mv0(UserLevelEvent.class, this, this.LJLLJ);
        }
        if (!this.LJZ) {
            this.LJZ = true;
            DataChannel dataChannel3 = this.LJLIL;
            if (dataChannel3 != null) {
                room2 = (Room) dataChannel3.kv0(RoomChannel.class);
            }
            B76.LIZJ(room2, "gift");
        }
        C29306Beo.LJJ((Boolean) dataChannel.kv0(BCW.class));
    }
}
