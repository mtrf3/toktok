package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1TT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1TT extends AbstractC14150h1<LiveEffect> implements C0WP<LiveEffect>, C0WM<LiveEffect> {
    public final EffectManager LJLILLLLZI;

    public C1TT() {
        EffectManager LJLJJLL = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        o.LJIIIIZZ(LJLJJLL, "getService(IHostCreative…class.java).effectManager");
        this.LJLILLLLZI = LJLJJLL;
    }

    public static boolean LIZLLL(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "liveEffect");
        if (liveEffect.isShareBackground) {
            String str = liveEffect.shareImagePath;
            if (str == null || str.length() <= 0 || !C1B6.LIZIZ(str)) {
                return false;
            }
            return true;
        }
        return C1KJ.LJIIL(liveEffect.getEffect());
    }

    @Override // X.AbstractC14150h1
    public final /* bridge */ /* synthetic */ boolean LIZIZ(LiveEffect liveEffect) {
        return LIZLLL(liveEffect);
    }

    @Override // X.C0WP
    public List<C1QC> LJIIZILJ(List<C1QC> effectPanelList) {
        boolean z;
        o.LJIIIZ(effectPanelList, "effectPanelList");
        Iterator<C1QC> it = effectPanelList.iterator();
        while (it.hasNext()) {
            Iterator<Object> it2 = it.next().LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it2.next();
                liveEffect.isDownloaded = LIZLLL(liveEffect);
                if (C78880UxY.LJJJJLI(liveEffect)) {
                    if (liveEffect.isDownloaded || C78880UxY.LJJJJJL(liveEffect)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    liveEffect.isDownloaded = z;
                    List<? extends LiveEffect> list = liveEffect.subStickers;
                    if (list != null) {
                        for (LiveEffect liveEffect2 : list) {
                            liveEffect2.isDownloaded = LIZLLL(liveEffect2);
                        }
                    }
                }
            }
        }
        return effectPanelList;
    }

    @Override // X.AbstractC14150h1
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final void LIZ(final LiveEffect liveEffect, final InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(liveEffect, "liveEffect");
        if (liveEffect.getEffect() == null) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(-3);
            }
        } else {
            Effect effect = liveEffect.getEffect();
            if (effect != null) {
                this.LJLILLLLZI.fetchEffect(effect, new IEffectDownloadProgressListener() { // from class: X.21I
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onStart(Effect effect2) {
                        C1TT.this.LJLIL.add(liveEffect);
                        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(-1);
                        }
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(Effect effect2) {
                        String str;
                        Effect effect3 = effect2;
                        C1TT.this.LJLIL.remove(liveEffect);
                        C0TX.LIZ.LIZJ("EffectRepository");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("download effect success, effect_id: ");
                        if (effect3 != null) {
                            str = effect3.getEffect_id();
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        C0TX.LIZLLL(X1D.LIZIZ(LIZ));
                        C1KJ.LJIIIIZZ(effect3);
                        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(-2);
                        }
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                    public final void onFail(Effect effect2, ExceptionResult e) {
                        String str;
                        o.LJIIIZ(e, "e");
                        C1TT.this.LJLIL.remove(liveEffect);
                        C0TX.LIZ.LIZJ("EffectRepository");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("download effect failed, effect_id: ");
                        if (effect2 != null) {
                            str = effect2.getEffect_id();
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        C0TX.LIZLLL(X1D.LIZIZ(LIZ));
                        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(-3);
                        }
                    }

                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                    public final void onProgress(Effect effect2, int i, long j) {
                        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(Integer.valueOf(i));
                        }
                    }
                });
            }
        }
    }
}
