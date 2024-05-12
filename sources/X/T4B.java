package X;

import Y.AObserverS80S0100000_12;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.types.multi.MultiStickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4B implements F4V, TGM, TGT {
    public T4A LJLIL;
    public Effect LJLILLLLZI;
    public T4Q LJLJI;
    public boolean LJLJJI;
    public final ActivityC45651qj LJLJJL;
    public final TEZ LJLJJLL;
    public final InterfaceC74343TFr LJLJL;
    public final TEF LJLJLJ;
    public final TKR LJLJLLL;
    public final T46 LJLL;
    public final LifecycleOwner LJLLI;

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.TGT
    public final void LLIIIL() {
        T4A t4a = this.LJLIL;
        if (t4a != null) {
            t4a.LJ(false);
            this.LJLJJI = false;
        }
    }

    @Override // X.TGT
    public final void LLIIIZ() {
        T4A t4a;
        if (o.LJ(this.LJLJJLL.LLJJIJIIJIL(), this.LJLILLLLZI) && (t4a = this.LJLIL) != null) {
            t4a.LIZ();
            this.LJLJJI = true;
        }
    }

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.TGT
    public final boolean LLIIIJ() {
        return this.LJLJJI;
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        T4A t4a = new T4A(this.LJLJJL, stickerView, this.LJLJJLL, this.LJLJLJ, this.LJLL, this.LJLJLLL, this.LJLLI);
        this.LJLIL = t4a;
        t4a.LIZIZ.LJLILLLLZI = this.LJLJL;
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        Effect effect;
        o.LJIIIZ(state, "state");
        if (!this.LJLJJI && (effect = this.LJLILLLLZI) != null && effect.getEffectType() == 1) {
            LLIIIZ();
        }
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        int i;
        o.LJIIIZ(session, "session");
        ERS LIZ = ern.LIZ(session);
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            Effect effect = t4q.LIZ;
            if (effect != null && effect.getEffectType() == 1) {
                Effect effect2 = t4q.LIZ;
                this.LJLJI = t4q;
                this.LJLL.CJ(effect2);
                List<Effect> value = this.LJLL.e7().getValue();
                if (value != null && !value.isEmpty() && this.LJLJJLL.LJIILJJIL() != null) {
                    int size = value.size();
                    i = 0;
                    while (i < size) {
                        String id = ((com.ss.ugc.effectplatform.model.Effect) ListProtector.get(value, i)).getId();
                        Effect LJIILJJIL = this.LJLJJLL.LJIILJJIL();
                        o.LJI(LJIILJJIL);
                        if (TextUtils.equals(id, LJIILJJIL.getId())) {
                            break;
                        }
                        i++;
                    }
                }
                i = 0;
                T4A t4a = this.LJLIL;
                if (t4a != null) {
                    InterfaceC64335PMt interfaceC64335PMt = t4a.LJ;
                    if (interfaceC64335PMt != null) {
                        interfaceC64335PMt.LIZIZ();
                    }
                    t4a.LIZIZ.LJLJJI = i;
                    int LLILL = t4a.LJFF.LLILL();
                    int LLILLJJLI = t4a.LJFF.LLILLJJLI();
                    if (i <= LLILL) {
                        t4a.LIZ.LJLI(i);
                    } else if (i <= LLILLJJLI) {
                        t4a.LIZ.scrollBy(0, t4a.LIZ.getChildAt(i - LLILL).getTop());
                    } else {
                        t4a.LIZ.LJLI(i);
                    }
                }
                T4A t4a2 = this.LJLIL;
                if (t4a2 != null) {
                    t4a2.LIZ();
                    this.LJLJJI = true;
                }
                this.LJLILLLLZI = effect2;
            } else {
                Effect effect3 = this.LJLILLLLZI;
                if (effect3 != null) {
                    Effect effect4 = t4q.LIZ;
                    List<String> children = effect3.getChildren();
                    if (children == null || !children.contains(effect4.getEffectId())) {
                        this.LJLILLLLZI = null;
                        this.LJLJI = null;
                        this.LJLJJLL.LJIIZILJ(null);
                        T4A t4a3 = this.LJLIL;
                        if (t4a3 != null) {
                            t4a3.LJ(false);
                            this.LJLJJI = false;
                        }
                    }
                }
            }
        } else if ((session instanceof T4R) && this.LJLILLLLZI != null) {
            this.LJLILLLLZI = null;
            this.LJLJI = null;
            this.LJLJJLL.LJIIZILJ(null);
            T4A t4a4 = this.LJLIL;
            if (t4a4 != null) {
                t4a4.LJ(false);
                this.LJLJJI = false;
            }
        }
        return LIZ;
    }

    public T4B(C29S c29s, TEZ tez, InterfaceC74343TFr interfaceC74343TFr, THA tha, TKR configure, MultiStickerListViewModel multiStickerListViewModel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJJL = c29s;
        this.LJLJJLL = tez;
        this.LJLJL = interfaceC74343TFr;
        this.LJLJLJ = tha;
        this.LJLJLLL = configure;
        this.LJLL = multiStickerListViewModel;
        this.LJLLI = lifecycleOwner;
        multiStickerListViewModel.LJLILLLLZI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 157));
    }
}
