package X;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.SeekBar;
import android.widget.TextView;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6OK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OK {
    public final SeekBar LIZ;
    public final C1NS<TextStickerModel> LIZIZ;
    public C6OL<?> LIZJ;
    public float LIZLLL;
    public float LJ;
    public boolean LJFF;
    public final Handler LJI;
    public InterfaceC65784Pro<C76800UCe> LJII;

    public final void LIZ(float f) {
        int i;
        if (this.LJFF) {
            SeekBar seekBar = this.LIZ;
            float f2 = this.LIZLLL;
            float f3 = this.LJ;
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
            this.LJFF = false;
        }
    }

    public final void LIZIZ(TextView textView) {
        TextView textView2;
        C6OL<?> c6ol;
        this.LJFF = true;
        C6OL<?> c6ol2 = this.LIZJ;
        C6OL<?> c6ol3 = null;
        if (c6ol2 != null) {
            textView2 = c6ol2.LIZ;
        } else {
            textView2 = null;
        }
        if (!o.LJ(textView2, textView)) {
            C6OL<?> c6ol4 = this.LIZJ;
            if (c6ol4 != null) {
                c6ol4.LJFF();
            }
            C6OS c6os = new C6OS(this);
            C1NS<TextStickerModel> stateContainer = this.LIZIZ;
            o.LJIIIZ(stateContainer, "stateContainer");
            if (textView != null) {
                if (textView instanceof C159366Ng) {
                    c6ol3 = new C6OJ((C159366Ng) textView, this, c6os, stateContainer);
                } else {
                    c6ol3 = new C6OL<>(textView, this, c6os);
                }
                c6ol3.LJ();
            }
            this.LIZJ = c6ol3;
            return;
        }
        if (!this.LJFF || (c6ol = this.LIZJ) == null) {
            return;
        }
        LIZ(c6ol.LIZLLL() / c6ol.LIZJ());
    }

    public C6OK(C6OI seekBar, C1NS c1ns) {
        o.LJIIIZ(seekBar, "seekBar");
        this.LIZ = seekBar;
        this.LIZIZ = c1ns;
        this.LIZLLL = 0.75f;
        this.LJ = 1.2f;
        this.LJI = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.6OO
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message it) {
                int i;
                o.LJIIIZ(it, "it");
                C6OK c6ok = C6OK.this;
                C6OL<?> c6ol = c6ok.LIZJ;
                if (c6ol != null) {
                    float f = it.arg1;
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = c6ok.LIZ.getMin();
                    } else {
                        i = 0;
                    }
                    float f2 = i;
                    float max = c6ok.LIZ.getMax();
                    float f3 = c6ok.LIZLLL;
                    float f4 = c6ok.LJ;
                    if (f > f2) {
                        if (f >= max) {
                            f3 = f4;
                        } else {
                            f3 = C06420Na.LIZIZ(f, f2, f4, (max - f) * f3) / (max - f2);
                        }
                    }
                    c6ol.LJI(c6ol.LIZJ() * f3);
                    return true;
                }
                return true;
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.6OQ
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
                if (this.LJLIL != seekBar2.getProgress() && (interfaceC65784Pro = C6OK.this.LJII) != null) {
                    interfaceC65784Pro.invoke();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                o.LJIIIZ(seekBar2, "seekBar");
                C6OK c6ok = C6OK.this;
                if (c6ok.LIZJ != null) {
                    Handler handler = c6ok.LJI;
                    handler.sendMessage(handler.obtainMessage(0, i, 0));
                }
            }
        });
    }
}
