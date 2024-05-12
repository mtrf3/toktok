package com.bytedance.android.livesdk.mvp;

import X.B4M;
import X.B57;
import X.BK4;
import X.BK5;
import X.BK6;
import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C28507BGt;
import X.C28787BRn;
import X.C2A7;
import X.C2NU;
import X.C31665Cbl;
import X.C41081jM;
import X.C48690J9a;
import X.C65814PsI;
import X.C73318Sq2;
import X.CVT;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AfS25S0110000_5;
import Y.AfS57S0100000_5;
import Y.IDObjectS178S0100000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.PaidRoomChannel;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PaidRoomCheckDialog extends LiveDialogFragment implements WeakHandler.IHandler {
    public static final BK5 Companion = new BK5();
    public int counts;
    public EnterRoomConfig enterRoomConfig;
    public InputFilter mFilter;
    public boolean mIsHide;
    public long roomId;
    public boolean status;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C73318Sq2 disposable = new C73318Sq2();
    public boolean isInput = true;
    public String mInput = "";
    public final Handler mHandler = new WeakHandler(this);
    public final TextWatcher mTextWatcher = new IDObjectS178S0100000_5(this, 5);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC12810er
    public /* bridge */ /* synthetic */ int getThemeOverlay(Context context) {
        return C48690J9a.LIZIZ(context);
    }

    public /* bridge */ /* synthetic */ boolean isLight(Context context) {
        return C48690J9a.LIZJ(this, context);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cw0);
        c28507BGt.LIZIZ = 0;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        c28507BGt.LJ = false;
        return c28507BGt;
    }

    public final void loadError() {
        ((ViewStub) _$_findCachedViewById(R.id.cy2)).inflate();
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.izm), new ACListenerS25S0100000_5(this, 222));
    }

    public final void loadErrorMsg() {
        if (INVOKESTATIC_com_bytedance_android_livesdk_mvp_PaidRoomCheckDialog_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(getContext())) {
            ((C41081jM) _$_findCachedViewById(R.id.cy3)).setBackground(C15380j0.LJI(R.drawable.dag));
            ((TextView) _$_findCachedViewById(R.id.title)).setText(C15380j0.LJIILJJIL(R.string.ox5));
            ((TextView) _$_findCachedViewById(R.id.bst)).setText(C15380j0.LJIILJJIL(R.string.osk));
            return;
        }
        ((C41081jM) _$_findCachedViewById(R.id.cy3)).setBackground(C15380j0.LJI(R.drawable.d_j));
        ((TextView) _$_findCachedViewById(R.id.title)).setText(C15380j0.LJIILJJIL(R.string.ng6));
        TextView textView = (TextView) _$_findCachedViewById(R.id.bst);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C15380j0.LJIILJJIL(R.string.ng7));
        LIZ.append(' ');
        LIZ.append(C15380j0.LJIILJJIL(R.string.osk));
        textView.setText(X1D.LIZIZ(LIZ));
    }

    public static boolean INVOKESTATIC_com_bytedance_android_livesdk_mvp_PaidRoomCheckDialog_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void checkCode(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.LogData logData;
        EnterRoomConfig.LogData logData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        BZI LIZ = C28787BRn.LIZ("livesdk_event_gate_popup_continue");
        EnterRoomConfig enterRoomConfig = this.enterRoomConfig;
        String str7 = null;
        if (enterRoomConfig != null && (roomsData4 = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData4.enterFromMerge;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "enter_from_merge");
        EnterRoomConfig enterRoomConfig2 = this.enterRoomConfig;
        if (enterRoomConfig2 != null && (roomsData3 = enterRoomConfig2.mRoomsData) != null) {
            str3 = roomsData3.enterMethod;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "enter_method");
        EnterRoomConfig enterRoomConfig3 = this.enterRoomConfig;
        if (enterRoomConfig3 != null && (logData2 = enterRoomConfig3.mLogData) != null) {
            str4 = logData2.anchorId;
        } else {
            str4 = null;
        }
        LIZ.LJIJJ(str4, "anchor_id");
        LIZ.LJIJJ(Long.valueOf(this.roomId), "room_id");
        EnterRoomConfig enterRoomConfig4 = this.enterRoomConfig;
        if (enterRoomConfig4 != null && (logData = enterRoomConfig4.mLogData) != null) {
            str5 = logData.requestId;
        } else {
            str5 = null;
        }
        LIZ.LJIJJ(str5, "request_id");
        EnterRoomConfig enterRoomConfig5 = this.enterRoomConfig;
        if (enterRoomConfig5 != null && (roomsData2 = enterRoomConfig5.mRoomsData) != null) {
            str6 = roomsData2.actionType;
        } else {
            str6 = null;
        }
        LIZ.LJIJJ(str6, "action_type");
        EnterRoomConfig enterRoomConfig6 = this.enterRoomConfig;
        if (enterRoomConfig6 != null && (roomsData = enterRoomConfig6.mRoomsData) != null) {
            str7 = roomsData.followStatus;
        }
        LIZ.LJIJJ(str7, "follow_status");
        LIZ.LJJIIJZLJL();
        ((C2A7) _$_findCachedViewById(R.id.kpn)).LJII();
        C65814PsI.LIZ().getClass();
        this.disposable.LIZ(C1EW.LIZ(((PaidRoomApi) C65814PsI.LIZJ(PaidRoomApi.class)).checkCode(str, Long.valueOf(this.roomId))).LJJJLIIL(new AfS57S0100000_5(this, 150), new AfS57S0100000_5(this, 151)));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.counts >= 4) {
            _$_findCachedViewById(R.id.kpn).setEnabled(true);
        }
        this.mIsHide = false;
    }

    public final void initData(boolean z) {
        ((CVT) _$_findCachedViewById(R.id.g94)).setVisibility(0);
        C65814PsI.LIZ().getClass();
        this.disposable.LIZ(C1EW.LIZ(((PaidRoomApi) C65814PsI.LIZJ(PaidRoomApi.class)).queryRoomData(Long.valueOf(this.roomId))).LJJJLIIL(new AfS57S0100000_5(this, 152), new AfS25S0110000_5(this, z, 5)));
    }

    public final void initView(GatedRoomData gatedRoomData) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.LogData logData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig.LogData logData2;
        EnterRoomConfig.RoomsData roomsData3;
        EnterRoomConfig.RoomsData roomsData4;
        _$_findCachedViewById(R.id.kpn).setEnabled(false);
        BZI LIZ = C28787BRn.LIZ("livesdk_event_gate_popup_show");
        EnterRoomConfig enterRoomConfig = this.enterRoomConfig;
        ImageModel imageModel = null;
        if (enterRoomConfig != null && (roomsData4 = enterRoomConfig.mRoomsData) != null) {
            str = roomsData4.enterFromMerge;
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "enter_from_merge");
        EnterRoomConfig enterRoomConfig2 = this.enterRoomConfig;
        if (enterRoomConfig2 != null && (roomsData3 = enterRoomConfig2.mRoomsData) != null) {
            str2 = roomsData3.enterMethod;
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "enter_method");
        EnterRoomConfig enterRoomConfig3 = this.enterRoomConfig;
        if (enterRoomConfig3 != null && (logData2 = enterRoomConfig3.mLogData) != null) {
            str3 = logData2.anchorId;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "anchor_id");
        LIZ.LJIJJ(Long.valueOf(this.roomId), "room_id");
        EnterRoomConfig enterRoomConfig4 = this.enterRoomConfig;
        if (enterRoomConfig4 != null && (roomsData2 = enterRoomConfig4.mRoomsData) != null) {
            str4 = roomsData2.actionType;
        } else {
            str4 = null;
        }
        LIZ.LJIJJ(str4, "action_type");
        EnterRoomConfig enterRoomConfig5 = this.enterRoomConfig;
        if (enterRoomConfig5 != null && (logData = enterRoomConfig5.mLogData) != null) {
            str5 = logData.requestId;
        } else {
            str5 = null;
        }
        LIZ.LJIJJ(str5, "request_id");
        EnterRoomConfig enterRoomConfig6 = this.enterRoomConfig;
        if (enterRoomConfig6 != null && (roomsData = enterRoomConfig6.mRoomsData) != null) {
            str6 = roomsData.followStatus;
        } else {
            str6 = null;
        }
        LIZ.LJIJJ(str6, "follow_status");
        LIZ.LJJIIJZLJL();
        _$_findCachedViewById(R.id.c_k).setVisibility(0);
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.ad0);
        User user = gatedRoomData.owner;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        }
        C31665Cbl.LJIIJ(imageView, imageModel, _$_findCachedViewById(R.id.ad0).getWidth(), _$_findCachedViewById(R.id.ad0).getHeight(), R.drawable.d65);
        ((TextView) _$_findCachedViewById(R.id.las)).setText(gatedRoomData.eventName);
        ((TextView) _$_findCachedViewById(R.id.bul)).setText(gatedRoomData.description);
        ((TextView) _$_findCachedViewById(R.id.cq8)).setTransformationMethod(new BK6());
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.c9i), new ACListenerS40S0200000_5(gatedRoomData, this, 24));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kpn), new ACListenerS25S0100000_5(this, 221));
        TextView textView = (TextView) _$_findCachedViewById(R.id.cq8);
        textView.addTextChangedListener(this.mTextWatcher);
        textView.setOnKeyListener(new BK4(this));
        _$_findCachedViewById(R.id.cq8).postDelayed(new ARunnableS41S0100000_5(this, 168), 100L);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        long j;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            j = arguments.getLong("roomId");
        } else {
            j = 0;
        }
        this.roomId = j;
        this.enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        B4M b4m = new B4M();
        b4m.LIZ = this.status;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(PaidRoomChannel.class, b4m);
        }
        super.onDismiss(dialog);
        this.mHandler.removeMessages(101);
        this.disposable.LIZLLL();
    }

    public final void removeFilter(EditText editText) {
        if (this.mFilter != null) {
            editText.setFilters(new InputFilter[0]);
            this.mFilter = null;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.bg1), new ACListenerS25S0100000_5(this, 223));
        initData(false);
    }

    public final void setCharLimit(EditText editText, int i) {
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(i);
        this.mFilter = lengthFilter;
        editText.setFilters(new InputFilter[]{lengthFilter});
    }
}
