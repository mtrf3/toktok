package com.bytedance.android.livesdk.broadcast.preview.widget.notify;

import X.BZI;
import X.C15490jB;
import X.C16880lQ;
import X.C221108m2;
import X.C28507BGt;
import X.C28787BRn;
import X.C2A7;
import X.C30739C4p;
import X.C62822Ol8;
import X.CFX;
import Y.ACListenerS25S0100000_5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.GameLiveConvertInfo;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewGameContentDialog extends BasePreviewDialogFragment {
    public static final /* synthetic */ int LJLJL = 0;
    public GameLiveConvertInfo LJLJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C30739C4p.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 142));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 141));

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewDialogFragment, com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.czt);
        c28507BGt.LIZJ = R.style.ab9;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GameLiveConvertInfo gameLiveConvertInfo;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 359), _$_findCachedViewById(R.id.hej));
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.lnl);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS25S0100000_5(this, 360));
        }
        C2A7 c2a7 = (C2A7) _$_findCachedViewById(R.id.lp0);
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 361));
        }
        C2A7 c2a72 = (C2A7) _$_findCachedViewById(R.id.lp1);
        if (c2a72 != null) {
            C16880lQ.LJJIII(c2a72, new ACListenerS25S0100000_5(this, 362));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (gameLiveConvertInfo = (GameLiveConvertInfo) arguments.getParcelable("key_convert_info")) != null) {
            this.LJLJI = gameLiveConvertInfo;
            ((TextView) _$_findCachedViewById(R.id.lp4)).setText(gameLiveConvertInfo.title);
            ((TextView) _$_findCachedViewById(R.id.lp2)).setText(gameLiveConvertInfo.text);
            if (gameLiveConvertInfo.convertType == 1) {
                str = "ttlive_preview_game_content_studio.png";
            } else {
                str = "ttlive_preview_game_content_phone.png";
            }
            View findViewById = view.findViewById(R.id.lp3);
            if (findViewById != null) {
                C15490jB.LJFF(findViewById, CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_game_demand_1"), str, ImageView.ScaleType.CENTER_INSIDE, null);
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_takepage_video_convertion_guide_show");
            LIZ.LJIJJ(this.LJLILLLLZI.getValue(), "anchor_id");
            LIZ.LJIJJ("video_live", "live_type");
            if (!TextUtils.isEmpty((String) this.LJLJJI.getValue())) {
                LIZ.LJIJJ(this.LJLJJI.getValue(), "target_live_type");
            }
            if (!TextUtils.isEmpty((String) this.LJLJJL.getValue())) {
                LIZ.LJIJJ(this.LJLJJL.getValue(), "guide_content");
            }
            LIZ.LJJIIJZLJL();
        }
    }
}
