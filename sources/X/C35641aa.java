package X;

import Y.IDLAdapterS2S0100000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.CommentCompressOnSmallEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowChannel;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentWidthOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35641aa implements InterfaceC30264BuG {
    public Context LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public DataChannel LJLJI;
    public Room LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public ImageView LJLJLJ;
    public C2A8 LJLJLLL;
    public C29701Eo LJLL;
    public C29701Eo LJLLI;

    @Override // X.InterfaceC30264BuG
    public final long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceC30264BuG
    public final boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceC30264BuG
    public final void onClick(View view) {
        String str;
        String str2;
        Long l;
        String str3;
        PartnershipTask partnershipTask;
        String str4;
        Context context = this.LJLIL;
        if (context != null) {
            OSZ[] oszArr = new OSZ[14];
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                if (C28835BTj.LIZLLL(dataChannel)) {
                    str = "ad";
                } else {
                    str = "normal";
                }
                oszArr[0] = new OSZ("live_traffic_source", str);
                String str5 = CardStruct.IStatusCode.DEFAULT;
                oszArr[1] = new OSZ("is_host", CardStruct.IStatusCode.DEFAULT);
                Room room = this.LJLJJI;
                if (room != null) {
                    str2 = room.getRequestId();
                } else {
                    str2 = null;
                }
                oszArr[2] = new OSZ("request_id", String.valueOf(str2));
                oszArr[3] = new OSZ("action_type", BJM.LIZLLL());
                oszArr[4] = new OSZ("enter_method", BJM.LJIIIIZZ());
                oszArr[5] = new OSZ("enter_from_merge", BJM.LJFF());
                Room room2 = this.LJLJJI;
                if (room2 != null) {
                    l = Long.valueOf(room2.getId());
                } else {
                    l = null;
                }
                oszArr[6] = new OSZ("content_id", String.valueOf(l));
                oszArr[7] = new OSZ("host_id", String.valueOf(BJM.LJ()));
                oszArr[8] = new OSZ("is_landscape", CardStruct.IStatusCode.DEFAULT);
                oszArr[9] = new OSZ("popup_follow_activity_ui", CardStruct.IStatusCode.DEFAULT);
                if (this.LJLJJL) {
                    str5 = "1";
                }
                oszArr[10] = new OSZ("is_pin", str5);
                oszArr[11] = new OSZ("page_from", "icon");
                DataChannel dataChannel2 = this.LJLJI;
                if (dataChannel2 != null) {
                    LiveMode liveMode = (LiveMode) dataChannel2.kv0(BCX.class);
                    String str6 = "";
                    if (liveMode == null) {
                        str3 = "";
                    } else {
                        str3 = C28509BGv.LIZ(liveMode);
                    }
                    oszArr[12] = new OSZ("live_type", str3);
                    DataChannel dataChannel3 = this.LJLJI;
                    if (dataChannel3 != null) {
                        BriefGameTask briefGameTask = (BriefGameTask) dataChannel3.kv0(C30591BzX.class);
                        if (briefGameTask != null && (partnershipTask = briefGameTask.task) != null && (str4 = partnershipTask.idStr) != null) {
                            str6 = str4;
                        }
                        oszArr[13] = new OSZ("task_id", str6);
                        C24160xA.LIZ(context, C113554cx.LJJL(oszArr), false);
                    } else {
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                } else {
                    o.LJIJI("dataChannel");
                    throw null;
                }
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        DataChannel dataChannel4 = this.LJLJI;
        if (dataChannel4 != null) {
            C30588BzU.LJ(dataChannel4, false);
        } else {
            o.LJIJI("dataChannel");
            throw null;
        }
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZ(C30252Bu4 toolbarContext, C30158BsY c30158BsY) {
        C2A8 c2a8;
        o.LJIIIZ(toolbarContext, "toolbarContext");
        this.LJLIL = toolbarContext.LIZ;
        this.LJLILLLLZI = toolbarContext.LIZIZ;
        this.LJLJI = toolbarContext.LIZJ;
        this.LJLJLJ = (ImageView) c30158BsY.LIZ(R.id.e91);
        this.LJLJLLL = (C2A8) c30158BsY.LIZ(R.id.dq8);
        this.LJLL = (C29701Eo) c30158BsY.LIZ(R.id.dq7);
        this.LJLLI = (C29701Eo) c30158BsY.LIZ(R.id.dq6);
        EnumC30241Btt enumC30241Btt = EnumC30241Btt.AUDIENCE_PARTNERSHIP;
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            TBViewModel viewModel = enumC30241Btt.getViewModel(dataChannel);
            if (viewModel != null) {
                viewModel.hv0(false, true);
            }
            C15490jB.LJIIJ(this.LJLL, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "gamelive_audience_gamepad_card_show_lottie.zip", false);
            C15490jB.LJIIJ(this.LJLLI, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_game_demand_1"), "gamelive_audience_gamepad_card_hide_lottie.zip", false);
            DataChannel dataChannel2 = this.LJLJI;
            if (dataChannel2 != null) {
                LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
                if (lifecycleOwner != null) {
                    dataChannel2.lv0(lifecycleOwner, PartnershipPromoteGameCardShowChannel.class, new IDqS416S0100000(this, 294));
                    LifecycleOwner lifecycleOwner2 = this.LJLILLLLZI;
                    if (lifecycleOwner2 != null) {
                        dataChannel2.lv0(lifecycleOwner2, GamePartnershipEntranceHide.class, new IDqS416S0100000(this, 295));
                        C29701Eo c29701Eo = this.LJLL;
                        if (c29701Eo != null) {
                            c29701Eo.addAnimatorListener(new IDLAdapterS2S0100000(this, 6));
                        }
                        C29701Eo c29701Eo2 = this.LJLLI;
                        if (c29701Eo2 != null) {
                            c29701Eo2.addAnimatorListener(new IDLAdapterS2S0100000(this, 7));
                        }
                        DataChannel dataChannel3 = this.LJLJI;
                        if (dataChannel3 != null) {
                            this.LJLJJI = (Room) dataChannel3.kv0(RoomChannel.class);
                            C29701Eo c29701Eo3 = this.LJLL;
                            if (c29701Eo3 != null) {
                                c29701Eo3.setVisibility(0);
                            }
                            if (LiveCommentWidthOptSetting.INSTANCE.isStrategyEnable()) {
                                ImageView imageView = this.LJLJLJ;
                                if (imageView != null) {
                                    imageView.post(new IDRunnableS85S0100000(this, 103));
                                }
                                DataChannel dataChannel4 = this.LJLJI;
                                if (dataChannel4 != null) {
                                    LifecycleOwner lifecycleOwner3 = this.LJLILLLLZI;
                                    if (lifecycleOwner3 != null) {
                                        dataChannel4.ov0(lifecycleOwner3, CommentCompressOnSmallEvent.class, new IDqS416S0100000(this, 293));
                                    } else {
                                        o.LJIJI("lifecycleOwner");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("dataChannel");
                                    throw null;
                                }
                            }
                            DataChannel dataChannel5 = this.LJLJI;
                            if (dataChannel5 != null) {
                                if (!o.LJ(dataChannel5.kv0(BNK.class), Boolean.FALSE) || (c2a8 = this.LJLJLLL) == null) {
                                    return;
                                }
                                c2a8.setVisibility(8);
                                return;
                            }
                            o.LJIJI("dataChannel");
                            throw null;
                        }
                        o.LJIJI("dataChannel");
                        throw null;
                    }
                    o.LJIJI("lifecycleOwner");
                    throw null;
                }
                o.LJIJI("lifecycleOwner");
                throw null;
            }
            o.LJIJI("dataChannel");
            throw null;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    @Override // X.InterfaceC30264BuG
    public final void LIZIZ(C30252Bu4 toolbarContext, InterfaceC30269BuL interfaceC30269BuL) {
        C30892CAm Yd0;
        o.LJIIIZ(toolbarContext, "toolbarContext");
        C29701Eo c29701Eo = this.LJLL;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
        }
        C29701Eo c29701Eo2 = this.LJLLI;
        if (c29701Eo2 != null) {
            c29701Eo2.removeAllAnimatorListeners();
        }
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZ();
        }
    }
}
