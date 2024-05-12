package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS68S1100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XEa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84492XEa {
    public static volatile EffectChannelResponse LIZ;
    public static volatile Effect LIZIZ;
    public static volatile Effect LIZJ;
    public static volatile InterfaceC84498XEg LIZLLL;

    public static void LIZ(Context context, PodcastUrlModel podcastUrlModel, AqS68S1100000_15 aqS68S1100000_15) {
        List<String> urlList;
        o.LJIIIZ(context, "context");
        if (podcastUrlModel != null && (urlList = podcastUrlModel.getUrlList()) != null && (!urlList.isEmpty())) {
            W5F LJII = W5U.LJII(new ImageUrlModel(podcastUrlModel.getUri(), podcastUrlModel.getUrlList()));
            LJII.LIZJ = context;
            LJII.LIZIZ("FullEpisodeBackgroundUtils");
            LJII.LJII(new C84493XEb(aqS68S1100000_15));
        }
    }

    public static void LIZIZ(EffectChannelResponse effectChannelResponse, InterfaceC84498XEg interfaceC84498XEg, InterfaceC88472Yns interfaceC88472Yns) {
        String str;
        Effect effect = (Effect) ListProtector.get(effectChannelResponse.getAllCategoryEffects(), 0);
        Effect effect2 = LIZIZ;
        if (effect2 != null) {
            str = effect2.getId();
        } else {
            str = null;
        }
        if (o.LJ(str, effect.getId())) {
            LIZJ = LIZIZ;
            return;
        }
        if (interfaceC84498XEg.LJJIL(effect)) {
            LIZJ = effect;
            LIZIZ = LIZJ;
            interfaceC88472Yns.invoke(effect);
            C2VP.LIZ(new AqS165S0100000_15(effect, 863));
            return;
        }
        interfaceC84498XEg.fetchEffect(effect, new XEZ(effect, interfaceC88472Yns));
    }
}
