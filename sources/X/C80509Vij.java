package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.Vij, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80509Vij extends ConstraintLayout {
    public final C80438Vha LJLIL;
    public final C80438Vha LJLILLLLZI;
    public final C80508Vii LJLJI;
    public final C74059T4t LJLJJI;
    public final C80401Vgz LJLJJL;
    public InterfaceC80527Vj1 LJLJJLL;
    public InterfaceC80524Viy LJLJL;
    public InterfaceC80526Vj0 LJLJLJ;

    public final void LJJLJLI() {
        if (this.LJLJJL.getVisibility() == 0) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(this);
            int i = 1;
            if (C16310kV.LIZLLL(this) == 0) {
                i = 2;
            }
            anonymousClass064.LJI(R.id.gfr, i);
            anonymousClass064.LIZIZ(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJJLJLI();
    }

    public void setActiveSelection(int i) {
        boolean z;
        C80438Vha c80438Vha = this.LJLIL;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        c80438Vha.setChecked(z);
        C80438Vha c80438Vha2 = this.LJLILLLLZI;
        if (i != 10) {
            z2 = false;
        }
        c80438Vha2.setChecked(z2);
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.LJLJI.LJLILLLLZI = z;
    }

    public void setHandRotation(float f) {
        this.LJLJI.LIZIZ(f, false);
    }

    public void setHourClickDelegate(C16120kC c16120kC) {
        h0.LJIJI(this.LJLIL, c16120kC);
    }

    public void setMinuteHourDelegate(C16120kC c16120kC) {
        h0.LJIJI(this.LJLILLLLZI, c16120kC);
    }

    public void setOnActionUpListener(InterfaceC80525Viz interfaceC80525Viz) {
        this.LJLJI.LJLLLL = interfaceC80525Viz;
    }

    public void setOnDoubleTapListener(InterfaceC80526Vj0 interfaceC80526Vj0) {
        this.LJLJLJ = interfaceC80526Vj0;
    }

    public void setOnPeriodChangeListener(InterfaceC80527Vj1 interfaceC80527Vj1) {
        this.LJLJJLL = interfaceC80527Vj1;
    }

    public void setOnSelectionChangeListener(InterfaceC80524Viy interfaceC80524Viy) {
        this.LJLJL = interfaceC80524Viy;
    }

    public C80509Vij(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            LJJLJLI();
        }
    }

    public C80509Vij(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC80520Viu viewOnClickListenerC80520Viu = new ViewOnClickListenerC80520Viu(this);
        C16880lQ.LLLZIIL(R.layout.brx, C16880lQ.LLZIL(context), this);
        this.LJLJJI = (C74059T4t) findViewById(R.id.gfs);
        C80401Vgz c80401Vgz = (C80401Vgz) findViewById(R.id.gfw);
        this.LJLJJL = c80401Vgz;
        c80401Vgz.LJLJJI.add(new C80515Vip(this));
        C80438Vha c80438Vha = (C80438Vha) findViewById(R.id.gg1);
        this.LJLIL = c80438Vha;
        C80438Vha c80438Vha2 = (C80438Vha) findViewById(R.id.gfy);
        this.LJLILLLLZI = c80438Vha2;
        this.LJLJI = (C80508Vii) findViewById(R.id.gft);
        ViewOnTouchListenerC29991Bpr viewOnTouchListenerC29991Bpr = new ViewOnTouchListenerC29991Bpr(new GestureDetector(getContext(), new C80511Vil(this)));
        c80438Vha.setOnTouchListener(viewOnTouchListenerC29991Bpr);
        c80438Vha2.setOnTouchListener(viewOnTouchListenerC29991Bpr);
        c80438Vha.setTag(R.id.jmw, 12);
        c80438Vha2.setTag(R.id.jmw, 10);
        c80438Vha.setOnClickListener(new ViewOnClickListenerC13880ga(viewOnClickListenerC80520Viu));
        c80438Vha2.setOnClickListener(new ViewOnClickListenerC13880ga(viewOnClickListenerC80520Viu));
    }
}
