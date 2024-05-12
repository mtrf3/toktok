package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;

/* loaded from: classes10.dex */
public final class MW2 extends C56927MVv {
    public MW2(MusNotice musNotice) {
        super(musNotice);
        this.LIZIZ.LIZ.LJLIL = true;
    }

    @Override // X.C56927MVv
    public final String LIZ(boolean z) {
        String str;
        MusNotice musNotice = this.LIZ;
        if (musNotice == null) {
            return null;
        }
        long j = musNotice.lastReadTime;
        GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
        if (generalTemplateNotice == null || (str = generalTemplateNotice.schemaUrl) == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("&isNew=");
        LIZ.append(z);
        LIZ.append("&last_read_time=");
        LIZ.append(j);
        return X1D.LIZIZ(LIZ);
    }
}
