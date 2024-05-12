package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQI implements InterfaceC82245WPp {
    public final InterfaceC84497XEf LIZ;
    public final InterfaceC82236WPg LIZIZ;

    public WQI(InterfaceC84497XEf effectPlatform, InterfaceC82236WPg repository) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(repository, "repository");
        this.LIZ = effectPlatform;
        this.LIZIZ = repository;
    }

    @Override // X.InterfaceC82245WPp
    public final void LIZ(EffectCategoryResponse effectCategoryResponse, IUpdateTagListener iUpdateTagListener) {
        InterfaceC84497XEf interfaceC84497XEf = this.LIZ;
        String id = effectCategoryResponse.getId();
        String tagsUpdateTime = effectCategoryResponse.getTagsUpdateTime();
        if (iUpdateTagListener == null) {
            iUpdateTagListener = WQK.LIZ;
        }
        interfaceC84497XEf.updateTag(id, tagsUpdateTime, iUpdateTagListener);
    }

    @Override // X.InterfaceC82245WPp
    public final void LIZIZ(FilterBean filter, IUpdateTagListener iUpdateTagListener) {
        o.LJIIIZ(filter, "filter");
        WPX findEffectOrNull = this.LIZIZ.LJJJJIZL();
        o.LJIIIZ(findEffectOrNull, "$this$findEffectOrNull");
        java.util.Map map = (java.util.Map) findEffectOrNull.LIZLLL().getValue();
        if (map != null) {
            EffectTemplate effectTemplate = (EffectTemplate) map.get(filter.getName());
            if (effectTemplate != null || (effectTemplate = (EffectTemplate) map.get(filter.getEnName())) != null) {
                InterfaceC84497XEf interfaceC84497XEf = this.LIZ;
                String id = effectTemplate.getId();
                String tagsUpdatedAt = effectTemplate.getTagsUpdatedAt();
                if (iUpdateTagListener == null) {
                    iUpdateTagListener = WQJ.LIZ;
                }
                interfaceC84497XEf.updateTag(id, tagsUpdatedAt, iUpdateTagListener);
            }
        }
    }

    @Override // X.InterfaceC82245WPp
    public final void LIZJ(EffectCategoryResponse category, C82246WPq c82246WPq) {
        o.LJIIIZ(category, "category");
        this.LIZ.LJIIIIZZ(category.getId(), category.getTags(), category.getTagsUpdateTime(), c82246WPq);
    }
}
