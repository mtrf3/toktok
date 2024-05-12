package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0N0, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0N0 extends FrameLayout {
    public boolean LJLIL;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public final void LJ() {
        ViewGroup viewGroup;
        this.LJLIL = false;
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this, viewGroup);
        }
        for (InterfaceC65350Pko interfaceC65350Pko : ((HashMap) C0N9.LIZ).keySet()) {
            o.LJIIIZ(interfaceC65350Pko, "<this>");
            PreviewWidget LIZIZ = C0N9.LIZIZ(interfaceC65350Pko);
            if (LIZIZ != null && LIZIZ.LJLILLLLZI && LIZIZ.LJLZ()) {
                C31809Ce5 c31809Ce5 = LIZIZ.widgetContainer;
                if (c31809Ce5 != null) {
                    c31809Ce5.LIZ(LIZIZ.contentView);
                }
                LIZIZ.LJZI();
            }
        }
        LIZLLL();
    }

    public final void setSelect(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0N0(Context context, int i) {
        super(context);
        new LinkedHashMap();
        if (C20780ri.LIZ(i) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZIZ(i, context, this, true);
        } else {
            C20910rv.LJI(i, this, true, 8);
        }
    }
}
