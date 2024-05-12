package X;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFloat;
import com.bytedance.ies.effectcreator.swig.UIAnnotationNumberDisplayMode;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ad8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94198ad8 extends RecyclerView.ViewHolder implements SeekBar.OnSeekBarChangeListener {
    public final float LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final SeekBar LJLJJI;
    public UIAnnotationFloat LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final /* synthetic */ C94199ad9 LJLJLJ;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
    }

    public static String L(UIAnnotationFloat uIAnnotationFloat) {
        UIAnnotationNumberDisplayMode numberDisplayMode = uIAnnotationFloat.getNumberDisplayMode();
        if (numberDisplayMode != null) {
            int i = C93659aUR.LIZ[numberDisplayMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return String.valueOf((int) (uIAnnotationFloat.getCurrentValue() * 100));
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append((int) (uIAnnotationFloat.getCurrentValue() * 100));
                    LIZ.append('%');
                    return X1D.LIZIZ(LIZ);
                }
            } else {
                String LLLZ = C16880lQ.LLLZ("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(uIAnnotationFloat.getCurrentValue())}, 1));
                o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
                return LLLZ;
            }
        }
        return "";
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        o.LJIIIZ(seekBar, "seekBar");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ.LIZIZ;
        if (interfaceC65784Pro != null) {
            ((IDqS423S0100000_42) interfaceC65784Pro).invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94198ad8(C94199ad9 c94199ad9, View view) {
        super(view);
        this.LJLJLJ = c94199ad9;
        this.LJLIL = 100.0f;
        View findViewById = this.itemView.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.name)");
        this.LJLILLLLZI = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.n2r);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.value)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.jkd);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.seek_bar)");
        SeekBar seekBar = (SeekBar) findViewById3;
        this.LJLJJI = seekBar;
        this.LJLJL = 100;
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        o.LJIIIZ(seekBar, "seekBar");
        UIAnnotationFloat uIAnnotationFloat = this.LJLJJL;
        if (uIAnnotationFloat != null) {
            uIAnnotationFloat.updateValue((i + this.LJLJJLL) / this.LJLIL);
            this.LJLJI.setText(L(uIAnnotationFloat));
        }
    }
}
