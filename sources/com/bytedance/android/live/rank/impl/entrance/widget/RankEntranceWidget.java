package com.bytedance.android.live.rank.impl.entrance.widget;

import X.B76;
import X.BCW;
import X.BZI;
import X.C05630Jz;
import X.C0K2;
import X.C15380j0;
import X.C16880lQ;
import X.C2313596d;
import X.C28652BMi;
import X.C28787BRn;
import X.C28835BTj;
import X.C29306Beo;
import X.C29494Bhq;
import X.C31510CYg;
import X.C31516CYm;
import X.C31517CYn;
import X.C31520CYq;
import X.C31521CYr;
import X.C31522CYs;
import X.C31526CYw;
import X.C73340SqO;
import X.C77933UiH;
import X.C77934UiI;
import X.C80955Vpv;
import X.C87818YdK;
import X.C87820YdM;
import X.CXJ;
import X.CYZ;
import X.EnumC31059CGx;
import X.EnumC31158CKs;
import X.EnumC31514CYk;
import X.EnumC31519CYp;
import X.InterfaceC31336CRo;
import X.InterfaceC87839Ydf;
import X.V0N;
import Y.ARunnableS24S0200000_5;
import Y.ARunnableS35S0200000_16;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.GiftRankSettingEvent;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class RankEntranceWidget extends PerformProcessWidget implements InterfaceC31336CRo, ILayer2PriorityWidget, InterfaceC87839Ydf {
    public C31510CYg LJLIL;
    public Layer2PriorityManager LJLILLLLZI;
    public TextView LJLJI;
    public C87820YdM LJLJJI;
    public C31521CYr LJLJJL;
    public long LJLJJLL;
    public RankListDialog LJLJL;
    public Room LJLJLLL;
    public boolean LJLL;
    public ARunnableS24S0200000_5 LJLLJ;
    public boolean LJLLL;
    public boolean LJLJLJ = true;
    public final int LJLLI = C15380j0.LIZIZ(R.color.ca);
    public final Handler LJLLILLLL = new Handler(C16880lQ.LLJJJJ());

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dcb;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LJZ() {
        Room room;
        RoomAuthStatus roomAuthStatus;
        Room room2 = this.LJLJLLL;
        if (room2 == null) {
            return false;
        }
        if (room2.getRoomAuthStatus() != null && (room = this.LJLJLLL) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.getRankState() == 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return RankEntranceWidget.class.getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final void hideWidget() {
        Layer2PriorityManager layer2PriorityManager = this.LJLILLLLZI;
        if (layer2PriorityManager != null) {
            layer2PriorityManager.hideWidget(this);
        } else {
            hide();
        }
        RankListDialog rankListDialog = this.LJLJL;
        if (rankListDialog != null) {
            rankListDialog.dismiss();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Layer2PriorityManager.Data rankEntrance;
        Layer2PriorityManager layer2PriorityManager = this.LJLILLLLZI;
        if (layer2PriorityManager != null && (rankEntrance = layer2PriorityManager.getRankEntrance()) != null) {
            rankEntrance.setWidget(null);
        }
        hideWidget();
        C87820YdM c87820YdM = this.LJLJJI;
        if (c87820YdM != null) {
            C87818YdK c87818YdK = c87820YdM.LIZIZ;
            c87818YdK.LJIILIIL = null;
            Runnable runnable = c87818YdK.LJIILLIIL;
            if (runnable != null) {
                c87818YdK.LJIILL.removeCallbacks(runnable);
            }
            ARunnableS35S0200000_16 aRunnableS35S0200000_16 = c87818YdK.LJIIZILJ;
            if (aRunnableS35S0200000_16 != null) {
                c87818YdK.LJIILL.removeCallbacks(aRunnableS35S0200000_16);
            }
            ARunnableS35S0200000_16 aRunnableS35S0200000_162 = c87818YdK.LJIJ;
            if (aRunnableS35S0200000_162 != null) {
                c87818YdK.LJIILL.removeCallbacks(aRunnableS35S0200000_162);
            }
            c87818YdK.LJFF = C15380j0.LIZIZ(R.color.ca);
            if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
                c87820YdM.LIZ = null;
            }
            C2313596d.LIZ.clear();
            C2313596d.LIZIZ.clear();
            this.LJLLILLLL.removeCallbacksAndMessages(null);
            C28652BMi.LIZ.clear();
            CYZ.LIZ = false;
            CYZ.LIZIZ = "";
            CYZ.LIZJ = 0L;
            CYZ.LIZLLL = 0L;
            CYZ.LJFF = 0L;
            CYZ.LJI = 0L;
            CYZ.LJ = 0L;
            CYZ.LJII.clear();
            CYZ.LJIIIIZZ.clear();
            TextView textView = this.LJLJI;
            if (textView != null) {
                textView.setText((CharSequence) null);
                this.LJLJLLL = null;
                this.LJLL = false;
                this.LJLJJL = null;
                this.LJLIL = null;
                this.LJLLL = false;
                this.LJLJJLL = 0L;
                C31520CYq.LIZ.clear();
                this.LJLJL = null;
                return;
            }
            o.LJIJI("textView");
            throw null;
        }
        o.LJIJI("animationManager");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final void showWidget() {
        EnumC31514CYk enumC31514CYk;
        String str;
        Layer2PriorityManager layer2PriorityManager = this.LJLILLLLZI;
        if (layer2PriorityManager != null) {
            layer2PriorityManager.showWidget(this);
        } else {
            show();
        }
        if (!this.LJLLL) {
            this.LJLLL = true;
            Room room = this.LJLJLLL;
            if (room != null) {
                C31510CYg c31510CYg = this.LJLIL;
                EnumC31514CYk enumC31514CYk2 = null;
                if (c31510CYg != null) {
                    enumC31514CYk = c31510CYg.LIZIZ;
                } else {
                    enumC31514CYk = null;
                }
                if (enumC31514CYk != EnumC31514CYk.E_COMMERCE) {
                    if (c31510CYg != null) {
                        enumC31514CYk2 = c31510CYg.LIZIZ;
                    }
                    if (enumC31514CYk2 != EnumC31514CYk.GAME_RANK) {
                        str = "rank";
                        B76.LIZJ(room, str);
                    }
                }
                str = "vertical_rank";
                B76.LIZJ(room, str);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final View rootView() {
        return getView();
    }

    @Override // X.InterfaceC87839Ydf
    public final void LJIIJ(C31521CYr textInfo) {
        C31510CYg c31510CYg;
        int i;
        EnumC31519CYp enumC31519CYp;
        o.LJIIIZ(textInfo, "textInfo");
        C87820YdM c87820YdM = this.LJLJJI;
        if (c87820YdM != null) {
            if (c87820YdM.LIZIZ.LJIILJJIL == null && (c31510CYg = this.LJLIL) != null) {
                if ((c31510CYg.LIZJ || c31510CYg.LIZLLL) && c31510CYg.LJ.size() > 1) {
                    int size = c31510CYg.LJ.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            if (o.LJ(((C31516CYm) ListProtector.get(c31510CYg.LJ, i2)).LIZ.LIZIZ, textInfo.LIZ.LIZIZ)) {
                                i = (i2 + 1) % c31510CYg.LJ.size();
                                break;
                            }
                            i2++;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    C31516CYm c31516CYm = (C31516CYm) ListProtector.get(c31510CYg.LJ, i);
                    C31526CYw c31526CYw = c31516CYm.LIZ;
                    String obj = CXJ.LJFF(c31516CYm.LJ, "").toString();
                    long j = c31516CYm.LJFF;
                    boolean z = c31516CYm.LIZIZ;
                    boolean z2 = c31516CYm.LIZJ;
                    RankAnimationInfo rankAnimationInfo = new RankAnimationInfo();
                    if (c31516CYm.LIZIZ) {
                        enumC31519CYp = EnumC31519CYp.LOOP;
                    } else {
                        enumC31519CYp = EnumC31519CYp.LOOP_FOR_OFF_RANK;
                    }
                    rankAnimationInfo.type = enumC31519CYp.getType();
                    LJZL(LJLZ(c31526CYw, obj, j, z, z2, rankAnimationInfo), false);
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("animationManager");
        throw null;
    }

    @Override // X.InterfaceC87839Ydf
    public final void LJJI(C31521CYr textInfo) {
        C31521CYr c31521CYr;
        o.LJIIIZ(textInfo, "textInfo");
        C87820YdM c87820YdM = this.LJLJJI;
        if (c87820YdM != null) {
            C87818YdK c87818YdK = c87820YdM.LIZIZ;
            if (c87818YdK.LJIILJJIL != null || (c31521CYr = c87818YdK.LJIIJJI) == null) {
                return;
            }
            c87820YdM.LIZJ().LIZLLL(c31521CYr);
            return;
        }
        o.LJIJI("animationManager");
        throw null;
    }

    @Override // X.InterfaceC87839Ydf
    public final void LJJLIIIJL(boolean z) {
        this.LJLJLJ = z;
    }

    public final void LJZI(List<RankTabInfo> list) {
        Room room;
        C31521CYr c31521CYr;
        String str;
        Long l;
        String str2;
        RankListDialog rankListDialog;
        int i;
        AnchorLevelPermission anchorLevelPermission;
        RankListDialog rankListDialog2 = this.LJLJL;
        if (rankListDialog2 != null) {
            rankListDialog2.dismiss();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && room.getOwner() != null && list != null && (c31521CYr = this.LJLJJL) != null) {
            EnumC31514CYk enumC31514CYk = c31521CYr.LIZ.LIZ;
            String str3 = "anchor";
            String str4 = "portrait";
            if (enumC31514CYk == EnumC31514CYk.GIFT_RANK) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (dataChannel.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW) {
                    linkedHashMap.put("event_page", "live_extended_comment_filed");
                }
                C31522CYs.LIZJ(linkedHashMap, c31521CYr.LIZ, dataChannel);
                BZI LIZ = C28787BRn.LIZ("livesdk_hourly_rank_entrance_click");
                LIZ.LJIILLIIL(dataChannel);
                C31522CYs.LIZ(LIZ, dataChannel);
                if (!C15380j0.LJIILLIIL()) {
                    str4 = "landscape";
                }
                LIZ.LJIJJ(str4, "room_orientation");
                if (!C29306Beo.LJIIJ(dataChannel)) {
                    str3 = "user";
                }
                LIZ.LJIJJ(str3, "user_type");
                V0N.LJJIIZ(LIZ, c31521CYr.LIZ);
                LIZ.LJIJJ("room_topleft", "position");
                LIZ.LJIJJ(C31522CYs.LIZ, "show_reason");
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.viewerRankList == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                LIZ.LJIJJ(Integer.valueOf(i), "is_locked");
                LIZ.LJJIFFI(linkedHashMap);
                LIZ.LJJIIJZLJL();
            } else if (enumC31514CYk == EnumC31514CYk.E_COMMERCE) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_tiktokec_sale_rank_entrance_click");
                LIZ2.LJIILLIIL(dataChannel);
                if (C29306Beo.LJIIJ(dataChannel)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ2.LJIJJ(str, "is_self");
                LIZ2.LJIJJ(Long.valueOf(c31521CYr.LIZJ), "author_rank");
                Room room2 = (Room) dataChannel.kv0(RoomChannel.class);
                if (room2 != null) {
                    l = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l = null;
                }
                LIZ2.LJIJJ(l, "author_id");
                LIZ2.LJIJJ("TEMAI", "EVENT_ORIGIN_FEATURE");
                LIZ2.LJIJJ("live", "page_name");
                LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
                if (dataChannel.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW) {
                    LIZ2.LJIJJ("live_extended_comment_filed", "event_page");
                }
                LIZ2.LJJIIJZLJL();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (dataChannel.kv0(LiveExtendedScreenStatus.class) == EnumC31158CKs.SHOW) {
                    linkedHashMap2.put("event_page", "live_extended_comment_filed");
                }
                C31522CYs.LIZJ(linkedHashMap2, c31521CYr.LIZ, dataChannel);
                BZI LIZ3 = C28787BRn.LIZ("livesdk_hourly_rank_entrance_click");
                LIZ3.LJIILLIIL(dataChannel);
                C31522CYs.LIZ(LIZ3, dataChannel);
                if (!C15380j0.LJIILLIIL()) {
                    str4 = "landscape";
                }
                LIZ3.LJIJJ(str4, "room_orientation");
                if (!C29306Beo.LJIIJ(dataChannel)) {
                    str3 = "user";
                }
                LIZ3.LJIJJ(str3, "user_type");
                V0N.LJJIIZ(LIZ3, c31521CYr.LIZ);
                LIZ3.LJIJJ("room_topleft", "position");
                LIZ3.LJIJJ(C31522CYs.LIZ, "show_reason");
                LIZ3.LJJIFFI(linkedHashMap2);
                LIZ3.LJJIIJZLJL();
            }
            C31526CYw c31526CYw = c31521CYr.LIZ;
            RankTypeV2 rankTypeV2 = c31526CYw.LIZIZ;
            EnumC31514CYk enumC31514CYk2 = c31526CYw.LIZ;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            if (rankTypeV2 == null || (str2 = rankTypeV2.rankName) == null) {
                str2 = RankTypeV2.LJIILL.rankName;
            }
            C05630Jz.LJI(jSONObject, "current_entrance_rank_type", str2);
            if (enumC31514CYk2 == null) {
                enumC31514CYk2 = EnumC31514CYk.DEFAULT;
            }
            C05630Jz.LIZ(enumC31514CYk2.getType(), "group_type", jSONObject);
            CYZ.LIZIZ(dataChannel, jSONObject3, list);
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_entrance_click", jSONObject, jSONObject2, jSONObject4);
            Iterator<RankTabInfo> it = list.iterator();
            while (it.hasNext()) {
                if ((it.next().listLynxType & EnumC31059CGx.RANK_DIALOG.getScene()) != 0) {
                    C73340SqO.LJJIJIIJI(this.context, dataChannel, list);
                    return;
                }
            }
            long id = room.getOwner().getId();
            long id2 = room.getId();
            boolean z = this.LJLL;
            C31526CYw c31526CYw2 = c31521CYr.LIZ;
            C77934UiI c77934UiI = new C77934UiI(id, id2, list, z, c31526CYw2.LIZLLL, c31526CYw2.LIZJ, c31526CYw2.LIZ);
            if (RankOptimizeSetting.INSTANCE.getValue()) {
                RankListDialog LIZ4 = C77933UiH.LIZ(c77934UiI, this, false, true);
                FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
                if (fragmentManager != null && LIZ4 != null) {
                    LIZ4.show(fragmentManager, C16880lQ.LJLLJ(RankListDialog.class));
                    return;
                }
                return;
            }
            this.LJLJL = C77933UiH.LIZ(c77934UiI, this, false, true);
            FragmentManager fragmentManager2 = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
            if (fragmentManager2 == null || (rankListDialog = this.LJLJL) == null) {
                return;
            }
            rankListDialog.show(fragmentManager2, C16880lQ.LJLLJ(RankListDialog.class));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... args) {
        C31510CYg c31510CYg;
        C31510CYg c31510CYg2;
        o.LJIIIZ(args, "args");
        super.initConstructor(Arrays.copyOf(args, args.length));
        Object obj = args[0];
        Layer2PriorityManager layer2PriorityManager = null;
        if ((obj instanceof C31510CYg) && (c31510CYg2 = (C31510CYg) obj) != null) {
            c31510CYg = c31510CYg2.LIZ();
        } else {
            c31510CYg = null;
        }
        this.LJLIL = c31510CYg;
        Object obj2 = args[1];
        if (obj2 instanceof Layer2PriorityManager) {
            layer2PriorityManager = (Layer2PriorityManager) obj2;
        }
        this.LJLILLLLZI = layer2PriorityManager;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        boolean z;
        boolean z2;
        Boolean bool;
        View findViewById = findViewById(R.id.imk);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.rank_entrance_text)");
        this.LJLJI = (TextView) findViewById;
        o.LJIIIIZZ(findViewById(R.id.imj), "findViewById(R.id.rank_entrance_icon)");
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new C31517CYn(this), view);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        View findViewById2 = this.contentView.findViewById(R.id.imn);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…ntrance_widget_container)");
        CardView cardView = (CardView) findViewById2;
        DataChannel dataChannel2 = this.dataChannel;
        if (this.LJLILLLLZI == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJI = new C87820YdM(cardView, dataChannel2, this, z2, z);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        C80955Vpv c80955Vpv;
        boolean z;
        Boolean bool2;
        Layer2PriorityManager.Data rankEntrance;
        boolean z2;
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        boolean LJJ = C29306Beo.LJJ(bool);
        if (this.LJLILLLLZI == null && LJJ) {
            View view = this.contentView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        } else {
            View view2 = this.contentView;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            layoutParams2.width = -2;
            view2.setLayoutParams(layoutParams2);
        }
        View view3 = this.contentView;
        if (view3 instanceof C80955Vpv) {
            c80955Vpv = (C80955Vpv) view3;
        } else {
            c80955Vpv = null;
        }
        if (c80955Vpv != null) {
            if (LJJ && this.LJLILLLLZI == null && RankOptimizeSetting.INSTANCE.getValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            c80955Vpv.setEnableFixedSize(z2);
        }
        Layer2PriorityManager layer2PriorityManager = this.LJLILLLLZI;
        if (layer2PriorityManager != null) {
            layer2PriorityManager.setFirstScreenDone(true);
        }
        Layer2PriorityManager layer2PriorityManager2 = this.LJLILLLLZI;
        if (layer2PriorityManager2 != null && (rankEntrance = layer2PriorityManager2.getRankEntrance()) != null) {
            rankEntrance.setWidget(this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.kv0(RoomChannel.class);
        }
        this.LJLJLLL = room;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool2 = (Boolean) dataChannel3.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.LJLL = z;
        LL(this.LJLIL, false);
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, BroadcastEndShowEvent.class, new AqS171S0100000_5(this, 94));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, MicRoomDisableInteractionEvent.class, new AqS171S0100000_5(this, 95));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.lv0(this, GiftRankSettingEvent.class, new AqS171S0100000_5(this, 96));
        }
    }

    public RankEntranceWidget(C31510CYg c31510CYg, Layer2PriorityManager layer2PriorityManager) {
        this.LJLIL = c31510CYg;
        this.LJLILLLLZI = layer2PriorityManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r4.LIZIZ, r6.LIZIZ) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(X.C31521CYr r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.LJZL(X.CYr, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0305, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x030c, code lost:
    
        if (r20.LIZLLL < r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x030e, code lost:
    
        r12 = X.CXJ.LJFF(r20.LJ, "").toString();
        r4 = r20.LJFF;
        r9 = r20.LIZIZ;
        r8 = r20.LIZJ;
        r6 = new com.bytedance.android.livesdk.model.message.RankAnimationInfo();
        r6.type = X.EnumC31519CYp.BEFORE_SETTLE.getType();
        r7 = new Y.ARunnableS24S0200000_5(r21, LJLZ(r7, r12, r4, r9, r8, r6), 9);
        r21.LJLLILLLL.postDelayed(r7, (r20.LIZLLL - r1) * 1000);
        r21.LJLLJ = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x035c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r8, com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZ) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0366, code lost:
    
        if (r20.LIZLLL <= 5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0368, code lost:
    
        r7 = r20.LIZ;
        r12 = X.CXJ.LJFF(r20.LJ, "").toString();
        r1 = r20.LJFF;
        r9 = r20.LIZIZ;
        r8 = r20.LIZJ;
        r6 = new com.bytedance.android.livesdk.model.message.RankAnimationInfo();
        r6.type = X.EnumC31519CYp.BEFORE_SETTLE_SIMPLE.getType();
        r6.duration = r20.LIZLLL;
        LJZL(LJLZ(r7, r12, r1, r9, r8, r6), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03a7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023c, code lost:
    
        LJZL(r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0241, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0259, code lost:
    
        r8 = r22.LJ.iterator();
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0265, code lost:
    
        if (r8.hasNext() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0267, code lost:
    
        r7 = r8.next();
        r1 = r7.LIZ.LIZIZ;
        r0 = r21.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0273, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0275, code lost:
    
        r0 = r0.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0277, code lost:
    
        if (r0 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0279, code lost:
    
        r0 = r0.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x027f, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0281, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0284, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0286, code lost:
    
        if (r20 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0288, code lost:
    
        r20 = (X.C31516CYm) com.bytedance.mt.protector.impl.collections.ListProtector.get(r22.LJ, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e7, code lost:
    
        r21.LJLIL = r22.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r22.LJ.isEmpty() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting.INSTANCE.getValue() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r21.LJLJJL == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r0 = r21.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r0.LIZLLL != true) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r22.LIZLLL == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r22.LJ.size() <= 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r22.LIZLLL == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r22.LJ.size() <= 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        r8 = r21.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r8 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r8.LJ.size() == r22.LJ.size()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0296, code lost:
    
        r12 = r22.LJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02a0, code lost:
    
        if (r12.hasNext() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02a2, code lost:
    
        r7 = r12.next();
        r11 = r8.LJ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02b2, code lost:
    
        if (r11.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02b4, code lost:
    
        r10 = r11.next();
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02c7, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r7.LIZ.LIZIZ, r9.LIZ.LIZIZ) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e1, code lost:
    
        if (kotlin.jvm.internal.o.LJ(X.CXJ.LJFF(r9.LJ, "").toString(), X.CXJ.LJFF(r7.LJ, "").toString()) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02e3, code lost:
    
        if (r10 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03a8, code lost:
    
        r21.LJLIL = r22.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x03ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        r21.LJLIL = r22.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009e, code lost:
    
        if (r22.LIZJ != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r20 = (X.C31516CYm) com.bytedance.mt.protector.impl.collections.ListProtector.get(r22.LJ, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ac, code lost:
    
        showWidget();
        r11 = r21.dataChannel;
        r0 = r20.LIZ;
        r13 = r0.LIZIZ;
        r12 = r0.LIZ.getType();
        r1 = r22.LJFF;
        r4 = hashCode();
        kotlin.jvm.internal.o.LJIIIZ(r13, "rankType");
        r2 = X.CYZ.LJII;
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
    
        if (r2.contains(java.lang.Integer.valueOf(r4)) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
    
        r2.add(java.lang.Integer.valueOf(r4));
        r8 = new org.json.JSONObject();
        r4 = new org.json.JSONObject();
        r2 = new org.json.JSONObject();
        r9 = new org.json.JSONObject();
        X.C05630Jz.LJI(r8, "current_entrance_rank_type", r13.rankName);
        X.C05630Jz.LIZ(r12, "group_type", r8);
        X.CYZ.LIZIZ(r11, r2, r1);
        r0 = java.lang.System.currentTimeMillis();
        X.CYZ.LJ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0112, code lost:
    
        if (X.CYZ.LJI != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0114, code lost:
    
        X.C05630Jz.LJFF(r4, "event_duration", r0 - X.CYZ.LIZJ);
        X.C05630Jz.LJFF(r2, "event_duration", X.CYZ.LJ - X.CYZ.LIZJ);
        X.C05630Jz.LJI(r2, "data_source", "entrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        X.C05630Jz.LJI(r8, "event_name", "event_draw");
        X.C05630Jz.LJFF(r4, "event_duration", X.CYZ.LJ - X.CYZ.LIZJ);
        X.C05630Jz.LJFF(r2, "event_duration", X.CYZ.LJ - X.CYZ.LIZJ);
        X.C05630Jz.LIZJ("extra", r9, r2);
        X.C0K2.LJI("ttlive_ranklist_entrance_show", r8, r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0244, code lost:
    
        X.C05630Jz.LJFF(r4, "event_duration", r0 - X.CYZ.LJFF);
        X.C05630Jz.LJFF(r2, "event_duration", X.CYZ.LJ - X.CYZ.LJFF);
        X.C05630Jz.LJI(r2, "data_source", "components");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        r14 = r21.dataChannel;
        r0 = r20.LIZ;
        r13 = r0.LIZIZ;
        r12 = r0.LIZ.getType();
        r11 = r22.LJFF;
        r4 = hashCode();
        kotlin.jvm.internal.o.LJIIIZ(r13, "rankType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        if (r14 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
    
        r0 = (java.lang.Boolean) r14.kv0(com.bytedance.android.livesdk.dataChannel.OrientationChangedChannel.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016b, code lost:
    
        r2 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        r1 = X.CYZ.LJIIIIZZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r4)) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if (r2 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017d, code lost:
    
        r1.add(java.lang.Integer.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0191, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_ranklist_entrance_show_from_room_entrance", 0.2d) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0193, code lost:
    
        r9 = new org.json.JSONObject();
        r8 = new org.json.JSONObject();
        r4 = new org.json.JSONObject();
        r2 = new org.json.JSONObject();
        X.C05630Jz.LJI(r9, "current_entrance_rank_type", r13.rankName);
        X.C05630Jz.LIZ(r12, "group_type", r9);
        X.CYZ.LIZIZ(r14, r4, r11);
        X.CYZ.LJ = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ba, code lost:
    
        if (r14 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bc, code lost:
    
        r0 = (java.lang.Long) r14.kv0(X.C28394BCk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c4, code lost:
    
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c6, code lost:
    
        r17 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ca, code lost:
    
        X.C05630Jz.LJFF(r8, "event_duration", X.CYZ.LJ - r17);
        X.C05630Jz.LJFF(r4, "event_duration", X.CYZ.LJ - r17);
        X.C05630Jz.LIZJ("extra", r2, r4);
        X.C0K2.LJI("ttlive_ranklist_entrance_show_from_room_entrance", r9, r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e0, code lost:
    
        r2 = LJLZ(r20.LIZ, X.CXJ.LJFF(r20.LJ, "").toString(), r20.LJFF, r20.LIZIZ, r20.LIZJ, r20.LJI);
        r0 = r20.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020f, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0219, code lost:
    
        if (r0.type != X.EnumC31519CYp.AFTER_SETTLE.getType()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021b, code lost:
    
        X.CKB.INSTANCE.registerFinishCallback(new X.C31518CYo(r21, r2));
        X.C31520CYq.LIZ.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022a, code lost:
    
        r1 = r21.LJLJJLL;
        r7 = r20.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0232, code lost:
    
        if (r1 == r7) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0238, code lost:
    
        if (r22.LIZIZ != X.EnumC31514CYk.GIFT_RANK) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ef, code lost:
    
        r21.LJLJJLL = r7;
        r1 = r21.LJLLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f3, code lost:
    
        if (r1 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02f5, code lost:
    
        r21.LJLLILLLL.removeCallbacks(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02fa, code lost:
    
        r7 = r20.LIZ;
        r8 = r7.LIZLLL;
        r1 = r8.rankSettlementCountdown;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0302, code lost:
    
        if (r1 >= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0304, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LL(X.C31510CYg r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget.LL(X.CYg, boolean):void");
    }

    public final C31521CYr LJLZ(C31526CYw c31526CYw, String str, long j, boolean z, boolean z2, RankAnimationInfo rankAnimationInfo) {
        int i;
        if (rankAnimationInfo != null) {
            if (TextUtils.isEmpty(rankAnimationInfo.backgroundColorString)) {
                i = this.LJLLI;
            } else {
                try {
                    i = Color.parseColor(rankAnimationInfo.backgroundColorString);
                } catch (Exception unused) {
                    i = this.LJLLI;
                }
            }
            rankAnimationInfo.setBackgroundColor(i);
            rankAnimationInfo.setContent(CXJ.LJFF(rankAnimationInfo.contentText, "").toString());
        }
        return new C31521CYr(c31526CYw, str, j, z, z2, rankAnimationInfo);
    }
}
