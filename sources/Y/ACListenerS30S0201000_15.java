package Y;

import X.C85511XhD;
import X.C85513XhF;
import android.text.Editable;
import android.view.View;

/* loaded from: classes16.dex */
public class ACListenerS30S0201000_15 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS30S0201000_15 aCListenerS30S0201000_15, View view) {
        ((C85511XhD) aCListenerS30S0201000_15.l0).LJLILLLLZI.LJJIJIL(aCListenerS30S0201000_15.i2);
        Editable text = ((C85513XhF) aCListenerS30S0201000_15.l1).LJLIL.getText();
        if (text != null) {
            ((C85513XhF) aCListenerS30S0201000_15.l1).LJLIL.setSelection(text.toString().length());
        }
    }

    public static final void onClick$1(ACListenerS30S0201000_15 aCListenerS30S0201000_15, View view) {
        ((C85513XhF) aCListenerS30S0201000_15.l0).LJLJJL.setVisibility(8);
        ((C85513XhF) aCListenerS30S0201000_15.l0).LJLJJI.setVisibility(0);
        ((C85513XhF) aCListenerS30S0201000_15.l0).LJLJJI.playAnimation();
        ((C85511XhD) aCListenerS30S0201000_15.l1).LJLILLLLZI.LJJ(aCListenerS30S0201000_15.i2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS30S0201000_15(int r2, X.C85513XhF r3, X.C85511XhD r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.i2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.i2 = r2
            r0.l1 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS30S0201000_15.<init>(int, X.XhF, X.XhD, int):void");
    }
}
