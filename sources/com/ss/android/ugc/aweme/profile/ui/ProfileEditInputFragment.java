package com.ss.android.ugc.aweme.profile.ui;

import X.AbstractC234519Ih;
import X.C116724i4;
import X.C16880lQ;
import X.C208018Ej;
import X.C233989Gg;
import X.C234509Ig;
import X.C252709vu;
import X.C79045V0n;
import X.C90193gN;
import X.C9KF;
import X.C9UM;
import X.C9UN;
import X.EnumC252729vw;
import X.InterfaceC252739vx;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileEditInputFragment extends ProfileDetailEditFragment {
    public static final C233989Gg LJLJLLL = new C233989Gg();
    public C252709vu LJLJJI;
    public TextView LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public Map<Integer, View> LJLJLJ = new LinkedHashMap();

    public final boolean Jl() {
        return true;
    }

    public abstract void Ml();

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLJLJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final TextView Il() {
        TextView textView = this.LJLJJL;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("editLengthHint");
        throw null;
    }

    public void LJJIIJZLJL() {
        C252709vu c252709vu = this.LJLJJI;
        if (c252709vu != null) {
            c252709vu.LJIJ("save", C9UN.LJLIL);
        }
    }

    public void LJJJI() {
        C252709vu c252709vu = this.LJLJJI;
        if (c252709vu != null) {
            c252709vu.LJIJ("save", C9UM.LJLIL);
        }
    }

    public final AbstractC234519Ih Ll() {
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "cancel";
        String string = getString(R.string.cel);
        o.LJIIIIZZ(string, "getString(R.string.button_cancel)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9UO
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                ProfileEditInputFragment.this.onBackPressed();
            }
        };
        return c234509Ig;
    }

    public boolean onBackPressed() {
        Dialog dialog;
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return true;
    }

    public final C9KF Kl(String title) {
        o.LJIIIZ(title, "title");
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = title;
        c9kf.LIZIZ = "title";
        return c9kf;
    }

    public final void Nl(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLJJL = textView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (C90193gN.LIZ()) {
            i = R.style.a9o;
        } else {
            i = R.style.a9n;
        }
        setStyle(1, i);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.9UL
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 1) {
                    ProfileEditInputFragment.this.onBackPressed();
                    return false;
                }
                return false;
            }
        });
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        return onCreateDialog;
    }

    public final boolean Hl(EditText editText, int i) {
        o.LJIIIZ(editText, "editText");
        Editable text = editText.getText();
        if (text.length() <= i) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(text);
        String substring = text.toString().substring(0, i);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        editText.setText(substring);
        Editable text2 = editText.getText();
        if (selectionEnd > text2.length()) {
            selectionEnd = text2.length();
        }
        Selection.setSelection(text2, selectionEnd);
        return true;
    }

    public final void Dl(boolean z, int i, int i2, boolean z2) {
        int i3;
        ForegroundColorSpan foregroundColorSpan;
        Integer LJI;
        if (z) {
            i3 = R.attr.e7;
        } else if (z2) {
            i3 = R.attr.gp;
        } else {
            i3 = R.attr.gv;
        }
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(i3, context)) != null) {
            foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
        } else {
            foregroundColorSpan = null;
        }
        int min = Math.min(i, i2);
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZJ(C208018Ej.LIZ(min), foregroundColorSpan);
        c116724i4.LJ("/");
        c116724i4.LIZIZ(C208018Ej.LIZ(i2));
        Il().setText(c116724i4.LIZ);
    }

    public static /* synthetic */ void Gl(ProfileEditInputFragment profileEditInputFragment, boolean z, int i, int i2, boolean z2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 8) != 0) {
                z2 = false;
            }
            profileEditInputFragment.Dl(z, i, i2, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeEditLengthHint");
    }
}
