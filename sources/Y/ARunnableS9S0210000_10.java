package Y;

import X.C109544Rq;
import X.C115284fk;
import X.C2U8;
import X.C55331Lnb;
import X.C59393NSr;
import X.C60484NoW;
import X.C63120Opw;
import X.C63252Os4;
import X.C63309Osz;
import X.InterfaceC59392NSq;
import X.ViewTreeObserverOnGlobalLayoutListenerC60483NoV;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS9S0210000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String queryParameter;
        Window window;
        final C60484NoW c60484NoW = (C60484NoW) this.l0;
        Uri uri = (Uri) this.l1;
        boolean z = this.z2;
        c60484NoW.getClass();
        String queryParameter2 = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter2 == null || (queryParameter = UriProtector.getQueryParameter(UriProtector.parse(queryParameter2), "soft_input_adjust")) == null || queryParameter.length() == 0) {
            return;
        }
        BottomSheetDialogFragment bottomSheetDialogFragment = c60484NoW.LJLJJLL;
        if (bottomSheetDialogFragment != null) {
            Dialog dialog = bottomSheetDialogFragment.getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            final View findViewById = c60484NoW.getSparkView().getRootView().findViewById(R.id.bs8);
            View findViewById2 = c60484NoW.getSparkView().getRootView().findViewById(R.id.bv5);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            window.setSoftInputMode(36);
            c60484NoW.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.7Fr
                public boolean LJLIL;
                public int LJLILLLLZI;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Rect rect = new Rect();
                    findViewById.getWindowVisibleDisplayFrame(rect);
                    int height = findViewById.getHeight() - rect.bottom;
                    if (height > 0) {
                        if (!this.LJLIL) {
                            this.LJLILLLLZI = c60484NoW.getHeight();
                            this.LJLIL = true;
                        }
                        int height2 = findViewById.getHeight() - height;
                        int i = this.LJLILLLLZI;
                        if (height2 <= i) {
                            int height3 = findViewById.getHeight() - height;
                            Context context = c60484NoW.getContext();
                            o.LJIIIIZZ(context, "context");
                            i = height3 - C63081OpJ.LJJJJLI(context);
                        }
                        C60484NoW c60484NoW2 = c60484NoW;
                        if (c60484NoW2.getLayoutParams().height != i) {
                            c60484NoW2.getLayoutParams().height = i;
                            c60484NoW2.requestLayout();
                            return;
                        }
                        return;
                    }
                    if (!this.LJLIL) {
                        return;
                    }
                    this.LJLIL = false;
                    if (c60484NoW.getLayoutParams().height == this.LJLILLLLZI) {
                        return;
                    }
                    c60484NoW.getLayoutParams().height = this.LJLILLLLZI;
                    c60484NoW.requestLayout();
                }
            });
            return;
        }
        c60484NoW.getActivity().getWindow().setSoftInputMode(36);
        c60484NoW.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC60483NoV(c60484NoW, z, c60484NoW));
    }

    public final void LIZ$1() {
        ((C59393NSr) this.l0).LJLIL.setVisibility(8);
        if (this.z2) {
            ((InterfaceC59392NSq) this.l1).LIZIZ();
        }
        Aweme aweme = ((C59393NSr) this.l0).LJLILLLLZI;
        if (aweme != null) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "mAweme.aid");
            C2U8.LIZ(new C55331Lnb(false, aid));
            return;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    public static final void run$0(ARunnableS9S0210000_10 aRunnableS9S0210000_10) {
        boolean LIZ;
        try {
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            C109544Rq c109544Rq = (C109544Rq) aRunnableS9S0210000_10.l0;
            LIZLLL.getClass();
            if (c109544Rq != null && !TextUtils.isEmpty(c109544Rq.getConversationId())) {
                LIZLLL.LIZJ(c109544Rq.getConversationId(), new C63252Os4(c109544Rq));
            }
            if (aRunnableS9S0210000_10.z2) {
                C115284fk.LJIILIIL().LJIJI(2, (C63120Opw) aRunnableS9S0210000_10.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS9S0210000_10 aRunnableS9S0210000_10) {
        boolean LIZ;
        try {
            ShakeEgg.LJIIIZ((Aweme) aRunnableS9S0210000_10.l0, aRunnableS9S0210000_10.z2, (ShakeEgg) aRunnableS9S0210000_10.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS9S0210000_10 aRunnableS9S0210000_10) {
        boolean LIZ;
        try {
            aRunnableS9S0210000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS9S0210000_10 aRunnableS9S0210000_10) {
        boolean LIZ;
        try {
            aRunnableS9S0210000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS9S0210000_10(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.z2 = z;
        this.l1 = obj;
    }
}
