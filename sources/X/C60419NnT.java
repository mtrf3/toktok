package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.NnT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60419NnT extends C60379Nmp implements InterfaceC60190Njm {
    public final InterfaceC60420NnU LJLJI;

    @Override // X.InterfaceC60183Njf
    public final FrameLayout.LayoutParams LIZIZ() {
        this.LJLJI.LIZIZ();
        return null;
    }

    @Override // X.InterfaceC60183Njf
    public final FrameLayout.LayoutParams LIZLLL() {
        this.LJLJI.LIZLLL();
        return null;
    }

    public C60419NnT(InterfaceC60420NnU pageConfig) {
        o.LJIIJ(pageConfig, "pageConfig");
        this.LJLJI = pageConfig;
    }

    @Override // X.InterfaceC60183Njf
    public final InterfaceC60207Nk3 LIZ(Context context) {
        o.LJIIJ(context, "context");
        return this.LJLJI.LIZ(context);
    }

    @Override // X.InterfaceC60183Njf
    public final InterfaceC60189Njl LIZJ(Context context) {
        o.LJIIJ(context, "context");
        return this.LJLJI.LIZJ(context);
    }

    @Override // X.InterfaceC60183Njf
    public final boolean LJIJ(Context context, android.net.Uri schema, C60445Nnt c60445Nnt) {
        o.LJIIJ(context, "context");
        o.LJIIJ(schema, "schema");
        Class<Activity> LJ = this.LJLJI.LJ();
        if (LJ != null) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, LJ));
            intent.setData(schema);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtras((Bundle) c60445Nnt.LIZ);
            Bundle bundle = (Bundle) c60445Nnt.LIZIZ;
            if (bundle == null) {
                C16880lQ.LIZJ(context, intent);
                return true;
            }
            C78598Ut0.LJIJJ(intent, context);
            context.startActivity(intent, bundle);
            return true;
        }
        return false;
    }
}
