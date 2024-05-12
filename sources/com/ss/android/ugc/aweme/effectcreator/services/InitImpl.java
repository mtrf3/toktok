package com.ss.android.ugc.aweme.effectcreator.services;

import X.C93970aZS;
import X.C93971aZT;
import X.C94216adQ;
import X.InterfaceC93941aYz;
import com.bytedance.effectcreatormobile.ckeapi.api.CameraApi;
import com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA;
import com.bytedance.effectcreatormobile.ckeapi.api.IEffectCreatePipeline;
import com.bytedance.effectcreatormobile.ckeapi.api.ISensitiveApi;
import com.bytedance.effectcreatormobile.ckeapi.api.album.IAlbumService;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.net.INet;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IDoubleCheckSheet;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IMessageIntroSheet;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.ISingleLineTips;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.sheet.IStepIntroSheet;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.IToast;
import com.bytedance.effectcreatormobile.ckeapi.api.hint.IEffectHintSelect;
import com.bytedance.effectcreatormobile.ckeapi.api.monitor.IMonitor;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository;
import com.bytedance.effectcreatormobile.ckeapi.api.resource.IEffectPlatformConfigProvider;
import com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit;
import com.bytedance.effectcreatormobile.integrationTiktok.api.IInitCaller;
import com.bytedance.effectcreatormobile.resource.ep.api.IVERourceProvider;
import com.ss.android.ugc.aweme.effectcreator.net.NetImpl;
import com.ss.android.ugc.aweme.effectcreator.text.TextEditImpl;

/* loaded from: classes34.dex */
public final class InitImpl implements IInitCaller {
    @Override // com.bytedance.effectcreatormobile.integrationTiktok.api.IInitCaller
    public final void onInit() {
        C93970aZS LIZ = C93971aZT.LIZ();
        LIZ.LIZLLL.put(IEffectPlatformConfigProvider.class, TiktokEffectPlatformConfigProvider.class);
        LIZ.LIZLLL.put(INet.class, NetImpl.class);
        LIZ.LIZLLL.put(ITextEdit.class, TextEditImpl.class);
        LIZ.LIZLLL.put(IEffectCreatePipeline.class, TiktokEffectCreatePipelineImpl.class);
        LIZ.LIZLLL.put(IAlbumService.class, TiktokAlbumServiceImpl.class);
        LIZ.LIZLLL.put(IToast.class, TiktokToastImpl.class);
        LIZ.LIZLLL.put(IDialog.class, TiktokDialogImpl.class);
        LIZ.LIZLLL.put(CameraApi.class, TiktokCameraImpl.class);
        LIZ.LIZLLL.put(ILog.class, TiktokLogImpl.class);
        LIZ.LIZLLL.put(IStepIntroSheet.class, TiktokStepSheetImpl.class);
        LIZ.LIZLLL.put(IDoubleCheckSheet.class, TiktokDoubleCheckSheet.class);
        LIZ.LIZLLL.put(IMessageIntroSheet.class, TiktokIntroSheet.class);
        LIZ.LIZLLL.put(ISingleLineTips.class, TikTokSingleLineTips.class);
        LIZ.LIZLLL.put(StatisticReporter.class, TiktokStatisticReporterImpl.class);
        LIZ.LIZLLL.put(GifRepository.class, TiktokGifRepository.class);
        LIZ.LIZLLL.put(IEffectHintSelect.class, TikTokEffectHintSelectImpl.class);
        LIZ.LIZLLL.put(InterfaceC93941aYz.class, C94216adQ.class);
        LIZ.LIZLLL.put(ICameraBPEA.class, TiktokBpeaImpl.class);
        LIZ.LIZLLL.put(IVERourceProvider.class, TiktokVEResourceFinder.class);
        LIZ.LIZLLL.put(ConfigProvider.class, TikTokConfigProviderImpl.class);
        LIZ.LIZLLL.put(IMonitor.class, TiktokMonitorImpl.class);
        LIZ.LIZLLL.put(ISensitiveApi.class, TiktokSensitiveApiImpl.class);
    }
}
