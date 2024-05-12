package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.translation.QuestionTranslationBody;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.8G8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G8 implements C8G7 {
    public final /* synthetic */ C8G4 LIZ;

    @Override // X.C8G7
    public final void LIZIZ() {
        C8G9 c8g9;
        C8G4 c8g4 = this.LIZ;
        ForumStruct forumStruct = c8g4.LJLIL;
        if (forumStruct != null && (c8g9 = c8g4.LJLJL) != null) {
            c8g9.LIZIZ(forumStruct);
        }
    }

    @Override // X.C8G7
    public final void LIZJ() {
        C8G4 c8g4 = this.LIZ;
        ForumStruct forumStruct = c8g4.LJLIL;
        if (forumStruct != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "collection_question");
            Object id = forumStruct.getId();
            if (id == null) {
                id = "";
            }
            c188727au.LJFF(id, "question_id");
            FMX.LJIIL("translate_question", c188727au.LIZ);
            QuestionTranslationBody questionTranslationBody = new QuestionTranslationBody();
            questionTranslationBody.trgLang = TranslationServiceImpl.LJJIJ().LJJIIZI();
            String content = forumStruct.getContent();
            if (content != null) {
                questionTranslationBody.translationInfo.add(new QuestionTranslationBody.TranslationContent(questionTranslationBody, content));
            }
            C8G9 c8g9 = c8g4.LJLJL;
            if (c8g9 != null) {
                c8g9.LIZLLL(forumStruct, questionTranslationBody, c8g4.LJLLLL);
            }
        }
    }

    @Override // X.C8G7
    public final void LIZLLL() {
        long j;
        long j2;
        long j3;
        UrlModel urlModel;
        String aid;
        String uid;
        C8G4 c8g4 = this.LIZ;
        ForumStruct forumStruct = c8g4.LJLIL;
        if (forumStruct != null && forumStruct.getCreator() != null) {
            Activity activity = c8g4.LJLJI;
            o.LJII(activity, "null cannot be cast to non-null type android.content.Context");
            Long id = forumStruct.getId();
            if (id != null) {
                j = id.longValue();
            } else {
                j = 0;
            }
            User creator = forumStruct.getCreator();
            if (creator != null && (uid = creator.getUid()) != null) {
                j2 = CastLongProtector.parseLong(uid);
            } else {
                j2 = 0;
            }
            Aweme video = forumStruct.getVideo();
            if (video != null && (aid = video.getAid()) != null) {
                j3 = CastLongProtector.parseLong(aid);
            } else {
                j3 = 0;
            }
            User creator2 = forumStruct.getCreator();
            String str = null;
            if (creator2 != null) {
                urlModel = creator2.getAvatarThumb();
            } else {
                urlModel = null;
            }
            String LJI = AV1.LJI(forumStruct.getCreator());
            String str2 = c8g4.LJLILLLLZI;
            if (str2 == null) {
                str2 = "";
            }
            User creator3 = forumStruct.getCreator();
            if (creator3 != null) {
                str = creator3.getSecUid();
            }
            HPW.LIZIZ(activity, new QaStruct(j, j2, j3, urlModel, LJI, str2, str, C61878OQg.INSTANCE, null, null, null, null, null, null, 0, null, null, 130816, null), "collection_question", "click_favorite", "answer", null, null, null, null, 480);
        }
    }

    @Override // X.C8G7
    public final void LJ() {
        C8G4 c8g4 = this.LIZ;
        ForumStruct forumStruct = c8g4.LJLIL;
        if (forumStruct != null) {
            c8g4.L(forumStruct, 1);
        }
    }

    @Override // X.C8G7
    public final void LJFF() {
        C8G4 c8g4 = this.LIZ;
        ForumStruct forumStruct = c8g4.LJLIL;
        if (forumStruct != null) {
            c8g4.L(forumStruct, 0);
        }
    }

    public C8G8(C8G4 c8g4) {
        this.LIZ = c8g4;
    }
}
