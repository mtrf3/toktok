package X;

import android.content.Context;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import o53.IDdS479S0100000_14;

/* loaded from: classes15.dex */
public class W5X extends W5G {
    public WeakReference<W63> LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final IDdS479S0100000_14 LJLJJL;

    public String getUrl() {
        return "";
    }

    public void setImageLoadFinishListener(W62 w62) {
    }

    public W4Z<InterfaceC81599W0t> getControllerListener() {
        return this.LJLJJL;
    }

    public void setAnimationListener(W63 w63) {
        this.LJLIL = new WeakReference<>(w63);
    }

    public void setAttached(boolean z) {
        this.LJLILLLLZI = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.LJLJJI = z;
    }

    public W5X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = new IDdS479S0100000_14(this, 1);
    }
}
