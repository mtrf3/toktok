package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFeedEffectPlayExpSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFeedEffectPlayFollowingTabSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFeedEffectPlayForYouTabSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFeedEffectPlayTimeoutSetting;
import com.bytedance.gift.render.model.Effect;
import java.util.Iterator;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y7d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86861Y7d implements InterfaceC15850jl {
    public C86863Y7f LIZIZ;
    public Long LIZJ;
    public C86789Y4j LJI;
    public InterfaceC65784Pro<C76800UCe> LJII;
    public InterfaceC65784Pro<C76800UCe> LJIIIIZZ;
    public EnumC86865Y7h LIZ = EnumC86865Y7h.INVALID;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C32393CnV.LJLIL);
    public final long LJ = LiveGiftFeedEffectPlayTimeoutSetting.INSTANCE.getTimeoutInSec();
    public final C73318Sq2 LJFF = new C73318Sq2();
    public final C86864Y7g LJIIIZ = new C86864Y7g(this);
    public final AqS197S0100000_15 LJIIJ = new AqS197S0100000_15(this, 63);
    public final AqS197S0100000_15 LJIIJJI = new AqS197S0100000_15(this, 62);

    @Override // X.InterfaceC15850jl
    public final void unInit() {
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getDisable()) {
            return;
        }
        LJFF();
        C86789Y4j c86789Y4j = this.LJI;
        if (c86789Y4j != null) {
            c86789Y4j.setCb(null);
        }
        this.LJI = null;
        this.LIZJ = null;
    }

    public final void LJFF() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doStop state:");
        LIZ.append(this.LIZ.name());
        C0NB.LIZIZ("GiftFeedEffectPlayViewManager", X1D.LIZIZ(LIZ));
        this.LJFF.LIZLLL();
        int ordinal = this.LIZ.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        C86789Y4j c86789Y4j = this.LJI;
                        if (c86789Y4j != null) {
                            C32257ClJ.LJIIIIZZ(new AqS165S0100000_15(c86789Y4j, 901));
                        }
                        this.LIZ = EnumC86865Y7h.IDLE;
                    }
                } else {
                    C86863Y7f c86863Y7f = this.LIZIZ;
                    if (c86863Y7f != null) {
                        Integer num = c86863Y7f.LJJI;
                        if (num != null) {
                            C76964UIm.LIZ(num.intValue(), c86863Y7f.LIZ, c86863Y7f.LIZIZ, c86863Y7f.LIZJ, c86863Y7f.LIZLLL, c86863Y7f.LJIJI);
                        }
                        c86863Y7f.LIZ();
                    }
                    this.LIZ = EnumC86865Y7h.IDLE;
                }
            } else {
                C86863Y7f c86863Y7f2 = this.LIZIZ;
                if (c86863Y7f2 != null) {
                    Integer num2 = c86863Y7f2.LJJ;
                    if (num2 != null) {
                        C76964UIm.LIZIZ(num2.intValue(), c86863Y7f2.LIZ, c86863Y7f2.LIZIZ, c86863Y7f2.LIZJ, c86863Y7f2.LIZLLL, c86863Y7f2.LJIIZILJ);
                    }
                    c86863Y7f2.LIZ();
                }
                this.LIZ = EnumC86865Y7h.IDLE;
            }
        } else {
            C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "doStop on invalid or idle state");
        }
        this.LIZIZ = null;
    }

    public final void LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("proceed:");
        LIZ.append(this.LIZ.name());
        C0NB.LIZIZ("GiftFeedEffectPlayViewManager", X1D.LIZIZ(LIZ));
        C86863Y7f c86863Y7f = this.LIZIZ;
        if (c86863Y7f == null) {
            return;
        }
        int ordinal = this.LIZ.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return;
                    }
                    this.LJFF.LIZLLL();
                    String localAssetsPath = c86863Y7f.LJIILJJIL;
                    if (localAssetsPath == null || localAssetsPath.length() == 0) {
                        C0NB.LJ("GiftFeedEffectPlayViewManager", "proceed play no res");
                        this.LIZ = EnumC86865Y7h.IDLE;
                        return;
                    }
                    C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "proceed play");
                    C86789Y4j c86789Y4j = this.LJI;
                    if (c86789Y4j == null) {
                        return;
                    }
                    int i = c86863Y7f.LJ;
                    o.LJIIIZ(localAssetsPath, "localAssetsPath");
                    C32257ClJ.LJIIIIZZ(new C86791Y4l(c86789Y4j, i, localAssetsPath));
                    return;
                }
                AssetsModel assetsModel = c86863Y7f.LJI;
                if (assetsModel == null) {
                    C0NB.LJ("GiftFeedEffectPlayViewManager", "proceed download asset no model");
                    LJFF();
                    return;
                }
                if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getFull() || c86863Y7f.LJIIJ) {
                    C32435CoB c32435CoB = new C32435CoB();
                    Effect effect = c32435CoB.LIZ;
                    effect.giftId = -1L;
                    effect.LIZIZ = 2;
                    c32435CoB.LIZ(assetsModel);
                    c32435CoB.LIZ.LIZJ = false;
                    Effect LIZIZ = c32435CoB.LIZIZ();
                    C32438CoE c32438CoE = new C32438CoE();
                    c32438CoE.LIZJ = LIZIZ;
                    c32438CoE.LJ = 16;
                    c32438CoE.LIZ = 0;
                    C32449CoP LIZ2 = c32438CoE.LIZ();
                    if (LIZ2 == null) {
                        return;
                    }
                    C32442CoI c32442CoI = new C32442CoI(LIZ2);
                    c86863Y7f.LJII = c32442CoI;
                    String result = c32442CoI.getResult();
                    if (c32442CoI.LIZIZ() && C96Q.LIZ(result)) {
                        C279017q.LJ("proceed asset already downloaded:", result, "GiftFeedEffectPlayViewManager");
                        c86863Y7f.LJIILJJIL = result;
                        c86863Y7f.LJIIIZ = true;
                        this.LIZ = EnumC86865Y7h.PLAYING;
                        LJII();
                        return;
                    }
                    VY5 vy5 = new VY5(this.LJIIJJI);
                    c86863Y7f.LJIIIIZZ = vy5;
                    c86863Y7f.LJIJI = System.currentTimeMillis();
                    c32442CoI.LIZ(vy5.LIZIZ, vy5.LIZJ);
                    return;
                }
                this.LIZLLL.getValue().getClass();
                C32420Cnw LJIIIIZZ = AbstractC32375CnD.LJIIIIZZ(assetsModel, 16);
                c86863Y7f.LJIIJJI = LJIIIIZZ;
                String LIZIZ2 = PU0.LJI().LIZIZ.LIZ.LIZIZ(LJIIIIZZ);
                if (PU0.LJI().LJII(LJIIIIZZ) && C96Q.LIZ(LIZIZ2)) {
                    C279017q.LJ("proceed asset already downloaded:", LIZIZ2, "GiftFeedEffectPlayViewManager");
                    c86863Y7f.LJIILIIL = true;
                    c86863Y7f.LJIILJJIL = LIZIZ2;
                    this.LIZ = EnumC86865Y7h.PLAYING;
                    LJII();
                    return;
                }
                C86867Y7j c86867Y7j = new C86867Y7j(this.LJIIJJI);
                c86863Y7f.LJIIL = c86867Y7j;
                c86863Y7f.LJIJJ = System.currentTimeMillis();
                C32366Cn4.LIZIZ(assetsModel.id, c86867Y7j, 16, C113554cx.LJJJLIIL(), LJIIIIZZ);
                return;
            }
            AssetsModel LIZIZ3 = C32341Cmf.LIZIZ(c86863Y7f.LIZLLL);
            if (LIZIZ3 == null) {
                C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "proceed download model");
                C86866Y7i c86866Y7i = new C86866Y7i(this.LJIIJ);
                c86863Y7f.LJFF = c86866Y7i;
                System.currentTimeMillis();
                C32341Cmf.LJFF(16, c86863Y7f.LIZ, C47261Igj.LJII(Long.valueOf(c86863Y7f.LIZLLL)), c86866Y7i);
                return;
            }
            C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "proceed model already downloaded");
            c86863Y7f.LJI = LIZIZ3;
            c86863Y7f.LJIJ = System.currentTimeMillis();
            this.LIZ = EnumC86865Y7h.DOWNLOAD_ASSERT;
            LJII();
            return;
        }
        C0NB.LJ("GiftFeedEffectPlayViewManager", "proceed with error state");
    }

    @Override // X.InterfaceC15850jl
    public final void LIZ(AqS165S0100000_15 cb) {
        o.LJIIIZ(cb, "cb");
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getDisable()) {
            return;
        }
        this.LJIIIIZZ = cb;
    }

    @Override // X.InterfaceC15850jl
    public final void LIZIZ(AqS165S0100000_15 cb) {
        o.LJIIIZ(cb, "cb");
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getDisable()) {
            return;
        }
        this.LJII = cb;
    }

    @Override // X.InterfaceC15850jl
    public final void LIZJ(int i) {
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getDisable()) {
            return;
        }
        C86863Y7f c86863Y7f = this.LIZIZ;
        if (c86863Y7f != null) {
            c86863Y7f.LJJIFFI = Integer.valueOf(i);
        }
        LJFF();
    }

    @Override // X.InterfaceC15850jl
    public final void LJ(FrameLayout frameLayout) {
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getDisable()) {
            return;
        }
        C32221Ckj.LIZIZ();
        if (this.LIZ != EnumC86865Y7h.INVALID) {
            C0NB.LJ("GiftFeedEffectPlayViewManager", "init not in Invalid state, return");
            return;
        }
        Iterator<View> it = C78924UyG.LIZLLL(frameLayout).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (!iDObjectS0S0101000.hasNext()) {
                break;
            }
            View view = (View) iDObjectS0S0101000.next();
            if (view instanceof C86789Y4j) {
                C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "init view reuse");
                this.LJI = (C86789Y4j) view;
            }
        }
        if (this.LJI == null) {
            Context context = frameLayout.getContext();
            o.LJIIIIZZ(context, "container.context");
            C86789Y4j c86789Y4j = new C86789Y4j(context);
            this.LJI = c86789Y4j;
            frameLayout.addView(c86789Y4j, -1, -1);
        }
        C86789Y4j c86789Y4j2 = this.LJI;
        if (c86789Y4j2 != null) {
            c86789Y4j2.setCb(this.LJIIIZ);
        }
        this.LIZ = EnumC86865Y7h.IDLE;
    }

    public static void LJI(C86863Y7f c86863Y7f, int i) {
        int i2;
        long j = c86863Y7f.LIZ;
        long j2 = c86863Y7f.LIZIZ;
        long j3 = c86863Y7f.LIZJ;
        long j4 = c86863Y7f.LIZLLL;
        boolean z = c86863Y7f.LJIIIZ;
        boolean z2 = c86863Y7f.LJIILIIL;
        long j5 = c86863Y7f.LJIILL;
        long j6 = c86863Y7f.LJIIZILJ;
        long j7 = c86863Y7f.LJIILLIIL;
        long j8 = c86863Y7f.LJIJ;
        long j9 = c86863Y7f.LJIL;
        long j10 = c86863Y7f.LJIJJLI - j5;
        long j11 = 0;
        if (j10 < 0) {
            j10 = 0;
        }
        long j12 = j7 - j5;
        if (j12 < 0) {
            j12 = 0;
        }
        long j13 = j8 - j6;
        if (j13 < 0) {
            j13 = 0;
        }
        long j14 = j9 - j8;
        if (j14 >= 0) {
            j11 = j14;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_preview_live_gift_effect_play_status");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(String.valueOf(j), "room_id");
        LIZ.LJIJJ(String.valueOf(j2), "anchor_id");
        LIZ.LJIJJ(String.valueOf(j3), "user_id");
        LIZ.LJIJJ(String.valueOf(j4), "effect_id");
        if (z || z2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        LIZ.LJIJJ(Integer.valueOf(i2), "is_cache_hit");
        LIZ.LJIJJ(Long.valueOf(j11), "effect_play_latency");
        LIZ.LJIJJ(Long.valueOf(j13), "effect_api_latency");
        LIZ.LJIJJ(Long.valueOf(j12), "stream_latency");
        LIZ.LJIJJ(Long.valueOf(j10), "end_to_end_latency");
        LIZ.LJIJJ(Integer.valueOf(i), "status_code");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC15850jl
    public final void LIZLLL(long j, long j2, long j3, String str, String sei) {
        o.LJIIIZ(sei, "sei");
        if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getDisable()) {
            return;
        }
        if (o.LJ(str, "homepage_follow") && !LiveGiftFeedEffectPlayFollowingTabSetting.INSTANCE.getEnable()) {
            return;
        }
        if (o.LJ(str, "homepage_hot") && !LiveGiftFeedEffectPlayForYouTabSetting.INSTANCE.getEnable()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeiString trigger play ");
        LIZ.append(this.LIZ);
        LIZ.append(' ');
        LIZ.append(str);
        LIZ.append("  sei:");
        C31811Ce7.LJ(LIZ, sei, LIZ, "GiftFeedEffectPlayViewManager");
        if (j > 0) {
            C39202Fa2.LIZJ().submit(new RunnableC32271ClX(sei, this, j, j2, j3));
        }
    }
}
