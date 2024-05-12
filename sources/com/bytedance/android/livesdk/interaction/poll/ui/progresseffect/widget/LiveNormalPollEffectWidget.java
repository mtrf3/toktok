package com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget;

import X.C29232Bdc;
import X.CCC;
import X.CCG;
import X.CKB;
import X.YBU;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.AnchorResumePollEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveNormalPollEffectWidget extends LiveAbsPollEffectWidget {
    public int LLFF;

    public LiveNormalPollEffectWidget() {
        this(0);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dfz;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLIILII() {
        if (this.LJLLJ) {
            return;
        }
        this.LJLLJ = true;
        CCG.LIZLLL(this.LJLJLJ, this.dataChannel, this.LL, CCC.NORMAL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        DataChannel dataChannel;
        if (C29232Bdc.LJFF(this.dataChannel)) {
            return;
        }
        super.show();
        if (this.LLFF == 257 && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(PublicScreenNormalPollStateVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LL() {
        PollStartContent pollStartContent;
        super.LL();
        switch (this.LLFF) {
            case 257:
                LLFF();
                return;
            case 258:
                PollMessage pollMessage = CKB.INSTANCE.pollMessage;
                this.LJLJLJ = pollMessage;
                if (pollMessage != null) {
                    pollStartContent = pollMessage.startContent;
                } else {
                    pollStartContent = null;
                }
                this.LJLJJLL = pollStartContent;
                return;
            case 259:
                LLFFF(CCC.NORMAL);
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLIILZL() {
        super.LLIILZL();
        int i = this.LJLZ;
        if (i != 1) {
            if (i != 2) {
                LLII(R.drawable.clb);
                return;
            } else {
                LLII(R.drawable.d9u);
                return;
            }
        }
        LLII(R.drawable.d9u);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        DataChannel dataChannel;
        super.hide();
        if (this.LLFF == 257 && (dataChannel = this.dataChannel) != null) {
            dataChannel.rv0(PublicScreenNormalPollStateVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void init() {
        super.init();
        View findViewById = findViewById(R.id.fxj);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.live_normal_poll_view)");
        this.LJLILLLLZI = (YBU) findViewById;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        LJZL().setAccessibilityDelegate(null);
    }

    public LiveNormalPollEffectWidget(int i) {
        super(i);
        this.LLFF = i;
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    public final void LLII(int i) {
        LJZL().setCircleBitmap(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r2.intValue() != r1) goto L12;
     */
    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIIJ(com.bytedance.android.livesdk.model.message.PollMessage r6) {
        /*
            r5 = this;
            super.LLIIIJ(r6)
            int r1 = r5.LLFF
            r0 = 257(0x101, float:3.6E-43)
            if (r1 != r0) goto L2c
            java.util.List<com.bytedance.android.livesdk.model.message.PollOptionInfo> r0 = r5.LJLJL
            if (r0 == 0) goto L22
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L22
            com.bytedance.android.livesdk.model.message.PollMessage r0 = r5.LJLJLJ
            if (r0 == 0) goto L22
            java.lang.Integer r2 = r0.pollKind
            X.CCC r0 = X.CCC.NORMAL
            int r1 = r0.ordinal()
            if (r2 != 0) goto L26
        L22:
            r5.hide()
            return
        L26:
            int r0 = r2.intValue()
            if (r0 != r1) goto L22
        L2c:
            if (r6 == 0) goto L3d
            long r3 = r6.messageType
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
        L36:
            r5.LLIIIL()
            r5.LLIIJLIL()
            return
        L3d:
            r5.show()
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget.LLIIIJ(com.bytedance.android.livesdk.model.message.PollMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... args) {
        o.LJIIIZ(args, "args");
        super.initConstructor(Arrays.copyOf(args, args.length));
        Object obj = args[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        this.LLFF = ((Integer) obj).intValue();
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveAbsPollEffectWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, AnchorResumePollEvent.class, new AqS171S0100000_5(this, 457));
        }
        LJZL().setContentDescription(LJZL().getAccessibilityContentDescription());
    }
}
