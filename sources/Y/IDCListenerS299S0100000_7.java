package Y;

import X.C46017I4f;
import X.GND;
import X.GOH;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDCListenerS299S0100000_7 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS299S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS299S0100000_7 iDCListenerS299S0100000_7, View view) {
        C46017I4f c46017I4f = (C46017I4f) iDCListenerS299S0100000_7.l0;
        Activity activity = c46017I4f.mActivity;
        if (activity != null) {
            CutVideoViewModel cutVideoViewModel = c46017I4f.LJLJLLL;
            String str = null;
            if (cutVideoViewModel != null) {
                LibraryMaterialInfoSv Nv0 = cutVideoViewModel.Nv0();
                if (Nv0 != null) {
                    str = Nv0.getId();
                }
                GND.LIZ(activity, str);
                return true;
            }
            o.LJIJI("cutVideoViewModel");
            throw null;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r0.LIZIZ != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onLongClick$1(Y.IDCListenerS299S0100000_7 r8, android.view.View r9) {
        /*
            java.lang.Object r6 = r8.l0
            com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder r6 = (com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder) r6
            kotlin.jvm.internal.o.LJI(r9)
            r6.getClass()
            X.GWo r1 = X.C41658GWo.LIZLLL()
            android.content.Context r0 = r9.getContext()
            r1.getClass()
            boolean r0 = X.C41658GWo.LIZJ(r0)
            r5 = 1
            if (r0 != 0) goto L1d
        L1c:
            return r5
        L1d:
            X.GNp r1 = r6.LJLLLL
            r8 = 0
            java.lang.String r7 = "mData"
            if (r1 == 0) goto L86
            boolean r0 = r1.LIZIZ
            if (r0 != 0) goto L2d
            X.GOK r0 = r6.LJLIL
            r0.sl(r9, r1)
        L2d:
            java.lang.String r2 = "studio_long_press_to_select_draft"
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 0
            int r0 = X.C00F.LIZ(r1, r0, r2, r5)
            if (r0 != r5) goto L65
        L38:
            X.SJp r0 = r6.LJLLJ
            java.lang.String r4 = "mCheckBox"
            if (r0 == 0) goto L7e
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L1c
            X.SJp r1 = r6.LJLLJ
            if (r1 == 0) goto L7a
            X.GNp r0 = r6.LJLLLL
            if (r0 == 0) goto L76
            boolean r0 = r0.LJIIIZ
            r0 = r0 ^ 1
            r1.setChecked(r0)
            X.GOK r3 = r6.LJLIL
            X.SJp r2 = r6.LJLLJ
            if (r2 == 0) goto L72
            X.GNp r1 = r6.LJLLLL
            if (r1 == 0) goto L6e
            boolean r0 = r2.isChecked()
            r3.M0(r2, r1, r0)
            goto L1c
        L65:
            X.GNp r0 = r6.LJLLLL
            if (r0 == 0) goto L82
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto L1c
            goto L38
        L6e:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        L72:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r8
        L76:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        L7a:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r8
        L7e:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r8
        L82:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        L86:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS299S0100000_7.onLongClick$1(Y.IDCListenerS299S0100000_7, android.view.View):boolean");
    }

    public static final boolean onLongClick$2(IDCListenerS299S0100000_7 iDCListenerS299S0100000_7, View view) {
        ((GOH) iDCListenerS299S0100000_7.l0).LJLJI.invoke();
        return true;
    }
}
