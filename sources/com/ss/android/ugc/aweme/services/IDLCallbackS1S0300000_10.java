package com.ss.android.ugc.aweme.services;

import X.C42398GkU;
import X.C62395OeF;
import X.FMX;
import X.HTF;
import X.OSZ;
import X.Z9N;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDLCallbackS1S0300000_10 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                return;
            case 1:
                onLoad$1(this, asyncAVService, j);
                return;
            default:
                super.onLoad(asyncAVService, j);
                return;
        }
    }

    public static final void onLoad$0(IDLCallbackS1S0300000_10 iDLCallbackS1S0300000_10, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS1S0300000_10.l0, (RecordConfig) iDLCallbackS1S0300000_10.l1, (MusicModel) iDLCallbackS1S0300000_10.l2, true);
    }

    public static final void onLoad$1(IDLCallbackS1S0300000_10 iDLCallbackS1S0300000_10, AsyncAVService service, long j) {
        String str;
        o.LJIIIZ(service, "service");
        FMX.LJIILL("music_detail_trace", new OSZ("skip_to_video_progress_start_record", "stage"));
        String str2 = "share_from_resso";
        if (o.LJ("share_from_resso", ((MusicShootAssem) iDLCallbackS1S0300000_10.l0).getFrom())) {
            str = "share_from_resso";
        } else {
            str = "single_song";
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(((MusicShootAssem) iDLCallbackS1S0300000_10.l0).LLFFF);
        builder.startRecordTime(((MusicShootAssem) iDLCallbackS1S0300000_10.l0).LLFII);
        builder.decompressTime(j);
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        if (!o.LJ("share_from_resso", ((MusicShootAssem) iDLCallbackS1S0300000_10.l0).getFrom())) {
            str2 = "single_song";
        }
        builder.shootWay(str2);
        builder.enterFrom("single_song");
        builder.enterMethod("click_play_music");
        builder.translationType(HTF.LIZ());
        builder.musicWithSticker((Effect) iDLCallbackS1S0300000_10.l1);
        builder.musicOrigin(str);
        builder.videoLength(Integer.valueOf(((MusicShootAssem) iDLCallbackS1S0300000_10.l0).a4()));
        builder.recordFromFeed(((Boolean) ((MusicShootAssem) iDLCallbackS1S0300000_10.l0).LLILLL.getValue()).booleanValue());
        String Y3 = ((MusicShootAssem) iDLCallbackS1S0300000_10.l0).Y3();
        if (!TextUtils.isEmpty(Y3)) {
            builder.shootFrom(Y3);
        }
        if (!TextUtils.isEmpty(((MusicShootAssem) iDLCallbackS1S0300000_10.l0).Z3())) {
            MusicShootAssem musicShootAssem = (MusicShootAssem) iDLCallbackS1S0300000_10.l0;
            builder.stickers(musicShootAssem.Q3(musicShootAssem.Z3()));
            MusicShootAssem musicShootAssem2 = (MusicShootAssem) iDLCallbackS1S0300000_10.l0;
            ArrayList<String> Q3 = musicShootAssem2.Q3(musicShootAssem2.Z3());
            if (!Q3.isEmpty()) {
                builder.musicSticker((String) ListProtector.get(Q3, 0));
            }
        }
        Z9N z9n = Z9N.LIZIZ;
        String from = ((MusicShootAssem) iDLCallbackS1S0300000_10.l0).getFrom();
        String X3 = ((MusicShootAssem) iDLCallbackS1S0300000_10.l0).X3();
        if (X3 == null) {
            X3 = "";
        }
        HashMap<String, String> LJLJJL = z9n.LJLJJL(from, X3);
        if (LJLJJL != null && LJLJJL.size() > 0) {
            builder.extraLogParams(LJLJJL);
        }
        builder.recordPresetResource(new RecordPresetResource(builder.build().getMusicSticker(), (Effect) iDLCallbackS1S0300000_10.l1, ((MusicModel) iDLCallbackS1S0300000_10.l2).getMusicId(), (MusicModel) iDLCallbackS1S0300000_10.l2));
        if (((Effect) iDLCallbackS1S0300000_10.l1) != null && AVExternalServiceImpl.LIZ().abilityService().effectService().isEffectControlGame((Effect) iDLCallbackS1S0300000_10.l1)) {
            service.uiService().recordService().startRecord(((MusicShootAssem) iDLCallbackS1S0300000_10.l0).getActivity(), builder.build());
            MusicShootAssem musicShootAssem3 = (MusicShootAssem) iDLCallbackS1S0300000_10.l0;
            C62395OeF.LJ(musicShootAssem3.LLIZLLLIL, musicShootAssem3.LLFFF);
        } else {
            service.uiService().recordService().startRecord(((MusicShootAssem) iDLCallbackS1S0300000_10.l0).getActivity(), builder.build(), (MusicModel) iDLCallbackS1S0300000_10.l2, true);
            MusicShootAssem musicShootAssem4 = (MusicShootAssem) iDLCallbackS1S0300000_10.l0;
            C62395OeF.LJ(musicShootAssem4.LLIZLLLIL, musicShootAssem4.LLFFF);
        }
        String musicId = ((MusicModel) iDLCallbackS1S0300000_10.l2).getMusicId();
        String X32 = ((MusicShootAssem) iDLCallbackS1S0300000_10.l0).X3();
        MusicShootAssem musicShootAssem5 = (MusicShootAssem) iDLCallbackS1S0300000_10.l0;
        C62395OeF.LJII(0L, musicId, X32, musicShootAssem5.LLFFF, musicShootAssem5.U3());
    }

    public IDLCallbackS1S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
