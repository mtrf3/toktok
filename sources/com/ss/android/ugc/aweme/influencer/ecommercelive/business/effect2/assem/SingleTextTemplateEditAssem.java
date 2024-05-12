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
import X.C76917UGr;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.InterfaceC187177Wf;
import X.ORZ;
import X.S87;
import X.S8H;
import X.S8T;
import X.S8U;
import X.S8X;
import X.T5T;
import X.TBT;
import X.W5F;
import X.W5U;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SingleTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.SingleTextTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SingleTextTemplateEditAssem extends UISlotAssem implements S87, InterfaceC187177Wf {
    public final C214298b3 LJLL;
    public S8H LJLLI;
    public FixedKeyboardMonitor LJLLILLLL;
    public Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C71603S8h.class, null), checkSupervisorPrepared());

    private final void initSubscribe() {
        C8YN.LJII(this, K3(), new TBT() { // from class: X.S8W
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S8V) obj).LJLIL;
            }
        }, null, S8U.LJLIL, 6);
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
        return R.layout.aqi;
    }

    public SingleTextTemplateEditAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SingleTextTemplateEditViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 647), S8X.INSTANCE, null);
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

    public final SingleTextTemplateEditViewModel K3() {
        return (SingleTextTemplateEditViewModel) this.LJLL.getValue();
    }

    @Override // X.InterfaceC187177Wf
    public void S2() {
        T5T etContent = (T5T) _$_findCachedViewById(R.id.cz8);
        o.LJIIIIZZ(etContent, "etContent");
        C76917UGr.LJIILLIIL(etContent);
    }

    @Override // X.S87
    public TemplateItem Uf() {
        SingleTextTemplateEditViewModel K3 = K3();
        SingleTextTemplateItem singleTextTemplateItem = K3.LJLIL;
        return SingleTextTemplateItem.LIZ(singleTextTemplateItem, C47261Igj.LJII(C30581Hy.LJJIJIIJIL((TemplateField) ListProtector.get(singleTextTemplateItem.LJJLJLI(), 0), K3.getState().LJLIL)), false, 959);
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
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(I3().LJLIL instanceof SingleTextTemplateItem)) {
            return;
        }
        TemplateItem templateItem = I3().LJLIL;
        o.LJII(templateItem, "null cannot be cast to non-null type com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SingleTextTemplateItem");
        SingleTextTemplateItem singleTextTemplateItem = (SingleTextTemplateItem) templateItem;
        SingleTextTemplateEditViewModel K3 = K3();
        K3.getClass();
        K3.LJLIL = singleTextTemplateItem;
        K3.setState(new AqS178S0100000_12(singleTextTemplateItem, 517));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LJLLILLLL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(singleTextTemplateItem.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
        TemplateField templateField = (TemplateField) ORZ.LJLLLLLL(0, singleTextTemplateItem.LJJLJLI());
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) _$_findCachedViewById(R.id.cz8)).setText(templateFieldText.content);
            ((TextView) _$_findCachedViewById(R.id.cz8)).setHint(templateFieldText.defaultContent);
            ((TextView) _$_findCachedViewById(R.id.cz8)).setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
        }
        ((TextView) _$_findCachedViewById(R.id.cz8)).addTextChangedListener(new S8T(this));
        T5T etContent = (T5T) _$_findCachedViewById(R.id.cz8);
        o.LJIIIIZZ(etContent, "etContent");
        C76917UGr.LJIJJ(etContent);
        initSubscribe();
    }
}
