package Y;

import X.AKF;
import X.C65352Pkq;
import X.C70890Rry;
import X.C78946Uyc;
import X.C8VC;
import X.C9BR;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.SYL;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui.ProfileEditPronounsFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDLListenerS58S0200000_4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            case 6:
                onGlobalLayout$6(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS58S0200000_4 iDLListenerS58S0200000_4) {
        ((AKF) iDLListenerS58S0200000_4.l0).LIZ(R.id.dj7).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS58S0200000_4);
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDLListenerS58S0200000_4.l1;
        if (interfaceC88471Ynr == null) {
            return;
        }
        View title = ((AKF) iDLListenerS58S0200000_4.l0).LIZ(R.id.title);
        o.LJIIIIZZ(title, "title");
        View message = ((AKF) iDLListenerS58S0200000_4.l0).LIZ(R.id.ghd);
        o.LJIIIIZZ(message, "message");
        ((AKF) iDLListenerS58S0200000_4.l0).setEndAlignment(((Number) interfaceC88471Ynr.invoke(title, message)).intValue());
    }

    public static final void onGlobalLayout$1(IDLListenerS58S0200000_4 iDLListenerS58S0200000_4) {
        ViewTreeObserver viewTreeObserver;
        Layout layout;
        String str;
        TextView textView = (TextView) ((OrderSubmitFragment) iDLListenerS58S0200000_4.l0)._$_findCachedViewById(R.id.hck);
        if (textView != null && (layout = textView.getLayout()) != null) {
            OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) iDLListenerS58S0200000_4.l0;
            Announcement announcement = (Announcement) iDLListenerS58S0200000_4.l1;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) == 0) {
                ((ImageView) orderSubmitFragment._$_findCachedViewById(R.id.hcj)).setVisibility(8);
                str = "disable";
            } else {
                ((ImageView) orderSubmitFragment._$_findCachedViewById(R.id.hcj)).setVisibility(0);
                orderSubmitFragment.setAnnouncementClickListener(announcement);
                str = "normal";
            }
            C78946Uyc.LJJII(orderSubmitFragment, new C70890Rry(), new AqS58S1100000_4(announcement, str, 5));
        }
        View _$_findCachedViewById = ((OrderSubmitFragment) iDLListenerS58S0200000_4.l0)._$_findCachedViewById(R.id.hck);
        if (_$_findCachedViewById != null && (viewTreeObserver = _$_findCachedViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS58S0200000_4);
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS58S0200000_4 iDLListenerS58S0200000_4) {
        ((C9BR) C8VC.LIZJ((ProfileEditPronounsFragment) iDLListenerS58S0200000_4.l0, C65352Pkq.LIZ(C9BR.class))).Bd(((ProfileEditPronounsFragment) iDLListenerS58S0200000_4.l0).Pl((View) iDLListenerS58S0200000_4.l1));
    }

    public static final void onGlobalLayout$3(IDLListenerS58S0200000_4 iDLListenerS58S0200000_4) {
        ViewTreeObserver viewTreeObserver = ((View) iDLListenerS58S0200000_4.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS58S0200000_4);
        }
        ((Runnable) iDLListenerS58S0200000_4.l1).run();
    }

    public static final void onGlobalLayout$4(IDLListenerS58S0200000_4 iDLListenerS58S0200000_4) {
        if (((BaseCaptionSheetFragment) iDLListenerS58S0200000_4.l0).isVisible() && ((SYL) iDLListenerS58S0200000_4.l1).getChildCount() > 1) {
            ((BaseCaptionSheetFragment) iDLListenerS58S0200000_4.l0).vl();
            ((SYL) iDLListenerS58S0200000_4.l1).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS58S0200000_4);
        }
    }

    public static final void onGlobalLayout$5(IDLListenerS58S0200000_4 iDLListenerS58S0200000_4) {
        if (((View) iDLListenerS58S0200000_4.l0).getGlobalVisibleRect(new Rect())) {
            ((InterfaceC88472Yns) iDLListenerS58S0200000_4.l1).invoke((View) iDLListenerS58S0200000_4.l0);
            ViewTreeObserver viewTreeObserver = ((View) iDLListenerS58S0200000_4.l0).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS58S0200000_4);
            }
        }
    }

    public static final void onGlobalLayout$6(IDLListenerS58S0200000_4 iDLListenerS58S0200000_4) {
        if (((View) iDLListenerS58S0200000_4.l0).getGlobalVisibleRect(new Rect())) {
            ((InterfaceC88472Yns) iDLListenerS58S0200000_4.l1).invoke((View) iDLListenerS58S0200000_4.l0);
            ViewTreeObserver viewTreeObserver = ((View) iDLListenerS58S0200000_4.l0).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS58S0200000_4);
            }
        }
    }

    public IDLListenerS58S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
