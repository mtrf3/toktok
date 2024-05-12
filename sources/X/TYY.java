package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYY extends C74820TYa {
    public final /* synthetic */ TYW LJLIL;

    public TYY(TYW tyw) {
        this.LJLIL = tyw;
    }

    @Override // X.InterfaceC75447TjH
    public final void LLLLIIL(LinkMessage message) {
        TYZ tyz;
        o.LJIIIZ(message, "message");
        MultiLiveAnchorPanelSettings LJJJJIZL = this.LJLIL.LJJJJIZL();
        if (C74776TWi.LJIILL(LJJJJIZL)) {
            if (C74776TWi.LJIILIIL(LJJJJIZL) || (tyz = (TYZ) this.LJLIL.mView) == null) {
                return;
            }
            tyz.C8();
            return;
        }
        TYZ tyz2 = (TYZ) this.LJLIL.mView;
        if (tyz2 == null) {
            return;
        }
        tyz2.G9(true);
    }

    @Override // X.InterfaceC75447TjH
    public final void LLLLLLLLLL(LinkMessage linkMessage) {
        o.LJIIIZ(linkMessage, "linkMessage");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("link_finish_message = ");
        LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZJ, linkMessage));
        C0NB.LJIIIZ("VoiceChatControlPresenter", X1D.LIZIZ(LIZ));
        T t = this.LJLIL.mView;
        if (t == 0) {
            return;
        }
        ((TYZ) t).R5(linkMessage);
    }

    @Override // X.InterfaceC75449TjJ
    public final void LLZILL(LinkMessage message) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        TYZ tyz;
        o.LJIIIZ(message, "message");
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent = message.multiLiveUpdateUserSettingContent;
        if (multiLiveUpdateUserSettingContent == null || (multiLiveAnchorPanelSettings = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings) == null) {
            C32014ChO.LIZJ("VoiceChatControlPresenter", "settings is null, do nothing", null);
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.LJLIL.multiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIIJ = multiLiveAnchorPanelSettings;
            C74838TYs.LJ().LJJI = multiLiveAnchorPanelSettings;
            if (C74776TWi.LJIILL(multiLiveAnchorPanelSettings)) {
                if (C74776TWi.LJIILIIL(multiLiveAnchorPanelSettings)) {
                    TYZ tyz2 = (TYZ) this.LJLIL.mView;
                    if (tyz2 != null) {
                        tyz2.C8();
                        return;
                    }
                    return;
                }
                TYZ tyz3 = (TYZ) this.LJLIL.mView;
                if (tyz3 == null) {
                    return;
                }
                tyz3.C8();
                return;
            }
            if (!C74776TWi.LJIIL() || (tyz = (TYZ) this.LJLIL.mView) == null) {
                return;
            }
            tyz.G9(false);
            return;
        }
        o.LJIJI("multiGuestDataHolder");
        throw null;
    }
}
