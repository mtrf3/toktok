package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OUw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61998OUw extends SimpleServiceLoadCallback {
    public final /* synthetic */ MusicShootAssem LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        String str;
        Effect effect;
        java.util.Map<String, Object> LJIIIIZZ;
        Effect effect2;
        o.LJIIIZ(service, "service");
        FMX.LJIILL("music_detail_trace", new OSZ("video_progress_start_record", "stage"));
        String str2 = "share_from_resso";
        if (o.LJ("share_from_resso", this.LIZ.getFrom())) {
            str = "share_from_resso";
        } else {
            str = "music_chart_list";
            if (!TextUtils.equals(this.LIZ.getFrom(), "music_chart_list")) {
                str = "profile_favorite_recommend";
                if (!TextUtils.equals(this.LIZ.getFrom(), "profile_favorite_recommend")) {
                    str = "single_song";
                }
            }
        }
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        MusicShootAssem musicShootAssem = this.LIZ;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("action_originated_from", musicShootAssem.getFrom());
        hashMap.put("shoot", hashMap2);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(this.LIZ.LLFFF);
        builder.startRecordTime(this.LIZ.LLFII);
        builder.decompressTime(j);
        builder.musicDownloadDuration(this.LIZIZ);
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        if (!o.LJ("share_from_resso", this.LIZ.getFrom())) {
            str2 = "single_song";
        }
        builder.shootWay(str2);
        builder.enterFrom("single_song");
        builder.enterMethod("click_play_music");
        builder.translationType(16);
        C84913XUf c84913XUf = this.LIZ.LLIFFJFJJ;
        if (c84913XUf != null) {
            effect = c84913XUf.LJI;
        } else {
            effect = null;
        }
        builder.musicWithSticker(effect);
        builder.musicOrigin(str);
        builder.videoLength(Integer.valueOf(this.LIZ.a4()));
        N4C n4c = N4C.LIZ;
        ShootExtraData shootExtraData = new ShootExtraData((String) this.LIZ.LLIIL.getValue(), (String) this.LIZ.LLIL.getValue(), Integer.valueOf(((Number) this.LIZ.LLILIL.getValue()).intValue()), Boolean.valueOf(this.LIZ.LLF), null, null, null, null, null, null, null, null, 4080, null);
        OGV VQ = this.LIZ.VQ();
        if (VQ == null || (LJIIIIZZ = VQ.LJFF(this.LIZJ)) == null) {
            MusicShootAssem musicShootAssem2 = this.LIZ;
            MusicModel musicModel = this.LIZJ;
            if (!CommerceMediaServiceImpl.LIZJ().LJIIZILJ()) {
                LJIIIIZZ = C113554cx.LJJJLIIL();
            } else {
                ICommerceMusicLogger iCommerceMusicLogger = musicShootAssem2.LLIIII;
                n4c.getClass();
                LJIIIIZZ = iCommerceMusicLogger.LJIIIIZZ(N4C.LJIILIIL.LIZIZ, new AqS176S0100000_10(musicModel, 55));
            }
        }
        n4c.getClass();
        N4C.LIZIZ(shootExtraData, LJIIIIZZ);
        builder.shootExtraData(shootExtraData);
        builder.extraEventParams(hashMap);
        builder.recordFromFeed(((Boolean) this.LIZ.LLILLL.getValue()).booleanValue());
        builder.ttsVoiceIDs((ArrayList) this.LIZ.LLILZ.getValue());
        builder.ttsVoiceRefIDs((ArrayList) this.LIZ.LLILZIL.getValue());
        builder.vcVoiceIDs((ArrayList) this.LIZ.LLILZLL.getValue());
        builder.vcVoiceRefIDs((ArrayList) this.LIZ.LLIZ.getValue());
        builder.musicDownloadComplete(this.LIZJ.getDownloadComplete());
        builder.needAddRecentMusic(true);
        String Y3 = this.LIZ.Y3();
        if (!TextUtils.isEmpty(Y3)) {
            builder.shootFrom(Y3);
        }
        if (!TextUtils.isEmpty(this.LIZ.Z3())) {
            MusicShootAssem musicShootAssem3 = this.LIZ;
            builder.stickers(musicShootAssem3.Q3(musicShootAssem3.Z3()));
            MusicShootAssem musicShootAssem4 = this.LIZ;
            ArrayList<String> Q3 = musicShootAssem4.Q3(musicShootAssem4.Z3());
            if (!Q3.isEmpty()) {
                builder.musicSticker((String) ListProtector.get(Q3, 0));
            }
        }
        HashMap<String, String> LJLJJL = Z9N.LIZIZ.LJLJJL(this.LIZ.getFrom(), this.LIZ.X3());
        if (LJLJJL != null && LJLJJL.size() > 0) {
            builder.extraLogParams(LJLJJL);
        }
        C84913XUf c84913XUf2 = this.LIZ.LLIFFJFJJ;
        if (c84913XUf2 != null && (effect2 = c84913XUf2.LJI) != null && AVExternalServiceImpl.LIZ().abilityService().effectService().isEffectControlGame(effect2)) {
            service.uiService().recordService().startRecord(this.LIZ.getActivity(), builder.build());
            MusicShootAssem musicShootAssem5 = this.LIZ;
            C62395OeF.LJ(musicShootAssem5.LLIZLLLIL, musicShootAssem5.LLFFF);
        } else {
            builder.musicPath(this.LIZLLL);
            this.LIZJ.setMusicBeginTime(((Number) this.LIZ.LLILL.getValue()).intValue());
            this.LIZJ.setMusicEndTime(((Number) this.LIZ.LLILLIZIL.getValue()).intValue());
            service.uiService().recordService().startRecord(this.LIZ.getActivity(), builder.build(), this.LIZJ, true);
            MusicShootAssem musicShootAssem6 = this.LIZ;
            C62395OeF.LJ(musicShootAssem6.LLIZLLLIL, musicShootAssem6.LLFFF);
        }
        String musicId = this.LIZJ.getMusicId();
        String X3 = this.LIZ.X3();
        MusicShootAssem musicShootAssem7 = this.LIZ;
        C62395OeF.LJII(this.LIZIZ, musicId, X3, musicShootAssem7.LLFFF, musicShootAssem7.U3());
    }

    public C61998OUw(MusicShootAssem musicShootAssem, long j, MusicModel musicModel, String str) {
        this.LIZ = musicShootAssem;
        this.LIZIZ = j;
        this.LIZJ = musicModel;
        this.LIZLLL = str;
    }
}
