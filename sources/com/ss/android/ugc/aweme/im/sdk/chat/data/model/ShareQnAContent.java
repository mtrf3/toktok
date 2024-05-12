package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C107104Ig;
import X.C109544Rq;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.V0N;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareQnAContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("push_detail")
    public String pushDetail;

    @InterfaceC65349Pkn("qa_id")
    public long questionId;

    @InterfaceC65349Pkn("video_count")
    public int userCount;

    @InterfaceC65349Pkn("title")
    public String questionName = "";

    @InterfaceC65349Pkn("cover_url")
    public List<? extends UrlModel> awemeCoverList = C61878OQg.INSTANCE;
    public transient InterfaceC65784Pro<? extends Resources> resourcesGetter = ShareQnAContent$resourcesGetter$1.INSTANCE;

    public static /* synthetic */ void getResourcesGetter$im_base_release$annotations() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        List subList;
        List<? extends UrlModel> list = this.awemeCoverList;
        if (list == null || (subList = list.subList(0, Math.min(3, list.size()))) == null) {
            return C61878OQg.INSTANCE;
        }
        return subList;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        PureDataSharePackage.Companion.getClass();
        SharePackage LIZ = C107104Ig.LIZ("qna");
        LIZ.extras.putSerializable("video_cover", getCoverThumb());
        return LIZ;
    }

    public final UrlModel getCoverThumb() {
        List<? extends UrlModel> list = this.awemeCoverList;
        if (list != null) {
            return (UrlModel) ORZ.LJLLLL(list);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = this.resourcesGetter.invoke().getString(R.string.h85, this.questionName);
        o.LJIIIIZZ(string, "resourcesGetter().getStr…_quote_qna, questionName)");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final ShareQnAContent fromSharePackage(SharePackage sharePackage) {
            o.LJIIIZ(sharePackage, "sharePackage");
            long j = sharePackage.extras.getLong("qna_id");
            String string = sharePackage.extras.getString("qna_name");
            int i = sharePackage.extras.getInt("user_count");
            String string2 = sharePackage.extras.getString("aweme_cover_list");
            List<? extends UrlModel> list = null;
            if (string2 != null && !V0N.LJJII(string2)) {
                list = JsonParseUtils.LIZIZ(UrlModel.class, string2);
            }
            ShareQnAContent shareQnAContent = new ShareQnAContent();
            shareQnAContent.setQuestionId(j);
            shareQnAContent.setQuestionName(string);
            shareQnAContent.setUserCount(i);
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            shareQnAContent.setAwemeCoverList(list);
            shareQnAContent.setPushDetail(string);
            return shareQnAContent;
        }
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getPushDetail() {
        return this.pushDetail;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getQuestionName() {
        return this.questionName;
    }

    public final InterfaceC65784Pro<Resources> getResourcesGetter$im_base_release() {
        return this.resourcesGetter;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setAwemeCoverList(List<? extends UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public final void setQuestionId(long j) {
        this.questionId = j;
    }

    public final void setQuestionName(String str) {
        this.questionName = str;
    }

    public final void setResourcesGetter$im_base_release(InterfaceC65784Pro<? extends Resources> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.resourcesGetter = interfaceC65784Pro;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        if (z || z2) {
            String string = this.resourcesGetter.invoke().getString(R.string.pmm, this.questionName);
            o.LJIIIIZZ(string, "{\n            resourcesG…, questionName)\n        }");
            return string;
        }
        String string2 = this.resourcesGetter.invoke().getString(R.string.pml, this.questionName);
        o.LJIIIIZZ(string2, "{\n            resourcesG…, questionName)\n        }");
        return string2;
    }
}
