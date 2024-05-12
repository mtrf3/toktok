package com.ss.android.ugc.aweme.dsp.ui.brand;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C243119gR;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C76800UCe;
import X.C7MY;
import X.C80932VpY;
import X.C90903hW;
import X.SU2;
import X.SU5;
import X.W5F;
import X.W5U;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTMSheetDialogFragment extends BaseFragment {
    public Bitmap LJLIL;
    public MusicInfo LJLJJI;
    public int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(SU2.LJLIL);
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public String LJLJL = "";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Bitmap bitmap = this.LJLIL;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.LJLILLLLZI.dispose();
        _$_clearFindViewByIdCache();
    }

    public final void vl(ImageUrlModel imageUrlModel) {
        if (!this.viewValid) {
            return;
        }
        W5F LJII = W5U.LJII(imageUrlModel);
        LJII.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.f12);
        LJII.LIZLLL(new SU5(this));
    }

    public final void wl(Bitmap bitmap) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        C80932VpY c80932VpY = new C80932VpY(25, 3, mo49getActivity);
        int LIZIZ = C7MY.LIZIZ(150);
        Bitmap createBitmap = Bitmap.createBitmap(LIZIZ, LIZIZ, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int LIZIZ2 = C7MY.LIZIZ(25);
        int LIZIZ3 = C7MY.LIZIZ(100) + LIZIZ2;
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(LIZIZ2, LIZIZ2, LIZIZ3, LIZIZ3), (Paint) null);
        canvas.save();
        Bitmap createBitmap2 = Bitmap.createBitmap(LIZIZ, LIZIZ, Bitmap.Config.ARGB_8888);
        c80932VpY.process(createBitmap2, createBitmap);
        createBitmap.recycle();
        C243119gR.LIZIZ(new AqS159S0200000_12(this, createBitmap2, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.ui.brand.TTMSheetDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bvf, viewGroup, false);
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
