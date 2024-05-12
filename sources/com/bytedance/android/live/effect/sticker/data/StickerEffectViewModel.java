package com.bytedance.android.live.effect.sticker.data;

import X.BZI;
import X.C0N3;
import X.C0NB;
import X.C0WN;
import X.C16880lQ;
import X.C221108m2;
import X.C29306Beo;
import X.C31941Ne;
import X.C32001Nk;
import X.C38995FSd;
import X.C39011g1;
import X.C44821pO;
import X.C47601ts;
import X.C48459J0d;
import X.C54192At;
import X.C54212Av;
import X.C55892Hh;
import X.C62822Ol8;
import X.C73098SmU;
import X.C78613UtF;
import X.C84661XKn;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC67352kd;
import X.XKX;
import Y.IDRunnableS2S0300000;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectCheckUpdateInterval;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class StickerEffectViewModel extends BaseEffectViewModel<LiveEffect> {
    public static final /* synthetic */ int LJLL = 0;
    public final C39011g1 LJLJJI;
    public final Queue<LiveEffect> LJLJJL;
    public LiveEffect LJLJJLL;
    public final HashMap<String, String> LJLJL;
    public C84661XKn LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public final List<C32001Nk> sv0() {
        return (List) this.LJLJLLL.getValue();
    }

    public final void ov0() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C54192At(this, null), 2);
    }

    public final void pv0() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C54212Av(this, null), 2);
    }

    public final void kv0(C0WN c0wn) {
        LiveEffect liveEffect = (LiveEffect) ((ConcurrentLinkedQueue) this.LJLJJL).poll();
        this.LJLJJLL = liveEffect;
        if (liveEffect != null) {
            nv0(liveEffect, c0wn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rv0(X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C47621tu
            if (r0 == 0) goto L6e
            r8 = r10
            X.1tu r8 = (X.C47621tu) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r1 = r8.LJLILLLLZI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r4 = 3
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L29
            if (r0 == r6) goto L7c
            if (r0 != r4) goto L74
            X.C141335gf.LIZJ(r1)
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r8.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L3e
        L2f:
            X.C141335gf.LIZJ(r1)
            r8.LJLIL = r9
            r8.LJLJJI = r3
            java.lang.Object r1 = r9.tv0(r8)
            if (r1 != r7) goto L3d
            return r7
        L3d:
            r0 = r9
        L3e:
            X.1Ne r1 = (X.C31941Ne) r1
            r5 = 0
            if (r1 == 0) goto L5a
            X.XLL r4 = r0.LJLJI
            X.1cm r3 = new X.1cm
            java.lang.String r2 = r1.LJLILLLLZI
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = r1.LJLIL
            r0 = 0
            r3.<init>(r2, r1, r0)
            r8.LJLIL = r5
            r8.LJLJJI = r6
            java.lang.Object r0 = r4.emit(r3, r8)
            if (r0 != r7) goto L7f
            return r7
        L5a:
            X.XLL r2 = r0.LJLJI
            X.1cq r1 = new X.1cq
            java.lang.String r0 = "fetchCategoryList failed"
            r1.<init>(r3, r0)
            r8.LJLIL = r5
            r8.LJLJJI = r4
            java.lang.Object r0 = r2.emit(r1, r8)
            if (r0 != r7) goto L26
            return r7
        L6e:
            X.1tu r8 = new X.1tu
            r8.<init>(r9, r10)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7c:
            X.C141335gf.LIZJ(r1)
        L7f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.rv0(X.2kd):java.lang.Object");
    }

    public final Object tv0(InterfaceC67352kd<? super C31941Ne> interfaceC67352kd) {
        Boolean bool;
        C84661XKn c84661XKn = this.LJLJLJ;
        if (c84661XKn != null) {
            bool = Boolean.valueOf(c84661XKn.isCompleted());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            C84661XKn c84661XKn2 = this.LJLJLJ;
            if (c84661XKn2 == null) {
                return null;
            }
            return c84661XKn2.LJJJJL();
        }
        C84661XKn c84661XKn3 = this.LJLJLJ;
        if (c84661XKn3 == null) {
            return null;
        }
        return c84661XKn3.LJJIJ(interfaceC67352kd);
    }

    public final boolean vv0(String str) {
        long j;
        String str2;
        boolean z = true;
        String str3 = "";
        if (C29306Beo.LJJI() || C29306Beo.LJIILJJIL()) {
            if (C29306Beo.LJJI()) {
                str3 = "preview";
            } else if (C29306Beo.LJIILJJIL()) {
                IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                if (iInteractService.mT()) {
                    str3 = "match";
                } else if (iInteractService.OB()) {
                    str3 = "cohost";
                } else if (iInteractService.ta0()) {
                    str3 = "multiguest";
                } else {
                    str3 = "broadcast";
                }
            }
            C48459J0d<Map<String, Map<String, String>>> c48459J0d = InterfaceC30442Bx8.Q1;
            Map<String, String> map = c48459J0d.LIZJ().get(str3);
            if (map != null && (str2 = map.get(str)) != null) {
                j = CastLongProtector.parseLong(str2);
            } else {
                j = 0;
            }
            if ((System.currentTimeMillis() - j) / 1000 > LiveEffectCheckUpdateInterval.INSTANCE.getInterval() || !o.LJ(str3, this.LJLJL.get(str))) {
                if (c48459J0d.LIZJ().get(str3) == null) {
                    Map<String, Map<String, String>> value = c48459J0d.LIZJ();
                    o.LJIIIIZZ(value, "value");
                    value.put(str3, new LinkedHashMap());
                }
                Map<String, String> map2 = c48459J0d.LIZJ().get(str3);
                if (map2 != null) {
                    map2.put(str, String.valueOf(System.currentTimeMillis()));
                }
                c48459J0d.LIZLLL();
            } else {
                z = false;
            }
        }
        this.LJLJL.put(str, str3);
        if (z) {
            C0NB.LIZIZ("EffectMemoryOpt", "shouldCheckUpdate is true.");
        }
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerEffectViewModel(C39011g1 dataSource, C44821pO resourceRepository) {
        super(dataSource, resourceRepository);
        o.LJIIIZ(dataSource, "dataSource");
        o.LJIIIZ(resourceRepository, "resourceRepository");
        this.LJLJJI = dataSource;
        this.LJLJJL = new ConcurrentLinkedQueue();
        this.LJLJL = new HashMap<>();
        this.LJLJLLL = C221108m2.LIZIZ(C47601ts.LJLIL);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C55892Hh(this, null), 3);
    }

    public static void uv0(Boolean bool, String str) {
        String str2;
        if (C29306Beo.LJJI() || C29306Beo.LJIILJJIL()) {
            BZI LIZIZ = C0N3.LIZIZ("livesdk_live_take_sticker_recommendation_status", str, "tab_name");
            if (C29306Beo.LJJIFFI(bool)) {
                str2 = "rec";
            } else {
                str2 = "normal";
            }
            LIZIZ.LJIJJ(str2, "is_recommendation");
            LIZIZ.LJJIIJZLJL();
        }
    }

    public final void lv0(LiveEffect liveEffect, C0WN c0wn) {
        LiveEffect liveEffect2;
        o.LJIIIZ(liveEffect, "liveEffect");
        ((ConcurrentLinkedQueue) this.LJLJJL).add(liveEffect);
        if ((!((ConcurrentLinkedQueue) this.LJLJJL).isEmpty()) && this.LJLJJLL == null && (liveEffect2 = (LiveEffect) ((ConcurrentLinkedQueue) this.LJLJJL).poll()) != null) {
            nv0(liveEffect2, c0wn);
        }
    }

    public final void mv0(LiveEffect liveEffect, C0WN c0wn) {
        if (!iv0(liveEffect)) {
            this.LJLJJLL = liveEffect;
            hv0(liveEffect, new IDqS28S0300000(c0wn, this, liveEffect, 7));
        } else {
            kv0(c0wn);
        }
    }

    public final void nv0(LiveEffect liveEffect, C0WN c0wn) {
        if (EffectParseOptSetting.enableOpt()) {
            if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
                C38995FSd.LIZIZ().submit(new IDRunnableS2S0300000(this, liveEffect, c0wn, 7));
                return;
            } else {
                mv0(liveEffect, c0wn);
                return;
            }
        }
        mv0(liveEffect, c0wn);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object qv0(java.lang.String r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.qv0(java.lang.String, X.2kd):java.lang.Object");
    }
}
