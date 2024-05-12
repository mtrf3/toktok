package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Vsf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81125Vsf extends LayoutInflater {
    public static final String[] LIZ = {"android.widget.", "android.webkit.", "android.app."};

    public C81125Vsf(Context context) {
        super(context);
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context newContext) {
        o.LJIIIZ(newContext, "newContext");
        return new C81125Vsf(newContext);
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String name, AttributeSet attrs) {
        View createView;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(attrs, "attrs");
        for (String str : LIZ) {
            try {
                createView = createView(name, str, attrs);
            } catch (ClassNotFoundException unused) {
            }
            if (createView != null) {
                return createView;
            }
        }
        View onCreateView = super.onCreateView(name, attrs);
        o.LJIIIIZZ(onCreateView, "super.onCreateView(name, attrs)");
        return onCreateView;
    }
}
