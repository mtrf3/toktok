package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.Vsg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81126Vsg extends LayoutInflater {
    public static final String[] LIZ = {"android.widget.", "android.webkit.", "android.app."};

    public C81126Vsg(Context context) {
        super(context);
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        C81126Vsg c81126Vsg = new C81126Vsg(context);
        if (getFactory2() != null) {
            c81126Vsg.setFactory2(getFactory2());
        }
        return c81126Vsg;
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) {
        View createView;
        for (String str2 : LIZ) {
            try {
                createView = createView(str, str2, attributeSet);
            } catch (ClassNotFoundException unused) {
            }
            if (createView != null) {
                return createView;
            }
        }
        return super.onCreateView(str, attributeSet);
    }
}
