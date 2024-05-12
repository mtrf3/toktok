package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import lda.a;
import n.b;
import o7a.i;
import o7a.m;
import p8.a;

/* renamed from: X.1SX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1SX implements InterfaceC17000lc, C0K7 {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C1SX(int i) {
        this.LJLIL = i;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        String LIZ;
        IActionHandlerService iActionHandlerService;
        liveDialog.dismiss();
        C75017TcL.LJIJ(this.LJLIL, "appeal");
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", "linkmic_appeal");
                String uri = buildUpon.build().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                value = uri;
            } catch (Exception e) {
                if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                    StackTraceElement LJ = C32014ChO.LJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_MultiGuestPermissionDialogHelper_", LJ, LIZ2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_MultiGuestPermissionDialogHelper_", 179, LIZ3);
                }
                C32014ChO.LIZJ(LIZ, e.toString(), null);
            }
        }
        Context context = C8E.LIZIZ().context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, value);
        }
    }

    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                ConstraintLayout LIZJ = C1P1.LIZJ(context, R.id.co7);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ch});
                LIZJ.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                ViewGroup.MarginLayoutParams LJ = b.LJ(-1, -2, viewGroup);
                TuxIconView LIZIZ = C08880Wm.LIZIZ(context, R.id.co9);
                C018905p c018905p = new C018905p((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p)) {
                    c018905p.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
                }
                i.LIZ("app:tux_tintColor", C4YR.LIZ("2131755525", "raw", "app:tux_icon", LIZIZ, c018905p, "2130968641", "attr"), LIZIZ, c018905p);
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.bottomToBottom = 0;
                }
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    LIZJ.addView(LIZIZ, c018905p);
                }
                TuxTextView LIZJ2 = C06420Na.LIZJ(context, R.id.co_);
                LIZJ2.setEllipsize(TextUtils.TruncateAt.END);
                LIZJ2.setMaxLines(2);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZJ2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                LIZJ2.setText(R.string.fih);
                C018905p c018905p2 = new C018905p((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    c018905p2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    c018905p2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    f = 12.0f;
                    ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
                } else {
                    f = 12.0f;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    ((ViewGroup.MarginLayoutParams) c018905p2).bottomMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.endToStart = R.id.co8;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.horizontalBias = 0.0f;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.startToEnd = R.id.co9;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.bottomToBottom = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.goneEndMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
                }
                if (C48690J9a.LJIIJ("P3_Semibold", "app:tux_font", LIZJ2, c018905p2, LIZJ2) == null) {
                    LIZJ.addView(LIZJ2, c018905p2);
                }
                TuxTextView LIZJ3 = C06420Na.LIZJ(context, R.id.co8);
                LIZJ3.setEllipsize(TextUtils.TruncateAt.END);
                LIZJ3.setMaxLines(2);
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZJ3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                LIZJ3.setText(R.string.fig);
                C018905p c018905p3 = new C018905p((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    f2 = 8.0f;
                    c018905p3.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
                } else {
                    f2 = 8.0f;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    c018905p3.setMarginStart((int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    f3 = 12.0f;
                    ((ViewGroup.MarginLayoutParams) c018905p3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
                } else {
                    f3 = 12.0f;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    ((ViewGroup.MarginLayoutParams) c018905p3).bottomMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.bottomToBottom = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.goneEndMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
                }
                if (C48690J9a.LJIIJ("P3_Semibold", "app:tux_font", LIZJ3, c018905p3, LIZJ3) == null) {
                    LIZJ.addView(LIZJ3, c018905p3);
                }
                b.LIZ(LIZJ);
                LIZJ.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZJ);
                }
                return LIZJ;
            case 1:
                context.getResources();
                View frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.hvw);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -2, viewGroup);
                if (LinearLayout.LayoutParams.class.isInstance(LJ2)) {
                    ((LinearLayout.LayoutParams) LJ2).gravity = 80;
                }
                if (FrameLayout.LayoutParams.class.isInstance(LJ2)) {
                    ((FrameLayout.LayoutParams) LJ2).gravity = 80;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(LJ2)) {
                    ((DrawerLayout$LayoutParams) LJ2).gravity = 80;
                }
                b.LIZ(frameLayout);
                frameLayout.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(frameLayout);
                }
                return frameLayout;
            default:
                Resources resources2 = context.getResources();
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                ViewGroup.MarginLayoutParams LJ3 = b.LJ((int) TypedValue.applyDimension(1, 80.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 114.0f, resources2.getDisplayMetrics()), viewGroup);
                C119614mj c119614mj = new C119614mj(context);
                c119614mj.setId(R.id.bxy);
                C018905p c018905p4 = new C018905p((int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p4)) {
                    ((ViewGroup.MarginLayoutParams) c018905p4).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.topToTop = 0;
                }
                b.LIZ(c119614mj);
                if (c119614mj.getParent() == null) {
                    constraintLayout.addView(c119614mj, c018905p4);
                }
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                appCompatImageView.setBackgroundResource(R.drawable.c7e);
                C018905p c018905p5 = new C018905p((int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p5)) {
                    ((ViewGroup.MarginLayoutParams) c018905p5).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.topToTop = 0;
                }
                b.LIZ(appCompatImageView);
                if (appCompatImageView.getParent() == null) {
                    constraintLayout.addView(appCompatImageView, c018905p5);
                }
                C119354mJ c119354mJ = new C119354mJ(context);
                c119354mJ.setId(R.id.kf_);
                c119354mJ.setTranslationY(TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
                c119354mJ.setTranslationX(TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
                C018905p c018905p6 = new C018905p((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
                if (C018905p.class.isInstance(c018905p6)) {
                    i = R.id.bxy;
                    c018905p6.endToEnd = R.id.bxy;
                } else {
                    i = R.id.bxy;
                }
                if (C018905p.class.isInstance(c018905p6)) {
                    c018905p6.bottomToBottom = i;
                }
                new a();
                a.LIZ("app:drawStatusStroke", new a.c("true"), c119354mJ, c018905p6);
                lda.a.LIZ("app:activeStatusColor", new a.b("2131099712", "color"), c119354mJ, c018905p6);
                lda.a.LIZ("app:inactiveStatusColor", new a.b("2131099712", "color"), c119354mJ, c018905p6);
                lda.a.LIZ("app:statusStrokeColor", new a.b("2130968612", "attr"), c119354mJ, c018905p6);
                lda.a.LIZ("app:statusStrokeWidth", new a.d("4", "dp"), c119354mJ, c018905p6);
                b.LIZ(c119354mJ);
                if (c119354mJ.getParent() == null) {
                    constraintLayout.addView(c119354mJ, c018905p6);
                }
                C72433Sbl c72433Sbl = new C72433Sbl(context);
                c72433Sbl.setId(R.id.h8r);
                c72433Sbl.setTranslationY(TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
                c72433Sbl.setTranslationX(TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
                c72433Sbl.setVisibility(4);
                C018905p c018905p7 = new C018905p((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
                n54.b bVar = new n54.b();
                bVar.LIZ.LIZLLL("app:roundAsCircle", new a.c("true"), c72433Sbl, c018905p7);
                bVar.LIZ.LIZLLL("app:placeholderImageScaleType", new a.c("centerCrop"), c72433Sbl, c018905p7);
                if (C018905p.class.isInstance(c018905p7)) {
                    i2 = R.id.kf_;
                    c018905p7.topToTop = R.id.kf_;
                } else {
                    i2 = R.id.kf_;
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.startToStart = i2;
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.endToEnd = i2;
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.bottomToBottom = i2;
                }
                bVar.LIZ.LIZJ(c72433Sbl, c018905p7);
                b.LIZ(c72433Sbl);
                if (c72433Sbl.getParent() == null) {
                    constraintLayout.addView(c72433Sbl, c018905p7);
                }
                TuxIconView LIZ = C48339Iy7.LIZ(context, R.id.g7p, 4);
                C018905p c018905p8 = new C018905p((int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p8)) {
                    ((ViewGroup.MarginLayoutParams) c018905p8).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p8)) {
                    i3 = 0;
                    c018905p8.endToEnd = 0;
                } else {
                    i3 = 0;
                }
                if (C018905p.class.isInstance(c018905p8)) {
                    c018905p8.startToStart = i3;
                }
                if (C018905p.class.isInstance(c018905p8)) {
                    c018905p8.topToTop = i3;
                }
                b.LIZ(LIZ);
                if (LIZ.getParent() == null) {
                    constraintLayout.addView(LIZ, c018905p8);
                }
                TuxTextView LIZJ4 = C06420Na.LIZJ(context, R.id.gw7);
                LIZJ4.setMaxWidth((int) TypedValue.applyDimension(1, 72.0f, resources2.getDisplayMetrics()));
                LIZJ4.setMaxLines(1);
                LIZJ4.setEllipsize(TextUtils.TruncateAt.END);
                TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.go});
                LIZJ4.setTextColor(obtainStyledAttributes4.getColor(0, 0));
                obtainStyledAttributes4.recycle();
                LIZJ4.setText(R.string.p5);
                C018905p c018905p9 = new C018905p(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p9)) {
                    ((ViewGroup.MarginLayoutParams) c018905p9).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources2.getDisplayMetrics());
                }
                new m();
                m.LIZ("app:tux_font", new a.c("P3_Regular"), LIZJ4, c018905p9);
                if (C018905p.class.isInstance(c018905p9)) {
                    i4 = R.id.bxy;
                    c018905p9.startToStart = R.id.bxy;
                } else {
                    i4 = R.id.bxy;
                }
                if (C018905p.class.isInstance(c018905p9)) {
                    c018905p9.endToEnd = i4;
                }
                if (C018905p.class.isInstance(c018905p9)) {
                    c018905p9.topToBottom = i4;
                }
                b.LIZ(LIZJ4);
                if (LIZJ4.getParent() == null) {
                    constraintLayout.addView(LIZJ4, c018905p9);
                }
                b.LIZ(constraintLayout);
                constraintLayout.setLayoutParams(LJ3);
                if (viewGroup != null && z) {
                    viewGroup.addView(constraintLayout);
                }
                return constraintLayout;
        }
    }
}
