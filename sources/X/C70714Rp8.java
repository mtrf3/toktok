package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rp8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70714Rp8 {
    public long LIZIZ;
    public long LIZ = SystemClock.elapsedRealtime();
    public String LIZJ = "return";
    public final java.util.Set<String> LIZLLL = new LinkedHashSet();

    public C70714Rp8(Context context) {
    }

    public static void LIZLLL(LaneParams laneParams, C69698RXa c69698RXa) {
        String str;
        int i;
        String str2;
        long j;
        String str3;
        Long LJJIZ;
        String str4;
        String str5;
        String str6 = "";
        if (c69698RXa == null || (str = c69698RXa.LJII) == null) {
            str = "";
        }
        laneParams.plusAssign("sku_id", str);
        if (c69698RXa != null && (str5 = c69698RXa.LIZ) != null) {
            str6 = str5;
        }
        laneParams.plusAssign("review_id", str6);
        int i2 = 0;
        if (c69698RXa != null && c69698RXa.LJIIIIZZ) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_self", Integer.valueOf(i));
        if (c69698RXa == null || (str4 = c69698RXa.LJI) == null || str4.length() == 0) {
            str2 = "no_text";
        } else {
            str2 = "has_text";
        }
        laneParams.plusAssign("page_show_type", str2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        if (c69698RXa != null && (str3 = c69698RXa.LJIIIZ) != null && (LJJIZ = C38350F3i.LJJIZ(str3)) != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        calendar.setTimeInMillis(j);
        laneParams.plusAssign("post_date", simpleDateFormat.format(calendar.getTime()));
        if (c69698RXa != null && c69698RXa.LJIIJ) {
            i2 = 1;
        }
        laneParams.plusAssign("is_anonymous", Integer.valueOf(i2));
    }

    public final void LIZ(View view, boolean z, int i, C69698RXa reviewItem) {
        AbstractC70995Rtf c70948Rsu;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(reviewItem, "reviewItem");
        if (z) {
            c70948Rsu = new C70949Rsv();
        } else {
            c70948Rsu = new C70948Rsu();
        }
        C78946Uyc.LJJIIJ(view, c70948Rsu, new AqS61S0201000_12(i, reviewItem, this, 15));
    }

    public final void LIZIZ(InterfaceC71003Rtn node, int i, C70717RpB reviewImageItem, int i2, Integer num, String str, String str2) {
        Image image;
        String uri;
        String str3;
        Integer num2;
        Integer num3;
        o.LJIIIZ(node, "node");
        o.LJIIIZ(reviewImageItem, "reviewImageItem");
        this.LIZIZ = this.LIZ;
        this.LIZ = SystemClock.elapsedRealtime();
        ReviewMedia reviewMedia = reviewImageItem.LIZ;
        if (reviewMedia == null || (num3 = reviewMedia.mediaType) == null || num3.intValue() != 2) {
            ReviewMedia reviewMedia2 = reviewImageItem.LIZ;
            if (reviewMedia2 != null && (image = reviewMedia2.image) != null) {
                uri = image.getUri();
            }
            uri = null;
        } else {
            Video video = reviewImageItem.LIZ.video;
            if (video != null) {
                uri = video.postUrl;
            }
            uri = null;
        }
        ReviewMedia reviewMedia3 = reviewImageItem.LIZ;
        if (reviewMedia3 == null || (num2 = reviewMedia3.mediaType) == null || num2.intValue() != 2) {
            str3 = "review_photo";
        } else {
            str3 = "review_video";
        }
        if (!this.LIZLLL.contains(uri)) {
            this.LIZLLL.add(uri);
            C78946Uyc.LJJII(node, new C70922RsU(), new C70716RpA(str2, str3, num, str, i, reviewImageItem, i2, this));
        }
    }

    public final void LIZJ(InterfaceC71003Rtn node, int i, C70717RpB reviewImageItem, int i2, Integer num, String str, String str2) {
        String str3;
        Integer num2;
        o.LJIIIZ(node, "node");
        o.LJIIIZ(reviewImageItem, "reviewImageItem");
        String str4 = this.LIZJ;
        ReviewMedia reviewMedia = reviewImageItem.LIZ;
        if (reviewMedia == null || (num2 = reviewMedia.mediaType) == null || num2.intValue() != 2) {
            str3 = "review_photo";
        } else {
            str3 = "review_video";
        }
        C78946Uyc.LJJII(node, new C70921RsT(), new C70715Rp9(str2, str3, num, str, str4, this, i, reviewImageItem, i2));
        this.LIZJ = "return";
    }
}
