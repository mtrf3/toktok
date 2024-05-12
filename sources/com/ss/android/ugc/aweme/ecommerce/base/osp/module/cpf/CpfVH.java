package com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf;

import X.C113654d7;
import X.C113664d8;
import X.C16880lQ;
import X.C19K;
import X.C1AU;
import X.C1DD;
import X.C221108m2;
import X.C26508Aam;
import X.C28012Az2;
import X.C29S;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70918RsQ;
import X.C71037RuL;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C78983UzD;
import X.EnumC71040RuO;
import X.LJM;
import X.ORZ;
import X.SF8;
import X.SF9;
import X.T5T;
import X.TBT;
import Y.IDCListenerS376S0100000_12;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillCpfInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CpfVH extends ECJediViewHolder {
    public static final /* synthetic */ int LJLLLL = 0;
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C113654d7 LJLJI;
    public final SF9 LJLJJI;
    public SF8 LJLJJL;
    public KeyBoardVisibilityUtil LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public int LJLJLLL;
    public LJM LJLL;
    public EnumC71040RuO LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLL;
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        C1AU c1au;
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, true);
        Context context = this.LJLIL.getContext();
        if ((context instanceof C29S) && (c1au = (C1AU) context) != null) {
            this.LJLJJLL = new KeyBoardVisibilityUtil(c1au, 32, new AqS186S0100000_4(this, 34));
        }
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.Ax1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getCheckCpfElem());
            }
        }, new AqS186S0100000_4(this, 35));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LJLJJLL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LJLJJLL = null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.4d7] */
    public CpfVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 23));
        final T5T etCpf = (T5T) _$_findCachedViewById(R.id.cz9);
        o.LJIIIIZZ(etCpf, "etCpf");
        this.LJLJI = new C113664d8(etCpf) { // from class: X.4d7
            public final EditText LJLIL;
            public final int LJLILLLLZI = 3;
            public final List<String> LJLJI = C47261Igj.LJJIJIIJI(".", "-");
            public final int LJLJJI = 14;

            {
                this.LJLIL = etCpf;
            }

            @Override // X.C113664d8, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (this.LJLILLLLZI <= 0) {
                    return;
                }
                String valueOf = String.valueOf(editable);
                int i = 0;
                String substring = valueOf.substring(0, this.LJLIL.getSelectionStart());
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int length = ujb.o.LJJJJZ(ujb.o.LJJJJZ(substring, (String) ListProtector.get(this.LJLJI, 0), "", false), (String) ListProtector.get(this.LJLJI, 1), "", false).length();
                StringBuilder sb = new StringBuilder();
                int length2 = valueOf.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt = valueOf.charAt(i3);
                    if (charAt != ((String) ListProtector.get(this.LJLJI, 0)).charAt(0) && charAt != ((String) ListProtector.get(this.LJLJI, 1)).charAt(0)) {
                        sb.append(charAt);
                        if ((sb.length() - i2) % this.LJLILLLLZI == 0) {
                            if (i2 >= 2) {
                                sb.append((String) ListProtector.get(this.LJLJI, 1));
                            } else {
                                sb.append((String) ListProtector.get(this.LJLJI, 0));
                            }
                            i2++;
                        }
                    }
                }
                int lastIndexOf = sb.lastIndexOf((String) ListProtector.get(this.LJLJI, 0));
                int lastIndexOf2 = sb.lastIndexOf((String) ListProtector.get(this.LJLJI, 1));
                if (lastIndexOf2 > lastIndexOf) {
                    lastIndexOf = lastIndexOf2;
                }
                if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
                    sb.deleteCharAt(lastIndexOf);
                }
                String sb2 = sb.toString();
                int length3 = sb2.length();
                int i4 = this.LJLJJI;
                if (length3 > i4) {
                    sb2 = sb2.substring(0, i4);
                    o.LJIIIIZZ(sb2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                int i5 = this.LJLILLLLZI;
                int i6 = (length % i5) + ((i5 + 1) * (length / i5));
                if (i6 % (i5 + 1) == 0) {
                    i6--;
                }
                int length4 = sb2.length();
                if (i6 >= 0) {
                    i = i6;
                }
                if (i <= length4) {
                    length4 = i;
                }
                if (!o.LJ(sb2, valueOf)) {
                    this.LJLIL.setText(sb2);
                }
                this.LJLIL.setSelection(length4);
            }
        };
        this.LJLJJI = new SF9(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(boolean r21) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH.M(boolean):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        CpfElem cpfElem;
        List<CpfElem> list;
        List<CpfElem> list2;
        C28012Az2 item = (C28012Az2) obj;
        o.LJIIIZ(item, "item");
        try {
            BillCpfInfo billCpfInfo = item.LIZ;
            SF8 sf8 = null;
            if (billCpfInfo != null && (list2 = billCpfInfo.cpfElems) != null) {
                cpfElem = (CpfElem) ORZ.LJLLLL(list2);
            } else {
                cpfElem = null;
            }
            if (cpfElem == null) {
                N(true, false);
                L().Xw0(null);
            } else {
                ((T5T) _$_findCachedViewById(R.id.cz9)).setText(cpfElem.maskCode);
                N(false, true);
                L().Xw0(cpfElem);
                this.LJLLI = EnumC71040RuO.SUCCESS;
                L().getClass();
            }
            BillCpfInfo billCpfInfo2 = item.LIZ;
            if (billCpfInfo2 != null && (list = billCpfInfo2.cpfElems) != null) {
                Context context = this.LJLIL.getContext();
                o.LJIIIIZZ(context, "view.context");
                T5T etCpf = (T5T) _$_findCachedViewById(R.id.cz9);
                o.LJIIIIZZ(etCpf, "etCpf");
                sf8 = new SF8(context, etCpf, list, new IDqS436S0100000_12(this, 30), new AqS178S0100000_12(this, 594), new AqS162S0100000_12(this, 1163));
            }
            this.LJLJJL = sf8;
            ((T5T) _$_findCachedViewById(R.id.cz9)).setOnFocusChangeListener(new IDCListenerS376S0100000_12(this, 7));
            TuxIconView iconClear = (TuxIconView) _$_findCachedViewById(R.id.ea2);
            o.LJIIIIZZ(iconClear, "iconClear");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 98, 42), iconClear);
            TuxIconView iconPen = (TuxIconView) _$_findCachedViewById(R.id.eac);
            o.LJIIIIZZ(iconPen, "iconPen");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 97, 42), iconPen);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            C78983UzD.LJIIZILJ(new RuntimeException(C1DD.LJ("CpfVH onBind exception: ", e)));
        }
    }

    public final void N(boolean z, boolean z2) {
        if (z) {
            this.LJLL = LJM.INPUT;
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.eac));
            if (TextUtils.isEmpty(((C19K) _$_findCachedViewById(R.id.cz9)).getText())) {
                C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.ea2));
            }
            Editable text = ((C19K) _$_findCachedViewById(R.id.cz9)).getText();
            if (text != null) {
                text.clear();
            }
            ((TextView) _$_findCachedViewById(R.id.cz9)).setEnabled(true);
            if (z2) {
                _$_findCachedViewById(R.id.cz9).requestFocus();
            }
            ((TextView) _$_findCachedViewById(R.id.cz9)).addTextChangedListener(this.LJLJI);
            ((TextView) _$_findCachedViewById(R.id.cz9)).addTextChangedListener(this.LJLJJI);
            return;
        }
        this.LJLL = LJM.SELECT;
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.ea2));
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.eac));
        ((TextView) _$_findCachedViewById(R.id.cz9)).setEnabled(false);
        ((TextView) _$_findCachedViewById(R.id.cz9)).removeTextChangedListener(this.LJLJI);
        ((TextView) _$_findCachedViewById(R.id.cz9)).removeTextChangedListener(this.LJLJJI);
        C78946Uyc.LJJIIJ(this.LJLIL, new C70918RsQ(0), C71037RuL.LJLIL);
    }
}
