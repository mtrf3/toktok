package com.ss.android.ugc.aweme.emoji.stickerstore.favsticker;

import X.C09G;
import X.C221108m2;
import X.C48841JEv;
import X.C62822Ol8;
import X.C64962gm;
import X.C71342r4;
import X.C71352r5;
import X.C71512rL;
import X.C71682rc;
import X.C71732rh;
import X.C76800UCe;
import X.C78613UtF;
import X.EnumC58928NAu;
import X.InterfaceC67352kd;
import X.InterfaceC71562rQ;
import X.XKX;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.PopularStickerStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.service.experiment.IMStickerConsumptionImprSetting;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopularStickerListManager implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final long LJLIL;
    public List<PopularStickerStruct> LJLILLLLZI;
    public final C64962gm LJLJI;
    public int LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C71682rc LJLJJLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2rc] */
    public PopularStickerListManager() {
        IMStickerConsumptionImprSetting.LIZ.getClass();
        long j = 60;
        this.LJLIL = IMStickerConsumptionImprSetting.LIZ().popularStickerCacheExpHours * j * j * 1000;
        this.LJLJI = C48841JEv.LIZ(C78613UtF.LIZJ);
        this.LJLJJL = C221108m2.LIZIZ(C71732rh.LJLIL);
        this.LJLJJLL = new InterfaceC71562rQ() { // from class: X.2rc
            @Override // X.InterfaceC71562rQ
            public final void BO(long j2) {
            }

            @Override // X.InterfaceC71562rQ
            public final void ih0() {
            }

            @Override // X.InterfaceC71562rQ
            public final void JS(FavStickerStruct sticker) {
                Long videoStickerId;
                Long stickerId;
                o.LJIIIZ(sticker, "sticker");
                SetSticker setSticker = sticker.getSetSticker();
                if (setSticker != null && (stickerId = setSticker.getStickerId()) != null) {
                    PopularStickerListManager.this.LIZJ(stickerId.longValue());
                }
                VideoSticker videoSticker = sticker.getVideoSticker();
                if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null) {
                    PopularStickerListManager.this.LIZJ(videoStickerId.longValue());
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C71722rg
            if (r0 == 0) goto Lae
            r6 = r13
            X.2rg r6 = (X.C71722rg) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r11 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r7 = 2
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L27
            if (r0 != r7) goto Lb5
            X.C141335gf.LIZJ(r11)
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager r3 = r6.LJLIL
            goto L46
        L2a:
            X.C141335gf.LIZJ(r11)
            int r1 = r12.LJLJJI
            r0 = 3
            if (r1 <= r0) goto L35
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L35:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r0 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> L91
            r6.LJLIL = r12     // Catch: java.lang.Exception -> L91
            r6.LJLJJI = r2     // Catch: java.lang.Exception -> L91
            java.lang.Object r11 = r0.getPopularStickerList(r6)     // Catch: java.lang.Exception -> L91
            if (r11 != r5) goto L44
            goto Lbd
        L44:
            r3 = r12
            goto L49
        L46:
            X.C141335gf.LIZJ(r11)     // Catch: java.lang.Exception -> L8f
        L49:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.PopularStickerListResponse r11 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.PopularStickerListResponse) r11     // Catch: java.lang.Exception -> L8f
            if (r11 == 0) goto L9e
            X.Ol8 r0 = r3.LJLJJL
            java.lang.Object r10 = r0.getValue()
            com.bytedance.keva.Keva r10 = (com.bytedance.keva.Keva) r10
            java.lang.String r0 = "kevaRepo"
            kotlin.jvm.internal.o.LJIIIIZZ(r10, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r9 = r0.getCurUserId()
            java.lang.String r0 = "userService().curUserId"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r8 = X.X1D.LIZ()
            java.lang.String r0 = "key_pop_sticker_fetch_time"
            r8.append(r0)
            r8.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r8)
            r10.storeLong(r0, r1)
            java.util.List r0 = r11.getPopularStickers()
            if (r0 == 0) goto L9e
            java.util.List r0 = X.C47261Igj.LJJJIL(r0)
            java.util.List r0 = X.ORZ.LLJILJILJ(r0)
            goto L9f
        L8f:
            r1 = move-exception
            goto L93
        L91:
            r1 = move-exception
            r3 = r12
        L93:
            java.lang.String r0 = "PopularStickerListManager"
            X.C34B.LJ(r0, r1)
            int r0 = r3.LJLJJI
            int r0 = r0 + 1
            r3.LJLJJI = r0
        L9e:
            r0 = r4
        L9f:
            r3.LJLILLLLZI = r0
            if (r0 == 0) goto L24
            r6.LJLIL = r4
            r6.LJLJJI = r7
            java.lang.Object r0 = r3.LIZLLL(r0, r6)
            if (r0 != r5) goto L24
            return r5
        Lae:
            X.2rg r6 = new X.2rg
            r6.<init>(r12, r13)
            goto L12
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lbd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager.LIZ(X.2kd):java.lang.Object");
    }

    public final void LIZJ(long j) {
        VideoSticker videoSticker;
        Long videoStickerId;
        Long stickerId;
        List<PopularStickerStruct> list = this.LJLILLLLZI;
        if (list != null) {
            Iterator<PopularStickerStruct> it = list.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    PopularStickerStruct next = it.next();
                    SetSticker setSticker = next.getSetSticker();
                    if ((setSticker != null && (stickerId = setSticker.getStickerId()) != null && stickerId.longValue() == j) || ((videoSticker = next.getVideoSticker()) != null && (videoStickerId = videoSticker.getVideoStickerId()) != null && videoStickerId.longValue() == j)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= 0) {
                int intValue = valueOf.intValue();
                List<PopularStickerStruct> list2 = this.LJLILLLLZI;
                if (list2 != null) {
                    ListProtector.remove(list2, intValue);
                }
            }
        }
        XKX.LIZLLL(this.LJLJI, null, null, new C71342r4(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C71512rL.LJII.LIZ(this.LJLJJLL);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C71512rL.LJII.LJIJ(this.LJLJJLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<? extends X.C105454Bx> r14, X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.emoji.stickerstore.model.PopularStickerStruct>> r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager.LIZIZ(java.util.List, X.2kd):java.lang.Object");
    }

    public final Object LIZLLL(List<PopularStickerStruct> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new C71352r5(this, list, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }
}
