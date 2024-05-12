package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.HrT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45379HrT implements InterfaceC87758YcM {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final Bundle LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC87758YcM
    public final void LIZIZ() {
        LJFF(LJ(this, 4, this.LIZIZ, 0, this.LIZ, this.LIZJ, 1, 4));
    }

    @Override // X.InterfaceC87758YcM
    public final void LIZLLL() {
        LJFF(LJ(this, 3, this.LIZIZ, 0, this.LIZ, this.LIZJ, 0, 36));
    }

    public static void LJFF(C45382HrW c45382HrW) {
        C57082Lw.LIZ.LIZJ("video_download_status").postValue(c45382HrW);
    }

    @Override // X.InterfaceC87758YcM
    public final void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        LJFF(LJ(this, 1, this.LIZIZ, 0, this.LIZ, this.LIZJ, 0, 36));
    }

    @Override // X.InterfaceC87758YcM
    public final void LIZJ(int i) {
        LJFF(LJ(this, 5, this.LIZIZ, 0, this.LIZ, this.LIZJ, 0, 36));
    }

    @Override // X.InterfaceC87758YcM
    public final void updateProgress(int i) {
        LJFF(LJ(this, 2, this.LIZIZ, i, this.LIZ, this.LIZJ, 0, 32));
    }

    public C45379HrT(String enterFrom, String enterMethod, Aweme aweme, Bundle mobDownloadBundle, int i) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(mobDownloadBundle, "mobDownloadBundle");
        this.LIZ = enterFrom;
        this.LIZIZ = aweme;
        this.LIZJ = mobDownloadBundle;
        this.LIZLLL = i;
    }

    public static C45382HrW LJ(C45379HrT c45379HrT, int i, Aweme aweme, int i2, String str, Bundle bundle, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            str = "";
        }
        if ((i4 & 16) != 0) {
            bundle = null;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        int i5 = c45379HrT.LIZLLL;
        if (i5 == EnumC44955Hkd.AWEME_STORY_PHOTO.getType()) {
            o.LJIIIZ(aweme, "aweme");
            C45382HrW c45382HrW = C45382HrW.LIZ;
            C45382HrW.LIZIZ = i;
            C45382HrW.LIZJ = i2;
            C45382HrW.LIZLLL = aweme;
            C45382HrW.LJ = true;
            C45382HrW.LJFF = i3;
            C45382HrW.LJI = bundle;
            return c45382HrW;
        }
        if (i5 == EnumC44955Hkd.AWEME_VIDEO.getType()) {
            return C45382HrW.LIZIZ(i, aweme, i2, str, bundle);
        }
        return C45382HrW.LIZIZ(i, aweme, i2, str, bundle);
    }
}
