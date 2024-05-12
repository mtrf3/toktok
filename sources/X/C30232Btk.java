package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.toolbar.BroadcastToolbarSpaceStatusChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Btk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30232Btk extends View {
    public boolean LJLIL;
    public DataChannel LJLILLLLZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30232Btk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public final DataChannel getDataChannel() {
        return this.LJLILLLLZI;
    }

    private final void setToolbarSpaceStatus(EnumC30231Btj enumC30231Btj) {
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.rv0(BroadcastToolbarSpaceStatusChannel.class, enumC30231Btj);
        }
    }

    public final void setDataChannel(DataChannel dataChannel) {
        Boolean bool;
        LiveMode streamType;
        this.LJLILLLLZI = dataChannel;
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
        if (LJJIJLIJ != null && (streamType = LJJIJLIJ.getStreamType()) != null) {
            bool = Boolean.valueOf(C28509BGv.LJI(streamType));
        } else {
            bool = null;
        }
        this.LJLIL = C29306Beo.LJJIFFI(bool);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        EnumC30231Btj enumC30231Btj;
        super.onMeasure(i, i2);
        if (!this.LJLIL) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            if (size > C15380j0.LIZ(44.0f)) {
                enumC30231Btj = EnumC30231Btj.CAN_HOLD_MORE;
            } else if (size <= 0) {
                enumC30231Btj = EnumC30231Btj.EXCEEDS;
            } else {
                enumC30231Btj = EnumC30231Btj.JUST_FULL;
            }
            setToolbarSpaceStatus(enumC30231Btj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30232Btk(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30232Btk.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
