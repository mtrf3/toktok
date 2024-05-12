package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BCX;
import X.BUW;
import X.BZI;
import X.C0N7;
import X.C0NA;
import X.C28506BGs;
import X.C28509BGv;
import X.C28787BRn;
import X.C28911BWh;
import X.C29306Beo;
import X.C65352Pkq;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS31S0300000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAccessRecallWidget extends PreviewWidget {
    public LiveMode LJLJI = LiveMode.VIDEO;
    public final Map<LiveMode, C28911BWh> LJLJJI = new LinkedHashMap();
    public final Map<LiveMode, Boolean> LJLJJL = new LinkedHashMap();
    public C28911BWh LJLJJLL;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZI() {
        this.LJLILLLLZI = false;
        this.dataChannel.rv0(LiveAccessTipsShowChannel.class, Boolean.FALSE);
        C0NA.LIZJ(C65352Pkq.LIZ(AccessRecallVisibilityChannel.class));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpu;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LL() {
        boolean z;
        Boolean bool = (Boolean) this.dataChannel.kv0(LiveAccessTipsShowChannel.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (((LinkedHashMap) this.LJLJJI).get(this.LJLJI) == null || z) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        LiveMode liveMode = (LiveMode) this.dataChannel.kv0(BCX.class);
        if (liveMode == null) {
            liveMode = LiveMode.VIDEO;
        }
        this.LJLJI = liveMode;
        LLF();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 626));
            dataChannel.ov0(this, PreviewBlockInfoChannel.class, new AqS171S0100000_5(this, 627));
        }
    }

    public final void LLF() {
        ViewGroup viewGroup;
        BUW buw;
        CharSequence charSequence;
        CharSequence charSequence2;
        ViewGroup viewGroup2;
        boolean LL = LL();
        if (LL) {
            C28911BWh c28911BWh = (C28911BWh) ((LinkedHashMap) this.LJLJJI).get(this.LJLJI);
            this.LJLJJLL = c28911BWh;
            View view = getView();
            String str = null;
            if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                viewGroup2.removeAllViews();
            }
            View view2 = getView();
            if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "getContext()");
                C28506BGs c28506BGs = new C28506BGs(context);
                if (c28911BWh != null) {
                    buw = c28911BWh.LIZIZ;
                } else {
                    buw = null;
                }
                c28506BGs.setTag(buw);
                if (c28911BWh != null) {
                    charSequence = c28911BWh.LIZJ;
                } else {
                    charSequence = null;
                }
                c28506BGs.setTitle(charSequence);
                if (c28911BWh != null) {
                    charSequence2 = c28911BWh.LIZLLL;
                } else {
                    charSequence2 = null;
                }
                c28506BGs.setSubTitle(charSequence2);
                if (c28911BWh != null) {
                    str = c28911BWh.LJ;
                }
                if (C29306Beo.LJIJJLI(str)) {
                    c28506BGs.setRightIcon(true);
                    c28506BGs.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS31S0300000_5(this, c28506BGs, c28911BWh, 5)));
                } else {
                    c28506BGs.setRightIcon(false);
                }
                viewGroup.addView(c28506BGs);
            }
        }
        LLFF(LL);
    }

    public final void LLFF(boolean z) {
        String str;
        C28911BWh c28911BWh;
        String str2;
        String str3;
        String str4;
        if (z) {
            if (this.dataChannel.kv0(PreviewBlockInfoChannel.class) != null) {
                hide();
                this.dataChannel.rv0(LiveAccessTipsShowChannel.class, Boolean.FALSE);
                C0NA.LIZJ(C65352Pkq.LIZ(AccessRecallVisibilityChannel.class));
                return;
            }
            show();
            if (o.LJ(((LinkedHashMap) this.LJLJJL).get(this.LJLJI), Boolean.FALSE) && (c28911BWh = this.LJLJJLL) != null) {
                DataChannel dataChannel = this.dataChannel;
                PunishEventInfo punishEventInfo = c28911BWh.LJFF;
                Long l = null;
                if (punishEventInfo != null) {
                    str2 = punishEventInfo.punishId;
                    str3 = punishEventInfo.punishType;
                    str4 = punishEventInfo.punishReason;
                    l = Long.valueOf(punishEventInfo.violationUid);
                } else {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                C0N7.LJJ(dataChannel, str2, str3, str4, l);
                this.LJLJJL.put(this.LJLJI, Boolean.TRUE);
                if (C29306Beo.LJIJJLI(c28911BWh.LJ)) {
                    ((LinkedHashMap) this.LJLJJL).clear();
                }
            }
            String liveType = this.LJLJI.logStreamingType;
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(liveType, "liveType");
            C0N7.LIZLLL("show", "access_revoke_banner", dataChannel2, liveType);
            this.dataChannel.rv0(LiveAccessTipsShowChannel.class, Boolean.TRUE);
            C0NA.LIZIZ(C65352Pkq.LIZ(AccessRecallVisibilityChannel.class));
            DataChannel dataChannel3 = this.dataChannel;
            LiveMode liveMode = this.LJLJI;
            o.LJIIIZ(liveMode, "liveMode");
            if (C28509BGv.LJFF(liveMode)) {
                str = "livesdk_obs_revoke_remind";
            } else {
                str = "livesdk_takepage_access_revoke_remind";
            }
            BZI LIZ = C28787BRn.LIZ(str);
            LIZ.LJIILLIIL(dataChannel3);
            LIZ.LJIJ(liveMode.logStreamingType);
            LIZ.LJJIIJZLJL();
            return;
        }
        hide();
        this.dataChannel.rv0(LiveAccessTipsShowChannel.class, Boolean.FALSE);
        C0NA.LIZJ(C65352Pkq.LIZ(AccessRecallVisibilityChannel.class));
    }
}
