package X;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.cast.framework.media.CastMediaOptions;

/* renamed from: X.Zek, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class ViewOnClickListenerC90454Zek implements View.OnClickListener {
    public final /* synthetic */ C90816Zka LJLIL;

    public ViewOnClickListenerC90454Zek(C90816Zka c90816Zka) {
        this.LJLIL = c90816Zka;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C90816Zka c90816Zka = this.LJLIL;
        ZYJ LIZIZ = ZYJ.LIZIZ(c90816Zka.LIZ);
        LIZIZ.getClass();
        QH7.LJ("Must be called from the main thread.");
        CastMediaOptions castMediaOptions = LIZIZ.LJ.zzf;
        if (castMediaOptions == null || TextUtils.isEmpty(castMediaOptions.zzc)) {
            return;
        }
        ComponentName componentName = new ComponentName(C16880lQ.LLLLJ(c90816Zka.LIZ), castMediaOptions.zzc);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        C16880lQ.LIZIZ(c90816Zka.LIZ, intent);
    }
}
