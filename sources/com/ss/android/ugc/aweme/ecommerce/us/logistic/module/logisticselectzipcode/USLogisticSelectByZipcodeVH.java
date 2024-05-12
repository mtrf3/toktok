package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C19N;
import X.C1DD;
import X.C1FL;
import X.C221108m2;
import X.C26018AJa;
import X.C26021AJd;
import X.C26059AKp;
import X.C26338AVi;
import X.C26731AeN;
import X.C26732AeO;
import X.C26733AeP;
import X.C26735AeR;
import X.C26737AeT;
import X.C26744Aea;
import X.C27090AkA;
import X.C27739Aud;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70987RtX;
import X.C78857UxB;
import X.C78946Uyc;
import X.C78983UzD;
import X.EF7;
import X.EnumC26023AJf;
import X.OUP;
import X.SC5;
import X.T5T;
import Y.ARunnableS23S0200000_4;
import Y.IDCListenerS157S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USLogisticSelectByZipcodeVH extends ECJediViewHolder {
    public final C62822Ol8 LJLIL;
    public C26018AJa LJLILLLLZI;
    public TuxTextView LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLJLLL;

    public final void P() {
        this.LJLJJI = false;
        EventCenter.LJ().LIZ("ec_zipcode_locate_address", C27739Aud.LJI(new ZipcodeLocateAddress(-1, null, null, null, null, 28, null)));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AddressSelectViewModel M() {
        return (AddressSelectViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26059AKp.LIZ().LIZJ("ec_zipcode_locate_address", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        C26018AJa c26018AJa = this.LJLILLLLZI;
        if (c26018AJa != null) {
            L(c26018AJa.getEditText());
        }
        C26059AKp.LIZ().LIZIZ("ec_zipcode_locate_address", this);
        this.LJLILLLLZI = null;
        this.LJLJJI = false;
        this.LJLJJL = false;
        this.LJLJJLL = "";
        this.LJLJL = 0;
        this.LJLJLJ = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USLogisticSelectByZipcodeVH(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a8v, viewGroup, false, "from(parent.context)\n   …ut_layout, parent, false)"));
        this.LJLJLLL = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(AddressSelectViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 127));
        this.LJLJJLL = "";
    }

    public static void L(T5T t5t) {
        InputMethodManager inputMethodManager;
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "input_method");
            if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null) {
                inputMethodManager.hideSoftInputFromWindow(t5t.getWindowToken(), 0);
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(new RuntimeException(C1DD.LJ("GECC EditText closekeybord(), ", e)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(boolean z) {
        int i;
        boolean LJ = o.LJ(this.LJLJJLL, "sug");
        boolean LJ2 = o.LJ(this.LJLJJLL, "auto");
        String str = ((C26735AeR) getItem()).LIZ;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int i2 = i - this.LJLJL;
        if (i2 < 0) {
            this.LJLJJLL = "del";
        } else if (i2 > 0) {
            this.LJLJJLL = "add";
        } else if (!LJ && !LJ2) {
            this.LJLJJLL = "";
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70987RtX(), new C26737AeT(this, LJ2, LJ, z));
        this.LJLJLJ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        String string;
        Boolean bool;
        C26018AJa c26018AJa;
        T5T editText;
        List<ReachableAddress> list;
        ChangeLocationData changeLocationData;
        Integer num;
        ChangeLocationData changeLocationData2;
        Integer num2;
        int intValue;
        ChangeLocationData changeLocationData3;
        int i;
        C26735AeR item = (C26735AeR) obj;
        o.LJIIIZ(item, "item");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.nkv);
        if (_$_findCachedViewById != null) {
            OUP.LJJLIIIJ(_$_findCachedViewById);
        }
        if (this.LJLJI == null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setText(this.itemView.getContext().getString(R.string.fai));
            tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            C26338AVi.LJI(tuxTextView, AnonymousClass391.LIZJ(8), null, null, null, false, 30);
            tuxTextView.setTuxFont(52);
            if (C78857UxB.LJJJIL(((C26735AeR) getItem()).LIZ)) {
                Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.bx);
                if (LIZIZ != null) {
                    tuxTextView.setTextColor(LIZIZ.intValue());
                }
            } else {
                Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gp);
                if (LIZIZ2 != null) {
                    tuxTextView.setTextColor(LIZIZ2.intValue());
                }
            }
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 2, 42), tuxTextView);
            this.LJLJI = tuxTextView;
        }
        Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        C26018AJa c26018AJa2 = new C26018AJa(context2, null, 6);
        if (C26744Aea.LIZ().enableAutoFocus != null && o.LJ(C26744Aea.LIZ().enableAutoFocus, Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        if (C78857UxB.LJJJIL(item.LIZ) && z) {
            this.LJLJJLL = "auto";
            String str = item.LIZ;
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            this.LJLJL = i;
            c26018AJa2.LJIIIZ(item.LIZ);
        }
        DeliveryData deliveryData = M().LJLJJLL;
        if (deliveryData == null || (changeLocationData3 = deliveryData.changeLocationData) == null || (string = changeLocationData3.zipcodePlaceHolderHint) == null || string.length() == 0) {
            string = this.itemView.getContext().getString(R.string.fam);
        }
        c26018AJa2.LJII(string);
        DeliveryData deliveryData2 = M().LJLJJLL;
        if (deliveryData2 != null && (changeLocationData2 = deliveryData2.changeLocationData) != null && (num2 = changeLocationData2.zipcodeMaxLength) != null && (intValue = num2.intValue()) > 0) {
            c26018AJa2.LJI(intValue);
        }
        ((TextView) c26018AJa2.LIZIZ(R.id.cps)).setLines(1);
        c26018AJa2.LJ(false);
        DeliveryData deliveryData3 = M().LJLJJLL;
        if (deliveryData3 != null && (changeLocationData = deliveryData3.changeLocationData) != null && (num = changeLocationData.zipcodeKeyboardType) != null && num.intValue() == 1) {
            ((TextView) c26018AJa2.LIZIZ(R.id.cps)).setInputType(2);
        }
        c26018AJa2.LIZLLL(this.LJLJI);
        c26018AJa2.LIZJ(new C26731AeN(this, c26018AJa2, item));
        this.LJLILLLLZI = c26018AJa2;
        T5T editText2 = c26018AJa2.getEditText();
        if (editText2 != null) {
            editText2.setImeOptions(6);
            editText2.setOnEditorActionListener(new C26733AeP(this, editText2, item));
            editText2.setOnFocusChangeListener(new IDCListenerS157S0200000_4(this, item, 0));
        }
        C26021AJd c26021AJd = (C26021AJd) _$_findCachedViewById(R.id.nku);
        if (c26021AJd != null) {
            c26021AJd.setFormField(this.LJLILLLLZI);
            c26021AJd.LIZJ(EnumC26023AJf.NONE);
            c26021AJd.LJIIIIZZ(this.itemView.getContext().getString(R.string.fal));
            c26021AJd.LJII();
        }
        DeliveryData deliveryData4 = M().LJLJJLL;
        if (deliveryData4 == null || (list = deliveryData4.addresses) == null || list.isEmpty()) {
            String str2 = C27090AkA.LJLJJL;
            if ((str2 == null || str2.length() == 0) && (bool = C26744Aea.LIZ().enableAutoFocus) != null && bool.booleanValue() && (c26018AJa = this.LJLILLLLZI) != null && (editText = c26018AJa.getEditText()) != null) {
                editText.postDelayed(new ARunnableS23S0200000_4(editText, this, 0), 200L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, X.InterfaceC60061Nhh
    public final void onEvent(String str, String str2) {
        ZipcodeLocateAddress LIZ;
        Integer num;
        C26018AJa c26018AJa;
        if (!SC5.LIZIZ(str, "eventName", str2, "params", str, "ec_zipcode_locate_address") || (num = (LIZ = C26732AeO.LIZ(str2)).type) == null) {
            return;
        }
        if (num.intValue() == 0) {
            if (o.LJ(LIZ.isCheck, Boolean.TRUE)) {
                N(false);
            }
            String str3 = LIZ.error;
            if (str3 == null || str3.length() == 0) {
                str3 = this.itemView.getContext().getString(R.string.faj);
            }
            ((C26021AJd) _$_findCachedViewById(R.id.nku)).LJI(true);
            ((C26021AJd) _$_findCachedViewById(R.id.nku)).LIZLLL(str3);
            C26018AJa c26018AJa2 = this.LJLILLLLZI;
            if (c26018AJa2 != null) {
                c26018AJa2.LJFF(true);
            }
            if (!this.LJLJJL) {
                return;
            }
            this.LJLJJL = false;
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView == null || (c26018AJa = this.LJLILLLLZI) == null) {
                return;
            }
            c26018AJa.LIZLLL(tuxTextView);
            return;
        }
        if (num.intValue() == -1) {
            Boolean bool = LIZ.isCheck;
            if (bool != null && o.LJ(bool, Boolean.TRUE)) {
                N(true);
            }
            ((C26021AJd) _$_findCachedViewById(R.id.nku)).LJI(false);
            ((C26021AJd) _$_findCachedViewById(R.id.nku)).LIZLLL("");
            return;
        }
        num.intValue();
    }
}
