package com.ss.android.ugc.aweme.ecommerce.search.searchbar;

import X.ActivityC45651qj;
import X.C19K;
import X.C208338Fp;
import X.C208398Fv;
import X.C212428Vi;
import X.C214298b3;
import X.C32151Nz;
import X.C50652JuK;
import X.C50948Jz6;
import X.C50962JzK;
import X.C51163K6d;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78596Usy;
import X.C78685UuP;
import X.C78926UyI;
import X.C85855Xml;
import X.C9XN;
import X.InterfaceC65350Pko;
import X.K7K;
import X.K94;
import X.K9E;
import X.K9J;
import X.K9K;
import X.K9L;
import X.K9O;
import X.K9V;
import X.KAU;
import X.O6R;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class ECSearchBarAssem extends UISlotAssem implements ISearchBarAbility {
    public static final /* synthetic */ int LJLLJ = 0;
    public final C214298b3 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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
        return R.layout.aov;
    }

    public ECSearchBarAssem() {
        C9XN c9xn = C9XN.LIZ;
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 68);
        C65776Prg LIZ = C65352Pkq.LIZ(ECSearchBarAssemVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9xn, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 69), K9L.INSTANCE, aqS158S0100000_8);
        this.LJLL = true;
    }

    public final ECSearchBarAssemVM I3() {
        return (ECSearchBarAssemVM) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final EditText R9() {
        return (EditText) _$_findCachedViewById(R.id.jf6);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, ISearchBarAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final MutableLiveData tP() {
        return I3().LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final boolean T8() {
        return this.LJLLI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (X.C208338Fp.LJ(r2, r3, r4, (android.widget.ImageView) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.d99), null, true, new kotlin.jvm.internal.AqS190S0100000_8(r11, 90), new kotlin.jvm.internal.AqS174S0100000_8(r11, 270), 16) == false) goto L4;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "keyword"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            android.content.Context r0 = r11.getContext()
            r1 = 2131375334(0x7f0a34e6, float:1.8370813E38)
            if (r0 != 0) goto L2f
        Le:
            android.view.View r0 = r11._$_findCachedViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r12)
        L17:
            android.view.View r0 = r11._$_findCachedViewById(r1)
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L2e
            android.view.View r1 = r11._$_findCachedViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            int r0 = r12.length()
            r1.setSelection(r0)
        L2e:
            return
        L2f:
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM r0 = r11.I3()
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility r3 = r0.LJLJJI
            if (r3 == 0) goto Le
            X.K9F r0 = r3.H2()
            X.KAU r2 = r0.LIZLLL
            X.KAU r0 = X.KAU.RESULT
            if (r2 != r0) goto Le
            X.K9E r0 = r3.g8()
            X.8Fv r3 = r0.LJIIZILJ
            if (r3 == 0) goto Le
            android.content.Context r2 = r11.getContext()
            if (r2 == 0) goto Le
        L50:
            android.view.View r4 = r11._$_findCachedViewById(r1)
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.String r0 = "search_edit_text"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r0 = 2131366855(0x7f0a13c7, float:1.8353615E38)
            android.view.View r5 = r11._$_findCachedViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 0
            r7 = 1
            kotlin.jvm.internal.AqS190S0100000_8 r8 = new kotlin.jvm.internal.AqS190S0100000_8
            r0 = 90
            r8.<init>(r11, r0)
            kotlin.jvm.internal.AqS174S0100000_8 r9 = new kotlin.jvm.internal.AqS174S0100000_8
            r0 = 270(0x10e, float:3.78E-43)
            r9.<init>(r11, r0)
            r10 = 16
            boolean r0 = X.C208338Fp.LJ(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L17
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.G0(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K3(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.K3(java.lang.String):void");
    }

    public final void L3(K9J k9j) {
        View LIZJ;
        Context context = getContext();
        if (context != null && (LIZJ = EComPhotoSearchServiceImpl.LJFF().LIZJ(context, -1, K7K.SEARCH_MIDDLE, null, new K9V(this), new AqS158S0100000_8(this, 694))) != null) {
            if (k9j == K9J.END_WITH_SPLIT || k9j == K9J.END_WITHOUT_SPLIT) {
                ((ViewGroup) _$_findCachedViewById(R.id.g52)).addView(LIZJ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void LLLFFI(boolean z) {
        int i;
        if (_$_findCachedViewById(R.id.jf6).isFocused() == z) {
            return;
        }
        if (z && !_$_findCachedViewById(R.id.jf6).isFocused()) {
            _$_findCachedViewById(R.id.jf6).requestFocus();
            EditText editText = (EditText) _$_findCachedViewById(R.id.jf6);
            Editable text = ((C19K) _$_findCachedViewById(R.id.jf6)).getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            editText.setSelection(i);
            return;
        }
        _$_findCachedViewById(R.id.jf6).clearFocus();
    }

    public final void M3(boolean z) {
        Context context;
        boolean z2;
        if (getContext() == null) {
            return;
        }
        if (!z) {
            _$_findCachedViewById(R.id.e5z).setVisibility(8);
            ((TextView) _$_findCachedViewById(R.id.jf6)).setPadding(0, 0, 0, 0);
            return;
        }
        C51163K6d c51163K6d = I3().LJLJJL;
        if (c51163K6d != null && (context = getContext()) != null) {
            ViewGroup hint_voucher = (ViewGroup) _$_findCachedViewById(R.id.e5z);
            o.LJIIIIZZ(hint_voucher, "hint_voucher");
            TextView search_edit_text = (TextView) _$_findCachedViewById(R.id.jf6);
            o.LJIIIIZZ(search_edit_text, "search_edit_text");
            if (I3().hv0() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            K94.LIZJ(c51163K6d, context, hint_voucher, search_edit_text, z2, true);
        }
    }

    public final void N3(boolean z) {
        K9J k9j;
        View findViewById;
        View findViewById2;
        if (I3().hv0() == 1) {
            if (z) {
                k9j = K9J.END_WITH_SPLIT;
            } else {
                k9j = K9J.END_WITHOUT_SPLIT;
            }
        } else {
            k9j = K9J.GONE;
        }
        int i = K9K.LIZ[k9j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                _$_findCachedViewById(R.id.g51).setVisibility(8);
                _$_findCachedViewById(R.id.g52).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.enl)).setVisibility(0);
                return;
            }
            _$_findCachedViewById(R.id.g51).setVisibility(8);
            _$_findCachedViewById(R.id.g52).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.enl)).setVisibility(0);
            if (((ViewGroup) _$_findCachedViewById(R.id.g52)).getChildCount() <= 0) {
                L3(k9j);
                C78596Usy.LJJJJLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(46)), _$_findCachedViewById(R.id.d99));
            }
            ViewGroup ll_photo_search_end = (ViewGroup) _$_findCachedViewById(R.id.g52);
            o.LJIIIIZZ(ll_photo_search_end, "ll_photo_search_end");
            View childAt = ll_photo_search_end.getChildAt(0);
            if (childAt == null || (findViewById2 = childAt.findViewById(R.id.hoi)) == null) {
                return;
            }
            findViewById2.setVisibility(8);
            return;
        }
        _$_findCachedViewById(R.id.g51).setVisibility(8);
        _$_findCachedViewById(R.id.g52).setVisibility(0);
        ((ImageView) _$_findCachedViewById(R.id.enl)).setVisibility(0);
        if (((ViewGroup) _$_findCachedViewById(R.id.g52)).getChildCount() <= 0) {
            L3(k9j);
            C78596Usy.LJJJJLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(46)), _$_findCachedViewById(R.id.d99));
        }
        ViewGroup ll_photo_search_end2 = (ViewGroup) _$_findCachedViewById(R.id.g52);
        o.LJIIIIZZ(ll_photo_search_end2, "ll_photo_search_end");
        View childAt2 = ll_photo_search_end2.getChildAt(0);
        if (childAt2 == null || (findViewById = childAt2.findViewById(R.id.hoi)) == null) {
            return;
        }
        findViewById.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility
    public final void hC(Word word) {
        C50948Jz6 c50948Jz6;
        String charSequence;
        K9E g8;
        o.LJIIIZ(word, "word");
        ISearchBarContextAbility iSearchBarContextAbility = I3().LJLJJI;
        String str = null;
        if (iSearchBarContextAbility != null && (g8 = iSearchBarContextAbility.g8()) != null) {
            c50948Jz6 = g8.LJIILIIL;
        } else {
            c50948Jz6 = null;
        }
        String gv0 = I3().gv0();
        CharSequence hint = ((TextView) _$_findCachedViewById(R.id.jf6)).getHint();
        if (hint != null && (charSequence = hint.toString()) != null) {
            str = s.LJZI(charSequence).toString();
        }
        if (o.LJ(gv0, str) && C78685UuP.LJJJZ(word.getWord()) && c50948Jz6 != null && c50948Jz6.isSetHintBySugWord()) {
            ((TextView) _$_findCachedViewById(R.id.jf6)).setHint(word.getWord());
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                C85855Xml.LIZJ(LIZ, C50652JuK.class, new AqS174S0100000_8(word, 33));
            }
            c50948Jz6.setSearchHint(word.getWord());
            C50962JzK.LIZ(c50948Jz6, word);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015b  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem.onViewCreated(android.view.View):void");
    }

    public final void H3(boolean z, boolean z2) {
        K9E g8;
        C208398Fv c208398Fv;
        ISearchBarContextAbility iSearchBarContextAbility = I3().LJLJJI;
        if (iSearchBarContextAbility != null && (g8 = iSearchBarContextAbility.g8()) != null && (c208398Fv = g8.LJIIZILJ) != null && c208398Fv.isVisible() && !z2) {
            return;
        }
        String valueOf = String.valueOf(((C19K) _$_findCachedViewById(R.id.jf6)).getText());
        ECSearchBarAssemVM I3 = I3();
        K9O k9o = new K9O(valueOf, z);
        if (!o.LJ(k9o, I3.LJLJI.getValue())) {
            I3.LJLJI.setValue(k9o);
        }
        if (z) {
            KeyboardUtils.LIZLLL(_$_findCachedViewById(R.id.jf6));
        } else {
            KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.jf6));
        }
    }

    @Override // X.KCT
    public final void I1(KAU kau, KAU curPageState) {
        boolean z;
        C208398Fv c208398Fv;
        K9E g8;
        o.LJIIIZ(curPageState, "curPageState");
        if (curPageState == KAU.RESULT) {
            _$_findCachedViewById(R.id.mj5).setVisibility(8);
            if (I3().hv0() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            _$_findCachedViewById(R.id.mj5).setVisibility(0);
            Editable text = ((C19K) _$_findCachedViewById(R.id.jf6)).getText();
            if (text != null && text.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            ISearchBarContextAbility iSearchBarContextAbility = I3().LJLJJI;
            if (iSearchBarContextAbility != null && (g8 = iSearchBarContextAbility.g8()) != null) {
                c208398Fv = g8.LJIIZILJ;
            } else {
                c208398Fv = null;
            }
            EditText search_edit_text = (EditText) _$_findCachedViewById(R.id.jf6);
            o.LJIIIIZZ(search_edit_text, "search_edit_text");
            C208338Fp.LIZJ(c208398Fv, search_edit_text, (ImageView) _$_findCachedViewById(R.id.d99), true);
        }
        if (z) {
            ((ImageView) _$_findCachedViewById(R.id.avi)).setVisibility(0);
            N3(true);
        } else {
            ((ImageView) _$_findCachedViewById(R.id.avi)).setVisibility(8);
            N3(false);
        }
        ECSearchBarAssemVM I3 = I3();
        I3.getClass();
        I3.setState(new AqS139S0200000_8(curPageState, I3, 56));
    }
}
