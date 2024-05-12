package X;

import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43441nA implements IFetchEffectChannelListener {
    public final /* synthetic */ NaviAvatarListViewModel LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        C0NB.LJFF("LiveNaviAvatar", "fetch effects error", new Exception("Cannot fetch panel info"));
        this.LIZ.hv0(new C0LF(null, this.LIZIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectCategoryResponse effectCategoryResponse;
        List<Effect> totalEffects;
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (effectChannelResponse2 != null) {
            List<EffectCategoryResponse> categoryResponseList = effectChannelResponse2.getCategoryResponseList();
            if (categoryResponseList != null) {
                Iterator<EffectCategoryResponse> it = categoryResponseList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        effectCategoryResponse = it.next();
                        if (o.LJ(effectCategoryResponse.getKey(), "skin_tone")) {
                            break;
                        }
                    } else {
                        effectCategoryResponse = null;
                        break;
                    }
                }
                EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
                if (effectCategoryResponse2 != null && (totalEffects = effectCategoryResponse2.getTotalEffects()) != null) {
                    this.LIZ.LJLJJLL.setValue(C61328O5c.LJ(totalEffects));
                }
            }
            List<Effect> allCategoryEffects = effectChannelResponse2.getAllCategoryEffects();
            if (allCategoryEffects != null) {
                String str = this.LIZIZ;
                NaviAvatarListViewModel naviAvatarListViewModel = this.LIZ;
                for (Effect effect : allCategoryEffects) {
                    if (o.LJ(effect.getName(), str)) {
                        FP1.LJFF("find target effect: ", str, "LiveNaviAvatar");
                        C1KJ c1kj = C1KJ.LIZ;
                        if (!C1KJ.LJIIL(effect)) {
                            FP1.LJFF("start download navi effect: ", str, "LiveNaviAvatar");
                            c1kj.LIZLLL(effect, naviAvatarListViewModel.LJLJL);
                        } else {
                            naviAvatarListViewModel.hv0(new C0LF(effect, str));
                        }
                    }
                    linkedHashMap.put(effect.getName(), effect.getEffectId());
                }
            }
        }
        this.LIZ.LJLJJL.setValue(linkedHashMap);
    }

    public C43441nA(NaviAvatarListViewModel naviAvatarListViewModel, String str) {
        this.LIZ = naviAvatarListViewModel;
        this.LIZIZ = str;
    }
}
