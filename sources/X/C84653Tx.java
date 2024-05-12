package X;

import com.ss.android.ugc.aweme.services.dm.DMAlbumMediaPublishEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.3Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84653Tx {
    public static final C84653Tx LIZ = new C84653Tx();

    @QD3
    public final void onAlbumSelected(DMAlbumMediaPublishEvent data) {
        o.LJIIIZ(data, "data");
        if (data.getSessionId().length() == 0) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onAlbumSelected, size: ");
        LIZ2.append(data.getMediaModelList().size());
        LIZ2.append('}');
        C111214Yb.LIZJ("MediaMsgSendManager", X1D.LIZIZ(LIZ2));
        C78857UxB.LJJJJI(new C117724jg(data.getSessionId(), data.getMediaModelList(), null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01de, code lost:
    
        if (r6 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009b A[ORIG_RETURN, RETURN] */
    @X.QD3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSendMsgFromRecordPage(com.ss.android.ugc.aweme.services.dm.DMRecordMediaPublishEvent r32) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84653Tx.onSendMsgFromRecordPage(com.ss.android.ugc.aweme.services.dm.DMRecordMediaPublishEvent):void");
    }
}
