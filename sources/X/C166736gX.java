package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6gX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166736gX implements InterfaceC149845uO, IStsPrepareHelper {
    public final String LIZ;
    public final Context LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final ConcurrentHashMap<String, Boolean> LJFF;

    @Override // X.InterfaceC149845uO
    public final void LIZ(String voiceChangeTaskId) {
        o.LJIIIZ(voiceChangeTaskId, "voiceChangeTaskId");
        if (o.LJ(this.LJFF.get(voiceChangeTaskId), Boolean.TRUE)) {
            C166856gj c166856gj = ((C166886gm) this.LIZLLL.getValue()).LIZIZ;
            if (c166856gj != null) {
                int i = c166856gj.LIZ.LIZIZ;
                C166746gY.LIZIZ(-1, "pipeline_state_code");
                C166746gY.LIZIZ(i, "pipeline_error_stage");
                C166746gY.LJI();
                this.LJFF.remove(voiceChangeTaskId);
                return;
            }
            o.LJIJI("dataContext");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dd  */
    @Override // X.InterfaceC149845uO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(X.C166926gq r19, com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener r20) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166736gX.LIZIZ(X.6gq, com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener):java.lang.String");
    }

    public C166736gX(String bizType, Context context, VideoPublishEditModel publishEditModel) {
        o.LJIIIZ(bizType, "bizType");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(publishEditModel, "publishEditModel");
        this.LIZ = bizType;
        this.LIZIZ = context;
        this.LIZJ = publishEditModel;
        this.LIZLLL = C221108m2.LIZIZ(C166946gs.LJLIL);
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1058));
        this.LJFF = new ConcurrentHashMap<>();
    }
}
