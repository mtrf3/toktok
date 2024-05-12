package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5CP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CP extends View {
    public final NLETrackSlot LJLIL;
    public final boolean LJLILLLLZI;
    public final Rect LJLJI;
    public final int LJLJJI;
    public final Paint LJLJJL;

    public final NLETrackSlot getSlot$tools_camera_edit_release() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        this.LJLJI.set(0, 0, getWidth(), getHeight());
        Rect rect = this.LJLJI;
        C77275UUl.LIZJ(canvas, rect.left, rect.top, rect.right, rect.bottom, this.LJLJJL);
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5CP(NLETrackSlot nleTrackSlot, boolean z, boolean z2, Context context, AttributeSet attributeSet, int i, C126844yO editEffectNLEHandler) {
        super(context, attributeSet, i);
        int LJIIIIZZ;
        int LJIIIIZZ2;
        int i2;
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        o.LJIIIZ(editEffectNLEHandler, "editEffectNLEHandler");
        new LinkedHashMap();
        this.LJLIL = nleTrackSlot;
        this.LJLILLLLZI = z2;
        this.LJLJI = new Rect();
        this.LJLJJI = -1;
        if (z) {
            this.LJLJJI = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        } else if (z2) {
            String LJIILIIL = C126844yO.LJIILIIL(nleTrackSlot, "nleExtraEffectSelectedColor");
            if (LJIILIIL != null) {
                LJIIIIZZ2 = CastIntegerProtector.parseInt(LJIILIIL);
            } else {
                LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
            }
            this.LJLJJI = LJIIIIZZ2;
        } else {
            if (nleTrackSlot.LJI().hasExtra("nleExtraEffectSelectedColor")) {
                String extra = nleTrackSlot.LJI().getExtra("nleExtraEffectSelectedColor");
                o.LJIIIIZZ(extra, "nleTrackSlot.mainSegment…RA_EFFECT_SELECTED_COLOR)");
                LJIIIIZZ = CastIntegerProtector.parseInt(extra);
            } else {
                LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
            }
            this.LJLJJI = LJIIIIZZ;
            setElevation(C32151Nz.LJIIZILJ(2));
        }
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setColor(this.LJLJJI);
        if (z) {
            i2 = 86;
        } else if (z2) {
            i2 = 127;
        } else {
            i2 = 204;
        }
        LIZIZ.setAlpha(i2);
        this.LJLJJL = LIZIZ;
    }
}
