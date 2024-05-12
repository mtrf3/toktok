package com.ss.android.ugc.aweme.anchor;

import X.C119244m8;
import X.C16880lQ;
import X.C214298b3;
import X.C214528bQ;
import X.C236829Re;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9QZ;
import X.SY4;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS373S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddAnchorAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ga;
    }

    public AddAnchorAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(AddAnchorViewModel.class);
        this.LJLJLLL = new C214298b3(new AqS154S0100000_4(LIZ, 48), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C9QZ.INSTANCE, LIZ);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, AddAnchorParam.class, null), checkSupervisorPrepared());
    }

    public final AddAnchorViewModel H3() {
        return (AddAnchorViewModel) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String str;
        super.onCreate();
        AddAnchorViewModel H3 = H3();
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.btm)) == null) {
            str = "";
        }
        H3.getClass();
        H3.LJLJJL = str;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        _$_findCachedViewById(R.id.bqy).getClass();
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9Qa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C236559Qd) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 256), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.9Qc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236559Qd) obj).LJLIL;
            }
        }, null, C236829Re.LJLIL, 6);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.b3n), new ACListenerS24S0100000_4(this, 226));
        C16880lQ.LJJJIL((C119244m8) _$_findCachedViewById(R.id.i1l), new ACListenerS24S0100000_4(this, 227));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.bqy), new ACListenerS24S0100000_4(this, 228));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.beg), new ACListenerS24S0100000_4(this, 229));
        TextView link_input = (TextView) _$_findCachedViewById(R.id.ft6);
        o.LJIIIIZZ(link_input, "link_input");
        link_input.addTextChangedListener(new IDObjectS177S0100000_4(this, 15));
        _$_findCachedViewById(R.id.ft6).setOnFocusChangeListener(new IDCListenerS373S0100000_4(this, 5));
    }
}
