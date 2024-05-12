package com.bytedance.android.live.effect.smallitem;

import X.C15380j0;
import X.C1QC;
import X.C29306Beo;
import X.C37161d2;
import X.C44171oL;
import X.C47261Igj;
import X.C55702Go;
import X.C61328O5c;
import X.C61878OQg;
import X.C78880UxY;
import X.C79012Uzg;
import X.CN1;
import X.EnumC31814CeA;
import X.InterfaceC15310it;
import X.V8H;
import X.XKX;
import X.XLM;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyDefaultValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchExperimentSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveSmallItemBeautyViewModel extends BaseEffectViewModel<LiveEffect> {
    public final C44171oL LJLJJI;
    public final XLM LJLJJL;

    public static List kv0() {
        String str;
        LiveEffect.ComposerConfig composerConfig = new LiveEffect.ComposerConfig();
        composerConfig.tag = "Smooth_ALL";
        composerConfig.defaultValue = LiveAnchorEnableInnerBeautyDefaultValue.INSTANCE.getValue();
        composerConfig.maxValue = LiveAnchorEnableInnerBeautyMaxValue.INSTANCE.getValue();
        LiveEffect liveEffect = new LiveEffect();
        liveEffect.isLocal = true;
        liveEffect.effectId = 1L;
        liveEffect.setResourceId("1");
        liveEffect.localIcon = R.drawable.cts;
        liveEffect.name = C15380j0.LJIILJJIL(R.string.sxh);
        liveEffect.effectPanelName = C15380j0.LJIILJJIL(R.string.mkb);
        InterfaceC15310it liveCameraResManager = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getLiveCameraResManager();
        if (liveCameraResManager == null || (str = ((EnumC31814CeA) liveCameraResManager).getSmoothComposerFilePath()) == null) {
            str = "";
        }
        liveEffect.setUnzipPath(str);
        liveEffect.setComposerConfigList(C47261Igj.LJJIJ(composerConfig));
        List LJJIJ = C47261Igj.LJJIJ(liveEffect);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.mkb);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_live_page_beautify)");
        return C47261Igj.LJJIJ(new C1QC(LJIILJJIL, "beauty", LJJIJ, null, 56));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSmallItemBeautyViewModel(C44171oL repository) {
        super(new C79012Uzg(), repository);
        o.LJIIIZ(repository, "repository");
        this.LJLJJI = repository;
        this.LJLJJL = V8H.LIZ(new C37161d2(C61878OQg.INSTANCE));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C55702Go(this, null), 3);
    }

    public static List mv0(List list) {
        List list2 = list;
        if (LiveBeautySwitchExperimentSetting.INSTANCE.hasNone()) {
            list2 = list;
            if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
                ArrayList LJ = C61328O5c.LJ(list);
                Iterator it = LJ.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (ujb.o.LJJJLIIL(((C1QC) it.next()).LJLJI, "beauty", false)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                list2 = LJ;
                if (i >= 0) {
                    boolean LJJL = C78880UxY.LJJL((LiveEffect) ListProtector.get(((C1QC) ListProtector.get(LJ, i)).LJLILLLLZI, 0));
                    list2 = LJ;
                    if (!LJJL) {
                        C1QC c1qc = (C1QC) ListProtector.get(LJ, i);
                        String str = ((LiveEffect) ListProtector.get(c1qc.LJLILLLLZI, 0)).effectPanelName;
                        String str2 = ((LiveEffect) ListProtector.get(c1qc.LJLILLLLZI, 0)).effectPanelKey;
                        LiveEffect liveEffect = new LiveEffect();
                        liveEffect.effectPanelName = str;
                        liveEffect.effectPanelKey = str2;
                        LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
                        if (smallItemConfig != null) {
                            smallItemConfig.LIZ = 0;
                        }
                        liveEffect.extra = "first_none_in_beauty";
                        liveEffect.isLocal = true;
                        liveEffect.isDownloaded = true;
                        liveEffect.isNone = true;
                        liveEffect.isExclusive = false;
                        liveEffect.localIcon = R.drawable.d0l;
                        liveEffect.name = C15380j0.LJIILJJIL(R.string.ke3);
                        liveEffect.setResourceId(CardStruct.IStatusCode.DEFAULT);
                        arrayList.add(liveEffect);
                        arrayList.addAll(c1qc.LJLILLLLZI);
                        C1QC c1qc2 = (C1QC) ListProtector.get(LJ, i);
                        ListProtector.set(LJ, i, new C1QC(c1qc2.LJLIL, c1qc2.LJLJI, arrayList, c1qc2.LJLJJLL, c1qc2.LJLJJI, c1qc2.LJLJJL));
                        list2 = LJ;
                    }
                }
            }
        }
        return list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(X.InterfaceC67352kd r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C532927h
            if (r0 == 0) goto L71
            r4 = r8
            X.27h r4 = (X.C532927h) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 == r6) goto L26
            if (r0 != r5) goto L77
            X.C141335gf.LIZJ(r1)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel r0 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L59
        L2c:
            X.C141335gf.LIZJ(r1)
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            X.0it r0 = r0.getLiveCameraResManager()
            if (r0 == 0) goto L42
            X.CeA r0 = (X.EnumC31814CeA) r0
            r0.loadSmoothComposerFile()
        L42:
            X.XLL r2 = r7.LJLJI
            X.1d2 r1 = new X.1d2
            java.util.List r0 = kv0()
            r1.<init>(r0)
            r4.LJLIL = r7
            r4.LJLJJI = r6
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L58
            return r3
        L58:
            r0 = r7
        L59:
            X.XLM r2 = r0.LJLJJL
            X.1d2 r1 = new X.1d2
            java.util.List r0 = kv0()
            r1.<init>(r0)
            r0 = 0
            r4.LJLIL = r0
            r4.LJLJJI = r5
            r2.setValue(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r3) goto L23
            return r3
        L71:
            X.27h r4 = new X.27h
            r4.<init>(r7, r8)
            goto L12
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel.lv0(X.2kd):java.lang.Object");
    }
}
