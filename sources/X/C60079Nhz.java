package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nhz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60079Nhz extends HSS {
    public long LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public final C60077Nhx LJLLI = new C60077Nhx(this);

    @Override // X.HSS
    public final String LJJIJIL() {
        return "webview";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C60079Nhz();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ARTICLE_PHOTO_MODE.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJJ(eventMapBuilder);
        super.LJ(eventMapBuilder);
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        LJJJJJ(c188727au);
        LJJJ(c188727au);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        Integer num;
        String schema;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJI();
        if (C2NU.LIZ.LIZIZ()) {
            Activity LIZ = LJIIIZ().LIZ();
            PhotoModeImageInfo photoModeImageInfo = LJJII().getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                num = Integer.valueOf(imageList.size());
            } else {
                num = null;
            }
            AnchorCommonStruct anchorCommonStruct = this.LJLJJL;
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                android.net.Uri parse = UriProtector.parse(schema);
                o.LJIIIIZZ(parse, "Uri.parse(this)");
                String queryParameter = UriProtector.getQueryParameter(parse, "url");
                if (queryParameter != null) {
                    eventMapBuilder.LJIIJ("enter_from");
                    eventMapBuilder.LJI("enter_from", LJJIIZI());
                    eventMapBuilder.LJIIJ("group_id");
                    eventMapBuilder.LJI("group_id", LJJII().getAid());
                    eventMapBuilder.LJIIJ("author_id");
                    String authorUid = LJJII().getAuthorUid();
                    if (authorUid == null) {
                        authorUid = "";
                    }
                    eventMapBuilder.LJI("author_id", authorUid);
                    eventMapBuilder.LJIIJ("music_id");
                    eventMapBuilder.LJI("music_id", C227768wm.LJIIJJI(LJJII()));
                    eventMapBuilder.LJIIJ("anchor_id");
                    eventMapBuilder.LJI("anchor_id", ((HSI) LJIJI()).LIZ());
                    eventMapBuilder.LJIIJ("anchor_name");
                    eventMapBuilder.LJI("anchor_name", ((HSI) LJIJI()).LIZJ());
                    eventMapBuilder.LJIIJ("anchor_type");
                    eventMapBuilder.LJI("anchor_type", ((HSI) LJIJI()).LIZLLL());
                    LJJJJJ(eventMapBuilder);
                    HSS.LJJIZ(this, eventMapBuilder, 6);
                    ArticleModeService.INSTANCE.getArticleAnchorService().openRelatedArticle(LIZ, queryParameter, new C60072Nhs(LJJII(), queryParameter, anchorCommonStruct.getId(), new AqS99S0300000_10(this, eventMapBuilder, num, 5)), new C60078Nhy(this, queryParameter, eventMapBuilder, num), new C60076Nhw(this, eventMapBuilder, num), this.LJLLI);
                    return;
                }
                return;
            }
            return;
        }
        if (C48203Ivv.LIZJ(LJJI())) {
            C26045AKb c26045AKb = new C26045AKb(LJJI());
            c26045AKb.LJIIIIZZ(R.string.dtk);
            c26045AKb.LJIIJ();
            return;
        }
        T35.LIZIZ(LJJI());
    }

    public final void LJJJJJ(C188727au c188727au) {
        c188727au.LIZLLL(LJJII().getAwemeType(), "aweme_type");
        String LIZ = C187677Yd.LIZ(LJJII());
        if (LIZ != null) {
            c188727au.LJI("photo_content_type", LIZ);
        }
    }

    public final void LJJJJJL(C188727au c188727au, Integer num, long j) {
        if (this.LJLJLLL != 0 && j >= 0) {
            ArticleModeService articleModeService = ArticleModeService.INSTANCE;
            articleModeService.getArticleLoggingService().logArticleDetailStaytime(c188727au, num, Long.valueOf(j));
            articleModeService.getArticleLoggingService().logArticleDetailExit("back");
            this.LJLJLLL = 0L;
        }
    }
}
