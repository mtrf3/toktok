package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.background.PhotoSearchBackgroundFragment;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.result.CropImageViewModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KHL implements KJT {
    public final /* synthetic */ PhotoSearchBackgroundFragment LIZ;

    public KHL(PhotoSearchBackgroundFragment photoSearchBackgroundFragment) {
        this.LIZ = photoSearchBackgroundFragment;
    }

    @Override // X.KJT
    public final void LIZ(RectF rect, KLC klc) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchPdpEnterParams pdpParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchPdpEnterParams pdpParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchLogEnterParams logParams;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchLogEnterParams logParams2;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchLogEnterParams logParams3;
        KHK khk;
        PhotoSearchBackgroundFragment photoSearchBackgroundFragment;
        CropImageViewModel cropImageViewModel;
        KHK khk2;
        KHK khk3;
        PhotoSearchViewModel photoSearchViewModel;
        JSONObject jSONObject;
        o.LJIIIZ(rect, "rect");
        PhotoSearchViewModel photoSearchViewModel2 = this.LIZ.LJLJJI;
        if (photoSearchViewModel2 != null && (jSONObject = photoSearchViewModel2.LJLJL) != null) {
            jSONObject.put("search_time", System.currentTimeMillis());
        }
        PhotoSearchViewModel photoSearchViewModel3 = this.LIZ.LJLJJI;
        if (photoSearchViewModel3 != null) {
            photoSearchViewModel3.jv0();
        }
        KHZ khz = this.LIZ.LJLJI;
        if (khz == null || (str = khz.LJIIL(rect)) == null) {
            str = "";
        }
        KHH khh = new KHH(0);
        PhotoSearchBackgroundFragment photoSearchBackgroundFragment2 = this.LIZ;
        khh.LIZJ = str;
        if (klc != null && !klc.LJLJL) {
            i = klc.LJLIL;
        } else {
            i = 1;
        }
        khh.LIZLLL = String.valueOf(i);
        PhotoSearchViewModel photoSearchViewModel4 = photoSearchBackgroundFragment2.LJLJJI;
        String str11 = null;
        if (photoSearchViewModel4 != null) {
            str2 = photoSearchViewModel4.LJLLILLLL;
        } else {
            str2 = null;
        }
        khh.LIZIZ = str2;
        KHC khc = new KHC("user_draw", khh, null, 1015805);
        Context context = this.LIZ.getContext();
        if (context != null && (photoSearchViewModel = this.LIZ.LJLJJI) != null) {
            photoSearchViewModel.iv0(context, khc);
        }
        CropImageViewModel cropImageViewModel2 = this.LIZ.LJLJL;
        if (cropImageViewModel2 != null && (khk3 = cropImageViewModel2.LJLIL) != null) {
            khk3.LIZIZ(str);
        }
        CropImageViewModel cropImageViewModel3 = this.LIZ.LJLJL;
        if (cropImageViewModel3 != null && (khk = cropImageViewModel3.LJLIL) != null && khk.getItemCount() > 5 && (cropImageViewModel = (photoSearchBackgroundFragment = this.LIZ).LJLJL) != null && (khk2 = cropImageViewModel.LJLIL) != null) {
            khk2.post(new ARunnableS44S0100000_8(photoSearchBackgroundFragment, 58));
        }
        JSONObject jSONObject2 = new JSONObject();
        PhotoSearchBackgroundFragment photoSearchBackgroundFragment3 = this.LIZ;
        jSONObject2.put("words_source", "photo_search");
        jSONObject2.put("words_position", 1);
        jSONObject2.put("entity_coord", str);
        jSONObject2.put("is_user_add", 1);
        PhotoSearchViewModel photoSearchViewModel5 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel5 != null) {
            str3 = photoSearchViewModel5.LJLLILLLL;
        } else {
            str3 = null;
        }
        jSONObject2.put("raw_pic", str3);
        PhotoSearchViewModel photoSearchViewModel6 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel6 != null) {
            str4 = photoSearchViewModel6.LJLJLJ;
        } else {
            str4 = null;
        }
        jSONObject2.put("photo_source", str4);
        PhotoSearchViewModel photoSearchViewModel7 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel7 != null && (photoSearchEnterParams5 = photoSearchViewModel7.LJLILLLLZI) != null && (logParams3 = photoSearchEnterParams5.getLogParams()) != null) {
            str5 = logParams3.getSearchEntrance();
        } else {
            str5 = null;
        }
        jSONObject2.put("search_entrance", str5);
        PhotoSearchViewModel photoSearchViewModel8 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel8 != null && (photoSearchEnterParams4 = photoSearchViewModel8.LJLILLLLZI) != null && (logParams2 = photoSearchEnterParams4.getLogParams()) != null) {
            str6 = logParams2.getCurrentPage();
        } else {
            str6 = null;
        }
        jSONObject2.put("source_page_name", str6);
        PhotoSearchViewModel photoSearchViewModel9 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel9 != null && (photoSearchEnterParams3 = photoSearchViewModel9.LJLILLLLZI) != null && (logParams = photoSearchEnterParams3.getLogParams()) != null) {
            str7 = logParams.getSearchType();
        } else {
            str7 = null;
        }
        jSONObject2.put("search_type", str7);
        PhotoSearchViewModel photoSearchViewModel10 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel10 != null) {
            str8 = photoSearchViewModel10.LJLJLJ;
        } else {
            str8 = null;
        }
        jSONObject2.put("raw_photo_source", str8);
        PhotoSearchViewModel photoSearchViewModel11 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel11 != null) {
            str9 = photoSearchViewModel11.LJLZ;
        } else {
            str9 = null;
        }
        jSONObject2.put("first_photo_search_id", str9);
        PhotoSearchViewModel photoSearchViewModel12 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel12 != null && (photoSearchEnterParams2 = photoSearchViewModel12.LJLILLLLZI) != null && (pdpParams2 = photoSearchEnterParams2.getPdpParams()) != null) {
            str10 = pdpParams2.getEnterProductId();
        } else {
            str10 = null;
        }
        jSONObject2.put("enter_product_id", str10);
        PhotoSearchViewModel photoSearchViewModel13 = photoSearchBackgroundFragment3.LJLJJI;
        if (photoSearchViewModel13 != null && (photoSearchEnterParams = photoSearchViewModel13.LJLILLLLZI) != null && (pdpParams = photoSearchEnterParams.getPdpParams()) != null) {
            str11 = pdpParams.getTrackId();
        }
        jSONObject2.put("track_id", str11);
        C48658J7u.LIZIZ("pic_search_entity_show", jSONObject2);
    }

    @Override // X.KJT
    public final void LIZIZ(RectF rectF, KLC klc) {
        String str;
        KHK khk;
        KHZ khz = this.LIZ.LJLJI;
        if (khz == null || (str = khz.LJIIL(rectF)) == null) {
            str = "";
        }
        CropImageViewModel cropImageViewModel = this.LIZ.LJLJL;
        if (cropImageViewModel != null && (khk = cropImageViewModel.LJLIL) != null) {
            khk.LIZJ(Integer.valueOf(klc.LJLIL), str, "user_draw", "cursor");
        }
    }
}
