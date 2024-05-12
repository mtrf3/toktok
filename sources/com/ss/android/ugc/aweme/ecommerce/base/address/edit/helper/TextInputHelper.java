package com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C221108m2;
import X.C252989wM;
import X.C253009wO;
import X.C26706Ady;
import X.C27021Aj3;
import X.C27038AjK;
import X.C27196Als;
import X.C27252Amm;
import X.C27254Amo;
import X.C27272An6;
import X.C27307Anf;
import X.C5H3;
import X.C71731SDf;
import X.C78565UsT;
import X.C78685UuP;
import X.InterfaceC27239AmZ;
import X.T5T;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnFocusChangeListenerC27249Amj;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.ITextInputHelperStyle;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import ujb.s;
import wg5.c;

/* loaded from: classes5.dex */
public final class TextInputHelper implements c, InterfaceC27239AmZ {
    public static final C27307Anf Companion = new C27307Anf();
    public final CandHelper candHelper;
    public final C5H3 dynamicStyle$delegate;
    public boolean firstFillAndCheck;
    public final AddressEditFragment fragment;
    public boolean hasFirstFocus;
    public C27021Aj3 item;
    public boolean recommend;
    public long startFocus;
    public final C252989wM targetView;
    public int textSizeBefore;
    public TextWatcher textWatcher;
    public boolean userInput;
    public final AddressEditViewModel viewModel;

    private final ITextInputHelperStyle getDynamicStyle() {
        return (ITextInputHelperStyle) this.dynamicStyle$delegate.getValue();
    }

    private final void setOptEnableUneditableStyle() {
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 199);
        this.targetView.setOnClickListener(new ViewOnClickListenerC13880ga(null));
        C16880lQ.LJIIJ(new Au2S15S0100000_4(aqS170S0100000_4, 20, 42), this.targetView);
        View LIZIZ = this.targetView.LIZIZ(R.id.bt5);
        o.LJIIIIZZ(LIZIZ, "targetView.contentView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(aqS170S0100000_4, 21, 42), LIZIZ);
        this.targetView.LIZIZ(R.id.eof).setFocusable(false);
        ((TextView) this.targetView.LIZIZ(R.id.eof)).setCursorVisible(false);
        this.targetView.LIZIZ(R.id.eof).setFocusableInTouchMode(false);
        View findViewById = this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.eof);
        o.LJIIIIZZ(findViewById, "targetView.contentView.inputWithIndicatorEditText");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(aqS170S0100000_4, 22, 42), findViewById);
    }

    @Override // X.InterfaceC27239AmZ
    public T5T getFocusView() {
        T5T t5t = (T5T) this.targetView.LIZIZ(R.id.eof);
        o.LJIIIIZZ(t5t, "targetView.inputWithIndicatorEditText");
        return t5t;
    }

    @Override // X.InterfaceC27239AmZ
    public boolean needFocus() {
        C253009wO c253009wO;
        String str;
        C27021Aj3 c27021Aj3 = this.item;
        if (c27021Aj3 != null) {
            if (!c27021Aj3.LJFF) {
                return false;
            }
            if (c27021Aj3 != null && (c253009wO = c27021Aj3.LIZJ) != null && (str = c253009wO.LIZ) != null && str.length() > 0) {
                return true;
            }
        }
        if (String.valueOf(getFocusView().getText()).length() != 0) {
            return false;
        }
        return true;
    }

    public final void onDestroy() {
        CandHelper candHelper = this.candHelper;
        PopupWindow popupWindow = candHelper.LIZJ;
        if (popupWindow != null) {
            popupWindow.dismiss();
            candHelper.LJIIJJI.removeMessages(1);
        } else {
            o.LJIJI("mPopupWindow");
            throw null;
        }
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final C27021Aj3 getItem() {
        return this.item;
    }

    private final void autoFillLogNode(String str) {
        if (str == null || str.length() == 0 || !this.viewModel.yw0() || !this.firstFillAndCheck) {
            return;
        }
        this.firstFillAndCheck = false;
        C27021Aj3 c27021Aj3 = this.item;
        if (c27021Aj3 == null) {
            return;
        }
        C78565UsT.LJJIJIIJIL(this.fragment, new C27252Amm(this, c27021Aj3, null));
    }

    private final void setStartNonSpaceInputFilter(C27021Aj3 c27021Aj3) {
        ClientConfig clientConfig;
        String str;
        List LJLJJL;
        InputItemData inputItemData = this.viewModel.LJZI;
        if (inputItemData == null || (clientConfig = inputItemData.config) == null || (str = clientConfig.spaceTrimKeys) == null || str.length() == 0 || (LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6)) == null) {
            return;
        }
        Iterator it = LJLJJL.iterator();
        while (it.hasNext()) {
            if (o.LJ(c27021Aj3.LIZ.key, it.next())) {
                ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).getEditText().setFilters(new C27038AjK[]{new C27038AjK()});
            }
        }
    }

    public final void onBind(C27021Aj3 item) {
        String str;
        String str2;
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams;
        o.LJIIIZ(item, "item");
        this.item = item;
        this.recommend = item.LIZLLL;
        if (o.LJ(item.LIZ.key, "address")) {
            AddressEditViewModel addressEditViewModel = this.viewModel;
            C71731SDf c71731SDf = (C71731SDf) this.targetView.LIZIZ(R.id.eod);
            o.LJIIIIZZ(c71731SDf, "targetView.inputWithIndicator");
            addressEditViewModel.getClass();
            JediViewModel.wv0(addressEditViewModel, new TBT() { // from class: X.AnK
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AddressEditState) obj).getInitData();
                }
            }, null, new AqS135S0200000_4(c71731SDf, addressEditViewModel, 247), 2, null);
        }
        String str3 = null;
        if (C78685UuP.LJJJZ(item.LIZ.key)) {
            String str4 = item.LIZ.key;
            ClientConfig clientConfig = this.viewModel.LLIIJI;
            if (clientConfig != null) {
                str2 = clientConfig.wakeUpKeyBoardKeys;
            } else {
                str2 = null;
            }
            if (o.LJ(str4, str2) && !this.hasFirstFocus && ((addressEditEnterParams = this.viewModel.LJZ) == null || addressEditEnterParams.address == null)) {
                this.targetView.post(new ARunnableS40S0100000_4(this, 27));
                this.hasFirstFocus = true;
            }
        }
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).getEditText().removeTextChangedListener(textWatcher);
        }
        if (!o.LJ(item.LIZ.key, this.candHelper.LJII)) {
            this.candHelper.LIZJ(this.viewModel, item.LIZ.key);
        }
        ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setIndicatorClickListener(new ACListenerS39S0200000_4(this, item, 15));
        Object obj = item.LIZIZ;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        setText(str);
        autoFillLogNode(str);
        Integer num = item.LIZ.type;
        if (num != null) {
            if (num.intValue() == 0) {
                ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).getEditText().setTag(0);
                ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setInputType(1);
                if (o.LJ(item.LIZ.key, "zipcode") && this.viewModel.cw0("us")) {
                    ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setInputType(2);
                }
            } else if (num.intValue() == 5) {
                ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).getEditText().setTag(5);
                ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setInputType(1);
            }
        }
        C252989wM c252989wM = this.targetView;
        c252989wM.setTitle(item.LIZ.title);
        ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).setHint(item.LIZ.hint);
        Integer num2 = item.LIZ.maxLines;
        if (num2 == null || num2.intValue() < 0) {
            num2 = 1;
        }
        ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).setMaxLines(num2.intValue());
        if (num2.intValue() > 1) {
            ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).setInputType(((C71731SDf) c252989wM.LIZIZ(R.id.eod)).getInputType() | 131072);
        } else {
            Integer num3 = item.LJII;
            if (num3 != null) {
                ((TextView) this.targetView.LIZIZ(R.id.eof)).setImeOptions(num3.intValue());
            }
        }
        if (getDynamicStyle().getShowErrorWhenClickSaveButton() || this.viewModel.lv0().isAllKeyItemFilled()) {
            C253009wO c253009wO = item.LIZJ;
            if (c253009wO != null) {
                c252989wM.LJ(c253009wO);
            } else {
                c252989wM.LIZJ();
            }
        } else {
            C253009wO c253009wO2 = item.LIZJ;
            if (c253009wO2 != null) {
                str3 = c253009wO2.LIZ;
            }
            if (C78685UuP.LJJJZ(str3)) {
                C27272An6.LIZ(this.targetView.LIZIZ(R.id.eof));
                C27272An6.LIZ(this.targetView.LIZIZ(R.id.title));
            }
            C253009wO c253009wO3 = item.LIZJ;
            if (c253009wO3 != null) {
                if (c253009wO3.LIZJ) {
                    c252989wM.LJ(c253009wO3);
                }
            } else {
                c252989wM.LIZJ();
            }
        }
        View LIZIZ = this.targetView.LIZIZ(R.id.bt5);
        o.LJIIIIZZ(LIZIZ, "targetView.contentView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(c252989wM, this, 1), LIZIZ);
        String str5 = this.candHelper.LJIIIIZZ;
        if (o.LJ(str5, "sug") || o.LJ(str5, "auto")) {
            this.textSizeBefore = ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).getEditText().getText().length();
            if (o.LJ(item.LIZ.key, "address")) {
                ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).getEditText().setSelection(((C71731SDf) c252989wM.LIZIZ(R.id.eod)).getEditText().getText().length());
            }
        }
        setStartNonSpaceInputFilter(item);
        Integer num4 = item.LIZ.maxLength;
        if (num4 != null) {
            ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).setMaxLength(num4.intValue());
        }
        this.textWatcher = new C27254Amo(this, item);
        ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).getEditText().addTextChangedListener(this.textWatcher);
        ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).setOnEditTextFocusChangeListener(new ViewOnFocusChangeListenerC27249Amj(this, c252989wM, item));
        if (C27196Als.LIZ() && (o.LJ(item.LIZ.key, "address") || o.LJ(item.LIZ.key, "address_detail") || o.LJ(item.LIZ.key, "unit_floor"))) {
            setOptEnableUneditableStyle();
        } else {
            setEditableStyle(item.LJFF);
        }
    }

    public void setEditableStyle(boolean z) {
        if (z) {
            return;
        }
        if (getDynamicStyle().getTitleGrayedInUneditable()) {
            TextView textView = (TextView) this.targetView.LIZIZ(R.id.title);
            Context context = this.targetView.getContext();
            o.LJIIIIZZ(context, "targetView.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        }
        this.targetView.setOnClickListener(new ViewOnClickListenerC13880ga(null));
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 17, 42), this.targetView);
        View LIZIZ = this.targetView.LIZIZ(R.id.bt5);
        o.LJIIIIZZ(LIZIZ, "targetView.contentView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 18, 42), LIZIZ);
        this.targetView.LIZIZ(R.id.eof).setFocusable(false);
        ((TextView) this.targetView.LIZIZ(R.id.eof)).setCursorVisible(false);
        this.targetView.LIZIZ(R.id.eof).setFocusableInTouchMode(false);
        TextView textView2 = (TextView) this.targetView.LIZIZ(R.id.eof);
        Context context2 = this.targetView.getContext();
        o.LJIIIIZZ(context2, "targetView.context");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
        View findViewById = this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.eof);
        o.LJIIIIZZ(findViewById, "targetView.contentView.inputWithIndicatorEditText");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 19, 42), findViewById);
    }

    public final void setItem(C27021Aj3 c27021Aj3) {
        this.item = c27021Aj3;
    }

    public final void setText(String str) {
        if (str != null) {
            ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setText(str);
        } else {
            ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setText("");
        }
    }

    public final int sumHeight(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewParent parent = this.targetView.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        for (int i3 = i; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null) {
                int height = childAt.getHeight() + i2;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (i3 > i) {
                        height += marginLayoutParams.topMargin;
                    }
                    height += marginLayoutParams.bottomMargin;
                }
                i2 = height;
                if (height >= viewGroup.getHeight()) {
                    break;
                }
            }
        }
        return i2;
    }

    public final void setEmailHintVisibleIfIsInputEmail(C27021Aj3 c27021Aj3, boolean z) {
        Integer num = c27021Aj3.LIZ.type;
        if (num == null || num.intValue() != 5) {
            return;
        }
        AddressEditViewModel addressEditViewModel = this.viewModel;
        addressEditViewModel.getClass();
        addressEditViewModel.setState(new AqS9S0010000_4(z, 58));
    }

    public TextInputHelper(C252989wM targetView, AddressEditFragment fragment, AddressEditViewModel viewModel) {
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(viewModel, "viewModel");
        this.targetView = targetView;
        this.fragment = fragment;
        this.viewModel = viewModel;
        Context context = targetView.getContext();
        o.LJIIIIZZ(context, "targetView.context");
        this.candHelper = new CandHelper(context, ((C71731SDf) targetView.LIZIZ(R.id.eod)).getEditText());
        this.startFocus = -1L;
        this.recommend = true;
        this.firstFillAndCheck = true;
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 125));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    public final void showDifferentVerifyResult(C252989wM c252989wM, C27021Aj3 c27021Aj3, C253009wO c253009wO) {
        String str;
        String str2;
        ClientConfig clientConfig;
        String str3;
        String str4;
        ClientConfig clientConfig2;
        String str5 = c27021Aj3.LIZ.key;
        if (str5 != null) {
            switch (str5.hashCode()) {
                case -1147692044:
                    if (str5.equals("address")) {
                        if (this.viewModel.dw0()) {
                            C253009wO ew0 = this.viewModel.ew0();
                            AddressEditViewModel addressEditViewModel = this.viewModel;
                            addressEditViewModel.getClass();
                            addressEditViewModel.setState(new AqS170S0100000_4(ew0, 1327));
                        }
                        c252989wM.LJ(c253009wO);
                        return;
                    }
                    break;
                case -160985414:
                    if (str5.equals("first_name")) {
                        if (c253009wO != null) {
                            str3 = c253009wO.LIZ;
                        } else {
                            str3 = null;
                        }
                        if (C78685UuP.LJJJZ(str3)) {
                            c252989wM.LJ(c253009wO);
                            return;
                        }
                        InputItemData inputItemData = this.viewModel.LJZI;
                        if (inputItemData != null && (clientConfig2 = inputItemData.config) != null) {
                            str4 = clientConfig2.concatenateNameRule;
                        } else {
                            str4 = null;
                        }
                        if (!C78685UuP.LJJJZ(str4)) {
                            return;
                        }
                        C253009wO Jv0 = this.viewModel.Jv0();
                        if (Jv0 != null) {
                            c252989wM.LJ(Jv0);
                            return;
                        } else {
                            this.viewModel.tw0(null, "first_name");
                            this.viewModel.tw0(null, "last_name");
                            return;
                        }
                    }
                    break;
                case 120381180:
                    if (str5.equals("address_detail")) {
                        if (c253009wO != null) {
                            c252989wM.LJ(c253009wO);
                            return;
                        }
                        if (!this.viewModel.dw0()) {
                            return;
                        }
                        C253009wO ew02 = this.viewModel.ew0();
                        if (ew02 != null) {
                            c252989wM.LJ(ew02);
                            return;
                        } else {
                            c252989wM.LIZJ();
                            return;
                        }
                    }
                    break;
                case 2013122196:
                    if (str5.equals("last_name")) {
                        if (c253009wO != null) {
                            str = c253009wO.LIZ;
                        } else {
                            str = null;
                        }
                        if (C78685UuP.LJJJZ(str)) {
                            c252989wM.LJ(c253009wO);
                            return;
                        }
                        InputItemData inputItemData2 = this.viewModel.LJZI;
                        if (inputItemData2 != null && (clientConfig = inputItemData2.config) != null) {
                            str2 = clientConfig.concatenateNameRule;
                        } else {
                            str2 = null;
                        }
                        if (!C78685UuP.LJJJZ(str2)) {
                            return;
                        }
                        C253009wO Jv02 = this.viewModel.Jv0();
                        if (Jv02 != null) {
                            this.viewModel.tw0(Jv02, "first_name");
                            this.viewModel.tw0(Jv02, "last_name");
                            return;
                        } else {
                            this.viewModel.tw0(null, "first_name");
                            this.viewModel.tw0(null, "last_name");
                            return;
                        }
                    }
                    break;
            }
        }
        c252989wM.LJ(c253009wO);
    }
}
