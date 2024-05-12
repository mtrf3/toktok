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
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.OUz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62001OUz extends SimpleServiceLoadCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ MusicModel LJ;
    public final /* synthetic */ OV1 LJFF;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        OV2 ov2 = new OV2();
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(this.LIZ);
        builder.musicPath(this.LIZIZ);
        builder.startRecordTime(this.LJFF.LJZL.LIZIZ);
        builder.decompressTime(j);
        builder.musicDownloadDuration(this.LIZJ);
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        builder.shootWay(this.LJFF.LJLJLJ);
        builder.musicWithSticker(this.LJFF.LJZL.LJ.LJI);
        builder.translationType(3);
        builder.musicOrigin(this.LJFF.LJLJLLL);
        builder.needLoadResourceAfterRecord(this.LJFF.LJLL.booleanValue());
        builder.extraEventParams(ov2);
        builder.videoLength(Integer.valueOf(this.LIZLLL));
        builder.recordFromFeed(this.LJFF.LJLLI.booleanValue());
        builder.musicDownloadComplete(this.LJ.getDownloadComplete());
        builder.needAddRecentMusic(this.LJFF.LJLLILLLL.booleanValue());
        String str = this.LJFF.LJLLJ;
        if (str != null) {
            builder.enterFrom(str);
        }
        MusicModel musicModel = this.LJ;
        if (musicModel != null && !musicModel.getMusicId().isEmpty()) {
            builder.musicId(this.LJ.getMusicId());
        }
        String str2 = this.LJFF.LJLJJI;
        if (str2 != null) {
            builder.enterMethod(str2);
        }
        String str3 = this.LJFF.LJLLL;
        if (str3 != null) {
            builder.shootFrom(str3);
        }
        ShootExtraData shootExtraData = this.LJFF.LJLLLL;
        if (shootExtraData != null) {
            builder.shootExtraData(shootExtraData);
        }
        if (!TextUtils.isEmpty(this.LJFF.LJLLLLLL)) {
            OV1 ov1 = this.LJFF;
            MusicRecordService musicRecordService = ov1.LJZL;
            String str4 = ov1.LJLLLLLL;
            musicRecordService.getClass();
            builder.stickers(MusicRecordService.LIZ(str4));
            if (!TextUtils.isEmpty(this.LJFF.LJLZ)) {
                builder.giphyGifIds(this.LJFF.LJLZ);
            }
            OV1 ov12 = this.LJFF;
            MusicRecordService musicRecordService2 = ov12.LJZL;
            String str5 = ov12.LJLLLLLL;
            musicRecordService2.getClass();
            ArrayList LIZ = MusicRecordService.LIZ(str5);
            if (!LIZ.isEmpty()) {
                builder.musicSticker((String) ListProtector.get(LIZ, 0));
            }
        }
        java.util.Map<String, String> LLJLLIL = Z9N.LIZIZ.LLJLLIL(this.LJFF.LJLJJL, "");
        if ((LLJLLIL instanceof HashMap) && LLJLLIL.size() > 0) {
            LLJLLIL.put("shoot_from_search", "single_song");
            builder.extraLogParams((HashMap) LLJLLIL);
        }
        if (this.LJFF.LJZ.booleanValue()) {
            asyncAVService.uiService().recordService().openAlbumWithMusic(this.LJFF.LJLIL, builder.build(), this.LJ);
        } else if (this.LJFF.LJZL.LJ.LJI != null && AVExternalServiceImpl.LIZ().abilityService().effectService().isEffectControlGame(this.LJFF.LJZL.LJ.LJI)) {
            asyncAVService.uiService().recordService().startRecord(this.LJFF.LJLIL, builder.build());
        } else {
            builder.musicPath(this.LIZIZ);
            asyncAVService.uiService().recordService().startRecord(this.LJFF.LJLIL, builder.build(), this.LJ, true);
        }
    }

    public C62001OUz(OV1 ov1, String str, String str2, long j, int i, MusicModel musicModel) {
        this.LJFF = ov1;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = musicModel;
    }
}
