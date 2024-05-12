package androidx.appcompat.widget;

import X.C19C;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class z0 extends ContextWrapper {
    public static final Object LIZ = new Object();

    public z0() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        throw null;
    }

    public static void LIZ(Context context) {
        if (!(context instanceof z0) && !(context.getResources() instanceof C19C)) {
            context.getResources();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
    }
}
