package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.json.adapter.BooleanAsIntTypeAdapter;
import com.ss.android.ugc.aweme.creative.model.json.adapter.ThirdPartyModelDefaultTypeAdapter;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;

/* renamed from: X.Plk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65408Plk extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final C65408Plk LJLIL = new C65408Plk();

    public C65408Plk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        e eVar = new e();
        eVar.LJIIJ = true;
        eVar.LIZ = eVar.LIZ.LJ(new C65384PlM(), true, true);
        eVar.LIZIZ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), MusicBeat.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), MusicHighPrecisionDuration.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), EffectPointModel.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), UrlModel.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), DuetAndStitchRouterConfig.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), AVChallenge.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), StickerItemModel.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), StickerInfo.class);
        eVar.LIZIZ(new ThirdPartyModelDefaultTypeAdapter(), AddYoursStickerModel.class);
        return eVar.LIZ();
    }
}
