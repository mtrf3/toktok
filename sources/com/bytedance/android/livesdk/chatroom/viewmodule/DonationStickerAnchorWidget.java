package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.B76;
import X.BY0;
import X.C113554cx;
import X.C16880lQ;
import X.C1A;
import X.C1EW;
import X.C28329B9x;
import X.C28953BXx;
import X.C28954BXy;
import X.C30079BrH;
import X.C73318Sq2;
import X.C73411SrX;
import X.CCJ;
import X.InterfaceC28955BXz;
import X.OSZ;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.event.DonationStickerAnchorEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.message.DonationInfoMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DonationStickerAnchorWidget extends LiveRecyclableWidget implements InterfaceC28955BXz, ILayer2PriorityWidget {
    public Layer2PriorityManager LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public BY0 LJLJI;
    public RoomDecoration LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public View LJLJLJ;
    public C73411SrX LJLJLLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.di8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return DonationStickerAnchorWidget.class.getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final void hideWidget() {
        this.LJLIL.hideWidget(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLIL.getDonationSticker().setWidget(null);
        this.LJLJJI = null;
        BY0 by0 = this.LJLJI;
        if (by0 != null) {
            by0.detachView();
        }
        this.LJLILLLLZI.LIZLLL();
        C73411SrX c73411SrX = this.LJLJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final void showWidget() {
        this.LJLIL.showWidget(this);
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            B76.LIZJ(room, "donation");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ILayer2PriorityWidget
    public final View rootView() {
        return getView();
    }

    public DonationStickerAnchorWidget(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        this.LJLIL = layer2PriorityManager;
        this.LJLILLLLZI = new C73318Sq2();
    }

    @Override // X.InterfaceC28955BXz
    public final void K50(DonationInfoMessage donationInfoMessage) {
        o.LJIIIZ(donationInfoMessage, "donationInfoMessage");
        LJLZ(donationInfoMessage.totalUser, donationInfoMessage.currency, donationInfoMessage.totalMoney);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... args) {
        o.LJIIIZ(args, "args");
        super.initConstructor(Arrays.copyOf(args, args.length));
        Object obj = args[0];
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.ies.sdk.widgets.Layer2PriorityManager");
        this.LJLIL = (Layer2PriorityManager) obj;
    }

    public final void onEvent(C28954BXy c28954BXy) {
        OrganizationModel organizationModel;
        String str;
        Room room;
        if (c28954BXy.LIZIZ) {
            showWidget();
            RoomDecoration roomDecoration = this.LJLJJI;
            if (roomDecoration != null && roomDecoration.id == c28954BXy.LIZ.id) {
                return;
            }
            RoomDecoration roomDecoration2 = c28954BXy.LIZ;
            this.LJLJJI = roomDecoration2;
            if (roomDecoration2 != null) {
                organizationModel = roomDecoration2.LIZ();
            } else {
                organizationModel = null;
            }
            TextView textView = this.LJLJJL;
            if (textView != null) {
                if (organizationModel == null || (str = organizationModel.name) == null) {
                    str = "";
                }
                textView.setText(str);
            }
            TextView textView2 = this.LJLJL;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.LJLJJLL;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            View view = this.LJLJLJ;
            if (view != null) {
                view.setVisibility(8);
            }
            C73411SrX c73411SrX = this.LJLJLLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
                return;
            }
            this.LJLJLLL = (C73411SrX) C1EW.LIZ(((DecorationApi) C1A.LIZJ(DecorationApi.class)).getRoomDonationInfo(C113554cx.LJJL(new OSZ("room_id", Long.valueOf(room.getId())), new OSZ("anchor_id", Long.valueOf(room.getOwnerUserId())), new OSZ("donation_entrance", 1L)))).LJJJLIIL(new AfS57S0100000_5(this, 83), C28953BXx.LJLIL);
            return;
        }
        C73411SrX c73411SrX2 = this.LJLJLLL;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        hideWidget();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJJL = (TextView) findViewById(R.id.j6p);
        this.LJLJJLL = (TextView) findViewById(R.id.j6q);
        this.LJLJL = (TextView) findViewById(R.id.j6n);
        this.LJLJLJ = findViewById(R.id.j6r);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i;
        Object obj;
        this.LJLIL.getDonationSticker().setWidget(this);
        hideWidget();
        if (CCJ.LIZ(getContext())) {
            i = 8388629;
        } else {
            i = 8388627;
        }
        TextView textView = this.LJLJJL;
        if (textView != null) {
            textView.setGravity(i);
        }
        TextView textView2 = this.LJLJJLL;
        if (textView2 != null) {
            textView2.setGravity(i);
        }
        BY0 by0 = new BY0();
        this.LJLJI = by0;
        by0.attachView(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, DonationStickerAnchorEvent.class, new AqS171S0100000_5(this, 320));
        }
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 135), view);
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && (obj = ((C30079BrH) obj2).LIZ) != null) {
                    if (obj instanceof IMessage) {
                        if (obj != null) {
                            IMessage iMessage = (IMessage) obj;
                            BY0 by02 = this.LJLJI;
                            if (by02 != null) {
                                by02.onMessage(iMessage);
                            }
                        }
                    } else if (obj instanceof C28954BXy) {
                        onEvent((C28954BXy) obj);
                    }
                }
            }
        }
    }

    public final void LJLZ(long j, String str, String str2) {
        if (this.LJLJJI == null || !isShowing()) {
            return;
        }
        C73411SrX c73411SrX = this.LJLJLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        TextView textView = this.LJLJL;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.LJLJJLL;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        View view = this.LJLJLJ;
        if (view != null) {
            view.setVisibility(0);
        }
        TextView textView3 = this.LJLJJL;
        if (textView3 != null) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            textView3.setText(sb);
        }
        TextView textView4 = this.LJLJJLL;
        if (textView4 == null) {
            return;
        }
        textView4.setText(C28329B9x.LIZ(j));
    }
}
