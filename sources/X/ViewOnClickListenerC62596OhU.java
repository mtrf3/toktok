package X;

import Y.AObjectS55S0101000_10;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OhU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC62596OhU extends PopupWindow implements InterfaceC44975Hkx, InterfaceC81305VvZ, View.OnClickListener {
    public int LJLIL;
    public C81303VvX LJLILLLLZI;
    public boolean LJLJI;
    public final RunnableC62601OhZ LJLJJI;
    public long LJLJJL;
    public final View LJLJJLL;
    public Activity LJLJL;
    public RelativeLayout LJLJLJ;
    public C62846OlW LJLJLLL;
    public Aweme LJLL;

    @Override // X.InterfaceC81305VvZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC81305VvZ
    public final void LIZIZ() {
        this.LJLJI = false;
        onDismiss();
    }

    @Override // X.InterfaceC44975Hkx
    public final void show() {
        ActivityC45651qj activityC45651qj;
        Activity activity = this.LJLJL;
        if (activity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) activity;
        } else {
            activityC45651qj = null;
        }
        PopupManager.LJIIL(new C7I2(activityC45651qj, new AObjectS55S0101000_10(0, this, 1)));
    }

    public ViewOnClickListenerC62596OhU() {
        super(EF7.LIZIZ());
        this.LJLIL = LivePlayerResourceReleaseSetting.ENABLE;
        this.LJLJI = false;
        this.LJLJJL = 0L;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cmb, (LayoutInflater) C16880lQ.LLILL(EF7.LIZIZ(), "layout_inflater"), null);
        this.LJLJJLL = LLLZIIL;
        this.LJLJLLL = (C62846OlW) LLLZIIL.findViewById(R.id.f5a);
        this.LJLJLJ = (RelativeLayout) LLLZIIL.findViewById(R.id.j5n);
        C81303VvX c81303VvX = (C81303VvX) LLLZIIL.findViewById(R.id.ig1);
        this.LJLILLLLZI = c81303VvX;
        c81303VvX.LJLJI = this.LJLJLJ;
        c81303VvX.setPullUpListener(this);
        C16880lQ.LJJJJJL(this.LJLJLLL, this);
        this.LJLILLLLZI.setInternalTouchEventListener(new C62600OhY(this));
        this.LJLJJI = new RunnableC62601OhZ(this);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(LLLZIIL);
        setWidth(KL2.LJIIJJI(EF7.LIZIZ()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a_l);
    }

    @Override // X.InterfaceC44975Hkx
    public final void onDismiss() {
        if (isShowing() && !this.LJLJI) {
            try {
                Activity activity = this.LJLJL;
                if (activity != null && !activity.isFinishing()) {
                    C81303VvX c81303VvX = this.LJLILLLLZI;
                    if (c81303VvX != null) {
                        c81303VvX.LIZ(0.0f, true);
                    }
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.LJLJL = null;
            PopupManager.LIZJ(C7I2.class);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.f5a) {
            C61200O0e LIZLLL = C61200O0e.LIZLLL();
            Activity activity = this.LJLJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("aweme://aweme/detail/");
            LIZ.append(this.LJLL.getAid());
            C39061g6 c39061g6 = new C39061g6(X1D.LIZIZ(LIZ));
            c39061g6.LIZIZ("refer", "upload");
            LIZLLL.LJI(activity, c39061g6.LIZJ());
            AVExternalServiceImpl.LIZ().publishService().setPublishStatus(11);
            onDismiss();
        }
    }

    @Override // android.widget.PopupWindow, X.InterfaceC44975Hkx
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }
}
