package com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest;

import X.C29306Beo;
import X.C31657Cbd;
import X.C31811Ce7;
import X.C65352Pkq;
import X.C74846TZa;
import X.C75035Tcd;
import X.InterfaceC74236TBo;
import X.TBT;
import X.TRW;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestAsGuestModeratorsWidget extends LiveWidget implements TRW {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final Room LJLIL;
    public C74846TZa LJLILLLLZI;
    public MultiGuestAsGuestModeratorManageDialog LJLJI;
    public final C31657Cbd LJLJJI = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");

    static {
        TBT tbt = new TBT(MultiGuestAsGuestModeratorsWidget.class, "dataHolder", "getDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TRW
    public final void ZZ() {
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 393);
        if (isViewValid()) {
            aqS163S0100000_13.invoke();
        }
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return MultiGuestAsGuestModeratorsWidget.class.getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C31811Ce7.LIZLLL("MultiGuestAsGuestModeratorsWidget", "onCreate");
        super.onCreate();
        Room room = this.LJLIL;
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        C74846TZa c74846TZa = new C74846TZa(room, dataChannel, this);
        this.LJLILLLLZI = c74846TZa;
        c74846TZa.attachView(this);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, OpenMultiGuestModeratorsManageDialogEvent.class, new AqS179S0100000_13(this, 167));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C31811Ce7.LIZLLL("MultiGuestAsGuestModeratorsWidget", "onDestroy");
        super.onDestroy();
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = this.LJLJI;
        if (multiGuestAsGuestModeratorManageDialog != null) {
            C29306Beo.LJJJJ(multiGuestAsGuestModeratorManageDialog);
        }
        C74846TZa c74846TZa = this.LJLILLLLZI;
        if (c74846TZa != null) {
            c74846TZa.detachView();
        }
    }

    @Override // X.TRW
    public final void oo0() {
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 393);
        if (isViewValid()) {
            aqS163S0100000_13.invoke();
        }
    }

    @Override // X.TRW
    public final /* bridge */ /* synthetic */ Boolean isViewValid() {
        return Boolean.valueOf(isViewValid());
    }

    public MultiGuestAsGuestModeratorsWidget(Room room) {
        this.LJLIL = room;
    }

    @Override // X.TRW
    public final void v9(String str) {
        C75035Tcd c75035Tcd = new C75035Tcd(str);
        if (isViewValid()) {
            c75035Tcd.invoke();
        }
    }
}
