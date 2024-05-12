package com.bytedance.android.live.broadcast.mirror.widget;

import X.C05440Jg;
import X.C0JV;
import X.C0JW;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C1GE;
import X.C259710f;
import X.C259910h;
import X.C47061t0;
import X.C47071t1;
import X.C47121t6;
import X.OJM;
import X.X1D;
import Y.IDCListenerS135S0100000;
import Y.IDcS169S0100000;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class GameCastWidget extends LiveRecyclableWidget {
    public final int LJLIL;
    public final Bundle LJLILLLLZI;
    public C47061t0 LJLJI;
    public C47121t6 LJLJJI;
    public C47061t0 LJLJJL;
    public boolean LJLJJLL;

    public abstract void LJLZ(boolean z);

    public abstract void LJZL();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dod;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJZ() {
        String str;
        String LJIILJJIL;
        for (Map.Entry entry : ((ConcurrentHashMap) C05440Jg.LIZIZ).entrySet()) {
            if (!o.LJ(entry.getKey(), getClass()) && ((Boolean) entry.getValue()).booleanValue()) {
                boolean z = !o.LJ(getClass(), GameCastWiredWidget.class);
                C0JW c0jw = C0JW.LIZ;
                Context context = this.context;
                IDqS420S0100000 iDqS420S0100000 = new IDqS420S0100000(this, 42);
                c0jw.getClass();
                if (context != null) {
                    String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.la_);
                    if (LJIILJJIL2 != null) {
                        if (!z) {
                            LJIILJJIL = C15380j0.LJIILJJIL(R.string.lad);
                        } else {
                            LJIILJJIL = C15380j0.LJIILJJIL(R.string.lae);
                        }
                        if (LJIILJJIL != null) {
                            str = ujb.o.LJJJJZ(LJIILJJIL2, "{cast_type}", LJIILJJIL, false);
                        }
                    } else {
                        str = null;
                    }
                    C47071t1 c47071t1 = new C47071t1(context);
                    c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.lab), new IDcS169S0100000(iDqS420S0100000, 10));
                    c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.laa), C1GE.LJLIL);
                    c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.lac);
                    c47071t1.LJII(str);
                    c47071t1.LJIILJJIL = false;
                    c47071t1.LJIILL = true;
                    C0JW.LIZIZ(c47071t1.LIZ());
                }
                C0JV.LJIIIZ("manual", !o.LJ(getClass(), GameCastWirelessWidget.class));
                return;
            }
        }
        LJLZ(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        OJM<GameCastWidget> ojm;
        OJM<GameCastWidget> ojm2 = C05440Jg.LIZ;
        if (ojm2 != null && ojm2.LJLIL.containsKey(this) && (ojm = C05440Jg.LIZ) != null) {
            ojm.LJIJ(this);
        }
    }

    public final void LJZI(boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("selected: true , class: ");
            LIZ.append(getClass());
            C0NB.LJ("cast_wired", X1D.LIZIZ(LIZ));
            C47061t0 c47061t0 = this.LJLJJL;
            if (c47061t0 != null) {
                c47061t0.setVisibility(0);
            }
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 != null) {
                c47121t6.setTextColor(C259910h.LIZJ(R.attr.bnd, c47121t6));
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("selected: false , class: ");
        LIZ2.append(getClass());
        C0NB.LJ("cast_wired", X1D.LIZIZ(LIZ2));
        C47061t0 c47061t02 = this.LJLJJL;
        if (c47061t02 != null) {
            c47061t02.setVisibility(8);
        }
        C47121t6 c47121t62 = this.LJLJJI;
        if (c47121t62 == null) {
            return;
        }
        c47121t62.setTextColor(C259910h.LIZJ(R.attr.bns, c47121t62));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C259710f.LIZ.LIZJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLJI = (C47061t0) findViewById(R.id.b6l);
        this.LJLJJL = (C47061t0) findViewById(R.id.b6k);
        this.LJLJJI = (C47121t6) findViewById(R.id.nj3);
        if (C05440Jg.LIZ == null) {
            C05440Jg.LIZ = new OJM<>();
        }
        OJM<GameCastWidget> ojm = C05440Jg.LIZ;
        if (ojm == null || !ojm.LJLIL.containsKey(this)) {
            OJM<GameCastWidget> ojm2 = C05440Jg.LIZ;
            if (ojm2 != null) {
                ojm2.LJIIZILJ(this);
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C05440Jg.LIZIZ;
            if (!concurrentHashMap.containsKey(getClass())) {
                concurrentHashMap.put(getClass(), Boolean.FALSE);
            }
        }
        this.LJLJJLL = C05440Jg.LIZ(getClass());
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 32), view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        LJZI(this.LJLJJLL);
    }

    public GameCastWidget(int i, Bundle bundle) {
        this.LJLIL = i;
        this.LJLILLLLZI = bundle;
    }
}
