package com.bytedance.android.livesdk.like.widget;

import X.B83;
import X.BCW;
import X.C05200Ii;
import X.C15380j0;
import X.C15490jB;
import X.C15510jD;
import X.C29374Bfu;
import X.C29462BhK;
import X.C29701Eo;
import X.C29927Bop;
import X.C29976Bpc;
import X.C29977Bpd;
import X.C2A4;
import X.C30000Bq0;
import X.C30001Bq1;
import X.C30004Bq4;
import X.C30005Bq5;
import X.C30016BqG;
import X.C31665Cbl;
import X.C5H3;
import X.C73969T1h;
import X.C78996UzQ;
import X.C7MY;
import X.CFX;
import X.CN1;
import X.CX6;
import X.CX7;
import X.CXC;
import X.InterfaceC29856Bng;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.InterfaceC29989Bpp;
import X.InterfaceC30008Bq8;
import X.InterfaceC64592gB;
import X.ORZ;
import X.T16;
import X.YKA;
import Y.AfS57S0100000_5;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAnimationOptimizationSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SelfLikeWidget extends LiveRecyclableWidget implements InterfaceC29986Bpm, InterfaceC29989Bpp {
    public static final int LJLLLLLL = C15380j0.LIZ(85.0f);
    public static final int LJLZ = C15380j0.LIZ(32.0f);
    public static final float LJZ = 134.0f;
    public static final float LJZI = 236.0f;
    public FrameLayout LJLIL;
    public CX6 LJLILLLLZI;
    public YKA LJLJI;
    public InterfaceC30008Bq8 LJLJJI;
    public C30000Bq0 LJLJJLL;
    public long LJLJL;
    public Room LJLJLJ;
    public IMessageManager LJLJLLL;
    public LikeHelper LJLL;
    public long LJLLILLLL;
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 241));
    public long LJLLI = 300;
    public float LJLLJ = LJZI;
    public float LJLLL = LJZ;
    public float LJLLLL = 55.0f;

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "SelfLikeWidget";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dck;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C30001Bq1 c30001Bq1 = (C30001Bq1) this.LJLJJL.getValue();
        CX6 cx6 = c30001Bq1.LIZJ.LJLILLLLZI;
        if (cx6 != null) {
            Iterator<CXC> it = cx6.LJLJI.iterator();
            while (it.hasNext()) {
                it.next().LJFF.cancel();
                it.remove();
            }
            Iterator<CX7> it2 = cx6.LJLJJI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL.cancel();
                it2.remove();
            }
            cx6.LJLIL = null;
            c30001Bq1.LIZ.clear();
            c30001Bq1.LIZIZ.clear();
            C30000Bq0 c30000Bq0 = this.LJLJJLL;
            if (c30000Bq0 != null) {
                YKA yka = c30000Bq0.LIZIZ.LJLJI;
                if (yka != null) {
                    yka.LIZ();
                } else {
                    o.LJIJI("bottomLikeView");
                    throw null;
                }
            }
            InterfaceC30008Bq8 interfaceC30008Bq8 = this.LJLJJI;
            if (interfaceC30008Bq8 != null) {
                interfaceC30008Bq8.LIZIZ();
            }
            InterfaceC30008Bq8 interfaceC30008Bq82 = this.LJLJJI;
            if (interfaceC30008Bq82 != null) {
                interfaceC30008Bq82.setVisibility(8);
            }
            LikeHelper likeHelper = this.LJLL;
            if (likeHelper != null && likeHelper.LLF && likeHelper.LL) {
                likeHelper.LJIILJJIL(this);
                likeHelper.LLIFFJFJJ = null;
                likeHelper.LLIILII = null;
            }
            this.LJLJJL.getValue().getClass();
            return;
        }
        o.LJIJI("tapView");
        throw null;
    }

    @Override // X.InterfaceC29989Bpp
    public final void LJJJJJL(Bitmap bitmap) {
        C30000Bq0 c30000Bq0;
        if (bitmap != null && !bitmap.isRecycled() && isViewValid() && (c30000Bq0 = this.LJLJJLL) != null) {
            c30000Bq0.LIZ(bitmap);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C30000Bq0 c30000Bq0;
        ImageModel avatarThumb;
        InterfaceC29856Bng interfaceC29856Bng;
        InterfaceC30008Bq8 c30005Bq5;
        View findViewById = findViewById(R.id.l12);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tap_container)");
        this.LJLIL = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.l18);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tap_view)");
        this.LJLILLLLZI = (CX6) findViewById2;
        View findViewById3 = findViewById(R.id.jn6);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.self_digg_view)");
        this.LJLJI = (YKA) findViewById3;
        View view = getView();
        if (view != null) {
            if (LiveAnimationOptimizationSetting.INSTANCE.getValue()) {
                c30005Bq5 = new C30016BqG(view);
            } else {
                c30005Bq5 = new C30005Bq5(view);
            }
            this.LJLJJI = c30005Bq5;
        }
        if (LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(this.dataChannel)) {
            c30000Bq0 = null;
        } else {
            c30000Bq0 = new C30000Bq0(this);
        }
        this.LJLJJLL = c30000Bq0;
        this.LJLJJL.getValue().getClass();
        C30000Bq0 c30000Bq02 = this.LJLJJLL;
        if (c30000Bq02 != null && (avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb()) != null && (interfaceC29856Bng = (InterfaceC29856Bng) C31665Cbl.LIZJ(avatarThumb).LJJIJL(C29976Bpc.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(c30000Bq02.LIZIZ))) != null) {
            interfaceC29856Bng.LIZJ(new AfS57S0100000_5(c30000Bq02, 134), new InterfaceC64592gB() { // from class: X.9DP
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        long j;
        IMessageManager iMessageManager;
        long j2;
        LikeHelper likeHelper;
        int LJFF;
        Boolean bool;
        Boolean bool2;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJLJ = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
            bool2.booleanValue();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(UserIsAnchorChannel.class)) != null) {
            bool.booleanValue();
        }
        C05200Ii.LIZIZ();
        Room room2 = this.LJLJLJ;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        this.LJLJL = j;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJLLL = iMessageManager;
        LikeHelper likeHelper2 = this.LJLL;
        if (likeHelper2 != null) {
            j2 = likeHelper2.LJLLI;
        } else {
            j2 = 300;
        }
        this.LJLLI = j2;
        this.LJLJJL.getValue().getClass();
        C30000Bq0 c30000Bq0 = this.LJLJJLL;
        if (c30000Bq0 != null) {
            ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIL().LJJIII(C29462BhK.LJLIL, false).LJJJ(T16.LIZ()).LJJIJL(C29977Bpd.LJLIL).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(c30000Bq0.LIZIZ))).LIZJ(new AfS57S0100000_5(c30000Bq0, 135), new InterfaceC64592gB() { // from class: X.9DQ
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        InterfaceC30008Bq8 interfaceC30008Bq8 = this.LJLJJI;
        if (interfaceC30008Bq8 != null) {
            interfaceC30008Bq8.setVisibility(8);
        }
        InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LJLJL);
        if (hq0 instanceof LikeHelper) {
            likeHelper = (LikeHelper) hq0;
        } else {
            likeHelper = null;
        }
        this.LJLL = likeHelper;
        if (likeHelper != null && likeHelper.LLF && likeHelper.LL) {
            likeHelper.LJ(this);
            CX6 cx6 = this.LJLILLLLZI;
            if (cx6 != null) {
                likeHelper.LLIFFJFJJ = cx6;
                likeHelper.LLIILII = this;
            } else {
                o.LJIJI("tapView");
                throw null;
            }
        }
        YKA yka = this.LJLJI;
        if (yka != null) {
            yka.LIZJ(true);
            YKA yka2 = this.LJLJI;
            if (yka2 != null) {
                ViewGroup.LayoutParams layoutParams = yka2.getLayoutParams();
                LikeHelper likeHelper3 = this.LJLL;
                if (likeHelper3 != null) {
                    LJFF = likeHelper3.LJJIIJ();
                } else {
                    LJFF = C15380j0.LJFF(R.dimen.a_d);
                }
                layoutParams.width = LJFF;
                YKA yka3 = this.LJLJI;
                if (yka3 != null) {
                    if (yka3.getLayoutParams().height > 0) {
                        YKA yka4 = this.LJLJI;
                        if (yka4 != null) {
                            ViewGroup.LayoutParams layoutParams2 = yka4.getLayoutParams();
                            float LIZIZ = C7MY.LIZIZ(272);
                            YKA yka5 = this.LJLJI;
                            if (yka5 != null) {
                                layoutParams2.height = (int) (yka5.getSelfLikeAnimationDistanceRatio() * LIZIZ);
                            } else {
                                o.LJIJI("bottomLikeView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("bottomLikeView");
                            throw null;
                        }
                    }
                    YKA yka6 = this.LJLJI;
                    if (yka6 != null) {
                        yka6.setLayoutParams(yka6.getLayoutParams());
                        float f = LJZI;
                        YKA yka7 = this.LJLJI;
                        if (yka7 != null) {
                            this.LJLLJ = yka7.getSelfLikeAnimationDistanceRatio() * f;
                            float f2 = LJZ;
                            YKA yka8 = this.LJLJI;
                            if (yka8 != null) {
                                this.LJLLL = yka8.getSelfLikeAnimationDistanceRatio() * f2;
                                YKA yka9 = this.LJLJI;
                                if (yka9 != null) {
                                    this.LJLLLL = yka9.getSelfLikeAnimationDistanceRatio() * 55.0f;
                                    CX6 cx62 = this.LJLILLLLZI;
                                    if (cx62 != null) {
                                        cx62.setDataChannel(this.dataChannel);
                                        return;
                                    } else {
                                        o.LJIJI("tapView");
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

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        if (!likeHelper.LJJ() && likeHelper.LLFF && i >= likeHelper.LJZI && LiveSelfLinkedLikeBehaviorSetting.INSTANCE.isSelfLikeLinkedBreathAnimatorEnable()) {
            InterfaceC30008Bq8 interfaceC30008Bq8 = this.LJLJJI;
            if (interfaceC30008Bq8 != null) {
                interfaceC30008Bq8.setVisibility(0);
            }
            InterfaceC30008Bq8 interfaceC30008Bq82 = this.LJLJJI;
            if (interfaceC30008Bq82 != null) {
                interfaceC30008Bq82.LIZ();
            }
        }
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        Bitmap LJIJJ;
        int i3;
        boolean z;
        C29701Eo c29701Eo;
        C2A4 c2a4;
        RoomAuthStatus roomAuthStatus;
        if (((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            Room room = this.LJLJLJ;
            if ((room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && !roomAuthStatus.enableDigg) || (LJIJJ = likeHelper.LJIJJ()) == null || LJIJJ.isRecycled()) {
                return;
            }
            C30000Bq0 c30000Bq0 = this.LJLJJLL;
            if (c30000Bq0 != null) {
                c30000Bq0.LIZ(LJIJJ);
            }
            C30001Bq1 c30001Bq1 = (C30001Bq1) this.LJLJJL.getValue();
            c30001Bq1.getClass();
            LikeHelper likeHelper2 = c30001Bq1.LIZJ.LJLL;
            if (likeHelper2 != null) {
                i3 = likeHelper2.LLILII;
                if (i3 < 0) {
                    i3 = C15380j0.LJFF(R.dimen.adw);
                    likeHelper2.LLILII = i3;
                }
            } else {
                i3 = 0;
            }
            LikeHelper likeHelper3 = c30001Bq1.LIZJ.LJLL;
            if (likeHelper3 != null && !likeHelper3.LIZLLL()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && LiveSelfLinkedLikeBehaviorSetting.INSTANCE.isSelfLikeLottieAnimationEnable()) {
                int[] iArr = new int[2];
                FrameLayout frameLayout = c30001Bq1.LIZJ.LJLIL;
                if (frameLayout != null) {
                    frameLayout.getLocationOnScreen(iArr);
                    int i4 = LJLLLLLL;
                    float f5 = i4 / 2;
                    PointF pointF = new PointF((f - iArr[0]) - f5, ((f2 - iArr[1]) - f5) - i3);
                    if (LiveAnimationOptimizationSetting.INSTANCE.getValue()) {
                        HashSet<C2A4> hashSet = c30001Bq1.LIZIZ;
                        if ((!hashSet.isEmpty()) && (c2a4 = (C2A4) ORZ.LJLLL(hashSet)) != null) {
                            c30001Bq1.LIZIZ.remove(c2a4);
                            c2a4.setVisibility(0);
                            c2a4.setX(pointF.x);
                            c2a4.setY(pointF.y);
                            c2a4.LLIIJLIL = new C30004Bq4(c2a4, c30001Bq1);
                        } else {
                            c2a4 = new C2A4(c30001Bq1.LIZJ.context);
                            c2a4.setVisibility(0);
                            c2a4.setX(pointF.x);
                            c2a4.setY(pointF.y);
                            c2a4.LLIIJLIL = new C30004Bq4(c2a4, c30001Bq1);
                            FrameLayout frameLayout2 = c30001Bq1.LIZJ.LJLIL;
                            if (frameLayout2 != null) {
                                frameLayout2.addView(c2a4, new FrameLayout.LayoutParams(i4, i4));
                                c2a4.LJIIIIZZ(C15510jD.LJIIIZ("tiktok_live_watch_resource_normal_1", "live_digg_own.webp"));
                                AnimatedDrawable2 animatedDrawable2 = c2a4.getAnimatedDrawable2();
                                if (animatedDrawable2 != null) {
                                    animatedDrawable2.LJLIL = 1;
                                    animatedDrawable2.LJLILLLLZI = true;
                                }
                            } else {
                                o.LJIJI("tapLottieContainer");
                                throw null;
                            }
                        }
                        c2a4.LJII();
                    } else {
                        HashSet<C29701Eo> hashSet2 = c30001Bq1.LIZ;
                        if ((!hashSet2.isEmpty()) && (c29701Eo = (C29701Eo) ORZ.LJLLL(hashSet2)) != null) {
                            c30001Bq1.LIZ.remove(c29701Eo);
                            c30001Bq1.LIZ(c29701Eo, pointF);
                        } else {
                            c29701Eo = new C29701Eo(c30001Bq1.LIZJ.context);
                            c30001Bq1.LIZ(c29701Eo, pointF);
                            FrameLayout frameLayout3 = c30001Bq1.LIZJ.LJLIL;
                            if (frameLayout3 != null) {
                                frameLayout3.addView(c29701Eo, new FrameLayout.LayoutParams(i4, i4));
                                C15490jB.LJIIIIZZ(c29701Eo, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "digg_tap_lottie.zip");
                            } else {
                                o.LJIJI("tapLottieContainer");
                                throw null;
                            }
                        }
                        c29701Eo.playAnimation();
                    }
                } else {
                    o.LJIJI("tapLottieContainer");
                    throw null;
                }
            }
            int[] iArr2 = new int[2];
            CX6 cx6 = c30001Bq1.LIZJ.LJLILLLLZI;
            if (cx6 != null) {
                cx6.getLocationOnScreen(iArr2);
                PointF pointF2 = new PointF(f - iArr2[0], (f2 - iArr2[1]) - i3);
                if (f3 <= 0.0f || f4 <= 0.0f) {
                    return;
                }
                PointF pointF3 = new PointF(f3, f4);
                CX6 cx62 = c30001Bq1.LIZJ.LJLILLLLZI;
                if (cx62 != null) {
                    cx62.LIZ(LJIJJ, pointF2, pointF3);
                    return;
                } else {
                    o.LJIJI("tapView");
                    throw null;
                }
            }
            o.LJIJI("tapView");
            throw null;
        }
    }
}
