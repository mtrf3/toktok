package X;

import Y.IDhS99S0100000_6;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import n.b;
import o7a.i;
import p8.a;

/* renamed from: X.TAx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74219TAx implements InterfaceC48038ItG, InterfaceC17000lc {
    public int LJLIL;

    public /* synthetic */ C74219TAx() {
    }

    public /* synthetic */ C74219TAx(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        AbstractC73672Svk attempts = (AbstractC73672Svk) obj;
        o.LJIIIZ(attempts, "attempts");
        AbstractC73672Svk LJJIII = attempts.LJJIII(new IDhS99S0100000_6(this, 4), false);
        o.LJIIIIZZ(LJJIII, "override fun apply(attem…    }\n            }\n    }");
        return LJJIII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        switch (this.LJLIL) {
            case 0:
                context.getResources();
                View frameLayout = new FrameLayout(context);
                ViewGroup.LayoutParams LJ = b.LJ(-2, -2, viewGroup);
                b.LIZ(frameLayout);
                frameLayout.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(frameLayout);
                }
                return frameLayout;
            case 1:
                Resources resources = context.getResources();
                TuxAlertBadgeLayout tuxAlertBadgeLayout = new TuxAlertBadgeLayout(context, null, 6);
                tuxAlertBadgeLayout.setId(R.id.cxm);
                tuxAlertBadgeLayout.setPadding(tuxAlertBadgeLayout.getPaddingLeft(), tuxAlertBadgeLayout.getPaddingTop(), tuxAlertBadgeLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
                ViewGroup.MarginLayoutParams LJ2 = b.LJ((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), viewGroup);
                if (RelativeLayout.LayoutParams.class.isInstance(LJ2)) {
                    ((RelativeLayout.LayoutParams) LJ2).addRule(21, -1);
                }
                TuxIconView LIZIZ = C08880Wm.LIZIZ(context, R.id.mb8);
                ViewGroup.MarginLayoutParams LJ3 = b.LJ((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), tuxAlertBadgeLayout);
                if (LinearLayout.LayoutParams.class.isInstance(LJ3)) {
                    ((LinearLayout.LayoutParams) LJ3).gravity = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(LJ3)) {
                    ((FrameLayout.LayoutParams) LJ3).gravity = 17;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(LJ3)) {
                    ((DrawerLayout$LayoutParams) LJ3).gravity = 17;
                }
                new i();
                i.LIZ("app:tux_icon", new a.b("2131756142", "raw"), LIZIZ, LJ3);
                i.LIZ("app:tux_iconShadow", new a.c("true"), LIZIZ, LJ3);
                i.LIZ("app:tux_tintColor", new a.b("2130968641", "attr"), LIZIZ, LJ3);
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    tuxAlertBadgeLayout.addView(LIZIZ, LJ3);
                }
                b.LIZ(tuxAlertBadgeLayout);
                tuxAlertBadgeLayout.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(tuxAlertBadgeLayout);
                }
                return tuxAlertBadgeLayout;
            default:
                Resources resources2 = context.getResources();
                FrameLayout frameLayout2 = new FrameLayout(context);
                ViewGroup.LayoutParams LJ4 = b.LJ(-1, -1, viewGroup);
                View c47121t6 = new C47121t6(context, null);
                c47121t6.setId(R.id.mna);
                c47121t6.setVisibility(8);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.gravity = 17;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
                    ((DrawerLayout$LayoutParams) layoutParams).gravity = 17;
                }
                b.LIZ(c47121t6);
                if (c47121t6.getParent() == null) {
                    frameLayout2.addView(c47121t6, layoutParams);
                }
                View c47121t62 = new C47121t6(context, null);
                c47121t62.setId(R.id.mn_);
                c47121t62.setVisibility(8);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 50.0f, resources2.getDisplayMetrics());
                }
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.gravity = 17;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
                    ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
                }
                b.LIZ(c47121t62);
                if (c47121t62.getParent() == null) {
                    frameLayout2.addView(c47121t62, layoutParams2);
                }
                View LIZIZ2 = TB3.LIZIZ(context, R.id.ndg);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                b.LIZ(LIZIZ2);
                if (LIZIZ2.getParent() == null) {
                    frameLayout2.addView(LIZIZ2, layoutParams3);
                }
                b.LIZ(frameLayout2);
                frameLayout2.setLayoutParams(LJ4);
                if (viewGroup != null && z) {
                    viewGroup.addView(frameLayout2);
                }
                return frameLayout2;
        }
    }
}
