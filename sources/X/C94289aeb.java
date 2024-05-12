package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.aeb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94289aeb implements InterfaceC93639aU7 {
    public final /* synthetic */ EffectLayerEditorFragment LIZ;

    public C94289aeb(EffectLayerEditorFragment effectLayerEditorFragment) {
        this.LIZ = effectLayerEditorFragment;
    }

    @Override // X.InterfaceC93639aU7
    public final boolean LIZ(MotionEvent ev) {
        IMain LIZ;
        LiveData<Rect> previewLocationInWindow;
        Rect value;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() != 0) {
            return true;
        }
        RecyclerView recyclerView = this.LIZ.LJLIL;
        if (recyclerView != null) {
            if (!recyclerView.hasFocus() && (LIZ = C93723aVT.LIZ()) != null && (previewLocationInWindow = LIZ.getPreviewLocationInWindow()) != null && (value = previewLocationInWindow.getValue()) != null) {
                int[] iArr = new int[2];
                C94176acm c94176acm = this.LIZ.LJLJJI;
                if (c94176acm != null) {
                    c94176acm.getLocationInWindow(iArr);
                    if (ev.getX() >= value.left - iArr[0] && ev.getX() <= value.right - iArr[0] && ev.getY() >= value.top - iArr[1] && ev.getY() <= value.bottom - iArr[1]) {
                        if (EffectLayerEditorFragment.vl(this.LIZ).isChecked()) {
                            this.LIZ.onEventLayerDetailsClose("auto_close");
                            EffectLayerEditorFragment.vl(this.LIZ).setChecked(false);
                        }
                        return false;
                    }
                } else {
                    o.LJIJI("rootLayout");
                    throw null;
                }
            }
            return true;
        }
        o.LJIJI("recycleView");
        throw null;
    }
}
