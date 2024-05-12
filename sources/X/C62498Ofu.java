package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62498Ofu extends AbstractC62515OgB {
    public final /* synthetic */ DialogC62475OfX LJLJI;

    @Override // X.AbstractC62515OgB
    public final void LIZ(InterfaceC62225ObV channel, View view) {
        boolean LIZLLL;
        BaseSharePackage baseSharePackage;
        o.LJIIIZ(channel, "channel");
        this.LJLJI.LJLJJL.LJIIJ.extras.putString("share_platform", channel.key());
        this.LJLJI.LJLJJL.LJIIJ.extras.putLong("clicked_time", System.currentTimeMillis());
        this.LJLJI.LJLJJL.LJIIJ.extras.getString("share_aweme_id");
        if (!channel.LJIILJJIL() && (baseSharePackage = this.LJLILLLLZI) != null && (!(baseSharePackage instanceof HybridImageSharePackage))) {
            this.LJLJI.dismiss();
        }
        if (this.LJLJI.LJLJJL.LJIIJ.LIZIZ(this.LJLIL, channel)) {
            return;
        }
        DialogC62475OfX dialogC62475OfX = this.LJLJI;
        LIZLLL = dialogC62475OfX.LJLJJL.LJIIJ.LIZLLL(channel, dialogC62475OfX.LJLJJI, null, null, new AqS141S0200000_10(channel, dialogC62475OfX, 65));
        if (!LIZLLL) {
            if (C62547Ogh.LIZ(channel.key())) {
                V1B.LJLJJL((Dialog) this.LJLJI.LJLJJLL.getValue());
            }
            DialogC62475OfX dialogC62475OfX2 = this.LJLJI;
            dialogC62475OfX2.LJLJJL.LJIIJ.LJIILIIL(channel, new AqS141S0200000_10(channel, dialogC62475OfX2, 66));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62498Ofu(DialogC62475OfX dialogC62475OfX, Context context, BaseSharePackage baseSharePackage) {
        super(context, baseSharePackage);
        this.LJLJI = dialogC62475OfX;
    }
}
