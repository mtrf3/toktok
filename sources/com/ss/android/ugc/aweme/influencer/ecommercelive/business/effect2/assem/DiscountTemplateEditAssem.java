package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.C16880lQ;
import X.C17N;
import X.C214298b3;
import X.C30581Hy;
import X.C45455Hsh;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71596S8a;
import X.C71597S8b;
import X.C71598S8c;
import X.C71600S8e;
import X.C71603S8h;
import X.C76917UGr;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.InterfaceC187177Wf;
import X.ORZ;
import X.S87;
import X.S8H;
import X.S8Y;
import X.S8Z;
import X.T5T;
import X.TBT;
import X.ViewOnFocusChangeListenerC71513S4v;
import X.ViewOnFocusChangeListenerC71602S8g;
import X.W5F;
import X.W5U;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.DiscountTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DiscountTemplateEditAssem extends UISlotAssem implements S87, InterfaceC187177Wf {
    public final C214298b3 LJLL;
    public final ViewOnFocusChangeListenerC71513S4v LJLLI;
    public final ViewOnFocusChangeListenerC71513S4v LJLLILLLL;
    public S8H LJLLJ;
    public FixedKeyboardMonitor LJLLL;
    public Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C71603S8h.class, null), checkSupervisorPrepared());

    private final void initSubscribe() {
        C8YN.LJII(this, K3(), new TBT() { // from class: X.S8f
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71598S8c) obj).LJLIL;
            }
        }, null, C71596S8a.LJLIL, 6);
        C8YN.LJII(this, K3(), new TBT() { // from class: X.S8d
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C71598S8c) obj).LJLILLLLZI;
            }
        }, null, C71597S8b.LJLIL, 6);
    }

    @Override // X.InterfaceC187177Wf
    public void LLLLLILLIL() {
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLL;
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
        return R.layout.aqf;
    }

    public DiscountTemplateEditAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DiscountTemplateEditViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT), C71600S8e.INSTANCE, null);
        this.LJLLI = new ViewOnFocusChangeListenerC71513S4v();
        this.LJLLILLLL = new ViewOnFocusChangeListenerC71513S4v();
    }

    private final C71603S8h I3() {
        return (C71603S8h) this.LJLJLLL.getValue();
    }

    public final S8H H3() {
        S8H s8h = this.LJLLJ;
        if (s8h != null) {
            return s8h;
        }
        S8H s8h2 = null;
        try {
            s8h2 = (S8H) C8VC.LIZIZ(this, C65352Pkq.LIZ(S8H.class), null);
        } catch (Throwable unused) {
        }
        this.LJLLJ = s8h2;
        return s8h2;
    }

    public final DiscountTemplateEditViewModel K3() {
        return (DiscountTemplateEditViewModel) this.LJLL.getValue();
    }

    @Override // X.InterfaceC187177Wf
    public void S2() {
        C76917UGr.LJIILLIIL(((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).getEditText());
        T5T etContent = (T5T) _$_findCachedViewById(R.id.cz8);
        o.LJIIIIZZ(etContent, "etContent");
        C76917UGr.LJIILLIIL(etContent);
    }

    @Override // X.S87
    public TemplateItem Uf() {
        C71598S8c state = K3().getState();
        return DiscountTemplateItem.LIZ(state.LJLJI, C47261Igj.LJII(C30581Hy.LJJIJIIJIL((TemplateField) ListProtector.get(state.LJLJI.LJJLJLI(), 0), state.LJLIL), C30581Hy.LJJIJIIJIL((TemplateField) ListProtector.get(state.LJLJI.LJJLJLI(), 1), state.LJLILLLLZI)), false, 959);
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
        ViewOnFocusChangeListenerC71513S4v viewOnFocusChangeListenerC71513S4v = this.LJLLI;
        EditText editText = viewOnFocusChangeListenerC71513S4v.LJLIL;
        if (editText != null) {
            editText.setOnFocusChangeListener(null);
            editText.removeTextChangedListener(viewOnFocusChangeListenerC71513S4v);
        }
        ViewOnFocusChangeListenerC71513S4v viewOnFocusChangeListenerC71513S4v2 = this.LJLLILLLL;
        EditText editText2 = viewOnFocusChangeListenerC71513S4v2.LJLIL;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(null);
            editText2.removeTextChangedListener(viewOnFocusChangeListenerC71513S4v2);
        }
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LJLLL;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(I3().LJLIL instanceof DiscountTemplateItem)) {
            return;
        }
        TemplateItem templateItem = I3().LJLIL;
        o.LJII(templateItem, "null cannot be cast to non-null type com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DiscountTemplateItem");
        DiscountTemplateItem discountTemplateItem = (DiscountTemplateItem) templateItem;
        W5F LJIIIIZZ = W5U.LJIIIIZZ(discountTemplateItem.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
        DiscountTemplateEditViewModel K3 = K3();
        K3.getClass();
        K3.setState(new AqS178S0100000_12(discountTemplateItem, 518));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LJLLL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        ViewOnFocusChangeListenerC71602S8g viewOnFocusChangeListenerC71602S8g = (ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk);
        viewOnFocusChangeListenerC71602S8g.LJLJI = false;
        ViewGroup.LayoutParams layoutParams = viewOnFocusChangeListenerC71602S8g.LIZ(R.id.ls).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (viewOnFocusChangeListenerC71602S8g.LJLJI) {
            marginLayoutParams.setMarginEnd(C17N.LJIILL(32.0f));
        } else {
            marginLayoutParams.setMarginEnd(0);
        }
        viewOnFocusChangeListenerC71602S8g.LIZ(R.id.ls).setLayoutParams(marginLayoutParams);
        ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).getEditText().addTextChangedListener(new S8Y(this));
        TemplateField templateField = (TemplateField) ORZ.LJLLLLLL(0, discountTemplateItem.LJJLJLI());
        if (templateField != null && (templateFieldData2 = templateField.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null) {
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).setTextLimitLength(templateFieldText2.limit);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).setHint(templateFieldText2.defaultContent);
            ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).setText(templateFieldText2.content);
            ViewOnFocusChangeListenerC71513S4v viewOnFocusChangeListenerC71513S4v = this.LJLLI;
            T5T edit = ((ViewOnFocusChangeListenerC71602S8g) _$_findCachedViewById(R.id.czk)).getEditText();
            TextView tvTitleLimit = (TextView) _$_findCachedViewById(R.id.lye);
            o.LJIIIIZZ(tvTitleLimit, "tvTitleLimit");
            int i = templateFieldText2.limit;
            viewOnFocusChangeListenerC71513S4v.getClass();
            o.LJIIIZ(edit, "edit");
            viewOnFocusChangeListenerC71513S4v.LJLJJI = edit.getOnFocusChangeListener();
            edit.setOnFocusChangeListener(viewOnFocusChangeListenerC71513S4v);
            viewOnFocusChangeListenerC71513S4v.LJLIL = edit;
            viewOnFocusChangeListenerC71513S4v.LJLILLLLZI = tvTitleLimit;
            viewOnFocusChangeListenerC71513S4v.LJLJI = i;
        }
        ((TextView) _$_findCachedViewById(R.id.cz8)).addTextChangedListener(new S8Z(this));
        TemplateField templateField2 = (TemplateField) ORZ.LJLLLLLL(1, discountTemplateItem.LJJLJLI());
        if (templateField2 != null && (templateFieldData = templateField2.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) _$_findCachedViewById(R.id.cz8)).setText(templateFieldText.content);
            ((TextView) _$_findCachedViewById(R.id.cz8)).setHint(templateFieldText.defaultContent);
            ((TextView) _$_findCachedViewById(R.id.cz8)).setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
            ViewOnFocusChangeListenerC71513S4v viewOnFocusChangeListenerC71513S4v2 = this.LJLLILLLL;
            EditText etContent = (EditText) _$_findCachedViewById(R.id.cz8);
            o.LJIIIIZZ(etContent, "etContent");
            TextView tvContentLimit = (TextView) _$_findCachedViewById(R.id.lw0);
            o.LJIIIIZZ(tvContentLimit, "tvContentLimit");
            int i2 = templateFieldText.limit;
            viewOnFocusChangeListenerC71513S4v2.getClass();
            viewOnFocusChangeListenerC71513S4v2.LJLJJI = etContent.getOnFocusChangeListener();
            etContent.setOnFocusChangeListener(viewOnFocusChangeListenerC71513S4v2);
            viewOnFocusChangeListenerC71513S4v2.LJLIL = etContent;
            viewOnFocusChangeListenerC71513S4v2.LJLILLLLZI = tvContentLimit;
            viewOnFocusChangeListenerC71513S4v2.LJLJI = i2;
        }
        T5T etContent2 = (T5T) _$_findCachedViewById(R.id.cz8);
        o.LJIIIIZZ(etContent2, "etContent");
        C76917UGr.LJIJJ(etContent2);
        initSubscribe();
    }
}
