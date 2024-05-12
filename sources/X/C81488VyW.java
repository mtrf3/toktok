package X;

import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.VyW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81488VyW implements InterfaceC81487VyV {
    public final /* synthetic */ C81574Vzu LJLIL;

    public C81488VyW(C81574Vzu c81574Vzu) {
        this.LJLIL = c81574Vzu;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        CountDownTimerC81485VyT countDownTimerC81485VyT = this.LJLIL.LJLJJL;
        if (countDownTimerC81485VyT != null) {
            countDownTimerC81485VyT.cancel();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            this.LJLIL.getUiActions().LIZIZ.invoke(Integer.valueOf(seekBar.getProgress()));
        }
        CountDownTimerC81485VyT countDownTimerC81485VyT = this.LJLIL.LJLJJL;
        if (countDownTimerC81485VyT != null) {
            countDownTimerC81485VyT.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC81487VyV
    public final void J7(int i, String color) {
        o.LJIIIZ(color, "color");
        C81574Vzu c81574Vzu = this.LJLIL;
        CountDownTimerC81485VyT countDownTimerC81485VyT = c81574Vzu.LJLJJL;
        if (countDownTimerC81485VyT != null) {
            countDownTimerC81485VyT.cancel();
        }
        CountDownTimerC81485VyT countDownTimerC81485VyT2 = c81574Vzu.LJLJJL;
        if (countDownTimerC81485VyT2 != null) {
            countDownTimerC81485VyT2.start();
        }
        this.LJLIL.getUiActions().LIZJ.invoke(ListProtector.get(C81446Vxq.LIZ(), i), Integer.valueOf(i));
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!z) {
            this.LJLIL.getUiActions().LIZLLL.invoke();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.LJLIL.getUiActions().LIZ.invoke(Integer.valueOf(i));
    }
}
