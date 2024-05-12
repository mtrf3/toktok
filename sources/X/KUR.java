package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class KUR extends FrameLayout implements InterfaceC51613KNl {
    public final List<View> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;

    public KUR() {
        throw null;
    }

    public final void LJII() {
        setVisibility(0);
        setStatus(1);
    }

    public final void LJIIIIZZ() {
        setVisibility(0);
        setStatus(2);
    }

    public final void LJIIIZ() {
        setVisibility(0);
        setStatus(0);
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        if (this.LJLJJL) {
            jSONObject.put("retry_method", "click_retry_button");
        } else {
            jSONObject.put("retry_method", "tap_to_retry");
        }
        this.LJLJJL = false;
        long j = this.LJLJJLL - this.LJLJL;
        this.LJLJLJ += j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLJL = currentTimeMillis;
        jSONObject.put("retry_duration", currentTimeMillis - this.LJLJJLL).put("retry_wait", j);
        return jSONObject;
    }

    public final boolean LIZLLL() {
        if (this.LJLILLLLZI == -1) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        int i = this.LJLILLLLZI;
        if (i == -1) {
            return;
        }
        View LIZJ = LIZJ(i);
        if (LIZJ != null) {
            LIZJ.setVisibility(4);
        }
        setVisibility(4);
        this.LJLILLLLZI = -1;
    }

    @Override // X.InterfaceC51613KNl
    public final void LIZ(int i) {
        LJIIJ(i);
    }

    public final View LIZJ(int i) {
        if (i < 0 || i >= ((ArrayList) this.LJLIL).size()) {
            return null;
        }
        return (View) ListProtector.get(this.LJLIL, i);
    }

    public final void LJFF(boolean z) {
        long j;
        try {
            if (z) {
                if (this.LJLJLLL > 0) {
                    LJ("prf_network_error_page_retry", LIZIZ().put("retry_result", 1));
                    JSONObject put = new JSONObject().put("retry_result", 1).put("retry_time_count", this.LJLJJI).put("stay_duration", System.currentTimeMillis() - this.LJLJLLL);
                    int i = this.LJLJJI;
                    if (i != 0) {
                        j = this.LJLJLJ / i;
                    } else {
                        j = 0;
                    }
                    LJ("prf_leave_network_error_page", put.put("retry_wait_avg", j));
                    this.LJLJJI = 0;
                    this.LJLJJL = false;
                    this.LJLJJLL = 0L;
                    this.LJLJLJ = 0L;
                    this.LJLJLLL = 0L;
                    this.LJLJL = 0L;
                    return;
                }
                return;
            }
            if (this.LJLJJI == 0) {
                this.LJLJJI = 0;
                this.LJLJJL = false;
                this.LJLJJLL = 0L;
                this.LJLJLJ = 0L;
                this.LJLJLLL = 0L;
                this.LJLJL = 0L;
                long currentTimeMillis = System.currentTimeMillis();
                this.LJLJLLL = currentTimeMillis;
                this.LJLJL = currentTimeMillis;
                LJ("prf_enter_network_error_page", new JSONObject());
                return;
            }
            LJ("prf_network_error_page_retry", LIZIZ().put("retry_result", 0));
        } catch (Exception unused) {
        }
    }

    public final void LJIIJ(int i) {
        if (i >= 0 && this.LJLJI != i) {
            this.LJLJI = i;
            View view = (View) ListProtector.get(this.LJLIL, 0);
            if (view instanceof C8ID) {
                ((C8ID) view).LIZ(this.LJLJI);
            }
            KeyEvent.Callback callback = (View) ListProtector.get(this.LJLIL, 1);
            if (callback instanceof InterfaceC51613KNl) {
                ((InterfaceC51613KNl) callback).LIZ(this.LJLJI);
            }
            View view2 = (View) ListProtector.get(this.LJLIL, 2);
            if (view2 instanceof C51612KNk) {
                ((C51612KNk) view2).LIZ(this.LJLJI);
            }
            View view3 = (View) ListProtector.get(this.LJLIL, 3);
            if (view3 instanceof C51612KNk) {
                ((C51612KNk) view3).LIZ(this.LJLJI);
            }
            View view4 = (View) ListProtector.get(this.LJLIL, 4);
            if (view4 instanceof C51612KNk) {
                ((C51612KNk) view4).LIZ(this.LJLJI);
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        long j;
        if (!z) {
            if (this.LJLJLLL > 0) {
                try {
                    JSONObject put = new JSONObject().put("retry_result", 0).put("retry_time_count", this.LJLJJI).put("stay_duration", System.currentTimeMillis() - this.LJLJLLL);
                    int i = this.LJLJJI;
                    if (i != 0) {
                        j = this.LJLJLJ / i;
                    } else {
                        j = 0;
                    }
                    LJ("prf_leave_network_error_page", put.put("retry_wait_avg", j));
                } catch (Exception unused) {
                }
            }
            this.LJLJJI = 0;
            this.LJLJJL = false;
            this.LJLJJLL = 0L;
            this.LJLJLJ = 0L;
            this.LJLJLLL = 0L;
            this.LJLJL = 0L;
        }
        super.onVisibilityAggregated(z);
    }

    public void setBuilder(KUY kuy) {
        if (kuy == null) {
            kuy = KUY.LIZ(getContext());
        }
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).add(kuy.LIZIZ);
        ((ArrayList) this.LJLIL).add(kuy.LIZJ);
        ((ArrayList) this.LJLIL).add(kuy.LIZLLL);
        ((ArrayList) this.LJLIL).add(kuy.LJ);
        ((ArrayList) this.LJLIL).add(null);
        if (kuy.LJFF < 0) {
            kuy.LJFF = 0;
        }
        LJIIJ(kuy.LJFF);
        removeAllViews();
        for (int i = 0; i < ((ArrayList) this.LJLIL).size(); i++) {
            View view = (View) ListProtector.get(this.LJLIL, i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStatus(int r9) {
        /*
            r8 = this;
            int r2 = r8.LJLILLLLZI
            if (r2 != r9) goto L5
            return
        L5:
            android.view.View r5 = r8.LIZJ(r2)
            r4 = 0
            r3 = 4
            r1 = 3
            r0 = 2
            if (r9 == r0) goto L63
            if (r9 == r1) goto L63
            if (r9 == r3) goto L63
        L13:
            if (r2 == r0) goto L3b
            if (r2 == r1) goto L3b
            if (r2 == r3) goto L3b
        L19:
            int r0 = r8.LJLILLLLZI
            if (r0 < 0) goto L26
            android.view.View r0 = r8.LIZJ(r0)
            if (r0 == 0) goto L26
            r0.setVisibility(r3)
        L26:
            if (r9 < 0) goto L37
            r8.setVisibility(r4)
            android.view.View r0 = r8.LIZJ(r9)
            if (r0 == 0) goto L34
            r0.setVisibility(r4)
        L34:
            r8.LJLILLLLZI = r9
            return
        L37:
            r8.setVisibility(r3)
            goto L34
        L3b:
            if (r9 != 0) goto L19
            long r1 = r8.LJLJLLL
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L19
            int r0 = r8.LJLJJI
            r2 = 1
            int r0 = r0 + 1
            r8.LJLJJI = r0
            long r0 = java.lang.System.currentTimeMillis()
            r8.LJLJJLL = r0
            boolean r0 = r5 instanceof X.C51612KNk
            if (r0 == 0) goto L61
            X.KNk r5 = (X.C51612KNk) r5
            boolean r0 = r5.LJZI
            r5.LJZI = r4
            if (r0 == 0) goto L61
        L5e:
            r8.LJLJJL = r2
            goto L19
        L61:
            r2 = 0
            goto L5e
        L63:
            r8.LJFF(r4)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KUR.setStatus(int):void");
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if ((i == 4 || i == 8) && getVisibility() == 0 && this.LJLILLLLZI == 0) {
            LJFF(true);
        }
        super.setVisibility(i);
    }

    public KUR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new ArrayList(5);
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
        this.LJLJJI = 0;
        this.LJLJJL = false;
        this.LJLJJLL = 0L;
        this.LJLJL = 0L;
        this.LJLJLJ = 0L;
        this.LJLJLLL = 0L;
    }

    public final void LJ(String str, JSONObject jSONObject) {
        C208318Fn.LIZ(getContext(), str, C12460eI.LJFF(), jSONObject);
    }
}
