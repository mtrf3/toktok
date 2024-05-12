package X;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CNb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31219CNb extends FrameLayout {
    public String LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LIZJ(java.util.Map<String, ? extends Object> map);

    public abstract String getCardContainerId();

    public final long getEndTime() {
        return this.LJLJI;
    }

    public final String getName() {
        return this.LJLIL;
    }

    public final long getStartTime() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31219CNb(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = "";
        this.LJLILLLLZI = -1L;
        this.LJLJI = -1L;
    }

    public final void setEndTime(long j) {
        this.LJLJI = j;
    }

    public final void setName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public final void setStartTime(long j) {
        this.LJLILLLLZI = j;
    }
}
