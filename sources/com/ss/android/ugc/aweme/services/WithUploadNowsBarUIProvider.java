package com.ss.android.ugc.aweme.services;

import X.AbstractC46011I3z;
import X.ActivityC45651qj;
import X.C165706es;
import X.C26338AVi;
import X.C32151Nz;
import X.C44260HYq;
import X.C45693HwX;
import X.C45743HxL;
import X.C46026I4o;
import X.C46029I4r;
import X.C60903NvH;
import X.KL2;
import X.O6R;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class WithUploadNowsBarUIProvider extends AbstractC46011I3z {
    public static final Companion Companion = new Companion();
    public final ActivityC45651qj activity;
    public C46026I4o btnUpload;
    public final boolean isCombineMode;

    @Override // X.AbstractC46011I3z
    public int getBottomLayoutRes() {
        return R.layout.blb;
    }

    private final void initUploadClickEventIfNeeded() {
        if (C44260HYq.LIZ()) {
            C46026I4o c46026I4o = this.btnUpload;
            if (c46026I4o != null) {
                c46026I4o.LIZJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                C46026I4o c46026I4o2 = this.btnUpload;
                if (c46026I4o2 != null) {
                    c46026I4o2.setDefaultIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                } else {
                    o.LJIJI("btnUpload");
                    throw null;
                }
            } else {
                o.LJIJI("btnUpload");
                throw null;
            }
        }
        if (C46029I4r.LIZ()) {
            C46026I4o c46026I4o3 = this.btnUpload;
            if (c46026I4o3 != null) {
                c46026I4o3.LIZLLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
                C46026I4o c46026I4o4 = this.btnUpload;
                if (c46026I4o4 != null) {
                    c46026I4o4.setDefaultIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                } else {
                    o.LJIJI("btnUpload");
                    throw null;
                }
            } else {
                o.LJIJI("btnUpload");
                throw null;
            }
        }
        ((FirstPhotoViewModel) C165706es.LJII(get_flashView(), null, 6).get(FirstPhotoViewModel.class)).LJLIL.observe(C60903NvH.LJIIJJI().LJIL().LIZ(this.activity), new Observer() { // from class: com.ss.android.ugc.aweme.services.WithUploadNowsBarUIProvider$initUploadClickEventIfNeeded$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(C45743HxL c45743HxL) {
                if (c45743HxL != null) {
                    C46026I4o c46026I4o5 = WithUploadNowsBarUIProvider.this.btnUpload;
                    if (c46026I4o5 != null) {
                        c46026I4o5.LIZ(true, c45743HxL.LJLIL.LJLIL, c45743HxL.LJLILLLLZI, C45693HwX.LIZ);
                    } else {
                        o.LJIJI("btnUpload");
                        throw null;
                    }
                }
            }
        });
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public WithUploadNowsBarUIProvider(ActivityC45651qj activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.activity = activity;
        this.isCombineMode = z;
    }

    @Override // X.AbstractC46011I3z
    public void onViewCreated(View view, boolean z) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, z);
        View findViewById = view.findViewById(R.id.e_h);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.ic_title_right)");
        set_flashView((TuxIconView) findViewById);
        View findViewById2 = view.findViewById(R.id.g3e);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.ll_flip)");
        set_flipView(findViewById2);
        this._uploadBtn = getBottomLayout().findViewById(R.id.b06);
        View findViewById3 = getBottomLayout().findViewById(R.id.b06);
        o.LJIIIIZZ(findViewById3, "bottomLayout.findViewById(R.id.btn_upload)");
        this.btnUpload = (C46026I4o) findViewById3;
        if (!this.isCombineMode) {
            C26338AVi.LJI(get_flipView(), 0, 0, Integer.valueOf((int) KL2.LIZJ(view.getContext(), 34.5f)), 0, false, 16);
            View findViewById4 = getBottomLayout().findViewById(R.id.gk5);
            o.LJIIIIZZ(findViewById4, "bottomLayout.findViewByI…iew>(R.id.misc_container)");
            C26338AVi.LJIIIZ(findViewById4, Integer.valueOf((int) KL2.LIZJ(view.getContext(), 34.5f)), 0, 0, 0, 16);
        }
        initUploadClickEventIfNeeded();
    }
}
