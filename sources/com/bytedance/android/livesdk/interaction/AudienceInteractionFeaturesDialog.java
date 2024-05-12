package com.bytedance.android.livesdk.interaction;

import X.BEF;
import X.BV1;
import X.BW8;
import X.BWO;
import X.BZI;
import X.C04130Ef;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C30627C0h;
import X.C41081jM;
import X.C79146V4k;
import X.EnumC30204BtI;
import X.EnumC30208BtM;
import X.J9A;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS31S0300000_5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionDialogQARedPointChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AudienceInteractionFeaturesDialog extends LiveDialogFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final BWO LJLIL = new BWO(this);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cvu);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            C30627C0h.LJIJ(room.getId(), this.LJLIL);
        }
        super.onDestroy();
    }

    public final void vl(EnumC30208BtM function) {
        o.LJIIIZ(function, "function");
        int i = BW8.LIZ[function.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.ft4));
            return;
        }
        C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.igy));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BEF bef;
        Room room;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.CUSTOM_POLL;
        if (!enumC30204BtI.isShowing(this.dataChannel) && enumC30204BtI.isShowingInInteractionDialog(this.dataChannel)) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.c25);
            ((C41081jM) _$_findCachedViewById.findViewById(R.id.e_q)).setImageResource(R.drawable.d4t);
            DataChannel dataChannel = this.dataChannel;
            Boolean bool = null;
            if (dataChannel != null) {
                bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class);
            } else {
                bef = null;
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                bool = Boolean.valueOf(C79146V4k.LJJJI(dataChannel2));
            }
            if (C29306Beo.LJJIFFI(bool)) {
                ((TextView) _$_findCachedViewById.findViewById(R.id.title)).setText(R.string.kpw);
                ((TextView) _$_findCachedViewById.findViewById(R.id.desc)).setText(R.string.kpv);
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 != null) {
                    dataChannel3.lv0(this, LiveBanCapabilityChannel.class, new AqS171S0100000_5(_$_findCachedViewById, 16));
                }
                if (bef != null && bef.LJLJJI) {
                    _$_findCachedViewById.findViewById(R.id.e_q).setAlpha(0.34f);
                    _$_findCachedViewById.findViewById(R.id.title).setAlpha(0.34f);
                    _$_findCachedViewById.findViewById(R.id.desc).setAlpha(0.34f);
                } else {
                    _$_findCachedViewById.findViewById(R.id.e_q).setAlpha(1.0f);
                    _$_findCachedViewById.findViewById(R.id.title).setAlpha(1.0f);
                    _$_findCachedViewById.findViewById(R.id.desc).setAlpha(1.0f);
                }
            } else {
                ((TextView) _$_findCachedViewById.findViewById(R.id.title)).setText(R.string.oij);
                ((TextView) _$_findCachedViewById.findViewById(R.id.desc)).setText(R.string.kq2);
            }
            C04130Ef.LJI(this.dataChannel, "interaction_panel", false, false, 60);
            C29306Beo.LJJLJLI(_$_findCachedViewById);
            C16880lQ.LJIIJ(new ACListenerS31S0300000_5(this, bef, _$_findCachedViewById, 2), _$_findCachedViewById);
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null && (room = (Room) dataChannel4.kv0(RoomChannel.class)) != null) {
                if (C30627C0h.LJII(room.getId())) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById.findViewById(R.id.c0x));
                } else {
                    C29306Beo.LJI(_$_findCachedViewById.findViewById(R.id.c0x));
                }
                C30627C0h.LJIILLIIL(room.getId(), this.LJLIL);
            }
        }
        EnumC30204BtI enumC30204BtI2 = EnumC30204BtI.MULTIGUEST;
        if (!enumC30204BtI2.isShowing(this.dataChannel) && enumC30204BtI2.isShowingInInteractionDialog(this.dataChannel)) {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.ft4);
            ((C41081jM) _$_findCachedViewById2.findViewById(R.id.e_q)).setImageResource(R.drawable.d6c);
            ((TextView) _$_findCachedViewById2.findViewById(R.id.title)).setText(R.string.on4);
            ((TextView) _$_findCachedViewById2.findViewById(R.id.desc)).setText(R.string.on3);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 9), _$_findCachedViewById2);
            BZI LIZ = C28787BRn.LIZ("livesdk_guest_connection_icon_show");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ("interaction_entrance", "request_page");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                LIZ.LJJIIJZLJL();
            } else {
                LIZ.LJJIJ();
                LIZ.LJJIIZI();
            }
            vl(EnumC30208BtM.LINK_HOST);
        }
        if (!BV1.LJ(this.dataChannel) || (BV1.LJ(this.dataChannel) && BV1.LIZLLL(this.dataChannel))) {
            EnumC30204BtI enumC30204BtI3 = EnumC30204BtI.QUESTION;
            if (!enumC30204BtI3.isShowing(this.dataChannel) && enumC30204BtI3.isShowingInInteractionDialog(this.dataChannel)) {
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.igy);
                ((C41081jM) _$_findCachedViewById3.findViewById(R.id.e_q)).setImageResource(R.drawable.d4v);
                ((TextView) _$_findCachedViewById3.findViewById(R.id.title)).setText(R.string.ng3);
                ((TextView) _$_findCachedViewById3.findViewById(R.id.desc)).setText(R.string.ms9);
                DataChannel dataChannel5 = this.dataChannel;
                if (dataChannel5 != null) {
                    dataChannel5.ov0(this, ShowAudienceInteractionDialogQARedPointChannel.class, new AqS171S0100000_5(_$_findCachedViewById3, 18));
                }
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 10), _$_findCachedViewById3);
                J9A.LIZJ(C28787BRn.LIZ("livesdk_qa_entrance_show"), this.dataChannel, "interaction_entrance", "request_page");
                vl(EnumC30208BtM.QUESTION);
            }
        }
    }
}
