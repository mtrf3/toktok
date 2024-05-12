package X;

import android.text.TextUtils;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1KC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KC implements C0WL {
    public static final C1KC LIZ = new C1KC();
    public static final C07500Re LIZIZ = new C07500Re();
    public static final ConcurrentHashMap<String, LiveEffect> LIZJ = new ConcurrentHashMap<>();
    public static DataChannel LIZLLL;

    @Override // X.C0WL
    public final boolean LJ(Effect effect) {
        return LIZIZ.LIZ.isEffectDownloaded(effect);
    }

    public static LiveEffect LJIIIZ(CategoryPageModel categoryPageModel, String str) {
        List<Effect> effects;
        Effect effect;
        CategoryEffectModel categoryEffects = categoryPageModel.getCategoryEffects();
        if (categoryEffects == null || (effects = categoryEffects.getEffects()) == null) {
            return null;
        }
        Iterator<Effect> it = effects.iterator();
        while (true) {
            if (it.hasNext()) {
                effect = it.next();
                if (o.LJ(effect.getResourceId(), str)) {
                    break;
                }
            } else {
                effect = null;
                break;
            }
        }
        Effect effect2 = effect;
        if (effect2 == null) {
            return null;
        }
        return C0LT.LIZIZ(effect2);
    }

    public static LiveEffect LJIIJ(EffectChannelResponse effectChannelResponse, String str) {
        Effect effect;
        Iterator<Effect> it = effectChannelResponse.getAllCategoryEffects().iterator();
        while (true) {
            if (it.hasNext()) {
                effect = it.next();
                if (o.LJ(effect.getResourceId(), str)) {
                    break;
                }
            } else {
                effect = null;
                break;
            }
        }
        Effect effect2 = effect;
        if (effect2 == null) {
            return null;
        }
        return C0LT.LIZIZ(effect2);
    }

    @Override // X.C0WL
    public final boolean LIZIZ(String resourceId, String panelName) {
        String str;
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(panelName, "panelName");
        LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLL(C12880ey.LIZ().LIZ(panelName));
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        } else {
            str = null;
        }
        return o.LJ(str, resourceId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r8, java.lang.String r9, X.InterfaceC67352kd<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C48881vw
            if (r0 == 0) goto L87
            r6 = r10
            X.1vw r6 = (X.C48881vw) r6
            int r2 = r6.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r6.LJLJJLL = r2
        L12:
            java.lang.Object r5 = r6.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJLL
            r3 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L4c
            if (r0 == r1) goto L3e
            if (r0 != r3) goto L8d
            java.lang.Object r8 = r6.LJLILLLLZI
            java.lang.String r8 = (java.lang.String) r8
            X.1KC r1 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L2a:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r5 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r5
            if (r5 == 0) goto L35
            r1.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = LJIIJ(r5, r8)
        L35:
            r0 = r2
            if (r2 == 0) goto L3d
        L38:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = X.C1KC.LIZJ
            r1.put(r8, r0)
        L3d:
            return r0
        L3e:
            java.lang.Object r9 = r6.LJLJI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.LJLILLLLZI
            java.lang.String r8 = (java.lang.String) r8
            X.1KC r1 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
            goto L69
        L4c:
            X.C141335gf.LIZJ(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = X.C1KC.LIZJ
            java.lang.Object r0 = r0.get(r8)
            if (r0 != 0) goto L38
            X.0Re r0 = X.C1KC.LIZIZ
            r6.LJLIL = r7
            r6.LJLILLLLZI = r8
            r6.LJLJI = r9
            r6.LJLJJLL = r1
            java.lang.Object r5 = r0.LJ(r9, r6)
            if (r5 != r4) goto L68
            return r4
        L68:
            r1 = r7
        L69:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r5 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r5
            if (r5 == 0) goto L76
            r1.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = LJIIJ(r5, r8)
            if (r0 != 0) goto L38
        L76:
            X.0Re r0 = X.C1KC.LIZIZ
            r6.LJLIL = r1
            r6.LJLILLLLZI = r8
            r6.LJLJI = r2
            r6.LJLJJLL = r3
            java.lang.Object r5 = r0.LIZLLL(r9, r6)
            if (r5 != r4) goto L2a
            return r4
        L87:
            X.1vw r6 = new X.1vw
            r6.<init>(r7, r10)
            goto L12
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1KC.LJI(java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    public static void LJFF(LiveEffect newEffect, String str, String str2, boolean z) {
        C0WB c0wb;
        if (o.LJ(ORZ.LJLLLL(C12880ey.LIZ().LIZ(str)), newEffect)) {
            if (z) {
                C12880ey.LIZ().LJIILL(newEffect, str);
                DataChannel dataChannel = LIZLLL;
                if (dataChannel != null) {
                    dataChannel.qv0(StickerCancelChannel.class, newEffect);
                    return;
                }
                return;
            }
            return;
        }
        C42681lw LIZ2 = C12880ey.LIZ();
        LIZ2.getClass();
        o.LJIIIZ(newEffect, "newEffect");
        if (LIZ2.LJ != null) {
            LIZ2.LJJIL(newEffect, str);
            ArrayList arrayList = new ArrayList();
            List<LiveEffect> LIZ3 = LIZ2.LIZ(str);
            ArrayList arrayList2 = new ArrayList();
            for (LiveEffect liveEffect : LIZ3) {
                if (!TextUtils.isEmpty(liveEffect.unzipPath)) {
                    arrayList2.add(liveEffect);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((LiveEffect) it.next()).unzipPath);
            }
            arrayList.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(newEffect.unzipPath);
            ArrayList arrayList5 = new ArrayList();
            String str3 = newEffect.extra;
            if (str3 == null) {
                str3 = "";
            }
            arrayList5.add(str3);
            C08780Wc c08780Wc = LIZ2.LJ;
            if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
                c0wb.LIZJ((String[]) arrayList.toArray(new String[0]), (String[]) arrayList4.toArray(new String[0]), (String[]) arrayList5.toArray(new String[0]));
            }
            Iterator<LiveEffect> it2 = LIZ2.LIZ(str).iterator();
            while (it2.hasNext()) {
                LIZ2.LJJJI(it2.next(), str, false);
            }
            C42681lw.LJJIJIIJIL(LIZ2, str, newEffect, false, 24);
            LIZ2.LJJJJ(false);
        }
        DataChannel dataChannel2 = LIZLLL;
        if (dataChannel2 != null) {
            dataChannel2.rv0(StickerSelectChannel.class, newEffect);
        }
        DataChannel dataChannel3 = LIZLLL;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.qv0(StickerSelectedEvent.class, new C19680pw(newEffect, C0TY.LIZIZ, str2, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.C0WL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC67352kd<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C48901vy
            if (r0 == 0) goto L3a
            r4 = r9
            X.1vy r4 = (X.C48901vy) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 != r1) goto L40
            X.C141335gf.LIZJ(r3)
        L20:
            return r3
        L21:
            X.C141335gf.LIZJ(r3)
            java.lang.String r0 = "resourceId"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = X.C1KC.LIZJ
            java.lang.Object r3 = r0.get(r6)
            if (r3 != 0) goto L20
            r4.LJLJI = r1
            java.lang.Object r3 = r5.LJIIIIZZ(r6, r7, r8, r4)
            if (r3 != r2) goto L20
            return r2
        L3a:
            X.1vy r4 = new X.1vy
            r4.<init>(r5, r9)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1KC.LIZJ(java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.C0WL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r7, java.lang.String r8, java.lang.String r9, X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C48861vu
            if (r0 == 0) goto L53
            r5 = r10
            X.1vu r5 = (X.C48861vu) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r2 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJI
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L24
            if (r1 == r0) goto L30
            if (r1 != r3) goto L59
            X.C141335gf.LIZJ(r2)
        L23:
            return r2
        L24:
            X.C141335gf.LIZJ(r2)
            r5.LJLJI = r0
            java.lang.Object r2 = r6.LJII(r7, r8, r9, r5)
            if (r2 != r4) goto L33
            return r4
        L30:
            X.C141335gf.LIZJ(r2)
        L33:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r2
            if (r2 == 0) goto L3d
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r2.getEffect()
            if (r2 != 0) goto L40
        L3d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L40:
            X.0Re r1 = X.C1KC.LIZIZ
            com.ss.android.ugc.effectmanager.EffectManager r0 = r1.LIZ
            boolean r0 = r0.isEffectDownloaded(r2)
            if (r0 != 0) goto L61
            r5.LJLJI = r3
            java.lang.Object r2 = r1.LIZ(r2, r5)
            if (r2 != r4) goto L23
            return r4
        L53:
            X.1vu r5 = new X.1vu
            r5.<init>(r6, r10)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L61:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1KC.LIZLLL(java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.InterfaceC67352kd<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C48871vv
            if (r0 == 0) goto L91
            r5 = r11
            X.1vv r5 = (X.C48871vv) r5
            int r2 = r5.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r5.LJLJL = r2
        L12:
            java.lang.Object r6 = r5.LJLJJL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJL
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L50
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L98
            java.lang.Object r8 = r5.LJLILLLLZI
            java.lang.String r8 = (java.lang.String) r8
            X.1KC r1 = r5.LJLIL
            X.C141335gf.LIZJ(r6)
        L2a:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r6 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r6
            if (r6 == 0) goto L35
            r1.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r3 = LJIIIZ(r6, r8)
        L35:
            r0 = r3
            if (r3 == 0) goto L3d
        L38:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r1 = X.C1KC.LIZJ
            r1.put(r8, r0)
        L3d:
            return r0
        L3e:
            java.lang.Object r10 = r5.LJLJJI
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r5.LJLJI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.LJLILLLLZI
            java.lang.String r8 = (java.lang.String) r8
            X.1KC r1 = r5.LJLIL
            X.C141335gf.LIZJ(r6)
            goto L6f
        L50:
            X.C141335gf.LIZJ(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = X.C1KC.LIZJ
            java.lang.Object r0 = r0.get(r8)
            if (r0 != 0) goto L38
            X.0Re r0 = X.C1KC.LIZIZ
            r5.LJLIL = r7
            r5.LJLILLLLZI = r8
            r5.LJLJI = r9
            r5.LJLJJI = r10
            r5.LJLJL = r1
            java.lang.Object r6 = r0.LIZJ(r9, r10, r5)
            if (r6 != r4) goto L6e
            return r4
        L6e:
            r1 = r7
        L6f:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r6 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r6
            if (r6 == 0) goto L8f
            r1.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = LJIIIZ(r6, r8)
        L7a:
            if (r0 != 0) goto L38
            X.0Re r0 = X.C1KC.LIZIZ
            r5.LJLIL = r1
            r5.LJLILLLLZI = r8
            r5.LJLJI = r3
            r5.LJLJJI = r3
            r5.LJLJL = r2
            java.lang.Object r6 = r0.LIZIZ(r9, r10, r3, r5)
            if (r6 != r4) goto L2a
            return r4
        L8f:
            r0 = r3
            goto L7a
        L91:
            X.1vv r5 = new X.1vv
            r5.<init>(r7, r11)
            goto L12
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1KC.LJII(java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC67352kd<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C48891vx
            if (r0 == 0) goto L48
            r4 = r9
            X.1vx r4 = (X.C48891vx) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJL
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L4e
            java.lang.Object r6 = r4.LJLILLLLZI
            java.lang.String r6 = (java.lang.String) r6
            X.1KC r0 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L26:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r3 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r3
            if (r3 == 0) goto L32
            r0.getClass()
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = LJIIIZ(r3, r6)
        L31:
            return r0
        L32:
            r0 = 0
            goto L31
        L34:
            X.C141335gf.LIZJ(r3)
            X.0Re r0 = X.C1KC.LIZIZ
            r4.LJLIL = r5
            r4.LJLILLLLZI = r6
            r4.LJLJJL = r1
            java.lang.Object r3 = r0.LIZJ(r7, r8, r4)
            if (r3 != r2) goto L46
            return r2
        L46:
            r0 = r5
            goto L26
        L48:
            X.1vx r4 = new X.1vx
            r4.<init>(r5, r9)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1KC.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }

    public static Object LJIIJJI(int i, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C54322Bg(i, str3, str, str2, null), interfaceC67352kd);
    }

    @Override // X.C0WL
    public final Object LIZ(String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        return XKX.LJI(C78613UtF.LIZJ, new C54272Bb(str, str2, str3, null, interfaceC65784Pro, interfaceC65784Pro2, interfaceC88472Yns, z), interfaceC67352kd);
    }
}
