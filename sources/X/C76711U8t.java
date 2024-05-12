package X;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.lang.ref.WeakReference;

/* renamed from: X.U8t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76711U8t extends F9E {
    public final C76701U8j LJLIL;
    public final FrameLayout LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public final int L() {
        int hashCode;
        int i;
        int i2;
        ILayerControl.ILayer iLayer;
        C76701U8j c76701U8j = this.LJLIL;
        EnumC75419Tip enumC75419Tip = c76701U8j.LIZ;
        int i3 = 0;
        if (enumC75419Tip != EnumC75419Tip.StateJoined || c76701U8j.LJFF == enumC75419Tip) {
            hashCode = c76701U8j.hashCode();
        } else {
            hashCode = 0;
        }
        int i4 = hashCode * 31;
        String str = this.LJLIL.LIZJ;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i4 + i) * 31;
        SurfaceView surfaceView = this.LJLIL.LIZLLL;
        if (surfaceView != null) {
            i2 = surfaceView.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        WeakReference<ILayerControl.ILayer> weakReference = this.LJLIL.LJ;
        if (weakReference != null && (iLayer = weakReference.get()) != null) {
            i3 = iLayer.hashCode();
        }
        return i6 + i3;
    }

    public C76711U8t(C76701U8j c76701U8j, FrameLayout frameLayout) {
        this.LJLIL = c76701U8j;
        this.LJLILLLLZI = frameLayout;
    }
}
