package X;

import Y.ACListenerS28S0101000_10;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OhT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62595OhT extends PopupWindow implements InterfaceC44975Hkx, InterfaceC81305VvZ, LLE, G27 {
    public final View LJLIL;
    public C62846OlW LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public View LJLJJL;
    public TuxTextView LJLJJLL;
    public LinearLayout LJLJL;
    public final Activity LJLJLJ;
    public final RunnableC57559MiR LJLJLLL;
    public final int LJLL;
    public C62624Ohw LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public LinearLayout LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final C62387Oe7 LJZI;
    public Aweme LJZL;
    public RecyclerView LL;
    public final String[] LLD;
    public long LLF;

    @Override // X.InterfaceC81305VvZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC81305VvZ
    public final void LIZIZ() {
        this.LJLLILLLL = false;
        onDismiss();
        C116694i1.LIZ(C45804HyK.LJJIFFI(this.LJLJLJ)).qv0(this);
    }

    public final void LIZLLL() {
        View decorView = this.LJLJLJ.getWindow().getDecorView();
        int i = -C63081OpJ.LJJJJLI(this.LJLJLJ);
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(this));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                showAtLocation(decorView, 48, 0, i);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i2;
                return;
            } catch (Throwable unused) {
                showAtLocation(decorView, 48, 0, i);
                return;
            }
        }
        showAtLocation(decorView, 48, 0, i);
    }

    @Override // X.InterfaceC44975Hkx
    public final void show() {
        ActivityC45651qj activityC45651qj;
        Activity activity = this.LJLJLJ;
        if (activity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) activity;
        } else {
            activityC45651qj = null;
        }
        PopupManager.LJIIL(new C7I2(activityC45651qj, new InterfaceC65784Pro() { // from class: X.OhV
            @Override // X.InterfaceC65784Pro
            public final Object invoke() {
                AbstractC62595OhT abstractC62595OhT = AbstractC62595OhT.this;
                C62624Ohw c62624Ohw = abstractC62595OhT.LJLLI;
                if (c62624Ohw != null) {
                    c62624Ohw.LIZIZ();
                }
                Activity activity2 = abstractC62595OhT.LJLJLJ;
                if (activity2 != null && !activity2.isFinishing() && !abstractC62595OhT.isShowing()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = abstractC62595OhT.LJLL;
                    abstractC62595OhT.LLF = currentTimeMillis + j;
                    abstractC62595OhT.LJLLI.postDelayed(abstractC62595OhT.LJLJLLL, j);
                    if (abstractC62595OhT.LJLIL.getParent() != null) {
                        C16880lQ.LJLLL(abstractC62595OhT.LJLIL, (ViewGroup) abstractC62595OhT.LJLIL.getParent());
                    }
                    try {
                        abstractC62595OhT.LIZLLL();
                    } catch (WindowManager.BadTokenException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    C1HQ c1hq = new C1HQ();
                    c1hq.put("enter_method", "publish_then_share");
                    FMX.LJIIL("share_panel_show", c1hq);
                    return null;
                }
                return null;
            }
        }));
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        C9XU.LIZLLL(this);
        PopupManager.LIZJ(C7I2.class);
    }

    public void onDismiss() {
        if (isShowing() && !this.LJLLILLLL) {
            try {
                Activity activity = this.LJLJLJ;
                if (activity != null && !activity.isFinishing()) {
                    C62624Ohw c62624Ohw = this.LJLLI;
                    if (c62624Ohw != null) {
                        c62624Ohw.LIZ(0.0f, true);
                    }
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZJ(CreateAwemeResponse createAwemeResponse) {
        C62846OlW c62846OlW;
        if (createAwemeResponse == null || createAwemeResponse.aweme == null || (c62846OlW = this.LJLILLLLZI) == null || c62846OlW.getVisibility() != 0 || createAwemeResponse.aweme.getVideo() == null) {
            return;
        }
        C78765Uvh.LJI(this.LJLILLLLZI, C62417Oeb.LIZJ(createAwemeResponse), (int) KL2.LIZJ(this.LJLJLJ, this.LJLZ), (int) KL2.LIZJ(this.LJLJLJ, this.LJZ), null);
    }

    @Override // android.widget.PopupWindow, X.InterfaceC44975Hkx
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        setWidth((int) KL2.LIZJ(activity, configuration.screenWidthDp));
    }

    public AbstractC62595OhT(ActivityC45651qj activityC45651qj, C62387Oe7 c62387Oe7, String[] strArr) {
        super(activityC45651qj);
        this.LJLL = LivePlayerResourceReleaseSetting.ENABLE;
        this.LJLZ = 49;
        this.LJZ = 59;
        this.LJLJLJ = activityC45651qj;
        this.LJZI = c62387Oe7;
        this.LLD = strArr;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cma, C16880lQ.LLZIL(activityC45651qj), null);
        this.LJLIL = LLLZIIL;
        this.LJLJLLL = new RunnableC57559MiR(this);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(LLLZIIL);
        setWidth(-1);
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a_l);
        this.LJLJJL = LLLZIIL.findViewById(R.id.j5d);
        this.LJLILLLLZI = (C62846OlW) LLLZIIL.findViewById(R.id.f5a);
        this.LJLJI = (TuxTextView) LLLZIIL.findViewById(R.id.m4m);
        this.LJLJJI = (TuxTextView) LLLZIIL.findViewById(R.id.mll);
        this.LJLJL = (LinearLayout) LLLZIIL.findViewById(R.id.j5n);
        this.LJLLI = (C62624Ohw) LLLZIIL.findViewById(R.id.ig1);
        LLLZIIL.findViewById(R.id.f0w);
        LLLZIIL.findViewById(R.id.m2s);
        this.LJLLL = LLLZIIL.findViewById(R.id.g2e);
        this.LJLLLL = LLLZIIL.findViewById(R.id.fs1);
        this.LJLJJLL = (TuxTextView) LLLZIIL.findViewById(R.id.mcj);
        this.LJLLLLLL = (LinearLayout) LLLZIIL.findViewById(R.id.g1w);
        C62624Ohw c62624Ohw = this.LJLLI;
        c62624Ohw.LJLJI = this.LJLJL;
        c62624Ohw.setPullUpListener(this);
        this.LJLJL.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C16880lQ.LJJJJJL(this.LJLILLLLZI, new ACListenerS28S0101000_10(2, this, 7));
        this.LL = (RecyclerView) LLLZIIL.findViewById(R.id.jui);
        this.LJLLI.setInternalTouchEventListener(new InterfaceC62716OjQ() { // from class: X.OhW
            @Override // X.InterfaceC62716OjQ
            public final void LJIIIIZZ(MotionEvent motionEvent) {
                AbstractC62595OhT abstractC62595OhT = AbstractC62595OhT.this;
                abstractC62595OhT.getClass();
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            return;
                        }
                        abstractC62595OhT.LJLLILLLL = true;
                        return;
                    }
                    abstractC62595OhT.LJLLILLLL = false;
                    abstractC62595OhT.LJLLJ = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = abstractC62595OhT.LJLL;
                    abstractC62595OhT.LLF = currentTimeMillis + j;
                    RunnableC57559MiR runnableC57559MiR = abstractC62595OhT.LJLJLLL;
                    runnableC57559MiR.LJLIL = false;
                    LinearLayout linearLayout = abstractC62595OhT.LJLJL;
                    if (linearLayout == null) {
                        return;
                    }
                    linearLayout.postDelayed(runnableC57559MiR, j);
                    return;
                }
                abstractC62595OhT.LJLLILLLL = true;
                RunnableC57559MiR runnableC57559MiR2 = abstractC62595OhT.LJLJLLL;
                if (runnableC57559MiR2 == null) {
                    return;
                }
                runnableC57559MiR2.LJLIL = true;
            }
        });
        C116694i1.LIZ(C45804HyK.LJJIFFI(activityC45651qj)).hv0(this);
        C9XU.LIZIZ(activityC45651qj, this);
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        String[] strArr = this.LLD;
        if (strArr != null && strArr.length > 0) {
            boolean z3 = false;
            for (String str4 : strArr) {
                if (str4.equals(str)) {
                    z3 = true;
                }
            }
            if (z3) {
                this.LJLIL.setVisibility(0);
            } else {
                this.LJLIL.setVisibility(8);
            }
        }
    }
}
