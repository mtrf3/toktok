package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TGA implements IDH {
    public final MutableLiveData<Integer> LJLIL;
    public final MutableLiveData<IStickerService.FaceSticker> LJLILLLLZI;
    public final MutableLiveData<StickerTagChangeData> LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final List<TGM> LJLJJL;
    public final List<TGR> LJLJJLL;
    public final TGG LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final T42 LJLJLLL;
    public final LifecycleOwner LJLL;
    public final TEZ LJLLI;

    public final TGH LIZLLL() {
        return (TGH) this.LJLJLJ.getValue();
    }

    @Override // X.TGH
    public final TGV Kj() {
        return LIZLLL().Kj();
    }

    @Override // X.TGO
    public final List<TGT> LIZ() {
        return LIZLLL().LIZ();
    }

    @Override // X.TGH
    public final void Mi() {
        LIZLLL().Mi();
    }

    @Override // X.TGH
    public final AbstractC73672Svk<THZ> Rc() {
        return LIZLLL().Rc();
    }

    @Override // X.TGH
    public final ViewGroup Uh() {
        return LIZLLL().Uh();
    }

    @Override // X.TGH
    public final void Z8() {
        LIZLLL().Z8();
    }

    @Override // X.TGH
    public final View cb() {
        return LIZLLL().cb();
    }

    @Override // X.TGH
    public final void hide() {
        LIZLLL().hide();
    }

    @Override // X.TGH
    public final boolean isShowing() {
        return LIZLLL().isShowing();
    }

    @Override // X.TGH
    public final void prepare() {
        LIZLLL().prepare();
    }

    @Override // X.TGH
    public final void show() {
        LIZLLL().show();
    }

    @Override // X.TGQ
    public final AbstractC73672Svk<Integer> yg() {
        return LIZLLL().yg();
    }

    @Override // X.IDH
    public final T42 I9() {
        return this.LJLJLLL;
    }

    @Override // X.IDH
    public final /* bridge */ /* synthetic */ MutableLiveData K() {
        return this.LJLJJI;
    }

    @Override // X.IDH
    public final /* bridge */ /* synthetic */ MutableLiveData Za() {
        return this.LJLJI;
    }

    @Override // X.IDH
    public final void Ce(Observer<StickerTagChangeData> observer) {
        this.LJLJI.observe(this.LJLL, observer);
    }

    @Override // X.TGW
    public final void Hc(int i) {
        LIZLLL().Hc(i);
    }

    @Override // X.TGO
    public final void LIZIZ(TGT stickerBarView) {
        o.LJIIIZ(stickerBarView, "stickerBarView");
        LIZLLL().LIZIZ(stickerBarView);
    }

    public final void LIZJ(IDF idf) {
        if (!((ArrayList) this.LJLJJLL).contains(idf)) {
            ((ArrayList) this.LJLJJLL).add(idf);
        }
    }

    @Override // X.IDH
    public final void Xi(TGM tgm) {
        if (!((ArrayList) this.LJLJJL).contains(tgm)) {
            ((ArrayList) this.LJLJJL).add(tgm);
        }
    }

    @Override // X.TGH
    public final void bb(boolean z) {
        LIZLLL().bb(false);
    }

    @Override // X.TGW
    public final void d9(List<EffectCategoryModel> list) {
        o.LJIIIZ(list, "list");
        LIZLLL().d9(list);
    }

    public TGA(LifecycleOwner lifecycleOwner, TEZ stickerDataManager) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LJLL = lifecycleOwner;
        this.LJLLI = stickerDataManager;
        this.LJLIL = new MutableLiveData<>();
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new TGG(this);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 24));
        this.LJLJLLL = new T42();
    }

    @Override // X.TGH
    public final void B0(String stickerName, AqS159S0200000_12 aqS159S0200000_12) {
        o.LJIIIZ(stickerName, "stickerName");
        LIZLLL().B0(stickerName, aqS159S0200000_12);
    }

    @Override // X.TGH
    public final void n4(String str, List list, AqS101S0300000_12 aqS101S0300000_12) {
        LIZLLL().n4(str, list, aqS101S0300000_12);
    }
}
