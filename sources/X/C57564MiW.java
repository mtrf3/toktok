package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.MiW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57564MiW extends C62415OeZ {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        ShareExtServiceImpl.LJJLIIJ().LJIIJ(this.LIZ);
        int i = 1;
        if (!C57565MiX.LIZ) {
            String string = sharePackage.extras.getString("share_action_key");
            String string2 = sharePackage.extras.getString("share_platform");
            if ((string != null || string2 != null) && !o.LJ(string, "captions") && !o.LJ(string2, "copy")) {
                this.LIZIZ.finish();
            }
        }
        if (o.LJ(this.LIZJ, "long_press")) {
            if (o.LJ(this.LIZLLL, "personal_homepage") || o.LJ(this.LIZLLL, "others_homepage")) {
                i = 2;
            }
            Activity activity = this.LIZIZ;
            if (activity != null && !activity.isFinishing() && !this.LIZIZ.isDestroyed()) {
                C2U8.LIZ(new C55274Lmg(i, this.LIZIZ.hashCode()));
            }
        }
    }

    public C57564MiW(Activity activity, Aweme aweme, String str, String str2) {
        this.LIZ = aweme;
        this.LIZIZ = activity;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
