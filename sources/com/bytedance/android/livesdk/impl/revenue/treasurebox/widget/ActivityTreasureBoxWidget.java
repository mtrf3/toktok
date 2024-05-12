package com.bytedance.android.livesdk.impl.revenue.treasurebox.widget;

import X.B83;
import X.BCW;
import X.BS0;
import X.BS1;
import X.BS3;
import X.C09650Zl;
import X.C0K2;
import X.C0NB;
import X.C15490jB;
import X.C15650jR;
import X.C221108m2;
import X.C28794BRu;
import X.C28798BRy;
import X.C28799BRz;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C30892CAm;
import X.C31220CNc;
import X.C47061t0;
import X.C5H3;
import X.C72818Shy;
import X.C76052yf;
import X.C78528Urs;
import X.C78720Uuy;
import X.CFX;
import X.CN1;
import X.EnumC221088m0;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.UFE;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.InitEnvelopeListChannel;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxMessage4FE;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOpt;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeSkinSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.TreasureBoxAnimationImageSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ActivityTreasureBoxWidget extends LiveRecyclableWidget implements BS3 {
    public C47061t0 LJLIL;
    public final C5H3 LJLILLLLZI = C221108m2.LIZ(EnumC221088m0.NONE, C28798BRy.LJLIL);
    public boolean LJLJI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final BS1 LJZ() {
        return (BS1) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleRevenueWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        LJZ().onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        LJZ().onResume();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C30892CAm Yd0;
        LJZ().LIZ();
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZ();
        }
        C47061t0 c47061t0 = this.LJLIL;
        if (c47061t0 != null) {
            C29306Beo.LJJIJIIJIL(c47061t0);
        }
    }

    public final Map<String, String> LJLZ(int i) {
        Map<String, String> map = null;
        for (Map<String, String> map2 : TreasureBoxAnimationImageSetting.INSTANCE.getValue()) {
            String str = map2.get("business_type");
            if (str != null && CastIntegerProtector.parseInt(str) == i) {
                map = map2;
            }
        }
        return map;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = new C47061t0(this.context);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        DataChannel dataChannel;
        Boolean bool;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(BCW.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJI = z;
        BS1 LJZ = LJZ();
        DataChannel dataChannel3 = this.dataChannel;
        o.LJIIIIZZ(dataChannel3, "dataChannel");
        LJZ.LIZLLL(dataChannel3, this);
        if (GetTreasureBoxListOpt.INSTANCE.getValue() && (dataChannel = this.dataChannel) != null) {
            dataChannel.lv0(this, InitEnvelopeListChannel.class, new AqS171S0100000_5(this, 894));
        }
    }

    @Override // X.BS3
    public final void LJJ(Map map, String str) {
        Integer num;
        int i;
        int i2;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        Integer valueOf;
        String str2;
        Map<String, String> map2;
        BS0 bs0;
        Integer valueOf2;
        String str3;
        Map<String, String> map3;
        Integer num2;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (entry.getKey() != null) {
                int i3 = 0;
                ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE = ((ActivityTreasureBoxMessage4FE) ListProtector.get(((ActivityTreasureBoxInfoModel4FE) entry.getValue()).envelopList, 0)).envelopInfo;
                if (activityTreasureBoxInfo4FE == null || (num2 = activityTreasureBoxInfo4FE.businessType) == null || num2.intValue() != 4) {
                    ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE2 = ((ActivityTreasureBoxMessage4FE) ListProtector.get(((ActivityTreasureBoxInfoModel4FE) entry.getValue()).envelopList, 0)).envelopInfo;
                    if (activityTreasureBoxInfo4FE2 != null) {
                        num = activityTreasureBoxInfo4FE2.businessType;
                    } else {
                        num = null;
                    }
                    Gson gson = C09650Zl.LIZIZ;
                    Integer num3 = (Integer) entry.getKey();
                    if (num3 != null) {
                        i = num3.intValue();
                    } else {
                        i = 0;
                    }
                    Map<String, String> LJLZ = LJLZ(i);
                    if (LJLZ == null) {
                        return;
                    }
                    String json = GsonProtectorUtils.toJson(gson, entry.getValue());
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                    BS1 LJZ = LJZ();
                    Integer num4 = (Integer) entry.getKey();
                    if (num4 != null) {
                        i2 = num4.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (LJZ.LIZJ(i2)) {
                        C0NB.LIZIZ("ActivityTreasureBoxWidget", "notify envelope data change");
                        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(new JSONObject(json)), "EVENT_TREASUREBOX_UPDATE"));
                        HashMap hashMap = new HashMap(11);
                        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        if (room != null) {
                            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                            hashMap.put("room_id", Long.valueOf(room.getId()));
                        }
                        B83 LIZ = B83.LIZ();
                        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
                        }
                        C0K2.LJII(0, "ttlive_treasure_box_activity_update_event_received", hashMap);
                    } else {
                        C0NB.LIZIZ("ActivityTreasureBoxWidget", "notify envelope data created");
                        C28799BRz c28799BRz = new C28799BRz(this, str, entry);
                        if (num == null || num.intValue() != 6) {
                            ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE3 = ((ActivityTreasureBoxMessage4FE) ListProtector.get(((ActivityTreasureBoxInfoModel4FE) entry.getValue()).envelopList, 0)).envelopInfo;
                            if (activityTreasureBoxInfo4FE3 != null && (valueOf2 = Integer.valueOf(activityTreasureBoxInfo4FE3.skinId)) != null) {
                                int intValue = valueOf2.intValue();
                                Map<String, Map<String, String>> value = RedEnvelopeSkinSetting.INSTANCE.getValue();
                                if (value != null && (map3 = value.get(String.valueOf(intValue))) != null) {
                                    str3 = map3.get("shorttouch_appear_img");
                                } else {
                                    str3 = null;
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    C78720Uuy url = C15650jR.LIZ().setUrl(str3);
                                    url.LJIJ = true;
                                    url.LJIJI = Boolean.FALSE;
                                    url.LJIIJJI = c28799BRz;
                                    url.LIZLLL(scaleType);
                                    url.LJIIJJI(this.LJLIL);
                                } else {
                                    C15490jB.LJFF(this.LJLIL, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_normal_1"), LJLZ.get("effect_url"), ImageView.ScaleType.CENTER_CROP, c28799BRz);
                                }
                            }
                        } else {
                            ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE4 = ((ActivityTreasureBoxMessage4FE) ListProtector.get(((ActivityTreasureBoxInfoModel4FE) entry.getValue()).envelopList, 0)).envelopInfo;
                            if (activityTreasureBoxInfo4FE4 != null && (valueOf = Integer.valueOf(activityTreasureBoxInfo4FE4.skinId)) != null) {
                                int intValue2 = valueOf.intValue();
                                Map<String, Map<String, String>> value2 = RedEnvelopeSkinSetting.INSTANCE.getValue();
                                if (value2 != null && (map2 = value2.get(String.valueOf(intValue2))) != null) {
                                    str2 = map2.get("shorttouch_appear_img");
                                } else {
                                    str2 = null;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    C78720Uuy url2 = C15650jR.LIZ().setUrl(str2);
                                    url2.LJIJ = true;
                                    url2.LJIJI = Boolean.FALSE;
                                    url2.LJIIJJI = c28799BRz;
                                    url2.LIZLLL(scaleType);
                                    url2.LJIIJJI(this.LJLIL);
                                } else {
                                    Map<String, String> LJLZ2 = LJLZ(num.intValue());
                                    if (LJLZ2 == null) {
                                        return;
                                    } else {
                                        C15490jB.LJFF(this.LJLIL, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_normal_1"), LJLZ2.get("effect_url"), ImageView.ScaleType.CENTER_CROP, c28799BRz);
                                    }
                                }
                            }
                        }
                        String str4 = LJLZ.get("short_touch");
                        if (str4 == null) {
                            return;
                        }
                        Uri uri = UriProtector.parse(str4).buildUpon().appendQueryParameter("initial_data", json).build();
                        String str5 = LJLZ.get("type_name");
                        if (str5 != null) {
                            IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
                            Context context = this.context;
                            o.LJIIIIZZ(uri, "uri");
                            C31220CNc FX = iShortTouchService.FX(context, uri, str5, true);
                            if (FX == null) {
                                C28794BRu.LIZ(Boolean.valueOf(LJZ().isAnchor()), "shortTouchView create fail", ((ActivityTreasureBoxInfoModel4FE) entry.getValue()).envelopList);
                                if (FX != null) {
                                }
                            }
                            BS1 LJZ2 = LJZ();
                            Integer num5 = (Integer) entry.getKey();
                            if (num5 != null) {
                                i3 = num5.intValue();
                            }
                            LJZ2.LJ(i3, FX.LIZ());
                            IShortTouchService iShortTouchService2 = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
                            if (this.LJLJI && this.LJLIL != null) {
                                bs0 = new BS0(this);
                            } else {
                                bs0 = null;
                            }
                            iShortTouchService2.B10(FX, bs0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
