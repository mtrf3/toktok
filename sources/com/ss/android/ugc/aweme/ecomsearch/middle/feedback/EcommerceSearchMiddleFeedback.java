package com.ss.android.ugc.aweme.ecomsearch.middle.feedback;

import X.FFL;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EcommerceSearchMiddleFeedback {
    public static final FeedbackQuestion[] LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final FeedbackModel LIZLLL;

    static {
        FeedbackQuestion[] feedbackQuestionArr = {new FeedbackQuestion(2, "text", "Inappropriate word content"), new FeedbackQuestion(3, "image", "Inappropriate image content"), new FeedbackQuestion(4, "image", "Image is cluttered or unclear"), new FeedbackQuestion(5, "text", "Word has spelling or grammar errors"), new FeedbackQuestion(1, "text", "Not interested in this word")};
        LIZ = feedbackQuestionArr;
        LIZIZ = "Feedback";
        LIZJ = "Thanks for your feedback";
        LIZLLL = new FeedbackModel(feedbackQuestionArr, "Feedback", "Thanks for your feedback");
    }

    public static FeedbackModel LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        FeedbackModel feedbackModel = LIZLLL;
        LJIIIZ.getClass();
        FeedbackModel feedbackModel2 = (FeedbackModel) FFL.LJIJ(true, "ec_search_middle_feedback", 31744, FeedbackModel.class, feedbackModel);
        if (feedbackModel2 != null) {
            feedbackModel = feedbackModel2;
        }
        o.LJIIIIZZ(feedbackModel, "ABManager.getInstance().…k::class.java) ?: DEFAULT");
        return feedbackModel;
    }

    /* loaded from: classes13.dex */
    public static final class FeedbackModel implements Serializable {

        @InterfaceC65349Pkn("questions")
        public final FeedbackQuestion[] questions;

        @InterfaceC65349Pkn("title")
        public final String title;

        @InterfaceC65349Pkn("toast")
        public final String toast;

        /* JADX WARN: Multi-variable type inference failed */
        public FeedbackModel() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final FeedbackQuestion[] LIZ() {
            return this.questions;
        }

        public final String LIZIZ() {
            return this.title;
        }

        public final String LIZJ() {
            return this.toast;
        }

        public FeedbackModel(FeedbackQuestion[] feedbackQuestionArr, String str, String str2) {
            this.questions = feedbackQuestionArr;
            this.title = str;
            this.toast = str2;
        }

        public /* synthetic */ FeedbackModel(FeedbackQuestion[] feedbackQuestionArr, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : feedbackQuestionArr, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    /* loaded from: classes13.dex */
    public static final class FeedbackQuestion implements Serializable {

        @InterfaceC65349Pkn("index")
        public final Integer index;

        @InterfaceC65349Pkn("type")
        public final String type;

        @InterfaceC65349Pkn("value")
        public final String value;

        /* JADX WARN: Multi-variable type inference failed */
        public FeedbackQuestion() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public FeedbackQuestion(Integer num, String str, String str2) {
            this.index = num;
            this.type = str;
            this.value = str2;
        }

        public /* synthetic */ FeedbackQuestion(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }
}
