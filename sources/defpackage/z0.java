package defpackage;

import X.AbstractC77652Udk;
import X.C14P;
import X.C15380j0;
import X.C29306Beo;
import X.C41051jJ;
import X.C77596Ucq;
import X.C77628UdM;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS33S0100000_13;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.api.profit.ListResult;

/* loaded from: classes14.dex */
public final class z0 extends AbstractC77652Udk {
    public final ViewGroup LJLIL;
    public final Drawable LJLILLLLZI;
    public final Drawable LJLJI;
    public final Drawable LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ViewGroup parent) {
        super(R.layout.di5, parent);
        o.LJIIIZ(parent, "parent");
        this.LJLIL = parent;
        Drawable LJI = C15380j0.LJI(R.drawable.czi);
        Drawable drawable = null;
        if (LJI != null) {
            int i = C14P.LIZ;
            LJI.setBounds(0, 0, i, i);
        } else {
            LJI = null;
        }
        this.LJLILLLLZI = LJI;
        Drawable LJI2 = C15380j0.LJI(R.drawable.czj);
        if (LJI2 != null) {
            int i2 = C14P.LIZ;
            LJI2.setBounds(0, 0, i2, i2);
        } else {
            LJI2 = null;
        }
        this.LJLJI = LJI2;
        Drawable LJI3 = C15380j0.LJI(R.drawable.czk);
        if (LJI3 != null) {
            int i3 = C14P.LIZIZ;
            LJI3.setBounds(0, 0, i3, i3);
            drawable = LJI3;
        }
        this.LJLJJI = drawable;
    }

    @Override // X.AbstractC77652Udk
    public final void L(C77596Ucq adapter, Diamond itemData) {
        o.LJIIIZ(itemData, "itemData");
        o.LJIIIZ(adapter, "adapter");
        c1 wv0 = adapter.LJLJI.wv0();
        if (wv0 == null) {
            return;
        }
        Object context = this.itemView.getContext();
        o.LJII(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        LifecycleOwner lifecycleOwner = (LifecycleOwner) context;
        C41051jJ c41051jJ = (C41051jJ) this.itemView.findViewById(R.id.b6c);
        TextView textView = (TextView) this.itemView.findViewById(R.id.b6e);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.b6d);
        if (C29306Beo.LJIILLIIL(Boolean.valueOf(wv0.LJII))) {
            wv0.LJII = true;
            ListResult.VoucherItem voucherItem = wv0.LJFF;
            if (voucherItem != null) {
                C77628UdM c77628UdM = new C77628UdM();
                String parameter = voucherItem.voucherTemplateId;
                o.LJIIIZ(parameter, "parameter");
                c77628UdM.LIZ.LJIJJ(parameter, "voucher_template_id");
                String parameter2 = voucherItem.voucherToken;
                o.LJIIIZ(parameter2, "parameter");
                c77628UdM.LIZ.LJIJJ(parameter2, "voucher_token");
                c77628UdM.LIZ.LJJIIJZLJL();
            }
        }
        wv0.LIZJ.observe(lifecycleOwner, new x0(textView, this, textView2, c41051jJ, wv0));
        c41051jJ.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(wv0, 212)));
    }
}
