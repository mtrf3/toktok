package com.ss.android.ugc.aweme.shortvideo.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AdvAuthPermissionFragment extends Fragment implements InterfaceC219588ja {
    public LinearLayout LJLIL;
    public LinearLayout LJLILLLLZI;
    public ImageView LJLJI;
    public ImageView LJLJJI;
    public Drawable LJLJJL;
    public Drawable LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 289));
        c235119Kp.LIZIZ(LIZJ);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.sdz);
        o.LJIIIIZZ(string, "getString(R.string.title_view_control)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("extra.showTuxNavBarBack", false)) {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            LIZJ2.LIZIZ(new AqS157S0100000_7(this, BuildConfig.VERSION_CODE));
            c235119Kp.LIZLLL(LIZJ2);
        }
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("extra.PERMISSION");
        } else {
            i = 0;
        }
        this.LJLJL = i;
    }

    public final void vl(int i) {
        if (i == 0 && !this.LJLJLJ) {
            ImageView imageView = this.LJLJJI;
            if (imageView != null) {
                Drawable drawable = this.LJLJJL;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    ImageView imageView2 = this.LJLJI;
                    if (imageView2 != null) {
                        Drawable drawable2 = this.LJLJJLL;
                        if (drawable2 != null) {
                            imageView2.setImageDrawable(drawable2);
                            return;
                        } else {
                            o.LJIJI("mImgNormal");
                            throw null;
                        }
                    }
                    o.LJIJI("mImgPermissionAdv");
                    throw null;
                }
                o.LJIJI("mImgSelected");
                throw null;
            }
            o.LJIJI("mImgPermissionPublic");
            throw null;
        }
        ImageView imageView3 = this.LJLJJI;
        if (imageView3 != null) {
            Drawable drawable3 = this.LJLJJLL;
            if (drawable3 != null) {
                imageView3.setImageDrawable(drawable3);
                ImageView imageView4 = this.LJLJI;
                if (imageView4 != null) {
                    Drawable drawable4 = this.LJLJJL;
                    if (drawable4 != null) {
                        imageView4.setImageDrawable(drawable4);
                        return;
                    } else {
                        o.LJIJI("mImgSelected");
                        throw null;
                    }
                }
                o.LJIJI("mImgPermissionAdv");
                throw null;
            }
            o.LJIJI("mImgNormal");
            throw null;
        }
        o.LJIJI("mImgPermissionPublic");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
    
        if (r1 == true) goto L17;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            super.onViewCreated(r7, r8)
            r0 = 2131370041(0x7f0a2039, float:1.8360077E38)
            android.view.View r1 = r7.findViewById(r0)
            java.lang.String r0 = "view.findViewById(R.id.layout_permission_adv)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r6.LJLIL = r1
            r0 = 2131370042(0x7f0a203a, float:1.836008E38)
            android.view.View r1 = r7.findViewById(r0)
            java.lang.String r0 = "view.findViewById(R.id.layout_permission_public)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r6.LJLILLLLZI = r1
            r0 = 2131372833(0x7f0a2b21, float:1.836574E38)
            android.view.View r1 = r7.findViewById(r0)
            java.lang.String r0 = "view.findViewById(R.id.permission_adv_img)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.LJLJI = r1
            r0 = 2131372848(0x7f0a2b30, float:1.836577E38)
            android.view.View r1 = r7.findViewById(r0)
            java.lang.String r0 = "view.findViewById(R.id.permission_public_img)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.LJLJJI = r1
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131232840(0x7f080848, float:1.80818E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            java.lang.String r0 = "resources.getDrawable(R.….ic_tool_selection_after)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r6.LJLJJL = r1
            android.content.Context r1 = r7.getContext()
            r0 = 2131231128(0x7f080198, float:1.8078328E38)
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r1, r0)
            if (r0 != 0) goto L6c
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
        L6c:
            r6.LJLJJLL = r0
            android.widget.LinearLayout r2 = r6.LJLIL
            java.lang.String r5 = "mPermissionAdvLayout"
            r4 = 0
            if (r2 == 0) goto Le1
            Y.ACListenerS27S0100000_7 r1 = new Y.ACListenerS27S0100000_7
            r0 = 52
            r1.<init>(r6, r0)
            X.C16880lQ.LJIIZILJ(r2, r1)
            android.widget.LinearLayout r3 = r6.LJLILLLLZI
            java.lang.String r2 = "mPermissionPublicLayout"
            if (r3 == 0) goto Ldd
            Y.ACListenerS27S0100000_7 r1 = new Y.ACListenerS27S0100000_7
            r0 = 53
            r1.<init>(r6, r0)
            X.C16880lQ.LJIIZILJ(r3, r1)
            android.widget.LinearLayout r1 = r6.LJLIL
            if (r1 == 0) goto Ld9
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r0 = X.C89953fz.LIZ(r0)
            r1.setBackground(r0)
            android.widget.LinearLayout r1 = r6.LJLILLLLZI
            if (r1 == 0) goto Ld5
            android.content.Context r0 = r6.getContext()
            android.graphics.drawable.Drawable r0 = X.C89953fz.LIZ(r0)
            r1.setBackground(r0)
            X.HQ7 r0 = X.C44172HVg.LJIJ
            X.Hc3 r0 = r0.getCurrentUser()
            if (r0 == 0) goto Lcf
            boolean r1 = r0.LJIILIIL()
            r0 = 1
            if (r1 != r0) goto Lcf
        Lbc:
            r6.LJLJLJ = r0
            if (r0 == 0) goto Lc9
            android.widget.LinearLayout r1 = r6.LJLILLLLZI
            if (r1 == 0) goto Ld1
            r0 = 8
            r1.setVisibility(r0)
        Lc9:
            int r0 = r6.LJLJL
            r6.vl(r0)
            return
        Lcf:
            r0 = 0
            goto Lbc
        Ld1:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r4
        Ld5:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r4
        Ld9:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r4
        Ldd:
            kotlin.jvm.internal.o.LJIJI(r2)
            throw r4
        Le1:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.AdvAuthPermissionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aw4, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
