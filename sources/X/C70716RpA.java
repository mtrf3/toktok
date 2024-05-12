package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.RpA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70716RpA extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C70717RpB LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ C70714Rp8 LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70716RpA(String str, String str2, Integer num, String str3, int i, C70717RpB c70717RpB, int i2, C70714Rp8 c70714Rp8) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = num;
        this.LJLJJI = str3;
        this.LJLJJL = i;
        this.LJLJJLL = c70717RpB;
        this.LJLJL = i2;
        this.LJLJLJ = c70714Rp8;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        String str;
        Object obj;
        String str2;
        Video video;
        Double d;
        Video video2;
        String str3;
        Image image;
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        if (C78685UuP.LJJJZ(this.LJLIL)) {
            logNode.merge(new JSONObject(this.LJLIL));
        }
        logNode.plusAssign("page_name", this.LJLILLLLZI);
        Integer num = this.LJLJI;
        int type = EnumC70719RpD.SHOP_TAB_REVIEW_GALLERY.getType();
        if (num != null && num.intValue() == type) {
            logNode.plusAssign("previous_page", "shop");
        }
        String str4 = this.LJLJJI;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        logNode.plusAssign("product_id", str4);
        logNode.plusAssign("item_order", Integer.valueOf(this.LJLJJL));
        ReviewMedia reviewMedia = this.LJLJJLL.LIZ;
        if (reviewMedia == null || (image = reviewMedia.image) == null || (str = image.getUri()) == null) {
            str = "";
        }
        logNode.plusAssign("photo_id", str);
        ReviewMedia reviewMedia2 = this.LJLJJLL.LIZ;
        if (reviewMedia2 != null && (video2 = reviewMedia2.video) != null && (str3 = video2.id) != null) {
            str5 = str3;
        }
        logNode.plusAssign("video_id", str5);
        ReviewMedia reviewMedia3 = this.LJLJJLL.LIZ;
        if (reviewMedia3 != null && (video = reviewMedia3.video) != null && (d = video.duration) != null) {
            obj = Double.valueOf(d.doubleValue() * 1000);
        } else {
            obj = 0;
        }
        logNode.plusAssign("whole_duration", obj);
        logNode.plusAssign("photo_cnt", Integer.valueOf(this.LJLJL));
        C69698RXa c69698RXa = this.LJLJJLL.LIZIZ;
        if (c69698RXa != null) {
            str2 = c69698RXa.LIZIZ;
        } else {
            str2 = null;
        }
        logNode.plusAssign("rate", str2);
        C70714Rp8 c70714Rp8 = this.LJLJLJ;
        C69698RXa c69698RXa2 = this.LJLJJLL.LIZIZ;
        c70714Rp8.getClass();
        C70714Rp8.LIZLLL(logNode, c69698RXa2);
        return C76800UCe.LIZ;
    }
}
