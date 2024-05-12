package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30331Gz extends ConstraintLayout {
    public static final /* synthetic */ int LJLJLJ = 0;
    public LiveIconView LJLIL;
    public LiveIconView LJLILLLLZI;
    public LiveIconView LJLJI;
    public LiveIconView LJLJJI;
    public InterfaceC88472Yns<? super AbstractC07650Rt, C76800UCe> LJLJJL;
    public C279917z LJLJJLL;
    public int LJLJL;

    public final InterfaceC88472Yns<AbstractC07650Rt, C76800UCe> getCarrier() {
        return this.LJLJJL;
    }

    public final C279917z getCurSongInfo() {
        return this.LJLJJLL;
    }

    public final LiveIconView getKaraokeListBtn() {
        return this.LJLJJI;
    }

    public final LiveIconView getNextBtn() {
        return this.LJLJI;
    }

    public final LiveIconView getPlayBtn() {
        return this.LJLILLLLZI;
    }

    public final LiveIconView getSettingBtn() {
        return this.LJLIL;
    }

    public final void LJJLJLI(int i) {
        this.LJLJL = i;
        if (i > 0) {
            View findViewById = findViewById(R.id.hsx);
            if (findViewById != null) {
                C26340AVk.LIZ(findViewById, i);
                return;
            }
            return;
        }
        View findViewById2 = findViewById(R.id.hsx);
        if (findViewById2 == null) {
            return;
        }
        C26340AVk.LIZIZ(findViewById2);
    }

    public final void setCarrier(InterfaceC88472Yns<? super AbstractC07650Rt, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    public final void setCurSongInfo(C279917z c279917z) {
        this.LJLJJLL = c279917z;
    }

    public final void setKaraokeListBtn(LiveIconView liveIconView) {
        this.LJLJJI = liveIconView;
    }

    public final void setNextBtn(LiveIconView liveIconView) {
        this.LJLJI = liveIconView;
    }

    public final void setPlayBtn(LiveIconView liveIconView) {
        this.LJLILLLLZI = liveIconView;
    }

    public final void setSettingBtn(LiveIconView liveIconView) {
        this.LJLIL = liveIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30331Gz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        C16880lQ.LLLZIIL(R.layout.d9y, C16880lQ.LLZIL(context), this);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.jqq);
        LiveIconView liveIconView2 = null;
        if (liveIconView != null) {
            C29306Beo.LJJJLL(liveIconView, 500L, new IDqS416S0100000(this, 56));
        } else {
            liveIconView = null;
        }
        this.LJLIL = liveIconView;
        LiveIconView liveIconView3 = (LiveIconView) findViewById(R.id.hrm);
        if (liveIconView3 != null) {
            liveIconView3.setEnabled(false);
            liveIconView3.setSelected(false);
            C29306Beo.LJJJLL(liveIconView3, 500L, new IDqS416S0100000(this, 57));
        } else {
            liveIconView3 = null;
        }
        this.LJLILLLLZI = liveIconView3;
        LiveIconView liveIconView4 = (LiveIconView) findViewById(R.id.h0v);
        if (liveIconView4 != null) {
            liveIconView4.setEnabled(false);
            C29306Beo.LJJJLL(liveIconView4, 500L, new IDqS416S0100000(this, 58));
        } else {
            liveIconView4 = null;
        }
        this.LJLJI = liveIconView4;
        LiveIconView liveIconView5 = (LiveIconView) findViewById(R.id.hsw);
        if (liveIconView5 != null) {
            C29306Beo.LJJJLL(liveIconView5, 500L, new IDqS416S0100000(this, 59));
            liveIconView2 = liveIconView5;
        }
        this.LJLJJI = liveIconView2;
    }

    public final void LJJLL(C279917z c279917z, boolean z) {
        boolean z2;
        if (!o.LJ(this.LJLJJLL, c279917z)) {
            this.LJLJJLL = c279917z;
            if (c279917z != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            LJJZ(z2, z);
        }
    }

    public final void LJJZ(boolean z, boolean z2) {
        LiveIconView liveIconView = this.LJLILLLLZI;
        if (liveIconView != null) {
            if (z2) {
                liveIconView.setIconAttr(R.attr.aur);
            } else {
                liveIconView.setIconAttr(R.attr.av3);
            }
            liveIconView.setEnabled(z);
            LiveIconView liveIconView2 = this.LJLILLLLZI;
            if (liveIconView2 != null) {
                liveIconView2.setSelected(z2);
            }
        }
        LiveIconView liveIconView3 = this.LJLJI;
        if (liveIconView3 == null) {
            return;
        }
        liveIconView3.setEnabled(z);
    }
}
