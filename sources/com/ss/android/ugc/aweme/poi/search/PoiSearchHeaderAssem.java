package com.ss.android.ugc.aweme.poi.search;

import X.AYA;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C110614Vt;
import X.C162476Zf;
import X.C16880lQ;
import X.C184077Kh;
import X.C19N;
import X.C212428Vi;
import X.C213648a0;
import X.C213678a3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C225598tH;
import X.C225608tI;
import X.C26227ARb;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78685UuP;
import X.C78926UyI;
import X.C85192Xc4;
import X.C85245Xcv;
import X.C8VC;
import X.C8W0;
import X.InterfaceC225588tG;
import X.InterfaceC65784Pro;
import X.InterfaceC85240Xcq;
import X.UC0;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS35S0100000_15;
import Y.IDObjectS176S0100000_3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.search.PoiSearchHeaderAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiSearchHeaderAssem extends UIContentAssem implements InterfaceC85240Xcq {
    public View LJLIL;
    public EditText LJLILLLLZI;
    public final C214378bB LJLJJI;
    public TuxTextView LJLJJL;
    public TuxIconView LJLJJLL;
    public TuxIconView LJLJL;
    public String LJLJLJ;
    public Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C55749LuL LJLJI = new C55749LuL(C47704Ins.LIZJ(this, C213648a0.class, "PoiSearchHierarchyData"), checkSupervisorPrepared());

    public void _$_clearFindViewByIdCache() {
        this.LJLJLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC85240Xcq, X.C8V9
    public String serviceKey() {
        return null;
    }

    public PoiSearchHeaderAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C225598tH c225598tH = C225598tH.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiSearchVM.class);
        C213678a3 c213678a3 = C213678a3.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 789);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ, c225598tH, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c213678a3, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJLJ = "";
    }

    private final C213648a0 x3() {
        return (C213648a0) this.LJLJI.getValue();
    }

    public final PoiSearchVM A3() {
        return (PoiSearchVM) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC85240Xcq
    public void Ji() {
        EditText editText = this.LJLILLLLZI;
        if (editText != null) {
            editText.requestFocus();
            EditText editText2 = this.LJLILLLLZI;
            if (editText2 != null) {
                AYA.LIZJ(1, editText2);
                return;
            } else {
                o.LJIJI("mSearchInputView");
                throw null;
            }
        }
        o.LJIJI("mSearchInputView");
        throw null;
    }

    public final void v3() {
        EditText editText = this.LJLILLLLZI;
        if (editText != null) {
            editText.setText("");
            EditText editText2 = this.LJLILLLLZI;
            if (editText2 != null) {
                editText2.requestFocus();
                EditText editText3 = this.LJLILLLLZI;
                if (editText3 != null) {
                    editText3.setCursorVisible(true);
                    EditText editText4 = this.LJLILLLLZI;
                    if (editText4 != null) {
                        editText4.setSelection(0);
                        EditText editText5 = this.LJLILLLLZI;
                        if (editText5 != null) {
                            KeyboardUtils.LIZLLL(editText5);
                            View view = this.LJLIL;
                            if (view != null) {
                                view.setVisibility(8);
                                PoiSearchVM A3 = A3();
                                A3.getClass();
                                A3.setState(new AqS28S1000000_3(null, 32));
                                A3.manualListRefresh();
                                return;
                            }
                            o.LJIJI("ivClear");
                            throw null;
                        }
                        o.LJIJI("mSearchInputView");
                        throw null;
                    }
                    o.LJIJI("mSearchInputView");
                    throw null;
                }
                o.LJIJI("mSearchInputView");
                throw null;
            }
            o.LJIJI("mSearchInputView");
            throw null;
        }
        o.LJIJI("mSearchInputView");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC85240Xcq
    public void Gd(PoiData poiData) {
        String str;
        PoiMobParam mobParam;
        PoiSearchVM A3 = A3();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            A3.getClass();
            return;
        }
        int i = C85245Xcv.LIZ[A3.LJLIL.ordinal()];
        String str2 = null;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
            } else {
                C26227ARb c26227ARb = new C26227ARb(LIZ);
                c26227ARb.LJFF(LIZ.getString(R.string.p18));
                if (poiData != null) {
                    str2 = poiData.getName();
                }
                c26227ARb.LIZIZ(str2);
                UC0.LIZJ(c26227ARb, new AqS107S0300000_3(LIZ, poiData, A3, 40));
                c26227ARb.LIZLLL(C225608tI.LJLIL);
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
                return;
            }
        }
        Intent intent = new Intent();
        intent.putExtra("poi", poiData);
        intent.putExtra("poi_data", poiData);
        intent.putExtra("keyword", ((C85192Xc4) A3.getState()).LJLIL);
        if (poiData != null) {
            str = poiData.getLogId();
        } else {
            str = null;
        }
        intent.putExtra("log_id", str);
        if (poiData != null && (mobParam = poiData.getMobParam()) != null) {
            str2 = mobParam.getSearchId();
        }
        intent.putExtra("search_id", str2);
        LIZ.setResult(-1, intent);
        LIZ.finish();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        int i;
        String string;
        o.LJIIIZ(view, "view");
        View findViewById = getContainerView().findViewById(R.id.bdp);
        C110614Vt c110614Vt = new C110614Vt();
        if (AVExternalServiceImpl.LIZ().anchorService().newRoundCornerUXOptimization()) {
            i = 8;
        } else {
            i = 2;
        }
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(i));
        Integer LIZIZ = C19N.LIZIZ(view, "view.context", R.attr.cf);
        if (LIZIZ == null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            LIZIZ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.cf, context));
        }
        c110614Vt.LIZ = LIZIZ;
        Context context2 = getContainerView().getContext();
        o.LJIIIIZZ(context2, "containerView.context");
        findViewById.setBackground(c110614Vt.LIZ(context2));
        View findViewById2 = view.findViewById(R.id.mee);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_poi_title)");
        this.LJLJJL = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.eys);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.iv_back)");
        TuxIconView tuxIconView = (TuxIconView) findViewById3;
        this.LJLJJLL = tuxIconView;
        C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 116));
        View findViewById4 = view.findViewById(R.id.dcx);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.fl_clear)");
        this.LJLIL = findViewById4;
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 134), findViewById4);
        View findViewById5 = view.findViewById(R.id.czq);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.et_input)");
        EditText editText = (EditText) findViewById5;
        this.LJLILLLLZI = editText;
        PoiSearchVM A3 = A3();
        EditText editText2 = this.LJLILLLLZI;
        if (editText2 != null) {
            Resources resources = editText2.getResources();
            o.LJIIIIZZ(resources, "mSearchInputView.resources");
            A3.getClass();
            int i2 = C85245Xcv.LIZ[A3.LJLIL.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    string = resources.getString(R.string.p1f);
                    o.LJIIIIZZ(string, "resources.getString(R.st…ng.poiretag_question_two)");
                } else {
                    throw new C162476Zf();
                }
            } else {
                string = resources.getString(R.string.e5i);
                o.LJIIIIZZ(string, "resources.getString(R.st…n_poi_search_placeholder)");
            }
            editText.setHint(string);
            View findViewById6 = view.findViewById(R.id.f_n);
            o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.iv_search_icon)");
            TuxIconView tuxIconView2 = (TuxIconView) findViewById6;
            this.LJLJL = tuxIconView2;
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS23S0100000_3(this, 135));
            EditText editText3 = this.LJLILLLLZI;
            if (editText3 != null) {
                editText3.addTextChangedListener(new IDObjectS176S0100000_3(this, 6));
                EditText editText4 = this.LJLILLLLZI;
                if (editText4 != null) {
                    editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.8tE
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                            if (i3 == 3) {
                                PoiSearchHeaderAssem poiSearchHeaderAssem = PoiSearchHeaderAssem.this;
                                PoiSearchHeaderAssem.this.C3((String) poiSearchHeaderAssem.withState(poiSearchHeaderAssem.A3(), C225578tF.LJLIL), true);
                                return true;
                            }
                            return false;
                        }
                    });
                    return;
                } else {
                    o.LJIJI("mSearchInputView");
                    throw null;
                }
            }
            o.LJIJI("mSearchInputView");
            throw null;
        }
        o.LJIJI("mSearchInputView");
        throw null;
    }

    public final void C3(String str, boolean z) {
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((InterfaceC225588tG) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC225588tG.class), null)).cj(((InterfaceC225588tG) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC225588tG.class), null)).Z1(), str);
        ((InterfaceC225588tG) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC225588tG.class), null)).wg(str);
        ((InterfaceC225588tG) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC225588tG.class), null)).Gj(str, z);
        if (C78685UuP.LJJJZ(str)) {
            View view = this.LJLIL;
            if (view != null) {
                view.setVisibility(0);
                return;
            } else {
                o.LJIJI("ivClear");
                throw null;
            }
        }
        View view2 = this.LJLIL;
        if (view2 != null) {
            view2.setVisibility(8);
        } else {
            o.LJIJI("ivClear");
            throw null;
        }
    }
}
