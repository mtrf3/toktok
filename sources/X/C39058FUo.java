package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.FUo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39058FUo extends ContextThemeWrapper {
    public WeakReference<Context> LIZ;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        Context context;
        Resources resources;
        AssetManager assets;
        WeakReference<Context> weakReference = this.LIZ;
        if (weakReference != null && (context = weakReference.get()) != null && (resources = context.getResources()) != null && (assets = resources.getAssets()) != null) {
            return assets;
        }
        AssetManager assets2 = super.getAssets();
        o.LJFF(assets2, "super.getAssets()");
        return assets2;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Context context;
        Resources resources;
        WeakReference<Context> weakReference = this.LIZ;
        if (weakReference != null && (context = weakReference.get()) != null && (resources = context.getResources()) != null) {
            return resources;
        }
        Resources resources2 = super.getResources();
        o.LJFF(resources2, "super.getResources()");
        return resources2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39058FUo(Context base) {
        super(base, 0);
        o.LJIIJ(base, "base");
        this.LIZ = new WeakReference<>(base);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String name) {
        o.LJIIJ(name, "name");
        return super.getSystemService(name);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Context context;
        WeakReference<Context> weakReference = this.LIZ;
        Context context2 = null;
        if (weakReference != null) {
            context2 = weakReference.get();
        }
        if (context2 instanceof Activity) {
            WeakReference<Context> weakReference2 = this.LIZ;
            if (weakReference2 != null && (context = weakReference2.get()) != null) {
                C16880lQ.LIZIZ((Activity) context, intent);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.app.Activity");
        }
        throw new FV1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39058FUo(Context base, int i) {
        super(C16880lQ.LLLLL(base), i);
        o.LJIIJ(base, "base");
        this.LIZ = new WeakReference<>(base);
    }
}
