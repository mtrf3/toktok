package X;

import com.ss.android.ugc.feed.platform.panel.autoscroll.TabletDefaultAutoScrollComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.JBo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48756JBo implements C2MJ {
    public final /* synthetic */ TabletDefaultAutoScrollComponent LJLIL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C48756JBo(TabletDefaultAutoScrollComponent tabletDefaultAutoScrollComponent) {
        this.LJLIL = tabletDefaultAutoScrollComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        if (this.LJLIL.H3() == EnumC223268pW.AUTO_SCROLL_STATE_START) {
            return;
        }
        TabletDefaultAutoScrollComponent tabletDefaultAutoScrollComponent = this.LJLIL;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        tabletDefaultAutoScrollComponent.I3(z);
    }
}
