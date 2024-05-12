package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.JrP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50471JrP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        C17N.LJJJJJL(context).j4(new C50476JrU(j));
    }

    public static void LIZJ(C50652JuK searchContextSource, C50948Jz6 c50948Jz6) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(searchContextSource, "searchContextSource");
        String str = "1";
        if (!o.LJ(searchContextSource.getImmutableData().getSearchCommonModel().isFromVideo(), "1") && !o.LJ(c50948Jz6.isFromVideoFix(), "1")) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ISearchContextAbility LL = SearchServiceImpl.LLLZI().LL(new C49623Jdj(searchContextSource.getSourceId(), true, 4));
        String enterFrom = searchContextSource.getImmutableData().getSearchCommonModel().getEnterFrom();
        String str2 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        String previousPage = searchContextSource.getImmutableData().getSearchCommonModel().getPreviousPage();
        if (previousPage == null) {
            previousPage = "";
        }
        boolean shouldShowScanView = searchContextSource.getImmutableData().getSearchCommonModel().getShouldShowScanView();
        boolean shouldShowSug = searchContextSource.getImmutableData().getSearchCommonModel().getShouldShowSug();
        String isFromComment = searchContextSource.getImmutableData().getSearchCommonModel().isFromComment();
        if (isFromComment == null) {
            isFromComment = "";
        }
        String isFromVideo = searchContextSource.getImmutableData().getSearchCommonModel().isFromVideo();
        if (isFromVideo == null) {
            isFromVideo = "";
        }
        LL.j4(new C50528JsK(searchContextSource.getImmutableData().getSearchCommonModel().getBackPressFlag(), searchContextSource.getImmutableData().getSearchCommonModel().getFeedSearchBarFlag(), enterFrom, previousPage, isFromComment, str, isFromVideo, shouldShowScanView, shouldShowSug, searchContextSource.getImmutableData().getSearchCommonModel().getKeepTabPosition()));
        String authorId = searchContextSource.getImmutableData().getSearchVideoModel().getAuthorId();
        if (authorId == null) {
            authorId = "";
        }
        String groupId = searchContextSource.getImmutableData().getSearchVideoModel().getGroupId();
        if (groupId != null) {
            str2 = groupId;
        }
        Boolean isFeedLiked = searchContextSource.getImmutableData().getSearchVideoModel().isFeedLiked();
        if (isFeedLiked != null) {
            z = isFeedLiked.booleanValue();
        } else {
            z = false;
        }
        Boolean isFeedCollected = searchContextSource.getImmutableData().getSearchVideoModel().isFeedCollected();
        if (isFeedCollected != null) {
            z2 = isFeedCollected.booleanValue();
        } else {
            z2 = false;
        }
        Boolean isFeedCommentClicked = searchContextSource.getImmutableData().getSearchVideoModel().isFeedCommentClicked();
        if (isFeedCommentClicked != null) {
            z3 = isFeedCommentClicked.booleanValue();
        } else {
            z3 = false;
        }
        Boolean isFeedForwardClicked = searchContextSource.getImmutableData().getSearchVideoModel().isFeedForwardClicked();
        if (isFeedForwardClicked != null) {
            z4 = isFeedForwardClicked.booleanValue();
        } else {
            z4 = false;
        }
        LL.j4(new C50903JyN(authorId, str2, z, z2, z3, z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.LinkedHashMap, java.util.HashMap] */
    public static void LIZLLL(ActivityC45651qj context, C50652JuK c50652JuK) {
        ?? LJJJLIIL;
        boolean z;
        java.util.Set<Map.Entry<String, String>> entrySet;
        o.LJIIIZ(context, "context");
        ISearchContextAbility LJJJJJL = C17N.LJJJJJL(context);
        String hintWord = c50652JuK.getImmutableData().getSearchInputModel().getHintWord();
        String str = "";
        if (hintWord == null) {
            hintWord = "";
        }
        String hintWordId = c50652JuK.getImmutableData().getSearchInputModel().getHintWordId();
        if (hintWordId == null) {
            hintWordId = "";
        }
        LJJJJJL.j4(new C50477JrV(hintWord, hintWordId));
        java.util.Map<String, String> extraLogParams = c50652JuK.getImmutableData().getSearchEventModel().getExtraLogParams();
        if (extraLogParams != null && (entrySet = extraLogParams.entrySet()) != null) {
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(entrySet, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LJJJLIIL = new LinkedHashMap(LJJIIZ);
            for (Map.Entry<String, String> entry : entrySet) {
                String key = entry.getKey();
                if (key == null) {
                    key = "";
                }
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                OSZ osz = new OSZ(key, value);
                LJJJLIIL.put(osz.getFirst(), osz.getSecond());
            }
        } else {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        String enterCommentId = c50652JuK.getImmutableData().getSearchEventModel().getEnterCommentId();
        if (enterCommentId == null) {
            enterCommentId = "";
        }
        Boolean isFromOutside = c50652JuK.getImmutableData().getSearchEventModel().isFromOutside();
        if (isFromOutside != null) {
            z = isFromOutside.booleanValue();
        } else {
            z = false;
        }
        String isFromPhoto = c50652JuK.getImmutableData().getSearchEventModel().isFromPhoto();
        if (isFromPhoto == null) {
            isFromPhoto = "";
        }
        LJJJJJL.j4(new C50473JrR(enterCommentId, isFromPhoto, z, LJJJLIIL));
        String launchSchemaString = c50652JuK.getMutableData().getGlobalData().getLaunchSchemaString();
        String blankPageEnterForm = c50652JuK.getMutableData().getGlobalData().getBlankPageEnterForm();
        if (blankPageEnterForm == null) {
            blankPageEnterForm = "";
        }
        String blankPageEnterMethod = c50652JuK.getMutableData().getGlobalData().getBlankPageEnterMethod();
        if (blankPageEnterMethod != null) {
            str = blankPageEnterMethod;
        }
        LJJJJJL.j4(new C50475JrT(launchSchemaString, str, blankPageEnterForm));
    }

    public static void LIZIZ(String str, String str2, String str3, ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        C17N.LJJJJJL(context).j4(new C50478JrW(str));
        C17N.LJJJJJL(context).j4(new C50474JrS(str3, str2));
    }
}
