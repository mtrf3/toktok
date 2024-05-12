package com.bytedance.android.livesdk.broadcast.preview.widget.cover;

import X.B83;
import X.BGU;
import X.C221108m2;
import X.C28495BGh;
import X.C28497BGj;
import X.C28500BGm;
import X.C29306Beo;
import X.C29374Bfu;
import X.C30326BvG;
import X.C31870Cf4;
import X.C32537Cpp;
import X.C62822Ol8;
import X.C73943T0h;
import X.C78966Uyw;
import X.InterfaceC05190Ih;
import X.ViewOnClickListenerC28501BGn;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS8S0201000_5;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.livesetting.broadcast.LivesdkPreviewCoverFixCombineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS155S0100000_5;

/* loaded from: classes6.dex */
public final class PreviewCoverWidget extends PreviewWidget {
    public ViewOnClickListenerC28501BGn LJLJI;
    public LiveMode LJLJJLL;
    public RoomCreateInfo LJLJL;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C28495BGh.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C28497BGj.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 139));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpv;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        if (C29306Beo.LJJIFFI((Boolean) this.dataChannel.kv0(C28500BGm.class))) {
            hide();
        } else {
            show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 65), this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn = this.LJLJI;
        if (viewOnClickListenerC28501BGn != null) {
            C31870Cf4 c31870Cf4 = viewOnClickListenerC28501BGn.LJLJJI;
            if (c31870Cf4 != null) {
                c31870Cf4.LIZ();
                viewOnClickListenerC28501BGn.LJLJJI = null;
            }
            viewOnClickListenerC28501BGn.LJLJJL = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r3) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLF(com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            X.BHW r0 = X.BHZ.Companion
            r0.getClass()
            X.BHZ r0 = X.BHW.LIZ(r5)
            r3 = 0
            if (r0 == 0) goto L95
            com.bytedance.android.livesdk.model.Hashtag r2 = r0.getHashtag()
        L13:
            int[] r1 = X.C28496BGi.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L6c
            r0 = 2
            if (r1 == r0) goto L4a
            X.Ol8 r0 = r4.LJLJJL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.widget.Widget r0 = (com.bytedance.android.widget.Widget) r0
            if (r0 == 0) goto L2e
            r0.hide()
        L2e:
            X.Ol8 r0 = r4.LJLJLJ
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L3e
            r0 = 2131836255(0x7f113d5f, float:1.9305672E38)
            r1.setText(r0)
        L3e:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.dataChannel
            if (r2 == 0) goto L49
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel> r1 = com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.rv0(r1, r0)
        L49:
            return
        L4a:
            X.Ol8 r0 = r4.LJLJJL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.widget.Widget r0 = (com.bytedance.android.widget.Widget) r0
            if (r0 == 0) goto L57
            r0.show()
        L57:
            if (r2 == 0) goto L6a
            java.lang.Long r1 = r2.id
        L5b:
            com.bytedance.android.livesdk.model.Hashtag r0 = X.C28514BHa.LIZ()
            if (r0 == 0) goto L63
            java.lang.Long r3 = r0.id
        L63:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r3)
            if (r0 == 0) goto L2e
            goto L79
        L6a:
            r1 = r3
            goto L5b
        L6c:
            X.Ol8 r0 = r4.LJLJJL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.widget.Widget r0 = (com.bytedance.android.widget.Widget) r0
            if (r0 == 0) goto L79
            r0.show()
        L79:
            X.Ol8 r0 = r4.LJLJLJ
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L89
            r0 = 2131835071(0x7f1138bf, float:1.930327E38)
            r1.setText(r0)
        L89:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.dataChannel
            if (r2 == 0) goto L49
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel> r1 = com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.rv0(r1, r0)
            goto L49
        L95:
            r2 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget.LLF(com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }

    public static void LL(ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn, int i, ImageModel imageModel, boolean z) {
        Object obj;
        viewOnClickListenerC28501BGn.getClass();
        if (imageModel != null) {
            viewOnClickListenerC28501BGn.LJLJLLL = ViewOnClickListenerC28501BGn.LIZ(imageModel);
        }
        if (i != 0 && i != 1) {
            InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
            if (interfaceC05190Ih instanceof User) {
                Object avatarThumb = interfaceC05190Ih.getAvatarThumb();
                TextView textView = viewOnClickListenerC28501BGn.LJLILLLLZI;
                if (textView != null) {
                    textView.setAlpha(1.0f);
                }
                viewOnClickListenerC28501BGn.LJLJLLL = ViewOnClickListenerC28501BGn.LIZ(interfaceC05190Ih.getAvatarThumb());
                viewOnClickListenerC28501BGn.LJLJLJ = true;
                obj = avatarThumb;
            } else {
                obj = null;
            }
        } else {
            TextView textView2 = viewOnClickListenerC28501BGn.LJLILLLLZI;
            if (textView2 != null) {
                textView2.setAlpha(1.0f);
            }
            viewOnClickListenerC28501BGn.LJLJLJ = z;
            obj = imageModel;
        }
        Object obj2 = obj;
        if (LivesdkPreviewCoverFixCombineSetting.INSTANCE.getValue()) {
            obj2 = obj;
            if (((HashMap) viewOnClickListenerC28501BGn.LJLLI).get(viewOnClickListenerC28501BGn.LIZIZ()) != null) {
                obj2 = ((HashMap) viewOnClickListenerC28501BGn.LJLLI).get(viewOnClickListenerC28501BGn.LIZIZ());
            }
        }
        if (obj2 != null) {
            C30326BvG.LIZ.post(new ARunnableS8S0201000_5(0, viewOnClickListenerC28501BGn, obj2, 18), null);
            viewOnClickListenerC28501BGn.LJLJL.rv0(BroadcastCoverData.class, obj2);
        }
        ((C32537Cpp) viewOnClickListenerC28501BGn.LJLJL.gv0(BGU.class)).LIZ = "last_cover";
        C73943T0h.LIZ().LIZIZ(new C78966Uyw());
    }
}
