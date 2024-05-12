package X;

import Y.ACListenerS27S0100000_7;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HpD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class AlertDialogC45239HpD extends AlertDialog implements DialogInterface.OnKeyListener {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public ViewGroup LJLIL;
    public FrameLayout LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxTextView LJLJJI;
    public TextView LJLJJL;
    public ViewGroup LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public InterfaceC45240HpE LJLJLLL;
    public C29701Eo LJLL;
    public boolean LJLLI;

    public final void LIZ() {
        int i;
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        TextView textView = this.LJLJJL;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        C29701Eo c29701Eo = this.LJLL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_error_robot;
        c2068389v.LJ = Integer.valueOf(R.attr.dl);
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c2068389v);
        }
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setText(getContext().getString(R.string.rf3));
        }
        TuxTextView tuxTextView2 = this.LJLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(71);
        }
        TuxTextView tuxTextView3 = this.LJLJJI;
        if (tuxTextView3 != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (i == C30581Hy.LJIIJJI(context, 22.0f)) {
                return;
            }
        }
        TuxTextView tuxTextView4 = this.LJLJJI;
        if (tuxTextView4 == null) {
            return;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C26338AVi.LJI(tuxTextView4, 0, Integer.valueOf(C30581Hy.LJIIJJI(context2, 22.0f)), 0, 0, false, 16);
    }

    public final void LIZJ() {
        int i;
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        TextView textView = this.LJLJJL;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        C29701Eo c29701Eo = this.LJLL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_wifi_slash;
        c2068389v.LJ = Integer.valueOf(R.attr.dl);
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c2068389v);
        }
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setText(getContext().getString(R.string.e1y));
        }
        TuxTextView tuxTextView2 = this.LJLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(71);
        }
        TuxTextView tuxTextView3 = this.LJLJJI;
        if (tuxTextView3 != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (i == C30581Hy.LJIIJJI(context, 22.0f)) {
                return;
            }
        }
        TuxTextView tuxTextView4 = this.LJLJJI;
        if (tuxTextView4 == null) {
            return;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C26338AVi.LJI(tuxTextView4, 0, Integer.valueOf(C30581Hy.LJIIJJI(context2, 22.0f)), 0, 0, false, 16);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C29701Eo c29701Eo = this.LJLL;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
        this.LJLLI = false;
        super.dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r1 == X.C30581Hy.LJIIJJI(r0, 35.0f)) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r12 = this;
            android.content.Context r0 = X.C5L7.LIZ()
            boolean r0 = X.C48203Ivv.LJ(r0)
            if (r0 != 0) goto Le
            r12.LIZJ()
            return
        Le:
            r10 = 0
            r12.LJLJLJ = r10
            android.widget.FrameLayout r1 = r12.LJLILLLLZI
            if (r1 != 0) goto Lc4
        L15:
            android.view.ViewGroup r3 = r12.LJLIL
            if (r3 == 0) goto L25
            Y.ARunnableS43S0100000_7 r2 = new Y.ARunnableS43S0100000_7
            r0 = 131(0x83, float:1.84E-43)
            r2.<init>(r12, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L25:
            android.view.ViewGroup r0 = r12.LJLJJLL
            r1 = 8
            if (r0 != 0) goto Lbf
        L2b:
            android.widget.TextView r0 = r12.LJLJJL
            if (r0 != 0) goto Lba
        L2f:
            com.bytedance.tux.icon.TuxIconView r0 = r12.LJLJI
            if (r0 != 0) goto Lb5
        L33:
            X.1Eo r0 = r12.LJLL
            if (r0 != 0) goto Lb1
        L37:
            com.bytedance.tux.input.TuxTextView r2 = r12.LJLJJI
            if (r2 != 0) goto La2
        L3b:
            com.bytedance.tux.input.TuxTextView r1 = r12.LJLJJI
            if (r1 == 0) goto L44
            r0 = 42
            r1.setTuxFont(r0)
        L44:
            com.bytedance.tux.input.TuxTextView r0 = r12.LJLJJI
            r2 = 1
            r4 = 1108082688(0x420c0000, float:35.0)
            java.lang.String r3 = "context"
            if (r0 == 0) goto L7d
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 != 0) goto L56
            r1 = 0
        L56:
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L7b
            int r1 = r1.topMargin
        L5c:
            android.content.Context r0 = r12.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            int r0 = X.C30581Hy.LJIIJJI(r0, r4)
            if (r1 != r0) goto L7d
        L69:
            boolean r0 = r12.LJLLI
            if (r0 == 0) goto L71
        L6d:
            r12.LIZLLL(r10)
            return
        L71:
            X.1Eo r0 = r12.LJLL
            if (r0 == 0) goto L78
            r0.playAnimation()
        L78:
            r12.LJLLI = r2
            goto L6d
        L7b:
            r1 = 0
            goto L5c
        L7d:
            com.bytedance.tux.input.TuxTextView r5 = r12.LJLJJI
            if (r5 == 0) goto L69
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            android.content.Context r0 = r12.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            int r0 = X.C30581Hy.LJIIJJI(r0, r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r11 = 16
            X.C26338AVi.LJI(r5, r6, r7, r8, r9, r10, r11)
            goto L69
        La2:
            android.content.Context r1 = r12.getContext()
            r0 = 2131845622(0x7f1161f6, float:1.932467E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            goto L3b
        Lb1:
            r0.setVisibility(r10)
            goto L37
        Lb5:
            r0.setVisibility(r1)
            goto L33
        Lba:
            r0.setVisibility(r10)
            goto L2f
        Lbf:
            r0.setVisibility(r1)
            goto L2b
        Lc4:
            r0 = 4
            r1.setVisibility(r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AlertDialogC45239HpD.LIZIZ():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC45239HpD(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
    }

    public final void LIZLLL(int i) {
        TextView textView;
        TextView textView2 = this.LJLJJL;
        if (textView2 == null || textView2.getVisibility() != 0 || i < this.LJLJLJ) {
            return;
        }
        if (this.LJLJL && (textView = this.LJLJJL) != null) {
            C67981Qm9.LIZIZ(new Object[]{Integer.valueOf(i)}, 1, "%d%%", "format(format, *args)", textView);
        }
        this.LJLJLJ = i;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cr6);
        this.LJLIL = (ViewGroup) findViewById(R.id.j71);
        this.LJLILLLLZI = (FrameLayout) findViewById(R.id.b3o);
        this.LJLL = (C29701Eo) findViewById(R.id.aaj);
        this.LJLJI = (TuxIconView) findViewById(R.id.aad);
        this.LJLJJI = (TuxTextView) findViewById(R.id.aae);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.izm);
        this.LJLJJLL = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.LJLJJL = (TextView) findViewById(R.id.ia9);
        C29701Eo c29701Eo = this.LJLL;
        if (c29701Eo != null) {
            c29701Eo.setAnimation("autocut_01.json");
        }
        C29701Eo c29701Eo2 = this.LJLL;
        if (c29701Eo2 != null) {
            c29701Eo2.setRepeatCount(-1);
        }
        this.LJLJL = true;
        LIZLLL(this.LJLJLJ);
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS27S0100000_7(this, 127));
        }
        ViewGroup viewGroup2 = this.LJLJJLL;
        if (viewGroup2 != null) {
            C16880lQ.LJIIL(viewGroup2, new ACListenerS27S0100000_7(this, 128));
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        dismiss();
        return true;
    }
}
