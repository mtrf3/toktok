package com.bytedance.android.livesdk.interaction.poll.ui;

import X.BCN;
import X.BW6;
import X.BZI;
import X.C0H1;
import X.C15380j0;
import X.C16880lQ;
import X.C1A;
import X.C1EW;
import X.C1I;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C41081jM;
import X.C5H3;
import X.C78856UxA;
import X.C78996UzQ;
import X.C80261Vej;
import X.CC3;
import X.CC4;
import X.CC5;
import X.CC6;
import X.CC7;
import X.CCB;
import X.CCC;
import X.CCE;
import X.CCK;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.LHW;
import X.ViewOnClickListenerC28197B4v;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.AfS54S0200000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.GiftPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.NormalPollWidget;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveGiftPollDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PollManageDialog extends LiveDialogFragment implements CCE {
    public NormalPollWidget LJLIL;
    public GiftPollWidget LJLILLLLZI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 236));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.czr);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    public final CC7 vl() {
        DataChannel dataChannel;
        Room room;
        RoomAuthStatus roomAuthStatus;
        LivePollSetting livePollSetting = LivePollSetting.INSTANCE;
        if ((livePollSetting.enable(this.dataChannel) && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.enableGiftPoll == 1) || C29306Beo.LJJII(this.dataChannel)) {
            return CC7.ALL;
        }
        if (livePollSetting.enable(this.dataChannel)) {
            return CC7.ONLY_NORMAL;
        }
        return CC7.ONLY_GIFT;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // X.CCE
    public final void q(CCC type) {
        long j;
        long millisecond;
        String optionListString;
        long j2;
        long j3;
        Gift gift;
        Gift gift2;
        Long l;
        o.LJIIIZ(type, "type");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        if (type == CCC.GIFT) {
            millisecond = LiveGiftPollDurationSetting.INSTANCE.getMillisecond();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[\"");
            if (pollGifts != null && (gift2 = pollGifts.LJLIL) != null) {
                j2 = gift2.id;
            } else {
                j2 = 6246;
            }
            LIZ.append(j2);
            LIZ.append("\", \"");
            if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
                j3 = gift.id;
            } else {
                j3 = 6247;
            }
            optionListString = C0H1.LIZJ(LIZ, j3, "\"]", LIZ);
        } else {
            millisecond = LivePollDurationSetting.INSTANCE.getMillisecond();
            optionListString = LivePollSetting.INSTANCE.getOptionListString();
        }
        C1EW.LIZ(((PollApi) C1A.LIZJ(PollApi.class)).startPoll(j, optionListString, millisecond, type.ordinal())).LJJJLIIL(new AfS54S0200000_5(this, type, 23), CC6.LJLIL);
    }

    public final void wl(CCC ccc) {
        int i = CCB.LIZ[ccc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            InterfaceC30442Bx8.LIZIZ.LIZ(Integer.valueOf(CCC.GIFT.ordinal()));
            ((WidgetManager) this.LJLJI.getValue()).unload(this.LJLIL);
            ((WidgetManager) this.LJLJI.getValue()).load(R.id.duh, this.LJLILLLLZI);
            return;
        }
        InterfaceC30442Bx8.LIZIZ.LIZ(Integer.valueOf(CCC.NORMAL.ordinal()));
        ((WidgetManager) this.LJLJI.getValue()).unload(this.LJLILLLLZI);
        ((WidgetManager) this.LJLJI.getValue()).load(R.id.h3f, this.LJLIL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        String str;
        Resources resources;
        CCC ccc;
        int LIZ;
        Long l;
        Gift gift;
        Gift gift2;
        C78856UxA tabAt;
        TextView textView2;
        String str2;
        o.LJIIIZ(view, "view");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.kv0(BW6.class);
        }
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 194), _$_findCachedViewById(R.id.liz));
        this.LJLIL = new NormalPollWidget(this);
        this.LJLILLLLZI = new GiftPollWidget(this);
        _$_findCachedViewById(R.id.hw1).setVisibility(0);
        C78856UxA newTab = ((C80261Vej) _$_findCachedViewById(R.id.hw1)).newTab();
        newTab.LIZJ(R.layout.d5x);
        View view2 = newTab.LJFF;
        Long l2 = null;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.kyq);
        } else {
            textView = null;
        }
        if (textView != null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getQuantityString(R.plurals.lu, 1);
            } else {
                str = null;
            }
            textView.setText(str);
        }
        CCC ccc2 = CCC.GIFT;
        newTab.LIZ = Integer.valueOf(ccc2.ordinal());
        C78856UxA newTab2 = ((C80261Vej) _$_findCachedViewById(R.id.hw1)).newTab();
        newTab2.LIZJ(R.layout.d5x);
        View view3 = newTab2.LJFF;
        if (view3 != null && (textView2 = (TextView) view3.findViewById(R.id.kyq)) != null) {
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.nhv);
            } else {
                str2 = null;
            }
            textView2.setText(str2);
        }
        CCC ccc3 = CCC.NORMAL;
        newTab2.LIZ = Integer.valueOf(ccc3.ordinal());
        ((C80261Vej) _$_findCachedViewById(R.id.hw1)).addOnTabSelectedListener((LHW) new CC5(this));
        C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.ikd), new ViewOnClickListenerC28197B4v(C15380j0.LJIJ((int) (C15380j0.LJIIJJI() * 0.6f)) * 2, this));
        if (vl() == CC7.ALL) {
            ((C80261Vej) _$_findCachedViewById(R.id.hw1)).addTab(newTab2, false);
            ((ImageView) _$_findCachedViewById(R.id.ikd)).setVisibility(8);
            if (((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts() != null) {
                ((C80261Vej) _$_findCachedViewById(R.id.hw1)).addTab(newTab, false);
                ((ImageView) _$_findCachedViewById(R.id.ikd)).setVisibility(0);
            }
            if (((C80261Vej) _$_findCachedViewById(R.id.hw1)).getTabCount() <= 1) {
                C78856UxA tabAt2 = ((C80261Vej) _$_findCachedViewById(R.id.hw1)).getTabAt(0);
                if (tabAt2 != null) {
                    tabAt2.LIZIZ();
                }
                _$_findCachedViewById(R.id.hw1).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ikd)).setVisibility(8);
                _$_findCachedViewById(R.id.h3e).setVisibility(0);
            } else {
                if (((C80261Vej) _$_findCachedViewById(R.id.hw1)).getTabCount() >= 2) {
                    Integer LIZJ = InterfaceC30442Bx8.LIZIZ.LIZJ();
                    int ordinal = ccc2.ordinal();
                    if (LIZJ != null && LIZJ.intValue() == ordinal) {
                        C78856UxA tabAt3 = ((C80261Vej) _$_findCachedViewById(R.id.hw1)).getTabAt(ccc2.ordinal());
                        if (tabAt3 != null) {
                            tabAt3.LIZIZ();
                        }
                        ccc = ccc2;
                    }
                }
                if (((C80261Vej) _$_findCachedViewById(R.id.hw1)).getTabCount() >= 2) {
                    Integer LIZJ2 = InterfaceC30442Bx8.LIZIZ.LIZJ();
                    int ordinal2 = ccc3.ordinal();
                    if (LIZJ2 != null && LIZJ2.intValue() == ordinal2 && (tabAt = ((C80261Vej) _$_findCachedViewById(R.id.hw1)).getTabAt(ccc3.ordinal())) != null) {
                        tabAt.LIZIZ();
                    }
                }
            }
            ccc = ccc3;
        } else if (vl() == CC7.ONLY_NORMAL) {
            ((C80261Vej) _$_findCachedViewById(R.id.hw1)).addTab(newTab2, true);
            _$_findCachedViewById(R.id.hw1).setVisibility(8);
            _$_findCachedViewById(R.id.h3e).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ikd)).setVisibility(8);
            ccc = ccc3;
        } else {
            ((C80261Vej) _$_findCachedViewById(R.id.hw1)).addTab(newTab, true);
            ((ImageView) _$_findCachedViewById(R.id.ikd)).setVisibility(0);
            ccc = ccc2;
        }
        HashMap hashMap = new HashMap();
        CCK pollGifts = ((IGiftService) CN1.LIZ(IGiftService.class)).getPollGifts();
        String str3 = "gift_poll";
        if (C1I.LIZJ) {
            if (CC4.LIZ == ccc2) {
                hashMap.put("ongoing_type", "gift_poll");
                if (pollGifts != null && (gift2 = pollGifts.LJLIL) != null) {
                    l = Long.valueOf(gift2.id);
                } else {
                    l = null;
                }
                hashMap.put("gift_1_id", String.valueOf(l));
                if (pollGifts != null && (gift = pollGifts.LJLILLLLZI) != null) {
                    l2 = Long.valueOf(gift.id);
                }
                hashMap.put("gift_2_id", String.valueOf(l2));
            } else {
                hashMap.put("ongoing_type", "normal_poll");
            }
            hashMap.put("poll_id", String.valueOf(CC4.LIZIZ));
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_poll_panel_show");
        CC3.LIZLLL(LIZ2);
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(C1I.LIZJ ? 1 : 0), "is_ongoing");
        if (ccc != ccc2) {
            str3 = "normal_poll";
        }
        LIZ2.LJIJJ(str3, "poll_type");
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJJIIJZLJL();
        View findViewById = view.findViewById(R.id.hw2);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        DataChannel dataChannel2 = this.dataChannel;
        if ((CC4.LIZ(dataChannel2, ccc3) == null && !CC4.LIZLLL()) || (CC4.LIZ(dataChannel2, ccc2) == null && !CC4.LIZJ())) {
            LIZ = C15380j0.LIZ(375.0f);
        } else {
            LIZ = C15380j0.LIZ(294.0f);
        }
        layoutParams.height = LIZ;
        findViewById.setLayoutParams(layoutParams);
    }
}
