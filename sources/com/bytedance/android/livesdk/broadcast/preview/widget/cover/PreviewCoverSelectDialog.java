package com.bytedance.android.livesdk.broadcast.preview.widget.cover;

import X.BGV;
import X.BGW;
import X.C16880lQ;
import X.C28503BGp;
import X.C28507BGt;
import X.C30326BvG;
import X.C51029K0z;
import X.CN1;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.GameAutoCoverChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewCoverSelectDialog extends BasePreviewDialogFragment {
    public boolean LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cvx);
        c28507BGt.LIZJ = R.style.abp;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJI = 0.5f;
        if (C28503BGp.LIZ()) {
            c28507BGt.LJIIIIZZ = 2;
        }
        return c28507BGt;
    }

    public final String vl() {
        LiveMode liveMode;
        int i;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        if (liveMode == null) {
            i = -1;
        } else {
            i = BGW.LIZ[liveMode.ordinal()];
        }
        if (i == -1 || i == 1) {
            return "video_live";
        }
        if (i != 2) {
            if (i != 3) {
                return "video_live";
            }
            return "screen_share";
        }
        return "third_party";
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Dialog dialog;
        Window window;
        Object kv0;
        DataChannel LJIILIIL;
        LiveMode liveMode;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 294), _$_findCachedViewById(R.id.hej));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.lnf), new ACListenerS25S0100000_5(this, 295));
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("autoClose");
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.fmr), new ACListenerS40S0200000_5(this, LJIILIIL2, 36));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.fle), new ACListenerS40S0200000_5(this, LJIILIIL2, 37));
        if (LJIILIIL2 != null && (kv0 = LJIILIIL2.kv0(LiveModeChannel.class)) != null && ((kv0 == LiveMode.SCREEN_RECORD || kv0 == LiveMode.THIRD_PARTY) && (LJIILIIL = C51029K0z.LJIILIIL(this)) != null && (liveMode = (LiveMode) LJIILIIL.kv0(LiveModeChannel.class)) != null)) {
            WidgetManager widgetManager = new WidgetManager();
            widgetManager.config(false, null, this, getView(), getContext(), C30326BvG.LIZ);
            IGameService iGameService = (IGameService) CN1.LIZ(IGameService.class);
            String str = liveMode.logStreamingType;
            o.LJIIIIZZ(str, "liveMode.logStreamingType");
            GameAutoCoverWidget Km = iGameService.Km(str);
            if (Km != null) {
                Km.setWidgetCallback(new BGV(this));
                widgetManager.load(R.id.niv, Km);
            }
            LJIILIIL.ov0(this, GameAutoCoverChannel.class, new AqS171S0100000_5(this, 651));
        }
        if (LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2() && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.addFlags(2);
        }
    }
}
