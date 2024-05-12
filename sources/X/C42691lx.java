package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.UriProtector;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42691lx implements C1MY {
    public static WeakReference<InterfaceC30494Bxy> LIZJ;
    public static WeakReference<C0PQ> LIZLLL;
    public static final C42691lx LIZ = new C42691lx();
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(C515520p.LJLIL);
    public static final C1R6 LJ = new I2R() { // from class: X.1R6
        @Override // X.I2R
        public final void LJIIZILJ(String str) {
        }

        @Override // X.I2R
        public final void LJJJJLI(List<String> list) {
        }

        @Override // X.I2R
        public final void LJJLIIIJL(String str, String str2) {
            InterfaceC30494Bxy interfaceC30494Bxy;
            WeakReference<InterfaceC30494Bxy> weakReference = C42691lx.LIZJ;
            if (weakReference != null && (interfaceC30494Bxy = weakReference.get()) != null) {
                interfaceC30494Bxy.LJI(str, str2);
            }
        }
    };

    public static C0WF LJI() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-composerManager>(...)");
        return (C0WF) value;
    }

    @Override // X.InterfaceC07990Tb
    public final LiveEffect LIZ(String str) {
        List<LiveEffect> LIZ2 = LJI().LIZ(str);
        if (LIZ2 != null) {
            return (LiveEffect) ORZ.LJLLLL(LIZ2);
        }
        return null;
    }

    @Override // X.InterfaceC07990Tb
    public final boolean LJFF(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        return C1KJ.LJIIL(liveEffect.getEffect());
    }

    @Override // X.InterfaceC07990Tb
    public final void LIZIZ(LiveEffect liveEffect, C0WN c0wn) {
        o.LJIIIZ(liveEffect, "liveEffect");
        C1KJ c1kj = C1KJ.LIZ;
        if (C1KJ.LJIIL(liveEffect.getEffect())) {
            c0wn.onSuccess(liveEffect.getEffect());
        } else {
            c1kj.LIZLLL(liveEffect.getEffect(), (C0WN) EUR.LIZ(c0wn));
        }
    }

    public static final boolean LJII(LiveEffect liveEffect, Context context, String msgArg3, Long l) {
        String LIZLLL2;
        LiveEffect.CommerceExtra commerceExtra;
        o.LJIIIZ(liveEffect, "liveEffect");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(msgArg3, "msgArg3");
        LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect.sdkExtraModel;
        String str = null;
        if (stickerSDKExtra != null && stickerSDKExtra.commerceExtra != null) {
            try {
                new com.google.gson.o();
                if (com.google.gson.o.LIZ(msgArg3).LJIIZILJ().LJJIJ("resourceId").LJJIFFI().equals(liveEffect.getResourceId())) {
                    long j = 0;
                    if (C29306Beo.LJIJJLI(liveEffect.clickUrlForEC)) {
                        C32364Cn2 c32364Cn2 = new C32364Cn2(liveEffect.clickUrlForEC);
                        if (l != null) {
                            j = l.longValue();
                        }
                        c32364Cn2.LIZIZ(j, "room_id");
                        LIZLLL2 = c32364Cn2.LIZLLL();
                    } else {
                        LiveEffect.StickerSDKExtra stickerSDKExtra2 = liveEffect.sdkExtraModel;
                        if (stickerSDKExtra2 != null && (commerceExtra = stickerSDKExtra2.commerceExtra) != null) {
                            str = commerceExtra.getDefaultClickUrl();
                        }
                        C32364Cn2 c32364Cn22 = new C32364Cn2(str);
                        c32364Cn22.LIZIZ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), "author_id");
                        if (l != null) {
                            j = l.longValue();
                        }
                        c32364Cn22.LIZIZ(j, "room_id");
                        LIZLLL2 = c32364Cn22.LIZLLL();
                    }
                    ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, UriProtector.parse(LIZLLL2));
                    return true;
                }
                return false;
            } catch (Exception e) {
                C0NB.LJI("ECBillBroadEffect", e);
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC07990Tb
    public final void LJ(String effectPanel, String resourceId, String categoryId, InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(effectPanel, "effectPanel");
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(categoryId, "categoryId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("query sticker effect resourceId=");
        LIZ2.append(resourceId);
        LIZ2.append(" categoryId=");
        LIZ2.append(categoryId);
        C0NB.LIZIZ("LiveEcEffectHelper", X1D.LIZIZ(LIZ2));
        StickerEffectViewModel stickerEffectViewModel = (StickerEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(new C39011g1(effectPanel), new C44821pO())).get(StickerEffectViewModel.class);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), null, null, new C2E6(stickerEffectViewModel, categoryId, interfaceC88472Yns, resourceId, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        if (((com.bytedance.android.livesdkapi.host.IHostCreativeTool) r0).isGalleryModuleInitialized() != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    @Override // X.InterfaceC07990Tb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r9, com.bytedance.android.livesdkapi.depend.model.LiveEffect r10, java.lang.String r11, java.lang.String r12, boolean r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42691lx.LIZJ(java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r8 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r18 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r2.LIZ(new com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig(r4, r5, r6, r13, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r14 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r5 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r5 = "";
     */
    @Override // X.InterfaceC07990Tb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r13, com.bytedance.android.livesdkapi.depend.model.LiveEffect r14, java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18) {
        /*
            r12 = this;
            r6 = r16
            r8 = r15
            java.lang.String r0 = "effectPanel"
            r7 = r13
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "setEffectAutoRestore "
            r1.append(r0)
            r1.append(r7)
            r0 = 32
            r1.append(r0)
            r1.append(r14)
            r1.append(r0)
            r1.append(r6)
            r1.append(r0)
            r3 = r17
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "LiveEcEffectHelper"
            X.C0NB.LIZIZ(r0, r1)
            X.J0d<com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig> r2 = X.InterfaceC30442Bx8.f0
            java.lang.Object r0 = r2.LIZJ()
            com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig r0 = (com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig) r0
            if (r3 == 0) goto L64
            com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig r3 = new com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig
            java.lang.String r9 = ""
            if (r14 == 0) goto L4a
            java.lang.String r4 = r14.getResourceId()
            if (r4 != 0) goto L4d
        L4a:
            r4 = r9
            if (r14 == 0) goto L51
        L4d:
            java.lang.String r5 = r14.effectPanelKey
            if (r5 != 0) goto L52
        L51:
            r5 = r9
        L52:
            if (r6 != 0) goto L55
            r6 = r9
        L55:
            if (r8 != 0) goto L58
            r8 = r9
        L58:
            if (r18 != 0) goto L61
        L5a:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.LIZ(r3)
        L60:
            return
        L61:
            r9 = r18
            goto L5a
        L64:
            java.lang.String r1 = r0.resourceId
            if (r14 == 0) goto L84
            java.lang.String r0 = r14.getResourceId()
        L6c:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L60
            com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig r3 = new com.bytedance.android.livesdk.model.LiveEffectAutoRestoreConfig
            r4 = 0
            r10 = 63
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r11 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.LIZ(r3)
            goto L60
        L84:
            r0 = 0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42691lx.LIZLLL(java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }
}
