package com.bytedance.android.live.effect.music;

import X.BZI;
import X.C14270hD;
import X.C15380j0;
import X.C16120kC;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C47121t6;
import X.C76923UGx;
import X.EnumC29609Bjh;
import X.InterfaceC30442Bx8;
import X.UH2;
import Y.IDCListenerS135S0100000;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.bytedance.android.live.effect.music.LiveVolumeDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicDefaultVolumeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes.dex */
public final class LiveVolumeDialog extends LiveDialogFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1s);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_MUSIC;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        String str;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        DataChannel dataChannel = this.dataChannel;
        int LIZLLL = C14270hD.LIZLLL();
        boolean LIZJ = o.LIZJ(InterfaceC30442Bx8.O.LIZJ(), LiveBgMusicDefaultVolumeSetting.INSTANCE.getValue());
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_volume_select");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(Integer.valueOf(LIZLLL), "volume_value");
        if (LIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_default_value");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        _$_findCachedViewById(R.id.bst).getLayoutParams().height = (getResources().getDisplayMetrics().heightPixels * 34) / 100;
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 51), _$_findCachedViewById(R.id.he_));
        C76923UGx c76923UGx = (C76923UGx) _$_findCachedViewById(R.id.gue);
        int LIZIZ = C15380j0.LIZIZ(R.color.zn);
        int LIZIZ2 = C15380j0.LIZIZ(R.color.zl);
        int LIZIZ3 = C15380j0.LIZIZ(R.color.zm);
        c76923UGx.LJLJL = LIZIZ;
        c76923UGx.LJLJLJ = LIZIZ2;
        c76923UGx.LLIILZL = LIZIZ3;
        c76923UGx.setUpUiColor(false);
        ((C76923UGx) _$_findCachedViewById(R.id.gue)).LIZJ(200, 0, 0, true);
        ((C76923UGx) _$_findCachedViewById(R.id.gue)).setPercent(C14270hD.LIZLLL());
        ((C76923UGx) _$_findCachedViewById(R.id.gue)).setOnLevelChangeListener(new UH2() { // from class: X.1mL
            @Override // X.UH1
            public final void LIZ(int i) {
                C14270hD.LJIILJJIL(i);
                View view2 = LiveVolumeDialog.this.getView();
                if (view2 != null) {
                    LiveVolumeDialog liveVolumeDialog = LiveVolumeDialog.this;
                    try {
                        h0.LJJII((C76923UGx) liveVolumeDialog._$_findCachedViewById(R.id.gue), view2.getContext().getResources().getString(R.string.k4e, String.valueOf(((C76923UGx) liveVolumeDialog._$_findCachedViewById(R.id.gue)).getPercent())));
                    } catch (Exception unused) {
                    }
                }
            }
        });
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.l_q), new IDCListenerS135S0100000(this, 52));
        h0.LJIJI(_$_findCachedViewById(R.id.l_q), new C16120kC() { // from class: X.1H6
            @Override // X.C16120kC
            public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                o.LJIIIZ(host, "host");
                o.LJIIIZ(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.LJIILJJIL(Button.class.getName());
            }
        });
    }
}
