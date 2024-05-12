package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JCh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48775JCh implements InterfaceC87433YTd {
    public final /* synthetic */ C48774JCg LIZ;

    @Override // X.InterfaceC87433YTd
    public final String LIZIZ() {
        return "pip";
    }

    @Override // X.InterfaceC87433YTd
    public final void LIZ() {
        ILD ild;
        String str;
        String str2;
        boolean z;
        C47041IdB c47041IdB = this.LIZ.LJLJJLL;
        ILD ild2 = null;
        if (c47041IdB != null) {
            ild = c47041IdB.LJ.LJLIL;
        } else {
            ild = null;
        }
        ILD ild3 = ILD.PLAYING;
        if (ild != ild3) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LIZ.LJIJJ().LIZJ);
            Aweme value = this.LIZ.LJIJJLI().LJLIL.getValue();
            if (value != null) {
                str = value.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            Aweme value2 = this.LIZ.LJIJJLI().LJLIL.getValue();
            if (value2 != null) {
                str2 = value2.getAuthorUid();
            } else {
                str2 = null;
            }
            c188727au.LJIIIZ("author_id", str2);
            FMX.LJIIL("earphone_play_continue", c188727au.LIZ);
            YTW.LIZLLL("pip");
            this.LIZ.LJJIIZ(null);
            C47041IdB c47041IdB2 = this.LIZ.LJLJJLL;
            if (c47041IdB2 != null) {
                ild2 = c47041IdB2.LJ.LJLIL;
            }
            if (ild2 == ild3) {
                z = true;
            } else {
                z = false;
            }
            YTW.LIZJ(Boolean.valueOf(z), "pip");
        }
    }

    public C48775JCh(C48774JCg c48774JCg) {
        this.LIZ = c48774JCg;
    }
}
