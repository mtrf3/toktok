package com.ss.android.ugc.aweme.search.pages.voice.musicsearch.viewmodel;

import X.C188727au;
import X.C93834aXG;
import X.C94282aeU;
import X.C94283aeV;
import X.C94590ajS;
import X.EnumC93589aTJ;
import X.EnumC93590aTK;
import X.FMX;
import X.InterfaceC93851aXX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicRecognitionVM extends AssemViewModel<C94283aeV> implements InterfaceC93851aXX {
    public final C94282aeU LJLIL = new C94282aeU();
    public final Map<String, String> LJLILLLLZI = new LinkedHashMap();
    public String LJLJI = "";
    public boolean LJLJJI;
    public boolean LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public final C93834aXG<EnumC93589aTJ, EnumC93590aTK> LJLJLJ;

    @Override // X.InterfaceC93851aXX
    public final void cp0() {
        runOnUIThread(new IDqS419S0100000_42(this, 36));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C94283aeV defaultState() {
        return new C94283aeV(EnumC93589aTJ.BEGIN, "", "");
    }

    @Override // X.InterfaceC93851aXX
    public final void onError() {
        runOnUIThread(new IDqS419S0100000_42(this, 35));
    }

    @Override // X.InterfaceC93851aXX
    public final void v() {
        runOnUIThread(new IDqS419S0100000_42(this, 34));
    }

    public MusicRecognitionVM() {
        C93834aXG<EnumC93589aTJ, EnumC93590aTK> c93834aXG = new C93834aXG<>();
        EnumC93590aTK enumC93590aTK = EnumC93590aTK.RESUMED;
        EnumC93589aTJ enumC93589aTJ = EnumC93589aTJ.BEGIN;
        EnumC93589aTJ enumC93589aTJ2 = EnumC93589aTJ.LISTENING;
        c93834aXG.LIZ(enumC93590aTK, enumC93589aTJ, enumC93589aTJ2);
        EnumC93590aTK enumC93590aTK2 = EnumC93590aTK.BUTTON_CLICK;
        EnumC93589aTJ enumC93589aTJ3 = EnumC93589aTJ.RECOGNIZING;
        c93834aXG.LIZ(enumC93590aTK2, enumC93589aTJ2, enumC93589aTJ3);
        EnumC93589aTJ enumC93589aTJ4 = EnumC93589aTJ.FAILED;
        c93834aXG.LIZ(enumC93590aTK2, enumC93589aTJ4, enumC93589aTJ2);
        EnumC93590aTK enumC93590aTK3 = EnumC93590aTK.PAUSED;
        c93834aXG.LIZ(enumC93590aTK3, enumC93589aTJ2, enumC93589aTJ4);
        c93834aXG.LIZ(enumC93590aTK3, enumC93589aTJ3, enumC93589aTJ4);
        EnumC93590aTK enumC93590aTK4 = EnumC93590aTK.RECOGNITION_SUCCESS;
        EnumC93589aTJ enumC93589aTJ5 = EnumC93589aTJ.SUCCESS;
        c93834aXG.LIZ(enumC93590aTK4, enumC93589aTJ2, enumC93589aTJ5);
        c93834aXG.LIZ(enumC93590aTK4, enumC93589aTJ3, enumC93589aTJ5);
        EnumC93590aTK enumC93590aTK5 = EnumC93590aTK.SDK_ERROR;
        c93834aXG.LIZ(enumC93590aTK5, enumC93589aTJ2, enumC93589aTJ4);
        c93834aXG.LIZ(enumC93590aTK5, enumC93589aTJ3, enumC93589aTJ4);
        c93834aXG.LIZ(EnumC93590aTK.SDK_VAD_END, enumC93589aTJ2, enumC93589aTJ3);
        EnumC93590aTK enumC93590aTK6 = EnumC93590aTK.X_CLICK;
        EnumC93589aTJ enumC93589aTJ6 = EnumC93589aTJ.END;
        c93834aXG.LIZ(enumC93590aTK6, enumC93589aTJ2, enumC93589aTJ6);
        c93834aXG.LIZ(enumC93590aTK6, enumC93589aTJ3, enumC93589aTJ6);
        c93834aXG.LIZ(enumC93590aTK6, enumC93589aTJ4, enumC93589aTJ6);
        EnumC93590aTK enumC93590aTK7 = EnumC93590aTK.CLOSED;
        c93834aXG.LIZ(enumC93590aTK7, enumC93589aTJ2, enumC93589aTJ6);
        c93834aXG.LIZ(enumC93590aTK7, enumC93589aTJ3, enumC93589aTJ6);
        c93834aXG.LIZ(enumC93590aTK7, enumC93589aTJ4, enumC93589aTJ6);
        this.LJLJLJ = c93834aXG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1 != 8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0271, code lost:
    
        if (r0.intValue() != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0113, code lost:
    
        if (r0 != 2) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(X.EnumC93590aTK r14) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.voice.musicsearch.viewmodel.MusicRecognitionVM.hv0(X.aTK):void");
    }

    public final void gv0(String str, boolean z) {
        if (this.LJLJJLL == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(this.LJLILLLLZI);
        String str2 = "1";
        c188727au.LJIIIZ("is_song_recog", "1");
        c188727au.LJIIIZ("timing_scene", str);
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_manual", str2);
        c188727au.LJ(currentTimeMillis - this.LJLJJLL, "board_show_duration");
        FMX.LJIIL("song_recog_step_duration", c188727au.LIZ);
        this.LJLJJLL = currentTimeMillis;
    }

    @Override // X.InterfaceC93851aXX
    public final void m50(String songId, String songName, String artistName) {
        o.LJIIIZ(songId, "songId");
        o.LJIIIZ(songName, "songName");
        o.LJIIIZ(artistName, "artistName");
        runOnUIThread(new C94590ajS(this, songName, songId));
    }
}
