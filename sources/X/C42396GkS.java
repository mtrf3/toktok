package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GkS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42396GkS extends C42399GkV {
    public final /* synthetic */ C42393GkP LIZLLL;
    public final /* synthetic */ Aweme LJ;

    @Override // X.AbstractC42411Gkh
    public final void LJ(String str, String fullFilePath) {
        o.LJIIIZ(fullFilePath, "fullFilePath");
        super.LJ(str, fullFilePath);
        C42393GkP c42393GkP = this.LIZLLL;
        c42393GkP.LJIIIZ = fullFilePath;
        c42393GkP.LIZLLL(this.LJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42396GkS(Aweme aweme, C42393GkP c42393GkP, List list) {
        super(list, "change_ban_music_voice");
        this.LIZLLL = c42393GkP;
        this.LJ = aweme;
    }

    @Override // X.AbstractC42411Gkh
    public final void LIZIZ(Exception exc, Integer num, String str) {
        super.LIZIZ(exc, num, str);
        this.LIZLLL.LIZJ();
    }
}
