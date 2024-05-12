package com.bytedance.android.livesdk.toolbar;

import X.BCW;
import X.BNK;
import X.C15380j0;
import X.C16310kV;
import X.C29726Bla;
import X.C30211BtP;
import X.CCJ;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import Y.AObjectS42S0101000_5;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorBottomToolsRtlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class LiveToolbarWidget extends LiveRecyclableWidget {
    public static final int LJLJL = C15380j0.LIZ(8.0f);
    public static final int LJLJLJ = C15380j0.LIZ(4.0f);
    public List<EnumC30204BtI> LJLIL = new ArrayList();
    public LinearLayout LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public EnumC30226Bte LJLJJLL;

    public void LJLZ() {
    }

    public void LJZ() {
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dl8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJZI() {
        EnumC30206BtK.RIGHT.createHolder(this.dataChannel, this.LJLILLLLZI, this.LJLIL, this.LJLJJLL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        this.LJLIL.clear();
        ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel).releaseAll();
    }

    public LinearLayout LJZL() {
        return (LinearLayout) getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object... objArr) {
        this.LJLJI = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.LJLJJI = ((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue();
        this.LJLILLLLZI = LJZL();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object... objArr) {
        this.LJLJI = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        int i = 0;
        if (LiveAnchorBottomToolsRtlSetting.getValue() == 0) {
            C16310kV.LJIIIZ(this.LJLILLLLZI, 0);
        }
        this.LJLJJI = ((Boolean) this.dataChannel.kv0(BCW.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.dataChannel.kv0(BNK.class));
        this.LJLJJL = equals;
        if (equals) {
            this.LJLJJLL = EnumC30226Bte.ICON_WITH_TEXT;
            LJZ();
        } else {
            this.LJLJJLL = EnumC30226Bte.ICON;
            LJLZ();
        }
        this.dataChannel.ov0(this, DutyGiftChangedEvent.class, new AObjectS42S0101000_5(3, this, 47));
        if (objArr != null) {
            if (objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    this.LJLIL = (List) obj;
                    if (LiveAnchorBottomToolsRtlSetting.getValue() == 2 && CCJ.LIZ(this.context)) {
                        Collections.reverse(this.LJLIL);
                    }
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
                    C30211BtP.LIZLLL = ((C29726Bla) obj2).LIZ;
                    break;
                }
                i2++;
            }
        }
        LJZI();
        if (this.context != null && !this.LJLJI && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (this.LJLJJI || !CCJ.LIZ(this.context)) {
                marginLayoutParams.rightMargin = LJLJL;
                if (this.LJLJJL) {
                    i = LJLJLJ;
                }
                marginLayoutParams.leftMargin = i;
            } else {
                marginLayoutParams.leftMargin = LJLJL;
                if (this.LJLJJL) {
                    i = LJLJLJ;
                }
                marginLayoutParams.rightMargin = i;
            }
            getView().setLayoutParams(marginLayoutParams);
        }
        if (!ToolBarButtonWithTextExperiment.hasText() && this.context != null && this.LJLJI && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && CCJ.LIZ(this.context)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (this.LJLJJI) {
                marginLayoutParams2.leftMargin = LJLJL;
            }
            getView().setLayoutParams(marginLayoutParams2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C30211BtP.LIZ);
        long j = C30211BtP.LIZLLL;
        long j2 = -1;
        if (j != -1) {
            j2 = elapsedRealtime - j;
        }
        linkedHashMap.put("duration", Long.valueOf(j2));
        C30211BtP.LIZIZ("broadcast_widget_load_finished", linkedHashMap);
    }
}
