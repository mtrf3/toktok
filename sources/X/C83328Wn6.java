package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.ComposerHelper;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wn6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83328Wn6 extends ESP implements TGM {
    public final InterfaceC65784Pro<String> LJLILLLLZI;
    public final C29S LJLJI;
    public final TEZ LJLJJI;
    public final InterfaceC83192Wku LJLJJL;
    public final TKR LJLJJLL;
    public final List<ComposerNode> LJLJL;
    public final C65737Pr3 LJLJLJ;
    public final MutableLiveData<List<ComposerNode>> LJLJLLL;
    public C5H3<? extends InterfaceC74281TDh> LJLL;

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.ESP
    public final void LJIIJJI() {
        C5H3<? extends InterfaceC74281TDh> c5h3;
        InterfaceC74281TDh value;
        C5H3<? extends InterfaceC74281TDh> c5h32 = this.LJLL;
        if (c5h32 != null && c5h32.isInitialized() && (c5h3 = this.LJLL) != null && (value = c5h3.getValue()) != null) {
            value.hideStickerView();
        }
        LJIILIIL();
    }

    public final void LJIILIIL() {
        C5H3<? extends InterfaceC74281TDh> c5h3;
        InterfaceC74281TDh value;
        C5H3<? extends InterfaceC74281TDh> c5h32 = this.LJLL;
        if (c5h32 != null && c5h32.isInitialized() && (c5h3 = this.LJLL) != null && (value = c5h3.getValue()) != null) {
            value.LIZLLL();
        }
        this.LJLJLJ.clear();
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        if (this.LJLL != null) {
            return;
        }
        this.LJLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS161S0200000_14(this, stickerView, 77));
    }

    @Override // X.ESP
    public final boolean LJIIJ(T4Q session) {
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        if (effect != null && effect.getTypes() != null && effect.getTypes().contains("Composer")) {
            return true;
        }
        return false;
    }

    @Override // X.ESP
    public final void LJIIL(ERS result, T4Q session) {
        InterfaceC74281TDh value;
        InterfaceC74281TDh value2;
        o.LJIIIZ(result, "result");
        o.LJIIIZ(session, "session");
        C5H3<? extends InterfaceC74281TDh> c5h3 = this.LJLL;
        if (c5h3 != null && (value2 = c5h3.getValue()) != null) {
            value2.LIZ();
        }
        Effect effect = session.LIZ;
        ComposerNode parseComposerMaterial = ComposerHelper.parseComposerMaterial(effect.getUnzipPath(), this.LJLILLLLZI.invoke(), new File(effect.getUnzipPath()).getParent());
        C5H3<? extends InterfaceC74281TDh> c5h32 = this.LJLL;
        if (c5h32 == null || (value = c5h32.getValue()) == null) {
            return;
        }
        value.LIZJ(parseComposerMaterial);
    }

    public C83328Wn6(C44189HVx effectSdkVersion, C29S activity, TEZ stickerDataManager, InterfaceC83727WtX composer, TKR configure) {
        o.LJIIIZ(effectSdkVersion, "effectSdkVersion");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(composer, "composer");
        o.LJIIIZ(configure, "configure");
        this.LJLILLLLZI = effectSdkVersion;
        this.LJLJI = activity;
        this.LJLJJI = stickerDataManager;
        this.LJLJJL = composer;
        this.LJLJJLL = configure;
        this.LJLJL = new ArrayList();
        C65737Pr3 c65737Pr3 = new C65737Pr3(this);
        this.LJLJLJ = c65737Pr3;
        MutableLiveData<List<ComposerNode>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(c65737Pr3);
        this.LJLJLLL = mutableLiveData;
    }
}
