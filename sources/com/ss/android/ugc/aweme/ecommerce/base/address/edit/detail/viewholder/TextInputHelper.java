package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C221108m2;
import X.C252989wM;
import X.C253009wO;
import X.C26706Ady;
import X.C27021Aj3;
import X.C27034AjG;
import X.C27037AjJ;
import X.C27038AjK;
import X.C5H3;
import X.C71731SDf;
import X.C78685UuP;
import X.InterfaceC27239AmZ;
import X.T5T;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnFocusChangeListenerC27035AjH;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.ITextInputHelperStyle;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;
import wg5.c;

/* loaded from: classes5.dex */
public final class TextInputHelper implements c, InterfaceC27239AmZ {
    public static final C27037AjJ Companion = new C27037AjJ();
    public final AddressEditDetailActivity activity;
    public final C5H3 dynamicStyle$delegate;
    public boolean hasFirstFocus;
    public C27021Aj3 item;
    public Boolean lastDeleteButtonVisibleStatus;
    public boolean recommend;
    public long startFocus;
    public final C252989wM targetView;
    public int textSizeBefore;
    public TextWatcher textWatcher;
    public boolean userInput;
    public final AddressEditDetailViewModel viewModel;

    public final void onDestroy() {
    }

    private final ITextInputHelperStyle getDynamicStyle() {
        return (ITextInputHelperStyle) this.dynamicStyle$delegate.getValue();
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

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final C27021Aj3 getItem() {
        return this.item;
    }

    private final void setStartNonSpaceInputFilter(C27021Aj3 c27021Aj3) {
        ClientConfig clientConfig;
        String str;
        List LJLJJL;
        InputItemData inputItemData = this.viewModel.LJLLILLLL;
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
        AddressPageStarter.AddressEditDetailEnterParams addressEditDetailEnterParams;
        o.LJIIIZ(item, "item");
        this.item = item;
        this.recommend = item.LIZLLL;
        if (o.LJ(item.LIZ.key, "address")) {
            AddressEditDetailViewModel addressEditDetailViewModel = this.viewModel;
            C71731SDf c71731SDf = (C71731SDf) this.targetView.LIZIZ(R.id.eod);
            o.LJIIIIZZ(c71731SDf, "targetView.inputWithIndicator");
            addressEditDetailViewModel.getClass();
            JediViewModel.wv0(addressEditDetailViewModel, new TBT() { // from class: X.Aj2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((AddressEditDetailState) obj).getInitData();
                }
            }, null, new AqS135S0200000_4(c71731SDf, addressEditDetailViewModel, 272), 2, null);
        }
        String str2 = null;
        if (C78685UuP.LJJJZ(item.LIZ.key)) {
            String str3 = item.LIZ.key;
            ClientConfig clientConfig = this.viewModel.LJLZ;
            if (clientConfig != null) {
                str = clientConfig.wakeUpKeyBoardKeys;
            } else {
                str = null;
            }
            if (o.LJ(str3, str) && !this.hasFirstFocus && ((addressEditDetailEnterParams = this.viewModel.LJLL) == null || addressEditDetailEnterParams.address == null)) {
                this.targetView.post(new ARunnableS40S0100000_4(this, 26));
                this.hasFirstFocus = true;
            }
        }
        TextWatcher textWatcher = this.textWatcher;
        if (textWatcher != null) {
            ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).getEditText().removeTextChangedListener(textWatcher);
        }
        ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setIndicatorClickListener(new ACListenerS39S0200000_4(this, item, 14));
        ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setOnIndicatorVisibleChangeListener(new AqS135S0200000_4(this, item, 11));
        Object obj = item.LIZIZ;
        if (obj instanceof String) {
            str2 = (String) obj;
        }
        setText(str2);
        Integer num = item.LIZ.type;
        if (num != null) {
            if (num.intValue() == 0) {
                ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).getEditText().setTag(0);
                ((C71731SDf) this.targetView.LIZIZ(R.id.eod)).setInputType(1);
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
        if (getDynamicStyle().getShowErrorWhenClickSaveButton() || this.viewModel.lv0().isAllRequiredItemFilled()) {
            C253009wO c253009wO = item.LIZJ;
            if (c253009wO != null) {
                c252989wM.LJ(c253009wO);
            } else {
                c252989wM.LIZJ();
            }
        } else {
            C253009wO c253009wO2 = item.LIZJ;
            if (c253009wO2 != null) {
                if (c253009wO2.LIZJ) {
                    c252989wM.LJ(c253009wO2);
                }
            } else {
                c252989wM.LIZJ();
            }
        }
        View LIZIZ = this.targetView.LIZIZ(R.id.bt5);
        o.LJIIIIZZ(LIZIZ, "targetView.contentView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(c252989wM, this, 0), LIZIZ);
        setStartNonSpaceInputFilter(item);
        Integer num4 = item.LIZ.maxLength;
        if (num4 != null) {
            ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).setMaxLength(num4.intValue());
        }
        this.textWatcher = new C27034AjG(this, item);
        ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).getEditText().addTextChangedListener(this.textWatcher);
        ((C71731SDf) c252989wM.LIZIZ(R.id.eod)).setOnEditTextFocusChangeListener(new ViewOnFocusChangeListenerC27035AjH(this, c252989wM, item));
        setEditableStyle(item.LJFF);
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
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 7, 42), this.targetView);
        View LIZIZ = this.targetView.LIZIZ(R.id.bt5);
        o.LJIIIIZZ(LIZIZ, "targetView.contentView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 8, 42), LIZIZ);
        this.targetView.LIZIZ(R.id.eof).setFocusable(false);
        ((TextView) this.targetView.LIZIZ(R.id.eof)).setCursorVisible(false);
        this.targetView.LIZIZ(R.id.eof).setFocusableInTouchMode(false);
        TextView textView2 = (TextView) this.targetView.LIZIZ(R.id.eof);
        Context context2 = this.targetView.getContext();
        o.LJIIIIZZ(context2, "targetView.context");
        textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context2));
        View findViewById = this.targetView.LIZIZ(R.id.bt5).findViewById(R.id.eof);
        o.LJIIIIZZ(findViewById, "targetView.contentView.inputWithIndicatorEditText");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 9, 42), findViewById);
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

    public TextInputHelper(C252989wM targetView, AddressEditDetailActivity activity, AddressEditDetailViewModel viewModel) {
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(viewModel, "viewModel");
        this.targetView = targetView;
        this.activity = activity;
        this.viewModel = viewModel;
        this.startFocus = -1L;
        this.recommend = true;
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 121));
    }

    public final void showDifferentVerifyResult(C252989wM c252989wM, C27021Aj3 c27021Aj3, C253009wO c253009wO) {
        String str = c27021Aj3.LIZ.key;
        if (o.LJ(str, "address")) {
            c252989wM.LJ(c253009wO);
        } else {
            if (o.LJ(str, "address_detail")) {
                if (c253009wO == null) {
                    return;
                }
                c252989wM.LJ(c253009wO);
                return;
            }
            c252989wM.LJ(c253009wO);
        }
    }
}
