package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.0rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20830rn extends LayoutInflater {
    public static final String[] LIZ = {"android.widget.", "android.webkit.", "android.app."};

    public C20830rn(Context context) {
        super(context);
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context newContext) {
        o.LJIIIZ(newContext, "newContext");
        return new C20830rn(newContext);
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
