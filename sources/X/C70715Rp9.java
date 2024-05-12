package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rp9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70715Rp9 extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C70714Rp8 LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ C70717RpB LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70715Rp9(String str, String str2, Integer num, String str3, String str4, C70714Rp8 c70714Rp8, int i, C70717RpB c70717RpB, int i2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = num;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = c70714Rp8;
        this.LJLJL = i;
        this.LJLJLJ = c70717RpB;
        this.LJLJLLL = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        Object obj;
        Object obj2;
        Object obj3;
        Video video;
        Double d;
        Video video2;
        Object obj4;
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
        Object obj5 = this.LJLJJI;
        Object obj6 = "";
        if (obj5 == null) {
            obj5 = "";
        }
        logNode.plusAssign("product_id", obj5);
        logNode.plusAssign("quit_type", this.LJLJJL);
        logNode.plusAssign("is_load_data", Integer.valueOf(!this.LJLJJLL.LIZLLL.isEmpty() ? 1 : 0));
        C1EW.LIZIZ(SystemClock.elapsedRealtime(), this.LJLJJLL.LIZIZ, logNode, "stay_time");
        logNode.plusAssign("item_order", Integer.valueOf(this.LJLJL));
        ReviewMedia reviewMedia = this.LJLJLJ.LIZ;
        if (reviewMedia == null || (image = reviewMedia.image) == null || (obj = image.getUri()) == null) {
            obj = "";
        }
        logNode.plusAssign("photo_id", obj);
        ReviewMedia reviewMedia2 = this.LJLJLJ.LIZ;
        if (reviewMedia2 != null && (video2 = reviewMedia2.video) != null && (obj4 = video2.id) != null) {
            obj6 = obj4;
        }
        logNode.plusAssign("video_id", obj6);
        ReviewMedia reviewMedia3 = this.LJLJLJ.LIZ;
        if (reviewMedia3 != null && (video = reviewMedia3.video) != null && (d = video.duration) != null) {
            obj2 = Double.valueOf(d.doubleValue() * 1000);
        } else {
            obj2 = 0;
        }
        logNode.plusAssign("whole_duration", obj2);
        logNode.plusAssign("photo_cnt", Integer.valueOf(this.LJLJLLL));
        C69698RXa c69698RXa = this.LJLJLJ.LIZIZ;
        if (c69698RXa != null) {
            obj3 = c69698RXa.LIZIZ;
        } else {
            obj3 = null;
        }
        logNode.plusAssign("rate", obj3);
        C70714Rp8 c70714Rp8 = this.LJLJJLL;
        C69698RXa c69698RXa2 = this.LJLJLJ.LIZIZ;
        c70714Rp8.getClass();
        C70714Rp8.LIZLLL(logNode, c69698RXa2);
        return C76800UCe.LIZ;
    }
}
