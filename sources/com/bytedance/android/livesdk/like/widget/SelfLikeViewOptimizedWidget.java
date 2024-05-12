package com.bytedance.android.livesdk.like.widget;

import X.B83;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C1UB;
import X.C29374Bfu;
import X.C29461BhJ;
import X.C29701Eo;
import X.C29970BpW;
import X.C29971BpX;
import X.C29997Bpx;
import X.C29999Bpz;
import X.C30002Bq2;
import X.C30003Bq3;
import X.C31665Cbl;
import X.C5H3;
import X.C68322mC;
import X.C73969T1h;
import X.C78996UzQ;
import X.CFX;
import X.CN1;
import X.InterfaceC29856Bng;
import X.InterfaceC29980Bpg;
import X.InterfaceC29986Bpm;
import X.InterfaceC29989Bpp;
import X.InterfaceC64592gB;
import X.T16;
import X.YK3;
import Y.ALAdapterS4S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.AfS57S0100000_5;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SelfLikeViewOptimizedWidget extends LiveRecyclableWidget implements InterfaceC29986Bpm, InterfaceC29989Bpp {
    public FrameLayout LJLIL;
    public C30003Bq3 LJLILLLLZI;
    public YK3 LJLJI;
    public C29701Eo LJLJJI;
    public C29997Bpx LJLJJLL;
    public long LJLJL;
    public Room LJLJLJ;
    public LikeHelper LJLLI;
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 240));
    public final C1UB<C29701Eo> LJLJLLL = new C1UB<>(5);
    public final LinkedList<C29701Eo> LJLL = new LinkedList<>();

    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "SelfLikeViewOptimizedWidget";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dcl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        LikeHelper likeHelper;
        C30003Bq3 c30003Bq3 = ((C29999Bpz) this.LJLJJL.getValue()).LIZ.LJLILLLLZI;
        if (c30003Bq3 != null) {
            Iterator<C30002Bq2> it = c30003Bq3.LJLJI.iterator();
            while (it.hasNext()) {
                C30002Bq2 next = it.next();
                o.LJIIIIZZ(next, "next()");
                C30002Bq2 c30002Bq2 = next;
                it.remove();
                c30003Bq3.LJLILLLLZI.LIZ(c30002Bq2);
                ImageView imageView = c30002Bq2.LIZ;
                if (C78996UzQ.LJJIIJZLJL(imageView)) {
                    C78996UzQ.LJI();
                }
                c30003Bq3.removeView(imageView);
                c30002Bq2.LJFF.cancel();
            }
            c30003Bq3.LJLIL = null;
            C29997Bpx c29997Bpx = this.LJLJJLL;
            if (c29997Bpx != null) {
                YK3 yk3 = c29997Bpx.LIZIZ.LJLJI;
                if (yk3 != null) {
                    yk3.LIZIZ();
                    Bitmap bitmap = c29997Bpx.LIZ;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                } else {
                    o.LJIJI("bottomLikeOptimizedView");
                    throw null;
                }
            }
            C29701Eo c29701Eo = this.LJLJJI;
            if (c29701Eo != null) {
                c29701Eo.cancelAnimation();
                C29701Eo c29701Eo2 = this.LJLJJI;
                if (c29701Eo2 != null) {
                    c29701Eo2.setVisibility(8);
                    InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LJLJL);
                    if ((hq0 instanceof LikeHelper) && (likeHelper = (LikeHelper) hq0) != null && likeHelper.LLF && likeHelper.LL) {
                        likeHelper.LJIILJJIL(this);
                        likeHelper.LLIFFJFJJ = null;
                        likeHelper.LLIILII = null;
                    }
                    Iterator<C29701Eo> it2 = this.LJLL.iterator();
                    while (it2.hasNext()) {
                        C29701Eo next2 = it2.next();
                        o.LJIIIIZZ(next2, "next()");
                        C29701Eo c29701Eo3 = next2;
                        it2.remove();
                        c29701Eo3.setVisibility(8);
                        if (!this.LJLJLLL.LIZ(c29701Eo3)) {
                            FrameLayout frameLayout = this.LJLIL;
                            if (frameLayout != null) {
                                C16880lQ.LJLLLL(c29701Eo3, frameLayout);
                            } else {
                                o.LJIJI("tapLottieContainer");
                                throw null;
                            }
                        }
                        c29701Eo3.cancelAnimation();
                    }
                    this.LJLJJL.getValue().getClass();
                    return;
                }
                o.LJIJI("flowerAnimation");
                throw null;
            }
            o.LJIJI("flowerAnimation");
            throw null;
        }
        o.LJIJI("optimizedTapView");
        throw null;
    }

    @Override // X.InterfaceC29989Bpp
    public final void LJJJJJL(Bitmap bitmap) {
        C29997Bpx c29997Bpx;
        if (bitmap != null && !bitmap.isRecycled() && isViewValid() && (c29997Bpx = this.LJLJJLL) != null) {
            c29997Bpx.LIZ(bitmap);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C29997Bpx c29997Bpx;
        InterfaceC29856Bng interfaceC29856Bng;
        View findViewById = findViewById(R.id.l12);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tap_container)");
        this.LJLIL = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.l18);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tap_view)");
        this.LJLILLLLZI = (C30003Bq3) findViewById2;
        View findViewById3 = findViewById(R.id.jn6);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.self_digg_view)");
        this.LJLJI = (YK3) findViewById3;
        View findViewById4 = findViewById(R.id.dj9);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.flowers_lottie)");
        this.LJLJJI = (C29701Eo) findViewById4;
        LiveLikeDegradeSettings liveLikeDegradeSettings = LiveLikeDegradeSettings.INSTANCE;
        if (!liveLikeDegradeSettings.disableEasterEggs(this.dataChannel)) {
            C29701Eo c29701Eo = this.LJLJJI;
            if (c29701Eo != null) {
                c29701Eo.addAnimatorListener(new ALAdapterS4S0100000_5(this, 32));
            } else {
                o.LJIJI("flowerAnimation");
                throw null;
            }
        }
        if (liveLikeDegradeSettings.disableAvatarAnim(this.dataChannel)) {
            c29997Bpx = null;
        } else {
            c29997Bpx = new C29997Bpx(this);
        }
        this.LJLJJLL = c29997Bpx;
        this.LJLJJL.getValue().getClass();
        C29997Bpx c29997Bpx2 = this.LJLJJLL;
        if (c29997Bpx2 != null) {
            YK3 yk3 = c29997Bpx2.LIZIZ.LJLJI;
            if (yk3 != null) {
                yk3.setAvatar(c29997Bpx2.LIZ);
                ImageModel avatarThumb = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb();
                if (avatarThumb != null && (interfaceC29856Bng = (InterfaceC29856Bng) C31665Cbl.LIZJ(avatarThumb).LJJIJL(C29970BpW.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(c29997Bpx2.LIZIZ))) != null) {
                    interfaceC29856Bng.LIZJ(new AfS57S0100000_5(c29997Bpx2.LIZIZ, 132), new InterfaceC64592gB() { // from class: X.9DN
                        @Override // X.InterfaceC64592gB
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        }
                    });
                    return;
                }
                return;
            }
            o.LJIJI("bottomLikeOptimizedView");
            throw null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        long j;
        LikeHelper likeHelper;
        int LJFF;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJLJ = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            bool.booleanValue();
        }
        Room room2 = this.LJLJLJ;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        this.LJLJL = j;
        this.LJLJJL.getValue().getClass();
        C29997Bpx c29997Bpx = this.LJLJJLL;
        if (c29997Bpx != null) {
            ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIL().LJJIII(C29461BhJ.LJLIL, false).LJJJ(T16.LIZ()).LJJIJL(C29971BpX.LJLIL).LJJJ(C73969T1h.LIZIZ()).LIZJ(WidgetExtendsKt.autoDispose(c29997Bpx.LIZIZ))).LIZJ(new AfS57S0100000_5(c29997Bpx.LIZIZ, 133), new InterfaceC64592gB() { // from class: X.9DO
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        C29701Eo c29701Eo = this.LJLJJI;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
            InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(this.LJLJL);
            if (hq0 instanceof LikeHelper) {
                likeHelper = (LikeHelper) hq0;
            } else {
                likeHelper = null;
            }
            this.LJLLI = likeHelper;
            if (likeHelper != null && likeHelper.LLF && likeHelper.LL) {
                likeHelper.LJ(this);
                C30003Bq3 c30003Bq3 = this.LJLILLLLZI;
                if (c30003Bq3 != null) {
                    likeHelper.LLIFFJFJJ = c30003Bq3;
                    likeHelper.LLIILII = this;
                } else {
                    o.LJIJI("optimizedTapView");
                    throw null;
                }
            }
            YK3 yk3 = this.LJLJI;
            if (yk3 != null) {
                ViewGroup.LayoutParams layoutParams = yk3.getLayoutParams();
                LikeHelper likeHelper2 = this.LJLLI;
                if (likeHelper2 != null) {
                    LJFF = likeHelper2.LJJIIJ();
                } else {
                    LJFF = C15380j0.LJFF(R.dimen.a_d);
                }
                layoutParams.width = LJFF;
                YK3 yk32 = this.LJLJI;
                if (yk32 != null) {
                    yk32.setLayoutParams(yk32.getLayoutParams());
                    C30003Bq3 c30003Bq32 = this.LJLILLLLZI;
                    if (c30003Bq32 != null) {
                        c30003Bq32.setDataChannel(this.dataChannel);
                        return;
                    } else {
                        o.LJIJI("optimizedTapView");
                        throw null;
                    }
                }
                o.LJIJI("bottomLikeOptimizedView");
                throw null;
            }
            o.LJIJI("bottomLikeOptimizedView");
            throw null;
        }
        o.LJIJI("flowerAnimation");
        throw null;
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        if (!likeHelper.LJJ() && likeHelper.LLFF && i >= likeHelper.LJZI) {
            C29701Eo c29701Eo = this.LJLJJI;
            if (c29701Eo != null) {
                if (!c29701Eo.isAnimating()) {
                    C29701Eo c29701Eo2 = this.LJLJJI;
                    if (c29701Eo2 != null) {
                        c29701Eo2.setVisibility(0);
                        C29701Eo c29701Eo3 = this.LJLJJI;
                        if (c29701Eo3 != null) {
                            C15490jB.LJIIJ(c29701Eo3, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "flowers_lottie.zip", true);
                            return;
                        } else {
                            o.LJIJI("flowerAnimation");
                            throw null;
                        }
                    }
                    o.LJIJI("flowerAnimation");
                    throw null;
                }
                return;
            }
            o.LJIJI("flowerAnimation");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, X.1Eo] */
    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        Bitmap LJIJJ;
        int i3;
        RoomAuthStatus roomAuthStatus;
        if (((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            Room room = this.LJLJLJ;
            if ((room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && !roomAuthStatus.enableDigg) || (LJIJJ = likeHelper.LJIJJ()) == null) {
                return;
            }
            C29997Bpx c29997Bpx = this.LJLJJLL;
            if (c29997Bpx != null) {
                c29997Bpx.LIZ(LJIJJ);
            }
            C29999Bpz c29999Bpz = (C29999Bpz) this.LJLJJL.getValue();
            c29999Bpz.getClass();
            LikeHelper likeHelper2 = c29999Bpz.LIZ.LJLLI;
            if (likeHelper2 != null) {
                i3 = likeHelper2.LLILII;
                if (i3 < 0) {
                    i3 = C15380j0.LJFF(R.dimen.adw);
                    likeHelper2.LLILII = i3;
                }
            } else {
                i3 = 0;
            }
            if (likeHelper.LIZLLL()) {
                float f5 = f2 - i3;
                C68322mC c68322mC = new C68322mC();
                ?? LIZIZ = c29999Bpz.LIZ.LJLJLLL.LIZIZ();
                c68322mC.element = LIZIZ;
                if (LIZIZ == 0) {
                    ?? c29701Eo = new C29701Eo(c29999Bpz.LIZ.context);
                    c68322mC.element = c29701Eo;
                    C15490jB.LJIIIIZZ(c29701Eo, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "digg_tap_lottie.zip");
                    FrameLayout frameLayout = c29999Bpz.LIZ.LJLIL;
                    if (frameLayout != null) {
                        View view = (View) c68322mC.element;
                        int i4 = OptimizedLikeHelper.LLILLL;
                        frameLayout.addView(view, i4, i4);
                        ((C29701Eo) c68322mC.element).addAnimatorListener(new ALAdapterS4S0200000_5(c68322mC, c29999Bpz.LIZ, 10));
                    } else {
                        o.LJIJI("tapLottieContainer");
                        throw null;
                    }
                }
                c29999Bpz.LIZ.LJLL.add(c68322mC.element);
                ((ImageView) c68322mC.element).setVisibility(0);
                View view2 = (View) c68322mC.element;
                float f6 = OptimizedLikeHelper.LLILLL / 2;
                view2.setX(f - f6);
                ((View) c68322mC.element).setY(f5 - f6);
                ((C29701Eo) c68322mC.element).playAnimation();
            }
            if (f3 <= 0.0f || f4 <= 0.0f) {
                return;
            }
            C30003Bq3 c30003Bq3 = c29999Bpz.LIZ.LJLILLLLZI;
            if (c30003Bq3 != null) {
                float f7 = f2 - i3;
                C30002Bq2 LIZIZ2 = c30003Bq3.LJLILLLLZI.LIZIZ();
                if (LIZIZ2 == null) {
                    LIZIZ2 = new C30002Bq2(c30003Bq3);
                } else {
                    ImageView imageView = LIZIZ2.LIZ;
                    if (C78996UzQ.LJJIIJZLJL(imageView)) {
                        C78996UzQ.LJI();
                    }
                    c30003Bq3.removeView(imageView);
                }
                ImageView imageView2 = LIZIZ2.LIZ;
                int i5 = C30003Bq3.LJLJJI;
                c30003Bq3.addView(imageView2, i5, i5);
                LIZIZ2.LIZ.setImageBitmap(LJIJJ);
                LIZIZ2.LIZ.setAlpha(1.0f);
                float f8 = i5 / 2;
                LIZIZ2.LIZ.setX(f - f8);
                LIZIZ2.LIZ.setY(f7 - f8);
                LIZIZ2.LIZIZ.LIZ = f3;
                LIZIZ2.LIZJ.LIZ = f7;
                LIZIZ2.LIZLLL.setObjectValues(Float.valueOf(LIZIZ2.LIZ.getX()), Float.valueOf(f3 - f8));
                LIZIZ2.LJ.setObjectValues(Float.valueOf(LIZIZ2.LIZ.getY()), Float.valueOf(f4 - f8));
                LIZIZ2.LJI.LJLJI.add(LIZIZ2);
                LIZIZ2.LJFF.start();
                return;
            }
            o.LJIJI("optimizedTapView");
            throw null;
        }
    }
}
