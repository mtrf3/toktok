package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BQN extends C31356CSi {
    public final C62822Ol8 LJLIL;

    public final ImageView L() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-audienceProfile>(...)");
        return (ImageView) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BQN(ViewGroup parent) {
        super(R.layout.di0, parent);
        o.LJIIIZ(parent, "parent");
        this.LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 443));
    }
}
