package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.qa.QAFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BVm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28890BVm implements LHW {
    public final /* synthetic */ QAFragment LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
    }

    public C28890BVm(QAFragment qAFragment) {
        this.LJLIL = qAFragment;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA c78856UxA) {
        View view;
        ViewPager viewPager = (ViewPager) this.LJLIL._$_findCachedViewById(R.id.nb6);
        if (c78856UxA != null) {
            viewPager.setCurrentItem(c78856UxA.LJ);
            View view2 = c78856UxA.LJFF;
            if (view2 != null) {
                view = view2.findViewById(R.id.kz4);
            } else {
                view = null;
            }
            C29306Beo.LJIIIZ(view);
        }
    }
}
