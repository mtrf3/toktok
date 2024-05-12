package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1g1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39011g1 implements InterfaceC14130gz {
    public final String LJLIL;
    public final EffectManager LJLILLLLZI;
    public final C07500Re LJLJI;
    public final CopyOnWriteArrayList LJLJJI;
    public transient List<C32001Nk> LJLJJL;
    public final ConcurrentHashMap<String, List<LiveEffect>> LJLJJLL;
    public final ConcurrentHashMap<String, List<LiveEffect>> LJLJL;
    public C1QC LJLJLJ;
    public C1QC LJLJLLL;
    public volatile boolean LJLL;

    public static java.util.Map LIZIZ() {
        int i;
        Long valueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C29306Beo.LJJI() || C29306Beo.LJIILJJIL()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("from", Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJJI())) ? 1 : 0));
            jSONObject.putOpt(WM7.SCENE_SERVICE, ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene());
            if (C29306Beo.LJJI() || C29306Beo.LJIILJJIL()) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.putOpt("role", Integer.valueOf(i));
            jSONObject.putOpt("number_of_audience", Integer.valueOf(C31014CFe.LJI));
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && (valueOf = Long.valueOf(room.getCreateTime())) != null) {
                jSONObject.putOpt("live_duration_seconds", Long.valueOf((C30725C4b.LIZ() / 1000) - valueOf.longValue()));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("effect_recommend", jSONObject.toString());
            String jSONObject3 = jSONObject2.toString();
            o.LJIIIIZZ(jSONObject3, "JSONObject().apply {\n   …\n            }.toString()");
            linkedHashMap.put("extra", jSONObject3);
        }
        return linkedHashMap;
    }

    public C39011g1(String effectPanelKey) {
        o.LJIIIZ(effectPanelKey, "effectPanelKey");
        this.LJLIL = effectPanelKey;
        EffectManager LJLJJLL = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        o.LJIIIIZZ(LJLJJLL, "getService(IHostCreative…class.java).effectManager");
        this.LJLILLLLZI = LJLJJLL;
        this.LJLJI = new C07500Re();
        this.LJLJJI = new CopyOnWriteArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ConcurrentHashMap<>();
        this.LJLJL = new ConcurrentHashMap<>();
        this.LJLJLJ = new C1QC("favorite", "favorite", new ArrayList(), null, 56);
        String RECENTS = C0TY.LJIIJ;
        o.LJIIIIZZ(RECENTS, "RECENTS");
        this.LJLJLLL = new C1QC(RECENTS, "Recents", new ArrayList(), null, 56);
    }

    public static Iterable LJIILL(Iterable iterable) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            LiveEffect liveEffect = (LiveEffect) obj;
            LiveEffectNewEffectReverseSetting liveEffectNewEffectReverseSetting = LiveEffectNewEffectReverseSetting.INSTANCE;
            if (liveEffectNewEffectReverseSetting.enable()) {
                if (liveEffectNewEffectReverseSetting.enable()) {
                    Effect effect = liveEffect.getEffect();
                    if (effect != null) {
                        j = effect.getPtime();
                    } else {
                        j = 0;
                    }
                    if (j < LiveEffectNewEffectReverseTimeSetting.INSTANCE.getValue()) {
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final Object LIZJ(InterfaceC67352kd<? super List<C32001Nk>> interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LIZLLL(interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (!((ArrayList) this.LJLJJL).isEmpty()) {
            List<C32001Nk> list = this.LJLJJL;
            C3C5.m7constructorimpl(list);
            c84654XKg.resumeWith(list);
        } else {
            this.LJLILLLLZI.checkPanelIsUpdate(this.LJLIL, new ICheckChannelListener() { // from class: X.1g2
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    C39011g1.this.LJIIJJI(c84654XKg);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    if (z) {
                        C39011g1.this.LJIIJJI(c84654XKg);
                        return;
                    }
                    final C39011g1 c39011g1 = C39011g1.this;
                    final InterfaceC67352kd<List<C32001Nk>> interfaceC67352kd2 = c84654XKg;
                    if (((ArrayList) c39011g1.LJLJJL).isEmpty()) {
                        c39011g1.LJLILLLLZI.fetchPanelInfoFromCache(C0TY.LIZIZ, false, "", 0, 0, new IFetchPanelInfoListener() { // from class: X.1pI
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                            public final void onFail(ExceptionResult exceptionResult) {
                                C39011g1.this.LJIIJJI(interfaceC67352kd2);
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(PanelInfoModel panelInfoModel) {
                                C39011g1 c39011g12 = C39011g1.this;
                                InterfaceC67352kd<List<C32001Nk>> interfaceC67352kd3 = interfaceC67352kd2;
                                c39011g12.getClass();
                                List<C32001Nk> LJIJ = c39011g12.LJIJ(panelInfoModel);
                                C3C5.m7constructorimpl(LJIJ);
                                interfaceC67352kd3.resumeWith(LJIJ);
                            }
                        });
                        return;
                    }
                    List<C32001Nk> list2 = c39011g1.LJLJJL;
                    C3C5.m7constructorimpl(list2);
                    interfaceC67352kd2.resumeWith(list2);
                }
            });
        }
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super java.util.List<X.C32001Nk>> r17) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39011g1.LIZLLL(X.2kd):java.lang.Object");
    }

    public final C31941Ne LJFF(String category) {
        Object obj;
        List list;
        o.LJIIIZ(category, "category");
        Iterator it = this.LJLJJI.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((C1QC) obj).LJLJI, category)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1QC c1qc = (C1QC) obj;
        if (c1qc == null || (list = c1qc.LJLILLLLZI) == null) {
            list = C61878OQg.INSTANCE;
        }
        return new C31941Ne(list, category, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C535528h
            if (r0 == 0) goto L8f
            r8 = r10
            X.28h r8 = (X.C535528h) r8
            int r2 = r8.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r8.LJLJJL = r2
        L12:
            java.lang.Object r5 = r8.LJLJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJL
            r6 = 1
            if (r0 == 0) goto L53
            if (r0 != r6) goto La6
            long r3 = r8.LJLILLLLZI
            X.1g1 r2 = r8.LJLIL
            X.C141335gf.LIZJ(r5)
        L24:
            com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse r5 = (com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse) r5
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            if (r5 != 0) goto L2e
            r6 = 2
        L2e:
            java.lang.String r3 = "favorite"
            X.C32041No.LJIILJJIL(r6, r0, r3)
            X.15T r0 = new X.15T
            r0.<init>(r3, r3)
            X.1QC r1 = r0.LIZ(r5)
            X.O6R.LJJIIJ(r1)
            if (r5 == 0) goto L96
            X.1QC r3 = new X.1QC
            X.1QC r0 = r2.LJLJLJ
            java.lang.String r4 = r0.LJLIL
            java.util.List<java.lang.Object> r6 = r1.LJLILLLLZI
            r7 = 0
            r8 = 56
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            r2.LJLJLJ = r3
            return r3
        L53:
            X.C141335gf.LIZJ(r5)
            long r3 = java.lang.System.currentTimeMillis()
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "Sticker"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch remote's favorite effect."
            X.C0TX.LIZLLL(r0)
            X.0Re r1 = r9.LJLJI
            java.lang.String r5 = r9.LJLIL
            r8.LJLIL = r9
            r8.LJLILLLLZI = r3
            r8.LJLJJL = r6
            r1.getClass()
            X.XKg r2 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r8)
            r2.<init>(r0)
            com.ss.android.ugc.effectmanager.EffectManager r1 = r1.LIZ
            X.1kM r0 = new X.1kM
            r0.<init>()
            r1.fetchFavoriteList(r5, r0)
            java.lang.Object r5 = r2.LIZ()
            if (r5 != r7) goto L8d
            return r7
        L8d:
            r2 = r9
            goto L24
        L8f:
            X.28h r8 = new X.28h
            r8.<init>(r9, r10)
            goto L12
        L96:
            X.1QC r3 = new X.1QC
            X.1QC r0 = r2.LJLJLJ
            java.lang.String r4 = r0.LJLIL
            java.util.List<java.lang.Object> r6 = r1.LJLILLLLZI
            r7 = 0
            r8 = 56
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39011g1.LJIIIZ(X.2kd):java.lang.Object");
    }

    public final Object LJIIJ(InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (!this.LJLJJI.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.LJLJJI;
            C3C5.m7constructorimpl(copyOnWriteArrayList);
            c84654XKg.resumeWith(copyOnWriteArrayList);
        } else {
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            C3C5.m7constructorimpl(c61878OQg);
            c84654XKg.resumeWith(c61878OQg);
        }
        return c84654XKg.LIZ();
    }

    public final void LJIIJJI(final InterfaceC67352kd<? super List<C32001Nk>> interfaceC67352kd) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJLILLLLZI.fetchPanelInfo(C0TY.LIZIZ, false, "", 0, 0, LIZIZ(), new IFetchPanelInfoListener() { // from class: X.1pE
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                C32041No.LJIILJJIL(2, System.currentTimeMillis() - currentTimeMillis, C0TY.LIZIZ);
                InterfaceC67352kd<List<C32001Nk>> interfaceC67352kd2 = interfaceC67352kd;
                ArrayList arrayList = new ArrayList();
                C3C5.m7constructorimpl(arrayList);
                interfaceC67352kd2.resumeWith(arrayList);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                C32041No.LJIILJJIL(1, System.currentTimeMillis() - currentTimeMillis, C0TY.LIZIZ);
                C39011g1 c39011g1 = this;
                InterfaceC67352kd<List<C32001Nk>> interfaceC67352kd2 = interfaceC67352kd;
                c39011g1.getClass();
                List<C32001Nk> LJIJ = c39011g1.LJIJ(panelInfoModel);
                C3C5.m7constructorimpl(LJIJ);
                interfaceC67352kd2.resumeWith(LJIJ);
            }
        });
    }

    public final Object LJIIL(InterfaceC67352kd interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LJIILIIL(interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        this.LJLILLLLZI.fetchEffectList(this.LJLIL, false, new IFetchEffectChannelListener(this) { // from class: X.1pK
            public final /* synthetic */ C39011g1 LIZIZ;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = c84654XKg;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                C3C5.m7constructorimpl(c61878OQg);
                interfaceC67352kd2.resumeWith(c61878OQg);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = c84654XKg;
                List LJIIZILJ = this.LIZIZ.LJIIZILJ(effectChannelResponse);
                C3C5.m7constructorimpl(LJIIZILJ);
                interfaceC67352kd2.resumeWith(LJIIZILJ);
            }

            {
                this.LIZIZ = this;
            }
        });
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.InterfaceC67352kd r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C535628i
            if (r0 == 0) goto L49
            r4 = r6
            X.28i r4 = (X.C535628i) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L4f
            X.1g1 r0 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            java.util.List r0 = r0.LJIIZILJ(r1)
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "Sticker"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch remote's sticker data."
            X.C0TX.LIZLLL(r0)
            X.0Re r1 = r5.LJLJI
            java.lang.String r0 = r5.LJLIL
            r4.LJLIL = r5
            r4.LJLJJI = r2
            java.lang.Object r1 = r1.LIZLLL(r0, r4)
            if (r1 != r3) goto L47
            return r3
        L47:
            r0 = r5
            goto L22
        L49:
            X.28i r4 = new X.28i
            r4.<init>(r5, r6)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39011g1.LJIILIIL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[LOOP:0: B:17:0x0079->B:19:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.InterfaceC67352kd<? super X.C31941Ne> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C535728j
            if (r0 == 0) goto L5c
            r5 = r12
            X.28j r5 = (X.C535728j) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r4 = 1
            if (r0 == 0) goto L26
            if (r0 != r4) goto Lb1
            X.C141335gf.LIZJ(r1)
        L20:
            com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate r1 = (com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate) r1
            r6 = 0
            if (r1 != 0) goto L62
            return r6
        L26:
            X.C141335gf.LIZJ(r1)
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "Sticker"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch reward's effect data."
            X.C0TX.LIZLLL(r0)
            X.0Re r2 = r11.LJLJI
            java.lang.String r6 = r11.LJLIL
            r7 = 100
            r8 = 0
            r9 = 0
            r5.LJLJI = r4
            r2.getClass()
            X.XKg r1 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r5)
            r1.<init>(r0)
            com.ss.android.ugc.effectmanager.EffectManager r5 = r2.LIZ
            X.1kP r10 = new X.1kP
            r10.<init>()
            r5.fetchRewardEffects(r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.LIZ()
            if (r1 != r3) goto L20
            return r3
        L5c:
            X.28j r5 = new X.28j
            r5.<init>(r11, r12)
            goto L12
        L62:
            java.util.List r1 = r1.getRewardEffects()
            java.lang.String r5 = "livereward"
            if (r1 == 0) goto L9c
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r1 = X.C0LT.LIZIZ(r0)
            java.lang.String r0 = X.C0TY.LJIIIZ
            r1.effectPanelName = r0
            r1.effectPanelKey = r5
            X.C77412UZs.LJIIL(r1, r4)
            r3.add(r1)
            goto L79
        L96:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9d
        L9c:
            return r6
        L9d:
            java.util.List r0 = X.C79004UzY.LJIIJ(r3)
            java.util.List r0 = X.C78880UxY.LJJIII(r0)
            java.util.List r1 = X.C78880UxY.LJJIIJ(r0)
            X.1Ne r6 = new X.1Ne
            r0 = 12
            r6.<init>(r1, r5, r0)
            goto L9c
        Lb1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39011g1.LJIILJJIL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        if (r15 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C31941Ne LJIILLIIL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r18) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39011g1.LJIILLIIL(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel):X.1Ne");
    }

    public final List LJIIZILJ(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null) {
            return C61878OQg.INSTANCE;
        }
        FH4 fh4 = new FH4();
        List LJIIJJI = new V0N().LJIIJJI(effectChannelResponse);
        fh4.LJIIZILJ(LJIIJJI);
        if (!LJIIJJI.isEmpty()) {
            this.LJLJJI.clear();
            this.LJLJJI.addAll(LJIIJJI);
            this.LJLL = true;
            return LJIIJJI;
        }
        return C61878OQg.INSTANCE;
    }

    public final List<C32001Nk> LJIJ(PanelInfoModel panelInfoModel) {
        List<EffectCategoryModel> categoryList;
        ArrayList arrayList = new ArrayList();
        C32001Nk c32001Nk = null;
        if (panelInfoModel != null && (categoryList = panelInfoModel.getCategoryList()) != null) {
            for (EffectCategoryModel effectCategoryModel : categoryList) {
                String lowerCase = effectCategoryModel.getKey().toLowerCase();
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                if (o.LJ(lowerCase, "trending")) {
                    c32001Nk = new C32001Nk(effectCategoryModel.getName(), effectCategoryModel.getKey(), false);
                } else {
                    arrayList.add(new C32001Nk(effectCategoryModel.getName(), effectCategoryModel.getKey(), false));
                }
            }
            if (c32001Nk != null) {
                ListProtector.add(arrayList, 0, c32001Nk);
            }
        }
        this.LJLJJL = arrayList;
        return arrayList;
    }

    public final Object LIZ(String str, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        boolean z;
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C15380j0.LIZLLL();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C0TX.LIZIZ("try to check need update effect");
            this.LJLILLLLZI.checkCategoryIsUpdate(this.LJLIL, str, new ICheckChannelListener() { // from class: X.1g0
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    InterfaceC67352kd<Boolean> interfaceC67352kd2 = c84654XKg;
                    Boolean bool = Boolean.FALSE;
                    C3C5.m7constructorimpl(bool);
                    interfaceC67352kd2.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z2) {
                    Boolean valueOf = Boolean.valueOf(z2);
                    InterfaceC67352kd<Boolean> interfaceC67352kd2 = c84654XKg;
                    C3C5.m7constructorimpl(valueOf);
                    interfaceC67352kd2.resumeWith(valueOf);
                }
            });
        } else {
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            c84654XKg.resumeWith(bool);
        }
        return c84654XKg.LIZ();
    }

    public final Object LJ(String str, InterfaceC67352kd<? super C31941Ne> interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LJII(str, interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        this.LJLILLLLZI.fetchCategoryEffectFromCache(this.LJLIL, str, 0, 0, 0, CardStruct.IStatusCode.DEFAULT, new IFetchCategoryEffectListener(this) { // from class: X.1pF
            public final /* synthetic */ C39011g1 LIZIZ;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC67352kd<C31941Ne> interfaceC67352kd2 = c84654XKg;
                C31941Ne c31941Ne = new C31941Ne(C61878OQg.INSTANCE, null, 14);
                C3C5.m7constructorimpl(c31941Ne);
                interfaceC67352kd2.resumeWith(c31941Ne);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                InterfaceC67352kd<C31941Ne> interfaceC67352kd2 = c84654XKg;
                C31941Ne LJIILLIIL = this.LIZIZ.LJIILLIIL(categoryPageModel);
                C3C5.m7constructorimpl(LJIILLIIL);
                interfaceC67352kd2.resumeWith(LJIILLIIL);
            }

            {
                this.LIZIZ = this;
            }
        });
        return c84654XKg.LIZ();
    }

    public final Object LJI(final String str, InterfaceC67352kd<? super C31941Ne> interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LJIIIIZZ(str, interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJLILLLLZI.fetchCategoryEffect(this.LJLIL, str, 0, 0, 0, CardStruct.IStatusCode.DEFAULT, LIZIZ(), new IFetchCategoryEffectListener() { // from class: X.1pG
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                C32041No.LJIILJJIL(2, System.currentTimeMillis() - currentTimeMillis, str);
                InterfaceC67352kd<C31941Ne> interfaceC67352kd2 = c84654XKg;
                C31941Ne c31941Ne = new C31941Ne(C61878OQg.INSTANCE, null, 14);
                C3C5.m7constructorimpl(c31941Ne);
                interfaceC67352kd2.resumeWith(c31941Ne);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                C32041No.LJIILJJIL(1, System.currentTimeMillis() - currentTimeMillis, str);
                InterfaceC67352kd<C31941Ne> interfaceC67352kd2 = c84654XKg;
                C31941Ne LJIILLIIL = this.LJIILLIIL(categoryPageModel);
                C3C5.m7constructorimpl(LJIILLIIL);
                interfaceC67352kd2.resumeWith(LJIILLIIL);
            }
        });
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r6, X.InterfaceC67352kd<? super X.C31941Ne> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C535328f
            if (r0 == 0) goto L49
            r4 = r7
            X.28f r4 = (X.C535328f) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L4f
            X.1g1 r0 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r1 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r1
            X.1Ne r0 = r0.LJIILLIIL(r1)
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "Sticker"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch cache's category effect data."
            X.C0TX.LIZLLL(r0)
            X.0Re r1 = r5.LJLJI
            java.lang.String r0 = r5.LJLIL
            r4.LJLIL = r5
            r4.LJLJJI = r2
            java.lang.Object r1 = r1.LIZJ(r0, r6, r4)
            if (r1 != r3) goto L47
            return r3
        L47:
            r0 = r5
            goto L22
        L49:
            X.28f r4 = new X.28f
            r4.<init>(r5, r7)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39011g1.LJII(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(java.lang.String r10, X.InterfaceC67352kd<? super X.C31941Ne> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C535428g
            if (r0 == 0) goto L5a
            r8 = r11
            X.28g r8 = (X.C535428g) r8
            int r2 = r8.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r8.LJLJJLL = r2
        L12:
            java.lang.Object r7 = r8.LJLJJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJLL
            r5 = 1
            if (r0 == 0) goto L3a
            if (r0 != r5) goto L60
            long r3 = r8.LJLJI
            java.lang.Object r10 = r8.LJLILLLLZI
            java.lang.String r10 = (java.lang.String) r10
            X.1g1 r2 = r8.LJLIL
            X.C141335gf.LIZJ(r7)
        L28:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r7 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r7
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            if (r7 != 0) goto L32
            r5 = 2
        L32:
            X.C32041No.LJIILJJIL(r5, r0, r10)
            X.1Ne r0 = r2.LJIILLIIL(r7)
            return r0
        L3a:
            X.C141335gf.LIZJ(r7)
            long r3 = java.lang.System.currentTimeMillis()
            X.0Re r2 = r9.LJLJI
            java.lang.String r1 = r9.LJLIL
            java.util.Map r0 = LIZIZ()
            r8.LJLIL = r9
            r8.LJLILLLLZI = r10
            r8.LJLJI = r3
            r8.LJLJJLL = r5
            java.lang.Object r7 = r2.LIZIZ(r1, r10, r0, r8)
            if (r7 != r6) goto L58
            return r6
        L58:
            r2 = r9
            goto L28
        L5a:
            X.28g r8 = new X.28g
            r8.<init>(r9, r11)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39011g1.LJIIIIZZ(java.lang.String, X.2kd):java.lang.Object");
    }

    public final void LJIJJ(LiveEffect liveEffect, boolean z) {
        if (liveEffect != null) {
            List LLJILJILJ = ORZ.LLJILJILJ(this.LJLJLLL.LJLILLLLZI);
            if (z) {
                C29306Beo.LJJIJIIJI(new IDqS416S0100000(liveEffect, 369), LLJILJILJ);
                LiveEffect copy = liveEffect.copy();
                copy.effectPanelName = C0TY.LJIIJ;
                copy.effectPanelKey = "Recents";
                int i = 0;
                ListProtector.add(LLJILJILJ, 0, copy);
                Iterator it = ((ArrayList) LLJILJILJ).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        ((LiveEffect) next).parentImpressionPos = Integer.valueOf(i);
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                ((ArrayList) LLJILJILJ).remove(liveEffect);
            }
            C1QC c1qc = this.LJLJLLL;
            this.LJLJLLL = new C1QC(c1qc.LJLIL, c1qc.LJLJI, LLJILJILJ, null, 56);
        }
    }

    public final void LJIJI(LiveEffect liveEffect, boolean z, InterfaceC67352kd interfaceC67352kd) {
        if (liveEffect != null) {
            List LLJILJILJ = ORZ.LLJILJILJ(this.LJLJLJ.LJLILLLLZI);
            if (z) {
                LiveEffect copy = liveEffect.copy();
                copy.effectPanelName = "favorite";
                copy.effectPanelKey = "favorite";
                int i = 0;
                ListProtector.add(LLJILJILJ, 0, copy);
                Iterator it = ((ArrayList) LLJILJILJ).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        ((LiveEffect) next).parentImpressionPos = Integer.valueOf(i);
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                ((ArrayList) LLJILJILJ).remove(liveEffect);
            }
            C1QC c1qc = this.LJLJLJ;
            C1QC c1qc2 = new C1QC(c1qc.LJLIL, c1qc.LJLJI, LLJILJILJ, null, 56);
            this.LJLJLJ = c1qc2;
            C3C5.m7constructorimpl(c1qc2);
            interfaceC67352kd.resumeWith(c1qc2);
        }
    }
}
