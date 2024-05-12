package com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import X.AnonymousClass899;
import X.C2312395r;
import X.C235139Kr;
import X.C44384HbQ;
import X.C61878OQg;
import X.C8FC;
import X.C8FU;
import X.C92R;
import Y.AUListenerS35S0201000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileEditPronounsSearchAndDisplayViewModel extends AssemViewModel<C92R> {
    public Boolean LJLJJLL;
    public int LJLL;
    public final SpannableStringBuilder LJLIL = new SpannableStringBuilder();
    public final List<String> LJLILLLLZI = new ArrayList();
    public final Map<C235139Kr, List<String>> LJLJI = new LinkedHashMap();
    public List<String> LJLJJI = C61878OQg.INSTANCE;
    public int LJLJJL = 4;
    public final int LJLJL = Integer.MAX_VALUE;
    public boolean LJLJLJ = true;
    public final Map<Integer, Integer> LJLJLLL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92R defaultState() {
        return new C92R(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((LinkedHashMap) this.LJLJI).clear();
        super.onCleared();
    }

    public static void jv0(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int i2 = layoutParams2.topMargin;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        ofInt.setDuration(100L);
        ofInt.addUpdateListener(new AUListenerS35S0201000_1(layoutParams2, i2, view, 0));
        ofInt.start();
    }

    public final void gv0(View view, boolean z) {
        if (o.LJ(this.LJLJJLL, Boolean.TRUE)) {
            return;
        }
        if (z) {
            if (this.LJLJLJ) {
                return;
            }
            this.LJLJLJ = true;
            jv0(view.getHeight(), view);
            return;
        }
        if (!this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = false;
        jv0(-view.getHeight(), view);
    }

    public final boolean hv0(EditText editText, int i) {
        if (editText.getText().length() > i) {
            Editable editable = editText.getText();
            int selectionEnd = Selection.getSelectionEnd(editable);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) this.LJLIL);
            o.LJIIIIZZ(editable, "editable");
            append.append((CharSequence) editable.subSequence(this.LJLIL.length(), i).toString());
            editText.setText(spannableStringBuilder);
            Editable text = editText.getText();
            if (selectionEnd > text.length()) {
                selectionEnd = text.length();
            }
            Selection.setSelection(text, selectionEnd);
            return true;
        }
        return false;
    }

    public final void iv0(Context context, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.LJLIL.append((CharSequence) "*");
            ((ArrayList) this.LJLILLLLZI).add(ListProtector.get(list, i));
            String desc = (String) ListProtector.get(list, i);
            C2312395r c2312395r = new C2312395r(context);
            o.LJIIIZ(desc, "desc");
            LinkedHashMap linkedHashMap = (LinkedHashMap) c2312395r.LJLIL;
            View view = (View) linkedHashMap.get(Integer.valueOf(R.id.iec));
            if (view == null) {
                view = c2312395r.findViewById(R.id.iec);
                if (view != null) {
                    linkedHashMap.put(Integer.valueOf(R.id.iec), view);
                } else {
                    view = null;
                }
            }
            ((TextView) view).setText(desc);
            C8FC c8fc = new C8FC(c2312395r);
            c8fc.LJLILLLLZI = (int) C44384HbQ.LJJJLL(8);
            final int i2 = this.LJLL;
            this.LJLL = i2 + 1;
            this.LJLJLLL.put(Integer.valueOf(i2), Integer.valueOf(this.LJLIL.length() - 1));
            AnonymousClass899 anonymousClass899 = new AnonymousClass899() { // from class: X.97t
                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    int i3;
                    o.LJIIIZ(widget, "widget");
                    Integer num = (Integer) ((LinkedHashMap) ProfileEditPronounsSearchAndDisplayViewModel.this.LJLJLLL).get(Integer.valueOf(i2));
                    if (num != null) {
                        num.intValue();
                        Iterator it = ((LinkedHashMap) ProfileEditPronounsSearchAndDisplayViewModel.this.LJLJLLL).keySet().iterator();
                        while (true) {
                            int i4 = -1;
                            if (it.hasNext()) {
                                int intValue = ((Number) it.next()).intValue();
                                Integer num2 = (Integer) ((LinkedHashMap) ProfileEditPronounsSearchAndDisplayViewModel.this.LJLJLLL).get(Integer.valueOf(intValue));
                                if (num2 != null) {
                                    i3 = num2.intValue();
                                } else {
                                    i3 = -1;
                                }
                                if (i3 > num.intValue()) {
                                    java.util.Map<Integer, Integer> map = ProfileEditPronounsSearchAndDisplayViewModel.this.LJLJLLL;
                                    Integer valueOf = Integer.valueOf(intValue);
                                    Integer num3 = (Integer) ((LinkedHashMap) ProfileEditPronounsSearchAndDisplayViewModel.this.LJLJLLL).get(Integer.valueOf(intValue));
                                    if (num3 != null) {
                                        i4 = num3.intValue();
                                    }
                                    map.put(valueOf, Integer.valueOf(i4 - 1));
                                }
                            } else {
                                ProfileEditPronounsSearchAndDisplayViewModel.this.LJLIL.delete(num.intValue(), num.intValue() + 1);
                                ListProtector.remove(ProfileEditPronounsSearchAndDisplayViewModel.this.LJLILLLLZI, num.intValue());
                                ProfileEditPronounsSearchAndDisplayViewModel.this.LJLJLLL.put(Integer.valueOf(i2), -1);
                                ProfileEditPronounsSearchAndDisplayViewModel profileEditPronounsSearchAndDisplayViewModel = ProfileEditPronounsSearchAndDisplayViewModel.this;
                                profileEditPronounsSearchAndDisplayViewModel.withState(new AqS170S0100000_4(profileEditPronounsSearchAndDisplayViewModel, 1124));
                                return;
                            }
                        }
                    }
                }
            };
            int length = this.LJLIL.length() - 1;
            int length2 = this.LJLIL.length();
            this.LJLIL.setSpan(c8fc, length, length2, 33);
            this.LJLIL.setSpan(anonymousClass899, length, length2, 33);
        }
        this.LJLIL.setSpan(new C8FU(71), 0, this.LJLIL.length(), 33);
    }
}
