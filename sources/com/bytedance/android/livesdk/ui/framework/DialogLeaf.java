package com.bytedance.android.livesdk.ui.framework;

import X.AbstractC32579CqV;
import X.C018905p;
import X.C32580CqW;
import X.C32780Ctk;
import X.DialogC38611fN;
import X.DialogInterfaceOnKeyListenerC32760CtQ;
import X.EnumC32545Cpx;
import X.OSZ;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public abstract class DialogLeaf extends AbstractC32579CqV implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    public int LJLJL;
    public final boolean LJLJLJ;
    public DialogC38611fN LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public C32780Ctk LJLLILLLL;

    @Override // X.AbstractC32579CqV
    public final void LJIILJJIL() {
        DialogC38611fN dialogC38611fN;
        this.LJLLI = true;
        if (!this.LJLL && (dialogC38611fN = this.LJLJLLL) != null) {
            dialogC38611fN.dismiss();
        }
        LJIJJ();
    }

    @Override // X.AbstractC32579CqV
    public void LJIILL() {
        this.LJLL = false;
        this.LJLLI = false;
    }

    public abstract C32780Ctk LJJI();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }

    @Override // X.AbstractC32579CqV
    public void onStart() {
        this.LJLL = false;
    }

    @Override // X.AbstractC32579CqV
    public void LJIJJ() {
        super.LJIJJ();
        this.LJLJLLL = null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.LJLL) {
            return;
        }
        this.LJLL = true;
        if (this.LJLJI.LIZ != EnumC32545Cpx.END) {
            LJIIJ();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.LJLL = false;
    }

    public DialogLeaf(Context context, int i) {
        super(context, i);
        this.LJLJLJ = true;
    }

    @Override // X.AbstractC32579CqV
    public OSZ<View, C018905p> LJIJJLI(Context context, ViewGroup parent, LayoutInflater layoutInflater) {
        Fragment fragment;
        Lifecycle lifecycle;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        Context context2 = this.LJLIL;
        C32780Ctk LJJI = LJJI();
        this.LJLLILLLL = LJJI;
        int i = LJJI.LIZ;
        if (i == -1) {
            i = R.style.abs;
        }
        this.LJLJL = i;
        DialogC38611fN dialogC38611fN = new DialogC38611fN(context2, this.LJLJL);
        dialogC38611fN.LJLIL = true;
        dialogC38611fN.requestWindowFeature(1);
        C32780Ctk c32780Ctk = this.LJLLILLLL;
        if (c32780Ctk != null) {
            dialogC38611fN.setCanceledOnTouchOutside(true);
            Window window = dialogC38611fN.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.gravity = c32780Ctk.LIZIZ;
                    attributes.softInputMode = c32780Ctk.LIZJ;
                } else {
                    attributes = null;
                }
                window.setAttributes(attributes);
            }
        }
        View view = this.LJLJJI;
        if (view != null) {
            dialogC38611fN.setContentView(view);
        }
        Context context3 = dialogC38611fN.getContext();
        if (context3 instanceof Activity) {
            dialogC38611fN.setOwnerActivity((Activity) context3);
        }
        dialogC38611fN.setCancelable(this.LJLJLJ);
        dialogC38611fN.setOnCancelListener(this);
        dialogC38611fN.setOnDismissListener(this);
        dialogC38611fN.setOnShowListener(this);
        dialogC38611fN.setOnKeyListener(new DialogInterfaceOnKeyListenerC32760CtQ(this));
        this.LJLJLLL = dialogC38611fN;
        C32580CqW c32580CqW = this.LJLJJL;
        if (c32580CqW != null && (fragment = c32580CqW.getFragment()) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.livesdk.ui.framework.DialogLeaf$onViewCreated$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_PAUSE) {
                        onPause();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public final void onPause() {
                    DialogC38611fN dialogC38611fN2;
                    DialogLeaf dialogLeaf = DialogLeaf.this;
                    if (dialogLeaf.LJLJI.LIZ == EnumC32545Cpx.END && (dialogC38611fN2 = dialogLeaf.LJLJLLL) != null) {
                        dialogC38611fN2.dismiss();
                    }
                }
            });
        }
        return null;
    }
}
