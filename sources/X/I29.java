package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.sticker.bean.TemplateStickerState;
import com.ss.android.ugc.aweme.utils.UniqueLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I29 implements InterfaceC74301TEb {
    public final MutableLiveData<Effect> LIZ = new MutableLiveData<>();
    public final MutableLiveData<I2A> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<I2C> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<I2B> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<C44236HXs> LJ = new MutableLiveData<>();
    public final MutableLiveData<Effect> LJFF = new MutableLiveData<>();
    public final MutableLiveData<Effect> LJI = new MutableLiveData<>();
    public final MutableLiveData<OSZ<Effect, Integer>> LJII;
    public final MutableLiveData<java.util.Map<String, Effect>> LJIIIIZZ;
    public Effect LJIIIZ;
    public final UniqueLiveData<HY3> LJIIJ;
    public final MutableLiveData<T4Q> LJIIJJI;
    public final MutableLiveData LJIIL;

    @Override // X.InterfaceC74301TEb
    public final boolean LJIIJJI() {
        I2C value = this.LIZJ.getValue();
        if (value == null || value.LJLIL == null || value.LJLILLLLZI != null) {
            return false;
        }
        return true;
    }

    public I29() {
        new MutableLiveData();
        MutableLiveData<OSZ<Effect, Integer>> mutableLiveData = new MutableLiveData<>();
        this.LJII = mutableLiveData;
        this.LJIIIIZZ = new MutableLiveData<>();
        new MutableLiveData();
        this.LJIIJ = new UniqueLiveData<>();
        this.LJIIJJI = new MutableLiveData<>();
        this.LJIIL = mutableLiveData;
        new TemplateStickerState(null, null, 3, null);
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LIZJ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC74301TEb
    public final /* bridge */ /* synthetic */ UniqueLiveData LJFF() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LJII() {
        return this.LJ;
    }

    @Override // X.InterfaceC74301TEb
    public final Effect LJIIIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LJIIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LJIILIIL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LJIILL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC74301TEb
    public final MutableLiveData LJIILLIIL() {
        return this.LJI;
    }

    @Override // X.InterfaceC74301TEb
    public final boolean LIZIZ(Effect effect) {
        List<String> children;
        Boolean valueOf;
        Effect effect2 = this.LJIIIZ;
        if (effect2 != null && (children = effect2.getChildren()) != null && effect != null && (valueOf = Boolean.valueOf(children.contains(effect.getEffectId()))) != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC74301TEb
    public final void LJ(C44236HXs c44236HXs) {
        this.LJ.setValue(c44236HXs);
        if (c44236HXs != null && !c44236HXs.LJLJJL) {
            this.LJIIJ.setValue(new HY3(c44236HXs.LJLILLLLZI, c44236HXs.LJLJJLL));
        }
    }

    @Override // X.InterfaceC74301TEb
    public final void LJIIIIZZ(Effect effect) {
        if (effect == null) {
            this.LJFF.setValue(null);
            this.LJI.setValue(null);
            return;
        }
        this.LJFF.setValue(effect);
        if (!TextUtils.isEmpty(effect.getParentId())) {
            o.LJI(effect.getParentId());
        } else {
            this.LJI.setValue(effect);
        }
    }

    @Override // X.InterfaceC74301TEb
    public final void LJIILJJIL(Effect effect) {
        Effect effect2;
        this.LIZ.setValue(effect);
        I2C value = this.LIZJ.getValue();
        if (value != null) {
            effect2 = value.LJLILLLLZI;
        } else {
            effect2 = null;
        }
        this.LIZJ.setValue(new I2C(effect2, effect));
        this.LIZIZ.setValue(null);
        this.LJIIIZ = effect;
    }

    @Override // X.InterfaceC74301TEb
    public final void LJIIZILJ(T4Q t4q) {
        this.LJIIJJI.setValue(t4q);
    }

    @Override // X.InterfaceC74301TEb
    public final void LJIIJ(int i, Effect effect) {
        this.LJII.setValue(new OSZ<>(effect, Integer.valueOf(i)));
    }

    @Override // X.InterfaceC74301TEb
    public final void LJIJ(int i, Effect effect) {
        int i2;
        I2A value = this.LIZIZ.getValue();
        if (value != null) {
            i2 = value.LJLILLLLZI;
        } else {
            i2 = -1;
        }
        if (i2 == i) {
            return;
        }
        this.LIZ.setValue(effect);
        I2A value2 = this.LIZIZ.getValue();
        if (value2 == null) {
            value2 = new I2A(0);
        }
        I2A i2a = new I2A(i, effect);
        this.LIZIZ.setValue(i2a);
        this.LIZLLL.setValue(new I2B(value2, i2a));
    }
}
