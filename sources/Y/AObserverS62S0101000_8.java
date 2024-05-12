package Y;

import X.C207668Da;
import X.C50420Jqa;
import X.EQB;
import X.InterfaceC88472Yns;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcBaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.ProgressBarDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS174S0100000_8;

/* loaded from: classes9.dex */
public class AObserverS62S0101000_8 implements Observer {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AObserverS62S0101000_8(AqS174S0100000_8 aqS174S0100000_8, int i) {
        this.$t = i;
        this.i1 = 5;
        this.l0 = aqS174S0100000_8;
    }

    public static final void onChanged$0(AObserverS62S0101000_8 aObserverS62S0101000_8, Object obj) {
        boolean z;
        Fragment fragment = (Fragment) aObserverS62S0101000_8.l0;
        if (((Integer) obj).intValue() == aObserverS62S0101000_8.i1) {
            z = true;
        } else {
            z = false;
        }
        fragment.setUserVisibleHint(z);
    }

    public static final void onChanged$1(AObserverS62S0101000_8 aObserverS62S0101000_8, Object obj) {
        switch (aObserverS62S0101000_8.i1) {
            case 0:
                EcBaseDiscoverAndSearchFragmentNew ecBaseDiscoverAndSearchFragmentNew = (EcBaseDiscoverAndSearchFragmentNew) ((AmeBaseFragment) aObserverS62S0101000_8.l0);
                Boolean bool = (Boolean) obj;
                ecBaseDiscoverAndSearchFragmentNew.getClass();
                ecBaseDiscoverAndSearchFragmentNew.LL = bool.booleanValue();
                if (bool.booleanValue()) {
                    ecBaseDiscoverAndSearchFragmentNew.cm();
                    return;
                }
                return;
            default:
                StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) ((AmeBaseFragment) aObserverS62S0101000_8.l0);
                stickerPropDetailFragment.getClass();
                if (obj instanceof EQB) {
                    FragmentManager fragmentManager = stickerPropDetailFragment.getFragmentManager();
                    if (fragmentManager == null) {
                        return;
                    }
                    if (stickerPropDetailFragment.LLLJIL == null) {
                        ProgressBarDialog progressBarDialog = new ProgressBarDialog(R.string.fyy);
                        stickerPropDetailFragment.LLLJIL = progressBarDialog;
                        progressBarDialog.setCancelable(false);
                    }
                    stickerPropDetailFragment.LLLJIL.show(fragmentManager, "deletionEffectDialog");
                    return;
                }
                ProgressBarDialog progressBarDialog2 = stickerPropDetailFragment.LLLJIL;
                if (progressBarDialog2 == null) {
                    return;
                }
                progressBarDialog2.dismiss();
                return;
        }
    }

    public static final void onChanged$2(AObserverS62S0101000_8 aObserverS62S0101000_8, Object obj) {
        boolean z;
        Fragment fragment = (Fragment) aObserverS62S0101000_8.l0;
        if (((Integer) obj).intValue() == aObserverS62S0101000_8.i1) {
            z = true;
        } else {
            z = false;
        }
        fragment.setUserVisibleHint(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$3(AObserverS62S0101000_8 aObserverS62S0101000_8, Object obj) {
        C207668Da c207668Da = (C207668Da) obj;
        C50420Jqa c50420Jqa = null;
        if (c207668Da != null) {
            Object obj2 = c207668Da.LIZIZ;
            if (obj2 != 0) {
                c50420Jqa = obj2;
            }
            c50420Jqa = c50420Jqa;
        }
        int i = aObserverS62S0101000_8.i1;
        if (i == -1 || (c50420Jqa != null && c50420Jqa.LJLIL == i)) {
            ((InterfaceC88472Yns) aObserverS62S0101000_8.l0).invoke(c50420Jqa);
        }
    }

    public AObserverS62S0101000_8(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
