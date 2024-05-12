package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.android.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nwi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60992Nwi implements IHostStyleUIDepend {
    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final View getContainerLoadingView(Context context) {
        o.LJIIIZ(context, "context");
        return BulletService.LIZ().LJIIJJI(context);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final Dialog showDialog(DialogBuilder dialogBuilder) {
        o.LJIIIZ(dialogBuilder, "dialogBuilder");
        C26227ARb c26227ARb = new C26227ARb(dialogBuilder.getContext());
        c26227ARb.LJFF(dialogBuilder.getTitle());
        c26227ARb.LIZIZ(dialogBuilder.getMessage());
        UC0.LIZJ(c26227ARb, new AqS176S0100000_10(dialogBuilder, 169));
        c26227ARb.LJII = dialogBuilder.getCancelOnTouchOutside();
        return c26227ARb.LJI().LJ();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostStyleUIDepend
    public final Boolean showToast(Context context, String message) {
        o.LJIIJ(context, "context");
        o.LJIIJ(message, "message");
        return null;
    }
}
