package com.bytedance.android.live.design.view.sheet;

import X.C0KA;
import X.C0KC;
import X.C16880lQ;
import Y.IDCListenerS10S0101000;
import Y.IDCListenerS250S0100000;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class LiveBaseSheetDialog extends LiveBottomSheetDialog {
    public static final /* synthetic */ int LJZL = 0;
    public View LJLLJ;
    public View LJLLL;
    public TextView LJLLLL;
    public C0KC LJLLLLLL;
    public CharSequence LJLZ;
    public boolean LJZ;
    public boolean LJZI;

    public LiveBaseSheetDialog() {
        throw null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private void LJJ() {
        int i;
        setTitle(this.LJLZ);
        boolean z = this.LJZ;
        this.LJZ = z;
        View view = this.LJLLL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public LiveBaseSheetDialog(Context context) {
        super(context, 0);
        this.LJZI = true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(LJJI(null, i, new ViewGroup.LayoutParams(-1, -1)));
        LJJ();
    }

    @Override // X.C18Z, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.LJLZ = charSequence;
        TextView textView = this.LJLLLL;
        if (textView != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                this.LJLLJ.setVisibility(8);
            } else {
                this.LJLLJ.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(LJJI(view, 0, new ViewGroup.LayoutParams(-1, -1)));
        LJJ();
    }

    @Override // X.C18Z, android.app.Dialog
    public void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    public LiveBaseSheetDialog(Context context, int i) {
        super(context, i);
        this.LJZI = true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJJI(view, 0, layoutParams));
        LJJ();
    }

    public final View LJJI(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bpl, C16880lQ.LLZIL(getContext()), null);
        this.LJLLJ = LLLZIIL.findViewById(R.id.jw4);
        View findViewById = LLLZIIL.findViewById(R.id.jw5);
        this.LJLLL = findViewById;
        C16880lQ.LJIIJ(new IDCListenerS10S0101000(0, this, 1), findViewById);
        this.LJLLLL = (TextView) LLLZIIL.findViewById(R.id.jw6);
        C0KC c0kc = (C0KC) LLLZIIL.findViewById(R.id.jw3);
        this.LJLLLLLL = c0kc;
        boolean z = this.LJZI;
        this.LJZI = z;
        if (c0kc != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c0kc.setVisibility(i2);
        }
        ViewGroup viewGroup = (ViewGroup) LLLZIIL.findViewById(R.id.jvv);
        if (view == null && i != 0) {
            view = C16880lQ.LLLLIILL(getLayoutInflater(), i, viewGroup, false);
        }
        if (layoutParams == null) {
            viewGroup.addView(view, -1, -1);
        } else {
            viewGroup.addView(view, layoutParams);
        }
        this.LJLLLLLL.addOnLayoutChangeListener(new IDCListenerS250S0100000(this, 1));
        if (this.LJLJJI == null) {
            LJIJJLI();
        }
        this.LJLJJI.LIZ(new C0KA() { // from class: X.1GU
            @Override // X.C0KA
            public final void LIZIZ(int i3, View view2) {
            }

            @Override // X.C0KA
            public final void LIZ(View view2, float f) {
                LiveBaseSheetDialog.this.LJLLLLLL.setOffset(Math.max(f, 0.0f));
            }
        });
        return LLLZIIL;
    }
}
