package X;

import Y.ACListenerS42S0200000_7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* loaded from: classes8.dex */
public class G75 extends LinearLayout {
    public final AI8 LJLIL;
    public final View LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;

    public AI8 getTextCell() {
        return this.LJLIL;
    }

    public void setEnable(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.LJLIL.setCellEnabled(z);
    }

    public void setLabelText(int i) {
        this.LJLJJL = getContext().getString(i);
        AIF aif = (AIF) this.LJLIL.getAccessory();
        Objects.requireNonNull(aif);
        aif.LJIILIIL(this.LJLJJL);
    }

    public void setLabelTextVisibility(int i) {
        if (i == 0) {
            AIF aif = (AIF) this.LJLIL.getAccessory();
            Objects.requireNonNull(aif);
            aif.LJIILIIL(this.LJLJJL);
        } else {
            AIF aif2 = (AIF) this.LJLIL.getAccessory();
            Objects.requireNonNull(aif2);
            aif2.LJIILIIL("");
        }
    }

    public void setLeftTuxIcon(int i) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        this.LJLIL.setIcon(c2068389v);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        ACListenerS42S0200000_7 aCListenerS42S0200000_7 = new ACListenerS42S0200000_7(onClickListener, this, 3);
        AIF aif = (AIF) this.LJLIL.getAccessory();
        Objects.requireNonNull(aif);
        aif.LJIILJJIL(aCListenerS42S0200000_7);
    }

    public void setSubtitle(int i) {
        String string = getContext().getString(i);
        this.LJLJJI = string;
        this.LJLIL.setSubtitle(string);
    }

    public void setSubtitleVisibility(int i) {
        if (i == 0) {
            this.LJLIL.setSubtitle(this.LJLJJI);
        } else {
            this.LJLIL.setSubtitle(null);
        }
    }

    public void setTitle(int i) {
        String string = getContext().getString(i);
        this.LJLJI = string;
        this.LJLIL.setTitle(string);
    }

    public void setLabelText(String str) {
        this.LJLJJL = str;
        AIF aif = (AIF) this.LJLIL.getAccessory();
        Objects.requireNonNull(aif);
        aif.LJIILIIL(this.LJLJJL);
    }

    public void setSubtitle(String str) {
        this.LJLJJI = str;
        this.LJLIL.setSubtitle(str);
    }

    public void setTitle(String str) {
        this.LJLJI = str;
        this.LJLIL.setTitle(str);
    }

    public G75(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJLL = true;
        this.LJLILLLLZI = C16880lQ.LLLZIIL(R.layout.c9a, C16880lQ.LLZIL(context).cloneInContext(context), this);
        this.LJLIL = (AI8) findViewById(R.id.l3q);
    }
}
