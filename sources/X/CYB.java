package X;

import android.view.ViewGroup;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CYB extends C31356CSi {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public long LJLJI;
    public String LJLJJI;
    public long LJLJJL;

    public final C47121t6 L() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-audienceScore>(...)");
        return (C47121t6) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CYB(ViewGroup parent) {
        super(R.layout.dhz, parent);
        o.LJIIIZ(parent, "parent");
        this.LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, BuildConfig.VERSION_CODE));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 291));
        this.LJLJI = -1L;
        this.LJLJJI = "";
        this.LJLJJL = 1L;
    }
}
