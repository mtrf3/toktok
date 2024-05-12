package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.C105134Ar;
import X.C105454Bx;
import X.C111024Xi;
import X.C34B;
import X.C3Y4;
import X.C4BS;
import X.C4BT;
import X.C4YG;
import X.C76800UCe;
import X.C87687YbD;
import X.C98063t4;
import X.InterfaceC65784Pro;
import X.X1D;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoryQuickDMInputView extends BaseInputView {
    public boolean LJLLLLLL;
    public DetailFeedQuickDMFragmentV2 LJLZ;
    public InterfaceC65784Pro<C76800UCe> LJZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final C4BS LIZLLL(C4BS c4bs) {
        return c4bs;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIJ() {
        C98063t4.LIZJ("enter_from", null, null, 14);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void LLLZLZ(C105454Bx baseEmoji) {
        o.LJIIIZ(baseEmoji, "baseEmoji");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105134Ar.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105134Ar.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public /* bridge */ /* synthetic */ void onStop() {
        C105134Ar.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void LJIIIIZZ() {
        C98063t4.LIZIZ("enter_from");
    }

    @Override // X.InterfaceC105124Aq
    public final void vb() {
        Editable text;
        C3Y4.LJ("enter_from", "enter_from");
        C4YG c4yg = this.LJLILLLLZI;
        if (c4yg != null && (text = c4yg.getText()) != null) {
            text.toString();
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        n9();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC105124Aq
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        boolean z;
        String valueOf = String.valueOf(editable);
        Context context = getContext();
        String str = null;
        if (context != null) {
            str = context.getString(R.string.amt);
        }
        int length = valueOf.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (o.LJIIJJI(valueOf.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        if (TextUtils.isEmpty(valueOf.subSequence(i2, length + 1).toString())) {
            View view = this.LJLJJI;
            if ((view instanceof TuxTextView) && view != null) {
                view.setVisibility(8);
            }
            C4YG c4yg = this.LJLILLLLZI;
            if (c4yg != null) {
                c4yg.setMaxLines(1);
            }
            C4YG c4yg2 = this.LJLILLLLZI;
            if (c4yg2 != null) {
                c4yg2.setHint(str);
            }
            this.LJLLLLLL = true;
            return;
        }
        View view2 = this.LJLJJI;
        if ((view2 instanceof TuxTextView) && view2 != null) {
            view2.setVisibility(0);
        }
        if (!this.LJLLLLLL) {
            return;
        }
        C4YG c4yg3 = this.LJLILLLLZI;
        if (c4yg3 != null) {
            c4yg3.setMaxLines(5);
        }
        C4YG c4yg4 = this.LJLILLLLZI;
        if (c4yg4 != null) {
            c4yg4.setHint("");
        }
        this.LJLLLLLL = false;
    }

    public StoryQuickDMInputView(C111024Xi c111024Xi, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        Resources resources;
        Configuration configuration;
        C4YG c4yg;
        this.LJLLLLLL = true;
        this.LJLILLLLZI = (C4YG) c111024Xi.findViewById(R.id.gnm);
        this.LJLJJLL = c111024Xi.findViewById(R.id.cow);
        this.LJLJJI = c111024Xi.findViewById(R.id.jo1);
        this.LJLJL = (C4BT) c111024Xi.findViewById(R.id.hho);
        super.LJII(c111024Xi);
        super.LJI();
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2 && (c4yg = this.LJLILLLLZI) != null) {
            c4yg.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.4BR
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 6) {
                        return false;
                    }
                    Object LLILL = C16880lQ.LLILL(textView.getContext(), "input_method");
                    o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) LLILL;
                    if (inputMethodManager.isActive()) {
                        inputMethodManager.hideSoftInputFromWindow(textView.getApplicationWindowToken(), 0);
                        return true;
                    }
                    return true;
                }
            });
        }
        LJIILLIIL(-2);
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setSelected(false);
        }
        C4YG c4yg2 = this.LJLILLLLZI;
        if (c4yg2 != null) {
            c4yg2.requestFocus();
        }
        LJIJ(false);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, X.InterfaceC1032943p
    public final void LJIIL(View view, int i, int i2, boolean z) {
        super.LJIIL(view, i, i2, z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPanelChange is called: panel type is ");
        LIZ.append(i2);
        C34B.LJI("DetailFeedInputView", X1D.LIZIZ(LIZ));
        DetailFeedQuickDMFragmentV2 detailFeedQuickDMFragmentV2 = this.LJLZ;
        if ((detailFeedQuickDMFragmentV2 instanceof DetailFeedQuickDMFragmentV2) && detailFeedQuickDMFragmentV2 != null && i2 == -1 && !detailFeedQuickDMFragmentV2.LJLLLL) {
            detailFeedQuickDMFragmentV2.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87687YbD.LIZ.getClass();
        C87687YbD.LIZ();
    }
}
