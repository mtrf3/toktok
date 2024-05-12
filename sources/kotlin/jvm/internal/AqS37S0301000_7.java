package kotlin.jvm.internal;

import X.AEY;
import X.AI8;
import X.AI9;
import X.AbstractC65781Prl;
import X.C173826ry;
import X.C188727au;
import X.C25991AHz;
import X.C41021G8b;
import X.C41315GJj;
import X.C41658GWo;
import X.C41891GcJ;
import X.C42118Gfy;
import X.C60903NvH;
import X.C76800UCe;
import X.C77412UZs;
import X.FMX;
import X.G8P;
import X.GHP;
import X.GI3;
import X.GLI;
import X.HBT;
import X.HBW;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.SY4;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.publish.surveyafterpost.AuthorSurveyFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS37S0301000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS37S0301000_7 aqS37S0301000_7) {
        C41315GJj.LIZLLL((VideoPublishEditModel) aqS37S0301000_7.l0);
        C41658GWo.LIZLLL().LJIIIIZZ(((VideoPublishEditModel) aqS37S0301000_7.l0).getCreationId());
        GI3.LJII(new G8P(new C41021G8b((VideoPublishEditModel) aqS37S0301000_7.l0, new GLI("DmtInternalPublishServiceImpl", aqS37S0301000_7.i3)), new C41891GcJ((VideoPublishEditModel) aqS37S0301000_7.l0, (InterfaceC88472Yns) aqS37S0301000_7.l1, (InterfaceC88472Yns) aqS37S0301000_7.l2)));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS37S0301000_7 aqS37S0301000_7) {
        if (HBT.LIZ()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            List<MediaModel> list = (List) aqS37S0301000_7.l0;
            Intent intent = (Intent) aqS37S0301000_7.l1;
            for (MediaModel mediaModel : list) {
                if (mediaModel.libraryState != null) {
                    String LIZ = C173826ry.LIZ(mediaModel.id, mediaModel.fileLocalUriPath, C77412UZs.LJIJI(intent));
                    if (LIZ != null) {
                        mediaModel.fileLocalUriPath = LIZ;
                    }
                    LibraryMaterialInfoSv.Companion.getClass();
                    arrayList.add(HBW.LIZ(mediaModel, false));
                }
            }
            ((Intent) aqS37S0301000_7.l1).putParcelableArrayListExtra("library_material_info", arrayList);
        }
        ((C42118Gfy) aqS37S0301000_7.l2).LIZ.setResult(aqS37S0301000_7.i3, (Intent) aqS37S0301000_7.l1);
        ((C42118Gfy) aqS37S0301000_7.l2).LIZ.finish();
        ((C42118Gfy) aqS37S0301000_7.l2).LIZ.overridePendingTransition(0, R.anim.y);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS37S0301000_7 aqS37S0301000_7) {
        String str;
        String str2;
        String string;
        if (!((C25991AHz) aqS37S0301000_7.l0).LJIIL()) {
            int childCount = ((LinearLayout) aqS37S0301000_7.l1).getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (i != aqS37S0301000_7.i3) {
                    View childAt = ((LinearLayout) aqS37S0301000_7.l1).getChildAt(i);
                    o.LJII(childAt, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
                    AI9 accessory = ((AI8) childAt).getAccessory();
                    o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
                    ((AEY) accessory).LJIILIIL(false);
                }
            }
            SY4 sy4 = ((AuthorSurveyFragment) aqS37S0301000_7.l2).LJLILLLLZI;
            if (sy4 != null) {
                sy4.setEnabled(true);
            }
            ((AuthorSurveyFragment) aqS37S0301000_7.l2).LJLJI = Integer.valueOf(aqS37S0301000_7.i3 + 1);
            C188727au c188727au = new C188727au();
            Bundle arguments = ((AuthorSurveyFragment) aqS37S0301000_7.l2).getArguments();
            String str3 = "";
            if (arguments == null || (str = arguments.getString("enterFrom")) == null) {
                str = "";
            }
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("author_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
            Bundle arguments2 = ((AuthorSurveyFragment) aqS37S0301000_7.l2).getArguments();
            if (arguments2 != null && (string = arguments2.getString("groupId")) != null) {
                str3 = string;
            }
            c188727au.LJIIIZ("group_id", str3);
            if (GHP.LIZ()) {
                str2 = "most_wanted_set";
            } else {
                str2 = "most_disappointed_set";
            }
            c188727au.LJIIIZ("survey_type", str2);
            c188727au.LJFF(((AuthorSurveyFragment) aqS37S0301000_7.l2).LJLJI, "result");
            FMX.LJIIL("choose_option_author_survey", c188727au.LIZ);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0301000_7(int i, VideoPublishEditModel videoPublishEditModel, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = videoPublishEditModel;
        this.i3 = i;
        this.l1 = interfaceC88472Yns;
        this.l2 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0301000_7(C25991AHz c25991AHz, LinearLayout linearLayout, int i, AuthorSurveyFragment authorSurveyFragment, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c25991AHz;
        this.l1 = linearLayout;
        this.i3 = i;
        this.l2 = authorSurveyFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS37S0301000_7(List list, List<? extends MediaModel> list2, Intent intent, C42118Gfy c42118Gfy, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = intent;
        this.i3 = c42118Gfy;
    }
}
