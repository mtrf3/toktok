package X;

import android.os.Handler;
import android.os.Message;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC56918MVm extends Handler implements InterfaceC55337Lnh {
    public final String LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public final java.util.Set<C7DH> LJLL;
    public final java.util.Set<C1800374t> LJLLI;

    public final LruCache<String, Integer> LIZLLL() {
        return (LruCache) this.LJLJJL.getValue();
    }

    public final LruCache<String, MW7> LJ() {
        return (LruCache) this.LJLJI.getValue();
    }

    public final CopyOnWriteArraySet<String> LJFF() {
        return (CopyOnWriteArraySet) this.LJLJLJ.getValue();
    }

    public final LruCache<String, MW7> LJI() {
        return (LruCache) this.LJLJJI.getValue();
    }

    public final CopyOnWriteArrayList<MW6> LJII() {
        return (CopyOnWriteArrayList) this.LJLJJLL.getValue();
    }

    public final CopyOnWriteArraySet<String> LJIIIIZZ() {
        return (CopyOnWriteArraySet) this.LJLJL.getValue();
    }

    public final void LJIILJJIL() {
        if (CommentPreloadExperiment.LIZIZ() != 2 || this.LJLJLLL) {
            return;
        }
        List LLJILJILJ = ORZ.LLJILJILJ(this.LJLLI);
        this.LJLLI.clear();
        if (!(!((ArrayList) LLJILJILJ).isEmpty())) {
            return;
        }
        CommentService.LIZ.getClass();
        CommentServiceImpl.LJJL().LJJII(2, "notification_page", LLJILJILJ);
    }

    public HandlerC56918MVm(String str) {
        super(C16880lQ.LLJJJJ());
        this.LJLIL = str;
        this.LJLILLLLZI = C221108m2.LIZIZ(MWQ.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(MWF.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(MWG.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(MWP.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(MWT.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(MWU.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(MWS.LJLIL);
        this.LJLL = new LinkedHashSet();
        this.LJLLI = new LinkedHashSet();
        MS5.LJI(new AqS159S0100000_9(this, 403));
    }

    public static void LIZJ(LruCache lruCache) {
        java.util.Map activeSnapshot = lruCache.snapshot();
        o.LJIIIIZZ(activeSnapshot, "activeSnapshot");
        for (Map.Entry entry : activeSnapshot.entrySet()) {
            MW7 mw7 = (MW7) entry.getValue();
            mw7.getClass();
            if (System.currentTimeMillis() - mw7.LIZIZ > NoticeVideoManager.LIZIZ().expireDuration) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("remove expired:");
                LIZ.append((String) entry.getKey());
                C221018lt.LJFF("NoticeVideoManager", X1D.LIZIZ(LIZ));
                lruCache.remove(entry.getKey());
            }
        }
    }

    public static String LJIIJJI(String str) {
        if (C78857UxB.LJJJIL(str)) {
            o.LJI(str);
            if (ujb.o.LJJJLIIL(str, "aweme://aweme/detail/", false)) {
                Matcher matcher = PatternProtector.compile("\\d+\\d").matcher(str);
                if (matcher.find()) {
                    return matcher.group();
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r1 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIL(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r4) {
        /*
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r4.commentNotice
            if (r0 == 0) goto Lf
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            if (r0 == 0) goto Lf
            java.lang.String r1 = r0.getCid()
        Le:
            return r1
        Lf:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r4.diggNotice
            if (r0 == 0) goto L1e
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            if (r0 == 0) goto L1e
            java.lang.String r1 = r0.getCid()
            goto Le
        L1e:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe r1 = r4.atMe
            r3 = 0
            if (r1 == 0) goto L6f
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r1.getComment()
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r1.getComment()
            java.lang.String r1 = r0.getCid()
        L31:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Le
        L35:
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r2 = r4.templateNotice
            if (r2 == 0) goto Le
            java.lang.String r0 = r2.schemaUrl
            java.lang.String r1 = LJIILIIL(r0)
            if (r1 == 0) goto L47
            int r0 = r1.length()
            if (r0 != 0) goto L53
        L47:
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r2.uiTemplate
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.middleSchemaUrl
        L4d:
            java.lang.String r1 = LJIILIIL(r0)
            if (r1 == 0) goto L59
        L53:
            int r0 = r1.length()
            if (r0 != 0) goto Le
        L59:
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r2.uiTemplate
            if (r0 == 0) goto L5f
            java.lang.String r3 = r0.rightSchemaUrl
        L5f:
            java.lang.String r1 = LJIILIIL(r3)
            goto Le
        L64:
            r0 = r3
            goto L4d
        L66:
            java.lang.String r0 = r1.getSchemaUrl()
            java.lang.String r1 = LJIILIIL(r0)
            goto L31
        L6f:
            r1 = r3
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC56918MVm.LJIIL(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):java.lang.String");
    }

    public static String LJIILIIL(String str) {
        if (str == null) {
            return null;
        }
        android.net.Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(schemaUrl)");
        String queryParameter = UriProtector.getQueryParameter(parse, "cid");
        if (queryParameter == null) {
            return UriProtector.getQueryParameter(parse, "upvote_id");
        }
        return queryParameter;
    }

    @Override // X.InterfaceC55337Lnh
    public final Aweme LIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        MW7 mw7 = LJ().get(aid);
        if (mw7 != null || (mw7 = LJI().get(aid)) != null || (mw7 = (MW7) ((LruCache) this.LJLILLLLZI.getValue()).get(aid)) != null) {
            return mw7.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC55337Lnh
    public final void LIZIZ(Aweme aweme) {
        MS5.LJI(new AqS156S0200000_9(this, C47261Igj.LJJIJIL(aweme), 29));
    }

    public final void LJIIIZ(boolean z) {
        this.LJLJLLL = z;
        if (!z) {
            sendEmptyMessageDelayed(0, NoticeVideoManager.LIZIZ().alignmentDelay / 2);
            LJIILJJIL();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 0) {
            removeMessages(0);
            if (!this.LJLJLLL) {
                MS5.LJI(new C56924MVs(this));
            } else {
                sendEmptyMessageDelayed(0, NoticeVideoManager.LIZIZ().alignmentDelay / 2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r3.length() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        r0 = r1.uiTemplate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        r0 = r0.rightSchemaUrl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        r3 = LJIIJJI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        if (r3 != null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJ(X.HandlerC56918MVm r5, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r6) {
        /*
            r5.getClass()
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.commentNotice
            r5 = 0
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L40
            java.lang.String r3 = r0.getAid()
        L14:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r6.diggNotice
            if (r0 == 0) goto L27
            int r0 = r0.getDiggType()
            if (r0 <= r2) goto L27
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r6.diggNotice
            int r1 = r0.getDiggType()
            r0 = 3
            if (r1 != r0) goto L28
        L27:
            r5 = 1
        L28:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r6.commentNotice
            if (r0 == 0) goto L3c
            java.util.List<java.lang.Integer> r1 = X.InterfaceC53871LCh.LIZ
            int r0 = r0.getCommentType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            r5 = r0 ^ 1
        L3c:
            if (r5 == 0) goto L3f
            r4 = r3
        L3f:
            return r4
        L40:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r0 = r6.diggNotice
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L4f
            java.lang.String r3 = r0.getAid()
            goto L14
        L4f:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice r0 = r6.duetNotice
            if (r0 == 0) goto Lb7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto Lb7
            java.lang.String r3 = r0.getAid()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L14
        L61:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe r1 = r6.atMe
            if (r1 == 0) goto L7a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
            if (r0 == 0) goto Lae
            r1.getAweme()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
            java.lang.String r3 = r0.getAid()
        L76:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L14
        L7a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r1 = r6.templateNotice
            if (r1 == 0) goto L14
            java.lang.String r0 = r1.schemaUrl
            java.lang.String r3 = LJIIJJI(r0)
            if (r3 == 0) goto L8c
            int r0 = r3.length()
            if (r0 != 0) goto L98
        L8c:
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r1.uiTemplate
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.middleSchemaUrl
        L92:
            java.lang.String r3 = LJIIJJI(r0)
            if (r3 == 0) goto L9e
        L98:
            int r0 = r3.length()
            if (r0 != 0) goto L14
        L9e:
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r1.uiTemplate
            if (r0 == 0) goto Laa
            java.lang.String r0 = r0.rightSchemaUrl
        La4:
            java.lang.String r3 = LJIIJJI(r0)
            goto L14
        Laa:
            r0 = r4
            goto La4
        Lac:
            r0 = r4
            goto L92
        Lae:
            java.lang.String r0 = r1.getSchemaUrl()
            java.lang.String r3 = X.ViewOnClickListenerC56908MVc.matchAid(r0)
            goto L76
        Lb7:
            r3 = r4
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC56918MVm.LJIIJ(X.MVm, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):java.lang.String");
    }
}
