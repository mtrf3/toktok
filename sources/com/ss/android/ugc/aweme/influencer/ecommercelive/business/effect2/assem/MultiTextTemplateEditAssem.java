package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C30581Hy;
import X.C45455Hsh;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71603S8h;
import X.C71620S8y;
import X.C71621S8z;
import X.C76917UGr;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.InterfaceC187177Wf;
import X.S87;
import X.S8H;
import X.S90;
import X.S91;
import X.S92;
import X.S93;
import X.S94;
import X.S95;
import X.S96;
import X.S98;
import X.TBT;
import X.ViewOnFocusChangeListenerC71602S8g;
import X.W5F;
import X.W5U;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.MultiTextTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MultiTextTemplateEditAssem extends UISlotAssem implements S87, InterfaceC187177Wf {
    public final C214298b3 LJLL;
    public S8H LJLLI;
    public FixedKeyboardMonitor LJLLILLLL;
    public Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C71603S8h.class, null), checkSupervisorPrepared());

    private final void initSubscribe() {
        C8YN.LJII(this, K3(), new TBT() { // from class: X.S97
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S96) obj).LJLIL;
            }
        }, null, S92.LJLIL, 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.S99
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S96) obj).LJLILLLLZI;
            }
        }, null, S93.LJLIL, 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.S9A
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S96) obj).LJLJI;
            }
        }, null, S94.LJLIL, 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.S9B
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S96) obj).LJLJJI;
            }
        }, null, S95.LJLIL, 6);
    }

    @Override // X.InterfaceC187177Wf
    public void LLLLLILLIL() {
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLLJ.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLJ;
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

    @Override // X.S87, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int v3() {
        return R.layout.aqg;
    }

    public MultiTextTemplateEditAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MultiTextTemplateEditViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 644), S98.INSTANCE, null);
    }

    private final C71603S8h I3() {
        return (C71603S8h) this.LJLJLLL.getValue();
    }

    public final S8H H3() {
        S8H s8h = this.LJLLI;
        if (s8h != null) {
            return s8h;
        }
        S8H s8h2 = null;
        try {
            s8h2 = (S8H) C8VC.LIZIZ(this, C65352Pkq.LIZ(S8H.class), null);
        } catch (Throwable unused) {
        }
        this.LJLLI = s8h2;
        return s8h2;
    }

    public final MultiTextTemplateEditViewModel K3() {
        return (MultiTextTemplateEditViewModel) this.LJLL.getValue();
    }

    @Override // X.InterfaceC187177Wf
    public void S2() {
        C76917UGr.LJIILLIIL(((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).getEditText());
        C76917UGr.LJIILLIIL(((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czh)).getEditText());
        C76917UGr.LJIILLIIL(((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czi)).getEditText());
        C76917UGr.LJIILLIIL(((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czj)).getEditText());
    }

    @Override // X.S87
    public TemplateItem Uf() {
        MultiTextTemplateEditViewModel K3 = K3();
        MultiTextTemplateItem multiTextTemplateItem = K3.LJLIL;
        S96 state = K3.getState();
        return MultiTextTemplateItem.LIZ(multiTextTemplateItem, C47261Igj.LJII(C30581Hy.LJJIJIIJIL((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 0), state.LJLIL), C30581Hy.LJJIJIIJIL((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 1), state.LJLILLLLZI), C30581Hy.LJJIJIIJIL((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 2), state.LJLJI), C30581Hy.LJJIJIIJIL((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 3), state.LJLJJI)), false, 959);
    }

    @Override // X.S87
    public String f3() {
        View flPreviewContainer = _$_findCachedViewById(R.id.dbw);
        o.LJIIIIZZ(flPreviewContainer, "flPreviewContainer");
        return C45455Hsh.LIZIZ(flPreviewContainer);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LJLLILLLL;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(I3().LJLIL instanceof MultiTextTemplateItem)) {
            return;
        }
        TemplateItem templateItem = I3().LJLIL;
        o.LJII(templateItem, "null cannot be cast to non-null type com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.MultiTextTemplateItem");
        MultiTextTemplateItem multiTextTemplateItem = (MultiTextTemplateItem) templateItem;
        MultiTextTemplateEditViewModel K3 = K3();
        K3.getClass();
        K3.LJLIL = multiTextTemplateItem;
        K3.setState(new AqS178S0100000_12(multiTextTemplateItem, 532));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LJLLILLLL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(multiTextTemplateItem.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
        TemplateFieldText templateFieldText = ((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 0)).fieldData.fieldText;
        if (templateFieldText != null) {
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).setText(templateFieldText.content);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).setHint(templateFieldText.defaultContent);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).setTextLimitLength(templateFieldText.limit);
        }
        ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).setTextWatcher(new C71620S8y(this));
        TemplateFieldText templateFieldText2 = ((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 1)).fieldData.fieldText;
        if (templateFieldText2 != null) {
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czh)).setText(templateFieldText2.content);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czh)).setHint(templateFieldText2.defaultContent);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czh)).setTextLimitLength(templateFieldText2.limit);
        }
        ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czh)).setTextWatcher(new C71621S8z(this));
        TemplateFieldText templateFieldText3 = ((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 2)).fieldData.fieldText;
        if (templateFieldText3 != null) {
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czi)).setText(templateFieldText3.content);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czi)).setHint(templateFieldText3.defaultContent);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czi)).setTextLimitLength(templateFieldText3.limit);
        }
        ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czi)).setTextWatcher(new S90(this));
        TemplateFieldText templateFieldText4 = ((TemplateField) ListProtector.get(multiTextTemplateItem.LJJLJLI(), 3)).fieldData.fieldText;
        if (templateFieldText4 != null) {
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czj)).setText(templateFieldText4.content);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czj)).setHint(templateFieldText4.defaultContent);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czj)).setTextLimitLength(templateFieldText4.limit);
        }
        ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czj)).setTextWatcher(new S91(this));
        initSubscribe();
    }
}
