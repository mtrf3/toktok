package X;

import Y.ACListenerS43S0200000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.background.CropImageWindowViewModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.result.CropImageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KHK extends HorizontalScrollView {
    public final LinearLayout LJLIL;
    public final CropImageViewModel LJLILLLLZI;
    public final CropImageWindowViewModel LJLJI;
    public final PhotoSearchViewModel LJLJJI;
    public final List<KHM> LJLJJL;
    public KHM LJLJJLL;
    public InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> LJLJL;

    public final int getItemCount() {
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            return linearLayout.getChildCount();
        }
        return 0;
    }

    public final KHM getSelectedEntityModel() {
        List<KHM> list = this.LJLJJL;
        ArrayList arrayList = new ArrayList();
        for (KHM khm : list) {
            if (khm.LIZLLL) {
                arrayList.add(khm);
            }
        }
        return (KHM) ORZ.LJLLLLLL(0, arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KHK(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJJL = new ArrayList();
        C16880lQ.LLLZIIL(R.layout.cil, C16880lQ.LLZIL(context), this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.bs8);
        this.LJLIL = linearLayout;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            this.LJLILLLLZI = (CropImageViewModel) ViewModelProviders.of(LJJIFFI).get(CropImageViewModel.class);
            this.LJLJI = (CropImageWindowViewModel) ViewModelProviders.of(LJJIFFI).get(CropImageWindowViewModel.class);
            this.LJLJJI = KHS.LIZ(LJJIFFI);
        }
        CropImageViewModel cropImageViewModel = this.LJLILLLLZI;
        if (cropImageViewModel != null) {
            cropImageViewModel.LJLIL = this;
        }
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, 0);
        }
    }

    private final void setCropImageSelected(int i) {
        boolean z;
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                KHM khm = (KHM) next;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                khm.LIZLLL = z;
                Object value = khm.LJIIIZ.getValue();
                o.LJIIIIZZ(value, "<get-backgroundView>(...)");
                ((C131775Fd) value).setSeleted(z);
                Object value2 = khm.LJIIIZ.getValue();
                o.LJIIIIZZ(value2, "<get-backgroundView>(...)");
                ((View) value2).invalidate();
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public final void LIZIZ(String str) {
        int i;
        int i2;
        KHM khm = this.LJLJJLL;
        boolean z = true;
        if (khm == null) {
            this.LJLJJLL = LIZ(this, ((ArrayList) this.LJLJJL).size(), 1, str);
        } else {
            khm.LIZ(str);
        }
        KHM khm2 = this.LJLJJLL;
        if (khm2 != null) {
            i = khm2.LJ;
        } else {
            i = 0;
        }
        setCropImageSelected(i);
        InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> interfaceC88471Ynr = this.LJLJL;
        if (interfaceC88471Ynr != null) {
            LinearLayout linearLayout = this.LJLIL;
            if (linearLayout != null) {
                i2 = linearLayout.getChildCount();
            } else {
                i2 = 0;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (this.LJLJJLL == null) {
                z = false;
            }
            interfaceC88471Ynr.invoke(valueOf, Boolean.valueOf(z));
        }
    }

    public final void setCropImageCountChange(InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> cropImageCountChange) {
        o.LJIIIZ(cropImageCountChange, "cropImageCountChange");
        this.LJLJL = cropImageCountChange;
    }

    public final void setData(List<String> list) {
        int i;
        boolean z = true;
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        ((ArrayList) this.LJLJJL).clear();
        int i2 = 0;
        for (String str : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                LIZ(this, i2, i2, str);
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        setCropImageSelected(0);
        InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> interfaceC88471Ynr = this.LJLJL;
        if (interfaceC88471Ynr == null) {
            return;
        }
        LinearLayout linearLayout2 = this.LJLIL;
        if (linearLayout2 != null) {
            i = linearLayout2.getChildCount();
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        if (this.LJLJJLL == null) {
            z = false;
        }
        interfaceC88471Ynr.invoke(valueOf, Boolean.valueOf(z));
    }

    public static KHM LIZ(KHK khk, int i, int i2, String str) {
        khk.getClass();
        CropImageWindowViewModel cropImageWindowViewModel = khk.LJLJI;
        PhotoSearchViewModel photoSearchViewModel = khk.LJLJJI;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(khk.getContext()), R.layout.cik, khk, false);
        o.LJIIIIZZ(LLLLIILL, "from(parent.context)\n   …sult_crop, parent, false)");
        KHM khm = new KHM(LLLLIILL, cropImageWindowViewModel, photoSearchViewModel);
        khm.LJ = i;
        khm.LJFF = i2;
        khm.LIZ(str);
        LinearLayout linearLayout = khk.LJLIL;
        if (linearLayout != null) {
            linearLayout.addView(LLLLIILL);
        }
        ViewGroup.LayoutParams layoutParams = LLLLIILL.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
            LLLLIILL.setLayoutParams(layoutParams);
        }
        LLLLIILL.setOutlineProvider(new C42514GmM(khk));
        khm.LIZIZ().setOutlineProvider(new C42515GmN(khk));
        khm.LIZIZ().setClipToOutline(true);
        LLLLIILL.setClipToOutline(true);
        C16880lQ.LJIIJ(new ACListenerS43S0200000_8(khm, khk, 19), LLLLIILL);
        ((ArrayList) khk.LJLJJL).add(khm);
        return khm;
    }

    public final void LIZJ(Integer num, String str, String str2, String str3) {
        boolean z;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        JSONObject jSONObject;
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
        List<String> list;
        if (num != null) {
            num.intValue();
            KHM khm = (KHM) ORZ.LJLLLLLL(num.intValue(), this.LJLJJL);
            if (khm == null || khm.LIZLLL) {
                return;
            }
            JSONObject LIZJ = C65232Piu.LIZJ("words_source", "photo_search");
            LIZJ.put("words_position", num.intValue());
            LIZJ.put("entity_coord", str);
            PhotoSearchViewModel photoSearchViewModel = this.LJLJJI;
            if (photoSearchViewModel != null && (list = photoSearchViewModel.LJLJLLL) != null && ORZ.LJLJJI(str, list)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LIZJ.put("is_user_add", 0);
            } else {
                LIZJ.put("is_user_add", 1);
            }
            PhotoSearchViewModel photoSearchViewModel2 = this.LJLJJI;
            if (photoSearchViewModel2 != null) {
                str4 = photoSearchViewModel2.LJLLILLLL;
            } else {
                str4 = null;
            }
            LIZJ.put("raw_pic", str4);
            PhotoSearchViewModel photoSearchViewModel3 = this.LJLJJI;
            if (photoSearchViewModel3 != null) {
                str5 = photoSearchViewModel3.LJLJLJ;
            } else {
                str5 = null;
            }
            LIZJ.put("photo_source", str5);
            PhotoSearchViewModel photoSearchViewModel4 = this.LJLJJI;
            if (photoSearchViewModel4 != null && (photoSearchEnterParams5 = photoSearchViewModel4.LJLILLLLZI) != null && (logParams3 = photoSearchEnterParams5.getLogParams()) != null) {
                str6 = logParams3.getSearchEntrance();
            } else {
                str6 = null;
            }
            LIZJ.put("search_entrance", str6);
            PhotoSearchViewModel photoSearchViewModel5 = this.LJLJJI;
            if (photoSearchViewModel5 != null && (photoSearchEnterParams4 = photoSearchViewModel5.LJLILLLLZI) != null && (logParams2 = photoSearchEnterParams4.getLogParams()) != null) {
                str7 = logParams2.getCurrentPage();
            } else {
                str7 = null;
            }
            LIZJ.put("source_page_name", str7);
            PhotoSearchViewModel photoSearchViewModel6 = this.LJLJJI;
            if (photoSearchViewModel6 != null && (photoSearchEnterParams3 = photoSearchViewModel6.LJLILLLLZI) != null && (logParams = photoSearchEnterParams3.getLogParams()) != null) {
                str8 = logParams.getSearchType();
            } else {
                str8 = null;
            }
            LIZJ.put("search_type", str8);
            LIZJ.put("click_type", str3);
            PhotoSearchViewModel photoSearchViewModel7 = this.LJLJJI;
            if (photoSearchViewModel7 != null) {
                str9 = photoSearchViewModel7.LJLJLJ;
            } else {
                str9 = null;
            }
            LIZJ.put("raw_photo_source", str9);
            PhotoSearchViewModel photoSearchViewModel8 = this.LJLJJI;
            if (photoSearchViewModel8 != null) {
                str10 = photoSearchViewModel8.LJLZ;
            } else {
                str10 = null;
            }
            LIZJ.put("first_photo_search_id", str10);
            PhotoSearchViewModel photoSearchViewModel9 = this.LJLJJI;
            if (photoSearchViewModel9 != null && (photoSearchEnterParams2 = photoSearchViewModel9.LJLILLLLZI) != null && (pdpParams2 = photoSearchEnterParams2.getPdpParams()) != null) {
                str11 = pdpParams2.getEnterProductId();
            } else {
                str11 = null;
            }
            LIZJ.put("enter_product_id", str11);
            PhotoSearchViewModel photoSearchViewModel10 = this.LJLJJI;
            if (photoSearchViewModel10 != null && (photoSearchEnterParams = photoSearchViewModel10.LJLILLLLZI) != null && (pdpParams = photoSearchEnterParams.getPdpParams()) != null) {
                str12 = pdpParams.getTrackId();
            } else {
                str12 = null;
            }
            LIZJ.put("track_id", str12);
            C48658J7u.LIZIZ("pic_search_entity_click", LIZJ);
            PhotoSearchViewModel photoSearchViewModel11 = this.LJLJJI;
            if (photoSearchViewModel11 != null && (jSONObject = photoSearchViewModel11.LJLJL) != null) {
                jSONObject.put("search_time", System.currentTimeMillis());
            }
            PhotoSearchViewModel photoSearchViewModel12 = this.LJLJJI;
            if (photoSearchViewModel12 != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                KHH khh = new KHH(0);
                khh.LIZJ = str;
                khh.LIZLLL = String.valueOf(khm.LJFF);
                PhotoSearchViewModel photoSearchViewModel13 = this.LJLJJI;
                if (photoSearchViewModel13 != null) {
                    str13 = photoSearchViewModel13.LJLLILLLL;
                } else {
                    str13 = null;
                }
                khh.LIZIZ = str13;
                photoSearchViewModel12.iv0(context, new KHC(str2, khh, null, 1015805));
            }
            setCropImageSelected(khm.LJ);
        }
    }
}
