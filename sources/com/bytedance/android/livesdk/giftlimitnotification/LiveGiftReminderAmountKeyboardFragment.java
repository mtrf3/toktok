package com.bytedance.android.livesdk.giftlimitnotification;

import X.ActivityC45651qj;
import X.BE7;
import X.BE9;
import X.BEA;
import X.BEC;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C19K;
import X.C29306Beo;
import X.C29S;
import X.C2A7;
import X.C30868C9o;
import X.C3C5;
import X.C41081jM;
import X.C76800UCe;
import X.C78983UzD;
import X.C90903hW;
import X.X1D;
import X.YBY;
import Y.ACListenerS25S0100000_5;
import Y.IDCSpanS31S0100000_5;
import Y.IDObjectS178S0100000_5;
import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLimitNotificationSettingV2;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class LiveGiftReminderAmountKeyboardFragment extends BaseFragment implements BE7 {
    public boolean LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.BE7
    public final void onFailure() {
        BEA.LIZ.getClass();
        C30868C9o.LJI(BEA.LJJIFFI);
    }

    @Override // X.BE7
    public final void onSuccess() {
        BEA.LIZ.getClass();
        C30868C9o.LJI(BEA.LJJI);
        _$_findCachedViewById(R.id.fe5).performClick();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final void wl(String str) {
        int i;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.fdz);
        if (str.length() == 0) {
            i = 5;
        } else {
            i = 3;
        }
        _$_findCachedViewById.setTextDirection(i);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer LIZ;
        String num;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LayoutTransition layoutTransition = ((ViewGroup) _$_findCachedViewById(R.id.fg8)).getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(4);
        }
        BEA.LIZ.getClass();
        if (BEA.LJIILL) {
            C29306Beo.LJI(_$_findCachedViewById(R.id.fdy));
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.f0o));
        } else {
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.fdy));
            C29306Beo.LJI(_$_findCachedViewById(R.id.f0o));
            ((TextView) _$_findCachedViewById(R.id.fdy)).setText(BEA.LJIIZILJ);
        }
        C19K c19k = (C19K) _$_findCachedViewById(R.id.fdz);
        c19k.setShowSoftInputOnFocus(false);
        c19k.requestFocus();
        ((YBY) _$_findCachedViewById(R.id.fe3)).setInputConnection(c19k.onCreateInputConnection(new EditorInfo()));
        SpannableString spannableString = new SpannableString(getString(R.string.kps));
        spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
        c19k.setHint(new SpannableString(spannableString));
        Integer value = BEA.LJJ.getValue();
        int i = -1;
        if (value == null || value.intValue() != -1) {
            if (BEA.LJIILL) {
                LIZ = Integer.valueOf(BEA.LJIL);
            } else {
                LIZ = BEA.LIZ();
            }
            if (LIZ != null && (num = LIZ.toString()) != null) {
                String LIZ2 = BEC.LIZ(num);
                c19k.setText(LIZ2);
                wl(LIZ2);
                ((EditText) _$_findCachedViewById(R.id.fdz)).setSelection(LIZ2.length());
                C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.fe0));
            }
        } else {
            c19k.setText("");
            _$_findCachedViewById(R.id.ayd).setEnabled(false);
            C29306Beo.LJI(_$_findCachedViewById(R.id.fe0));
        }
        String str2 = BEA.LJJIII;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nv9);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_recommend_tap)");
        if (BEA.LJII()) {
            this.LJLIL = false;
            View _$_findCachedViewById = _$_findCachedViewById(R.id.fec);
            if (_$_findCachedViewById != null) {
                C29306Beo.LJI(_$_findCachedViewById);
            }
        } else if (BEA.LJIJI > BEA.LJIJJ) {
            vl(str2, LJIILJJIL);
        } else {
            LiveGiftLimitNotificationSettingV2 liveGiftLimitNotificationSettingV2 = LiveGiftLimitNotificationSettingV2.INSTANCE;
            if (liveGiftLimitNotificationSettingV2.getValue() == 1) {
                vl(str2, LJIILJJIL);
            } else if (liveGiftLimitNotificationSettingV2.getValue() == 2) {
                this.LJLIL = false;
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.fec);
                if (_$_findCachedViewById2 != null) {
                    C29306Beo.LJI(_$_findCachedViewById2);
                }
            } else {
                C78983UzD.LJIILL("LiveGiftReminderAmountKeyboardFragment: initSuggestMoney,impossible to be here, something wrong");
            }
        }
        boolean z = this.LJLIL;
        boolean LJ = BEA.LJ();
        String str3 = BEA.LJJIIZI;
        String str4 = BEA.LJJIJ;
        if (BEA.LJIJI > BEA.LJIJJ) {
            str = "highest";
        } else {
            str = "suggest";
        }
        if (str.length() == 0) {
            str = "-1";
        }
        if (!BEA.LJII()) {
            i = BEA.LIZIZ();
        }
        BE9.LIZIZ(LJ ? 1 : 0, z ? 1 : 0, i, 2, str3, str4, str, BEA.LJIILIIL, BEA.LJIILL);
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.fe5), new ACListenerS25S0100000_5(this, 316));
        ((TextView) _$_findCachedViewById(R.id.fdz)).addTextChangedListener(new IDObjectS178S0100000_5(this, 9));
        C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.fe0), new ACListenerS25S0100000_5(this, 317));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.ayd), new ACListenerS25S0100000_5(this, 318));
    }

    public final void vl(String backendSuggestMoney, String str) {
        TextPaint textPaint;
        String LJJJJZ;
        int i;
        int LIZ;
        int i2;
        int i3;
        String str2;
        DisplayMetrics displayMetrics;
        TextView textView = (TextView) _$_findCachedViewById(R.id.fec);
        if (textView != null) {
            textPaint = textView.getPaint();
        } else {
            textPaint = null;
        }
        o.LJIIIZ(backendSuggestMoney, "backendSuggestMoney");
        BEA.LIZ.getClass();
        String valueOf = String.valueOf(BEA.LIZIZ());
        if (BEA.LJIILL) {
            LJJJJZ = ujb.o.LJJJJZ(backendSuggestMoney, "{amount}", valueOf, false);
        } else {
            LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(backendSuggestMoney, "{currency}", BEA.LJIIZILJ, false), "{amount}", valueOf, false);
        }
        Resources system = Resources.getSystem();
        if (system != null && (displayMetrics = system.getDisplayMetrics()) != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 1080;
        }
        if (i - C15380j0.LIZ(32.0f) == 0) {
            LIZ = 874;
        } else {
            LIZ = i - C15380j0.LIZ(32.0f);
        }
        if (textPaint != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJJJJZ);
            LIZ2.append("  ");
            i2 = ((int) textPaint.measureText(X1D.LIZIZ(LIZ2))) / LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LJJJJZ);
            LIZ3.append("  ");
            LIZ3.append(str);
            i3 = ((int) textPaint.measureText(X1D.LIZIZ(LIZ3))) / LIZ;
        } else {
            i2 = 0;
            i3 = 0;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LJJJJZ);
        if (i3 > i2) {
            LIZ4.append("  \n");
        } else {
            LIZ4.append("  ");
        }
        LIZ4.append(str);
        String suggestedMoney = X1D.LIZIZ(LIZ4);
        LiveEditText liveEditText = (LiveEditText) _$_findCachedViewById(R.id.fdz);
        o.LJIIIZ(suggestedMoney, "suggestedMoney");
        int LIZIZ = BEA.LIZIZ();
        String LIZ5 = BEC.LIZ(String.valueOf(LIZIZ));
        String LJJJJZ2 = ujb.o.LJJJJZ(suggestedMoney, String.valueOf(LIZIZ), LIZ5, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LJJJJZ2);
        IDCSpanS31S0100000_5 iDCSpanS31S0100000_5 = new IDCSpanS31S0100000_5(liveEditText, 8);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C15380j0.LIZIZ(R.color.c7));
        StyleSpan styleSpan = new StyleSpan(1);
        int length = LJJJJZ2.length() - str.length();
        int length2 = LJJJJZ2.length();
        if (s.LJJJLZIJ(LJJJJZ2, str, false)) {
            spannableStringBuilder.setSpan(iDCSpanS31S0100000_5, length, length2, 17);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, length2, 17);
            spannableStringBuilder.setSpan(styleSpan, length, length2, 17);
        }
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C15380j0.LIZIZ(R.color.ck));
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(C15380j0.LIZIZ(R.color.ck));
        if (BEA.LJIILL) {
            str2 = C15380j0.LJIILJJIL(R.string.kmx);
            o.LJIIIIZZ(str2, "getString(R.string.pm_coin)");
        } else {
            str2 = BEA.LJIIZILJ;
        }
        if (s.LJJJLZIJ(LJJJJZ2, str2, false)) {
            spannableStringBuilder.setSpan(foregroundColorSpan2, s.LJJLIIIJL(LJJJJZ2, str2, 0, false, 6), str2.length() + s.LJJLIIIJL(LJJJJZ2, str2, 0, false, 6), 17);
        }
        if (s.LJJJLZIJ(LJJJJZ2, LIZ5, false)) {
            spannableStringBuilder.setSpan(foregroundColorSpan3, s.LJJLIIJ(LJJJJZ2, LIZ5, 6), LIZ5.length() + s.LJJLIIJ(LJJJJZ2, LIZ5, 6), 17);
        }
        this.LJLIL = true;
        ((TextView) _$_findCachedViewById(R.id.fec)).setText(spannableStringBuilder);
        ((TextView) _$_findCachedViewById(R.id.fec)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) _$_findCachedViewById(R.id.fec)).setHighlightColor(0);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.fec);
        if (_$_findCachedViewById != null) {
            C29306Beo.LJJLJLI(_$_findCachedViewById);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d64, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
