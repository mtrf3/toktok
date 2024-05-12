package com.bytedance.android.livesdk.toolbar;

import X.B83;
import X.BCW;
import X.BNK;
import X.C15380j0;
import X.C16310kV;
import X.C29374Bfu;
import X.C29726Bla;
import X.C30211BtP;
import X.CCJ;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import Y.AObjectS42S0101000_5;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveAudienceBottomToolsRtlSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveAudienceBottomToolsRtlSettingV2;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class LiveAudienceToolbarWidget extends RoomRecycleWidget {
    public static final int LJLJL = C15380j0.LIZ(8.0f);
    public static final int LJLJLJ = C15380j0.LIZ(4.0f);
    public View LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public EnumC30226Bte LJLJJLL;
    public List<EnumC30204BtI> LJLIL = new ArrayList();
    public boolean LJLJJL = false;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dl8;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        this.LJLIL.clear();
        ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel).N0(this.dataChannel);
    }

    public EnumC30226Bte LJZ(boolean z) {
        if (z) {
            return EnumC30226Bte.ICON_WITH_TEXT;
        }
        return EnumC30226Bte.ICON;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        this.LJLILLLLZI = getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object... objArr) {
        View view;
        super.onLoad(objArr);
        this.LJLJI = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.LJLJJI = ((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue();
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        hashMap.put("room_id", Long.valueOf(((Room) this.dataChannel.kv0(RoomChannel.class)).getId()));
        Map<String, Object> map = C30211BtP.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(hashMap);
        int i = 0;
        if (LiveAudienceBottomToolsRtlSetting.getValue() == 0) {
            View view2 = getView();
            this.LJLILLLLZI = view2;
            C16310kV.LJIIIZ(view2, 0);
        }
        this.LJLJI = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.LJLJJI = ((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.dataChannel.kv0(BNK.class));
        this.LJLJJL = equals;
        this.LJLJJLL = LJZ(equals);
        this.dataChannel.ov0(this, DutyGiftChangedEvent.class, new AObjectS42S0101000_5(2, this, 12));
        if (objArr != null) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    this.LJLIL = (List) obj;
                }
            }
            int length = objArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Object obj2 = objArr[i2];
                if (obj2 instanceof C29726Bla) {
                    C30211BtP.LIZJ = ((C29726Bla) obj2).LIZ;
                    break;
                }
                i2++;
            }
        }
        if (CCJ.LIZ(this.context) && !LiveAudienceBottomToolsRtlSettingV2.isNotSupportRtl() && LiveAudienceBottomToolsRtlSetting.getValue() == 0) {
            Collections.reverse(this.LJLIL);
        }
        LJLZ(this.LJLIL, this.LJLJJLL);
        if (this.context != null && !this.LJLJI && (view = this.contentView) != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.contentView.getLayoutParams();
            if (!this.LJLJJI && CCJ.LIZ(this.context) && !LiveAudienceBottomToolsRtlSettingV2.isNotSupportRtl()) {
                marginLayoutParams.leftMargin = LJLJL;
                if (this.LJLJJL) {
                    i = LJLJLJ;
                }
                marginLayoutParams.rightMargin = i;
            }
            this.contentView.setLayoutParams(marginLayoutParams);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C30211BtP.LIZ);
        long j = C30211BtP.LIZJ;
        long j2 = -1;
        if (j != -1) {
            j2 = elapsedRealtime - j;
        }
        linkedHashMap.put("duration", Long.valueOf(j2));
        C30211BtP.LIZIZ("audience_widget_load_finished", linkedHashMap);
    }

    public void LJLZ(List<EnumC30204BtI> list, EnumC30226Bte enumC30226Bte) {
        if (ToolBarRefactor.enable()) {
            if (this.LJLILLLLZI instanceof ViewGroup) {
                ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel).LJIIIZ(this.dataChannel, EnumC30206BtK.RIGHT, (ViewGroup) this.LJLILLLLZI);
                return;
            }
            return;
        }
        View view = this.LJLILLLLZI;
        if (view instanceof RecyclerView) {
            ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel).LJI(this.dataChannel, this.LJLILLLLZI, list, enumC30226Bte, EnumC30206BtK.RIGHT);
        } else {
            if (!(view instanceof LinearLayout)) {
                return;
            }
            EnumC30206BtK.RIGHT.createHolder(this.dataChannel, (ViewGroup) view, list, enumC30226Bte);
        }
    }
}
