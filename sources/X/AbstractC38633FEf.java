package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.FEf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38633FEf extends AbstractC38635FEh {
    public String LJIIJ;

    public boolean LJIJ(Context context) {
        o.LJIIJ(context, "context");
        return true;
    }

    @Override // X.AbstractC38635FEh
    public final boolean LJIIJJI(Context context) {
        o.LJIIJ(context, "context");
        String str = this.LJIIJ;
        if (str != null) {
            switch (str.hashCode()) {
                case -1949423989:
                    if (str.equals("androidx-material")) {
                        return true;
                    }
                    break;
                case -1854767153:
                    if (str.equals("support")) {
                        return true;
                    }
                    break;
                case -933324823:
                    if (str.equals("androidx")) {
                        return true;
                    }
                    break;
                case -788047292:
                    if (str.equals("widget")) {
                        return true;
                    }
                    break;
                case 120176997:
                    if (str.equals("support-material")) {
                        return true;
                    }
                    break;
                case 1673671211:
                    if (str.equals("automatic")) {
                        return LJIJ(context);
                    }
                    break;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unsupported appCompatViewInflaterClass : ");
            String str2 = this.LJIIJ;
            if (str2 == null) {
                o.LJIJI("appCompatViewInflaterClass");
                throw null;
            }
            throw new IllegalStateException(C025908h.LIZIZ(LIZ, str2, ", ", "appCompatViewInflaterClass", LIZ));
        }
        o.LJIJI("appCompatViewInflaterClass");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        o.LJIIJ(context, "context");
        String str = this.LJIIJ;
        if (str != null) {
            switch (str.hashCode()) {
                case -1949423989:
                    if (str.equals("androidx-material")) {
                        return LJIJI(context, attributeSet);
                    }
                    throw new IllegalStateException("");
                case -1854767153:
                    if (str.equals("support")) {
                        throw new IllegalStateException("Stub");
                    }
                    throw new IllegalStateException("");
                case -933324823:
                    if (str.equals("androidx")) {
                        return LJIJI(context, attributeSet);
                    }
                    throw new IllegalStateException("");
                case -788047292:
                    if (str.equals("widget")) {
                        return LJIJJLI(context, attributeSet);
                    }
                    throw new IllegalStateException("");
                case 120176997:
                    if (str.equals("support-material")) {
                        throw new IllegalStateException("Stub");
                    }
                    throw new IllegalStateException("");
                case 1673671211:
                    if (str.equals("automatic")) {
                        return LJIJJ(context, attributeSet);
                    }
                    throw new IllegalStateException("");
                default:
                    throw new IllegalStateException("");
            }
        }
        o.LJIJI("appCompatViewInflaterClass");
        throw null;
    }

    public View LJIJI(Context context, AttributeSet attributeSet) {
        o.LJIIJ(context, "context");
        throw new IllegalStateException("Stub");
    }

    public View LJIJJ(Context context, AttributeSet attributeSet) {
        o.LJIIJ(context, "context");
        throw new IllegalStateException("Stub");
    }

    public View LJIJJLI(Context context, AttributeSet attributeSet) {
        o.LJIIJ(context, "context");
        throw new IllegalStateException("Stub");
    }
}
