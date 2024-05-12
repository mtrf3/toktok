package X;

import Y.ACListenerS22S0100000_2;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5EZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EZ extends AbstractC131515Ed {
    public final long LJLIL = ((Number) C5BA.LIZ(EnumC127484zQ.MAX_EDIT_VIDEO_LIMIT_TIME_MILLIS, Long.MAX_VALUE)).longValue();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C131495Eb.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1038));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1041));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1039));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1040));
    public Long LJLJL;
    public Long LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public Integer LJLLILLLL;

    @Override // X.AbstractC131515Ed
    public final int LLJILJIL(C52V actionType) {
        o.LJIIIZ(actionType, "actionType");
        int i = C52Z.LIZ[actionType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    if (i != 5) {
                        return -1;
                    }
                    return R.id.f2a;
                }
                return R.id.f2b;
            }
            return R.id.f2c;
        }
        return R.id.f2d;
    }

    @Override // X.AbstractC131515Ed
    public final void LLJILJILJ(long j) {
        Long l = this.LJLJL;
        long j2 = j / 1000;
        if (l == null || l.longValue() != j2) {
            this.LJLJL = Long.valueOf(j2);
            TuxTextView tuxTextView = this.LJLL;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setText(F9C.LIZ((int) j));
        }
    }

    @Override // X.AbstractC131515Ed
    public final void LLJJ(C52X state) {
        boolean z;
        Drawable drawable;
        o.LJIIIZ(state, "state");
        TuxIconView tuxIconView = this.LJLJLLL;
        if (tuxIconView != null) {
            if (state == C52X.PLAY) {
                z = true;
            } else {
                z = false;
            }
            tuxIconView.setActivated(z);
        }
        if (state == C52X.PLAY) {
            drawable = (Drawable) this.LJLJJL.getValue();
        } else {
            drawable = (Drawable) this.LJLJJLL.getValue();
        }
        TuxIconView tuxIconView2 = this.LJLJLLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setImageDrawable(drawable);
        }
    }

    @Override // X.AbstractC131515Ed
    public final void LLJJI(long j) {
        Long l = this.LJLJLJ;
        long j2 = j / 1000;
        if (l == null || l.longValue() != j2) {
            this.LJLJLJ = Long.valueOf(j2);
            if (j > this.LJLIL) {
                Integer num = (Integer) this.LJLJI.getValue();
                if (num != null) {
                    int intValue = num.intValue();
                    Integer num2 = this.LJLLILLLL;
                    if (num2 == null || num2.intValue() != intValue) {
                        this.LJLLILLLL = Integer.valueOf(intValue);
                        TuxTextView tuxTextView = this.LJLLI;
                        if (tuxTextView != null) {
                            tuxTextView.setTextColor(intValue);
                        }
                    }
                }
            } else {
                Integer num3 = (Integer) this.LJLJJI.getValue();
                if (num3 != null) {
                    int intValue2 = num3.intValue();
                    Integer num4 = this.LJLLILLLL;
                    if (num4 == null || num4.intValue() != intValue2) {
                        this.LJLLILLLL = Integer.valueOf(intValue2);
                        TuxTextView tuxTextView2 = this.LJLLI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setTextColor(intValue2);
                        }
                    }
                }
            }
            TuxTextView tuxTextView3 = this.LJLLI;
            if (tuxTextView3 == null) {
                return;
            }
            tuxTextView3.setText(F9C.LIZ((int) j));
        }
    }

    @Override // X.AbstractC131515Ed, X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.5Ea
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C131555Eh) obj).LIZIZ);
            }
        }, null, new AqS168S0100000_2(this, 645), 2, null);
        TuxIconView tuxIconView = this.LJLJLLL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS22S0100000_2(this, 167));
        }
    }

    @Override // X.AbstractC131515Ed
    public final void LLJJIII(C52V actionType, boolean z, boolean z2) {
        o.LJIIIZ(actionType, "actionType");
        View findViewById = findViewById(LLJILJIL(actionType));
        if (findViewById == null) {
            return;
        }
        findViewById.setClickable(z);
        if (!z2) {
            return;
        }
        if (!z) {
            findViewById.setAlpha(0.34f);
            findViewById.setEnabled(false);
        } else {
            findViewById.setAlpha(1.0f);
            findViewById.setEnabled(true);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bj8, container, false);
        ((C48295IxP) LLLLIILL.findViewById(R.id.mnk)).setHasFixSize(true);
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.mnv);
        if (textView != null) {
            textView.setText("/");
        }
        this.LJLJLLL = (TuxIconView) LLLLIILL.findViewById(R.id.f2b);
        this.LJLL = (TuxTextView) LLLLIILL.findViewById(R.id.m3y);
        this.LJLLI = (TuxTextView) LLLLIILL.findViewById(R.id.mp9);
        LLLLIILL.findViewById(R.id.f2c);
        LLLLIILL.findViewById(R.id.f2d);
        View findViewById = LLLLIILL.findViewById(R.id.f2d);
        if (findViewById != null) {
            C78897Uxp.LJJJJLL(findViewById);
        }
        View findViewById2 = LLLLIILL.findViewById(R.id.f2c);
        if (findViewById2 != null) {
            C78897Uxp.LJJJJLL(findViewById2);
        }
        View findViewById3 = LLLLIILL.findViewById(R.id.f2a);
        if (findViewById3 != null) {
            C78897Uxp.LJJJJLL(findViewById3);
        }
        return (ViewGroup) LLLLIILL;
    }
}
