package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.service.MusicRecordService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class OV0 extends SimpleServiceLoadCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Effect LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;
    public final /* synthetic */ OV1 LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        String str;
        OV3 ov3 = new OV3();
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(this.LIZ);
        builder.startRecordTime(this.LIZLLL.LJZL.LIZIZ);
        builder.decompressTime(j);
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        builder.shootWay("single_song");
        builder.musicWithSticker(this.LIZIZ);
        builder.translationType(3);
        builder.musicOrigin("single_song");
        builder.needLoadResourceAfterRecord(this.LIZLLL.LJLL.booleanValue());
        builder.extraEventParams(ov3);
        builder.videoLength(Integer.valueOf(this.LIZLLL.LJZI));
        String str2 = this.LIZLLL.LJLLJ;
        if (str2 != null) {
            builder.enterFrom(str2);
        }
        MusicModel musicModel = this.LIZJ;
        if (musicModel != null && !musicModel.getMusicId().isEmpty()) {
            builder.musicId(this.LIZJ.getMusicId());
        }
        String str3 = this.LIZLLL.LJLJJI;
        if (str3 != null) {
            builder.enterMethod(str3);
        }
        String str4 = this.LIZLLL.LJLLL;
        if (str4 != null) {
            builder.shootFrom(str4);
        }
        Boolean bool = this.LIZLLL.LJLLI;
        if (bool != null) {
            builder.recordFromFeed(bool.booleanValue());
        }
        if (!TextUtils.isEmpty(this.LIZLLL.LJLLLLLL)) {
            OV1 ov1 = this.LIZLLL;
            MusicRecordService musicRecordService = ov1.LJZL;
            String str5 = ov1.LJLLLLLL;
            musicRecordService.getClass();
            builder.stickers(MusicRecordService.LIZ(str5));
            if (!TextUtils.isEmpty(this.LIZLLL.LJLZ)) {
                builder.giphyGifIds(this.LIZLLL.LJLZ);
            }
            OV1 ov12 = this.LIZLLL;
            MusicRecordService musicRecordService2 = ov12.LJZL;
            String str6 = ov12.LJLLLLLL;
            musicRecordService2.getClass();
            ArrayList LIZ = MusicRecordService.LIZ(str6);
            if (!LIZ.isEmpty()) {
                builder.musicSticker((String) ListProtector.get(LIZ, 0));
            }
        }
        String musicSticker = builder.build().getMusicSticker();
        Effect effect = this.LIZIZ;
        MusicModel musicModel2 = this.LIZJ;
        if (musicModel2 != null) {
            str = musicModel2.getMusicId();
        } else {
            str = null;
        }
        builder.recordPresetResource(new RecordPresetResource(musicSticker, effect, str, this.LIZJ));
        java.util.Map<String, String> LLJLLIL = Z9N.LIZIZ.LLJLLIL(this.LIZLLL.LJLJJL, "");
        if ((LLJLLIL instanceof HashMap) && LLJLLIL.size() > 0) {
            LLJLLIL.put("shoot_from_search", "single_song");
            builder.extraLogParams((HashMap) LLJLLIL);
        }
        if (this.LIZLLL.LJZ.booleanValue()) {
            asyncAVService.uiService().recordService().openAlbumWithMusic(this.LIZLLL.LJLIL, builder.build(), this.LIZJ);
        } else if (this.LIZIZ != null && AVExternalServiceImpl.LIZ().abilityService().effectService().isEffectControlGame(this.LIZIZ)) {
            asyncAVService.uiService().recordService().startRecord(this.LIZLLL.LJLIL, builder.build());
        } else {
            asyncAVService.uiService().recordService().startRecord(this.LIZLLL.LJLIL, builder.build(), this.LIZJ, true);
        }
    }

    public OV0(OV1 ov1, String str, Effect effect, MusicModel musicModel) {
        this.LIZLLL = ov1;
        this.LIZ = str;
        this.LIZIZ = effect;
        this.LIZJ = musicModel;
    }
}
