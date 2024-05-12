package com.bytedance.poplayer;

import X.C54082LKk;
import X.InterfaceC56329M8v;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes10.dex */
public interface IPopupTask<Popup> {
    View getRootView(Popup popup);

    Popup showPopup(C54082LKk c54082LKk);

    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <Popup> View getRootView(IPopupTask<Popup> iPopupTask, Popup popup) {
            Window window;
            if (popup instanceof Dialog) {
                Window window2 = ((Dialog) popup).getWindow();
                if (window2 == null) {
                    return null;
                }
                return window2.getDecorView();
            }
            if (popup instanceof PopupWindow) {
                return ((PopupWindow) popup).getContentView();
            }
            if (popup instanceof DialogFragment) {
                DialogFragment dialogFragment = (DialogFragment) popup;
                View view = dialogFragment.getView();
                if (view == null) {
                    Dialog dialog = dialogFragment.getDialog();
                    if (dialog == null || (window = dialog.getWindow()) == null) {
                        return null;
                    }
                    return window.getDecorView();
                }
                return view;
            }
            if (popup instanceof View) {
                return (View) popup;
            }
            if (popup instanceof InterfaceC56329M8v) {
                return ((InterfaceC56329M8v) popup).getRootView();
            }
            throw new RuntimeException("Your popup must be Dialog, PopupWindow, DialogFragment, View or implementation class of IPopup interface.");
        }
    }
}
