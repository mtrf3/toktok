package Y;

import X.C76900UGa;
import X.C81091Vs7;
import X.C81098VsE;
import X.UGO;
import X.UGR;
import X.UGS;
import X.UGT;
import X.UGV;
import X.UJX;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDCListenerS259S0100000_13 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS259S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        EmoteEditDialogFragment emoteEditDialogFragment = (EmoteEditDialogFragment) iDCListenerS259S0100000_13.l0;
        if (emoteEditDialogFragment.LJLJLJ == null) {
            emoteEditDialogFragment.LJLJLJ = ((UGS) emoteEditDialogFragment._$_findCachedViewById(R.id.i24)).getVisibleRect();
            ((C81091Vs7) ((EmoteEditDialogFragment) iDCListenerS259S0100000_13.l0)._$_findCachedViewById(R.id.f12)).setDisplayWindowRect(((EmoteEditDialogFragment) iDCListenerS259S0100000_13.l0).LJLJLJ);
        }
    }

    public static final void onLayoutChange$1(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = (SpotlightImageListPreviewDialogFragment) iDCListenerS259S0100000_13.l0;
        if (spotlightImageListPreviewDialogFragment.LJLL == null) {
            spotlightImageListPreviewDialogFragment.LJLL = ((UGS) spotlightImageListPreviewDialogFragment._$_findCachedViewById(R.id.i24)).getVisibleRect();
            ((C81091Vs7) ((SpotlightImageListPreviewDialogFragment) iDCListenerS259S0100000_13.l0)._$_findCachedViewById(R.id.f12)).setDisplayWindowRect(((SpotlightImageListPreviewDialogFragment) iDCListenerS259S0100000_13.l0).LJLL);
        }
    }

    public static final void onLayoutChange$2(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = (SpotlightImageEditDialogFragment) iDCListenerS259S0100000_13.l0;
        if (spotlightImageEditDialogFragment.LJLJLJ == null) {
            spotlightImageEditDialogFragment.LJLJLJ = ((UGS) spotlightImageEditDialogFragment._$_findCachedViewById(R.id.i24)).getVisibleRect();
            ((C81091Vs7) ((SpotlightImageEditDialogFragment) iDCListenerS259S0100000_13.l0)._$_findCachedViewById(R.id.f12)).setDisplayWindowRect(((SpotlightImageEditDialogFragment) iDCListenerS259S0100000_13.l0).LJLJLJ);
        }
    }

    public static final void onLayoutChange$3(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CropActivity cropActivity = (CropActivity) iDCListenerS259S0100000_13.l0;
        if (cropActivity.LLFF == null) {
            C76900UGa c76900UGa = cropActivity.LJLJI;
            if (c76900UGa != null) {
                cropActivity.LLFF = c76900UGa.getVisibleRect();
                CropActivity cropActivity2 = (CropActivity) iDCListenerS259S0100000_13.l0;
                C81098VsE c81098VsE = cropActivity2.LJLILLLLZI;
                if (c81098VsE != null) {
                    c81098VsE.setDisplayWindowRect(cropActivity2.LLFF);
                    return;
                } else {
                    o.LJIJI("mCoverImage");
                    throw null;
                }
            }
            o.LJIJI("mCoverWindow");
            throw null;
        }
    }

    public static final void onLayoutChange$4(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        UGT ugt = (UGT) iDCListenerS259S0100000_13.l0;
        if (ugt.LJLJJL == null) {
            UGV ugv = ugt.LJLJI;
            if (ugv != null) {
                ugt.LJLJJL = ugv.getVisibleRect();
                UGT ugt2 = (UGT) iDCListenerS259S0100000_13.l0;
                C81091Vs7 c81091Vs7 = ugt2.LJLILLLLZI;
                if (c81091Vs7 != null) {
                    c81091Vs7.setDisplayWindowRect(ugt2.LJLJJL);
                    return;
                } else {
                    o.LJIJI("mCoverImage");
                    throw null;
                }
            }
            o.LJIJI("mCoverWindow");
            throw null;
        }
    }

    public static final void onLayoutChange$5(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        UGO ugo = (UGO) iDCListenerS259S0100000_13.l0;
        if (ugo.LJLJJLL == null) {
            UGR ugr = ugo.LJLJI;
            if (ugr != null) {
                ugo.LJLJJLL = ugr.getVisibleRect();
                UGO ugo2 = (UGO) iDCListenerS259S0100000_13.l0;
                C81091Vs7 c81091Vs7 = ugo2.LJLILLLLZI;
                if (c81091Vs7 != null) {
                    c81091Vs7.setDisplayWindowRect(ugo2.LJLJJLL);
                    return;
                } else {
                    o.LJIJI("mCoverImage");
                    throw null;
                }
            }
            o.LJIJI("mCoverWindow");
            throw null;
        }
    }

    public static final void onLayoutChange$6(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int abs = Math.abs(i2 - i4);
        if (abs > 0) {
            UJX ujx = (UJX) iDCListenerS259S0100000_13.l0;
            if (abs != ujx.LJLJJL) {
                ujx.LJLJJL = abs;
                UJX.LIZLLL(ujx, false, false, 3);
            }
        }
    }

    public static final void onLayoutChange$7(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int abs = Math.abs(i2 - i4);
        if (abs > 0) {
            UJX ujx = (UJX) iDCListenerS259S0100000_13.l0;
            if (abs != ujx.LJLJJLL) {
                ujx.LJLJJLL = abs;
                UJX.LIZLLL(ujx, false, false, 3);
            }
        }
    }

    public static final void onLayoutChange$8(IDCListenerS259S0100000_13 iDCListenerS259S0100000_13, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int abs = Math.abs(i2 - i4);
        if (abs > 0) {
            UJX ujx = (UJX) iDCListenerS259S0100000_13.l0;
            if (abs != ujx.LJLLLL) {
                ujx.LJLLLL = abs;
                UJX.LIZLLL(ujx, false, false, 3);
            }
        }
    }
}
