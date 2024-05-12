package X;

import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class VY7 extends View {
    public VYX LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public long LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public long LJLJLJ;

    public abstract float LIZ();

    public abstract float LIZIZ();

    public void LIZJ() {
        this.LJLILLLLZI = LIZIZ();
        this.LJLJI = LIZ();
    }

    public final long getCurProgress() {
        return this.LJLJLJ;
    }

    public final float getHopeHeight() {
        return this.LJLJI;
    }

    public final float getHopeWidth() {
        return this.LJLILLLLZI;
    }

    public final long getLevelTime() {
        return this.LJLJJL;
    }

    public final float getParentWidth() {
        return this.LJLJL;
    }

    public final VYX getRequest() {
        return this.LJLIL;
    }

    public final float getScaleRuler() {
        return this.LJLJJI;
    }

    public final float getXOnScreen() {
        return this.LJLJJLL;
    }

    public final void setCurProgress(long j) {
        this.LJLJLJ = j;
    }

    public final void setHopeHeight(float f) {
        this.LJLJI = f;
    }

    public final void setHopeWidth(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setLevelTime(long j) {
        this.LJLJJL = j;
    }

    public final void setParentWidth(int i) {
        this.LJLJL = i;
        LIZJ();
    }

    public final void setRequest(VYX vyx) {
        o.LJIIIZ(vyx, "<set-?>");
        this.LJLIL = vyx;
    }

    public final void setScaleRuler(float f) {
        this.LJLJJI = f;
    }

    public final void setXOnScreen(float f) {
        this.LJLJJLL = f;
    }

    public final void setParentWidth(float f) {
        this.LJLJL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VY7(Context context, VYX request) {
        super(context);
        o.LJIIIZ(request, "request");
        new LinkedHashMap();
        this.LJLIL = request;
    }
}
