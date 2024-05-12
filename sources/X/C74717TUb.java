package X;

import Y.AfS5S1100100_13;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TUb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74717TUb implements InterfaceC75414Tik<ChangeMaxPositionResult> {
    public final /* synthetic */ C74842TYw LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ChangeMaxPositionResult value) {
        String str;
        Long valueOf;
        String str2;
        MultiGuestSharedBgAnchorViewModel Mb0;
        C75236Tfs state;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        o.LJIIIZ(value, "value");
        C0NB.LIZIZ("MultiGuestV3AnchorPresenter", "changeMaxPos onSuccess");
        this.LJLIL.LJLJJI.rv0(CurrentRealDisplayChannel.class, new OSZ(this.LJLILLLLZI, Integer.valueOf(this.LJLJI)));
        C74842TYw c74842TYw = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        c74842TYw.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestUpdateSetting layoutId:");
        LIZ.append(str3);
        C0NB.LIZIZ("MultiGuestV3AnchorPresenter", X1D.LIZIZ(LIZ));
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            if (str3 != null && (multiLiveAnchorPanelSettings = c74842TYw.getMultiGuestDataHolder().LJIIJ) != null && multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = c74842TYw.getMultiGuestDataHolder().LJIIJ;
                if (multiLiveAnchorPanelSettings2 != null && multiLiveAnchorPanelSettings2.layoutType == 1) {
                    ((ConcurrentHashMap) c74842TYw.getMultiGuestDataHolder().LJIIJJI).put(1, str3);
                } else {
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = c74842TYw.getMultiGuestDataHolder().LJIIJ;
                    if (multiLiveAnchorPanelSettings3 != null && multiLiveAnchorPanelSettings3.layoutType == 0) {
                        ((ConcurrentHashMap) c74842TYw.getMultiGuestDataHolder().LJIIJJI).put(2, str3);
                    }
                }
            }
            InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) c74842TYw.LJLJJI.kv0(C75415Til.class);
            Context context = null;
            if (interfaceC55235Lm3 != null) {
                ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) UC0.LJIIL(interfaceC55235Lm3, ISharedBgAbility.class, null);
                if (iSharedBgAbility != null && (Mb0 = iSharedBgAbility.Mb0()) != null && (state = Mb0.getState()) != null) {
                    str2 = state.LJLJJI;
                } else {
                    str2 = null;
                }
                str = C75283Tgd.LIZ(str2);
            } else {
                str = null;
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room != null || (room = (Room) dataChannelGlobal.mv0(C29108Bbc.class)) != null) {
                valueOf = Long.valueOf(room.getId());
            } else {
                valueOf = null;
            }
            Long valueOf2 = Long.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId());
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = c74842TYw.getMultiGuestDataHolder().LJIIJ;
            if (valueOf != null && valueOf2 != null && multiLiveAnchorPanelSettings4 != null) {
                long LIZIZ = C31012CFc.LIZIZ();
                C74716TUa.LIZIZ((MultiLiveApi) TTL.LIZ(MultiLiveApi.class, "get().getService(MultiLiveApi::class.java)"), valueOf.longValue(), C78886Uxe.LJJJLIIL(C8E.LJ()), valueOf2.longValue(), multiLiveAnchorPanelSettings4.layoutType, multiLiveAnchorPanelSettings4.fixMicNumAction, multiLiveAnchorPanelSettings4.allowViewerReq, multiLiveAnchorPanelSettings4.onlyAllowFollowerReq, str3, str, 0, multiLiveAnchorPanelSettings4.applierSortSetting, 0L, 2560).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C74718TUc(LIZIZ, "change_layout", str3), new AfS5S1100100_13(LIZIZ, "change_layout", c74842TYw, 0));
            } else {
                InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) c74842TYw.mView;
                if (interfaceC31336CRo != null) {
                    context = interfaceC31336CRo.getContext();
                }
                BPP.LIZLLL(context, new Throwable("param illegal."), R.string.sp2);
            }
        }
        this.LJLJJI.invoke();
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        BPP.LIZJ(this.LJLJJL, th);
        if (th != null) {
            C74987Tbr.LIZIZ("MultiGuestV3AnchorPresenter", "changeMaxPosition failed,", th);
        }
    }

    public C74717TUb(C74842TYw c74842TYw, String str, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Context context) {
        this.LJLIL = c74842TYw;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = context;
    }
}
