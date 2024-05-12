package X;

import Y.ARunnableS32S0200000_13;
import android.graphics.Point;
import android.graphics.Rect;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimationStartEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicGiftSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicViewUsePoolSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS129S0300000_13;
import kotlin.jvm.internal.IDqS39S0300000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UDz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C76847UDz extends TBS implements InterfaceC88472Yns<C14500ha, C76800UCe> {
    public C76847UDz(Object obj) {
        super(1, obj, C76846UDy.class, "onGiftEvent", "onGiftEvent(Lcom/bytedance/android/live/linkmic/LiveLinkMicGiftAnimationEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C14500ha c14500ha) {
        int i;
        C2A4 LJII;
        int LJIIL;
        java.util.Map map;
        Integer num;
        C14500ha p0 = c14500ha;
        o.LJIIIZ(p0, "p0");
        C76846UDy c76846UDy = (C76846UDy) this.receiver;
        c76846UDy.getClass();
        if (!C76846UDy.LJFF(p0)) {
            c76846UDy.LIZLLL = C38995FSd.LIZLLL().submit(new ARunnableS32S0200000_13(p0, c76846UDy, 21));
        } else if (C76846UDy.LJFF(p0) && MultiGuestFlyMicGiftSwitcherSetting.INSTANCE.isEnable()) {
            if (!C76846UDy.LJFF(p0)) {
                C0NB.LIZIZ("GiftExpressionHelper", "now is not fly gift, so return");
            } else {
                C0NB.LIZIZ("GiftExpressionHelper", "receive fly_mic_gift msg");
                UE3 ue3 = p0.LIZ;
                long j = ue3.LJ;
                long j2 = ue3.LIZLLL;
                if (c76846UDy.LIZIZ.LJJIL().compareTo(EnumC75419Tip.StateJoined) < 0) {
                    C0NB.LIZIZ("GiftExpressionHelper", "current window state is invalid, so return");
                } else if (!o.LJ(C74947TbD.LJJIFFI(Long.valueOf(j)), c76846UDy.LIZIZ.LJJ())) {
                    C0NB.LIZIZ("GiftExpressionHelper", "current window not match the linkMicId, so return");
                } else {
                    UE3 ue32 = p0.LIZ;
                    if (ue32.LJIILIIL == 2) {
                        C33611Tp c33611Tp = new C33611Tp(ue32, new OSZ(new Point(0, 0), new Point(0, 0)), 1, 0L, 8);
                        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
                        C14480hY.LIZIZ(c33611Tp, 0, 0, 0, TV3.LJIIIIZZ(LJ));
                        C0NB.LIZIZ("GiftExpressionHelper", "now is downgrade 2, should do nothing, so return");
                    } else if (j2 == 0 || j == 0) {
                        C33611Tp c33611Tp2 = new C33611Tp(ue32, new OSZ(new Point(0, 0), new Point(0, 0)), 2, 0L, 8);
                        User LJ2 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                        o.LJIIIIZZ(LJ2, "getInstance().user().currentUserOpt");
                        C14480hY.LIZIZ(c33611Tp2, 1, 2, 2, TV3.LJIIIIZZ(LJ2));
                        C0NB.LIZIZ("GiftExpressionHelper", "senderUid or receiverUid is invalid, so return");
                    } else if (!C76846UDy.LJI()) {
                        C33611Tp c33611Tp3 = new C33611Tp(p0.LIZ, new OSZ(new Point(0, 0), new Point(0, 0)), 2, 0L, 8);
                        User LJ3 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                        o.LJIIIIZZ(LJ3, "getInstance().user().currentUserOpt");
                        C14480hY.LIZIZ(c33611Tp3, 5, 2, 2, TV3.LJIIIIZZ(LJ3));
                        C0NB.LIZIZ("GiftExpressionHelper", "layout condition is invalid, so return");
                    } else {
                        UE3 ue33 = p0.LIZ;
                        int i2 = ue33.LIZIZ;
                        if (i2 == 3) {
                            int i3 = ue33.LJIILIIL;
                            if (i3 == 0) {
                                long j3 = ue33.LJ;
                                int[] iArr = ue33.LIZJ.LJLIL;
                                Point point = new Point(iArr[0], iArr[1]);
                                Rect po0 = ((IInteractService) CN1.LIZ(IInteractService.class)).po0(j3);
                                Point point2 = new Point();
                                DataChannel dataChannel = c76846UDy.LIZJ;
                                if (dataChannel != null && (map = (java.util.Map) dataChannel.kv0(BDA.class)) != null && (num = (Integer) map.get(Long.valueOf(j3))) != null) {
                                    LJIIL = num.intValue();
                                } else {
                                    LJIIL = C74947TbD.LJIIL(c76846UDy.LIZIZ);
                                }
                                if (po0 != null) {
                                    float f = (LJIIL * 1.2f) / 2;
                                    point2.x = (int) (((po0.right + po0.left) / 2) - f);
                                    point2.y = (int) (((po0.top + po0.bottom) / 2) - f);
                                }
                                c76846UDy.LIZIZ.LJJIJIL().getLocationOnScreen(new int[2]);
                                OSZ osz = new OSZ(point, point2);
                                if (C76846UDy.LJ((Point) osz.getFirst()) || C76846UDy.LJ((Point) osz.getSecond())) {
                                    C33611Tp c33611Tp4 = new C33611Tp(p0.LIZ, osz, 2, 0L, 8);
                                    User LJ4 = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                                    o.LJIIIIZZ(LJ4, "getInstance().user().currentUserOpt");
                                    C14480hY.LIZIZ(c33611Tp4, 2, 2, 2, TV3.LJIIIIZZ(LJ4));
                                    C0NB.LIZIZ("GiftExpressionHelper", "current fly path is invalid, so return");
                                } else {
                                    DataChannelGlobal.LJLJJI.sv0(SmallFlyMicGiftAnimationStartEvent.class, new C33611Tp(p0.LIZ, osz, 0, System.currentTimeMillis(), 4));
                                }
                            } else if (i3 == 1) {
                                C15610jN.LIZ().postDelayed(new ARunnableS32S0200000_13(p0, c76846UDy, 20), 700L);
                            }
                        } else if (i2 == 4) {
                            OSZ osz2 = new OSZ(new Point(0, 0), new Point(0, 0));
                            if (p0.LIZ.LJIILIIL == 0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            C33611Tp c33611Tp5 = new C33611Tp(ue33, osz2, i, System.currentTimeMillis());
                            if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable()) {
                                if (c76846UDy.LJIIIZ == null) {
                                    c76846UDy.LJIIIZ = new C42951mN<>();
                                }
                                C42951mN<C2A4> c42951mN = c76846UDy.LJIIIZ;
                                if (c42951mN == null || (LJII = c42951mN.LIZIZ()) == null) {
                                    LJII = c76846UDy.LJII(p0);
                                }
                            } else {
                                LJII = c76846UDy.LJII(p0);
                            }
                            c76846UDy.LIZIZ.LJJIJIL().addView(LJII);
                            C14480hY.LIZ(LJII, c76846UDy.LIZ, p0.LIZ.LJIIJJI, new IDqS39S0300000_13(LJII, c33611Tp5, c76846UDy, 0), new AqS129S0300000_13(LJII, c33611Tp5, c76846UDy, 0));
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
