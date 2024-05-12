package X;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TfT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75211TfT {
    public final TextView LIZ;
    public final InterfaceC24140x8 LIZIZ;
    public final Fragment LIZJ;
    public final C0WD LIZLLL;
    public final C75422Tis LJ;
    public C73411SrX LJFF;
    public final C75212TfU LJI;

    public final void LIZ(boolean z) {
        InterfaceC24140x8 interfaceC24140x8;
        if (this.LIZ != null && C19N.LIZLLL() && C28952BXw.LIZ() && (interfaceC24140x8 = this.LIZIZ) != null) {
            Object attachedComposerManager = interfaceC24140x8.getAttachedComposerManager();
            if (attachedComposerManager instanceof C0WF) {
                if (z) {
                    ((C0WF) attachedComposerManager).LJIIIZ(this.LJI);
                } else {
                    ((C0WF) attachedComposerManager).LJIILJJIL(this.LJI);
                }
            }
        }
    }

    public C75211TfT(TextView textView, InterfaceC24140x8 interfaceC24140x8, Fragment currentFragment, C0WD c0wd, C75422Tis c75422Tis) {
        o.LJIIIZ(currentFragment, "currentFragment");
        this.LIZ = textView;
        this.LIZIZ = interfaceC24140x8;
        this.LIZJ = currentFragment;
        this.LIZLLL = c0wd;
        this.LJ = c75422Tis;
        C23010vJ.LJ(600, textView);
        if (textView != null) {
            textView.setShadowLayer(2.0f, 0.0f, 0.5f, C15380j0.LIZIZ(R.color.a06));
        }
        this.LJI = new C75212TfU(this);
    }
}
