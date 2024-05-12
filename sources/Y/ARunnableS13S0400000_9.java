package Y;

import X.AbstractC53895LDf;
import X.AbstractC85293Wj;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C139825eE;
import X.C142425iQ;
import X.C16880lQ;
import X.C17N;
import X.C39519Ff9;
import X.C44384HbQ;
import X.C45804HyK;
import X.C54082LKk;
import X.C55959Lxj;
import X.C56309M8b;
import X.C65300Pk0;
import X.C76800UCe;
import X.C82682Wcg;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.KL2;
import X.LU8;
import X.LUK;
import X.M74;
import X.W5U;
import X.WHL;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.poplayer.core.PopupTaskExecutor;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell.ToolEntryCellNew;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ARunnableS13S0400000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        View view;
        Method method = PopupTaskExecutor.LJLJLJ;
        Object obj = null;
        if (method != null) {
            M74 m74 = ((C56309M8b) this.l0).LJLJJLL;
            Object[] objArr = {this.l1};
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{m74, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3910577685536030097"));
            if (LIZJ.LIZ) {
                obj = LIZJ.LIZIZ;
            } else {
                obj = method.invoke(m74, objArr);
            }
        }
        if (!(obj instanceof View) || (view = (View) obj) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((C56309M8b) this.l0).LJLILLLLZI);
            LIZ.append(" getRootView returns null, to avoid blocking the whole queue, call dismiss.");
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
            ((C56309M8b) this.l0).LJLJJLL.getStateWrapper().LIZ();
            return;
        }
        if (PopupManager.LJIIIZ.get()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(((C56309M8b) this.l0).LJLILLLLZI);
            LIZ2.append(" shows failed because PopLayerManager is stopped.");
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ2));
            ((C56309M8b) this.l0).LJLJJLL.getStateWrapper().LIZ();
            return;
        }
        PopupTaskExecutor popupTaskExecutor = (PopupTaskExecutor) this.l2;
        C56309M8b c56309M8b = (C56309M8b) this.l0;
        C54082LKk c54082LKk = (C54082LKk) this.l3;
        popupTaskExecutor.getClass();
        PopupTaskExecutor.LIZLLL(c56309M8b, view, c54082LKk);
    }

    public final void LIZ$1() {
        InterfaceC82683Wch interfaceC82683Wch;
        InterfaceC82683Wch interfaceC82683Wch2 = ((LUK) this.l0).LIZJ;
        if (interfaceC82683Wch2 != null && interfaceC82683Wch2.isShowing()) {
            return;
        }
        LUK luk = (LUK) this.l0;
        Context it = (Context) this.l1;
        o.LJIIIIZZ(it, "it");
        C139825eE c139825eE = new C139825eE(it);
        c139825eE.LJIIJJI(R.string.hv3);
        c139825eE.LIZ.LJII = 3000L;
        c139825eE.LIZIZ((View) this.l2);
        c139825eE.LJI(WHL.TOP);
        c139825eE.LJII(new AqS156S0200000_9((LUK) this.l0, (LUK) this.l3, (InterfaceC65784Pro<C76800UCe>) 42));
        luk.LIZJ = c139825eE.LIZJ();
        Context it2 = (Context) this.l1;
        o.LJIIIIZZ(it2, "it");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(it2);
        if (LJJIFFI != null && !LJJIFFI.isFinishing() && (interfaceC82683Wch = ((LUK) this.l0).LIZJ) != null) {
            interfaceC82683Wch.show();
        }
    }

    public final void LIZ$2() {
        if (((View) this.l0).getParent() != null) {
            ToolEntryCellNew toolEntryCellNew = (ToolEntryCellNew) this.l1;
            final View view = (View) this.l0;
            final View view2 = (View) this.l2;
            Notice notice = (Notice) this.l3;
            toolEntryCellNew.getClass();
            C16880lQ.LJIIJ(new ACListenerS31S0400000_9(notice, notice, toolEntryCellNew, view, 1), view2);
            String middleImageUrl = notice.getMiddleImageUrl();
            if (middleImageUrl != null && middleImageUrl.length() > 0) {
                W5U.LJIIIIZZ(middleImageUrl).LJIIIZ(new AbstractC85293Wj() { // from class: X.3Wl
                    @Override // X.InterfaceC78660Uu0
                    public final void LIZIZ(Bitmap bitmap) {
                        if (bitmap == null) {
                            ((ImageView) view2.findViewById(R.id.i5y)).setVisibility(8);
                            return;
                        }
                        C1M5 c1m5 = new C1M5(view.getContext().getResources(), bitmap);
                        c1m5.LIZJ(C17N.LJIILL(6.0d));
                        ((ImageView) view2.findViewById(R.id.i5y)).setVisibility(0);
                        ((ImageView) view2.findViewById(R.id.i5y)).setImageDrawable(c1m5);
                    }

                    @Override // X.InterfaceC78660Uu0
                    public final void onFailed(Throwable th) {
                        ((ImageView) view2.findViewById(R.id.i5y)).setVisibility(8);
                    }
                });
            } else {
                ((TextView) view2.findViewById(R.id.gi2)).setMaxWidth(C17N.LJIILL(198.0d));
                ((ImageView) view2.findViewById(R.id.i5y)).setVisibility(8);
            }
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            C142425iQ c142425iQ = new C142425iQ(context);
            C82682Wcg c82682Wcg = c142425iQ.LIZ;
            c82682Wcg.LIZIZ = view;
            c82682Wcg.LJIJ = view2;
            c142425iQ.LJIIJ(null, true);
            c142425iQ.LIZ.LJII = 2000L;
            c142425iQ.LJFF();
            c142425iQ.LIZ.LJIL = false;
            c142425iQ.LJI(WHL.BOTTOM);
            InterfaceC82683Wch LIZJ = c142425iQ.LIZJ();
            LIZJ.LJ(new C55959Lxj(notice, toolEntryCellNew, view));
            LIZJ.show();
        }
    }

    public final void LIZ$3() {
        InterfaceC82683Wch interfaceC82683Wch;
        InterfaceC82683Wch interfaceC82683Wch2 = ((LU8) this.l0).LIZJ;
        if (interfaceC82683Wch2 != null && interfaceC82683Wch2.isShowing()) {
            return;
        }
        LU8 lu8 = (LU8) this.l0;
        Context it = (Context) this.l1;
        o.LJIIIIZZ(it, "it");
        C139825eE c139825eE = new C139825eE(it);
        c139825eE.LIZIZ((View) this.l2);
        c139825eE.LJI(WHL.TOP);
        c139825eE.LIZ.LJFF = (int) KL2.LIZJ((Context) this.l1, 10.0f);
        c139825eE.LJIIJJI(R.string.p66);
        c139825eE.LJII(new AqS156S0200000_9((LU8) this.l0, (LU8) this.l3, (InterfaceC65784Pro<C76800UCe>) 117));
        lu8.LIZJ = c139825eE.LIZJ();
        Context it2 = (Context) this.l1;
        o.LJIIIIZZ(it2, "it");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(it2);
        if (LJJIFFI != null && !LJJIFFI.isFinishing() && (interfaceC82683Wch = ((LU8) this.l0).LIZJ) != null) {
            interfaceC82683Wch.show();
        }
    }

    public static final void run$0(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            super/*X.LDf*/.LJIILIIL((AbstractC53895LDf) aRunnableS13S0400000_9.l1, (AbstractC53895LDf) aRunnableS13S0400000_9.l2, (List) aRunnableS13S0400000_9.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            super/*X.LDf*/.LJIILJJIL((AbstractC53895LDf) aRunnableS13S0400000_9.l1, (AbstractC53895LDf) aRunnableS13S0400000_9.l2, (CopyOnWriteArrayList) aRunnableS13S0400000_9.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            super/*X.LDf*/.LJIILIIL((AbstractC53895LDf) aRunnableS13S0400000_9.l1, (AbstractC53895LDf) aRunnableS13S0400000_9.l2, (List) aRunnableS13S0400000_9.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            super/*X.LDf*/.LJIILJJIL((AbstractC53895LDf) aRunnableS13S0400000_9.l1, (AbstractC53895LDf) aRunnableS13S0400000_9.l2, (CopyOnWriteArrayList) aRunnableS13S0400000_9.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            aRunnableS13S0400000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            aRunnableS13S0400000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            aRunnableS13S0400000_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS13S0400000_9 aRunnableS13S0400000_9) {
        boolean LIZ;
        try {
            aRunnableS13S0400000_9.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S0400000_9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
