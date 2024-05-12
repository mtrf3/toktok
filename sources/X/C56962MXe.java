package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import ujb.o;

/* renamed from: X.MXe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56962MXe implements InterfaceC55341Lnl {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C56963MXf.LJLIL);

    public static CopyOnWriteArraySet LIZIZ(InnerPushMessage innerPushMessage) {
        String globalSchemaUrl;
        String rightSchemaUrl;
        String middleSchemaUrl;
        String avatarSchema;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (avatarSchema = uiTemplate.getAvatarSchema()) != null) {
            C57419MgB.LIZ(copyOnWriteArraySet, LIZJ(avatarSchema));
        }
        InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
        if (uiTemplate2 != null && (middleSchemaUrl = uiTemplate2.getMiddleSchemaUrl()) != null) {
            C57419MgB.LIZ(copyOnWriteArraySet, LIZJ(middleSchemaUrl));
        }
        InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
        if (uiTemplate3 != null && (rightSchemaUrl = uiTemplate3.getRightSchemaUrl()) != null) {
            C57419MgB.LIZ(copyOnWriteArraySet, LIZJ(rightSchemaUrl));
        }
        InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
        if (uiTemplate4 != null && (globalSchemaUrl = uiTemplate4.getGlobalSchemaUrl()) != null) {
            C57419MgB.LIZ(copyOnWriteArraySet, LIZJ(globalSchemaUrl));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAidFromInnerPush aids size:");
        LIZ.append(copyOnWriteArraySet.size());
        LIZ.append(" aids:");
        LIZ.append(copyOnWriteArraySet);
        C86478Xwo.LIZ("InnerPushPreloadManager", X1D.LIZIZ(LIZ));
        return copyOnWriteArraySet;
    }

    public static String LIZJ(String str) {
        if (C78857UxB.LJJJIL(str) && o.LJJJLIIL(str, "aweme://aweme/detail/", false)) {
            Matcher matcher = PatternProtector.compile("\\d+\\d").matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        }
        return null;
    }

    public static String LIZLLL(String str) {
        if (C78857UxB.LJJJIL(str) && o.LJJJLIIL(str, "aweme://aweme/detail/", false)) {
            android.net.Uri parse = UriProtector.parse(str);
            kotlin.jvm.internal.o.LJIIIIZZ(parse, "parse(schema)");
            String queryParameter = UriProtector.getQueryParameter(parse, "cid");
            if (queryParameter == null) {
                return UriProtector.getQueryParameter(parse, "upvote_id");
            }
            return queryParameter;
        }
        return null;
    }

    @Override // X.InterfaceC55341Lnl
    public final Aweme LIZ(String str) {
        return (Aweme) ((LruCache) this.LIZ.getValue()).get(str);
    }

    public final void LJ(InnerPushMessage innerPushMessage) {
        String globalSchemaUrl;
        String LIZJ;
        String rightSchemaUrl;
        String LIZJ2;
        String middleSchemaUrl;
        String LIZJ3;
        String avatarSchema;
        String LIZJ4;
        if (!CommentPreloadExperiment.LIZ().isEnable()) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (avatarSchema = uiTemplate.getAvatarSchema()) != null && (LIZJ4 = LIZJ(avatarSchema)) != null) {
            String LIZLLL = LIZLLL(avatarSchema);
            Aweme LIZ = LIZ(LIZJ4);
            if (LIZ != null) {
                copyOnWriteArraySet.add(new C1800374t(LIZ, LIZLLL));
            }
        }
        InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
        if (uiTemplate2 != null && (middleSchemaUrl = uiTemplate2.getMiddleSchemaUrl()) != null && (LIZJ3 = LIZJ(middleSchemaUrl)) != null) {
            String LIZLLL2 = LIZLLL(middleSchemaUrl);
            Aweme LIZ2 = LIZ(LIZJ3);
            if (LIZ2 != null) {
                copyOnWriteArraySet.add(new C1800374t(LIZ2, LIZLLL2));
            }
        }
        InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
        if (uiTemplate3 != null && (rightSchemaUrl = uiTemplate3.getRightSchemaUrl()) != null && (LIZJ2 = LIZJ(rightSchemaUrl)) != null) {
            String LIZLLL3 = LIZLLL(rightSchemaUrl);
            Aweme LIZ3 = LIZ(LIZJ2);
            if (LIZ3 != null) {
                copyOnWriteArraySet.add(new C1800374t(LIZ3, LIZLLL3));
            }
        }
        InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
        if (uiTemplate4 != null && (globalSchemaUrl = uiTemplate4.getGlobalSchemaUrl()) != null && (LIZJ = LIZJ(globalSchemaUrl)) != null) {
            String LIZLLL4 = LIZLLL(globalSchemaUrl);
            Aweme LIZ4 = LIZ(LIZJ);
            if (LIZ4 != null) {
                copyOnWriteArraySet.add(new C1800374t(LIZ4, LIZLLL4));
            }
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            CommentService.LIZ.getClass();
            CommentServiceImpl.LJJL().LJJII(2, "inner_push", ORZ.LLJI(copyOnWriteArraySet));
        }
    }
}
