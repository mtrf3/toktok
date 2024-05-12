package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5RA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RA implements InterfaceC134705Qk {
    public final Context LJLIL;
    public View LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public SeekBar LJLJJL;
    public C52Q LJLJJLL;
    public boolean LJLJL;
    public final long LJLJLJ;
    public final SafeHandler LJLJLLL;
    public final ARunnableS38S0100000_2 LJLL;

    @Override // X.InterfaceC134705Qk
    public final void LLLLLLZZ(float f, boolean z) {
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZL(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC134705Qk
    public final void onHide() {
    }

    @Override // X.InterfaceC134705Qk
    public final void onCreate() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        int i;
        Number number;
        Object LLILL = C16880lQ.LLILL(this.LJLIL, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        SeekBar seekBar = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.as_, (LayoutInflater) LLILL, null);
        this.LJLILLLLZI = LLLZIIL;
        if (LLLZIIL != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.height = (int) KL2.LIZJ(LLLZIIL.getContext(), 83.0f);
            LLLZIIL.setLayoutParams(layoutParams);
        }
        View view = this.LJLILLLLZI;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.m7d);
        } else {
            tuxTextView = null;
        }
        this.LJLJI = tuxTextView;
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            tuxTextView2 = (TuxTextView) view2.findViewById(R.id.m7e);
        } else {
            tuxTextView2 = null;
        }
        this.LJLJJI = tuxTextView2;
        View view3 = this.LJLILLLLZI;
        if (view3 != null) {
            seekBar = (SeekBar) view3.findViewById(R.id.jko);
        }
        this.LJLJJL = seekBar;
        C52Q c52q = this.LJLJJLL;
        if (c52q != null) {
            i = (int) c52q.LLZZZZ();
        } else {
            i = 0;
        }
        TuxTextView tuxTextView3 = this.LJLJJI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C78605Ut7.LJIIL(i));
        }
        C52Q c52q2 = this.LJLJJLL;
        if (c52q2 != null) {
            number = Float.valueOf(c52q2.b());
        } else {
            number = 0;
        }
        int intValue = number.intValue();
        TuxTextView tuxTextView4 = this.LJLJI;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(C78605Ut7.LJIIL(intValue));
        }
        SeekBar seekBar2 = this.LJLJJL;
        if (seekBar2 != null) {
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.5RB
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar3, int i2, boolean z) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar3) {
                    C5RA.this.LJLJL = true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v6, types: [X.5RC] */
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar3) {
                    int i2;
                    if (seekBar3 != null) {
                        i2 = seekBar3.getProgress();
                    } else {
                        i2 = 0;
                    }
                    final C5RA c5ra = C5RA.this;
                    C52Q c52q3 = c5ra.LJLJJLL;
                    if (c52q3 != 0) {
                        c52q3.d(((c52q3.LLZZZZ() * i2) * 1.0f) / 100, new C5R8() { // from class: X.5RC
                            @Override // X.C5R8
                            public final void LIZ() {
                                C5RA.this.LJLJL = false;
                            }
                        });
                    }
                }
            });
        }
        this.LJLJLLL.post(this.LJLL);
    }

    @Override // X.InterfaceC134705Qk
    public final void onDestroy() {
        this.LJLJLLL.removeCallbacks(this.LJLL);
    }

    @Override // X.InterfaceC134705Qk
    public final View getView() {
        return this.LJLILLLLZI;
    }

    public C5RA(ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLJLJ = 60L;
        this.LJLJLLL = new SafeHandler(context);
        this.LJLL = new ARunnableS38S0100000_2(this, 150);
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZ(DialogC134805Qu dialogC134805Qu) {
        this.LJLJJLL = dialogC134805Qu;
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZIL(Animation animation, boolean z) {
        int i;
        View view = this.LJLILLLLZI;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
    }
}
