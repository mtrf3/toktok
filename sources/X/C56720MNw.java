package X;

import android.app.Activity;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityPod;
import com.ss.android.ugc.aweme.inbox.widget.multi.RedPoint;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.MNw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56720MNw {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 809));
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 810));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 808));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 807));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 806));
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS159S0100000_9(this, 805));
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 812));
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 811));
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(MNM.LJLIL);
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(MNL.LJLIL);
    public final MNE LJIIJ = MNE.LJLIL;

    public final RedPoint LJIIIZ() {
        EnumC54302LSw enumC54302LSw;
        int LJIILIIL = C54362LVe.LJIILIIL(210, 214);
        NoticeGroupAttrs LJIIIIZZ = C54362LVe.LJIIIIZZ(214);
        if (LJIIIIZZ != null) {
            enumC54302LSw = LJIIIIZZ.showType;
        } else {
            enumC54302LSw = null;
        }
        if (LJIILIIL > 0) {
            if (enumC54302LSw == EnumC54302LSw.ShowDot) {
                return (RedPoint) this.LJIIIZ.getValue();
            }
            return new RedPoint(MN2.COUNT, LJIILIIL);
        }
        return LJII();
    }

    public final ActivityPod LIZJ() {
        String str;
        boolean z;
        String str2 = (String) this.LJ.getValue();
        EnumC56696MMy enumC56696MMy = EnumC56696MMy.ACTIVITY;
        ActivityPod LIZLLL = C56678MMg.LIZLLL(enumC56696MMy);
        String str3 = "";
        if (LIZLLL == null || (str = LIZLLL.newNoticeTime) == null) {
            str = "";
        }
        if (C46604IQu.LIZJ()) {
            if (LIZLLL != null && C78685UuP.LJJJZ(LIZLLL.newNoticeContent)) {
                str2 = LIZLLL.newNoticeContent;
            }
        } else {
            str3 = str;
        }
        RedPoint LJ = LJ();
        if (LJ.type == MN2.NONE && C46604IQu.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        return new ActivityPod(enumC56696MMy, (List) this.LIZLLL.getValue(), null, str2, LJ, str3, z, 0L, null, MN5.LIZIZ(enumC56696MMy), 0L, 1408, null);
    }

    public final RedPoint LJ() {
        int LJII = C54362LVe.LJII(C56702MNe.LIZ, EnumC54302LSw.ShowNum);
        int LJII2 = C54362LVe.LJII(C56702MNe.LIZ, EnumC54302LSw.ShowDot);
        if (LJII > 0) {
            return new RedPoint(MN2.COUNT, LJII);
        }
        if (LJII2 > 0) {
            return new RedPoint(MN2.DOT, LJII2);
        }
        return LJII();
    }

    public final RedPoint LJII() {
        return (RedPoint) this.LJIIIIZZ.getValue();
    }

    public static Resources LJIIIIZZ() {
        Resources resources;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (resources = topActivity.getResources()) == null) {
            return EF7.LIZIZ().getResources();
        }
        return resources;
    }

    public final ActivityPod LIZLLL() {
        boolean z;
        if (!C46604IQu.LIZIZ()) {
            return null;
        }
        String str = (String) this.LIZJ.getValue();
        EnumC56696MMy enumC56696MMy = EnumC56696MMy.FOLLOWER;
        ActivityPod LIZLLL = C56678MMg.LIZLLL(enumC56696MMy);
        String str2 = "";
        long j = 0;
        if (LIZLLL != null && C78685UuP.LJJJZ(LIZLLL.newNoticeContent)) {
            str = LIZLLL.newNoticeContent;
            if (IRL.LIZ()) {
                str2 = LIZLLL.newNoticeTime;
                j = LIZLLL.createTime;
            }
        }
        RedPoint LJFF = LJFF();
        if (IRL.LIZ() || LJFF.type == MN2.COUNT) {
            z = false;
        } else {
            z = true;
        }
        return new ActivityPod(enumC56696MMy, (List) this.LIZ.getValue(), null, str, LJFF, str2, z, 0L, null, MN5.LIZIZ(enumC56696MMy), j, 384, null);
    }

    public final RedPoint LJFF() {
        int LJIILJJIL;
        if (C46604IQu.LIZLLL() || C56630MKk.LIZ()) {
            LJIILJJIL = C54362LVe.LJIILJJIL(534);
        } else {
            LJIILJJIL = C54362LVe.LJIILJJIL(7);
        }
        if (LJIILJJIL > 0) {
            return new RedPoint(MN2.COUNT, LJIILJJIL);
        }
        return LJII();
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x03c4, code lost:
    
        if (r1 == null) goto L154;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r10) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56720MNw.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):java.lang.String");
    }

    public static String LJI(MusNotice musNotice) {
        String str;
        String str2 = "";
        try {
            str2 = LIZ(musNotice);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        StringBuilder sb = new StringBuilder();
        if (C90193gN.LIZIZ(EF7.LIZIZ())) {
            str = "\u200f";
        } else {
            str = "\u200e";
        }
        return AnonymousClass073.LIZIZ(sb, str, str2);
    }

    public static String LJIIJ(int i) {
        return C1DD.LIZLLL(i, "AppContextManager.getApp…ontext().getString(strId)");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.inbox.widget.multi.ActivityNoticePod LIZIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse r13) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56720MNw.LIZIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse):com.ss.android.ugc.aweme.inbox.widget.multi.ActivityNoticePod");
    }
}
