package com.bytedance.android.live.rank.impl.setting;

import X.B9K;
import X.BCW;
import X.BJV;
import X.BJW;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C28507BGt;
import X.C28569BJd;
import X.C28573BJh;
import X.C28574BJi;
import X.C29025BaH;
import X.C29306Beo;
import X.C41071jL;
import X.C47121t6;
import X.C62822Ol8;
import X.CCJ;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.impl.AudienceRankSettingEvent;
import com.bytedance.android.livesdk.rank.impl.GiftRankSettingEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NewRankSettingDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLLI = 0;
    public boolean LJLILLLLZI;
    public C47121t6 LJLJI;
    public FrameLayout LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public C41071jL LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 67));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        Boolean bool;
        int i;
        int i2;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        boolean LJJ = C29306Beo.LJJ(bool);
        C28507BGt c28507BGt = new C28507BGt(R.layout.czn);
        if (LJJ) {
            i = R.style.aai;
        } else if (CCJ.LIZ(getContext())) {
            i = R.style.aam;
        } else {
            i = R.style.aan;
        }
        c28507BGt.LIZJ = i;
        if (LJJ) {
            i2 = 80;
        } else if (CCJ.LIZ(getContext())) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        c28507BGt.LJII = i2;
        c28507BGt.LJI = 0.0f;
        int LIZJ = B9K.LIZJ(getContext());
        c28507BGt.LJIIIZ = -1;
        if (LJJ) {
            LIZJ = -1;
        }
        c28507BGt.LJIIJ = LIZJ;
        return c28507BGt;
    }

    public final void vl() {
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.pv0(GiftRankSettingEvent.class);
                return;
            }
            return;
        }
        if (this.LJLILLLLZI) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.qv0(AudienceRankSettingEvent.class, Boolean.TRUE);
            return;
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.qv0(AudienceRankSettingEvent.class, Boolean.FALSE);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        BJW LIZ;
        RoomAuthStatus roomAuthStatus;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_from_lynx_audience_list");
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        this.LJLJI = (C47121t6) view.findViewById(R.id.m5c);
        this.LJLJJI = (FrameLayout) view.findViewById(R.id.dg4);
        this.LJLJJL = (C47121t6) view.findViewById(R.id.mgh);
        this.LJLJJLL = (C47121t6) view.findViewById(R.id.mgg);
        this.LJLJL = (C41071jL) view.findViewById(R.id.imz);
        this.LJLJLJ = view.findViewById(R.id.liz);
        this.LJLJLLL = view.findViewById(R.id.lj0);
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            C47121t6 c47121t6 = this.LJLJI;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.ml5));
            }
            C47121t6 c47121t62 = this.LJLJJL;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.nsh));
            }
            C47121t6 c47121t63 = this.LJLJJLL;
            if (c47121t63 != null) {
                c47121t63.setText(C15380j0.LJIILJJIL(R.string.nsg));
            }
        } else {
            C47121t6 c47121t64 = this.LJLJI;
            if (c47121t64 != null) {
                c47121t64.setText(C15380j0.LJIILJJIL(R.string.t0s));
            }
            C47121t6 c47121t65 = this.LJLJJL;
            if (c47121t65 != null) {
                c47121t65.setText(C15380j0.LJIILJJIL(R.string.nsk));
            }
            C47121t6 c47121t66 = this.LJLJJLL;
            if (c47121t66 != null) {
                c47121t66.setText(C15380j0.LJIILJJIL(R.string.nsj));
            }
        }
        C41071jL c41071jL = this.LJLJL;
        if (c41071jL != null) {
            long j = 0;
            if (C29306Beo.LJIIJ(this.dataChannel)) {
                BJV bjv = BJW.Companion;
                Room room = (Room) this.LJLIL.getValue();
                if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null) {
                    j = roomAuthStatus.getGiftRankSwitchStatus();
                }
                bjv.getClass();
                LIZ = BJV.LIZ(j);
            } else {
                BJV bjv2 = BJW.Companion;
                Long l = (Long) DataChannelGlobal.LJLJJI.mv0(C29025BaH.class);
                if (l != null) {
                    j = l.longValue();
                }
                bjv2.getClass();
                LIZ = BJV.LIZ(j);
            }
            if (LIZ == BJW.RANK_SWITCH_STATUS_ON) {
                z2 = true;
            }
            c41071jL.setChecked(z2);
        }
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new C28569BJd(this));
        }
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            C16880lQ.LJIIJ(new C28573BJh(this), view2);
        }
        View view3 = this.LJLJLLL;
        if (view3 != null) {
            C16880lQ.LJIIJ(new C28574BJi(this), view3);
        }
    }
}
