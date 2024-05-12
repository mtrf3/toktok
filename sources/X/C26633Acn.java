package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addressitem.GlobalAddressItemViewHolder;
import kotlin.jvm.internal.AqS19S0310000_4;
import ujb.o;

/* renamed from: X.Acn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26633Acn extends TAT {
    public final /* synthetic */ GlobalAddressItemViewHolder LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Address LJLJL;
    public final /* synthetic */ C26634Aco LJLJLJ;

    @Override // X.TAT
    public final void LIZ(View view) {
        if (view != null) {
            View view2 = this.LJLJJI.itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS19S0310000_4(this.LJLJL, this.LJLJLJ, this.LJLJJI, this.LJLJJL, 4));
            if (this.LJLJJL) {
                if (this.LJLJJI.L().Nv0() || this.LJLJJI.L().Ov0()) {
                    String str = this.LJLJJLL;
                    if (str != null && !o.LJJJJJL(str)) {
                        AddressListViewModel L = this.LJLJJI.L();
                        Context context = view.getContext();
                        kotlin.jvm.internal.o.LJIIIIZZ(context, "view.context");
                        L.Kv0(context, C78948Uye.LJIILIIL(view), this.LJLJL);
                        if (C76800UCe.LIZ != null) {
                            return;
                        }
                    }
                    this.LJLJJI.L().Rv0(this.LJLJL);
                    return;
                }
                String str2 = this.LJLJJLL;
                if (str2 == null || o.LJJJJJL(str2)) {
                    return;
                }
                AddressListViewModel L2 = this.LJLJJI.L();
                Context context2 = view.getContext();
                kotlin.jvm.internal.o.LJIIIIZZ(context2, "view.context");
                L2.Kv0(context2, C78948Uye.LJIILIIL(view), this.LJLJL);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26633Acn(GlobalAddressItemViewHolder globalAddressItemViewHolder, boolean z, String str, Address address, C26634Aco c26634Aco) {
        super(700L);
        this.LJLJJI = globalAddressItemViewHolder;
        this.LJLJJL = z;
        this.LJLJJLL = str;
        this.LJLJL = address;
        this.LJLJLJ = c26634Aco;
    }
}
