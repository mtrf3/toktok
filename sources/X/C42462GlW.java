package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.music.model.MusicEditResponse;
import com.ss.android.ugc.aweme.services.edit.OriginalAudioTrack;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicApi;
import kotlin.jvm.internal.o;

/* renamed from: X.GlW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42462GlW {
    public static MusicEditResponse LIZ(ReplaceMusicRequest model) {
        String str;
        int intValue;
        o.LJIIIZ(model, "model");
        ReplaceMusicApi.Api api = (ReplaceMusicApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, ReplaceMusicApi.Api.class);
        String itemID = model.getItemID();
        String originalVid = model.getOriginalVid();
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), model.getEditMusicStruct());
        o.LJIIIIZZ(json, "getAPI().networkService.…on(model.editMusicStruct)");
        Integer voiceVolume = model.getVoiceVolume();
        if (voiceVolume != null && (intValue = voiceVolume.intValue()) > 0) {
            str = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), new OriginalAudioTrack(intValue));
        } else {
            str = null;
        }
        MusicEditResponse musicEditResponse = api.get(itemID, originalVid, json, str).execute().LIZIZ;
        o.LJIIIIZZ(musicEditResponse, "api.get(\n               …       ).execute().body()");
        return musicEditResponse;
    }
}
