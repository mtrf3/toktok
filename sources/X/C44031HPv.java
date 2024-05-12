package X;

import Y.AObjectS45S0101000_13;
import Y.AObjectS52S0101000_7;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import java.util.UUID;

/* renamed from: X.HPv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44031HPv extends SimpleServiceLoadCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ C44032HPw LJ;

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        DialogC25756A8y dialogC25756A8y = this.LJ.LIZ;
        if (dialogC25756A8y != null) {
            V1B.LJLILLLLZI(dialogC25756A8y);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.enterFrom(this.LJ.LIZLLL);
        builder.creationId(UUID.randomUUID().toString());
        builder.shootWay(this.LIZ);
        builder.recordFromFeed(this.LJ.LJFF);
        StickerDownloadConfig stickerDownloadConfig = new StickerDownloadConfig(this.LIZIZ, C85990Xow.LIZIZ());
        stickerDownloadConfig.setType(Integer.valueOf(this.LIZJ));
        stickerDownloadConfig.setSourceId(this.LIZLLL);
        int i = this.LJ.LJI;
        if (i == 2) {
            stickerDownloadConfig.setEnterFromType(10002);
        } else if (i == 3) {
            stickerDownloadConfig.setEnterFromType(10003);
        } else if (i == 1) {
            stickerDownloadConfig.setEnterFromType(10001);
        }
        stickerDownloadConfig.setOnFail(new AObjectS45S0101000_13(3, this, 12));
        stickerDownloadConfig.setOnSuccess(new AObjectS52S0101000_7(0, this, 25));
        RecordConfig build = builder.build();
        if (C173186qw.LIZ > 0) {
            asyncAVService.uiService().recordService().clickMvAnchorOpenAlbumDirectly(this.LJ.LIZIZ, build, stickerDownloadConfig);
        } else {
            asyncAVService.uiService().recordService().startRecordMV(this.LJ.LIZIZ, build, stickerDownloadConfig);
        }
    }

    public C44031HPv(C44032HPw c44032HPw, String str, String str2, int i, int i2) {
        this.LJ = c44032HPw;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
