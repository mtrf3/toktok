package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import kotlin.jvm.internal.o;

/* renamed from: X.Lv0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55790Lv0 implements C9WW {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ ECommerceVideoService LIZIZ;
    public final /* synthetic */ InterfaceC55791Lv1 LIZJ;
    public final /* synthetic */ View LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.C9WW
    public final void LIZ() {
        if (this.LIZ != null) {
            ECommerceVideoService eCommerceVideoService = this.LIZIZ;
            InterfaceC55791Lv1 interfaceC55791Lv1 = this.LIZJ;
            View view = this.LIZLLL;
            String str = this.LJ;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            eCommerceVideoService.getClass();
            ECommerceVideoService.LJIIJJI(interfaceC55791Lv1, context, str);
        }
    }

    public C55790Lv0(Activity activity, ECommerceVideoService eCommerceVideoService, InterfaceC55791Lv1 interfaceC55791Lv1, View view, String str) {
        this.LIZ = activity;
        this.LIZIZ = eCommerceVideoService;
        this.LIZJ = interfaceC55791Lv1;
        this.LIZLLL = view;
        this.LJ = str;
    }
}
