package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.AnchorTechViewPagerDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BQP implements C0C3 {
    public final /* synthetic */ AnchorTechViewPagerDialog LJLIL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public BQP(AnchorTechViewPagerDialog anchorTechViewPagerDialog) {
        this.LJLIL = anchorTechViewPagerDialog;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        C012403c.LJ("position", i, "AnchorTechViewPagerDialog");
        InterfaceC30442Bx8.x1.LIZJ(Double.valueOf(i));
        AnchorTechViewPagerDialog anchorTechViewPagerDialog = this.LJLIL;
        anchorTechViewPagerDialog.LJLJL = i;
        C2A7 c2a7 = anchorTechViewPagerDialog.LJLJJI;
        if (c2a7 != null) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            c2a7.setEnabled(z);
            if (this.LJLIL.LJLJI != null) {
                if (i == r0.getCount() - 1) {
                    C2A7 c2a72 = this.LJLIL.LJLJJL;
                    if (c2a72 != null) {
                        c2a72.setText(R.string.njm);
                    } else {
                        o.LJIJI("btnNext");
                        throw null;
                    }
                } else {
                    C2A7 c2a73 = this.LJLIL.LJLJJL;
                    if (c2a73 != null) {
                        c2a73.setText(R.string.nke);
                    } else {
                        o.LJIJI("btnNext");
                        throw null;
                    }
                }
                this.LJLIL.vl();
                return;
            }
            o.LJIJI("adapter");
            throw null;
        }
        o.LJIJI("btnBack");
        throw null;
    }
}
