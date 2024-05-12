package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment;

import X.C04330Ez;
import X.C117104ig;
import X.C16880lQ;
import X.C214298b3;
import X.C27570Aru;
import X.C46536IOe;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C71763SEl;
import X.C71766SEo;
import X.C71767SEp;
import X.C71768SEq;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.EnumC28094B0w;
import X.ORZ;
import X.OUP;
import X.QD3;
import X.SYL;
import X.T5T;
import X.TBT;
import Y.IDCListenerS376S0100000_12;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes13.dex */
public final class SubPaymentListAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public long LJLJI;
    public String LJLJJI;
    public List<C71767SEp> LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public SubPaymentListAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SubPaymentListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 221), C71768SEq.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C71763SEl.class, null), checkSupervisorPrepared());
        this.LJLJI = System.currentTimeMillis();
        this.LJLJJI = "";
        this.LJLJJL = new ArrayList();
    }

    public final C71763SEl v3() {
        return (C71763SEl) this.LJLILLLLZI.getValue();
    }

    public final SubPaymentListViewModel x3() {
        return (SubPaymentListViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentItemClickEvent$ecommerce_transaction_release(C46536IOe event) {
        o.LJIIIZ(event, "event");
        _$_findCachedViewById(R.id.cza).clearFocus();
        T5T etInput = (T5T) _$_findCachedViewById(R.id.cza);
        o.LJIIIIZZ(etInput, "etInput");
        C27570Aru.LIZLLL(etInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, T] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        String str;
        String str2;
        ArrayList arrayList;
        T t;
        ?? r2;
        Availability availability;
        o.LJIIIZ(view, "view");
        ((TextView) _$_findCachedViewById(R.id.cza)).addTextChangedListener(new C71766SEo(this));
        _$_findCachedViewById(R.id.cza).setOnFocusChangeListener(new IDCListenerS376S0100000_12(this, 8));
        View tvCancel = _$_findCachedViewById(R.id.lvo);
        o.LJIIIIZZ(tvCancel, "tvCancel");
        OUP.LJIJJLI(tvCancel);
        View tvCancel2 = _$_findCachedViewById(R.id.lvo);
        o.LJIIIIZZ(tvCancel2, "tvCancel");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 110, 42), tvCancel2);
        View iconClear = _$_findCachedViewById(R.id.ea2);
        o.LJIIIIZZ(iconClear, "iconClear");
        OUP.LJIJJLI(iconClear);
        View iconClear2 = _$_findCachedViewById(R.id.ea2);
        o.LJIIIIZZ(iconClear2, "iconClear");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 111, 42), iconClear2);
        SYL syl = (SYL) _$_findCachedViewById(R.id.hqs);
        syl.getContext();
        syl.setLayoutManager(new LinearLayoutManager());
        syl.LJII(new C117104ig(C04330Ez.LIZIZ(syl.getContext(), R.color.bx)), -1);
        syl.LLLF.LJZL(SubPaymentViewHolder.class);
        syl.setLifecycleOwner(this);
        syl.LJIIJJI(new IDrS50S0100000_12(this, 21));
        EnterParams enterParams = v3().LJLJJI;
        Integer num = enterParams.buttonType;
        EnumC28094B0w enumC28094B0w = EnumC28094B0w.NEXT;
        int ordinal = enumC28094B0w.ordinal();
        if (num == null || num.intValue() != ordinal) {
            int ordinal2 = EnumC28094B0w.CONTINUE.ordinal();
            if (num == null || num.intValue() != ordinal2) {
                i = R.string.fet;
            } else {
                i = R.string.fer;
            }
        } else {
            i = R.string.fes;
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.aog);
        Context context = getContext();
        if (context != null) {
            str = context.getString(i);
        } else {
            str = null;
        }
        textView.setText(str);
        View bottomButton = _$_findCachedViewById(R.id.aog);
        o.LJIIIIZZ(bottomButton, "bottomButton");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 112, 42), bottomButton);
        Integer num2 = enterParams.buttonType;
        int ordinal3 = enumC28094B0w.ordinal();
        if (num2 == null || num2.intValue() != ordinal3) {
            int ordinal4 = EnumC28094B0w.PAY_NOW.ordinal();
            if (num2 == null || num2.intValue() != ordinal4) {
                int ordinal5 = EnumC28094B0w.CONTINUE.ordinal();
                if (num2 == null || num2.intValue() != ordinal5) {
                    str2 = "";
                } else {
                    str2 = "continue";
                }
            } else {
                str2 = "pay_now";
            }
        } else {
            str2 = "next";
        }
        v3().LJLJJL.LIZIZ(str2);
        C8YN.LJIIJ(this, x3(), new TBT() { // from class: X.SEt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71765SEn) obj).LJLJI;
            }
        }, new TBT() { // from class: X.SEr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71765SEn) obj).LJLILLLLZI;
            }
        }, null, new IDqS436S0100000_12(this, 36), 12);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.SEs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71765SEn) obj).LJLJJI;
            }
        }, null, new AqS194S0100000_12(this, 274), 6);
        PaymentMethod paymentMethod = v3().LJLILLLLZI;
        this.LJLJJLL = v3().LJLIL;
        this.LJLJL = v3().LJLJI;
        if (paymentMethod != null) {
            SubPaymentListViewModel x3 = x3();
            String str3 = this.LJLJJLL;
            x3.getClass();
            List<PaymentMethod> list = paymentMethod.subPaymentMethods;
            if (list != null) {
                arrayList = new ArrayList();
                for (PaymentMethod paymentMethod2 : list) {
                    if (paymentMethod2.LIZ()) {
                        arrayList.add(paymentMethod2);
                    }
                }
            } else {
                arrayList = null;
            }
            C68322mC c68322mC = new C68322mC();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        t = it.next();
                        if (o.LJ(((PaymentMethod) t).id, str3)) {
                            break;
                        }
                    } else {
                        t = 0;
                        break;
                    }
                }
            } else {
                t = 0;
            }
            c68322mC.element = t;
            if (t == 0 && arrayList != null && (r2 = (PaymentMethod) ORZ.LJLLLL(arrayList)) != 0 && (availability = r2.availability) != null && o.LJ(availability.isAvailable, Boolean.TRUE)) {
                c68322mC.element = r2;
            }
            x3.setState(new AqS116S0300000_12(paymentMethod, (PaymentMethod) arrayList, (List<PaymentMethod>) c68322mC, (C68322mC<PaymentMethod>) 43));
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }
}
