package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.payment.USPaymentInfoVH;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1O extends AbstractC029409q<B2B> {
    public final List<PaymentMethod> LJLIL;
    public final /* synthetic */ USPaymentInfoVH LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public B1O(USPaymentInfoVH uSPaymentInfoVH) {
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = uSPaymentInfoVH;
        this.LJLIL = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r4.LJIILJJIL(r0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.B2B r18, int r19) {
        /*
            r17 = this;
            r1 = r18
            X.B2B r1 = (X.B2B) r1
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2 = r17
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r2.LJLIL
            r5 = r19
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r4
            X.B1S r14 = r1.LJLIL
            if (r14 == 0) goto Lc8
            com.ss.android.ugc.aweme.ecommerce.us.osp.module.payment.USPaymentInfoVH r13 = r2.LJLILLLLZI
            r14.setPaymentMethod(r4)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel r0 = r13.L()
            r2 = 0
            java.util.HashMap r0 = r0.fw0(r2)
            r14.setGeneralParams(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r13.LJLJI
            r10 = 0
            if (r0 == 0) goto Ld6
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
        L32:
            boolean r0 = X.C61841OOv.LIZIZ(r4, r0)
            if (r0 != 0) goto L44
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r13.LJLJI
            if (r0 == 0) goto Ld3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
        L3e:
            boolean r0 = r4.LJIILJJIL(r0)
            if (r0 == 0) goto L4e
        L44:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r13.LJLJI
            r14.setPaymentInfo(r0)
            java.lang.Boolean r0 = r13.LJLJJI
            r14.setPaymentInfoFromOSP(r0)
        L4e:
            kotlin.jvm.internal.AqS35S0301000_4 r11 = new kotlin.jvm.internal.AqS35S0301000_4
            r16 = 1
            r12 = r4
            r15 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r14.setOnCheckedListener(r11)
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 361(0x169, float:5.06E-43)
            r1.<init>(r13, r0)
            r14.setOnPaymentInfoChangeListener(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r13.LJLJI
            if (r0 == 0) goto Ld1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
        L6a:
            boolean r0 = X.C61841OOv.LIZIZ(r4, r0)
            r7 = 1
            if (r0 == 0) goto Lcd
            r14.setChecked(r7)
        L74:
            java.lang.Object r0 = r13.getItem()
            X.Ays r0 = (X.C28002Ays) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.LJ
            if (r0 == 0) goto Lcb
            java.util.Iterator r3 = r0.iterator()
        L82:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r1 = r0.id
            java.lang.String r0 = r4.id
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L82
            if (r2 == 0) goto Lcb
        L9b:
            java.lang.String r0 = r4.extraInfo
            boolean r6 = X.C78685UuP.LJJJZ(r0)
            java.lang.String r0 = r4.balance
            boolean r8 = X.C78685UuP.LJJJZ(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r13.LJLJI
            if (r0 == 0) goto Lc9
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
        Lad:
            boolean r9 = X.C61841OOv.LIZIZ(r4, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r0 = r4.availability
            if (r0 == 0) goto Lb7
            java.lang.String r10 = r0.unavailableCode
        Lb7:
            java.lang.String r0 = r4.LJIIIIZZ()
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r12 = 256(0x100, float:3.59E-43)
            X.C27949Ay1.LJJIJIIJIL(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lc8:
            return
        Lc9:
            r0 = r10
            goto Lad
        Lcb:
            r7 = 0
            goto L9b
        Lcd:
            r14.setChecked(r2)
            goto L74
        Ld1:
            r0 = r10
            goto L6a
        Ld3:
            r0 = r10
            goto L3e
        Ld6:
            r0 = r10
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1O.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final B2B com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        B1S b1s = new B1S(context);
        b1s.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        B2B b2b = new B2B(b1s);
        C0AX.LIZ(parent, b2b.itemView, R.id.lj7);
        View view = b2b.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (b2b.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(B2B.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) b2b.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(b2b.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = B2B.class.getName();
        return b2b;
    }
}
