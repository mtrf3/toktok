package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BD6;
import X.BP4;
import X.BZI;
import X.C0JT;
import X.C119774mz;
import X.C1EW;
import X.C28509BGv;
import X.C28718BOw;
import X.C28787BRn;
import X.C29306Beo;
import X.C30444BxA;
import X.C32537Cpp;
import X.C73411SrX;
import X.EnumC30410Bwc;
import X.InterfaceC64592gB;
import Y.IDCListenerS254S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.api.LiveMoreApi;
import com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewMoreWidget extends PreviewToolBaseWidget {
    public boolean LJLJI;
    public IDCListenerS254S0100000_5 LJLJJI;
    public C73411SrX LJLJJL;
    public C119774mz LJLJJLL;
    public boolean LJLJL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final long LLFF() {
        return 500L;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        Object parent;
        RoomCreateInfo roomCreateInfo;
        Boolean valueOf;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class)) == null || (valueOf = Boolean.valueOf(roomCreateInfo.foldBottomArea)) == null) {
            if (!this.LJLJL) {
                this.dataChannel.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 185));
            }
        } else {
            this.LJLJI = valueOf.booleanValue();
            super.LJZL();
            LLIIIJ();
            this.LJLJL = true;
        }
        this.LJLJJI = new IDCListenerS254S0100000_5(this, 1);
        View view = getView();
        if (view != null && (parent = view.getParent()) != null && (parent instanceof View)) {
            ((View) parent).addOnLayoutChangeListener(this.LJLJJI);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        if (this.LJLJI) {
            return R.drawable.cz1;
        }
        return R.drawable.cz0;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        if (this.LJLJI) {
            return R.string.lps;
        }
        return R.string.lpr;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Boolean, O] */
    public final void LLIIIJ() {
        String str;
        String str2;
        LiveMode liveMode;
        if (this.LJLJI) {
            C119774mz c119774mz = this.LJLJJLL;
            if (c119774mz != null) {
                c119774mz.setVisibility(8);
            }
        } else {
            C119774mz c119774mz2 = this.LJLJJLL;
            if (c119774mz2 != null) {
                c119774mz2.setVisibility(0);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(BD6.class)).LIZ = Boolean.valueOf(this.LJLJI);
        }
        DataChannel dataChannel2 = this.dataChannel;
        boolean z = this.LJLJI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(LiveEducationTouchChannel.class, Boolean.FALSE);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_takepage_bottom");
        LIZ.LJIILLIIL(dataChannel2);
        View view = null;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.kv0(LiveModeChannel.class)) != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "live_type");
        if (z) {
            str2 = "more";
        } else {
            str2 = "less";
        }
        LIZ.LJIJJ(str2, "icon_name");
        LIZ.LJJIIJZLJL();
        EnumC30410Bwc enumC30410Bwc = EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_MORE;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.niz);
        }
        C30444BxA.LIZIZ(enumC30410Bwc, this, view, new AqS171S0100000_5(this, 184));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        Object parent;
        C73411SrX c73411SrX;
        super.onDestroy();
        C73411SrX c73411SrX2 = this.LJLJJL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLJJL) != null) {
            c73411SrX.dispose();
        }
        this.LJLJL = false;
        if (this.LJLJJI != null) {
            View view = getView();
            if (view != null && (parent = view.getParent()) != null && (parent instanceof View)) {
                ((View) parent).removeOnLayoutChangeListener(this.LJLJJI);
            }
            this.LJLJJI = null;
        }
    }

    public static final /* synthetic */ void LLIIIILZ(PreviewMoreWidget previewMoreWidget) {
        super.LJZL();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        String str;
        String str2;
        int i;
        LiveMode liveMode;
        o.LJIIIZ(view, "view");
        C30444BxA.LIZ(EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_MORE);
        DataChannel dataChannel = this.dataChannel;
        boolean z = this.LJLJI;
        boolean LJJIFFI = C29306Beo.LJJIFFI(Boolean.valueOf(LLFZ()));
        if (dataChannel != null) {
            dataChannel.rv0(LiveEducationTouchChannel.class, Boolean.FALSE);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_livetake_more_less");
        LIZ.LJIILLIIL(dataChannel);
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str = C28509BGv.LIZ(liveMode);
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "live_type");
        if (z) {
            str2 = "more";
        } else {
            str2 = "less";
        }
        C0JT.LIZJ(LIZ, str2, "icon_name", LJJIFFI ? 1 : 0, "have_red_dot");
        boolean z2 = !this.LJLJI;
        this.LJLJI = z2;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(BD6.class)).LIZ = Boolean.valueOf(z2);
        }
        if (this.LJLJI) {
            i = 1;
        } else {
            i = 2;
        }
        BP4 LIZ2 = C28718BOw.LIZ();
        LIZ2.getClass();
        this.LJLJJL = (C73411SrX) C1EW.LIZ(((LiveMoreApi) LIZ2.LIZIZ(LiveMoreApi.class)).updateMoreClickStatus(1, i)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Cs
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9Ct
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        LLIIII(null);
        if (this.LJLJI) {
            C119774mz c119774mz = this.LJLJJLL;
            if (c119774mz == null) {
                return;
            }
            c119774mz.setVisibility(8);
            return;
        }
        C119774mz c119774mz2 = this.LJLJJLL;
        if (c119774mz2 == null) {
            return;
        }
        c119774mz2.setVisibility(0);
    }
}
