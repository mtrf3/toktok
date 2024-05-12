package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder;

import X.AbstractC38911fr;
import X.C024607u;
import X.C117114ih;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C45804HyK;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68249QqT;
import X.C71703SCd;
import X.C71704SCe;
import X.C71706SCg;
import X.C71707SCh;
import X.C71735SDj;
import X.C71737SDl;
import X.C71738SDm;
import X.C71739SDn;
import X.C71740SDo;
import X.C71745SDt;
import X.C71746SDu;
import X.C79081V1x;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC27239AmZ;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.SE0;
import X.SE1;
import X.SE2;
import X.SE5;
import X.SE7;
import X.SEB;
import X.SEC;
import X.SED;
import X.SEE;
import X.SEF;
import X.SEG;
import X.SEH;
import X.SEI;
import X.SEJ;
import X.SEK;
import X.SEL;
import X.TBT;
import X.YE1;
import Y.AObserverS80S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.AutoCloseObserver;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.EventReceiver;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NormalTextInputHolder extends PowerCell<C71704SCe> implements InterfaceC27239AmZ {
    public final List<Object> LJLIL = new ArrayList();
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        this.LJLJJL = false;
    }

    public final SE7 M() {
        return (SE7) this.LJLJI.getValue();
    }

    public NormalTextInputHolder() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ATMCardViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 293);
        SEE see = SEE.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SEC.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 294), new AqS162S0100000_12((InterfaceC93923mO) this, 295), SEK.INSTANCE, see, new AqS162S0100000_12((InterfaceC93923mO) this, 296), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SED.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 297), new AqS162S0100000_12((InterfaceC93923mO) this, 288), SEJ.INSTANCE, see, new AqS162S0100000_12((InterfaceC93923mO) this, 289), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SEB.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, BuildConfig.VERSION_CODE), new AqS162S0100000_12((InterfaceC93923mO) this, 291), new AqS162S0100000_12((InterfaceC93923mO) this, 292), see, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b3;
        this.LJLJI = C221108m2.LIZIZ(SEG.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 287));
    }

    public final C71739SDn L() {
        return (C71739SDn) M().LIZJ;
    }

    @Override // X.InterfaceC27239AmZ
    public final View getFocusView() {
        SE1 se1;
        SE5 se5 = (SE5) ((ViewDataBinding) M().LIZ);
        if (se5 != null && (se1 = se5.LL) != null) {
            return se1.LL;
        }
        return null;
    }

    @Override // X.InterfaceC27239AmZ
    public final boolean needFocus() {
        boolean z;
        C71706SCg c71706SCg;
        C71735SDj c71735SDj;
        C71704SCe item = getItem();
        if (item != null && (c71706SCg = item.LJLJJL) != null && (c71735SDj = c71706SCg.LIZIZ) != null && !c71735SDj.M()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, new C117114ih(C79081V1x.LJII(25), 0, 0, 0, false, 0, true, 254));
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C71745SDt.LIZJ(itemView2, new SE2(Integer.valueOf(C45804HyK.LJJI(16)), Integer.valueOf(C45804HyK.LJJI(16)), 10));
        SE7 M = M();
        M.getClass();
        if (M.LIZIZ == null) {
            M.LIZIZ = this;
            ViewDataBinding viewDataBinding = (ViewDataBinding) M.LIZ;
            if (viewDataBinding != null) {
                viewDataBinding.LJIILJJIL(this);
            }
        }
        T t = M.LIZJ;
        Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        t.getClass();
        new AutoCloseObserver(lifecycle, t);
        M.LIZJ.LJLILLLLZI.observe(this, new AObserverS80S0100000_12(M, 46));
        L().LJLJL = new C68249QqT(L().LJLJJI.LIZ, C47261Igj.LJJIJ(new C71703SCd(((ATMCardViewModel) this.LJLILLLLZI.getValue()).iv0())));
        C71739SDn L = L();
        SEL prop1 = new TBT() { // from class: X.SEL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71740SDo) obj).LJIIJ;
            }
        };
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(this, 485);
        L.getClass();
        o.LJIIIZ(prop1, "prop1");
        C71746SDu<C71740SDo> c71746SDu = L.LJLJJI;
        c71746SDu.getClass();
        c71746SDu.LIZIZ.put(prop1, new AqS172S0200000_9(prop1, aqS178S0100000_12, 9));
        C71739SDn L2 = L();
        SEH prop12 = new TBT() { // from class: X.SEH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71740SDo) obj).LJIIJJI;
            }
        };
        AqS178S0100000_12 aqS178S0100000_122 = new AqS178S0100000_12(this, 486);
        L2.getClass();
        o.LJIIIZ(prop12, "prop1");
        C71746SDu<C71740SDo> c71746SDu2 = L2.LJLJJI;
        c71746SDu2.getClass();
        c71746SDu2.LIZIZ.put(prop12, new AqS172S0200000_9(prop12, aqS178S0100000_122, 9));
        ((EventReceiver) this.LJLJJI.getValue()).LJLJI.put(Integer.valueOf(C71707SCh.class.hashCode()), new AqS178S0100000_12(this, 484));
        EventReceiver eventReceiver = (EventReceiver) this.LJLJJI.getValue();
        C71738SDm t2 = C71738SDm.LIZ;
        AqS178S0100000_12 aqS178S0100000_123 = new AqS178S0100000_12(this, 487);
        eventReceiver.getClass();
        o.LJIIIZ(t2, "t");
        eventReceiver.LJLJI.put(Integer.valueOf(t2.hashCode()), aqS178S0100000_123);
        EventReceiver eventReceiver2 = (EventReceiver) this.LJLJJI.getValue();
        C71737SDl t3 = C71737SDl.LIZ;
        AqS178S0100000_12 aqS178S0100000_124 = new AqS178S0100000_12(this, 488);
        eventReceiver2.getClass();
        o.LJIIIZ(t3, "t");
        eventReceiver2.LJLJI.put(Integer.valueOf(t3.hashCode()), aqS178S0100000_124);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C71704SCe c71704SCe) {
        Boolean bool;
        int i;
        C71704SCe t = c71704SCe;
        o.LJIIIZ(t, "t");
        boolean z = true;
        this.LJLJJL = true;
        C71739SDn L = L();
        L.getClass();
        C68249QqT c68249QqT = L.LJLJL;
        if (c68249QqT != null) {
            Iterator it = ((List) c68249QqT.LIZ).iterator();
            while (it.hasNext()) {
                ((SEI) it.next()).LIZJ(t);
            }
        }
        SE7 M = M();
        String str = t.LJLIL.displayName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        SEF sef = new SEF(str);
        M.getClass();
        SE5 se5 = (SE5) ((ViewDataBinding) M.LIZ);
        if (se5 != null) {
            se5.LJIIZILJ(sef);
        }
        C71739SDn L2 = L();
        AbstractC38911fr abstractC38911fr = t.LJLJI;
        L2.getClass();
        o.LJIIIZ(abstractC38911fr, "<set-?>");
        L2.LJLJLLL = abstractC38911fr;
        ElementDTO elementDTO = t.LJLIL;
        L2.LJLLI = elementDTO;
        String str3 = elementDTO.placeholderDisplayName;
        if (str3 != null) {
            str2 = str3;
        }
        String str4 = elementDTO.notificationUrl;
        if (str4 != null) {
            if (str4.length() <= 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            i = 8;
        } else {
            i = 0;
        }
        SE0 se0 = new SE0(i, 0, 0, t.LJLIL.notificationUrl, 62);
        SE0 se02 = new SE0(0, 0, 0, null, 127);
        C71706SCg c71706SCg = t.LJLJJL;
        L2.LIZJ(L2.LJLJJI, new AqS178S0100000_12(new C71740SDo(str2, se0, se02, t.LJLJJI, c71706SCg.LIZ, c71706SCg.LIZIZ, c71706SCg.LIZJ, 8909), 369));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        SE7 M = M();
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        M.getClass();
        ViewDataBinding LIZ = C024607u.LIZ(C16880lQ.LLZIL(context), R.layout.zl, parent, false, null);
        o.LJIIIIZZ(LIZ, "{\n            DataBindin…e\n            )\n        }");
        M.LIZ = LIZ;
        M.LIZLLL(LIZ);
        View view = LIZ.LJLJJI;
        o.LJIIIIZZ(view, "b.root");
        return view;
    }
}
