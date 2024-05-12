package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import kotlin.jvm.internal.o;

/* renamed from: X.Ai6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26962Ai6 extends TAT {
    public final /* synthetic */ USMainOrderInfoVH LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ LogisticDTO LJLJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        if (view != null) {
            USMainOrderInfoVH uSMainOrderInfoVH = this.LJLJJI;
            Context context = this.LJLJJL.getContext();
            o.LJIIIIZZ(context, "context");
            uSMainOrderInfoVH.M(context, this.LJLJL, this.LJLJJLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26962Ai6(USMainOrderInfoVH uSMainOrderInfoVH, View view, String str, LogisticDTO logisticDTO) {
        super(700L);
        this.LJLJJI = uSMainOrderInfoVH;
        this.LJLJJL = view;
        this.LJLJJLL = str;
        this.LJLJL = logisticDTO;
    }
}
