package Y;

import X.A1M;
import X.C139825eE;
import X.C188727au;
import X.C221018lt;
import X.FMX;
import X.InterfaceC88472Yns;
import X.LRV;
import X.WHL;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDLListenerS7S0300000_4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS7S0300000_4 iDLListenerS7S0300000_4) {
        if (!((ViewTreeObserver) iDLListenerS7S0300000_4.l0).isAlive()) {
            ((View) iDLListenerS7S0300000_4.l1).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS7S0300000_4);
        } else {
            ((ViewTreeObserver) iDLListenerS7S0300000_4.l0).removeOnGlobalLayoutListener(iDLListenerS7S0300000_4);
        }
        ((ViewTreeObserver.OnGlobalLayoutListener) iDLListenerS7S0300000_4.l2).onGlobalLayout();
    }

    public static final void onGlobalLayout$1(IDLListenerS7S0300000_4 iDLListenerS7S0300000_4) {
        if (((TuxIconView) iDLListenerS7S0300000_4.l0).isShown()) {
            String str = ((ManageSeriesListAssem) iDLListenerS7S0300000_4.l1).H3().LJLILLLLZI;
            String str2 = ((ManageSeriesListAssem) iDLListenerS7S0300000_4.l1).H3().LJLIL;
            int itemCount = ((ManageSeriesListAssem) iDLListenerS7S0300000_4.l1).K3().getItemCount();
            String str3 = ((ManageSeriesListAssem) iDLListenerS7S0300000_4.l1).H3().LJLJI;
            C188727au c188727au = new C188727au();
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("enter_from", str);
            if (str2 == null) {
                str2 = "";
            }
            c188727au.LJIIIZ("collection_id", str2);
            c188727au.LIZLLL(itemCount, "item_cnt");
            if (str3 == null) {
                str3 = "";
            }
            c188727au.LJIIIZ("entry_point", str3);
            FMX.LJIIL("show_series_video_upload_tooltip", c188727au.LIZ);
            Context context = ((View) iDLListenerS7S0300000_4.l2).getContext();
            o.LJIIIIZZ(context, "view.context");
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZIZ((TuxIconView) iDLListenerS7S0300000_4.l0);
            c139825eE.LJI(WHL.TOP);
            c139825eE.LJIIJJI(R.string.qr7);
            c139825eE.LIZJ().show();
            A1M.LIZ.storeBoolean("add_more_videos_tooltip_shown", true);
            ((TuxIconView) iDLListenerS7S0300000_4.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS7S0300000_4);
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS7S0300000_4 iDLListenerS7S0300000_4) {
        ((View) iDLListenerS7S0300000_4.l0).getLocationInWindow((int[]) iDLListenerS7S0300000_4.l1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGlobalLayout x = ");
        LIZ.append(((int[]) iDLListenerS7S0300000_4.l1)[0]);
        LIZ.append(", y = ");
        LIZ.append(((int[]) iDLListenerS7S0300000_4.l1)[1]);
        C221018lt.LJFF("MusNewNotificationCountView", X1D.LIZIZ(LIZ));
        ((View) iDLListenerS7S0300000_4.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS7S0300000_4);
        LRV lrv = (LRV) iDLListenerS7S0300000_4.l2;
        View view = (View) iDLListenerS7S0300000_4.l0;
        int[] iArr = (int[]) iDLListenerS7S0300000_4.l1;
        lrv.LJI(iArr[0], iArr[1], view);
    }

    public static final void onGlobalLayout$3(IDLListenerS7S0300000_4 iDLListenerS7S0300000_4) {
        if (((Boolean) ((InterfaceC88472Yns) iDLListenerS7S0300000_4.l0).invoke((View) iDLListenerS7S0300000_4.l1)).booleanValue()) {
            if (((ViewTreeObserver) iDLListenerS7S0300000_4.l2).isAlive()) {
                ((ViewTreeObserver) iDLListenerS7S0300000_4.l2).removeOnGlobalLayoutListener(iDLListenerS7S0300000_4);
            } else {
                ((View) iDLListenerS7S0300000_4.l1).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS7S0300000_4);
            }
        }
    }

    public IDLListenerS7S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
