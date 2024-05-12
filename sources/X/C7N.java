package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.decoration.IDecorationService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.message.IMessageService;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C7N {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C30826C7y.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C30821C7t.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C8A.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C30820C7s.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C30819C7r.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C30823C7v.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C30822C7u.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C30824C7w.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C7Z.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C7Q.LJLIL);
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(BAQ.LJLIL);
    public static final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C30804C7c.LJLIL);
    public static final C62822Ol8 LJIIL = C221108m2.LIZIZ(C7P.LJLIL);
    public static final C62822Ol8 LJIILIIL = C221108m2.LIZIZ(C7X.LJLIL);
    public static final C62822Ol8 LJIILJJIL = C221108m2.LIZIZ(C30813C7l.LJLIL);
    public static final C62822Ol8 LJIILL = C221108m2.LIZIZ(C30815C7n.LJLIL);
    public static final C62822Ol8 LJIILLIIL = C221108m2.LIZIZ(C7R.LJLIL);
    public static final C62822Ol8 LJIIZILJ = C221108m2.LIZIZ(C30809C7h.LJLIL);
    public static final C62822Ol8 LJIJ = C221108m2.LIZIZ(C30805C7d.LJLIL);
    public static final C62822Ol8 LJIJI = C221108m2.LIZIZ(C80.LJLIL);
    public static final C62822Ol8 LJIJJ = C221108m2.LIZIZ(C30808C7g.LJLIL);
    public static final C62822Ol8 LJIJJLI = C221108m2.LIZIZ(C7S.LJLIL);
    public static final C62822Ol8 LJIL = C221108m2.LIZIZ(C7W.LJLIL);
    public static final C62822Ol8 LJJ = C221108m2.LIZIZ(C30817C7p.LJLIL);
    public static final C62822Ol8 LJJI = C221108m2.LIZIZ(C7U.LJLIL);
    public static final C62822Ol8 LJJIFFI = C221108m2.LIZIZ(C7V.LJLIL);
    public static final C62822Ol8 LJJII = C221108m2.LIZIZ(C7T.LJLIL);
    public static final C62822Ol8 LJJIII = C221108m2.LIZIZ(C7Y.LJLIL);
    public static final C62822Ol8 LJJIIJ = C221108m2.LIZIZ(C30816C7o.LJLIL);
    public static final C62822Ol8 LJJIIJZLJL = C221108m2.LIZIZ(C30812C7k.LJLIL);
    public static final C62822Ol8 LJJIIZ = C221108m2.LIZIZ(C30818C7q.LJLIL);
    public static final C62822Ol8 LJJIIZI = C221108m2.LIZIZ(C30814C7m.LJLIL);
    public static final C62822Ol8 LJJIJ = C221108m2.LIZIZ(C30827C7z.LJLIL);
    public static final C62822Ol8 LJJIJIIJI = C221108m2.LIZIZ(C7O.LJLIL);
    public static final C62822Ol8 LJJIJIIJIL = C221108m2.LIZIZ(C30803C7b.LJLIL);
    public static final C62822Ol8 LJJIJIL = C221108m2.LIZIZ(C30802C7a.LJLIL);
    public static final C62822Ol8 LJJIJL = C221108m2.LIZIZ(C30806C7e.LJLIL);
    public static final C62822Ol8 LJJIJLIJ = C221108m2.LIZIZ(C30807C7f.LJLIL);
    public static final C62822Ol8 LJJIL;
    public static final C62822Ol8 LJJIZ;

    static {
        C221108m2.LIZIZ(C30811C7j.LJLIL);
        LJJIL = C221108m2.LIZIZ(C30825C7x.LJLIL);
        LJJIZ = C221108m2.LIZIZ(C30810C7i.LJLIL);
    }

    public static final IActionHandlerService LIZ() {
        Object value = LJIIL.getValue();
        o.LJIIIIZZ(value, "<get-actionHandlerService>(...)");
        return (IActionHandlerService) value;
    }

    public static final IAdminSettingService LIZIZ() {
        Object value = LJIILLIIL.getValue();
        o.LJIIIIZZ(value, "<get-adminSettingService>(...)");
        return (IAdminSettingService) value;
    }

    public static final IBannerService LIZJ() {
        Object value = LJJII.getValue();
        o.LJIIIIZZ(value, "<get-bannerService>(...)");
        return (IBannerService) value;
    }

    public static final IBarrageService LIZLLL() {
        Object value = LJJIFFI.getValue();
        o.LJIIIIZZ(value, "<get-barrageService>(...)");
        return (IBarrageService) value;
    }

    public static final IBroadcastService LJ() {
        Object value = LJIILIIL.getValue();
        o.LJIIIIZZ(value, "<get-broadcastService>(...)");
        return (IBroadcastService) value;
    }

    public static final IBrowserService LJFF() {
        Object value = LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-browserService>(...)");
        return (IBrowserService) value;
    }

    public static final IDecorationService LJI() {
        Object value = LJIJ.getValue();
        o.LJIIIIZZ(value, "<get-decorationService>(...)");
        return (IDecorationService) value;
    }

    public static final IEffectService LJII() {
        Object value = LJIIZILJ.getValue();
        o.LJIIIIZZ(value, "<get-effectService>(...)");
        return (IEffectService) value;
    }

    public static final IGiftService LJIIIIZZ() {
        Object value = LJIILJJIL.getValue();
        o.LJIIIIZZ(value, "<get-giftService>(...)");
        return (IGiftService) value;
    }

    public static final IGoodyBagService LJIIIZ() {
        Object value = LJIILL.getValue();
        o.LJIIIIZZ(value, "<get-goodyBagService>(...)");
        return (IGoodyBagService) value;
    }

    public static final IHashTagService LJIIJ() {
        Object value = LJJ.getValue();
        o.LJIIIIZZ(value, "<get-hashTagService>(...)");
        return (IHashTagService) value;
    }

    public static final IHostAction LJIIJJI() {
        Object value = LJ.getValue();
        o.LJIIIIZZ(value, "<get-hostAction>(...)");
        return (IHostAction) value;
    }

    public static final IHostAppContext LJIIL() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-hostContext>(...)");
        return (IHostAppContext) value;
    }

    public static final IHybridContainerService LJIILIIL() {
        Object value = LJJIL.getValue();
        o.LJIIIIZZ(value, "<get-hybridContainerService>(...)");
        return (IHybridContainerService) value;
    }

    public static final IInteractService LJIILJJIL() {
        Object value = LJIIJ.getValue();
        o.LJIIIIZZ(value, "<get-interactService>(...)");
        return (IInteractService) value;
    }

    public static final IMessageService LJIILL() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-messageService>(...)");
        return (IMessageService) value;
    }

    public static final IModeratorService LJIILLIIL() {
        Object value = LJIJI.getValue();
        o.LJIIIIZZ(value, "<get-moderatorService>(...)");
        return (IModeratorService) value;
    }

    public static final IPublicScreenService LJIIZILJ() {
        Object value = LJJIJIIJI.getValue();
        o.LJIIIIZZ(value, "<get-publicScreenService>(...)");
        return (IPublicScreenService) value;
    }

    public static final IPullStreamService LJIJ() {
        Object value = LJIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-pullStreamService>(...)");
        return (IPullStreamService) value;
    }

    public static final IRoomFunctionService LJIJI() {
        Object value = LJIL.getValue();
        o.LJIIIIZZ(value, "<get-roomFunctionService>(...)");
        return (IRoomFunctionService) value;
    }

    public static final IShareService LJIJJ() {
        Object value = LJJIII.getValue();
        o.LJIIIIZZ(value, "<get-shareService>(...)");
        return (IShareService) value;
    }

    public static final ISlotService LJIJJLI() {
        Object value = LJIIJJI.getValue();
        o.LJIIIIZZ(value, "<get-slotService>(...)");
        return (ISlotService) value;
    }

    public static final ISubscribeService LJIL() {
        Object value = LJJIJL.getValue();
        o.LJIIIIZZ(value, "<get-subScribeService>(...)");
        return (ISubscribeService) value;
    }

    public static final IToolbarService LJJ() {
        Object value = LJIJJ.getValue();
        o.LJIIIIZZ(value, "<get-toolbarService>(...)");
        return (IToolbarService) value;
    }

    public static final ITreasureBoxService LJJI() {
        Object value = LJJIZ.getValue();
        o.LJIIIIZZ(value, "<get-treasureBoxService>(...)");
        return (ITreasureBoxService) value;
    }
}
