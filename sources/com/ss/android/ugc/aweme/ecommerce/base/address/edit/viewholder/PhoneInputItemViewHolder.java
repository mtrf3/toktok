package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass636;
import X.C0MT;
import X.C16880lQ;
import X.C252989wM;
import X.C253009wO;
import X.C26706Ady;
import X.C27021Aj3;
import X.C27272An6;
import X.C27282AnG;
import X.C27308Ang;
import X.C27486AqY;
import X.C5H3;
import X.C68322mC;
import X.C70929Rsb;
import X.C70930Rsc;
import X.C71731SDf;
import X.C78685UuP;
import X.C78857UxB;
import X.C78946Uyc;
import X.InterfaceC27239AmZ;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.T5T;
import X.ViewOnFocusChangeListenerC27281AnF;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.IPhoneInputItemViewHolderStyle;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;
import wg5.c;

/* loaded from: classes5.dex */
public class PhoneInputItemViewHolder extends BaseViewHolder implements c, InterfaceC27239AmZ {
    public static final C27308Ang Companion = new C27308Ang();
    public Map<Integer, View> _$_findViewCache;
    public final C5H3 dynamicStyle$delegate;
    public boolean firstFillAndCheck;
    public final CandHelper mCandHelper;
    public long mStartFocus;
    public int mTextSizeBefore;
    public boolean requestPhoneCand;
    public TextWatcher textWatcher;
    public boolean userInput;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final IPhoneInputItemViewHolderStyle getDynamicStyle() {
        return (IPhoneInputItemViewHolderStyle) this.dynamicStyle$delegate.getValue();
    }

    public final void clearPhoneNumberIfContainsStars() {
        if (s.LJJJLZIJ(((C27486AqY) this.itemView.findViewById(R.id.hni)).getFullPhoneNumber().getSecond(), "*", false)) {
            ((C27486AqY) this.itemView.findViewById(R.id.hni)).setPhoneNumber("");
        }
    }

    @Override // X.InterfaceC27239AmZ
    public T5T getFocusView() {
        T5T t5t = (T5T) ((C71731SDf) ((C27486AqY) this.itemView.findViewById(R.id.hni)).LIZ(R.id.bwr)).LIZ(R.id.eof);
        o.LJIIIIZZ(t5t, "itemView.phoneInput.coun…nputWithIndicatorEditText");
        return t5t;
    }

    public final AddressEditViewModel getViewModel() {
        return (AddressEditViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setImeOptions() {
        Integer num;
        C27021Aj3 c27021Aj3 = (C27021Aj3) getItem();
        if (c27021Aj3 != null && (num = c27021Aj3.LJII) != null) {
            ((C71731SDf) ((C27486AqY) this.itemView.findViewById(R.id.hni)).LIZ(R.id.bwr)).getEditText().setImeOptions(num.intValue());
        }
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void handleInputBeforeVerify() {
        Object obj;
        CharSequence charSequence;
        OSZ osz;
        Object obj2 = ((C27021Aj3) getItem()).LIZIZ;
        String str = null;
        if (!(obj2 instanceof OSZ) || (osz = (OSZ) obj2) == null || (obj = osz.getSecond()) == null) {
            obj = ((C27021Aj3) getItem()).LIZIZ;
        }
        if (obj instanceof String) {
            CharSequence charSequence2 = (CharSequence) obj;
            if (charSequence2.length() == 0) {
                return;
            }
            List LJLJJI = s.LJLJJI(charSequence2, new char[]{')'}, false, 6);
            String str2 = (String) ORZ.LJLLLLLL(1, LJLJJI);
            if (str2 != null) {
                char[] cArr = {'0'};
                int length = str2.length();
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (!ORY.LJJIIZI(str2.charAt(i), cArr)) {
                            charSequence = str2.subSequence(i, str2.length());
                            break;
                        }
                        i++;
                    } else {
                        charSequence = "";
                        break;
                    }
                }
                str = charSequence.toString();
            }
            if (!C78857UxB.LJJJIL(str)) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            String LIZ2 = C0MT.LIZ(LIZ, (String) ORZ.LJLLLLLL(0, LJLJJI), ')', str, LIZ);
            ((TextView) ((C71731SDf) ((C27486AqY) this.itemView.findViewById(R.id.hni)).LIZ(R.id.bwr)).LIZ(R.id.eof)).setText(str);
            Object obj3 = ((C27021Aj3) getItem()).LIZIZ;
            if ((obj3 instanceof OSZ) && obj3 != null) {
                ((C27021Aj3) getItem()).LIZIZ = new OSZ(((OSZ) obj3).getFirst(), LIZ2);
            } else {
                ((C27021Aj3) getItem()).LIZIZ = LIZ2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC27239AmZ
    public boolean needFocus() {
        C253009wO c253009wO;
        String str;
        C27021Aj3 c27021Aj3 = (C27021Aj3) getItem();
        if (c27021Aj3 != null && !c27021Aj3.LJFF) {
            return false;
        }
        C27021Aj3 c27021Aj32 = (C27021Aj3) getItem();
        if ((c27021Aj32 == null || (c253009wO = c27021Aj32.LIZJ) == null || (str = c253009wO.LIZ) == null || str.length() <= 0) && String.valueOf(getFocusView().getText()).length() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onDestroy() {
        super.onDestroy();
        CandHelper candHelper = this.mCandHelper;
        PopupWindow popupWindow = candHelper.LIZJ;
        if (popupWindow != null) {
            popupWindow.dismiss();
            candHelper.LJIIJJI.removeMessages(1);
        } else {
            o.LJIJI("mPopupWindow");
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PhoneInputItemViewHolder(android.view.ViewGroup r6) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r6, r0)
            r5._$_findViewCache = r0
            android.content.Context r2 = r6.getContext()
            java.lang.String r4 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r4)
            r1 = 2131559203(0x7f0d0323, float:1.8743743E38)
            r0 = 0
            android.view.View r0 = X.C27532ArI.LIZ(r1, r2, r6, r0)
            r5.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 9
            r1.<init>(r5, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.viewModel$delegate = r0
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r3 = new com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper
            android.content.Context r2 = r6.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r4)
            android.view.View r1 = r5.itemView
            r0 = 2131372902(0x7f0a2b66, float:1.836588E38)
            android.view.View r0 = r1.findViewById(r0)
            X.AqY r0 = (X.C27486AqY) r0
            android.widget.EditText r0 = r0.getEditText()
            r3.<init>(r2, r0)
            r5.mCandHelper = r3
            r0 = -1
            r5.mStartFocus = r0
            r0 = 1
            r5.requestPhoneCand = r0
            r5.firstFillAndCheck = r0
            kotlin.jvm.internal.AqS154S0100000_4 r1 = new kotlin.jvm.internal.AqS154S0100000_4
            r0 = 126(0x7e, float:1.77E-43)
            r1.<init>(r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.dynamicStyle$delegate = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.9wO] */
    private final void autoFillLogNode(String str) {
        String str2;
        if (str == null || str.length() == 0 || !getViewModel().yw0() || !this.firstFillAndCheck) {
            return;
        }
        this.firstFillAndCheck = false;
        AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
        if (addressEditFragment != null) {
            C78946Uyc.LJJII(addressEditFragment, new C70929Rsb(), new AqS170S0100000_4(this, 203));
        }
        C68322mC c68322mC = new C68322mC();
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.address.widget.inputitem.InputItem");
        C252989wM c252989wM = (C252989wM) view;
        C253009wO c253009wO = ((C27021Aj3) getItem()).LIZJ;
        if (c253009wO == null || (str2 = c253009wO.LIZ) == null || str2.length() == 0) {
            ?? Aw0 = getViewModel().Aw0((C27021Aj3) getItem());
            c68322mC.element = Aw0;
            c252989wM.LJ(Aw0);
        }
        AddressEditFragment addressEditFragment2 = AddressEditFragment.LLD;
        if (addressEditFragment2 == null) {
            return;
        }
        C78946Uyc.LJJII(addressEditFragment2, new C70930Rsc(), new AqS135S0200000_4(this, (PhoneInputItemViewHolder) c68322mC, (C68322mC<C253009wO>) 17));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    public void onBind(C27021Aj3 item) {
        OSZ<String, String> osz;
        String str;
        OSZ osz2;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        this.mCandHelper.LIZJ(getViewModel(), item.LIZ.key);
        ((C71731SDf) ((C27486AqY) this.itemView.findViewById(R.id.hni)).LIZ(R.id.bwr)).setIndicatorClickListener(new ACListenerS24S0100000_4(item, 49));
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.address.widget.inputitem.InputItem");
        C252989wM c252989wM = (C252989wM) view;
        ClientConfig clientConfig = getViewModel().LLIIJI;
        if (clientConfig != null && o.LJ(clientConfig.disableRegionCodeChange, Boolean.TRUE)) {
            C27486AqY c27486AqY = (C27486AqY) c252989wM.LIZIZ(R.id.hni);
            ImageView icon_arrow_down = (ImageView) c27486AqY.LIZ(R.id.eao);
            o.LJIIIIZZ(icon_arrow_down, "icon_arrow_down");
            icon_arrow_down.setVisibility(8);
            c27486AqY.LIZ(R.id.hnu).setEnabled(false);
        }
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            ((C71731SDf) ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).getEditText().removeTextChangedListener(textWatcher);
        }
        c252989wM.setTitle(item.LIZ.title);
        ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).setHint(item.LIZ.hint);
        C27486AqY c27486AqY2 = (C27486AqY) c252989wM.LIZIZ(R.id.hni);
        Object obj = item.LIZIZ;
        String str2 = null;
        if (obj instanceof OSZ) {
            osz = (OSZ) obj;
        } else {
            osz = null;
        }
        c27486AqY2.LIZLLL(osz, true);
        Object obj2 = item.LIZIZ;
        if ((obj2 instanceof OSZ) && (osz2 = (OSZ) obj2) != null) {
            str = (String) osz2.getSecond();
        } else {
            str = null;
        }
        autoFillLogNode(str);
        setImeOptions();
        if (getDynamicStyle().getShowErrorWhenClickSaveButton() || getViewModel().lv0().isAllKeyItemFilled()) {
            C253009wO c253009wO = item.LIZJ;
            if (c253009wO != null) {
                c252989wM.LJ(c253009wO);
            } else {
                c252989wM.LIZJ();
            }
        } else {
            C253009wO c253009wO2 = item.LIZJ;
            if (c253009wO2 != null) {
                str2 = c253009wO2.LIZ;
            }
            if (C78685UuP.LJJJZ(str2)) {
                C27272An6.LIZ(((C27486AqY) c252989wM.LIZIZ(R.id.hni)).LIZ(R.id.eof));
                C27272An6.LIZ(c252989wM.LIZIZ(R.id.title));
            }
        }
        String str3 = this.mCandHelper.LJIIIIZZ;
        if (o.LJ(str3, "sug") || o.LJ(str3, "auto")) {
            this.mTextSizeBefore = ((C71731SDf) ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).getEditText().getText().length();
        }
        this.textWatcher = new C27282AnG(this, item, c252989wM);
        ((C71731SDf) ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).getEditText().addTextChangedListener(this.textWatcher);
        ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).setOnCountryCodeChangeListener(new AqS151S0200000_4(c252989wM, item, 4));
        ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).setOnCountryCodeClickListener(new ACListenerS24S0100000_4(this, 50));
        ((C71731SDf) ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).setOnEditTextFocusChangeListener(new ViewOnFocusChangeListenerC27281AnF(this, item, c252989wM));
        setEditableStyle(item.LJFF);
    }

    public void setEditableStyle(boolean z) {
        if (z) {
            return;
        }
        if (getDynamicStyle().getTitleGrayedInUneditable()) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.title);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        }
        C16880lQ.LJIILJJIL((FrameLayout) this.itemView.findViewById(R.id.bt5), null);
        View findViewById = this.itemView.findViewById(R.id.bt5);
        o.LJIIIIZZ(findViewById, "itemView.contentView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 23, 42), findViewById);
        C16880lQ.LJIIZILJ((LinearLayout) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.hnu), null);
        TextView textView2 = (TextView) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.hnu).findViewById(R.id.bwo);
        Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
        TextView textView3 = (TextView) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.hnu).findViewById(R.id.bwn);
        Context context3 = this.itemView.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context3));
        C16880lQ.LJIIZILJ((LinearLayout) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.hnu), new ACListenerS24S0100000_4(this, 51));
        ((C71731SDf) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.bwr)).LIZ(R.id.eof).setFocusable(false);
        ((C71731SDf) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.bwr)).LIZ(R.id.eof).setFocusableInTouchMode(false);
        TextView textView4 = (TextView) ((C71731SDf) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.bwr)).LIZ(R.id.eof);
        Context context4 = this.itemView.getContext();
        o.LJIIIIZZ(context4, "itemView.context");
        textView4.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context4));
        View LIZ = ((C71731SDf) ((C27486AqY) _$_findCachedViewById(R.id.hni)).LIZ(R.id.bwr)).LIZ(R.id.eof);
        o.LJIIIIZZ(LIZ, "phoneInput.country_code_…nputWithIndicatorEditText");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 24, 42), LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C27021Aj3) obj);
    }
}
