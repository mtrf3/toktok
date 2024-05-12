package X;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.SeekBar;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.6BC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BC {
    public final SeekBar LIZ;
    public C6BD<?> LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public final Handler LJFF;
    public InterfaceC65784Pro<C76800UCe> LJI;

    public C6BC(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
        this.LIZ = seekBar;
        this.LIZJ = 0.75f;
        this.LIZLLL = 1.2f;
        this.LJFF = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.6BA
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message it) {
                int i;
                o.LJIIIZ(it, "it");
                C6BC c6bc = C6BC.this;
                C6BD<?> c6bd = c6bc.LIZIZ;
                if (c6bd != null) {
                    float f = it.arg1;
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = c6bc.LIZ.getMin();
                    } else {
                        i = 0;
                    }
                    float f2 = i;
                    float max = c6bc.LIZ.getMax();
                    float f3 = c6bc.LIZJ;
                    float f4 = c6bc.LIZLLL;
                    if (f > f2) {
                        if (f >= max) {
                            f3 = f4;
                        } else {
                            f3 = C06420Na.LIZIZ(f, f2, f4, (max - f) * f3) / (max - f2);
                        }
                    }
                    c6bd.LJI(c6bd.LIZJ() * f3);
                    return true;
                }
                return true;
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.6BE
            public int LJLIL;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar2) {
                o.LJIIIZ(seekBar2, "seekBar");
                this.LJLIL = seekBar2.getProgress();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar2) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
                o.LJIIIZ(seekBar2, "seekBar");
                if (this.LJLIL != seekBar2.getProgress() && (interfaceC65784Pro = C6BC.this.LJI) != null) {
                    interfaceC65784Pro.invoke();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                o.LJIIIZ(seekBar2, "seekBar");
                C6BC c6bc = C6BC.this;
                if (c6bc.LIZIZ != null) {
                    Handler handler = c6bc.LJFF;
                    handler.sendMessage(handler.obtainMessage(0, i, 0));
                }
            }
        });
    }

    public final void LIZ(float f) {
        int i;
        if (this.LJ) {
            SeekBar seekBar = this.LIZ;
            float f2 = this.LIZJ;
            float f3 = this.LIZLLL;
            if (Build.VERSION.SDK_INT >= 26) {
                i = seekBar.getMin();
            } else {
                i = 0;
            }
            float f4 = i;
            float max = this.LIZ.getMax();
            if (f > f2) {
                if (f >= f3) {
                    f4 = max;
                } else {
                    f4 = C06420Na.LIZIZ(f, f2, max, (f3 - f) * f4) / (f3 - f2);
                }
            }
            seekBar.setProgress(O6R.LJJIIZ(f4));
            this.LJ = false;
        }
    }

    public final void LIZIZ(TextView textView) {
        Object obj;
        C6BD<?> c6bd;
        this.LJ = true;
        C6BD<?> c6bd2 = this.LIZIZ;
        C6BD<?> c6bd3 = null;
        if (c6bd2 != null) {
            obj = c6bd2.LIZ;
        } else {
            obj = null;
        }
        if (!o.LJ(obj, textView)) {
            C6BD<?> c6bd4 = this.LIZIZ;
            if (c6bd4 != null) {
                c6bd4.LJFF();
            }
            C6BF c6bf = new C6BF(this);
            if (textView != null) {
                if (textView instanceof C65A) {
                    c6bd3 = new C6BB((C65A) textView, this, c6bf);
                } else {
                    c6bd3 = new C6BD<>(textView, this, c6bf);
                }
                c6bd3.LJ();
            }
            this.LIZIZ = c6bd3;
            return;
        }
        if (!this.LJ || (c6bd = this.LIZIZ) == null) {
            return;
        }
        LIZ(c6bd.LIZLLL() / c6bd.LIZJ());
    }
}
