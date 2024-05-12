package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OgU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62534OgU extends AbstractC62515OgB {
    public final /* synthetic */ C62387Oe7 LJLJI;
    public final /* synthetic */ C4P8 LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ DialogC25756A8y LJLJJLL;

    @Override // X.AbstractC62515OgB
    public final void LIZ(InterfaceC62225ObV channel, View view) {
        BaseSharePackage baseSharePackage;
        o.LJIIIZ(channel, "channel");
        this.LJLJI.LJIIJ.extras.putString("share_platform", channel.key());
        if (!channel.LJIILJJIL() && (baseSharePackage = this.LJLILLLLZI) != null && (!(baseSharePackage instanceof HybridImageSharePackage)) && baseSharePackage.LIZ(channel)) {
            this.LJLJJI.Vd(new C62553Ogn());
        }
        if (this.LJLJI.LJIIJ.LIZIZ(this.LJLIL, channel)) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C62535OgV(this, channel, view, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62534OgU(C62387Oe7 c62387Oe7, C4P8 c4p8, Context context, DialogC25756A8y dialogC25756A8y, Context context2, BaseSharePackage baseSharePackage) {
        super(context2, baseSharePackage);
        this.LJLJI = c62387Oe7;
        this.LJLJJI = c4p8;
        this.LJLJJL = context;
        this.LJLJJLL = dialogC25756A8y;
    }
}
