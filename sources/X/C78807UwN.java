package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.UwN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78807UwN implements InterfaceC144185lG {
    public final /* synthetic */ C81633W2b LJLIL;

    public C78807UwN(C81633W2b c81633W2b) {
        this.LJLIL = c81633W2b;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        OptionCategoryPanelFragment optionCategoryPanelFragment;
        String str;
        int itemCount;
        Fragment fragment;
        OptionCategoryFragment optionCategoryFragment;
        int i3 = 0;
        if (i != 10001 || intent == null || i2 != -1) {
            return false;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra != null) {
            arrayList = new ArrayList(C32I.LJJL(parcelableArrayListExtra, 10));
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                arrayList.add(((MediaModel) it.next()).fileLocalUriPath);
            }
        } else {
            arrayList = null;
        }
        WeakReference<OptionCategoryPanelFragment> weakReference = this.LJLIL.LJLLI;
        if (weakReference != null && (optionCategoryPanelFragment = weakReference.get()) != null) {
            if (arrayList == null || (str = (String) ListProtector.get(arrayList, 0)) == null) {
                str = "";
            }
            C0CM c0cm = optionCategoryPanelFragment.LJLJI;
            if (c0cm != null) {
                AbstractC029409q adapter = c0cm.getAdapter();
                if (adapter == null || (itemCount = adapter.getItemCount()) < 0) {
                    return true;
                }
                while (true) {
                    FragmentManager fragmentManager = optionCategoryPanelFragment.getFragmentManager();
                    if (fragmentManager != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('f');
                        LIZ.append(i3);
                        fragment = fragmentManager.LJJJIL(X1D.LIZIZ(LIZ));
                    } else {
                        fragment = null;
                    }
                    if ((fragment instanceof OptionCategoryFragment) && (optionCategoryFragment = (OptionCategoryFragment) fragment) != null && optionCategoryFragment.LJLJLJ) {
                        OptionCategoryViewModel optionCategoryViewModel = (OptionCategoryViewModel) optionCategoryFragment.LJLJLLL.getValue();
                        optionCategoryViewModel.getClass();
                        XKX.LIZLLL(ViewModelKt.getViewModelScope(optionCategoryViewModel), null, null, new C9Q9(optionCategoryViewModel, str, null), 3);
                    }
                    if (i3 != itemCount) {
                        i3++;
                    } else {
                        return true;
                    }
                }
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        } else {
            return true;
        }
    }
}
