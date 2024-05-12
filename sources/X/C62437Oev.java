package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Oev */
/* loaded from: classes11.dex */
public final class C62437Oev extends ASB {
    public final SharePackage LJLJJI;

    @Override // X.ASG
    public final void LIZ(View v) {
        boolean z;
        Aweme aweme;
        InterfaceC62486Ofi LIZLLL;
        o.LJIIIZ(v, "v");
        C62443Of1.LIZ = "long_press_download";
        String str = this.LJLJI;
        o.LJIIIZ(str, "<set-?>");
        C62443Of1.LIZIZ = str;
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null && aweme2.getAwemeType() == 150) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Context context = v.getContext();
            o.LJIIIIZZ(context, "v.context");
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ != null && (aweme = this.LJLILLLLZI) != null && (LIZLLL = C62364Odk.LIZIZ.LIZLLL(LJJLIIIJ, aweme, this.LJLJI, "long_press_download", "long_press_download", this.LJLJJI.extras.getString("from_page"))) != null) {
                Context context2 = v.getContext();
                o.LJIIIIZZ(context2, "v.context");
                LIZLLL.LJJ(context2, this.LJLJJI);
                return;
            }
            return;
        }
        Context context3 = v.getContext();
        o.LJIIIIZZ(context3, "v.context");
        Activity LJJLIIIJ2 = C78609UtB.LJJLIIIJ(context3);
        if (LJJLIIIJ2 == null) {
            return;
        }
        ShareExtService shareExtService = C4LD.LIZIZ;
        Aweme aweme3 = this.LJLILLLLZI;
        o.LJI(aweme3);
        C44928HkC LJJI = shareExtService.LJJI(LJJLIIIJ2, aweme3, this.LJLJI, "long_press_download", "long_press_download");
        if (LJJI == null) {
            return;
        }
        Context context4 = v.getContext();
        o.LJIIIIZZ(context4, "v.context");
        C62485Ofh.LIZJ(context4, this.LJLJJI, LJJI);
    }

    @Override // X.ASG
    public final void LIZIZ(View v) {
        Boolean bool;
        o.LJIIIZ(v, "v");
        Context context = v.getContext();
        o.LJIIIIZZ(context, "v.context");
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            Bundle LIZ = C0H1.LIZ("enter_from", "download");
            IShareWarningInfoService LJIJ = a.LJIJ();
            if (LJIJ != null) {
                bool = Boolean.valueOf(LJIJ.LIZIZ(LJJLIIIJ, this.LJLILLLLZI, LIZ, new AqS157S0200000_10(this, v, 29)));
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                return;
            }
        }
        super.LIZIZ(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62437Oev(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager.LJLJLJ;
    }
}
