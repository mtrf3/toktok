package com.bytedance.android.live.effect.bgeffect;

import X.C29306Beo;
import X.C2AD;
import X.C31824CeK;
import X.C39011g1;
import X.C44821pO;
import X.C76800UCe;
import X.C78613UtF;
import X.C79258V8s;
import X.EnumC31874Cf8;
import X.InterfaceC72996Skq;
import X.InterfaceC88472Yns;
import X.X1D;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.google.gson.j;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BgEffectViewModel extends StickerEffectViewModel {
    public final C39011g1 LJLLI;

    public final void wv0(String str) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C2AD(this, str, null), 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BgEffectViewModel(C39011g1 dataSource, C44821pO resourceRepository) {
        super(dataSource, resourceRepository);
        o.LJIIIZ(dataSource, "dataSource");
        o.LJIIIZ(resourceRepository, "resourceRepository");
        this.LJLLI = dataSource;
    }

    public static void xv0(String str, List list, boolean z) {
        String str2;
        boolean z2;
        if (o.LJ(str, "multi")) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final LiveEffect liveEffect = (LiveEffect) it.next();
                    new com.google.gson.o();
                    j LJJIJ = com.google.gson.o.LIZ(liveEffect.extra).LJIIZILJ().LJJIJ("multi_image");
                    if (LJJIJ != null) {
                        str2 = LJJIJ.LJJIFFI();
                    } else {
                        str2 = null;
                    }
                    liveEffect.shareImageId = str2;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(liveEffect.urlPrefix);
                    LIZ.append(liveEffect.shareImageId);
                    liveEffect.shareImageUrl = X1D.LIZIZ(LIZ);
                    String str3 = liveEffect.shareImageId;
                    if (str3 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    liveEffect.isShareBackground = z2;
                    if (C29306Beo.LJIJJLI(str3)) {
                        EnumC31874Cf8 enumC31874Cf8 = EnumC31874Cf8.SHARE_EFFECT;
                        String fullPath = enumC31874Cf8.getFullPath();
                        String str4 = liveEffect.shareImageId;
                        if (str4 != null && new File(fullPath, str4).exists()) {
                            if (z) {
                                String str5 = liveEffect.shareImageUrl;
                                if (str5 != null) {
                                    final C31824CeK c31824CeK = new C31824CeK(str4, enumC31874Cf8, null, null, str5, null, false, 1, true, 236);
                                    C79258V8s.LIZ.LIZIZ(c31824CeK, new InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe>() { // from class: X.1lU
                                        @Override // X.InterfaceC88472Yns
                                        public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
                                            InterfaceC72996Skq cb = interfaceC72996Skq;
                                            o.LJIIIZ(cb, "cb");
                                            cb.LIZLLL(new IDqS172S0200000(LiveEffect.this, c31824CeK, 41));
                                            return C76800UCe.LIZ;
                                        }
                                    });
                                }
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(fullPath);
                                LIZ2.append(str4);
                                liveEffect.shareImagePath = X1D.LIZIZ(LIZ2);
                            }
                        }
                    }
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (o.LJ(str, "solo")) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((LiveEffect) it2.next()).isSoloBackground = true;
            }
        }
    }

    public static /* synthetic */ void yv0(BgEffectViewModel bgEffectViewModel, String str, List list) {
        bgEffectViewModel.getClass();
        xv0(str, list, false);
    }
}
