package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C30581Hy;
import X.C73340SqO;
import X.C74310TEk;
import X.C78866UxK;
import X.C82894Wg6;
import X.InterfaceC74359TGh;
import X.TEN;
import X.TEZ;
import X.TGS;
import X.TPM;
import Y.AObserverS80S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class StickerCategoryListViewModel extends HumbleViewModel implements TGS {
    public long LJLIL;
    public int LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;
    public final MutableLiveData LJLJJI;
    public final MutableLiveData<TEN> LJLJJL;
    public final MutableLiveData LJLJJLL;
    public final MutableLiveData<List<EffectCategoryModel>> LJLJL;
    public final MediatorLiveData LJLJLJ;
    public final LifecycleOwner LJLJLLL;
    public final TEZ LJLL;
    public final InterfaceC74359TGh LJLLI;

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void gv0() {
        List<EffectCategoryModel> LJIILJJIL = C30581Hy.LJIILJJIL(this.LJLL.LJJJJLL().LIZ());
        int i = 0;
        if (!(LJIILJJIL instanceof Collection) || !LJIILJJIL.isEmpty()) {
            Iterator<EffectCategoryModel> it = LJIILJJIL.iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (key == null || key.length() == 0) {
                    String str = this.LJLL.LJJIL().LJLJJLL;
                    if (str != null) {
                        this.LJLILLLLZI = C78866UxK.LJJIIZ(this.LJLL, str);
                    } else {
                        this.LJLILLLLZI = C78866UxK.LJJIJ(this.LJLL);
                    }
                    this.LJLJL.setValue(LJIILJJIL);
                }
            }
        }
        String str2 = this.LJLL.LJJIL().LJLJJLL;
        if (str2 != null) {
            this.LJLILLLLZI = C78866UxK.LJJIIZ(this.LJLL, str2);
        } else {
            List LJIILJJIL2 = C30581Hy.LJIILJJIL(this.LJLL.LJJJJLL().LIZ());
            int size = LJIILJJIL2.size();
            int LJIJJLI = this.LJLL.LJIJJLI();
            if (LJIJJLI < 0 || size <= LJIJJLI) {
                int LJJIJ = C78866UxK.LJJIJ(this.LJLL);
                int size2 = LJIILJJIL2.size();
                if (LJJIJ >= 0 && size2 > LJJIJ) {
                    i = LJJIJ;
                }
            } else {
                i = this.LJLL.LJIJJLI();
            }
            this.LJLILLLLZI = i;
        }
        this.LJLJI.setValue(Boolean.TRUE);
        this.LJLJL.setValue(LJIILJJIL);
    }

    @Override // X.TGS
    public final void ih() {
        this.LJLIL = System.currentTimeMillis();
        C74310TEk.LIZIZ(this.LJLL.LJJJJLL().LIZ(), this.LJLL.LJJIL().LJLJLJ, 7).observe(this.LJLJLLL, new AObserverS80S0100000_12(this, 31));
    }

    @Override // X.TGS
    public final MediatorLiveData Ep() {
        return this.LJLJLJ;
    }

    @Override // X.TGS
    public final int Yp0() {
        return this.LJLILLLLZI;
    }

    @Override // X.TGS
    public final LiveData<Boolean> Zj() {
        return this.LJLJJI;
    }

    @Override // X.TGS
    public final LiveData<TEN> getPageState() {
        return this.LJLJJLL;
    }

    @Override // X.TGS
    public final void fa0(TPM request) {
        o.LJIIIZ(request, "request");
        this.LJLL.LJJJJLL().LJIILJJIL(request);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerCategoryListViewModel(LifecycleOwner lifecycleOwner, TEZ stickerDataManager, InterfaceC74359TGh monitor) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(monitor, "monitor");
        this.LJLJLLL = lifecycleOwner;
        this.LJLL = stickerDataManager;
        this.LJLLI = monitor;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLJI = mutableLiveData;
        this.LJLJJI = mutableLiveData;
        MutableLiveData<TEN> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJL = mutableLiveData2;
        this.LJLJJLL = mutableLiveData2;
        MutableLiveData<List<EffectCategoryModel>> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJL = mutableLiveData3;
        this.LJLJLJ = C73340SqO.LJIILL(mutableLiveData3);
        if (C82894Wg6.LIZIZ.LIZJ().LIZJ()) {
            mutableLiveData2.setValue(TEN.LOADING);
        }
        gv0();
    }
}
