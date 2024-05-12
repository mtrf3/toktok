package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.AbstractC72800Shg;
import X.AbstractC74312TEm;
import X.C73300Spk;
import X.C74307TEh;
import X.C74310TEk;
import X.C74311TEl;
import X.C74316TEq;
import X.InterfaceC46204IBk;
import X.OSZ;
import X.T4J;
import X.TEF;
import X.TEZ;
import X.TF1;
import X.TF7;
import X.TFB;
import Y.AObserverS80S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SearchStickerViewModel extends StickerListViewModel implements TF1 {
    public final MutableLiveData<C74311TEl> LJLLLLLL;
    public final MutableLiveData<OSZ<String, List<String>>> LJLZ;
    public final MutableLiveData<AbstractC72800Shg> LJZ;
    public final MutableLiveData<TF7> LJZI;
    public final MutableLiveData<String> LJZL;
    public C74316TEq LL;
    public long LLD;
    public final MutableLiveData<Boolean> LLF;
    public final MutableLiveData<String> LLFF;
    public AbstractC74312TEm LLFFF;
    public final MutableLiveData LLFII;
    public final MutableLiveData LLFZ;
    public final MutableLiveData LLI;
    public final MutableLiveData LLIFFJFJJ;
    public String LLII;

    public SearchStickerViewModel() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.T4I
    public final void do0(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    public final T4J<Effect> iv0() {
        return new C73300Spk();
    }

    public final C74316TEq mv0() {
        C74316TEq c74316TEq = this.LL;
        if (c74316TEq != null) {
            return c74316TEq;
        }
        return new C74316TEq(this.LJLJLLL.LJJIL().LJLIL, "", 0, null, null, 954);
    }

    @Override // X.TF1
    public final void sl() {
        this.LLFF.setValue("");
        C74307TEh c74307TEh = C74307TEh.LIZ;
        o.LJIIIZ(c74307TEh, "<set-?>");
        this.LLFFF = c74307TEh;
    }

    @Override // X.TF1
    public final MutableLiveData Cr() {
        return this.LLIFFJFJJ;
    }

    @Override // X.TF1
    public final MutableLiveData HP() {
        return this.LLFII;
    }

    @Override // X.TF1
    public final MutableLiveData WB() {
        return this.LLFZ;
    }

    @Override // X.TF1
    public final String getHost() {
        return this.LLII;
    }

    @Override // X.TF1
    public final /* bridge */ /* synthetic */ MutableLiveData getKeyword() {
        return this.LLFF;
    }

    @Override // X.TF1
    public final AbstractC74312TEm lP() {
        return this.LLFFF;
    }

    @Override // X.TF1
    public final MutableLiveData r30() {
        return this.LLI;
    }

    @Override // X.TF1
    public final void Z0(String str) {
        this.LJZL.setValue(str);
    }

    @Override // X.TF1
    public void hi0(C74316TEq c74316TEq) {
        this.LLFF.setValue(c74316TEq.LJLJI);
        this.LL = c74316TEq;
        this.LLD = System.currentTimeMillis();
        this.LJLJLLL.LJJJJLL().LJIIJJI(c74316TEq);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchStickerViewModel(LifecycleOwner lifecycleOwner, TEZ stickerDataManager, InterfaceC46204IBk clickController, TEF tagHandler) {
        super(lifecycleOwner, stickerDataManager, clickController, tagHandler, null, false, 16);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
        MutableLiveData<C74311TEl> mutableLiveData = new MutableLiveData<>();
        this.LJLLLLLL = mutableLiveData;
        this.LJLZ = new MutableLiveData<>();
        MutableLiveData<AbstractC72800Shg> mutableLiveData2 = new MutableLiveData<>();
        this.LJZ = mutableLiveData2;
        MutableLiveData<TF7> mutableLiveData3 = new MutableLiveData<>();
        this.LJZI = mutableLiveData3;
        this.LJZL = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.LLF = mutableLiveData4;
        this.LLFF = new MutableLiveData<>();
        this.LLFFF = C74307TEh.LIZ;
        this.LLFII = mutableLiveData;
        this.LLFZ = mutableLiveData2;
        this.LLI = mutableLiveData3;
        this.LLIFFJFJJ = mutableLiveData4;
        this.LLII = "";
        stickerDataManager.LJJJJLL().LIZ().LJI().observe(lifecycleOwner, new AObserverS80S0100000_12(this, 137));
        stickerDataManager.LJJJJLL().LIZ().LJFF().observe(lifecycleOwner, new AObserverS80S0100000_12(this, 138));
        C74310TEk.LIZIZ(stickerDataManager.LJJJJLL().LIZ(), false, 14).observe(lifecycleOwner, new TFB(this, stickerDataManager, lifecycleOwner));
        this.LJLJLLL.LJJJJLL().LJIILLIIL(stickerDataManager.LJJIL().LJLIL);
        System.currentTimeMillis();
    }
}
