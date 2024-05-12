package X;

import Y.IDDListenerS23S0300000_9;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import kotlin.jvm.internal.o;

/* renamed from: X.M7u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56302M7u {
    public static final TuxSheet LIZ(Context context, String str, String mixID, Aweme aweme, String str2, String str3, String str4, C229238z9 c229238z9, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str5;
        PlayListInfo playListInfo;
        o.LJIIIZ(mixID, "mixID");
        IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
        if (aweme == null || (playListInfo = aweme.playlist_info) == null || (str5 = playListInfo.getMixName()) == null) {
            str5 = "";
        }
        Bundle bundle = new Bundle();
        if (C52292Kfg.LIZ() == 0) {
            bundle.putSerializable("key_positioned_aweme", aweme);
        } else {
            M7T.LIZIZ = aweme;
        }
        bundle.putString("key_mix_id", mixID);
        bundle.putString("key_mix_name", str5);
        bundle.putString("key_mix_uid", str2);
        bundle.putString("key_mix_secuid", str3);
        bundle.putString("enter_from", str5);
        bundle.putString("key_mix_dialog_enter_from", str);
        bundle.putString("key_video_from", str4);
        bundle.putSerializable("key_search_params", c229238z9);
        MixVideosDialog mixVideosDialog = new MixVideosDialog();
        mixVideosDialog.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = mixVideosDialog;
        asl.LJI(1);
        int LJJJJJL = (int) (C63081OpJ.LJJJJJL(context) * MixVideosDialog.LJZ);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLLLLL = LJJJJJL;
        tuxSheet.LJZI = false;
        tuxSheet.LJLILLLLZI = new IDDListenerS23S0300000_9(LJJIJIIJIL, mixVideosDialog, interfaceC65784Pro, 1);
        mixVideosDialog.LJLIL = tuxSheet;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            if (AnonymousClass944.LIZ) {
                LJJIJIIJIL.LJI(true);
            }
            C1DG.LJII(LJJIFFI, "it.supportFragmentManager", tuxSheet, "MixVideosDialog");
        }
        return tuxSheet;
    }
}
