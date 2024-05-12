package com.ss.android.ugc.aweme.sticker;

import X.C29S;
import X.C60903NvH;
import X.C74385THh;
import X.C74387THj;
import X.C74389THl;
import X.I29;
import X.InterfaceC74393THp;
import X.InterfaceC74399THv;
import X.InterfaceC74401THx;
import X.ORS;
import X.ORZ;
import Y.IDComparatorS40S0000000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TiktokStickerDataManager extends DefaultStickerDataManager {
    public final C74385THh LLIFFJFJJ;
    public final C74387THj LLII;

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, X.TEZ
    public final C74385THh LJJIL() {
        return this.LLIFFJFJJ;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerDataManager, X.TEZ
    public final void LJJJ(C74389THl c74389THl) {
        C74387THj c74387THj = this.LLII;
        int i = c74389THl.LJLILLLLZI;
        List<Effect> effectList = c74389THl.LJLIL;
        int i2 = c74389THl.LJLJI;
        InterfaceC74393THp stickerRepository = this.LJLJI;
        c74387THj.getClass();
        o.LJIIIZ(effectList, "effectList");
        o.LJIIIZ(stickerRepository, "stickerRepository");
        int i3 = c74387THj.LIZIZ;
        c74387THj.LIZIZ = i3 + 1;
        c74387THj.LIZ.add(new C74389THl(effectList, i, i2, 24));
        Set<C74389THl> set = c74387THj.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C74389THl c74389THl2 : set) {
            if (c74389THl2.LJLILLLLZI == i) {
                arrayList.add(c74389THl2);
            }
        }
        List LLILII = ORZ.LLILII(new IDComparatorS40S0000000_12(6), arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = LLILII.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((C74389THl) it.next()).LJLIL, arrayList2);
        }
        stickerRepository.LJIIIIZZ().LIZIZ(new C74389THl(ORZ.LLJI(ORZ.LJLJJL(arrayList2)), i, i3, 24));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiktokStickerDataManager(C29S activity, C74385THh configure, InterfaceC74401THx stickerRepositoryFactory, I29 stickerState, InterfaceC74399THv interfaceC74399THv) {
        super(activity, configure, stickerRepositoryFactory, stickerState, interfaceC74399THv, null, C60903NvH.LJIIJJI().LJIL().LIZ(activity));
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(configure, "configure");
        o.LJIIIZ(stickerRepositoryFactory, "stickerRepositoryFactory");
        o.LJIIIZ(stickerState, "stickerState");
        this.LLIFFJFJJ = configure;
        this.LLII = new C74387THj();
    }
}
