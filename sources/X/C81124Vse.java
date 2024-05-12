package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.Vse, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81124Vse extends LayoutInflater {
    public static final String[] LIZ = {"android.widget.", "android.webkit.", "android.app."};

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new C81124Vse(context, this);
    }

    public C81124Vse(Context context, LayoutInflater layoutInflater) {
        super(layoutInflater, context);
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
