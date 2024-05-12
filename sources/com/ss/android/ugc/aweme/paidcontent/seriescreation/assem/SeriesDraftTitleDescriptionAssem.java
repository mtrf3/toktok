package com.ss.android.ugc.aweme.paidcontent.seriescreation.assem;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C214298b3;
import X.C26018AJa;
import X.C26021AJd;
import X.C26027AJj;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73849Syb;
import X.C78886Uxe;
import X.C78926UyI;
import X.C78999UzT;
import X.C7VX;
import X.C8YN;
import X.C90193gN;
import X.C9BD;
import X.EnumC26023AJf;
import X.T5T;
import X.TBT;
import X.ViewOnFocusChangeListenerC26025AJh;
import X.ViewOnFocusChangeListenerC26026AJi;
import Y.AfS56S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesDraftTitleDescriptionAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public final C73318Sq2 LJLL;
    public C26021AJd LJLLI;
    public C26021AJd LJLLILLLL;
    public final C73849Syb<String> LJLLJ;
    public final C73849Syb<String> LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLL;
        Integer valueOf = Integer.valueOf(R.id.jp3);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.jp3)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aj9;
    }

    public SeriesDraftTitleDescriptionAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesDraftViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 612), C26027AJj.INSTANCE, null);
        this.LJLL = new C73318Sq2();
        this.LJLLJ = C73849Syb.LJJZZI("");
        this.LJLLL = C73849Syb.LJJZZI("");
    }

    public final SeriesDraftViewModel H3() {
        return (SeriesDraftViewModel) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLL.dispose();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        C26021AJd c26021AJd;
        C26021AJd c26021AJd2;
        int i2;
        int i3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C7VX.LIZ()) {
            i = R.layout.aim;
        } else {
            i = R.layout.ain;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), i, (ViewGroup) _$_findCachedViewById(R.id.jp3), false);
        if (LLLLIILL instanceof C26021AJd) {
            c26021AJd = (C26021AJd) LLLLIILL;
        } else {
            c26021AJd = null;
        }
        this.LJLLI = c26021AJd;
        View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), i, (ViewGroup) _$_findCachedViewById(R.id.jp3), false);
        if (LLLLIILL2 instanceof C26021AJd) {
            c26021AJd2 = (C26021AJd) LLLLIILL2;
        } else {
            c26021AJd2 = null;
        }
        this.LJLLILLLL = c26021AJd2;
        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.jp3);
        viewGroup.addView(this.LJLLI);
        viewGroup.addView(this.LJLLILLLL);
        C73849Syb<String> source1 = this.LJLLJ;
        C73849Syb<String> source2 = this.LJLLL;
        o.LJIIJ(source1, "source1");
        o.LJIIJ(source2, "source2");
        C78999UzT.LJFF(AbstractC73672Svk.LJI(source1, source2, C78886Uxe.LJLJJI).LJJJJZI(new AfS56S0100000_4(this, 162)), this.LJLL);
        Context context = getContext();
        if (context != null) {
            C26018AJa c26018AJa = new C26018AJa(context, null, 6);
            c26018AJa.LJII(context.getString(R.string.qmp));
            c26018AJa.LJLJI = 150;
            c26018AJa.LIZJ(new IDObjectS177S0100000_4(this, 17));
            T5T t5t = (T5T) c26018AJa.findViewById(R.id.cps);
            int i4 = 4;
            if (C90193gN.LIZIZ(context)) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            t5t.setTextDirection(i2);
            t5t.setOnFocusChangeListener(new ViewOnFocusChangeListenerC26025AJh(c26018AJa, this, context));
            int i5 = 51;
            if (C7VX.LIZ()) {
                i3 = 51;
            } else {
                i3 = 31;
            }
            t5t.setTuxFont(i3);
            t5t.setImeOptions(6);
            t5t.setInputType(131072);
            t5t.setMaxLines(Integer.MAX_VALUE);
            t5t.setHorizontallyScrolling(false);
            C26021AJd c26021AJd3 = this.LJLLI;
            if (c26021AJd3 != null) {
                c26021AJd3.LJIIIIZZ(context.getString(R.string.qmo));
                c26021AJd3.setFormField(c26018AJa);
                c26021AJd3.LIZJ(EnumC26023AJf.HEADER);
            }
            C26018AJa c26018AJa2 = new C26018AJa(context, null, 6);
            c26018AJa2.LJII(context.getString(R.string.qmi));
            c26018AJa2.LJLJI = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
            c26018AJa2.LIZJ(new IDObjectS177S0100000_4(this, 18));
            T5T t5t2 = (T5T) c26018AJa2.findViewById(R.id.cps);
            if (!C90193gN.LIZIZ(context)) {
                i4 = 3;
            }
            t5t2.setTextDirection(i4);
            t5t2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC26026AJi(c26018AJa2, this, context));
            if (!C7VX.LIZ()) {
                i5 = 31;
            }
            t5t2.setTuxFont(i5);
            C26021AJd c26021AJd4 = this.LJLLILLLL;
            if (c26021AJd4 != null) {
                c26021AJd4.LJIIIIZZ(context.getString(R.string.qmh));
                c26021AJd4.setFormField(c26018AJa2);
                c26021AJd4.LIZJ(EnumC26023AJf.HEADER);
            }
            C8YN.LJII(this, H3(), new TBT() { // from class: X.9pw
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C248629pK) obj).LJLILLLLZI;
                }
            }, null, new AqS186S0100000_4(c26018AJa, 335), 6);
            C8YN.LJII(this, H3(), new TBT() { // from class: X.9px
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C248629pK) obj).LJLJI;
                }
            }, null, new AqS186S0100000_4(c26018AJa2, 334), 6);
        }
    }
}
