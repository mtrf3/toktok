package Y;

import X.ActivityC45651qj;
import X.C70740RpY;
import X.C72837SiH;
import X.C76542zS;
import X.DialogC70776Rq8;
import X.InterfaceC72840SiK;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDDListenerS105S0200000_12 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS105S0200000_12 iDDListenerS105S0200000_12, DialogInterface dialogInterface) {
        if (C72837SiH.LJLJJL == null) {
            C72837SiH c72837SiH = (C72837SiH) iDDListenerS105S0200000_12.l0;
            InterfaceC72840SiK interfaceC72840SiK = (InterfaceC72840SiK) iDDListenerS105S0200000_12.l1;
            c72837SiH.getClass();
            C76542zS.LIZJ("mall_click_search_feedback", new AqS65S1100000_12(interfaceC72840SiK, "close", 3));
        }
    }

    public static final void onDismiss$1(IDDListenerS105S0200000_12 iDDListenerS105S0200000_12, DialogInterface dialogInterface) {
        ActivityC45651qj mo49getActivity = ((GalleryViewerFragment) iDDListenerS105S0200000_12.l0).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
        DialogC70776Rq8 dialogC70776Rq8 = (DialogC70776Rq8) iDDListenerS105S0200000_12.l1;
        C70740RpY listener = ((GalleryViewerFragment) iDDListenerS105S0200000_12.l0).LLD;
        dialogC70776Rq8.getClass();
        o.LJIIIZ(listener, "listener");
        ((ArrayList) dialogC70776Rq8.LJLJLJ).remove(listener);
    }

    public IDDListenerS105S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
