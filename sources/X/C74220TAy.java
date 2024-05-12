package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import n.b;
import o7a.i;
import p8.a;

/* renamed from: X.TAy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74220TAy implements InterfaceC17000lc {
    public final int LJLIL;

    public boolean LIZIZ() {
        if (this.LJLIL == 4) {
            return true;
        }
        return false;
    }

    public boolean LIZ() {
        return !LIZIZ();
    }

    public /* synthetic */ C74220TAy(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LIZJ(int r6) {
        /*
            r5 = this;
            boolean r0 = X.C214368bA.LIZLLL
            r4 = 4
            r2 = 1
            r3 = 0
            if (r0 != 0) goto Le
            int r0 = r5.LJLIL
            if (r0 == r2) goto Ld
            if (r0 != r4) goto Le
        Ld:
            return r3
        Le:
            r1 = 2
            switch(r6) {
                case 2: goto L9a;
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L93;
                case 8: goto L8e;
                case 9: goto L89;
                case 10: goto L84;
                case 11: goto L12;
                case 12: goto L7f;
                case 13: goto L7a;
                case 14: goto L75;
                case 15: goto L70;
                case 16: goto L6b;
                case 17: goto L66;
                case 18: goto L61;
                case 19: goto L5c;
                case 20: goto L12;
                case 21: goto L57;
                case 22: goto L52;
                case 23: goto L4a;
                case 24: goto L31;
                case 25: goto L2c;
                case 26: goto L19;
                case 27: goto L12;
                case 28: goto L12;
                case 29: goto L14;
                default: goto L12;
            }
        L12:
            r2 = 0
        L13:
            return r2
        L14:
            int r0 = r5.LJLIL
            if (r0 != r1) goto L12
            goto L13
        L19:
            int r0 = r5.LJLIL
            if (r0 != r1) goto L12
            boolean r0 = r5.LIZIZ()
            if (r0 != 0) goto L12
            com.ss.android.ugc.aweme.dsp.service.IMusicDspService r0 = X.C51645KOr.LIZIZ
            boolean r0 = r0.LJIILJJIL()
            if (r0 == 0) goto L12
            goto L13
        L2c:
            boolean r2 = r5.LIZ()
            goto L13
        L31:
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L12
            boolean r0 = X.C214368bA.LIZLLL
            r1 = 3
            if (r0 == 0) goto L45
            int r0 = r5.LJLIL
            if (r0 == r1) goto L13
            if (r0 == r2) goto L13
            if (r0 != r4) goto L12
            goto L13
        L45:
            int r0 = r5.LJLIL
            if (r0 != r1) goto L12
            goto L13
        L4a:
            int r0 = r5.LJLIL
            if (r0 == r2) goto L50
            if (r0 != r4) goto L97
        L50:
            r3 = 1
            goto L97
        L52:
            boolean r2 = r5.LIZ()
            goto L13
        L57:
            boolean r2 = r5.LIZ()
            goto L13
        L5c:
            boolean r2 = r5.LIZ()
            goto L13
        L61:
            boolean r2 = r5.LIZ()
            goto L13
        L66:
            boolean r2 = r5.LIZ()
            goto L13
        L6b:
            boolean r2 = r5.LIZ()
            goto L13
        L70:
            boolean r2 = r5.LIZ()
            goto L13
        L75:
            boolean r2 = r5.LIZ()
            goto L13
        L7a:
            boolean r2 = r5.LIZ()
            goto L13
        L7f:
            boolean r2 = r5.LIZ()
            goto L13
        L84:
            boolean r3 = r5.LIZIZ()
            goto L97
        L89:
            boolean r3 = r5.LIZIZ()
            goto L97
        L8e:
            boolean r3 = r5.LIZIZ()
            goto L97
        L93:
            boolean r3 = r5.LIZIZ()
        L97:
            r2 = r2 ^ r3
            goto L13
        L9a:
            boolean r2 = r5.LIZ()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74220TAy.LIZJ(int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                LinearLayout LIZ = q.LIZ(context, 1);
                ViewGroup.LayoutParams LJ = b.LJ((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 122.0f, resources.getDisplayMetrics()), viewGroup);
                TuxIconView LIZIZ = C08880Wm.LIZIZ(context, R.id.ebu);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
                new i();
                i.LIZ("app:tux_iconWidth", new a.d("36", "dp"), LIZIZ, layoutParams);
                i.LIZ("app:tux_iconHeight", new a.d("36", "dp"), LIZIZ, layoutParams);
                i.LIZ("app:tux_tintColor", new a.b("2130968763", "attr"), LIZIZ, layoutParams);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
                }
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
                    ((DrawerLayout$LayoutParams) layoutParams).gravity = 1;
                }
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    LIZ.addView(LIZIZ, layoutParams);
                }
                TuxTextView LIZJ = C06420Na.LIZJ(context, R.id.c7z);
                LIZJ.setMaxWidth((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
                LIZJ.setMaxLines(1);
                LIZJ.setEllipsize(TextUtils.TruncateAt.END);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.go});
                LIZJ.setTextColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
                    ((DrawerLayout$LayoutParams) layoutParams2).gravity = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics());
                }
                if (C06460Ne.LIZIZ("P3_Regular", "app:tux_font", LIZJ, layoutParams2, LIZJ) == null) {
                    LIZ.addView(LIZJ, layoutParams2);
                }
                b.LIZ(LIZ);
                LIZ.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZ);
                }
                return LIZ;
            case 1:
                Resources resources2 = context.getResources();
                RelativeLayout relativeLayout = new RelativeLayout(context);
                relativeLayout.setFitsSystemWindows(true);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -1, viewGroup);
                LinearLayout LIZ2 = q.LIZ(context, 1);
                ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                FrameLayout LIZIZ2 = TB3.LIZIZ(context, R.id.gwg);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                b.LIZ(LIZIZ2);
                if (LIZIZ2.getParent() == null) {
                    LIZ2.addView(LIZIZ2, layoutParams4);
                }
                C223318pb c223318pb = new C223318pb(context, null, 6);
                c223318pb.setId(R.id.itq);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
                    layoutParams5.weight = 1;
                }
                b.LIZ(c223318pb);
                if (c223318pb.getParent() == null) {
                    LIZ2.addView(c223318pb, layoutParams5);
                }
                FrameLayout LIZIZ3 = TB3.LIZIZ(context, R.id.aod);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                b.LIZ(LIZIZ3);
                if (LIZIZ3.getParent() == null) {
                    LIZ2.addView(LIZIZ3, layoutParams6);
                }
                b.LIZ(LIZ2);
                if (LIZ2.getParent() == null) {
                    relativeLayout.addView(LIZ2, layoutParams3);
                }
                View LIZIZ4 = TB3.LIZIZ(context, R.id.ked);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
                    layoutParams7.addRule(10, -1);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) TypedValue.applyDimension(1, 52.0f, resources2.getDisplayMetrics());
                }
                b.LIZ(LIZIZ4);
                if (LIZIZ4.getParent() == null) {
                    relativeLayout.addView(LIZIZ4, layoutParams7);
                }
                View LIZIZ5 = TB3.LIZIZ(context, R.id.ir0);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    layoutParams8.addRule(12, -1);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    layoutParams8.addRule(14, -1);
                }
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    ((LinearLayout.LayoutParams) layoutParams8).gravity = 81;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    ((FrameLayout.LayoutParams) layoutParams8).gravity = 81;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
                    ((DrawerLayout$LayoutParams) layoutParams8).gravity = 81;
                }
                b.LIZ(LIZIZ5);
                if (LIZIZ5.getParent() == null) {
                    relativeLayout.addView(LIZIZ5, layoutParams8);
                }
                b.LIZ(relativeLayout);
                relativeLayout.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(relativeLayout);
                }
                return relativeLayout;
            default:
                context.getResources();
                View frameLayout = new FrameLayout(context);
                ViewGroup.LayoutParams LJ3 = b.LJ(-1, -1, viewGroup);
                b.LIZ(frameLayout);
                frameLayout.setLayoutParams(LJ3);
                if (viewGroup != null && z) {
                    viewGroup.addView(frameLayout);
                }
                return frameLayout;
        }
    }
}
